package com.binance.connector.client.margin_trading.rest.api;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.model.AdjustCrossMarginMaxLeverageRequest;
import com.binance.connector.client.margin_trading.rest.model.AdjustCrossMarginMaxLeverageResponse;
import com.binance.connector.client.margin_trading.rest.model.CreateSpecialKeyRequest;
import com.binance.connector.client.margin_trading.rest.model.CreateSpecialKeyResponse;
import com.binance.connector.client.margin_trading.rest.model.CrossMarginCollateralRatioResponse;
import com.binance.connector.client.margin_trading.rest.model.DisableIsolatedMarginAccountResponse;
import com.binance.connector.client.margin_trading.rest.model.EditIpForSpecialKeyRequest;
import com.binance.connector.client.margin_trading.rest.model.EnableIsolatedMarginAccountRequest;
import com.binance.connector.client.margin_trading.rest.model.EnableIsolatedMarginAccountResponse;
import com.binance.connector.client.margin_trading.rest.model.ExitSpecialKeyModeRequest;
import com.binance.connector.client.margin_trading.rest.model.GetAllCrossMarginPairsResponse;
import com.binance.connector.client.margin_trading.rest.model.GetAllIsolatedMarginSymbolResponse;
import com.binance.connector.client.margin_trading.rest.model.GetAllMarginAssetsResponse;
import com.binance.connector.client.margin_trading.rest.model.GetBnbBurnStatusResponse;
import com.binance.connector.client.margin_trading.rest.model.GetCrossMarginTransferHistoryResponse;
import com.binance.connector.client.margin_trading.rest.model.GetDelistScheduleResponse;
import com.binance.connector.client.margin_trading.rest.model.GetForceLiquidationRecordResponse;
import com.binance.connector.client.margin_trading.rest.model.GetFutureHourlyInterestRateResponse;
import com.binance.connector.client.margin_trading.rest.model.GetInterestHistoryResponse;
import com.binance.connector.client.margin_trading.rest.model.GetLimitPricePairsResponse;
import com.binance.connector.client.margin_trading.rest.model.GetListScheduleResponse;
import com.binance.connector.client.margin_trading.rest.model.GetMarginAssetRiskBasedLiquidationRatioResponse;
import com.binance.connector.client.margin_trading.rest.model.GetMarginRestrictedAssetsResponse;
import com.binance.connector.client.margin_trading.rest.model.GetSmallLiabilityExchangeCoinListResponse;
import com.binance.connector.client.margin_trading.rest.model.GetSmallLiabilityExchangeHistoryResponse;
import com.binance.connector.client.margin_trading.rest.model.GetSummaryOfMarginAccountResponse;
import com.binance.connector.client.margin_trading.rest.model.IsIsolated;
import com.binance.connector.client.margin_trading.rest.model.KeepaliveUserDataStreamRequest;
import com.binance.connector.client.margin_trading.rest.model.LiquidationLoanRepayRequest;
import com.binance.connector.client.margin_trading.rest.model.LiquidationLoanRepayResponse;
import com.binance.connector.client.margin_trading.rest.model.MarginAccountBorrowRepayRequest;
import com.binance.connector.client.margin_trading.rest.model.MarginAccountBorrowRepayResponse;
import com.binance.connector.client.margin_trading.rest.model.MarginAccountCancelAllOpenOrdersOnASymbolResponse;
import com.binance.connector.client.margin_trading.rest.model.MarginAccountCancelOcoResponse;
import com.binance.connector.client.margin_trading.rest.model.MarginAccountCancelOrderResponse;
import com.binance.connector.client.margin_trading.rest.model.MarginAccountNewOcoRequest;
import com.binance.connector.client.margin_trading.rest.model.MarginAccountNewOcoResponse;
import com.binance.connector.client.margin_trading.rest.model.MarginAccountNewOrderRequest;
import com.binance.connector.client.margin_trading.rest.model.MarginAccountNewOrderResponse;
import com.binance.connector.client.margin_trading.rest.model.MarginAccountNewOtoRequest;
import com.binance.connector.client.margin_trading.rest.model.MarginAccountNewOtoResponse;
import com.binance.connector.client.margin_trading.rest.model.MarginAccountNewOtocoRequest;
import com.binance.connector.client.margin_trading.rest.model.MarginAccountNewOtocoResponse;
import com.binance.connector.client.margin_trading.rest.model.MarginManualLiquidationRequest;
import com.binance.connector.client.margin_trading.rest.model.MarginManualLiquidationResponse;
import com.binance.connector.client.margin_trading.rest.model.OrderType;
import com.binance.connector.client.margin_trading.rest.model.QueryBorrowRepayRecordsInMarginAccountResponse;
import com.binance.connector.client.margin_trading.rest.model.QueryCrossIsolatedMarginCapitalFlowResponse;
import com.binance.connector.client.margin_trading.rest.model.QueryCrossMarginAccountDetailsResponse;
import com.binance.connector.client.margin_trading.rest.model.QueryCrossMarginFeeDataResponse;
import com.binance.connector.client.margin_trading.rest.model.QueryCurrentMarginOrderCountUsageResponse;
import com.binance.connector.client.margin_trading.rest.model.QueryEnabledIsolatedMarginAccountLimitResponse;
import com.binance.connector.client.margin_trading.rest.model.QueryIsolatedMarginAccountInfoResponse;
import com.binance.connector.client.margin_trading.rest.model.QueryIsolatedMarginFeeDataResponse;
import com.binance.connector.client.margin_trading.rest.model.QueryIsolatedMarginTierDataResponse;
import com.binance.connector.client.margin_trading.rest.model.QueryLiabilityCoinLeverageBracketInCrossMarginProModeResponse;
import com.binance.connector.client.margin_trading.rest.model.QueryLiquidationLoanRepayHistoryResponse;
import com.binance.connector.client.margin_trading.rest.model.QueryLiquidationLoanResponse;
import com.binance.connector.client.margin_trading.rest.model.QueryMarginAccountsAllOcoResponse;
import com.binance.connector.client.margin_trading.rest.model.QueryMarginAccountsAllOrdersResponse;
import com.binance.connector.client.margin_trading.rest.model.QueryMarginAccountsOcoResponse;
import com.binance.connector.client.margin_trading.rest.model.QueryMarginAccountsOpenOcoResponse;
import com.binance.connector.client.margin_trading.rest.model.QueryMarginAccountsOpenOrdersResponse;
import com.binance.connector.client.margin_trading.rest.model.QueryMarginAccountsOrderResponse;
import com.binance.connector.client.margin_trading.rest.model.QueryMarginAccountsTradeListResponse;
import com.binance.connector.client.margin_trading.rest.model.QueryMarginAvailableInventoryResponse;
import com.binance.connector.client.margin_trading.rest.model.QueryMarginInterestRateHistoryResponse;
import com.binance.connector.client.margin_trading.rest.model.QueryMarginPriceindexResponse;
import com.binance.connector.client.margin_trading.rest.model.QueryMaxBorrowResponse;
import com.binance.connector.client.margin_trading.rest.model.QueryMaxTransferOutAmountResponse;
import com.binance.connector.client.margin_trading.rest.model.QueryPreventedMatchesResponse;
import com.binance.connector.client.margin_trading.rest.model.QuerySpecialKeyListResponse;
import com.binance.connector.client.margin_trading.rest.model.QuerySpecialKeyResponse;
import com.binance.connector.client.margin_trading.rest.model.SmallLiabilityExchangeRequest;
import com.binance.connector.client.margin_trading.rest.model.StartUserDataStreamResponse;

public class MarginTradingRestApi {

    private final AccountApi accountApi;
    private final BorrowRepayApi borrowRepayApi;
    private final MarketDataApi marketDataApi;
    private final TradeApi tradeApi;
    private final TransferApi transferApi;
    private final UserDataStreamApi userDataStreamApi;

    public MarginTradingRestApi(ClientConfiguration configuration) {
        this(MarginTradingRestApiUtil.getDefaultClient(configuration));
    }

    public MarginTradingRestApi(ApiClient apiClient) {
        this.accountApi = new AccountApi(apiClient);
        this.borrowRepayApi = new BorrowRepayApi(apiClient);
        this.marketDataApi = new MarketDataApi(apiClient);
        this.tradeApi = new TradeApi(apiClient);
        this.transferApi = new TransferApi(apiClient);
        this.userDataStreamApi = new UserDataStreamApi(apiClient);
    }

