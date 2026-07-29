package com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.DerivativesTradingCoinFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DerivativesTradingCoinFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.IndividualSymbolTickerStreamsRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.IndividualSymbolTickerStreamsResponse;

/** API examples for DefaultApi */
public class IndividualSymbolTickerStreamsExample {
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
     * Individual Symbol Ticker Streams
     *
     * <p>24hr rolling window ticker statistics for a single symbol. These are NOT the statistics of
     * the UTC day, but a 24hr rolling window from requestTime to 24hrs before. &gt; **After CM
     * migration**, the payload is appended with a new &#x60;st&#x60; field (&#x60;1&#x60; &#x3D;
     * UM, &#x60;2&#x60; &#x3D; CM). Update Speed: 500ms
     *
     * @throws ApiException if the Api call fails
     */
    public void individualSymbolTickerStreamsExample() throws ApiException, InterruptedException {
        IndividualSymbolTickerStreamsRequest individualSymbolTickerStreamsRequest =
                new IndividualSymbolTickerStreamsRequest();
        StreamBlockingQueueWrapper<IndividualSymbolTickerStreamsResponse> response =
                getApi().individualSymbolTickerStreams(individualSymbolTickerStreamsRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
