package com.binance.connector.client.spot.websocket.api.market;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.TradesRecentRequest;
import com.binance.connector.client.spot.websocket.api.model.TradesRecentResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for MarketApi */
public class TradesRecentExample {
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
     * WebSocket Recent trades
     *
     * <p>Get recent trades. If you need access to real-time trading activity, please consider using
     * WebSocket Streams: * &#x60;&lt;symbol&gt;@trade&#x60; Weight: 25
     */
    public void tradesRecentExampleAsync() {
        TradesRecentRequest tradesRecentRequest = new TradesRecentRequest();
        tradesRecentRequest.symbol("BNBUSDT");
        CompletableFuture<TradesRecentResponse> future = getApi().tradesRecent(tradesRecentRequest);
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
     * WebSocket Recent trades
     *
     * <p>Get recent trades. If you need access to real-time trading activity, please consider using
     * WebSocket Streams: * &#x60;&lt;symbol&gt;@trade&#x60; Weight: 25
     */
    public void tradesRecentExampleSync() {
        TradesRecentRequest tradesRecentRequest = new TradesRecentRequest();
        tradesRecentRequest.symbol("BNBUSDT");
        CompletableFuture<TradesRecentResponse> future = getApi().tradesRecent(tradesRecentRequest);
        TradesRecentResponse response = future.join();
        System.out.println(response);
    }
}
