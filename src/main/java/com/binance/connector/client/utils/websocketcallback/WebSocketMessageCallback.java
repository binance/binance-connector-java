package com.binance.connector.client.utils.websocketcallback;

@FunctionalInterface
public interface WebSocketMessageCallback {
    /**
     * onMessage will be called when data is received from server.
     *
     * @param data The data send by server.
     */
    void onMessage(String data);
}
