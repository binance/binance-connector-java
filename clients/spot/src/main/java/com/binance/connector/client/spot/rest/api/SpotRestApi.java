package com.binance.connector.client.spot.rest.api;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.model.AccountCommissionResponse;
import com.binance.connector.client.spot.rest.model.AggTradesResponse;
import com.binance.connector.client.spot.rest.model.AllOrderListResponse;
import com.binance.connector.client.spot.rest.model.AllOrdersResponse;
import com.binance.connector.client.spot.rest.model.AvgPriceResponse;
import com.binance.connector.client.spot.rest.model.CancelRestrictions;
import com.binance.connector.client.spot.rest.model.DeleteOpenOrdersResponse;
import com.binance.connector.client.spot.rest.model.DeleteOrderListResponse;
import com.binance.connector.client.spot.rest.model.DeleteOrderResponse;
import com.binance.connector.client.spot.rest.model.DepthResponse;
import com.binance.connector.client.spot.rest.model.ExchangeInfoResponse;
import com.binance.connector.client.spot.rest.model.GetAccountResponse;
import com.binance.connector.client.spot.rest.model.GetOpenOrdersResponse;
import com.binance.connector.client.spot.rest.model.GetOrderListResponse;
import com.binance.connector.client.spot.rest.model.GetOrderResponse;
import com.binance.connector.client.spot.rest.model.GetTradesResponse;
import com.binance.connector.client.spot.rest.model.HistoricalTradesResponse;
import com.binance.connector.client.spot.rest.model.Interval;
import com.binance.connector.client.spot.rest.model.KlinesResponse;
import com.binance.connector.client.spot.rest.model.MyAllocationsResponse;
import com.binance.connector.client.spot.rest.model.MyPreventedMatchesResponse;
import com.binance.connector.client.spot.rest.model.MyTradesResponse;
import com.binance.connector.client.spot.rest.model.NewOrderRequest;
import com.binance.connector.client.spot.rest.model.NewOrderResponse;
import com.binance.connector.client.spot.rest.model.NewUserDataStreamResponse;
import com.binance.connector.client.spot.rest.model.OpenOrderListResponse;
import com.binance.connector.client.spot.rest.model.OrderAmendKeepPriorityRequest;
import com.binance.connector.client.spot.rest.model.OrderAmendKeepPriorityResponse;
import com.binance.connector.client.spot.rest.model.OrderAmendmentsResponse;
import com.binance.connector.client.spot.rest.model.OrderCancelReplaceRequest;
import com.binance.connector.client.spot.rest.model.OrderCancelReplaceResponse;
import com.binance.connector.client.spot.rest.model.OrderListOcoRequest;
import com.binance.connector.client.spot.rest.model.OrderListOcoResponse;
import com.binance.connector.client.spot.rest.model.OrderListOtoRequest;
import com.binance.connector.client.spot.rest.model.OrderListOtoResponse;
import com.binance.connector.client.spot.rest.model.OrderListOtocoRequest;
import com.binance.connector.client.spot.rest.model.OrderListOtocoResponse;
import com.binance.connector.client.spot.rest.model.OrderOcoRequest;
import com.binance.connector.client.spot.rest.model.OrderOcoResponse;
import com.binance.connector.client.spot.rest.model.OrderTestRequest;
import com.binance.connector.client.spot.rest.model.OrderTestResponse;
import com.binance.connector.client.spot.rest.model.Permissions;
import com.binance.connector.client.spot.rest.model.PutUserDataStreamRequest;
import com.binance.connector.client.spot.rest.model.RateLimitOrderResponse;
import com.binance.connector.client.spot.rest.model.SorOrderRequest;
import com.binance.connector.client.spot.rest.model.SorOrderResponse;
import com.binance.connector.client.spot.rest.model.SorOrderTestRequest;
import com.binance.connector.client.spot.rest.model.SorOrderTestResponse;
import com.binance.connector.client.spot.rest.model.SymbolStatus;
import com.binance.connector.client.spot.rest.model.Symbols;
import com.binance.connector.client.spot.rest.model.Ticker24hrResponse;
import com.binance.connector.client.spot.rest.model.TickerBookTickerResponse;
import com.binance.connector.client.spot.rest.model.TickerPriceResponse;
import com.binance.connector.client.spot.rest.model.TickerResponse;
import com.binance.connector.client.spot.rest.model.TickerTradingDayResponse;
import com.binance.connector.client.spot.rest.model.TickerType;
import com.binance.connector.client.spot.rest.model.TimeResponse;
import com.binance.connector.client.spot.rest.model.UiKlinesResponse;
import com.binance.connector.client.spot.rest.model.WindowSize;

public class SpotRestApi {

    private final AccountApi accountApi;
    private final GeneralApi generalApi;
    private final MarketApi marketApi;
    private final TradeApi tradeApi;
    private final UserDataStreamApi userDataStreamApi;

    public SpotRestApi(ClientConfiguration configuration) {
        this(SpotRestApiUtil.getDefaultClient(configuration));
    }

    public SpotRestApi(ApiClient apiClient) {
        this.accountApi = new AccountApi(apiClient);
        this.generalApi = new GeneralApi(apiClient);
        this.marketApi = new MarketApi(apiClient);
        this.tradeApi = new TradeApi(apiClient);
        this.userDataStreamApi = new UserDataStreamApi(apiClient);
    }

    /**
     * Query Commission Rates Get current account commission rates. Weight: 20
     *
     * @param symbol (required)
     * @return ApiResponse&lt;AccountCommissionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Query Commission Rates </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/account-endpoints#query-commission-rates-user_data">Query
     *     Commission Rates Documentation</a>
     */
    public ApiResponse<AccountCommissionResponse> accountCommission(String symbol)
            throws ApiException {
        return accountApi.accountCommission(symbol);
    }

