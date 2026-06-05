package com.binance.connector.client.derivatives_trading_options.websocket.stream.market;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.DerivativesTradingOptionsWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.api.DerivativesTradingOptionsWebSocketStreams;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.KlineCandlestickStreamsRequest;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.KlineCandlestickStreamsResponse;

/** API examples for MarketApi */
public class KlineCandlestickStreamsExample {
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
     * Kline/Candlestick Streams
     *
     * <p>The Kline/Candlestick Stream push updates to the current klines/candlestick every 1000
     * milliseconds (if existing). Update Speed: 1000ms
     *
     * @throws ApiException if the Api call fails
     */
    public void klineCandlestickStreamsExample() throws ApiException, InterruptedException {
        KlineCandlestickStreamsRequest klineCandlestickStreamsRequest =
                new KlineCandlestickStreamsRequest();
        klineCandlestickStreamsRequest.symbol("btcusdt");
        klineCandlestickStreamsRequest.interval("1m");
        StreamBlockingQueueWrapper<KlineCandlestickStreamsResponse> response =
                getApi().klineCandlestickStreams(klineCandlestickStreamsRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
