package com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.market;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.DerivativesTradingUsdsFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.DerivativesTradingUsdsFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.LiquidationOrderStreamsRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.LiquidationOrderStreamsResponse;

/** API examples for MarketApi */
public class LiquidationOrderStreamsExample {
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
     * Liquidation Order Streams
     *
     * <p>The Liquidation Order Snapshot Streams push force liquidation order information for
     * specific symbol. For each symbol，only the largest one liquidation order within 1000ms will be
     * pushed as the snapshot. If no liquidation happens in the interval of 1000ms, no stream will
     * be pushed. Update Speed: 1000ms
     *
     * @throws ApiException if the Api call fails
     */
    public void liquidationOrderStreamsExample() throws ApiException, InterruptedException {
        LiquidationOrderStreamsRequest liquidationOrderStreamsRequest =
                new LiquidationOrderStreamsRequest();
        liquidationOrderStreamsRequest.symbol("btcusdt");
        StreamBlockingQueueWrapper<LiquidationOrderStreamsResponse> response =
                getApi().liquidationOrderStreams(liquidationOrderStreamsRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
