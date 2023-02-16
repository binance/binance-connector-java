package com.binance.connector.client.utils.httpclient;

import okhttp3.OkHttpClient;

public final class WebSocketApiHttpClientSingleton {
    private static final OkHttpClient httpClient = new OkHttpClient();

    private WebSocketApiHttpClientSingleton() {
    }

    public static OkHttpClient getHttpClient() {
        return httpClient;
    }
}
