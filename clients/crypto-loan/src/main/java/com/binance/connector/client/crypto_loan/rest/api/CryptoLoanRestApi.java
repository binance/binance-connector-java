package com.binance.connector.client.crypto_loan.rest.api;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.crypto_loan.rest.CryptoLoanRestApiUtil;
import com.binance.connector.client.crypto_loan.rest.model.CheckCollateralRepayRateResponse;
import com.binance.connector.client.crypto_loan.rest.model.CheckCollateralRepayRateStableRateResponse;
import com.binance.connector.client.crypto_loan.rest.model.FlexibleLoanAdjustLtvRequest;
import com.binance.connector.client.crypto_loan.rest.model.FlexibleLoanAdjustLtvResponse;
import com.binance.connector.client.crypto_loan.rest.model.FlexibleLoanBorrowRequest;
import com.binance.connector.client.crypto_loan.rest.model.FlexibleLoanBorrowResponse;
import com.binance.connector.client.crypto_loan.rest.model.FlexibleLoanRepayRequest;
import com.binance.connector.client.crypto_loan.rest.model.FlexibleLoanRepayResponse;
import com.binance.connector.client.crypto_loan.rest.model.GetCryptoLoansIncomeHistoryResponse;
import com.binance.connector.client.crypto_loan.rest.model.GetFlexibleLoanAssetsDataResponse;
import com.binance.connector.client.crypto_loan.rest.model.GetFlexibleLoanBorrowHistoryResponse;
import com.binance.connector.client.crypto_loan.rest.model.GetFlexibleLoanCollateralAssetsDataResponse;
import com.binance.connector.client.crypto_loan.rest.model.GetFlexibleLoanLiquidationHistoryResponse;
import com.binance.connector.client.crypto_loan.rest.model.GetFlexibleLoanLtvAdjustmentHistoryResponse;
import com.binance.connector.client.crypto_loan.rest.model.GetFlexibleLoanOngoingOrdersResponse;
import com.binance.connector.client.crypto_loan.rest.model.GetFlexibleLoanRepaymentHistoryResponse;
import com.binance.connector.client.crypto_loan.rest.model.GetLoanBorrowHistoryResponse;
import com.binance.connector.client.crypto_loan.rest.model.GetLoanLtvAdjustmentHistoryResponse;
import com.binance.connector.client.crypto_loan.rest.model.GetLoanRepaymentHistoryResponse;

public class CryptoLoanRestApi {

    private final FlexibleRateApi flexibleRateApi;
    private final StableRateApi stableRateApi;

    public CryptoLoanRestApi(ClientConfiguration configuration) {
        this(CryptoLoanRestApiUtil.getDefaultClient(configuration));
    }

    public CryptoLoanRestApi(ApiClient apiClient) {
        this.flexibleRateApi = new FlexibleRateApi(apiClient);
        this.stableRateApi = new StableRateApi(apiClient);
    }

    /**
     * Check Collateral Repay Rate (USER_DATA) Weight: 6000
     *
     * @param loanCoin (required)
     * @param collateralCoin (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;CheckCollateralRepayRateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Check Collateral Repay Rate </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/crypto_loan/flexible-rate/user-information/Check-Collateral-Repay-Rate">Check
     *     Collateral Repay Rate (USER_DATA) Documentation</a>
     */
    public ApiResponse<CheckCollateralRepayRateResponse> checkCollateralRepayRate(
            String loanCoin, String collateralCoin, Long recvWindow) throws ApiException {
        return flexibleRateApi.checkCollateralRepayRate(loanCoin, collateralCoin, recvWindow);
    }

    /**
     * Flexible Loan Adjust LTV(TRADE) Flexible Loan Adjust LTV * API Key needs Spot &amp; Margin
     * Trading permission for this endpoint Weight: 6000
     *
     * @param flexibleLoanAdjustLtvRequest (required)
     * @return ApiResponse&lt;FlexibleLoanAdjustLtvResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Flexible Loan Adjust LTV </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/crypto_loan/flexible-rate/trade/Flexible-Loan-Adjust-LTV">Flexible
     *     Loan Adjust LTV(TRADE) Documentation</a>
     */
    public ApiResponse<FlexibleLoanAdjustLtvResponse> flexibleLoanAdjustLtv(
            FlexibleLoanAdjustLtvRequest flexibleLoanAdjustLtvRequest) throws ApiException {
        return flexibleRateApi.flexibleLoanAdjustLtv(flexibleLoanAdjustLtvRequest);
    }

