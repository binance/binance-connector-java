package com.binance.connector.client.derivatives_trading_options.websocket.stream.publicpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.DerivativesTradingOptionsWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.api.DerivativesTradingOptionsWebSocketStreams;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.IndividualSymbolBookTickerStreamsRequest;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.IndividualSymbolBookTickerStreamsResponse;

/** API examples for PublicApi */
public class IndividualSymbolBookTickerStreamsExample {
    private DerivativesTradingOptionsWebSocketStreams api;

    public DerivativesTradingOptionsWebSocketStreams getApi() {
        if (api == null) {
            WebSocketClientConfiguration clientConfiguration =
                    DerivativesTradingOptionsWebSocketStreamsUtil.getClientConfiguration();
            api = new DerivativesTradingOptionsWebSocketStreams(clientConfiguration);
        }
        return api;
    }

    /**
     * Individual Symbol Book Ticker Streams
     *
     * <p>Pushes any update to the best bid or ask&#39;s price or quantity in real-time for a
     * specified symbol. Update Speed: Real-Time
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
