package com.binance.connector.client.stocks.websocket.stream.marketstreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.stocks.websocket.stream.StocksWebSocketStreamsUtil;
import com.binance.connector.client.stocks.websocket.stream.api.StocksWebSocketStreams;
import com.binance.connector.client.stocks.websocket.stream.model.PriceStreamResponse;

/** API examples for MarketStreamsApi */
public class PriceStreamExample {
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
     * Price Stream
     *
     * <p>Push-all price snapshot, polled every 3 seconds. One message carries the latest price for
     * every active US-equity symbol.
     *
     * @throws ApiException if the Api call fails
     */
    public void priceStreamExample() throws ApiException, InterruptedException {
        StreamBlockingQueueWrapper<PriceStreamResponse> response = getApi().priceStream();
        while (true) {
            System.out.println(response.take());
        }
    }
}
