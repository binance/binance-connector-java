package com.binance.connector.client.alpha.websocket.stream.defaultpkg;

import com.binance.connector.client.alpha.websocket.stream.AlphaWebSocketStreamsUtil;
import com.binance.connector.client.alpha.websocket.stream.api.AlphaWebSocketStreams;
import com.binance.connector.client.alpha.websocket.stream.model.AllMiniTickerStreamRequest;
import com.binance.connector.client.alpha.websocket.stream.model.AllMiniTickerStreamResponse;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;

/** API examples for DefaultApi */
public class AllMiniTickerStreamExample {
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
     * All Mini Ticker Stream
     *
     * <p>Pushes mini ticker statistics for all symbols.
     *
     * @throws ApiException if the Api call fails
     */
    public void allMiniTickerStreamExample() throws ApiException, InterruptedException {
        AllMiniTickerStreamRequest allMiniTickerStreamRequest = new AllMiniTickerStreamRequest();
        StreamBlockingQueueWrapper<AllMiniTickerStreamResponse> response =
                getApi().allMiniTickerStream(allMiniTickerStreamRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