    /**
     * Flexible Loan Borrow(TRADE) Borrow Flexible Loan * Only available for master account * You
     * can customize LTV by entering loanAmount and collateralAmount. Weight: 6000
     *
     * @param flexibleLoanBorrowRequest (required)
     * @return ApiResponse&lt;FlexibleLoanBorrowResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Flexible Loan Borrow </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/crypto_loan/flexible-rate/trade/Flexible-Loan-Borrow">Flexible
     *     Loan Borrow(TRADE) Documentation</a>
     */
    public ApiResponse<FlexibleLoanBorrowResponse> flexibleLoanBorrow(
            FlexibleLoanBorrowRequest flexibleLoanBorrowRequest) throws ApiException {
        return flexibleRateApi.flexibleLoanBorrow(flexibleLoanBorrowRequest);
    }

    /**
     * Flexible Loan Repay(TRADE) Flexible Loan Repay * repayAmount is mandatory even fullRepayment
     * &#x3D; FALSE Weight: 6000
     *
     * @param flexibleLoanRepayRequest (required)
     * @return ApiResponse&lt;FlexibleLoanRepayResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Flexible Loan Repay </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/crypto_loan/flexible-rate/trade/Flexible-Loan-Repay">Flexible
     *     Loan Repay(TRADE) Documentation</a>
     */
    public ApiResponse<FlexibleLoanRepayResponse> flexibleLoanRepay(
            FlexibleLoanRepayRequest flexibleLoanRepayRequest) throws ApiException {
        return flexibleRateApi.flexibleLoanRepay(flexibleLoanRepayRequest);
    }

