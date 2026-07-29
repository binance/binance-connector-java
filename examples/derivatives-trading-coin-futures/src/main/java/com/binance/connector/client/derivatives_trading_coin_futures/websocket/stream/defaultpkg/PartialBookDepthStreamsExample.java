package com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.DerivativesTradingCoinFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DerivativesTradingCoinFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.PartialBookDepthStreamsRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.PartialBookDepthStreamsResponse;

/** API examples for DefaultApi */
public class PartialBookDepthStreamsExample {
    private DerivativesTradingCoinFuturesWebSocketStreams api;

    public DerivativesTradingCoinFuturesWebSocketStreams getApi() {
        if (api == null) {
            WebSocketClientConfiguration clientConfiguration =
                    DerivativesTradingCoinFuturesWebSocketStreamsUtil.getClientConfiguration();
            api = new DerivativesTradingCoinFuturesWebSocketStreams(clientConfiguration);
        }
        return api;
    }

    /**
     * Partial Book Depth Streams
     *
     * <p>Top levels bids and asks. &gt; **After CM migration**, the payload is appended with a new
     * &#x60;st&#x60; field (&#x60;1&#x60; &#x3D; UM, &#x60;2&#x60; &#x3D; CM). Update Speed: 250ms,
     * 500ms or 100ms
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
