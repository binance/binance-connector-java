package com.binance.connector.client.alpha.websocket.stream.defaultpkg;

import com.binance.connector.client.alpha.websocket.stream.AlphaWebSocketStreamsUtil;
import com.binance.connector.client.alpha.websocket.stream.api.AlphaWebSocketStreams;
import com.binance.connector.client.alpha.websocket.stream.model.FullDepthStreamRequest;
import com.binance.connector.client.alpha.websocket.stream.model.FullDepthStreamResponse;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;

/** API examples for DefaultApi */
public class FullDepthStreamExample {
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
     * Full Depth Stream
     *
     * <p>Returns all available depth, including UI and API orders.
     *
     * @throws ApiException if the Api call fails
     */
    public void fullDepthStreamExample() throws ApiException, InterruptedException {
        FullDepthStreamRequest fullDepthStreamRequest = new FullDepthStreamRequest();
        StreamBlockingQueueWrapper<FullDepthStreamResponse> response =
                getApi().fullDepthStream(fullDepthStreamRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
