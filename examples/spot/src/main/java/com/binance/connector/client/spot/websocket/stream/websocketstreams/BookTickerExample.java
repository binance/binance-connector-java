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

package com.binance.connector.client.spot.websocket.stream.websocketstreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.spot.websocket.stream.SpotWebSocketStreamsUtil;
import com.binance.connector.client.spot.websocket.stream.api.SpotWebSocketStreams;
import com.binance.connector.client.spot.websocket.stream.model.BookTickerRequest;
import com.binance.connector.client.spot.websocket.stream.model.BookTickerResponse;

/** API examples for WebSocketStreamsApi */
public class BookTickerExample {
    private SpotWebSocketStreams api;

    public SpotWebSocketStreams getApi() {
        if (api == null) {
            WebSocketClientConfiguration clientConfiguration =
                    SpotWebSocketStreamsUtil.getClientConfiguration();
            api = new SpotWebSocketStreams(clientConfiguration);
        }
        return api;
    }

    /**
     * WebSocket Individual Symbol Book Ticker Streams
     *
     * <p>Pushes any update to the best bid or ask&#39;s price or quantity in real-time for a
     * specified symbol. Multiple &#x60;&lt;symbol&gt;@bookTicker&#x60; streams can be subscribed to
     * over one connection.
     *
     * @throws ApiException if the Api call fails
     */
    public void bookTickerExample() throws ApiException, InterruptedException {
        BookTickerRequest bookTickerRequest = new BookTickerRequest();
        bookTickerRequest.symbol("bnbusdt");
        StreamBlockingQueueWrapper<BookTickerResponse> response =
                getApi().bookTicker(bookTickerRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