    /**
     * Adjust cross margin max leverage (USER_DATA) Adjust cross margin max leverage Weight(UID):
     * 3000, 1 times/min per IP Security Type: USER_DATA Notes: - The margin level need higher than
     * the initial risk ratio of adjusted leverage, the initial risk ratio of 3x is 1.5 , the
     * initial risk ratio of 5x is 1.25; The detail conditions on how to switch between Cross Margin
     * Classic and Cross Margin Pro can refer to [the
     * FAQ](https://www.binance.com/en/support/faq/how-to-activate-the-cross-margin-pro-mode-on-binance-e27786da05e743a694b8c625b3bc475d).
     *
     * @param adjustCrossMarginMaxLeverageRequest (required)
     * @return ApiResponse&lt;AdjustCrossMarginMaxLeverageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Adjust cross margin max leverage </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/account#adjust-cross-margin-max-leverage">Adjust
     *     cross margin max leverage (USER_DATA) Documentation</a>
     */
    public ApiResponse<AdjustCrossMarginMaxLeverageResponse> adjustCrossMarginMaxLeverage(
            AdjustCrossMarginMaxLeverageRequest adjustCrossMarginMaxLeverageRequest)
            throws ApiException {
        return accountApi.adjustCrossMarginMaxLeverage(adjustCrossMarginMaxLeverageRequest);
    }

    /**
     * Disable Isolated Margin Account (TRADE) Disable isolated margin account for a specific
     * symbol. Each trading pair can only be deactivated once every 24 hours. Weight(UID): 300
     * Security Type: TRADE
     *
     * @param symbol (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;DisableIsolatedMarginAccountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Disable Isolated Margin Account </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/account#disable-isolated-margin-account">Disable
     *     Isolated Margin Account (TRADE) Documentation</a>
     */
    public ApiResponse<DisableIsolatedMarginAccountResponse> disableIsolatedMarginAccount(
            String symbol, Long recvWindow) throws ApiException {
        return accountApi.disableIsolatedMarginAccount(symbol, recvWindow);
    }

    /**
     * Enable Isolated Margin Account (TRADE) Enable isolated margin account for a specific
     * symbol(Only supports activation of previously disabled accounts). Weight(UID): 300 Security
     * Type: TRADE
     *
     * @param enableIsolatedMarginAccountRequest (required)
     * @return ApiResponse&lt;EnableIsolatedMarginAccountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Enable Isolated Margin Account </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/account#enable-isolated-margin-account">Enable
     *     Isolated Margin Account (TRADE) Documentation</a>
     */
    public ApiResponse<EnableIsolatedMarginAccountResponse> enableIsolatedMarginAccount(
            EnableIsolatedMarginAccountRequest enableIsolatedMarginAccountRequest)
            throws ApiException {
        return accountApi.enableIsolatedMarginAccount(enableIsolatedMarginAccountRequest);
    }

    /**
     * Get BNB Burn Status (USER_DATA) Get BNB Burn Status Weight(IP): 1 Security Type: USER_DATA
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetBnbBurnStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get BNB Burn Status </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/account#get-bnb-burn-status">Get
     *     BNB Burn Status (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetBnbBurnStatusResponse> getBnbBurnStatus(Long recvWindow)
            throws ApiException {
        return accountApi.getBnbBurnStatus(recvWindow);
    }

    /**
     * Get Summary of Margin account (USER_DATA) Get personal margin level information Weight(IP):
     * 10 Security Type: USER_DATA
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetSummaryOfMarginAccountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Summary of Margin account </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/account#get-summary-of-margin-account">Get
     *     Summary of Margin account (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetSummaryOfMarginAccountResponse> getSummaryOfMarginAccount(Long recvWindow)
            throws ApiException {
        return accountApi.getSummaryOfMarginAccount(recvWindow);
    }

    /**
     * Query Cross Isolated Margin Capital Flow (USER_DATA) Query Cross Isolated Margin Capital Flow
     * Weight(IP): 100 Security Type: USER_DATA Notes: - Only supports querying the data of the last
     * 90 days - The time between startTime and endTime cannot be longer than 7 days. - If fromId is
     * set, the data with id &gt; fromId will be returned. Otherwise the latest data will be
     * returned - To query isolated data, Symbol needs to be entered.
     *
     * @param asset (optional)
     * @param symbol Mandatory for Isolated data (optional)
     * @param type (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param fromId (optional)
     * @param limit (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryCrossIsolatedMarginCapitalFlowResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cross Isolated Margin Capital Flow </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/account#query-cross-isolated-margin-capital-flow">Query
     *     Cross Isolated Margin Capital Flow (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryCrossIsolatedMarginCapitalFlowResponse>
            queryCrossIsolatedMarginCapitalFlow(
                    String asset,
                    String symbol,
                    OrderType type,
                    Long startTime,
                    Long endTime,
                    Long fromId,
                    Long limit,
                    Long recvWindow)
                    throws ApiException {
        return accountApi.queryCrossIsolatedMarginCapitalFlow(
                asset, symbol, type, startTime, endTime, fromId, limit, recvWindow);
    }

    /**
     * Query Cross Margin Account Details (USER_DATA) Query Cross Margin Account Details Weight(IP):
     * 10 Security Type: USER_DATA
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryCrossMarginAccountDetailsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cross Margin Account Details </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/account#query-cross-margin-account-details">Query
     *     Cross Margin Account Details (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryCrossMarginAccountDetailsResponse> queryCrossMarginAccountDetails(
            Long recvWindow) throws ApiException {
        return accountApi.queryCrossMarginAccountDetails(recvWindow);
    }

    /**
     * Query Cross Margin Fee Data (USER_DATA) Get cross margin fee data collection with any vip
     * level or user&#39;s current specific data as https://www.binance.com/en/margin-fee Weight: 1
     * when coin is specified;(IP) 5 when the coin parameter is omitted(IP) Security Type: USER_DATA
     *
     * @param vipLevel User&#39;s current specific margin data will be returned if vipLevel is
     *     omitted (optional)
     * @param coin (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryCrossMarginFeeDataResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cross Margin Fee Data </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/account#query-cross-margin-fee-data">Query
     *     Cross Margin Fee Data (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryCrossMarginFeeDataResponse> queryCrossMarginFeeData(
            Long vipLevel, String coin, Long recvWindow) throws ApiException {
        return accountApi.queryCrossMarginFeeData(vipLevel, coin, recvWindow);
    }

    /**
     * Query Enabled Isolated Margin Account Limit (USER_DATA) Query enabled isolated margin account
     * limit. Weight(IP): 1 Security Type: USER_DATA
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryEnabledIsolatedMarginAccountLimitResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Enabled Isolated Margin Account Limit </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/account#query-enabled-isolated-margin-account-limit">Query
     *     Enabled Isolated Margin Account Limit (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryEnabledIsolatedMarginAccountLimitResponse>
            queryEnabledIsolatedMarginAccountLimit(Long recvWindow) throws ApiException {
        return accountApi.queryEnabledIsolatedMarginAccountLimit(recvWindow);
    }

    /**
     * Query Isolated Margin Account Info (USER_DATA) Query Isolated Margin Account Info Weight(IP):
     * 10 Security Type: USER_DATA Notes: - If \&quot;symbols\&quot; is not sent, all isolated
     * assets will be returned. - If \&quot;symbols\&quot; is sent, only the isolated assets of the
     * sent symbols will be returned.
     *
     * @param symbols (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryIsolatedMarginAccountInfoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Isolated Margin Account Info </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/account#query-isolated-margin-account-info">Query
     *     Isolated Margin Account Info (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryIsolatedMarginAccountInfoResponse> queryIsolatedMarginAccountInfo(
            String symbols, Long recvWindow) throws ApiException {
        return accountApi.queryIsolatedMarginAccountInfo(symbols, recvWindow);
    }

    /**
     * Query Isolated Margin Fee Data (USER_DATA) Get isolated margin fee data collection with any
     * vip level or user&#39;s current specific data as https://www.binance.com/en/margin-fee
     * Weight: 1 when a single is specified;(IP) 10 when the symbol parameter is omitted(IP)
     * Security Type: USER_DATA
     *
     * @param vipLevel (optional)
     * @param symbol (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryIsolatedMarginFeeDataResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Isolated Margin Fee Data </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/account#query-isolated-margin-fee-data">Query
     *     Isolated Margin Fee Data (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryIsolatedMarginFeeDataResponse> queryIsolatedMarginFeeData(
            Long vipLevel, String symbol, Long recvWindow) throws ApiException {
        return accountApi.queryIsolatedMarginFeeData(vipLevel, symbol, recvWindow);
    }

    /**
     * Get future hourly interest rate (USER_DATA) Get future hourly interest rate Weight(IP): 100
     * Security Type: USER_DATA
     *
     * @param assets (required)
     * @param isIsolated (required)
     * @return ApiResponse&lt;GetFutureHourlyInterestRateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get future hourly interest rate </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/borrow-repay#get-future-hourly-interest-rate">Get
     *     future hourly interest rate (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetFutureHourlyInterestRateResponse> getFutureHourlyInterestRate(
            String assets, IsIsolated isIsolated) throws ApiException {
        return borrowRepayApi.getFutureHourlyInterestRate(assets, isIsolated);
    }

    /**
     * Get Interest History (USER_DATA) Get Interest History Weight(IP): 1 Security Type: USER_DATA
     * Notes: - Response in descending order - If isolatedSymbol is not sent, crossed margin data
     * will be returned - The max interval between &#x60;startTime&#x60; and &#x60;endTime&#x60; is
     * 30 days. It is a MUST to ensure data correctness. - If &#x60;startTime&#x60;and
     * &#x60;endTime&#x60; not sent, return records of the last 7 days by default. - If
     * &#x60;startTime&#x60; is sent and &#x60;endTime&#x60; is not sent, return records of
     * [max(&#x60;startTime&#x60;, now-30d), now]. - If &#x60;startTime&#x60; is not sent and
     * &#x60;endTime&#x60; is sent, return records of [&#x60;endTime&#x60;-7, &#x60;endTime&#x60;] -
     * &#x60;type&#x60; in response has 4 enums: - &#x60;PERIODIC&#x60; interest charged per hour -
     * &#x60;ON_BORROW&#x60; first interest charged on borrow - &#x60;PERIODIC_CONVERTED&#x60;
     * interest charged per hour converted into BNB - &#x60;ON_BORROW_CONVERTED&#x60; first interest
     * charged on borrow converted into BNB - &#x60;PORTFOLIO&#x60; interest charged daily on the
     * portfolio margin negative balance
     *
     * @param asset (optional)
     * @param isolatedSymbol (optional)
     * @param startTime Only supports querying data from the past 90 days. (optional)
     * @param endTime (optional)
     * @param current (optional)
     * @param size (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetInterestHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Interest History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/borrow-repay#get-interest-history">Get
     *     Interest History (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetInterestHistoryResponse> getInterestHistory(
            String asset,
            String isolatedSymbol,
            Long startTime,
            Long endTime,
            Long current,
            Long size,
            Long recvWindow)
            throws ApiException {
        return borrowRepayApi.getInterestHistory(
                asset, isolatedSymbol, startTime, endTime, current, size, recvWindow);
    }

    /**
     * Margin account borrow/repay (USER_DATA) Margin account borrow/repay Weight(UID): 1500
     * Security Type: USER_DATA
     *
     * @param marginAccountBorrowRepayRequest (required)
     * @return ApiResponse&lt;MarginAccountBorrowRepayResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Margin account borrow/repay </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/borrow-repay#margin-account-borrow-repay">Margin
     *     account borrow/repay (USER_DATA) Documentation</a>
     */
    public ApiResponse<MarginAccountBorrowRepayResponse> marginAccountBorrowRepay(
            MarginAccountBorrowRepayRequest marginAccountBorrowRepayRequest) throws ApiException {
        return borrowRepayApi.marginAccountBorrowRepay(marginAccountBorrowRepayRequest);
    }

