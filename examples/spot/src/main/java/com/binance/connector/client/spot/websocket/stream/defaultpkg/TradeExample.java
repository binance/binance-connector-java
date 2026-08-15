package com.binance.connector.client.spot.websocket.stream.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.spot.websocket.stream.SpotWebSocketStreamsUtil;
import com.binance.connector.client.spot.websocket.stream.api.SpotWebSocketStreams;
import com.binance.connector.client.spot.websocket.stream.model.TradeRequest;
import com.binance.connector.client.spot.websocket.stream.model.TradeResponse;

/** API examples for DefaultApi */
public class TradeExample {
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
     * Trade Streams
     *
     * <p>The Trade Streams push raw trade information; each trade has a unique buyer and seller.
     * Update Speed: Real-time
     *
     * @throws ApiException if the Api call fails
     */
    public void tradeExample() throws ApiException, InterruptedException {
        TradeRequest tradeRequest = new TradeRequest();
        StreamBlockingQueueWrapper<TradeResponse> response = getApi().trade(tradeRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
