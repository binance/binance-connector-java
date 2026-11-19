package com.binance.connector.client.stock_options.websocket.stream;

import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;

public class StockOptionsWebSocketStreamsUtil {
    private static final String BASE_URL = "wss://nbstream.binance.com/equity";
    private static final boolean HAS_TIME_UNIT = false;

    public static WebSocketClientConfiguration getClientConfiguration() {
        return getClientConfiguration("");
    }

    public static WebSocketClientConfiguration getClientConfiguration(String path) {
        WebSocketClientConfiguration clientConfiguration = new WebSocketClientConfiguration();
        if (!HAS_TIME_UNIT) {
            clientConfiguration.setTimeUnit(null);
        }
        clientConfiguration.setUrl(getBaseUrl(path));
        clientConfiguration.setAutoLogon(false);
        return clientConfiguration;
    }

    protected static String getBaseUrl(String path) {
        return BASE_URL + path + "/stream";
    }
}
