package com.binance.connector.client.spot.websocket.stream.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.spot.websocket.stream.SpotWebSocketStreamsUtil;
import com.binance.connector.client.spot.websocket.stream.api.SpotWebSocketStreams;
import com.binance.connector.client.spot.websocket.stream.model.AvgPriceRequest;
import com.binance.connector.client.spot.websocket.stream.model.AvgPriceResponse;

/** API examples for DefaultApi */
public class AvgPriceExample {
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
     * Average Price
     *
     * <p>Average price streams push changes in the average price over a fixed time interval. Update
     * Speed: 1000ms
     *
     * @throws ApiException if the Api call fails
     */
    public void avgPriceExample() throws ApiException, InterruptedException {
        AvgPriceRequest avgPriceRequest = new AvgPriceRequest();
        StreamBlockingQueueWrapper<AvgPriceResponse> response = getApi().avgPrice(avgPriceRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
