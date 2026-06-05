package com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.market;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.DerivativesTradingUsdsFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.DerivativesTradingUsdsFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.CompositeIndexSymbolInformationStreamsRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.CompositeIndexSymbolInformationStreamsResponse;

/** API examples for MarketApi */
public class CompositeIndexSymbolInformationStreamsExample {
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
     * Composite Index Symbol Information Streams
     *
     * <p>Composite index information for index symbols pushed every second. Update Speed: 1000ms
     *
     * @throws ApiException if the Api call fails
     */
    public void compositeIndexSymbolInformationStreamsExample()
            throws ApiException, InterruptedException {
        CompositeIndexSymbolInformationStreamsRequest
                compositeIndexSymbolInformationStreamsRequest =
                        new CompositeIndexSymbolInformationStreamsRequest();
        compositeIndexSymbolInformationStreamsRequest.symbol("btcusdt");
        StreamBlockingQueueWrapper<CompositeIndexSymbolInformationStreamsResponse> response =
                getApi().compositeIndexSymbolInformationStreams(
                                compositeIndexSymbolInformationStreamsRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
