package com.binance.connector.client.utils;

import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebSocketConnection extends WebSocketListener {
    private static final AtomicInteger connectionCounter = new AtomicInteger(0);
    private static final int NORMAL_CLOSURE_STATUS = 1000;
    private static final OkHttpClient client = WebSocketHttpClientSingleton.getHttpClient();
    private static final Logger logger = LoggerFactory.getLogger(WebSocketConnection.class);

	private final WebSocketOpenCallback    onOpenCallback;
	private final WebSocketMessageCallback onMessageCallback;
	private final WebSocketClosingCallback onClosingCallback;
	private final WebSocketFailureCallback onFailureCallback;
	private final int connectionId;
	private final Request request;
	private final String streamName;

    private WebSocket webSocket;

    private final Object mutex;

    public WebSocketConnection(
			WebSocketOpenCallback onOpenCallback,
			WebSocketMessageCallback onMessageCallback,
			WebSocketClosingCallback onClosingCallback,
			WebSocketFailureCallback onFailureCallback,
            Request request
    ) {
        this.onOpenCallback = onOpenCallback;
        this.onMessageCallback = onMessageCallback;
        this.onClosingCallback = onClosingCallback;
        this.onFailureCallback = onFailureCallback;
        this.connectionId = WebSocketConnection.connectionCounter.incrementAndGet();
        this.request = request;
        this.streamName = request.url().host() + request.url().encodedPath();
        this.webSocket = null;
        this.mutex = new Object();
    }

    public void connect() {
        synchronized (mutex) {
            if (null == webSocket) {
                logger.info("[Connection {}] Connecting to {}", connectionId, streamName);
                webSocket = client.newWebSocket(request, this);
            } else {
                logger.info("[Connection {}] is already connected to {}", connectionId, streamName);
            }
        }
    }

    public int getConnectionId() {
        return connectionId;
    }


    public void close() {
        if (null != webSocket) {
            logger.info("[Connection {}] Closing connection to {}", connectionId, streamName);
            webSocket.close(NORMAL_CLOSURE_STATUS, null);
        }
    }

    @Override
    public void onOpen(WebSocket ws, Response response) {
        logger.info("[Connection {}] Connected to Server", connectionId);
        onOpenCallback.onOpen(response);
    }

    @Override
    public void onClosing(WebSocket ws, int code, String reason) {
        super.onClosing(ws, code, reason);
        onClosingCallback.onClosing(code, reason);
    }

    @Override
    public void onMessage(WebSocket ws, String text) {
        onMessageCallback.onMessage(text);
    }

    @Override
    public void onFailure(WebSocket ws, Throwable t, Response response) {
        logger.error("[Connection {}] Failure", connectionId, t);
        onFailureCallback.onFailure(t, response);
    }
}
