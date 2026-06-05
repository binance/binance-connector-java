package com.binance.connector.client.derivatives_trading_options.websocket.stream.market;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.DerivativesTradingOptionsWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.api.DerivativesTradingOptionsWebSocketStreams;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.NewSymbolInfoRequest;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.NewSymbolInfoResponse;

/** API examples for MarketApi */
public class NewSymbolInfoExample {
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
     * New Symbol Info
     *
     * <p>New symbol listing stream. Update Speed: 50ms
     *
     * @throws ApiException if the Api call fails
     */
    public void newSymbolInfoExample() throws ApiException, InterruptedException {
        NewSymbolInfoRequest newSymbolInfoRequest = new NewSymbolInfoRequest();
        StreamBlockingQueueWrapper<NewSymbolInfoResponse> response =
                getApi().newSymbolInfo(newSymbolInfoRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
