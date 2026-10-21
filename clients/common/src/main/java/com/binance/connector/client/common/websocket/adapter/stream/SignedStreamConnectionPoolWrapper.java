package com.binance.connector.client.common.websocket.adapter.stream;

import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.google.gson.Gson;

public class SignedStreamConnectionPoolWrapper extends StreamConnectionPoolWrapper {
    public SignedStreamConnectionPoolWrapper(WebSocketClientConfiguration clientConfiguration) {
        super(clientConfiguration);
    }

    public SignedStreamConnectionPoolWrapper(WebSocketClientConfiguration clientConfiguration, Gson gson) {
        super(clientConfiguration, gson);
    }

    @Override
    protected void initConnectionPool(WebSocketClientConfiguration clientConfiguration, Gson gson) {
        Integer poolSize = clientConfiguration.getPoolSize();
        for (int i = 0; i < poolSize; i++) {
            SignedStreamConnectionWrapper connectionWrapper =
                    new SignedStreamConnectionWrapper(clientConfiguration, gson);
            getConnectionList().add(connectionWrapper);
        }
    }
}
