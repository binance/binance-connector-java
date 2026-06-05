package com.binance.connector.client.spot.websocket.api.market;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.ReferencePriceRequest;
import com.binance.connector.client.spot.websocket.api.model.ReferencePriceResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for MarketApi */
public class ReferencePriceExample {
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
     * WebSocket Query Reference Price
     *
     * <p>Weight: 2
     */
    public void referencePriceExampleAsync() {
        ReferencePriceRequest referencePriceRequest = new ReferencePriceRequest();
        referencePriceRequest.symbol("BNBUSDT");
        CompletableFuture<ReferencePriceResponse> future =
                getApi().referencePrice(referencePriceRequest);
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
     * WebSocket Query Reference Price
     *
     * <p>Weight: 2
     */
    public void referencePriceExampleSync() {
        ReferencePriceRequest referencePriceRequest = new ReferencePriceRequest();
        referencePriceRequest.symbol("BNBUSDT");
        CompletableFuture<ReferencePriceResponse> future =
                getApi().referencePrice(referencePriceRequest);
        ReferencePriceResponse response = future.join();
        System.out.println(response);
    }
}
