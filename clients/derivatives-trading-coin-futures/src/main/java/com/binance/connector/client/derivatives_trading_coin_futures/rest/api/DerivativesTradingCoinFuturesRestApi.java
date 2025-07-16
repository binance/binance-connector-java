package com.binance.connector.client.derivatives_trading_coin_futures.rest.api;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.DerivativesTradingCoinFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.AccountInformationResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.AccountTradeListResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.AllOrdersResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.AutoCancelAllOpenOrdersRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.AutoCloseType;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.BasisResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.CancelAllOpenOrdersResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.CancelMultipleOrdersResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.CancelOrderResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.ChangeInitialLeverageRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.ChangeInitialLeverageResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.ChangeMarginTypeRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.ChangeMarginTypeResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.ChangePositionModeRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.ChangePositionModeResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.CheckServerTimeResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.ClassicPortfolioMarginAccountInformationResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.CompressedAggregateTradesListResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.ContinuousContractKlineCandlestickDataResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.ContractType;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.CurrentAllOpenOrdersResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.ExchangeInformationResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.FuturesAccountBalanceResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.GetCurrentPositionModeResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.GetDownloadIdForFuturesOrderHistoryResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.GetDownloadIdForFuturesTradeHistoryResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.GetDownloadIdForFuturesTransactionHistoryResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.GetFundingRateHistoryOfPerpetualFuturesResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.GetFundingRateInfoResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.GetFuturesOrderHistoryDownloadLinkByIdResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.GetFuturesTradeDownloadLinkByIdResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.GetFuturesTransactionHistoryDownloadLinkByIdResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.GetIncomeHistoryResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.GetOrderModifyHistoryResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.GetPositionMarginChangeHistoryResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.IndexPriceAndMarkPriceResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.IndexPriceKlineCandlestickDataResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.Interval;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.KlineCandlestickDataResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.LongShortRatioResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.MarkPriceKlineCandlestickDataResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.ModifyIsolatedPositionMarginRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.ModifyIsolatedPositionMarginResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.ModifyMultipleOrdersRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.ModifyMultipleOrdersResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.ModifyOrderRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.ModifyOrderResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.NewOrderRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.NewOrderResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.NotionalBracketForPairResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.NotionalBracketForSymbolResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.OldTradesLookupResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.OpenInterestResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.OpenInterestStatisticsResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.OrderBookResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.OrderIdList;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.OrigClientOrderIdList;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.Period;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.PositionAdlQuantileEstimationResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.PositionInformationResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.PremiumIndexKlineDataResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.QueryCurrentOpenOrderResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.QueryIndexPriceConstituentsResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.QueryOrderResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.RecentTradesListResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.StartUserDataStreamResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.SymbolOrderBookTickerResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.SymbolPriceTickerResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.TakerBuySellVolumeResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.Ticker24hrPriceChangeStatisticsResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.TopTraderLongShortRatioAccountsResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.TopTraderLongShortRatioPositionsResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.Type;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.UserCommissionRateResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.UsersForceOrdersResponse;

public class DerivativesTradingCoinFuturesRestApi {

    private final AccountApi accountApi;
    private final MarketDataApi marketDataApi;
    private final PortfolioMarginEndpointsApi portfolioMarginEndpointsApi;
    private final TradeApi tradeApi;
    private final UserDataStreamsApi userDataStreamsApi;

    public DerivativesTradingCoinFuturesRestApi(ClientConfiguration configuration) {
        this(DerivativesTradingCoinFuturesRestApiUtil.getDefaultClient(configuration));
    }

    public DerivativesTradingCoinFuturesRestApi(ApiClient apiClient) {
        this.accountApi = new AccountApi(apiClient);
        this.marketDataApi = new MarketDataApi(apiClient);
        this.portfolioMarginEndpointsApi = new PortfolioMarginEndpointsApi(apiClient);
        this.tradeApi = new TradeApi(apiClient);
        this.userDataStreamsApi = new UserDataStreamsApi(apiClient);
    }

    /**
     * Account Information (USER_DATA) Get current account information. * for One-way Mode user, the
     * \&quot;positions\&quot; will only show the \&quot;BOTH\&quot; positions * for Hedge Mode
     * user, the \&quot;positions\&quot; will show \&quot;BOTH\&quot;, \&quot;LONG\&quot;, and
     * \&quot;SHORT\&quot; positions. Weight: 5
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;AccountInformationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Account Information </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/account/rest-api/Account-Information">Account
     *     Information (USER_DATA) Documentation</a>
     */
    public ApiResponse<AccountInformationResponse> accountInformation(Long recvWindow)
            throws ApiException {
        return accountApi.accountInformation(recvWindow);
    }

    /**
     * Futures Account Balance (USER_DATA) Check futures account balance Weight: 1
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;FuturesAccountBalanceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Futures Account Balance </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/account/rest-api/Futures-Account-Balance">Futures
     *     Account Balance (USER_DATA) Documentation</a>
     */
    public ApiResponse<FuturesAccountBalanceResponse> futuresAccountBalance(Long recvWindow)
            throws ApiException {
        return accountApi.futuresAccountBalance(recvWindow);
    }

