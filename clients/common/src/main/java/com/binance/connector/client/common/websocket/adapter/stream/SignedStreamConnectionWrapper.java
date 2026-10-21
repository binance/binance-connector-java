package com.binance.connector.client.common.websocket.adapter.stream;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.JSON;
import com.binance.connector.client.common.auth.SignatureGeneratorFactory;
import com.binance.connector.client.common.sign.SignatureGenerator;
import com.binance.connector.client.common.websocket.adapter.ConnectionWrapper;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.dtos.RequestWrapperDTO;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueue;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.lang3.StringUtils;
import org.bouncycastle.crypto.CryptoException;
import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.WriteCallback;
import org.eclipse.jetty.websocket.client.WebSocketClient;

import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.SecureRandom;
import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.stream.Collectors;

import static com.binance.connector.client.common.configuration.ClientConfiguration.DEFAULT_PING_INTERVAL_TIME;

public class SignedStreamConnectionWrapper extends ConnectionWrapper
        implements StreamConnectionInterface {
    private final HashMap<String, List<StreamBlockingQueue<String>>> subscriptions =
            new HashMap<>();
    private final TimerTask pingTask = new TimerTask() {
        @Override
        public void run() {
            try {
                session.getRemote().sendPing(null, WriteCallback.NOOP);
            } catch (Exception e) {
                System.err.println("ping failed:" + e.getMessage());
            }
        }
    };

    public SignedStreamConnectionWrapper(WebSocketClientConfiguration configuration, Gson json) {
        super(configuration, json);
    }

    public SignedStreamConnectionWrapper(WebSocketClientConfiguration configuration) {
        super(configuration);
    }

    public SignedStreamConnectionWrapper(
            WebSocketClientConfiguration configuration, WebSocketClient webSocketClient) {
        super(configuration, webSocketClient);
    }

    public static String getRandomString() {
        SecureRandom random = new SecureRandom();
        byte[] bytes = new byte[16];
        random.nextBytes(bytes);

        return Hex.encodeHexString(bytes);
    }

    public Map<String, StreamBlockingQueue<String>> subscribe(
            RequestWrapperDTO<Set<String>, Object> requestWrapperDTO) {
        HashMap<String, StreamBlockingQueue<String>> queueMap = new HashMap<>();
        List<String> allSubscriptions = new ArrayList<>();
        String value = requestWrapperDTO.getValue();
        if (StringUtils.isNotBlank(value)) {
            allSubscriptions.addAll(Arrays.asList(value.split("\\|")));
        }
        if (requestWrapperDTO.getParams() != null) {
            allSubscriptions.addAll(requestWrapperDTO.getParams());
        }
        for (String subscription : allSubscriptions) {
            List<StreamBlockingQueue<String>> blockingQueueList;
            if (this.subscriptions.containsKey(subscription)) {
                blockingQueueList = this.subscriptions.get(subscription);
            } else {
                blockingQueueList = new ArrayList<>();
            }
            BlockingQueue<String> blockingQueue = new LinkedBlockingDeque<>();

            StreamBlockingQueue blockingQueueWrapper =
                    new StreamBlockingQueue(blockingQueue, subscription);

            blockingQueueList.add(blockingQueueWrapper);
            this.subscriptions.put(subscription, blockingQueueList);
            this.innerSend(requestWrapperDTO);
            queueMap.put(subscription, blockingQueueWrapper);
        }

        return queueMap;
    }

    public void unsubscribe(StreamBlockingQueueWrapper blockingQueueWrapper) {
        unsubscribe(blockingQueueWrapper.getInnerQueue());
    }

    public void unsubscribe(StreamBlockingQueue queue) {
        String operationId = queue.getOperationId();
        List<StreamBlockingQueue<String>> blockingQueues = subscriptions.get(operationId);
        blockingQueues.remove(queue);

        // unsubscribe from the stream if no more queue
        if (blockingQueues.isEmpty()) {
            RequestWrapperDTO unsubscribe =
                    new RequestWrapperDTO.Builder<>()
                            .command("UNSUBSCRIBE")
                            .value(operationId)
                            .build();

            this.send(unsubscribe);
        }
    }

    @Override
    public void onWebSocketText(String message) {
        try {
            JsonElement root = JsonParser.parseString(message);
            JsonObject obj = root.getAsJsonObject();

            if (handleShutdownMessage(obj)) {
                return;
            }

            // Response to subscribe
            JsonElement id = obj.get("id");
            if (id != null && !id.isJsonNull()) {
                JsonElement result = obj.get("result");
                RequestWrapperDTO requestWrapperDTO = pendingRequest.get(id.getAsString());
                Type responseType = requestWrapperDTO.getResponseType();
                Object fromJson =
                        result.isJsonNull() ? null : JSON.getGson().fromJson(result, responseType);
                pendingRequest.remove(id.getAsString());
                requestWrapperDTO.getResponseCallback().complete(fromJson);
                return;
            }

            JsonElement stream = obj.get("stream");
            if (stream == null) {
                stream = obj.get("topic");
            }
            // no stream, we couldn't detect which queue to use.
            if (stream == null) {
                return;
            }
            List<StreamBlockingQueue<String>> blockingQueues =
                    subscriptions.get(stream.getAsString());
            if (blockingQueues == null || blockingQueues.isEmpty()) {
                return;
            }
            for (StreamBlockingQueue<String> queue : blockingQueues) {
                JsonElement data = obj.get("data");

                if (data == null || data.isJsonNull()) {
                    return;
                }

                String dataJson = data.isJsonPrimitive() && data.getAsJsonPrimitive().isString()
                        ? data.getAsString()
                        : data.toString();

                queue.offer(dataJson);
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
    }

    protected void beforeConnect() {
        super.beforeConnect();
    }

    protected void afterConnect(Session session) {
        List<String> subcriptionsListResult = subscriptions.entrySet().stream()
                .filter(entry -> entry.getValue() != null && !entry.getValue().isEmpty())
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        if (!subcriptionsListResult.isEmpty()) {
            RequestWrapperDTO subscribe =
                    new RequestWrapperDTO.Builder<>()
                            .command("SUBSCRIBE")
                            .value(String.join("|", subcriptionsListResult))
                            .build();

            this.send(subscribe);
        }

        Long pingIntervalTime = getConfiguration().getPingIntervalTime();
        if (pingIntervalTime == null) {
            pingIntervalTime = DEFAULT_PING_INTERVAL_TIME;
        }

        // it's the first connect
        if (oldSession == null) {
            this.timer.scheduleAtFixedRate(
                    pingTask,
                    pingIntervalTime,
                    pingIntervalTime
            );
        }

        super.afterConnect(session);
    }

    @Override
    public URI getUri(String uri) throws URISyntaxException {
        URI oldUri = new URI(uri);
        SignatureGeneratorFactory signatureGeneratorFactory = new SignatureGeneratorFactory();
        SignatureGenerator signatureGenerator =
                signatureGeneratorFactory.getSignatureGenerator(getConfiguration().getSignatureConfiguration());

        String newQuery =
                "random="
                        + getRandomString()
                        + "&recvWindow="
                        + getConfiguration().getRecvWindow()
                        + "&timestamp="
                        + getTimestamp();
        String signature = null;
        try {
            signature = signatureGenerator.signAsString(newQuery);
        } catch (CryptoException e) {
            throw new RuntimeException(e);
        }
        return new URI(
                oldUri.getScheme(),
                oldUri.getAuthority(),
                oldUri.getPath(),
                newQuery + "&signature=" + signature,
                oldUri.getFragment());
    }
}