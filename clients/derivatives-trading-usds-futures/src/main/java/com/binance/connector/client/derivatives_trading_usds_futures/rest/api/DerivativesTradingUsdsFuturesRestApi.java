package com.binance.connector.client.derivatives_trading_usds_futures.rest.api;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.AcceptTheOfferedQuoteRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.AcceptTheOfferedQuoteResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.AccountInformationV2Response;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.AccountInformationV3Response;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.AccountTradeListResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.AllOrdersResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.AutoCancelAllOpenOrdersRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.AutoCancelAllOpenOrdersResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.AutoCloseType;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.BasisResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.CancelAllOpenOrdersResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.CancelMultipleOrdersResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.CancelOrderResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ChangeInitialLeverageRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ChangeInitialLeverageResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ChangeMarginTypeRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ChangeMarginTypeResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ChangeMultiAssetsModeRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ChangeMultiAssetsModeResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ChangePositionModeRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ChangePositionModeResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.CheckServerTimeResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ClassicPortfolioMarginAccountInformationResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.CompositeIndexSymbolInformationResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.CompressedAggregateTradesListResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ContinuousContractKlineCandlestickDataResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ContractType;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.CurrentAllOpenOrdersResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ExchangeInformationResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.FuturesAccountBalanceV2Response;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.FuturesAccountBalanceV3Response;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.FuturesAccountConfigurationResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.FuturesTradingQuantitativeRulesIndicatorsResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.GetBnbBurnStatusResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.GetCurrentMultiAssetsModeResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.GetCurrentPositionModeResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.GetDownloadIdForFuturesOrderHistoryResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.GetDownloadIdForFuturesTradeHistoryResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.GetDownloadIdForFuturesTransactionHistoryResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.GetFundingRateHistoryResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.GetFundingRateInfoResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.GetFuturesOrderHistoryDownloadLinkByIdResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.GetFuturesTradeDownloadLinkByIdResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.GetFuturesTransactionHistoryDownloadLinkByIdResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.GetIncomeHistoryResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.GetOrderModifyHistoryResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.GetPositionMarginChangeHistoryResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.IndexPriceKlineCandlestickDataResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.Interval;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.KeepaliveUserDataStreamResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.KlineCandlestickDataResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ListAllConvertPairsResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.LongShortRatioResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.MarkPriceKlineCandlestickDataResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.MarkPriceResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ModifyIsolatedPositionMarginRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ModifyIsolatedPositionMarginResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ModifyMultipleOrdersRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ModifyMultipleOrdersResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ModifyOrderRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ModifyOrderResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.MultiAssetsModeAssetIndexResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.NewOrderRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.NewOrderResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.NotionalAndLeverageBracketsResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.OldTradesLookupResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.OpenInterestResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.OpenInterestStatisticsResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.OrderBookResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.OrderIdList;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.OrderStatusResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.OrigClientOrderIdList;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.Period;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.PlaceMultipleOrdersRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.PlaceMultipleOrdersResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.PositionAdlQuantileEstimationResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.PositionInformationV2Response;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.PositionInformationV3Response;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.PremiumIndexKlineDataResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.QuarterlyContractSettlementPriceResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.QueryCurrentOpenOrderResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.QueryIndexPriceConstituentsResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.QueryInsuranceFundBalanceSnapshotResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.QueryOrderResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.QueryUserRateLimitResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.RecentTradesListResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.SendQuoteRequestRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.SendQuoteRequestResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.StartUserDataStreamResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.SymbolConfigurationResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.SymbolOrderBookTickerResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.SymbolPriceTickerResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.SymbolPriceTickerV2Response;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.TakerBuySellVolumeResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.TestOrderRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.TestOrderResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.Ticker24hrPriceChangeStatisticsResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ToggleBnbBurnOnFuturesTradeRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ToggleBnbBurnOnFuturesTradeResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.TopTraderLongShortRatioAccountsResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.TopTraderLongShortRatioPositionsResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.UserCommissionRateResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.UsersForceOrdersResponse;

public class DerivativesTradingUsdsFuturesRestApi {

    private final AccountApi accountApi;
    private final ConvertApi convertApi;
    private final MarketDataApi marketDataApi;
    private final PortfolioMarginEndpointsApi portfolioMarginEndpointsApi;
    private final TradeApi tradeApi;
    private final UserDataStreamsApi userDataStreamsApi;

    public DerivativesTradingUsdsFuturesRestApi(ClientConfiguration configuration) {
        this(DerivativesTradingUsdsFuturesRestApiUtil.getDefaultClient(configuration));
    }

    public DerivativesTradingUsdsFuturesRestApi(ApiClient apiClient) {
        this.accountApi = new AccountApi(apiClient);
        this.convertApi = new ConvertApi(apiClient);
        this.marketDataApi = new MarketDataApi(apiClient);
        this.portfolioMarginEndpointsApi = new PortfolioMarginEndpointsApi(apiClient);
        this.tradeApi = new TradeApi(apiClient);
        this.userDataStreamsApi = new UserDataStreamsApi(apiClient);
    }

    /**
     * Account Information V2(USER_DATA) Get current account information. User in single-asset/
     * multi-assets mode will see different value, see comments in response section for detail.
     * Weight: 5
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;AccountInformationV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Account Information V2 </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/account/rest-api/Account-Information-V2">Account
     *     Information V2(USER_DATA) Documentation</a>
     */
    public ApiResponse<AccountInformationV2Response> accountInformationV2(Long recvWindow)
            throws ApiException {
        return accountApi.accountInformationV2(recvWindow);
    }

    /**
     * Account Information V3(USER_DATA) Get current account information. User in single-asset/
     * multi-assets mode will see different value, see comments in response section for detail.
     * Weight: 5
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;AccountInformationV3Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Account Information V3 </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/account/rest-api/Account-Information-V3">Account
     *     Information V3(USER_DATA) Documentation</a>
     */
    public ApiResponse<AccountInformationV3Response> accountInformationV3(Long recvWindow)
            throws ApiException {
        return accountApi.accountInformationV3(recvWindow);
    }

    /**
     * Futures Account Balance V2 (USER_DATA) Query account balance info Weight: 5
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;FuturesAccountBalanceV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Futures Account Balance V2 </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/account/rest-api/Futures-Account-Balance-V2">Futures
     *     Account Balance V2 (USER_DATA) Documentation</a>
     */
    public ApiResponse<FuturesAccountBalanceV2Response> futuresAccountBalanceV2(Long recvWindow)
            throws ApiException {
        return accountApi.futuresAccountBalanceV2(recvWindow);
    }

    /**
     * Futures Account Balance V3 (USER_DATA) Query account balance info Weight: 5
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;FuturesAccountBalanceV3Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Futures Account Balance V3 </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/account/rest-api/Futures-Account-Balance-V3">Futures
     *     Account Balance V3 (USER_DATA) Documentation</a>
     */
    public ApiResponse<FuturesAccountBalanceV3Response> futuresAccountBalanceV3(Long recvWindow)
            throws ApiException {
        return accountApi.futuresAccountBalanceV3(recvWindow);
    }

