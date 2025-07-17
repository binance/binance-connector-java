package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.AccountBalanceResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.AccountInformationResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.AutoCloseType;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.BnbTransferRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.BnbTransferResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.CancelAllCmOpenConditionalOrdersResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.CancelAllCmOpenOrdersResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.CancelAllUmOpenConditionalOrdersResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.CancelAllUmOpenOrdersResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.CancelCmConditionalOrderResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.CancelCmOrderResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.CancelMarginAccountAllOpenOrdersOnASymbolResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.CancelMarginAccountOcoOrdersResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.CancelMarginAccountOrderResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.CancelUmConditionalOrderResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.CancelUmOrderResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.ChangeAutoRepayFuturesStatusRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.ChangeAutoRepayFuturesStatusResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.ChangeCmInitialLeverageRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.ChangeCmInitialLeverageResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.ChangeCmPositionModeRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.ChangeCmPositionModeResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.ChangeUmInitialLeverageRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.ChangeUmInitialLeverageResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.ChangeUmPositionModeRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.ChangeUmPositionModeResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.CmAccountTradeListResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.CmNotionalAndLeverageBracketsResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.CmPositionAdlQuantileEstimationResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.FundAutoCollectionRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.FundAutoCollectionResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.FundCollectionByAssetRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.FundCollectionByAssetResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.GetAutoRepayFuturesStatusResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.GetCmAccountDetailResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.GetCmCurrentPositionModeResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.GetCmIncomeHistoryResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.GetDownloadIdForUmFuturesOrderHistoryResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.GetDownloadIdForUmFuturesTradeHistoryResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.GetDownloadIdForUmFuturesTransactionHistoryResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.GetMarginBorrowLoanInterestHistoryResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.GetUmAccountDetailResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.GetUmAccountDetailV2Response;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.GetUmCurrentPositionModeResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.GetUmFuturesBnbBurnStatusResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.GetUmFuturesOrderDownloadLinkByIdResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.GetUmFuturesTradeDownloadLinkByIdResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.GetUmFuturesTransactionDownloadLinkByIdResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.GetUmIncomeHistoryResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.GetUserCommissionRateForCmResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.GetUserCommissionRateForUmResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.MarginAccountBorrowRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.MarginAccountBorrowResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.MarginAccountNewOcoRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.MarginAccountNewOcoResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.MarginAccountRepayDebtRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.MarginAccountRepayDebtResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.MarginAccountRepayRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.MarginAccountRepayResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.MarginAccountTradeListResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.MarginMaxBorrowResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.ModifyCmOrderRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.ModifyCmOrderResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.ModifyUmOrderRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.ModifyUmOrderResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.NewCmConditionalOrderRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.NewCmConditionalOrderResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.NewCmOrderRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.NewCmOrderResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.NewMarginOrderRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.NewMarginOrderResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.NewUmConditionalOrderRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.NewUmConditionalOrderResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.NewUmOrderRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.NewUmOrderResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryAllCmConditionalOrdersResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryAllCmOrdersResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryAllCurrentCmOpenConditionalOrdersResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryAllCurrentCmOpenOrdersResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryAllCurrentUmOpenConditionalOrdersResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryAllCurrentUmOpenOrdersResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryAllMarginAccountOrdersResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryAllUmConditionalOrdersResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryAllUmOrdersResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryCmConditionalOrderHistoryResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryCmModifyOrderHistoryResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryCmOrderResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryCmPositionInformationResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryCurrentCmOpenConditionalOrderResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryCurrentCmOpenOrderResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryCurrentMarginOpenOrderResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryCurrentUmOpenConditionalOrderResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryCurrentUmOpenOrderResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryMarginAccountOrderResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryMarginAccountsAllOcoResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryMarginAccountsOcoResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryMarginAccountsOpenOcoResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryMarginLoanRecordResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryMarginMaxWithdrawResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryMarginRepayRecordResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryPortfolioMarginNegativeBalanceInterestHistoryResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryUmConditionalOrderHistoryResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryUmModifyOrderHistoryResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryUmOrderResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryUmPositionInformationResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryUserNegativeBalanceAutoExchangeRecordResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryUserRateLimitResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryUsersCmForceOrdersResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryUsersMarginForceOrdersResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryUsersUmForceOrdersResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.RepayFuturesNegativeBalanceRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.RepayFuturesNegativeBalanceResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.StartUserDataStreamResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.ToggleBnbBurnOnUmFuturesTradeRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.ToggleBnbBurnOnUmFuturesTradeResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.UmAccountTradeListResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.UmFuturesAccountConfigurationResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.UmFuturesSymbolConfigurationResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.UmNotionalAndLeverageBracketsResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.UmPositionAdlQuantileEstimationResponse;

public class DerivativesTradingPortfolioMarginRestApi {

    private final AccountApi accountApi;
    private final MarketDataApi marketDataApi;
    private final TradeApi tradeApi;
    private final UserDataStreamsApi userDataStreamsApi;

    public DerivativesTradingPortfolioMarginRestApi(ClientConfiguration configuration) {
        this(DerivativesTradingPortfolioMarginRestApiUtil.getDefaultClient(configuration));
    }

    public DerivativesTradingPortfolioMarginRestApi(ApiClient apiClient) {
        this.accountApi = new AccountApi(apiClient);
        this.marketDataApi = new MarketDataApi(apiClient);
        this.tradeApi = new TradeApi(apiClient);
        this.userDataStreamsApi = new UserDataStreamsApi(apiClient);
    }

    /**
     * Account Balance(USER_DATA) Query account balance Weight: 20
     *
     * @param asset (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;AccountBalanceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Account Balance </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Account-Balance">Account
     *     Balance(USER_DATA) Documentation</a>
     */
    public ApiResponse<AccountBalanceResponse> accountBalance(String asset, Long recvWindow)
            throws ApiException {
        return accountApi.accountBalance(asset, recvWindow);
    }

    /**
     * Account Information(USER_DATA) Query account information Weight: 20
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
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Account-Information">Account
     *     Information(USER_DATA) Documentation</a>
     */
    public ApiResponse<AccountInformationResponse> accountInformation(Long recvWindow)
            throws ApiException {
        return accountApi.accountInformation(recvWindow);
    }

    /**
     * BNB transfer (TRADE) Transfer BNB in and out of UM * The endpoint can only be called 10 times
     * per 10 minutes in a rolling manner Weight: 750
     *
     * @param bnbTransferRequest (required)
     * @return ApiResponse&lt;BnbTransferResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> BNB transfer </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/BNB-transfer">BNB
     *     transfer (TRADE) Documentation</a>
     */
    public ApiResponse<BnbTransferResponse> bnbTransfer(BnbTransferRequest bnbTransferRequest)
            throws ApiException {
        return accountApi.bnbTransfer(bnbTransferRequest);
    }

    /**
     * Change Auto-repay-futures Status(TRADE) Change Auto-repay-futures Status Weight: 750
     *
     * @param changeAutoRepayFuturesStatusRequest (required)
     * @return ApiResponse&lt;ChangeAutoRepayFuturesStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Change Auto-repay-futures Status </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Change-Auto-repay-futures-Status">Change
     *     Auto-repay-futures Status(TRADE) Documentation</a>
     */
    public ApiResponse<ChangeAutoRepayFuturesStatusResponse> changeAutoRepayFuturesStatus(
            ChangeAutoRepayFuturesStatusRequest changeAutoRepayFuturesStatusRequest)
            throws ApiException {
        return accountApi.changeAutoRepayFuturesStatus(changeAutoRepayFuturesStatusRequest);
    }

    /**
     * Change CM Initial Leverage (TRADE) Change user&#39;s initial leverage of specific symbol in
     * CM. Weight: 1
     *
     * @param changeCmInitialLeverageRequest (required)
     * @return ApiResponse&lt;ChangeCmInitialLeverageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Change CM Initial Leverage </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Change-CM-Initial-Leverage">Change
     *     CM Initial Leverage (TRADE) Documentation</a>
     */
    public ApiResponse<ChangeCmInitialLeverageResponse> changeCmInitialLeverage(
            ChangeCmInitialLeverageRequest changeCmInitialLeverageRequest) throws ApiException {
        return accountApi.changeCmInitialLeverage(changeCmInitialLeverageRequest);
    }

    /**
     * Change CM Position Mode(TRADE) Change user&#39;s position mode (Hedge Mode or One-way Mode )
     * on EVERY symbol in CM Weight: 1
     *
     * @param changeCmPositionModeRequest (required)
     * @return ApiResponse&lt;ChangeCmPositionModeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Change CM Position Mode </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Change-CM-Position-Mode">Change
     *     CM Position Mode(TRADE) Documentation</a>
     */
    public ApiResponse<ChangeCmPositionModeResponse> changeCmPositionMode(
            ChangeCmPositionModeRequest changeCmPositionModeRequest) throws ApiException {
        return accountApi.changeCmPositionMode(changeCmPositionModeRequest);
    }

    /**
     * Change UM Initial Leverage(TRADE) Change user&#39;s initial leverage of specific symbol in
     * UM. Weight: 1
     *
     * @param changeUmInitialLeverageRequest (required)
     * @return ApiResponse&lt;ChangeUmInitialLeverageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Change UM Initial Leverage </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Change-UM-Initial-Leverage">Change
     *     UM Initial Leverage(TRADE) Documentation</a>
     */
    public ApiResponse<ChangeUmInitialLeverageResponse> changeUmInitialLeverage(
            ChangeUmInitialLeverageRequest changeUmInitialLeverageRequest) throws ApiException {
        return accountApi.changeUmInitialLeverage(changeUmInitialLeverageRequest);
    }

    /**
     * Change UM Position Mode(TRADE) Change user&#39;s position mode (Hedge Mode or One-way Mode )
     * on EVERY symbol in UM Weight: 1
     *
     * @param changeUmPositionModeRequest (required)
     * @return ApiResponse&lt;ChangeUmPositionModeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Change UM Position Mode </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Change-UM-Position-Mode">Change
     *     UM Position Mode(TRADE) Documentation</a>
     */
    public ApiResponse<ChangeUmPositionModeResponse> changeUmPositionMode(
            ChangeUmPositionModeRequest changeUmPositionModeRequest) throws ApiException {
        return accountApi.changeUmPositionMode(changeUmPositionModeRequest);
    }

    /**
     * CM Notional and Leverage Brackets(USER_DATA) Query CM notional and leverage brackets Weight:
     * 1
     *
     * @param symbol (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;CmNotionalAndLeverageBracketsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> CM Notional and Leverage Brackets </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/CM-Notional-and-Leverage-Brackets">CM
     *     Notional and Leverage Brackets(USER_DATA) Documentation</a>
     */
    public ApiResponse<CmNotionalAndLeverageBracketsResponse> cmNotionalAndLeverageBrackets(
            String symbol, Long recvWindow) throws ApiException {
        return accountApi.cmNotionalAndLeverageBrackets(symbol, recvWindow);
    }

    /**
     * Fund Auto-collection(TRADE) Fund collection for Portfolio Margin * The BNB would not be
     * collected from UM-PM account to the Portfolio Margin account. * You can only use this
     * function 500 times per hour in a rolling manner. Weight: 750
     *
     * @param fundAutoCollectionRequest (required)
     * @return ApiResponse&lt;FundAutoCollectionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fund Auto-collection </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Fund-Auto-collection">Fund
     *     Auto-collection(TRADE) Documentation</a>
     */
    public ApiResponse<FundAutoCollectionResponse> fundAutoCollection(
            FundAutoCollectionRequest fundAutoCollectionRequest) throws ApiException {
        return accountApi.fundAutoCollection(fundAutoCollectionRequest);
    }

