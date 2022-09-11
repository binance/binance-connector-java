package com.binance.connector.client.utils;

import okhttp3.Response;

@FunctionalInterface
public interface WebSocketFailureCallback {
    /**
     * onFailure will be called when the websocket has failed.
     *
     * @param t The exception thrown by server.
     * @param response The response associated
     */
    void onFailure(Throwable t, Response response);
}
