package com.binance.connector.client.spot.websocket.stream.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.spot.websocket.stream.SpotWebSocketStreamsUtil;
import com.binance.connector.client.spot.websocket.stream.api.SpotWebSocketStreams;
import com.binance.connector.client.spot.websocket.stream.model.PartialBookDepthRequest;
import com.binance.connector.client.spot.websocket.stream.model.PartialBookDepthResponse;

/** API examples for DefaultApi */
public class PartialBookDepthExample {
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
     * WebSocket Partial Book Depth Streams
     *
     * <p>Top **\\&lt;levels\\&gt;** bids and asks, pushed every second. Update Speed: 1000ms or
     * 100ms
     *
     * @throws ApiException if the Api call fails
     */
    public void partialBookDepthExample() throws ApiException, InterruptedException {
        PartialBookDepthRequest partialBookDepthRequest = new PartialBookDepthRequest();
        StreamBlockingQueueWrapper<PartialBookDepthResponse> response =
                getApi().partialBookDepth(partialBookDepthRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
