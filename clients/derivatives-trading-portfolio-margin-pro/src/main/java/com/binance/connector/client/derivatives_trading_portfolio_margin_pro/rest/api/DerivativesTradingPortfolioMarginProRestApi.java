package com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.DerivativesTradingPortfolioMarginProRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.BnbTransferRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.BnbTransferResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.ChangeAutoRepayFuturesStatusRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.ChangeAutoRepayFuturesStatusResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.FundAutoCollectionRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.FundAutoCollectionResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.FundCollectionByAssetRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.FundCollectionByAssetResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.GetAutoRepayFuturesStatusResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.GetPortfolioMarginAssetLeverageResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.GetPortfolioMarginProAccountBalanceResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.GetPortfolioMarginProAccountInfoResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.GetPortfolioMarginProSpanAccountInfoResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.GetTransferableEarnAssetBalanceForPortfolioMarginResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.MintBfusdForPortfolioMarginRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.MintBfusdForPortfolioMarginResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.PortfolioMarginCollateralRateResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.PortfolioMarginProBankruptcyLoanRepayRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.PortfolioMarginProBankruptcyLoanRepayResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.PortfolioMarginProTieredCollateralRateResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.QueryPortfolioMarginAssetIndexPriceResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.QueryPortfolioMarginProBankruptcyLoanAmountResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.QueryPortfolioMarginProBankruptcyLoanRepayHistoryResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.QueryPortfolioMarginProNegativeBalanceInterestHistoryResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.RedeemBfusdForPortfolioMarginRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.RedeemBfusdForPortfolioMarginResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.RepayFuturesNegativeBalanceRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.RepayFuturesNegativeBalanceResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.TransferLdusdtForPortfolioMarginRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.TransferLdusdtForPortfolioMarginResponse;

public class DerivativesTradingPortfolioMarginProRestApi {

    private final AccountApi accountApi;
    private final MarketDataApi marketDataApi;

    public DerivativesTradingPortfolioMarginProRestApi(ClientConfiguration configuration) {
        this(DerivativesTradingPortfolioMarginProRestApiUtil.getDefaultClient(configuration));
    }

    public DerivativesTradingPortfolioMarginProRestApi(ApiClient apiClient) {
        this.accountApi = new AccountApi(apiClient);
        this.marketDataApi = new MarketDataApi(apiClient);
    }

    /**
     * BNB transfer(USER_DATA) BNB transfer can be between Margin Account and USDM Account * You can
     * only use this function 2 times per 10 minutes in a rolling manner Weight: 1500
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
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin-pro/account/BNB-transfer">BNB
     *     transfer(USER_DATA) Documentation</a>
     */
    public ApiResponse<BnbTransferResponse> bnbTransfer(BnbTransferRequest bnbTransferRequest)
            throws ApiException {
        return accountApi.bnbTransfer(bnbTransferRequest);
    }

    /**
     * Change Auto-repay-futures Status(TRADE) Change Auto-repay-futures Status Weight: 1500
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
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin-pro/account/Change-Auto-repay-futures-Status">Change
     *     Auto-repay-futures Status(TRADE) Documentation</a>
     */
    public ApiResponse<ChangeAutoRepayFuturesStatusResponse> changeAutoRepayFuturesStatus(
            ChangeAutoRepayFuturesStatusRequest changeAutoRepayFuturesStatusRequest)
            throws ApiException {
        return accountApi.changeAutoRepayFuturesStatus(changeAutoRepayFuturesStatusRequest);
    }

    /**
     * Fund Auto-collection(USER_DATA) Transfers all assets from Futures Account to Margin account *
     * The BNB would not be collected from UM-PM account to the Portfolio Margin account. * You can
     * only use this function 500 times per hour in a rolling manner. Weight: 1500
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
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin-pro/account/Fund-Auto-collection">Fund
     *     Auto-collection(USER_DATA) Documentation</a>
     */
    public ApiResponse<FundAutoCollectionResponse> fundAutoCollection(
            FundAutoCollectionRequest fundAutoCollectionRequest) throws ApiException {
        return accountApi.fundAutoCollection(fundAutoCollectionRequest);
    }