    /**
     * Query borrow/repay records in Margin account (USER_DATA) Query borrow/repay records in Margin
     * account Weight(IP): 10 Security Type: USER_DATA Notes: - &#x60;txId&#x60; or
     * &#x60;startTime&#x60; must be sent. &#x60;txId&#x60; takes precedence. - Response in
     * descending order - If an asset is sent, data within 30 days before &#x60;endTime&#x60;; If an
     * asset is not sent, data within 7 days before &#x60;endTime&#x60; - If neither
     * &#x60;startTime&#x60; nor &#x60;endTime&#x60; is sent, the recent 7-day data will be
     * returned. - &#x60;startTime&#x60; set as &#x60;endTime&#x60; - 7 days by default,
     * &#x60;endTime&#x60; set as current time by default
     *
     * @param type (required)
     * @param asset (optional)
     * @param isolatedSymbol (optional)
     * @param txId (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current (optional)
     * @param size (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryBorrowRepayRecordsInMarginAccountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> borrow/repay records in Margin account </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/borrow-repay#query-borrow-repay-records-in-margin-account">Query
     *     borrow/repay records in Margin account (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryBorrowRepayRecordsInMarginAccountResponse>
            queryBorrowRepayRecordsInMarginAccount(
                    OrderType type,
                    String asset,
                    String isolatedSymbol,
                    Long txId,
                    Long startTime,
                    Long endTime,
                    Long current,
                    Long size,
                    Long recvWindow)
                    throws ApiException {
        return borrowRepayApi.queryBorrowRepayRecordsInMarginAccount(
                type, asset, isolatedSymbol, txId, startTime, endTime, current, size, recvWindow);
    }

    /**
     * Query Margin Interest Rate History (USER_DATA) Query Margin Interest Rate History Weight(IP):
     * 1 Security Type: USER_DATA
     *
     * @param asset (required)
     * @param vipLevel (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryMarginInterestRateHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Margin Interest Rate History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/borrow-repay#query-margin-interest-rate-history">Query
     *     Margin Interest Rate History (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryMarginInterestRateHistoryResponse> queryMarginInterestRateHistory(
            String asset, Long vipLevel, Long startTime, Long endTime, Long recvWindow)
            throws ApiException {
        return borrowRepayApi.queryMarginInterestRateHistory(
                asset, vipLevel, startTime, endTime, recvWindow);
    }

    /**
     * Query Max Borrow (USER_DATA) Query Max Borrow Weight(IP): 50 Security Type: USER_DATA Notes:
     * - If isolatedSymbol is not sent, crossed margin data will be sent. - &#x60;borrowLimit&#x60;
     * is also available from
     * [https://www.binance.com/en/margin-fee](https://www.binance.com/en/margin-fee)
     *
     * @param asset (required)
     * @param isolatedSymbol (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryMaxBorrowResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Max Borrow </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/borrow-repay#query-max-borrow">Query
     *     Max Borrow (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryMaxBorrowResponse> queryMaxBorrow(
            String asset, String isolatedSymbol, Long recvWindow) throws ApiException {
        return borrowRepayApi.queryMaxBorrow(asset, isolatedSymbol, recvWindow);
    }

    /**
     * Cross margin collateral ratio (MARKET_DATA) Cross margin collateral ratio Weight(IP): 100
     * Security Type: MARKET_DATA
     *
     * @return ApiResponse&lt;CrossMarginCollateralRatioResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cross margin collateral ratio </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/market-data#cross-margin-collateral-ratio">Cross
     *     margin collateral ratio (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<CrossMarginCollateralRatioResponse> crossMarginCollateralRatio()
            throws ApiException {
        return marketDataApi.crossMarginCollateralRatio();
    }

    /**
     * Get All Cross Margin Pairs (MARKET_DATA) Get All Cross Margin Pairs Weight(IP): 1 Security
     * Type: MARKET_DATA
     *
     * @param symbol (optional)
     * @return ApiResponse&lt;GetAllCrossMarginPairsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get All Cross Margin Pairs </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/market-data#get-all-cross-margin-pairs">Get
     *     All Cross Margin Pairs (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<GetAllCrossMarginPairsResponse> getAllCrossMarginPairs(String symbol)
            throws ApiException {
        return marketDataApi.getAllCrossMarginPairs(symbol);
    }

    /**
     * Get All Isolated Margin Symbol (MARKET_DATA) Get All Isolated Margin Symbol Weight(IP): 10
     * Security Type: MARKET_DATA
     *
     * @param symbol (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetAllIsolatedMarginSymbolResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get All Isolated Margin Symbol </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/market-data#get-all-isolated-margin-symbol">Get
     *     All Isolated Margin Symbol (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<GetAllIsolatedMarginSymbolResponse> getAllIsolatedMarginSymbol(
            String symbol, Long recvWindow) throws ApiException {
        return marketDataApi.getAllIsolatedMarginSymbol(symbol, recvWindow);
    }

    /**
     * Get All Margin Assets (MARKET_DATA) Get All Margin Assets. Weight(IP): 1 Security Type:
     * MARKET_DATA
     *
     * @param asset (optional)
     * @return ApiResponse&lt;GetAllMarginAssetsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get All Margin Assets </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/market-data#get-all-margin-assets">Get
     *     All Margin Assets (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<GetAllMarginAssetsResponse> getAllMarginAssets(String asset)
            throws ApiException {
        return marketDataApi.getAllMarginAssets(asset);
    }

    /**
     * Get Delist Schedule (MARKET_DATA) Get tokens or symbols delist schedule for cross margin and
     * isolated margin Weight(IP): 100 Security Type: MARKET_DATA
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetDelistScheduleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Delist Schedule </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/market-data#get-delist-schedule">Get
     *     Delist Schedule (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<GetDelistScheduleResponse> getDelistSchedule(Long recvWindow)
            throws ApiException {
        return marketDataApi.getDelistSchedule(recvWindow);
    }

    /**
     * Get Limit Price Pairs (MARKET_DATA) Query trading pairs with restriction on limit price
     * range. In margin trading, you can place orders with limit price. Limit price should be within
     * (-15%, 15%) of current index price for a list of margin trading pairs. This rule only impacts
     * limit sell orders with limit price that is lower than current index price and limit buy
     * orders with limit price that is higher than current index price. - Buy order: Your order will
     * be rejected with an error message notification if the limit price is 15% above the index
     * price. - Sell order: Your order will be rejected with an error message notification if the
     * limit price is 15% below the index price. Please review the limit price order placing
     * strategy, backtest and calibrate the planned order size with the trading volume and order
     * book depth to prevent trading loss. Weight(IP): 1 Security Type: MARKET_DATA
     *
     * @return ApiResponse&lt;GetLimitPricePairsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Limit Price Pairs </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/market-data#get-limit-price-pairs">Get
     *     Limit Price Pairs (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<GetLimitPricePairsResponse> getLimitPricePairs() throws ApiException {
        return marketDataApi.getLimitPricePairs();
    }

    /**
     * Get list Schedule (MARKET_DATA) Get the upcoming tokens or symbols listing schedule for Cross
     * Margin and Isolated Margin. Weight(IP): 100 Security Type: MARKET_DATA
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetListScheduleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get list Schedule </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/market-data#get-list-schedule">Get
     *     list Schedule (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<GetListScheduleResponse> getListSchedule(Long recvWindow)
            throws ApiException {
        return marketDataApi.getListSchedule(recvWindow);
    }

    /**
     * Get Margin Asset Risk-Based Liquidation Ratio (MARKET_DATA) Get Margin Asset Risk-Based
     * Liquidation Ratio Weight(IP): 1 Security Type: MARKET_DATA
     *
     * @return ApiResponse&lt;GetMarginAssetRiskBasedLiquidationRatioResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Margin Asset Risk-Based Liquidation Ratio </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/market-data#get-margin-asset-risk-based-liquidation-ratio">Get
     *     Margin Asset Risk-Based Liquidation Ratio (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<GetMarginAssetRiskBasedLiquidationRatioResponse>
            getMarginAssetRiskBasedLiquidationRatio() throws ApiException {
        return marketDataApi.getMarginAssetRiskBasedLiquidationRatio();
    }

    /**
     * Get Margin Restricted Assets (MARKET_DATA) Get the list of margin-restricted assets.
     * Weight(IP): 1 Security Type: MARKET_DATA
     *
     * @return ApiResponse&lt;GetMarginRestrictedAssetsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Margin Restricted Assets </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/market-data#get-margin-restricted-assets">Get
     *     Margin Restricted Assets (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<GetMarginRestrictedAssetsResponse> getMarginRestrictedAssets()
            throws ApiException {
        return marketDataApi.getMarginRestrictedAssets();
    }

    /**
     * Query Isolated Margin Tier Data (USER_DATA) Get isolated margin tier data collection with any
     * tier as https://www.binance.com/en/margin-data Weight(IP): 1 Security Type: USER_DATA
     *
     * @param symbol (required)
     * @param tier (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryIsolatedMarginTierDataResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Isolated Margin Tier Data </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/market-data#query-isolated-margin-tier-data">Query
     *     Isolated Margin Tier Data (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryIsolatedMarginTierDataResponse> queryIsolatedMarginTierData(
            String symbol, Long tier, Long recvWindow) throws ApiException {
        return marketDataApi.queryIsolatedMarginTierData(symbol, tier, recvWindow);
    }

    /**
     * Query Liability Coin Leverage Bracket in Cross Margin Pro Mode (MARKET_DATA) Liability Coin
     * Leverage Bracket in Cross Margin Pro Mode Weight(IP): 1 Security Type: MARKET_DATA
     *
     * @return ApiResponse&lt;QueryLiabilityCoinLeverageBracketInCrossMarginProModeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Liability Coin Leverage Bracket in Cross Margin Pro Mode </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/market-data#query-liability-coin-leverage-bracket-in-cross-margin-pro-mode">Query
     *     Liability Coin Leverage Bracket in Cross Margin Pro Mode (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<QueryLiabilityCoinLeverageBracketInCrossMarginProModeResponse>
            queryLiabilityCoinLeverageBracketInCrossMarginProMode() throws ApiException {
        return marketDataApi.queryLiabilityCoinLeverageBracketInCrossMarginProMode();
    }

    /**
     * Query Margin Available Inventory (USER_DATA) Margin available Inventory query Weight(UID): 50
     * Security Type: USER_DATA
     *
     * @param type (required)
     * @return ApiResponse&lt;QueryMarginAvailableInventoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Margin Available Inventory </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/market-data#query-margin-available-inventory">Query
     *     Margin Available Inventory (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryMarginAvailableInventoryResponse> queryMarginAvailableInventory(
            OrderType type) throws ApiException {
        return marketDataApi.queryMarginAvailableInventory(type);
    }

    /**
     * Query Margin PriceIndex (MARKET_DATA) Query Margin PriceIndex Weight(IP): 10 Security Type:
     * MARKET_DATA
     *
     * @param symbol (required)
     * @return ApiResponse&lt;QueryMarginPriceindexResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Margin PriceIndex </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/market-data#query-margin-priceindex">Query
     *     Margin PriceIndex (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<QueryMarginPriceindexResponse> queryMarginPriceindex(String symbol)
            throws ApiException {
        return marketDataApi.queryMarginPriceindex(symbol);
    }

    /**
     * Create Special Key(Low-Latency Trading) (TRADE) **Eligibility** - Binance Margin offers
     * low-latency trading through a [special
     * key](https://www.binance.com/en/support/faq/frequently-asked-questions-on-margin-special-api-key-3208663e900d4d2e9fec4140e1832f4e),
     * available exclusively to users with VIP level 7 or higher. - If you are VIP level 6 or below,
     * please contact your VIP manager for eligibility criterias. - All new Margin Special Key users
     * are required to read, understand, and agree to the Margin Special Key Supplemental Product
     * Terms at the master account level before creating a Margin Special Key. - Once signed at the
     * master account level, the agreement applies to all sub-accounts. The master account and all
     * sub-accounts (Cross Margin Classic and Portfolio Margin Pro) are authorized to create a
     * Margin Special Key and are subject to the LiquidationLoan policy. For more information,
     * please refer to
     * [FAQ](https://www.binance.com/en/support/faq/detail/3208663e900d4d2e9fec4140e1832f4e).
     * **Supported Products:** - Cross Margin - Isolated Margin - Portfolio Margin Pro **Unsupported
     * Products:** - Portfolio Margin We support several types of API keys: * Ed25519 (recommended)
     * * HMAC * RSA We recommend to **use Ed25519 API keys** as it should provide the best
     * performance and security out of all supported key types. We accept PKCS#8 (BEGIN PUBLIC KEY).
     * For how to generate an RSA key pair to send API requests on Binance. Please refer to the
     * document below
     * [FAQ](https://www.binance.com/en/support/faq/how-to-generate-an-rsa-key-pair-to-send-api-requests-on-binance-2b79728f331e43079b27440d9d15c5db)
     * . **How to use the Margin Special Key** - Use the below &#x60;sapi&#x60; endpoint to create
     * your margin special API Key. - For accessing the Cross Margin account, do not send the
     * &#x60;symbol&#x60; parameter. - For accessing the Isolated Margin account(s), pass the
     * relevant &#x60;symbol&#x60; parameter in the API Key creation request. - Use the generated
     * API Key (and Secret key, if applicable) to perform margin trading and listenKey generation
     * via **Spot** REST API (&#x60;https://api.binance.com/api/v3/_*&#x60;) endpoints. Read [REST
     * API](/products/spot/rest-api#signed-trade-and-user_data-endpoint-security) or [WebSocket
     * API](/products/spot/web-socket-api#request-security) documentation to learn how to use
     * different API keys You need to enable Permits “Enable Spot &amp; Margin Trading” option for
     * the API Key which requests this endpoint. Weight(UID): 1 Security Type: TRADE Response Notes:
     * - Error Code Description - **UNSUPPORTED_OPERATION** : Portfolio Margin is an unsupported
     * product, please change the account type to a supported margin product. - **Forbidden**: Cross
     * Margin Pro accounts require additional agreements, please contact your relationship manager.
     *
     * @param createSpecialKeyRequest (required)
     * @return ApiResponse&lt;CreateSpecialKeyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Create Special Key </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#create-special-key">Create
     *     Special Key(Low-Latency Trading) (TRADE) Documentation</a>
     */
    public ApiResponse<CreateSpecialKeyResponse> createSpecialKey(
            CreateSpecialKeyRequest createSpecialKeyRequest) throws ApiException {
        return tradeApi.createSpecialKey(createSpecialKeyRequest);
    }

