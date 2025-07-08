package com.binance.connector.client.spot.websocket.stream.api;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.SystemUtil;
import com.binance.connector.client.common.websocket.adapter.stream.StreamConnectionInterface;
import com.binance.connector.client.common.websocket.adapter.stream.StreamConnectionPoolWrapper;
import com.binance.connector.client.common.websocket.adapter.stream.StreamConnectionWrapper;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.spot.websocket.stream.JSON;
import com.binance.connector.client.spot.websocket.stream.model.AggTradeRequest;
import com.binance.connector.client.spot.websocket.stream.model.AggTradeResponse;
import com.binance.connector.client.spot.websocket.stream.model.AllMarketRollingWindowTickerRequest;
import com.binance.connector.client.spot.websocket.stream.model.AllMarketRollingWindowTickerResponse;
import com.binance.connector.client.spot.websocket.stream.model.AllMiniTickerResponse;
import com.binance.connector.client.spot.websocket.stream.model.AllTickerResponse;
import com.binance.connector.client.spot.websocket.stream.model.AvgPriceRequest;
import com.binance.connector.client.spot.websocket.stream.model.AvgPriceResponse;
import com.binance.connector.client.spot.websocket.stream.model.BookTickerRequest;
import com.binance.connector.client.spot.websocket.stream.model.BookTickerResponse;
import com.binance.connector.client.spot.websocket.stream.model.DiffBookDepthRequest;
import com.binance.connector.client.spot.websocket.stream.model.DiffBookDepthResponse;
import com.binance.connector.client.spot.websocket.stream.model.KlineOffsetRequest;
import com.binance.connector.client.spot.websocket.stream.model.KlineOffsetResponse;
import com.binance.connector.client.spot.websocket.stream.model.KlineRequest;
import com.binance.connector.client.spot.websocket.stream.model.KlineResponse;
import com.binance.connector.client.spot.websocket.stream.model.MiniTickerRequest;
import com.binance.connector.client.spot.websocket.stream.model.MiniTickerResponse;
import com.binance.connector.client.spot.websocket.stream.model.PartialBookDepthRequest;
import com.binance.connector.client.spot.websocket.stream.model.PartialBookDepthResponse;
import com.binance.connector.client.spot.websocket.stream.model.RollingWindowTickerRequest;
import com.binance.connector.client.spot.websocket.stream.model.RollingWindowTickerResponse;
import com.binance.connector.client.spot.websocket.stream.model.TickerRequest;
import com.binance.connector.client.spot.websocket.stream.model.TickerResponse;
import com.binance.connector.client.spot.websocket.stream.model.TradeRequest;
import com.binance.connector.client.spot.websocket.stream.model.TradeResponse;

public class SpotWebSocketStreams {
    private static final String USER_AGENT =
            String.format(
                    "binance-spot/3.1.0 (Java/%s; %s; %s)",
                    SystemUtil.getJavaVersion(), SystemUtil.getOs(), SystemUtil.getArch());

    private WebSocketStreamsApi webSocketStreamsApi;

    public SpotWebSocketStreams(WebSocketClientConfiguration configuration) {
        this(
                configuration.getUsePool()
                        ? new StreamConnectionPoolWrapper(configuration, JSON.getGson())
                        : new StreamConnectionWrapper(configuration, JSON.getGson()));
    }

    public SpotWebSocketStreams(StreamConnectionInterface connection) {
        connection.setUserAgent(USER_AGENT);
        if (!connection.isConnected()) {
            connection.connect();
        }

        this.webSocketStreamsApi = new WebSocketStreamsApi(connection);
    }

    public StreamBlockingQueueWrapper<AggTradeResponse> aggTrade(AggTradeRequest aggTradeRequest)
            throws ApiException {
        return webSocketStreamsApi.aggTrade(aggTradeRequest);
    }

    public StreamBlockingQueueWrapper<AllMarketRollingWindowTickerResponse>
            allMarketRollingWindowTicker(
                    AllMarketRollingWindowTickerRequest allMarketRollingWindowTickerRequest)
                    throws ApiException {
        return webSocketStreamsApi.allMarketRollingWindowTicker(
                allMarketRollingWindowTickerRequest);
    }

    public StreamBlockingQueueWrapper<AllMiniTickerResponse> allMiniTicker() throws ApiException {
        return webSocketStreamsApi.allMiniTicker();
    }

    public StreamBlockingQueueWrapper<AllTickerResponse> allTicker() throws ApiException {
        return webSocketStreamsApi.allTicker();
    }

    public StreamBlockingQueueWrapper<AvgPriceResponse> avgPrice(AvgPriceRequest avgPriceRequest)
            throws ApiException {
        return webSocketStreamsApi.avgPrice(avgPriceRequest);
    }

    public StreamBlockingQueueWrapper<BookTickerResponse> bookTicker(
            BookTickerRequest bookTickerRequest) throws ApiException {
        return webSocketStreamsApi.bookTicker(bookTickerRequest);
    }

    public StreamBlockingQueueWrapper<DiffBookDepthResponse> diffBookDepth(
            DiffBookDepthRequest diffBookDepthRequest) throws ApiException {
        return webSocketStreamsApi.diffBookDepth(diffBookDepthRequest);
    }

    public StreamBlockingQueueWrapper<KlineResponse> kline(KlineRequest klineRequest)
            throws ApiException {
        return webSocketStreamsApi.kline(klineRequest);
    }

    public StreamBlockingQueueWrapper<KlineOffsetResponse> klineOffset(
            KlineOffsetRequest klineOffsetRequest) throws ApiException {
        return webSocketStreamsApi.klineOffset(klineOffsetRequest);
    }

    public StreamBlockingQueueWrapper<MiniTickerResponse> miniTicker(
            MiniTickerRequest miniTickerRequest) throws ApiException {
        return webSocketStreamsApi.miniTicker(miniTickerRequest);
    }

    public StreamBlockingQueueWrapper<PartialBookDepthResponse> partialBookDepth(
            PartialBookDepthRequest partialBookDepthRequest) throws ApiException {
        return webSocketStreamsApi.partialBookDepth(partialBookDepthRequest);
    }

    public StreamBlockingQueueWrapper<RollingWindowTickerResponse> rollingWindowTicker(
            RollingWindowTickerRequest rollingWindowTickerRequest) throws ApiException {
        return webSocketStreamsApi.rollingWindowTicker(rollingWindowTickerRequest);
    }

    public StreamBlockingQueueWrapper<TickerResponse> ticker(TickerRequest tickerRequest)
            throws ApiException {
        return webSocketStreamsApi.ticker(tickerRequest);
    }

    public StreamBlockingQueueWrapper<TradeResponse> trade(TradeRequest tradeRequest)
            throws ApiException {
        return webSocketStreamsApi.trade(tradeRequest);
    }
}
