package com.binance.connector.client.stocks.websocket.stream.marketstreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.stocks.websocket.stream.StocksWebSocketStreamsUtil;
import com.binance.connector.client.stocks.websocket.stream.api.StocksWebSocketStreams;
import com.binance.connector.client.stocks.websocket.stream.model.TradingStatusStreamRequest;
import com.binance.connector.client.stocks.websocket.stream.model.TradingStatusStreamResponse;

/** API examples for MarketStreamsApi */
public class TradingStatusStreamExample {
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
     * Trading Status Stream
     *
     * <p>Per-symbol trading-status transitions (halts, resumes, SSR, LULD pauses, etc.). Events
     * that do not match a known status/reason rule are not pushed.
     *
     * @throws ApiException if the Api call fails
     */
    public void tradingStatusStreamExample() throws ApiException, InterruptedException {
        TradingStatusStreamRequest tradingStatusStreamRequest = new TradingStatusStreamRequest();
        StreamBlockingQueueWrapper<TradingStatusStreamResponse> response =
                getApi().tradingStatusStream(tradingStatusStreamRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