    /**
     * Delete Special Key(Low-Latency Trading) (TRADE) Deleting your Margin Special Key alone does
     * not exit you from the Margin Special Key framework or discharge your obligations under the
     * Margin Special Key Supplemental Product Terms. To fully exit, you must: 1. Delete your Margin
     * Special Key. 2. Ensure there are no outstanding liabilities on the account. 3. Call the Exit
     * Margin Special Key API endpoint. 4. Confirm the exit status via the API response. Only after
     * step 4 is completed and the exit status is confirmed by Binance will your account revert to
     * standard liquidation logic and no longer be subject to the Margin Special Key Supplemental
     * Product Terms. If apiKey is given, apiName will be ignored. If apiName is given with no
     * apiKey, all apikeys with given apiName will be deleted. You need to enable Permits “Enable
     * Spot &amp; Margin” option for the API Key which requests this endpoint. Weight(UID): 1
     * Security Type: TRADE
     *
     * @param apiName (optional)
     * @param symbol (optional)
     * @param recvWindow (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#delete-special-key">Delete
     *     Special Key(Low-Latency Trading) (TRADE) Documentation</a>
     */
    public void deleteSpecialKey(String apiName, String symbol, Long recvWindow)
            throws ApiException {
        tradeApi.deleteSpecialKey(apiName, symbol, recvWindow);
    }

