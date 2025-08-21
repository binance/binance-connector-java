package com.binance.connector.client.common.websocket.adapter;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.DecimalFormatter;
import com.binance.connector.client.common.SystemUtil;
import com.binance.connector.client.common.auth.SignatureGeneratorFactory;
import com.binance.connector.client.common.sign.SignatureGenerator;
import com.binance.connector.client.common.websocket.SignatureUtil;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.dtos.ApiRequestWrapperDTO;
import com.binance.connector.client.common.websocket.dtos.BaseRequestDTO;
import com.binance.connector.client.common.websocket.dtos.RequestWrapperDTO;
import com.binance.connector.client.common.websocket.dtos.SessionResponse;
import com.binance.connector.client.common.websocket.service.DeserializeExclusionStrategy;
import com.binance.connector.client.common.websocket.service.SerializeExclusionStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializer;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.text.DecimalFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.crypto.CryptoException;
import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.http.HttpField;
import org.eclipse.jetty.http.HttpHeader;
import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.StatusCode;
import org.eclipse.jetty.websocket.api.WebSocketListener;
import org.eclipse.jetty.websocket.api.WriteCallback;
import org.eclipse.jetty.websocket.client.ClientUpgradeRequest;
import org.eclipse.jetty.websocket.client.WebSocketClient;

public class ConnectionWrapper implements WebSocketListener, ConnectionInterface {
    private static final Logger log = Logger.getLogger(ConnectionWrapper.class.getName());

    public static final int WAIT_TIME = 5;
    private static final String QUERY_PARAM_TIME_UNIT = "timeUnit";
    // -2015 for wrong API Keys, -1022 for wrong signature
    private static final List<Integer> ERROR_CODE_WRONG_CREDENTIALS = Arrays.asList(-2015, -1022);

    protected Map<String, RequestWrapperDTO> pendingRequest = new HashMap<>();
    protected Session session;
    protected Session oldSession;

    protected List<String> logonMethods = new ArrayList<>();
    protected List<String> logoutMethods = new ArrayList<>();

    private String userAgent =
            String.format(
                    "binance-connector-java/1.0.0 (Java/%s; %s; %s)",
                    SystemUtil.getJavaVersion(), SystemUtil.getOs(), SystemUtil.getArch());

    private boolean isLoggedOn = false;
    private boolean isReady = false;
    private boolean canReconnect = true;
    private final WebSocketClient webSocketClient;
    private final WebSocketClientConfiguration configuration;
    private final SignatureGeneratorFactory signatureGeneratorFactory =
            new SignatureGeneratorFactory();
    private Gson gson;
    private SignatureGenerator signatureGenerator;

    private CountDownLatch countDownLatch;

    private boolean pendingReconnect = false;

    private List<BlockingQueue<String>> streamQueues = new ArrayList<>();

    public ConnectionWrapper(WebSocketClientConfiguration configuration, Gson gson) {
        this(configuration, null, gson);
    }

    public ConnectionWrapper(WebSocketClientConfiguration configuration) {
        this(configuration, null, null);
    }

    public ConnectionWrapper(
            WebSocketClientConfiguration configuration, WebSocketClient webSocketClient) {
        this(configuration, webSocketClient, null);
    }

