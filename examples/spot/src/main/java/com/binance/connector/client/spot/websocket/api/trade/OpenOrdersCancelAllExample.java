package com.binance.connector.client.spot.websocket.api.trade;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.OpenOrdersCancelAllRequest;
import com.binance.connector.client.spot.websocket.api.model.OpenOrdersCancelAllResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for TradeApi */
public class OpenOrdersCancelAllExample {
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
     * Cancel open orders (TRADE)
     *
     * <p>Cancel all open orders on a symbol. This includes orders that are part of an order list.
     * Weight(IP): 1 Security Type: TRADE Notes: **Data Source:** Matching Engine
     */
    public void openOrdersCancelAllExampleAsync() {
        OpenOrdersCancelAllRequest openOrdersCancelAllRequest = new OpenOrdersCancelAllRequest();
        openOrdersCancelAllRequest.symbol("BNBUSDT");
        CompletableFuture<OpenOrdersCancelAllResponse> future =
                getApi().openOrdersCancelAll(openOrdersCancelAllRequest);
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
     * Cancel open orders (TRADE)
     *
     * <p>Cancel all open orders on a symbol. This includes orders that are part of an order list.
     * Weight(IP): 1 Security Type: TRADE Notes: **Data Source:** Matching Engine
     */
    public void openOrdersCancelAllExampleSync() {
        OpenOrdersCancelAllRequest openOrdersCancelAllRequest = new OpenOrdersCancelAllRequest();
        openOrdersCancelAllRequest.symbol("BNBUSDT");
        CompletableFuture<OpenOrdersCancelAllResponse> future =
                getApi().openOrdersCancelAll(openOrdersCancelAllRequest);
        OpenOrdersCancelAllResponse response = future.join();
        System.out.println(response);
    }
}
