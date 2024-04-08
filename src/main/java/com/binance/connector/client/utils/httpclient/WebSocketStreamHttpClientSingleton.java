package com.binance.connector.client.utils.httpclient;

import com.binance.connector.client.utils.ProxyAuth;
import okhttp3.OkHttpClient;

public final class WebSocketStreamHttpClientSingleton {

  private static OkHttpClient httpClient = null;

  private WebSocketStreamHttpClientSingleton() {
  }

  public static OkHttpClient getHttpClient() {
    if (httpClient == null) {
      httpClient = new OkHttpClient();
    }
    return httpClient;
  }

  public static OkHttpClient getHttpClientWithProxy(ProxyAuth proxy) {
    createClientWithProxy(proxy);
    return httpClient;
  }

  public static void createClientWithProxy(ProxyAuth proxy) {
    if (proxy == null) {
      httpClient = new OkHttpClient();
    } else {
      if (proxy.getAuth() == null) {
        httpClient = new OkHttpClient.Builder().proxy(proxy.getProxy()).build();
      } else {
        httpClient = new OkHttpClient.Builder().proxy(proxy.getProxy())
            .proxyAuthenticator(proxy.getAuth()).build();
      }
    }
  }

}