    public ConnectionWrapper(
            WebSocketClientConfiguration configuration,
            WebSocketClient webSocketClient,
            Gson gson) {
        if (webSocketClient == null) {
            HttpClient httpClient = new HttpClient();
            httpClient.setUserAgentField(new HttpField(HttpHeader.USER_AGENT, userAgent));
            if (configuration.getConnectTimeout() != null) {
                httpClient.setConnectTimeout(configuration.getConnectTimeout());
            }

            if (configuration.getWebSocketProxy() != null) {
                httpClient.getProxyConfiguration().addProxy(configuration.getWebSocketProxy());
                if (configuration.getWebSocketProxyAuthentication() != null) {
                    httpClient
                            .getAuthenticationStore()
                            .addAuthentication(configuration.getWebSocketProxyAuthentication());
                }
            }
            webSocketClient = new WebSocketClient(httpClient);
        }

        webSocketClient.setIdleTimeout(Duration.ZERO);
        if (configuration.getMessageMaxSize() != null) {
            webSocketClient.setMaxTextMessageSize(configuration.getMessageMaxSize());
        }

        if (!webSocketClient.isStarted() && !webSocketClient.isStarting()) {
            try {
                webSocketClient.start();
            } catch (Exception e) {
                throw new ApiException(e);
            }
        }
        this.configuration = configuration;
        this.webSocketClient = webSocketClient;

        if (gson == null) {
            this.gson =
                    new GsonBuilder()
                            .registerTypeAdapter(
                                    Double.class,
                                    (JsonSerializer<Double>)
                                            (src, typeOfSrc, context) -> {
                                                DecimalFormat df = DecimalFormatter.getFormatter();
                                                return new JsonPrimitive(df.format(src));
                                            })
                            .addSerializationExclusionStrategy(new SerializeExclusionStrategy())
                            .addDeserializationExclusionStrategy(new DeserializeExclusionStrategy())
                            .create();
        } else {
            this.gson = gson;
        }

        Integer reconnectAfter = configuration.getReconnectIntervalTime();
        new Timer()
                .scheduleAtFixedRate(
                        new TimerTask() {
                            @Override
                            public void run() {
                                try {
                                    if (canReconnect()) {
                                        connect();
                                    } else {
                                        pendingReconnect = true;
                                    }

                                } catch (Exception e) {
                                    System.out.println(e);
                                    throw new RuntimeException(e);
                                }
                            }
                        },
                        reconnectAfter,
                        reconnectAfter);
    }

    public void connect() {
        try {
            connect(null);
        } catch (Exception e) {
            throw new ApiException(e);
        }
    }

    public void connect(Consumer<Session> customCallback)
            throws IOException, URISyntaxException, InterruptedException {
        pendingReconnect = false;
        boolean autoLogon = !logonMethods.isEmpty() && (configuration.getAutoLogon() || isLoggedOn);

        // For LogOn mode, we need the logon to be completed before changing the session
        countDownLatch = new CountDownLatch(autoLogon ? 1 : 0);

        Consumer<Session> callback = autoLogon ? getLogonConsumer() : null;
        // The server URI to connect to.
        URI serverURI = null;
        serverURI = getUri(configuration.getUrl());

        if (configuration.getSignatureConfiguration() != null) {
            this.signatureGenerator =
                    signatureGeneratorFactory.getSignatureGenerator(
                            configuration.getSignatureConfiguration());
        }

        beforeConnect();

        ClientUpgradeRequest clientUpgradeRequest = null;
        if (configuration.getCompression()) {
            clientUpgradeRequest = new ClientUpgradeRequest();
            clientUpgradeRequest.addExtensions("permessage-deflate");
        }

        // Connect the client EndPoint to the server.
        CompletableFuture<Session> clientSessionPromise =
                webSocketClient.connect(this, serverURI, clientUpgradeRequest);
        Session session = clientSessionPromise.join();
        if (callback != null) {
            callback.accept(session);
        }
        if (customCallback != null) {
            customCallback.accept(session);
        }

        // Wait up to 5s for the logon to be completed
        boolean await = countDownLatch.await(WAIT_TIME, TimeUnit.SECONDS);
        if (!await) {
            log.log(Level.WARNING, "countDownLatch wait timeout");
        }
        afterConnect(session);
    }

    public Consumer<Session> getLogonConsumer() {
        return (Session session) -> {
            try {
                this.logOn(session);
            } catch (Exception e) {
                throw new ApiException(e);
            }
        };
    }

    public void onWebSocketPing(ByteBuffer payload) {
        this.session.getRemote().sendPong(payload, WriteCallback.NOOP);
    }

    public Map<String, RequestWrapperDTO> getPendingRequest() {
        return pendingRequest;
    }

    public boolean isPendingReconnect() {
        return pendingReconnect;
    }

    public void setPendingReconnect(boolean pendingReconnect) {
        this.pendingReconnect = pendingReconnect;
    }