    /**
     * Edit ip for Special Key(Low-Latency Trading) (TRADE) Edit ip restriction. This only applies
     * to Special Key for Low Latency Trading. You need to enable Permits “Enable Spot &amp; Margin”
     * option for the API Key which requests this endpoint. Weight(UID): 1 Security Type: TRADE
     *
     * @param editIpForSpecialKeyRequest (required)
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#edit-ip-for-special-key">Edit
     *     ip for Special Key(Low-Latency Trading) (TRADE) Documentation</a>
     */
    public void editIpForSpecialKey(EditIpForSpecialKeyRequest editIpForSpecialKeyRequest)
            throws ApiException {
        tradeApi.editIpForSpecialKey(editIpForSpecialKeyRequest);
    }

    /**
     * Exit Special Key Mode (TRADE) Exit the Margin Special Key mode for Cross Margin Classic
     * accounts. **All outstanding liabilities under the Cross Margin Classic account must be fully
     * repaid before calling this endpoint.** Deleting the Margin Special Key alone does not
     * constitute a valid exit. When a user creates a Margin Special API Key, the account enters
     * \&quot;Special Key Mode\&quot;. Upon a successful request, the following actions will be
     * performed atomically: 1. All existing Margin Special API Keys under the Cross Margin Classic
     * mode account will be deleted. 2. All pre-execution margin checks (including Open-order-loss
     * calculation) will revert to standard mode. 3. A cooldown period (default: 24 hours) will be
     * enforced, during which the account will not be permitted to create new Margin Special API
     * Keys. For more information, please refer to
     * [FAQ](https://www.binance.com/en/support/faq/detail/3208663e900d4d2e9fec4140e1832f4e).
     * **Preconditions:** The following conditions must be met; otherwise the request will be
     * rejected: - Account type must be **Cross Margin Classic**. - Account must currently be in
     * **Special Key Mode**. If not, the request silently succeeds. - Account must **not be in
     * liquidation**. - Account must **have no liability**. You need to enable \&quot;Permits Enable
     * Spot &amp; Margin Trading\&quot; option for the API Key which requests this endpoint.
     * Weight(UID): 10 Security Type: TRADE
     *
     * @param exitSpecialKeyModeRequest (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Exit Special Key Mode </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#exit-special-key-mode">Exit
     *     Special Key Mode (TRADE) Documentation</a>
     */
    public ApiResponse<Object> exitSpecialKeyMode(
            ExitSpecialKeyModeRequest exitSpecialKeyModeRequest) throws ApiException {
        return tradeApi.exitSpecialKeyMode(exitSpecialKeyModeRequest);
    }

    /**
     * Get Force Liquidation Record (USER_DATA) Get Force Liquidation Record Weight(IP): 1 Security
     * Type: USER_DATA Notes: - Response in descending order
     *
     * @param startTime (optional)
     * @param endTime (optional)
     * @param isolatedSymbol (optional)
     * @param current (optional)
     * @param size (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetForceLiquidationRecordResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Force Liquidation Record </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#get-force-liquidation-record">Get
     *     Force Liquidation Record (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetForceLiquidationRecordResponse> getForceLiquidationRecord(
            Long startTime,
            Long endTime,
            String isolatedSymbol,
            Long current,
            Long size,
            Long recvWindow)
            throws ApiException {
        return tradeApi.getForceLiquidationRecord(
                startTime, endTime, isolatedSymbol, current, size, recvWindow);
    }

    /**
     * Get Small Liability Exchange Coin List (USER_DATA) Query the coins which can be small
     * liability exchange Weight(IP): 100 Security Type: USER_DATA
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetSmallLiabilityExchangeCoinListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Small Liability Exchange Coin List </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#get-small-liability-exchange-coin-list">Get
     *     Small Liability Exchange Coin List (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetSmallLiabilityExchangeCoinListResponse> getSmallLiabilityExchangeCoinList(
            Long recvWindow) throws ApiException {
        return tradeApi.getSmallLiabilityExchangeCoinList(recvWindow);
    }

    /**
     * Get Small Liability Exchange History (USER_DATA) Get Small liability Exchange History
     * Weight(UID): 100 Security Type: USER_DATA
     *
     * @param current (required)
     * @param size (required)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetSmallLiabilityExchangeHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Small Liability Exchange History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#get-small-liability-exchange-history">Get
     *     Small Liability Exchange History (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetSmallLiabilityExchangeHistoryResponse> getSmallLiabilityExchangeHistory(
            Long current, Long size, Long startTime, Long endTime, Long recvWindow)
            throws ApiException {
        return tradeApi.getSmallLiabilityExchangeHistory(
                current, size, startTime, endTime, recvWindow);
    }

    /**
     * Liquidation Loan Repay (MARGIN) Repays the outstanding cross-margin liquidation loan from the
     * user&#39;s spot wallet. A liquidation loan represents the account deficit incurred when
     * account equity turns negative during liquidation (bankruptcy). The repayment amount must be
     * greater than 0 and cannot exceed the remaining loan balance. If the Spot Account has
     * insufficient USDC balance, the repayment will fail. Weight(UID): 100 Security Type: MARGIN
     *
     * @param liquidationLoanRepayRequest (required)
     * @return ApiResponse&lt;LiquidationLoanRepayResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Liquidation Loan Repay </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#liquidation-loan-repay">Liquidation
     *     Loan Repay (MARGIN) Documentation</a>
     */
    public ApiResponse<LiquidationLoanRepayResponse> liquidationLoanRepay(
            LiquidationLoanRepayRequest liquidationLoanRepayRequest) throws ApiException {
        return tradeApi.liquidationLoanRepay(liquidationLoanRepayRequest);
    }

    /**
     * Margin Account Cancel all Open Orders on a Symbol (TRADE) Cancels all active orders on a
     * symbol for margin account.&lt;br&gt;&lt;/br&gt; This includes OCO orders. Weight(IP): 1
     * Security Type: TRADE
     *
     * @param symbol (required)
     * @param isIsolated (optional, default to FALSE)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;MarginAccountCancelAllOpenOrdersOnASymbolResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Margin Account Cancel all Open Orders on a Symbol </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#margin-account-cancel-all-open-orders-on-asymbol">Margin
     *     Account Cancel all Open Orders on a Symbol (TRADE) Documentation</a>
     */
    public ApiResponse<MarginAccountCancelAllOpenOrdersOnASymbolResponse>
            marginAccountCancelAllOpenOrdersOnASymbol(
                    String symbol, IsIsolated isIsolated, Long recvWindow) throws ApiException {
        return tradeApi.marginAccountCancelAllOpenOrdersOnASymbol(symbol, isIsolated, recvWindow);
    }

    /**
     * Margin Account Cancel OCO (TRADE) Cancel an entire Order List for a margin account.
     * Weight(UID): 1 Security Type: TRADE Notes: - Canceling an individual leg will cancel the
     * entire OCO
     *
     * @param symbol (required)
     * @param isIsolated (optional, default to FALSE)
     * @param orderListId (optional)
     * @param listClientOrderId (optional)
     * @param newClientOrderId (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;MarginAccountCancelOcoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Margin Account Cancel OCO </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#margin-account-cancel-oco">Margin
     *     Account Cancel OCO (TRADE) Documentation</a>
     */
    public ApiResponse<MarginAccountCancelOcoResponse> marginAccountCancelOco(
            String symbol,
            IsIsolated isIsolated,
            Long orderListId,
            String listClientOrderId,
            String newClientOrderId,
            Long recvWindow)
            throws ApiException {
        return tradeApi.marginAccountCancelOco(
                symbol, isIsolated, orderListId, listClientOrderId, newClientOrderId, recvWindow);
    }

