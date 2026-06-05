package com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.websocketmarketstreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.DerivativesTradingCoinFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DerivativesTradingCoinFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.ContinuousContractKlineCandlestickStreamsRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.ContinuousContractKlineCandlestickStreamsResponse;

/** API examples for WebsocketMarketStreamsApi */
public class ContinuousContractKlineCandlestickStreamsExample {
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
     * Continuous Contract Kline/Candlestick Streams
     *
     * <p>Kline update every second Update Speed: 250ms
     *
     * @throws ApiException if the Api call fails
     */
    public void continuousContractKlineCandlestickStreamsExample()
            throws ApiException, InterruptedException {
        ContinuousContractKlineCandlestickStreamsRequest
                continuousContractKlineCandlestickStreamsRequest =
                        new ContinuousContractKlineCandlestickStreamsRequest();
        continuousContractKlineCandlestickStreamsRequest.pair("btcusdt");
        continuousContractKlineCandlestickStreamsRequest.contractType("next_quarter");
        continuousContractKlineCandlestickStreamsRequest.interval("1m");
        StreamBlockingQueueWrapper<ContinuousContractKlineCandlestickStreamsResponse> response =
                getApi().continuousContractKlineCandlestickStreams(
                                continuousContractKlineCandlestickStreamsRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