    /**
     * Fund Collection by Asset(USER_DATA) Transfers specific asset from Futures Account to Margin
     * account * The BNB transfer is not be supported Weight: 60
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
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin-pro/account/Fund-Collection-by-Asset">Fund
     *     Collection by Asset(USER_DATA) Documentation</a>
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
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin-pro/account/Get-Auto-repay-futures-Status">Get
     *     Auto-repay-futures Status(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetAutoRepayFuturesStatusResponse> getAutoRepayFuturesStatus(Long recvWindow)
            throws ApiException {
        return accountApi.getAutoRepayFuturesStatus(recvWindow);
    }

    /**
     * Get Portfolio Margin Pro Account Balance(USER_DATA) Query Portfolio Margin Pro account
     * balance Weight: 20
     *
     * @param asset (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetPortfolioMarginProAccountBalanceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Portfolio Margin Pro Account Balance </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin-pro/account/Get-Classic-Portfolio-Margin-Balance-Info">Get
     *     Portfolio Margin Pro Account Balance(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetPortfolioMarginProAccountBalanceResponse>
            getPortfolioMarginProAccountBalance(String asset, Long recvWindow) throws ApiException {
        return accountApi.getPortfolioMarginProAccountBalance(asset, recvWindow);
    }

    /**
     * Get Portfolio Margin Pro Account Info(USER_DATA) Get Portfolio Margin Pro Account Info
     * Weight: 5
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetPortfolioMarginProAccountInfoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Portfolio Margin Pro Account Info </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin-pro/account/Get-Classic-Portfolio-Margin-Account-Info">Get
     *     Portfolio Margin Pro Account Info(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetPortfolioMarginProAccountInfoResponse> getPortfolioMarginProAccountInfo(
            Long recvWindow) throws ApiException {
        return accountApi.getPortfolioMarginProAccountInfo(recvWindow);
    }

    /**
     * Get Portfolio Margin Pro SPAN Account Info(USER_DATA) Get Portfolio Margin Pro SPAN Account
     * Info (For Portfolio Margin Pro SPAN users only) Weight: 5
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetPortfolioMarginProSpanAccountInfoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Portfolio Margin Pro SPAN Account Info </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin-pro/account/Get-Classic-Portfolio-Margin-Account-Info-V2">Get
     *     Portfolio Margin Pro SPAN Account Info(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetPortfolioMarginProSpanAccountInfoResponse>
            getPortfolioMarginProSpanAccountInfo(Long recvWindow) throws ApiException {
        return accountApi.getPortfolioMarginProSpanAccountInfo(recvWindow);
    }

    /**
     * Get Transferable Earn Asset Balance for Portfolio Margin (USER_DATA) Get transferable earn
     * asset balance for all types of Portfolio Margin account Weight: 1500
     *
     * @param asset &#x60;LDUSDT&#x60; only (required)
     * @param transferType &#x60;EARN_TO_FUTURE&#x60; /&#x60;FUTURE_TO_EARN&#x60; (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetTransferableEarnAssetBalanceForPortfolioMarginResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Transferable Earn Asset Balance for Portfolio Margin </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin-pro/account/Get-Transferable-Earn-Asset-Balance-for-Portfolio-Margin">Get
     *     Transferable Earn Asset Balance for Portfolio Margin (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetTransferableEarnAssetBalanceForPortfolioMarginResponse>
            getTransferableEarnAssetBalanceForPortfolioMargin(
                    String asset, String transferType, Long recvWindow) throws ApiException {
        return accountApi.getTransferableEarnAssetBalanceForPortfolioMargin(
                asset, transferType, recvWindow);
    }

    /**
     * Mint BFUSD for Portfolio Margin(TRADE) Mint BFUSD for all types of Portfolio Margin account
     * Weight: 1500
     *
     * @param mintBfusdForPortfolioMarginRequest (required)
     * @return ApiResponse&lt;MintBfusdForPortfolioMarginResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Mint BFUSD for Portfolio Margin </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin-pro/account/Mint-BFUSD-Portfolio-Margin">Mint
     *     BFUSD for Portfolio Margin(TRADE) Documentation</a>
     */
    public ApiResponse<MintBfusdForPortfolioMarginResponse> mintBfusdForPortfolioMargin(
            MintBfusdForPortfolioMarginRequest mintBfusdForPortfolioMarginRequest)
            throws ApiException {
        return accountApi.mintBfusdForPortfolioMargin(mintBfusdForPortfolioMarginRequest);
    }

