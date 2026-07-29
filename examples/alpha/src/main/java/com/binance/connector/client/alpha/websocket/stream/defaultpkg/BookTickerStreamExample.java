package com.binance.connector.client.alpha.websocket.stream.defaultpkg;

import com.binance.connector.client.alpha.websocket.stream.AlphaWebSocketStreamsUtil;
import com.binance.connector.client.alpha.websocket.stream.api.AlphaWebSocketStreams;
import com.binance.connector.client.alpha.websocket.stream.model.BookTickerStreamRequest;
import com.binance.connector.client.alpha.websocket.stream.model.BookTickerStreamResponse;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;

/** API examples for DefaultApi */
public class BookTickerStreamExample {
    private AlphaWebSocketStreams api;

    public AlphaWebSocketStreams getApi() {
        if (api == null) {
            WebSocketClientConfiguration clientConfiguration =
                    AlphaWebSocketStreamsUtil.getClientConfiguration();
            api = new AlphaWebSocketStreams(clientConfiguration);
        }
        return api;
    }

    /**
     * Book Ticker Stream
     *
     * <p>Pushes best bid/ask updates for a symbol.
     *
     * @throws ApiException if the Api call fails
     */
    public void bookTickerStreamExample() throws ApiException, InterruptedException {
        BookTickerStreamRequest bookTickerStreamRequest = new BookTickerStreamRequest();
        StreamBlockingQueueWrapper<BookTickerStreamResponse> response =
                getApi().bookTickerStream(bookTickerStreamRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
