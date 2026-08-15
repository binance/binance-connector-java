package com.binance.connector.client.vip_loan.rest.api;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.vip_loan.rest.VipLoanRestApiUtil;
import com.binance.connector.client.vip_loan.rest.model.CheckVIPLoanCollateralAccountResponse;
import com.binance.connector.client.vip_loan.rest.model.GetBorrowInterestRateResponse;
import com.binance.connector.client.vip_loan.rest.model.GetCollateralAssetDataResponse;
import com.binance.connector.client.vip_loan.rest.model.GetLoanableAssetsDataResponse;
import com.binance.connector.client.vip_loan.rest.model.GetVIPLoanAccruedInterestResponse;
import com.binance.connector.client.vip_loan.rest.model.GetVIPLoanInterestRateHistoryResponse;
import com.binance.connector.client.vip_loan.rest.model.GetVIPLoanOngoingOrdersResponse;
import com.binance.connector.client.vip_loan.rest.model.GetVIPLoanRepaymentHistoryResponse;
import com.binance.connector.client.vip_loan.rest.model.QueryApplicationStatusResponse;
import com.binance.connector.client.vip_loan.rest.model.QueryVIPLoanFixedRateMarketResponse;
import com.binance.connector.client.vip_loan.rest.model.VipLoanBorrowRequest;
import com.binance.connector.client.vip_loan.rest.model.VipLoanBorrowResponse;
import com.binance.connector.client.vip_loan.rest.model.VipLoanFixedRateBorrowRequest;
import com.binance.connector.client.vip_loan.rest.model.VipLoanFixedRateBorrowResponse;
import com.binance.connector.client.vip_loan.rest.model.VipLoanRenewRequest;
import com.binance.connector.client.vip_loan.rest.model.VipLoanRenewResponse;
import com.binance.connector.client.vip_loan.rest.model.VipLoanRepayRequest;
import com.binance.connector.client.vip_loan.rest.model.VipLoanRepayResponse;

public class VipLoanRestApi {

    private final MarketDataApi marketDataApi;
    private final TradeApi tradeApi;
    private final UserInformationApi userInformationApi;

    public VipLoanRestApi(ClientConfiguration configuration) {
        this(VipLoanRestApiUtil.getDefaultClient(configuration));
    }

    public VipLoanRestApi(ApiClient apiClient) {
        this.marketDataApi = new MarketDataApi(apiClient);
        this.tradeApi = new TradeApi(apiClient);
        this.userInformationApi = new UserInformationApi(apiClient);
    }

