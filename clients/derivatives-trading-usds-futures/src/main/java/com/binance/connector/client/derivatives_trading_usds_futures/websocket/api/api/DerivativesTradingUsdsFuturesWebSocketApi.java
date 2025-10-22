package com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.api;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.SystemUtil;
import com.binance.connector.client.common.websocket.adapter.ConnectionInterface;
import com.binance.connector.client.common.websocket.adapter.ConnectionWrapper;
import com.binance.connector.client.common.websocket.adapter.PoolConnectionWrapper;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.JSON;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.AccountInformationRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.AccountInformationResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.AccountInformationV2Request;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.AccountInformationV2Response;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.CancelOrderRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.CancelOrderResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.CloseUserDataStreamRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.CloseUserDataStreamResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.FuturesAccountBalanceRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.FuturesAccountBalanceResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.FuturesAccountBalanceV2Request;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.FuturesAccountBalanceV2Response;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.KeepaliveUserDataStreamRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.KeepaliveUserDataStreamResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.ModifyOrderRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.ModifyOrderResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.NewOrderRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.NewOrderResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.OrderBookRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.OrderBookResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.PositionInformationRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.PositionInformationResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.PositionInformationV2Request;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.PositionInformationV2Response;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.QueryOrderRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.QueryOrderResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.StartUserDataStreamRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.StartUserDataStreamResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.SymbolOrderBookTickerRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.SymbolOrderBookTickerResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.SymbolPriceTickerRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.SymbolPriceTickerResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class DerivativesTradingUsdsFuturesWebSocketApi {
    private static final String USER_AGENT =
            String.format(
                    "binance-derivatives-trading-usds-futures/6.0.0 (Java/%s; %s; %s)",
                    SystemUtil.getJavaVersion(), SystemUtil.getOs(), SystemUtil.getArch());

    private AccountApi accountApi;
    private MarketDataApi marketDataApi;
    private TradeApi tradeApi;
    private UserDataStreamsApi userDataStreamsApi;

    public DerivativesTradingUsdsFuturesWebSocketApi(WebSocketClientConfiguration configuration) {
        this(
                configuration.getUsePool()
                        ? new PoolConnectionWrapper(configuration, JSON.getGson())
                        : new ConnectionWrapper(configuration, JSON.getGson()));
    }

    public DerivativesTradingUsdsFuturesWebSocketApi(ConnectionInterface connection) {
        connection.setUserAgent(USER_AGENT);
        List<String> logonMethods = new ArrayList<>();
        List<String> logoutMethods = new ArrayList<>();

        connection.setLogonMethods(logonMethods);
        connection.setLogoutMethods(logoutMethods);
        if (!connection.isConnected()) {
            connection.connect();
        }

        this.accountApi = new AccountApi(connection);
        this.marketDataApi = new MarketDataApi(connection);
        this.tradeApi = new TradeApi(connection);
        this.userDataStreamsApi = new UserDataStreamsApi(connection);
    }

    public CompletableFuture<AccountInformationResponse> accountInformation(
            AccountInformationRequest accountInformationRequest) throws ApiException {
        return accountApi.accountInformation(accountInformationRequest);
    }

    public CompletableFuture<AccountInformationV2Response> accountInformationV2(
            AccountInformationV2Request accountInformationV2Request) throws ApiException {
        return accountApi.accountInformationV2(accountInformationV2Request);
    }

    public CompletableFuture<FuturesAccountBalanceResponse> futuresAccountBalance(
            FuturesAccountBalanceRequest futuresAccountBalanceRequest) throws ApiException {
        return accountApi.futuresAccountBalance(futuresAccountBalanceRequest);
    }

    public CompletableFuture<FuturesAccountBalanceV2Response> futuresAccountBalanceV2(
            FuturesAccountBalanceV2Request futuresAccountBalanceV2Request) throws ApiException {
        return accountApi.futuresAccountBalanceV2(futuresAccountBalanceV2Request);
    }

    public CompletableFuture<OrderBookResponse> orderBook(OrderBookRequest orderBookRequest)
            throws ApiException {
        return marketDataApi.orderBook(orderBookRequest);
    }

    public CompletableFuture<SymbolOrderBookTickerResponse> symbolOrderBookTicker(
            SymbolOrderBookTickerRequest symbolOrderBookTickerRequest) throws ApiException {
        return marketDataApi.symbolOrderBookTicker(symbolOrderBookTickerRequest);
    }

    public CompletableFuture<SymbolPriceTickerResponse> symbolPriceTicker(
            SymbolPriceTickerRequest symbolPriceTickerRequest) throws ApiException {
        return marketDataApi.symbolPriceTicker(symbolPriceTickerRequest);
    }

    public CompletableFuture<CancelOrderResponse> cancelOrder(CancelOrderRequest cancelOrderRequest)
            throws ApiException {
        return tradeApi.cancelOrder(cancelOrderRequest);
    }

    public CompletableFuture<ModifyOrderResponse> modifyOrder(ModifyOrderRequest modifyOrderRequest)
            throws ApiException {
        return tradeApi.modifyOrder(modifyOrderRequest);
    }

    public CompletableFuture<NewOrderResponse> newOrder(NewOrderRequest newOrderRequest)
            throws ApiException {
        return tradeApi.newOrder(newOrderRequest);
    }

    public CompletableFuture<PositionInformationResponse> positionInformation(
            PositionInformationRequest positionInformationRequest) throws ApiException {
        return tradeApi.positionInformation(positionInformationRequest);
    }

    public CompletableFuture<PositionInformationV2Response> positionInformationV2(
            PositionInformationV2Request positionInformationV2Request) throws ApiException {
        return tradeApi.positionInformationV2(positionInformationV2Request);
    }

    public CompletableFuture<QueryOrderResponse> queryOrder(QueryOrderRequest queryOrderRequest)
            throws ApiException {
        return tradeApi.queryOrder(queryOrderRequest);
    }

    public CompletableFuture<CloseUserDataStreamResponse> closeUserDataStream(
            CloseUserDataStreamRequest closeUserDataStreamRequest) throws ApiException {
        return userDataStreamsApi.closeUserDataStream(closeUserDataStreamRequest);
    }

    public CompletableFuture<KeepaliveUserDataStreamResponse> keepaliveUserDataStream(
            KeepaliveUserDataStreamRequest keepaliveUserDataStreamRequest) throws ApiException {
        return userDataStreamsApi.keepaliveUserDataStream(keepaliveUserDataStreamRequest);
    }

    public CompletableFuture<StartUserDataStreamResponse> startUserDataStream(
            StartUserDataStreamRequest startUserDataStreamRequest) throws ApiException {
        return userDataStreamsApi.startUserDataStream(startUserDataStreamRequest);
    }
}