    /**
     * Get Flexible Loan Assets Data(USER_DATA) Get interest rate and borrow limit of flexible
     * loanable assets. The borrow limit is shown in USD value. Weight: 400
     *
     * @param loanCoin (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetFlexibleLoanAssetsDataResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Flexible Loan Assets Data </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/crypto_loan/flexible-rate/market-data/Get-Flexible-Loan-Assets-Data">Get
     *     Flexible Loan Assets Data(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetFlexibleLoanAssetsDataResponse> getFlexibleLoanAssetsData(
            String loanCoin, Long recvWindow) throws ApiException {
        return flexibleRateApi.getFlexibleLoanAssetsData(loanCoin, recvWindow);
    }

    /**
     * Get Flexible Loan Borrow History(USER_DATA) Get Flexible Loan Borrow History * If startTime
     * and endTime are not sent, the recent 90-day data will be returned. * The max interval between
     * startTime and endTime is 180 days. Weight: 400
     *
     * @param loanCoin (optional)
     * @param collateralCoin (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Current querying page. Start from 1; default: 1; max: 1000 (optional)
     * @param limit Default: 10; max: 100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetFlexibleLoanBorrowHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Flexible Loan Borrow History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/crypto_loan/flexible-rate/user-information/Get-Flexible-Loan-Borrow-History">Get
     *     Flexible Loan Borrow History(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetFlexibleLoanBorrowHistoryResponse> getFlexibleLoanBorrowHistory(
            String loanCoin,
            String collateralCoin,
            Long startTime,
            Long endTime,
            Long current,
            Long limit,
            Long recvWindow)
            throws ApiException {
        return flexibleRateApi.getFlexibleLoanBorrowHistory(
                loanCoin, collateralCoin, startTime, endTime, current, limit, recvWindow);
    }

    /**
     * Get Flexible Loan Collateral Assets Data(USER_DATA) Get LTV information and collateral limit
     * of flexible loan&#39;s collateral assets. The collateral limit is shown in USD value. Weight:
     * 400
     *
     * @param collateralCoin (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetFlexibleLoanCollateralAssetsDataResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Flexible Loan Collateral Assets Data </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/crypto_loan/flexible-rate/market-data/Get-Flexible-Loan-Collateral-Assets-Data">Get
     *     Flexible Loan Collateral Assets Data(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetFlexibleLoanCollateralAssetsDataResponse>
            getFlexibleLoanCollateralAssetsData(String collateralCoin, Long recvWindow)
                    throws ApiException {
        return flexibleRateApi.getFlexibleLoanCollateralAssetsData(collateralCoin, recvWindow);
    }

    /**
     * Get Flexible Loan Liquidation History (USER_DATA) Weight: 400
     *
     * @param loanCoin (optional)
     * @param collateralCoin (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Current querying page. Start from 1; default: 1; max: 1000 (optional)
     * @param limit Default: 10; max: 100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetFlexibleLoanLiquidationHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Flexible Loan Liquidation History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/crypto_loan/flexible-rate/user-information/Get-Flexible-Loan-Liquidation-History">Get
     *     Flexible Loan Liquidation History (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetFlexibleLoanLiquidationHistoryResponse> getFlexibleLoanLiquidationHistory(
            String loanCoin,
            String collateralCoin,
            Long startTime,
            Long endTime,
            Long current,
            Long limit,
            Long recvWindow)
            throws ApiException {
        return flexibleRateApi.getFlexibleLoanLiquidationHistory(
                loanCoin, collateralCoin, startTime, endTime, current, limit, recvWindow);
    }

    /**
     * Get Flexible Loan LTV Adjustment History(USER_DATA) Get Flexible Loan LTV Adjustment History
     * * If startTime and endTime are not sent, the recent 90-day data will be returned. * The max
     * interval between startTime and endTime is 180 days. Weight: 400
     *
     * @param loanCoin (optional)
     * @param collateralCoin (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Current querying page. Start from 1; default: 1; max: 1000 (optional)
     * @param limit Default: 10; max: 100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetFlexibleLoanLtvAdjustmentHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Flexible Loan LTV Adjustment History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/crypto_loan/flexible-rate/user-information/Get-Flexible-Loan-LTV-Adjustment-History">Get
     *     Flexible Loan LTV Adjustment History(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetFlexibleLoanLtvAdjustmentHistoryResponse>
            getFlexibleLoanLtvAdjustmentHistory(
                    String loanCoin,
                    String collateralCoin,
                    Long startTime,
                    Long endTime,
                    Long current,
                    Long limit,
                    Long recvWindow)
                    throws ApiException {
        return flexibleRateApi.getFlexibleLoanLtvAdjustmentHistory(
                loanCoin, collateralCoin, startTime, endTime, current, limit, recvWindow);
    }

    /**
     * Get Flexible Loan Ongoing Orders(USER_DATA) Get Flexible Loan Ongoing Orders Weight: 300
     *
     * @param loanCoin (optional)
     * @param collateralCoin (optional)
     * @param current Current querying page. Start from 1; default: 1; max: 1000 (optional)
     * @param limit Default: 10; max: 100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetFlexibleLoanOngoingOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Flexible Loan Ongoing Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/crypto_loan/flexible-rate/user-information/Get-Flexible-Loan-Ongoing-Orders">Get
     *     Flexible Loan Ongoing Orders(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetFlexibleLoanOngoingOrdersResponse> getFlexibleLoanOngoingOrders(
            String loanCoin, String collateralCoin, Long current, Long limit, Long recvWindow)
            throws ApiException {
        return flexibleRateApi.getFlexibleLoanOngoingOrders(
                loanCoin, collateralCoin, current, limit, recvWindow);
    }

    /**
     * Get Flexible Loan Repayment History(USER_DATA) Get Flexible Loan Repayment History * If
     * startTime and endTime are not sent, the recent 90-day data will be returned. * The max
     * interval between startTime and endTime is 180 days. Weight: 400
     *
     * @param loanCoin (optional)
     * @param collateralCoin (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Current querying page. Start from 1; default: 1; max: 1000 (optional)
     * @param limit Default: 10; max: 100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetFlexibleLoanRepaymentHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Flexible Loan Repayment History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/crypto_loan/flexible-rate/user-information/Get-Flexible-Loan-Repayment-History">Get
     *     Flexible Loan Repayment History(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetFlexibleLoanRepaymentHistoryResponse> getFlexibleLoanRepaymentHistory(
            String loanCoin,
            String collateralCoin,
            Long startTime,
            Long endTime,
            Long current,
            Long limit,
            Long recvWindow)
            throws ApiException {
        return flexibleRateApi.getFlexibleLoanRepaymentHistory(
                loanCoin, collateralCoin, startTime, endTime, current, limit, recvWindow);
    }

    /**
     * Check Collateral Repay Rate(USER_DATA) Get the the rate of collateral coin / loan coin when
     * using collateral repay, the rate will be valid within 8 second. Weight: 6000
     *
     * @param loanCoin (required)
     * @param collateralCoin (required)
     * @param repayAmount repay amount of loanCoin (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;CheckCollateralRepayRateStableRateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Check Collateral Repay Rate </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/crypto_loan/stable-rate/market-data/Check-Collateral-Repay-Rate">Check
     *     Collateral Repay Rate(USER_DATA) Documentation</a>
     */
    public ApiResponse<CheckCollateralRepayRateStableRateResponse>
            checkCollateralRepayRateStableRate(
                    String loanCoin, String collateralCoin, Double repayAmount, Long recvWindow)
                    throws ApiException {
        return stableRateApi.checkCollateralRepayRateStableRate(
                loanCoin, collateralCoin, repayAmount, recvWindow);
    }