    public boolean isReady() {
        return isReady && session.isOpen();
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }

    public String getUserAgent() {
        return userAgent;
    }

    @Override
    public void setUserAgent(String userAgent) {
        if (webSocketClient != null) {
            webSocketClient
                    .getHttpClient()
                    .setUserAgentField(new HttpField(HttpHeader.USER_AGENT, userAgent));
        }
    }

    @Override
    public void onWebSocketError(Throwable cause) {
        if (cause instanceof ClosedChannelException) {
            log.info("channel was closed: " + cause.getMessage());
        } else {
            log.log(Level.SEVERE, "received webSocket error", cause);
        }
    }

    @Override
    public void onWebSocketClose(int statusCode, String reason) {
        if (statusCode == StatusCode.NORMAL) {
            log.info("received websocket close, code: " + statusCode + " reason: " + reason);
            return;
        }
        if (statusCode == StatusCode.NO_CLOSE) {
            Collection<Session> openSessions = webSocketClient.getOpenSessions();
            for (Session openSession : openSessions) {
                // old session being closed, it's expected
                if (oldSession != null && !oldSession.isOpen() && openSession.equals(oldSession)) {
                    log.info("old session closing, code: " + statusCode + " reason: " + reason);
                    return;
                }
            }
        }
        log.log(
                Level.SEVERE,
                "received websocket close, code: " + statusCode + " reason: " + reason);
        if (canReconnect) {
            try {
                connect();
            } catch (Exception e) {
                log.log(Level.SEVERE, "Error while trying to reconnect", e);
            }
        }
    }

    public void send(RequestWrapperDTO request) {
        send(request, this.session);
    }