    /**
     * Get Borrow Interest Rate (USER_DATA) Get Borrow Interest Rate Weight(IP): 400 Security Type:
     * USER_DATA
     *
     * @param loanCoin Max 10 assets, Multiple split by \&quot;,\&quot; (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetBorrowInterestRateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Borrow Interest Rate </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-vip-loan/api/rest-api/market-data#get-borrow-interest-rate">Get
     *     Borrow Interest Rate (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetBorrowInterestRateResponse> getBorrowInterestRate(
            String loanCoin, Long recvWindow) throws ApiException {
        return marketDataApi.getBorrowInterestRate(loanCoin, recvWindow);
    }

    /**
     * Get Collateral Asset Data (USER_DATA) Get Collateral Asset Data Weight(IP): 400 Security
     * Type: USER_DATA
     *
     * @param collateralCoin (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetCollateralAssetDataResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Collateral Asset Data </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-vip-loan/api/rest-api/market-data#get-collateral-asset-data">Get
     *     Collateral Asset Data (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetCollateralAssetDataResponse> getCollateralAssetData(
            String collateralCoin, Long recvWindow) throws ApiException {
        return marketDataApi.getCollateralAssetData(collateralCoin, recvWindow);
    }

    /**
     * Get Loanable Assets Data (USER_DATA) Get interest rate and borrow limit of loanable assets.
     * The borrow limit is shown in USD value. Weight(IP): 400 Security Type: USER_DATA
     *
     * @param loanCoin (optional)
     * @param vipLevel Defaults to the user&#39;s VIP level. (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetLoanableAssetsDataResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Loanable Assets Data </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-vip-loan/api/rest-api/market-data#get-loanable-assets-data">Get
     *     Loanable Assets Data (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetLoanableAssetsDataResponse> getLoanableAssetsData(
            String loanCoin, Long vipLevel, Long recvWindow) throws ApiException {
        return marketDataApi.getLoanableAssetsData(loanCoin, vipLevel, recvWindow);
    }

    /**
     * Get VIP Loan Interest Rate History (USER_DATA) Check VIP Loan flexible interest rate history
     * Weight(IP): 400 Security Type: USER_DATA Notes: - If &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; are not sent, recent 90-day data is returned. - The maximum interval
     * between &#x60;startTime&#x60; and &#x60;endTime&#x60; is 180 days. - Time is based on UTC+0.
     *
     * @param coin (required)
     * @param recvWindow (required)
     * @param startTime If both startTime and endTime are omitted, the most recent 90 days are
     *     returned. (optional)
     * @param endTime Maximum interval between startTime and endTime is 180 days. Time is based on
     *     UTC+0. (optional)
     * @param current Current page number, starting from 1. (optional)
     * @param limit Number of records per page. (optional)
     * @return ApiResponse&lt;GetVIPLoanInterestRateHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get VIP Loan Interest Rate History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-vip-loan/api/rest-api/market-data#get-viploan-interest-rate-history">Get
     *     VIP Loan Interest Rate History (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetVIPLoanInterestRateHistoryResponse> getVIPLoanInterestRateHistory(
            String coin, Long recvWindow, Long startTime, Long endTime, Long current, Long limit)
            throws ApiException {
        return marketDataApi.getVIPLoanInterestRateHistory(
                coin, recvWindow, startTime, endTime, current, limit);
    }

    /**
     * Query VIP Loan Fixed Rate Market (USER_DATA) Query the VIP Loan fixed rate market. Returns a
     * paginated list of fixed-rate supply orders. Weight(IP): 6000 Security Type: USER_DATA
     *
     * @param loanCoin Loan coin (required)
     * @param duration Duration in days, minimum 1 (optional)
     * @param current Page number, default 1, minimum 1 (optional)
     * @param size Page size, default 10, range [1, 100] (optional)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60; (optional)
     * @return ApiResponse&lt;QueryVIPLoanFixedRateMarketResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Query VIP Loan Fixed Rate Market </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-vip-loan/api/rest-api/market-data#query-viploan-fixed-rate-market">Query
     *     VIP Loan Fixed Rate Market (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryVIPLoanFixedRateMarketResponse> queryVIPLoanFixedRateMarket(
            String loanCoin, Long duration, Long current, Long size, Long recvWindow)
            throws ApiException {
        return marketDataApi.queryVIPLoanFixedRateMarket(
                loanCoin, duration, current, size, recvWindow);
    }

    /**
     * VIP Loan Borrow (TRADE) VIP loan is available for VIP users only. Weight(UID): 6000 Security
     * Type: TRADE Notes: - &#x60;loanAccountId&#x60; refers to the loan receiving account. - Only
     * master account applications are supported. - &#x60;loanAccountId&#x60; and
     * &#x60;collateralAccountId&#x60; must be under the same master account. - &#x60;loanTerm&#x60;
     * is mandatory if the user chooses a fixed rate (&#x60;isFlexibleRate &#x3D; FALSE&#x60;).
     *
     * @param vipLoanBorrowRequest (required)
     * @return ApiResponse&lt;VipLoanBorrowResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> VIP Loan Borrow </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-vip-loan/api/rest-api/trade#vip-loan-borrow">VIP
     *     Loan Borrow (TRADE) Documentation</a>
     */
    public ApiResponse<VipLoanBorrowResponse> vipLoanBorrow(
            VipLoanBorrowRequest vipLoanBorrowRequest) throws ApiException {
        return tradeApi.vipLoanBorrow(vipLoanBorrowRequest);
    }