    /**
     * Get Current Position Mode(USER_DATA) Get user&#39;s position mode (Hedge Mode or One-way Mode
     * ) on ***EVERY symbol*** Weight: 30
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetCurrentPositionModeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Current Position Mode </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/account/rest-api/Get-Current-Position-Mode">Get
     *     Current Position Mode(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetCurrentPositionModeResponse> getCurrentPositionMode(Long recvWindow)
            throws ApiException {
        return accountApi.getCurrentPositionMode(recvWindow);
    }

    /**
     * Get Download Id For Futures Order History (USER_DATA) Get Download Id For Futures Order
     * History * Request Limitation is 10 times per month, shared by front end download page and
     * rest api * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; can not be longer
     * than 1 year Weight: 5
     *
     * @param startTime Timestamp in ms (required)
     * @param endTime Timestamp in ms (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetDownloadIdForFuturesOrderHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Download Id For Futures Order History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/account/rest-api/Get-Download-Id-For-Futures-Order-History">Get
     *     Download Id For Futures Order History (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetDownloadIdForFuturesOrderHistoryResponse>
            getDownloadIdForFuturesOrderHistory(Long startTime, Long endTime, Long recvWindow)
                    throws ApiException {
        return accountApi.getDownloadIdForFuturesOrderHistory(startTime, endTime, recvWindow);
    }

    /**
     * Get Download Id For Futures Trade History (USER_DATA) Get download id for futures trade
     * history * Request Limitation is 5 times per month, shared by front end download page and rest
     * api * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; can not be longer than 1
     * year Weight: 5
     *
     * @param startTime Timestamp in ms (required)
     * @param endTime Timestamp in ms (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetDownloadIdForFuturesTradeHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Download Id For Futures Trade History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/account/rest-api/Get-Download-Id-For-Futures-Trade-History">Get
     *     Download Id For Futures Trade History (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetDownloadIdForFuturesTradeHistoryResponse>
            getDownloadIdForFuturesTradeHistory(Long startTime, Long endTime, Long recvWindow)
                    throws ApiException {
        return accountApi.getDownloadIdForFuturesTradeHistory(startTime, endTime, recvWindow);
    }

    /**
     * Get Download Id For Futures Transaction History(USER_DATA) Get download id for futures
     * transaction history * Request Limitation is 5 times per month, shared by front end download
     * page and rest api * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; can not be
     * longer than 1 year Weight: 5
     *
     * @param startTime Timestamp in ms (required)
     * @param endTime Timestamp in ms (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetDownloadIdForFuturesTransactionHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Download Id For Futures Transaction History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/account/rest-api/Get-Download-Id-For-Futures-Transaction-History">Get
     *     Download Id For Futures Transaction History(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetDownloadIdForFuturesTransactionHistoryResponse>
            getDownloadIdForFuturesTransactionHistory(Long startTime, Long endTime, Long recvWindow)
                    throws ApiException {
        return accountApi.getDownloadIdForFuturesTransactionHistory(startTime, endTime, recvWindow);
    }

    /**
     * Get Futures Order History Download Link by Id (USER_DATA) Get futures order history download
     * link by Id * Download link expiration: 24h Weight: 5
     *
     * @param downloadId get by download id api (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetFuturesOrderHistoryDownloadLinkByIdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Futures Order History Download Link by Id </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/account/rest-api/Get-Futures-Order-History-Download-Link-by-Id">Get
     *     Futures Order History Download Link by Id (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetFuturesOrderHistoryDownloadLinkByIdResponse>
            getFuturesOrderHistoryDownloadLinkById(String downloadId, Long recvWindow)
                    throws ApiException {
        return accountApi.getFuturesOrderHistoryDownloadLinkById(downloadId, recvWindow);
    }

    /**
     * Get Futures Trade Download Link by Id(USER_DATA) Get futures trade download link by Id *
     * Download link expiration: 24h Weight: 5
     *
     * @param downloadId get by download id api (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetFuturesTradeDownloadLinkByIdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Futures Trade Download Link by Id </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/account/rest-api/Get-Futures-Trade-Download-Link-by-Id">Get
     *     Futures Trade Download Link by Id(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetFuturesTradeDownloadLinkByIdResponse> getFuturesTradeDownloadLinkById(
            String downloadId, Long recvWindow) throws ApiException {
        return accountApi.getFuturesTradeDownloadLinkById(downloadId, recvWindow);
    }

    /**
     * Get Futures Transaction History Download Link by Id (USER_DATA) Get futures transaction
     * history download link by Id * Download link expiration: 24h Weight: 5
     *
     * @param downloadId get by download id api (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetFuturesTransactionHistoryDownloadLinkByIdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Futures Transaction History Download Link by Id </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/account/rest-api/Get-Futures-Transaction-History-Download-Link-by-Id">Get
     *     Futures Transaction History Download Link by Id (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetFuturesTransactionHistoryDownloadLinkByIdResponse>
            getFuturesTransactionHistoryDownloadLinkById(String downloadId, Long recvWindow)
                    throws ApiException {
        return accountApi.getFuturesTransactionHistoryDownloadLinkById(downloadId, recvWindow);
    }

    /**
     * Get Income History(USER_DATA) Get income history * If &#x60;incomeType &#x60; is not sent,
     * all kinds of flow will be returned * \&quot;trandId\&quot; is unique in the same
     * \&quot;incomeType\&quot; for a user * The time between &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; can not be longer than 1 year Weight: 20
     *
     * @param symbol (optional)
     * @param incomeType \&quot;TRANSFER\&quot;,\&quot;WELCOME_BONUS\&quot;,
     *     \&quot;FUNDING_FEE\&quot;, \&quot;REALIZED_PNL\&quot;, \&quot;COMMISSION\&quot;,
     *     \&quot;INSURANCE_CLEAR\&quot;, and \&quot;DELIVERED_SETTELMENT\&quot; (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param page (optional)
     * @param limit Default 100; max 1000 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetIncomeHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Income History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/account/rest-api/Get-Income-History">Get
     *     Income History(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetIncomeHistoryResponse> getIncomeHistory(
            String symbol,
            String incomeType,
            Long startTime,
            Long endTime,
            Long page,
            Long limit,
            Long recvWindow)
            throws ApiException {
        return accountApi.getIncomeHistory(
                symbol, incomeType, startTime, endTime, page, limit, recvWindow);
    }

    /**
     * Notional Bracket for Pair(USER_DATA) **Not recommended to continue using this v1 endpoint**
     * Get the pair&#39;s default notional bracket list, may return ambiguous values when there have
     * been multiple different &#x60;symbol&#x60; brackets under the &#x60;pair&#x60;, suggest using
     * the following &#x60;GET /dapi/v2/leverageBracket&#x60; query instead to get the specific
     * &#x60;symbol&#x60; notional bracket list. Weight: 1
     *
     * @param pair (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;NotionalBracketForPairResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Notional Bracket for Pair </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/account/rest-api/Notional-Bracket-for-Pair">Notional
     *     Bracket for Pair(USER_DATA) Documentation</a>
     */
    public ApiResponse<NotionalBracketForPairResponse> notionalBracketForPair(
            String pair, Long recvWindow) throws ApiException {
        return accountApi.notionalBracketForPair(pair, recvWindow);
    }

    /**
     * Notional Bracket for Symbol(USER_DATA) Get the symbol&#39;s notional bracket list. Weight: 1
     *
     * @param symbol (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;NotionalBracketForSymbolResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Notional Bracket for Symbol </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/account/rest-api/Notional-Bracket-for-Symbol">Notional
     *     Bracket for Symbol(USER_DATA) Documentation</a>
     */
    public ApiResponse<NotionalBracketForSymbolResponse> notionalBracketForSymbol(
            String symbol, Long recvWindow) throws ApiException {
        return accountApi.notionalBracketForSymbol(symbol, recvWindow);
    }

    /**
     * User Commission Rate (USER_DATA) Query user commission rate Weight: 20
     *
     * @param symbol (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;UserCommissionRateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User Commission Rate </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/account/rest-api/User-Commission-Rate">User
     *     Commission Rate (USER_DATA) Documentation</a>
     */
    public ApiResponse<UserCommissionRateResponse> userCommissionRate(
            String symbol, Long recvWindow) throws ApiException {
        return accountApi.userCommissionRate(symbol, recvWindow);
    }

    /**
     * Basis Query basis * If startTime and endTime are not sent, the most recent data is returned.
     * * Only the data of the latest 30 days is available. Weight: 1
     *
     * @param pair BTCUSD (required)
     * @param contractType ALL, CURRENT_QUARTER, NEXT_QUARTER, PERPETUAL (required)
     * @param period
     *     \&quot;5m\&quot;,\&quot;15m\&quot;,\&quot;30m\&quot;,\&quot;1h\&quot;,\&quot;2h\&quot;,\&quot;4h\&quot;,\&quot;6h\&quot;,\&quot;12h\&quot;,\&quot;1d\&quot;
     *     (required)
     * @param limit Default 100; max 1000 (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @return ApiResponse&lt;BasisResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Basis </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/market-data/rest-api/Basis">Basis
     *     Documentation</a>
     */
    public ApiResponse<BasisResponse> basis(
            String pair,
            ContractType contractType,
            Period period,
            Long limit,
            Long startTime,
            Long endTime)
            throws ApiException {
        return marketDataApi.basis(pair, contractType, period, limit, startTime, endTime);
    }

    /**
     * Check Server time Test connectivity to the Rest API and get the current server time. Weight:
     * 1
     *
     * @return ApiResponse&lt;CheckServerTimeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Check Server time </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/market-data/rest-api/Check-Server-time">Check
     *     Server time Documentation</a>
     */
    public ApiResponse<CheckServerTimeResponse> checkServerTime() throws ApiException {
        return marketDataApi.checkServerTime();
    }

    /**
     * Compressed/Aggregate Trades List Get compressed, aggregate trades. Market trades that fill in
     * 100ms with the same price and the same taking side will have the quantity aggregated. *
     * support querying futures trade histories that are not older than one year * If both
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are sent, time between &#x60;startTime&#x60;
     * and &#x60;endTime&#x60; must be less than 1 hour. * If &#x60;fromId&#x60;,
     * &#x60;startTime&#x60;, and &#x60;endTime&#x60; are not sent, the most recent aggregate trades
     * will be returned. * Only market trades will be aggregated and returned, which means the
     * insurance fund trades and ADL trades won&#39;t be aggregated. * Sending both
     * &#x60;startTime&#x60;/&#x60;endTime&#x60; and &#x60;fromId&#x60; might cause response
     * timeout, please send either &#x60;fromId&#x60; or &#x60;startTime&#x60;/&#x60;endTime&#x60;
     * Weight: 20
     *
     * @param symbol (required)
     * @param fromId ID to get aggregate trades from INCLUSIVE. (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit Default 100; max 1000 (optional)
     * @return ApiResponse&lt;CompressedAggregateTradesListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Compressed/Aggregate Trades List </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/market-data/rest-api/Compressed-Aggregate-Trades-List">Compressed/Aggregate
     *     Trades List Documentation</a>
     */
    public ApiResponse<CompressedAggregateTradesListResponse> compressedAggregateTradesList(
            String symbol, Long fromId, Long startTime, Long endTime, Long limit)
            throws ApiException {
        return marketDataApi.compressedAggregateTradesList(
                symbol, fromId, startTime, endTime, limit);
    }

