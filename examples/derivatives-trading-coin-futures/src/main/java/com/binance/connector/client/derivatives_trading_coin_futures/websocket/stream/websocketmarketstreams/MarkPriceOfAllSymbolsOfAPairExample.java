package com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.websocketmarketstreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.DerivativesTradingCoinFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DerivativesTradingCoinFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.MarkPriceOfAllSymbolsOfAPairRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.MarkPriceOfAllSymbolsOfAPairResponse;

/** API examples for WebsocketMarketStreamsApi */
public class MarkPriceOfAllSymbolsOfAPairExample {
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
     * Mark Price of All Symbols of a Pair
     *
     * <p>Mark Price of All Symbols of a Pair Update Speed: 3000ms OR 1000ms
     *
     * @throws ApiException if the Api call fails
     */
    public void markPriceOfAllSymbolsOfAPairExample() throws ApiException, InterruptedException {
        MarkPriceOfAllSymbolsOfAPairRequest markPriceOfAllSymbolsOfAPairRequest =
                new MarkPriceOfAllSymbolsOfAPairRequest();
        markPriceOfAllSymbolsOfAPairRequest.pair("btcusdt");
        StreamBlockingQueueWrapper<MarkPriceOfAllSymbolsOfAPairResponse> response =
                getApi().markPriceOfAllSymbolsOfAPair(markPriceOfAllSymbolsOfAPairRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
