package com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.DerivativesTradingCoinFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DerivativesTradingCoinFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.ContinuousContractKlineCandlestickStreamsRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.ContinuousContractKlineCandlestickStreamsResponse;

/** API examples for DefaultApi */
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
     * <p>Kline update every second &gt; **After CM migration**, both &#x60;fstream&#x60; and
     * &#x60;dstream&#x60; may subscribe to either UM or CM symbols on this stream. Update Speed:
     * 250ms
     *
     * @throws ApiException if the Api call fails
     */
    public void continuousContractKlineCandlestickStreamsExample()
            throws ApiException, InterruptedException {
        ContinuousContractKlineCandlestickStreamsRequest
                continuousContractKlineCandlestickStreamsRequest =
                        new ContinuousContractKlineCandlestickStreamsRequest();
        StreamBlockingQueueWrapper<ContinuousContractKlineCandlestickStreamsResponse> response =
                getApi().continuousContractKlineCandlestickStreams(
                                continuousContractKlineCandlestickStreamsRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