    /**
     * Query all Order lists Retrieves all order lists based on provided optional parameters. Note
     * that the time between &#x60;startTime&#x60; and &#x60;endTime&#x60; can&#39;t be longer than
     * 24 hours. Weight: 20
     *
     * @param fromId ID to get aggregate trades from INCLUSIVE. (optional)
     * @param startTime Timestamp in ms to get aggregate trades from INCLUSIVE. (optional)
     * @param endTime Timestamp in ms to get aggregate trades until INCLUSIVE. (optional)
     * @param limit Default: 500; Maximum: 1000. (optional)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60; (optional)
     * @return ApiResponse&lt;AllOrderListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Query all Order lists </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/account-endpoints#query-all-order-lists-user_data">Query
     *     all Order lists Documentation</a>
     */
    public ApiResponse<AllOrderListResponse> allOrderList(
            Long fromId, Long startTime, Long endTime, Integer limit, Long recvWindow)
            throws ApiException {
        return accountApi.allOrderList(fromId, startTime, endTime, limit, recvWindow);
    }

    /**
     * All orders Get all account orders; active, canceled, or filled. Weight: 20
     *
     * @param symbol (required)
     * @param orderId (optional)
     * @param startTime Timestamp in ms to get aggregate trades from INCLUSIVE. (optional)
     * @param endTime Timestamp in ms to get aggregate trades until INCLUSIVE. (optional)
     * @param limit Default: 500; Maximum: 1000. (optional)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60; (optional)
     * @return ApiResponse&lt;AllOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> All orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/account-endpoints#all-orders-user_data">All
     *     orders Documentation</a>
     */
    public ApiResponse<AllOrdersResponse> allOrders(
            String symbol,
            Long orderId,
            Long startTime,
            Long endTime,
            Integer limit,
            Long recvWindow)
            throws ApiException {
        return accountApi.allOrders(symbol, orderId, startTime, endTime, limit, recvWindow);
    }

    /**
     * Account information Get current account information. Weight: 20
     *
     * @param omitZeroBalances When set to &#x60;true&#x60;, emits only the non-zero balances of an
     *     account. &lt;br&gt;Default value: &#x60;false&#x60; (optional)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60; (optional)
     * @return ApiResponse&lt;GetAccountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Account information </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/account-endpoints#account-information-user_data">Account
     *     information Documentation</a>
     */
    public ApiResponse<GetAccountResponse> getAccount(Boolean omitZeroBalances, Long recvWindow)
            throws ApiException {
        return accountApi.getAccount(omitZeroBalances, recvWindow);
    }

    /**
     * Current open orders Get all open orders on a symbol. **Careful** when accessing this with no
     * symbol. Weight: 6 for a single symbol; **80** when the symbol parameter is omitted
     *
     * @param symbol Symbol to query (optional)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60; (optional)
     * @return ApiResponse&lt;GetOpenOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Current open orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/account-endpoints#current-open-orders-user_data">Current
     *     open orders Documentation</a>
     */
    public ApiResponse<GetOpenOrdersResponse> getOpenOrders(String symbol, Long recvWindow)
            throws ApiException {
        return accountApi.getOpenOrders(symbol, recvWindow);
    }

    /**
     * Query order Check an order&#39;s status. Weight: 4
     *
     * @param symbol (required)
     * @param orderId (optional)
     * @param origClientOrderId (optional)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60; (optional)
     * @return ApiResponse&lt;GetOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Query order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/account-endpoints#query-order-user_data">Query
     *     order Documentation</a>
     */
    public ApiResponse<GetOrderResponse> getOrder(
            String symbol, Long orderId, String origClientOrderId, Long recvWindow)
            throws ApiException {
        return accountApi.getOrder(symbol, orderId, origClientOrderId, recvWindow);
    }

    /**
     * Query Order list Retrieves a specific order list based on provided optional parameters.
     * Weight: 4
     *
     * @param orderListId Either &#x60;orderListId&#x60; or &#x60;listClientOrderId&#x60; must be
     *     provided (optional)
     * @param origClientOrderId (optional)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60; (optional)
     * @return ApiResponse&lt;GetOrderListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Query Order list </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/account-endpoints#query-order-list-user_data">Query
     *     Order list Documentation</a>
     */
    public ApiResponse<GetOrderListResponse> getOrderList(
            Long orderListId, String origClientOrderId, Long recvWindow) throws ApiException {
        return accountApi.getOrderList(orderListId, origClientOrderId, recvWindow);
    }

    /**
     * Query Allocations Retrieves allocations resulting from SOR order placement. Weight: 20
     *
     * @param symbol (required)
     * @param startTime Timestamp in ms to get aggregate trades from INCLUSIVE. (optional)
     * @param endTime Timestamp in ms to get aggregate trades until INCLUSIVE. (optional)
     * @param fromAllocationId (optional)
     * @param limit Default: 500; Maximum: 1000. (optional)
     * @param orderId (optional)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60; (optional)
     * @return ApiResponse&lt;MyAllocationsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Query Allocations </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/account-endpoints#query-allocations-user_data">Query
     *     Allocations Documentation</a>
     */
    public ApiResponse<MyAllocationsResponse> myAllocations(
            String symbol,
            Long startTime,
            Long endTime,
            Integer fromAllocationId,
            Integer limit,
            Long orderId,
            Long recvWindow)
            throws ApiException {
        return accountApi.myAllocations(
                symbol, startTime, endTime, fromAllocationId, limit, orderId, recvWindow);
    }