    /**
     * Continuous Contract Kline/Candlestick Data Kline/candlestick bars for a specific contract
     * type. Klines are uniquely identified by their open time. * Contract type: * PERPETUAL *
     * CURRENT_QUARTER * NEXT_QUARTER 1000 | 10 * The difference between &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; can only be up to 200 days * Between &#x60;startTime&#x60; and
     * &#x60;endTime&#x60;, the most recent &#x60;limit&#x60; data from &#x60;endTime&#x60; will be
     * returned: * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, current timestamp
     * will be set as &#x60;endTime&#x60;, and the most recent data will be returned. * If
     * &#x60;startTime&#x60; is sent only, the timestamp of 200 days after &#x60;startTime&#x60;
     * will be set as &#x60;endTime&#x60;(up to the current time) * If &#x60;endTime&#x60; is sent
     * only, the timestamp of 200 days before &#x60;endTime&#x60; will be set as
     * &#x60;startTime&#x60; Weight: based on parameter LIMIT LIMIT | weight ---|--- [1,100) | 1
     * [100, 500) | 2 [500, 1000] | 5 &gt; 1000 | 10
     *
     * @param pair BTCUSD (required)
     * @param contractType ALL, CURRENT_QUARTER, NEXT_QUARTER, PERPETUAL (required)
     * @param interval (required)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit Default 100; max 1000 (optional)
     * @return ApiResponse&lt;ContinuousContractKlineCandlestickDataResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Continuous Contract Kline/Candlestick Data </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/market-data/rest-api/Continuous-Contract-Kline-Candlestick-Data">Continuous
     *     Contract Kline/Candlestick Data Documentation</a>
     */
    public ApiResponse<ContinuousContractKlineCandlestickDataResponse>
            continuousContractKlineCandlestickData(
                    String pair,
                    ContractType contractType,
                    Interval interval,
                    Long startTime,
                    Long endTime,
                    Long limit)
                    throws ApiException {
        return marketDataApi.continuousContractKlineCandlestickData(
                pair, contractType, interval, startTime, endTime, limit);
    }

    /**
     * Exchange Information Current exchange trading rules and symbol information Weight: 1
     *
     * @return ApiResponse&lt;ExchangeInformationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Exchange Information </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/market-data/rest-api/Exchange-Information">Exchange
     *     Information Documentation</a>
     */
    public ApiResponse<ExchangeInformationResponse> exchangeInformation() throws ApiException {
        return marketDataApi.exchangeInformation();
    }

    /**
     * Get Funding Rate History of Perpetual Futures Get Funding Rate History of Perpetual Futures *
     * empty array will be returned for delivery symbols. Weight: 1
     *
     * @param symbol (required)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit Default 100; max 1000 (optional)
     * @return ApiResponse&lt;GetFundingRateHistoryOfPerpetualFuturesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Funding Rate History of Perpetual Futures </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/market-data/rest-api/Get-Funding-Rate-History-of-Perpetual-Futures">Get
     *     Funding Rate History of Perpetual Futures Documentation</a>
     */
    public ApiResponse<GetFundingRateHistoryOfPerpetualFuturesResponse>
            getFundingRateHistoryOfPerpetualFutures(
                    String symbol, Long startTime, Long endTime, Long limit) throws ApiException {
        return marketDataApi.getFundingRateHistoryOfPerpetualFutures(
                symbol, startTime, endTime, limit);
    }

    /**
     * Get Funding Rate Info Query funding rate info for symbols that had FundingRateCap/
     * FundingRateFloor / fundingIntervalHours adjustment Weight: 0
     *
     * @return ApiResponse&lt;GetFundingRateInfoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Funding Rate Info </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/market-data/rest-api/Get-Funding-Info">Get
     *     Funding Rate Info Documentation</a>
     */
    public ApiResponse<GetFundingRateInfoResponse> getFundingRateInfo() throws ApiException {
        return marketDataApi.getFundingRateInfo();
    }

    /**
     * Index Price and Mark Price Query index price and mark price Weight: 10
     *
     * @param symbol (optional)
     * @param pair (optional)
     * @return ApiResponse&lt;IndexPriceAndMarkPriceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Index Price and Mark Price </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/market-data/rest-api/Index-Price-and-Mark-Price">Index
     *     Price and Mark Price Documentation</a>
     */
    public ApiResponse<IndexPriceAndMarkPriceResponse> indexPriceAndMarkPrice(
            String symbol, String pair) throws ApiException {
        return marketDataApi.indexPriceAndMarkPrice(symbol, pair);
    }

    /**
     * Index Price Kline/Candlestick Data Kline/candlestick bars for the index price of a pair.
     * Klines are uniquely identified by their open time. 1000 | 10 * The difference between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; can only be up to 200 days * Between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60;, the most recent &#x60;limit&#x60; data from
     * &#x60;endTime&#x60; will be returned: * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are
     * not sent, current timestamp will be set as &#x60;endTime&#x60;, and the most recent data will
     * be returned. * If &#x60;startTime&#x60; is sent only, the timestamp of 200 days after
     * &#x60;startTime&#x60; will be set as &#x60;endTime&#x60;(up to the current time) * If
     * &#x60;endTime&#x60; is sent only, the timestamp of 200 days before &#x60;endTime&#x60; will
     * be set as &#x60;startTime&#x60; Weight: based on parameter LIMIT LIMIT | weight ---|---
     * [1,100) | 1 [100, 500) | 2 [500, 1000] | 5 &gt; 1000 | 10
     *
     * @param pair BTCUSD (required)
     * @param interval (required)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit Default 100; max 1000 (optional)
     * @return ApiResponse&lt;IndexPriceKlineCandlestickDataResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Index Price Kline/Candlestick Data </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/market-data/rest-api/Index-Price-Kline-Candlestick-Data">Index
     *     Price Kline/Candlestick Data Documentation</a>
     */
    public ApiResponse<IndexPriceKlineCandlestickDataResponse> indexPriceKlineCandlestickData(
            String pair, Interval interval, Long startTime, Long endTime, Long limit)
            throws ApiException {
        return marketDataApi.indexPriceKlineCandlestickData(
                pair, interval, startTime, endTime, limit);
    }

    /**
     * Kline/Candlestick Data Kline/candlestick bars for a symbol. Klines are uniquely identified by
     * their open time. 1000 | 10 * The difference between &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; can only be up to 200 days * Between &#x60;startTime&#x60; and
     * &#x60;endTime&#x60;, the most recent &#x60;limit&#x60; data from &#x60;endTime&#x60; will be
     * returned: * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, current timestamp
     * will be set as &#x60;endTime&#x60;, and the most recent data will be returned. * If
     * &#x60;startTime&#x60; is sent only, the timestamp of 200 days after &#x60;startTime&#x60;
     * will be set as &#x60;endTime&#x60;(up to the current time) * If &#x60;endTime&#x60; is sent
     * only, the timestamp of 200 days before &#x60;endTime&#x60; will be set as
     * &#x60;startTime&#x60; Weight: based on parameter LIMIT LIMIT | weight ---|--- [1,100) | 1
     * [100, 500) | 2 [500, 1000] | 5 &gt; 1000 | 10
     *
     * @param symbol (required)
     * @param interval (required)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit Default 100; max 1000 (optional)
     * @return ApiResponse&lt;KlineCandlestickDataResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Kline/Candlestick Data </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/market-data/rest-api/Kline-Candlestick-Data">Kline/Candlestick
     *     Data Documentation</a>
     */
    public ApiResponse<KlineCandlestickDataResponse> klineCandlestickData(
            String symbol, Interval interval, Long startTime, Long endTime, Long limit)
            throws ApiException {
        return marketDataApi.klineCandlestickData(symbol, interval, startTime, endTime, limit);
    }

