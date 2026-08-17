package com.binance.connector.client.stocks.websocket.stream.marketstreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.stocks.websocket.stream.StocksWebSocketStreamsUtil;
import com.binance.connector.client.stocks.websocket.stream.api.StocksWebSocketStreams;
import com.binance.connector.client.stocks.websocket.stream.model.KlineStreamRequest;
import com.binance.connector.client.stocks.websocket.stream.model.KlineStreamResponse;

/** API examples for MarketStreamsApi */
public class KlineStreamExample {
    private StocksWebSocketStreams api;

    public StocksWebSocketStreams getApi() {
        if (api == null) {
            WebSocketClientConfiguration clientConfiguration =
                    StocksWebSocketStreamsUtil.getClientConfiguration();
            api = new StocksWebSocketStreams(clientConfiguration);
        }
        return api;
    }

    /**
     * Kline Stream
     *
     * <p>Per-symbol candlestick updates. One stream per (symbol, interval) combination. Supported
     * intervals: 5m, 1h, 1d, 1w, 1M.
     *
     * @throws ApiException if the Api call fails
     */
    public void klineStreamExample() throws ApiException, InterruptedException {
        KlineStreamRequest klineStreamRequest = new KlineStreamRequest();
        StreamBlockingQueueWrapper<KlineStreamResponse> response =
                getApi().klineStream(klineStreamRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
