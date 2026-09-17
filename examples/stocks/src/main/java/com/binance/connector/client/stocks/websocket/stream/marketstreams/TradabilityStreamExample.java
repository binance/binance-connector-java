package com.binance.connector.client.stocks.websocket.stream.marketstreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.stocks.websocket.stream.StocksWebSocketStreamsUtil;
import com.binance.connector.client.stocks.websocket.stream.api.StocksWebSocketStreams;
import com.binance.connector.client.stocks.websocket.stream.model.TradabilityStreamRequest;
import com.binance.connector.client.stocks.websocket.stream.model.TradabilityStreamResponse;

/** API examples for MarketStreamsApi */
public class TradabilityStreamExample {
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
     * Tradability Stream
     *
     * <p>Per-symbol push whenever the tradable direction of a symbol changes. Pushed only when the
     * value actually changes (new value ≠ old value).
     *
     * @throws ApiException if the Api call fails
     */
    public void tradabilityStreamExample() throws ApiException, InterruptedException {
        TradabilityStreamRequest tradabilityStreamRequest = new TradabilityStreamRequest();
        StreamBlockingQueueWrapper<TradabilityStreamResponse> response =
                getApi().tradabilityStream(tradabilityStreamRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
