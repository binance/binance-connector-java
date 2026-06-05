package com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.account;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.DerivativesTradingUsdsFuturesWebSocketApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.api.DerivativesTradingUsdsFuturesWebSocketApi;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.AccountInformationV2Request;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.AccountInformationV2Response;
import java.util.concurrent.CompletableFuture;

/** API examples for AccountApi */
public class AccountInformationV2Example {
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
     * Account Information V2(USER_DATA)
     *
     * <p>Get current account information. User in single-asset/ multi-assets mode will see
     * different value, see comments in response section for detail. Weight: 5
     */
    public void accountInformationV2ExampleAsync() {
        AccountInformationV2Request accountInformationV2Request = new AccountInformationV2Request();
        CompletableFuture<AccountInformationV2Response> future =
                getApi().accountInformationV2(accountInformationV2Request);
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
     * Account Information V2(USER_DATA)
     *
     * <p>Get current account information. User in single-asset/ multi-assets mode will see
     * different value, see comments in response section for detail. Weight: 5
     */
    public void accountInformationV2ExampleSync() {
        AccountInformationV2Request accountInformationV2Request = new AccountInformationV2Request();
        CompletableFuture<AccountInformationV2Response> future =
                getApi().accountInformationV2(accountInformationV2Request);
        AccountInformationV2Response response = future.join();
        System.out.println(response);
    }
}