    /**
     * Query Prevented Matches Displays the list of orders that were expired due to STP. These are
     * the combinations supported: * &#x60;symbol&#x60; + &#x60;preventedMatchId&#x60; *
     * &#x60;symbol&#x60; + &#x60;orderId&#x60; * &#x60;symbol&#x60; + &#x60;orderId&#x60; +
     * &#x60;fromPreventedMatchId&#x60; (&#x60;limit&#x60; will default to 500) * &#x60;symbol&#x60;
     * + &#x60;orderId&#x60; + &#x60;fromPreventedMatchId&#x60; + &#x60;limit&#x60; Weight: Case |
     * Weight ---- | ----- If &#x60;symbol&#x60; is invalid | 2 Querying by
     * &#x60;preventedMatchId&#x60; | 2 Querying by &#x60;orderId&#x60; | 20
     *
     * @param symbol (required)
     * @param preventedMatchId (optional)
     * @param orderId (optional)
     * @param fromPreventedMatchId (optional)
     * @param limit Default: 500; Maximum: 1000. (optional)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60; (optional)
     * @return ApiResponse&lt;MyPreventedMatchesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Query Prevented Matches </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/account-endpoints#query-prevented-matches-user_data">Query
     *     Prevented Matches Documentation</a>
     */
    public ApiResponse<MyPreventedMatchesResponse> myPreventedMatches(
            String symbol,
            Long preventedMatchId,
            Long orderId,
            Long fromPreventedMatchId,
            Integer limit,
            Long recvWindow)
            throws ApiException {
        return accountApi.myPreventedMatches(
                symbol, preventedMatchId, orderId, fromPreventedMatchId, limit, recvWindow);
    }

    /**
     * Account trade list Get trades for a specific account and symbol. Weight: Condition| Weight|
     * ---| --- |Without orderId|20| |With orderId|5|
     *
     * @param symbol (required)
     * @param orderId (optional)
     * @param startTime Timestamp in ms to get aggregate trades from INCLUSIVE. (optional)
     * @param endTime Timestamp in ms to get aggregate trades until INCLUSIVE. (optional)
     * @param fromId ID to get aggregate trades from INCLUSIVE. (optional)
     * @param limit Default: 500; Maximum: 1000. (optional)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60; (optional)
     * @return ApiResponse&lt;MyTradesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Account trade list </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/account-endpoints#account-trade-list-user_data">Account
     *     trade list Documentation</a>
     */
    public ApiResponse<MyTradesResponse> myTrades(
            String symbol,
            Long orderId,
            Long startTime,
            Long endTime,
            Long fromId,
            Integer limit,
            Long recvWindow)
            throws ApiException {
        return accountApi.myTrades(symbol, orderId, startTime, endTime, fromId, limit, recvWindow);
    }

    /**
     * Query Open Order lists Weight: 6
     *
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60; (optional)
     * @return ApiResponse&lt;OpenOrderListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Query Open Order lists </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/account-endpoints#query-open-order-lists-user_data">Query
     *     Open Order lists Documentation</a>
     */
    public ApiResponse<OpenOrderListResponse> openOrderList(Long recvWindow) throws ApiException {
        return accountApi.openOrderList(recvWindow);
    }

    /**
     * Query Order Amendments Queries all amendments of a single order. Weight: 4
     *
     * @param symbol (required)
     * @param orderId (required)
     * @param fromExecutionId (optional)
     * @param limit Default:500; Maximum: 1000 (optional)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60; (optional)
     * @return ApiResponse&lt;OrderAmendmentsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Query Order Amendments </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/account-endpoints#query-order-amendments-user_data">Query
     *     Order Amendments Documentation</a>
     */
    public ApiResponse<OrderAmendmentsResponse> orderAmendments(
            String symbol, Long orderId, Long fromExecutionId, Long limit, Long recvWindow)
            throws ApiException {
        return accountApi.orderAmendments(symbol, orderId, fromExecutionId, limit, recvWindow);
    }

    /**
     * Query Unfilled Order Count Displays the user&#39;s unfilled order count for all intervals.
     * Weight: 40
     *
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60; (optional)
     * @return ApiResponse&lt;RateLimitOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Query Unfilled Order Count </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/account-endpoints#query-unfilled-order-count-user_data">Query
     *     Unfilled Order Count Documentation</a>
     */
    public ApiResponse<RateLimitOrderResponse> rateLimitOrder(Long recvWindow) throws ApiException {
        return accountApi.rateLimitOrder(recvWindow);
    }

    /**
     * Exchange information Current exchange trading rules and symbol information Weight: 20
     *
     * @param symbol Symbol to query (optional)
     * @param symbols List of symbols to query (optional)
     * @param permissions List of permissions to query (optional)
     * @param showPermissionSets Controls whether the content of the &#x60;permissionSets&#x60;
     *     field is populated or not. Defaults to &#x60;true&#x60; (optional)
     * @param symbolStatus (optional)
     * @return ApiResponse&lt;ExchangeInfoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Exchange information </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/general-endpoints#exchange-information">Exchange
     *     information Documentation</a>
     */
    public ApiResponse<ExchangeInfoResponse> exchangeInfo(
            String symbol,
            Symbols symbols,
            Permissions permissions,
            Boolean showPermissionSets,
            SymbolStatus symbolStatus)
            throws ApiException {
        return generalApi.exchangeInfo(
                symbol, symbols, permissions, showPermissionSets, symbolStatus);
    }

    /**
     * Test connectivity Test connectivity to the Rest API. Weight: 1
     *
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/general-endpoints#test-connectivity">Test
     *     connectivity Documentation</a>
     */
    public void ping() throws ApiException {
        generalApi.ping();
    }

