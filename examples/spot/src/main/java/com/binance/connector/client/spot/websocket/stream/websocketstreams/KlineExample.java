package com.binance.connector.client.spot.websocket.stream.websocketstreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.spot.websocket.stream.SpotWebSocketStreamsUtil;
import com.binance.connector.client.spot.websocket.stream.api.SpotWebSocketStreams;
import com.binance.connector.client.spot.websocket.stream.model.Interval;
import com.binance.connector.client.spot.websocket.stream.model.KlineRequest;
import com.binance.connector.client.spot.websocket.stream.model.KlineResponse;

/** API examples for WebSocketStreamsApi */
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
     * WebSocket Kline/Candlestick Streams for UTC
     *
     * <p>The Kline/Candlestick Stream push updates to the current klines/candlestick every second
     * in &#x60;UTC+0&#x60; timezone &lt;a id&#x3D;\&quot;kline-intervals\&quot;&gt;&lt;/a&gt;
     *
     * @throws ApiException if the Api call fails
     */
    public void klineExample() throws ApiException, InterruptedException {
        KlineRequest klineRequest = new KlineRequest();
        klineRequest.symbol("bnbusdt");
        klineRequest.interval(Interval.INTERVAL_1s);
        StreamBlockingQueueWrapper<KlineResponse> response = getApi().kline(klineRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
