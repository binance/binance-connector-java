package com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.account;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.DerivativesTradingUsdsFuturesWebSocketApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.api.DerivativesTradingUsdsFuturesWebSocketApi;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.FuturesAccountBalanceRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.FuturesAccountBalanceResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for AccountApi */
public class FuturesAccountBalanceExample {
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
     * Futures Account Balance(USER_DATA)
     *
     * <p>Query account balance info Weight: 5
     */
    public void futuresAccountBalanceExampleAsync() {
        FuturesAccountBalanceRequest futuresAccountBalanceRequest =
                new FuturesAccountBalanceRequest();
        CompletableFuture<FuturesAccountBalanceResponse> future =
                getApi().futuresAccountBalance(futuresAccountBalanceRequest);
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
     * Futures Account Balance(USER_DATA)
     *
     * <p>Query account balance info Weight: 5
     */
    public void futuresAccountBalanceExampleSync() {
        FuturesAccountBalanceRequest futuresAccountBalanceRequest =
                new FuturesAccountBalanceRequest();
        CompletableFuture<FuturesAccountBalanceResponse> future =
                getApi().futuresAccountBalance(futuresAccountBalanceRequest);
        FuturesAccountBalanceResponse response = future.join();
        System.out.println(response);
    }
}
