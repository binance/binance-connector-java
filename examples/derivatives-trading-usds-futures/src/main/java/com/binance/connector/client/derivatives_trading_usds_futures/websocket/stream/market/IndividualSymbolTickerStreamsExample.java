package com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.market;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.DerivativesTradingUsdsFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.DerivativesTradingUsdsFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.IndividualSymbolTickerStreamsRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.IndividualSymbolTickerStreamsResponse;

/** API examples for MarketApi */
public class IndividualSymbolTickerStreamsExample {
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
     * Individual Symbol Ticker Streams
     *
     * <p>24hr rolling window ticker statistics for a single symbol. These are NOT the statistics of
     * the UTC day, but a 24hr rolling window from requestTime to 24hrs before. Update Speed: 2000ms
     *
     * @throws ApiException if the Api call fails
     */
    public void individualSymbolTickerStreamsExample() throws ApiException, InterruptedException {
        IndividualSymbolTickerStreamsRequest individualSymbolTickerStreamsRequest =
                new IndividualSymbolTickerStreamsRequest();
        individualSymbolTickerStreamsRequest.symbol("btcusdt");
        StreamBlockingQueueWrapper<IndividualSymbolTickerStreamsResponse> response =
                getApi().individualSymbolTickerStreams(individualSymbolTickerStreamsRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
