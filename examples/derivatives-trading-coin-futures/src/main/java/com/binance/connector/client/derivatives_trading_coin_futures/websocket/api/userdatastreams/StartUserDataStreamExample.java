package com.binance.connector.client.derivatives_trading_coin_futures.websocket.api.userdatastreams;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.api.DerivativesTradingCoinFuturesWebSocketApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.api.api.DerivativesTradingCoinFuturesWebSocketApi;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.api.model.StartUserDataStreamRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.api.model.StartUserDataStreamResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for UserDataStreamsApi */
public class StartUserDataStreamExample {
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
     * Start User Data Stream (USER_STREAM)
     *
     * <p>Start a new user data stream. The stream will close after 60 minutes unless a keepalive is
     * sent. If the account has an active &#x60;listenKey&#x60;, that &#x60;listenKey&#x60; will be
     * returned and its validity will be extended for 60 minutes. Weight: 1
     */
    public void startUserDataStreamExampleAsync() {
        StartUserDataStreamRequest startUserDataStreamRequest = new StartUserDataStreamRequest();
        CompletableFuture<StartUserDataStreamResponse> future =
                getApi().startUserDataStream(startUserDataStreamRequest);
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
     * Start User Data Stream (USER_STREAM)
     *
     * <p>Start a new user data stream. The stream will close after 60 minutes unless a keepalive is
     * sent. If the account has an active &#x60;listenKey&#x60;, that &#x60;listenKey&#x60; will be
     * returned and its validity will be extended for 60 minutes. Weight: 1
     */
    public void startUserDataStreamExampleSync() {
        StartUserDataStreamRequest startUserDataStreamRequest = new StartUserDataStreamRequest();
        CompletableFuture<StartUserDataStreamResponse> future =
                getApi().startUserDataStream(startUserDataStreamRequest);
        StartUserDataStreamResponse response = future.join();
        System.out.println(response);
    }
}
