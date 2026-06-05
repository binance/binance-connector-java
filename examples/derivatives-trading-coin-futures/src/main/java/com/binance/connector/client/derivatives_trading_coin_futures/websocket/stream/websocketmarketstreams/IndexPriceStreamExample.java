package com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.websocketmarketstreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.DerivativesTradingCoinFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DerivativesTradingCoinFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.IndexPriceStreamRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.IndexPriceStreamResponse;

/** API examples for WebsocketMarketStreamsApi */
public class IndexPriceStreamExample {
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
     * Index Price Stream
     *
     * <p>Index Price Stream Update Speed: 3000ms OR 1000ms
     *
     * @throws ApiException if the Api call fails
     */
    public void indexPriceStreamExample() throws ApiException, InterruptedException {
        IndexPriceStreamRequest indexPriceStreamRequest = new IndexPriceStreamRequest();
        indexPriceStreamRequest.pair("btcusdt");
        StreamBlockingQueueWrapper<IndexPriceStreamResponse> response =
                getApi().indexPriceStream(indexPriceStreamRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
