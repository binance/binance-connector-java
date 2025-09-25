package com.binance.connector.client.margin_trading.websocket.stream.api;

import com.binance.connector.client.common.SystemUtil;
import com.binance.connector.client.common.websocket.adapter.stream.StreamConnectionInterface;
import com.binance.connector.client.common.websocket.adapter.stream.StreamConnectionPoolWrapper;
import com.binance.connector.client.common.websocket.adapter.stream.StreamConnectionWrapper;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.dtos.RequestWrapperDTO;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueue;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.margin_trading.websocket.stream.JSON;
import com.binance.connector.client.margin_trading.websocket.stream.model.RiskDataStreamEventsResponse;
import com.binance.connector.client.margin_trading.websocket.stream.model.TradeDataStreamEventsResponse;
import com.google.gson.reflect.TypeToken;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class MarginTradingWebSocketStreams {
    private static final String USER_AGENT =
            String.format(
                    "binance-margin-trading/4.0.0 (Java/%s; %s; %s)",
                    SystemUtil.getJavaVersion(), SystemUtil.getOs(), SystemUtil.getArch());

    private final StreamConnectionInterface connection;

    public MarginTradingWebSocketStreams(WebSocketClientConfiguration configuration) {
        this(
                configuration.getUsePool()
                        ? new StreamConnectionPoolWrapper(configuration, JSON.getGson())
                        : new StreamConnectionWrapper(configuration, JSON.getGson()));
    }

    public MarginTradingWebSocketStreams(StreamConnectionInterface connection) {
        connection.setUserAgent(USER_AGENT);
        if (!connection.isConnected()) {
            connection.connect();
        }
        this.connection = connection;
    }

    /**
     * Subscribes to the risk data WebSocket stream using the provided listen key.
     *
     * @param listenKey - The listen key for the risk data WebSocket stream.
     * @return A WebSocket stream handler for the risk data stream.
     */
    public StreamBlockingQueueWrapper<RiskDataStreamEventsResponse> riskData(String listenKey) {
        RequestWrapperDTO<Set<String>, Object> requestWrapperDTO =
                new RequestWrapperDTO.Builder<Set<String>, Object>()
                        .id(getRequestID())
                        .method("SUBSCRIBE")
                        .params(Collections.singleton(listenKey))
                        .build();
        Map<String, StreamBlockingQueue<String>> queuesMap =
                connection.subscribe(requestWrapperDTO);

        TypeToken<RiskDataStreamEventsResponse> typeToken = new TypeToken<>() {};
        StreamBlockingQueue<String> queue = queuesMap.get(listenKey);
        return new StreamBlockingQueueWrapper<>(queue, typeToken, JSON.getGson());
    }

    /**
     * Subscribes to the trade data WebSocket stream using the provided listen key.
     *
     * @param listenKey - The listen key for the trade data WebSocket stream.
     * @return A WebSocket stream handler for the trade data stream.
     */
    public StreamBlockingQueueWrapper<TradeDataStreamEventsResponse> tradeData(String listenKey) {
        RequestWrapperDTO<Set<String>, Object> requestWrapperDTO =
                new RequestWrapperDTO.Builder<Set<String>, Object>()
                        .id(getRequestID())
                        .method("SUBSCRIBE")
                        .params(Collections.singleton(listenKey))
                        .build();
        Map<String, StreamBlockingQueue<String>> queuesMap =
                connection.subscribe(requestWrapperDTO);

        TypeToken<TradeDataStreamEventsResponse> typeToken = new TypeToken<>() {};
        StreamBlockingQueue<String> queue = queuesMap.get(listenKey);
        return new StreamBlockingQueueWrapper<>(queue, typeToken, JSON.getGson());
    }

    public String getRequestID() {
        return UUID.randomUUID().toString();
    }
}
