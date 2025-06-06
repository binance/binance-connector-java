/*
 * Binance Spot REST API
 * OpenAPI Specifications for the Binance Spot REST API  API documents:   - [Github rest-api documentation file](https://github.com/binance/binance-spot-api-docs/blob/master/rest-api.md)   - [General API information for rest-api on website](https://developers.binance.com/docs/binance-spot-api-docs/rest-api/general-api-information)
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.websocketmarketstreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.DerivativesTradingUsdsFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.DerivativesTradingUsdsFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.AggregateTradeStreamsRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.AggregateTradeStreamsResponse;

/** API examples for WebsocketMarketStreamsApi */
public class AggregateTradeStreamsExample {
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
     * Aggregate Trade Streams
     *
     * <p>The Aggregate Trade Streams push market trade information that is aggregated for fills
     * with same price and taking side every 100 milliseconds. Only market trades will be
     * aggregated, which means the insurance fund trades and ADL trades won&#39;t be aggregated.
     * Update Speed: 100ms
     *
     * @throws ApiException if the Api call fails
     */
    public void aggregateTradeStreamsExample() throws ApiException, InterruptedException {
        AggregateTradeStreamsRequest aggregateTradeStreamsRequest =
                new AggregateTradeStreamsRequest();
        aggregateTradeStreamsRequest.symbol("btcusdt");
        StreamBlockingQueueWrapper<AggregateTradeStreamsResponse> response =
                getApi().aggregateTradeStreams(aggregateTradeStreamsRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
