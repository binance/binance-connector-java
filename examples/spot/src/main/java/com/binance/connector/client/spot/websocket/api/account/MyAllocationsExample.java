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
     * Account allocations (USER_DATA)
     *
     * <p>Retrieves allocations resulting from SOR order placement. Weight(IP): 20 Security Type:
     * USER_DATA Notes: **Data Source:** Database Supported parameter combinations: Parameters |
     * Response | ------------------------------------------- | -------- | &#x60;symbol&#x60; |
     * allocations from oldest to newest | &#x60;symbol&#x60; + &#x60;startTime&#x60; | oldest
     * allocations since &#x60;startTime&#x60; | &#x60;symbol&#x60; + &#x60;endTime&#x60; | newest
     * allocations until &#x60;endTime&#x60; | &#x60;symbol&#x60; + &#x60;startTime&#x60; +
     * &#x60;endTime&#x60; | allocations within the time range | &#x60;symbol&#x60; +
     * &#x60;fromAllocationId&#x60; | allocations by allocation ID | &#x60;symbol&#x60; +
     * &#x60;orderId&#x60; | allocations related to an order starting with oldest |
     * &#x60;symbol&#x60; + &#x60;orderId&#x60; + &#x60;fromAllocationId&#x60; | allocations related
     * to an order by allocation ID | **Note:** The time between &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; can&#39;t be longer than 24 hours.
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
     * Account allocations (USER_DATA)
     *
     * <p>Retrieves allocations resulting from SOR order placement. Weight(IP): 20 Security Type:
     * USER_DATA Notes: **Data Source:** Database Supported parameter combinations: Parameters |
     * Response | ------------------------------------------- | -------- | &#x60;symbol&#x60; |
     * allocations from oldest to newest | &#x60;symbol&#x60; + &#x60;startTime&#x60; | oldest
     * allocations since &#x60;startTime&#x60; | &#x60;symbol&#x60; + &#x60;endTime&#x60; | newest
     * allocations until &#x60;endTime&#x60; | &#x60;symbol&#x60; + &#x60;startTime&#x60; +
     * &#x60;endTime&#x60; | allocations within the time range | &#x60;symbol&#x60; +
     * &#x60;fromAllocationId&#x60; | allocations by allocation ID | &#x60;symbol&#x60; +
     * &#x60;orderId&#x60; | allocations related to an order starting with oldest |
     * &#x60;symbol&#x60; + &#x60;orderId&#x60; + &#x60;fromAllocationId&#x60; | allocations related
     * to an order by allocation ID | **Note:** The time between &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; can&#39;t be longer than 24 hours.
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
