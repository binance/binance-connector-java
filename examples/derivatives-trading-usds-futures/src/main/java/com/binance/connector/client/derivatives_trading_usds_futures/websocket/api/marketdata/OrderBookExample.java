package com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.marketdata;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.DerivativesTradingUsdsFuturesWebSocketApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.api.DerivativesTradingUsdsFuturesWebSocketApi;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.OrderBookRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.OrderBookResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for MarketDataApi */
public class OrderBookExample {
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
     * Order Book
     *
     * <p>Get current order book. Note that this request returns limited market depth. If you need
     * to continuously monitor order book updates, please consider using Websocket Market Streams: *
     * &#x60;&lt;symbol&gt;@depth&lt;levels&gt;&#x60; * &#x60;&lt;symbol&gt;@depth&#x60; You can use
     * &#x60;depth&#x60; request together with &#x60;&lt;symbol&gt;@depth&#x60; streams to maintain
     * a local order book. Retail Price Improvement(RPI) orders are not visible and excluded in the
     * response message. Weight: Adjusted based on the limit: | Limit | Weight | | ------------- |
     * ------ | | 5, 10, 20, 50 | 2 | | 100 | 5 | | 500 | 10 | | 1000 | 20 |
     */
    public void orderBookExampleAsync() {
        OrderBookRequest orderBookRequest = new OrderBookRequest();
        orderBookRequest.symbol("");
        CompletableFuture<OrderBookResponse> future = getApi().orderBook(orderBookRequest);
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
     * Order Book
     *
     * <p>Get current order book. Note that this request returns limited market depth. If you need
     * to continuously monitor order book updates, please consider using Websocket Market Streams: *
     * &#x60;&lt;symbol&gt;@depth&lt;levels&gt;&#x60; * &#x60;&lt;symbol&gt;@depth&#x60; You can use
     * &#x60;depth&#x60; request together with &#x60;&lt;symbol&gt;@depth&#x60; streams to maintain
     * a local order book. Retail Price Improvement(RPI) orders are not visible and excluded in the
     * response message. Weight: Adjusted based on the limit: | Limit | Weight | | ------------- |
     * ------ | | 5, 10, 20, 50 | 2 | | 100 | 5 | | 500 | 10 | | 1000 | 20 |
     */
    public void orderBookExampleSync() {
        OrderBookRequest orderBookRequest = new OrderBookRequest();
        orderBookRequest.symbol("");
        CompletableFuture<OrderBookResponse> future = getApi().orderBook(orderBookRequest);
        OrderBookResponse response = future.join();
        System.out.println(response);
    }
}
