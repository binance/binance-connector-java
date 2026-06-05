package com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.trade;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.DerivativesTradingUsdsFuturesWebSocketApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.api.DerivativesTradingUsdsFuturesWebSocketApi;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.PositionInformationV2Request;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.PositionInformationV2Response;
import java.util.concurrent.CompletableFuture;

/** API examples for TradeApi */
public class PositionInformationV2Example {
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
     * Position Information V2 (USER_DATA)
     *
     * <p>Get current position information(only symbol that has position or open orders will be
     * returned). * Please use with user data stream &#x60;ACCOUNT_UPDATE&#x60; to meet your
     * timeliness and accuracy needs. Weight: 5
     */
    public void positionInformationV2ExampleAsync() {
        PositionInformationV2Request positionInformationV2Request =
                new PositionInformationV2Request();
        CompletableFuture<PositionInformationV2Response> future =
                getApi().positionInformationV2(positionInformationV2Request);
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
     * Position Information V2 (USER_DATA)
     *
     * <p>Get current position information(only symbol that has position or open orders will be
     * returned). * Please use with user data stream &#x60;ACCOUNT_UPDATE&#x60; to meet your
     * timeliness and accuracy needs. Weight: 5
     */
    public void positionInformationV2ExampleSync() {
        PositionInformationV2Request positionInformationV2Request =
                new PositionInformationV2Request();
        CompletableFuture<PositionInformationV2Response> future =
                getApi().positionInformationV2(positionInformationV2Request);
        PositionInformationV2Response response = future.join();
        System.out.println(response);
    }
}
