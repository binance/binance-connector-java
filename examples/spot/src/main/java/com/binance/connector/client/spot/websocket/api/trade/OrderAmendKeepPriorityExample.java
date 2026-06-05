package com.binance.connector.client.spot.websocket.api.trade;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.OrderAmendKeepPriorityRequest;
import com.binance.connector.client.spot.websocket.api.model.OrderAmendKeepPriorityResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for TradeApi */
public class OrderAmendKeepPriorityExample {
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
     * WebSocket Order Amend Keep Priority
     *
     * <p>Reduce the quantity of an existing open order. This adds 0 orders to the
     * &#x60;EXCHANGE_MAX_ORDERS&#x60; filter and the &#x60;MAX_NUM_ORDERS&#x60; filter. Read [Order
     * Amend Keep Priority FAQ](faqs/order_amend_keep_priority.md) to learn more. Weight: 4
     */
    public void orderAmendKeepPriorityExampleAsync() {
        OrderAmendKeepPriorityRequest orderAmendKeepPriorityRequest =
                new OrderAmendKeepPriorityRequest();
        orderAmendKeepPriorityRequest.symbol("BNBUSDT");
        orderAmendKeepPriorityRequest.newQty(1.0d);
        CompletableFuture<OrderAmendKeepPriorityResponse> future =
                getApi().orderAmendKeepPriority(orderAmendKeepPriorityRequest);
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
     * WebSocket Order Amend Keep Priority
     *
     * <p>Reduce the quantity of an existing open order. This adds 0 orders to the
     * &#x60;EXCHANGE_MAX_ORDERS&#x60; filter and the &#x60;MAX_NUM_ORDERS&#x60; filter. Read [Order
     * Amend Keep Priority FAQ](faqs/order_amend_keep_priority.md) to learn more. Weight: 4
     */
    public void orderAmendKeepPriorityExampleSync() {
        OrderAmendKeepPriorityRequest orderAmendKeepPriorityRequest =
                new OrderAmendKeepPriorityRequest();
        orderAmendKeepPriorityRequest.symbol("BNBUSDT");
        orderAmendKeepPriorityRequest.newQty(1.0d);
        CompletableFuture<OrderAmendKeepPriorityResponse> future =
                getApi().orderAmendKeepPriority(orderAmendKeepPriorityRequest);
        OrderAmendKeepPriorityResponse response = future.join();
        System.out.println(response);
    }
}