    /**
     * Long/Short Ratio Query symbol Long/Short Ratio * If startTime and endTime are not sent, the
     * most recent data is returned. * Only the data of the latest 30 days is available. Weight: 1
     *
     * @param pair BTCUSD (required)
     * @param period
     *     \&quot;5m\&quot;,\&quot;15m\&quot;,\&quot;30m\&quot;,\&quot;1h\&quot;,\&quot;2h\&quot;,\&quot;4h\&quot;,\&quot;6h\&quot;,\&quot;12h\&quot;,\&quot;1d\&quot;
     *     (required)
     * @param limit Default 100; max 1000 (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @return ApiResponse&lt;LongShortRatioResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Long/Short Ratio </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/market-data/rest-api/Long-Short-Ratio">Long/Short
     *     Ratio Documentation</a>
     */
    public ApiResponse<LongShortRatioResponse> longShortRatio(
            String pair, Period period, Long limit, Long startTime, Long endTime)
            throws ApiException {
        return marketDataApi.longShortRatio(pair, period, limit, startTime, endTime);
    }

    /**
     * Mark Price Kline/Candlestick Data Kline/candlestick bars for the mark price of a symbol.
     * Klines are uniquely identified by their open time. 1000 | 10 * The difference between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; can only be up to 200 days * Between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60;, the most recent &#x60;limit&#x60; data from
     * &#x60;endTime&#x60; will be returned: * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are
     * not sent, current timestamp will be set as &#x60;endTime&#x60;, and the most recent data will
     * be returned. * If &#x60;startTime&#x60; is sent only, the timestamp of 200 days after
     * &#x60;startTime&#x60; will be set as &#x60;endTime&#x60;(up to the current time) * If
     * &#x60;endTime&#x60; is sent only, the timestamp of 200 days before &#x60;endTime&#x60; will
     * be set as &#x60;startTime&#x60; Weight: based on parameter LIMIT LIMIT | weight ---|---
     * [1,100) | 1 [100, 500) | 2 [500, 1000] | 5 &gt; 1000 | 10
     *
     * @param symbol (required)
     * @param interval (required)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit Default 100; max 1000 (optional)
     * @return ApiResponse&lt;MarkPriceKlineCandlestickDataResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Mark Price Kline/Candlestick Data </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/market-data/rest-api/Mark-Price-Kline-Candlestick-Data">Mark
     *     Price Kline/Candlestick Data Documentation</a>
     */
    public ApiResponse<MarkPriceKlineCandlestickDataResponse> markPriceKlineCandlestickData(
            String symbol, Interval interval, Long startTime, Long endTime, Long limit)
            throws ApiException {
        return marketDataApi.markPriceKlineCandlestickData(
                symbol, interval, startTime, endTime, limit);
    }

    /**
     * Old Trades Lookup(MARKET_DATA) Get older market historical trades. * Market trades means
     * trades filled in the order book. Only market trades will be returned, which means the
     * insurance fund trades and ADL trades won&#39;t be returned. Weight: 20
     *
     * @param symbol (required)
     * @param limit Default 100; max 1000 (optional)
     * @param fromId ID to get aggregate trades from INCLUSIVE. (optional)
     * @return ApiResponse&lt;OldTradesLookupResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Old Trades Lookup </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/market-data/rest-api/Old-Trades-Lookup">Old
     *     Trades Lookup(MARKET_DATA) Documentation</a>
     */
    public ApiResponse<OldTradesLookupResponse> oldTradesLookup(
            String symbol, Long limit, Long fromId) throws ApiException {
        return marketDataApi.oldTradesLookup(symbol, limit, fromId);
    }

    /**
     * Open Interest Get present open interest of a specific symbol. Weight: 1
     *
     * @param symbol (required)
     * @return ApiResponse&lt;OpenInterestResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Open Interest </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/market-data/rest-api/Open-Interest">Open
     *     Interest Documentation</a>
     */
    public ApiResponse<OpenInterestResponse> openInterest(String symbol) throws ApiException {
        return marketDataApi.openInterest(symbol);
    }

    /**
     * Open Interest Statistics Query open interest stats * If startTime and endTime are not sent,
     * the most recent data is returned. * Only the data of the latest 30 days is available. Weight:
     * 1
     *
     * @param pair BTCUSD (required)
     * @param contractType ALL, CURRENT_QUARTER, NEXT_QUARTER, PERPETUAL (required)
     * @param period
     *     \&quot;5m\&quot;,\&quot;15m\&quot;,\&quot;30m\&quot;,\&quot;1h\&quot;,\&quot;2h\&quot;,\&quot;4h\&quot;,\&quot;6h\&quot;,\&quot;12h\&quot;,\&quot;1d\&quot;
     *     (required)
     * @param limit Default 100; max 1000 (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @return ApiResponse&lt;OpenInterestStatisticsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Open Interest Statistics </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/market-data/rest-api/Open-Interest-Statistics">Open
     *     Interest Statistics Documentation</a>
     */
    public ApiResponse<OpenInterestStatisticsResponse> openInterestStatistics(
            String pair,
            ContractType contractType,
            Period period,
            Long limit,
            Long startTime,
            Long endTime)
            throws ApiException {
        return marketDataApi.openInterestStatistics(
                pair, contractType, period, limit, startTime, endTime);
    }

    /**
     * Order Book Query orderbook on specific symbol Weight: Adjusted based on the limit: Limit |
     * Weight ------------ | ------------ 5, 10, 20, 50 | 2 100 | 5 500 | 10 1000 | 20
     *
     * @param symbol (required)
     * @param limit Default 100; max 1000 (optional)
     * @return ApiResponse&lt;OrderBookResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Order Book </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/market-data/rest-api/Order-Book">Order
     *     Book Documentation</a>
     */
    public ApiResponse<OrderBookResponse> orderBook(String symbol, Long limit) throws ApiException {
        return marketDataApi.orderBook(symbol, limit);
    }

    /**
     * Premium index Kline Data Premium index kline bars of a symbol. Klines are uniquely identified
     * by their open time. * If startTime and endTime are not sent, the most recent klines are
     * returned. Weight: based on parameter LIMIT | LIMIT | weight | | ----------- | ------ | |
     * [1,100) | 1 | | [100, 500) | 2 | | [500, 1000] | 5 | | &gt; 1000 | 10 |
     *
     * @param symbol (required)
     * @param interval (required)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit Default 100; max 1000 (optional)
     * @return ApiResponse&lt;PremiumIndexKlineDataResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Premium index Kline Data </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/market-data/rest-api/Premium-index-Kline-Data">Premium
     *     index Kline Data Documentation</a>
     */
    public ApiResponse<PremiumIndexKlineDataResponse> premiumIndexKlineData(
            String symbol, Interval interval, Long startTime, Long endTime, Long limit)
            throws ApiException {
        return marketDataApi.premiumIndexKlineData(symbol, interval, startTime, endTime, limit);
    }

    /**
     * Query Index Price Constituents Query index price constituents Weight: 1
     *
     * @param symbol (required)
     * @return ApiResponse&lt;QueryIndexPriceConstituentsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Index Price Constituents </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/market-data/rest-api/Index-Constituents">Query
     *     Index Price Constituents Documentation</a>
     */
    public ApiResponse<QueryIndexPriceConstituentsResponse> queryIndexPriceConstituents(
            String symbol) throws ApiException {
        return marketDataApi.queryIndexPriceConstituents(symbol);
    }

    /**
     * Recent Trades List Get recent market trades * Market trades means trades filled in the order
     * book. Only market trades will be returned, which means the insurance fund trades and ADL
     * trades won&#39;t be returned. Weight: 5
     *
     * @param symbol (required)
     * @param limit Default 100; max 1000 (optional)
     * @return ApiResponse&lt;RecentTradesListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Recent Trades List </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/market-data/rest-api/Recent-Trades-List">Recent
     *     Trades List Documentation</a>
     */
    public ApiResponse<RecentTradesListResponse> recentTradesList(String symbol, Long limit)
            throws ApiException {
        return marketDataApi.recentTradesList(symbol, limit);
    }

    /**
     * Symbol Order Book Ticker Best price/qty on the order book for a symbol or symbols. * Symbol
     * and pair cannot be sent together * If a pair is sent,tickers for all symbols of the pair will
     * be returned * If either a pair or symbol is sent, tickers for all symbols of all pairs will
     * be returned Weight: 2 for a single symbol, 5 when the symbol parameter is omitted
     *
     * @param symbol (optional)
     * @param pair (optional)
     * @return ApiResponse&lt;SymbolOrderBookTickerResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Symbol Order Book Ticker </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/market-data/rest-api/Symbol-Order-Book-Ticker">Symbol
     *     Order Book Ticker Documentation</a>
     */
    public ApiResponse<SymbolOrderBookTickerResponse> symbolOrderBookTicker(
            String symbol, String pair) throws ApiException {
        return marketDataApi.symbolOrderBookTicker(symbol, pair);
    }