    /**
     * VIP Loan Fixed Rate Borrow (TRADE) Submit a fixed rate borrow request by matching market
     * supply orders. Weight(UID): 6000 Security Type: TRADE Notes: - **Rate limit:** 2 requests per
     * second per account. - When multiple &#x60;supplyRequest&#x60; entries are provided, all
     * &#x60;requestId&#x60; values must correspond to the same &#x60;borrowCoin&#x60; and
     * &#x60;loanTerm&#x60; (validated by collateral facade).
     *
     * @param vipLoanFixedRateBorrowRequest (required)
     * @return ApiResponse&lt;VipLoanFixedRateBorrowResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> VIP Loan Fixed Rate Borrow </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-vip-loan/api/rest-api/trade#vip-loan-fixed-rate-borrow">VIP
     *     Loan Fixed Rate Borrow (TRADE) Documentation</a>
     */
    public ApiResponse<VipLoanFixedRateBorrowResponse> vipLoanFixedRateBorrow(
            VipLoanFixedRateBorrowRequest vipLoanFixedRateBorrowRequest) throws ApiException {
        return tradeApi.vipLoanFixedRateBorrow(vipLoanFixedRateBorrowRequest);
    }

    /**
     * VIP Loan Renew (TRADE) VIP loan is available for VIP users only. Weight(UID): 6000 Security
     * Type: TRADE
     *
     * @param vipLoanRenewRequest (required)
     * @return ApiResponse&lt;VipLoanRenewResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> VIP Loan Renew </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-vip-loan/api/rest-api/trade#vip-loan-renew">VIP
     *     Loan Renew (TRADE) Documentation</a>
     */
    public ApiResponse<VipLoanRenewResponse> vipLoanRenew(VipLoanRenewRequest vipLoanRenewRequest)
            throws ApiException {
        return tradeApi.vipLoanRenew(vipLoanRenewRequest);
    }

    /**
     * VIP Loan Repay (TRADE) VIP loan is available for VIP users only. Weight(UID): 6000 Security
     * Type: TRADE
     *
     * @param vipLoanRepayRequest (required)
     * @return ApiResponse&lt;VipLoanRepayResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> VIP Loan Repay </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-vip-loan/api/rest-api/trade#vip-loan-repay">VIP
     *     Loan Repay (TRADE) Documentation</a>
     */
    public ApiResponse<VipLoanRepayResponse> vipLoanRepay(VipLoanRepayRequest vipLoanRepayRequest)
            throws ApiException {
        return tradeApi.vipLoanRepay(vipLoanRepayRequest);
    }

    /**
     * Check VIP Loan Collateral Account (USER_DATA) VIP loan is available for VIP users only
     * Weight(IP): 6000 Security Type: USER_DATA Notes: - If the logged-in account is a borrowing
     * account, all collateral accounts bound to that borrowing account can be queried. - If the
     * logged-in account is a collateral account, only collateral assets under that account can be
     * queried.
     *
     * @param orderId (optional)
     * @param collateralAccountId (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;CheckVIPLoanCollateralAccountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Check VIP Loan Collateral Account </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-vip-loan/api/rest-api/user-information#check-viploan-collateral-account">Check
     *     VIP Loan Collateral Account (USER_DATA) Documentation</a>
     */
    public ApiResponse<CheckVIPLoanCollateralAccountResponse> checkVIPLoanCollateralAccount(
            Long orderId, Long collateralAccountId, Long recvWindow) throws ApiException {
        return userInformationApi.checkVIPLoanCollateralAccount(
                orderId, collateralAccountId, recvWindow);
    }

