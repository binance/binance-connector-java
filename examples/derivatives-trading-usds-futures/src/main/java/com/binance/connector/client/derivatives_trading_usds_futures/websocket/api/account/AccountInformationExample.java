package com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.account;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.DerivativesTradingUsdsFuturesWebSocketApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.api.DerivativesTradingUsdsFuturesWebSocketApi;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.AccountInformationRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.AccountInformationResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for AccountApi */
public class AccountInformationExample {
    private DerivativesTradingUsdsFuturesWebSocketApi api;

    public DerivativesTradingUsdsFuturesWebSocketApi getApi() {
        if (api == null) {
            WebSocketClientConfiguration clientConfiguration =
                    DerivativesTradingUsdsFuturesWebSocketApiUtil.getClientConfiguration();
            // if you want the connection to be auto logged on:
            // https://developers.binance.com/docs/binance-spot-api-docs/websocket-api/authentication-requests
            clientConfiguration.setAutoLogon(true);
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("/path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingUsdsFuturesWebSocketApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Account Information(USER_DATA)
     *
     * <p>Get current account information. User in single-asset/ multi-assets mode will see
     * different value, see comments in response section for detail. Weight: 5
     */
    public void accountInformationExampleAsync() {
        AccountInformationRequest accountInformationRequest = new AccountInformationRequest();
        CompletableFuture<AccountInformationResponse> future =
                getApi().accountInformation(accountInformationRequest);
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
     * Account Information(USER_DATA)
     *
     * <p>Get current account information. User in single-asset/ multi-assets mode will see
     * different value, see comments in response section for detail. Weight: 5
     */
    public void accountInformationExampleSync() {
        AccountInformationRequest accountInformationRequest = new AccountInformationRequest();
        CompletableFuture<AccountInformationResponse> future =
                getApi().accountInformation(accountInformationRequest);
        AccountInformationResponse response = future.join();
        System.out.println(response);
    }
}
