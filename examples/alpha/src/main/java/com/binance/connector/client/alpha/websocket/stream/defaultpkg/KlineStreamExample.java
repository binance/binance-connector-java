package com.binance.connector.client.alpha.websocket.stream.defaultpkg;

import com.binance.connector.client.alpha.websocket.stream.AlphaWebSocketStreamsUtil;
import com.binance.connector.client.alpha.websocket.stream.api.AlphaWebSocketStreams;
import com.binance.connector.client.alpha.websocket.stream.model.KlineStreamRequest;
import com.binance.connector.client.alpha.websocket.stream.model.KlineStreamResponse;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;

/** API examples for DefaultApi */
public class KlineStreamExample {
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
     * Kline Stream
     *
     * <p>Pushes kline updates for a symbol.
     *
     * @throws ApiException if the Api call fails
     */
    public void klineStreamExample() throws ApiException, InterruptedException {
        KlineStreamRequest klineStreamRequest = new KlineStreamRequest();
        StreamBlockingQueueWrapper<KlineStreamResponse> response =
                getApi().klineStream(klineStreamRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