    /**
     * Futures Account Configuration(USER_DATA) Query account configuration Weight: 5
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;FuturesAccountConfigurationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Futures Account Configuration </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/account/rest-api/Account-Config">Futures
     *     Account Configuration(USER_DATA) Documentation</a>
     */
    public ApiResponse<FuturesAccountConfigurationResponse> futuresAccountConfiguration(
            Long recvWindow) throws ApiException {
        return accountApi.futuresAccountConfiguration(recvWindow);
    }

    /**
     * Futures Trading Quantitative Rules Indicators (USER_DATA) Futures trading quantitative rules
     * indicators, for more information on this, please refer to the [Futures Trading Quantitative
     * Rules](https://www.binance.com/en/support/faq/4f462ebe6ff445d4a170be7d9e897272) Weight: - 1
     * for a single symbol - 10 when the symbol parameter is omitted
     *
     * @param symbol (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;FuturesTradingQuantitativeRulesIndicatorsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Futures Trading Quantitative Rules Indicators </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/account/rest-api/Futures-Trading-Quantitative-Rules-Indicators">Futures
     *     Trading Quantitative Rules Indicators (USER_DATA) Documentation</a>
     */
    public ApiResponse<FuturesTradingQuantitativeRulesIndicatorsResponse>
            futuresTradingQuantitativeRulesIndicators(String symbol, Long recvWindow)
                    throws ApiException {
        return accountApi.futuresTradingQuantitativeRulesIndicators(symbol, recvWindow);
    }

    /**
     * Get BNB Burn Status (USER_DATA) Get user&#39;s BNB Fee Discount (Fee Discount On or Fee
     * Discount Off ) Weight: 30
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/account/rest-api/Get-BNB-Burn-Status">Get
     *     BNB Burn Status (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetBnbBurnStatusResponse> getBnbBurnStatus(Long recvWindow)
            throws ApiException {
        return accountApi.getBnbBurnStatus(recvWindow);
    }

    /**
     * Get Current Multi-Assets Mode (USER_DATA) Get user&#39;s Multi-Assets mode (Multi-Assets Mode
     * or Single-Asset Mode) on ***Every symbol*** Weight: 30
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetCurrentMultiAssetsModeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Current Multi-Assets Mode </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/account/rest-api/Get-Current-Multi-Assets-Mode">Get
     *     Current Multi-Assets Mode (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetCurrentMultiAssetsModeResponse> getCurrentMultiAssetsMode(Long recvWindow)
            throws ApiException {
        return accountApi.getCurrentMultiAssetsMode(recvWindow);
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/account/rest-api/Get-Current-Position-Mode">Get
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
     * than 1 year Weight: 1000
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/account/rest-api/Get-Download-Id-For-Futures-Order-History">Get
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
     * year Weight: 1000
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/account/rest-api/Get-Download-Id-For-Futures-Trade-History">Get
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
     * longer than 1 year Weight: 1000
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/account/rest-api/Get-Download-Id-For-Futures-Transaction-History">Get
     *     Download Id For Futures Transaction History(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetDownloadIdForFuturesTransactionHistoryResponse>
            getDownloadIdForFuturesTransactionHistory(Long startTime, Long endTime, Long recvWindow)
                    throws ApiException {
        return accountApi.getDownloadIdForFuturesTransactionHistory(startTime, endTime, recvWindow);
    }

    /**
     * Get Futures Order History Download Link by Id (USER_DATA) Get futures order history download
     * link by Id * Download link expiration: 24h Weight: 10
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/account/rest-api/Get-Futures-Order-History-Download-Link-by-Id">Get
     *     Futures Order History Download Link by Id (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetFuturesOrderHistoryDownloadLinkByIdResponse>
            getFuturesOrderHistoryDownloadLinkById(String downloadId, Long recvWindow)
                    throws ApiException {
        return accountApi.getFuturesOrderHistoryDownloadLinkById(downloadId, recvWindow);
    }

    /**
     * Get Futures Trade Download Link by Id(USER_DATA) Get futures trade download link by Id *
     * Download link expiration: 24h Weight: 10
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/account/rest-api/Get-Futures-Trade-Download-Link-by-Id">Get
     *     Futures Trade Download Link by Id(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetFuturesTradeDownloadLinkByIdResponse> getFuturesTradeDownloadLinkById(
            String downloadId, Long recvWindow) throws ApiException {
        return accountApi.getFuturesTradeDownloadLinkById(downloadId, recvWindow);
    }

    /**
     * Get Futures Transaction History Download Link by Id (USER_DATA) Get futures transaction
     * history download link by Id * Download link expiration: 24h Weight: 10
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/account/rest-api/Get-Futures-Transaction-History-Download-Link-by-Id">Get
     *     Futures Transaction History Download Link by Id (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetFuturesTransactionHistoryDownloadLinkByIdResponse>
            getFuturesTransactionHistoryDownloadLinkById(String downloadId, Long recvWindow)
                    throws ApiException {
        return accountApi.getFuturesTransactionHistoryDownloadLinkById(downloadId, recvWindow);
    }

    /**
     * Get Income History (USER_DATA) Query income history * If neither &#x60;startTime&#x60; nor
     * &#x60;endTime&#x60; is sent, the recent 7-day data will be returned. * If &#x60;incomeType
     * &#x60; is not sent, all kinds of flow will be returned * \&quot;trandId\&quot; is unique in
     * the same incomeType for a user * Income history only contains data for the last three months
     * Weight: 30
     *
     * @param symbol (optional)
     * @param incomeType TRANSFER, WELCOME_BONUS, REALIZED_PNL, FUNDING_FEE, COMMISSION,
     *     INSURANCE_CLEAR, REFERRAL_KICKBACK, COMMISSION_REBATE, API_REBATE, CONTEST_REWARD,
     *     CROSS_COLLATERAL_TRANSFER, OPTIONS_PREMIUM_FEE, OPTIONS_SETTLE_PROFIT, INTERNAL_TRANSFER,
     *     AUTO_EXCHANGE, DELIVERED_SETTELMENT, COIN_SWAP_DEPOSIT, COIN_SWAP_WITHDRAW,
     *     POSITION_LIMIT_INCREASE_FEE, STRATEGY_UMFUTURES_TRANSFER，FEE_RETURN，BFUSD_REWARD
     *     (optional)
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/account/rest-api/Get-Income-History">Get
     *     Income History (USER_DATA) Documentation</a>
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
     * Notional and Leverage Brackets (USER_DATA) Query user notional and leverage bracket on
     * speicfic symbol Weight: 1
     *
     * @param symbol (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;NotionalAndLeverageBracketsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Notional and Leverage Brackets </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/account/rest-api/Notional-and-Leverage-Brackets">Notional
     *     and Leverage Brackets (USER_DATA) Documentation</a>
     */
    public ApiResponse<NotionalAndLeverageBracketsResponse> notionalAndLeverageBrackets(
            String symbol, Long recvWindow) throws ApiException {
        return accountApi.notionalAndLeverageBrackets(symbol, recvWindow);
    }

    /**
     * Query User Rate Limit (USER_DATA) Query User Rate Limit Weight: 1
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryUserRateLimitResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User Rate Limit </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/account/rest-api/Query-Rate-Limit">Query
     *     User Rate Limit (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryUserRateLimitResponse> queryUserRateLimit(Long recvWindow)
            throws ApiException {
        return accountApi.queryUserRateLimit(recvWindow);
    }

    /**
     * Symbol Configuration(USER_DATA) Get current account symbol configuration. Weight: 5
     *
     * @param symbol (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;SymbolConfigurationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Symbol Configuration </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/account/rest-api/Symbol-Config">Symbol
     *     Configuration(USER_DATA) Documentation</a>
     */
    public ApiResponse<SymbolConfigurationResponse> symbolConfiguration(
            String symbol, Long recvWindow) throws ApiException {
        return accountApi.symbolConfiguration(symbol, recvWindow);
    }

