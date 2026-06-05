package com.binance.connector.client.spot.websocket.stream.websocketstreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.spot.websocket.stream.SpotWebSocketStreamsUtil;
import com.binance.connector.client.spot.websocket.stream.api.SpotWebSocketStreams;
import com.binance.connector.client.spot.websocket.stream.model.TradeRequest;
import com.binance.connector.client.spot.websocket.stream.model.TradeResponse;

/** API examples for WebSocketStreamsApi */
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
     * WebSocket Trade Streams
     *
     * <p>The Trade Streams push raw trade information; each trade has a unique buyer and seller.
     *
     * @throws ApiException if the Api call fails
     */
    public void tradeExample() throws ApiException, InterruptedException {
        TradeRequest tradeRequest = new TradeRequest();
        tradeRequest.symbol("bnbusdt");
        StreamBlockingQueueWrapper<TradeResponse> response = getApi().trade(tradeRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
