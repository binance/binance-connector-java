package com.binance.connector.client.spot.websocket.api.account;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.OrderListStatusRequest;
import com.binance.connector.client.spot.websocket.api.model.OrderListStatusResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for AccountApi */
public class OrderListStatusExample {
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
     * Query Order list (USER_DATA)
     *
     * <p>Check execution status of an Order list. For execution status of individual orders, use
     * &#x60;order.status&#x60;. Weight(IP): 4 Security Type: USER_DATA Notes: **Data Source:**
     * Database Notes: * &#x60;origClientOrderId&#x60; refers to &#x60;listClientOrderId&#x60; of
     * the order list itself. * If both &#x60;origClientOrderId&#x60; and &#x60;orderListId&#x60;
     * parameters are specified, only &#x60;origClientOrderId&#x60; is used and
     * &#x60;orderListId&#x60; is ignored.
     */
    public void orderListStatusExampleAsync() {
        OrderListStatusRequest orderListStatusRequest = new OrderListStatusRequest();
        CompletableFuture<OrderListStatusResponse> future =
                getApi().orderListStatus(orderListStatusRequest);
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
     * Query Order list (USER_DATA)
     *
     * <p>Check execution status of an Order list. For execution status of individual orders, use
     * &#x60;order.status&#x60;. Weight(IP): 4 Security Type: USER_DATA Notes: **Data Source:**
     * Database Notes: * &#x60;origClientOrderId&#x60; refers to &#x60;listClientOrderId&#x60; of
     * the order list itself. * If both &#x60;origClientOrderId&#x60; and &#x60;orderListId&#x60;
     * parameters are specified, only &#x60;origClientOrderId&#x60; is used and
     * &#x60;orderListId&#x60; is ignored.
     */
    public void orderListStatusExampleSync() {
        OrderListStatusRequest orderListStatusRequest = new OrderListStatusRequest();
        CompletableFuture<OrderListStatusResponse> future =
                getApi().orderListStatus(orderListStatusRequest);
        OrderListStatusResponse response = future.join();
        System.out.println(response);
    }
}
