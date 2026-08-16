package com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.market;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.DerivativesTradingUsdsFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.DerivativesTradingUsdsFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.AllMarketMiniTickersStreamRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.AllMarketMiniTickersStreamResponse;

/** API examples for MarketApi */
public class AllMarketMiniTickersStreamExample {
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
     * All Market Mini Tickers Stream
     *
     * <p>24hr rolling window mini-ticker statistics for all symbols. These are NOT the statistics
     * of the UTC day, but a 24hr rolling window from requestTime to 24hrs before. Note that only
     * tickers that have changed will be present in the array. &gt; **After CM migration**, this
     * stream pushes the merged UM + CM universe (subscribable on both &#x60;fstream&#x60; and
     * &#x60;dstream&#x60;); each payload is appended with a new &#x60;st&#x60; field (&#x60;1&#x60;
     * &#x3D; UM, &#x60;2&#x60; &#x3D; CM) and a new &#x60;ps&#x60; field (pair symbol). Update
     * Speed: 1000ms
     *
     * @throws ApiException if the Api call fails
     */
    public void allMarketMiniTickersStreamExample() throws ApiException, InterruptedException {
        AllMarketMiniTickersStreamRequest allMarketMiniTickersStreamRequest =
                new AllMarketMiniTickersStreamRequest();
        StreamBlockingQueueWrapper<AllMarketMiniTickersStreamResponse> response =
                getApi().allMarketMiniTickersStream(allMarketMiniTickersStreamRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
