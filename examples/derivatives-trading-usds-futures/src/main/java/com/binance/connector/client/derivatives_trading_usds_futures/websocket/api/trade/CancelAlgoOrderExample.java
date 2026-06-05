package com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.trade;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.DerivativesTradingUsdsFuturesWebSocketApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.api.DerivativesTradingUsdsFuturesWebSocketApi;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.CancelAlgoOrderRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.CancelAlgoOrderResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for TradeApi */
public class CancelAlgoOrderExample {
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
     * Cancel Algo Order (TRADE)
     *
     * <p>Cancel an active algo order. * Either &#x60;algoId&#x60; or &#x60;clientAlgoId&#x60; must
     * be sent. Weight: 1
     */
    public void cancelAlgoOrderExampleAsync() {
        CancelAlgoOrderRequest cancelAlgoOrderRequest = new CancelAlgoOrderRequest();
        CompletableFuture<CancelAlgoOrderResponse> future =
                getApi().cancelAlgoOrder(cancelAlgoOrderRequest);
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
     * Cancel Algo Order (TRADE)
     *
     * <p>Cancel an active algo order. * Either &#x60;algoId&#x60; or &#x60;clientAlgoId&#x60; must
     * be sent. Weight: 1
     */
    public void cancelAlgoOrderExampleSync() {
        CancelAlgoOrderRequest cancelAlgoOrderRequest = new CancelAlgoOrderRequest();
        CompletableFuture<CancelAlgoOrderResponse> future =
                getApi().cancelAlgoOrder(cancelAlgoOrderRequest);
        CancelAlgoOrderResponse response = future.join();
        System.out.println(response);
    }
}
