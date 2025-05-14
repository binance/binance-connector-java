package com.binance.connector.client.spot.websocket.api.api;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.SystemUtil;
import com.binance.connector.client.common.websocket.adapter.ConnectionInterface;
import com.binance.connector.client.common.websocket.adapter.ConnectionWrapper;
import com.binance.connector.client.common.websocket.adapter.PoolConnectionWrapper;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.JSON;
import com.binance.connector.client.spot.websocket.api.model.AccountCommissionRequest;
import com.binance.connector.client.spot.websocket.api.model.AccountCommissionResponse;
import com.binance.connector.client.spot.websocket.api.model.AccountRateLimitsOrdersRequest;
import com.binance.connector.client.spot.websocket.api.model.AccountRateLimitsOrdersResponse;
import com.binance.connector.client.spot.websocket.api.model.AccountStatusRequest;
import com.binance.connector.client.spot.websocket.api.model.AccountStatusResponse;
import com.binance.connector.client.spot.websocket.api.model.AllOrderListsRequest;
import com.binance.connector.client.spot.websocket.api.model.AllOrderListsResponse;
import com.binance.connector.client.spot.websocket.api.model.AllOrdersRequest;
import com.binance.connector.client.spot.websocket.api.model.AllOrdersResponse;
import com.binance.connector.client.spot.websocket.api.model.AvgPriceRequest;
import com.binance.connector.client.spot.websocket.api.model.AvgPriceResponse;
import com.binance.connector.client.spot.websocket.api.model.DepthRequest;
import com.binance.connector.client.spot.websocket.api.model.DepthResponse;
import com.binance.connector.client.spot.websocket.api.model.ExchangeInfoRequest;
import com.binance.connector.client.spot.websocket.api.model.ExchangeInfoResponse;
import com.binance.connector.client.spot.websocket.api.model.KlinesRequest;
import com.binance.connector.client.spot.websocket.api.model.KlinesResponse;
import com.binance.connector.client.spot.websocket.api.model.MyAllocationsRequest;
import com.binance.connector.client.spot.websocket.api.model.MyAllocationsResponse;
import com.binance.connector.client.spot.websocket.api.model.MyPreventedMatchesRequest;
import com.binance.connector.client.spot.websocket.api.model.MyPreventedMatchesResponse;
import com.binance.connector.client.spot.websocket.api.model.MyTradesRequest;
import com.binance.connector.client.spot.websocket.api.model.MyTradesResponse;
import com.binance.connector.client.spot.websocket.api.model.OpenOrderListsStatusRequest;
import com.binance.connector.client.spot.websocket.api.model.OpenOrderListsStatusResponse;
import com.binance.connector.client.spot.websocket.api.model.OpenOrdersCancelAllRequest;
import com.binance.connector.client.spot.websocket.api.model.OpenOrdersCancelAllResponse;
import com.binance.connector.client.spot.websocket.api.model.OpenOrdersStatusRequest;
import com.binance.connector.client.spot.websocket.api.model.OpenOrdersStatusResponse;
import com.binance.connector.client.spot.websocket.api.model.OrderAmendKeepPriorityRequest;
import com.binance.connector.client.spot.websocket.api.model.OrderAmendKeepPriorityResponse;
import com.binance.connector.client.spot.websocket.api.model.OrderAmendmentsRequest;
import com.binance.connector.client.spot.websocket.api.model.OrderAmendmentsResponse;
import com.binance.connector.client.spot.websocket.api.model.OrderCancelReplaceRequest;
import com.binance.connector.client.spot.websocket.api.model.OrderCancelReplaceResponse;
import com.binance.connector.client.spot.websocket.api.model.OrderCancelRequest;
import com.binance.connector.client.spot.websocket.api.model.OrderCancelResponse;
import com.binance.connector.client.spot.websocket.api.model.OrderListCancelRequest;
import com.binance.connector.client.spot.websocket.api.model.OrderListCancelResponse;
import com.binance.connector.client.spot.websocket.api.model.OrderListPlaceOcoRequest;
import com.binance.connector.client.spot.websocket.api.model.OrderListPlaceOcoResponse;
import com.binance.connector.client.spot.websocket.api.model.OrderListPlaceOtoRequest;
import com.binance.connector.client.spot.websocket.api.model.OrderListPlaceOtoResponse;
import com.binance.connector.client.spot.websocket.api.model.OrderListPlaceOtocoRequest;
import com.binance.connector.client.spot.websocket.api.model.OrderListPlaceOtocoResponse;
import com.binance.connector.client.spot.websocket.api.model.OrderListPlaceRequest;
import com.binance.connector.client.spot.websocket.api.model.OrderListPlaceResponse;
import com.binance.connector.client.spot.websocket.api.model.OrderListStatusRequest;
import com.binance.connector.client.spot.websocket.api.model.OrderListStatusResponse;
import com.binance.connector.client.spot.websocket.api.model.OrderPlaceRequest;
import com.binance.connector.client.spot.websocket.api.model.OrderPlaceResponse;
import com.binance.connector.client.spot.websocket.api.model.OrderStatusRequest;
import com.binance.connector.client.spot.websocket.api.model.OrderStatusResponse;
import com.binance.connector.client.spot.websocket.api.model.OrderTestRequest;
import com.binance.connector.client.spot.websocket.api.model.OrderTestResponse;
import com.binance.connector.client.spot.websocket.api.model.SessionLogonRequest;
import com.binance.connector.client.spot.websocket.api.model.SessionLogonResponse;
import com.binance.connector.client.spot.websocket.api.model.SessionLogoutResponse;
import com.binance.connector.client.spot.websocket.api.model.SessionStatusResponse;
import com.binance.connector.client.spot.websocket.api.model.SorOrderPlaceRequest;
import com.binance.connector.client.spot.websocket.api.model.SorOrderPlaceResponse;
import com.binance.connector.client.spot.websocket.api.model.SorOrderTestRequest;
import com.binance.connector.client.spot.websocket.api.model.SorOrderTestResponse;
import com.binance.connector.client.spot.websocket.api.model.Ticker24hrRequest;
import com.binance.connector.client.spot.websocket.api.model.Ticker24hrResponse;
import com.binance.connector.client.spot.websocket.api.model.TickerBookRequest;
import com.binance.connector.client.spot.websocket.api.model.TickerBookResponse;
import com.binance.connector.client.spot.websocket.api.model.TickerPriceRequest;
import com.binance.connector.client.spot.websocket.api.model.TickerPriceResponse;
import com.binance.connector.client.spot.websocket.api.model.TickerRequest;
import com.binance.connector.client.spot.websocket.api.model.TickerResponse;
import com.binance.connector.client.spot.websocket.api.model.TickerTradingDayRequest;
import com.binance.connector.client.spot.websocket.api.model.TickerTradingDayResponse;
import com.binance.connector.client.spot.websocket.api.model.TimeResponse;
import com.binance.connector.client.spot.websocket.api.model.TradesAggregateRequest;
import com.binance.connector.client.spot.websocket.api.model.TradesAggregateResponse;
import com.binance.connector.client.spot.websocket.api.model.TradesHistoricalRequest;
import com.binance.connector.client.spot.websocket.api.model.TradesHistoricalResponse;
import com.binance.connector.client.spot.websocket.api.model.TradesRecentRequest;
import com.binance.connector.client.spot.websocket.api.model.TradesRecentResponse;
import com.binance.connector.client.spot.websocket.api.model.UiKlinesRequest;
import com.binance.connector.client.spot.websocket.api.model.UiKlinesResponse;
import com.binance.connector.client.spot.websocket.api.model.UserDataStreamPingRequest;
import com.binance.connector.client.spot.websocket.api.model.UserDataStreamPingResponse;
import com.binance.connector.client.spot.websocket.api.model.UserDataStreamStartResponse;
import com.binance.connector.client.spot.websocket.api.model.UserDataStreamStopRequest;
import com.binance.connector.client.spot.websocket.api.model.UserDataStreamStopResponse;
import com.binance.connector.client.spot.websocket.api.model.UserDataStreamSubscribeResponse;
import com.binance.connector.client.spot.websocket.api.model.UserDataStreamUnsubscribeResponse;
import java.util.concurrent.CompletableFuture;

