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
import com.binance.connector.client.margin_trading.rest.model.GetSmallLiabilityExchangeCoinListResponse;
import com.binance.connector.client.margin_trading.rest.model.GetSmallLiabilityExchangeHistoryResponse;
import com.binance.connector.client.margin_trading.rest.model.GetSummaryOfMarginAccountResponse;
import com.binance.connector.client.margin_trading.rest.model.KeepaliveIsolatedMarginUserDataStreamRequest;
import com.binance.connector.client.margin_trading.rest.model.KeepaliveMarginUserDataStreamRequest;
import com.binance.connector.client.margin_trading.rest.model.KeepaliveUserDataStreamRequest;
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
import com.binance.connector.client.margin_trading.rest.model.QuerySpecialKeyListResponse;
import com.binance.connector.client.margin_trading.rest.model.QuerySpecialKeyResponse;
import com.binance.connector.client.margin_trading.rest.model.SmallLiabilityExchangeRequest;
import com.binance.connector.client.margin_trading.rest.model.StartIsolatedMarginUserDataStreamRequest;
import com.binance.connector.client.margin_trading.rest.model.StartIsolatedMarginUserDataStreamResponse;
import com.binance.connector.client.margin_trading.rest.model.StartMarginUserDataStreamResponse;
import com.binance.connector.client.margin_trading.rest.model.StartUserDataStreamResponse;

public class MarginTradingRestApi {

    private final AccountApi accountApi;
    private final BorrowRepayApi borrowRepayApi;
    private final MarketDataApi marketDataApi;
    private final RiskDataStreamApi riskDataStreamApi;
    private final TradeApi tradeApi;
    private final TradeDataStreamApi tradeDataStreamApi;
    private final TransferApi transferApi;

    public MarginTradingRestApi(ClientConfiguration configuration) {
        this(MarginTradingRestApiUtil.getDefaultClient(configuration));
    }

    public MarginTradingRestApi(ApiClient apiClient) {
        this.accountApi = new AccountApi(apiClient);
        this.borrowRepayApi = new BorrowRepayApi(apiClient);
        this.marketDataApi = new MarketDataApi(apiClient);
        this.riskDataStreamApi = new RiskDataStreamApi(apiClient);
        this.tradeApi = new TradeApi(apiClient);
        this.tradeDataStreamApi = new TradeDataStreamApi(apiClient);
        this.transferApi = new TransferApi(apiClient);
    }

    /**
     * Adjust cross margin max leverage (USER_DATA) Adjust cross margin max leverage * The margin
     * level need higher than the initial risk ratio of adjusted leverage, the initial risk ratio of
     * 3x is 1.5 , the initial risk ratio of 5x is 1.25; The detail conditions on how to switch
     * between Cross Margin Classic and Cross Margin Pro can refer to [the
     * FAQ](https://www.binance.com/en/support/faq/how-to-activate-the-cross-margin-pro-mode-on-binance-e27786da05e743a694b8c625b3bc475d).
     * Weight: 3000
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
     *     href="https://developers.binance.com/docs/margin_trading/account/Adjust-cross-margin-max-leverage">Adjust
     *     cross margin max leverage (USER_DATA) Documentation</a>
     */
    public ApiResponse<AdjustCrossMarginMaxLeverageResponse> adjustCrossMarginMaxLeverage(
            AdjustCrossMarginMaxLeverageRequest adjustCrossMarginMaxLeverageRequest)
            throws ApiException {
        return accountApi.adjustCrossMarginMaxLeverage(adjustCrossMarginMaxLeverageRequest);
    }

    /**
     * Disable Isolated Margin Account (TRADE) Disable isolated margin account for a specific
     * symbol. Each trading pair can only be deactivated once every 24 hours. Weight: 300(UID)
     *
     * @param symbol (required)
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/account/Disable-Isolated-Margin-Account">Disable
     *     Isolated Margin Account (TRADE) Documentation</a>
     */
    public ApiResponse<DisableIsolatedMarginAccountResponse> disableIsolatedMarginAccount(
            String symbol, Long recvWindow) throws ApiException {
        return accountApi.disableIsolatedMarginAccount(symbol, recvWindow);
    }

    /**
     * Enable Isolated Margin Account (TRADE) Enable isolated margin account for a specific
     * symbol(Only supports activation of previously disabled accounts). Weight: 300(UID)
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
     *     href="https://developers.binance.com/docs/margin_trading/account/Enable-Isolated-Margin-Account">Enable
     *     Isolated Margin Account (TRADE) Documentation</a>
     */
    public ApiResponse<EnableIsolatedMarginAccountResponse> enableIsolatedMarginAccount(
            EnableIsolatedMarginAccountRequest enableIsolatedMarginAccountRequest)
            throws ApiException {
        return accountApi.enableIsolatedMarginAccount(enableIsolatedMarginAccountRequest);
    }

