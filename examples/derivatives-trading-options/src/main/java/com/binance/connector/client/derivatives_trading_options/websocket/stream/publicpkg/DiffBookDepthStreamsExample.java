package com.binance.connector.client.derivatives_trading_options.websocket.stream.publicpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.DerivativesTradingOptionsWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.api.DerivativesTradingOptionsWebSocketStreams;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.DiffBookDepthStreamsRequest;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.DiffBookDepthStreamsResponse;

/** API examples for PublicApi */
public class DiffBookDepthStreamsExample {
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
     * Diff Book Depth Streams
     *
     * <p>Bids and asks, pushed every 500 milliseconds, 100 milliseconds (if existing) Update Speed:
     * 100ms or 500ms
     *
     * @throws ApiException if the Api call fails
     */
    public void diffBookDepthStreamsExample() throws ApiException, InterruptedException {
        DiffBookDepthStreamsRequest diffBookDepthStreamsRequest = new DiffBookDepthStreamsRequest();
        diffBookDepthStreamsRequest.symbol("btcusdt");
        StreamBlockingQueueWrapper<DiffBookDepthStreamsResponse> response =
                getApi().diffBookDepthStreams(diffBookDepthStreamsRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
