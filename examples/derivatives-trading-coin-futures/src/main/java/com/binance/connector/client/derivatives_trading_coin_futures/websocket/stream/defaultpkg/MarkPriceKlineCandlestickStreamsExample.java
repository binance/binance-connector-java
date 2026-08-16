package com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.DerivativesTradingCoinFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DerivativesTradingCoinFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.MarkPriceKlineCandlestickStreamsRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.MarkPriceKlineCandlestickStreamsResponse;

/** API examples for DefaultApi */
public class MarkPriceKlineCandlestickStreamsExample {
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
     * Mark Price Kline/Candlestick Streams
     *
     * <p>Mark Price Kline/Candlestick Streams &gt; **After CM migration**, both &#x60;fstream&#x60;
     * and &#x60;dstream&#x60; may subscribe to CM symbols on this stream. Update Speed: 250ms
     *
     * @throws ApiException if the Api call fails
     */
    public void markPriceKlineCandlestickStreamsExample()
            throws ApiException, InterruptedException {
        MarkPriceKlineCandlestickStreamsRequest markPriceKlineCandlestickStreamsRequest =
                new MarkPriceKlineCandlestickStreamsRequest();
        StreamBlockingQueueWrapper<MarkPriceKlineCandlestickStreamsResponse> response =
                getApi().markPriceKlineCandlestickStreams(markPriceKlineCandlestickStreamsRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