    /**
     * Get BNB Burn Status (USER_DATA) Get BNB Burn Status Weight: 1(IP)
     *
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/account/Get-BNB-Burn-Status">Get
     *     BNB Burn Status (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetBnbBurnStatusResponse> getBnbBurnStatus(Long recvWindow)
            throws ApiException {
        return accountApi.getBnbBurnStatus(recvWindow);
    }

    /**
     * Get Summary of Margin account (USER_DATA) Get personal margin level information Weight:
     * 10(IP)
     *
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/account/Get-Summary-of-Margin-account">Get
     *     Summary of Margin account (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetSummaryOfMarginAccountResponse> getSummaryOfMarginAccount(Long recvWindow)
            throws ApiException {
        return accountApi.getSummaryOfMarginAccount(recvWindow);
    }

    /**
     * Query Cross Isolated Margin Capital Flow (USER_DATA) Query Cross Isolated Margin Capital Flow
     * Weight: 100(IP)
     *
     * @param asset (optional)
     * @param symbol isolated margin pair (optional)
     * @param type Transfer Type: ROLL_IN, ROLL_OUT (optional)
     * @param startTime 只支持查询最近90天的数据 (optional)
     * @param endTime (optional)
     * @param fromId 如设置fromId, 将返回id &gt; fromId的数据。否则将返回最新数据 (optional)
     * @param limit Default Value: 500; Max Value: 1000 (optional)
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/account/Query-Cross-Isolated-Margin-Capital-Flow">Query
     *     Cross Isolated Margin Capital Flow (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryCrossIsolatedMarginCapitalFlowResponse>
            queryCrossIsolatedMarginCapitalFlow(
                    String asset,
                    String symbol,
                    String type,
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
     * Query Cross Margin Account Details (USER_DATA) Query Cross Margin Account Details Weight:
     * 10(IP)
     *
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/account/Query-Cross-Margin-Account-Details">Query
     *     Cross Margin Account Details (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryCrossMarginAccountDetailsResponse> queryCrossMarginAccountDetails(
            Long recvWindow) throws ApiException {
        return accountApi.queryCrossMarginAccountDetails(recvWindow);
    }

    /**
     * Query Cross Margin Fee Data (USER_DATA) Get cross margin fee data collection with any vip
     * level or user&#39;s current specific data as https://www.binance.com/en/margin-fee Weight: 1
     * when coin is specified;(IP)
     *
     * @param vipLevel User&#39;s current specific margin data will be returned if vipLevel is
     *     omitted (optional)
     * @param coin (optional)
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/account/Query-Cross-Margin-Fee-Data">Query
     *     Cross Margin Fee Data (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryCrossMarginFeeDataResponse> queryCrossMarginFeeData(
            Long vipLevel, String coin, Long recvWindow) throws ApiException {
        return accountApi.queryCrossMarginFeeData(vipLevel, coin, recvWindow);
    }

    /**
     * Query Enabled Isolated Margin Account Limit (USER_DATA) Query enabled isolated margin account
     * limit. Weight: 1(IP)
     *
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/account/Query-Enabled-Isolated-Margin-Account-Limit">Query
     *     Enabled Isolated Margin Account Limit (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryEnabledIsolatedMarginAccountLimitResponse>
            queryEnabledIsolatedMarginAccountLimit(Long recvWindow) throws ApiException {
        return accountApi.queryEnabledIsolatedMarginAccountLimit(recvWindow);
    }

    /**
     * Query Isolated Margin Account Info (USER_DATA) Query Isolated Margin Account Info * If
     * \&quot;symbols\&quot; is not sent, all isolated assets will be returned. * If
     * \&quot;symbols\&quot; is sent, only the isolated assets of the sent symbols will be returned.
     * Weight: 10(IP)
     *
     * @param symbols Max 5 symbols can be sent; separated by \&quot;,\&quot;. e.g.
     *     \&quot;BTCUSDT,BNBUSDT,ADAUSDT\&quot; (optional)
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/account/Query-Isolated-Margin-Account-Info">Query
     *     Isolated Margin Account Info (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryIsolatedMarginAccountInfoResponse> queryIsolatedMarginAccountInfo(
            String symbols, Long recvWindow) throws ApiException {
        return accountApi.queryIsolatedMarginAccountInfo(symbols, recvWindow);
    }

    /**
     * Query Isolated Margin Fee Data (USER_DATA) Get isolated margin fee data collection with any
     * vip level or user&#39;s current specific data as https://www.binance.com/en/margin-fee
     * Weight: 1 when a single is specified;(IP)
     *
     * @param vipLevel User&#39;s current specific margin data will be returned if vipLevel is
     *     omitted (optional)
     * @param symbol isolated margin pair (optional)
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/account/Query-Isolated-Margin-Fee-Data">Query
     *     Isolated Margin Fee Data (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryIsolatedMarginFeeDataResponse> queryIsolatedMarginFeeData(
            Long vipLevel, String symbol, Long recvWindow) throws ApiException {
        return accountApi.queryIsolatedMarginFeeData(vipLevel, symbol, recvWindow);
    }

    /**
     * Get future hourly interest rate (USER_DATA) Get future hourly interest rate Weight: 100
     *
     * @param assets List of assets, separated by commas, up to 20 (required)
     * @param isIsolated for isolated margin or not, \&quot;TRUE\&quot;, \&quot;FALSE\&quot;
     *     (required)
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
     *     href="https://developers.binance.com/docs/margin_trading/borrow-and-repay/Get-a-future-hourly-interest-rate">Get
     *     future hourly interest rate (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetFutureHourlyInterestRateResponse> getFutureHourlyInterestRate(
            String assets, String isIsolated) throws ApiException {
        return borrowRepayApi.getFutureHourlyInterestRate(assets, isIsolated);
    }

    /**
     * Get Interest History (USER_DATA) Get Interest History * Response in descending order * If
     * isolatedSymbol is not sent, crossed margin data will be returned * The max interval between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; is 30 days. It is a MUST to ensure data
     * correctness. * If &#x60;startTime&#x60;and &#x60;endTime&#x60; not sent, return records of
     * the last 7 days by default. * If &#x60;startTime&#x60; is sent and &#x60;endTime&#x60; is not
     * sent, return records of [max(&#x60;startTime&#x60;, now-30d), now]. * If
     * &#x60;startTime&#x60; is not sent and &#x60;endTime&#x60; is sent, return records of
     * [&#x60;endTime&#x60;-7, &#x60;endTime&#x60;] * &#x60;type&#x60; in response has 4 enums: *
     * &#x60;PERIODIC&#x60; interest charged per hour * &#x60;ON_BORROW&#x60; first interest charged
     * on borrow * &#x60;PERIODIC_CONVERTED&#x60; interest charged per hour converted into BNB *
     * &#x60;ON_BORROW_CONVERTED&#x60; first interest charged on borrow converted into BNB *
     * &#x60;PORTFOLIO&#x60; interest charged daily on the portfolio margin negative balance Weight:
     * 1(IP)
     *
     * @param asset (optional)
     * @param isolatedSymbol isolated symbol (optional)
     * @param startTime 只支持查询最近90天的数据 (optional)
     * @param endTime (optional)
     * @param current Currently querying page. Start from 1. Default:1 (optional)
     * @param size Default:10 Max:100 (optional)
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/borrow-and-repay/Get-Interest-History">Get
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
     * Margin account borrow/repay(MARGIN) Margin account borrow/repay(MARGIN) Weight: 1500
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
     *     href="https://developers.binance.com/docs/margin_trading/borrow-and-repay/Margin-account-borrow-repay">Margin
     *     account borrow/repay(MARGIN) Documentation</a>
     */
    public ApiResponse<MarginAccountBorrowRepayResponse> marginAccountBorrowRepay(
            MarginAccountBorrowRepayRequest marginAccountBorrowRepayRequest) throws ApiException {
        return borrowRepayApi.marginAccountBorrowRepay(marginAccountBorrowRepayRequest);
    }

