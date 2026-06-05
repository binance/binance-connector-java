package com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.websocketmarketstreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.DerivativesTradingCoinFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DerivativesTradingCoinFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.IndividualSymbolBookTickerStreamsRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.IndividualSymbolBookTickerStreamsResponse;

/** API examples for WebsocketMarketStreamsApi */
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
     * specified symbol. Update Speed: Real-time
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
