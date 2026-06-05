package com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.publicpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.DerivativesTradingUsdsFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.DerivativesTradingUsdsFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.DiffBookDepthStreamsRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.DiffBookDepthStreamsResponse;

/** API examples for PublicApi */
public class DiffBookDepthStreamsExample {
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
     * Diff. Book Depth Streams
     *
     * <p>Bids and asks, pushed every 250 milliseconds, 500 milliseconds, 100 milliseconds (if
     * existing) Retail Price Improvement(RPI) orders are not visible and excluded in the response
     * message. Update Speed: 250ms, 500ms, 100ms
     *
     * @throws ApiException if the Api call fails
     */
    public void diffBookDepthStreamsExample() throws ApiException, InterruptedException {
        DiffBookDepthStreamsRequest diffBookDepthStreamsRequest = new DiffBookDepthStreamsRequest();
        diffBookDepthStreamsRequest.symbol("btcusdt");
        StreamBlockingQueueWrapper<DiffBookDepthStreamsResponse> response =
                getApi().diffBookDepthStreams(diffBookDepthStreamsRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
