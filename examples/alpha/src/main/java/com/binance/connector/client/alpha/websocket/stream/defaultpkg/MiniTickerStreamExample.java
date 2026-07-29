package com.binance.connector.client.alpha.websocket.stream.defaultpkg;

import com.binance.connector.client.alpha.websocket.stream.AlphaWebSocketStreamsUtil;
import com.binance.connector.client.alpha.websocket.stream.api.AlphaWebSocketStreams;
import com.binance.connector.client.alpha.websocket.stream.model.MiniTickerStreamRequest;
import com.binance.connector.client.alpha.websocket.stream.model.MiniTickerStreamResponse;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;

/** API examples for DefaultApi */
public class MiniTickerStreamExample {
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
     * Mini Ticker Stream
     *
     * <p>Pushes 24h rolling mini ticker statistics.
     *
     * @throws ApiException if the Api call fails
     */
    public void miniTickerStreamExample() throws ApiException, InterruptedException {
        MiniTickerStreamRequest miniTickerStreamRequest = new MiniTickerStreamRequest();
        StreamBlockingQueueWrapper<MiniTickerStreamResponse> response =
                getApi().miniTickerStream(miniTickerStreamRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