    /**
     * Symbol Price Ticker Latest price for a symbol or symbols. * Symbol and pair cannot be sent
     * together * If a pair is sent,tickers for all symbols of the pair will be returned * If either
     * a pair or symbol is sent, tickers for all symbols of all pairs will be returned Weight: 1 for
     * a single symbol, 2 when the symbol parameter is omitted
     *
     * @param symbol (optional)
     * @param pair (optional)
     * @return ApiResponse&lt;SymbolPriceTickerResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Symbol Price Ticker </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/market-data/rest-api/Symbol-Price-Ticker">Symbol
     *     Price Ticker Documentation</a>
     */
    public ApiResponse<SymbolPriceTickerResponse> symbolPriceTicker(String symbol, String pair)
            throws ApiException {
        return marketDataApi.symbolPriceTicker(symbol, pair);
    }

    /**
     * Taker Buy/Sell Volume Taker Buy Volume: the total volume of buy orders filled by takers
     * within the period. Taker Sell Volume: the total volume of sell orders filled by takers within
     * the period. * If startTime and endTime are not sent, the most recent data is returned. * Only
     * the data of the latest 30 days is available. Weight: 1
     *
     * @param pair BTCUSD (required)
     * @param contractType ALL, CURRENT_QUARTER, NEXT_QUARTER, PERPETUAL (required)
     * @param period
     *     \&quot;5m\&quot;,\&quot;15m\&quot;,\&quot;30m\&quot;,\&quot;1h\&quot;,\&quot;2h\&quot;,\&quot;4h\&quot;,\&quot;6h\&quot;,\&quot;12h\&quot;,\&quot;1d\&quot;
     *     (required)
     * @param limit Default 100; max 1000 (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @return ApiResponse&lt;TakerBuySellVolumeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Taker Buy/Sell Volume </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/market-data/rest-api/Taker-Buy-Sell-Volume">Taker
     *     Buy/Sell Volume Documentation</a>
     */
    public ApiResponse<TakerBuySellVolumeResponse> takerBuySellVolume(
            String pair,
            ContractType contractType,
            Period period,
            Long limit,
            Long startTime,
            Long endTime)
            throws ApiException {
        return marketDataApi.takerBuySellVolume(
                pair, contractType, period, limit, startTime, endTime);
    }

    /**
     * Test Connectivity Test connectivity to the Rest API. Weight: 1
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
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/market-data/rest-api/Test-Connectivity">Test
     *     Connectivity Documentation</a>
     */
    public void testConnectivity() throws ApiException {
        marketDataApi.testConnectivity();
    }

    /**
     * 24hr Ticker Price Change Statistics 24 hour rolling window price change statistics. * Symbol
     * and pair cannot be sent together * If a pair is sent,tickers for all symbols of the pair will
     * be returned * If either a pair or symbol is sent, tickers for all symbols of all pairs will
     * be returned Weight: 1 for a single symbol, 40 when the symbol parameter is omitted Careful
     * when accessing this with no symbol.
     *
     * @param symbol (optional)
     * @param pair (optional)
     * @return ApiResponse&lt;Ticker24hrPriceChangeStatisticsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> 24hr Ticker Price Change Statistics </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/market-data/rest-api/24hr-Ticker-Price-Change-Statistics">24hr
     *     Ticker Price Change Statistics Documentation</a>
     */
    public ApiResponse<Ticker24hrPriceChangeStatisticsResponse> ticker24hrPriceChangeStatistics(
            String symbol, String pair) throws ApiException {
        return marketDataApi.ticker24hrPriceChangeStatistics(symbol, pair);
    }

    /**
     * Top Trader Long/Short Ratio (Accounts) The proportion of net long and net short accounts to
     * total accounts of the top 20% users with the highest margin balance. Each account is counted
     * once only. Long Account % &#x3D; Accounts of top traders with net long positions / Total
     * accounts of top traders with open positions Short Account % &#x3D; Accounts of top traders
     * with net short positions / Total accounts of top traders with open positions Long/Short Ratio
     * (Accounts) &#x3D; Long Account % / Short Account % * If startTime and endTime are not sent,
     * the most recent data is returned. * Only the data of the latest 30 days is available. Weight:
     * 1
     *
     * @param symbol (required)
     * @param period
     *     \&quot;5m\&quot;,\&quot;15m\&quot;,\&quot;30m\&quot;,\&quot;1h\&quot;,\&quot;2h\&quot;,\&quot;4h\&quot;,\&quot;6h\&quot;,\&quot;12h\&quot;,\&quot;1d\&quot;
     *     (required)
     * @param limit Default 100; max 1000 (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @return ApiResponse&lt;TopTraderLongShortRatioAccountsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Top Trader Long/Short Ratio </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/market-data/rest-api/Top-Long-Short-Account-Ratio">Top
     *     Trader Long/Short Ratio (Accounts) Documentation</a>
     */
    public ApiResponse<TopTraderLongShortRatioAccountsResponse> topTraderLongShortRatioAccounts(
            String symbol, Period period, Long limit, Long startTime, Long endTime)
            throws ApiException {
        return marketDataApi.topTraderLongShortRatioAccounts(
                symbol, period, limit, startTime, endTime);
    }

    /**
     * Top Trader Long/Short Ratio (Positions) The proportion of net long and net short positions to
     * total open positions of the top 20% users with the highest margin balance. Long Position %
     * &#x3D; Long positions of top traders / Total open positions of top traders Short Position %
     * &#x3D; Short positions of top traders / Total open positions of top traders Long/Short Ratio
     * (Positions) &#x3D; Long Position % / Short Position % * If startTime and endTime are not
     * sent, the most recent data is returned. * Only the data of the latest 30 days is available.
     * Weight: 1
     *
     * @param pair BTCUSD (required)
     * @param period
     *     \&quot;5m\&quot;,\&quot;15m\&quot;,\&quot;30m\&quot;,\&quot;1h\&quot;,\&quot;2h\&quot;,\&quot;4h\&quot;,\&quot;6h\&quot;,\&quot;12h\&quot;,\&quot;1d\&quot;
     *     (required)
     * @param limit Default 100; max 1000 (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @return ApiResponse&lt;TopTraderLongShortRatioPositionsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Top Trader Long/Short Ratio </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/market-data/rest-api/Top-Trader-Long-Short-Ratio">Top
     *     Trader Long/Short Ratio (Positions) Documentation</a>
     */
    public ApiResponse<TopTraderLongShortRatioPositionsResponse> topTraderLongShortRatioPositions(
            String pair, Period period, Long limit, Long startTime, Long endTime)
            throws ApiException {
        return marketDataApi.topTraderLongShortRatioPositions(
                pair, period, limit, startTime, endTime);
    }

    /**
     * Classic Portfolio Margin Account Information (USER_DATA) Get Classic Portfolio Margin current
     * account information. * maxWithdrawAmount is for asset transfer out to the spot wallet.
     * Weight: 5
     *
     * @param asset (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;ClassicPortfolioMarginAccountInformationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Classic Portfolio Margin Account Information </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/portfolio-margin-endpoints/Classic-Portfolio-Margin-Account-Information">Classic
     *     Portfolio Margin Account Information (USER_DATA) Documentation</a>
     */
    public ApiResponse<ClassicPortfolioMarginAccountInformationResponse>
            classicPortfolioMarginAccountInformation(String asset, Long recvWindow)
                    throws ApiException {
        return portfolioMarginEndpointsApi.classicPortfolioMarginAccountInformation(
                asset, recvWindow);
    }

