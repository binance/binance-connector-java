package com.binance.connector.client.derivatives_trading_usds_futures.websocket.api;

import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;

public class DerivativesTradingUsdsFuturesWebSocketApiUtil {
    private static final String BASE_URL = "wss://ws-fapi.binance.com/ws-fapi/v1";
    private static final boolean HAS_TIME_UNIT = false;

    public static WebSocketClientConfiguration getClientConfiguration() {
        WebSocketClientConfiguration clientConfiguration = new WebSocketClientConfiguration();
        if (!HAS_TIME_UNIT) {
            clientConfiguration.setTimeUnit(null);
        }
        clientConfiguration.setUrl(BASE_URL);
        return clientConfiguration;
    }
}
