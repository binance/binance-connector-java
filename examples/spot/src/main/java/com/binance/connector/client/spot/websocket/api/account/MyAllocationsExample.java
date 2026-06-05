package com.binance.connector.client.spot.websocket.api.account;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.MyAllocationsRequest;
import com.binance.connector.client.spot.websocket.api.model.MyAllocationsResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for AccountApi */
public class MyAllocationsExample {
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
     * WebSocket Account allocations
     *
     * <p>Retrieves allocations resulting from SOR order placement. Weight: 20
     */
    public void myAllocationsExampleAsync() {
        MyAllocationsRequest myAllocationsRequest = new MyAllocationsRequest();
        myAllocationsRequest.symbol("BNBUSDT");
        CompletableFuture<MyAllocationsResponse> future =
                getApi().myAllocations(myAllocationsRequest);
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
     * WebSocket Account allocations
     *
     * <p>Retrieves allocations resulting from SOR order placement. Weight: 20
     */
    public void myAllocationsExampleSync() {
        MyAllocationsRequest myAllocationsRequest = new MyAllocationsRequest();
        myAllocationsRequest.symbol("BNBUSDT");
        CompletableFuture<MyAllocationsResponse> future =
                getApi().myAllocations(myAllocationsRequest);
        MyAllocationsResponse response = future.join();
        System.out.println(response);
    }
}