    /**
     * Account Trade List (USER_DATA) Get trades for a specific account and symbol. * Either symbol
     * or pair must be sent * Symbol and pair cannot be sent together * Pair and fromId cannot be
     * sent together * OrderId can only be sent together with symbol * If a pair is sent,tickers for
     * all symbols of the pair will be returned * The parameter &#x60;fromId&#x60; cannot be sent
     * with &#x60;startTime&#x60; or &#x60;endTime&#x60; * If startTime and endTime are both not
     * sent, then the last 7 days&#39; data will be returned. * The time between startTime and
     * endTime cannot be longer than 7 days. Weight: 20 with symbol，40 with pair
     *
     * @param symbol (optional)
     * @param pair (optional)
     * @param orderId (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param fromId ID to get aggregate trades from INCLUSIVE. (optional)
     * @param limit Default 100; max 1000 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;AccountTradeListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Account Trade List </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/trade/rest-api/Account-Trade-List">Account
     *     Trade List (USER_DATA) Documentation</a>
     */
    public ApiResponse<AccountTradeListResponse> accountTradeList(
            String symbol,
            String pair,
            Long orderId,
            Long startTime,
            Long endTime,
            Long fromId,
            Long limit,
            Long recvWindow)
            throws ApiException {
        return tradeApi.accountTradeList(
                symbol, pair, orderId, startTime, endTime, fromId, limit, recvWindow);
    }

    /**
     * All Orders (USER_DATA) Get all account orders; active, canceled, or filled. * These orders
     * will not be found: * order status is CANCELED or EXPIRED AND order has NO filled trade AND
     * created time + 3 days &lt; current time * order create time + 90 days &lt; current time *
     * Either &#x60;symbol&#x60; or &#x60;pair&#x60; must be sent. * &#x60;pair&#x60; can&#39;t be
     * sent with &#x60;orderId&#x60; * If &#x60;orderId&#x60; is set, it will get orders &gt;&#x3D;
     * that &#x60;orderId&#x60;. Otherwise most recent orders are returned. * If orderId is set, it
     * will get orders &gt;&#x3D; that orderId. Otherwise most recent orders are returned. * The
     * query time period must be less then 7 days( default as the recent 7 days). Weight: 20 with
     * symbol, 40 with pair
     *
     * @param symbol (optional)
     * @param pair (optional)
     * @param orderId (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit Default 100; max 1000 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;AllOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> All Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/trade/rest-api/All-Orders">All
     *     Orders (USER_DATA) Documentation</a>
     */
    public ApiResponse<AllOrdersResponse> allOrders(
            String symbol,
            String pair,
            Long orderId,
            Long startTime,
            Long endTime,
            Long limit,
            Long recvWindow)
            throws ApiException {
        return tradeApi.allOrders(symbol, pair, orderId, startTime, endTime, limit, recvWindow);
    }

    /**
     * Auto-Cancel All Open Orders (TRADE) Cancel all open orders of the specified symbol at the end
     * of the specified countdown. This rest endpoint means to ensure your open orders are canceled
     * in case of an outage. The endpoint should be called repeatedly as heartbeats so that the
     * existing countdown time can be canceled and repalced by a new one. The system will check all
     * countdowns **approximately every 10 milliseconds**, so please note that sufficient redundancy
     * should be considered when using this function. We do not recommend setting the countdown time
     * to be too precise or too small. * Example usage: Call this endpoint at 30s intervals with an
     * countdownTime of 120000 (120s). If this endpoint is not called within 120 seconds, all your
     * orders of the specified symbol will be automatically canceled. If this endpoint is called
     * with an countdownTime of 0, the countdown timer will be stopped. Weight: 10
     *
     * @param autoCancelAllOpenOrdersRequest (required)
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
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/trade/rest-api/Auto-Cancel-All-Open-Orders">Auto-Cancel
     *     All Open Orders (TRADE) Documentation</a>
     */
    public void autoCancelAllOpenOrders(
            AutoCancelAllOpenOrdersRequest autoCancelAllOpenOrdersRequest) throws ApiException {
        tradeApi.autoCancelAllOpenOrders(autoCancelAllOpenOrdersRequest);
    }

    /**
     * Cancel All Open Orders(TRADE) Cancel All Open Orders Weight: 1
     *
     * @param symbol (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;CancelAllOpenOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cancel All Open Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/trade/rest-api/Cancel-All-Open-Orders">Cancel
     *     All Open Orders(TRADE) Documentation</a>
     */
    public ApiResponse<CancelAllOpenOrdersResponse> cancelAllOpenOrders(
            String symbol, Long recvWindow) throws ApiException {
        return tradeApi.cancelAllOpenOrders(symbol, recvWindow);
    }

    /**
     * Cancel Multiple Orders(TRADE) Cancel Multiple Orders * Either &#x60;orderIdList&#x60; or
     * &#x60;origClientOrderIdList &#x60; must be sent. Weight: 1
     *
     * @param symbol (required)
     * @param orderIdList max length 10 &lt;br /&gt; e.g. [1234567,2345678] (optional)
     * @param origClientOrderIdList max length 10&lt;br /&gt; e.g.
     *     [\&quot;my_id_1\&quot;,\&quot;my_id_2\&quot;], encode the double quotes. No space after
     *     comma. (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;CancelMultipleOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cancel Multiple Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/trade/rest-api/Cancel-Multiple-Orders">Cancel
     *     Multiple Orders(TRADE) Documentation</a>
     */
    public ApiResponse<CancelMultipleOrdersResponse> cancelMultipleOrders(
            String symbol,
            OrderIdList orderIdList,
            OrigClientOrderIdList origClientOrderIdList,
            Long recvWindow)
            throws ApiException {
        return tradeApi.cancelMultipleOrders(
                symbol, orderIdList, origClientOrderIdList, recvWindow);
    }

    /**
     * Cancel Order (TRADE) Cancel an active order. * Either &#x60;orderId&#x60; or
     * &#x60;origClientOrderId&#x60; must be sent. Weight: 1
     *
     * @param symbol (required)
     * @param orderId (optional)
     * @param origClientOrderId (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;CancelOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cancel Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/trade/rest-api/Cancel-Order">Cancel
     *     Order (TRADE) Documentation</a>
     */
    public ApiResponse<CancelOrderResponse> cancelOrder(
            String symbol, Long orderId, String origClientOrderId, Long recvWindow)
            throws ApiException {
        return tradeApi.cancelOrder(symbol, orderId, origClientOrderId, recvWindow);
    }

    /**
     * Change Initial Leverage (TRADE) Change user&#39;s initial leverage in the specific symbol
     * market. For Hedge Mode, LONG and SHORT positions of one symbol use the same initial leverage
     * and share a total notional value. Weight: 1
     *
     * @param changeInitialLeverageRequest (required)
     * @return ApiResponse&lt;ChangeInitialLeverageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Change Initial Leverage </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/trade/rest-api/Change-Initial-Leverage">Change
     *     Initial Leverage (TRADE) Documentation</a>
     */
    public ApiResponse<ChangeInitialLeverageResponse> changeInitialLeverage(
            ChangeInitialLeverageRequest changeInitialLeverageRequest) throws ApiException {
        return tradeApi.changeInitialLeverage(changeInitialLeverageRequest);
    }

    /**
     * Change Margin Type (TRADE) Change user&#39;s margin type in the specific symbol market.For
     * Hedge Mode, LONG and SHORT positions of one symbol use the same margin type. With ISOLATED
     * margin type, margins of the LONG and SHORT positions are isolated from each other. Weight: 1
     *
     * @param changeMarginTypeRequest (required)
     * @return ApiResponse&lt;ChangeMarginTypeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Change Margin Type </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/trade/rest-api/Change-Margin-Type">Change
     *     Margin Type (TRADE) Documentation</a>
     */
    public ApiResponse<ChangeMarginTypeResponse> changeMarginType(
            ChangeMarginTypeRequest changeMarginTypeRequest) throws ApiException {
        return tradeApi.changeMarginType(changeMarginTypeRequest);
    }

    /**
     * Change Position Mode(TRADE) Change user&#39;s position mode (Hedge Mode or One-way Mode ) on
     * ***EVERY symbol*** Weight: 1
     *
     * @param changePositionModeRequest (required)
     * @return ApiResponse&lt;ChangePositionModeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Change Position Mode </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/trade/rest-api/Change-Position-Mode">Change
     *     Position Mode(TRADE) Documentation</a>
     */
    public ApiResponse<ChangePositionModeResponse> changePositionMode(
            ChangePositionModeRequest changePositionModeRequest) throws ApiException {
        return tradeApi.changePositionMode(changePositionModeRequest);
    }