    /**
     * Query borrow/repay records in Margin account(USER_DATA) Query borrow/repay records in Margin
     * account * &#x60;txId&#x60; or &#x60;startTime&#x60; must be sent. &#x60;txId&#x60; takes
     * precedence. * If an asset is sent, data within 30 days before &#x60;endTime&#x60;; If an
     * asset is not sent, data within 7 days before &#x60;endTime&#x60; * If neither
     * &#x60;startTime&#x60; nor &#x60;endTime&#x60; is sent, the recent 7-day data will be
     * returned. * &#x60;startTime&#x60; set as &#x60;endTime&#x60; - 7days by default,
     * &#x60;endTime&#x60; set as current time by default Weight: 10(IP)
     *
     * @param type MARGIN,ISOLATED (required)
     * @param asset (optional)
     * @param isolatedSymbol isolated symbol (optional)
     * @param txId &#x60;tranId&#x60; in &#x60;POST /sapi/v1/margin/loan&#x60; (optional)
     * @param startTime 只支持查询最近90天的数据 (optional)
     * @param endTime (optional)
     * @param current Currently querying page. Start from 1. Default:1 (optional)
     * @param size Default:10 Max:100 (optional)
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/borrow-and-repay/Query-Borrow-Repay">Query
     *     borrow/repay records in Margin account(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryBorrowRepayRecordsInMarginAccountResponse>
            queryBorrowRepayRecordsInMarginAccount(
                    String type,
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
     * Query Margin Interest Rate History (USER_DATA) Query Margin Interest Rate History Weight:
     * 1(IP)
     *
     * @param asset (required)
     * @param vipLevel User&#39;s current specific margin data will be returned if vipLevel is
     *     omitted (optional)
     * @param startTime 只支持查询最近90天的数据 (optional)
     * @param endTime (optional)
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/borrow-and-repay/Query-Margin-Interest-Rate-History">Query
     *     Margin Interest Rate History (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryMarginInterestRateHistoryResponse> queryMarginInterestRateHistory(
            String asset, Long vipLevel, Long startTime, Long endTime, Long recvWindow)
            throws ApiException {
        return borrowRepayApi.queryMarginInterestRateHistory(
                asset, vipLevel, startTime, endTime, recvWindow);
    }

    /**
     * Query Max Borrow (USER_DATA) Query Max Borrow * If isolatedSymbol is not sent, crossed margin
     * data will be sent. * &#x60;borrowLimit&#x60; is also available from
     * [https://www.binance.com/en/margin-fee](https://www.binance.com/en/margin-fee) Weight: 50(IP)
     *
     * @param asset (required)
     * @param isolatedSymbol isolated symbol (optional)
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/borrow-and-repay/Query-Max-Borrow">Query
     *     Max Borrow (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryMaxBorrowResponse> queryMaxBorrow(
            String asset, String isolatedSymbol, Long recvWindow) throws ApiException {
        return borrowRepayApi.queryMaxBorrow(asset, isolatedSymbol, recvWindow);
    }

    /**
     * Cross margin collateral ratio (MARKET_DATA) Cross margin collateral ratio Weight: 100(IP)
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
     *     href="https://developers.binance.com/docs/margin_trading/market-data/Cross-margin-collateral-ratio">Cross
     *     margin collateral ratio (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<CrossMarginCollateralRatioResponse> crossMarginCollateralRatio()
            throws ApiException {
        return marketDataApi.crossMarginCollateralRatio();
    }

    /**
     * Get All Cross Margin Pairs (MARKET_DATA) Get All Cross Margin Pairs Weight: 1(IP)
     *
     * @param symbol isolated margin pair (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/market-data/Get-All-Cross-Margin-Pairs">Get
     *     All Cross Margin Pairs (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<GetAllCrossMarginPairsResponse> getAllCrossMarginPairs(String symbol)
            throws ApiException {
        return marketDataApi.getAllCrossMarginPairs(symbol);
    }

    /**
     * Get All Isolated Margin Symbol(MARKET_DATA) Get All Isolated Margin Symbol Weight: 10(IP)
     *
     * @param symbol isolated margin pair (optional)
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/market-data/Get-All-Isolated-Margin-Symbol">Get
     *     All Isolated Margin Symbol(MARKET_DATA) Documentation</a>
     */
    public ApiResponse<GetAllIsolatedMarginSymbolResponse> getAllIsolatedMarginSymbol(
            String symbol, Long recvWindow) throws ApiException {
        return marketDataApi.getAllIsolatedMarginSymbol(symbol, recvWindow);
    }

    /**
     * Get All Margin Assets (MARKET_DATA) Get All Margin Assets. Weight: 1(IP)
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
     *     href="https://developers.binance.com/docs/margin_trading/market-data/Get-All-Margin-Assets">Get
     *     All Margin Assets (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<GetAllMarginAssetsResponse> getAllMarginAssets(String asset)
            throws ApiException {
        return marketDataApi.getAllMarginAssets(asset);
    }

    /**
     * Get Delist Schedule (MARKET_DATA) Get tokens or symbols delist schedule for cross margin and
     * isolated margin Weight: 100
     *
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/market-data/Get-Delist-Schedule">Get
     *     Delist Schedule (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<GetDelistScheduleResponse> getDelistSchedule(Long recvWindow)
            throws ApiException {
        return marketDataApi.getDelistSchedule(recvWindow);
    }

    /**
     * Get Limit Price Pairs(MARKET_DATA) Query trading pairs with restriction on limit price range.
     * In margin trading, you can place orders with limit price. Limit price should be within (-15%,
     * 15%) of current index price for a list of margin trading pairs. This rule only impacts limit
     * sell orders with limit price that is lower than current index price and limit buy orders with
     * limit price that is higher than current index price. - Buy order: Your order will be rejected
     * with an error message notification if the limit price is 15% above the index price. - Sell
     * order: Your order will be rejected with an error message notification if the limit price is
     * 15% below the index price. Please review the limit price order placing strategy, backtest and
     * calibrate the planned order size with the trading volume and order book depth to prevent
     * trading loss. Weight: 1
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
     *     href="https://developers.binance.com/docs/margin_trading/market-data/Get-Limit-Price-Pairs">Get
     *     Limit Price Pairs(MARKET_DATA) Documentation</a>
     */
    public ApiResponse<GetLimitPricePairsResponse> getLimitPricePairs() throws ApiException {
        return marketDataApi.getLimitPricePairs();
    }

