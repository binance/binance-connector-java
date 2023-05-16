package com.binance.connector.client.utils.websocketcallback;

import okhttp3.Response;

@FunctionalInterface
public interface WebSocketOpenCallback {
    /**
     * onOpen will be called when the websocket has been accepted by server and may begin transmitting messages.
     *
     * @param response The response send by server.
     */
    void onOpen(Response response);
}