    /**
     * Current All Open Orders (USER_DATA) Get all open orders on a symbol. **Careful** when
     * accessing this with no symbol. Weight: 1 for a single symbol, 40 for mutltiple symbols
     *
     * @param symbol (optional)
     * @param pair (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;CurrentAllOpenOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Current All Open Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/trade/rest-api/Current-All-Open-Orders">Current
     *     All Open Orders (USER_DATA) Documentation</a>
     */
    public ApiResponse<CurrentAllOpenOrdersResponse> currentAllOpenOrders(
            String symbol, String pair, Long recvWindow) throws ApiException {
        return tradeApi.currentAllOpenOrders(symbol, pair, recvWindow);
    }

    /**
     * Get Order Modify History (USER_DATA) Get order modification history * Either
     * &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent, and the
     * &#x60;orderId&#x60; will prevail if both are sent. * Order modify history longer than 3 month
     * is not avaliable Weight: 1
     *
     * @param symbol (required)
     * @param orderId (optional)
     * @param origClientOrderId (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit Default 100; max 1000 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetOrderModifyHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Order Modify History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/trade/rest-api/Get-Order-Modify-History">Get
     *     Order Modify History (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetOrderModifyHistoryResponse> getOrderModifyHistory(
            String symbol,
            Long orderId,
            String origClientOrderId,
            Long startTime,
            Long endTime,
            Long limit,
            Long recvWindow)
            throws ApiException {
        return tradeApi.getOrderModifyHistory(
                symbol, orderId, origClientOrderId, startTime, endTime, limit, recvWindow);
    }

    /**
     * Get Position Margin Change History(TRADE) Get position margin change history Weight: 1
     *
     * @param symbol (required)
     * @param type 1: Add position margin,2: Reduce position margin (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit Default 100; max 1000 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetPositionMarginChangeHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Position Margin Change History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/trade/rest-api/Get-Position-Margin-Change-History">Get
     *     Position Margin Change History(TRADE) Documentation</a>
     */
    public ApiResponse<GetPositionMarginChangeHistoryResponse> getPositionMarginChangeHistory(
            String symbol, Type type, Long startTime, Long endTime, Long limit, Long recvWindow)
            throws ApiException {
        return tradeApi.getPositionMarginChangeHistory(
                symbol, type, startTime, endTime, limit, recvWindow);
    }

    /**
     * Modify Isolated Position Margin(TRADE) Modify Isolated Position Margin * Only for isolated
     * symbol Weight: 1
     *
     * @param modifyIsolatedPositionMarginRequest (required)
     * @return ApiResponse&lt;ModifyIsolatedPositionMarginResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Modify Isolated Position Margin </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/trade/rest-api/Modify-Isolated-Position-Margin">Modify
     *     Isolated Position Margin(TRADE) Documentation</a>
     */
    public ApiResponse<ModifyIsolatedPositionMarginResponse> modifyIsolatedPositionMargin(
            ModifyIsolatedPositionMarginRequest modifyIsolatedPositionMarginRequest)
            throws ApiException {
        return tradeApi.modifyIsolatedPositionMargin(modifyIsolatedPositionMarginRequest);
    }

    /**
     * Modify Multiple Orders(TRADE) Modify Multiple Orders * Parameter rules are same with
     * &#x60;Modify Order&#x60; * Batch modify orders are processed concurrently, and the order of
     * matching is not guaranteed. * The order of returned contents for batch modify orders is the
     * same as the order of the order list. * One order can only be modfied for less than 10000
     * times Weight: 5
     *
     * @param modifyMultipleOrdersRequest (required)
     * @return ApiResponse&lt;ModifyMultipleOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Modify Multiple Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/trade/rest-api/Modify-Multiple-Orders">Modify
     *     Multiple Orders(TRADE) Documentation</a>
     */
    public ApiResponse<ModifyMultipleOrdersResponse> modifyMultipleOrders(
            ModifyMultipleOrdersRequest modifyMultipleOrdersRequest) throws ApiException {
        return tradeApi.modifyMultipleOrders(modifyMultipleOrdersRequest);
    }

    /**
     * Modify Order (TRADE) Order modify function, currently only LIMIT order modification is
     * supported, modified orders will be reordered in the match queue * Either &#x60;orderId&#x60;
     * or &#x60;origClientOrderId&#x60; must be sent, and the &#x60;orderId&#x60; will prevail if
     * both are sent. * Either &#x60;quantity&#x60; or &#x60;price&#x60; must be sent. * When the
     * new &#x60;quantity&#x60; or &#x60;price&#x60; doesn&#39;t satisfy PRICE_FILTER /
     * PERCENT_FILTER / LOT_SIZE, amendment will be rejected and the order will stay as it is. *
     * However the order will be cancelled by the amendment in the following situations: * when the
     * order is in partially filled status and the new &#x60;quantity&#x60; &lt;&#x3D;
     * &#x60;executedQty&#x60; * When the order is &#x60;GTX&#x60; and the new price will cause it
     * to be executed immediately * One order can only be modfied for less than 10000 times Weight:
     * 1
     *
     * @param modifyOrderRequest (required)
     * @return ApiResponse&lt;ModifyOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Modify Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/trade/rest-api/Modify-Order">Modify
     *     Order (TRADE) Documentation</a>
     */
    public ApiResponse<ModifyOrderResponse> modifyOrder(ModifyOrderRequest modifyOrderRequest)
            throws ApiException {
        return tradeApi.modifyOrder(modifyOrderRequest);
    }

    /**
     * New Order (TRADE) Send in a new order. * Order with type &#x60;STOP&#x60;, parameter
     * &#x60;timeInForce&#x60; can be sent ( default &#x60;GTC&#x60;). * Order with type
     * &#x60;TAKE_PROFIT&#x60;, parameter &#x60;timeInForce&#x60; can be sent ( default
     * &#x60;GTC&#x60;). * Condition orders will be triggered when: * If
     * parameter&#x60;priceProtect&#x60;is sent as true: * when price reaches the
     * &#x60;stopPrice&#x60; ，the difference rate between \&quot;MARK_PRICE\&quot; and
     * \&quot;CONTRACT_PRICE\&quot; cannot be larger than the \&quot;triggerProtect\&quot; of the
     * symbol * \&quot;triggerProtect\&quot; of a symbol can be got from &#x60;GET
     * /dapi/v1/exchangeInfo&#x60; * &#x60;STOP&#x60;, &#x60;STOP_MARKET&#x60;: * BUY: latest price
     * (\&quot;MARK_PRICE\&quot; or \&quot;CONTRACT_PRICE\&quot;) &gt;&#x3D; &#x60;stopPrice&#x60; *
     * SELL: latest price (\&quot;MARK_PRICE\&quot; or \&quot;CONTRACT_PRICE\&quot;) &lt;&#x3D;
     * &#x60;stopPrice&#x60; * &#x60;TAKE_PROFIT&#x60;, &#x60;TAKE_PROFIT_MARKET&#x60;: * BUY:
     * latest price (\&quot;MARK_PRICE\&quot; or \&quot;CONTRACT_PRICE\&quot;) &lt;&#x3D;
     * &#x60;stopPrice&#x60; * SELL: latest price (\&quot;MARK_PRICE\&quot; or
     * \&quot;CONTRACT_PRICE\&quot;) &gt;&#x3D; &#x60;stopPrice&#x60; *
     * &#x60;TRAILING_STOP_MARKET&#x60;: * BUY: the lowest price after order placed &#x60;&lt;&#x3D;
     * &#x60;activationPrice&#x60;, and the latest price &gt;&#x60;&#x3D; the lowest price * (1 +
     * &#x60;callbackRate&#x60;) * SELL: the highest price after order placed &gt;&#x3D;
     * &#x60;activationPrice&#x60;, and the latest price &lt;&#x3D; the highest price * (1 -
     * &#x60;callbackRate&#x60;) * For &#x60;TRAILING_STOP_MARKET&#x60;, if you got such error code.
     * &#x60;&#x60;{\&quot;code\&quot;: -2021, \&quot;msg\&quot;: \&quot;Order would immediately
     * trigger.\&quot;}&#x60;&#x60; means that the parameters you send do not meet the following
     * requirements: * BUY: &#x60;activationPrice&#x60; should be smaller than latest price. * SELL:
     * &#x60;activationPrice&#x60; should be larger than latest price. * If &#x60;newOrderRespType
     * &#x60; is sent as &#x60;RESULT&#x60; : * &#x60;MARKET&#x60; order: the final FILLED result of
     * the order will be return directly. * &#x60;LIMIT&#x60; order with special
     * &#x60;timeInForce&#x60;: the final status result of the order(FILLED or EXPIRED) will be
     * returned directly. * &#x60;STOP_MARKET&#x60;, &#x60;TAKE_PROFIT_MARKET&#x60; with
     * &#x60;closePosition&#x60;&#x3D;&#x60;true&#x60;: * Follow the same rules for condition
     * orders. * If triggered,**close all** current long position( if &#x60;SELL&#x60;) or current
     * short position( if &#x60;BUY&#x60;). * Cannot be used with &#x60;quantity&#x60; parameter *
     * Cannot be used with &#x60;reduceOnly&#x60; parameter * In Hedge Mode,cannot be used with
     * &#x60;BUY&#x60; orders in &#x60;LONG&#x60; position side. and cannot be used with
     * &#x60;SELL&#x60; orders in &#x60;SHORT&#x60; position side *
     * &#x60;selfTradePreventionMode&#x60; is only effective when &#x60;timeInForce&#x60; set to
     * &#x60;IOC&#x60; or &#x60;GTC&#x60;. Weight: 1 on 1min order rate
     * limit(X-MBX-ORDER-COUNT-1M)\\ 0 on IP rate limit(x-mbx-used-weight-1m)
     *
     * @param newOrderRequest (required)
     * @return ApiResponse&lt;NewOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> New Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/trade/rest-api/New-Order">New
     *     Order (TRADE) Documentation</a>
     */
    public ApiResponse<NewOrderResponse> newOrder(NewOrderRequest newOrderRequest)
            throws ApiException {
        return tradeApi.newOrder(newOrderRequest);
    }

