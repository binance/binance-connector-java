package com.binance.connector.client.spot.websocket.api.trade;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.OrderListCancelRequest;
import com.binance.connector.client.spot.websocket.api.model.OrderListCancelResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for TradeApi */
public class OrderListCancelExample {
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
     * Cancel Order list (TRADE)
     *
     * <p>Cancel an active order list. Weight(IP): 1 Security Type: TRADE Notes: **Data Source:**
     * Matching Engine Notes: * If both &#x60;orderListId&#x60; and &#x60;listClientOrderId&#x60;
     * parameters are provided, the &#x60;orderListId&#x60; is searched first, then the
     * &#x60;listClientOrderId&#x60; from that result is checked against that order. If both
     * conditions are not met the request will be rejected. * Canceling an individual order with
     * [&#x60;order.cancel&#x60;](#order-cancel) will cancel the entire order list as well.
     */
    public void orderListCancelExampleAsync() {
        OrderListCancelRequest orderListCancelRequest = new OrderListCancelRequest();
        orderListCancelRequest.symbol("BNBUSDT");
        CompletableFuture<OrderListCancelResponse> future =
                getApi().orderListCancel(orderListCancelRequest);
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
     * Cancel Order list (TRADE)
     *
     * <p>Cancel an active order list. Weight(IP): 1 Security Type: TRADE Notes: **Data Source:**
     * Matching Engine Notes: * If both &#x60;orderListId&#x60; and &#x60;listClientOrderId&#x60;
     * parameters are provided, the &#x60;orderListId&#x60; is searched first, then the
     * &#x60;listClientOrderId&#x60; from that result is checked against that order. If both
     * conditions are not met the request will be rejected. * Canceling an individual order with
     * [&#x60;order.cancel&#x60;](#order-cancel) will cancel the entire order list as well.
     */
    public void orderListCancelExampleSync() {
        OrderListCancelRequest orderListCancelRequest = new OrderListCancelRequest();
        orderListCancelRequest.symbol("BNBUSDT");
        CompletableFuture<OrderListCancelResponse> future =
                getApi().orderListCancel(orderListCancelRequest);
        OrderListCancelResponse response = future.join();
        System.out.println(response);
    }
}
