package com.binance.connector.client.spot.websocket.api.market;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.TradesAggregateRequest;
import com.binance.connector.client.spot.websocket.api.model.TradesAggregateResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for MarketApi */
public class TradesAggregateExample {
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
     * Aggregate trades
     *
     * <p>Get aggregate trades. An *aggregate trade* (aggtrade) represents one or more individual
     * trades. Trades that fill at the same time, from the same taker order, with the same price –
     * those trades are collected into an aggregate trade with total quantity of the individual
     * trades. If you need access to real-time trading activity, please consider using WebSocket
     * Streams: * &#x60;&lt;symbol&gt;@aggTrade&#x60; If you need historical aggregate trade data,
     * please consider using
     * [data.binance.vision](https://github.com/binance/binance-public-data/#aggtrades). Weight(IP):
     * 4 Security Type: NONE Notes: **Data Source:** Database - If &#x60;fromId&#x60; is specified,
     * return aggtrades with aggregate trade ID &gt;&#x3D; &#x60;fromId&#x60;. Use
     * &#x60;fromId&#x60; and &#x60;limit&#x60; to page through all aggtrades. - If
     * &#x60;startTime&#x60; and/or &#x60;endTime&#x60; are specified, aggtrades are filtered by
     * execution time (&#x60;T&#x60;). &#x60;fromId&#x60; cannot be used together with
     * &#x60;startTime&#x60; and &#x60;endTime&#x60;. - If no condition is specified, the most
     * recent aggregate trades are returned.
     */
    public void tradesAggregateExampleAsync() {
        TradesAggregateRequest tradesAggregateRequest = new TradesAggregateRequest();
        tradesAggregateRequest.symbol("BNBUSDT");
        CompletableFuture<TradesAggregateResponse> future =
                getApi().tradesAggregate(tradesAggregateRequest);
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
     * Aggregate trades
     *
     * <p>Get aggregate trades. An *aggregate trade* (aggtrade) represents one or more individual
     * trades. Trades that fill at the same time, from the same taker order, with the same price –
     * those trades are collected into an aggregate trade with total quantity of the individual
     * trades. If you need access to real-time trading activity, please consider using WebSocket
     * Streams: * &#x60;&lt;symbol&gt;@aggTrade&#x60; If you need historical aggregate trade data,
     * please consider using
     * [data.binance.vision](https://github.com/binance/binance-public-data/#aggtrades). Weight(IP):
     * 4 Security Type: NONE Notes: **Data Source:** Database - If &#x60;fromId&#x60; is specified,
     * return aggtrades with aggregate trade ID &gt;&#x3D; &#x60;fromId&#x60;. Use
     * &#x60;fromId&#x60; and &#x60;limit&#x60; to page through all aggtrades. - If
     * &#x60;startTime&#x60; and/or &#x60;endTime&#x60; are specified, aggtrades are filtered by
     * execution time (&#x60;T&#x60;). &#x60;fromId&#x60; cannot be used together with
     * &#x60;startTime&#x60; and &#x60;endTime&#x60;. - If no condition is specified, the most
     * recent aggregate trades are returned.
     */
    public void tradesAggregateExampleSync() {
        TradesAggregateRequest tradesAggregateRequest = new TradesAggregateRequest();
        tradesAggregateRequest.symbol("BNBUSDT");
        CompletableFuture<TradesAggregateResponse> future =
                getApi().tradesAggregate(tradesAggregateRequest);
        TradesAggregateResponse response = future.join();
        System.out.println(response);
    }
}
