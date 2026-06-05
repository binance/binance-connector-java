package com.binance.connector.client.spot.websocket.api.general;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.TimeResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for GeneralApi */
public class TimeExample {
    private SpotWebSocketApi api;

    public SpotWebSocketApi getApi() {
        if (api == null) {
            WebSocketClientConfiguration clientConfiguration =
                    SpotWebSocketApiUtil.getClientConfiguration();
            // if you want the connection to be auto logged on:
            // https://developers.binance.com/docs/binance-spot-api-docs/websocket-api/authentication-requests
            clientConfiguration.setAutoLogon(true);
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("/path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new SpotWebSocketApi(clientConfiguration);
        }
        return api;
    }

    /**
     * WebSocket Check server time
     *
     * <p>Test connectivity to the WebSocket API and get the current server time. Weight: 1
     */
    public void timeExampleAsync() {
        CompletableFuture<TimeResponse> future = getApi().time();
        future.handle(
                (response, error) -> {
                    if (error != null) {
                        System.err.println(error);
                    }
                    System.out.println(response);
                    return response;
                });
    }

    /**
     * WebSocket Check server time
     *
     * <p>Test connectivity to the WebSocket API and get the current server time. Weight: 1
     */
    public void timeExampleSync() {
        CompletableFuture<TimeResponse> future = getApi().time();
        TimeResponse response = future.join();
        System.out.println(response);
    }
}
