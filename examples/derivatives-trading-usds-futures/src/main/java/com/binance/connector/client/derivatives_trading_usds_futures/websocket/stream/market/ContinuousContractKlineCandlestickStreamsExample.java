package com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.market;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.DerivativesTradingUsdsFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.DerivativesTradingUsdsFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.ContinuousContractKlineCandlestickStreamsRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.ContinuousContractKlineCandlestickStreamsResponse;

/** API examples for MarketApi */
public class ContinuousContractKlineCandlestickStreamsExample {
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
     * Continuous Contract Kline/Candlestick Streams
     *
     * <p>Update Speed: 250ms
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
