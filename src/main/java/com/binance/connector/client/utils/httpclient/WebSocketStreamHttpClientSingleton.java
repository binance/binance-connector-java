package com.binance.connector.client.utils.httpclient;

import okhttp3.OkHttpClient;

public final class WebSocketStreamHttpClientSingleton {
    private static final OkHttpClient httpClient = new OkHttpClient();

    private WebSocketStreamHttpClientSingleton() {
    }

    public static OkHttpClient getHttpClient() {
        return httpClient;
    }

}