    /**
     * Get VIP Loan Accrued Interest (USER_DATA) Check VIP Loan interest record Weight(IP): 400
     * Security Type: USER_DATA Notes: - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not
     * sent, recent 90-day data is returned. - The maximum interval between &#x60;startTime&#x60;
     * and &#x60;endTime&#x60; is 90 days.
     *
     * @param orderId (optional)
     * @param loanCoin (optional)
     * @param startTime If both startTime and endTime are omitted, the most recent 90 days are
     *     returned. (optional)
     * @param endTime Maximum interval between startTime and endTime is 90 days. (optional)
     * @param current Current page number, starting from 1. (optional)
     * @param limit Number of records per page. (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetVIPLoanAccruedInterestResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get VIP Loan Accrued Interest </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-vip-loan/api/rest-api/user-information#get-viploan-accrued-interest">Get
     *     VIP Loan Accrued Interest (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetVIPLoanAccruedInterestResponse> getVIPLoanAccruedInterest(
            Long orderId,
            String loanCoin,
            Long startTime,
            Long endTime,
            Long current,
            Long limit,
            Long recvWindow)
            throws ApiException {
        return userInformationApi.getVIPLoanAccruedInterest(
                orderId, loanCoin, startTime, endTime, current, limit, recvWindow);
    }

    /**
     * Get VIP Loan Ongoing Orders (USER_DATA) VIP loan is available for VIP users only. Weight(IP):
     * 400 Security Type: USER_DATA
     *
     * @param orderId (optional)
     * @param collateralAccountId (optional)
     * @param loanCoin (optional)
     * @param collateralCoin (optional)
     * @param current (optional)
     * @param limit (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetVIPLoanOngoingOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get VIP Loan Ongoing Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-vip-loan/api/rest-api/user-information#get-viploan-ongoing-orders">Get
     *     VIP Loan Ongoing Orders (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetVIPLoanOngoingOrdersResponse> getVIPLoanOngoingOrders(
            Long orderId,
            Long collateralAccountId,
            String loanCoin,
            String collateralCoin,
            Long current,
            Long limit,
            Long recvWindow)
            throws ApiException {
        return userInformationApi.getVIPLoanOngoingOrders(
                orderId, collateralAccountId, loanCoin, collateralCoin, current, limit, recvWindow);
    }

    /**
     * Get VIP Loan Repayment History (USER_DATA) VIP Loans are available only to VIP users.
     * Weight(IP): 400 Security Type: USER_DATA Notes: - If &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; are not sent, recent 90-day data is returned. - The maximum interval
     * between &#x60;startTime&#x60; and &#x60;endTime&#x60; is 180 days.
     *
     * @param orderId (optional)
     * @param loanCoin (optional)
     * @param startTime If both startTime and endTime are omitted, the most recent 90 days are
     *     returned. (optional)
     * @param endTime Maximum interval between startTime and endTime is 180 days. (optional)
     * @param current Current page number, starting from 1. (optional)
     * @param limit Number of records per page. (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetVIPLoanRepaymentHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get VIP Loan Repayment History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-vip-loan/api/rest-api/user-information#get-viploan-repayment-history">Get
     *     VIP Loan Repayment History (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetVIPLoanRepaymentHistoryResponse> getVIPLoanRepaymentHistory(
            Long orderId,
            String loanCoin,
            Long startTime,
            Long endTime,
            Long current,
            Long limit,
            Long recvWindow)
            throws ApiException {
        return userInformationApi.getVIPLoanRepaymentHistory(
                orderId, loanCoin, startTime, endTime, current, limit, recvWindow);
    }

    /**
     * Query Application Status (USER_DATA) Query Application Status Weight(UID): 400 Security Type:
     * USER_DATA
     *
     * @param current Current page number, starting from 1. (optional)
     * @param limit (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryApplicationStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Application Status </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-vip-loan/api/rest-api/user-information#query-application-status">Query
     *     Application Status (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryApplicationStatusResponse> queryApplicationStatus(
            Long current, Long limit, Long recvWindow) throws ApiException {
        return userInformationApi.queryApplicationStatus(current, limit, recvWindow);
    }
}