    /**
     * Check server time Test connectivity to the Rest API and get the current server time. Weight:
     * 1
     *
     * @return ApiResponse&lt;TimeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Check server time </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/general-endpoints#check-server-time">Check
     *     server time Documentation</a>
     */
    public ApiResponse<TimeResponse> time() throws ApiException {
        return generalApi.time();
    }

    /**
     * Compressed/Aggregate trades list Get compressed, aggregate trades. Trades that fill at the
     * time, from the same taker order, with the same price will have the quantity aggregated.
     * Weight: 4
     *
     * @param symbol (required)
     * @param fromId ID to get aggregate trades from INCLUSIVE. (optional)
     * @param startTime Timestamp in ms to get aggregate trades from INCLUSIVE. (optional)
     * @param endTime Timestamp in ms to get aggregate trades until INCLUSIVE. (optional)
     * @param limit Default: 500; Maximum: 1000. (optional)
     * @return ApiResponse&lt;AggTradesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Compressed/Aggregate trades list </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/market-data-endpoints#compressedaggregate-trades-list">Compressed/Aggregate
     *     trades list Documentation</a>
     */
    public ApiResponse<AggTradesResponse> aggTrades(
            String symbol, Long fromId, Long startTime, Long endTime, Integer limit)
            throws ApiException {
        return marketApi.aggTrades(symbol, fromId, startTime, endTime, limit);
    }

    /**
     * Current average price Current average price for a symbol. Weight: 2
     *
     * @param symbol (required)
     * @return ApiResponse&lt;AvgPriceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Current average price </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/market-data-endpoints#current-average-price">Current
     *     average price Documentation</a>
     */
    public ApiResponse<AvgPriceResponse> avgPrice(String symbol) throws ApiException {
        return marketApi.avgPrice(symbol);
    }

    /**
     * Order book Weight: Adjusted based on the limit: |Limit|Request Weight ------|------- 1-100| 5
     * 101-500| 25 501-1000| 50 1001-5000| 250
     *
     * @param symbol (required)
     * @param limit Default: 500; Maximum: 1000. (optional)
     * @return ApiResponse&lt;DepthResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Order book </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/market-data-endpoints#order-book">Order
     *     book Documentation</a>
     */
    public ApiResponse<DepthResponse> depth(String symbol, Integer limit) throws ApiException {
        return marketApi.depth(symbol, limit);
    }

    /**
     * Recent trades list Get recent trades. Weight: 25
     *
     * @param symbol (required)
     * @param limit Default: 500; Maximum: 1000. (optional)
     * @return ApiResponse&lt;GetTradesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Recent trades list </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/market-data-endpoints#recent-trades-list">Recent
     *     trades list Documentation</a>
     */
    public ApiResponse<GetTradesResponse> getTrades(String symbol, Integer limit)
            throws ApiException {
        return marketApi.getTrades(symbol, limit);
    }

    /**
     * Old trade lookup Get older trades. Weight: 25
     *
     * @param symbol (required)
     * @param limit Default: 500; Maximum: 1000. (optional)
     * @param fromId ID to get aggregate trades from INCLUSIVE. (optional)
     * @return ApiResponse&lt;HistoricalTradesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Old trade lookup </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/market-data-endpoints#old-trade-lookup">Old
     *     trade lookup Documentation</a>
     */
    public ApiResponse<HistoricalTradesResponse> historicalTrades(
            String symbol, Integer limit, Long fromId) throws ApiException {
        return marketApi.historicalTrades(symbol, limit, fromId);
    }

    /**
     * Kline/Candlestick data Kline/candlestick bars for a symbol. Klines are uniquely identified by
     * their open time. Weight: 2
     *
     * @param symbol (required)
     * @param interval (required)
     * @param startTime Timestamp in ms to get aggregate trades from INCLUSIVE. (optional)
     * @param endTime Timestamp in ms to get aggregate trades until INCLUSIVE. (optional)
     * @param timeZone Default: 0 (UTC) (optional)
     * @param limit Default: 500; Maximum: 1000. (optional)
     * @return ApiResponse&lt;KlinesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Kline/Candlestick data </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/market-data-endpoints#klinecandlestick-data">Kline/Candlestick
     *     data Documentation</a>
     */
    public ApiResponse<KlinesResponse> klines(
            String symbol,
            Interval interval,
            Long startTime,
            Long endTime,
            String timeZone,
            Integer limit)
            throws ApiException {
        return marketApi.klines(symbol, interval, startTime, endTime, timeZone, limit);
    }

    /**
     * Rolling window price change statistics Weight: 4 for each requested
     * &lt;tt&gt;symbol&lt;/tt&gt; regardless of &lt;tt&gt;windowSize&lt;/tt&gt;.
     * &lt;br/&gt;&lt;br/&gt; The weight for this request will cap at 200 once the number of
     * &#x60;symbols&#x60; in the request is more than 50.
     *
     * @param symbol Symbol to query (optional)
     * @param symbols List of symbols to query (optional)
     * @param windowSize (optional)
     * @param type (optional)
     * @return ApiResponse&lt;TickerResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Rolling window price change statistics </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/market-data-endpoints#rolling-window-price-change-statistics">Rolling
     *     window price change statistics Documentation</a>
     */
    public ApiResponse<TickerResponse> ticker(
            String symbol, Symbols symbols, WindowSize windowSize, TickerType type)
            throws ApiException {
        return marketApi.ticker(symbol, symbols, windowSize, type);
    }

