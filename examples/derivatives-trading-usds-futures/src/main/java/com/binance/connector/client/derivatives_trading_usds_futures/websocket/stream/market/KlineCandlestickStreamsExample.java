package com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.market;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.DerivativesTradingUsdsFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.DerivativesTradingUsdsFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.KlineCandlestickStreamsRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.KlineCandlestickStreamsResponse;

/** API examples for MarketApi */
public class KlineCandlestickStreamsExample {
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
     * Kline/Candlestick Streams
     *
     * <p>The Kline/Candlestick Stream push updates to the current klines/candlestick every 250
     * milliseconds (if existing). Update Speed: 250ms
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
