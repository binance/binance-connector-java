package com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.websocketmarketstreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.DerivativesTradingCoinFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DerivativesTradingCoinFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.MarkPriceKlineCandlestickStreamsRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.MarkPriceKlineCandlestickStreamsResponse;

/** API examples for WebsocketMarketStreamsApi */
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
     * <p>Mark Price Kline/Candlestick Streams Update Speed: 250ms
     *
     * @throws ApiException if the Api call fails
     */
    public void markPriceKlineCandlestickStreamsExample()
            throws ApiException, InterruptedException {
        MarkPriceKlineCandlestickStreamsRequest markPriceKlineCandlestickStreamsRequest =
                new MarkPriceKlineCandlestickStreamsRequest();
        markPriceKlineCandlestickStreamsRequest.symbol("btcusdt");
        markPriceKlineCandlestickStreamsRequest.interval("1m");
        StreamBlockingQueueWrapper<MarkPriceKlineCandlestickStreamsResponse> response =
                getApi().markPriceKlineCandlestickStreams(markPriceKlineCandlestickStreamsRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
