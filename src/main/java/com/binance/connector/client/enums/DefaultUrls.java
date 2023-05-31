package com.binance.connector.client.enums;

public final class DefaultUrls {
    public static final String PROD_URL = "https://api.binance.com";
    public static final String WS_URL = "wss://stream.binance.com:9443";
    public static final String WS_API_URL = "wss://ws-api.binance.com:443/ws-api/v3";
    public static final String TESTNET_URL = "https://testnet.binance.vision";
    public static final String TESTNET_WS_URL = "wss://testnet.binance.vision";
    public static final String TESTNET_WS_API_URL = "wss://testnet.binance.vision/ws-api/v3";
    public static final String MARKET_URL = "https://data-api.binance.vision";
    public static final String MARKET_WS_URL = "wss://data-stream.binance.vision";
    private DefaultUrls() {
    }
}
