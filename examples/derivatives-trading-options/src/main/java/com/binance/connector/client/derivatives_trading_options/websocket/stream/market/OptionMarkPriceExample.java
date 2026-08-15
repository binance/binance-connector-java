package com.binance.connector.client.derivatives_trading_options.websocket.stream.market;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.DerivativesTradingOptionsWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.api.DerivativesTradingOptionsWebSocketStreams;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.OptionMarkPriceRequest;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.OptionMarkPriceResponse;

/** API examples for MarketApi */
public class OptionMarkPriceExample {
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
     * Option Mark Price
     *
     * <p>The mark price for all option symbols on specific underlying asset.
     * E.g.[btcusdt@optionMarkPrice](wss://fstream.binance.com/market/stream?streams&#x3D;btcusdt@optionMarkPrice)
     * Update Speed: 1000ms
     *
     * @throws ApiException if the Api call fails
     */
    public void optionMarkPriceExample() throws ApiException, InterruptedException {
        OptionMarkPriceRequest optionMarkPriceRequest = new OptionMarkPriceRequest();
        StreamBlockingQueueWrapper<OptionMarkPriceResponse> response =
                getApi().optionMarkPrice(optionMarkPriceRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
