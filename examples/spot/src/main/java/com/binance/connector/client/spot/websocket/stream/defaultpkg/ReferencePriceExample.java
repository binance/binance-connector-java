package com.binance.connector.client.spot.websocket.stream.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.spot.websocket.stream.SpotWebSocketStreamsUtil;
import com.binance.connector.client.spot.websocket.stream.api.SpotWebSocketStreams;
import com.binance.connector.client.spot.websocket.stream.model.ReferencePriceRequest;
import com.binance.connector.client.spot.websocket.stream.model.ReferencePriceResponse;

/** API examples for DefaultApi */
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
     * Reference Price Streams
     *
     * <p>Reference price stream for a symbol. Update Speed: 1000ms
     *
     * @throws ApiException if the Api call fails
     */
    public void referencePriceExample() throws ApiException, InterruptedException {
        ReferencePriceRequest referencePriceRequest = new ReferencePriceRequest();
        StreamBlockingQueueWrapper<ReferencePriceResponse> response =
                getApi().referencePrice(referencePriceRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