    /**
     * Get list Schedule (MARKET_DATA) Get the upcoming tokens or symbols listing schedule for Cross
     * Margin and Isolated Margin. Weight: 100
     *
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/market-data/Get-list-Schedule">Get
     *     list Schedule (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<GetListScheduleResponse> getListSchedule(Long recvWindow)
            throws ApiException {
        return marketDataApi.getListSchedule(recvWindow);
    }

    /**
     * Query Isolated Margin Tier Data (USER_DATA) Get isolated margin tier data collection with any
     * tier as https://www.binance.com/en/margin-data Weight: 1(IP)
     *
     * @param symbol (required)
     * @param tier All margin tier data will be returned if tier is omitted (optional)
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/market-data/Query-Isolated-Margin-Tier-Data">Query
     *     Isolated Margin Tier Data (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryIsolatedMarginTierDataResponse> queryIsolatedMarginTierData(
            String symbol, Long tier, Long recvWindow) throws ApiException {
        return marketDataApi.queryIsolatedMarginTierData(symbol, tier, recvWindow);
    }

    /**
     * Query Liability Coin Leverage Bracket in Cross Margin Pro Mode(MARKET_DATA) Liability Coin
     * Leverage Bracket in Cross Margin Pro Mode Weight: 1
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
     *     href="https://developers.binance.com/docs/margin_trading/market-data/Query-Liability-Coin-Leverage-Bracket-in-Cross-Margin-Pro-Mode">Query
     *     Liability Coin Leverage Bracket in Cross Margin Pro Mode(MARKET_DATA) Documentation</a>
     */
    public ApiResponse<QueryLiabilityCoinLeverageBracketInCrossMarginProModeResponse>
            queryLiabilityCoinLeverageBracketInCrossMarginProMode() throws ApiException {
        return marketDataApi.queryLiabilityCoinLeverageBracketInCrossMarginProMode();
    }

    /**
     * Query Margin Available Inventory(USER_DATA) Margin available Inventory query Weight: 50
     *
     * @param type MARGIN,ISOLATED (required)
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
     *     href="https://developers.binance.com/docs/margin_trading/market-data/Query-margin-avaliable-inventory">Query
     *     Margin Available Inventory(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryMarginAvailableInventoryResponse> queryMarginAvailableInventory(
            String type) throws ApiException {
        return marketDataApi.queryMarginAvailableInventory(type);
    }

    /**
     * Query Margin PriceIndex (MARKET_DATA) Query Margin PriceIndex Weight: 10(IP)
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
     *     href="https://developers.binance.com/docs/margin_trading/market-data/Query-Margin-PriceIndex">Query
     *     Margin PriceIndex (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<QueryMarginPriceindexResponse> queryMarginPriceindex(String symbol)
            throws ApiException {
        return marketDataApi.queryMarginPriceindex(symbol);
    }

    /**
     * Close User Data Stream (USER_STREAM) Close out a user data stream. Weight: 3000
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
     *     href="https://developers.binance.com/docs/margin_trading/risk-data-stream/Close-User-Data-Stream">Close
     *     User Data Stream (USER_STREAM) Documentation</a>
     */
    public void closeUserDataStream() throws ApiException {
        riskDataStreamApi.closeUserDataStream();
    }

    /**
     * Keepalive User Data Stream (USER_STREAM) Keepalive a user data stream to prevent a time out.
     * Weight: 1
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
     *     href="https://developers.binance.com/docs/margin_trading/risk-data-stream/Keepalive-User-Data-Stream">Keepalive
     *     User Data Stream (USER_STREAM) Documentation</a>
     */
    public void keepaliveUserDataStream(
            KeepaliveUserDataStreamRequest keepaliveUserDataStreamRequest) throws ApiException {
        riskDataStreamApi.keepaliveUserDataStream(keepaliveUserDataStreamRequest);
    }

    /**
     * Start User Data Stream (USER_STREAM) Start a new user data stream. Weight: 1
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
     *     href="https://developers.binance.com/docs/margin_trading/risk-data-stream/Start-User-Data-Stream">Start
     *     User Data Stream (USER_STREAM) Documentation</a>
     */
    public ApiResponse<StartUserDataStreamResponse> startUserDataStream() throws ApiException {
        return riskDataStreamApi.startUserDataStream();
    }

    /**
     * Create Special Key(Low-Latency Trading)(TRADE) **Binance Margin offers low-latency trading
     * through a [special
     * key](https://www.binance.com/en/support/faq/frequently-asked-questions-on-margin-special-api-key-3208663e900d4d2e9fec4140e1832f4e),
     * available exclusively to users with VIP level 4 or higher. ** **If you are VIP level 3 or
     * below, please contact your VIP manager for eligibility criterias.** We support several types
     * of API keys: * Ed25519 (recommended) * HMAC * RSA We recommend to **use Ed25519 API keys** as
     * it should provide the best performance and security out of all supported key types. We accept
     * PKCS#8 (BEGIN PUBLIC KEY). For how to generate an RSA key pair to send API requests on
     * Binance. Please refer to the document below
     * [FAQ](https://www.binance.com/en/support/faq/how-to-generate-an-rsa-key-pair-to-send-api-requests-on-binance-2b79728f331e43079b27440d9d15c5db)
     * . Read [REST
     * API](https://github.com/binance/binance-spot-api-docs/blob/master/rest-api.md#signed-trade-and-user_data-endpoint-security)
     * or [WebSocket
     * API](https://github.com/binance/binance-spot-api-docs/blob/master/web-socket-api.md#request-security)
     * documentation to learn how to use different API keys You need to enable Permits “Enable Spot
     * &amp; Margin Trading” option for the API Key which requests this endpoint. Weight: 1(UID)
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
     *     href="https://developers.binance.com/docs/margin_trading/trade/Create-Special-Key-of-Low-Latency-Trading">Create
     *     Special Key(Low-Latency Trading)(TRADE) Documentation</a>
     */
    public ApiResponse<CreateSpecialKeyResponse> createSpecialKey(
            CreateSpecialKeyRequest createSpecialKeyRequest) throws ApiException {
        return tradeApi.createSpecialKey(createSpecialKeyRequest);
    }

