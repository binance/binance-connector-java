package com.binance.connector.client.spot.websocket.api.account;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.AccountStatusRequest;
import com.binance.connector.client.spot.websocket.api.model.AccountStatusResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for AccountApi */
public class AccountStatusExample {
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
     * Account information (USER_DATA)
     *
     * <p>Query information about your account. Weight(IP): 20 Security Type: USER_DATA Notes:
     * **Data Source:** Memory &#x3D;&gt; Database
     */
    public void accountStatusExampleAsync() {
        AccountStatusRequest accountStatusRequest = new AccountStatusRequest();
        CompletableFuture<AccountStatusResponse> future =
                getApi().accountStatus(accountStatusRequest);
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
     * Account information (USER_DATA)
     *
     * <p>Query information about your account. Weight(IP): 20 Security Type: USER_DATA Notes:
     * **Data Source:** Memory &#x3D;&gt; Database
     */
    public void accountStatusExampleSync() {
        AccountStatusRequest accountStatusRequest = new AccountStatusRequest();
        CompletableFuture<AccountStatusResponse> future =
                getApi().accountStatus(accountStatusRequest);
        AccountStatusResponse response = future.join();
        System.out.println(response);
    }
}
