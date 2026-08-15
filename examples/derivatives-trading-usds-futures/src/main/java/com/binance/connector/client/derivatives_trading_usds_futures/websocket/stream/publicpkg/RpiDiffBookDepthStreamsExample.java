package com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.publicpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.DerivativesTradingUsdsFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.DerivativesTradingUsdsFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.RpiDiffBookDepthStreamsRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.RpiDiffBookDepthStreamsResponse;

/** API examples for PublicApi */
public class RpiDiffBookDepthStreamsExample {
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
     * RPI Diff. Book Depth Streams
     *
     * <p>Bids and asks including RPI orders, pushed every 500 milliseconds &gt; **After CM
     * migration**, the payload is appended with a new &#x60;st&#x60; field (&#x60;1&#x60; &#x3D;
     * UM, &#x60;2&#x60; &#x3D; CM) and a new &#x60;ps&#x60; field (pair symbol). Update Speed:
     * 500ms Response Notes: - RPI(Retail Price Improvement) orders are included and aggreated in
     * the response message. When the quantity of a price level to be updated is equal to 0, it
     * means either all quotations for this price have been filled/canceled, or the quantity of
     * crossed RPI orders for this price are hidden
     *
     * @throws ApiException if the Api call fails
     */
    public void rpiDiffBookDepthStreamsExample() throws ApiException, InterruptedException {
        RpiDiffBookDepthStreamsRequest rpiDiffBookDepthStreamsRequest =
                new RpiDiffBookDepthStreamsRequest();
        StreamBlockingQueueWrapper<RpiDiffBookDepthStreamsResponse> response =
                getApi().rpiDiffBookDepthStreams(rpiDiffBookDepthStreamsRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
