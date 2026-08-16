package com.binance.connector.client.spot.websocket.stream.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.spot.websocket.stream.SpotWebSocketStreamsUtil;
import com.binance.connector.client.spot.websocket.stream.api.SpotWebSocketStreams;
import com.binance.connector.client.spot.websocket.stream.model.RollingWindowTickerRequest;
import com.binance.connector.client.spot.websocket.stream.model.RollingWindowTickerResponse;

/** API examples for DefaultApi */
public class RollingWindowTickerExample {
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
     * Individual Symbol Rolling Window Statistics Streams
     *
     * <p>Rolling window ticker statistics for a single symbol, computed over multiple windows.
     * **Note:** This stream is different from the &#x60;&lt;symbol&gt;@ticker&#x60; stream. The
     * open time &#x60;\&quot;O\&quot;&#x60; always starts on a minute, while the closing time
     * &#x60;\&quot;C\&quot;&#x60; is the current time of the update. As such, the effective window
     * might be up to 59999ms wider than &#x60;&lt;window_size&gt;&#x60;. Update Speed: 1000ms
     *
     * @throws ApiException if the Api call fails
     */
    public void rollingWindowTickerExample() throws ApiException, InterruptedException {
        RollingWindowTickerRequest rollingWindowTickerRequest = new RollingWindowTickerRequest();
        StreamBlockingQueueWrapper<RollingWindowTickerResponse> response =
                getApi().rollingWindowTicker(rollingWindowTickerRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
