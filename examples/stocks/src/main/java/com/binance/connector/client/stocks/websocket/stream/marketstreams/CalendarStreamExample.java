package com.binance.connector.client.stocks.websocket.stream.marketstreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.stocks.websocket.stream.StocksWebSocketStreamsUtil;
import com.binance.connector.client.stocks.websocket.stream.api.StocksWebSocketStreams;
import com.binance.connector.client.stocks.websocket.stream.model.CalendarStreamResponse;

/** API examples for MarketStreamsApi */
public class CalendarStreamExample {
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
     * Calendar Stream
     *
     * <p>Single-stream broadcast of market-phase transitions. One message per transition; no
     * periodic heartbeat payload. Server polls every 5 seconds.
     *
     * @throws ApiException if the Api call fails
     */
    public void calendarStreamExample() throws ApiException, InterruptedException {
        StreamBlockingQueueWrapper<CalendarStreamResponse> response = getApi().calendarStream();
        while (true) {
            System.out.println(response.take());
        }
    }
}
