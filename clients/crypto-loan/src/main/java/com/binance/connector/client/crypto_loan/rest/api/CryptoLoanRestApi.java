package com.binance.connector.client.crypto_loan.rest.api;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.crypto_loan.rest.CryptoLoanRestApiUtil;
import com.binance.connector.client.crypto_loan.rest.model.CheckCollateralRepayRateResponse;
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
import com.binance.connector.client.crypto_loan.rest.model.GetFlexibleLoanInterestRateHistoryResponse;
import com.binance.connector.client.crypto_loan.rest.model.GetFlexibleLoanLiquidationHistoryResponse;
import com.binance.connector.client.crypto_loan.rest.model.GetFlexibleLoanLtvAdjustmentHistoryResponse;
import com.binance.connector.client.crypto_loan.rest.model.GetFlexibleLoanOngoingOrdersResponse;
import com.binance.connector.client.crypto_loan.rest.model.GetFlexibleLoanRepaymentHistoryResponse;
import com.binance.connector.client.crypto_loan.rest.model.GetLoanBorrowHistoryResponse;
import com.binance.connector.client.crypto_loan.rest.model.GetLoanLtvAdjustmentHistoryResponse;
import com.binance.connector.client.crypto_loan.rest.model.GetLoanRepaymentHistoryResponse;
import com.binance.connector.client.crypto_loan.rest.model.OrderType;

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
     * Check Collateral Flexible Repay Rate (USER_DATA) Get the latest rate of collateral coin/loan
     * coin when using collateral repay. Weight(IP): 6000 Security Type: USER_DATA
     *
     * @param loanCoin (required)
     * @param collateralCoin (required)
     * @param recvWindow Request validity window in milliseconds (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-crypto-loan/api/rest-api/flexible-rate#check-collateral-repay-rate">Check
     *     Collateral Flexible Repay Rate (USER_DATA) Documentation</a>
     */
    public ApiResponse<CheckCollateralRepayRateResponse> checkCollateralRepayRate(
            String loanCoin, String collateralCoin, Long recvWindow) throws ApiException {
        return flexibleRateApi.checkCollateralRepayRate(loanCoin, collateralCoin, recvWindow);
    }

    /**
     * Flexible Loan Adjust LTV (TRADE) Flexible Loan Adjust LTV Weight(UID): 6000 Security Type:
     * TRADE Notes: - API key needs Spot &amp; Margin Trading permission for this endpoint.
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-crypto-loan/api/rest-api/flexible-rate#flexible-loan-adjust-ltv">Flexible
     *     Loan Adjust LTV (TRADE) Documentation</a>
     */
    public ApiResponse<FlexibleLoanAdjustLtvResponse> flexibleLoanAdjustLtv(
            FlexibleLoanAdjustLtvRequest flexibleLoanAdjustLtvRequest) throws ApiException {
        return flexibleRateApi.flexibleLoanAdjustLtv(flexibleLoanAdjustLtvRequest);
    }

    /**
     * Flexible Loan Borrow (TRADE) Borrow Flexible Loan Weight(IP): 6000 Security Type: TRADE
     * Notes: - This endpoint is available for both master and sub-accounts. - You can customize LTV
     * by entering &#x60;loanAmount&#x60; and &#x60;collateralAmount&#x60;.
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-crypto-loan/api/rest-api/flexible-rate#flexible-loan-borrow">Flexible
     *     Loan Borrow (TRADE) Documentation</a>
     */
    public ApiResponse<FlexibleLoanBorrowResponse> flexibleLoanBorrow(
            FlexibleLoanBorrowRequest flexibleLoanBorrowRequest) throws ApiException {
        return flexibleRateApi.flexibleLoanBorrow(flexibleLoanBorrowRequest);
    }

    /**
     * Flexible Loan Repay (TRADE) Flexible Loan Repay Weight(IP): 6000 Security Type: TRADE Notes:
     * - &#x60;repayAmount&#x60; is mandatory even when &#x60;fullRepayment &#x3D; FALSE&#x60;.
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-crypto-loan/api/rest-api/flexible-rate#flexible-loan-repay">Flexible
     *     Loan Repay (TRADE) Documentation</a>
     */
    public ApiResponse<FlexibleLoanRepayResponse> flexibleLoanRepay(
            FlexibleLoanRepayRequest flexibleLoanRepayRequest) throws ApiException {
        return flexibleRateApi.flexibleLoanRepay(flexibleLoanRepayRequest);
    }

    /**
     * Get Flexible Loan Assets Data (USER_DATA) Get interest rate and borrow limit of flexible
     * loanable assets. The borrow limit is shown in USD value. Weight(IP): 400 Security Type:
     * USER_DATA
     *
     * @param loanCoin (optional)
     * @param recvWindow Request validity window in milliseconds (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-crypto-loan/api/rest-api/flexible-rate#get-flexible-loan-assets-data">Get
     *     Flexible Loan Assets Data (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetFlexibleLoanAssetsDataResponse> getFlexibleLoanAssetsData(
            String loanCoin, Long recvWindow) throws ApiException {
        return flexibleRateApi.getFlexibleLoanAssetsData(loanCoin, recvWindow);
    }

    /**
     * Get Flexible Loan Borrow History (USER_DATA) Get Flexible Loan Borrow History. It can be used
     * to check history before 2024-02-27 08:00. Weight(IP): 400 Security Type: USER_DATA Notes: -
     * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, the recent 90-day data is
     * returned. - The max interval between &#x60;startTime&#x60; and &#x60;endTime&#x60; is 180
     * days.
     *
     * @param loanCoin (optional)
     * @param collateralCoin (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Current querying page (optional)
     * @param limit Number of records to return (optional)
     * @param recvWindow Request validity window in milliseconds (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-crypto-loan/api/rest-api/flexible-rate#get-flexible-loan-borrow-history">Get
     *     Flexible Loan Borrow History (USER_DATA) Documentation</a>
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
     * Get Flexible Loan Collateral Assets Data (USER_DATA) Get LTV information and collateral limit
     * of flexible loan&#39;s collateral assets. The collateral limit is shown in USD value.
     * Weight(IP): 400 Security Type: USER_DATA
     *
     * @param collateralCoin (optional)
     * @param recvWindow Request validity window in milliseconds (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-crypto-loan/api/rest-api/flexible-rate#get-flexible-loan-collateral-assets-data">Get
     *     Flexible Loan Collateral Assets Data (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetFlexibleLoanCollateralAssetsDataResponse>
            getFlexibleLoanCollateralAssetsData(String collateralCoin, Long recvWindow)
                    throws ApiException {
        return flexibleRateApi.getFlexibleLoanCollateralAssetsData(collateralCoin, recvWindow);
    }

    /**
     * Get Flexible Loan Interest Rate History (USER_DATA) Check Flexible Loan interest rate history
     * Weight(IP): 400 Security Type: USER_DATA Notes: - If &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; are not sent, the recent 90-day data is returned. - The max interval
     * between &#x60;startTime&#x60; and &#x60;endTime&#x60; is 90 days. - Time is based on UTC+0.
     *
     * @param coin (required)
     * @param recvWindow Request validity window in milliseconds (required)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Current querying page (optional)
     * @param limit Number of records to return (optional)
     * @return ApiResponse&lt;GetFlexibleLoanInterestRateHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Flexible Loan Interest Rate History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-crypto-loan/api/rest-api/flexible-rate#get-flexible-loan-interest-rate-history">Get
     *     Flexible Loan Interest Rate History (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetFlexibleLoanInterestRateHistoryResponse>
            getFlexibleLoanInterestRateHistory(
                    String coin,
                    Long recvWindow,
                    Long startTime,
                    Long endTime,
                    Long current,
                    Long limit)
                    throws ApiException {
        return flexibleRateApi.getFlexibleLoanInterestRateHistory(
                coin, recvWindow, startTime, endTime, current, limit);
    }

    /**
     * Get Flexible Loan Liquidation History (USER_DATA) Get Flexible Loan Liquidation History
     * Weight(IP): 400 Security Type: USER_DATA
     *
     * @param loanCoin (optional)
     * @param collateralCoin (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Current querying page (optional)
     * @param limit Number of records to return (optional)
     * @param recvWindow Request validity window in milliseconds (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-crypto-loan/api/rest-api/flexible-rate#get-flexible-loan-liquidation-history">Get
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
     * Get Flexible Loan LTV Adjustment History (USER_DATA) Get Flexible Loan LTV Adjustment
     * History. It can be used to check history before 2024-02-27 08:00. Weight(UID): 400 Security
     * Type: USER_DATA Notes: - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, the
     * recent 90-day data is returned. - The max interval between &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; is 180 days.
     *
     * @param loanCoin (optional)
     * @param collateralCoin (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Current querying page (optional)
     * @param limit Number of records to return (optional)
     * @param recvWindow Request validity window in milliseconds (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-crypto-loan/api/rest-api/flexible-rate#get-flexible-loan-ltv-adjustment-history">Get
     *     Flexible Loan LTV Adjustment History (USER_DATA) Documentation</a>
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
     * Get Flexible Loan Ongoing Orders (USER_DATA) Get Flexible Loan Ongoing Orders Weight(IP): 300
     * Security Type: USER_DATA
     *
     * @param loanCoin (optional)
     * @param collateralCoin (optional)
     * @param current Current querying page (optional)
     * @param limit Number of records to return (optional)
     * @param recvWindow Request validity window in milliseconds (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-crypto-loan/api/rest-api/flexible-rate#get-flexible-loan-ongoing-orders">Get
     *     Flexible Loan Ongoing Orders (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetFlexibleLoanOngoingOrdersResponse> getFlexibleLoanOngoingOrders(
            String loanCoin, String collateralCoin, Long current, Long limit, Long recvWindow)
            throws ApiException {
        return flexibleRateApi.getFlexibleLoanOngoingOrders(
                loanCoin, collateralCoin, current, limit, recvWindow);
    }

    /**
     * Get Flexible Loan Repayment History (USER_DATA) Get Flexible Loan Repayment History. It can
     * be used to check history before 2024-02-27 08:00. Weight(IP): 400 Security Type: USER_DATA
     * Notes: - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, the recent 90-day
     * data is returned. - The max interval between &#x60;startTime&#x60; and &#x60;endTime&#x60; is
     * 180 days.
     *
     * @param loanCoin (optional)
     * @param collateralCoin (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Current querying page (optional)
     * @param limit Number of records to return (optional)
     * @param recvWindow Request validity window in milliseconds (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-crypto-loan/api/rest-api/flexible-rate#get-flexible-loan-repayment-history">Get
     *     Flexible Loan Repayment History (USER_DATA) Documentation</a>
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
     * Get Crypto Loans Income History (USER_DATA) Get Crypto Loans Income History Weight(UID): 6000
     * Security Type: USER_DATA Notes: - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both
     * omitted, the most recent 7 days of data are returned. - The maximum interval between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; is 30 days.
     *
     * @param asset (optional)
     * @param type All types will be returned by default. (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit Number of records to return (optional)
     * @param recvWindow Request validity window in milliseconds (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-crypto-loan/api/rest-api/stable-rate#get-crypto-loans-income-history">Get
     *     Crypto Loans Income History (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetCryptoLoansIncomeHistoryResponse> getCryptoLoansIncomeHistory(
            String asset, OrderType type, Long startTime, Long endTime, Long limit, Long recvWindow)
            throws ApiException {
        return stableRateApi.getCryptoLoansIncomeHistory(
                asset, type, startTime, endTime, limit, recvWindow);
    }

    /**
     * Get Loan Borrow History (USER_DATA) Get Loan Borrow History Weight(IP): 400 Security Type:
     * USER_DATA Notes: - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, the recent
     * 90-day data is returned. - The max interval between &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; is 180 days.
     *
     * @param orderId orderId in &#x60;POST /sapi/v1/loan/borrow&#x60; (optional)
     * @param loanCoin (optional)
     * @param collateralCoin (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Current querying page (optional)
     * @param limit Number of records to return (optional)
     * @param recvWindow Request validity window in milliseconds (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-crypto-loan/api/rest-api/stable-rate#get-loan-borrow-history">Get
     *     Loan Borrow History (USER_DATA) Documentation</a>
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
     * Get Loan LTV Adjustment History (USER_DATA) Get Loan LTV Adjustment History Weight(IP): 400
     * Security Type: USER_DATA Notes: - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not
     * sent, the recent 90-day data is returned. - The max interval between &#x60;startTime&#x60;
     * and &#x60;endTime&#x60; is 180 days.
     *
     * @param orderId orderId in &#x60;POST /sapi/v1/loan/borrow&#x60; (optional)
     * @param loanCoin (optional)
     * @param collateralCoin (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Current querying page (optional)
     * @param limit Number of records to return (optional)
     * @param recvWindow Request validity window in milliseconds (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-crypto-loan/api/rest-api/stable-rate#get-loan-ltv-adjustment-history">Get
     *     Loan LTV Adjustment History (USER_DATA) Documentation</a>
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
     * Get Loan Repayment History (USER_DATA) Get Loan Repayment History Weight(IP): 400 Security
     * Type: USER_DATA Notes: - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, the
     * recent 90-day data is returned. - The max interval between &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; is 180 days.
     *
     * @param orderId orderId in &#x60;POST /sapi/v1/loan/borrow&#x60; (optional)
     * @param loanCoin (optional)
     * @param collateralCoin (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Current querying page (optional)
     * @param limit Number of records to return (optional)
     * @param recvWindow Request validity window in milliseconds (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-crypto-loan/api/rest-api/stable-rate#get-loan-repayment-history">Get
     *     Loan Repayment History (USER_DATA) Documentation</a>
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
