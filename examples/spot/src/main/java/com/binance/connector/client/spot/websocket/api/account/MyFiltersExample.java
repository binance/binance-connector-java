package com.binance.connector.client.spot.websocket.api.account;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.MyFiltersRequest;
import com.binance.connector.client.spot.websocket.api.model.MyFiltersResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for AccountApi */
public class MyFiltersExample {
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
     * WebSocket Query Relevant Filters
     *
     * <p>Retrieves the list of [filters](filters.md) relevant to an account on a given symbol. This
     * is the only method that shows if an account has &#x60;MAX_ASSET&#x60; filters applied to it.
     * Weight: 40
     */
    public void myFiltersExampleAsync() {
        MyFiltersRequest myFiltersRequest = new MyFiltersRequest();
        myFiltersRequest.symbol("BNBUSDT");
        CompletableFuture<MyFiltersResponse> future = getApi().myFilters(myFiltersRequest);
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
     * WebSocket Query Relevant Filters
     *
     * <p>Retrieves the list of [filters](filters.md) relevant to an account on a given symbol. This
     * is the only method that shows if an account has &#x60;MAX_ASSET&#x60; filters applied to it.
     * Weight: 40
     */
    public void myFiltersExampleSync() {
        MyFiltersRequest myFiltersRequest = new MyFiltersRequest();
        myFiltersRequest.symbol("BNBUSDT");
        CompletableFuture<MyFiltersResponse> future = getApi().myFilters(myFiltersRequest);
        MyFiltersResponse response = future.join();
        System.out.println(response);
    }
}
