package com.binance.connector.client.spot.websocket.api.market;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.Interval;
import com.binance.connector.client.spot.websocket.api.model.KlinesRequest;
import com.binance.connector.client.spot.websocket.api.model.KlinesResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for MarketApi */
public class KlinesExample {
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
     * WebSocket Klines
     *
     * <p>Get klines (candlestick bars). Klines are uniquely identified by their open &amp; close
     * time. If you need access to real-time kline updates, please consider using WebSocket Streams:
     * * &#x60;&lt;symbol&gt;@kline_&lt;interval&gt;&#x60; If you need historical kline data, please
     * consider using [data.binance.vision](https://github.com/binance/binance-public-data/#klines).
     * Weight: 2
     */
    public void klinesExampleAsync() {
        KlinesRequest klinesRequest = new KlinesRequest();
        klinesRequest.symbol("BNBUSDT");
        klinesRequest.interval(Interval.INTERVAL_1s);
        CompletableFuture<KlinesResponse> future = getApi().klines(klinesRequest);
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
     * WebSocket Klines
     *
     * <p>Get klines (candlestick bars). Klines are uniquely identified by their open &amp; close
     * time. If you need access to real-time kline updates, please consider using WebSocket Streams:
     * * &#x60;&lt;symbol&gt;@kline_&lt;interval&gt;&#x60; If you need historical kline data, please
     * consider using [data.binance.vision](https://github.com/binance/binance-public-data/#klines).
     * Weight: 2
     */
    public void klinesExampleSync() {
        KlinesRequest klinesRequest = new KlinesRequest();
        klinesRequest.symbol("BNBUSDT");
        klinesRequest.interval(Interval.INTERVAL_1s);
        CompletableFuture<KlinesResponse> future = getApi().klines(klinesRequest);
        KlinesResponse response = future.join();
        System.out.println(response);
    }
}