public class SpotWebSocketApi {
    private static final String USER_AGENT =
            String.format(
                    "binance-spot/2.0.0 (Java/%s; %s; %s)",
                    SystemUtil.getJavaVersion(), SystemUtil.getOs(), SystemUtil.getArch());

    private AccountApi accountApi;
    private AuthApi authApi;
    private GeneralApi generalApi;
    private MarketApi marketApi;
    private TradeApi tradeApi;
    private UserDataStreamApi userDataStreamApi;

    public SpotWebSocketApi(WebSocketClientConfiguration configuration) {
        this(
                configuration.getUsePool()
                        ? new PoolConnectionWrapper(configuration, JSON.getGson())
                        : new ConnectionWrapper(configuration, JSON.getGson()));
    }

    public SpotWebSocketApi(ConnectionInterface connection) {
        connection.setUserAgent(USER_AGENT);
        if (!connection.isConnected()) {
            connection.connect();
        }

        this.accountApi = new AccountApi(connection);
        this.authApi = new AuthApi(connection);
        this.generalApi = new GeneralApi(connection);
        this.marketApi = new MarketApi(connection);
        this.tradeApi = new TradeApi(connection);
        this.userDataStreamApi = new UserDataStreamApi(connection);
    }

    public CompletableFuture<AccountCommissionResponse> accountCommission(
            AccountCommissionRequest accountCommissionRequest) throws ApiException {
        return accountApi.accountCommission(accountCommissionRequest);
    }