    /**
     * Delete Special Key(Low-Latency Trading)(TRADE) This only applies to Special Key for Low
     * Latency Trading. If apiKey is given, apiName will be ignored. If apiName is given with no
     * apiKey, all apikeys with given apiName will be deleted. You need to enable Permits “Enable
     * Spot &amp; Margin Trading” option for the API Key which requests this endpoint. Weight:
     * 1(UID)
     *
     * @param apiName (optional)
     * @param symbol isolated margin pair (optional)
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/trade/Delete-Special-Key-of-Low-Latency-Trading">Delete
     *     Special Key(Low-Latency Trading)(TRADE) Documentation</a>
     */
    public void deleteSpecialKey(String apiName, String symbol, Long recvWindow)
            throws ApiException {
        tradeApi.deleteSpecialKey(apiName, symbol, recvWindow);
    }

    /**
     * Edit ip for Special Key(Low-Latency Trading)(TRADE) Edit ip restriction. This only applies to
     * Special Key for Low Latency Trading. You need to enable Permits “Enable Spot &amp; Margin
     * Trading” option for the API Key which requests this endpoint. Weight: 1(UID)
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
     *     href="https://developers.binance.com/docs/margin_trading/trade/Edit-ip-for-Special-Key-of-Low-Latency-Trading">Edit
     *     ip for Special Key(Low-Latency Trading)(TRADE) Documentation</a>
     */
    public void editIpForSpecialKey(EditIpForSpecialKeyRequest editIpForSpecialKeyRequest)
            throws ApiException {
        tradeApi.editIpForSpecialKey(editIpForSpecialKeyRequest);
    }

    /**
     * Get Force Liquidation Record (USER_DATA) Get Force Liquidation Record * Response in
     * descending order Weight: 1(IP)
     *
     * @param startTime 只支持查询最近90天的数据 (optional)
     * @param endTime (optional)
     * @param isolatedSymbol isolated symbol (optional)
     * @param current Currently querying page. Start from 1. Default:1 (optional)
     * @param size Default:10 Max:100 (optional)
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/trade/Get-Force-Liquidation-Record">Get
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
     * liability exchange Weight: 100
     *
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/trade/Get-Small-Liability-Exchange-Coin-List">Get
     *     Small Liability Exchange Coin List (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetSmallLiabilityExchangeCoinListResponse> getSmallLiabilityExchangeCoinList(
            Long recvWindow) throws ApiException {
        return tradeApi.getSmallLiabilityExchangeCoinList(recvWindow);
    }

    /**
     * Get Small Liability Exchange History (USER_DATA) Get Small liability Exchange History Weight:
     * 100(UID)
     *
     * @param current Currently querying page. Start from 1. Default:1 (required)
     * @param size Default:10, Max:100 (required)
     * @param startTime 只支持查询最近90天的数据 (optional)
     * @param endTime (optional)
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/trade/Get-Small-Liability-Exchange-History">Get
     *     Small Liability Exchange History (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetSmallLiabilityExchangeHistoryResponse> getSmallLiabilityExchangeHistory(
            Long current, Long size, Long startTime, Long endTime, Long recvWindow)
            throws ApiException {
        return tradeApi.getSmallLiabilityExchangeHistory(
                current, size, startTime, endTime, recvWindow);
    }

    /**
     * Margin Account Cancel all Open Orders on a Symbol (TRADE) Cancels all active orders on a
     * symbol for margin account.&lt;br&gt;&lt;/br&gt; This includes OCO orders. Weight: 1
     *
     * @param symbol (required)
     * @param isIsolated for isolated margin or not, \&quot;TRUE\&quot;, \&quot;FALSE\&quot;，default
     *     \&quot;FALSE\&quot; (optional)
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/trade/Margin-Account-Cancel-All-Open-Orders">Margin
     *     Account Cancel all Open Orders on a Symbol (TRADE) Documentation</a>
     */
    public ApiResponse<MarginAccountCancelAllOpenOrdersOnASymbolResponse>
            marginAccountCancelAllOpenOrdersOnASymbol(
                    String symbol, String isIsolated, Long recvWindow) throws ApiException {
        return tradeApi.marginAccountCancelAllOpenOrdersOnASymbol(symbol, isIsolated, recvWindow);
    }

    /**
     * Margin Account Cancel OCO (TRADE) Cancel an entire Order List for a margin account. *
     * Canceling an individual leg will cancel the entire OCO Weight: 1(UID)
     *
     * @param symbol (required)
     * @param isIsolated for isolated margin or not, \&quot;TRUE\&quot;, \&quot;FALSE\&quot;，default
     *     \&quot;FALSE\&quot; (optional)
     * @param orderListId Either &#x60;orderListId&#x60; or &#x60;listClientOrderId&#x60; must be
     *     provided (optional)
     * @param listClientOrderId Either &#x60;orderListId&#x60; or &#x60;listClientOrderId&#x60; must
     *     be provided (optional)
     * @param newClientOrderId Used to uniquely identify this cancel. Automatically generated by
     *     default (optional)
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/trade/Margin-Account-Cancel-OCO">Margin
     *     Account Cancel OCO (TRADE) Documentation</a>
     */
    public ApiResponse<MarginAccountCancelOcoResponse> marginAccountCancelOco(
            String symbol,
            String isIsolated,
            Long orderListId,
            String listClientOrderId,
            String newClientOrderId,
            Long recvWindow)
            throws ApiException {
        return tradeApi.marginAccountCancelOco(
                symbol, isIsolated, orderListId, listClientOrderId, newClientOrderId, recvWindow);
    }

    /**
     * Margin Account Cancel Order (TRADE) Cancel an active order for margin account. * Either
     * orderId or origClientOrderId must be sent. Weight: 10(IP)
     *
     * @param symbol (required)
     * @param isIsolated for isolated margin or not, \&quot;TRUE\&quot;, \&quot;FALSE\&quot;，default
     *     \&quot;FALSE\&quot; (optional)
     * @param orderId (optional)
     * @param origClientOrderId (optional)
     * @param newClientOrderId Used to uniquely identify this cancel. Automatically generated by
     *     default (optional)
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/trade/Margin-Account-Cancel-Order">Margin
     *     Account Cancel Order (TRADE) Documentation</a>
     */
    public ApiResponse<MarginAccountCancelOrderResponse> marginAccountCancelOrder(
            String symbol,
            String isIsolated,
            Long orderId,
            String origClientOrderId,
            String newClientOrderId,
            Long recvWindow)
            throws ApiException {
        return tradeApi.marginAccountCancelOrder(
                symbol, isIsolated, orderId, origClientOrderId, newClientOrderId, recvWindow);
    }

