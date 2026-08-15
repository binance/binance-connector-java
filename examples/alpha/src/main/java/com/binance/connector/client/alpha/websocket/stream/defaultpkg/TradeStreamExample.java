package com.binance.connector.client.alpha.websocket.stream.defaultpkg;

import com.binance.connector.client.alpha.websocket.stream.AlphaWebSocketStreamsUtil;
import com.binance.connector.client.alpha.websocket.stream.api.AlphaWebSocketStreams;
import com.binance.connector.client.alpha.websocket.stream.model.TradeStreamRequest;
import com.binance.connector.client.alpha.websocket.stream.model.TradeStreamResponse;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;

/** API examples for DefaultApi */
public class TradeStreamExample {
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
     * Trade Stream
     *
     * <p>Pushes raw trade updates for a symbol.
     *
     * @throws ApiException if the Api call fails
     */
    public void tradeStreamExample() throws ApiException, InterruptedException {
        TradeStreamRequest tradeStreamRequest = new TradeStreamRequest();
        StreamBlockingQueueWrapper<TradeStreamResponse> response =
                getApi().tradeStream(tradeStreamRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