    public CompletableFuture<AccountRateLimitsOrdersResponse> accountRateLimitsOrders(
            AccountRateLimitsOrdersRequest accountRateLimitsOrdersRequest) throws ApiException {
        return accountApi.accountRateLimitsOrders(accountRateLimitsOrdersRequest);
    }

    public CompletableFuture<AccountStatusResponse> accountStatus(
            AccountStatusRequest accountStatusRequest) throws ApiException {
        return accountApi.accountStatus(accountStatusRequest);
    }

    public CompletableFuture<AllOrderListsResponse> allOrderLists(
            AllOrderListsRequest allOrderListsRequest) throws ApiException {
        return accountApi.allOrderLists(allOrderListsRequest);
    }

    public CompletableFuture<AllOrdersResponse> allOrders(AllOrdersRequest allOrdersRequest)
            throws ApiException {
        return accountApi.allOrders(allOrdersRequest);
    }

    public CompletableFuture<MyAllocationsResponse> myAllocations(
            MyAllocationsRequest myAllocationsRequest) throws ApiException {
        return accountApi.myAllocations(myAllocationsRequest);
    }

    public CompletableFuture<MyPreventedMatchesResponse> myPreventedMatches(
            MyPreventedMatchesRequest myPreventedMatchesRequest) throws ApiException {
        return accountApi.myPreventedMatches(myPreventedMatchesRequest);
    }

    public CompletableFuture<MyTradesResponse> myTrades(MyTradesRequest myTradesRequest)
            throws ApiException {
        return accountApi.myTrades(myTradesRequest);
    }

    public CompletableFuture<OrderAmendmentsResponse> orderAmendments(
            OrderAmendmentsRequest orderAmendmentsRequest) throws ApiException {
        return accountApi.orderAmendments(orderAmendmentsRequest);
    }

    public CompletableFuture<SessionLogonResponse> sessionLogon(
            SessionLogonRequest sessionLogonRequest) throws ApiException {
        return authApi.sessionLogon(sessionLogonRequest);
    }

    public CompletableFuture<SessionLogoutResponse> sessionLogout() throws ApiException {
        return authApi.sessionLogout();
    }

    public CompletableFuture<SessionStatusResponse> sessionStatus() throws ApiException {
        return authApi.sessionStatus();
    }

