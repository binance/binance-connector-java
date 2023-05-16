package com.binance.connector.client.utils.websocketcallback;

@FunctionalInterface
public interface WebSocketClosingCallback {
    /**
     * onClosing will be called when websocket is informed that no more incoming messages will be transmitted.
     *
     * @param code The code send by server.
     * @param reason The reason send by server.
     */
    void onClosing(int code, String reason);
}
