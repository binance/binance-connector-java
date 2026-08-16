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
import com.binance.connector.client.spot.rest.model.ExecutionRulesResponse;
import com.binance.connector.client.spot.rest.model.GetAccountResponse;
import com.binance.connector.client.spot.rest.model.GetOpenOrdersResponse;
import com.binance.connector.client.spot.rest.model.GetOrderListResponse;
import com.binance.connector.client.spot.rest.model.GetOrderResponse;
import com.binance.connector.client.spot.rest.model.GetTradesResponse;
import com.binance.connector.client.spot.rest.model.HistoricalBlockTradesResponse;
import com.binance.connector.client.spot.rest.model.HistoricalTradesResponse;
import com.binance.connector.client.spot.rest.model.Interval;
import com.binance.connector.client.spot.rest.model.KlinesResponse;
import com.binance.connector.client.spot.rest.model.MyAllocationsResponse;
import com.binance.connector.client.spot.rest.model.MyFiltersResponse;
import com.binance.connector.client.spot.rest.model.MyPreventedMatchesResponse;
import com.binance.connector.client.spot.rest.model.MyTradesResponse;
import com.binance.connector.client.spot.rest.model.NewOrderRequest;
import com.binance.connector.client.spot.rest.model.NewOrderResponse;
import com.binance.connector.client.spot.rest.model.OpenOrderListResponse;
import com.binance.connector.client.spot.rest.model.OrderAmendKeepPriorityRequest;
import com.binance.connector.client.spot.rest.model.OrderAmendKeepPriorityResponse;
import com.binance.connector.client.spot.rest.model.OrderAmendmentsResponse;
import com.binance.connector.client.spot.rest.model.OrderCancelReplaceRequest;
import com.binance.connector.client.spot.rest.model.OrderCancelReplaceResponse;
import com.binance.connector.client.spot.rest.model.OrderListOcoRequest;
import com.binance.connector.client.spot.rest.model.OrderListOcoResponse;
import com.binance.connector.client.spot.rest.model.OrderListOpoRequest;
import com.binance.connector.client.spot.rest.model.OrderListOpoResponse;
import com.binance.connector.client.spot.rest.model.OrderListOpocoRequest;
import com.binance.connector.client.spot.rest.model.OrderListOpocoResponse;
import com.binance.connector.client.spot.rest.model.OrderListOtoRequest;
import com.binance.connector.client.spot.rest.model.OrderListOtoResponse;
import com.binance.connector.client.spot.rest.model.OrderListOtocoRequest;
import com.binance.connector.client.spot.rest.model.OrderListOtocoResponse;
import com.binance.connector.client.spot.rest.model.OrderOcoRequest;
import com.binance.connector.client.spot.rest.model.OrderOcoResponse;
import com.binance.connector.client.spot.rest.model.OrderTestRequest;
import com.binance.connector.client.spot.rest.model.OrderTestResponse;
import com.binance.connector.client.spot.rest.model.Permissions;
import com.binance.connector.client.spot.rest.model.RateLimitOrderResponse;
import com.binance.connector.client.spot.rest.model.ReferencePriceCalculationResponse;
import com.binance.connector.client.spot.rest.model.ReferencePriceResponse;
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

    public SpotRestApi(ClientConfiguration configuration) {
        this(SpotRestApiUtil.getDefaultClient(configuration));
    }

    public SpotRestApi(ApiClient apiClient) {
        this.accountApi = new AccountApi(apiClient);
        this.generalApi = new GeneralApi(apiClient);
        this.marketApi = new MarketApi(apiClient);
        this.tradeApi = new TradeApi(apiClient);
    }

    /**
     * Query Commission Rates (USER_DATA) Get current account commission rates. Weight(IP): 20
     * Security Type: USER_DATA Notes: **Data Source:** Database
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/account#account-commission">Query
     *     Commission Rates (USER_DATA) Documentation</a>
     */
    public ApiResponse<AccountCommissionResponse> accountCommission(String symbol)
            throws ApiException {
        return accountApi.accountCommission(symbol);
    }

    /**
     * Query all Order lists (USER_DATA) Retrieves all order lists based on provided optional
     * parameters. Note that the time between &#x60;startTime&#x60; and &#x60;endTime&#x60;
     * can&#39;t be longer than 24 hours. Weight(IP): 20 Security Type: USER_DATA Notes: **Data
     * Source:** Database
     *
     * @param fromId If supplied, neither startTime or endTime can be provided (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit (optional)
     * @param recvWindow Supports up to three decimal places of precision (e.g., 6000.346) so that
     *     microseconds may be specified. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/account#all-order-list">Query
     *     all Order lists (USER_DATA) Documentation</a>
     */
    public ApiResponse<AllOrderListResponse> allOrderList(
            Long fromId, Long startTime, Long endTime, Integer limit, Double recvWindow)
            throws ApiException {
        return accountApi.allOrderList(fromId, startTime, endTime, limit, recvWindow);
    }

    /**
     * All orders (USER_DATA) Get all account orders; active, canceled, or filled. Weight(IP): 20
     * Security Type: USER_DATA Notes: **Data Source:** Database - If &#x60;orderId&#x60; is set, it
     * will get orders &gt;&#x3D; that &#x60;orderId&#x60;. Otherwise most recent orders are
     * returned. - For some historical orders &#x60;cummulativeQuoteQty&#x60; will be &lt; 0,
     * meaning the data is not available at this time. - If &#x60;startTime&#x60; and/or
     * &#x60;endTime&#x60; provided, &#x60;orderId&#x60; is not required. - The time between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; can&#39;t be longer than 24 hours.
     *
     * @param symbol (required)
     * @param orderId (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit (optional)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60;. &lt;br&gt; Supports up
     *     to three decimal places of precision (e.g., 6000.346) so that microseconds may be
     *     specified. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/account#all-orders">All
     *     orders (USER_DATA) Documentation</a>
     */
    public ApiResponse<AllOrdersResponse> allOrders(
            String symbol,
            Long orderId,
            Long startTime,
            Long endTime,
            Integer limit,
            Double recvWindow)
            throws ApiException {
        return accountApi.allOrders(symbol, orderId, startTime, endTime, limit, recvWindow);
    }

    /**
     * Account information (USER_DATA) Get current account information. Weight(IP): 20 Security
     * Type: USER_DATA Notes: **Data Source:** Memory &#x3D;&gt; Database
     *
     * @param omitZeroBalances When set to &#x60;true&#x60;, emits only the non-zero balances of an
     *     account. (optional)
     * @param recvWindow Supports up to three decimal places of precision (e.g., 6000.346) so that
     *     microseconds may be specified. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/account#get-account">Account
     *     information (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetAccountResponse> getAccount(Boolean omitZeroBalances, Double recvWindow)
            throws ApiException {
        return accountApi.getAccount(omitZeroBalances, recvWindow);
    }

    /**
     * Current open orders (USER_DATA) Get all open orders on a symbol. **Careful** when accessing
     * this with no symbol. Weight: 6 for a single symbol; 80 when the symbol parameter is omitted
     * Security Type: USER_DATA Notes: **Data Source:** Memory &#x3D;&gt; Database - If the symbol
     * is not sent, orders for all symbols will be returned in an array.
     *
     * @param symbol (optional)
     * @param recvWindow Supports up to three decimal places of precision (e.g., 6000.346) so that
     *     microseconds may be specified. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/account#get-open-orders">Current
     *     open orders (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetOpenOrdersResponse> getOpenOrders(String symbol, Double recvWindow)
            throws ApiException {
        return accountApi.getOpenOrders(symbol, recvWindow);
    }

    /**
     * Query order (USER_DATA) Check an order&#39;s status. Weight(IP): 4 Security Type: USER_DATA
     * Notes: **Data Source:** Memory &#x3D;&gt; Database - Either &#x60;orderId&#x60; or
     * &#x60;origClientOrderId&#x60; must be sent. - If both &#x60;orderId&#x60; and
     * &#x60;origClientOrderId&#x60; are provided, the &#x60;orderId&#x60; is searched first, then
     * the &#x60;origClientOrderId&#x60; from that result is checked against that order. If both
     * conditions are not met the request will be rejected. - For some historical orders
     * &#x60;cummulativeQuoteQty&#x60; will be &lt; 0, meaning the data is not available at this
     * time.
     *
     * @param symbol (required)
     * @param orderId (optional)
     * @param origClientOrderId (optional)
     * @param recvWindow Supports up to three decimal places of precision (e.g., 6000.346) so that
     *     microseconds may be specified. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/account#get-order">Query
     *     order (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetOrderResponse> getOrder(
            String symbol, Long orderId, String origClientOrderId, Double recvWindow)
            throws ApiException {
        return accountApi.getOrder(symbol, orderId, origClientOrderId, recvWindow);
    }

    /**
     * Query Order list (USER_DATA) Retrieves a specific order list based on provided optional
     * parameters. Weight(IP): 4 Security Type: USER_DATA Notes: **Data Source:** Database
     *
     * @param orderListId Query order list by &#x60;orderListId&#x60;. &#x60;orderListId&#x60; or
     *     &#x60;origClientOrderId&#x60; must be provided. (optional)
     * @param origClientOrderId Query order list by &#x60;listClientOrderId&#x60;.
     *     &#x60;orderListId&#x60; or &#x60;origClientOrderId&#x60; must be provided. (optional)
     * @param recvWindow Supports up to three decimal places of precision (e.g., 6000.346) so that
     *     microseconds may be specified. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/account#get-order-list">Query
     *     Order list (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetOrderListResponse> getOrderList(
            Long orderListId, String origClientOrderId, Double recvWindow) throws ApiException {
        return accountApi.getOrderList(orderListId, origClientOrderId, recvWindow);
    }

    /**
     * Query Allocations (USER_DATA) Retrieves allocations resulting from SOR order placement.
     * Weight(IP): 20 Security Type: USER_DATA Notes: **Data Source:** Database\&quot; Supported
     * parameter combinations: Parameters | Response | ------------------------------------------- |
     * -------- | &#x60;symbol&#x60; | allocations from oldest to newest | &#x60;symbol&#x60; +
     * &#x60;startTime&#x60; | oldest allocations since &#x60;startTime&#x60; | &#x60;symbol&#x60; +
     * &#x60;endTime&#x60; | newest allocations until &#x60;endTime&#x60; | &#x60;symbol&#x60; +
     * &#x60;startTime&#x60; + &#x60;endTime&#x60; | allocations within the time range |
     * &#x60;symbol&#x60; + &#x60;fromAllocationId&#x60; | allocations by allocation ID |
     * &#x60;symbol&#x60; + &#x60;orderId&#x60; | allocations related to an order starting with
     * oldest | &#x60;symbol&#x60; + &#x60;orderId&#x60; + &#x60;fromAllocationId&#x60; |
     * allocations related to an order by allocation ID | **Note:** The time between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; can&#39;t be longer than 24 hours.
     *
     * @param symbol (required)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param fromAllocationId (optional)
     * @param limit (optional)
     * @param orderId (optional)
     * @param recvWindow Supports up to three decimal places of precision (e.g., 6000.346) so that
     *     microseconds may be specified. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/account#my-allocations">Query
     *     Allocations (USER_DATA) Documentation</a>
     */
    public ApiResponse<MyAllocationsResponse> myAllocations(
            String symbol,
            Long startTime,
            Long endTime,
            Integer fromAllocationId,
            Integer limit,
            Long orderId,
            Double recvWindow)
            throws ApiException {
        return accountApi.myAllocations(
                symbol, startTime, endTime, fromAllocationId, limit, orderId, recvWindow);
    }

    /**
     * Query relevant filters (USER_DATA) Retrieves the list of filters relevant to an account on a
     * given symbol. This is the only endpoint that shows if an account has &#x60;MAX_ASSET&#x60;
     * filters applied to it. Weight(IP): 40 Security Type: USER_DATA Notes: **Data Source:** Memory
     *
     * @param symbol (required)
     * @param recvWindow Supports up to three decimal places of precision (e.g., 6000.346) so that
     *     microseconds may be specified. (optional)
     * @return ApiResponse&lt;MyFiltersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Query relevant filters </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/account#my-filters">Query
     *     relevant filters (USER_DATA) Documentation</a>
     */
    public ApiResponse<MyFiltersResponse> myFilters(String symbol, Double recvWindow)
            throws ApiException {
        return accountApi.myFilters(symbol, recvWindow);
    }

    /**
     * Query Prevented Matches (USER_DATA) Displays the list of orders that were expired due to STP.
     * These are the combinations supported: - &#x60;symbol&#x60; + &#x60;preventedMatchId&#x60; -
     * &#x60;symbol&#x60; + &#x60;orderId&#x60; - &#x60;symbol&#x60; + &#x60;orderId&#x60; +
     * &#x60;fromPreventedMatchId&#x60; (&#x60;limit&#x60; will default to 500) - &#x60;symbol&#x60;
     * + &#x60;orderId&#x60; + &#x60;fromPreventedMatchId&#x60; + &#x60;limit&#x60; Weight: Case |
     * Weight ---- | ----- If &#x60;symbol&#x60; is invalid | 2 Querying by
     * &#x60;preventedMatchId&#x60; | 2 Querying by &#x60;orderId&#x60; | 20 Security Type:
     * USER_DATA Notes: **Data Source:** Database
     *
     * @param symbol (required)
     * @param preventedMatchId (optional)
     * @param orderId (optional)
     * @param fromPreventedMatchId (optional)
     * @param limit (optional)
     * @param recvWindow Supports up to three decimal places of precision (e.g., 6000.346) so that
     *     microseconds may be specified. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/account#my-prevented-matches">Query
     *     Prevented Matches (USER_DATA) Documentation</a>
     */
    public ApiResponse<MyPreventedMatchesResponse> myPreventedMatches(
            String symbol,
            Long preventedMatchId,
            Long orderId,
            Long fromPreventedMatchId,
            Integer limit,
            Double recvWindow)
            throws ApiException {
        return accountApi.myPreventedMatches(
                symbol, preventedMatchId, orderId, fromPreventedMatchId, limit, recvWindow);
    }

    /**
     * Account trade list (USER_DATA) Get trades for a specific account and symbol. Weight:
     * Condition| Weight| ---| --- |Without orderId|20| |With orderId|5| Security Type: USER_DATA
     * Notes: **Data Source:** Memory &#x3D;&gt; Database **Notes:**: - If &#x60;fromId&#x60; is
     * set, it will get trades &gt;&#x3D; that &#x60;fromId&#x60;. Otherwise most recent trades are
     * returned. - The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; can&#39;t be
     * longer than 24 hours. - These are the supported combinations of all parameters: -
     * &#x60;symbol&#x60; - &#x60;symbol&#x60; + &#x60;orderId&#x60; - &#x60;symbol&#x60; +
     * &#x60;startTime&#x60; - &#x60;symbol&#x60; + &#x60;endTime&#x60; - &#x60;symbol&#x60; +
     * &#x60;fromId&#x60; - &#x60;symbol&#x60; + &#x60;startTime&#x60; + &#x60;endTime&#x60; -
     * &#x60;symbol&#x60;+ &#x60;orderId&#x60; + &#x60;fromId&#x60;
     *
     * @param symbol (required)
     * @param orderId This can only be used in combination with &#x60;symbol&#x60;. (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param fromId TradeId to fetch from. Default gets most recent trades. (optional)
     * @param limit (optional)
     * @param recvWindow Supports up to three decimal places of precision (e.g., 6000.346) so that
     *     microseconds may be specified. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/account#my-trades">Account
     *     trade list (USER_DATA) Documentation</a>
     */
    public ApiResponse<MyTradesResponse> myTrades(
            String symbol,
            Long orderId,
            Long startTime,
            Long endTime,
            Long fromId,
            Integer limit,
            Double recvWindow)
            throws ApiException {
        return accountApi.myTrades(symbol, orderId, startTime, endTime, fromId, limit, recvWindow);
    }

    /**
     * Query Open Order lists (USER_DATA) Query Open Order lists Weight(IP): 6 Security Type:
     * USER_DATA Notes: **Data Source:** Memory -&gt; Database
     *
     * @param recvWindow Supports up to three decimal places of precision (e.g., 6000.346) so that
     *     microseconds may be specified. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/account#open-order-list">Query
     *     Open Order lists (USER_DATA) Documentation</a>
     */
    public ApiResponse<OpenOrderListResponse> openOrderList(Double recvWindow) throws ApiException {
        return accountApi.openOrderList(recvWindow);
    }

    /**
     * Query Order Amendments (USER_DATA) Queries all amendments of a single order. Weight(IP): 4
     * Security Type: USER_DATA Notes: **Data Source:** Database
     *
     * @param symbol (required)
     * @param orderId (required)
     * @param fromExecutionId (optional)
     * @param limit (optional)
     * @param recvWindow Supports up to three decimal places of precision (e.g., 6000.346) so that
     *     microseconds may be specified. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/account#order-amendments">Query
     *     Order Amendments (USER_DATA) Documentation</a>
     */
    public ApiResponse<OrderAmendmentsResponse> orderAmendments(
            String symbol, Long orderId, Long fromExecutionId, Long limit, Double recvWindow)
            throws ApiException {
        return accountApi.orderAmendments(symbol, orderId, fromExecutionId, limit, recvWindow);
    }

    /**
     * Query Unfilled Order Count (USER_DATA) Displays the user&#39;s unfilled order count for all
     * intervals. Weight(IP): 40 Security Type: USER_DATA Notes: **Data Source:** Memory
     *
     * @param recvWindow Supports up to three decimal places of precision (e.g., 6000.346) so that
     *     microseconds may be specified. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/account#rate-limit-order">Query
     *     Unfilled Order Count (USER_DATA) Documentation</a>
     */
    public ApiResponse<RateLimitOrderResponse> rateLimitOrder(Double recvWindow)
            throws ApiException {
        return accountApi.rateLimitOrder(recvWindow);
    }

    /**
     * Exchange information Current exchange trading rules and symbol information Weight(IP): 20
     * Security Type: NONE Notes: **Data Source:** Memory **Notes:** * If the value provided to
     * &#x60;symbol&#x60; or &#x60;symbols&#x60; do not exist, the endpoint will throw an error
     * saying the symbol is invalid. * All parameters are optional. * &#x60;permissions&#x60; can
     * support single or multiple values (e.g. &#x60;SPOT&#x60;,
     * &#x60;[\&quot;MARGIN\&quot;,\&quot;LEVERAGED\&quot;]&#x60;). This cannot be used in
     * combination with &#x60;symbol&#x60; or &#x60;symbols&#x60;. * If &#x60;permissions&#x60;
     * parameter not provided, all symbols that have either &#x60;SPOT&#x60;, &#x60;MARGIN&#x60;, or
     * &#x60;LEVERAGED&#x60; permission will be exposed. * To display symbols with any permission
     * you need to specify them explicitly in &#x60;permissions&#x60;: (e.g.
     * &#x60;[\&quot;SPOT\&quot;,\&quot;MARGIN\&quot;,...]&#x60;.). See Account and Symbol
     * Permissions for the full list. **Examples of Symbol Permissions Interpretation from the
     * Response:** * &#x60;[[\&quot;A\&quot;,\&quot;B\&quot;]]&#x60; means you may place an order if
     * your account has either permission \&quot;A\&quot; **or** permission \&quot;B\&quot;. *
     * &#x60;[[\&quot;A\&quot;],[\&quot;B\&quot;]]&#x60; means you can place an order if your
     * account has permission \&quot;A\&quot; **and** permission \&quot;B\&quot;. *
     * &#x60;[[\&quot;A\&quot;],[\&quot;B\&quot;,\&quot;C\&quot;]]&#x60; means you can place an
     * order if your account has permission \&quot;A\&quot; **and** permission \&quot;B\&quot; or
     * permission \&quot;C\&quot;. (Inclusive or is applied here, not exclusive or, so your account
     * may have both permission \&quot;B\&quot; and permission \&quot;C\&quot;.)
     *
     * @param symbol Example: curl -X GET
     *     \&quot;https://api.binance.com/api/v3/exchangeInfo?symbol&#x3D;BNBBTC\&quot; (optional)
     * @param symbols Examples: curl -X GET
     *     \&quot;https://api.binance.com/api/v3/exchangeInfo?symbols&#x3D;%5B%22BNBBTC%22,%22BTCUSDT%22%5D\&quot;
     *     or curl -g -X GET
     *     &#39;https://api.binance.com/api/v3/exchangeInfo?symbols&#x3D;[\&quot;BTCUSDT\&quot;,\&quot;BNBBTC\&quot;]&#39;
     *     (optional)
     * @param permissions Examples: curl -X GET
     *     \&quot;https://api.binance.com/api/v3/exchangeInfo?permissions&#x3D;SPOT\&quot; curl -X
     *     GET
     *     \&quot;https://api.binance.com/api/v3/exchangeInfo?permissions&#x3D;%5B%22MARGIN%22%2C%22LEVERAGED%22%5D\&quot;
     *     or curl -g -X GET
     *     &#39;https://api.binance.com/api/v3/exchangeInfo?permissions&#x3D;[\&quot;MARGIN\&quot;,\&quot;LEVERAGED\&quot;]&#39;
     *     (optional)
     * @param showPermissionSets Controls whether the content of the &#x60;permissionSets&#x60;
     *     field is populated or not. (optional)
     * @param symbolStatus Filters for symbols that have this &#x60;tradingStatus&#x60;. Cannot be
     *     used in combination with &#x60;symbols&#x60; or &#x60;symbol&#x60;. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/general#exchange-info">Exchange
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
     * Query Execution Rules Query execution rules for symbols. Weight: Parameter | Weight --- | ---
     * &#x60;symbol&#x60; | 2 &#x60;symbols&#x60; | 2 for each &#x60;symbol&#x60;, capped at a max
     * of 40 &#x60;symbolStatus&#x60; | 40 None | 40 Security Type: NONE Notes: **Data Source:**
     * Memory **Note:**: No combination of multiple parameters is allowed.
     *
     * @param symbol Query for specified symbol. (optional)
     * @param symbols Query for multiple symbols. (optional)
     * @param symbolStatus Query for all symbols with the specified status. (optional)
     * @return ApiResponse&lt;ExecutionRulesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Query execution rules </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/general#execution-rules">Query
     *     Execution Rules Documentation</a>
     */
    public ApiResponse<ExecutionRulesResponse> executionRules(
            String symbol, Symbols symbols, SymbolStatus symbolStatus) throws ApiException {
        return generalApi.executionRules(symbol, symbols, symbolStatus);
    }

    /**
     * Test connectivity Test connectivity to the Rest API. Weight(IP): 1 Security Type: NONE
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/general#ping">Test
     *     connectivity Documentation</a>
     */
    public void ping() throws ApiException {
        generalApi.ping();
    }

    /**
     * Check server time Test connectivity to the Rest API and get the current server time.
     * Weight(IP): 1 Security Type: NONE
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/general#time">Check
     *     server time Documentation</a>
     */
    public ApiResponse<TimeResponse> time() throws ApiException {
        return generalApi.time();
    }

    /**
     * Compressed/Aggregate trades list Get compressed, aggregate trades. Trades that fill at the
     * time, from the same taker order, with the same price will have the quantity aggregated.
     * Weight(IP): 4 Security Type: NONE Notes: **Data Source:** Database - If fromId, startTime,
     * and endTime are not sent, the most recent aggregate trades will be returned.
     *
     * @param symbol (required)
     * @param fromId ID to get aggregate trades from INCLUSIVE. (optional)
     * @param startTime Timestamp in ms to get aggregate trades from INCLUSIVE. (optional)
     * @param endTime Timestamp in ms to get aggregate trades until INCLUSIVE. (optional)
     * @param limit (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/market#agg-trades">Compressed/Aggregate
     *     trades list Documentation</a>
     */
    public ApiResponse<AggTradesResponse> aggTrades(
            String symbol, Long fromId, Long startTime, Long endTime, Integer limit)
            throws ApiException {
        return marketApi.aggTrades(symbol, fromId, startTime, endTime, limit);
    }

    /**
     * Current average price Current average price for a symbol. Weight(IP): 2 Security Type: NONE
     * Notes: **Data Source:** Memory
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/market#avg-price">Current
     *     average price Documentation</a>
     */
    public ApiResponse<AvgPriceResponse> avgPrice(String symbol) throws ApiException {
        return marketApi.avgPrice(symbol);
    }

    /**
     * Order book Order book Weight: Adjusted based on the limit: |Limit|Request Weight
     * ------|------- 1-100| 5 101-500| 25 501-1000| 50 1001-5000| 250 Security Type: NONE Notes:
     * **Data Source:** Memory
     *
     * @param symbol (required)
     * @param limit If limit &gt; 5000, only 5000 entries will be returned. (optional)
     * @param symbolStatus Filters for symbols that have this &#x60;tradingStatus&#x60;. A status
     *     mismatch returns error &#x60;-1220 SYMBOL_DOES_NOT_MATCH_STATUS&#x60;. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/market#depth">Order
     *     book Documentation</a>
     */
    public ApiResponse<DepthResponse> depth(String symbol, Integer limit, SymbolStatus symbolStatus)
            throws ApiException {
        return marketApi.depth(symbol, limit, symbolStatus);
    }

    /**
     * Recent trades list Get recent trades. Weight(IP): 25 Security Type: NONE Notes: **Data
     * Source:** Memory
     *
     * @param symbol (required)
     * @param limit (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/market#get-trades">Recent
     *     trades list Documentation</a>
     */
    public ApiResponse<GetTradesResponse> getTrades(String symbol, Integer limit)
            throws ApiException {
        return marketApi.getTrades(symbol, limit);
    }

    /**
     * Historical Block Trades (MARKET_DATA) Get block trades. Weight(IP): 25 Security Type:
     * MARKET_DATA Notes: - Data Source: Database
     *
     * @param symbol (required)
     * @param fromId Block trade ID to fetch from (required)
     * @param limit Default: 500; Maximum: 1000 (optional)
     * @return ApiResponse&lt;HistoricalBlockTradesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Historical Block Trades </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/market#historical-block-trades">Historical
     *     Block Trades (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<HistoricalBlockTradesResponse> historicalBlockTrades(
            String symbol, Long fromId, Long limit) throws ApiException {
        return marketApi.historicalBlockTrades(symbol, fromId, limit);
    }

    /**
     * Old trade lookup Get older trades. Weight(IP): 25 Security Type: NONE Notes: **Data Source:**
     * Database
     *
     * @param symbol (required)
     * @param limit (optional)
     * @param fromId TradeId to fetch from. Default gets most recent trades. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/market#historical-trades">Old
     *     trade lookup Documentation</a>
     */
    public ApiResponse<HistoricalTradesResponse> historicalTrades(
            String symbol, Integer limit, Long fromId) throws ApiException {
        return marketApi.historicalTrades(symbol, limit, fromId);
    }

    /**
     * Kline/Candlestick data Kline/candlestick bars for a symbol. Klines are uniquely identified by
     * their open time. Weight(IP): 2 Security Type: NONE Notes: **Data Source:** Database Supported
     * kline intervals (case-sensitive): Interval | &#x60;interval&#x60; value --------- |
     * ---------------- seconds | &#x60;1s&#x60; minutes | &#x60;1m&#x60;, &#x60;3m&#x60;,
     * &#x60;5m&#x60;, &#x60;15m&#x60;, &#x60;30m&#x60; hours | &#x60;1h&#x60;, &#x60;2h&#x60;,
     * &#x60;4h&#x60;, &#x60;6h&#x60;, &#x60;8h&#x60;, &#x60;12h&#x60; days | &#x60;1d&#x60;,
     * &#x60;3d&#x60; weeks | &#x60;1w&#x60; months | &#x60;1M&#x60; **Notes:** * If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, the most recent klines are
     * returned. * Supported values for &#x60;timeZone&#x60;: * Hours and minutes (e.g.
     * &#x60;-1:00&#x60;, &#x60;05:45&#x60;) * Only hours (e.g. &#x60;0&#x60;, &#x60;8&#x60;,
     * &#x60;4&#x60;) * Accepted range is strictly [-12:00 to +14:00] inclusive * If
     * &#x60;timeZone&#x60; provided, kline intervals are interpreted in that timezone instead of
     * UTC. * Note that &#x60;startTime&#x60; and &#x60;endTime&#x60; are always interpreted in UTC,
     * regardless of &#x60;timeZone&#x60;.
     *
     * @param symbol (required)
     * @param interval (required)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param timeZone Default: 0 (UTC) (optional)
     * @param limit (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/market#klines">Kline/Candlestick
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
     * Query Reference Price Query the reference price for a symbol. Weight(IP): 2 Security Type:
     * NONE Notes: **Data Source:** Memory
     *
     * @param symbol (required)
     * @return ApiResponse&lt;ReferencePriceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Reference price </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/market#reference-price">Query
     *     Reference Price Documentation</a>
     */
    public ApiResponse<ReferencePriceResponse> referencePrice(String symbol) throws ApiException {
        return marketApi.referencePrice(symbol);
    }

    /**
     * Query Reference Price Calculation Describes how reference price is calculated for a given
     * symbol. Weight(IP): 2 Security Type: NONE Notes: **Data Source:** Memory
     *
     * @param symbol (required)
     * @param symbolStatus Supported values: &#x60;TRADING&#x60;, &#x60;HALT&#x60;,
     *     &#x60;BREAK&#x60; (optional)
     * @return ApiResponse&lt;ReferencePriceCalculationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Reference price calculation </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/market#reference-price-calculation">Query
     *     Reference Price Calculation Documentation</a>
     */
    public ApiResponse<ReferencePriceCalculationResponse> referencePriceCalculation(
            String symbol, SymbolStatus symbolStatus) throws ApiException {
        return marketApi.referencePriceCalculation(symbol, symbolStatus);
    }

    /**
     * Rolling window price change statistics **Note:** This endpoint differs from &#x60;GET
     * /api/v3/ticker/24hr&#x60;. The statistical time range of this endpoint can be up to 59999ms
     * longer than the requested &#x60;windowSize&#x60;. &#x60;openTime&#x60; starts at the
     * beginning of a minute, while the end time is the current time. Therefore, the actual interval
     * can be up to 59999ms longer than the requested window. For example, if &#x60;closeTime&#x60;
     * is 1641287867099 (January 04, 2022 09:17:47:099 UTC) and &#x60;windowSize&#x60; is
     * &#x60;1d&#x60;, then &#x60;openTime&#x60; is 1641201420000 (January 3, 2022, 09:17:00 UTC).
     * Weight: 4 for each requested symbol regardless of windowSize. The weight for this request
     * will cap at 200 once the number of &#x60;symbols&#x60; in the request is more than 50.
     * Security Type: NONE Notes: **Data Source:** Database
     *
     * @param symbol Either &#x60;symbol&#x60; or &#x60;symbols&#x60; must be provided (optional)
     * @param symbols Either &#x60;symbol&#x60; or &#x60;symbols&#x60; must be provided Examples of
     *     accepted format for the &#x60;symbols&#x60; parameter:
     *     [\&quot;BTCUSDT\&quot;,\&quot;BNBUSDT\&quot;] or %5B%22BTCUSDT%22,%22BNBUSDT%22%5D The
     *     maximum number of symbols allowed in a request is 100. (optional)
     * @param windowSize Units cannot be combined (e.g. &#x60;1d2h&#x60; is not allowed). (optional,
     *     default to 1d)
     * @param type (optional, default to FULL)
     * @param symbolStatus (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/market#ticker">Rolling
     *     window price change statistics Documentation</a>
     */
    public ApiResponse<TickerResponse> ticker(
            String symbol,
            Symbols symbols,
            WindowSize windowSize,
            TickerType type,
            SymbolStatus symbolStatus)
            throws ApiException {
        return marketApi.ticker(symbol, symbols, windowSize, type, symbolStatus);
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
     * omitted&lt;/td&gt; &lt;td&gt;80&lt;/td&gt; &lt;/tr&gt; &lt;/tbody&gt; &lt;/table&gt; Security
     * Type: NONE Notes: **Data Source:** Memory
     *
     * @param symbol Either &#x60;symbol&#x60; or &#x60;symbols&#x60; must be provided (optional)
     * @param symbols Either &#x60;symbol&#x60; or &#x60;symbols&#x60; must be provided Examples of
     *     accepted format for the &#x60;symbols&#x60; parameter:
     *     [\&quot;BTCUSDT\&quot;,\&quot;BNBUSDT\&quot;] or %5B%22BTCUSDT%22,%22BNBUSDT%22%5D The
     *     maximum number of symbols allowed in a request is 100. (optional)
     * @param type (optional, default to FULL)
     * @param symbolStatus (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/market#ticker24hr">24hr
     *     ticker price change statistics Documentation</a>
     */
    public ApiResponse<Ticker24hrResponse> ticker24hr(
            String symbol, Symbols symbols, TickerType type, SymbolStatus symbolStatus)
            throws ApiException {
        return marketApi.ticker24hr(symbol, symbols, type, symbolStatus);
    }

    /**
     * Symbol order book ticker Best price/qty on the order book for a symbol or symbols. Weight:
     * |Parameter|Symbols Provided|Weight| |---|---|---| |symbol| 1 |2| | |omitted| 4| |symbols| Any
     * |4| Security Type: NONE Notes: **Data Source:** Memory
     *
     * @param symbol Parameter symbol and symbols cannot be used in combination. If neither
     *     parameter is sent, &#x60;bookTickers&#x60; for all symbols will be returned in an array.
     *     (optional)
     * @param symbols Parameter symbol and symbols cannot be used in combination. If neither
     *     parameter is sent, &#x60;bookTickers&#x60; for all symbols will be returned in an array.
     *     Examples of accepted format for the symbols parameter:
     *     [\&quot;BTCUSDT\&quot;,\&quot;BNBUSDT\&quot;] or %5B%22BTCUSDT%22,%22BNBUSDT%22%5D
     *     (optional)
     * @param symbolStatus Filters for symbols that have this &#x60;tradingStatus&#x60;. For a
     *     single symbol, a status mismatch returns error &#x60;-1220
     *     SYMBOL_DOES_NOT_MATCH_STATUS&#x60;. For multiple or all symbols, non-matching ones are
     *     simply excluded from the response. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/market#ticker-book-ticker">Symbol
     *     order book ticker Documentation</a>
     */
    public ApiResponse<TickerBookTickerResponse> tickerBookTicker(
            String symbol, Symbols symbols, SymbolStatus symbolStatus) throws ApiException {
        return marketApi.tickerBookTicker(symbol, symbols, symbolStatus);
    }

    /**
     * Symbol price ticker Latest price for a symbol or symbols. Weight: |Parameter|Symbols
     * Provided|Weight| |---|---|---| |symbol| 1 |2| | |omitted| 4| |symbols| Any |4| Security Type:
     * NONE Notes: **Data Source:** Memory
     *
     * @param symbol Parameter symbol and symbols cannot be used in combination. If neither
     *     parameter is sent, prices for all symbols will be returned in an array. (optional)
     * @param symbols Parameter symbol and symbols cannot be used in combination. If neither
     *     parameter is sent, prices for all symbols will be returned in an array. Examples of
     *     accepted format for the symbols parameter: [\&quot;BTCUSDT\&quot;,\&quot;BNBUSDT\&quot;]
     *     or %5B%22BTCUSDT%22,%22BNBUSDT%22%5D (optional)
     * @param symbolStatus Filters for symbols that have this &#x60;tradingStatus&#x60;. For a
     *     single symbol, a status mismatch returns error &#x60;-1220
     *     SYMBOL_DOES_NOT_MATCH_STATUS&#x60;. For multiple or all symbols, non-matching ones are
     *     simply excluded from the response. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/market#ticker-price">Symbol
     *     price ticker Documentation</a>
     */
    public ApiResponse<TickerPriceResponse> tickerPrice(
            String symbol, Symbols symbols, SymbolStatus symbolStatus) throws ApiException {
        return marketApi.tickerPrice(symbol, symbols, symbolStatus);
    }

    /**
     * Trading Day Ticker Price change statistics for a trading day. Weight: 4 for each requested
     * symbol. The weight for this request will cap at 200 once the number of symbols in the request
     * is more than 50. Security Type: NONE Notes: **Data Source:** Database **Notes:**: - Supported
     * values for &#x60;timeZone&#x60;: - Hours and minutes (e.g. &#x60;-1:00&#x60;,
     * &#x60;05:45&#x60;) - Only hours (e.g. &#x60;0&#x60;, &#x60;8&#x60;, &#x60;4&#x60;)
     *
     * @param symbol Either &#x60;symbol&#x60; or &#x60;symbols&#x60; must be provided. (optional)
     * @param symbols Either &#x60;symbol&#x60; or &#x60;symbols&#x60; must be provided. Examples of
     *     accepted format for the &#x60;symbols&#x60; parameter:
     *     [\&quot;BTCUSDT\&quot;,\&quot;BNBUSDT\&quot;] or %5B%22BTCUSDT%22,%22BNBUSDT%22%5D. The
     *     maximum number of &#x60;symbols&#x60; allowed in a request is 100. (optional)
     * @param timeZone Default: 0 (UTC) (optional)
     * @param type (optional, default to FULL)
     * @param symbolStatus Filters for symbols that have this &#x60;tradingStatus&#x60;. For a
     *     single symbol, a status mismatch returns error &#x60;-1220
     *     SYMBOL_DOES_NOT_MATCH_STATUS&#x60;. For multiple symbols, non-matching ones are simply
     *     excluded from the response. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/market#ticker-trading-day">Trading
     *     Day Ticker Documentation</a>
     */
    public ApiResponse<TickerTradingDayResponse> tickerTradingDay(
            String symbol,
            Symbols symbols,
            String timeZone,
            TickerType type,
            SymbolStatus symbolStatus)
            throws ApiException {
        return marketApi.tickerTradingDay(symbol, symbols, timeZone, type, symbolStatus);
    }

    /**
     * UIKlines The request is similar to klines having the same parameters and response.
     * &#x60;uiKlines&#x60; return modified kline data, optimized for presentation of candlestick
     * charts. Weight(IP): 2 Security Type: NONE Notes: **Data Source:** Database - If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, the most recent klines are
     * returned. - Supported values for &#x60;timeZone&#x60;: - Hours and minutes (e.g.
     * &#x60;-1:00&#x60;, &#x60;05:45&#x60;) - Only hours (e.g. &#x60;0&#x60;, &#x60;8&#x60;,
     * &#x60;4&#x60;) - Accepted range is strictly [-12:00 to +14:00] inclusive - If
     * &#x60;timeZone&#x60; provided, kline intervals are interpreted in that timezone instead of
     * UTC. - Note that &#x60;startTime&#x60; and &#x60;endTime&#x60; are always interpreted in UTC,
     * regardless of &#x60;timeZone&#x60;.
     *
     * @param symbol (required)
     * @param interval (required)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param timeZone Default: 0 (UTC) (optional)
     * @param limit (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/market#ui-klines">UIKlines
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
     * Cancel All Open Orders on a Symbol (TRADE) Cancels all active orders on a symbol. This
     * includes orders that are part of an order list. Weight(IP): 1 Security Type: TRADE Notes:
     * **Data Source:** Matching Engine
     *
     * @param symbol (required)
     * @param recvWindow Supports up to three decimal places of precision (e.g., 6000.346) so that
     *     microseconds may be specified. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/trade#delete-open-orders">Cancel
     *     All Open Orders on a Symbol (TRADE) Documentation</a>
     */
    public ApiResponse<DeleteOpenOrdersResponse> deleteOpenOrders(String symbol, Double recvWindow)
            throws ApiException {
        return tradeApi.deleteOpenOrders(symbol, recvWindow);
    }

    /**
     * Cancel order (TRADE) Cancel an active order. Weight(IP): 1 Security Type: TRADE Notes: **Data
     * Source:** Matching Engine - Either &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must
     * be sent. - If both &#x60;orderId&#x60; and &#x60;origClientOrderId&#x60; are provided, the
     * &#x60;orderId&#x60; is searched first, then the &#x60;origClientOrderId&#x60; from that
     * result is checked against that order. If both conditions are not met the request will be
     * rejected. - The performance for canceling an order (single cancel or as part of a
     * cancel-replace) is always better when only &#x60;orderId&#x60; is sent. Sending
     * &#x60;origClientOrderId&#x60; or both &#x60;orderId&#x60; + &#x60;origClientOrderId&#x60;
     * will be slower.
     *
     * @param symbol (required)
     * @param orderId (optional)
     * @param origClientOrderId (optional)
     * @param newClientOrderId Used to uniquely identify this cancel. Automatically generated by
     *     default. (optional)
     * @param cancelRestrictions Supported values: &lt;br&gt;&#x60;ONLY_NEW&#x60; - Cancel will
     *     succeed if the order status is &#x60;NEW&#x60;.&lt;br&gt;
     *     &#x60;ONLY_PARTIALLY_FILLED&#x60; - Cancel will succeed if order status is
     *     &#x60;PARTIALLY_FILLED&#x60;. (optional)
     * @param recvWindow Supports up to three decimal places of precision (e.g., 6000.346) so that
     *     microseconds may be specified. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/trade#delete-order">Cancel
     *     order (TRADE) Documentation</a>
     */
    public ApiResponse<DeleteOrderResponse> deleteOrder(
            String symbol,
            Long orderId,
            String origClientOrderId,
            String newClientOrderId,
            CancelRestrictions cancelRestrictions,
            Double recvWindow)
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
     * Cancel Order list (TRADE) Cancel an entire Order list Weight(IP): 1 Security Type: TRADE
     * Notes: **Data Source:** Matching Engine **Notes:** - Canceling an individual order from an
     * order list will cancel the entire order list. - If both orderListId and listClientOrderId
     * parameters are provided, the orderListId is searched first, then the listClientOrderId from
     * that result is checked against that order. If both conditions are not met the request will be
     * rejected.
     *
     * @param symbol (required)
     * @param orderListId Either &#x60;orderListId&#x60; or &#x60;listClientOrderId&#x60; must be
     *     provided (optional)
     * @param listClientOrderId Either &#x60;orderListId&#x60; or &#x60;listClientOrderId&#x60; must
     *     be provided (optional)
     * @param newClientOrderId Used to uniquely identify this cancel. Automatically generated by
     *     default. (optional)
     * @param recvWindow Supports up to three decimal places of precision (e.g., 6000.346) so that
     *     microseconds may be specified. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/trade#delete-order-list">Cancel
     *     Order list (TRADE) Documentation</a>
     */
    public ApiResponse<DeleteOrderListResponse> deleteOrderList(
            String symbol,
            Long orderListId,
            String listClientOrderId,
            String newClientOrderId,
            Double recvWindow)
            throws ApiException {
        return tradeApi.deleteOrderList(
                symbol, orderListId, listClientOrderId, newClientOrderId, recvWindow);
    }

    /**
     * New order (TRADE) Send in a new order. This adds 1 order to the
     * &#x60;EXCHANGE_MAX_ORDERS&#x60; filter and the &#x60;MAX_NUM_ORDERS&#x60; filter. Weight(IP):
     * 1 Unfilled Order Count: 1 Security Type: TRADE Notes: **Data Source:** Matching Engine Some
     * additional mandatory parameters based on order &#x60;type&#x60;: Type | Additional mandatory
     * parameters | Additional Information ------------ | ------------| ------ &#x60;LIMIT&#x60; |
     * &#x60;timeInForce&#x60;, &#x60;quantity&#x60;, &#x60;price&#x60;| &#x60;MARKET&#x60; |
     * &#x60;quantity&#x60; or &#x60;quoteOrderQty&#x60;| &#x60;MARKET&#x60; orders using the
     * &#x60;quantity&#x60; field specifies the amount of the &#x60;base asset&#x60; the user wants
     * to buy or sell at the market price. &lt;br/&gt; E.g. MARKET order on BTCUSDT will specify how
     * much BTC the user is buying or selling. &lt;br/&gt;&lt;br/&gt; &#x60;MARKET&#x60; orders
     * using &#x60;quoteOrderQty&#x60; specifies the amount the user wants to spend (when buying) or
     * receive (when selling) the &#x60;quote&#x60; asset; the correct &#x60;quantity&#x60; will be
     * determined based on the market liquidity and &#x60;quoteOrderQty&#x60;. &lt;br/&gt; E.g.
     * Using the symbol BTCUSDT: &lt;br/&gt; &#x60;BUY&#x60; side, the order will buy as many BTC as
     * &#x60;quoteOrderQty&#x60; USDT can. &lt;br/&gt; &#x60;SELL&#x60; side, the order will sell as
     * much BTC needed to receive &#x60;quoteOrderQty&#x60; USDT. &#x60;STOP_LOSS&#x60; |
     * &#x60;quantity&#x60;, &#x60;stopPrice&#x60; or &#x60;trailingDelta&#x60;| This will execute a
     * &#x60;MARKET&#x60; order when the conditions are met. (e.g. &#x60;stopPrice&#x60; is met or
     * &#x60;trailingDelta&#x60; is activated) &#x60;STOP_LOSS_LIMIT&#x60; |
     * &#x60;timeInForce&#x60;, &#x60;quantity&#x60;, &#x60;price&#x60;, &#x60;stopPrice&#x60; or
     * &#x60;trailingDelta&#x60; &#x60;TAKE_PROFIT&#x60; | &#x60;quantity&#x60;,
     * &#x60;stopPrice&#x60; or &#x60;trailingDelta&#x60; | This will execute a &#x60;MARKET&#x60;
     * order when the conditions are met. (e.g. &#x60;stopPrice&#x60; is met or
     * &#x60;trailingDelta&#x60; is activated) &#x60;TAKE_PROFIT_LIMIT&#x60; |
     * &#x60;timeInForce&#x60;, &#x60;quantity&#x60;, &#x60;price&#x60;, &#x60;stopPrice&#x60; or
     * &#x60;trailingDelta&#x60; | &#x60;LIMIT_MAKER&#x60; | &#x60;quantity&#x60;,
     * &#x60;price&#x60;| This is a &#x60;LIMIT&#x60; order that will be rejected if the order
     * immediately matches and trades as a taker. &lt;br/&gt; This is also known as a POST-ONLY
     * order. Notes on using parameters for Pegged Orders: * These parameters are allowed for
     * &#x60;LIMIT&#x60;, &#x60;LIMIT_MAKER&#x60;, &#x60;STOP_LOSS_LIMIT&#x60;,
     * &#x60;TAKE_PROFIT_LIMIT&#x60; orders. * If &#x60;pegPriceType&#x60; is specified,
     * &#x60;price&#x60; becomes optional. Otherwise, it is still mandatory. *
     * &#x60;pegPriceType&#x3D;PRIMARY_PEG&#x60; means the primary peg, that is the best price on
     * the same side of the order book as your order. * &#x60;pegPriceType&#x3D;MARKET_PEG&#x60;
     * means the market peg, that is the best price on the opposite side of the order book from your
     * order. * Use &#x60;pegOffsetType&#x60; and &#x60;pegOffsetValue&#x60; to request a price
     * level other than the best one. These parameters must be specified together. Other info: * Any
     * &#x60;LIMIT&#x60; or &#x60;LIMIT_MAKER&#x60; type order can be made an iceberg order by
     * sending an &#x60;icebergQty&#x60;. * Any order with an &#x60;icebergQty&#x60; MUST have
     * &#x60;timeInForce&#x60; set to &#x60;GTC&#x60;. * For &#x60;STOP_LOSS&#x60;,
     * &#x60;STOP_LOSS_LIMIT&#x60;, &#x60;TAKE_PROFIT_LIMIT&#x60; and &#x60;TAKE_PROFIT&#x60;
     * orders, &#x60;trailingDelta&#x60; can be combined with &#x60;stopPrice&#x60;. *
     * &#x60;MARKET&#x60; orders using &#x60;quoteOrderQty&#x60; will not break &#x60;LOT_SIZE&#x60;
     * filter rules; the order will execute a &#x60;quantity&#x60; that will have the notional value
     * as close as possible to &#x60;quoteOrderQty&#x60;. Trigger order price rules against market
     * price for both MARKET and LIMIT versions: * Price above market price: &#x60;STOP_LOSS&#x60;
     * &#x60;BUY&#x60;, &#x60;TAKE_PROFIT&#x60; &#x60;SELL&#x60; * Price below market price:
     * &#x60;STOP_LOSS&#x60; &#x60;SELL&#x60;, &#x60;TAKE_PROFIT&#x60; &#x60;BUY&#x60;
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/trade#new-order">New
     *     order (TRADE) Documentation</a>
     */
    public ApiResponse<NewOrderResponse> newOrder(NewOrderRequest newOrderRequest)
            throws ApiException {
        return tradeApi.newOrder(newOrderRequest);
    }

    /**
     * Order Amend Keep Priority (TRADE) Reduce the quantity of an existing open order. This adds 0
     * orders to the &#x60;EXCHANGE_MAX_ORDERS&#x60; filter and the &#x60;MAX_NUM_ORDERS&#x60;
     * filter. Read Order Amend Keep Priority FAQ to learn more. Weight(IP): 4 Unfilled Order Count:
     * 0 Security Type: TRADE Notes: **Data Source:** Matching Engine
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/trade#order-amend-keep-priority">Order
     *     Amend Keep Priority (TRADE) Documentation</a>
     */
    public ApiResponse<OrderAmendKeepPriorityResponse> orderAmendKeepPriority(
            OrderAmendKeepPriorityRequest orderAmendKeepPriorityRequest) throws ApiException {
        return tradeApi.orderAmendKeepPriority(orderAmendKeepPriorityRequest);
    }

    /**
     * Cancel an Existing Order and Send a New Order (TRADE) - Cancels an existing order and places
     * a new order on the same symbol. - Filters and Order Count are evaluated before the processing
     * of the cancellation and order placement occurs. - A new order that was not attempted (i.e.
     * when &#x60;newOrderResult: NOT_ATTEMPTED&#x60;), will still increase the unfilled order count
     * by 1. - You can only cancel an individual order from an orderList using this endpoint, but
     * the result is the same as canceling the entire orderList. Weight(IP): 1 Unfilled Order Count:
     * 1 Security Type: TRADE Notes: **Data Source:** Matching Engine Similar to &#x60;POST
     * /api/v3/order&#x60;, additional mandatory parameters are determined by &#x60;type&#x60;.
     * Response format varies depending on whether the processing of the message succeeded,
     * partially succeeded, or failed. &lt;table&gt; &lt;thead&gt; &lt;tr&gt; &lt;th colspan&#x3D;3
     * align&#x3D;left&gt;Request&lt;/th&gt; &lt;th colspan&#x3D;3
     * align&#x3D;left&gt;Response&lt;/th&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;th&gt;&lt;code&gt;cancelReplaceMode&lt;/code&gt;&lt;/th&gt;
     * &lt;th&gt;&lt;code&gt;orderRateLimitExceededMode&lt;/code&gt;&lt;/th&gt; &lt;th&gt;Unfilled
     * Order Count&lt;/th&gt; &lt;th&gt;&lt;code&gt;cancelResult&lt;/code&gt;&lt;/th&gt;
     * &lt;th&gt;&lt;code&gt;newOrderResult&lt;/code&gt;&lt;/th&gt;
     * &lt;th&gt;&lt;code&gt;status&lt;/code&gt;&lt;/th&gt; &lt;/tr&gt; &lt;/thead&gt; &lt;tbody&gt;
     * &lt;tr&gt; &lt;td
     * rowspan&#x3D;\&quot;11\&quot;&gt;&lt;code&gt;STOP_ON_FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * rowspan&#x3D;\&quot;6\&quot;&gt;&lt;code&gt;DO_NOTHING&lt;/code&gt;&lt;/td&gt; &lt;td
     * rowspan&#x3D;\&quot;3\&quot;&gt;Within Limits&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;200&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;➖
     * &lt;code&gt;NOT_ATTEMPTED&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;400&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;409&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td
     * rowspan&#x3D;\&quot;3\&quot;&gt;Exceeds Limits&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;
     * &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;➖
     * &lt;code&gt;NOT_ATTEMPTED&lt;/code&gt;&lt;/td&gt; &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;
     * &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;
     * &lt;/tr&gt; &lt;tr&gt; &lt;td
     * rowspan&#x3D;\&quot;5\&quot;&gt;&lt;code&gt;CANCEL_ONLY&lt;/code&gt;&lt;/td&gt; &lt;td
     * rowspan&#x3D;\&quot;3\&quot;&gt;Within Limits&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;200&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;➖
     * &lt;code&gt;NOT_ATTEMPTED&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;400&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;409&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td
     * rowspan&#x3D;\&quot;2\&quot;&gt;Exceeds Limits&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;➖
     * &lt;code&gt;NOT_ATTEMPTED&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;429&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;429&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td
     * rowspan&#x3D;\&quot;16\&quot;&gt;&lt;code&gt;ALLOW_FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * rowspan&#x3D;\&quot;8\&quot;&gt;&lt;code&gt;DO_NOTHING&lt;/code&gt;&lt;/td&gt; &lt;td
     * rowspan&#x3D;\&quot;4\&quot;&gt;Within Limits&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;200&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;400&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;409&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;409&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td
     * rowspan&#x3D;\&quot;4\&quot;&gt;Exceeds Limits&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;
     * &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;
     * &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;
     * &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;
     * &lt;/tr&gt; &lt;tr&gt; &lt;td
     * rowspan&#x3D;\&quot;8\&quot;&gt;&lt;CODE&gt;CANCEL_ONLY&lt;/CODE&gt;&lt;/td&gt; &lt;td
     * rowspan&#x3D;\&quot;4\&quot;&gt;Within Limits&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;200&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;400&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;409&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;409&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td
     * rowspan&#x3D;\&quot;4\&quot;&gt;Exceeds Limits&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;N/A&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;400&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;
     * &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;409&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;/tbody&gt;
     * &lt;/table&gt; **Notes:** - The performance for canceling an order (single cancel or as part
     * of a cancel-replace) is always better when only &#x60;orderId&#x60; is sent. Sending
     * &#x60;origClientOrderId&#x60; or both &#x60;orderId&#x60; + &#x60;origClientOrderId&#x60;
     * will be slower.
     *
     * @param orderCancelReplaceRequest (required)
     * @return ApiResponse&lt;OrderCancelReplaceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Both cancel and new order succeed </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/trade#order-cancel-replace">Cancel
     *     an Existing Order and Send a New Order (TRADE) Documentation</a>
     */
    public ApiResponse<OrderCancelReplaceResponse> orderCancelReplace(
            OrderCancelReplaceRequest orderCancelReplaceRequest) throws ApiException {
        return tradeApi.orderCancelReplace(orderCancelReplaceRequest);
    }

    /**
     * New Order list - OCO (TRADE) Send in an one-cancels-the-other (OCO) pair, where activation of
     * one order immediately cancels the other. - An OCO has 2 orders called the **above order** and
     * **below order**. - One of the orders must be a
     * &#x60;LIMIT_MAKER/TAKE_PROFIT/TAKE_PROFIT_LIMIT&#x60; order and the other must be
     * &#x60;STOP_LOSS&#x60; or &#x60;STOP_LOSS_LIMIT&#x60; order. - Price restrictions - If the OCO
     * is on the &#x60;SELL&#x60; side: - &#x60;LIMIT_MAKER/TAKE_PROFIT_LIMIT&#x60;
     * &#x60;price&#x60; &gt; Last Traded Price &gt; &#x60;STOP_LOSS/STOP_LOSS_LIMIT&#x60;
     * &#x60;stopPrice&#x60; - &#x60;TAKE_PROFIT stopPrice&#x60; &gt; Last Traded Price &gt;
     * &#x60;STOP_LOSS/STOP_LOSS_LIMIT stopPrice&#x60; - If the OCO is on the &#x60;BUY&#x60; side:
     * - &#x60;LIMIT_MAKER/TAKE_PROFIT_LIMIT price&#x60; &lt; Last Traded Price &lt;
     * &#x60;stopPrice&#x60; - &#x60;TAKE_PROFIT stopPrice&#x60; &lt; Last Traded Price &lt;
     * &#x60;STOP_LOSS/STOP_LOSS_LIMIT stopPrice&#x60; * OCOs add **2 orders** to the
     * &#x60;EXCHANGE_MAX_ORDERS&#x60; filter and the &#x60;MAX_NUM_ORDERS&#x60; filter. - OCOs add
     * 2 orders to the &#x60;EXCHANGE_MAX_ORDERS&#x60; filter and the &#x60;MAX_NUM_ORDERS&#x60;
     * filter. Weight(IP): 1 Unfilled Order Count: 2 Security Type: TRADE Notes: **Data Source:**
     * Matching Engine
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/trade#order-list-oco">New
     *     Order list - OCO (TRADE) Documentation</a>
     */
    public ApiResponse<OrderListOcoResponse> orderListOco(OrderListOcoRequest orderListOcoRequest)
            throws ApiException {
        return tradeApi.orderListOco(orderListOcoRequest);
    }

    /**
     * New Order List - OPO (TRADE) Place an [OPO](/products/spot/faqs/opo). - OPOs add 2 orders to
     * the &#x60;EXCHANGE_MAX_NUM_ORDERS&#x60;&#x60; filter and &#x60;MAX_NUM_ORDERS&#x60;&#x60;
     * filter. Weight(IP): 1 Unfilled Order Count: 2 Security Type: TRADE Notes: **Data Source:**
     * Matching Engine
     *
     * @param orderListOpoRequest (required)
     * @return ApiResponse&lt;OrderListOpoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> New Order List - OPO </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/trade#order-list-opo">New
     *     Order List - OPO (TRADE) Documentation</a>
     */
    public ApiResponse<OrderListOpoResponse> orderListOpo(OrderListOpoRequest orderListOpoRequest)
            throws ApiException {
        return tradeApi.orderListOpo(orderListOpoRequest);
    }

    /**
     * New Order List - OPOCO (TRADE) Place an [OPOCO](/products/spot/faqs/opo). Weight(IP): 1
     * Unfilled Order Count: 3 Security Type: TRADE Notes: **Data Source:** Matching Engine
     *
     * @param orderListOpocoRequest (required)
     * @return ApiResponse&lt;OrderListOpocoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> New Order List - OPOCO </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/trade#order-list-opoco">New
     *     Order List - OPOCO (TRADE) Documentation</a>
     */
    public ApiResponse<OrderListOpocoResponse> orderListOpoco(
            OrderListOpocoRequest orderListOpocoRequest) throws ApiException {
        return tradeApi.orderListOpoco(orderListOpocoRequest);
    }

    /**
     * New Order list - OTO (TRADE) Place an OTO. - An OTO (One-Triggers-the-Other) is an order list
     * comprised of 2 orders. - The first order is called the **working order** and must be
     * &#x60;LIMIT&#x60; or &#x60;LIMIT_MAKER&#x60;. Initially, only the working order goes on the
     * order book. - The second order is called the **pending order**. It can be any order type
     * except for &#x60;MARKET&#x60; orders using parameter &#x60;quoteOrderQty&#x60;. The pending
     * order is only placed on the order book when the working order gets **fully filled**. - If
     * either the working order or the pending order is cancelled individually, the other order in
     * the order list will also be canceled or expired. - When the order list is placed, if the
     * working order gets **immediately fully filled**, the placement response will show the working
     * order as &#x60;FILLED&#x60; but the pending order will still appear as
     * &#x60;PENDING_NEW&#x60;. You need to query the status of the pending order again to see its
     * updated status. - OTOs add **2 orders** to the &#x60;EXCHANGE_MAX_NUM_ORDERS&#x60; filter and
     * &#x60;MAX_NUM_ORDERS&#x60; filter. Weight(IP): 1 Unfilled Order Count: 2 Security Type: TRADE
     * Notes: **Data Source:** Matching Engine **Mandatory parameters based on
     * &#x60;pendingType&#x60; or &#x60;workingType&#x60;** Depending on the &#x60;pendingType&#x60;
     * or &#x60;workingType&#x60;, some optional parameters will become mandatory. |Type |Additional
     * mandatory parameters|Additional information| |---- |---- |------ |&#x60;workingType&#x60;
     * &#x3D; &#x60;LIMIT&#x60; |&#x60;workingTimeInForce&#x60; | |&#x60;pendingType&#x60; &#x3D;
     * &#x60;LIMIT&#x60; |&#x60;pendingPrice&#x60;, &#x60;pendingTimeInForce&#x60; |
     * |&#x60;pendingType&#x60; &#x3D; &#x60;STOP_LOSS&#x60; or &#x60;TAKE_PROFIT&#x60;
     * |&#x60;pendingStopPrice&#x60; and/or &#x60;pendingTrailingDelta&#x60;|
     * |&#x60;pendingType&#x60; &#x3D; &#x60;STOP_LOSS_LIMIT&#x60; or
     * &#x60;TAKE_PROFIT_LIMIT&#x60;|&#x60;pendingPrice&#x60;, &#x60;pendingStopPrice&#x60; and/or
     * &#x60;pendingTrailingDelta&#x60;, &#x60;pendingTimeInForce&#x60;|
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/trade#order-list-oto">New
     *     Order list - OTO (TRADE) Documentation</a>
     */
    public ApiResponse<OrderListOtoResponse> orderListOto(OrderListOtoRequest orderListOtoRequest)
            throws ApiException {
        return tradeApi.orderListOto(orderListOtoRequest);
    }

    /**
     * New Order list - OTOCO (TRADE) Place an OTOCO. - An OTOCO
     * (One-Triggers-One-Cancels-the-Other) is an order list comprised of 3 orders. - The first
     * order is called the **working order** and must be &#x60;LIMIT&#x60; or
     * &#x60;LIMIT_MAKER&#x60;. Initially, only the working order goes on the order book. - The
     * behavior of the working order is the same as the [OTO](#order-list-oto). - OTOCO has 2
     * pending orders (pending above and pending below), forming an OCO pair. The pending orders are
     * only placed on the order book when the working order gets **fully filled**. - The rules of
     * the pending above and pending below follow the same rules as the [Order list
     * OCO](#order-list-oco). - OTOCOs add **3 orders** to the &#x60;EXCHANGE_MAX_NUM_ORDERS&#x60;
     * filter and &#x60;MAX_NUM_ORDERS&#x60; filter. Weight(IP): 1 Unfilled Order Count: 3 Security
     * Type: TRADE Notes: **Data Source:** Matching Engine **Mandatory parameters based on
     * &#x60;pendingAboveType&#x60;, &#x60;pendingBelowType&#x60; or &#x60;workingType&#x60;**
     * Depending on the &#x60;pendingAboveType&#x60;/&#x60;pendingBelowType&#x60; or
     * &#x60;workingType&#x60;, some optional parameters will become mandatory. |Type |Additional
     * mandatory parameters|Additional information| |---- |---- |------ |&#x60;workingType&#x60;
     * &#x3D; &#x60;LIMIT&#x60; |&#x60;workingTimeInForce&#x60; |
     * |&#x60;pendingAboveType&#x60;&#x3D; &#x60;LIMIT_MAKER&#x60; |&#x60;pendingAbovePrice&#x60; |
     * |&#x60;pendingAboveType&#x60; &#x3D; &#x60;STOP_LOSS/TAKE_PROFIT&#x60;
     * |&#x60;pendingAboveStopPrice&#x60; and/or &#x60;pendingAboveTrailingDelta&#x60;|
     * |&#x60;pendingAboveType&#x3D;STOP_LOSS_LIMIT/TAKE_PROFIT_LIMIT&#x60;
     * |&#x60;pendingAbovePrice&#x60;, &#x60;pendingAboveStopPrice&#x60; and/or
     * &#x60;pendingAboveTrailingDelta&#x60;, &#x60;pendingAboveTimeInForce&#x60;|
     * |&#x60;pendingBelowType&#x60;&#x3D; &#x60;LIMIT_MAKER&#x60; |&#x60;pendingBelowPrice&#x60; |
     * |&#x60;pendingBelowType&#x3D; STOP_LOSS/TAKE_PROFIT&#x60; |&#x60;pendingBelowStopPrice&#x60;
     * and/or &#x60;pendingBelowTrailingDelta&#x60;|
     * |&#x60;pendingBelowType&#x3D;STOP_LOSS_LIMIT/TAKE_PROFIT_LIMIT&#x60;
     * |&#x60;pendingBelowPrice&#x60;, &#x60;pendingBelowStopPrice&#x60; and/or
     * &#x60;pendingBelowTrailingDelta&#x60;, &#x60;pendingBelowTimeInForce&#x60;|
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/trade#order-list-otoco">New
     *     Order list - OTOCO (TRADE) Documentation</a>
     */
    public ApiResponse<OrderListOtocoResponse> orderListOtoco(
            OrderListOtocoRequest orderListOtocoRequest) throws ApiException {
        return tradeApi.orderListOtoco(orderListOtocoRequest);
    }

    /**
     * New OCO - Deprecated (TRADE) Send in a new OCO. - Price Restrictions: - &#x60;SELL&#x60;:
     * Limit Price &gt; Last Price &gt; Stop Price - &#x60;BUY&#x60;: Limit Price &lt; Last Price
     * &lt; Stop Price - Quantity Restrictions: - Both legs must have the same quantity. -
     * &#x60;ICEBERG&#x60; quantities however do not have to be the same - &#x60;OCO&#x60; adds **2
     * orders** to the &#x60;EXCHANGE_MAX_ORDERS&#x60; filter and the &#x60;MAX_NUM_ORDERS&#x60;
     * filter. Weight(IP): 1 Unfilled Order Count: 2 Security Type: TRADE Notes: **Data Source:**
     * Matching Engine
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
     * @deprecated
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/trade#order-oco">New
     *     OCO - Deprecated (TRADE) Documentation</a>
     */
    public ApiResponse<OrderOcoResponse> orderOco(OrderOcoRequest orderOcoRequest)
            throws ApiException {
        return tradeApi.orderOco(orderOcoRequest);
    }

    /**
     * Test new order (TRADE) Test new order creation and signature/recvWindow long. Creates and
     * validates a new order but does not send it into the matching engine. Weight:
     * |Condition|Weight| |---|---| |Without &#x60;computeCommissionRates&#x60;|1| |With
     * &#x60;computeCommissionRates&#x60;|20| Security Type: TRADE Notes: **Data Source:** Memory
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/trade#order-test">Test
     *     new order (TRADE) Documentation</a>
     */
    public ApiResponse<OrderTestResponse> orderTest(OrderTestRequest orderTestRequest)
            throws ApiException {
        return tradeApi.orderTest(orderTestRequest);
    }

    /**
     * New order using SOR (TRADE) Places an order using smart order routing (SOR). This adds 1
     * order to the &#x60;EXCHANGE_MAX_ORDERS&#x60; filter and the &#x60;MAX_NUM_ORDERS&#x60;
     * filter. Read [SOR FAQ](/products/spot/faqs/sor_faq) to learn more. Weight(IP): 1 Unfilled
     * Order Count: 1 Security Type: TRADE Notes: **Data Source:** Matching Engine **Note:**
     * &#x60;POST /api/v3/sor/order&#x60; only supports &#x60;LIMIT&#x60; and &#x60;MARKET&#x60;
     * orders. &#x60;quoteOrderQty&#x60; is not supported.
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/trade#sor-order">New
     *     order using SOR (TRADE) Documentation</a>
     */
    public ApiResponse<SorOrderResponse> sorOrder(SorOrderRequest sorOrderRequest)
            throws ApiException {
        return tradeApi.sorOrder(sorOrderRequest);
    }

    /**
     * Test new order using SOR (TRADE) Test new order creation and signature/recvWindow using smart
     * order routing (SOR). Creates and validates a new order but does not send it into the matching
     * engine. Weight: |Condition|Weight| |---|---| |Without &#x60;computeCommissionRates&#x60;|1|
     * |With &#x60;computeCommissionRates&#x60;|20| Security Type: TRADE Notes: **Data Source:**
     * Memory
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-spot-trading/api/rest-api/trade#sor-order-test">Test
     *     new order using SOR (TRADE) Documentation</a>
     */
    public ApiResponse<SorOrderTestResponse> sorOrderTest(SorOrderTestRequest sorOrderTestRequest)
            throws ApiException {
        return tradeApi.sorOrderTest(sorOrderTestRequest);
    }
}
