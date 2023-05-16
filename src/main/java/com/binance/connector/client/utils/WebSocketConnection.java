package com.binance.connector.client.utils;

import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.binance.connector.client.exceptions.BinanceConnectorException;
import com.binance.connector.client.utils.websocketcallback.WebSocketClosedCallback;
import com.binance.connector.client.utils.websocketcallback.WebSocketClosingCallback;
import com.binance.connector.client.utils.websocketcallback.WebSocketFailureCallback;
import com.binance.connector.client.utils.websocketcallback.WebSocketMessageCallback;
import com.binance.connector.client.utils.websocketcallback.WebSocketOpenCallback;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;

public class WebSocketConnection extends WebSocketListener {
    private static final AtomicInteger connectionCounter = new AtomicInteger(0);
    private static final int NORMAL_CLOSURE_STATUS = 1000;
    private static final Logger logger = LoggerFactory.getLogger(WebSocketConnection.class);
    private static OkHttpClient client;

    private final int connectionId;
    private final Object mutex;
    private final Request request;
    private final String streamName;

    private final WebSocketOpenCallback onOpenCallback;
    private final WebSocketMessageCallback onMessageCallback;
    private final WebSocketClosingCallback onClosingCallback;
    private final WebSocketClosedCallback onClosedCallback;
    private final WebSocketFailureCallback onFailureCallback;

    private WebSocket webSocket;

    public WebSocketConnection(
			WebSocketOpenCallback onOpenCallback,
			WebSocketMessageCallback onMessageCallback,
			WebSocketClosingCallback onClosingCallback,
            WebSocketClosedCallback onClosedCallback,
			WebSocketFailureCallback onFailureCallback,
            Request request,
            OkHttpClient client
    ) {
        this.onOpenCallback = onOpenCallback;
        this.onMessageCallback = onMessageCallback;
        this.onClosingCallback = onClosingCallback;
        this.onClosedCallback = onClosedCallback;
        this.onFailureCallback = onFailureCallback;
        this.connectionId = WebSocketConnection.connectionCounter.incrementAndGet();
        this.request = request;
        this.streamName = request.url().host() + request.url().encodedPath();
        this.webSocket = null;
        this.mutex = new Object();
        WebSocketConnection.client = client;
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

    public void send(String message) {
        if (null == webSocket) {
            throw new BinanceConnectorException("No WebSocket connection. Please connect first!");
        } 
        webSocket.send(message);
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
    public void onClosed(WebSocket ws, int code, String reason) {
        super.onClosed(ws, code, reason);
        onClosedCallback.onClosed(code, reason);
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
