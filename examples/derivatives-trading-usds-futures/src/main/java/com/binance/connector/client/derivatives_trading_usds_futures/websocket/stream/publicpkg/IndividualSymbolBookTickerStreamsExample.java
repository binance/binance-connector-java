package com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.publicpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.DerivativesTradingUsdsFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.DerivativesTradingUsdsFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.IndividualSymbolBookTickerStreamsRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.IndividualSymbolBookTickerStreamsResponse;

/** API examples for PublicApi */
public class IndividualSymbolBookTickerStreamsExample {
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
     * Individual Symbol Book Ticker Streams
     *
     * <p>Pushes any update to the best bid or ask&#39;s price or quantity in real-time for a
     * specified symbol. &gt; **After CM migration**, the payload is appended with a new
     * &#x60;st&#x60; field (&#x60;1&#x60; &#x3D; UM, &#x60;2&#x60; &#x3D; CM). Update Speed:
     * Real-time Response Notes: Retail Price Improvement (RPI) orders are not visible and excluded
     * in the response message.
     *
     * @throws ApiException if the Api call fails
     */
    public void individualSymbolBookTickerStreamsExample()
            throws ApiException, InterruptedException {
        IndividualSymbolBookTickerStreamsRequest individualSymbolBookTickerStreamsRequest =
                new IndividualSymbolBookTickerStreamsRequest();
        StreamBlockingQueueWrapper<IndividualSymbolBookTickerStreamsResponse> response =
                getApi().individualSymbolBookTickerStreams(
                                individualSymbolBookTickerStreamsRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
