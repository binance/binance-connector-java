package com.binance.connector.client.spot.websocket.stream.websocketstreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.spot.websocket.stream.SpotWebSocketStreamsUtil;
import com.binance.connector.client.spot.websocket.stream.api.SpotWebSocketStreams;
import com.binance.connector.client.spot.websocket.stream.model.ReferencePriceRequest;
import com.binance.connector.client.spot.websocket.stream.model.ReferencePriceResponse;

/** API examples for WebSocketStreamsApi */
public class ReferencePriceExample {
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
     * WebSocket Reference Price Streams
     *
     * @throws ApiException if the Api call fails
     */
    public void referencePriceExample() throws ApiException, InterruptedException {
        ReferencePriceRequest referencePriceRequest = new ReferencePriceRequest();
        referencePriceRequest.symbol("bnbusdt");
        StreamBlockingQueueWrapper<ReferencePriceResponse> response =
                getApi().referencePrice(referencePriceRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
