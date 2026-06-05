package com.binance.connector.client.spot.websocket.stream.websocketstreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.spot.websocket.stream.SpotWebSocketStreamsUtil;
import com.binance.connector.client.spot.websocket.stream.api.SpotWebSocketStreams;
import com.binance.connector.client.spot.websocket.stream.model.Interval;
import com.binance.connector.client.spot.websocket.stream.model.KlineOffsetRequest;
import com.binance.connector.client.spot.websocket.stream.model.KlineOffsetResponse;

/** API examples for WebSocketStreamsApi */
public class KlineOffsetExample {
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
     * WebSocket Kline/Candlestick Streams with timezone offset
     *
     * <p>The Kline/Candlestick Stream push updates to the current klines/candlestick every second
     * in &#x60;UTC+8&#x60; timezone
     *
     * @throws ApiException if the Api call fails
     */
    public void klineOffsetExample() throws ApiException, InterruptedException {
        KlineOffsetRequest klineOffsetRequest = new KlineOffsetRequest();
        klineOffsetRequest.symbol("bnbusdt");
        klineOffsetRequest.interval(Interval.INTERVAL_1s);
        StreamBlockingQueueWrapper<KlineOffsetResponse> response =
                getApi().klineOffset(klineOffsetRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
