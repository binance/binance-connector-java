package com.binance.connector.client.alpha.websocket.stream.defaultpkg;

import com.binance.connector.client.alpha.websocket.stream.AlphaWebSocketStreamsUtil;
import com.binance.connector.client.alpha.websocket.stream.api.AlphaWebSocketStreams;
import com.binance.connector.client.alpha.websocket.stream.model.AllBookTickerStreamRequest;
import com.binance.connector.client.alpha.websocket.stream.model.AllBookTickerStreamResponse;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;

/** API examples for DefaultApi */
public class AllBookTickerStreamExample {
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
     * All Book Ticker Stream
     *
     * <p>Pushes best bid/ask updates for all symbols.
     *
     * @throws ApiException if the Api call fails
     */
    public void allBookTickerStreamExample() throws ApiException, InterruptedException {
        AllBookTickerStreamRequest allBookTickerStreamRequest = new AllBookTickerStreamRequest();
        StreamBlockingQueueWrapper<AllBookTickerStreamResponse> response =
                getApi().allBookTickerStream(allBookTickerStreamRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