    /**
     * Margin Account New OCO (TRADE) Send in a new OCO for a margin account * autoRepayAtCancel is
     * suggested to set as “FALSE” to keep liability unrepaid under high frequent new order/cancel
     * order execution Weight: 6(UID)
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
     *     href="https://developers.binance.com/docs/margin_trading/trade/Margin-Account-New-OCO">Margin
     *     Account New OCO (TRADE) Documentation</a>
     */
    public ApiResponse<MarginAccountNewOcoResponse> marginAccountNewOco(
            MarginAccountNewOcoRequest marginAccountNewOcoRequest) throws ApiException {
        return tradeApi.marginAccountNewOco(marginAccountNewOcoRequest);
    }

    /**
     * Margin Account New Order (TRADE) Post a new order for margin account. * autoRepayAtCancel is
     * suggested to set as “FALSE” to keep liability unrepaid under high frequent new order/cancel
     * order execution Weight: 6(UID)
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
     *     href="https://developers.binance.com/docs/margin_trading/trade/Margin-Account-New-Order">Margin
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
     * &#x60;EXCHANGE_MAX_NUM_ORDERS&#x60; filter and &#x60;MAX_NUM_ORDERS&#x60; filter. *
     * autoRepayAtCancel is suggested to set as “FALSE” to keep liability unrepaid under high
     * frequent new order/cancel order execution * Depending on the &#x60;pendingType&#x60; or
     * &#x60;workingType&#x60;, some optional parameters will become mandatory: Weight: 6(UID)
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
     *     href="https://developers.binance.com/docs/margin_trading/trade/Margin-Account-New-OTO">Margin
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
     * OCO](https://developers.binance.com/docs/margin_trading/trade/Margin-Account-New-OCO). -
     * OTOCOs add **3 orders** against the unfilled order count, &#x60;EXCHANGE_MAX_NUM_ORDERS&#x60;
     * filter, and &#x60;MAX_NUM_ORDERS&#x60; filter. * autoRepayAtCancel is suggested to set as
     * “FALSE” to keep liability unrepaid under high frequent new order/cancel order execution *
     * Depending on the &#x60;pendingAboveType&#x60;/&#x60;pendingBelowType&#x60; or
     * &#x60;workingType&#x60;, some optional parameters will become mandatory: Weight: 6(UID)
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
     *     href="https://developers.binance.com/docs/margin_trading/trade/Margin-Account-New-OTOCO">Margin
     *     Account New OTOCO (TRADE) Documentation</a>
     */
    public ApiResponse<MarginAccountNewOtocoResponse> marginAccountNewOtoco(
            MarginAccountNewOtocoRequest marginAccountNewOtocoRequest) throws ApiException {
        return tradeApi.marginAccountNewOtoco(marginAccountNewOtocoRequest);
    }

    /**
     * Margin Manual Liquidation(MARGIN) Margin Manual Liquidation * This endpoint can support Cross
     * Margin Classic Mode and Pro Mode. * And only support Isolated Margin for restricted region.
     * Weight: 3000
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
     *     href="https://developers.binance.com/docs/margin_trading/trade/Margin-Manual-Liquidation">Margin
     *     Manual Liquidation(MARGIN) Documentation</a>
     */
    public ApiResponse<MarginManualLiquidationResponse> marginManualLiquidation(
            MarginManualLiquidationRequest marginManualLiquidationRequest) throws ApiException {
        return tradeApi.marginManualLiquidation(marginManualLiquidationRequest);
    }

    /**
     * Query Current Margin Order Count Usage (TRADE) Displays the user&#39;s current margin order
     * count usage for all intervals. Weight: 20(IP)
     *
     * @param isIsolated for isolated margin or not, \&quot;TRUE\&quot;, \&quot;FALSE\&quot;，default
     *     \&quot;FALSE\&quot; (optional)
     * @param symbol isolated margin pair (optional)
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/trade/Query-Current-Margin-Order-Count-Usage">Query
     *     Current Margin Order Count Usage (TRADE) Documentation</a>
     */
    public ApiResponse<QueryCurrentMarginOrderCountUsageResponse> queryCurrentMarginOrderCountUsage(
            String isIsolated, String symbol, Long recvWindow) throws ApiException {
        return tradeApi.queryCurrentMarginOrderCountUsage(isIsolated, symbol, recvWindow);
    }

