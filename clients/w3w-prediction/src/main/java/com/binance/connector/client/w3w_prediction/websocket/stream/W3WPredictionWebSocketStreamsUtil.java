package com.binance.connector.client.w3w_prediction.websocket.stream;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;

public class W3WPredictionWebSocketStreamsUtil {
    private static final String BASE_URL = "wss://api.binance.com/sapi/wss";
    private static final boolean HAS_TIME_UNIT = false;

    public static WebSocketClientConfiguration getClientConfiguration() {
        return getClientConfiguration("");
    }

    public static WebSocketClientConfiguration getClientConfiguration(String path) {
        WebSocketClientConfiguration clientConfiguration = new WebSocketClientConfiguration();
        if (!HAS_TIME_UNIT) {
            clientConfiguration.setTimeUnit(null);
        }
        clientConfiguration.setAutoLogon(false);
        return clientConfiguration;
    }

    public static WebSocketClientConfiguration getClientConfiguration(
            SignatureConfiguration signatureConfiguration) {
        WebSocketClientConfiguration clientConfiguration = getClientConfiguration();
        clientConfiguration.setSignatureConfiguration(signatureConfiguration);
        clientConfiguration.setUrl(getBaseUrl());
        clientConfiguration.setPingIntervalTime(30000L);
        return clientConfiguration;
    }

    public static String getBaseUrl() {
        return BASE_URL;
    }
}
