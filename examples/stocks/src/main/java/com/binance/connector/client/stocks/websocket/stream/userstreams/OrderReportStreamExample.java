package com.binance.connector.client.stocks.websocket.stream.userstreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.stocks.websocket.stream.StocksWebSocketStreamsUtil;
import com.binance.connector.client.stocks.websocket.stream.api.StocksWebSocketStreams;
import com.binance.connector.client.stocks.websocket.stream.model.OrderReportStreamRequest;
import com.binance.connector.client.stocks.websocket.stream.model.OrderReportStreamResponse;

/** API examples for UserStreamsApi */
public class OrderReportStreamExample {
    private StocksWebSocketStreams api;

    public StocksWebSocketStreams getApi() {
        if (api == null) {
            WebSocketClientConfiguration clientConfiguration =
                    StocksWebSocketStreamsUtil.getClientConfiguration();
            api = new StocksWebSocketStreams(clientConfiguration);
        }
        return api;
    }

    /**
     * Order Report Stream
     *
     * <p>Real-time push of the authenticated user&#39;s order state transitions — both open-state
     * updates (&#x60;ORDER_UPDATE&#x60;) and terminal-state notifications
     * (&#x60;ORDER_TERMINAL&#x60;). Prerequisite: obtain a &#x60;listenKey&#x60; via the Listen Key
     * endpoint first.
     *
     * @throws ApiException if the Api call fails
     */
    public void orderReportStreamExample() throws ApiException, InterruptedException {
        OrderReportStreamRequest orderReportStreamRequest = new OrderReportStreamRequest();
        StreamBlockingQueueWrapper<OrderReportStreamResponse> response =
                getApi().orderReportStream(orderReportStreamRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