    /**
     * 24hr ticker price change statistics 24 hour rolling window price change statistics.
     * **Careful** when accessing this with no symbol. Weight: &lt;table&gt; &lt;thead&gt;
     * &lt;tr&gt; &lt;th&gt;Parameter&lt;/th&gt; &lt;th&gt;Symbols Provided&lt;/th&gt;
     * &lt;th&gt;Weight&lt;/th&gt; &lt;/tr&gt; &lt;/thead&gt; &lt;tbody&gt; &lt;tr&gt; &lt;td
     * rowspan&#x3D;\&quot;2\&quot;&gt;symbol&lt;/td&gt; &lt;td&gt;1&lt;/td&gt;
     * &lt;td&gt;2&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;symbol parameter is
     * omitted&lt;/td&gt; &lt;td&gt;80&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td
     * rowspan&#x3D;\&quot;4\&quot;&gt;symbols&lt;/td&gt; &lt;td&gt;1-20&lt;/td&gt;
     * &lt;td&gt;2&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;21-100&lt;/td&gt;
     * &lt;td&gt;40&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;101 or more&lt;/td&gt;
     * &lt;td&gt;80&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;symbols parameter is
     * omitted&lt;/td&gt; &lt;td&gt;80&lt;/td&gt; &lt;/tr&gt; &lt;/tbody&gt; &lt;/table&gt;
     *
     * @param symbol Symbol to query (optional)
     * @param symbols List of symbols to query (optional)
     * @param type (optional)
     * @return ApiResponse&lt;Ticker24hrResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> 24hr ticker price change statistics </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/market-data-endpoints#24hr-ticker-price-change-statistics">24hr
     *     ticker price change statistics Documentation</a>
     */
    public ApiResponse<Ticker24hrResponse> ticker24hr(
            String symbol, Symbols symbols, TickerType type) throws ApiException {
        return marketApi.ticker24hr(symbol, symbols, type);
    }

    /**
     * Symbol order book ticker Best price/qty on the order book for a symbol or symbols. Weight:
     * &lt;table&gt; &lt;thead&gt; &lt;tr&gt; &lt;th&gt;Parameter&lt;/th&gt; &lt;th&gt;Symbols
     * Provided&lt;/th&gt; &lt;th&gt;Weight&lt;/th&gt; &lt;/tr&gt; &lt;/thead&gt; &lt;tbody&gt;
     * &lt;tr&gt; &lt;td rowspan&#x3D;\&quot;2\&quot;&gt;symbol&lt;/td&gt; &lt;td&gt;1&lt;/td&gt;
     * &lt;td&gt;2&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;symbol parameter is
     * omitted&lt;/td&gt; &lt;td&gt;4&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;symbols&lt;/td&gt;
     * &lt;td&gt;Any&lt;/td&gt; &lt;td&gt;4&lt;/td&gt; &lt;/tr&gt; &lt;/tbody&gt; &lt;/table&gt;
     *
     * @param symbol Symbol to query (optional)
     * @param symbols List of symbols to query (optional)
     * @return ApiResponse&lt;TickerBookTickerResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Symbol order book ticker </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/market-data-endpoints#symbol-order-book-ticker">Symbol
     *     order book ticker Documentation</a>
     */
    public ApiResponse<TickerBookTickerResponse> tickerBookTicker(String symbol, Symbols symbols)
            throws ApiException {
        return marketApi.tickerBookTicker(symbol, symbols);
    }

    /**
     * Symbol price ticker Latest price for a symbol or symbols. Weight: &lt;table&gt; &lt;thead&gt;
     * &lt;tr&gt; &lt;th&gt;Parameter&lt;/th&gt; &lt;th&gt;Symbols Provided&lt;/th&gt;
     * &lt;th&gt;Weight&lt;/th&gt; &lt;/tr&gt; &lt;/thead&gt; &lt;tbody&gt; &lt;tr&gt; &lt;td
     * rowspan&#x3D;\&quot;2\&quot;&gt;symbol&lt;/td&gt; &lt;td&gt;1&lt;/td&gt;
     * &lt;td&gt;2&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;symbol parameter is
     * omitted&lt;/td&gt; &lt;td&gt;4&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;symbols&lt;/td&gt;
     * &lt;td&gt;Any&lt;/td&gt; &lt;td&gt;4&lt;/td&gt; &lt;/tr&gt; &lt;/tbody&gt; &lt;/table&gt;
     *
     * @param symbol Symbol to query (optional)
     * @param symbols List of symbols to query (optional)
     * @return ApiResponse&lt;TickerPriceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Symbol price ticker </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/market-data-endpoints#symbol-price-ticker">Symbol
     *     price ticker Documentation</a>
     */
    public ApiResponse<TickerPriceResponse> tickerPrice(String symbol, Symbols symbols)
            throws ApiException {
        return marketApi.tickerPrice(symbol, symbols);
    }

    /**
     * Trading Day Ticker Price change statistics for a trading day. Weight: 4 for each requested
     * &lt;tt&gt;symbol&lt;/tt&gt;. &lt;br/&gt;&lt;br/&gt; The weight for this request will cap at
     * 200 once the number of &#x60;symbols&#x60; in the request is more than 50.
     *
     * @param symbol Symbol to query (optional)
     * @param symbols List of symbols to query (optional)
     * @param timeZone Default: 0 (UTC) (optional)
     * @param type (optional)
     * @return ApiResponse&lt;TickerTradingDayResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Trading Day Ticker </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/market-data-endpoints#trading-day-ticker">Trading
     *     Day Ticker Documentation</a>
     */
    public ApiResponse<TickerTradingDayResponse> tickerTradingDay(
            String symbol, Symbols symbols, String timeZone, TickerType type) throws ApiException {
        return marketApi.tickerTradingDay(symbol, symbols, timeZone, type);
    }

