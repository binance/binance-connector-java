package com.binance.connector.client.stocks.websocket.stream.api;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.SystemUtil;
import com.binance.connector.client.common.websocket.adapter.stream.StreamConnectionInterface;
import com.binance.connector.client.common.websocket.adapter.stream.StreamConnectionPoolWrapper;
import com.binance.connector.client.common.websocket.adapter.stream.StreamConnectionWrapper;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.stocks.websocket.stream.JSON;
import com.binance.connector.client.stocks.websocket.stream.model.CalendarStreamResponse;
import com.binance.connector.client.stocks.websocket.stream.model.KlineStreamRequest;
import com.binance.connector.client.stocks.websocket.stream.model.KlineStreamResponse;
import com.binance.connector.client.stocks.websocket.stream.model.OrderReportStreamRequest;
import com.binance.connector.client.stocks.websocket.stream.model.OrderReportStreamResponse;
import com.binance.connector.client.stocks.websocket.stream.model.PriceStreamResponse;
import com.binance.connector.client.stocks.websocket.stream.model.QuoteStreamRequest;
import com.binance.connector.client.stocks.websocket.stream.model.QuoteStreamResponse;
import com.binance.connector.client.stocks.websocket.stream.model.TradabilityStreamRequest;
import com.binance.connector.client.stocks.websocket.stream.model.TradabilityStreamResponse;
import com.binance.connector.client.stocks.websocket.stream.model.TradingStatusStreamRequest;
import com.binance.connector.client.stocks.websocket.stream.model.TradingStatusStreamResponse;
import java.util.UUID;

public class StocksWebSocketStreams {
    private static final String USER_AGENT =
            String.format(
                    "binance-stocks/1.0.0 (Java/%s; %s; %s)",
                    SystemUtil.getJavaVersion(), SystemUtil.getOs(), SystemUtil.getArch());

    private final StreamConnectionInterface connection;

    private MarketStreamsApi marketStreamsApi;
    private UserStreamsApi userStreamsApi;

    public StocksWebSocketStreams(WebSocketClientConfiguration configuration) {
        this(
                configuration.getUsePool()
                        ? new StreamConnectionPoolWrapper(configuration, JSON.getGson())
                        : new StreamConnectionWrapper(configuration, JSON.getGson()));
    }

    public StocksWebSocketStreams(StreamConnectionInterface connection) {
        connection.setUserAgent(USER_AGENT);
        if (!connection.isConnected()) {
            connection.connect();
        }
        this.connection = connection;

        this.marketStreamsApi = new MarketStreamsApi(connection);
        this.userStreamsApi = new UserStreamsApi(connection);
    }

    public void stop() throws Exception {
        if (connection != null && connection.isConnected()) {
            connection.stop();
        }
    }

    public StreamBlockingQueueWrapper<CalendarStreamResponse> calendarStream() throws ApiException {
        return marketStreamsApi.calendarStream();
    }

    public StreamBlockingQueueWrapper<KlineStreamResponse> klineStream(
            KlineStreamRequest klineStreamRequest) throws ApiException {
        return marketStreamsApi.klineStream(klineStreamRequest);
    }

    public StreamBlockingQueueWrapper<PriceStreamResponse> priceStream() throws ApiException {
        return marketStreamsApi.priceStream();
    }

    public StreamBlockingQueueWrapper<QuoteStreamResponse> quoteStream(
            QuoteStreamRequest quoteStreamRequest) throws ApiException {
        return marketStreamsApi.quoteStream(quoteStreamRequest);
    }

    public StreamBlockingQueueWrapper<TradabilityStreamResponse> tradabilityStream(
            TradabilityStreamRequest tradabilityStreamRequest) throws ApiException {
        return marketStreamsApi.tradabilityStream(tradabilityStreamRequest);
    }

    public StreamBlockingQueueWrapper<TradingStatusStreamResponse> tradingStatusStream(
            TradingStatusStreamRequest tradingStatusStreamRequest) throws ApiException {
        return marketStreamsApi.tradingStatusStream(tradingStatusStreamRequest);
    }

    public StreamBlockingQueueWrapper<OrderReportStreamResponse> orderReportStream(
            OrderReportStreamRequest orderReportStreamRequest) throws ApiException {
        return userStreamsApi.orderReportStream(orderReportStreamRequest);
    }

    public String getRequestID() {
        return UUID.randomUUID().toString();
    }
}