    /**
     * Get Crypto Loans Income History(USER_DATA) Get Crypto Loans Income History * If startTime and
     * endTime are not sent, the recent 7-day data will be returned. * The max interval between
     * startTime and endTime is 30 days. Weight: 6000
     *
     * @param asset (optional)
     * @param type All types will be returned by default. Enum：&#x60;borrowIn&#x60;
     *     ,&#x60;collateralSpent&#x60;, &#x60;repayAmount&#x60;,
     *     &#x60;collateralReturn&#x60;(Collateral return after repayment),
     *     &#x60;addCollateral&#x60;, &#x60;removeCollateral&#x60;,
     *     &#x60;collateralReturnAfterLiquidation&#x60; (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit Default: 10; max: 100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetCryptoLoansIncomeHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Crypto Loans Income History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/crypto_loan/stable-rate/market-data/Get-Crypto-Loans-Income-History">Get
     *     Crypto Loans Income History(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetCryptoLoansIncomeHistoryResponse> getCryptoLoansIncomeHistory(
            String asset, String type, Long startTime, Long endTime, Long limit, Long recvWindow)
            throws ApiException {
        return stableRateApi.getCryptoLoansIncomeHistory(
                asset, type, startTime, endTime, limit, recvWindow);
    }

    /**
     * Get Loan Borrow History(USER_DATA) Get Loan Borrow History * If startTime and endTime are not
     * sent, the recent 90-day data will be returned. * The max interval between startTime and
     * endTime is 180 days. Weight: 400
     *
     * @param orderId orderId in &#x60;POST /sapi/v1/loan/borrow&#x60; (optional)
     * @param loanCoin (optional)
     * @param collateralCoin (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Current querying page. Start from 1; default: 1; max: 1000 (optional)
     * @param limit Default: 10; max: 100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetLoanBorrowHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Loan Borrow History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/crypto_loan/stable-rate/user-information/Get-Loan-Borrow-History">Get
     *     Loan Borrow History(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetLoanBorrowHistoryResponse> getLoanBorrowHistory(
            Long orderId,
            String loanCoin,
            String collateralCoin,
            Long startTime,
            Long endTime,
            Long current,
            Long limit,
            Long recvWindow)
            throws ApiException {
        return stableRateApi.getLoanBorrowHistory(
                orderId, loanCoin, collateralCoin, startTime, endTime, current, limit, recvWindow);
    }

    /**
     * Get Loan LTV Adjustment History(USER_DATA) Get Loan LTV Adjustment History * If startTime and
     * endTime are not sent, the recent 90-day data will be returned. * The max interval between
     * startTime and endTime is 180 days. Weight: 400
     *
     * @param orderId orderId in &#x60;POST /sapi/v1/loan/borrow&#x60; (optional)
     * @param loanCoin (optional)
     * @param collateralCoin (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Current querying page. Start from 1; default: 1; max: 1000 (optional)
     * @param limit Default: 10; max: 100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetLoanLtvAdjustmentHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Loan LTV Adjustment History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/crypto_loan/stable-rate/user-information/Get-Loan-LTV-Adjustment-History">Get
     *     Loan LTV Adjustment History(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetLoanLtvAdjustmentHistoryResponse> getLoanLtvAdjustmentHistory(
            Long orderId,
            String loanCoin,
            String collateralCoin,
            Long startTime,
            Long endTime,
            Long current,
            Long limit,
            Long recvWindow)
            throws ApiException {
        return stableRateApi.getLoanLtvAdjustmentHistory(
                orderId, loanCoin, collateralCoin, startTime, endTime, current, limit, recvWindow);
    }

    /**
     * Get Loan Repayment History(USER_DATA) Get Loan Repayment History * If startTime and endTime
     * are not sent, the recent 90-day data will be returned. * The max interval between startTime
     * and endTime is 180 days. Weight: 400
     *
     * @param orderId orderId in &#x60;POST /sapi/v1/loan/borrow&#x60; (optional)
     * @param loanCoin (optional)
     * @param collateralCoin (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Current querying page. Start from 1; default: 1; max: 1000 (optional)
     * @param limit Default: 10; max: 100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetLoanRepaymentHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Loan Repayment History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/crypto_loan/stable-rate/user-information/Get-Loan-Repayment-History">Get
     *     Loan Repayment History(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetLoanRepaymentHistoryResponse> getLoanRepaymentHistory(
            Long orderId,
            String loanCoin,
            String collateralCoin,
            Long startTime,
            Long endTime,
            Long current,
            Long limit,
            Long recvWindow)
            throws ApiException {
        return stableRateApi.getLoanRepaymentHistory(
                orderId, loanCoin, collateralCoin, startTime, endTime, current, limit, recvWindow);
    }
}
