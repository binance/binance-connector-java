package com.binance.connector.client.utils;

import okhttp3.OkHttpClient;

public final class WebSocketHttpClientSingleton {
    private static final OkHttpClient httpClient = new OkHttpClient();

    private WebSocketHttpClientSingleton() {
    }

    public static OkHttpClient getHttpClient() {
        return httpClient;
    }

}
