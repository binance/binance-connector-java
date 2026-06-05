package com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.websocketmarketstreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.DerivativesTradingCoinFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DerivativesTradingCoinFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.MarkPriceStreamRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.MarkPriceStreamResponse;

/** API examples for WebsocketMarketStreamsApi */
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
     * <p>Mark price update stream Update Speed: 3000ms OR 1000ms
     *
     * @throws ApiException if the Api call fails
     */
    public void markPriceStreamExample() throws ApiException, InterruptedException {
        MarkPriceStreamRequest markPriceStreamRequest = new MarkPriceStreamRequest();
        markPriceStreamRequest.symbol("btcusdt");
        StreamBlockingQueueWrapper<MarkPriceStreamResponse> response =
                getApi().markPriceStream(markPriceStreamRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
