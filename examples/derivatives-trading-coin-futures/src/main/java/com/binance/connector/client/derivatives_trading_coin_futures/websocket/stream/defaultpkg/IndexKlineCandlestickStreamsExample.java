package com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.DerivativesTradingCoinFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DerivativesTradingCoinFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.IndexKlineCandlestickStreamsRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.IndexKlineCandlestickStreamsResponse;

/** API examples for DefaultApi */
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
     * <p>Index Kline/Candlestick Streams &gt; **After CM migration**, both &#x60;fstream&#x60; and
     * &#x60;dstream&#x60; may subscribe to CM symbols on this stream. Update Speed: 250ms
     *
     * @throws ApiException if the Api call fails
     */
    public void indexKlineCandlestickStreamsExample() throws ApiException, InterruptedException {
        IndexKlineCandlestickStreamsRequest indexKlineCandlestickStreamsRequest =
                new IndexKlineCandlestickStreamsRequest();
        StreamBlockingQueueWrapper<IndexKlineCandlestickStreamsResponse> response =
                getApi().indexKlineCandlestickStreams(indexKlineCandlestickStreamsRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
