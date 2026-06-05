package com.binance.connector.client.spot.websocket.stream.websocketstreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.spot.websocket.stream.SpotWebSocketStreamsUtil;
import com.binance.connector.client.spot.websocket.stream.api.SpotWebSocketStreams;
import com.binance.connector.client.spot.websocket.stream.model.RollingWindowTickerRequest;
import com.binance.connector.client.spot.websocket.stream.model.RollingWindowTickerResponse;
import com.binance.connector.client.spot.websocket.stream.model.WindowSize;

/** API examples for WebSocketStreamsApi */
public class RollingWindowTickerExample {
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
     * WebSocket Individual Symbol Rolling Window Statistics Streams
     *
     * <p>Rolling window ticker statistics for a single symbol, computed over multiple windows.
     *
     * @throws ApiException if the Api call fails
     */
    public void rollingWindowTickerExample() throws ApiException, InterruptedException {
        RollingWindowTickerRequest rollingWindowTickerRequest = new RollingWindowTickerRequest();
        rollingWindowTickerRequest.symbol("bnbusdt");
        rollingWindowTickerRequest.windowSize(WindowSize.WINDOW_SIZE_1h);
        StreamBlockingQueueWrapper<RollingWindowTickerResponse> response =
                getApi().rollingWindowTicker(rollingWindowTickerRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