    /**
     * UIKlines The request is similar to klines having the same parameters and response.
     * &#x60;uiKlines&#x60; return modified kline data, optimized for presentation of candlestick
     * charts. Weight: 2
     *
     * @param symbol (required)
     * @param interval (required)
     * @param startTime Timestamp in ms to get aggregate trades from INCLUSIVE. (optional)
     * @param endTime Timestamp in ms to get aggregate trades until INCLUSIVE. (optional)
     * @param timeZone Default: 0 (UTC) (optional)
     * @param limit Default: 500; Maximum: 1000. (optional)
     * @return ApiResponse&lt;UiKlinesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> UIKlines </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/market-data-endpoints#uiklines">UIKlines
     *     Documentation</a>
     */
    public ApiResponse<UiKlinesResponse> uiKlines(
            String symbol,
            Interval interval,
            Long startTime,
            Long endTime,
            String timeZone,
            Integer limit)
            throws ApiException {
        return marketApi.uiKlines(symbol, interval, startTime, endTime, timeZone, limit);
    }

    /**
     * Cancel All Open Orders on a Symbol Cancels all active orders on a symbol. This includes
     * orders that are part of an order list. Weight: 1
     *
     * @param symbol (required)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60; (optional)
     * @return ApiResponse&lt;DeleteOpenOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cancel All Open Orders on a Symbol </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/trading-endpoints#cancel-all-open-orders-on-a-symbol-trade">Cancel
     *     All Open Orders on a Symbol Documentation</a>
     */
    public ApiResponse<DeleteOpenOrdersResponse> deleteOpenOrders(String symbol, Long recvWindow)
            throws ApiException {
        return tradeApi.deleteOpenOrders(symbol, recvWindow);
    }

    /**
     * Cancel order Cancel an active order. Weight: 1
     *
     * @param symbol (required)
     * @param orderId (optional)
     * @param origClientOrderId (optional)
     * @param newClientOrderId A unique id among open orders. Automatically generated if not
     *     sent.&lt;br/&gt; Orders with the same &#x60;newClientOrderID&#x60; can be accepted only
     *     when the previous one is filled, otherwise the order will be rejected. (optional)
     * @param cancelRestrictions (optional)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60; (optional)
     * @return ApiResponse&lt;DeleteOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cancel order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/trading-endpoints#cancel-order-trade">Cancel
     *     order Documentation</a>
     */
    public ApiResponse<DeleteOrderResponse> deleteOrder(
            String symbol,
            Long orderId,
            String origClientOrderId,
            String newClientOrderId,
            CancelRestrictions cancelRestrictions,
            Long recvWindow)
            throws ApiException {
        return tradeApi.deleteOrder(
                symbol,
                orderId,
                origClientOrderId,
                newClientOrderId,
                cancelRestrictions,
                recvWindow);
    }

    /**
     * Cancel Order list Cancel an entire Order list Weight: 1
     *
     * @param symbol (required)
     * @param orderListId Either &#x60;orderListId&#x60; or &#x60;listClientOrderId&#x60; must be
     *     provided (optional)
     * @param listClientOrderId A unique Id for the entire orderList (optional)
     * @param newClientOrderId A unique id among open orders. Automatically generated if not
     *     sent.&lt;br/&gt; Orders with the same &#x60;newClientOrderID&#x60; can be accepted only
     *     when the previous one is filled, otherwise the order will be rejected. (optional)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60; (optional)
     * @return ApiResponse&lt;DeleteOrderListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cancel Order list </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/trading-endpoints#cancel-order-list-trade">Cancel
     *     Order list Documentation</a>
     */
    public ApiResponse<DeleteOrderListResponse> deleteOrderList(
            String symbol,
            Long orderListId,
            String listClientOrderId,
            String newClientOrderId,
            Long recvWindow)
            throws ApiException {
        return tradeApi.deleteOrderList(
                symbol, orderListId, listClientOrderId, newClientOrderId, recvWindow);
    }

    /**
     * New order Send in a new order. This adds 1 order to the &#x60;EXCHANGE_MAX_ORDERS&#x60;
     * filter and the &#x60;MAX_NUM_ORDERS&#x60; filter. Weight: 1
     *
     * @param newOrderRequest (required)
     * @return ApiResponse&lt;NewOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> New order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/trading-endpoints#new-order-trade">New
     *     order Documentation</a>
     */
    public ApiResponse<NewOrderResponse> newOrder(NewOrderRequest newOrderRequest)
            throws ApiException {
        return tradeApi.newOrder(newOrderRequest);
    }

    /**
     * Order Amend Keep Priority Reduce the quantity of an existing open order. This adds 0 orders
     * to the &#x60;EXCHANGE_MAX_ORDERS&#x60; filter and the &#x60;MAX_NUM_ORDERS&#x60; filter. Read
     * [Order Amend Keep Priority FAQ](faqs/order_amend_keep_priority.md) to learn more. Weight: 4
     *
     * @param orderAmendKeepPriorityRequest (required)
     * @return ApiResponse&lt;OrderAmendKeepPriorityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Order Amend Keep Priority </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/trading-endpoints#order-amend-keep-priority-trade">Order
     *     Amend Keep Priority Documentation</a>
     */
    public ApiResponse<OrderAmendKeepPriorityResponse> orderAmendKeepPriority(
            OrderAmendKeepPriorityRequest orderAmendKeepPriorityRequest) throws ApiException {
        return tradeApi.orderAmendKeepPriority(orderAmendKeepPriorityRequest);
    }

