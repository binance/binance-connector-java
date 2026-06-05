package com.binance.connector.client.spot.websocket.api.auth;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.SessionStatusResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for AuthApi */
public class SessionStatusExample {
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
     * WebSocket Query session status
     *
     * <p>Query the status of the WebSocket connection, inspecting which API key (if any) is used to
     * authorize requests. Weight: 2
     */
    public void sessionStatusExampleAsync() {
        CompletableFuture<SessionStatusResponse> future = getApi().sessionStatus();
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
     * WebSocket Query session status
     *
     * <p>Query the status of the WebSocket connection, inspecting which API key (if any) is used to
     * authorize requests. Weight: 2
     */
    public void sessionStatusExampleSync() {
        CompletableFuture<SessionStatusResponse> future = getApi().sessionStatus();
        SessionStatusResponse response = future.join();
        System.out.println(response);
    }
}