    /**
     * Fund Collection by Asset(TRADE) Transfers specific asset from Futures Account to Margin
     * account * The BNB transfer is not be supported Weight: 30
     *
     * @param fundCollectionByAssetRequest (required)
     * @return ApiResponse&lt;FundCollectionByAssetResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fund Collection by Asset </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Fund-Collection-by-Asset">Fund
     *     Collection by Asset(TRADE) Documentation</a>
     */
    public ApiResponse<FundCollectionByAssetResponse> fundCollectionByAsset(
            FundCollectionByAssetRequest fundCollectionByAssetRequest) throws ApiException {
        return accountApi.fundCollectionByAsset(fundCollectionByAssetRequest);
    }

    /**
     * Get Auto-repay-futures Status(USER_DATA) Query Auto-repay-futures Status Weight: 30
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetAutoRepayFuturesStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Auto-repay-futures Status </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Get-Auto-repay-futures-Status">Get
     *     Auto-repay-futures Status(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetAutoRepayFuturesStatusResponse> getAutoRepayFuturesStatus(Long recvWindow)
            throws ApiException {
        return accountApi.getAutoRepayFuturesStatus(recvWindow);
    }

    /**
     * Get CM Account Detail(USER_DATA) Get current CM account asset and position information.
     * Weight: 5
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetCmAccountDetailResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get CM Account Detail </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Get-CM-Account-Detail">Get
     *     CM Account Detail(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetCmAccountDetailResponse> getCmAccountDetail(Long recvWindow)
            throws ApiException {
        return accountApi.getCmAccountDetail(recvWindow);
    }

    /**
     * Get CM Current Position Mode(USER_DATA) Get user&#39;s position mode (Hedge Mode or One-way
     * Mode ) on EVERY symbol in CM Weight: 30
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetCmCurrentPositionModeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get CM Current Position Mode </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Get-CM-Current-Position-Mode">Get
     *     CM Current Position Mode(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetCmCurrentPositionModeResponse> getCmCurrentPositionMode(Long recvWindow)
            throws ApiException {
        return accountApi.getCmCurrentPositionMode(recvWindow);
    }

    /**
     * Get CM Income History(USER_DATA) Get CM Income History * If &#x60;incomeType&#x60; is not
     * sent, all kinds of flow will be returned * \&quot;trandId\&quot; is unique in the same
     * \&quot;incomeType\&quot; for a user * The interval between &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; can not exceed 200 days: * If &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; are not sent, the last 200 days will be returned Weight: 30
     *
     * @param symbol (optional)
     * @param incomeType TRANSFER, WELCOME_BONUS, REALIZED_PNL, FUNDING_FEE, COMMISSION,
     *     INSURANCE_CLEAR, REFERRAL_KICKBACK, COMMISSION_REBATE, API_REBATE, CONTEST_REWARD,
     *     CROSS_COLLATERAL_TRANSFER, OPTIONS_PREMIUM_FEE, OPTIONS_SETTLE_PROFIT, INTERNAL_TRANSFER,
     *     AUTO_EXCHANGE, DELIVERED_SETTELMENT, COIN_SWAP_DEPOSIT, COIN_SWAP_WITHDRAW,
     *     POSITION_LIMIT_INCREASE_FEE (optional)
     * @param startTime Timestamp in ms to get funding from INCLUSIVE. (optional)
     * @param endTime Timestamp in ms to get funding until INCLUSIVE. (optional)
     * @param page (optional)
     * @param limit Default 100; max 1000 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetCmIncomeHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get CM Income History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Get-CM-Income-History">Get
     *     CM Income History(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetCmIncomeHistoryResponse> getCmIncomeHistory(
            String symbol,
            String incomeType,
            Long startTime,
            Long endTime,
            Long page,
            Long limit,
            Long recvWindow)
            throws ApiException {
        return accountApi.getCmIncomeHistory(
                symbol, incomeType, startTime, endTime, page, limit, recvWindow);
    }

    /**
     * Get Download Id For UM Futures Order History (USER_DATA) Get download id for UM futures order
     * history * Request Limitation is 10 times per month, shared by front end download page and
     * rest api * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; can not be longer
     * than 1 year Weight: 1500
     *
     * @param startTime (required)
     * @param endTime (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetDownloadIdForUmFuturesOrderHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Download Id For UM Futures Order History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Get-Download-Id-For-UM-Futures-Order-History">Get
     *     Download Id For UM Futures Order History (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetDownloadIdForUmFuturesOrderHistoryResponse>
            getDownloadIdForUmFuturesOrderHistory(Long startTime, Long endTime, Long recvWindow)
                    throws ApiException {
        return accountApi.getDownloadIdForUmFuturesOrderHistory(startTime, endTime, recvWindow);
    }

    /**
     * Get Download Id For UM Futures Trade History (USER_DATA) Get download id for UM futures trade
     * history * Request Limitation is 5 times per month, shared by front end download page and rest
     * api * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; can not be longer than 1
     * year Weight: 1500
     *
     * @param startTime (required)
     * @param endTime (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetDownloadIdForUmFuturesTradeHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Download Id For UM Futures Trade History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Get-Download-Id-For-UM-Futures-Trade-History">Get
     *     Download Id For UM Futures Trade History (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetDownloadIdForUmFuturesTradeHistoryResponse>
            getDownloadIdForUmFuturesTradeHistory(Long startTime, Long endTime, Long recvWindow)
                    throws ApiException {
        return accountApi.getDownloadIdForUmFuturesTradeHistory(startTime, endTime, recvWindow);
    }

    /**
     * Get Download Id For UM Futures Transaction History (USER_DATA) Get download id for UM futures
     * transaction history * Request Limitation is 5 times per month, shared by front end download
     * page and rest api * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; can not be
     * longer than 1 year Weight: 1500
     *
     * @param startTime (required)
     * @param endTime (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetDownloadIdForUmFuturesTransactionHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Download Id For UM Futures Transaction History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Get-Download-Id-For-UM-Futures-Transaction-History">Get
     *     Download Id For UM Futures Transaction History (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetDownloadIdForUmFuturesTransactionHistoryResponse>
            getDownloadIdForUmFuturesTransactionHistory(
                    Long startTime, Long endTime, Long recvWindow) throws ApiException {
        return accountApi.getDownloadIdForUmFuturesTransactionHistory(
                startTime, endTime, recvWindow);
    }

    /**
     * Get Margin Borrow/Loan Interest History(USER_DATA) Get Margin Borrow/Loan Interest History *
     * Response in descending order * The max interval between startTime and endTime is 30 days. It
     * is a MUST to ensure data correctness. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; not
     * sent, return records of the last 7 days by default * If &#x60;startTime&#x60; is sent and
     * &#x60;endTime&#x60; is not sent, the records from &#x60;startTime&#x60; to the present will
     * be returned; if &#x60;startTime&#x60; is more than 30 days ago, the records of the past 30
     * days will be returned. * If &#x60;startTime&#x60; is not sent and &#x60;endTime&#x60; is
     * sent, the records of the 7 days before &#x60;endTime&#x60; is returned. * Type in response
     * has 5 enums: * &#x60;PERIODIC&#x60; interest charged per hour * &#x60;ON_BORROW&#x60; first
     * interest charged on borrow * &#x60;PERIODIC_CONVERTED&#x60; interest charged per hour
     * converted into BNB * &#x60;ON_BORROW_CONVERTED&#x60; first interest charged on borrow
     * converted into BNB * &#x60;PORTFOLIO&#x60; Portfolio Margin negative balance daily interest
     * Weight: 1
     *
     * @param asset (optional)
     * @param startTime Timestamp in ms to get funding from INCLUSIVE. (optional)
     * @param endTime Timestamp in ms to get funding until INCLUSIVE. (optional)
     * @param current Currently querying page. Start from 1. Default:1 (optional)
     * @param size Default:10 Max:100 (optional)
     * @param archived Default: &#x60;false&#x60;. Set to &#x60;true&#x60; for archived data from 6
     *     months ago (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetMarginBorrowLoanInterestHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Margin Borrow/Loan Interest History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Get-Margin-BorrowLoan-Interest-History">Get
     *     Margin Borrow/Loan Interest History(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetMarginBorrowLoanInterestHistoryResponse>
            getMarginBorrowLoanInterestHistory(
                    String asset,
                    Long startTime,
                    Long endTime,
                    Long current,
                    Long size,
                    String archived,
                    Long recvWindow)
                    throws ApiException {
        return accountApi.getMarginBorrowLoanInterestHistory(
                asset, startTime, endTime, current, size, archived, recvWindow);
    }

    /**
     * Get UM Account Detail(USER_DATA) Get current UM account asset and position information.
     * Weight: 5
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetUmAccountDetailResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get UM Account Detail </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Get-UM-Account-Detail">Get
     *     UM Account Detail(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetUmAccountDetailResponse> getUmAccountDetail(Long recvWindow)
            throws ApiException {
        return accountApi.getUmAccountDetail(recvWindow);
    }

    /**
     * Get UM Account Detail V2(USER_DATA) Get current UM account asset and position information.
     * Weight: 5
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetUmAccountDetailV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get UM Account Detail V2 </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Get-UM-Account-Detail-V2">Get
     *     UM Account Detail V2(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetUmAccountDetailV2Response> getUmAccountDetailV2(Long recvWindow)
            throws ApiException {
        return accountApi.getUmAccountDetailV2(recvWindow);
    }

    /**
     * Get UM Current Position Mode(USER_DATA) Get user&#39;s position mode (Hedge Mode or One-way
     * Mode ) on EVERY symbol in UM Weight: 30
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetUmCurrentPositionModeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get UM Current Position Mode </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Get-UM-Current-Position-Mode">Get
     *     UM Current Position Mode(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetUmCurrentPositionModeResponse> getUmCurrentPositionMode(Long recvWindow)
            throws ApiException {
        return accountApi.getUmCurrentPositionMode(recvWindow);
    }

    /**
     * Get UM Futures Order Download Link by Id(USER_DATA) Get UM futures order download link by Id
     * * Download link expiration: 24h Weight: 10
     *
     * @param downloadId get by download id api (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetUmFuturesOrderDownloadLinkByIdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get UM Futures Order Download Link by Id </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Get-UM-Futures-Order-Download-Link-by-Id">Get
     *     UM Futures Order Download Link by Id(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetUmFuturesOrderDownloadLinkByIdResponse> getUmFuturesOrderDownloadLinkById(
            String downloadId, Long recvWindow) throws ApiException {
        return accountApi.getUmFuturesOrderDownloadLinkById(downloadId, recvWindow);
    }

    /**
     * Get UM Futures Trade Download Link by Id(USER_DATA) Get UM futures trade download link by Id
     * * Download link expiration: 24h Weight: 10
     *
     * @param downloadId get by download id api (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetUmFuturesTradeDownloadLinkByIdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get UM Futures Trade Download Link by Id </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Get-UM-Futures-Trade-Download-Link-by-Id">Get
     *     UM Futures Trade Download Link by Id(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetUmFuturesTradeDownloadLinkByIdResponse> getUmFuturesTradeDownloadLinkById(
            String downloadId, Long recvWindow) throws ApiException {
        return accountApi.getUmFuturesTradeDownloadLinkById(downloadId, recvWindow);
    }

    /**
     * Get UM Futures Transaction Download Link by Id(USER_DATA) Get UM futures Transaction download
     * link by Id * Download link expiration: 24h Weight: 10
     *
     * @param downloadId get by download id api (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetUmFuturesTransactionDownloadLinkByIdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get UM Futures Transaction Download Link by Id </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Get-UM-Futures-Transaction-Download-Link-by-Id">Get
     *     UM Futures Transaction Download Link by Id(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetUmFuturesTransactionDownloadLinkByIdResponse>
            getUmFuturesTransactionDownloadLinkById(String downloadId, Long recvWindow)
                    throws ApiException {
        return accountApi.getUmFuturesTransactionDownloadLinkById(downloadId, recvWindow);
    }

    /**
     * Get UM Income History(USER_DATA) Get UM Income History * If neither &#x60;startTime&#x60; nor
     * &#x60;endTime&#x60; is sent, the recent 7-day data will be returned. * If
     * &#x60;incomeType&#x60; is not sent, all kinds of flow will be returned *
     * \&quot;trandId\&quot; is unique in the same incomeType for a user * Income history only
     * contains data for the last three months Weight: 30
     *
     * @param symbol (optional)
     * @param incomeType TRANSFER, WELCOME_BONUS, REALIZED_PNL, FUNDING_FEE, COMMISSION,
     *     INSURANCE_CLEAR, REFERRAL_KICKBACK, COMMISSION_REBATE, API_REBATE, CONTEST_REWARD,
     *     CROSS_COLLATERAL_TRANSFER, OPTIONS_PREMIUM_FEE, OPTIONS_SETTLE_PROFIT, INTERNAL_TRANSFER,
     *     AUTO_EXCHANGE, DELIVERED_SETTELMENT, COIN_SWAP_DEPOSIT, COIN_SWAP_WITHDRAW,
     *     POSITION_LIMIT_INCREASE_FEE (optional)
     * @param startTime Timestamp in ms to get funding from INCLUSIVE. (optional)
     * @param endTime Timestamp in ms to get funding until INCLUSIVE. (optional)
     * @param page (optional)
     * @param limit Default 100; max 1000 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetUmIncomeHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get UM Income History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Get-UM-Income-History">Get
     *     UM Income History(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetUmIncomeHistoryResponse> getUmIncomeHistory(
            String symbol,
            String incomeType,
            Long startTime,
            Long endTime,
            Long page,
            Long limit,
            Long recvWindow)
            throws ApiException {
        return accountApi.getUmIncomeHistory(
                symbol, incomeType, startTime, endTime, page, limit, recvWindow);
    }

    /**
     * Get User Commission Rate for CM(USER_DATA) Get User Commission Rate for CM Weight: 20
     *
     * @param symbol (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetUserCommissionRateForCmResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get User Commission Rate for CM </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Get-User-Commission-Rate-for-CM">Get
     *     User Commission Rate for CM(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetUserCommissionRateForCmResponse> getUserCommissionRateForCm(
            String symbol, Long recvWindow) throws ApiException {
        return accountApi.getUserCommissionRateForCm(symbol, recvWindow);
    }

    /**
     * Get User Commission Rate for UM(USER_DATA) Get User Commission Rate for UM Weight: 20
     *
     * @param symbol (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetUserCommissionRateForUmResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get User Commission Rate for UM </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Get-User-Commission-Rate-for-UM">Get
     *     User Commission Rate for UM(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetUserCommissionRateForUmResponse> getUserCommissionRateForUm(
            String symbol, Long recvWindow) throws ApiException {
        return accountApi.getUserCommissionRateForUm(symbol, recvWindow);
    }

    /**
     * Margin Max Borrow(USER_DATA) Query margin max borrow Weight: 5
     *
     * @param asset (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;MarginMaxBorrowResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Margin Max Borrow </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Margin-Max-Borrow">Margin
     *     Max Borrow(USER_DATA) Documentation</a>
     */
    public ApiResponse<MarginMaxBorrowResponse> marginMaxBorrow(String asset, Long recvWindow)
            throws ApiException {
        return accountApi.marginMaxBorrow(asset, recvWindow);
    }

