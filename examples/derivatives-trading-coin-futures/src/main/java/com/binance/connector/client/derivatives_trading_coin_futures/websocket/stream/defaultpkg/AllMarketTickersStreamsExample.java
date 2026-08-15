package com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.DerivativesTradingCoinFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DerivativesTradingCoinFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.AllMarketTickersStreamsRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.AllMarketTickersStreamsResponse;

/** API examples for DefaultApi */
public class AllMarketTickersStreamsExample {
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
     * All Market Tickers Streams
     *
     * <p>24hr rolling window ticker statistics for all symbols. These are NOT the statistics of the
     * UTC day, but a 24hr rolling window from requestTime to 24hrs before. Note that only tickers
     * that have changed will be present in the array. &gt; **After CM migration**, this stream
     * pushes the merged UM + CM universe (subscribable on both &#x60;fstream&#x60; and
     * &#x60;dstream&#x60;); each payload is appended with a new &#x60;st&#x60; field (&#x60;1&#x60;
     * &#x3D; UM, &#x60;2&#x60; &#x3D; CM). Update Speed: 1000ms
     *
     * @throws ApiException if the Api call fails
     */
    public void allMarketTickersStreamsExample() throws ApiException, InterruptedException {
        AllMarketTickersStreamsRequest allMarketTickersStreamsRequest =
                new AllMarketTickersStreamsRequest();
        StreamBlockingQueueWrapper<AllMarketTickersStreamsResponse> response =
                getApi().allMarketTickersStreams(allMarketTickersStreamsRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