    /**
     * Portfolio Margin Pro Bankruptcy Loan Repay Repay Portfolio Margin Pro Bankruptcy Loan Weight:
     * 3000
     *
     * @param portfolioMarginProBankruptcyLoanRepayRequest (required)
     * @return ApiResponse&lt;PortfolioMarginProBankruptcyLoanRepayResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Portfolio Margin Pro Bankruptcy Loan Repay </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin-pro/account/Classic-Portfolio-Margin-Bankruptcy-Loan-Repay">Portfolio
     *     Margin Pro Bankruptcy Loan Repay Documentation</a>
     */
    public ApiResponse<PortfolioMarginProBankruptcyLoanRepayResponse>
            portfolioMarginProBankruptcyLoanRepay(
                    PortfolioMarginProBankruptcyLoanRepayRequest
                            portfolioMarginProBankruptcyLoanRepayRequest)
                    throws ApiException {
        return accountApi.portfolioMarginProBankruptcyLoanRepay(
                portfolioMarginProBankruptcyLoanRepayRequest);
    }

    /**
     * Query Portfolio Margin Pro Bankruptcy Loan Amount(USER_DATA) Query Portfolio Margin Pro
     * Bankruptcy Loan Amount * If there’s no classic portfolio margin bankruptcy loan, the amount
     * would be 0 Weight: 500
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryPortfolioMarginProBankruptcyLoanAmountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Portfolio Margin Pro Bankruptcy Loan Amount </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin-pro/account/Query-Classic-Portfolio-Margin-Bankruptcy-Loan-Amount">Query
     *     Portfolio Margin Pro Bankruptcy Loan Amount(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryPortfolioMarginProBankruptcyLoanAmountResponse>
            queryPortfolioMarginProBankruptcyLoanAmount(Long recvWindow) throws ApiException {
        return accountApi.queryPortfolioMarginProBankruptcyLoanAmount(recvWindow);
    }

    /**
     * Query Portfolio Margin Pro Bankruptcy Loan Repay History(USER_DATA) Query repay history of
     * pmloan for portfolio margin pro. * &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be
     * longer than 360 days * If &#x60;startTime&#x60; and &#x60;endTime&#x60; not sent, return
     * records of the last 30 days by default. * If &#x60;startTime&#x60;is sent and
     * &#x60;endTime&#x60; is not sent, return records of [startTime, startTime+30d]. * If
     * &#x60;startTime&#x60; is not sent and &#x60;endTime&#x60; is sent, return records of
     * [endTime-30d, endTime]. Weight: 500
     *
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying page. Start from 1. Default:1 (optional)
     * @param size Default:10 Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryPortfolioMarginProBankruptcyLoanRepayHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Portfolio Margin Pro Bankruptcy Loan Repay History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin-pro/account/Query-Portfolio-Margin-Pro-Bankruptcy-Loan-Repay-History">Query
     *     Portfolio Margin Pro Bankruptcy Loan Repay History(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryPortfolioMarginProBankruptcyLoanRepayHistoryResponse>
            queryPortfolioMarginProBankruptcyLoanRepayHistory(
                    Long startTime, Long endTime, Long current, Long size, Long recvWindow)
                    throws ApiException {
        return accountApi.queryPortfolioMarginProBankruptcyLoanRepayHistory(
                startTime, endTime, current, size, recvWindow);
    }

    /**
     * Query Portfolio Margin Pro Negative Balance Interest History(USER_DATA) Query interest
     * history of negative balance for portfolio margin. Weight: 50
     *
     * @param asset (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param size Default:10 Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryPortfolioMarginProNegativeBalanceInterestHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Portfolio Margin Pro Negative Balance Interest History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin-pro/account/Query-Classic-Portfolio-Margin-Negative-Balance-Interest-History">Query
     *     Portfolio Margin Pro Negative Balance Interest History(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryPortfolioMarginProNegativeBalanceInterestHistoryResponse>
            queryPortfolioMarginProNegativeBalanceInterestHistory(
                    String asset, Long startTime, Long endTime, Long size, Long recvWindow)
                    throws ApiException {
        return accountApi.queryPortfolioMarginProNegativeBalanceInterestHistory(
                asset, startTime, endTime, size, recvWindow);
    }

    /**
     * Redeem BFUSD for Portfolio Margin(TRADE) Redeem BFUSD for all types of Portfolio Margin
     * account Weight: 1500
     *
     * @param redeemBfusdForPortfolioMarginRequest (required)
     * @return ApiResponse&lt;RedeemBfusdForPortfolioMarginResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Redeem BFUSD for Portfolio Margin </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin-pro/account/Redeem-BFUSD-Portfolio-Margin">Redeem
     *     BFUSD for Portfolio Margin(TRADE) Documentation</a>
     */
    public ApiResponse<RedeemBfusdForPortfolioMarginResponse> redeemBfusdForPortfolioMargin(
            RedeemBfusdForPortfolioMarginRequest redeemBfusdForPortfolioMarginRequest)
            throws ApiException {
        return accountApi.redeemBfusdForPortfolioMargin(redeemBfusdForPortfolioMarginRequest);
    }

