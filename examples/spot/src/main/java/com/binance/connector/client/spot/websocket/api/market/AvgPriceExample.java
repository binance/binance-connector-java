package com.binance.connector.client.spot.websocket.api.market;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.AvgPriceRequest;
import com.binance.connector.client.spot.websocket.api.model.AvgPriceResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for MarketApi */
public class AvgPriceExample {
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
     * WebSocket Current average price
     *
     * <p>Get current average price for a symbol. Weight: 2
     */
    public void avgPriceExampleAsync() {
        AvgPriceRequest avgPriceRequest = new AvgPriceRequest();
        avgPriceRequest.symbol("BNBUSDT");
        CompletableFuture<AvgPriceResponse> future = getApi().avgPrice(avgPriceRequest);
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
     * WebSocket Current average price
     *
     * <p>Get current average price for a symbol. Weight: 2
     */
    public void avgPriceExampleSync() {
        AvgPriceRequest avgPriceRequest = new AvgPriceRequest();
        avgPriceRequest.symbol("BNBUSDT");
        CompletableFuture<AvgPriceResponse> future = getApi().avgPrice(avgPriceRequest);
        AvgPriceResponse response = future.join();
        System.out.println(response);
    }
}