    public CompletableFuture<ExchangeInfoResponse> exchangeInfo(
            ExchangeInfoRequest exchangeInfoRequest) throws ApiException {
        return generalApi.exchangeInfo(exchangeInfoRequest);
    }

    public void ping() throws ApiException {
        generalApi.ping();
    }

    public CompletableFuture<TimeResponse> time() throws ApiException {
        return generalApi.time();
    }

    public CompletableFuture<AvgPriceResponse> avgPrice(AvgPriceRequest avgPriceRequest)
            throws ApiException {
        return marketApi.avgPrice(avgPriceRequest);
    }

    public CompletableFuture<DepthResponse> depth(DepthRequest depthRequest) throws ApiException {
        return marketApi.depth(depthRequest);
    }

    public CompletableFuture<KlinesResponse> klines(KlinesRequest klinesRequest)
            throws ApiException {
        return marketApi.klines(klinesRequest);
    }

    public CompletableFuture<TickerResponse> ticker(TickerRequest tickerRequest)
            throws ApiException {
        return marketApi.ticker(tickerRequest);
    }

    public CompletableFuture<Ticker24hrResponse> ticker24hr(Ticker24hrRequest ticker24hrRequest)
            throws ApiException {
        return marketApi.ticker24hr(ticker24hrRequest);
    }

    public CompletableFuture<TickerBookResponse> tickerBook(TickerBookRequest tickerBookRequest)
            throws ApiException {
        return marketApi.tickerBook(tickerBookRequest);
    }

    public CompletableFuture<TickerPriceResponse> tickerPrice(TickerPriceRequest tickerPriceRequest)
            throws ApiException {
        return marketApi.tickerPrice(tickerPriceRequest);
    }

    public CompletableFuture<TickerTradingDayResponse> tickerTradingDay(
            TickerTradingDayRequest tickerTradingDayRequest) throws ApiException {
        return marketApi.tickerTradingDay(tickerTradingDayRequest);
    }

    public CompletableFuture<TradesAggregateResponse> tradesAggregate(
            TradesAggregateRequest tradesAggregateRequest) throws ApiException {
        return marketApi.tradesAggregate(tradesAggregateRequest);
    }

    public CompletableFuture<TradesHistoricalResponse> tradesHistorical(
            TradesHistoricalRequest tradesHistoricalRequest) throws ApiException {
        return marketApi.tradesHistorical(tradesHistoricalRequest);
    }

    public CompletableFuture<TradesRecentResponse> tradesRecent(
            TradesRecentRequest tradesRecentRequest) throws ApiException {
        return marketApi.tradesRecent(tradesRecentRequest);
    }

    public CompletableFuture<UiKlinesResponse> uiKlines(UiKlinesRequest uiKlinesRequest)
            throws ApiException {
        return marketApi.uiKlines(uiKlinesRequest);
    }

    public CompletableFuture<OpenOrderListsStatusResponse> openOrderListsStatus(
            OpenOrderListsStatusRequest openOrderListsStatusRequest) throws ApiException {
        return tradeApi.openOrderListsStatus(openOrderListsStatusRequest);
    }

    public CompletableFuture<OpenOrdersCancelAllResponse> openOrdersCancelAll(
            OpenOrdersCancelAllRequest openOrdersCancelAllRequest) throws ApiException {
        return tradeApi.openOrdersCancelAll(openOrdersCancelAllRequest);
    }

    public CompletableFuture<OpenOrdersStatusResponse> openOrdersStatus(
            OpenOrdersStatusRequest openOrdersStatusRequest) throws ApiException {
        return tradeApi.openOrdersStatus(openOrdersStatusRequest);
    }

    public CompletableFuture<OrderAmendKeepPriorityResponse> orderAmendKeepPriority(
            OrderAmendKeepPriorityRequest orderAmendKeepPriorityRequest) throws ApiException {
        return tradeApi.orderAmendKeepPriority(orderAmendKeepPriorityRequest);
    }

    public CompletableFuture<OrderCancelResponse> orderCancel(OrderCancelRequest orderCancelRequest)
            throws ApiException {
        return tradeApi.orderCancel(orderCancelRequest);
    }