    /**
     * Margin Account Cancel Order (TRADE) Cancel an active order for margin account. Weight(IP): 10
     * Security Type: TRADE Notes: - Either orderId or origClientOrderId must be sent.
     *
     * @param symbol (required)
     * @param isIsolated (optional, default to FALSE)
     * @param orderId (optional)
     * @param origClientOrderId (optional)
     * @param newClientOrderId (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;MarginAccountCancelOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Margin Account Cancel Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#margin-account-cancel-order">Margin
     *     Account Cancel Order (TRADE) Documentation</a>
     */
    public ApiResponse<MarginAccountCancelOrderResponse> marginAccountCancelOrder(
            String symbol,
            IsIsolated isIsolated,
            Long orderId,
            String origClientOrderId,
            String newClientOrderId,
            Long recvWindow)
            throws ApiException {
        return tradeApi.marginAccountCancelOrder(
                symbol, isIsolated, orderId, origClientOrderId, newClientOrderId, recvWindow);
    }

    /**
     * Margin Account New OCO (TRADE) Send in a new OCO for a margin account Weight: 6(UID) or
     * 1500(UID) when sideEffectType is MARGIN_BUY or AUTO_BORROW_REPAY Security Type: TRADE Notes:
     * - autoRepayAtCancel is suggested to set as “FALSE” to keep liability unrepaid under high
     * frequent new order/cancel order execution
     *
     * @param marginAccountNewOcoRequest (required)
     * @return ApiResponse&lt;MarginAccountNewOcoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Margin Account New OCO </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#margin-account-new-oco">Margin
     *     Account New OCO (TRADE) Documentation</a>
     */
    public ApiResponse<MarginAccountNewOcoResponse> marginAccountNewOco(
            MarginAccountNewOcoRequest marginAccountNewOcoRequest) throws ApiException {
        return tradeApi.marginAccountNewOco(marginAccountNewOcoRequest);
    }

    /**
     * Margin Account New Order (TRADE) Post a new order for margin account. Weight: 6(UID) or
     * 1500(UID) when sideEffectType is MARGIN_BUY or AUTO_BORROW_REPAY Security Type: TRADE Notes:
     * - autoRepayAtCancel is suggested to set as “FALSE” to keep liability unrepaid under high
     * frequent new order/cancel order execution
     *
     * @param marginAccountNewOrderRequest (required)
     * @return ApiResponse&lt;MarginAccountNewOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Margin Account New Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#margin-account-new-order">Margin
     *     Account New Order (TRADE) Documentation</a>
     */
    public ApiResponse<MarginAccountNewOrderResponse> marginAccountNewOrder(
            MarginAccountNewOrderRequest marginAccountNewOrderRequest) throws ApiException {
        return tradeApi.marginAccountNewOrder(marginAccountNewOrderRequest);
    }

    /**
     * Margin Account New OTO (TRADE) Post a new OTO order for margin account: - An OTO
     * (One-Triggers-the-Other) is an order list comprised of 2 orders. - The first order is called
     * the **working order** and must be &#x60;LIMIT&#x60; or &#x60;LIMIT_MAKER&#x60;. Initially,
     * only the working order goes on the order book. - The second order is called the **pending
     * order**. It can be any order type except for &#x60;MARKET&#x60; orders using parameter
     * &#x60;quoteOrderQty&#x60;. The pending order is only placed on the order book when the
     * working order gets **fully filled**. - If either the working order or the pending order is
     * cancelled individually, the other order in the order list will also be canceled or expired. -
     * When the order list is placed, if the working order gets **immediately fully filled**, the
     * placement response will show the working order as &#x60;FILLED&#x60; but the pending order
     * will still appear as &#x60;PENDING_NEW&#x60;. You need to query the status of the pending
     * order again to see its updated status. - OTOs add **2 orders** to the unfilled order count,
     * &#x60;EXCHANGE_MAX_NUM_ORDERS&#x60; filter and &#x60;MAX_NUM_ORDERS&#x60; filter. Weight:
     * 6(UID) or 1500(UID) when sideEffectType is MARGIN_BUY or AUTO_BORROW_REPAY Security Type:
     * TRADE Notes: - autoRepayAtCancel is suggested to set as “FALSE” to keep liability unrepaid
     * under high frequent new order/cancel order execution - Depending on the
     * &#x60;pendingType&#x60; or &#x60;workingType&#x60;, some optional - parameters will become
     * mandatory: | Type | Additional mandatory parameters | Additional information | |
     * -------------------------------------------------------- |
     * ------------------------------------------------------------ | ---------------------- | |
     * &#x60;workingType&#x60; &#x3D; &#x60;LIMIT&#x60; | &#x60;workingTimeInForce&#x60; | | |
     * &#x60;pendingType&#x60; &#x3D; &#x60;LIMIT&#x60; | &#x60;pendingPrice&#x60;,
     * &#x60;pendingTimeInForce&#x60; | | | &#x60;pendingType&#x60; &#x3D; &#x60;STOP_LOSS&#x60; or
     * &#x60;TAKE_PROFIT&#x60; | &#x60;pendingStopPrice&#x60; and/or
     * &#x60;pendingTrailingDelta&#x60; | | | &#x60;pendingType&#x60; &#x3D;
     * &#x60;STOP_LOSS_LIMIT&#x60; or &#x60;TAKE_PROFIT_LIMIT&#x60; | &#x60;pendingPrice&#x60;,
     * &#x60;pendingStopPrice&#x60; and/or &#x60;pendingTrailingDelta&#x60;,
     * &#x60;pendingTimeInForce&#x60; | | | &#x60;pendingTrailingDelta&#x60; is provided |
     * &#x60;pendingPrice&#x60; | |
     *
     * @param marginAccountNewOtoRequest (required)
     * @return ApiResponse&lt;MarginAccountNewOtoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Margin Account New OTO </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#margin-account-new-oto">Margin
     *     Account New OTO (TRADE) Documentation</a>
     */
    public ApiResponse<MarginAccountNewOtoResponse> marginAccountNewOto(
            MarginAccountNewOtoRequest marginAccountNewOtoRequest) throws ApiException {
        return tradeApi.marginAccountNewOto(marginAccountNewOtoRequest);
    }

    /**
     * Margin Account New OTOCO (TRADE) Post a new OTOCO order for margin account： - An OTOCO
     * (One-Triggers-One-Cancels-the-Other) is an order list comprised of 3 orders. - The first
     * order is called the **working order** and must be &#x60;LIMIT&#x60; or
     * &#x60;LIMIT_MAKER&#x60;. Initially, only the working order goes on the order book. - The
     * behavior of the working order is the same as the OTO. - OTOCO has 2 pending orders (pending
     * above and pending below), forming an OCO pair. The pending orders are only placed on the
     * order book when the working order gets **fully filled**. - The rules of the pending above and
     * pending below follow the same rules as the [Order List
     * OCO](https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#margin-account-new-oco).
     * - OTOCOs add **3 orders** against the unfilled order count,
     * &#x60;EXCHANGE_MAX_NUM_ORDERS&#x60; filter, and &#x60;MAX_NUM_ORDERS&#x60; filter. Weight:
     * 6(UID) or 1500(UID) when sideEffectType is MARGIN_BUY or AUTO_BORROW_REPAY Security Type:
     * TRADE Notes: - autoRepayAtCancel is suggested to set as “FALSE” to keep liability unrepaid
     * under high frequent new order/cancel order execution - Depending on the
     * &#x60;pendingAboveType&#x60;/&#x60;pendingBelowType&#x60; or &#x60;workingType&#x60;, some
     * optional parameters will become mandatory: | Type | Additional mandatory parameters |
     * Additional information | | ------------------------------------ |
     * ------------------------------------------------------------ | ---------------------- | |
     * &#x60;workingType&#x60; &#x3D; &#x60;LIMIT&#x60; | &#x60;workingTimeInForce&#x60; | | |
     * &#x60;pendingAboveType&#x60;&#x3D; &#x60;LIMIT_MAKER&#x60; | &#x60;pendingAbovePrice&#x60; |
     * | | &#x60;pendingAboveType&#x60;&#x3D; &#x60;STOP_LOSS&#x60; |
     * &#x60;pendingAboveStopPrice&#x60; and/or &#x60;pendingAboveTrailingDelta&#x60; | | |
     * &#x60;pendingAboveType&#x60;&#x3D;&#x60;STOP_LOSS_LIMIT&#x60; |
     * &#x60;pendingAbovePrice&#x60;, &#x60;pendingAboveStopPrice&#x60; and/or
     * &#x60;pendingAboveTrailingDelta&#x60;, &#x60;pendingAboveTimeInForce&#x60; | | |
     * &#x60;pendingBelowType&#x60;&#x3D; &#x60;LIMIT_MAKER&#x60; | &#x60;pendingBelowPrice&#x60; |
     * | | &#x60;pendingBelowType&#x60;&#x3D; &#x60;STOP_LOSS&#x60; |
     * &#x60;pendingBelowStopPrice&#x60; and/or &#x60;pendingBelowTrailingDelta&#x60; | | |
     * &#x60;pendingBelowType&#x60;&#x3D;&#x60;STOP_LOSS_LIMIT&#x60; |
     * &#x60;pendingBelowPrice&#x60;, &#x60;pendingBelowStopPrice&#x60; and/or
     * &#x60;pendingBelowTrailingDelta&#x60;, &#x60;pendingBelowTimeInForce&#x60; | | |
     * &#x60;pendingAboveTrailingDelta&#x60; is provided | &#x60;pendingAbovePrice&#x60; | | |
     * &#x60;pendingBelowTrailingDelta&#x60; is provided | &#x60;pendingBelowPrice&#x60; | |
     *
     * @param marginAccountNewOtocoRequest (required)
     * @return ApiResponse&lt;MarginAccountNewOtocoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Margin Account New OTOCO </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#margin-account-new-otoco">Margin
     *     Account New OTOCO (TRADE) Documentation</a>
     */
    public ApiResponse<MarginAccountNewOtocoResponse> marginAccountNewOtoco(
            MarginAccountNewOtocoRequest marginAccountNewOtocoRequest) throws ApiException {
        return tradeApi.marginAccountNewOtoco(marginAccountNewOtocoRequest);
    }

