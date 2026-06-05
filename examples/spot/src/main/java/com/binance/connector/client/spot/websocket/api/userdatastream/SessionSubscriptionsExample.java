package com.binance.connector.client.spot.websocket.api.userdatastream;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.SessionSubscriptionsResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for UserDataStreamApi */
public class SessionSubscriptionsExample {
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
     * WebSocket Listing all subscriptions
     *
     * <p>Weight: 2 **Data Source**: Memory
     */
    public void sessionSubscriptionsExampleAsync() {
        CompletableFuture<SessionSubscriptionsResponse> future = getApi().sessionSubscriptions();
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
     * WebSocket Listing all subscriptions
     *
     * <p>Weight: 2 **Data Source**: Memory
     */
    public void sessionSubscriptionsExampleSync() {
        CompletableFuture<SessionSubscriptionsResponse> future = getApi().sessionSubscriptions();
        SessionSubscriptionsResponse response = future.join();
        System.out.println(response);
    }
}
