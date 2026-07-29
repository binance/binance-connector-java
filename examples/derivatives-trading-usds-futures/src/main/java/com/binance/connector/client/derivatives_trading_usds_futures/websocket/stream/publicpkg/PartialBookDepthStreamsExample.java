package com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.publicpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.DerivativesTradingUsdsFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.DerivativesTradingUsdsFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.PartialBookDepthStreamsRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.PartialBookDepthStreamsResponse;

/** API examples for PublicApi */
public class PartialBookDepthStreamsExample {
    private DerivativesTradingUsdsFuturesWebSocketStreams api;

    public DerivativesTradingUsdsFuturesWebSocketStreams getApi() {
        if (api == null) {
            WebSocketClientConfiguration clientConfiguration =
                    DerivativesTradingUsdsFuturesWebSocketStreamsUtil.getClientConfiguration();
            api = new DerivativesTradingUsdsFuturesWebSocketStreams(clientConfiguration);
        }
        return api;
    }

    /**
     * Partial Book Depth Streams
     *
     * <p>Top &lt;levels&gt; bids and asks &gt; **After CM migration**, the payload is appended with
     * a new &#x60;st&#x60; field (&#x60;1&#x60; &#x3D; UM, &#x60;2&#x60; &#x3D; CM) and a new
     * &#x60;ps&#x60; field (pair symbol). Update Speed: 250ms or 500ms or 100ms Response Notes:
     * Retail Price Improvement (RPI) orders are not visible and excluded in the response message.
     *
     * @throws ApiException if the Api call fails
     */
    public void partialBookDepthStreamsExample() throws ApiException, InterruptedException {
        PartialBookDepthStreamsRequest partialBookDepthStreamsRequest =
                new PartialBookDepthStreamsRequest();
        StreamBlockingQueueWrapper<PartialBookDepthStreamsResponse> response =
                getApi().partialBookDepthStreams(partialBookDepthStreamsRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
