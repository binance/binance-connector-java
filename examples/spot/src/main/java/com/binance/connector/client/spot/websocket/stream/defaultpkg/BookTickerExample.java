package com.binance.connector.client.spot.websocket.stream.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.spot.websocket.stream.SpotWebSocketStreamsUtil;
import com.binance.connector.client.spot.websocket.stream.api.SpotWebSocketStreams;
import com.binance.connector.client.spot.websocket.stream.model.BookTickerRequest;
import com.binance.connector.client.spot.websocket.stream.model.BookTickerResponse;

/** API examples for DefaultApi */
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
     * Individual Symbol Book Ticker Streams
     *
     * <p>Pushes any update to the best bid or ask&#39;s price or quantity in real-time for a
     * specified symbol. Multiple &#x60;&lt;symbol&gt;@bookTicker&#x60; streams can be subscribed to
     * over one connection. Update Speed: Real-time
     *
     * @throws ApiException if the Api call fails
     */
    public void bookTickerExample() throws ApiException, InterruptedException {
        BookTickerRequest bookTickerRequest = new BookTickerRequest();
        StreamBlockingQueueWrapper<BookTickerResponse> response =
                getApi().bookTicker(bookTickerRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
