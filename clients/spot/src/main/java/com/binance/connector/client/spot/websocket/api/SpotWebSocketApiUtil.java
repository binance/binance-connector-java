package com.binance.connector.client.spot.websocket.api;

import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;

public class SpotWebSocketApiUtil {
    private static final String BASE_URL = "wss://ws-api.binance.com:443/ws-api/v3";
    private static final boolean HAS_TIME_UNIT = true;

    public static WebSocketClientConfiguration getClientConfiguration() {
        WebSocketClientConfiguration clientConfiguration = new WebSocketClientConfiguration();
        if (!HAS_TIME_UNIT) {
            clientConfiguration.setTimeUnit(null);
        }
        clientConfiguration.setUrl(BASE_URL);
        return clientConfiguration;
    }
}
