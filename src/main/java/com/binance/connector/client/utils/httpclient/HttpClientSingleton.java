package com.binance.connector.client.utils.httpclient;

import com.binance.connector.client.utils.ProxyAuth;
import java.net.Proxy;
import okhttp3.OkHttpClient;

public final class HttpClientSingleton {
    private static OkHttpClient httpClient = null;

    private HttpClientSingleton() {
    }

    private static void createHttpClient(ProxyAuth proxy) {
        if (proxy == null) {
            httpClient = new OkHttpClient();
        } else {
            if (proxy.getAuth() == null) {
                httpClient = new OkHttpClient.Builder().proxy(proxy.getProxy()).build();
            } else {
                httpClient = new OkHttpClient.Builder().proxy(proxy.getProxy()).proxyAuthenticator(proxy.getAuth()).build();
            }
        }
    }

    private static void verifyHttpClient(ProxyAuth proxy) {
        Proxy prevProxy = httpClient.proxy();

        if ((proxy != null && !proxy.getProxy().equals(prevProxy)) || (proxy == null && prevProxy != null)) {
            createHttpClient(proxy);
        }
    }

    public static OkHttpClient getHttpClient(ProxyAuth proxy) {
        if (httpClient == null) {
            createHttpClient(proxy);
        } else {
            verifyHttpClient(proxy);
        }
        return httpClient;
    }

    public static OkHttpClient getHttpClient() {
        if (httpClient == null) {
            createHttpClient(null);
        } 
        return httpClient;
    }
}