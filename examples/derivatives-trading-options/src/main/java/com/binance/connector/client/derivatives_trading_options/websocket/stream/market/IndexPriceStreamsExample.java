package com.binance.connector.client.derivatives_trading_options.websocket.stream.market;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.DerivativesTradingOptionsWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.api.DerivativesTradingOptionsWebSocketStreams;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.IndexPriceStreamsRequest;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.IndexPriceStreamsResponse;

/** API examples for MarketApi */
public class IndexPriceStreamsExample {
    private DerivativesTradingOptionsWebSocketStreams api;

    public DerivativesTradingOptionsWebSocketStreams getApi() {
        if (api == null) {
            WebSocketClientConfiguration clientConfiguration =
                    DerivativesTradingOptionsWebSocketStreamsUtil.getClientConfiguration();
            api = new DerivativesTradingOptionsWebSocketStreams(clientConfiguration);
        }
        return api;
    }

    /**
     * Index Price Streams
     *
     * <p>Underlying(e.g ETHUSDT) index stream. Update Speed: 1000ms
     *
     * @throws ApiException if the Api call fails
     */
    public void indexPriceStreamsExample() throws ApiException, InterruptedException {
        IndexPriceStreamsRequest indexPriceStreamsRequest = new IndexPriceStreamsRequest();
        StreamBlockingQueueWrapper<IndexPriceStreamsResponse> response =
                getApi().indexPriceStreams(indexPriceStreamsRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
