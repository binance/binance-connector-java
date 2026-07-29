package com.binance.connector.client.spot.websocket.stream.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.spot.websocket.stream.SpotWebSocketStreamsUtil;
import com.binance.connector.client.spot.websocket.stream.api.SpotWebSocketStreams;
import com.binance.connector.client.spot.websocket.stream.model.AggTradeRequest;
import com.binance.connector.client.spot.websocket.stream.model.AggTradeResponse;

/** API examples for DefaultApi */
public class AggTradeExample {
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
     * Aggregate Trade Streams
     *
     * <p>The Aggregate Trade Streams push trade information that is aggregated for a single taker
     * order. Update Speed: Real-time
     *
     * @throws ApiException if the Api call fails
     */
    public void aggTradeExample() throws ApiException, InterruptedException {
        AggTradeRequest aggTradeRequest = new AggTradeRequest();
        StreamBlockingQueueWrapper<AggTradeResponse> response = getApi().aggTrade(aggTradeRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
