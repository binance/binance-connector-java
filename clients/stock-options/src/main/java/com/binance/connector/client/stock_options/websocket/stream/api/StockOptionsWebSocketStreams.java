package com.binance.connector.client.stock_options.websocket.stream.api;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.SystemUtil;
import com.binance.connector.client.common.websocket.adapter.stream.StreamConnectionInterface;
import com.binance.connector.client.common.websocket.adapter.stream.StreamConnectionPoolWrapper;
import com.binance.connector.client.common.websocket.adapter.stream.StreamConnectionWrapper;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.stock_options.websocket.stream.JSON;
import com.binance.connector.client.stock_options.websocket.stream.model.OrderReportV2StreamRequest;
import com.binance.connector.client.stock_options.websocket.stream.model.OrderReportV2StreamResponse;
import java.util.UUID;

public class StockOptionsWebSocketStreams {
    private static final String USER_AGENT =
            String.format(
                    "binance-stock-options/1.0.0 (Java/%s; %s; %s)",
                    SystemUtil.getJavaVersion(), SystemUtil.getOs(), SystemUtil.getArch());

    private final StreamConnectionInterface connection;

    private UserStreamsApi userStreamsApi;

    public StockOptionsWebSocketStreams(WebSocketClientConfiguration configuration) {
        this(
                configuration.getUsePool()
                        ? new StreamConnectionPoolWrapper(configuration, JSON.getGson())
                        : new StreamConnectionWrapper(configuration, JSON.getGson()));
    }

    public StockOptionsWebSocketStreams(StreamConnectionInterface connection) {
        connection.setUserAgent(USER_AGENT);
        if (!connection.isConnected()) {
            connection.connect();
        }
        this.connection = connection;

        this.userStreamsApi = new UserStreamsApi(connection);
    }

    public void stop() throws Exception {
        if (connection != null && connection.isConnected()) {
            connection.stop();
        }
    }

    public StreamBlockingQueueWrapper<OrderReportV2StreamResponse> orderReportV2Stream(
            OrderReportV2StreamRequest orderReportV2StreamRequest) throws ApiException {
        return userStreamsApi.orderReportV2Stream(orderReportV2StreamRequest);
    }

    public String getRequestID() {
        return UUID.randomUUID().toString();
    }
}
