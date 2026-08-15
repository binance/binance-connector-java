package com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.DerivativesTradingCoinFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DerivativesTradingCoinFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.AggregateTradeStreamsRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.AggregateTradeStreamsResponse;

/** API examples for DefaultApi */
public class AggregateTradeStreamsExample {
    private DerivativesTradingCoinFuturesWebSocketStreams api;

    public DerivativesTradingCoinFuturesWebSocketStreams getApi() {
        if (api == null) {
            WebSocketClientConfiguration clientConfiguration =
                    DerivativesTradingCoinFuturesWebSocketStreamsUtil.getClientConfiguration();
            api = new DerivativesTradingCoinFuturesWebSocketStreams(clientConfiguration);
        }
        return api;
    }

    /**
     * Aggregate Trade Streams
     *
     * <p>The Aggregate Trade Streams push market trade information that is aggregated for fills
     * with same price and taking side every 100 milliseconds. &gt; **After CM migration**, the
     * payload is appended with a new &#x60;st&#x60; field (&#x60;1&#x60; &#x3D; UM, &#x60;2&#x60;
     * &#x3D; CM). Update Speed: 100ms
     *
     * @throws ApiException if the Api call fails
     */
    public void aggregateTradeStreamsExample() throws ApiException, InterruptedException {
        AggregateTradeStreamsRequest aggregateTradeStreamsRequest =
                new AggregateTradeStreamsRequest();
        StreamBlockingQueueWrapper<AggregateTradeStreamsResponse> response =
                getApi().aggregateTradeStreams(aggregateTradeStreamsRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
