package com.binance.connector.client.spot.websocket.api.account;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.AccountRateLimitsOrdersRequest;
import com.binance.connector.client.spot.websocket.api.model.AccountRateLimitsOrdersResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for AccountApi */
public class AccountRateLimitsOrdersExample {
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
     * WebSocket Unfilled Order Count
     *
     * <p>Query your current unfilled order count for all intervals. Weight: 40
     */
    public void accountRateLimitsOrdersExampleAsync() {
        AccountRateLimitsOrdersRequest accountRateLimitsOrdersRequest =
                new AccountRateLimitsOrdersRequest();
        CompletableFuture<AccountRateLimitsOrdersResponse> future =
                getApi().accountRateLimitsOrders(accountRateLimitsOrdersRequest);
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
     * WebSocket Unfilled Order Count
     *
     * <p>Query your current unfilled order count for all intervals. Weight: 40
     */
    public void accountRateLimitsOrdersExampleSync() {
        AccountRateLimitsOrdersRequest accountRateLimitsOrdersRequest =
                new AccountRateLimitsOrdersRequest();
        CompletableFuture<AccountRateLimitsOrdersResponse> future =
                getApi().accountRateLimitsOrders(accountRateLimitsOrdersRequest);
        AccountRateLimitsOrdersResponse response = future.join();
        System.out.println(response);
    }
}
