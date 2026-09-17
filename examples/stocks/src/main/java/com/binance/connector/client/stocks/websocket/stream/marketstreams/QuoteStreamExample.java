package com.binance.connector.client.stocks.websocket.stream.marketstreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.stocks.websocket.stream.StocksWebSocketStreamsUtil;
import com.binance.connector.client.stocks.websocket.stream.api.StocksWebSocketStreams;
import com.binance.connector.client.stocks.websocket.stream.model.QuoteStreamRequest;
import com.binance.connector.client.stocks.websocket.stream.model.QuoteStreamResponse;

/** API examples for MarketStreamsApi */
public class QuoteStreamExample {
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
     * Quote Stream
     *
     * <p>Per-symbol real-time best-bid / best-ask. Each symbol has its own stream. Per-symbol
     * throttle: at most one push per symbol every 200 ms.
     *
     * @throws ApiException if the Api call fails
     */
    public void quoteStreamExample() throws ApiException, InterruptedException {
        QuoteStreamRequest quoteStreamRequest = new QuoteStreamRequest();
        StreamBlockingQueueWrapper<QuoteStreamResponse> response =
                getApi().quoteStream(quoteStreamRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