    public void send(ApiRequestWrapperDTO request) {
        BaseRequestDTO baseRequest = request.getParams();
        if (baseRequest == null) {
            baseRequest = new BaseRequestDTO();
        }

        if (request.isApiKeyOnly() && baseRequest.getApiKey() == null) {
            baseRequest.setApiKey(configuration.getSignatureConfiguration().getApiKey());
        }

        if (request.isSigned()) {
            baseRequest.setTimestamp(getTimestamp().toString());

            if (!isLoggedOn) {
                if (baseRequest.getApiKey() == null) {
                    baseRequest.setApiKey(configuration.getSignatureConfiguration().getApiKey());
                }

                try {
                    baseRequest.setSignature(
                            signatureGenerator.signAsString(baseRequest.toUrlQueryString()));
                } catch (CryptoException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        innerSend(request);
    }

    @Override
    public BlockingQueue<String> sendForStream(ApiRequestWrapperDTO request)
            throws InterruptedException {
        LinkedBlockingDeque<String> streamQueue = new LinkedBlockingDeque<>();
        streamQueues.add(streamQueue);
        send(request);
        return streamQueue;
    }

    public void innerSend(RequestWrapperDTO requestWrapperDTO) {
        send(requestWrapperDTO);
    }

    public void send(RequestWrapperDTO request, Session session) {
        session.getRemote()
                .sendString(
                        gson.toJson(request),
                        new WriteCallback() {
                            @Override
                            public void writeFailed(Throwable x) {
                                throw new ApiException(x);
                            }

                            @Override
                            public void writeSuccess() {
                                ConnectionWrapper.this.pendingRequest.put(request.getId(), request);
                            }
                        });
    }

    public Long getTimestamp() {
        return System.currentTimeMillis();
    }

    public void logOn(Session session) throws CryptoException {
        SignatureUtil signatureUtil = new SignatureUtil();
        String timestamp = signatureUtil.buildTimestamp();

        BaseRequestDTO build =
                new BaseRequestDTO.Builder()
                        .apiKey(configuration.getSignatureConfiguration().getApiKey())
                        .timestamp(timestamp)
                        .build();

        build.setSignature(signatureGenerator.signAsString(build.toString()));
        RequestWrapperDTO<? extends BaseRequestDTO, SessionResponse> request =
                new RequestWrapperDTO.Builder<BaseRequestDTO, SessionResponse>()
                        .id(UUID.randomUUID().toString())
                        .method(logonMethods.get(0))
                        .params(build)
                        .responseType(SessionResponse.class)
                        .build();

        request.getResponseCallback()
                .handle(
                        (resp, error) -> {
                            if (error != null) {
                                log.log(Level.SEVERE, "Logon request failed", error);
                            }
                            if (resp.getError() != null) {
                                if (ERROR_CODE_WRONG_CREDENTIALS.contains(
                                        resp.getError().getCode())) {
                                    canReconnect = false;
                                }
                                log.log(
                                        Level.SEVERE,
                                        "Logon request failed",
                                        new ApiException(
                                                resp.getError().getCode(),
                                                resp.getError().getMsg()));
                            }
                            countDownLatch.countDown();
                            return resp;
                        });

        this.send(request, session);
    }

    @Override
    public void onWebSocketConnect(Session session) {
        this.session = session;
        // No need to demand here, because this endpoint is auto-demanding.
    }

    @Override
    public void onWebSocketText(String message) {
        try {
            JsonElement root = JsonParser.parseString(message);
            JsonObject obj = root.getAsJsonObject();
            JsonElement idElem = obj.get("id");
            String id = idElem == null ? null : idElem.getAsString();
            RequestWrapperDTO requestWrapperDTO = null;
            if (id != null) {
                requestWrapperDTO = pendingRequest.get(id);
            }

            if (requestWrapperDTO == null) {
                for (BlockingQueue<String> streamQueue : streamQueues) {
                    JsonElement eventElem = obj.get("event");
                    streamQueue.offer(eventElem != null ? eventElem.toString() : message);
                }
                return;
            }
            Type responseType = requestWrapperDTO.getResponseType();

            Object responseResult = gson.fromJson(root, responseType);
            pendingRequest.remove(id);

            if (this.logonMethods.contains(requestWrapperDTO.getMethod())) {
                if (obj.get("status").getAsInt() == 200) {
                    isLoggedOn = true;
                }
            }

            if (this.logoutMethods.contains(requestWrapperDTO.getMethod())) {
                if (obj.get("status").getAsInt() == 200) {
                    isLoggedOn = false;
                }
            }

            requestWrapperDTO.getResponseCallback().complete(responseResult);

            if (isPendingReconnect() && pendingRequest.isEmpty()) {
                connect();
            }
        } catch (Exception e) {
            log.log(Level.SEVERE, "Exception while receiving message from WS connection", e);
            throw new RuntimeException(e);
        }
    }

    public boolean canReconnect() {
        return isReady && pendingRequest.isEmpty();
    }

    protected void beforeConnect() {
        // session exists and is open, it's a reconnect
        if (this.session != null && this.session.isOpen()) {
            this.oldSession = this.session;
        }
    }

    protected void afterConnect(Session session) {
        this.session = session;
        if (this.oldSession != null) {
            this.oldSession.close(StatusCode.NORMAL, "close after reconnect", WriteCallback.NOOP);
        }
        setReady(true);
    }

    @Override
    public boolean isConnected() {
        return session != null && session.isOpen();
    }

    @Override
    public void setLogonMethods(List<String> logonMethods) {
        this.logonMethods = logonMethods;
    }

    @Override
    public void setLogoutMethods(List<String> logoutMethods) {
        this.logoutMethods = logoutMethods;
    }

    public URI getUri(String uri) throws URISyntaxException {
        URI oldUri = new URI(uri);

        // timeUnit not configured or already specified in query
        if (configuration.getTimeUnit() == null
                || (oldUri.getQuery() != null
                        && oldUri.getQuery().contains(QUERY_PARAM_TIME_UNIT + "="))) {
            return oldUri;
        }

        String newQuery = oldUri.getQuery();
        String appendQuery = QUERY_PARAM_TIME_UNIT + "=" + configuration.getTimeUnit();
        if (newQuery == null) {
            newQuery = appendQuery;
        } else {
            newQuery += "&" + appendQuery;
        }

        return new URI(
                oldUri.getScheme(),
                oldUri.getAuthority(),
                oldUri.getPath(),
                newQuery,
                oldUri.getFragment());
    }
}
