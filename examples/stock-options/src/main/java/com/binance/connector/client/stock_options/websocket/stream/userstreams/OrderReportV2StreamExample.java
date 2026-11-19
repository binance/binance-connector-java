package com.binance.connector.client.stock_options.websocket.stream.userstreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.stock_options.websocket.stream.StockOptionsWebSocketStreamsUtil;
import com.binance.connector.client.stock_options.websocket.stream.api.StockOptionsWebSocketStreams;
import com.binance.connector.client.stock_options.websocket.stream.model.OrderReportV2StreamRequest;
import com.binance.connector.client.stock_options.websocket.stream.model.OrderReportV2StreamResponse;

/** API examples for UserStreamsApi */
public class OrderReportV2StreamExample {
    private StockOptionsWebSocketStreams api;

    public StockOptionsWebSocketStreams getApi() {
        if (api == null) {
            WebSocketClientConfiguration clientConfiguration =
                    StockOptionsWebSocketStreamsUtil.getClientConfiguration();
            api = new StockOptionsWebSocketStreams(clientConfiguration);
        }
        return api;
    }

    /**
     * Order Report V2 Stream
     *
     * <p>Real-time push of the user&#39;s order updates. Option orders are pushed on
     * &#x60;orderReportV2&#x60;, **not** on &#x60;orderReport&#x60;. &#x60;orderReportV2&#x60;
     * carries both US stock and US stock option orders; tell them apart with the &#x60;ac&#x60;
     * field. To process option orders only, subscribe to &#x60;orderReportV2&#x60; and handle
     * events where &#x60;ac&#x60; &#x3D; &#x60;us_option&#x60;. A push is sent once when an open
     * order changes (&#x60;x&#x60; &#x3D; &#x60;ORDER_UPDATE&#x60;) and once when it reaches a
     * terminal state (&#x60;x&#x60; &#x3D; &#x60;ORDER_TERMINAL&#x60;). Pushes are best-effort: a
     * failed push is not retried, events while the &#x60;listenKey&#x60; is invalid are not
     * replayed, and an order never pushed in an open state (e.g. rejected immediately) may not get
     * a terminal push. After reconnecting, call Current Open Option Orders for a full snapshot
     * first. Fill-level details are not pushed; use Option Order Detail or Option Trade History.
     * For expiration-day auto-liquidation orders by the broker (&#x60;o&#x60; &#x3D;
     * &#x60;market&#x60;), &#x60;p&#x60;, &#x60;b&#x60;, &#x60;q&#x60;, &#x60;tc&#x60;,
     * &#x60;u&#x60;, &#x60;ct&#x60;, &#x60;sp&#x60; and &#x60;ed&#x60; may be &#x60;null&#x60;; get
     * contract details from Option Exchange Info by &#x60;os&#x60;. Prerequisite: obtain a
     * &#x60;listenKey&#x60; via the Listen Key endpoint first.
     *
     * @throws ApiException if the Api call fails
     */
    public void orderReportV2StreamExample() throws ApiException, InterruptedException {
        OrderReportV2StreamRequest orderReportV2StreamRequest = new OrderReportV2StreamRequest();
        StreamBlockingQueueWrapper<OrderReportV2StreamResponse> response =
                getApi().orderReportV2Stream(orderReportV2StreamRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
