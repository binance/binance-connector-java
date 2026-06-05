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
     * specified symbol. Retail Price Improvement(RPI) orders are not visible and excluded in the
     * response message. Update Speed: Real-time
     *
     * @throws ApiException if the Api call fails
     */
    public void individualSymbolBookTickerStreamsExample()
            throws ApiException, InterruptedException {
        IndividualSymbolBookTickerStreamsRequest individualSymbolBookTickerStreamsRequest =
                new IndividualSymbolBookTickerStreamsRequest();
        individualSymbolBookTickerStreamsRequest.symbol("btcusdt");
        StreamBlockingQueueWrapper<IndividualSymbolBookTickerStreamsResponse> response =
                getApi().individualSymbolBookTickerStreams(
                                individualSymbolBookTickerStreamsRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
