package com.binance.connector.client.spot.websocket.stream.websocketstreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.spot.websocket.stream.SpotWebSocketStreamsUtil;
import com.binance.connector.client.spot.websocket.stream.api.SpotWebSocketStreams;
import com.binance.connector.client.spot.websocket.stream.model.TickerRequest;
import com.binance.connector.client.spot.websocket.stream.model.TickerResponse;

/** API examples for WebSocketStreamsApi */
public class TickerExample {
    private SpotWebSocketStreams api;

    public SpotWebSocketStreams getApi() {
        if (api == null) {
            WebSocketClientConfiguration clientConfiguration =
                    SpotWebSocketStreamsUtil.getClientConfiguration();
            api = new SpotWebSocketStreams(clientConfiguration);
        }
        return api;
    }

    /**
     * WebSocket Individual Symbol Ticker Streams
     *
     * <p>24hr rolling window ticker statistics for a single symbol. These are NOT the statistics of
     * the UTC day, but a 24hr rolling window for the previous 24hrs.
     *
     * @throws ApiException if the Api call fails
     */
    public void tickerExample() throws ApiException, InterruptedException {
        TickerRequest tickerRequest = new TickerRequest();
        tickerRequest.symbol("bnbusdt");
        StreamBlockingQueueWrapper<TickerResponse> response = getApi().ticker(tickerRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
