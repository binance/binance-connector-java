package com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.websocketmarketstreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.DerivativesTradingCoinFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DerivativesTradingCoinFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.IndexKlineCandlestickStreamsRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.IndexKlineCandlestickStreamsResponse;

/** API examples for WebsocketMarketStreamsApi */
public class IndexKlineCandlestickStreamsExample {
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
     * Index Kline/Candlestick Streams
     *
     * <p>Index Kline/Candlestick Streams Update Speed: 250ms
     *
     * @throws ApiException if the Api call fails
     */
    public void indexKlineCandlestickStreamsExample() throws ApiException, InterruptedException {
        IndexKlineCandlestickStreamsRequest indexKlineCandlestickStreamsRequest =
                new IndexKlineCandlestickStreamsRequest();
        indexKlineCandlestickStreamsRequest.pair("btcusdt");
        indexKlineCandlestickStreamsRequest.interval("1m");
        StreamBlockingQueueWrapper<IndexKlineCandlestickStreamsResponse> response =
                getApi().indexKlineCandlestickStreams(indexKlineCandlestickStreamsRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