    public CompletableFuture<OrderCancelReplaceResponse> orderCancelReplace(
            OrderCancelReplaceRequest orderCancelReplaceRequest) throws ApiException {
        return tradeApi.orderCancelReplace(orderCancelReplaceRequest);
    }

    public CompletableFuture<OrderListCancelResponse> orderListCancel(
            OrderListCancelRequest orderListCancelRequest) throws ApiException {
        return tradeApi.orderListCancel(orderListCancelRequest);
    }

    public CompletableFuture<OrderListPlaceResponse> orderListPlace(
            OrderListPlaceRequest orderListPlaceRequest) throws ApiException {
        return tradeApi.orderListPlace(orderListPlaceRequest);
    }

    public CompletableFuture<OrderListPlaceOcoResponse> orderListPlaceOco(
            OrderListPlaceOcoRequest orderListPlaceOcoRequest) throws ApiException {
        return tradeApi.orderListPlaceOco(orderListPlaceOcoRequest);
    }

    public CompletableFuture<OrderListPlaceOtoResponse> orderListPlaceOto(
            OrderListPlaceOtoRequest orderListPlaceOtoRequest) throws ApiException {
        return tradeApi.orderListPlaceOto(orderListPlaceOtoRequest);
    }

    public CompletableFuture<OrderListPlaceOtocoResponse> orderListPlaceOtoco(
            OrderListPlaceOtocoRequest orderListPlaceOtocoRequest) throws ApiException {
        return tradeApi.orderListPlaceOtoco(orderListPlaceOtocoRequest);
    }

    public CompletableFuture<OrderListStatusResponse> orderListStatus(
            OrderListStatusRequest orderListStatusRequest) throws ApiException {
        return tradeApi.orderListStatus(orderListStatusRequest);
    }

    public CompletableFuture<OrderPlaceResponse> orderPlace(OrderPlaceRequest orderPlaceRequest)
            throws ApiException {
        return tradeApi.orderPlace(orderPlaceRequest);
    }

    public CompletableFuture<OrderStatusResponse> orderStatus(OrderStatusRequest orderStatusRequest)
            throws ApiException {
        return tradeApi.orderStatus(orderStatusRequest);
    }

    public CompletableFuture<OrderTestResponse> orderTest(OrderTestRequest orderTestRequest)
            throws ApiException {
        return tradeApi.orderTest(orderTestRequest);
    }

    public CompletableFuture<SorOrderPlaceResponse> sorOrderPlace(
            SorOrderPlaceRequest sorOrderPlaceRequest) throws ApiException {
        return tradeApi.sorOrderPlace(sorOrderPlaceRequest);
    }

    public CompletableFuture<SorOrderTestResponse> sorOrderTest(
            SorOrderTestRequest sorOrderTestRequest) throws ApiException {
        return tradeApi.sorOrderTest(sorOrderTestRequest);
    }

    public CompletableFuture<UserDataStreamPingResponse> userDataStreamPing(
            UserDataStreamPingRequest userDataStreamPingRequest) throws ApiException {
        return userDataStreamApi.userDataStreamPing(userDataStreamPingRequest);
    }

    public CompletableFuture<UserDataStreamStartResponse> userDataStreamStart()
            throws ApiException {
        return userDataStreamApi.userDataStreamStart();
    }

    public CompletableFuture<UserDataStreamStopResponse> userDataStreamStop(
            UserDataStreamStopRequest userDataStreamStopRequest) throws ApiException {
        return userDataStreamApi.userDataStreamStop(userDataStreamStopRequest);
    }

    public CompletableFuture<UserDataStreamSubscribeResponse> userDataStreamSubscribe()
            throws ApiException {
        return userDataStreamApi.userDataStreamSubscribe();
    }

    public CompletableFuture<UserDataStreamUnsubscribeResponse> userDataStreamUnsubscribe()
            throws ApiException {
        return userDataStreamApi.userDataStreamUnsubscribe();
    }
}
