package com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream;

import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;

public class DerivativesTradingUsdsFuturesWebSocketStreamsUtil {
    private static final String BASE_URL = "wss://fstream.binance.com";
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