    /**
     * Query Margin Account&#39;s all OCO (USER_DATA) Retrieves all OCO for a specific margin
     * account based on provided optional parameters Weight: 200(IP)
     *
     * @param isIsolated for isolated margin or not, \&quot;TRUE\&quot;, \&quot;FALSE\&quot;，default
     *     \&quot;FALSE\&quot; (optional)
     * @param symbol isolated margin pair (optional)
     * @param fromId 如设置fromId, 将返回id &gt; fromId的数据。否则将返回最新数据 (optional)
     * @param startTime 只支持查询最近90天的数据 (optional)
     * @param endTime (optional)
     * @param limit Default Value: 500; Max Value: 1000 (optional)
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/trade/Query-Margin-Account-all-OCO">Query
     *     Margin Account&#39;s all OCO (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryMarginAccountsAllOcoResponse> queryMarginAccountsAllOco(
            String isIsolated,
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
     * Query Margin Account&#39;s All Orders (USER_DATA) Query Margin Account&#39;s All Orders * If
     * orderId is set, it will get orders &gt;&#x3D; that orderId. Otherwise the orders within 24
     * hours are returned. * For some historical orders cummulativeQuoteQty will be &lt; 0, meaning
     * the data is not available at this time. * Less than 24 hours between startTime and endTime.
     * Weight: 200(IP)
     *
     * @param symbol (required)
     * @param isIsolated for isolated margin or not, \&quot;TRUE\&quot;, \&quot;FALSE\&quot;，default
     *     \&quot;FALSE\&quot; (optional)
     * @param orderId (optional)
     * @param startTime 只支持查询最近90天的数据 (optional)
     * @param endTime (optional)
     * @param limit Default Value: 500; Max Value: 1000 (optional)
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/trade/Query-Margin-Account-All-Orders">Query
     *     Margin Account&#39;s All Orders (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryMarginAccountsAllOrdersResponse> queryMarginAccountsAllOrders(
            String symbol,
            String isIsolated,
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
     * optional parameters Weight: 10(IP)
     *
     * @param isIsolated for isolated margin or not, \&quot;TRUE\&quot;, \&quot;FALSE\&quot;，default
     *     \&quot;FALSE\&quot; (optional)
     * @param symbol isolated margin pair (optional)
     * @param orderListId Either &#x60;orderListId&#x60; or &#x60;listClientOrderId&#x60; must be
     *     provided (optional)
     * @param origClientOrderId (optional)
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/trade/Query-Margin-Account-OCO">Query
     *     Margin Account&#39;s OCO (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryMarginAccountsOcoResponse> queryMarginAccountsOco(
            String isIsolated,
            String symbol,
            Long orderListId,
            String origClientOrderId,
            Long recvWindow)
            throws ApiException {
        return tradeApi.queryMarginAccountsOco(
                isIsolated, symbol, orderListId, origClientOrderId, recvWindow);
    }

    /**
     * Query Margin Account&#39;s Open OCO (USER_DATA) Query Margin Account&#39;s Open OCO Weight:
     * 10(IP)
     *
     * @param isIsolated for isolated margin or not, \&quot;TRUE\&quot;, \&quot;FALSE\&quot;，default
     *     \&quot;FALSE\&quot; (optional)
     * @param symbol isolated margin pair (optional)
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/trade/Query-Margin-Account-Open-OCO">Query
     *     Margin Account&#39;s Open OCO (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryMarginAccountsOpenOcoResponse> queryMarginAccountsOpenOco(
            String isIsolated, String symbol, Long recvWindow) throws ApiException {
        return tradeApi.queryMarginAccountsOpenOco(isIsolated, symbol, recvWindow);
    }

    /**
     * Query Margin Account&#39;s Open Orders (USER_DATA) Query Margin Account&#39;s Open Orders *
     * If the symbol is not sent, orders for all symbols will be returned in an array. * When all
     * symbols are returned, the number of requests counted against the rate limiter is equal to the
     * number of symbols currently trading on the exchange. * If isIsolated
     * &#x3D;\&quot;TRUE\&quot;, symbol must be sent. Weight: 10(IP)
     *
     * @param symbol isolated margin pair (optional)
     * @param isIsolated for isolated margin or not, \&quot;TRUE\&quot;, \&quot;FALSE\&quot;，default
     *     \&quot;FALSE\&quot; (optional)
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/trade/Query-Margin-Account-Open-Orders">Query
     *     Margin Account&#39;s Open Orders (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryMarginAccountsOpenOrdersResponse> queryMarginAccountsOpenOrders(
            String symbol, String isIsolated, Long recvWindow) throws ApiException {
        return tradeApi.queryMarginAccountsOpenOrders(symbol, isIsolated, recvWindow);
    }

    /**
     * Query Margin Account&#39;s Order (USER_DATA) Query Margin Account&#39;s Order * Either
     * orderId or origClientOrderId must be sent. * For some historical orders cummulativeQuoteQty
     * will be &lt; 0, meaning the data is not available at this time. Weight: 10(IP)
     *
     * @param symbol (required)
     * @param isIsolated for isolated margin or not, \&quot;TRUE\&quot;, \&quot;FALSE\&quot;，default
     *     \&quot;FALSE\&quot; (optional)
     * @param orderId (optional)
     * @param origClientOrderId (optional)
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/trade/Query-Margin-Account-Order">Query
     *     Margin Account&#39;s Order (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryMarginAccountsOrderResponse> queryMarginAccountsOrder(
            String symbol,
            String isIsolated,
            Long orderId,
            String origClientOrderId,
            Long recvWindow)
            throws ApiException {
        return tradeApi.queryMarginAccountsOrder(
                symbol, isIsolated, orderId, origClientOrderId, recvWindow);
    }

    /**
     * Query Margin Account&#39;s Trade List (USER_DATA) Query Margin Account&#39;s Trade List * If
     * fromId is set, it will get trades &gt;&#x3D; that fromId. Otherwise the trades within 24
     * hours are returned. * Less than 24 hours between startTime and endTime. Weight: 10(IP)
     *
     * @param symbol (required)
     * @param isIsolated for isolated margin or not, \&quot;TRUE\&quot;, \&quot;FALSE\&quot;，default
     *     \&quot;FALSE\&quot; (optional)
     * @param orderId (optional)
     * @param startTime 只支持查询最近90天的数据 (optional)
     * @param endTime (optional)
     * @param fromId 如设置fromId, 将返回id &gt; fromId的数据。否则将返回最新数据 (optional)
     * @param limit Default Value: 500; Max Value: 1000 (optional)
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/trade/Query-Margin-Account-Trade-List">Query
     *     Margin Account&#39;s Trade List (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryMarginAccountsTradeListResponse> queryMarginAccountsTradeList(
            String symbol,
            String isIsolated,
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
     * Query Special key(Low Latency Trading)(TRADE) Query Special Key Information. This only
     * applies to Special Key for Low Latency Trading. Weight: 1(UID)
     *
     * @param symbol isolated margin pair (optional)
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/trade/Query-Special-Key-of-Low-Latency-Trading">Query
     *     Special key(Low Latency Trading)(TRADE) Documentation</a>
     */
    public ApiResponse<QuerySpecialKeyResponse> querySpecialKey(String symbol, Long recvWindow)
            throws ApiException {
        return tradeApi.querySpecialKey(symbol, recvWindow);
    }

    /**
     * Query Special key List(Low Latency Trading)(TRADE) This only applies to Special Key for Low
     * Latency Trading. Weight: 1(UID)
     *
     * @param symbol isolated margin pair (optional)
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/trade/Query-Special-Key-List-of-Low-Latency-Trading">Query
     *     Special key List(Low Latency Trading)(TRADE) Documentation</a>
     */
    public ApiResponse<QuerySpecialKeyListResponse> querySpecialKeyList(
            String symbol, Long recvWindow) throws ApiException {
        return tradeApi.querySpecialKeyList(symbol, recvWindow);
    }

    /**
     * Small Liability Exchange (MARGIN) Small Liability Exchange * Only convert once within 6 hours
     * * Only liability valuation less than 10 USDT are supported * The maximum number of coin is 10
     * Weight: 3000(UID)
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
     *     href="https://developers.binance.com/docs/margin_trading/trade/Small-Liability-Exchange">Small
     *     Liability Exchange (MARGIN) Documentation</a>
     */
    public void smallLiabilityExchange(SmallLiabilityExchangeRequest smallLiabilityExchangeRequest)
            throws ApiException {
        tradeApi.smallLiabilityExchange(smallLiabilityExchangeRequest);
    }

