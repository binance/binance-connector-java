package com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.market;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.DerivativesTradingUsdsFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.DerivativesTradingUsdsFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.AllMarketLiquidationOrderStreamsRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.AllMarketLiquidationOrderStreamsResponse;

/** API examples for MarketApi */
public class AllMarketLiquidationOrderStreamsExample {
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
     * All Market Liquidation Order Streams
     *
     * <p>The All Liquidation Order Snapshot Streams push force liquidation order information for
     * all symbols in the market. For each symbol，only the largest one liquidation order within
     * 1000ms will be pushed as the snapshot. If no liquidation happens in the interval of 1000ms,
     * no stream will be pushed. Update Speed: 1000ms
     *
     * @throws ApiException if the Api call fails
     */
    public void allMarketLiquidationOrderStreamsExample()
            throws ApiException, InterruptedException {
        AllMarketLiquidationOrderStreamsRequest allMarketLiquidationOrderStreamsRequest =
                new AllMarketLiquidationOrderStreamsRequest();
        StreamBlockingQueueWrapper<AllMarketLiquidationOrderStreamsResponse> response =
                getApi().allMarketLiquidationOrderStreams(allMarketLiquidationOrderStreamsRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
