package com.binance.connector.client.derivatives_trading_options.websocket.stream.publicpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.DerivativesTradingOptionsWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.api.DerivativesTradingOptionsWebSocketStreams;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.Hour24TickerRequest;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.Hour24TickerResponse;

/** API examples for PublicApi */
public class Hour24TickerExample {
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
     * 24-hour TICKER
     *
     * <p>24hr ticker info for all symbols. Only symbols whose ticker info changed will be sent.
     * Update Speed: 1000ms
     *
     * @throws ApiException if the Api call fails
     */
    public void hour24TickerExample() throws ApiException, InterruptedException {
        Hour24TickerRequest hour24TickerRequest = new Hour24TickerRequest();
        StreamBlockingQueueWrapper<Hour24TickerResponse> response =
                getApi().hour24Ticker(hour24TickerRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
