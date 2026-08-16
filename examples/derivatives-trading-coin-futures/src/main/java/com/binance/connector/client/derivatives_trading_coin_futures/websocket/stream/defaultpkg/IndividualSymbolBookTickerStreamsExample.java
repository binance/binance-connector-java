package com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.DerivativesTradingCoinFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DerivativesTradingCoinFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.IndividualSymbolBookTickerStreamsRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.IndividualSymbolBookTickerStreamsResponse;

/** API examples for DefaultApi */
public class IndividualSymbolBookTickerStreamsExample {
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
     * Individual Symbol Book Ticker Streams
     *
     * <p>Pushes any update to the best bid or ask&#39;s price or quantity in real-time for a
     * specified symbol. &gt; **After CM migration**, the payload is appended with a new
     * &#x60;st&#x60; field (&#x60;1&#x60; &#x3D; UM, &#x60;2&#x60; &#x3D; CM). Update Speed:
     * Real-time
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
