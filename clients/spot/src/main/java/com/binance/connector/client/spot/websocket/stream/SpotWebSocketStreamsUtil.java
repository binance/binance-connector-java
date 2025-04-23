package com.binance.connector.client.spot.websocket.stream;

import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;

public class SpotWebSocketStreamsUtil {
    private static final String BASE_URL = "wss://stream.binance.com:9443";
    private static final boolean HAS_TIME_UNIT = true;

    public static WebSocketClientConfiguration getClientConfiguration() {
        WebSocketClientConfiguration clientConfiguration = new WebSocketClientConfiguration();
        if (!HAS_TIME_UNIT) {
            clientConfiguration.setTimeUnit(null);
        }
        clientConfiguration.setUrl(BASE_URL + "/stream");
        clientConfiguration.setAutoLogon(false);
        return clientConfiguration;
    }
}
