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
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.DeleteMarginCallLevelResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.FundAutoCollectionRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.FundAutoCollectionResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.FundCollectionByAssetRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.FundCollectionByAssetResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.GetAutoRepayFuturesStatusResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.GetDeltaModeStatusResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.GetMarginCallLevelResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.GetPortfolioMarginAssetLeverageResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.GetPortfolioMarginProAccountBalanceResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.GetPortfolioMarginProAccountInfoResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.GetPortfolioMarginProSpanAccountInfoResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.GetTransferableEarnAssetBalanceForPortfolioMarginResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.PortfolioMarginCollateralRateResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.PortfolioMarginProBankruptcyLoanRepayRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.PortfolioMarginProBankruptcyLoanRepayResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.PortfolioMarginProTieredCollateralRateResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.QueryPortfolioMarginAssetIndexPriceResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.QueryPortfolioMarginProBankruptcyLoanAmountResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.QueryPortfolioMarginProBankruptcyLoanRepayHistoryResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.QueryPortfolioMarginProNegativeBalanceInterestHistoryResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.RepayFuturesNegativeBalanceRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.RepayFuturesNegativeBalanceResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.SetMarginCallLevelRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.SetMarginCallLevelResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.SwitchDeltaModeRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.SwitchDeltaModeResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.TransferLdusdtRwusdForPortfolioMarginRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.TransferLdusdtRwusdForPortfolioMarginResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.TransferType;

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
     * BNB transfer (USER_DATA) BNB transfer can be between Margin Account and USDM Account
     * Weight(IP): 1500 Security Type: USER_DATA Notes: - You can only use this function 2 times per
     * 10 minutes in a rolling manner
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
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-derivatives-trading-portfolio-margin-pro/api/rest-api/account#bnb-transfer">BNB
     *     transfer (USER_DATA) Documentation</a>
     */
    public ApiResponse<BnbTransferResponse> bnbTransfer(BnbTransferRequest bnbTransferRequest)
            throws ApiException {
        return accountApi.bnbTransfer(bnbTransferRequest);
    }

    /**
     * Change Auto-repay-futures Status (TRADE) Change Auto-repay-futures Status Weight(IP): 1500
     * Security Type: TRADE
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
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-derivatives-trading-portfolio-margin-pro/api/rest-api/account#change-auto-repay-futures-status">Change
     *     Auto-repay-futures Status (TRADE) Documentation</a>
     */
    public ApiResponse<ChangeAutoRepayFuturesStatusResponse> changeAutoRepayFuturesStatus(
            ChangeAutoRepayFuturesStatusRequest changeAutoRepayFuturesStatusRequest)
            throws ApiException {
        return accountApi.changeAutoRepayFuturesStatus(changeAutoRepayFuturesStatusRequest);
    }

    /**
     * Delete Margin Call Level (USER_DATA) Delete the margin call level for a Portfolio Margin
     * account. Weight(IP): 1500 Security Type: USER_DATA
     *
     * @param recvWindow Request validity window in milliseconds (optional)
     * @return ApiResponse&lt;DeleteMarginCallLevelResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Delete Margin Call Level </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-derivatives-trading-portfolio-margin-pro/api/rest-api/account#delete-margin-call-level">Delete
     *     Margin Call Level (USER_DATA) Documentation</a>
     */
    public ApiResponse<DeleteMarginCallLevelResponse> deleteMarginCallLevel(Long recvWindow)
            throws ApiException {
        return accountApi.deleteMarginCallLevel(recvWindow);
    }

    /**
     * Fund Auto-collection (USER_DATA) Transfers all assets from Futures Account to Margin account
     * Weight(IP): 1500 Security Type: USER_DATA Notes: - The BNB would not be collected from UM-PM
     * account to the Portfolio Margin account. - You can only use this function 500 times per hour
     * in a rolling manner.
     *
     * @param fundAutoCollectionRequest (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-derivatives-trading-portfolio-margin-pro/api/rest-api/account#fund-auto-collection">Fund
     *     Auto-collection (USER_DATA) Documentation</a>
     */
    public ApiResponse<FundAutoCollectionResponse> fundAutoCollection(
            FundAutoCollectionRequest fundAutoCollectionRequest) throws ApiException {
        return accountApi.fundAutoCollection(fundAutoCollectionRequest);
    }

    /**
     * Fund Collection by Asset (USER_DATA) Transfers specific asset from Futures Account to Margin
     * account Weight(IP): 60 Security Type: USER_DATA Notes: - The BNB transfer is not be supported
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
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-derivatives-trading-portfolio-margin-pro/api/rest-api/account#fund-collection-by-asset">Fund
     *     Collection by Asset (USER_DATA) Documentation</a>
     */
    public ApiResponse<FundCollectionByAssetResponse> fundCollectionByAsset(
            FundCollectionByAssetRequest fundCollectionByAssetRequest) throws ApiException {
        return accountApi.fundCollectionByAsset(fundCollectionByAssetRequest);
    }

    /**
     * Get Auto-repay-futures Status (USER_DATA) Query Auto-repay-futures Status Weight(IP): 30
     * Security Type: USER_DATA
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
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-derivatives-trading-portfolio-margin-pro/api/rest-api/account#get-auto-repay-futures-status">Get
     *     Auto-repay-futures Status (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetAutoRepayFuturesStatusResponse> getAutoRepayFuturesStatus(Long recvWindow)
            throws ApiException {
        return accountApi.getAutoRepayFuturesStatus(recvWindow);
    }

    /**
     * Get Delta Mode Status (USER_DATA) Query the Delta mode status of current account. Weight(IP):
     * 1500 Security Type: USER_DATA
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetDeltaModeStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Delta Mode Status </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-derivatives-trading-portfolio-margin-pro/api/rest-api/account#get-delta-mode-status">Get
     *     Delta Mode Status (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetDeltaModeStatusResponse> getDeltaModeStatus(Long recvWindow)
            throws ApiException {
        return accountApi.getDeltaModeStatus(recvWindow);
    }

    /**
     * Get Margin Call Level (USER_DATA) Get the margin call level for a Portfolio Margin account.
     * Weight(IP): 1500 Security Type: USER_DATA
     *
     * @param recvWindow Request validity window in milliseconds (optional)
     * @return ApiResponse&lt;GetMarginCallLevelResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Margin Call Level </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-derivatives-trading-portfolio-margin-pro/api/rest-api/account#get-margin-call-level">Get
     *     Margin Call Level (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetMarginCallLevelResponse> getMarginCallLevel(Long recvWindow)
            throws ApiException {
        return accountApi.getMarginCallLevel(recvWindow);
    }

    /**
     * Get Portfolio Margin Pro Account Balance (USER_DATA) Query Portfolio Margin Pro account
     * balance Weight(IP): 20 Security Type: USER_DATA
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
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-derivatives-trading-portfolio-margin-pro/api/rest-api/account#get-portfolio-margin-pro-account-balance">Get
     *     Portfolio Margin Pro Account Balance (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetPortfolioMarginProAccountBalanceResponse>
            getPortfolioMarginProAccountBalance(String asset, Long recvWindow) throws ApiException {
        return accountApi.getPortfolioMarginProAccountBalance(asset, recvWindow);
    }

    /**
     * Get Portfolio Margin Pro Account Info (USER_DATA) Get Portfolio Margin Pro Account Info
     * Weight(UID): 5 Security Type: USER_DATA
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
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-derivatives-trading-portfolio-margin-pro/api/rest-api/account#get-portfolio-margin-pro-account-info">Get
     *     Portfolio Margin Pro Account Info (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetPortfolioMarginProAccountInfoResponse> getPortfolioMarginProAccountInfo(
            Long recvWindow) throws ApiException {
        return accountApi.getPortfolioMarginProAccountInfo(recvWindow);
    }

    /**
     * Get Portfolio Margin Pro SPAN Account Info (USER_DATA) Get Portfolio Margin Pro SPAN Account
     * Info (For Portfolio Margin Pro SPAN users only) Weight(IP): 5 Security Type: USER_DATA
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
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-derivatives-trading-portfolio-margin-pro/api/rest-api/account#get-portfolio-margin-pro-span-account-info">Get
     *     Portfolio Margin Pro SPAN Account Info (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetPortfolioMarginProSpanAccountInfoResponse>
            getPortfolioMarginProSpanAccountInfo(Long recvWindow) throws ApiException {
        return accountApi.getPortfolioMarginProSpanAccountInfo(recvWindow);
    }

    /**
     * Get Transferable Earn Asset Balance for Portfolio Margin (USER_DATA) Get transferable earn
     * asset balance for all types of Portfolio Margin account Weight(IP): 1500 Security Type:
     * USER_DATA
     *
     * @param asset &#x60;LDUSDT&#x60; only (required)
     * @param transferType (required)
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
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-derivatives-trading-portfolio-margin-pro/api/rest-api/account#get-transferable-earn-asset-balance-for-portfolio-margin">Get
     *     Transferable Earn Asset Balance for Portfolio Margin (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetTransferableEarnAssetBalanceForPortfolioMarginResponse>
            getTransferableEarnAssetBalanceForPortfolioMargin(
                    String asset, TransferType transferType, Long recvWindow) throws ApiException {
        return accountApi.getTransferableEarnAssetBalanceForPortfolioMargin(
                asset, transferType, recvWindow);
    }

    /**
     * Portfolio Margin Pro Bankruptcy Loan Repay (TRADE) Repay Portfolio Margin Pro Bankruptcy Loan
     * Weight(UID): 3000 Security Type: TRADE Notes: - Please note that the API Key has enabled Spot
     * &amp; Margin Trading permissions to access this endpoint.
     *
     * @param portfolioMarginProBankruptcyLoanRepayRequest (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-derivatives-trading-portfolio-margin-pro/api/rest-api/account#portfolio-margin-pro-bankruptcy-loan-repay">Portfolio
     *     Margin Pro Bankruptcy Loan Repay (TRADE) Documentation</a>
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
     * Query Portfolio Margin Pro Bankruptcy Loan Amount (USER_DATA) Query Portfolio Margin Pro
     * Bankruptcy Loan Amount Weight(UID): 500 Security Type: USER_DATA Notes: - If there’s no
     * classic portfolio margin bankruptcy loan, the amount would be 0
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
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-derivatives-trading-portfolio-margin-pro/api/rest-api/account#query-portfolio-margin-pro-bankruptcy-loan-amount">Query
     *     Portfolio Margin Pro Bankruptcy Loan Amount (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryPortfolioMarginProBankruptcyLoanAmountResponse>
            queryPortfolioMarginProBankruptcyLoanAmount(Long recvWindow) throws ApiException {
        return accountApi.queryPortfolioMarginProBankruptcyLoanAmount(recvWindow);
    }

    /**
     * Query Portfolio Margin Pro Bankruptcy Loan Repay History (USER_DATA) Query repay history of
     * pmloan for portfolio margin pro. Weight(IP): 500 Security Type: USER_DATA Notes: -
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 360 days - If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; not sent, return records of the last 30 days by
     * default. - If &#x60;startTime&#x60;is sent and &#x60;endTime&#x60; is not sent, return
     * records of [startTime, startTime+30d]. - If &#x60;startTime&#x60; is not sent and
     * &#x60;endTime&#x60; is sent, return records of [endTime-30d, endTime].
     *
     * @param startTime Start time (optional)
     * @param endTime End time (optional)
     * @param size Number of results returned. (optional)
     * @param current Currently querying page. Start from 1. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-derivatives-trading-portfolio-margin-pro/api/rest-api/account#query-portfolio-margin-pro-bankruptcy-loan-repay-history">Query
     *     Portfolio Margin Pro Bankruptcy Loan Repay History (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryPortfolioMarginProBankruptcyLoanRepayHistoryResponse>
            queryPortfolioMarginProBankruptcyLoanRepayHistory(
                    Long startTime, Long endTime, Long size, Long current, Long recvWindow)
                    throws ApiException {
        return accountApi.queryPortfolioMarginProBankruptcyLoanRepayHistory(
                startTime, endTime, size, current, recvWindow);
    }

    /**
     * Query Portfolio Margin Pro Negative Balance Interest History (USER_DATA) Query interest
     * history of negative balance for portfolio margin. Weight(IP): 50 Security Type: USER_DATA
     *
     * @param asset (optional)
     * @param startTime Start time (optional)
     * @param endTime End time (optional)
     * @param size Number of results returned. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-derivatives-trading-portfolio-margin-pro/api/rest-api/account#query-portfolio-margin-pro-negative-balance-interest-history">Query
     *     Portfolio Margin Pro Negative Balance Interest History (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryPortfolioMarginProNegativeBalanceInterestHistoryResponse>
            queryPortfolioMarginProNegativeBalanceInterestHistory(
                    String asset, Long startTime, Long endTime, Long size, Long recvWindow)
                    throws ApiException {
        return accountApi.queryPortfolioMarginProNegativeBalanceInterestHistory(
                asset, startTime, endTime, size, recvWindow);
    }

    /**
     * Repay futures Negative Balance (USER_DATA) Repay futures Negative Balance Weight(IP): 1500
     * Security Type: USER_DATA
     *
     * @param repayFuturesNegativeBalanceRequest (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-derivatives-trading-portfolio-margin-pro/api/rest-api/account#repay-futures-negative-balance">Repay
     *     futures Negative Balance (USER_DATA) Documentation</a>
     */
    public ApiResponse<RepayFuturesNegativeBalanceResponse> repayFuturesNegativeBalance(
            RepayFuturesNegativeBalanceRequest repayFuturesNegativeBalanceRequest)
            throws ApiException {
        return accountApi.repayFuturesNegativeBalance(repayFuturesNegativeBalanceRequest);
    }

    /**
     * Set Margin Call Level (USER_DATA) Set the margin call level for a Portfolio Margin account.
     * When the account&#39;s uniMMR drops to the specified level, a notification will be sent via
     * email and SMS. Weight(IP): 1500 Security Type: USER_DATA
     *
     * @param setMarginCallLevelRequest (required)
     * @return ApiResponse&lt;SetMarginCallLevelResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Set Margin Call Level </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-derivatives-trading-portfolio-margin-pro/api/rest-api/account#set-margin-call-level">Set
     *     Margin Call Level (USER_DATA) Documentation</a>
     */
    public ApiResponse<SetMarginCallLevelResponse> setMarginCallLevel(
            SetMarginCallLevelRequest setMarginCallLevelRequest) throws ApiException {
        return accountApi.setMarginCallLevel(setMarginCallLevelRequest);
    }

    /**
     * Switch Delta Mode (TRADE) Switch the Delta mode for existing PM PRO / PM RETAIL accounts.
     * Weight(IP): 1500 Security Type: TRADE
     *
     * @param switchDeltaModeRequest (required)
     * @return ApiResponse&lt;SwitchDeltaModeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Switch Delta Mode </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-derivatives-trading-portfolio-margin-pro/api/rest-api/account#switch-delta-mode">Switch
     *     Delta Mode (TRADE) Documentation</a>
     */
    public ApiResponse<SwitchDeltaModeResponse> switchDeltaMode(
            SwitchDeltaModeRequest switchDeltaModeRequest) throws ApiException {
        return accountApi.switchDeltaMode(switchDeltaModeRequest);
    }

    /**
     * Transfer LDUSDT/RWUSD for Portfolio Margin (TRADE) Transfer LDUSDT/RWUSD as collateral for
     * all types of Portfolio Margin account Weight(UID): 1500 Security Type: TRADE
     *
     * @param transferLdusdtRwusdForPortfolioMarginRequest (required)
     * @return ApiResponse&lt;TransferLdusdtRwusdForPortfolioMarginResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Transfer LDUSDT/RWUSD for Portfolio Margin </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-derivatives-trading-portfolio-margin-pro/api/rest-api/account#transfer-ldusdt-rwusd-for-portfolio-margin">Transfer
     *     LDUSDT/RWUSD for Portfolio Margin (TRADE) Documentation</a>
     */
    public ApiResponse<TransferLdusdtRwusdForPortfolioMarginResponse>
            transferLdusdtRwusdForPortfolioMargin(
                    TransferLdusdtRwusdForPortfolioMarginRequest
                            transferLdusdtRwusdForPortfolioMarginRequest)
                    throws ApiException {
        return accountApi.transferLdusdtRwusdForPortfolioMargin(
                transferLdusdtRwusdForPortfolioMarginRequest);
    }

    /**
     * Get Portfolio Margin Asset Leverage (USER_DATA) Get Portfolio Margin Asset Leverage
     * Weight(IP): 50 Security Type: USER_DATA
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
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-derivatives-trading-portfolio-margin-pro/api/rest-api/market-data#get-portfolio-margin-asset-leverage">Get
     *     Portfolio Margin Asset Leverage (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetPortfolioMarginAssetLeverageResponse> getPortfolioMarginAssetLeverage()
            throws ApiException {
        return marketDataApi.getPortfolioMarginAssetLeverage();
    }

    /**
     * Portfolio Margin Collateral Rate (MARKET_DATA) Portfolio Margin Collateral Rate Weight(IP):
     * 50 Security Type: MARKET_DATA
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
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-derivatives-trading-portfolio-margin-pro/api/rest-api/market-data#portfolio-margin-collateral-rate">Portfolio
     *     Margin Collateral Rate (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<PortfolioMarginCollateralRateResponse> portfolioMarginCollateralRate()
            throws ApiException {
        return marketDataApi.portfolioMarginCollateralRate();
    }

    /**
     * Portfolio Margin Pro Tiered Collateral Rate (USER_DATA) Portfolio Margin PRO Tiered
     * Collateral Rate Weight(IP): 50 Security Type: USER_DATA
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
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-derivatives-trading-portfolio-margin-pro/api/rest-api/market-data#portfolio-margin-pro-tiered-collateral-rate">Portfolio
     *     Margin Pro Tiered Collateral Rate (USER_DATA) Documentation</a>
     */
    public ApiResponse<PortfolioMarginProTieredCollateralRateResponse>
            portfolioMarginProTieredCollateralRate(Long recvWindow) throws ApiException {
        return marketDataApi.portfolioMarginProTieredCollateralRate(recvWindow);
    }

    /**
     * Query Portfolio Margin Asset Index Price (MARKET_DATA) Query Portfolio Margin Asset Index
     * Price Weight: - 1 if &#x60;asset&#x60; is sent - 50 if &#x60;asset&#x60; is not sent Security
     * Type: MARKET_DATA
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
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-derivatives-trading-portfolio-margin-pro/api/rest-api/market-data#query-portfolio-margin-asset-index-price">Query
     *     Portfolio Margin Asset Index Price (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<QueryPortfolioMarginAssetIndexPriceResponse>
            queryPortfolioMarginAssetIndexPrice(String asset) throws ApiException {
        return marketDataApi.queryPortfolioMarginAssetIndexPrice(asset);
    }
}
