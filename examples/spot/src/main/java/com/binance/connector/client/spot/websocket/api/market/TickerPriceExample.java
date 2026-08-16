package com.binance.connector.client.spot.websocket.api.market;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.TickerPriceRequest;
import com.binance.connector.client.spot.websocket.api.model.TickerPriceResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for MarketApi */
public class TickerPriceExample {
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
     * Symbol price ticker
     *
     * <p>Get the latest market price for a symbol. If you need access to real-time price updates,
     * please consider using WebSocket Streams: * &#x60;&lt;symbol&gt;@aggTrade&#x60; *
     * &#x60;&lt;symbol&gt;@trade&#x60; Weight: Adjusted based on the number of requested symbols:
     * |Parameter|Symbols Provided|Weight| |---|---|---| |symbol| 1 |2| | |omitted| 4| |symbols| Any
     * |4| Security Type: NONE Notes: **Data Source:** Memory Notes: * &#x60;symbol&#x60; and
     * &#x60;symbols&#x60; cannot be used together. * If no symbol is specified, returns information
     * about all symbols currently trading on the exchange.
     */
    public void tickerPriceExampleAsync() {
        TickerPriceRequest tickerPriceRequest = new TickerPriceRequest();
        CompletableFuture<TickerPriceResponse> future = getApi().tickerPrice(tickerPriceRequest);
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
     * Symbol price ticker
     *
     * <p>Get the latest market price for a symbol. If you need access to real-time price updates,
     * please consider using WebSocket Streams: * &#x60;&lt;symbol&gt;@aggTrade&#x60; *
     * &#x60;&lt;symbol&gt;@trade&#x60; Weight: Adjusted based on the number of requested symbols:
     * |Parameter|Symbols Provided|Weight| |---|---|---| |symbol| 1 |2| | |omitted| 4| |symbols| Any
     * |4| Security Type: NONE Notes: **Data Source:** Memory Notes: * &#x60;symbol&#x60; and
     * &#x60;symbols&#x60; cannot be used together. * If no symbol is specified, returns information
     * about all symbols currently trading on the exchange.
     */
    public void tickerPriceExampleSync() {
        TickerPriceRequest tickerPriceRequest = new TickerPriceRequest();
        CompletableFuture<TickerPriceResponse> future = getApi().tickerPrice(tickerPriceRequest);
        TickerPriceResponse response = future.join();
        System.out.println(response);
    }
}
