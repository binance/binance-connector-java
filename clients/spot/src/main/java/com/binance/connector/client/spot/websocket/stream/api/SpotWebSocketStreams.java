package com.binance.connector.client.spot.websocket.stream.api;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.SystemUtil;
import com.binance.connector.client.common.websocket.adapter.stream.StreamConnectionInterface;
import com.binance.connector.client.common.websocket.adapter.stream.StreamConnectionPoolWrapper;
import com.binance.connector.client.common.websocket.adapter.stream.StreamConnectionWrapper;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.dtos.RequestWrapperDTO;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueue;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.spot.websocket.stream.JSON;
import com.binance.connector.client.spot.websocket.stream.model.AggTradeRequest;
import com.binance.connector.client.spot.websocket.stream.model.AggTradeResponse;
import com.binance.connector.client.spot.websocket.stream.model.AllMarketRollingWindowTickerRequest;
import com.binance.connector.client.spot.websocket.stream.model.AllMarketRollingWindowTickerResponse;
import com.binance.connector.client.spot.websocket.stream.model.AllMiniTickerRequest;
import com.binance.connector.client.spot.websocket.stream.model.AllMiniTickerResponse;
import com.binance.connector.client.spot.websocket.stream.model.AvgPriceRequest;
import com.binance.connector.client.spot.websocket.stream.model.AvgPriceResponse;
import com.binance.connector.client.spot.websocket.stream.model.BlockTradeRequest;
import com.binance.connector.client.spot.websocket.stream.model.BlockTradeResponse;
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
import com.binance.connector.client.spot.websocket.stream.model.ReferencePriceRequest;
import com.binance.connector.client.spot.websocket.stream.model.ReferencePriceResponse;
import com.binance.connector.client.spot.websocket.stream.model.RollingWindowTickerRequest;
import com.binance.connector.client.spot.websocket.stream.model.RollingWindowTickerResponse;
import com.binance.connector.client.spot.websocket.stream.model.TickerRequest;
import com.binance.connector.client.spot.websocket.stream.model.TickerResponse;
import com.binance.connector.client.spot.websocket.stream.model.TradeRequest;
import com.binance.connector.client.spot.websocket.stream.model.TradeResponse;
import com.binance.connector.client.spot.websocket.stream.model.UserDataStreamEventsResponse;
import com.google.gson.reflect.TypeToken;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class SpotWebSocketStreams {
    private static final String USER_AGENT =
            String.format(
                    "binance-spot/11.0.0 (Java/%s; %s; %s)",
                    SystemUtil.getJavaVersion(), SystemUtil.getOs(), SystemUtil.getArch());

    private final StreamConnectionInterface connection;

    private DefaultApi defaultApi;

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
        this.connection = connection;

        this.defaultApi = new DefaultApi(connection);
    }

    public void stop() throws Exception {
        if (connection != null && connection.isConnected()) {
            connection.stop();
        }
    }

    public StreamBlockingQueueWrapper<AggTradeResponse> aggTrade(AggTradeRequest aggTradeRequest)
            throws ApiException {
        return defaultApi.aggTrade(aggTradeRequest);
    }

    public StreamBlockingQueueWrapper<AllMarketRollingWindowTickerResponse>
            allMarketRollingWindowTicker(
                    AllMarketRollingWindowTickerRequest allMarketRollingWindowTickerRequest)
                    throws ApiException {
        return defaultApi.allMarketRollingWindowTicker(allMarketRollingWindowTickerRequest);
    }

    public StreamBlockingQueueWrapper<AllMiniTickerResponse> allMiniTicker(
            AllMiniTickerRequest allMiniTickerRequest) throws ApiException {
        return defaultApi.allMiniTicker(allMiniTickerRequest);
    }

    public StreamBlockingQueueWrapper<AvgPriceResponse> avgPrice(AvgPriceRequest avgPriceRequest)
            throws ApiException {
        return defaultApi.avgPrice(avgPriceRequest);
    }

    public StreamBlockingQueueWrapper<BlockTradeResponse> blockTrade(
            BlockTradeRequest blockTradeRequest) throws ApiException {
        return defaultApi.blockTrade(blockTradeRequest);
    }

    public StreamBlockingQueueWrapper<BookTickerResponse> bookTicker(
            BookTickerRequest bookTickerRequest) throws ApiException {
        return defaultApi.bookTicker(bookTickerRequest);
    }

    public StreamBlockingQueueWrapper<DiffBookDepthResponse> diffBookDepth(
            DiffBookDepthRequest diffBookDepthRequest) throws ApiException {
        return defaultApi.diffBookDepth(diffBookDepthRequest);
    }

    public StreamBlockingQueueWrapper<KlineResponse> kline(KlineRequest klineRequest)
            throws ApiException {
        return defaultApi.kline(klineRequest);
    }

    public StreamBlockingQueueWrapper<KlineOffsetResponse> klineOffset(
            KlineOffsetRequest klineOffsetRequest) throws ApiException {
        return defaultApi.klineOffset(klineOffsetRequest);
    }

    public StreamBlockingQueueWrapper<MiniTickerResponse> miniTicker(
            MiniTickerRequest miniTickerRequest) throws ApiException {
        return defaultApi.miniTicker(miniTickerRequest);
    }

    public StreamBlockingQueueWrapper<PartialBookDepthResponse> partialBookDepth(
            PartialBookDepthRequest partialBookDepthRequest) throws ApiException {
        return defaultApi.partialBookDepth(partialBookDepthRequest);
    }

    public StreamBlockingQueueWrapper<ReferencePriceResponse> referencePrice(
            ReferencePriceRequest referencePriceRequest) throws ApiException {
        return defaultApi.referencePrice(referencePriceRequest);
    }

    public StreamBlockingQueueWrapper<RollingWindowTickerResponse> rollingWindowTicker(
            RollingWindowTickerRequest rollingWindowTickerRequest) throws ApiException {
        return defaultApi.rollingWindowTicker(rollingWindowTickerRequest);
    }

    public StreamBlockingQueueWrapper<TickerResponse> ticker(TickerRequest tickerRequest)
            throws ApiException {
        return defaultApi.ticker(tickerRequest);
    }

    public StreamBlockingQueueWrapper<TradeResponse> trade(TradeRequest tradeRequest)
            throws ApiException {
        return defaultApi.trade(tradeRequest);
    }

    /**
     * Subscribes to the user data WebSocket stream using the provided listen key.
     *
     * @param listenKey - The listen key for the user data WebSocket stream.
     * @return A WebSocket stream handler for the user data stream.
     */
    public StreamBlockingQueueWrapper<UserDataStreamEventsResponse> userData(String listenKey) {
        RequestWrapperDTO<Set<String>, Object> requestWrapperDTO =
                new RequestWrapperDTO.Builder<Set<String>, Object>()
                        .id(getRequestID())
                        .method("SUBSCRIBE")
                        .params(Collections.singleton(listenKey))
                        .build();
        Map<String, StreamBlockingQueue<String>> queuesMap =
                connection.subscribe(requestWrapperDTO);

        TypeToken<UserDataStreamEventsResponse> typeToken = new TypeToken<>() {};
        StreamBlockingQueue<String> queue = queuesMap.get(listenKey);
        return new StreamBlockingQueueWrapper<>(queue, typeToken, JSON.getGson());
    }

    public String getRequestID() {
        return UUID.randomUUID().toString();
    }
}
