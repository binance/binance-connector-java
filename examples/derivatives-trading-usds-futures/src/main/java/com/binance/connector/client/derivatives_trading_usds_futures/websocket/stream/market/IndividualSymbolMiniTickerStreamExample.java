package com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.market;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.DerivativesTradingUsdsFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.DerivativesTradingUsdsFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.IndividualSymbolMiniTickerStreamRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.IndividualSymbolMiniTickerStreamResponse;

/** API examples for MarketApi */
public class IndividualSymbolMiniTickerStreamExample {
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
     * Individual Symbol Mini Ticker Stream
     *
     * <p>24hr rolling window mini-ticker statistics for a single symbol. These are NOT the
     * statistics of the UTC day, but a 24hr rolling window from requestTime to 24hrs before. &gt;
     * **After CM migration**, the payload is appended with a new &#x60;st&#x60; field
     * (&#x60;1&#x60; &#x3D; UM, &#x60;2&#x60; &#x3D; CM) and a new &#x60;ps&#x60; field (pair
     * symbol). Update Speed: 2s
     *
     * @throws ApiException if the Api call fails
     */
    public void individualSymbolMiniTickerStreamExample()
            throws ApiException, InterruptedException {
        IndividualSymbolMiniTickerStreamRequest individualSymbolMiniTickerStreamRequest =
                new IndividualSymbolMiniTickerStreamRequest();
        StreamBlockingQueueWrapper<IndividualSymbolMiniTickerStreamResponse> response =
                getApi().individualSymbolMiniTickerStream(individualSymbolMiniTickerStreamRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
