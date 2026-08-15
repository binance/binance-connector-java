package com.binance.connector.client.alpha.websocket.stream.defaultpkg;

import com.binance.connector.client.alpha.websocket.stream.AlphaWebSocketStreamsUtil;
import com.binance.connector.client.alpha.websocket.stream.api.AlphaWebSocketStreams;
import com.binance.connector.client.alpha.websocket.stream.model.AggregateTradeStreamRequest;
import com.binance.connector.client.alpha.websocket.stream.model.AggregateTradeStreamResponse;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;

/** API examples for DefaultApi */
public class AggregateTradeStreamExample {
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
     * Aggregate Trade Stream
     *
     * <p>Pushes aggregate trade updates for a symbol.
     *
     * @throws ApiException if the Api call fails
     */
    public void aggregateTradeStreamExample() throws ApiException, InterruptedException {
        AggregateTradeStreamRequest aggregateTradeStreamRequest = new AggregateTradeStreamRequest();
        StreamBlockingQueueWrapper<AggregateTradeStreamResponse> response =
                getApi().aggregateTradeStream(aggregateTradeStreamRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
