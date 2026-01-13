package com.binance.connector.client.derivatives_trading_options.websocket.stream.api;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.SystemUtil;
import com.binance.connector.client.common.websocket.adapter.stream.StreamConnectionInterface;
import com.binance.connector.client.common.websocket.adapter.stream.StreamConnectionPoolWrapper;
import com.binance.connector.client.common.websocket.adapter.stream.StreamConnectionWrapper;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.dtos.RequestWrapperDTO;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueue;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.JSON;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.DiffBookDepthStreamsRequest;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.DiffBookDepthStreamsResponse;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.IndexPriceStreamsRequest;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.IndexPriceStreamsResponse;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.IndividualSymbolBookTickerStreamsRequest;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.IndividualSymbolBookTickerStreamsResponse;
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
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.Ticker24HourRequest;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.Ticker24HourResponse;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.TradeStreamsRequest;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.TradeStreamsResponse;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.UserDataStreamEventsResponse;
import com.google.gson.reflect.TypeToken;
import java.util.Collections;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class DerivativesTradingOptionsWebSocketStreams {
    private static final String USER_AGENT =
            String.format(
                    "binance-derivatives-trading-options/6.0.0 (Java/%s; %s; %s)",
                    SystemUtil.getJavaVersion(), SystemUtil.getOs(), SystemUtil.getArch());

    private WebSocketClientConfiguration clientConfiguration;
    private StreamConnectionInterface connection;

    private MarketApi marketApi;
    private PublicApi publicApi;

    public DerivativesTradingOptionsWebSocketStreams(WebSocketClientConfiguration configuration) {
        this.clientConfiguration = configuration;
    }

    public StreamConnectionInterface getConnection() {
        if (connection == null) {
            WebSocketClientConfiguration configuration =
                    (WebSocketClientConfiguration) clientConfiguration.clone();
            if (configuration.getUrl().endsWith("/stream")
                    && !configuration.getUrl().endsWith("/private/stream")) {
                configuration.setUrl(configuration.getUrl().replace("/stream", "/private/stream"));
            }
            connection =
                    clientConfiguration.getUsePool()
                            ? new StreamConnectionPoolWrapper(clientConfiguration, JSON.getGson())
                            : new StreamConnectionWrapper(clientConfiguration, JSON.getGson());
        }
        return connection;
    }

    public MarketApi getMarketApi() {
        if (marketApi == null) {
            WebSocketClientConfiguration configuration =
                    (WebSocketClientConfiguration) clientConfiguration.clone();
            if (configuration.getUrl().endsWith("/stream")
                    && !configuration.getUrl().endsWith("/market/stream")) {
                configuration.setUrl(configuration.getUrl().replace("/stream", "/market/stream"));
            }
            marketApi = new MarketApi(configuration);
        }
        return marketApi;
    }

    public PublicApi getPublicApi() {
        if (publicApi == null) {
            WebSocketClientConfiguration configuration =
                    (WebSocketClientConfiguration) clientConfiguration.clone();
            if (configuration.getUrl().endsWith("/stream")
                    && !configuration.getUrl().endsWith("/public/stream")) {
                configuration.setUrl(configuration.getUrl().replace("/stream", "/public/stream"));
            }
            publicApi = new PublicApi(configuration);
        }
        return publicApi;
    }

    public StreamBlockingQueueWrapper<IndexPriceStreamsResponse> indexPriceStreams(
            IndexPriceStreamsRequest indexPriceStreamsRequest) throws ApiException {
        return getMarketApi().indexPriceStreams(indexPriceStreamsRequest);
    }

    public StreamBlockingQueueWrapper<KlineCandlestickStreamsResponse> klineCandlestickStreams(
            KlineCandlestickStreamsRequest klineCandlestickStreamsRequest) throws ApiException {
        return getMarketApi().klineCandlestickStreams(klineCandlestickStreamsRequest);
    }

    public StreamBlockingQueueWrapper<MarkPriceResponse> markPrice(
            MarkPriceRequest markPriceRequest) throws ApiException {
        return getMarketApi().markPrice(markPriceRequest);
    }

    public StreamBlockingQueueWrapper<NewSymbolInfoResponse> newSymbolInfo(
            NewSymbolInfoRequest newSymbolInfoRequest) throws ApiException {
        return getMarketApi().newSymbolInfo(newSymbolInfoRequest);
    }

    public StreamBlockingQueueWrapper<OpenInterestResponse> openInterest(
            OpenInterestRequest openInterestRequest) throws ApiException {
        return getMarketApi().openInterest(openInterestRequest);
    }

    public StreamBlockingQueueWrapper<DiffBookDepthStreamsResponse> diffBookDepthStreams(
            DiffBookDepthStreamsRequest diffBookDepthStreamsRequest) throws ApiException {
        return getPublicApi().diffBookDepthStreams(diffBookDepthStreamsRequest);
    }

    public StreamBlockingQueueWrapper<IndividualSymbolBookTickerStreamsResponse>
            individualSymbolBookTickerStreams(
                    IndividualSymbolBookTickerStreamsRequest
                            individualSymbolBookTickerStreamsRequest)
                    throws ApiException {
        return getPublicApi()
                .individualSymbolBookTickerStreams(individualSymbolBookTickerStreamsRequest);
    }

    public StreamBlockingQueueWrapper<PartialBookDepthStreamsResponse> partialBookDepthStreams(
            PartialBookDepthStreamsRequest partialBookDepthStreamsRequest) throws ApiException {
        return getPublicApi().partialBookDepthStreams(partialBookDepthStreamsRequest);
    }

    public StreamBlockingQueueWrapper<Ticker24HourResponse> ticker24Hour(
            Ticker24HourRequest ticker24HourRequest) throws ApiException {
        return getPublicApi().ticker24Hour(ticker24HourRequest);
    }

    public StreamBlockingQueueWrapper<TradeStreamsResponse> tradeStreams(
            TradeStreamsRequest tradeStreamsRequest) throws ApiException {
        return getPublicApi().tradeStreams(tradeStreamsRequest);
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
                getConnection().subscribe(requestWrapperDTO);

        TypeToken<UserDataStreamEventsResponse> typeToken = new TypeToken<>() {};
        StreamBlockingQueue<String> queue = queuesMap.get(listenKey);
        return new StreamBlockingQueueWrapper<>(queue, typeToken, JSON.getGson());
    }

    public String getRequestID() {
        Random rand = new Random();
        return Integer.toString(Math.abs(rand.nextInt()));
    }
}
