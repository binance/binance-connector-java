package com.binance.connector.client.alpha.websocket.stream.defaultpkg;

import com.binance.connector.client.alpha.websocket.stream.AlphaWebSocketStreamsUtil;
import com.binance.connector.client.alpha.websocket.stream.api.AlphaWebSocketStreams;
import com.binance.connector.client.alpha.websocket.stream.model.AllTickerStreamRequest;
import com.binance.connector.client.alpha.websocket.stream.model.AllTickerStreamResponse;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;

/** API examples for DefaultApi */
public class AllTickerStreamExample {
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
     * All Ticker Stream
     *
     * <p>Pushes full ticker statistics for all symbols.
     *
     * @throws ApiException if the Api call fails
     */
    public void allTickerStreamExample() throws ApiException, InterruptedException {
        AllTickerStreamRequest allTickerStreamRequest = new AllTickerStreamRequest();
        StreamBlockingQueueWrapper<AllTickerStreamResponse> response =
                getApi().allTickerStream(allTickerStreamRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