    /**
     * Toggle BNB Burn On Futures Trade (TRADE) Change user&#39;s BNB Fee Discount (Fee Discount On
     * or Fee Discount Off ) on ***EVERY symbol*** Weight: 1
     *
     * @param toggleBnbBurnOnFuturesTradeRequest (required)
     * @return ApiResponse&lt;ToggleBnbBurnOnFuturesTradeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Toggle BNB Burn On Futures Trade </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/account/rest-api/Toggle-BNB-Burn-On-Futures-Trade">Toggle
     *     BNB Burn On Futures Trade (TRADE) Documentation</a>
     */
    public ApiResponse<ToggleBnbBurnOnFuturesTradeResponse> toggleBnbBurnOnFuturesTrade(
            ToggleBnbBurnOnFuturesTradeRequest toggleBnbBurnOnFuturesTradeRequest)
            throws ApiException {
        return accountApi.toggleBnbBurnOnFuturesTrade(toggleBnbBurnOnFuturesTradeRequest);
    }

    /**
     * User Commission Rate (USER_DATA) Get User Commission Rate Weight: 20
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/account/rest-api/User-Commission-Rate">User
     *     Commission Rate (USER_DATA) Documentation</a>
     */
    public ApiResponse<UserCommissionRateResponse> userCommissionRate(
            String symbol, Long recvWindow) throws ApiException {
        return accountApi.userCommissionRate(symbol, recvWindow);
    }

    /**
     * Accept the offered quote (USER_DATA) Accept the offered quote by quote ID. Weight: 200(IP)
     *
     * @param acceptTheOfferedQuoteRequest (required)
     * @return ApiResponse&lt;AcceptTheOfferedQuoteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Accept the offered quote </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/convert/Accept-Quote">Accept
     *     the offered quote (USER_DATA) Documentation</a>
     */
    public ApiResponse<AcceptTheOfferedQuoteResponse> acceptTheOfferedQuote(
            AcceptTheOfferedQuoteRequest acceptTheOfferedQuoteRequest) throws ApiException {
        return convertApi.acceptTheOfferedQuote(acceptTheOfferedQuoteRequest);
    }

    /**
     * List All Convert Pairs Query for all convertible token pairs and the tokens’ respective
     * upper/lower limits * User needs to supply either or both of the input parameter * If not
     * defined for both fromAsset and toAsset, only partial token pairs will be returned * Asset
     * BNFCR is only available to convert for MICA region users. Weight: 20(IP)
     *
     * @param fromAsset User spends coin (optional)
     * @param toAsset User receives coin (optional)
     * @return ApiResponse&lt;ListAllConvertPairsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> List All Convert Pairs </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/convert/">List
     *     All Convert Pairs Documentation</a>
     */
    public ApiResponse<ListAllConvertPairsResponse> listAllConvertPairs(
            String fromAsset, String toAsset) throws ApiException {
        return convertApi.listAllConvertPairs(fromAsset, toAsset);
    }

    /**
     * Order status(USER_DATA) Query order status by order ID. Weight: 50(IP)
     *
     * @param orderId Either orderId or quoteId is required (optional)
     * @param quoteId Either orderId or quoteId is required (optional)
     * @return ApiResponse&lt;OrderStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Order status </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/convert/Order-Status">Order
     *     status(USER_DATA) Documentation</a>
     */
    public ApiResponse<OrderStatusResponse> orderStatus(Long orderId, String quoteId)
            throws ApiException {
        return convertApi.orderStatus(orderId, quoteId);
    }

    /**
     * Send Quote Request(USER_DATA) Request a quote for the requested token pairs * Either
     * fromAmount or toAmount should be sent * &#x60;quoteId&#x60; will be returned only if you have
     * enough funds to convert Weight: 50(IP)
     *
     * @param sendQuoteRequestRequest (required)
     * @return ApiResponse&lt;SendQuoteRequestResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Send Quote Request </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/convert/Send-quote-request">Send
     *     Quote Request(USER_DATA) Documentation</a>
     */
    public ApiResponse<SendQuoteRequestResponse> sendQuoteRequest(
            SendQuoteRequestRequest sendQuoteRequestRequest) throws ApiException {
        return convertApi.sendQuoteRequest(sendQuoteRequestRequest);
    }

    /**
     * Basis Query future basis * If startTime and endTime are not sent, the most recent data is
     * returned. * Only the data of the latest 30 days is available. Weight: 0
     *
     * @param pair (required)
     * @param contractType (required)
     * @param period
     *     \&quot;5m\&quot;,\&quot;15m\&quot;,\&quot;30m\&quot;,\&quot;1h\&quot;,\&quot;2h\&quot;,\&quot;4h\&quot;,\&quot;6h\&quot;,\&quot;12h\&quot;,\&quot;1d\&quot;
     *     (required)
     * @param limit Default 30,Max 500 (required)
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/market-data/rest-api/Basis">Basis
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
     * Check Server Time Test connectivity to the Rest API and get the current server time. Weight:
     * 1
     *
     * @return ApiResponse&lt;CheckServerTimeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Check Server Time </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/market-data/rest-api/Check-Server-Time">Check
     *     Server Time Documentation</a>
     */
    public ApiResponse<CheckServerTimeResponse> checkServerTime() throws ApiException {
        return marketDataApi.checkServerTime();
    }

    /**
     * Composite Index Symbol Information Query composite index symbol information * Only for
     * composite index symbols Weight: 1
     *
     * @param symbol (optional)
     * @return ApiResponse&lt;CompositeIndexSymbolInformationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Composite Index Symbol Information </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/market-data/rest-api/Composite-Index-Symbol-Information">Composite
     *     Index Symbol Information Documentation</a>
     */
    public ApiResponse<CompositeIndexSymbolInformationResponse> compositeIndexSymbolInformation(
            String symbol) throws ApiException {
        return marketDataApi.compositeIndexSymbolInformation(symbol);
    }

    /**
     * Compressed/Aggregate Trades List Get compressed, aggregate market trades. Market trades that
     * fill in 100ms with the same price and the same taking side will have the quantity aggregated.
     * * support querying futures trade histories that are not older than one year * If both
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/market-data/rest-api/Compressed-Aggregate-Trades-List">Compressed/Aggregate
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
     * type. Klines are uniquely identified by their open time. * If startTime and endTime are not
     * sent, the most recent klines are returned. * Contract type: * PERPETUAL * CURRENT_QUARTER *
     * NEXT_QUARTER Weight: based on parameter LIMIT | LIMIT | weight | | ----------- | ------ | |
     * [1,100) | 1 | | [100, 500) | 2 | | [500, 1000] | 5 | | &gt; 1000 | 10 |
     *
     * @param pair (required)
     * @param contractType (required)
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/market-data/rest-api/Continuous-Contract-Kline-Candlestick-Data">Continuous
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/market-data/rest-api/Exchange-Information">Exchange
     *     Information Documentation</a>
     */
    public ApiResponse<ExchangeInformationResponse> exchangeInformation() throws ApiException {
        return marketDataApi.exchangeInformation();
    }

