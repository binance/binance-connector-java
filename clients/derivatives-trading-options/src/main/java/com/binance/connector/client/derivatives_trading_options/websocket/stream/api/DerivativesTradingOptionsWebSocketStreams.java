package com.binance.connector.client.derivatives_trading_options.websocket.stream.api;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.SystemUtil;
import com.binance.connector.client.common.websocket.adapter.stream.StreamConnectionInterface;
import com.binance.connector.client.common.websocket.adapter.stream.StreamConnectionPoolWrapper;
import com.binance.connector.client.common.websocket.adapter.stream.StreamConnectionWrapper;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.JSON;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.IndexPriceStreamsRequest;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.IndexPriceStreamsResponse;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.KlineCandlestickStreamsRequest;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.KlineCandlestickStreamsResponse;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.MarkPriceRequest;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.MarkPriceResponse;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.NewSymbolInfoRequest;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.NewSymbolInfoResponse;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.OpenInterestRequest;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.OpenInterestResponse;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.PartialBookDepthStreamsRequest;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.PartialBookDepthStreamsResponse;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.Ticker24HourByUnderlyingAssetAndExpirationDataRequest;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.Ticker24HourByUnderlyingAssetAndExpirationDataResponse;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.Ticker24HourRequest;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.Ticker24HourResponse;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.TradeStreamsRequest;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.TradeStreamsResponse;

public class DerivativesTradingOptionsWebSocketStreams {
    private static final String USER_AGENT =
            String.format(
                    "binance-derivatives-trading-options/1.0.0 (Java/%s; %s; %s)",
                    SystemUtil.getJavaVersion(), SystemUtil.getOs(), SystemUtil.getArch());

    private WebsocketMarketStreamsApi websocketMarketStreamsApi;

    public DerivativesTradingOptionsWebSocketStreams(WebSocketClientConfiguration configuration) {
        this(
                configuration.getUsePool()
                        ? new StreamConnectionPoolWrapper(configuration, JSON.getGson())
                        : new StreamConnectionWrapper(configuration, JSON.getGson()));
    }

    public DerivativesTradingOptionsWebSocketStreams(StreamConnectionInterface connection) {
        connection.setUserAgent(USER_AGENT);
        if (!connection.isConnected()) {
            connection.connect();
        }

        this.websocketMarketStreamsApi = new WebsocketMarketStreamsApi(connection);
    }

    public StreamBlockingQueueWrapper<IndexPriceStreamsResponse> indexPriceStreams(
            IndexPriceStreamsRequest indexPriceStreamsRequest) throws ApiException {
        return websocketMarketStreamsApi.indexPriceStreams(indexPriceStreamsRequest);
    }

    public StreamBlockingQueueWrapper<KlineCandlestickStreamsResponse> klineCandlestickStreams(
            KlineCandlestickStreamsRequest klineCandlestickStreamsRequest) throws ApiException {
        return websocketMarketStreamsApi.klineCandlestickStreams(klineCandlestickStreamsRequest);
    }

    public StreamBlockingQueueWrapper<MarkPriceResponse> markPrice(
            MarkPriceRequest markPriceRequest) throws ApiException {
        return websocketMarketStreamsApi.markPrice(markPriceRequest);
    }

    public StreamBlockingQueueWrapper<NewSymbolInfoResponse> newSymbolInfo(
            NewSymbolInfoRequest newSymbolInfoRequest) throws ApiException {
        return websocketMarketStreamsApi.newSymbolInfo(newSymbolInfoRequest);
    }

    public StreamBlockingQueueWrapper<OpenInterestResponse> openInterest(
            OpenInterestRequest openInterestRequest) throws ApiException {
        return websocketMarketStreamsApi.openInterest(openInterestRequest);
    }

    public StreamBlockingQueueWrapper<PartialBookDepthStreamsResponse> partialBookDepthStreams(
            PartialBookDepthStreamsRequest partialBookDepthStreamsRequest) throws ApiException {
        return websocketMarketStreamsApi.partialBookDepthStreams(partialBookDepthStreamsRequest);
    }

    public StreamBlockingQueueWrapper<Ticker24HourResponse> ticker24Hour(
            Ticker24HourRequest ticker24HourRequest) throws ApiException {
        return websocketMarketStreamsApi.ticker24Hour(ticker24HourRequest);
    }

    public StreamBlockingQueueWrapper<Ticker24HourByUnderlyingAssetAndExpirationDataResponse>
            ticker24HourByUnderlyingAssetAndExpirationData(
                    Ticker24HourByUnderlyingAssetAndExpirationDataRequest
                            ticker24HourByUnderlyingAssetAndExpirationDataRequest)
                    throws ApiException {
        return websocketMarketStreamsApi.ticker24HourByUnderlyingAssetAndExpirationData(
                ticker24HourByUnderlyingAssetAndExpirationDataRequest);
    }

    public StreamBlockingQueueWrapper<TradeStreamsResponse> tradeStreams(
            TradeStreamsRequest tradeStreamsRequest) throws ApiException {
        return websocketMarketStreamsApi.tradeStreams(tradeStreamsRequest);
    }
}
