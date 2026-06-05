package com.binance.connector.client.spot.websocket.stream.websocketstreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.spot.websocket.stream.SpotWebSocketStreamsUtil;
import com.binance.connector.client.spot.websocket.stream.api.SpotWebSocketStreams;
import com.binance.connector.client.spot.websocket.stream.model.AllMarketRollingWindowTickerRequest;
import com.binance.connector.client.spot.websocket.stream.model.AllMarketRollingWindowTickerResponse;
import com.binance.connector.client.spot.websocket.stream.model.WindowSize;

/** API examples for WebSocketStreamsApi */
public class AllMarketRollingWindowTickerExample {
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
     * WebSocket All Market Rolling Window Statistics Streams
     *
     * <p>Rolling window ticker statistics for all market symbols, computed over multiple windows.
     * Note that only tickers that have changed will be present in the array.
     *
     * @throws ApiException if the Api call fails
     */
    public void allMarketRollingWindowTickerExample() throws ApiException, InterruptedException {
        AllMarketRollingWindowTickerRequest allMarketRollingWindowTickerRequest =
                new AllMarketRollingWindowTickerRequest();
        allMarketRollingWindowTickerRequest.windowSize(WindowSize.WINDOW_SIZE_1h);
        StreamBlockingQueueWrapper<AllMarketRollingWindowTickerResponse> response =
                getApi().allMarketRollingWindowTicker(allMarketRollingWindowTickerRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
