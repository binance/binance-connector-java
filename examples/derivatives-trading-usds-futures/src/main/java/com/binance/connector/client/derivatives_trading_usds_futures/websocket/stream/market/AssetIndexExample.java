package com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.market;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.DerivativesTradingUsdsFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.DerivativesTradingUsdsFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.AssetIndexRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.AssetIndexResponse;

/** API examples for MarketApi */
public class AssetIndexExample {
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
     * <p>Asset index price. Subscribe with &#x60;!assetIndex@arr&#x60; for all assets, or
     * &#x60;&lt;assetSymbol&gt;@assetIndex&#x60; for a specific asset. &gt; **CM-UM Integration
     * (Effective 2026-06-30):** Renamed from *Multi-Assets Mode Asset Index*. The stream
     * &#x60;!assetIndex@arr&#x60; now additionally pushes COIN-M settlement-asset price index
     * entries (e.g., &#x60;BTCUSD&#x60;, &#x60;ETHUSD&#x60;, &#x60;BNBUSD&#x60;). The on-the-wire
     * stream key is unchanged; existing subscriptions continue to work. Update Speed: 1s
     *
     * @throws ApiException if the Api call fails
     */
    public void assetIndexExample() throws ApiException, InterruptedException {
        AssetIndexRequest assetIndexRequest = new AssetIndexRequest();
        StreamBlockingQueueWrapper<AssetIndexResponse> response =
                getApi().assetIndex(assetIndexRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
