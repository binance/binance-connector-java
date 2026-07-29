package com.binance.connector.client.spot.websocket.api.account;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.AllOrderListsRequest;
import com.binance.connector.client.spot.websocket.api.model.AllOrderListsResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for AccountApi */
public class AllOrderListsExample {
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
     * Account order list history (USER_DATA)
     *
     * <p>Query information about all your order lists, filtered by time range. Weight(IP): 20
     * Security Type: USER_DATA Notes: **Data Source:** Database Notes: * If &#x60;startTime&#x60;
     * and/or &#x60;endTime&#x60; are specified, &#x60;fromId&#x60; is ignored. Order lists are
     * filtered by &#x60;transactionTime&#x60; of the last order list execution status update. * If
     * &#x60;fromId&#x60; is specified, return order lists with order list ID &gt;&#x3D;
     * &#x60;fromId&#x60;. * If no condition is specified, the most recent order lists are returned.
     * * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; can&#39;t be longer than 24
     * hours.
     */
    public void allOrderListsExampleAsync() {
        AllOrderListsRequest allOrderListsRequest = new AllOrderListsRequest();
        CompletableFuture<AllOrderListsResponse> future =
                getApi().allOrderLists(allOrderListsRequest);
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
     * Account order list history (USER_DATA)
     *
     * <p>Query information about all your order lists, filtered by time range. Weight(IP): 20
     * Security Type: USER_DATA Notes: **Data Source:** Database Notes: * If &#x60;startTime&#x60;
     * and/or &#x60;endTime&#x60; are specified, &#x60;fromId&#x60; is ignored. Order lists are
     * filtered by &#x60;transactionTime&#x60; of the last order list execution status update. * If
     * &#x60;fromId&#x60; is specified, return order lists with order list ID &gt;&#x3D;
     * &#x60;fromId&#x60;. * If no condition is specified, the most recent order lists are returned.
     * * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; can&#39;t be longer than 24
     * hours.
     */
    public void allOrderListsExampleSync() {
        AllOrderListsRequest allOrderListsRequest = new AllOrderListsRequest();
        CompletableFuture<AllOrderListsResponse> future =
                getApi().allOrderLists(allOrderListsRequest);
        AllOrderListsResponse response = future.join();
        System.out.println(response);
    }
}
