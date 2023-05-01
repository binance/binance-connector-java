package com.binance.connector.client.utils;

import java.net.Proxy;

import okhttp3.Authenticator;

public final class ProxyAuth {
    private Proxy proxy;
    private Authenticator auth;

    
    public ProxyAuth(Proxy proxy, Authenticator auth) {
        this.proxy = proxy;
        this.auth = auth;
    }

    public Proxy getProxy() {
        return proxy;
    }

    public Authenticator getAuth() {
        return auth;
    }
}