    /**
     * Repay futures Negative Balance(USER_DATA) Repay futures Negative Balance Weight: 1500
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
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin-pro/account/Repay-futures-Negative-Balance">Repay
     *     futures Negative Balance(USER_DATA) Documentation</a>
     */
    public ApiResponse<RepayFuturesNegativeBalanceResponse> repayFuturesNegativeBalance(
            RepayFuturesNegativeBalanceRequest repayFuturesNegativeBalanceRequest)
            throws ApiException {
        return accountApi.repayFuturesNegativeBalance(repayFuturesNegativeBalanceRequest);
    }

    /**
     * Transfer LDUSDT for Portfolio Margin(TRADE) Transfer LDUSDT as collateral for all types of
     * Portfolio Margin account Weight: 1500
     *
     * @param transferLdusdtForPortfolioMarginRequest (required)
     * @return ApiResponse&lt;TransferLdusdtForPortfolioMarginResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Transfer LDUSDT for Portfolio Margin </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin-pro/account/Transfer-LDUSDT-Portfolio-Margin">Transfer
     *     LDUSDT for Portfolio Margin(TRADE) Documentation</a>
     */
    public ApiResponse<TransferLdusdtForPortfolioMarginResponse> transferLdusdtForPortfolioMargin(
            TransferLdusdtForPortfolioMarginRequest transferLdusdtForPortfolioMarginRequest)
            throws ApiException {
        return accountApi.transferLdusdtForPortfolioMargin(transferLdusdtForPortfolioMarginRequest);
    }

    /**
     * Get Portfolio Margin Asset Leverage(USER_DATA) Get Portfolio Margin Asset Leverage Weight: 50
     *
     * @return ApiResponse&lt;GetPortfolioMarginAssetLeverageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Portfolio Margin Asset Leverage </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin-pro/market-data/Get-Portfolio-Margin-Asset-Leverage">Get
     *     Portfolio Margin Asset Leverage(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetPortfolioMarginAssetLeverageResponse> getPortfolioMarginAssetLeverage()
            throws ApiException {
        return marketDataApi.getPortfolioMarginAssetLeverage();
    }

    /**
     * Portfolio Margin Collateral Rate(MARKET_DATA) Portfolio Margin Collateral Rate Weight: 50
     *
     * @return ApiResponse&lt;PortfolioMarginCollateralRateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Portfolio Margin Collateral Rate </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin-pro/market-data/Classic-Portfolio-Margin-Collateral-Rate">Portfolio
     *     Margin Collateral Rate(MARKET_DATA) Documentation</a>
     */
    public ApiResponse<PortfolioMarginCollateralRateResponse> portfolioMarginCollateralRate()
            throws ApiException {
        return marketDataApi.portfolioMarginCollateralRate();
    }

    /**
     * Portfolio Margin Pro Tiered Collateral Rate(USER_DATA) Portfolio Margin PRO Tiered Collateral
     * Rate Weight: 50
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;PortfolioMarginProTieredCollateralRateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Portfolio Margin Pro Tiered Collateral Rate </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin-pro/market-data/Portfolio-Margin-Pro-Tiered-Collateral-Rate">Portfolio
     *     Margin Pro Tiered Collateral Rate(USER_DATA) Documentation</a>
     */
    public ApiResponse<PortfolioMarginProTieredCollateralRateResponse>
            portfolioMarginProTieredCollateralRate(Long recvWindow) throws ApiException {
        return marketDataApi.portfolioMarginProTieredCollateralRate(recvWindow);
    }

    /**
     * Query Portfolio Margin Asset Index Price (MARKET_DATA) Query Portfolio Margin Asset Index
     * Price Weight: 1 if send asset or 50 if not send asset
     *
     * @param asset (optional)
     * @return ApiResponse&lt;QueryPortfolioMarginAssetIndexPriceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Portfolio Margin Asset Index Price </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/portfolio-margin-pro/market-data/Query-Portfolio-Margin-Asset-Index-Price">Query
     *     Portfolio Margin Asset Index Price (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<QueryPortfolioMarginAssetIndexPriceResponse>
            queryPortfolioMarginAssetIndexPrice(String asset) throws ApiException {
        return marketDataApi.queryPortfolioMarginAssetIndexPrice(asset);
    }
}
