package com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.market;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.DerivativesTradingUsdsFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.DerivativesTradingUsdsFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.MarkPriceStreamRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.MarkPriceStreamResponse;

/** API examples for MarketApi */
public class MarkPriceStreamExample {
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
     * Mark Price Stream
     *
     * <p>Mark price and funding rate for a single symbol pushed every 3 seconds or every second.
     * Update Speed: 3000ms or 1000ms
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