    /**
     * Cancel an Existing Order and Send a New Order Cancels an existing order and places a new
     * order on the same symbol. Filters and Order Count are evaluated before the processing of the
     * cancellation and order placement occurs. A new order that was not attempted (i.e. when
     * &#x60;newOrderResult: NOT_ATTEMPTED&#x60;), will still increase the unfilled order count by
     * 1. Weight: 1
     *
     * @param orderCancelReplaceRequest (required)
     * @return ApiResponse&lt;OrderCancelReplaceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cancel an Existing Order and Send a New Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/trading-endpoints#cancel-an-existing-order-and-send-a-new-order-trade">Cancel
     *     an Existing Order and Send a New Order Documentation</a>
     */
    public ApiResponse<OrderCancelReplaceResponse> orderCancelReplace(
            OrderCancelReplaceRequest orderCancelReplaceRequest) throws ApiException {
        return tradeApi.orderCancelReplace(orderCancelReplaceRequest);
    }

    /**
     * New Order list - OCO Send in an one-cancels-the-other (OCO) pair, where activation of one
     * order immediately cancels the other. * An OCO has 2 orders called the **above order** and
     * **below order**. * One of the orders must be a
     * &#x60;LIMIT_MAKER/TAKE_PROFIT/TAKE_PROFIT_LIMIT&#x60; order and the other must be
     * &#x60;STOP_LOSS&#x60; or &#x60;STOP_LOSS_LIMIT&#x60; order. * Price restrictions * If the OCO
     * is on the &#x60;SELL&#x60; side: * &#x60;LIMIT_MAKER/TAKE_PROFIT_LIMIT&#x60;
     * &#x60;price&#x60; &gt; Last Traded Price &gt; &#x60;STOP_LOSS/STOP_LOSS_LIMIT&#x60;
     * &#x60;stopPrice&#x60; * &#x60;TAKE_PROFIT stopPrice&#x60; &gt; Last Traded Price &gt;
     * &#x60;STOP_LOSS/STOP_LOSS_LIMIT stopPrice&#x60; * If the OCO is on the &#x60;BUY&#x60; side:
     * * &#x60;LIMIT_MAKER/TAKE_PROFIT_LIMIT price&#x60; &lt; Last Traded Price &lt;
     * &#x60;stopPrice&#x60; * &#x60;TAKE_PROFIT stopPrice&#x60; &lt; Last Traded Price &lt;
     * &#x60;STOP_LOSS/STOP_LOSS_LIMIT stopPrice&#x60; * OCOs add **2 orders** to the
     * &#x60;EXCHANGE_MAX_ORDERS&#x60; filter and the &#x60;MAX_NUM_ORDERS&#x60; filter. Weight: 1
     * Unfilled Order Count: 2
     *
     * @param orderListOcoRequest (required)
     * @return ApiResponse&lt;OrderListOcoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> New Order list - OCO </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/trading-endpoints#new-order-list---oco-trade">New
     *     Order list - OCO Documentation</a>
     */
    public ApiResponse<OrderListOcoResponse> orderListOco(OrderListOcoRequest orderListOcoRequest)
            throws ApiException {
        return tradeApi.orderListOco(orderListOcoRequest);
    }

    /**
     * New Order list - OTO Place an OTO. * An OTO (One-Triggers-the-Other) is an order list
     * comprised of 2 orders. * The first order is called the **working order** and must be
     * &#x60;LIMIT&#x60; or &#x60;LIMIT_MAKER&#x60;. Initially, only the working order goes on the
     * order book. * The second order is called the **pending order**. It can be any order type
     * except for &#x60;MARKET&#x60; orders using parameter &#x60;quoteOrderQty&#x60;. The pending
     * order is only placed on the order book when the working order gets **fully filled**. * If
     * either the working order or the pending order is cancelled individually, the other order in
     * the order list will also be canceled or expired. * When the order list is placed, if the
     * working order gets **immediately fully filled**, the placement response will show the working
     * order as &#x60;FILLED&#x60; but the pending order will still appear as
     * &#x60;PENDING_NEW&#x60;. You need to query the status of the pending order again to see its
     * updated status. * OTOs add **2 orders** to the &#x60;EXCHANGE_MAX_NUM_ORDERS&#x60; filter and
     * &#x60;MAX_NUM_ORDERS&#x60; filter. Weight: 1 Unfilled Order Count: 2
     *
     * @param orderListOtoRequest (required)
     * @return ApiResponse&lt;OrderListOtoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> New Order list - OTO </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/trading-endpoints#new-order-list---oto-trade">New
     *     Order list - OTO Documentation</a>
     */
    public ApiResponse<OrderListOtoResponse> orderListOto(OrderListOtoRequest orderListOtoRequest)
            throws ApiException {
        return tradeApi.orderListOto(orderListOtoRequest);
    }

    /**
     * New Order list - OTOCO Place an OTOCO. * An OTOCO (One-Triggers-One-Cancels-the-Other) is an
     * order list comprised of 3 orders. * The first order is called the **working order** and must
     * be &#x60;LIMIT&#x60; or &#x60;LIMIT_MAKER&#x60;. Initially, only the working order goes on
     * the order book. * The behavior of the working order is the same as the
     * [OTO](#new-order-list---oto-trade). * OTOCO has 2 pending orders (pending above and pending
     * below), forming an OCO pair. The pending orders are only placed on the order book when the
     * working order gets **fully filled**. * The rules of the pending above and pending below
     * follow the same rules as the [Order list OCO](#new-order-list---oco-trade). * OTOCOs add **3
     * orders** to the &#x60;EXCHANGE_MAX_NUM_ORDERS&#x60; filter and &#x60;MAX_NUM_ORDERS&#x60;
     * filter. Weight: 1 Unfilled Order Count: 3
     *
     * @param orderListOtocoRequest (required)
     * @return ApiResponse&lt;OrderListOtocoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> New Order list - OTOCO </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/trading-endpoints#new-order-list---otoco-trade">New
     *     Order list - OTOCO Documentation</a>
     */
    public ApiResponse<OrderListOtocoResponse> orderListOtoco(
            OrderListOtocoRequest orderListOtocoRequest) throws ApiException {
        return tradeApi.orderListOtoco(orderListOtocoRequest);
    }

