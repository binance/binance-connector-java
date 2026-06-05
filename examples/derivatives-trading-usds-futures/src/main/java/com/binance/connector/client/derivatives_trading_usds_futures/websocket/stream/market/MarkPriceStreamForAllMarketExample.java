package com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.market;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.DerivativesTradingUsdsFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.DerivativesTradingUsdsFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.MarkPriceStreamForAllMarketRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.MarkPriceStreamForAllMarketResponse;

/** API examples for MarketApi */
public class MarkPriceStreamForAllMarketExample {
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
     * Mark Price Stream for All market
     *
     * <p>Mark price and funding rate for all symbols pushed every 3 seconds or every second.
     * **Note**: TradFi symbols will be pushed through a seperate message. Update Speed: 3000ms or
     * 1000ms
     *
     * @throws ApiException if the Api call fails
     */
    public void markPriceStreamForAllMarketExample() throws ApiException, InterruptedException {
        MarkPriceStreamForAllMarketRequest markPriceStreamForAllMarketRequest =
                new MarkPriceStreamForAllMarketRequest();
        StreamBlockingQueueWrapper<MarkPriceStreamForAllMarketResponse> response =
                getApi().markPriceStreamForAllMarket(markPriceStreamForAllMarketRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
