package com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.DerivativesTradingCoinFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DerivativesTradingCoinFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.MarketLiquidationOrderStreamsRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.MarketLiquidationOrderStreamsResponse;

/** API examples for DefaultApi */
public class MarketLiquidationOrderStreamsExample {
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
     * Market Liquidation Order Streams
     *
     * <p>The Liquidation Order Snapshot Streams push force liquidation order information for
     * specific symbol. For each symbol，only the latest one liquidation order within 1000ms will be
     * pushed as the snapshot. If no liquidation happens in the interval of 1000ms, no stream will
     * be pushed. Update Speed: 1000ms
     *
     * @throws ApiException if the Api call fails
     */
    public void marketLiquidationOrderStreamsExample() throws ApiException, InterruptedException {
        MarketLiquidationOrderStreamsRequest marketLiquidationOrderStreamsRequest =
                new MarketLiquidationOrderStreamsRequest();
        StreamBlockingQueueWrapper<MarketLiquidationOrderStreamsResponse> response =
                getApi().marketLiquidationOrderStreams(marketLiquidationOrderStreamsRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