    /**
     * New OCO - Deprecated Send in a new OCO. * Price Restrictions: * &#x60;SELL&#x60;: Limit Price
     * &gt; Last Price &gt; Stop Price * &#x60;BUY&#x60;: Limit Price &lt; Last Price &lt; Stop
     * Price * Quantity Restrictions: * Both legs must have the same quantity. * &#x60;ICEBERG&#x60;
     * quantities however do not have to be the same * &#x60;OCO&#x60; adds **2 orders** to the
     * &#x60;EXCHANGE_MAX_ORDERS&#x60; filter and the &#x60;MAX_NUM_ORDERS&#x60; filter. Weight: 1
     * Unfilled Order Count: 2
     *
     * @param orderOcoRequest (required)
     * @return ApiResponse&lt;OrderOcoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> New OCO - Deprecated </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/trading-endpoints#new-oco---deprecated-trade">New
     *     OCO - Deprecated Documentation</a>
     */
    public ApiResponse<OrderOcoResponse> orderOco(OrderOcoRequest orderOcoRequest)
            throws ApiException {
        return tradeApi.orderOco(orderOcoRequest);
    }

    /**
     * Test new order Test new order creation and signature/recvWindow long. Creates and validates a
     * new order but does not send it into the matching engine. Weight: |Condition| Request Weight|
     * |------------ | ------------ | |Without &#x60;computeCommissionRates&#x60;| 1| |With
     * &#x60;computeCommissionRates&#x60;|20|
     *
     * @param orderTestRequest (required)
     * @return ApiResponse&lt;OrderTestResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Test new order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/trading-endpoints#test-new-order-trade">Test
     *     new order Documentation</a>
     */
    public ApiResponse<OrderTestResponse> orderTest(OrderTestRequest orderTestRequest)
            throws ApiException {
        return tradeApi.orderTest(orderTestRequest);
    }

    /**
     * New order using SOR Places an order using smart order routing (SOR). This adds 1 order to the
     * &#x60;EXCHANGE_MAX_ORDERS&#x60; filter and the &#x60;MAX_NUM_ORDERS&#x60; filter. Read [SOR
     * FAQ](faqs/sor_faq.md) to learn more. Weight: 1 Unfilled Order Count: 1
     *
     * @param sorOrderRequest (required)
     * @return ApiResponse&lt;SorOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> New order using SOR </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/trading-endpoints#new-order-using-sor-trade">New
     *     order using SOR Documentation</a>
     */
    public ApiResponse<SorOrderResponse> sorOrder(SorOrderRequest sorOrderRequest)
            throws ApiException {
        return tradeApi.sorOrder(sorOrderRequest);
    }

    /**
     * Test new order using SOR Test new order creation and signature/recvWindow using smart order
     * routing (SOR). Creates and validates a new order but does not send it into the matching
     * engine. Weight: | Condition | Request Weight | | --------- | -------------- | | Without
     * &#x60;computeCommissionRates&#x60; | 1 | | With &#x60;computeCommissionRates&#x60; | 20 |
     *
     * @param sorOrderTestRequest (required)
     * @return ApiResponse&lt;SorOrderTestResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Test new order using SOR </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/trading-endpoints#test-new-order-using-sor-trade">Test
     *     new order using SOR Documentation</a>
     */
    public ApiResponse<SorOrderTestResponse> sorOrderTest(SorOrderTestRequest sorOrderTestRequest)
            throws ApiException {
        return tradeApi.sorOrderTest(sorOrderTestRequest);
    }

    /**
     * Close user data stream Close out a user data stream. Weight: 2
     *
     * @param listenKey (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/user-data-stream-endpoints---deprecated#close-user-data-stream-user_stream">Close
     *     user data stream Documentation</a>
     */
    public void deleteUserDataStream(String listenKey) throws ApiException {
        userDataStreamApi.deleteUserDataStream(listenKey);
    }

    /**
     * Start user data stream Start a new user data stream. The stream will close after 60 minutes
     * unless a keepalive is sent. Weight: 2
     *
     * @return ApiResponse&lt;NewUserDataStreamResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Start user data stream </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/user-data-stream-endpoints---deprecated#start-user-data-stream-user_stream">Start
     *     user data stream Documentation</a>
     */
    public ApiResponse<NewUserDataStreamResponse> newUserDataStream() throws ApiException {
        return userDataStreamApi.newUserDataStream();
    }

    /**
     * Keepalive user data stream Keepalive a user data stream to prevent a time out. User data
     * streams will close after 60 minutes. It&#39;s recommended to send a ping about every 30
     * minutes. Weight: 2
     *
     * @param putUserDataStreamRequest (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api/user-data-stream-endpoints---deprecated#keepalive-user-data-stream-user_stream">Keepalive
     *     user data stream Documentation</a>
     */
    public void putUserDataStream(PutUserDataStreamRequest putUserDataStreamRequest)
            throws ApiException {
        userDataStreamApi.putUserDataStream(putUserDataStreamRequest);
    }
}
