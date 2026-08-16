package com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.publicpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.DerivativesTradingUsdsFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.DerivativesTradingUsdsFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.AllBookTickersStreamRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.AllBookTickersStreamResponse;

/** API examples for PublicApi */
public class AllBookTickersStreamExample {
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
     * All Book Tickers Stream
     *
     * <p>Pushes any update to the best bid or ask&#39;s price or quantity in real-time for all
     * symbols. &gt; **After CM migration**, this stream pushes the merged UM + CM universe
     * (subscribable on both &#x60;fstream&#x60; and &#x60;dstream&#x60;); each payload is appended
     * with a new &#x60;st&#x60; field (&#x60;1&#x60; &#x3D; UM, &#x60;2&#x60; &#x3D; CM) and a new
     * &#x60;ps&#x60; field (pair symbol). Update Speed: 5s Response Notes: - Retail Price
     * Improvement(RPI) orders are not visible and excluded in the response message.
     *
     * @throws ApiException if the Api call fails
     */
    public void allBookTickersStreamExample() throws ApiException, InterruptedException {
        AllBookTickersStreamRequest allBookTickersStreamRequest = new AllBookTickersStreamRequest();
        StreamBlockingQueueWrapper<AllBookTickersStreamResponse> response =
                getApi().allBookTickersStream(allBookTickersStreamRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
