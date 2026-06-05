package com.binance.connector.client.spot.websocket.stream.websocketstreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.spot.websocket.stream.SpotWebSocketStreamsUtil;
import com.binance.connector.client.spot.websocket.stream.api.SpotWebSocketStreams;
import com.binance.connector.client.spot.websocket.stream.model.AllMiniTickerResponse;

/** API examples for WebSocketStreamsApi */
public class AllMiniTickerExample {
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
     * WebSocket All Market Mini Tickers Stream
     *
     * <p>24hr rolling window mini-ticker statistics for all symbols that changed in an array. These
     * are NOT the statistics of the UTC day, but a 24hr rolling window for the previous 24hrs. Note
     * that only tickers that have changed will be present in the array.
     *
     * @throws ApiException if the Api call fails
     */
    public void allMiniTickerExample() throws ApiException, InterruptedException {
        StreamBlockingQueueWrapper<AllMiniTickerResponse> response = getApi().allMiniTicker();
        while (true) {
            System.out.println(response.take());
        }
    }
}