    /**
     * Margin Manual Liquidation (TRADE) Margin Manual Liquidation Weight(UID): 3000 Security Type:
     * TRADE Notes: - This endpoint supports Cross Margin Classic Mode and Pro Mode. - Isolated
     * Margin is only supported in restricted regions.
     *
     * @param marginManualLiquidationRequest (required)
     * @return ApiResponse&lt;MarginManualLiquidationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Margin Manual Liquidation </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#margin-manual-liquidation">Margin
     *     Manual Liquidation (TRADE) Documentation</a>
     */
    public ApiResponse<MarginManualLiquidationResponse> marginManualLiquidation(
            MarginManualLiquidationRequest marginManualLiquidationRequest) throws ApiException {
        return tradeApi.marginManualLiquidation(marginManualLiquidationRequest);
    }

    /**
     * Query Current Margin Order Count Usage (TRADE) Displays the user&#39;s current margin order
     * count usage for all intervals. Weight(IP): 20 Security Type: TRADE
     *
     * @param isIsolated (optional, default to FALSE)
     * @param symbol (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryCurrentMarginOrderCountUsageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Current Margin Order Count Usage </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#query-current-margin-order-count-usage">Query
     *     Current Margin Order Count Usage (TRADE) Documentation</a>
     */
    public ApiResponse<QueryCurrentMarginOrderCountUsageResponse> queryCurrentMarginOrderCountUsage(
            IsIsolated isIsolated, String symbol, Long recvWindow) throws ApiException {
        return tradeApi.queryCurrentMarginOrderCountUsage(isIsolated, symbol, recvWindow);
    }

    /**
     * Query Liquidation Loan (USER_DATA) Query the current user&#39;s cross-margin liquidation loan
     * information, including the original loan amount, repaid amount, and remaining amount. When a
     * cross-margin account is liquidated and the account equity turns negative (bankruptcy), the
     * system generates a liquidation loan record representing the deficit. This represents the
     * shortfall amount denominated in USDC. Weight(UID): 100 Security Type: USER_DATA
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryLiquidationLoanResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Query Liquidation Loan </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#query-liquidation-loan">Query
     *     Liquidation Loan (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryLiquidationLoanResponse> queryLiquidationLoan(Long recvWindow)
            throws ApiException {
        return tradeApi.queryLiquidationLoan(recvWindow);
    }

    /**
     * Query Liquidation Loan Repay History (USER_DATA) Query the repayment history of cross-margin
     * liquidation loans (deficit caused by bankruptcy during liquidation). Supports time-range
     * filtering and pagination. Weight(UID): 100 Security Type: USER_DATA Notes: - The maximum
     * query range is 90 days. If &#x60;startTime&#x60; is earlier than 90 days ago, it will be
     * clamped to 90 days ago. - Only records with status &#x60;SUCCESS&#x60; or &#x60;PENDING&#x60;
     * are returned. Failed repayment records are excluded.
     *
     * @param startTime Start time in Unix timestamp (milliseconds). Defaults to 7 days ago if not
     *     specified (optional)
     * @param endTime End time in Unix timestamp (milliseconds). Defaults to now if not specified
     *     (optional)
     * @param current Current page number, default &#x60;1&#x60; (optional)
     * @param size Page size, default &#x60;50&#x60; (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryLiquidationLoanRepayHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Query Liquidation Loan Repay History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#query-liquidation-loan-repay-history">Query
     *     Liquidation Loan Repay History (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryLiquidationLoanRepayHistoryResponse> queryLiquidationLoanRepayHistory(
            Long startTime, Long endTime, Long current, Long size, Long recvWindow)
            throws ApiException {
        return tradeApi.queryLiquidationLoanRepayHistory(
                startTime, endTime, current, size, recvWindow);
    }

    /**
     * Query Margin Account&#39;s all OCO (USER_DATA) Retrieves all OCO for a specific margin
     * account based on provided optional parameters Weight(IP): 200 Security Type: USER_DATA
     *
     * @param isIsolated (optional, default to FALSE)
     * @param symbol (optional)
     * @param fromId (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryMarginAccountsAllOcoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Margin Account&#39;s all OCO </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#query-margin-accounts-all-oco">Query
     *     Margin Account&#39;s all OCO (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryMarginAccountsAllOcoResponse> queryMarginAccountsAllOco(
            IsIsolated isIsolated,
            String symbol,
            Long fromId,
            Long startTime,
            Long endTime,
            Long limit,
            Long recvWindow)
            throws ApiException {
        return tradeApi.queryMarginAccountsAllOco(
                isIsolated, symbol, fromId, startTime, endTime, limit, recvWindow);
    }

    /**
     * Query Margin Account&#39;s All Orders (USER_DATA) Query Margin Account&#39;s All Orders
     * Weight(IP): 200 Security Type: USER_DATA Notes: - If orderId is set, it will get orders
     * &gt;&#x3D; that orderId. Otherwise the orders within 24 hours are returned. - For some
     * historical orders cummulativeQuoteQty will be &lt; 0, meaning the data is not available at
     * this time. - Less than 24 hours between startTime and endTime.
     *
     * @param symbol (required)
     * @param isIsolated (optional, default to FALSE)
     * @param orderId (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryMarginAccountsAllOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Margin Account&#39;s All Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#query-margin-accounts-all-orders">Query
     *     Margin Account&#39;s All Orders (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryMarginAccountsAllOrdersResponse> queryMarginAccountsAllOrders(
            String symbol,
            IsIsolated isIsolated,
            Long orderId,
            Long startTime,
            Long endTime,
            Long limit,
            Long recvWindow)
            throws ApiException {
        return tradeApi.queryMarginAccountsAllOrders(
                symbol, isIsolated, orderId, startTime, endTime, limit, recvWindow);
    }

    /**
     * Query Margin Account&#39;s OCO (USER_DATA) Retrieves a specific OCO based on provided
     * optional parameters Weight(IP): 10 Security Type: USER_DATA
     *
     * @param isIsolated (optional, default to FALSE)
     * @param symbol (optional)
     * @param orderListId (optional)
     * @param origClientOrderId (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryMarginAccountsOcoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Margin Account&#39;s OCO </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#query-margin-accounts-oco">Query
     *     Margin Account&#39;s OCO (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryMarginAccountsOcoResponse> queryMarginAccountsOco(
            IsIsolated isIsolated,
            String symbol,
            Long orderListId,
            String origClientOrderId,
            Long recvWindow)
            throws ApiException {
        return tradeApi.queryMarginAccountsOco(
                isIsolated, symbol, orderListId, origClientOrderId, recvWindow);
    }

    /**
     * Query Margin Account&#39;s Open OCO (USER_DATA) Query Margin Account&#39;s Open OCO
     * Weight(IP): 10 Security Type: USER_DATA
     *
     * @param isIsolated (optional, default to FALSE)
     * @param symbol (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryMarginAccountsOpenOcoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Margin Account&#39;s Open OCO </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#query-margin-accounts-open-oco">Query
     *     Margin Account&#39;s Open OCO (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryMarginAccountsOpenOcoResponse> queryMarginAccountsOpenOco(
            IsIsolated isIsolated, String symbol, Long recvWindow) throws ApiException {
        return tradeApi.queryMarginAccountsOpenOco(isIsolated, symbol, recvWindow);
    }

    /**
     * Query Margin Account&#39;s Open Orders (USER_DATA) Query Margin Account&#39;s Open Orders
     * Weight(IP): 10 Security Type: USER_DATA Notes: - If the symbol is not sent, orders for all
     * symbols will be returned in an array. - When all symbols are returned, the number of requests
     * counted against the rate limiter is equal to the number of symbols currently trading on the
     * exchange. - If isIsolated &#x3D;\&quot;TRUE\&quot;, symbol must be sent.
     *
     * @param symbol isolated margin pair (optional)
     * @param isIsolated (optional, default to FALSE)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryMarginAccountsOpenOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Margin Account&#39;s Open Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#query-margin-accounts-open-orders">Query
     *     Margin Account&#39;s Open Orders (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryMarginAccountsOpenOrdersResponse> queryMarginAccountsOpenOrders(
            String symbol, IsIsolated isIsolated, Long recvWindow) throws ApiException {
        return tradeApi.queryMarginAccountsOpenOrders(symbol, isIsolated, recvWindow);
    }

    /**
     * Query Margin Account&#39;s Order (USER_DATA) Query Margin Account&#39;s Order Weight(IP): 10
     * Security Type: USER_DATA Notes: - Either orderId or origClientOrderId must be sent. - For
     * some historical orders cummulativeQuoteQty will be &lt; 0, meaning the data is not available
     * at this time.
     *
     * @param symbol (required)
     * @param isIsolated (optional, default to FALSE)
     * @param orderId (optional)
     * @param origClientOrderId (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryMarginAccountsOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Margin Account&#39;s Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#query-margin-accounts-order">Query
     *     Margin Account&#39;s Order (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryMarginAccountsOrderResponse> queryMarginAccountsOrder(
            String symbol,
            IsIsolated isIsolated,
            Long orderId,
            String origClientOrderId,
            Long recvWindow)
            throws ApiException {
        return tradeApi.queryMarginAccountsOrder(
                symbol, isIsolated, orderId, origClientOrderId, recvWindow);
    }

    /**
     * Query Margin Account&#39;s Trade List (USER_DATA) Query Margin Account&#39;s Trade List
     * Weight(IP): 10 Security Type: USER_DATA Notes: - If fromId is set, it will get trades
     * &gt;&#x3D; that fromId. Otherwise the trades within 24 hours are returned. - Less than 24
     * hours between startTime and endTime.
     *
     * @param symbol (required)
     * @param isIsolated (optional, default to FALSE)
     * @param orderId (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param fromId (optional)
     * @param limit (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryMarginAccountsTradeListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Margin Account&#39;s Trade List </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#query-margin-accounts-trade-list">Query
     *     Margin Account&#39;s Trade List (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryMarginAccountsTradeListResponse> queryMarginAccountsTradeList(
            String symbol,
            IsIsolated isIsolated,
            Long orderId,
            Long startTime,
            Long endTime,
            Long fromId,
            Long limit,
            Long recvWindow)
            throws ApiException {
        return tradeApi.queryMarginAccountsTradeList(
                symbol, isIsolated, orderId, startTime, endTime, fromId, limit, recvWindow);
    }

    /**
     * Query Prevented Matches (USER_DATA) Displays the list of orders that were expired due to STP.
     * (Self-Trade Prevention). Weight(IP): 10 Security Type: USER_DATA Notes: - Supported parameter
     * combinations: - &#x60;symbol&#x60; + &#x60;preventedMatchId&#x60; - &#x60;symbol&#x60; +
     * &#x60;orderId&#x60; - &#x60;symbol&#x60; + &#x60;orderId&#x60; +
     * &#x60;fromPreventedMatchId&#x60; - If &#x60;orderId&#x60; is provided, all prevented matches
     * for that order will be returned. - If &#x60;preventedMatchId&#x60; is provided, the specific
     * prevented match will be returned. - A single request returns a maximum of 500 records. If
     * there are more than 500 records, use &#x60;symbol&#x60; + &#x60;orderId&#x60; +
     * &#x60;fromPreventedMatchId&#x60; combination for pagination.
     *
     * @param symbol (required)
     * @param preventedMatchId (optional)
     * @param orderId (optional)
     * @param fromPreventedMatchId (optional)
     * @param isIsolated (optional, default to FALSE)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryPreventedMatchesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Prevented Matches </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#query-prevented-matches">Query
     *     Prevented Matches (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryPreventedMatchesResponse> queryPreventedMatches(
            String symbol,
            Long preventedMatchId,
            Long orderId,
            Long fromPreventedMatchId,
            IsIsolated isIsolated,
            Long recvWindow)
            throws ApiException {
        return tradeApi.queryPreventedMatches(
                symbol, preventedMatchId, orderId, fromPreventedMatchId, isIsolated, recvWindow);
    }

    /**
     * Query Special key(Low Latency Trading) (TRADE) Query Special Key Information. This only
     * applies to Special Key for Low Latency Trading. Weight(UID): 1 Security Type: TRADE
     *
     * @param symbol (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QuerySpecialKeyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Special key </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#query-special-key">Query
     *     Special key(Low Latency Trading) (TRADE) Documentation</a>
     */
    public ApiResponse<QuerySpecialKeyResponse> querySpecialKey(String symbol, Long recvWindow)
            throws ApiException {
        return tradeApi.querySpecialKey(symbol, recvWindow);
    }

