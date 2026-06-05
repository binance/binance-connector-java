package com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.websocketmarketstreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.DerivativesTradingCoinFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DerivativesTradingCoinFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.AllMarketTickersStreamsRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.AllMarketTickersStreamsResponse;

/** API examples for WebsocketMarketStreamsApi */
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
     * that have changed will be present in the array. Update Speed: 1000ms
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