    /**
     * Close Isolated Margin User Data Stream (USER_STREAM) Close out a isolated margin user data
     * stream. Weight: 3000
     *
     * @param symbol (required)
     * @param listenkey (required)
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
     *     href="https://developers.binance.com/docs/margin_trading/trade-data-stream/Close-Isolated-Margin-User-Data-Stream">Close
     *     Isolated Margin User Data Stream (USER_STREAM) Documentation</a>
     */
    public void closeIsolatedMarginUserDataStream(String symbol, String listenkey)
            throws ApiException {
        tradeDataStreamApi.closeIsolatedMarginUserDataStream(symbol, listenkey);
    }

    /**
     * Close Margin User Data Stream (USER_STREAM) Close out a Margin user data stream. Weight: 3000
     *
     * @param listenkey (required)
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
     *     href="https://developers.binance.com/docs/margin_trading/trade-data-stream/Close-Margin-User-Data-Stream">Close
     *     Margin User Data Stream (USER_STREAM) Documentation</a>
     */
    public void closeMarginUserDataStream(String listenkey) throws ApiException {
        tradeDataStreamApi.closeMarginUserDataStream(listenkey);
    }

    /**
     * Keepalive Isolated Margin User Data Stream (USER_STREAM) Keepalive an isolated margin user
     * data stream to prevent a time out. Weight: 1
     *
     * @param keepaliveIsolatedMarginUserDataStreamRequest (required)
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
     *     href="https://developers.binance.com/docs/margin_trading/trade-data-stream/Keepalive-Isolated-Margin-User-Data-Stream">Keepalive
     *     Isolated Margin User Data Stream (USER_STREAM) Documentation</a>
     */
    public void keepaliveIsolatedMarginUserDataStream(
            KeepaliveIsolatedMarginUserDataStreamRequest
                    keepaliveIsolatedMarginUserDataStreamRequest)
            throws ApiException {
        tradeDataStreamApi.keepaliveIsolatedMarginUserDataStream(
                keepaliveIsolatedMarginUserDataStreamRequest);
    }

    /**
     * Keepalive Margin User Data Stream (USER_STREAM) Keepalive a margin user data stream to
     * prevent a time out. Weight: 1
     *
     * @param keepaliveMarginUserDataStreamRequest (required)
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
     *     href="https://developers.binance.com/docs/margin_trading/trade-data-stream/Keepalive-Margin-User-Data-Stream">Keepalive
     *     Margin User Data Stream (USER_STREAM) Documentation</a>
     */
    public void keepaliveMarginUserDataStream(
            KeepaliveMarginUserDataStreamRequest keepaliveMarginUserDataStreamRequest)
            throws ApiException {
        tradeDataStreamApi.keepaliveMarginUserDataStream(keepaliveMarginUserDataStreamRequest);
    }

    /**
     * Start Isolated Margin User Data Stream (USER_STREAM) Start a new isolated margin user data
     * stream. The stream will close after 60 minutes unless a keepalive is sent. If the account has
     * an active listenKey, that listenKey will be returned and its validity will be extended for 60
     * minutes. Weight: 1
     *
     * @param startIsolatedMarginUserDataStreamRequest (required)
     * @return ApiResponse&lt;StartIsolatedMarginUserDataStreamResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Start Isolated Margin User Data Stream </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/margin_trading/trade-data-stream/Start-Isolated-Margin-User-Data-Stream">Start
     *     Isolated Margin User Data Stream (USER_STREAM) Documentation</a>
     */
    public ApiResponse<StartIsolatedMarginUserDataStreamResponse> startIsolatedMarginUserDataStream(
            StartIsolatedMarginUserDataStreamRequest startIsolatedMarginUserDataStreamRequest)
            throws ApiException {
        return tradeDataStreamApi.startIsolatedMarginUserDataStream(
                startIsolatedMarginUserDataStreamRequest);
    }

    /**
     * Start Margin User Data Stream (USER_STREAM) Start a new margin user data stream. The stream
     * will close after 60 minutes unless a keepalive is sent. If the account has an active
     * listenKey, that listenKey will be returned and its validity will be extended for 60 minutes.
     * Weight: 1
     *
     * @return ApiResponse&lt;StartMarginUserDataStreamResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Start Margin User Data Stream </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/margin_trading/trade-data-stream/Start-Margin-User-Data-Stream">Start
     *     Margin User Data Stream (USER_STREAM) Documentation</a>
     */
    public ApiResponse<StartMarginUserDataStreamResponse> startMarginUserDataStream()
            throws ApiException {
        return tradeDataStreamApi.startMarginUserDataStream();
    }

    /**
     * Get Cross Margin Transfer History (USER_DATA) Get Cross Margin Transfer History * Response in
     * descending order * The max interval between &#x60;startTime&#x60; and &#x60;endTime&#x60; is
     * 30 days. * Returns data for last 7 days by default Weight: 1(IP)
     *
     * @param asset (optional)
     * @param type Transfer Type: ROLL_IN, ROLL_OUT (optional)
     * @param startTime 只支持查询最近90天的数据 (optional)
     * @param endTime (optional)
     * @param current Currently querying page. Start from 1. Default:1 (optional)
     * @param size Default:10 Max:100 (optional)
     * @param isolatedSymbol isolated symbol (optional)
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/transfer/Get-Cross-Margin-Transfer-History">Get
     *     Cross Margin Transfer History (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetCrossMarginTransferHistoryResponse> getCrossMarginTransferHistory(
            String asset,
            String type,
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
     * Query Max Transfer-Out Amount (USER_DATA) Query Max Transfer-Out Amount * If isolatedSymbol
     * is not sent, crossed margin data will be sent. Weight: 50(IP)
     *
     * @param asset (required)
     * @param isolatedSymbol isolated symbol (optional)
     * @param recvWindow No more than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/margin_trading/transfer/Query-Max-Transfer-Out-Amount">Query
     *     Max Transfer-Out Amount (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryMaxTransferOutAmountResponse> queryMaxTransferOutAmount(
            String asset, String isolatedSymbol, Long recvWindow) throws ApiException {
        return transferApi.queryMaxTransferOutAmount(asset, isolatedSymbol, recvWindow);
    }
}
