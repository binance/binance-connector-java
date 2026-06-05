package com.binance.connector.client.derivatives_trading_options.websocket.stream.publicpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.DerivativesTradingOptionsWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.api.DerivativesTradingOptionsWebSocketStreams;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.TradeStreamsRequest;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.TradeStreamsResponse;

/** API examples for PublicApi */
public class TradeStreamsExample {
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
     * Trade Streams
     *
     * <p>The Trade Streams push raw trade information for specific symbol or underlying asset.
     * E.g.[btcusdt@optionTrade](wss://fstream.binance.com/public/stream?streams&#x3D;btcusdt@optionTrade)
     * Update Speed: 50ms
     *
     * @throws ApiException if the Api call fails
     */
    public void tradeStreamsExample() throws ApiException, InterruptedException {
        TradeStreamsRequest tradeStreamsRequest = new TradeStreamsRequest();
        tradeStreamsRequest.symbol("btcusdt");
        StreamBlockingQueueWrapper<TradeStreamsResponse> response =
                getApi().tradeStreams(tradeStreamsRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
