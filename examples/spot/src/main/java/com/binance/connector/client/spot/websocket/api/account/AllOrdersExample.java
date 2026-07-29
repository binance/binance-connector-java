package com.binance.connector.client.spot.websocket.api.account;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.AllOrdersRequest;
import com.binance.connector.client.spot.websocket.api.model.AllOrdersResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for AccountApi */
public class AllOrdersExample {
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
     * Account order history (USER_DATA)
     *
     * <p>Query information about all your orders – active, canceled, filled – filtered by time
     * range. Weight(IP): 20 Security Type: USER_DATA Notes: **Data Source:** Database Notes: * If
     * &#x60;startTime&#x60; and/or &#x60;endTime&#x60; are specified, &#x60;orderId&#x60; is
     * ignored. Orders are filtered by &#x60;time&#x60; of the last execution status update. * If
     * &#x60;orderId&#x60; is specified, return orders with order ID &gt;&#x3D; &#x60;orderId&#x60;.
     * * If no condition is specified, the most recent orders are returned. * For some historical
     * orders the &#x60;cummulativeQuoteQty&#x60; response field may be negative, meaning the data
     * is not available at this time. * The time between &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; can&#39;t be longer than 24 hours.
     */
    public void allOrdersExampleAsync() {
        AllOrdersRequest allOrdersRequest = new AllOrdersRequest();
        allOrdersRequest.symbol("BNBUSDT");
        CompletableFuture<AllOrdersResponse> future = getApi().allOrders(allOrdersRequest);
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
     * Account order history (USER_DATA)
     *
     * <p>Query information about all your orders – active, canceled, filled – filtered by time
     * range. Weight(IP): 20 Security Type: USER_DATA Notes: **Data Source:** Database Notes: * If
     * &#x60;startTime&#x60; and/or &#x60;endTime&#x60; are specified, &#x60;orderId&#x60; is
     * ignored. Orders are filtered by &#x60;time&#x60; of the last execution status update. * If
     * &#x60;orderId&#x60; is specified, return orders with order ID &gt;&#x3D; &#x60;orderId&#x60;.
     * * If no condition is specified, the most recent orders are returned. * For some historical
     * orders the &#x60;cummulativeQuoteQty&#x60; response field may be negative, meaning the data
     * is not available at this time. * The time between &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; can&#39;t be longer than 24 hours.
     */
    public void allOrdersExampleSync() {
        AllOrdersRequest allOrdersRequest = new AllOrdersRequest();
        allOrdersRequest.symbol("BNBUSDT");
        CompletableFuture<AllOrdersResponse> future = getApi().allOrders(allOrdersRequest);
        AllOrdersResponse response = future.join();
        System.out.println(response);
    }
}