    /**
     * Get Funding Rate History Get Funding Rate History * If &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; are not sent, the most recent 200 records are returned. * If the number
     * of data between &#x60;startTime&#x60; and &#x60;endTime&#x60; is larger than
     * &#x60;limit&#x60;, return as &#x60;startTime&#x60; + &#x60;limit&#x60;. * In ascending order.
     * Weight: share 500/5min/IP rate limit with GET /fapi/v1/fundingInfo
     *
     * @param symbol (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit Default 100; max 1000 (optional)
     * @return ApiResponse&lt;GetFundingRateHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Funding Rate History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/market-data/rest-api/Get-Funding-Rate-History">Get
     *     Funding Rate History Documentation</a>
     */
    public ApiResponse<GetFundingRateHistoryResponse> getFundingRateHistory(
            String symbol, Long startTime, Long endTime, Long limit) throws ApiException {
        return marketDataApi.getFundingRateHistory(symbol, startTime, endTime, limit);
    }

    /**
     * Get Funding Rate Info Query funding rate info for symbols that had FundingRateCap/
     * FundingRateFloor / fundingIntervalHours adjustment Weight: 0 share 500/5min/IP rate limit
     * with GET /fapi/v1/fundingInfo
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/market-data/rest-api/Get-Funding-Rate-Info">Get
     *     Funding Rate Info Documentation</a>
     */
    public ApiResponse<GetFundingRateInfoResponse> getFundingRateInfo() throws ApiException {
        return marketDataApi.getFundingRateInfo();
    }

    /**
     * Index Price Kline/Candlestick Data Kline/candlestick bars for the index price of a pair.
     * Klines are uniquely identified by their open time. * If startTime and endTime are not sent,
     * the most recent klines are returned. Weight: based on parameter LIMIT | LIMIT | weight | |
     * ----------- | ------ | | [1,100) | 1 | | [100, 500) | 2 | | [500, 1000] | 5 | | &gt; 1000 |
     * 10 |
     *
     * @param pair (required)
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/market-data/rest-api/Index-Price-Kline-Candlestick-Data">Index
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
     * their open time. * If startTime and endTime are not sent, the most recent klines are
     * returned. Weight: based on parameter LIMIT | LIMIT | weight | | ----------- | ------ | |
     * [1,100) | 1 | | [100, 500) | 2 | | [500, 1000] | 5 | | &gt; 1000 | 10 |
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/market-data/rest-api/Kline-Candlestick-Data">Kline/Candlestick
     *     Data Documentation</a>
     */
    public ApiResponse<KlineCandlestickDataResponse> klineCandlestickData(
            String symbol, Interval interval, Long startTime, Long endTime, Long limit)
            throws ApiException {
        return marketDataApi.klineCandlestickData(symbol, interval, startTime, endTime, limit);
    }

    /**
     * Long/Short Ratio Query symbol Long/Short Ratio * If startTime and endTime are not sent, the
     * most recent data is returned. * Only the data of the latest 30 days is available. * IP rate
     * limit 1000 requests/5min Weight: 0
     *
     * @param symbol (required)
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/market-data/rest-api/Long-Short-Ratio">Long/Short
     *     Ratio Documentation</a>
     */
    public ApiResponse<LongShortRatioResponse> longShortRatio(
            String symbol, Period period, Long limit, Long startTime, Long endTime)
            throws ApiException {
        return marketDataApi.longShortRatio(symbol, period, limit, startTime, endTime);
    }

    /**
     * Mark Price Mark Price and Funding Rate Weight: 1
     *
     * @param symbol (optional)
     * @return ApiResponse&lt;MarkPriceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Mark Price </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/market-data/rest-api/Mark-Price">Mark
     *     Price Documentation</a>
     */
    public ApiResponse<MarkPriceResponse> markPrice(String symbol) throws ApiException {
        return marketDataApi.markPrice(symbol);
    }

    /**
     * Mark Price Kline/Candlestick Data Kline/candlestick bars for the mark price of a symbol.
     * Klines are uniquely identified by their open time. * If startTime and endTime are not sent,
     * the most recent klines are returned. Weight: based on parameter LIMIT | LIMIT | weight | |
     * ----------- | ------ | | [1,100) | 1 | | [100, 500) | 2 | | [500, 1000] | 5 | | &gt; 1000 |
     * 10 |
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/market-data/rest-api/Mark-Price-Kline-Candlestick-Data">Mark
     *     Price Kline/Candlestick Data Documentation</a>
     */
    public ApiResponse<MarkPriceKlineCandlestickDataResponse> markPriceKlineCandlestickData(
            String symbol, Interval interval, Long startTime, Long endTime, Long limit)
            throws ApiException {
        return marketDataApi.markPriceKlineCandlestickData(
                symbol, interval, startTime, endTime, limit);
    }

    /**
     * Multi-Assets Mode Asset Index asset index for Multi-Assets mode Weight: 1 for a single
     * symbol; 10 when the symbol parameter is omitted
     *
     * @param symbol (optional)
     * @return ApiResponse&lt;MultiAssetsModeAssetIndexResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Multi-Assets Mode Asset Index </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/market-data/rest-api/Multi-Assets-Mode-Asset-Index">Multi-Assets
     *     Mode Asset Index Documentation</a>
     */
    public ApiResponse<MultiAssetsModeAssetIndexResponse> multiAssetsModeAssetIndex(String symbol)
            throws ApiException {
        return marketDataApi.multiAssetsModeAssetIndex(symbol);
    }

    /**
     * Old Trades Lookup (MARKET_DATA) Get older market historical trades. * Market trades means
     * trades filled in the order book. Only market trades will be returned, which means the
     * insurance fund trades and ADL trades won&#39;t be returned. * Only supports data from within
     * the last three months Weight: 20
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/market-data/rest-api/Old-Trades-Lookup">Old
     *     Trades Lookup (MARKET_DATA) Documentation</a>
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/market-data/rest-api/Open-Interest">Open
     *     Interest Documentation</a>
     */
    public ApiResponse<OpenInterestResponse> openInterest(String symbol) throws ApiException {
        return marketDataApi.openInterest(symbol);
    }

    /**
     * Open Interest Statistics Open Interest Statistics * If startTime and endTime are not sent,
     * the most recent data is returned. * Only the data of the latest 1 month is available. * IP
     * rate limit 1000 requests/5min Weight: 0
     *
     * @param symbol (required)
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/market-data/rest-api/Open-Interest-Statistics">Open
     *     Interest Statistics Documentation</a>
     */
    public ApiResponse<OpenInterestStatisticsResponse> openInterestStatistics(
            String symbol, Period period, Long limit, Long startTime, Long endTime)
            throws ApiException {
        return marketDataApi.openInterestStatistics(symbol, period, limit, startTime, endTime);
    }

    /**
     * Order Book Query symbol orderbook Weight: Adjusted based on the limit: | Limit | Weight | |
     * ------------- | ------ | | 5, 10, 20, 50 | 2 | | 100 | 5 | | 500 | 10 | | 1000 | 20 |
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/market-data/rest-api/Order-Book">Order
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/market-data/rest-api/Premium-index-Kline-Data">Premium
     *     index Kline Data Documentation</a>
     */
    public ApiResponse<PremiumIndexKlineDataResponse> premiumIndexKlineData(
            String symbol, Interval interval, Long startTime, Long endTime, Long limit)
            throws ApiException {
        return marketDataApi.premiumIndexKlineData(symbol, interval, startTime, endTime, limit);
    }

