package com.binance.connector.client.margin_trading.websocket.stream;

import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;

public class MarginTradingWebSocketStreamsUtil {
    private static final String BASE_URL = "wss://stream.binance.com:9443";
    private static final boolean HAS_TIME_UNIT = false;

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
