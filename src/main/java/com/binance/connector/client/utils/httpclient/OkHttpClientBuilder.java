package com.binance.connector.client.utils.httpclient;

import okhttp3.OkHttpClient;

public final class OkHttpClientBuilder {
    private static OkHttpClient.Builder builder = new OkHttpClient.Builder();

    private OkHttpClientBuilder() {
    }

    public static void setBuilder(OkHttpClient.Builder builder) {
        OkHttpClientBuilder.builder = builder;
    }

    public static OkHttpClient.Builder getBuilder() {
        return builder;
    }
}
