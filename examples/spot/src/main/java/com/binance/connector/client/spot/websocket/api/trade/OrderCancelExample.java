package com.binance.connector.client.spot.websocket.api.trade;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.OrderCancelRequest;
import com.binance.connector.client.spot.websocket.api.model.OrderCancelResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for TradeApi */
public class OrderCancelExample {
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
     * WebSocket Cancel order
     *
     * <p>Cancel an active order. Weight: 1
     */
    public void orderCancelExampleAsync() {
        OrderCancelRequest orderCancelRequest = new OrderCancelRequest();
        orderCancelRequest.symbol("BNBUSDT");
        CompletableFuture<OrderCancelResponse> future = getApi().orderCancel(orderCancelRequest);
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
     * WebSocket Cancel order
     *
     * <p>Cancel an active order. Weight: 1
     */
    public void orderCancelExampleSync() {
        OrderCancelRequest orderCancelRequest = new OrderCancelRequest();
        orderCancelRequest.symbol("BNBUSDT");
        CompletableFuture<OrderCancelResponse> future = getApi().orderCancel(orderCancelRequest);
        OrderCancelResponse response = future.join();
        System.out.println(response);
    }
}
