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
     * Query order (USER_DATA)
     *
     * <p>Check execution status of an order. Weight(IP): 4 Security Type: USER_DATA Notes: **Data
     * Source:** Memory &#x3D;&gt; Database Notes: * If both &#x60;orderId&#x60; and
     * &#x60;origClientOrderId&#x60; are provided, the &#x60;orderId&#x60; is searched first, then
     * the &#x60;origClientOrderId&#x60; from that result is checked against that order. If both
     * conditions are not met the request will be rejected. * For some historical orders the
     * &#x60;cummulativeQuoteQty&#x60; response field may be negative, meaning the data is not
     * available at this time.
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
     * Query order (USER_DATA)
     *
     * <p>Check execution status of an order. Weight(IP): 4 Security Type: USER_DATA Notes: **Data
     * Source:** Memory &#x3D;&gt; Database Notes: * If both &#x60;orderId&#x60; and
     * &#x60;origClientOrderId&#x60; are provided, the &#x60;orderId&#x60; is searched first, then
     * the &#x60;origClientOrderId&#x60; from that result is checked against that order. If both
     * conditions are not met the request will be rejected. * For some historical orders the
     * &#x60;cummulativeQuoteQty&#x60; response field may be negative, meaning the data is not
     * available at this time.
     */
    public void orderStatusExampleSync() {
        OrderStatusRequest orderStatusRequest = new OrderStatusRequest();
        orderStatusRequest.symbol("BNBUSDT");
        CompletableFuture<OrderStatusResponse> future = getApi().orderStatus(orderStatusRequest);
        OrderStatusResponse response = future.join();
        System.out.println(response);
    }
}
