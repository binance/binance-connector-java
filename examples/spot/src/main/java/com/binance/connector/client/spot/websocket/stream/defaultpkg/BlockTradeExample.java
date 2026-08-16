package com.binance.connector.client.spot.websocket.stream.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.spot.websocket.stream.SpotWebSocketStreamsUtil;
import com.binance.connector.client.spot.websocket.stream.api.SpotWebSocketStreams;
import com.binance.connector.client.spot.websocket.stream.model.BlockTradeRequest;
import com.binance.connector.client.spot.websocket.stream.model.BlockTradeResponse;

/** API examples for DefaultApi */
public class BlockTradeExample {
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
     * Block Trade Streams
     *
     * <p>Block Trade Streams push block trade information in real-time. Update Speed: Real-time
     *
     * @throws ApiException if the Api call fails
     */
    public void blockTradeExample() throws ApiException, InterruptedException {
        BlockTradeRequest blockTradeRequest = new BlockTradeRequest();
        StreamBlockingQueueWrapper<BlockTradeResponse> response =
                getApi().blockTrade(blockTradeRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
