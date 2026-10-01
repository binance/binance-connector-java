package com.binance.connector.client.spot.websocket.stream.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.spot.websocket.stream.SpotWebSocketStreamsUtil;
import com.binance.connector.client.spot.websocket.stream.api.SpotWebSocketStreams;
import com.binance.connector.client.spot.websocket.stream.model.KlineOffsetRequest;
import com.binance.connector.client.spot.websocket.stream.model.KlineOffsetResponse;

/** API examples for DefaultApi */
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
     * Kline/Candlestick Streams with timezone offset
     *
     * <p>The Kline/Candlestick Stream push updates to the current klines/candlestick every second
     * in &#x60;UTC+8&#x60; timezone **Kline/Candlestick chart intervals:** Supported intervals: See
     * Kline/Candlestick chart intervals **UTC+8 timezone offset:** - Kline intervals open and close
     * in the &#x60;UTC+8&#x60; timezone. For example the &#x60;1d&#x60; klines will open at the
     * beginning of the &#x60;UTC+8&#x60; day, and close at the end of the &#x60;UTC+8&#x60; day. -
     * Note that &#x60;E&#x60; (event time), &#x60;t&#x60; (start time) and &#x60;T&#x60; (close
     * time) in the payload are Unix timestamps, which are always interpreted in UTC. Update Speed:
     * 1000ms for &#x60;1s&#x60;, 2000ms for the other intervals
     *
     * @throws ApiException if the Api call fails
     */
    public void klineOffsetExample() throws ApiException, InterruptedException {
        KlineOffsetRequest klineOffsetRequest = new KlineOffsetRequest();
        StreamBlockingQueueWrapper<KlineOffsetResponse> response =
                getApi().klineOffset(klineOffsetRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
