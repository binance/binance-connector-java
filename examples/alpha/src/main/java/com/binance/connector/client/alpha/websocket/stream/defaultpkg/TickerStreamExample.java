package com.binance.connector.client.alpha.websocket.stream.defaultpkg;

import com.binance.connector.client.alpha.websocket.stream.AlphaWebSocketStreamsUtil;
import com.binance.connector.client.alpha.websocket.stream.api.AlphaWebSocketStreams;
import com.binance.connector.client.alpha.websocket.stream.model.TickerStreamRequest;
import com.binance.connector.client.alpha.websocket.stream.model.TickerStreamResponse;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;

/** API examples for DefaultApi */
public class TickerStreamExample {
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
     * Ticker Stream
     *
     * <p>Pushes full 24h rolling ticker statistics.
     *
     * @throws ApiException if the Api call fails
     */
    public void tickerStreamExample() throws ApiException, InterruptedException {
        TickerStreamRequest tickerStreamRequest = new TickerStreamRequest();
        StreamBlockingQueueWrapper<TickerStreamResponse> response =
                getApi().tickerStream(tickerStreamRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
