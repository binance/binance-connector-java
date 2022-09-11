package com.binance.connector.client.utils;

import okhttp3.Response;

@FunctionalInterface
public interface WebSocketOpenCallback {
    /**
     * onOpen will be called when the websocket has been opened.
     *
     * @param response The response send by server.
     */
    void onOpen(Response response);
}
