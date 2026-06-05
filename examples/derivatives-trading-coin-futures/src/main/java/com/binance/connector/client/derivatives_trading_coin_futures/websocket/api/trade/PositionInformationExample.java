package com.binance.connector.client.derivatives_trading_coin_futures.websocket.api.trade;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.api.DerivativesTradingCoinFuturesWebSocketApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.api.api.DerivativesTradingCoinFuturesWebSocketApi;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.api.model.PositionInformationRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.api.model.PositionInformationResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for TradeApi */
public class PositionInformationExample {
    private DerivativesTradingCoinFuturesWebSocketApi api;

    public DerivativesTradingCoinFuturesWebSocketApi getApi() {
        if (api == null) {
            WebSocketClientConfiguration clientConfiguration =
                    DerivativesTradingCoinFuturesWebSocketApiUtil.getClientConfiguration();
            // if you want the connection to be auto logged on:
            // https://developers.binance.com/docs/binance-spot-api-docs/websocket-api/authentication-requests
            clientConfiguration.setAutoLogon(true);
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("/path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingCoinFuturesWebSocketApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Position Information(USER_DATA)
     *
     * <p>Get current position information. * Please use with user data stream
     * &#x60;ACCOUNT_UPDATE&#x60; to meet your timeliness and accuracy needs. Weight: 5
     */
    public void positionInformationExampleAsync() {
        PositionInformationRequest positionInformationRequest = new PositionInformationRequest();
        CompletableFuture<PositionInformationResponse> future =
                getApi().positionInformation(positionInformationRequest);
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
     * Position Information(USER_DATA)
     *
     * <p>Get current position information. * Please use with user data stream
     * &#x60;ACCOUNT_UPDATE&#x60; to meet your timeliness and accuracy needs. Weight: 5
     */
    public void positionInformationExampleSync() {
        PositionInformationRequest positionInformationRequest = new PositionInformationRequest();
        CompletableFuture<PositionInformationResponse> future =
                getApi().positionInformation(positionInformationRequest);
        PositionInformationResponse response = future.join();
        System.out.println(response);
    }
}
