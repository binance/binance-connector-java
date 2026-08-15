package com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.DerivativesTradingCoinFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DerivativesTradingCoinFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.DiffBookDepthStreamsRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.DiffBookDepthStreamsResponse;

/** API examples for DefaultApi */
public class DiffBookDepthStreamsExample {
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
     * Diff. Book Depth Streams
     *
     * <p>Bids and asks, pushed every 250 milliseconds, 500 milliseconds, or 100 milliseconds &gt;
     * **After CM migration**, the payload is appended with a new &#x60;st&#x60; field
     * (&#x60;1&#x60; &#x3D; UM, &#x60;2&#x60; &#x3D; CM). Update Speed: 250ms or 500ms or 100ms
     *
     * @throws ApiException if the Api call fails
     */
    public void diffBookDepthStreamsExample() throws ApiException, InterruptedException {
        DiffBookDepthStreamsRequest diffBookDepthStreamsRequest = new DiffBookDepthStreamsRequest();
        StreamBlockingQueueWrapper<DiffBookDepthStreamsResponse> response =
                getApi().diffBookDepthStreams(diffBookDepthStreamsRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
