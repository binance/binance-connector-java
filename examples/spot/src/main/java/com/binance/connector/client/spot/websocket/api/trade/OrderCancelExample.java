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
     * Cancel order (TRADE)
     *
     * <p>Cancel an active order. Weight(IP): 1 Security Type: TRADE Notes: **Data Source:**
     * Matching Engine Notes: * If both &#x60;orderId&#x60; and &#x60;origClientOrderId&#x60;
     * parameters are provided, the &#x60;orderId&#x60; is searched first, then the
     * &#x60;origClientOrderId&#x60; from that result is checked against that order. If both
     * conditions are not met the request will be rejected. * &#x60;newClientOrderId&#x60; will
     * replace &#x60;clientOrderId&#x60; of the canceled order, freeing it up for new orders. * If
     * you cancel an order that is a part of an order list, the entire order list is canceled. * The
     * performance for canceling an order (single cancel or as part of a cancel-replace) is always
     * better when only &#x60;orderId&#x60; is sent. Sending &#x60;origClientOrderId&#x60; or both
     * &#x60;orderId&#x60; + &#x60;origClientOrderId&#x60; will be slower.
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
     * Cancel order (TRADE)
     *
     * <p>Cancel an active order. Weight(IP): 1 Security Type: TRADE Notes: **Data Source:**
     * Matching Engine Notes: * If both &#x60;orderId&#x60; and &#x60;origClientOrderId&#x60;
     * parameters are provided, the &#x60;orderId&#x60; is searched first, then the
     * &#x60;origClientOrderId&#x60; from that result is checked against that order. If both
     * conditions are not met the request will be rejected. * &#x60;newClientOrderId&#x60; will
     * replace &#x60;clientOrderId&#x60; of the canceled order, freeing it up for new orders. * If
     * you cancel an order that is a part of an order list, the entire order list is canceled. * The
     * performance for canceling an order (single cancel or as part of a cancel-replace) is always
     * better when only &#x60;orderId&#x60; is sent. Sending &#x60;origClientOrderId&#x60; or both
     * &#x60;orderId&#x60; + &#x60;origClientOrderId&#x60; will be slower.
     */
    public void orderCancelExampleSync() {
        OrderCancelRequest orderCancelRequest = new OrderCancelRequest();
        orderCancelRequest.symbol("BNBUSDT");
        CompletableFuture<OrderCancelResponse> future = getApi().orderCancel(orderCancelRequest);
        OrderCancelResponse response = future.join();
        System.out.println(response);
    }
}
