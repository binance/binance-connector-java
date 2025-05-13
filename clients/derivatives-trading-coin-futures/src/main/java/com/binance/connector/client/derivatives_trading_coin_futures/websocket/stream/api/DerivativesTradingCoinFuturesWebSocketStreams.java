package com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.SystemUtil;
import com.binance.connector.client.common.websocket.adapter.stream.StreamConnectionInterface;
import com.binance.connector.client.common.websocket.adapter.stream.StreamConnectionPoolWrapper;
import com.binance.connector.client.common.websocket.adapter.stream.StreamConnectionWrapper;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.JSON;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.AggregateTradeStreamsRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.AggregateTradeStreamsResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.AllBookTickersStreamRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.AllBookTickersStreamResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.AllMarketLiquidationOrderStreamsRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.AllMarketLiquidationOrderStreamsResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.AllMarketMiniTickersStreamRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.AllMarketMiniTickersStreamResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.AllMarketTickersStreamsRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.AllMarketTickersStreamsResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.ContinuousContractKlineCandlestickStreamsRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.ContinuousContractKlineCandlestickStreamsResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.ContractInfoStreamRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.ContractInfoStreamResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.DiffBookDepthStreamsRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.DiffBookDepthStreamsResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.IndexKlineCandlestickStreamsRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.IndexKlineCandlestickStreamsResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.IndexPriceStreamRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.IndexPriceStreamResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.IndividualSymbolBookTickerStreamsRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.IndividualSymbolBookTickerStreamsResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.IndividualSymbolMiniTickerStreamRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.IndividualSymbolMiniTickerStreamResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.IndividualSymbolTickerStreamsRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.IndividualSymbolTickerStreamsResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.KlineCandlestickStreamsRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.KlineCandlestickStreamsResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.LiquidationOrderStreamsRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.LiquidationOrderStreamsResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.MarkPriceKlineCandlestickStreamsRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.MarkPriceKlineCandlestickStreamsResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.MarkPriceOfAllSymbolsOfAPairRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.MarkPriceOfAllSymbolsOfAPairResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.MarkPriceStreamRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.MarkPriceStreamResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.PartialBookDepthStreamsRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.PartialBookDepthStreamsResponse;

public class DerivativesTradingCoinFuturesWebSocketStreams {
    private static final String USER_AGENT =
            String.format(
                    "binance-derivatives-trading-coin-futures/1.2.0 (Java/%s; %s; %s)",
                    SystemUtil.getJavaVersion(), SystemUtil.getOs(), SystemUtil.getArch());

    private WebsocketMarketStreamsApi websocketMarketStreamsApi;

    public DerivativesTradingCoinFuturesWebSocketStreams(
            WebSocketClientConfiguration configuration) {
        this(
                configuration.getUsePool()
                        ? new StreamConnectionPoolWrapper(configuration, JSON.getGson())
                        : new StreamConnectionWrapper(configuration, JSON.getGson()));
    }

    public DerivativesTradingCoinFuturesWebSocketStreams(StreamConnectionInterface connection) {
        connection.setUserAgent(USER_AGENT);
        if (!connection.isConnected()) {
            connection.connect();
        }

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

    public StreamBlockingQueueWrapper<IndexKlineCandlestickStreamsResponse>
            indexKlineCandlestickStreams(
                    IndexKlineCandlestickStreamsRequest indexKlineCandlestickStreamsRequest)
                    throws ApiException {
        return websocketMarketStreamsApi.indexKlineCandlestickStreams(
                indexKlineCandlestickStreamsRequest);
    }

    public StreamBlockingQueueWrapper<IndexPriceStreamResponse> indexPriceStream(
            IndexPriceStreamRequest indexPriceStreamRequest) throws ApiException {
        return websocketMarketStreamsApi.indexPriceStream(indexPriceStreamRequest);
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

    public StreamBlockingQueueWrapper<MarkPriceKlineCandlestickStreamsResponse>
            markPriceKlineCandlestickStreams(
                    MarkPriceKlineCandlestickStreamsRequest markPriceKlineCandlestickStreamsRequest)
                    throws ApiException {
        return websocketMarketStreamsApi.markPriceKlineCandlestickStreams(
                markPriceKlineCandlestickStreamsRequest);
    }

    public StreamBlockingQueueWrapper<MarkPriceOfAllSymbolsOfAPairResponse>
            markPriceOfAllSymbolsOfAPair(
                    MarkPriceOfAllSymbolsOfAPairRequest markPriceOfAllSymbolsOfAPairRequest)
                    throws ApiException {
        return websocketMarketStreamsApi.markPriceOfAllSymbolsOfAPair(
                markPriceOfAllSymbolsOfAPairRequest);
    }

    public StreamBlockingQueueWrapper<MarkPriceStreamResponse> markPriceStream(
            MarkPriceStreamRequest markPriceStreamRequest) throws ApiException {
        return websocketMarketStreamsApi.markPriceStream(markPriceStreamRequest);
    }

    public StreamBlockingQueueWrapper<PartialBookDepthStreamsResponse> partialBookDepthStreams(
            PartialBookDepthStreamsRequest partialBookDepthStreamsRequest) throws ApiException {
        return websocketMarketStreamsApi.partialBookDepthStreams(partialBookDepthStreamsRequest);
    }
}
