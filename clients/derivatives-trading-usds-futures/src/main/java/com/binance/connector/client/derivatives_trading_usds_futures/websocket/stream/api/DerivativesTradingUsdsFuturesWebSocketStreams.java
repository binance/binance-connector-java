package com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.SystemUtil;
import com.binance.connector.client.common.websocket.adapter.stream.StreamConnectionInterface;
import com.binance.connector.client.common.websocket.adapter.stream.StreamConnectionPoolWrapper;
import com.binance.connector.client.common.websocket.adapter.stream.StreamConnectionWrapper;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.dtos.RequestWrapperDTO;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueue;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.JSON;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.AggregateTradeStreamsRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.AggregateTradeStreamsResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.AllBookTickersStreamRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.AllBookTickersStreamResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.AllMarketLiquidationOrderStreamsRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.AllMarketLiquidationOrderStreamsResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.AllMarketMiniTickersStreamRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.AllMarketMiniTickersStreamResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.AllMarketTickersStreamsRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.AllMarketTickersStreamsResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.CompositeIndexSymbolInformationStreamsRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.CompositeIndexSymbolInformationStreamsResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.ContinuousContractKlineCandlestickStreamsRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.ContinuousContractKlineCandlestickStreamsResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.ContractInfoStreamRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.ContractInfoStreamResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.DiffBookDepthStreamsRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.DiffBookDepthStreamsResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.IndividualSymbolBookTickerStreamsRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.IndividualSymbolBookTickerStreamsResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.IndividualSymbolMiniTickerStreamRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.IndividualSymbolMiniTickerStreamResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.IndividualSymbolTickerStreamsRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.IndividualSymbolTickerStreamsResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.KlineCandlestickStreamsRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.KlineCandlestickStreamsResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.LiquidationOrderStreamsRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.LiquidationOrderStreamsResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.MarkPriceStreamForAllMarketRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.MarkPriceStreamForAllMarketResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.MarkPriceStreamRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.MarkPriceStreamResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.MultiAssetsModeAssetIndexRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.MultiAssetsModeAssetIndexResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.PartialBookDepthStreamsRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.PartialBookDepthStreamsResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.UserDataStreamEventsResponse;
import com.google.gson.reflect.TypeToken;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class DerivativesTradingUsdsFuturesWebSocketStreams {
    private static final String USER_AGENT =
            String.format(
                    "binance-derivatives-trading-usds-futures/6.0.0 (Java/%s; %s; %s)",
                    SystemUtil.getJavaVersion(), SystemUtil.getOs(), SystemUtil.getArch());

    private final StreamConnectionInterface connection;

    private WebsocketMarketStreamsApi websocketMarketStreamsApi;

    public DerivativesTradingUsdsFuturesWebSocketStreams(
            WebSocketClientConfiguration configuration) {
        this(
                configuration.getUsePool()
                        ? new StreamConnectionPoolWrapper(configuration, JSON.getGson())
                        : new StreamConnectionWrapper(configuration, JSON.getGson()));
    }

    public DerivativesTradingUsdsFuturesWebSocketStreams(StreamConnectionInterface connection) {
        connection.setUserAgent(USER_AGENT);
        if (!connection.isConnected()) {
            connection.connect();
        }
        this.connection = connection;

        this.websocketMarketStreamsApi = new WebsocketMarketStreamsApi(connection);
    }

    public StreamBlockingQueueWrapper<AggregateTradeStreamsResponse> aggregateTradeStreams(
            AggregateTradeStreamsRequest aggregateTradeStreamsRequest) throws ApiException {
        return websocketMarketStreamsApi.aggregateTradeStreams(aggregateTradeStreamsRequest);
    }

    public StreamBlockingQueueWrapper<AllBookTickersStreamResponse> allBookTickersStream(
            AllBookTickersStreamRequest allBookTickersStreamRequest) throws ApiException {
        return websocketMarketStreamsApi.allBookTickersStream(allBookTickersStreamRequest);
    }

    public StreamBlockingQueueWrapper<AllMarketLiquidationOrderStreamsResponse>
            allMarketLiquidationOrderStreams(
                    AllMarketLiquidationOrderStreamsRequest allMarketLiquidationOrderStreamsRequest)
                    throws ApiException {
        return websocketMarketStreamsApi.allMarketLiquidationOrderStreams(
                allMarketLiquidationOrderStreamsRequest);
    }

    public StreamBlockingQueueWrapper<AllMarketMiniTickersStreamResponse>
            allMarketMiniTickersStream(
                    AllMarketMiniTickersStreamRequest allMarketMiniTickersStreamRequest)
                    throws ApiException {
        return websocketMarketStreamsApi.allMarketMiniTickersStream(
                allMarketMiniTickersStreamRequest);
    }

    public StreamBlockingQueueWrapper<AllMarketTickersStreamsResponse> allMarketTickersStreams(
            AllMarketTickersStreamsRequest allMarketTickersStreamsRequest) throws ApiException {
        return websocketMarketStreamsApi.allMarketTickersStreams(allMarketTickersStreamsRequest);
    }

    public StreamBlockingQueueWrapper<CompositeIndexSymbolInformationStreamsResponse>
            compositeIndexSymbolInformationStreams(
                    CompositeIndexSymbolInformationStreamsRequest
                            compositeIndexSymbolInformationStreamsRequest)
                    throws ApiException {
        return websocketMarketStreamsApi.compositeIndexSymbolInformationStreams(
                compositeIndexSymbolInformationStreamsRequest);
    }

    public StreamBlockingQueueWrapper<ContinuousContractKlineCandlestickStreamsResponse>
            continuousContractKlineCandlestickStreams(
                    ContinuousContractKlineCandlestickStreamsRequest
                            continuousContractKlineCandlestickStreamsRequest)
                    throws ApiException {
        return websocketMarketStreamsApi.continuousContractKlineCandlestickStreams(
                continuousContractKlineCandlestickStreamsRequest);
    }

    public StreamBlockingQueueWrapper<ContractInfoStreamResponse> contractInfoStream(
            ContractInfoStreamRequest contractInfoStreamRequest) throws ApiException {
        return websocketMarketStreamsApi.contractInfoStream(contractInfoStreamRequest);
    }

    public StreamBlockingQueueWrapper<DiffBookDepthStreamsResponse> diffBookDepthStreams(
            DiffBookDepthStreamsRequest diffBookDepthStreamsRequest) throws ApiException {
        return websocketMarketStreamsApi.diffBookDepthStreams(diffBookDepthStreamsRequest);
    }

    public StreamBlockingQueueWrapper<IndividualSymbolBookTickerStreamsResponse>
            individualSymbolBookTickerStreams(
                    IndividualSymbolBookTickerStreamsRequest
                            individualSymbolBookTickerStreamsRequest)
                    throws ApiException {
        return websocketMarketStreamsApi.individualSymbolBookTickerStreams(
                individualSymbolBookTickerStreamsRequest);
    }

    public StreamBlockingQueueWrapper<IndividualSymbolMiniTickerStreamResponse>
            individualSymbolMiniTickerStream(
                    IndividualSymbolMiniTickerStreamRequest individualSymbolMiniTickerStreamRequest)
                    throws ApiException {
        return websocketMarketStreamsApi.individualSymbolMiniTickerStream(
                individualSymbolMiniTickerStreamRequest);
    }

    public StreamBlockingQueueWrapper<IndividualSymbolTickerStreamsResponse>
            individualSymbolTickerStreams(
                    IndividualSymbolTickerStreamsRequest individualSymbolTickerStreamsRequest)
                    throws ApiException {
        return websocketMarketStreamsApi.individualSymbolTickerStreams(
                individualSymbolTickerStreamsRequest);
    }

    public StreamBlockingQueueWrapper<KlineCandlestickStreamsResponse> klineCandlestickStreams(
            KlineCandlestickStreamsRequest klineCandlestickStreamsRequest) throws ApiException {
        return websocketMarketStreamsApi.klineCandlestickStreams(klineCandlestickStreamsRequest);
    }

    public StreamBlockingQueueWrapper<LiquidationOrderStreamsResponse> liquidationOrderStreams(
            LiquidationOrderStreamsRequest liquidationOrderStreamsRequest) throws ApiException {
        return websocketMarketStreamsApi.liquidationOrderStreams(liquidationOrderStreamsRequest);
    }

    public StreamBlockingQueueWrapper<MarkPriceStreamResponse> markPriceStream(
            MarkPriceStreamRequest markPriceStreamRequest) throws ApiException {
        return websocketMarketStreamsApi.markPriceStream(markPriceStreamRequest);
    }

    public StreamBlockingQueueWrapper<MarkPriceStreamForAllMarketResponse>
            markPriceStreamForAllMarket(
                    MarkPriceStreamForAllMarketRequest markPriceStreamForAllMarketRequest)
                    throws ApiException {
        return websocketMarketStreamsApi.markPriceStreamForAllMarket(
                markPriceStreamForAllMarketRequest);
    }

    public StreamBlockingQueueWrapper<MultiAssetsModeAssetIndexResponse> multiAssetsModeAssetIndex(
            MultiAssetsModeAssetIndexRequest multiAssetsModeAssetIndexRequest) throws ApiException {
        return websocketMarketStreamsApi.multiAssetsModeAssetIndex(
                multiAssetsModeAssetIndexRequest);
    }

    public StreamBlockingQueueWrapper<PartialBookDepthStreamsResponse> partialBookDepthStreams(
            PartialBookDepthStreamsRequest partialBookDepthStreamsRequest) throws ApiException {
        return websocketMarketStreamsApi.partialBookDepthStreams(partialBookDepthStreamsRequest);
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
