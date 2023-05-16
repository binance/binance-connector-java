package com.binance.connector.client.utils.websocketcallback;

@FunctionalInterface
public interface WebSocketClosedCallback {
    /**
     * onclosed will be called when websocket connection has been successfully released. No further calls to this listener will be made.
     *
     * @param code The code send by server.
     * @param reason The reason send by server.
     */

    void onClosed(int code, String reason);
}
