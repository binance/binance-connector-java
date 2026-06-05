package com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.market;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.DerivativesTradingUsdsFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.DerivativesTradingUsdsFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.MultiAssetsModeAssetIndexRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.MultiAssetsModeAssetIndexResponse;

/** API examples for MarketApi */
public class MultiAssetsModeAssetIndexExample {
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
     * Multi-Assets Mode Asset Index
     *
     * <p>Asset index for multi-assets mode user Update Speed: 1s
     *
     * @throws ApiException if the Api call fails
     */
    public void multiAssetsModeAssetIndexExample() throws ApiException, InterruptedException {
        MultiAssetsModeAssetIndexRequest multiAssetsModeAssetIndexRequest =
                new MultiAssetsModeAssetIndexRequest();
        StreamBlockingQueueWrapper<MultiAssetsModeAssetIndexResponse> response =
                getApi().multiAssetsModeAssetIndex(multiAssetsModeAssetIndexRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
