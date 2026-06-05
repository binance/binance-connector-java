package com.binance.connector.client.spot.websocket.api.account;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.OrderStatusRequest;
import com.binance.connector.client.spot.websocket.api.model.OrderStatusResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for AccountApi */
public class OrderStatusExample {
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
     * WebSocket Query order
     *
     * <p>Check execution status of an order. Weight: 4
     */
    public void orderStatusExampleAsync() {
        OrderStatusRequest orderStatusRequest = new OrderStatusRequest();
        orderStatusRequest.symbol("BNBUSDT");
        CompletableFuture<OrderStatusResponse> future = getApi().orderStatus(orderStatusRequest);
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
     * WebSocket Query order
     *
     * <p>Check execution status of an order. Weight: 4
     */
    public void orderStatusExampleSync() {
        OrderStatusRequest orderStatusRequest = new OrderStatusRequest();
        orderStatusRequest.symbol("BNBUSDT");
        CompletableFuture<OrderStatusResponse> future = getApi().orderStatus(orderStatusRequest);
        OrderStatusResponse response = future.join();
        System.out.println(response);
    }
}
