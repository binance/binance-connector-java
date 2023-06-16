package com.binance.connector.client.utils.httpclient;

import okhttp3.OkHttpClient;

import java.time.Duration;

public class OkHttpClientBuilder {
    public static OkHttpClient.Builder builder = new OkHttpClient.Builder().pingInterval(Duration.ofSeconds(10));
}
