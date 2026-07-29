package com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.DerivativesTradingCoinFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DerivativesTradingCoinFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.MarkPriceStreamRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.MarkPriceStreamResponse;

/** API examples for DefaultApi */
public class MarkPriceStreamExample {
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
     * Mark Price Stream
     *
     * <p>Mark price update stream &gt; **After CM migration**, the payload is appended with a new
     * &#x60;st&#x60; field (&#x60;1&#x60; &#x3D; UM, &#x60;2&#x60; &#x3D; CM); both
     * &#x60;fstream&#x60; and &#x60;dstream&#x60; may subscribe to either UM or CM symbols on this
     * stream. Update Speed: 3000ms OR 1000ms
     *
     * @throws ApiException if the Api call fails
     */
    public void markPriceStreamExample() throws ApiException, InterruptedException {
        MarkPriceStreamRequest markPriceStreamRequest = new MarkPriceStreamRequest();
        StreamBlockingQueueWrapper<MarkPriceStreamResponse> response =
                getApi().markPriceStream(markPriceStreamRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
