package com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.market;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.DerivativesTradingUsdsFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.DerivativesTradingUsdsFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.AggregateTradeStreamsRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.AggregateTradeStreamsResponse;

/** API examples for MarketApi */
public class AggregateTradeStreamsExample {
    private DerivativesTradingUsdsFuturesWebSocketStreams api;

    public DerivativesTradingUsdsFuturesWebSocketStreams getApi() {
        if (api == null) {
            WebSocketClientConfiguration clientConfiguration =
                    DerivativesTradingUsdsFuturesWebSocketStreamsUtil.getClientConfiguration();
            api = new DerivativesTradingUsdsFuturesWebSocketStreams(clientConfiguration);
        }
        return api;
    }

    /**
     * Aggregate Trade Streams
     *
     * <p>The Aggregate Trade Streams push market trade information that is aggregated for fills
     * with same price and taking side every 100 milliseconds. Only market trades will be
     * aggregated, which means the insurance fund trades and ADL trades won&#39;t be aggregated.
     * Retail Price Improvement(RPI) orders are aggregated into field &#x60;q&#x60; and without
     * special tags to be distinguished. Update Speed: 100ms
     *
     * @throws ApiException if the Api call fails
     */
    public void aggregateTradeStreamsExample() throws ApiException, InterruptedException {
        AggregateTradeStreamsRequest aggregateTradeStreamsRequest =
                new AggregateTradeStreamsRequest();
        aggregateTradeStreamsRequest.symbol("btcusdt");
        StreamBlockingQueueWrapper<AggregateTradeStreamsResponse> response =
                getApi().aggregateTradeStreams(aggregateTradeStreamsRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