    /**
     * Portfolio Margin UM Trading Quantitative Rules Indicators(USER_DATA) Portfolio Margin UM
     * Trading Quantitative Rules Indicators Weight: 1 for a single symbol 10 when the symbol
     * parameter is omitted
     *
     * @param symbol (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Portfolio Margin UM Trading Quantitative Rules Indicators </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Portfolio-Margin-UM-Trading-Quantitative-Rules-Indicators">Portfolio
     *     Margin UM Trading Quantitative Rules Indicators(USER_DATA) Documentation</a>
     */
    public ApiResponse<PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponse>
            portfolioMarginUmTradingQuantitativeRulesIndicators(String symbol, Long recvWindow)
                    throws ApiException {
        return accountApi.portfolioMarginUmTradingQuantitativeRulesIndicators(symbol, recvWindow);
    }

    /**
     * Query CM Position Information(USER_DATA) Get current CM position information. * If neither
     * &#x60;marginAsset&#x60; nor &#x60;pair&#x60; is sent, positions of all symbols with
     * &#x60;TRADING&#x60; status will be returned. * for One-way Mode user, the response will only
     * show the \&quot;BOTH\&quot; positions * for Hedge Mode user, the response will show
     * \&quot;LONG\&quot;, and \&quot;SHORT\&quot; positions. * Please use with user data stream
     * &#x60;ACCOUNT_UPDATE&#x60; to meet your timeliness and accuracy needs. Weight: 1
     *
     * @param marginAsset (optional)
     * @param pair (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryCmPositionInformationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> CM Position Information </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Query-CM-Position-Information">Query
     *     CM Position Information(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryCmPositionInformationResponse> queryCmPositionInformation(
            String marginAsset, String pair, Long recvWindow) throws ApiException {
        return accountApi.queryCmPositionInformation(marginAsset, pair, recvWindow);
    }

    /**
     * Query Margin Loan Record(USER_DATA) Query margin loan record * txId or startTime must be
     * sent. txId takes precedence. * Response in descending order * The max interval between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; is 30 days. * If &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; not sent, return records of the last 7 days by default * Set
     * &#x60;archived&#x60; to &#x60;true&#x60; to query data from 6 months ago Weight: 10
     *
     * @param asset (required)
     * @param txId the &#x60;tranId&#x60; in &#x60;POST/papi/v1/marginLoan&#x60; (optional)
     * @param startTime Timestamp in ms to get funding from INCLUSIVE. (optional)
     * @param endTime Timestamp in ms to get funding until INCLUSIVE. (optional)
     * @param current Currently querying page. Start from 1. Default:1 (optional)
     * @param size Default:10 Max:100 (optional)
     * @param archived Default: &#x60;false&#x60;. Set to &#x60;true&#x60; for archived data from 6
     *     months ago (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryMarginLoanRecordResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Margin Loan Record </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Query-Margin-Loan-Record">Query
     *     Margin Loan Record(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryMarginLoanRecordResponse> queryMarginLoanRecord(
            String asset,
            Long txId,
            Long startTime,
            Long endTime,
            Long current,
            Long size,
            String archived,
            Long recvWindow)
            throws ApiException {
        return accountApi.queryMarginLoanRecord(
                asset, txId, startTime, endTime, current, size, archived, recvWindow);
    }

    /**
     * Query Margin Max Withdraw(USER_DATA) Query Margin Max Withdraw Weight: 5
     *
     * @param asset (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryMarginMaxWithdrawResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Margin Max Withdraw </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Query-Margin-Max-Withdraw">Query
     *     Margin Max Withdraw(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryMarginMaxWithdrawResponse> queryMarginMaxWithdraw(
            String asset, Long recvWindow) throws ApiException {
        return accountApi.queryMarginMaxWithdraw(asset, recvWindow);
    }

    /**
     * Query Margin repay Record(USER_DATA) Query margin repay record. * txId or startTime must be
     * sent. txId takes precedence. * Response in descending order * The max interval between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; is 30 days. * If &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; not sent, return records of the last 7 days by default * Set
     * &#x60;archived&#x60; to &#x60;true&#x60; to query data from 6 months ago Weight: 10
     *
     * @param asset (required)
     * @param txId the &#x60;tranId&#x60; in &#x60;POST/papi/v1/marginLoan&#x60; (optional)
     * @param startTime Timestamp in ms to get funding from INCLUSIVE. (optional)
     * @param endTime Timestamp in ms to get funding until INCLUSIVE. (optional)
     * @param current Currently querying page. Start from 1. Default:1 (optional)
     * @param size Default:10 Max:100 (optional)
     * @param archived Default: &#x60;false&#x60;. Set to &#x60;true&#x60; for archived data from 6
     *     months ago (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryMarginRepayRecordResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Margin repay Record </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Query-Margin-repay-Record">Query
     *     Margin repay Record(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryMarginRepayRecordResponse> queryMarginRepayRecord(
            String asset,
            Long txId,
            Long startTime,
            Long endTime,
            Long current,
            Long size,
            String archived,
            Long recvWindow)
            throws ApiException {
        return accountApi.queryMarginRepayRecord(
                asset, txId, startTime, endTime, current, size, archived, recvWindow);
    }

    /**
     * Query Portfolio Margin Negative Balance Interest History(USER_DATA) Query interest history of
     * negative balance for portfolio margin. * Response in descending order * The max interval
     * between startTime and endTime is 30 days. It is a MUST to ensure data correctness. * If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; not sent, return records of the last 7 days by
     * default * If &#x60;startTime&#x60; is sent and &#x60;endTime&#x60; is not sent, the records
     * from &#x60;startTime&#x60; to the present will be returned; if &#x60;startTime&#x60; is more
     * than 30 days ago, the records of the past 30 days will be returned. * If
     * &#x60;startTime&#x60; is not sent and &#x60;endTime&#x60; is sent, the records of the 7 days
     * before &#x60;endTime&#x60; is returned. Weight: 50
     *
     * @param asset (optional)
     * @param startTime Timestamp in ms to get funding from INCLUSIVE. (optional)
     * @param endTime Timestamp in ms to get funding until INCLUSIVE. (optional)
     * @param size Default:10 Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryPortfolioMarginNegativeBalanceInterestHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Portfolio Margin Negative Balance Interest History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Query-Portfolio-Margin-Negative-Balance-Interest-History">Query
     *     Portfolio Margin Negative Balance Interest History(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryPortfolioMarginNegativeBalanceInterestHistoryResponse>
            queryPortfolioMarginNegativeBalanceInterestHistory(
                    String asset, Long startTime, Long endTime, Long size, Long recvWindow)
                    throws ApiException {
        return accountApi.queryPortfolioMarginNegativeBalanceInterestHistory(
                asset, startTime, endTime, size, recvWindow);
    }

    /**
     * Query UM Position Information(USER_DATA) Get current UM position information. * Please use
     * with user data stream &#x60;ACCOUNT_UPDATE&#x60; to meet your timeliness and accuracy needs.
     * * for One-way Mode user, the response will only show the \&quot;BOTH\&quot; positions * for
     * Hedge Mode user, the response will show \&quot;LONG\&quot;, and \&quot;SHORT\&quot;
     * positions. Weight: 5
     *
     * @param symbol (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryUmPositionInformationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> UM Position Information </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Query-UM-Position-Information">Query
     *     UM Position Information(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryUmPositionInformationResponse> queryUmPositionInformation(
            String symbol, Long recvWindow) throws ApiException {
        return accountApi.queryUmPositionInformation(symbol, recvWindow);
    }

    /**
     * Query User Negative Balance Auto Exchange Record (USER_DATA) Query user negative balance auto
     * exchange record * Response in descending order * The max interval between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; is 3 months. Weight: 100
     *
     * @param startTime (required)
     * @param endTime (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryUserNegativeBalanceAutoExchangeRecordResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User Negative Balance Auto Exchange Record </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Query-User-Negative-Balance-Auto-Exchange-Record">Query
     *     User Negative Balance Auto Exchange Record (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryUserNegativeBalanceAutoExchangeRecordResponse>
            queryUserNegativeBalanceAutoExchangeRecord(
                    Long startTime, Long endTime, Long recvWindow) throws ApiException {
        return accountApi.queryUserNegativeBalanceAutoExchangeRecord(
                startTime, endTime, recvWindow);
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
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Query-User-Rate-Limit">Query
     *     User Rate Limit (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryUserRateLimitResponse> queryUserRateLimit(Long recvWindow)
            throws ApiException {
        return accountApi.queryUserRateLimit(recvWindow);
    }

    /**
     * Repay futures Negative Balance(USER_DATA) Repay futures Negative Balance Weight: 750
     *
     * @param repayFuturesNegativeBalanceRequest (required)
     * @return ApiResponse&lt;RepayFuturesNegativeBalanceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Repay futures Negative Balance </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Repay-futures-Negative-Balance">Repay
     *     futures Negative Balance(USER_DATA) Documentation</a>
     */
    public ApiResponse<RepayFuturesNegativeBalanceResponse> repayFuturesNegativeBalance(
            RepayFuturesNegativeBalanceRequest repayFuturesNegativeBalanceRequest)
            throws ApiException {
        return accountApi.repayFuturesNegativeBalance(repayFuturesNegativeBalanceRequest);
    }

    /**
     * UM Futures Account Configuration(USER_DATA) Query UM Futures account configuration Weight: 5
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;UmFuturesAccountConfigurationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> UM Futures Account Configuration </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Get-UM-Futures-Account-Config">UM
     *     Futures Account Configuration(USER_DATA) Documentation</a>
     */
    public ApiResponse<UmFuturesAccountConfigurationResponse> umFuturesAccountConfiguration(
            Long recvWindow) throws ApiException {
        return accountApi.umFuturesAccountConfiguration(recvWindow);
    }

