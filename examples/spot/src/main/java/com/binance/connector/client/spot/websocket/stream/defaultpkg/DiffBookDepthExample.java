package com.binance.connector.client.spot.websocket.stream.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.spot.websocket.stream.SpotWebSocketStreamsUtil;
import com.binance.connector.client.spot.websocket.stream.api.SpotWebSocketStreams;
import com.binance.connector.client.spot.websocket.stream.model.DiffBookDepthRequest;
import com.binance.connector.client.spot.websocket.stream.model.DiffBookDepthResponse;

/** API examples for DefaultApi */
public class DiffBookDepthExample {
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
     * Diff. Depth Stream
     *
     * <p>Order book price and quantity depth updates used to locally manage an order book. Update
     * Speed: 1000ms or 100ms
     *
     * @throws ApiException if the Api call fails
     */
    public void diffBookDepthExample() throws ApiException, InterruptedException {
        DiffBookDepthRequest diffBookDepthRequest = new DiffBookDepthRequest();
        StreamBlockingQueueWrapper<DiffBookDepthResponse> response =
                getApi().diffBookDepth(diffBookDepthRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
