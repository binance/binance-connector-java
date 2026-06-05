package com.binance.connector.client.spot.websocket.api.account;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.AccountCommissionRequest;
import com.binance.connector.client.spot.websocket.api.model.AccountCommissionResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for AccountApi */
public class AccountCommissionExample {
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
     * WebSocket Account Commission Rates
     *
     * <p>Get current account commission rates. Weight: 20
     */
    public void accountCommissionExampleAsync() {
        AccountCommissionRequest accountCommissionRequest = new AccountCommissionRequest();
        accountCommissionRequest.symbol("BNBUSDT");
        CompletableFuture<AccountCommissionResponse> future =
                getApi().accountCommission(accountCommissionRequest);
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
     * WebSocket Account Commission Rates
     *
     * <p>Get current account commission rates. Weight: 20
     */
    public void accountCommissionExampleSync() {
        AccountCommissionRequest accountCommissionRequest = new AccountCommissionRequest();
        accountCommissionRequest.symbol("BNBUSDT");
        CompletableFuture<AccountCommissionResponse> future =
                getApi().accountCommission(accountCommissionRequest);
        AccountCommissionResponse response = future.join();
        System.out.println(response);
    }
}
