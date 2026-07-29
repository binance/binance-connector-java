package com.binance.connector.client.alpha.websocket.stream.api;

import com.binance.connector.client.alpha.websocket.stream.JSON;
import com.binance.connector.client.alpha.websocket.stream.model.AggregateTradeStreamRequest;
import com.binance.connector.client.alpha.websocket.stream.model.AggregateTradeStreamResponse;
import com.binance.connector.client.alpha.websocket.stream.model.AllBookTickerStreamRequest;
import com.binance.connector.client.alpha.websocket.stream.model.AllBookTickerStreamResponse;
import com.binance.connector.client.alpha.websocket.stream.model.AllMiniTickerStreamRequest;
import com.binance.connector.client.alpha.websocket.stream.model.AllMiniTickerStreamResponse;
import com.binance.connector.client.alpha.websocket.stream.model.AllTickerStreamRequest;
import com.binance.connector.client.alpha.websocket.stream.model.AllTickerStreamResponse;
import com.binance.connector.client.alpha.websocket.stream.model.AllTokens24hTickerStreamRequest;
import com.binance.connector.client.alpha.websocket.stream.model.AllTokens24hTickerStreamResponse;
import com.binance.connector.client.alpha.websocket.stream.model.BookTickerStreamRequest;
import com.binance.connector.client.alpha.websocket.stream.model.BookTickerStreamResponse;
import com.binance.connector.client.alpha.websocket.stream.model.ContractKlineStreamRequest;
import com.binance.connector.client.alpha.websocket.stream.model.ContractKlineStreamResponse;
import com.binance.connector.client.alpha.websocket.stream.model.FullDepthStreamRequest;
import com.binance.connector.client.alpha.websocket.stream.model.FullDepthStreamResponse;
import com.binance.connector.client.alpha.websocket.stream.model.KlineStreamRequest;
import com.binance.connector.client.alpha.websocket.stream.model.KlineStreamResponse;
import com.binance.connector.client.alpha.websocket.stream.model.MiniTickerStreamRequest;
import com.binance.connector.client.alpha.websocket.stream.model.MiniTickerStreamResponse;
import com.binance.connector.client.alpha.websocket.stream.model.PartialDepthStreamRequest;
import com.binance.connector.client.alpha.websocket.stream.model.PartialDepthStreamResponse;
import com.binance.connector.client.alpha.websocket.stream.model.TickerStreamRequest;
import com.binance.connector.client.alpha.websocket.stream.model.TickerStreamResponse;
import com.binance.connector.client.alpha.websocket.stream.model.TradeStreamRequest;
import com.binance.connector.client.alpha.websocket.stream.model.TradeStreamResponse;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.SystemUtil;
import com.binance.connector.client.common.websocket.adapter.stream.StreamConnectionInterface;
import com.binance.connector.client.common.websocket.adapter.stream.StreamConnectionPoolWrapper;
import com.binance.connector.client.common.websocket.adapter.stream.StreamConnectionWrapper;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import java.util.Random;

public class AlphaWebSocketStreams {
    private static final String USER_AGENT =
            String.format(
                    "binance-alpha/2.0.0 (Java/%s; %s; %s)",
                    SystemUtil.getJavaVersion(), SystemUtil.getOs(), SystemUtil.getArch());

    private final StreamConnectionInterface connection;

    private DefaultApi defaultApi;

    public AlphaWebSocketStreams(WebSocketClientConfiguration configuration) {
        this(
                configuration.getUsePool()
                        ? new StreamConnectionPoolWrapper(configuration, JSON.getGson())
                        : new StreamConnectionWrapper(configuration, JSON.getGson()));
    }

    public AlphaWebSocketStreams(StreamConnectionInterface connection) {
        connection.setUserAgent(USER_AGENT);
        if (!connection.isConnected()) {
            connection.connect();
        }
        this.connection = connection;

        this.defaultApi = new DefaultApi(connection);
    }

    public void stop() throws Exception {
        if (connection != null && connection.isConnected()) {
            connection.stop();
        }
    }

    public StreamBlockingQueueWrapper<AggregateTradeStreamResponse> aggregateTradeStream(
            AggregateTradeStreamRequest aggregateTradeStreamRequest) throws ApiException {
        return defaultApi.aggregateTradeStream(aggregateTradeStreamRequest);
    }

    public StreamBlockingQueueWrapper<AllBookTickerStreamResponse> allBookTickerStream(
            AllBookTickerStreamRequest allBookTickerStreamRequest) throws ApiException {
        return defaultApi.allBookTickerStream(allBookTickerStreamRequest);
    }

    public StreamBlockingQueueWrapper<AllMiniTickerStreamResponse> allMiniTickerStream(
            AllMiniTickerStreamRequest allMiniTickerStreamRequest) throws ApiException {
        return defaultApi.allMiniTickerStream(allMiniTickerStreamRequest);
    }

    public StreamBlockingQueueWrapper<AllTickerStreamResponse> allTickerStream(
            AllTickerStreamRequest allTickerStreamRequest) throws ApiException {
        return defaultApi.allTickerStream(allTickerStreamRequest);
    }

    public StreamBlockingQueueWrapper<AllTokens24hTickerStreamResponse> allTokens24hTickerStream(
            AllTokens24hTickerStreamRequest allTokens24hTickerStreamRequest) throws ApiException {
        return defaultApi.allTokens24hTickerStream(allTokens24hTickerStreamRequest);
    }

    public StreamBlockingQueueWrapper<BookTickerStreamResponse> bookTickerStream(
            BookTickerStreamRequest bookTickerStreamRequest) throws ApiException {
        return defaultApi.bookTickerStream(bookTickerStreamRequest);
    }

    public StreamBlockingQueueWrapper<ContractKlineStreamResponse> contractKlineStream(
            ContractKlineStreamRequest contractKlineStreamRequest) throws ApiException {
        return defaultApi.contractKlineStream(contractKlineStreamRequest);
    }

    public StreamBlockingQueueWrapper<FullDepthStreamResponse> fullDepthStream(
            FullDepthStreamRequest fullDepthStreamRequest) throws ApiException {
        return defaultApi.fullDepthStream(fullDepthStreamRequest);
    }

    public StreamBlockingQueueWrapper<KlineStreamResponse> klineStream(
            KlineStreamRequest klineStreamRequest) throws ApiException {
        return defaultApi.klineStream(klineStreamRequest);
    }

    public StreamBlockingQueueWrapper<MiniTickerStreamResponse> miniTickerStream(
            MiniTickerStreamRequest miniTickerStreamRequest) throws ApiException {
        return defaultApi.miniTickerStream(miniTickerStreamRequest);
    }

    public StreamBlockingQueueWrapper<PartialDepthStreamResponse> partialDepthStream(
            PartialDepthStreamRequest partialDepthStreamRequest) throws ApiException {
        return defaultApi.partialDepthStream(partialDepthStreamRequest);
    }

    public StreamBlockingQueueWrapper<TickerStreamResponse> tickerStream(
            TickerStreamRequest tickerStreamRequest) throws ApiException {
        return defaultApi.tickerStream(tickerStreamRequest);
    }

    public StreamBlockingQueueWrapper<TradeStreamResponse> tradeStream(
            TradeStreamRequest tradeStreamRequest) throws ApiException {
        return defaultApi.tradeStream(tradeStreamRequest);
    }

    public String getRequestID() {
        Random rand = new Random();
        return Integer.toString(Math.abs(rand.nextInt()));
    }
}
