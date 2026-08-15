package com.binance.connector.client.alpha.websocket.stream.defaultpkg;

import com.binance.connector.client.alpha.websocket.stream.AlphaWebSocketStreamsUtil;
import com.binance.connector.client.alpha.websocket.stream.api.AlphaWebSocketStreams;
import com.binance.connector.client.alpha.websocket.stream.model.PartialDepthStreamRequest;
import com.binance.connector.client.alpha.websocket.stream.model.PartialDepthStreamResponse;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;

/** API examples for DefaultApi */
public class PartialDepthStreamExample {
    private AlphaWebSocketStreams api;

    public AlphaWebSocketStreams getApi() {
        if (api == null) {
            WebSocketClientConfiguration clientConfiguration =
                    AlphaWebSocketStreamsUtil.getClientConfiguration();
            api = new AlphaWebSocketStreams(clientConfiguration);
        }
        return api;
    }

    /**
     * Partial Depth Stream
     *
     * <p>Pushes partial depth updates (UI orders only).
     *
     * @throws ApiException if the Api call fails
     */
    public void partialDepthStreamExample() throws ApiException, InterruptedException {
        PartialDepthStreamRequest partialDepthStreamRequest = new PartialDepthStreamRequest();
        StreamBlockingQueueWrapper<PartialDepthStreamResponse> response =
                getApi().partialDepthStream(partialDepthStreamRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
