package com.binance.connector.client.derivatives_trading_options.websocket.stream.publicpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.DerivativesTradingOptionsWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.api.DerivativesTradingOptionsWebSocketStreams;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.PartialBookDepthStreamsRequest;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.PartialBookDepthStreamsResponse;

/** API examples for PublicApi */
public class PartialBookDepthStreamsExample {
    private DerivativesTradingOptionsWebSocketStreams api;

    public DerivativesTradingOptionsWebSocketStreams getApi() {
        if (api == null) {
            WebSocketClientConfiguration clientConfiguration =
                    DerivativesTradingOptionsWebSocketStreamsUtil.getClientConfiguration();
            api = new DerivativesTradingOptionsWebSocketStreams(clientConfiguration);
        }
        return api;
    }

    /**
     * Partial Book Depth Streams
     *
     * <p>Top **&lt;levels\\&gt;** bids and asks, Valid levels are **&lt;levels\\&gt;** are 5, 10,
     * 20. Update Speed: 100ms or 500ms
     *
     * @throws ApiException if the Api call fails
     */
    public void partialBookDepthStreamsExample() throws ApiException, InterruptedException {
        PartialBookDepthStreamsRequest partialBookDepthStreamsRequest =
                new PartialBookDepthStreamsRequest();
        partialBookDepthStreamsRequest.symbol("btcusdt");
        partialBookDepthStreamsRequest.level("example_value");
        StreamBlockingQueueWrapper<PartialBookDepthStreamsResponse> response =
                getApi().partialBookDepthStreams(partialBookDepthStreamsRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