    /**
     * Query Special key List(Low Latency Trading) (TRADE) This only applies to Special Key for Low
     * Latency Trading. Weight(UID): 1 Security Type: TRADE
     *
     * @param symbol (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QuerySpecialKeyListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Special key List </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#query-special-key-list">Query
     *     Special key List(Low Latency Trading) (TRADE) Documentation</a>
     */
    public ApiResponse<QuerySpecialKeyListResponse> querySpecialKeyList(
            String symbol, Long recvWindow) throws ApiException {
        return tradeApi.querySpecialKeyList(symbol, recvWindow);
    }

    /**
     * Small Liability Exchange (MARGIN) Small Liability Exchange Weight(UID): 3000 Security Type:
     * MARGIN Notes: - Only convert once within 6 hours - Only liability valuation less than 10 USDT
     * are supported - The maximum number of coin is 10
     *
     * @param smallLiabilityExchangeRequest (required)
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#small-liability-exchange">Small
     *     Liability Exchange (MARGIN) Documentation</a>
     */
    public void smallLiabilityExchange(SmallLiabilityExchangeRequest smallLiabilityExchangeRequest)
            throws ApiException {
        tradeApi.smallLiabilityExchange(smallLiabilityExchangeRequest);
    }

    /**
     * Get Cross Margin Transfer History (USER_DATA) Get Cross Margin Transfer History Weight(IP): 1
     * Security Type: USER_DATA Notes: - Response in descending order - The max interval between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; is 30 days. - Returns data for last 7 days by
     * default
     *
     * @param asset (optional)
     * @param type (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current (optional)
     * @param size (optional)
     * @param isolatedSymbol (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetCrossMarginTransferHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Cross Margin Transfer History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/transfer#get-cross-margin-transfer-history">Get
     *     Cross Margin Transfer History (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetCrossMarginTransferHistoryResponse> getCrossMarginTransferHistory(
            String asset,
            OrderType type,
            Long startTime,
            Long endTime,
            Long current,
            Long size,
            String isolatedSymbol,
            Long recvWindow)
            throws ApiException {
        return transferApi.getCrossMarginTransferHistory(
                asset, type, startTime, endTime, current, size, isolatedSymbol, recvWindow);
    }

    /**
     * Query Max Transfer-Out Amount (USER_DATA) Query Max Transfer-Out Amount Weight(IP): 50
     * Security Type: USER_DATA Notes: - If isolatedSymbol is not sent, crossed margin data will be
     * sent.
     *
     * @param asset (required)
     * @param isolatedSymbol (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryMaxTransferOutAmountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Max Transfer-Out Amount </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/transfer#query-max-transfer-out-amount">Query
     *     Max Transfer-Out Amount (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryMaxTransferOutAmountResponse> queryMaxTransferOutAmount(
            String asset, String isolatedSymbol, Long recvWindow) throws ApiException {
        return transferApi.queryMaxTransferOutAmount(asset, isolatedSymbol, recvWindow);
    }

    /**
     * Close User Data Stream (USER_STREAM) Close out a user data stream. Weight(UID): 3000 Security
     * Type: USER_STREAM
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/user-data-stream#close-user-data-stream">Close
     *     User Data Stream (USER_STREAM) Documentation</a>
     */
    public void closeUserDataStream() throws ApiException {
        userDataStreamApi.closeUserDataStream();
    }

    /**
     * Keepalive User Data Stream (USER_STREAM) Keepalive a user data stream to prevent a time out.
     * Weight(UID): 1 Security Type: USER_STREAM
     *
     * @param keepaliveUserDataStreamRequest (required)
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/user-data-stream#keepalive-user-data-stream">Keepalive
     *     User Data Stream (USER_STREAM) Documentation</a>
     */
    public void keepaliveUserDataStream(
            KeepaliveUserDataStreamRequest keepaliveUserDataStreamRequest) throws ApiException {
        userDataStreamApi.keepaliveUserDataStream(keepaliveUserDataStreamRequest);
    }

    /**
     * Start User Data Stream (USER_STREAM) Start a new user data stream. Weight(UID): 1 Security
     * Type: USER_STREAM
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
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/user-data-stream#start-user-data-stream">Start
     *     User Data Stream (USER_STREAM) Documentation</a>
     */
    public ApiResponse<StartUserDataStreamResponse> startUserDataStream() throws ApiException {
        return userDataStreamApi.startUserDataStream();
    }
}
