package com.binance.connector.client.utils.httpclient;

import okhttp3.OkHttpClient;

public final class WebSocketStreamHttpClientSingleton {
    private static final OkHttpClient httpClient = new OkHttpClient(OkHttpClientBuilder.builder);

    private WebSocketStreamHttpClientSingleton() {
    }

    public static OkHttpClient getHttpClient() {
        return httpClient;
    }

}
