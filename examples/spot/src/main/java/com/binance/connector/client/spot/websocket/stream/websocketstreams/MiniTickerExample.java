package com.binance.connector.client.spot.websocket.stream.websocketstreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.spot.websocket.stream.SpotWebSocketStreamsUtil;
import com.binance.connector.client.spot.websocket.stream.api.SpotWebSocketStreams;
import com.binance.connector.client.spot.websocket.stream.model.MiniTickerRequest;
import com.binance.connector.client.spot.websocket.stream.model.MiniTickerResponse;

/** API examples for WebSocketStreamsApi */
public class MiniTickerExample {
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
     * WebSocket Individual Symbol Mini Ticker Stream
     *
     * <p>24hr rolling window mini-ticker statistics. These are NOT the statistics of the UTC day,
     * but a 24hr rolling window for the previous 24hrs.
     *
     * @throws ApiException if the Api call fails
     */
    public void miniTickerExample() throws ApiException, InterruptedException {
        MiniTickerRequest miniTickerRequest = new MiniTickerRequest();
        miniTickerRequest.symbol("bnbusdt");
        StreamBlockingQueueWrapper<MiniTickerResponse> response =
                getApi().miniTicker(miniTickerRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
