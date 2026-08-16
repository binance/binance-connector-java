package com.binance.connector.client.spot.websocket.stream.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.spot.websocket.stream.SpotWebSocketStreamsUtil;
import com.binance.connector.client.spot.websocket.stream.api.SpotWebSocketStreams;
import com.binance.connector.client.spot.websocket.stream.model.KlineRequest;
import com.binance.connector.client.spot.websocket.stream.model.KlineResponse;

/** API examples for DefaultApi */
public class KlineExample {
    private SpotWebSocketStreams api;

    public SpotWebSocketStreams getApi() {
        if (api == null) {
            WebSocketClientConfiguration clientConfiguration =
                    SpotWebSocketStreamsUtil.getClientConfiguration();
            api = new SpotWebSocketStreams(clientConfiguration);
        }
        return api;
    }

    /**
     * Kline/Candlestick Streams for UTC
     *
     * <p>The Kline/Candlestick Stream push updates to the current klines/candlestick every second
     * in &#x60;UTC+0&#x60; timezone Update Speed: 1000ms for &#x60;1s&#x60;, 2000ms for the other
     * intervals
     *
     * @throws ApiException if the Api call fails
     */
    public void klineExample() throws ApiException, InterruptedException {
        KlineRequest klineRequest = new KlineRequest();
        StreamBlockingQueueWrapper<KlineResponse> response = getApi().kline(klineRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