    /**
     * Position ADL Quantile Estimation(USER_DATA) Query position ADL quantile estimation * Values
     * update every 30s. * Values 0, 1, 2, 3, 4 shows the queue position and possibility of ADL from
     * low to high. * For positions of the symbol are in One-way Mode or isolated margined in Hedge
     * Mode, \&quot;LONG\&quot;, \&quot;SHORT\&quot;, and \&quot;BOTH\&quot; will be returned to
     * show the positions&#39; adl quantiles of different position sides. * If the positions of the
     * symbol are crossed margined in Hedge Mode: * \&quot;HEDGE\&quot; as a sign will be returned
     * instead of \&quot;BOTH\&quot;; * A same value caculated on unrealized pnls on long and short
     * sides&#39; positions will be shown for \&quot;LONG\&quot; and \&quot;SHORT\&quot; when there
     * are positions in both of long and short sides. Weight: 5
     *
     * @param symbol (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;PositionAdlQuantileEstimationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Position ADL Quantile Estimation </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/trade/rest-api/Position-ADL-Quantile-Estimation">Position
     *     ADL Quantile Estimation(USER_DATA) Documentation</a>
     */
    public ApiResponse<PositionAdlQuantileEstimationResponse> positionAdlQuantileEstimation(
            String symbol, Long recvWindow) throws ApiException {
        return tradeApi.positionAdlQuantileEstimation(symbol, recvWindow);
    }

    /**
     * Position Information(USER_DATA) Get current account information. * If neither
     * &#x60;marginAsset&#x60; nor &#x60;pair&#x60; is sent, positions of all symbols with
     * &#x60;TRADING&#x60; status will be returned. * for One-way Mode user, the response will only
     * show the \&quot;BOTH\&quot; positions * for Hedge Mode user, the response will show
     * \&quot;BOTH\&quot;, \&quot;LONG\&quot;, and \&quot;SHORT\&quot; positions. Please use with
     * user data stream &#x60;ACCOUNT_UPDATE&#x60; to meet your timeliness and accuracy needs.
     * Weight: 1
     *
     * @param marginAsset (optional)
     * @param pair (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;PositionInformationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Position Information </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/trade/rest-api/Position-Information">Position
     *     Information(USER_DATA) Documentation</a>
     */
    public ApiResponse<PositionInformationResponse> positionInformation(
            String marginAsset, String pair, Long recvWindow) throws ApiException {
        return tradeApi.positionInformation(marginAsset, pair, recvWindow);
    }

    /**
     * Query Current Open Order(USER_DATA) Query Current Open Order * Either&#x60;orderId&#x60; or
     * &#x60;origClientOrderId&#x60; must be sent * If the queried order has been filled or
     * cancelled, the error message \&quot;Order does not exist\&quot; will be returned. Weight: 1
     *
     * @param symbol (required)
     * @param orderId (optional)
     * @param origClientOrderId (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryCurrentOpenOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Current Open Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/trade/rest-api/Query-Current-Open-Order">Query
     *     Current Open Order(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryCurrentOpenOrderResponse> queryCurrentOpenOrder(
            String symbol, Long orderId, String origClientOrderId, Long recvWindow)
            throws ApiException {
        return tradeApi.queryCurrentOpenOrder(symbol, orderId, origClientOrderId, recvWindow);
    }

    /**
     * Query Order (USER_DATA) Check an order&#39;s status. * These orders will not be found: *
     * order status is CANCELED or EXPIRED AND order has NO filled trade AND created time + 3 days
     * &lt; current time * order create time + 90 days &lt; current time * Either
     * &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent. Weight: 1
     *
     * @param symbol (required)
     * @param orderId (optional)
     * @param origClientOrderId (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/trade/rest-api/Query-Order">Query
     *     Order (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryOrderResponse> queryOrder(
            String symbol, Long orderId, String origClientOrderId, Long recvWindow)
            throws ApiException {
        return tradeApi.queryOrder(symbol, orderId, origClientOrderId, recvWindow);
    }

    /**
     * User&#39;s Force Orders(USER_DATA) User&#39;s Force Orders * If \&quot;autoCloseType\&quot;
     * is not sent, orders with both of the types will be returned * If \&quot;startTime\&quot; is
     * not sent, data within 200 days before \&quot;endTime\&quot; can be queried Weight: 20 with
     * symbol, 50 without symbol
     *
     * @param symbol (optional)
     * @param autoCloseType \&quot;LIQUIDATION\&quot; for liquidation orders, \&quot;ADL\&quot; for
     *     ADL orders. (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit Default 100; max 1000 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;UsersForceOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User&#39;s Force Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/trade/rest-api/Users-Force-Orders">User&#39;s
     *     Force Orders(USER_DATA) Documentation</a>
     */
    public ApiResponse<UsersForceOrdersResponse> usersForceOrders(
            String symbol,
            AutoCloseType autoCloseType,
            Long startTime,
            Long endTime,
            Long limit,
            Long recvWindow)
            throws ApiException {
        return tradeApi.usersForceOrders(
                symbol, autoCloseType, startTime, endTime, limit, recvWindow);
    }

    /**
     * Close User Data Stream(USER_STREAM) Close out a user data stream. Weight: 1
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
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/user-data-streams/Close-User-Data-Stream">Close
     *     User Data Stream(USER_STREAM) Documentation</a>
     */
    public void closeUserDataStream() throws ApiException {
        userDataStreamsApi.closeUserDataStream();
    }

    /**
     * Keepalive User Data Stream (USER_STREAM) Keepalive a user data stream to prevent a time out.
     * User data streams will close after 60 minutes. Weight: 1
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
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/user-data-streams/Keepalive-User-Data-Stream">Keepalive
     *     User Data Stream (USER_STREAM) Documentation</a>
     */
    public void keepaliveUserDataStream() throws ApiException {
        userDataStreamsApi.keepaliveUserDataStream();
    }

    /**
     * Start User Data Stream (USER_STREAM) Start a new user data stream. The stream will close
     * after 60 minutes unless a keepalive is sent. If the account has an active
     * &#x60;listenKey&#x60;, that &#x60;listenKey&#x60; will be returned and its validity will be
     * extended for 60 minutes. Weight: 1
     *
     * @return ApiResponse&lt;StartUserDataStreamResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Start User Data Stream </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/coin-margined-futures/user-data-streams/Start-User-Data-Stream">Start
     *     User Data Stream (USER_STREAM) Documentation</a>
     */
    public ApiResponse<StartUserDataStreamResponse> startUserDataStream() throws ApiException {
        return userDataStreamsApi.startUserDataStream();
    }
}
