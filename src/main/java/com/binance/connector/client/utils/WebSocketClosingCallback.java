package com.binance.connector.client.utils;

@FunctionalInterface
public interface WebSocketClosingCallback {
    /**
     * onClosing will be called when the websocket is closing.
     *
     * @param reason The reason send by server.
     */
    void onClosing(int code, String reason);
}