    /**
     * UM Futures Symbol Configuration(USER_DATA) Get current UM account symbol configuration.
     * Weight: 5
     *
     * @param symbol (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;UmFuturesSymbolConfigurationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> UM Futures Symbol Configuration </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/Get-UM-Futures-Symbol-Config">UM
     *     Futures Symbol Configuration(USER_DATA) Documentation</a>
     */
    public ApiResponse<UmFuturesSymbolConfigurationResponse> umFuturesSymbolConfiguration(
            String symbol, Long recvWindow) throws ApiException {
        return accountApi.umFuturesSymbolConfiguration(symbol, recvWindow);
    }

    /**
     * UM Notional and Leverage Brackets (USER_DATA) Query UM notional and leverage brackets Weight:
     * 1
     *
     * @param symbol (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;UmNotionalAndLeverageBracketsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> UM Notional and Leverage Brackets </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/account/UM-Notional-and-Leverage-Brackets">UM
     *     Notional and Leverage Brackets (USER_DATA) Documentation</a>
     */
    public ApiResponse<UmNotionalAndLeverageBracketsResponse> umNotionalAndLeverageBrackets(
            String symbol, Long recvWindow) throws ApiException {
        return accountApi.umNotionalAndLeverageBrackets(symbol, recvWindow);
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
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/market-data/Test-Connectivity">Test
     *     Connectivity Documentation</a>
     */
    public void testConnectivity() throws ApiException {
        marketDataApi.testConnectivity();
    }

    /**
     * Cancel All CM Open Conditional Orders(TRADE) Cancel All CM Open Conditional Orders Weight: 1
     *
     * @param symbol (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;CancelAllCmOpenConditionalOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cancel All CM Open Conditional Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Cancel-All-CM-Open-Conditional-Orders">Cancel
     *     All CM Open Conditional Orders(TRADE) Documentation</a>
     */
    public ApiResponse<CancelAllCmOpenConditionalOrdersResponse> cancelAllCmOpenConditionalOrders(
            String symbol, Long recvWindow) throws ApiException {
        return tradeApi.cancelAllCmOpenConditionalOrders(symbol, recvWindow);
    }

    /**
     * Cancel All CM Open Orders(TRADE) Cancel all active LIMIT orders on specific symbol Weight: 1
     *
     * @param symbol (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;CancelAllCmOpenOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cancel All CM Open Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Cancel-All-CM-Open-Orders">Cancel
     *     All CM Open Orders(TRADE) Documentation</a>
     */
    public ApiResponse<CancelAllCmOpenOrdersResponse> cancelAllCmOpenOrders(
            String symbol, Long recvWindow) throws ApiException {
        return tradeApi.cancelAllCmOpenOrders(symbol, recvWindow);
    }

    /**
     * Cancel All UM Open Conditional Orders (TRADE) Cancel All UM Open Conditional Orders Weight: 1
     *
     * @param symbol (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;CancelAllUmOpenConditionalOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cancel All UM Open Conditional Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Cancel-All-UM-Open-Conditional-Orders">Cancel
     *     All UM Open Conditional Orders (TRADE) Documentation</a>
     */
    public ApiResponse<CancelAllUmOpenConditionalOrdersResponse> cancelAllUmOpenConditionalOrders(
            String symbol, Long recvWindow) throws ApiException {
        return tradeApi.cancelAllUmOpenConditionalOrders(symbol, recvWindow);
    }

    /**
     * Cancel All UM Open Orders(TRADE) Cancel all active LIMIT orders on specific symbol Weight: 1
     *
     * @param symbol (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;CancelAllUmOpenOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cancel All UM Open Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Cancel-All-UM-Open-Orders">Cancel
     *     All UM Open Orders(TRADE) Documentation</a>
     */
    public ApiResponse<CancelAllUmOpenOrdersResponse> cancelAllUmOpenOrders(
            String symbol, Long recvWindow) throws ApiException {
        return tradeApi.cancelAllUmOpenOrders(symbol, recvWindow);
    }

    /**
     * Cancel CM Conditional Order(TRADE) Cancel CM Conditional Order * Either
     * &#x60;strategyId&#x60; or &#x60;newClientStrategyId&#x60; must be sent. Weight: 1
     *
     * @param symbol (required)
     * @param strategyId (optional)
     * @param newClientStrategyId (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;CancelCmConditionalOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cancel CM Conditional Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Cancel-CM-Conditional-Order">Cancel
     *     CM Conditional Order(TRADE) Documentation</a>
     */
    public ApiResponse<CancelCmConditionalOrderResponse> cancelCmConditionalOrder(
            String symbol, Long strategyId, String newClientStrategyId, Long recvWindow)
            throws ApiException {
        return tradeApi.cancelCmConditionalOrder(
                symbol, strategyId, newClientStrategyId, recvWindow);
    }

    /**
     * Cancel CM Order(TRADE) Cancel an active LIMIT order * Either &#x60;orderId&#x60; or
     * &#x60;origClientOrderId&#x60; must be sent. Weight: 1
     *
     * @param symbol (required)
     * @param orderId (optional)
     * @param origClientOrderId (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;CancelCmOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cancel CM Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Cancel-CM-Order">Cancel
     *     CM Order(TRADE) Documentation</a>
     */
    public ApiResponse<CancelCmOrderResponse> cancelCmOrder(
            String symbol, Long orderId, String origClientOrderId, Long recvWindow)
            throws ApiException {
        return tradeApi.cancelCmOrder(symbol, orderId, origClientOrderId, recvWindow);
    }

    /**
     * Cancel Margin Account All Open Orders on a Symbol(TRADE) Cancel Margin Account All Open
     * Orders on a Symbol Weight: 5
     *
     * @param symbol (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;CancelMarginAccountAllOpenOrdersOnASymbolResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cancel Margin Account All Open Orders on a Symbol </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Cancel-Margin-Account-All-Open-Orders-on-a-Symbol">Cancel
     *     Margin Account All Open Orders on a Symbol(TRADE) Documentation</a>
     */
    public ApiResponse<CancelMarginAccountAllOpenOrdersOnASymbolResponse>
            cancelMarginAccountAllOpenOrdersOnASymbol(String symbol, Long recvWindow)
                    throws ApiException {
        return tradeApi.cancelMarginAccountAllOpenOrdersOnASymbol(symbol, recvWindow);
    }

    /**
     * Cancel Margin Account OCO Orders(TRADE) Cancel Margin Account OCO Orders * Additional notes:
     * Canceling an individual leg will cancel the entire OCO Weight: 2
     *
     * @param symbol (required)
     * @param orderListId Either &#x60;orderListId&#x60; or &#x60;listClientOrderId&#x60; must be
     *     provided (optional)
     * @param listClientOrderId Either &#x60;orderListId&#x60; or &#x60;listClientOrderId&#x60; must
     *     be provided (optional)
     * @param newClientOrderId Used to uniquely identify this cancel. Automatically generated by
     *     default (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;CancelMarginAccountOcoOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cancel Margin Account OCO Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Cancel-Margin-Account-OCO-Orders">Cancel
     *     Margin Account OCO Orders(TRADE) Documentation</a>
     */
    public ApiResponse<CancelMarginAccountOcoOrdersResponse> cancelMarginAccountOcoOrders(
            String symbol,
            Long orderListId,
            String listClientOrderId,
            String newClientOrderId,
            Long recvWindow)
            throws ApiException {
        return tradeApi.cancelMarginAccountOcoOrders(
                symbol, orderListId, listClientOrderId, newClientOrderId, recvWindow);
    }

    /**
     * Cancel Margin Account Order(TRADE) Cancel Margin Account Order * Either &#x60;orderId&#x60;
     * or &#x60;origClientOrderId&#x60; must be sent. Weight: 2
     *
     * @param symbol (required)
     * @param orderId (optional)
     * @param origClientOrderId (optional)
     * @param newClientOrderId Used to uniquely identify this cancel. Automatically generated by
     *     default (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;CancelMarginAccountOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cancel Margin Account Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Cancel-Margin-Account-Order">Cancel
     *     Margin Account Order(TRADE) Documentation</a>
     */
    public ApiResponse<CancelMarginAccountOrderResponse> cancelMarginAccountOrder(
            String symbol,
            Long orderId,
            String origClientOrderId,
            String newClientOrderId,
            Long recvWindow)
            throws ApiException {
        return tradeApi.cancelMarginAccountOrder(
                symbol, orderId, origClientOrderId, newClientOrderId, recvWindow);
    }

    /**
     * Cancel UM Conditional Order(TRADE) Cancel UM Conditional Order * Either
     * &#x60;strategyId&#x60; or &#x60;newClientStrategyId&#x60; must be sent. Weight: 1
     *
     * @param symbol (required)
     * @param strategyId (optional)
     * @param newClientStrategyId (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;CancelUmConditionalOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cancel UM Conditional Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Cancel-UM-Conditional-Order">Cancel
     *     UM Conditional Order(TRADE) Documentation</a>
     */
    public ApiResponse<CancelUmConditionalOrderResponse> cancelUmConditionalOrder(
            String symbol, Long strategyId, String newClientStrategyId, Long recvWindow)
            throws ApiException {
        return tradeApi.cancelUmConditionalOrder(
                symbol, strategyId, newClientStrategyId, recvWindow);
    }

    /**
     * Cancel UM Order(TRADE) Cancel an active UM LIMIT order * Either &#x60;orderId&#x60; or
     * &#x60;origClientOrderId&#x60; must be sent. Weight: 1
     *
     * @param symbol (required)
     * @param orderId (optional)
     * @param origClientOrderId (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;CancelUmOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cancel UM Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Cancel-UM-Order">Cancel
     *     UM Order(TRADE) Documentation</a>
     */
    public ApiResponse<CancelUmOrderResponse> cancelUmOrder(
            String symbol, Long orderId, String origClientOrderId, Long recvWindow)
            throws ApiException {
        return tradeApi.cancelUmOrder(symbol, orderId, origClientOrderId, recvWindow);
    }

    /**
     * CM Account Trade List(USER_DATA) Get trades for a specific account and CM symbol. * Either
     * &#x60;symbol&#x60; or &#x60;pair&#x60; must be sent * &#x60;symbol&#x60; and &#x60;pair&#x60;
     * cannot be sent together * &#x60;pair&#x60; and &#x60;fromId&#x60; cannot be sent together *
     * &#x60;OrderId&#x60; can only be sent together with symbol * If a &#x60;pair&#x60; is sent,
     * tickers for all symbols of the &#x60;pair&#x60; will be returned * The parameter
     * &#x60;fromId&#x60; cannot be sent with &#x60;startTime&#x60; or &#x60;endTime&#x60; * If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last &#39;24
     * hours&#39; data will be returned. * The time between &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; cannot be longer than 24 hours. Weight: 20 with symbol, 40 with pair
     *
     * @param symbol (optional)
     * @param pair (optional)
     * @param startTime Timestamp in ms to get funding from INCLUSIVE. (optional)
     * @param endTime Timestamp in ms to get funding until INCLUSIVE. (optional)
     * @param fromId Trade id to fetch from. Default gets most recent trades. (optional)
     * @param limit Default 100; max 1000 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;CmAccountTradeListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> CM Account Trade List </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/CM-Account-Trade-List">CM
     *     Account Trade List(USER_DATA) Documentation</a>
     */
    public ApiResponse<CmAccountTradeListResponse> cmAccountTradeList(
            String symbol,
            String pair,
            Long startTime,
            Long endTime,
            Long fromId,
            Long limit,
            Long recvWindow)
            throws ApiException {
        return tradeApi.cmAccountTradeList(
                symbol, pair, startTime, endTime, fromId, limit, recvWindow);
    }

    /**
     * CM Position ADL Quantile Estimation(USER_DATA) Query CM Position ADL Quantile Estimation *
     * Values update every 30s. * Values 0, 1, 2, 3, 4 shows the queue position and possibility of
     * ADL from low to high. * For positions of the symbol are in One-way Mode or isolated margined
     * in Hedge Mode, \&quot;LONG\&quot;, \&quot;SHORT\&quot;, and \&quot;BOTH\&quot; will be
     * returned to show the positions&#39; adl quantiles of different position sides. * If the
     * positions of the symbol are crossed margined in Hedge Mode: * \&quot;HEDGE\&quot; as a sign
     * will be returned instead of \&quot;BOTH\&quot;; * A same value caculated on unrealized pnls
     * on long and short sides&#39; positions will be shown for \&quot;LONG\&quot; and
     * \&quot;SHORT\&quot; when there are positions in both of long and short sides. Weight: 5
     *
     * @param symbol (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;CmPositionAdlQuantileEstimationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> CM Position ADL Quantile Estimation </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/CM-Position-ADL-Quantile-Estimation">CM
     *     Position ADL Quantile Estimation(USER_DATA) Documentation</a>
     */
    public ApiResponse<CmPositionAdlQuantileEstimationResponse> cmPositionAdlQuantileEstimation(
            String symbol, Long recvWindow) throws ApiException {
        return tradeApi.cmPositionAdlQuantileEstimation(symbol, recvWindow);
    }

    /**
     * Get UM Futures BNB Burn Status (USER_DATA) Get user&#39;s BNB Fee Discount for UM Futures
     * (Fee Discount On or Fee Discount Off ) Weight: 30
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetUmFuturesBnbBurnStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get UM Futures BNB Burn Status </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Get-UM-Futures-BNB-Burn-Status">Get
     *     UM Futures BNB Burn Status (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetUmFuturesBnbBurnStatusResponse> getUmFuturesBnbBurnStatus(Long recvWindow)
            throws ApiException {
        return tradeApi.getUmFuturesBnbBurnStatus(recvWindow);
    }

    /**
     * Margin Account Borrow(MARGIN) Apply for a margin loan. Weight: 100
     *
     * @param marginAccountBorrowRequest (required)
     * @return ApiResponse&lt;MarginAccountBorrowResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Margin Account Borrow </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Margin-Account-Borrow">Margin
     *     Account Borrow(MARGIN) Documentation</a>
     */
    public ApiResponse<MarginAccountBorrowResponse> marginAccountBorrow(
            MarginAccountBorrowRequest marginAccountBorrowRequest) throws ApiException {
        return tradeApi.marginAccountBorrow(marginAccountBorrowRequest);
    }

    /**
     * Margin Account New OCO(TRADE) Send in a new OCO for a margin account * Price Restrictions: *
     * &#x60;SELL&#x60;: Limit Price &gt; Last Price &gt; Stop Price * &#x60;BUY&#x60;: Limit Price
     * &lt; Last Price &lt; Stop Price * Quantity Restrictions: * Both legs must have the same
     * quantity * &#x60;ICEBERG&#x60; quantities however do not have to be the same. * Order Rate
     * Limit * &#x60;OCO&#x60; counts as 2 orders against the order rate limit. Weight: 1
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
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Margin-Account-New-OCO">Margin
     *     Account New OCO(TRADE) Documentation</a>
     */
    public ApiResponse<MarginAccountNewOcoResponse> marginAccountNewOco(
            MarginAccountNewOcoRequest marginAccountNewOcoRequest) throws ApiException {
        return tradeApi.marginAccountNewOco(marginAccountNewOcoRequest);
    }

    /**
     * Margin Account Repay(MARGIN) Repay for a margin loan. Weight: 100
     *
     * @param marginAccountRepayRequest (required)
     * @return ApiResponse&lt;MarginAccountRepayResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Margin Account Repay </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Margin-Account-Repay">Margin
     *     Account Repay(MARGIN) Documentation</a>
     */
    public ApiResponse<MarginAccountRepayResponse> marginAccountRepay(
            MarginAccountRepayRequest marginAccountRepayRequest) throws ApiException {
        return tradeApi.marginAccountRepay(marginAccountRepayRequest);
    }

    /**
     * Margin Account Repay Debt(TRADE) Repay debt for a margin loan. * The repay asset amount
     * cannot exceed 50000 USD equivalent value for a single request. * If &#x60;amount&#x60; is not
     * sent, all the asset loan will be repaid if having enough specific repay assets. * If
     * &#x60;amount&#x60; is sent, only the certain amount of the asset loan will be repaid if
     * having enough specific repay assets. * The system will use the same asset to repay the loan
     * first (if have) no matter whether put the asset in &#x60;specifyRepayAssets&#x60; Weight:
     * 3000
     *
     * @param marginAccountRepayDebtRequest (required)
     * @return ApiResponse&lt;MarginAccountRepayDebtResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Margin Account Repay Debt </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Margin-Account-Repay-Debt">Margin
     *     Account Repay Debt(TRADE) Documentation</a>
     */
    public ApiResponse<MarginAccountRepayDebtResponse> marginAccountRepayDebt(
            MarginAccountRepayDebtRequest marginAccountRepayDebtRequest) throws ApiException {
        return tradeApi.marginAccountRepayDebt(marginAccountRepayDebtRequest);
    }

    /**
     * Margin Account Trade List (USER_DATA) Margin Account Trade List Weight: 5
     *
     * @param symbol (required)
     * @param orderId (optional)
     * @param startTime Timestamp in ms to get funding from INCLUSIVE. (optional)
     * @param endTime Timestamp in ms to get funding until INCLUSIVE. (optional)
     * @param fromId Trade id to fetch from. Default gets most recent trades. (optional)
     * @param limit Default 100; max 1000 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;MarginAccountTradeListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Margin Account Trade List </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Margin-Account-Trade-List">Margin
     *     Account Trade List (USER_DATA) Documentation</a>
     */
    public ApiResponse<MarginAccountTradeListResponse> marginAccountTradeList(
            String symbol,
            Long orderId,
            Long startTime,
            Long endTime,
            Long fromId,
            Long limit,
            Long recvWindow)
            throws ApiException {
        return tradeApi.marginAccountTradeList(
                symbol, orderId, startTime, endTime, fromId, limit, recvWindow);
    }

    /**
     * Modify CM Order(TRADE) Order modify function, currently only LIMIT order modification is
     * supported, modified orders will be reordered in the match queue * Either &#x60;orderId&#x60;
     * or &#x60;origClientOrderId&#x60; must be sent, and the &#x60;orderId&#x60; will prevail if
     * both are sent. * Both &#x60;quantity&#x60; and &#x60;price&#x60; must be sent * When the new
     * &#x60;quantity&#x60; or &#x60;price&#x60; doesn&#39;t satisfy PRICE_FILTER / PERCENT_FILTER /
     * LOT_SIZE, amendment will be rejected and the order will stay as it is. * However the order
     * will be cancelled by the amendment in the following situations: * when the order is in
     * partially filled status and the new &#x60;quantity&#x60; &lt;&#x3D; &#x60;executedQty&#x60; *
     * When the order is &#x60;GTX&#x60; and the new price will cause it to be executed immediately
     * Weight: 1
     *
     * @param modifyCmOrderRequest (required)
     * @return ApiResponse&lt;ModifyCmOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Modify CM Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Modify-CM-Order">Modify
     *     CM Order(TRADE) Documentation</a>
     */
    public ApiResponse<ModifyCmOrderResponse> modifyCmOrder(
            ModifyCmOrderRequest modifyCmOrderRequest) throws ApiException {
        return tradeApi.modifyCmOrder(modifyCmOrderRequest);
    }

    /**
     * Modify UM Order(TRADE) Order modify function, currently only LIMIT order modification is
     * supported, modified orders will be reordered in the match queue * Either orderId or
     * origClientOrderId must be sent, and the orderId will prevail if both are sent. * Both
     * quantity and price must be sent * When the new quantity or price doesn&#39;t satisfy
     * PRICE_FILTER / PERCENT_FILTER / LOT_SIZE, amendment will be rejected and the order will stay
     * as it is. * However the order will be cancelled by the amendment in the following situations:
     * * when the order is in partially filled status and the new quantity &lt;&#x3D; executedQty *
     * When the order is GTX and the new price will cause it to be executed immediately Weight: 1
     *
     * @param modifyUmOrderRequest (required)
     * @return ApiResponse&lt;ModifyUmOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Modify UM Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Modify-UM-Order">Modify
     *     UM Order(TRADE) Documentation</a>
     */
    public ApiResponse<ModifyUmOrderResponse> modifyUmOrder(
            ModifyUmOrderRequest modifyUmOrderRequest) throws ApiException {
        return tradeApi.modifyUmOrder(modifyUmOrderRequest);
    }

    /**
     * New CM Conditional Order(TRADE) New CM Conditional Order * Order with type
     * &#x60;STOP/TAKE_PROFIT&#x60;, parameter &#x60;timeInForce&#x60; can be sent ( default
     * &#x60;GTC&#x60;). * Condition orders will be triggered when: * &#x60;STOP&#x60;,
     * &#x60;STOP_MARKET&#x60;: * BUY: \&quot;MARK_PRICE\&quot; &gt;&#x3D; &#x60;stopPrice&#x60; *
     * SELL: \&quot;MARK_PRICE\&quot; &lt;&#x3D; &#x60;stopPrice&#x60; * &#x60;TAKE_PROFIT&#x60;,
     * &#x60;TAKE_PROFIT_MARKET&#x60;: * BUY: \&quot;MARK_PRICE\&quot; &lt;&#x3D;
     * &#x60;stopPrice&#x60; * SELL: \&quot;MARK_PRICE\&quot; &gt;&#x3D; &#x60;stopPrice&#x60; *
     * &#x60;TRAILING_STOP_MARKET&#x60;: * BUY: the lowest mark price after order placed
     * &#x60;&lt;&#x3D; &#x60;activationPrice&#x60;, and the latest mark price &gt;&#x60;&#x3D; the
     * lowest mark price * (1 + &#x60;callbackRate&#x60;) * SELL: the highest mark price after order
     * placed &gt;&#x3D; &#x60;activationPrice&#x60;, and the latest mark price &lt;&#x3D; the
     * highest mark price * (1 - &#x60;callbackRate&#x60;) * For &#x60;TRAILING_STOP_MARKET&#x60;,
     * if you got such error code. &#x60;{\&quot;code\&quot;: -2021, \&quot;msg\&quot;: \&quot;Order
     * would immediately trigger.\&quot;}&#x60; means that the parameters you send do not meet the
     * following requirements: * BUY: &#x60;activationPrice&#x60; should be smaller than latest mark
     * price. * SELL: &#x60;activationPrice&#x60; should be larger than latest mark price. *
     * Condition orders will be triggered when: * If parameter&#x60;priceProtect&#x60;is sent as
     * true: * when price reaches the &#x60;stopPrice&#x60; ，the difference rate between
     * \&quot;MARK_PRICE\&quot; and \&quot;CONTRACT_PRICE\&quot; cannot be larger than the
     * \&quot;triggerProtect\&quot; of the symbol * \&quot;triggerProtect\&quot; of a symbol can be
     * got from &#x60;GET /fapi/v1/exchangeInfo&#x60; * &#x60;STOP&#x60;, &#x60;STOP_MARKET&#x60;: *
     * BUY: latest price (\&quot;MARK_PRICE\&quot; or \&quot;CONTRACT_PRICE\&quot;) &gt;&#x3D;
     * &#x60;stopPrice&#x60; * SELL: latest price (\&quot;MARK_PRICE\&quot; or
     * \&quot;CONTRACT_PRICE\&quot;) &lt;&#x3D; &#x60;stopPrice&#x60; * &#x60;TAKE_PROFIT&#x60;,
     * &#x60;TAKE_PROFIT_MARKET&#x60;: * BUY: latest price (\&quot;MARK_PRICE\&quot; or
     * \&quot;CONTRACT_PRICE\&quot;) &lt;&#x3D; &#x60;stopPrice&#x60; * SELL: latest price
     * (\&quot;MARK_PRICE\&quot; or \&quot;CONTRACT_PRICE\&quot;) &gt;&#x3D; &#x60;stopPrice&#x60;
     * Weight: 1
     *
     * @param newCmConditionalOrderRequest (required)
     * @return ApiResponse&lt;NewCmConditionalOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> New CM Conditional Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/New-CM-Conditional-Order">New
     *     CM Conditional Order(TRADE) Documentation</a>
     */
    public ApiResponse<NewCmConditionalOrderResponse> newCmConditionalOrder(
            NewCmConditionalOrderRequest newCmConditionalOrderRequest) throws ApiException {
        return tradeApi.newCmConditionalOrder(newCmConditionalOrderRequest);
    }

    /**
     * New CM Order(TRADE) Place new CM order * If &#x60;newOrderRespType&#x60; is sent as
     * &#x60;RESULT&#x60; : * &#x60;MARKET&#x60; order: the final FILLED result of the order will be
     * return directly. * &#x60;LIMIT&#x60; order with special &#x60;timeInForce&#x60;: the final
     * status result of the order(FILLED or EXPIRED) will be returned directly. Weight: 1
     *
     * @param newCmOrderRequest (required)
     * @return ApiResponse&lt;NewCmOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> New CM Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/New-CM-Order">New
     *     CM Order(TRADE) Documentation</a>
     */
    public ApiResponse<NewCmOrderResponse> newCmOrder(NewCmOrderRequest newCmOrderRequest)
            throws ApiException {
        return tradeApi.newCmOrder(newCmOrderRequest);
    }

    /**
     * New Margin Order(TRADE) New Margin Order Weight: 1
     *
     * @param newMarginOrderRequest (required)
     * @return ApiResponse&lt;NewMarginOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> New Margin Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/New-Margin-Order">New
     *     Margin Order(TRADE) Documentation</a>
     */
    public ApiResponse<NewMarginOrderResponse> newMarginOrder(
            NewMarginOrderRequest newMarginOrderRequest) throws ApiException {
        return tradeApi.newMarginOrder(newMarginOrderRequest);
    }

    /**
     * New UM Conditional Order (TRADE) Place new UM conditional order * Order with type
     * &#x60;STOP/TAKE_PROFIT&#x60;, parameter &#x60;timeInForce&#x60; can be sent ( default
     * &#x60;GTC&#x60;). * Condition orders will be triggered when: * &#x60;STOP&#x60;,
     * &#x60;STOP_MARKET&#x60;: * BUY: \&quot;MARK_PRICE\&quot; &gt;&#x3D; &#x60;stopPrice&#x60; *
     * SELL: \&quot;MARK_PRICE\&quot; &lt;&#x3D; &#x60;stopPrice&#x60; * &#x60;TAKE_PROFIT&#x60;,
     * &#x60;TAKE_PROFIT_MARKET&#x60;: * BUY: \&quot;MARK_PRICE\&quot; &lt;&#x3D;
     * &#x60;stopPrice&#x60; * SELL: \&quot;MARK_PRICE\&quot; &gt;&#x3D; &#x60;stopPrice&#x60; *
     * &#x60;TRAILING_STOP_MARKET&#x60;: * BUY: the lowest mark price after order placed
     * &#x60;&lt;&#x3D; &#x60;activationPrice&#x60;, and the latest mark price &gt;&#x60;&#x3D; the
     * lowest mark price * (1 + &#x60;callbackRate&#x60;) * SELL: the highest mark price after order
     * placed &gt;&#x3D; &#x60;activationPrice&#x60;, and the latest mark price &lt;&#x3D; the
     * highest mark price * (1 - &#x60;callbackRate&#x60;) * For &#x60;TRAILING_STOP_MARKET&#x60;,
     * if you got such error code. &#x60;{\&quot;code\&quot;: -2021, \&quot;msg\&quot;: \&quot;Order
     * would immediately trigger.\&quot;}&#x60; means that the parameters you send do not meet the
     * following requirements: * BUY: &#x60;activationPrice&#x60; should be smaller than latest mark
     * price. * SELL: &#x60;activationPrice&#x60; should be larger than latest mark price. *
     * Condition orders will be triggered when: * If parameter&#x60;priceProtect&#x60;is sent as
     * true: * when price reaches the &#x60;stopPrice&#x60; ，the difference rate between
     * \&quot;MARK_PRICE\&quot; and \&quot;CONTRACT_PRICE\&quot; cannot be larger than the
     * \&quot;triggerProtect\&quot; of the symbol * \&quot;triggerProtect\&quot; of a symbol can be
     * got from &#x60;GET /fapi/v1/exchangeInfo&#x60; * &#x60;STOP&#x60;, &#x60;STOP_MARKET&#x60;: *
     * BUY: latest price (\&quot;MARK_PRICE\&quot; or \&quot;CONTRACT_PRICE\&quot;) &gt;&#x3D;
     * &#x60;stopPrice&#x60; * SELL: latest price (\&quot;MARK_PRICE\&quot; or
     * \&quot;CONTRACT_PRICE\&quot;) &lt;&#x3D; &#x60;stopPrice&#x60; * &#x60;TAKE_PROFIT&#x60;,
     * &#x60;TAKE_PROFIT_MARKET&#x60;: * BUY: latest price (\&quot;MARK_PRICE\&quot; or
     * \&quot;CONTRACT_PRICE\&quot;) &lt;&#x3D; &#x60;stopPrice&#x60; * SELL: latest price
     * (\&quot;MARK_PRICE\&quot; or \&quot;CONTRACT_PRICE\&quot;) &gt;&#x3D; &#x60;stopPrice&#x60; *
     * &#x60;selfTradePreventionMode&#x60; is only effective when &#x60;timeInForce&#x60; set to
     * &#x60;IOC&#x60; or &#x60;GTC&#x60; or &#x60;GTD&#x60;. * In extreme market conditions,
     * timeInForce &#x60;GTD&#x60; order auto cancel time might be delayed comparing to
     * &#x60;goodTillDate&#x60; Weight: 1
     *
     * @param newUmConditionalOrderRequest (required)
     * @return ApiResponse&lt;NewUmConditionalOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> New UM Conditional Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/New-UM-Conditional-Order">New
     *     UM Conditional Order (TRADE) Documentation</a>
     */
    public ApiResponse<NewUmConditionalOrderResponse> newUmConditionalOrder(
            NewUmConditionalOrderRequest newUmConditionalOrderRequest) throws ApiException {
        return tradeApi.newUmConditionalOrder(newUmConditionalOrderRequest);
    }

    /**
     * New UM Order (TRADE) Place new UM order * If &#x60;newOrderRespType&#x60; is sent as
     * &#x60;RESULT&#x60; : * &#x60;MARKET&#x60; order: the final FILLED result of the order will be
     * return directly. * &#x60;LIMIT&#x60; order with special &#x60;timeInForce&#x60;: the final
     * status result of the order(FILLED or EXPIRED) will be returned directly. *
     * &#x60;selfTradePreventionMode&#x60; is only effective when &#x60;timeInForce&#x60; set to
     * &#x60;IOC&#x60; or &#x60;GTC&#x60; or &#x60;GTD&#x60;. * In extreme market conditions,
     * timeInForce &#x60;GTD&#x60; order auto cancel time might be delayed comparing to
     * &#x60;goodTillDate&#x60; Weight: 1
     *
     * @param newUmOrderRequest (required)
     * @return ApiResponse&lt;NewUmOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> New UM Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/New-UM-Order">New
     *     UM Order (TRADE) Documentation</a>
     */
    public ApiResponse<NewUmOrderResponse> newUmOrder(NewUmOrderRequest newUmOrderRequest)
            throws ApiException {
        return tradeApi.newUmOrder(newUmOrderRequest);
    }

    /**
     * Query All CM Conditional Orders(USER_DATA) Query All CM Conditional Orders * These orders
     * will not be found: * order strategyStatus is &#x60;CANCELED&#x60; or &#x60;EXPIRED&#x60;,
     * **AND** * order has NO filled trade, **AND** * created time + 7 days &lt; current time * The
     * query time period must be less than 7 days( default as the recent 7 days). Weight: 1 for a
     * single symbol; 40 when the symbol parameter is omitted
     *
     * @param symbol (optional)
     * @param strategyId (optional)
     * @param startTime Timestamp in ms to get funding from INCLUSIVE. (optional)
     * @param endTime Timestamp in ms to get funding until INCLUSIVE. (optional)
     * @param limit Default 100; max 1000 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryAllCmConditionalOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> All CM Conditional Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Query-All-CM-Conditional-Orders">Query
     *     All CM Conditional Orders(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryAllCmConditionalOrdersResponse> queryAllCmConditionalOrders(
            String symbol,
            Long strategyId,
            Long startTime,
            Long endTime,
            Long limit,
            Long recvWindow)
            throws ApiException {
        return tradeApi.queryAllCmConditionalOrders(
                symbol, strategyId, startTime, endTime, limit, recvWindow);
    }

    /**
     * Query All CM Orders (USER_DATA) Get all account CM orders; active, canceled, or filled. *
     * Either &#x60;symbol&#x60; or &#x60;pair&#x60; must be sent. * If &#x60;orderId&#x60; is set,
     * it will get orders &gt;&#x3D; that orderId. Otherwise most recent orders are returned. *
     * These orders will not be found: * order status is &#x60;CANCELED&#x60; or
     * &#x60;EXPIRED&#x60;, **AND** * order has NO filled trade, **AND** * created time + 3 days
     * &lt; current time Weight: 20 with symbol, 40 with pair
     *
     * @param symbol (required)
     * @param pair (optional)
     * @param orderId (optional)
     * @param startTime Timestamp in ms to get funding from INCLUSIVE. (optional)
     * @param endTime Timestamp in ms to get funding until INCLUSIVE. (optional)
     * @param limit Default 100; max 1000 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryAllCmOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> All CM Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Query-All-CM-Orders">Query
     *     All CM Orders (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryAllCmOrdersResponse> queryAllCmOrders(
            String symbol,
            String pair,
            Long orderId,
            Long startTime,
            Long endTime,
            Long limit,
            Long recvWindow)
            throws ApiException {
        return tradeApi.queryAllCmOrders(
                symbol, pair, orderId, startTime, endTime, limit, recvWindow);
    }

    /**
     * Query All Current CM Open Conditional Orders (USER_DATA) Get all open conditional orders on a
     * symbol. **Careful** when accessing this with no symbol. * If the symbol is not sent, orders
     * for all symbols will be returned in an array. Weight: 1 for a single symbol; 40 when the
     * symbol parameter is omitted
     *
     * @param symbol (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryAllCurrentCmOpenConditionalOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> All Current CM Open Conditional Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Query-All-Current-CM-Open-Conditional-Orders">Query
     *     All Current CM Open Conditional Orders (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryAllCurrentCmOpenConditionalOrdersResponse>
            queryAllCurrentCmOpenConditionalOrders(String symbol, Long recvWindow)
                    throws ApiException {
        return tradeApi.queryAllCurrentCmOpenConditionalOrders(symbol, recvWindow);
    }

    /**
     * Query All Current CM Open Orders(USER_DATA) Get all open orders on a symbol. * If the symbol
     * is not sent, orders for all symbols will be returned in an array. Weight: 1 for a single
     * symbol; 40 when the symbol parameter is omitted Careful when accessing this with no symbol.
     *
     * @param symbol (optional)
     * @param pair (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryAllCurrentCmOpenOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> All Current CM Open Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Query-All-Current-CM-Open-Orders">Query
     *     All Current CM Open Orders(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryAllCurrentCmOpenOrdersResponse> queryAllCurrentCmOpenOrders(
            String symbol, String pair, Long recvWindow) throws ApiException {
        return tradeApi.queryAllCurrentCmOpenOrders(symbol, pair, recvWindow);
    }

    /**
     * Query All Current UM Open Conditional Orders(USER_DATA) Get all open conditional orders on a
     * symbol. * If the symbol is not sent, orders for all symbols will be returned in an array.
     * Weight: 1 for a single symbol; 40 when the symbol parameter is omitted Careful when accessing
     * this with no symbol.
     *
     * @param symbol (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryAllCurrentUmOpenConditionalOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> All Current UM Open Conditional Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Query-All-Current-UM-Open-Conditional-Orders">Query
     *     All Current UM Open Conditional Orders(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryAllCurrentUmOpenConditionalOrdersResponse>
            queryAllCurrentUmOpenConditionalOrders(String symbol, Long recvWindow)
                    throws ApiException {
        return tradeApi.queryAllCurrentUmOpenConditionalOrders(symbol, recvWindow);
    }

    /**
     * Query All Current UM Open Orders(USER_DATA) Get all open orders on a symbol. * If the symbol
     * is not sent, orders for all symbols will be returned in an array. Weight: 1 for a single
     * symbol; 40 when the symbol parameter is omitted
     *
     * @param symbol (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryAllCurrentUmOpenOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> All Current UM Open Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Query-All-Current-UM-Open-Orders">Query
     *     All Current UM Open Orders(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryAllCurrentUmOpenOrdersResponse> queryAllCurrentUmOpenOrders(
            String symbol, Long recvWindow) throws ApiException {
        return tradeApi.queryAllCurrentUmOpenOrders(symbol, recvWindow);
    }

    /**
     * Query All Margin Account Orders (USER_DATA) Query All Margin Account Orders Weight: 100
     *
     * @param symbol (required)
     * @param orderId (optional)
     * @param startTime Timestamp in ms to get funding from INCLUSIVE. (optional)
     * @param endTime Timestamp in ms to get funding until INCLUSIVE. (optional)
     * @param limit Default 100; max 1000 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryAllMarginAccountOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> All Margin Account Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Query-All-Margin-Account-Orders">Query
     *     All Margin Account Orders (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryAllMarginAccountOrdersResponse> queryAllMarginAccountOrders(
            String symbol, Long orderId, Long startTime, Long endTime, Long limit, Long recvWindow)
            throws ApiException {
        return tradeApi.queryAllMarginAccountOrders(
                symbol, orderId, startTime, endTime, limit, recvWindow);
    }

    /**
     * Query All UM Conditional Orders(USER_DATA) Query All UM Conditional Orders * These orders
     * will not be found: * order strategyStatus is &#x60;CANCELED&#x60; or &#x60;EXPIRED&#x60;,
     * **AND** * order has NO filled trade, **AND** * created time + 7 days &lt; current time * The
     * query time period must be less than 7 days( default as the recent 7 days). Weight: 1 for a
     * single symbol; 40 when the symbol parameter is omitted
     *
     * @param symbol (optional)
     * @param strategyId (optional)
     * @param startTime Timestamp in ms to get funding from INCLUSIVE. (optional)
     * @param endTime Timestamp in ms to get funding until INCLUSIVE. (optional)
     * @param limit Default 100; max 1000 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryAllUmConditionalOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> All UM Conditional Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Query-All-UM-Conditional-Orders">Query
     *     All UM Conditional Orders(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryAllUmConditionalOrdersResponse> queryAllUmConditionalOrders(
            String symbol,
            Long strategyId,
            Long startTime,
            Long endTime,
            Long limit,
            Long recvWindow)
            throws ApiException {
        return tradeApi.queryAllUmConditionalOrders(
                symbol, strategyId, startTime, endTime, limit, recvWindow);
    }

    /**
     * Query All UM Orders(USER_DATA) Get all account UM orders; active, canceled, or filled. *
     * These orders will not be found: * order status is &#x60;CANCELED&#x60; or
     * &#x60;EXPIRED&#x60;, **AND** * order has NO filled trade, **AND** * created time + 3 days
     * &lt; current time * If &#x60;orderId&#x60; is set, it will get orders &gt;&#x3D; that
     * orderId. Otherwise most recent orders are returned. * The query time period must be less then
     * 7 days( default as the recent 7 days). Weight: 5
     *
     * @param symbol (required)
     * @param orderId (optional)
     * @param startTime Timestamp in ms to get funding from INCLUSIVE. (optional)
     * @param endTime Timestamp in ms to get funding until INCLUSIVE. (optional)
     * @param limit Default 100; max 1000 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryAllUmOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> All UM Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Query-All-UM-Orders">Query
     *     All UM Orders(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryAllUmOrdersResponse> queryAllUmOrders(
            String symbol, Long orderId, Long startTime, Long endTime, Long limit, Long recvWindow)
            throws ApiException {
        return tradeApi.queryAllUmOrders(symbol, orderId, startTime, endTime, limit, recvWindow);
    }

    /**
     * Query CM Conditional Order History(USER_DATA) Query CM Conditional Order History * Either
     * &#x60;strategyId&#x60; or &#x60;newClientStrategyId&#x60; must be sent. * &#x60;NEW&#x60;
     * orders will not be found. * These orders will not be found: * order status is
     * &#x60;CANCELED&#x60; or &#x60;EXPIRED&#x60;, **AND** * order has NO filled trade, **AND** *
     * created time + 7 days &lt; current time Weight: 1
     *
     * @param symbol (required)
     * @param strategyId (optional)
     * @param newClientStrategyId (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryCmConditionalOrderHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> CM Conditional Order History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Query-CM-Conditional-Order-History">Query
     *     CM Conditional Order History(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryCmConditionalOrderHistoryResponse> queryCmConditionalOrderHistory(
            String symbol, Long strategyId, String newClientStrategyId, Long recvWindow)
            throws ApiException {
        return tradeApi.queryCmConditionalOrderHistory(
                symbol, strategyId, newClientStrategyId, recvWindow);
    }

    /**
     * Query CM Modify Order History(TRADE) Get order modification history * Either
     * &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent, and the
     * &#x60;orderId&#x60; will prevail if both are sent. Weight: 1
     *
     * @param symbol (required)
     * @param orderId (optional)
     * @param origClientOrderId (optional)
     * @param startTime Timestamp in ms to get funding from INCLUSIVE. (optional)
     * @param endTime Timestamp in ms to get funding until INCLUSIVE. (optional)
     * @param limit Default 100; max 1000 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryCmModifyOrderHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> CM Modify Order History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Query-CM-Modify-Order-History">Query
     *     CM Modify Order History(TRADE) Documentation</a>
     */
    public ApiResponse<QueryCmModifyOrderHistoryResponse> queryCmModifyOrderHistory(
            String symbol,
            Long orderId,
            String origClientOrderId,
            Long startTime,
            Long endTime,
            Long limit,
            Long recvWindow)
            throws ApiException {
        return tradeApi.queryCmModifyOrderHistory(
                symbol, orderId, origClientOrderId, startTime, endTime, limit, recvWindow);
    }

    /**
     * Query CM Order(USER_DATA) Check an CM order&#39;s status. * Either &#x60;orderId&#x60; or
     * &#x60;origClientOrderId&#x60; must be sent. * These orders will not be found: * order status
     * is &#x60;CANCELED&#x60; or &#x60;EXPIRED&#x60;, **AND** * order has NO filled trade, **AND**
     * * created time + 3 days &lt; current time Weight: 1
     *
     * @param symbol (required)
     * @param orderId (optional)
     * @param origClientOrderId (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryCmOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> CM Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Query-CM-Order">Query
     *     CM Order(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryCmOrderResponse> queryCmOrder(
            String symbol, Long orderId, String origClientOrderId, Long recvWindow)
            throws ApiException {
        return tradeApi.queryCmOrder(symbol, orderId, origClientOrderId, recvWindow);
    }

    /**
     * Query Current CM Open Conditional Order(USER_DATA) Query Current CM Open Conditional Order *
     * Either &#x60;strategyId&#x60; or &#x60;newClientStrategyId&#x60; must be sent. * If the
     * queried order has been triggered, cancelled or expired, the error message \&quot;Order does
     * not exist\&quot; will be returned. Weight: 1
     *
     * @param symbol (required)
     * @param strategyId (optional)
     * @param newClientStrategyId (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryCurrentCmOpenConditionalOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Current CM Open Conditional Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Query-Current-CM-Open-Conditional-Order">Query
     *     Current CM Open Conditional Order(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryCurrentCmOpenConditionalOrderResponse>
            queryCurrentCmOpenConditionalOrder(
                    String symbol, Long strategyId, String newClientStrategyId, Long recvWindow)
                    throws ApiException {
        return tradeApi.queryCurrentCmOpenConditionalOrder(
                symbol, strategyId, newClientStrategyId, recvWindow);
    }

    /**
     * Query Current CM Open Order (USER_DATA) Query current CM open order * Either
     * &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent. * If the queried order has
     * been filled or cancelled, the error message \&quot;Order does not exist\&quot; will be
     * returned. Weight: 1
     *
     * @param symbol (required)
     * @param orderId (optional)
     * @param origClientOrderId (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryCurrentCmOpenOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Current CM Open Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Query-Current-CM-Open-Order">Query
     *     Current CM Open Order (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryCurrentCmOpenOrderResponse> queryCurrentCmOpenOrder(
            String symbol, Long orderId, String origClientOrderId, Long recvWindow)
            throws ApiException {
        return tradeApi.queryCurrentCmOpenOrder(symbol, orderId, origClientOrderId, recvWindow);
    }

    /**
     * Query Current Margin Open Order (USER_DATA) Query Current Margin Open Order Weight: 5
     *
     * @param symbol (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryCurrentMarginOpenOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Current Margin Open Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Query-Current-Margin-Open-Order">Query
     *     Current Margin Open Order (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryCurrentMarginOpenOrderResponse> queryCurrentMarginOpenOrder(
            String symbol, Long recvWindow) throws ApiException {
        return tradeApi.queryCurrentMarginOpenOrder(symbol, recvWindow);
    }

    /**
     * Query Current UM Open Conditional Order(USER_DATA) Query Current UM Open Conditional Order *
     * Either &#x60;strategyId&#x60; or &#x60;newClientStrategyId&#x60; must be sent. * If the
     * queried order has been &#x60;CANCELED&#x60;, &#x60;TRIGGERED&#x60;或&#x60;EXPIRED&#x60;, the
     * error message \&quot;Order does not exist\&quot; will be returned. Weight: 1
     *
     * @param symbol (required)
     * @param strategyId (optional)
     * @param newClientStrategyId (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryCurrentUmOpenConditionalOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Current UM Open Conditional Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Query-Current-UM-Open-Conditional-Order">Query
     *     Current UM Open Conditional Order(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryCurrentUmOpenConditionalOrderResponse>
            queryCurrentUmOpenConditionalOrder(
                    String symbol, Long strategyId, String newClientStrategyId, Long recvWindow)
                    throws ApiException {
        return tradeApi.queryCurrentUmOpenConditionalOrder(
                symbol, strategyId, newClientStrategyId, recvWindow);
    }

    /**
     * Query Current UM Open Order(USER_DATA) Query current UM open order * Either
     * &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent. * If the queried order has
     * been filled or cancelled, the error message \&quot;Order does not exist\&quot; will be
     * returned. Weight: 1
     *
     * @param symbol (required)
     * @param orderId (optional)
     * @param origClientOrderId (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryCurrentUmOpenOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Current UM Open Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Query-Current-UM-Open-Order">Query
     *     Current UM Open Order(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryCurrentUmOpenOrderResponse> queryCurrentUmOpenOrder(
            String symbol, Long orderId, String origClientOrderId, Long recvWindow)
            throws ApiException {
        return tradeApi.queryCurrentUmOpenOrder(symbol, orderId, origClientOrderId, recvWindow);
    }

    /**
     * Query Margin Account Order (USER_DATA) Query Margin Account Order Weight: 10
     *
     * @param symbol (required)
     * @param orderId (optional)
     * @param origClientOrderId (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryMarginAccountOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Margin Account Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Query-Margin-Account-Order">Query
     *     Margin Account Order (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryMarginAccountOrderResponse> queryMarginAccountOrder(
            String symbol, Long orderId, String origClientOrderId, Long recvWindow)
            throws ApiException {
        return tradeApi.queryMarginAccountOrder(symbol, orderId, origClientOrderId, recvWindow);
    }

    /**
     * Query Margin Account&#39;s all OCO (USER_DATA) Query all OCO for a specific margin account
     * based on provided optional parameters Weight: 100
     *
     * @param fromId Trade id to fetch from. Default gets most recent trades. (optional)
     * @param startTime Timestamp in ms to get funding from INCLUSIVE. (optional)
     * @param endTime Timestamp in ms to get funding until INCLUSIVE. (optional)
     * @param limit Default 100; max 1000 (optional)
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
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Query-Margin-Account-all-OCO">Query
     *     Margin Account&#39;s all OCO (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryMarginAccountsAllOcoResponse> queryMarginAccountsAllOco(
            Long fromId, Long startTime, Long endTime, Long limit, Long recvWindow)
            throws ApiException {
        return tradeApi.queryMarginAccountsAllOco(fromId, startTime, endTime, limit, recvWindow);
    }

    /**
     * Query Margin Account&#39;s OCO (USER_DATA) Retrieves a specific OCO based on provided
     * optional parameters Weight: 5
     *
     * @param orderListId Either &#x60;orderListId&#x60; or &#x60;listClientOrderId&#x60; must be
     *     provided (optional)
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
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Query-Margin-Account-OCO">Query
     *     Margin Account&#39;s OCO (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryMarginAccountsOcoResponse> queryMarginAccountsOco(
            Long orderListId, String origClientOrderId, Long recvWindow) throws ApiException {
        return tradeApi.queryMarginAccountsOco(orderListId, origClientOrderId, recvWindow);
    }

    /**
     * Query Margin Account&#39;s Open OCO (USER_DATA) Query Margin Account&#39;s Open OCO Weight: 5
     *
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
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Query-Margin-Account-Open-OCO">Query
     *     Margin Account&#39;s Open OCO (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryMarginAccountsOpenOcoResponse> queryMarginAccountsOpenOco(
            Long recvWindow) throws ApiException {
        return tradeApi.queryMarginAccountsOpenOco(recvWindow);
    }

    /**
     * Query UM Conditional Order History(USER_DATA) Query UM Conditional Order History * Either
     * &#x60;strategyId&#x60; or &#x60;newClientStrategyId&#x60; must be sent. * &#x60;NEW&#x60;
     * orders will not be found. * These orders will not be found: * order status is
     * &#x60;CANCELED&#x60; or &#x60;EXPIRED&#x60;, **AND** * order has NO filled trade, **AND** *
     * created time + 7 days &lt; current time Weight: 1
     *
     * @param symbol (required)
     * @param strategyId (optional)
     * @param newClientStrategyId (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryUmConditionalOrderHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> UM Conditional Order History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Query-UM-Conditional-Order-History">Query
     *     UM Conditional Order History(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryUmConditionalOrderHistoryResponse> queryUmConditionalOrderHistory(
            String symbol, Long strategyId, String newClientStrategyId, Long recvWindow)
            throws ApiException {
        return tradeApi.queryUmConditionalOrderHistory(
                symbol, strategyId, newClientStrategyId, recvWindow);
    }

    /**
     * Query UM Modify Order History(TRADE) Get order modification history * Either
     * &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent, and the
     * &#x60;orderId&#x60; will prevail if both are sent. Weight: 1
     *
     * @param symbol (required)
     * @param orderId (optional)
     * @param origClientOrderId (optional)
     * @param startTime Timestamp in ms to get funding from INCLUSIVE. (optional)
     * @param endTime Timestamp in ms to get funding until INCLUSIVE. (optional)
     * @param limit Default 100; max 1000 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryUmModifyOrderHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> UM Modify Order History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Query-UM-Modify-Order-History">Query
     *     UM Modify Order History(TRADE) Documentation</a>
     */
    public ApiResponse<QueryUmModifyOrderHistoryResponse> queryUmModifyOrderHistory(
            String symbol,
            Long orderId,
            String origClientOrderId,
            Long startTime,
            Long endTime,
            Long limit,
            Long recvWindow)
            throws ApiException {
        return tradeApi.queryUmModifyOrderHistory(
                symbol, orderId, origClientOrderId, startTime, endTime, limit, recvWindow);
    }

    /**
     * Query UM Order (USER_DATA) Check an UM order&#39;s status. * These orders will not be found:
     * * Either &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent. * order status is
     * &#x60;CANCELED&#x60; or &#x60;EXPIRED&#x60;, **AND** * order has NO filled trade, **AND** *
     * created time + 3 days &lt; current time Weight: 1
     *
     * @param symbol (required)
     * @param orderId (optional)
     * @param origClientOrderId (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryUmOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> UM Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Query-UM-Order">Query
     *     UM Order (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryUmOrderResponse> queryUmOrder(
            String symbol, Long orderId, String origClientOrderId, Long recvWindow)
            throws ApiException {
        return tradeApi.queryUmOrder(symbol, orderId, origClientOrderId, recvWindow);
    }

    /**
     * Query User&#39;s CM Force Orders(USER_DATA) Query User&#39;s CM Force Orders * If
     * \&quot;autoCloseType\&quot; is not sent, orders with both of the types will be returned * If
     * \&quot;startTime\&quot; is not sent, data within 7 days before \&quot;endTime\&quot; can be
     * queried Weight: 20 with symbol, 50 without symbol
     *
     * @param symbol (optional)
     * @param autoCloseType &#x60;LIQUIDATION&#x60; for liquidation orders, &#x60;ADL&#x60; for ADL
     *     orders. (optional)
     * @param startTime Timestamp in ms to get funding from INCLUSIVE. (optional)
     * @param endTime Timestamp in ms to get funding until INCLUSIVE. (optional)
     * @param limit Default 100; max 1000 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryUsersCmForceOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User&#39;s CM Force Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Query-Users-CM-Force-Orders">Query
     *     User&#39;s CM Force Orders(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryUsersCmForceOrdersResponse> queryUsersCmForceOrders(
            String symbol,
            AutoCloseType autoCloseType,
            Long startTime,
            Long endTime,
            Long limit,
            Long recvWindow)
            throws ApiException {
        return tradeApi.queryUsersCmForceOrders(
                symbol, autoCloseType, startTime, endTime, limit, recvWindow);
    }

    /**
     * Query User&#39;s Margin Force Orders(USER_DATA) Query user&#39;s margin force orders Weight:
     * 1
     *
     * @param startTime Timestamp in ms to get funding from INCLUSIVE. (optional)
     * @param endTime Timestamp in ms to get funding until INCLUSIVE. (optional)
     * @param current Currently querying page. Start from 1. Default:1 (optional)
     * @param size Default:10 Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryUsersMarginForceOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User&#39;s Margin Force Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Query-Users-Margin-Force-Orders">Query
     *     User&#39;s Margin Force Orders(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryUsersMarginForceOrdersResponse> queryUsersMarginForceOrders(
            Long startTime, Long endTime, Long current, Long size, Long recvWindow)
            throws ApiException {
        return tradeApi.queryUsersMarginForceOrders(startTime, endTime, current, size, recvWindow);
    }

    /**
     * Query User&#39;s UM Force Orders (USER_DATA) Query User&#39;s UM Force Orders * If
     * &#x60;autoCloseType&#x60; is not sent, orders with both of the types will be returned * If
     * &#x60;startTime&#x60; is not sent, data within 7 days before &#x60;endTime&#x60; can be
     * queried Weight: 20 with symbol, 50 without symbol
     *
     * @param symbol (optional)
     * @param autoCloseType &#x60;LIQUIDATION&#x60; for liquidation orders, &#x60;ADL&#x60; for ADL
     *     orders. (optional)
     * @param startTime Timestamp in ms to get funding from INCLUSIVE. (optional)
     * @param endTime Timestamp in ms to get funding until INCLUSIVE. (optional)
     * @param limit Default 100; max 1000 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryUsersUmForceOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User&#39;s UM Force Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Query-Users-UM-Force-Orders">Query
     *     User&#39;s UM Force Orders (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryUsersUmForceOrdersResponse> queryUsersUmForceOrders(
            String symbol,
            AutoCloseType autoCloseType,
            Long startTime,
            Long endTime,
            Long limit,
            Long recvWindow)
            throws ApiException {
        return tradeApi.queryUsersUmForceOrders(
                symbol, autoCloseType, startTime, endTime, limit, recvWindow);
    }

    /**
     * Toggle BNB Burn On UM Futures Trade (TRADE) Change user&#39;s BNB Fee Discount for UM Futures
     * (Fee Discount On or Fee Discount Off ) on ***EVERY symbol*** * The BNB would not be collected
     * from UM-PM account to the Portfolio Margin account. Weight: 1
     *
     * @param toggleBnbBurnOnUmFuturesTradeRequest (required)
     * @return ApiResponse&lt;ToggleBnbBurnOnUmFuturesTradeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Toggle BNB Burn On UM Futures Trade </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/Toggle-BNB-Burn-On-UM-Futures-Trade">Toggle
     *     BNB Burn On UM Futures Trade (TRADE) Documentation</a>
     */
    public ApiResponse<ToggleBnbBurnOnUmFuturesTradeResponse> toggleBnbBurnOnUmFuturesTrade(
            ToggleBnbBurnOnUmFuturesTradeRequest toggleBnbBurnOnUmFuturesTradeRequest)
            throws ApiException {
        return tradeApi.toggleBnbBurnOnUmFuturesTrade(toggleBnbBurnOnUmFuturesTradeRequest);
    }

    /**
     * UM Account Trade List(USER_DATA) Get trades for a specific account and UM symbol. * If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last &#39;7
     * days&#39; data will be returned. * The time between &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; cannot be longer than 7 days. * The parameter &#x60;fromId&#x60; cannot
     * be sent with &#x60;startTime&#x60; or &#x60;endTime&#x60;. Weight: 5
     *
     * @param symbol (required)
     * @param startTime Timestamp in ms to get funding from INCLUSIVE. (optional)
     * @param endTime Timestamp in ms to get funding until INCLUSIVE. (optional)
     * @param fromId Trade id to fetch from. Default gets most recent trades. (optional)
     * @param limit Default 100; max 1000 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;UmAccountTradeListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> UM Account Trade List </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/UM-Account-Trade-List">UM
     *     Account Trade List(USER_DATA) Documentation</a>
     */
    public ApiResponse<UmAccountTradeListResponse> umAccountTradeList(
            String symbol, Long startTime, Long endTime, Long fromId, Long limit, Long recvWindow)
            throws ApiException {
        return tradeApi.umAccountTradeList(symbol, startTime, endTime, fromId, limit, recvWindow);
    }

    /**
     * UM Position ADL Quantile Estimation(USER_DATA) Query UM Position ADL Quantile Estimation *
     * Values update every 30s. * Values 0, 1, 2, 3, 4 shows the queue position and possibility of
     * ADL from low to high. * For positions of the symbol are in One-way Mode or isolated margined
     * in Hedge Mode, \&quot;LONG\&quot;, \&quot;SHORT\&quot;, and \&quot;BOTH\&quot; will be
     * returned to show the positions&#39; adl quantiles of different position sides. * If the
     * positions of the symbol are crossed margined in Hedge Mode: * \&quot;HEDGE\&quot; as a sign
     * will be returned instead of \&quot;BOTH\&quot;; * A same value caculated on unrealized pnls
     * on long and short sides&#39; positions will be shown for \&quot;LONG\&quot; and
     * \&quot;SHORT\&quot; when there are positions in both of long and short sides. Weight: 5
     *
     * @param symbol (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;UmPositionAdlQuantileEstimationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> UM Position ADL Quantile Estimation </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/trade/UM-Position-ADL-Quantile-Estimation">UM
     *     Position ADL Quantile Estimation(USER_DATA) Documentation</a>
     */
    public ApiResponse<UmPositionAdlQuantileEstimationResponse> umPositionAdlQuantileEstimation(
            String symbol, Long recvWindow) throws ApiException {
        return tradeApi.umPositionAdlQuantileEstimation(symbol, recvWindow);
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
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/user-data-streams/Close-User-Data-Stream">Close
     *     User Data Stream(USER_STREAM) Documentation</a>
     */
    public void closeUserDataStream() throws ApiException {
        userDataStreamsApi.closeUserDataStream();
    }

    /**
     * Keepalive User Data Stream (USER_STREAM) Keepalive a user data stream to prevent a time out.
     * User data streams will close after 60 minutes. It&#39;s recommended to send a ping about
     * every 60 minutes. Weight: 1
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
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/user-data-streams/Keepalive-User-Data-Stream">Keepalive
     *     User Data Stream (USER_STREAM) Documentation</a>
     */
    public void keepaliveUserDataStream() throws ApiException {
        userDataStreamsApi.keepaliveUserDataStream();
    }

    /**
     * Start User Data Stream(USER_STREAM) Start a new user data stream. The stream will close after
     * 60 minutes unless a keepalive is sent. If the account has an active &#x60;listenKey&#x60;,
     * that &#x60;listenKey&#x60; will be returned and its validity will be extended for 60 minutes.
     * Weight: 1
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
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin/user-data-streams/Start-User-Data-Stream">Start
     *     User Data Stream(USER_STREAM) Documentation</a>
     */
    public ApiResponse<StartUserDataStreamResponse> startUserDataStream() throws ApiException {
        return userDataStreamsApi.startUserDataStream();
    }
}