    /**
     * Quarterly Contract Settlement Price Latest price for a symbol or symbols. Weight: 0
     *
     * @param pair (required)
     * @return ApiResponse&lt;QuarterlyContractSettlementPriceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Quarterly Contract Settlement Price </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/market-data/rest-api/Delivery-Price">Quarterly
     *     Contract Settlement Price Documentation</a>
     */
    public ApiResponse<QuarterlyContractSettlementPriceResponse> quarterlyContractSettlementPrice(
            String pair) throws ApiException {
        return marketDataApi.quarterlyContractSettlementPrice(pair);
    }

    /**
     * Query Index Price Constituents Query index price constituents Weight: 2
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/market-data/rest-api/Index-Constituents">Query
     *     Index Price Constituents Documentation</a>
     */
    public ApiResponse<QueryIndexPriceConstituentsResponse> queryIndexPriceConstituents(
            String symbol) throws ApiException {
        return marketDataApi.queryIndexPriceConstituents(symbol);
    }

    /**
     * Query Insurance Fund Balance Snapshot Query Insurance Fund Balance Snapshot Weight: 1
     *
     * @param symbol (optional)
     * @return ApiResponse&lt;QueryInsuranceFundBalanceSnapshotResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Insurance Fund Balance Snapshot </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/market-data/rest-api/Query-Insurance-Fund-Balance-Snapshot">Query
     *     Insurance Fund Balance Snapshot Documentation</a>
     */
    public ApiResponse<QueryInsuranceFundBalanceSnapshotResponse> queryInsuranceFundBalanceSnapshot(
            String symbol) throws ApiException {
        return marketDataApi.queryInsuranceFundBalanceSnapshot(symbol);
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/market-data/rest-api/Recent-Trades-List">Recent
     *     Trades List Documentation</a>
     */
    public ApiResponse<RecentTradesListResponse> recentTradesList(String symbol, Long limit)
            throws ApiException {
        return marketDataApi.recentTradesList(symbol, limit);
    }

    /**
     * Symbol Order Book Ticker Best price/qty on the order book for a symbol or symbols. * If the
     * symbol is not sent, bookTickers for all symbols will be returned in an array. * The field
     * &#x60;X-MBX-USED-WEIGHT-1M&#x60; in response header is not accurate from this endpoint,
     * please ignore. Weight: 2 for a single symbol; 5 when the symbol parameter is omitted
     *
     * @param symbol (optional)
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/market-data/rest-api/Symbol-Order-Book-Ticker">Symbol
     *     Order Book Ticker Documentation</a>
     */
    public ApiResponse<SymbolOrderBookTickerResponse> symbolOrderBookTicker(String symbol)
            throws ApiException {
        return marketDataApi.symbolOrderBookTicker(symbol);
    }

    /**
     * Symbol Price Ticker(Deprecated) Latest price for a symbol or symbols. * If the symbol is not
     * sent, prices for all symbols will be returned in an array. Weight: 1 for a single symbol; 2
     * when the symbol parameter is omitted
     *
     * @param symbol (optional)
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/market-data/rest-api/Symbol-Price-Ticker">Symbol
     *     Price Ticker(Deprecated) Documentation</a>
     */
    public ApiResponse<SymbolPriceTickerResponse> symbolPriceTicker(String symbol)
            throws ApiException {
        return marketDataApi.symbolPriceTicker(symbol);
    }

    /**
     * Symbol Price Ticker V2 Latest price for a symbol or symbols. * If the symbol is not sent,
     * prices for all symbols will be returned in an array. * The field
     * &#x60;X-MBX-USED-WEIGHT-1M&#x60; in response header is not accurate from this endpoint,
     * please ignore. Weight: 1 for a single symbol; 2 when the symbol parameter is omitted
     *
     * @param symbol (optional)
     * @return ApiResponse&lt;SymbolPriceTickerV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Symbol Price Ticker V2 </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/market-data/rest-api/Symbol-Price-Ticker-V2">Symbol
     *     Price Ticker V2 Documentation</a>
     */
    public ApiResponse<SymbolPriceTickerV2Response> symbolPriceTickerV2(String symbol)
            throws ApiException {
        return marketDataApi.symbolPriceTickerV2(symbol);
    }

    /**
     * Taker Buy/Sell Volume Taker Buy/Sell Volume * If startTime and endTime are not sent, the most
     * recent data is returned. * Only the data of the latest 30 days is available. * IP rate limit
     * 1000 requests/5min Weight: 0
     *
     * @param symbol (required)
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/market-data/rest-api/Taker-BuySell-Volume">Taker
     *     Buy/Sell Volume Documentation</a>
     */
    public ApiResponse<TakerBuySellVolumeResponse> takerBuySellVolume(
            String symbol, Period period, Long limit, Long startTime, Long endTime)
            throws ApiException {
        return marketDataApi.takerBuySellVolume(symbol, period, limit, startTime, endTime);
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/market-data/rest-api/Test-Connectivity">Test
     *     Connectivity Documentation</a>
     */
    public void testConnectivity() throws ApiException {
        marketDataApi.testConnectivity();
    }

    /**
     * 24hr Ticker Price Change Statistics 24 hour rolling window price change statistics.
     * **Careful** when accessing this with no symbol. * If the symbol is not sent, tickers for all
     * symbols will be returned in an array. Weight: 1 for a single symbol; 40 when the symbol
     * parameter is omitted
     *
     * @param symbol (optional)
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/market-data/rest-api/24hr-Ticker-Price-Change-Statistics">24hr
     *     Ticker Price Change Statistics Documentation</a>
     */
    public ApiResponse<Ticker24hrPriceChangeStatisticsResponse> ticker24hrPriceChangeStatistics(
            String symbol) throws ApiException {
        return marketDataApi.ticker24hrPriceChangeStatistics(symbol);
    }

    /**
     * Top Trader Long/Short Ratio (Accounts) The proportion of net long and net short accounts to
     * total accounts of the top 20% users with the highest margin balance. Each account is counted
     * once only. Long Account % &#x3D; Accounts of top traders with net long positions / Total
     * accounts of top traders with open positions Short Account % &#x3D; Accounts of top traders
     * with net short positions / Total accounts of top traders with open positions Long/Short Ratio
     * (Accounts) &#x3D; Long Account % / Short Account % * If startTime and endTime are not sent,
     * the most recent data is returned. * Only the data of the latest 30 days is available. * IP
     * rate limit 1000 requests/5min Weight: 0
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/market-data/rest-api/Top-Long-Short-Account-Ratio">Top
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
     * sent, the most recent data is returned. * Only the data of the latest 30 days is available. *
     * IP rate limit 1000 requests/5min Weight: 0
     *
     * @param symbol (required)
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/market-data/rest-api/Top-Trader-Long-Short-Ratio">Top
     *     Trader Long/Short Ratio (Positions) Documentation</a>
     */
    public ApiResponse<TopTraderLongShortRatioPositionsResponse> topTraderLongShortRatioPositions(
            String symbol, Period period, Long limit, Long startTime, Long endTime)
            throws ApiException {
        return marketDataApi.topTraderLongShortRatioPositions(
                symbol, period, limit, startTime, endTime);
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/portfolio-margin-endpoints/Classic-Portfolio-Margin-Account-Information">Classic
     *     Portfolio Margin Account Information (USER_DATA) Documentation</a>
     */
    public ApiResponse<ClassicPortfolioMarginAccountInformationResponse>
            classicPortfolioMarginAccountInformation(String asset, Long recvWindow)
                    throws ApiException {
        return portfolioMarginEndpointsApi.classicPortfolioMarginAccountInformation(
                asset, recvWindow);
    }

    /**
     * Account Trade List (USER_DATA) Get trades for a specific account and symbol. * If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 7 days&#39;
     * data will be returned. * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60;
     * cannot be longer than 7 days. * The parameter &#x60;fromId&#x60; cannot be sent with
     * &#x60;startTime&#x60; or &#x60;endTime&#x60;. * Only support querying trade in the past 6
     * months Weight: 5
     *
     * @param symbol (required)
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/trade/rest-api/Account-Trade-List">Account
     *     Trade List (USER_DATA) Documentation</a>
     */
    public ApiResponse<AccountTradeListResponse> accountTradeList(
            String symbol,
            Long orderId,
            Long startTime,
            Long endTime,
            Long fromId,
            Long limit,
            Long recvWindow)
            throws ApiException {
        return tradeApi.accountTradeList(
                symbol, orderId, startTime, endTime, fromId, limit, recvWindow);
    }

    /**
     * All Orders (USER_DATA) Get all account orders; active, canceled, or filled. * These orders
     * will not be found: * order status is &#x60;CANCELED&#x60; or &#x60;EXPIRED&#x60; **AND**
     * order has NO filled trade **AND** created time + 3 days &lt; current time * order create time
     * + 90 days &lt; current time * If &#x60;orderId&#x60; is set, it will get orders &gt;&#x3D;
     * that &#x60;orderId&#x60;. Otherwise most recent orders are returned. * The query time period
     * must be less then 7 days( default as the recent 7 days). Weight: 5
     *
     * @param symbol (required)
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/trade/rest-api/All-Orders">All
     *     Orders (USER_DATA) Documentation</a>
     */
    public ApiResponse<AllOrdersResponse> allOrders(
            String symbol, Long orderId, Long startTime, Long endTime, Long limit, Long recvWindow)
            throws ApiException {
        return tradeApi.allOrders(symbol, orderId, startTime, endTime, limit, recvWindow);
    }

    /**
     * Auto-Cancel All Open Orders (TRADE) Cancel all open orders of the specified symbol at the end
     * of the specified countdown. The endpoint should be called repeatedly as heartbeats so that
     * the existing countdown time can be canceled and replaced by a new one. * Example usage: Call
     * this endpoint at 30s intervals with an countdownTime of 120000 (120s). If this endpoint is
     * not called within 120 seconds, all your orders of the specified symbol will be automatically
     * canceled. If this endpoint is called with an countdownTime of 0, the countdown timer will be
     * stopped. The system will check all countdowns **approximately every 10 milliseconds**, so
     * please note that sufficient redundancy should be considered when using this function. We do
     * not recommend setting the countdown time to be too precise or too small. Weight: 10
     *
     * @param autoCancelAllOpenOrdersRequest (required)
     * @return ApiResponse&lt;AutoCancelAllOpenOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Auto-Cancel All Open Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/trade/rest-api/Auto-Cancel-All-Open-Orders">Auto-Cancel
     *     All Open Orders (TRADE) Documentation</a>
     */
    public ApiResponse<AutoCancelAllOpenOrdersResponse> autoCancelAllOpenOrders(
            AutoCancelAllOpenOrdersRequest autoCancelAllOpenOrdersRequest) throws ApiException {
        return tradeApi.autoCancelAllOpenOrders(autoCancelAllOpenOrdersRequest);
    }

    /**
     * Cancel All Open Orders (TRADE) Cancel All Open Orders Weight: 1
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/trade/rest-api/Cancel-All-Open-Orders">Cancel
     *     All Open Orders (TRADE) Documentation</a>
     */
    public ApiResponse<CancelAllOpenOrdersResponse> cancelAllOpenOrders(
            String symbol, Long recvWindow) throws ApiException {
        return tradeApi.cancelAllOpenOrders(symbol, recvWindow);
    }

    /**
     * Cancel Multiple Orders (TRADE) Cancel Multiple Orders * Either &#x60;orderIdList&#x60; or
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/trade/rest-api/Cancel-Multiple-Orders">Cancel
     *     Multiple Orders (TRADE) Documentation</a>
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/trade/rest-api/Cancel-Order">Cancel
     *     Order (TRADE) Documentation</a>
     */
    public ApiResponse<CancelOrderResponse> cancelOrder(
            String symbol, Long orderId, String origClientOrderId, Long recvWindow)
            throws ApiException {
        return tradeApi.cancelOrder(symbol, orderId, origClientOrderId, recvWindow);
    }

    /**
     * Change Initial Leverage(TRADE) Change user&#39;s initial leverage of specific symbol market.
     * Weight: 1
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/trade/rest-api/Change-Initial-Leverage">Change
     *     Initial Leverage(TRADE) Documentation</a>
     */
    public ApiResponse<ChangeInitialLeverageResponse> changeInitialLeverage(
            ChangeInitialLeverageRequest changeInitialLeverageRequest) throws ApiException {
        return tradeApi.changeInitialLeverage(changeInitialLeverageRequest);
    }

    /**
     * Change Margin Type(TRADE) Change symbol level margin type Weight: 1
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/trade/rest-api/Change-Margin-Type">Change
     *     Margin Type(TRADE) Documentation</a>
     */
    public ApiResponse<ChangeMarginTypeResponse> changeMarginType(
            ChangeMarginTypeRequest changeMarginTypeRequest) throws ApiException {
        return tradeApi.changeMarginType(changeMarginTypeRequest);
    }

    /**
     * Change Multi-Assets Mode (TRADE) Change user&#39;s Multi-Assets mode (Multi-Assets Mode or
     * Single-Asset Mode) on ***Every symbol*** Weight: 1
     *
     * @param changeMultiAssetsModeRequest (required)
     * @return ApiResponse&lt;ChangeMultiAssetsModeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Change Multi-Assets Mode </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/trade/rest-api/Change-Multi-Assets-Mode">Change
     *     Multi-Assets Mode (TRADE) Documentation</a>
     */
    public ApiResponse<ChangeMultiAssetsModeResponse> changeMultiAssetsMode(
            ChangeMultiAssetsModeRequest changeMultiAssetsModeRequest) throws ApiException {
        return tradeApi.changeMultiAssetsMode(changeMultiAssetsModeRequest);
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/trade/rest-api/Change-Position-Mode">Change
     *     Position Mode(TRADE) Documentation</a>
     */
    public ApiResponse<ChangePositionModeResponse> changePositionMode(
            ChangePositionModeRequest changePositionModeRequest) throws ApiException {
        return tradeApi.changePositionMode(changePositionModeRequest);
    }

    /**
     * Current All Open Orders (USER_DATA) Get all open orders on a symbol. * If the symbol is not
     * sent, orders for all symbols will be returned in an array. Weight: 1 for a single symbol; 40
     * when the symbol parameter is omitted Careful when accessing this with no symbol.
     *
     * @param symbol (optional)
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/trade/rest-api/Current-All-Open-Orders">Current
     *     All Open Orders (USER_DATA) Documentation</a>
     */
    public ApiResponse<CurrentAllOpenOrdersResponse> currentAllOpenOrders(
            String symbol, Long recvWindow) throws ApiException {
        return tradeApi.currentAllOpenOrders(symbol, recvWindow);
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/trade/rest-api/Get-Order-Modify-History">Get
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
     * Get Position Margin Change History (TRADE) Get Position Margin Change History * Support
     * querying future histories that are not older than 30 days * The time between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60;can&#39;t be more than 30 days Weight: 1
     *
     * @param symbol (required)
     * @param type 1: Add position margin，2: Reduce position margin (optional)
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/trade/rest-api/Get-Position-Margin-Change-History">Get
     *     Position Margin Change History (TRADE) Documentation</a>
     */
    public ApiResponse<GetPositionMarginChangeHistoryResponse> getPositionMarginChangeHistory(
            String symbol, String type, Long startTime, Long endTime, Long limit, Long recvWindow)
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/trade/rest-api/Modify-Isolated-Position-Margin">Modify
     *     Isolated Position Margin(TRADE) Documentation</a>
     */
    public ApiResponse<ModifyIsolatedPositionMarginResponse> modifyIsolatedPositionMargin(
            ModifyIsolatedPositionMarginRequest modifyIsolatedPositionMarginRequest)
            throws ApiException {
        return tradeApi.modifyIsolatedPositionMargin(modifyIsolatedPositionMarginRequest);
    }

    /**
     * Modify Multiple Orders(TRADE) Modify Multiple Orders (TRADE) * Parameter rules are same with
     * &#x60;Modify Order&#x60; * Batch modify orders are processed concurrently, and the order of
     * matching is not guaranteed. * The order of returned contents for batch modify orders is the
     * same as the order of the order list. * One order can only be modfied for less than 10000
     * times Weight: 5 on 10s order rate limit(X-MBX-ORDER-COUNT-10S); 1 on 1min order rate
     * limit(X-MBX-ORDER-COUNT-1M); 5 on IP rate limit(x-mbx-used-weight-1m);
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/trade/rest-api/Modify-Multiple-Orders">Modify
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
     * both are sent. * Both &#x60;quantity&#x60; and &#x60;price&#x60; must be sent, which is
     * different from dapi modify order endpoint. * When the new &#x60;quantity&#x60; or
     * &#x60;price&#x60; doesn&#39;t satisfy PRICE_FILTER / PERCENT_FILTER / LOT_SIZE, amendment
     * will be rejected and the order will stay as it is. * However the order will be cancelled by
     * the amendment in the following situations: * when the order is in partially filled status and
     * the new &#x60;quantity&#x60; &lt;&#x3D; &#x60;executedQty&#x60; * When the order is
     * &#x60;GTX&#x60; and the new price will cause it to be executed immediately * One order can
     * only be modfied for less than 10000 times Weight: 1 on 10s order rate
     * limit(X-MBX-ORDER-COUNT-10S); 1 on 1min order rate limit(X-MBX-ORDER-COUNT-1M); 0 on IP rate
     * limit(x-mbx-used-weight-1m)
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/trade/rest-api/Modify-Order">Modify
     *     Order (TRADE) Documentation</a>
     */
    public ApiResponse<ModifyOrderResponse> modifyOrder(ModifyOrderRequest modifyOrderRequest)
            throws ApiException {
        return tradeApi.modifyOrder(modifyOrderRequest);
    }

    /**
     * New Order(TRADE) Send in a new order. * Order with type &#x60;STOP&#x60;, parameter
     * &#x60;timeInForce&#x60; can be sent ( default &#x60;GTC&#x60;). * Order with type
     * &#x60;TAKE_PROFIT&#x60;, parameter &#x60;timeInForce&#x60; can be sent ( default
     * &#x60;GTC&#x60;). * Condition orders will be triggered when: * If
     * parameter&#x60;priceProtect&#x60;is sent as true: * when price reaches the
     * &#x60;stopPrice&#x60; ，the difference rate between \&quot;MARK_PRICE\&quot; and
     * \&quot;CONTRACT_PRICE\&quot; cannot be larger than the \&quot;triggerProtect\&quot; of the
     * symbol * \&quot;triggerProtect\&quot; of a symbol can be got from &#x60;GET
     * /fapi/v1/exchangeInfo&#x60; * &#x60;STOP&#x60;, &#x60;STOP_MARKET&#x60;: * BUY: latest price
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
     * orders. * If triggered，**close all** current long position( if &#x60;SELL&#x60;) or current
     * short position( if &#x60;BUY&#x60;). * Cannot be used with &#x60;quantity&#x60; paremeter *
     * Cannot be used with &#x60;reduceOnly&#x60; parameter * In Hedge Mode,cannot be used with
     * &#x60;BUY&#x60; orders in &#x60;LONG&#x60; position side. and cannot be used with
     * &#x60;SELL&#x60; orders in &#x60;SHORT&#x60; position side *
     * &#x60;selfTradePreventionMode&#x60; is only effective when &#x60;timeInForce&#x60; set to
     * &#x60;IOC&#x60; or &#x60;GTC&#x60; or &#x60;GTD&#x60;. * In extreme market conditions,
     * timeInForce &#x60;GTD&#x60; order auto cancel time might be delayed comparing to
     * &#x60;goodTillDate&#x60; Weight: 1 on 10s order rate limit(X-MBX-ORDER-COUNT-10S); 1 on 1min
     * order rate limit(X-MBX-ORDER-COUNT-1M); 0 on IP rate limit(x-mbx-used-weight-1m)
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/trade/rest-api/New-Order">New
     *     Order(TRADE) Documentation</a>
     */
    public ApiResponse<NewOrderResponse> newOrder(NewOrderRequest newOrderRequest)
            throws ApiException {
        return tradeApi.newOrder(newOrderRequest);
    }

    /**
     * Place Multiple Orders(TRADE) Place Multiple Orders * Paremeter rules are same with &#x60;New
     * Order&#x60; * Batch orders are processed concurrently, and the order of matching is not
     * guaranteed. * The order of returned contents for batch orders is the same as the order of the
     * order list. Weight: 5 on 10s order rate limit(X-MBX-ORDER-COUNT-10S); 1 on 1min order rate
     * limit(X-MBX-ORDER-COUNT-1M); 5 on IP rate limit(x-mbx-used-weight-1m);
     *
     * @param placeMultipleOrdersRequest (required)
     * @return ApiResponse&lt;PlaceMultipleOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Place Multiple Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/trade/rest-api/Place-Multiple-Orders">Place
     *     Multiple Orders(TRADE) Documentation</a>
     */
    public ApiResponse<PlaceMultipleOrdersResponse> placeMultipleOrders(
            PlaceMultipleOrdersRequest placeMultipleOrdersRequest) throws ApiException {
        return tradeApi.placeMultipleOrders(placeMultipleOrdersRequest);
    }

    /**
     * Position ADL Quantile Estimation(USER_DATA) Position ADL Quantile Estimation * Values update
     * every 30s. * Values 0, 1, 2, 3, 4 shows the queue position and possibility of ADL from low to
     * high. * For positions of the symbol are in One-way Mode or isolated margined in Hedge Mode,
     * \&quot;LONG\&quot;, \&quot;SHORT\&quot;, and \&quot;BOTH\&quot; will be returned to show the
     * positions&#39; adl quantiles of different position sides. * If the positions of the symbol
     * are crossed margined in Hedge Mode: * \&quot;HEDGE\&quot; as a sign will be returned instead
     * of \&quot;BOTH\&quot;; * A same value caculated on unrealized pnls on long and short
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/trade/rest-api/Position-ADL-Quantile-Estimation">Position
     *     ADL Quantile Estimation(USER_DATA) Documentation</a>
     */
    public ApiResponse<PositionAdlQuantileEstimationResponse> positionAdlQuantileEstimation(
            String symbol, Long recvWindow) throws ApiException {
        return tradeApi.positionAdlQuantileEstimation(symbol, recvWindow);
    }

    /**
     * Position Information V2 (USER_DATA) Get current position information. Please use with user
     * data stream &#x60;ACCOUNT_UPDATE&#x60; to meet your timeliness and accuracy needs. Weight: 5
     *
     * @param symbol (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;PositionInformationV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Position Information V2 </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/trade/rest-api/Position-Information-V2">Position
     *     Information V2 (USER_DATA) Documentation</a>
     */
    public ApiResponse<PositionInformationV2Response> positionInformationV2(
            String symbol, Long recvWindow) throws ApiException {
        return tradeApi.positionInformationV2(symbol, recvWindow);
    }

    /**
     * Position Information V3 (USER_DATA) Get current position information(only symbol that has
     * position or open orders will be returned). Please use with user data stream
     * &#x60;ACCOUNT_UPDATE&#x60; to meet your timeliness and accuracy needs. Weight: 5
     *
     * @param symbol (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;PositionInformationV3Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Position Information V3 </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/trade/rest-api/Position-Information-V3">Position
     *     Information V3 (USER_DATA) Documentation</a>
     */
    public ApiResponse<PositionInformationV3Response> positionInformationV3(
            String symbol, Long recvWindow) throws ApiException {
        return tradeApi.positionInformationV3(symbol, recvWindow);
    }

    /**
     * Query Current Open Order (USER_DATA) Query open order * Either&#x60;orderId&#x60; or
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/trade/rest-api/Query-Current-Open-Order">Query
     *     Current Open Order (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryCurrentOpenOrderResponse> queryCurrentOpenOrder(
            String symbol, Long orderId, String origClientOrderId, Long recvWindow)
            throws ApiException {
        return tradeApi.queryCurrentOpenOrder(symbol, orderId, origClientOrderId, recvWindow);
    }

    /**
     * Query Order (USER_DATA) Check an order&#39;s status. * These orders will not be found: *
     * order status is &#x60;CANCELED&#x60; or &#x60;EXPIRED&#x60; **AND** order has NO filled trade
     * **AND** created time + 3 days &lt; current time * order create time + 90 days &lt; current
     * time * Either &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent. *
     * &#x60;orderId&#x60; is self-increment for each specific &#x60;symbol&#x60; Weight: 1
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/trade/rest-api/Query-Order">Query
     *     Order (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryOrderResponse> queryOrder(
            String symbol, Long orderId, String origClientOrderId, Long recvWindow)
            throws ApiException {
        return tradeApi.queryOrder(symbol, orderId, origClientOrderId, recvWindow);
    }

    /**
     * Test Order(TRADE) Testing order request, this order will not be submitted to matching engine
     * * Order with type &#x60;STOP&#x60;, parameter &#x60;timeInForce&#x60; can be sent ( default
     * &#x60;GTC&#x60;). * Order with type &#x60;TAKE_PROFIT&#x60;, parameter
     * &#x60;timeInForce&#x60; can be sent ( default &#x60;GTC&#x60;). * Condition orders will be
     * triggered when: * If parameter&#x60;priceProtect&#x60;is sent as true: * when price reaches
     * the &#x60;stopPrice&#x60; ，the difference rate between \&quot;MARK_PRICE\&quot; and
     * \&quot;CONTRACT_PRICE\&quot; cannot be larger than the \&quot;triggerProtect\&quot; of the
     * symbol * \&quot;triggerProtect\&quot; of a symbol can be got from &#x60;GET
     * /fapi/v1/exchangeInfo&#x60; * &#x60;STOP&#x60;, &#x60;STOP_MARKET&#x60;: * BUY: latest price
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
     * orders. * If triggered，**close all** current long position( if &#x60;SELL&#x60;) or current
     * short position( if &#x60;BUY&#x60;). * Cannot be used with &#x60;quantity&#x60; paremeter *
     * Cannot be used with &#x60;reduceOnly&#x60; parameter * In Hedge Mode,cannot be used with
     * &#x60;BUY&#x60; orders in &#x60;LONG&#x60; position side. and cannot be used with
     * &#x60;SELL&#x60; orders in &#x60;SHORT&#x60; position side *
     * &#x60;selfTradePreventionMode&#x60; is only effective when &#x60;timeInForce&#x60; set to
     * &#x60;IOC&#x60; or &#x60;GTC&#x60; or &#x60;GTD&#x60;. * In extreme market conditions,
     * timeInForce &#x60;GTD&#x60; order auto cancel time might be delayed comparing to
     * &#x60;goodTillDate&#x60; Weight: 0
     *
     * @param testOrderRequest (required)
     * @return ApiResponse&lt;TestOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Test Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/trade/rest-api/New-Order-Test">Test
     *     Order(TRADE) Documentation</a>
     */
    public ApiResponse<TestOrderResponse> testOrder(TestOrderRequest testOrderRequest)
            throws ApiException {
        return tradeApi.testOrder(testOrderRequest);
    }

    /**
     * User&#39;s Force Orders (USER_DATA) Query user&#39;s Force Orders * If
     * \&quot;autoCloseType\&quot; is not sent, orders with both of the types will be returned * If
     * \&quot;startTime\&quot; is not sent, data within 7 days before \&quot;endTime\&quot; can be
     * queried Weight: 20 with symbol, 50 without symbol
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/trade/rest-api/Users-Force-Orders">User&#39;s
     *     Force Orders (USER_DATA) Documentation</a>
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
     * Close User Data Stream (USER_STREAM) Close out a user data stream. Weight: 1
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/user-data-streams/Close-User-Data-Stream">Close
     *     User Data Stream (USER_STREAM) Documentation</a>
     */
    public void closeUserDataStream() throws ApiException {
        userDataStreamsApi.closeUserDataStream();
    }

    /**
     * Keepalive User Data Stream (USER_STREAM) Keepalive a user data stream to prevent a time out.
     * User data streams will close after 60 minutes. It&#39;s recommended to send a ping about
     * every 60 minutes. Weight: 1
     *
     * @return ApiResponse&lt;KeepaliveUserDataStreamResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Keepalive User Data Stream </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/user-data-streams/Keepalive-User-Data-Stream">Keepalive
     *     User Data Stream (USER_STREAM) Documentation</a>
     */
    public ApiResponse<KeepaliveUserDataStreamResponse> keepaliveUserDataStream()
            throws ApiException {
        return userDataStreamsApi.keepaliveUserDataStream();
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
     *     href="https://developers.binance.com/docs/derivatives/usds-margined-futures/user-data-streams/Start-User-Data-Stream">Start
     *     User Data Stream (USER_STREAM) Documentation</a>
     */
    public ApiResponse<StartUserDataStreamResponse> startUserDataStream() throws ApiException {
        return userDataStreamsApi.startUserDataStream();
    }
}
