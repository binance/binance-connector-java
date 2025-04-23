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
import com.binance.connector.client.vip_loan.rest.model.GetVIPLoanOngoingOrdersResponse;
import com.binance.connector.client.vip_loan.rest.model.QueryApplicationStatusResponse;
import com.binance.connector.client.vip_loan.rest.model.VipLoanBorrowRequest;
import com.binance.connector.client.vip_loan.rest.model.VipLoanBorrowResponse;
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
     * Get Borrow Interest Rate(USER_DATA) Get Borrow Interest Rate Weight: 400
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
     *     href="https://developers.binance.com/docs/vip_loan/market-data/Get-Borrow-Interest-Rate">Get
     *     Borrow Interest Rate(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetBorrowInterestRateResponse> getBorrowInterestRate(
            String loanCoin, Long recvWindow) throws ApiException {
        return marketDataApi.getBorrowInterestRate(loanCoin, recvWindow);
    }

    /**
     * Get Collateral Asset Data(USER_DATA) Get Collateral Asset Data Weight: 400
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
     *     href="https://developers.binance.com/docs/vip_loan/market-data/Get-Collateral-Asset-Data">Get
     *     Collateral Asset Data(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetCollateralAssetDataResponse> getCollateralAssetData(
            String collateralCoin, Long recvWindow) throws ApiException {
        return marketDataApi.getCollateralAssetData(collateralCoin, recvWindow);
    }

    /**
     * Get Loanable Assets Data(USER_DATA) Get interest rate and borrow limit of loanable assets.
     * The borrow limit is shown in USD value. Weight: 400
     *
     * @param loanCoin (optional)
     * @param vipLevel default:user&#39;s vip level (optional)
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
     *     href="https://developers.binance.com/docs/vip_loan/market-data/Get-Loanable-Assets-Data">Get
     *     Loanable Assets Data(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetLoanableAssetsDataResponse> getLoanableAssetsData(
            String loanCoin, Long vipLevel, Long recvWindow) throws ApiException {
        return marketDataApi.getLoanableAssetsData(loanCoin, vipLevel, recvWindow);
    }

    /**
     * VIP Loan Borrow(TRADE) VIP loan is available for VIP users only. * loanAccountId refer to
     * loan receiving account * Only master account applications are supported * loanAccountId and
     * collateralAccountId under same master account * loanTerm is mandatory if user choose stable
     * rate Weight: 0
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
     * @see <a href="https://developers.binance.com/docs/vip_loan/trade/VIP-Loan-Borrow">VIP Loan
     *     Borrow(TRADE) Documentation</a>
     */
    public ApiResponse<VipLoanBorrowResponse> vipLoanBorrow(
            VipLoanBorrowRequest vipLoanBorrowRequest) throws ApiException {
        return tradeApi.vipLoanBorrow(vipLoanBorrowRequest);
    }

    /**
     * VIP Loan Renew(TRADE) VIP loan is available for VIP users only. Weight: 6000
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
     * @see <a href="https://developers.binance.com/docs/vip_loan/trade/VIP-Loan-Renew">VIP Loan
     *     Renew(TRADE) Documentation</a>
     */
    public ApiResponse<VipLoanRenewResponse> vipLoanRenew(VipLoanRenewRequest vipLoanRenewRequest)
            throws ApiException {
        return tradeApi.vipLoanRenew(vipLoanRenewRequest);
    }

    /**
     * VIP Loan Repay(TRADE) VIP loan is available for VIP users only. Weight: 6000
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
     * @see <a href="https://developers.binance.com/docs/vip_loan/trade/VIP-Loan-Repay">VIP Loan
     *     Repay(TRADE) Documentation</a>
     */
    public ApiResponse<VipLoanRepayResponse> vipLoanRepay(VipLoanRepayRequest vipLoanRepayRequest)
            throws ApiException {
        return tradeApi.vipLoanRepay(vipLoanRepayRequest);
    }

    /**
     * Check VIP Loan Collateral Account (USER_DATA) VIP loan is available for VIP users only * If
     * the login account is loan account, all collateral accounts under the loan account can be
     * queried. * If the login account is collateral account, only the current collateral account
     * can be queried. Weight: 6000
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
     *     href="https://developers.binance.com/docs/vip_loan/user-information/Check-Locked-Value-of-VIP-Collateral-Account">Check
     *     VIP Loan Collateral Account (USER_DATA) Documentation</a>
     */
    public ApiResponse<CheckVIPLoanCollateralAccountResponse> checkVIPLoanCollateralAccount(
            Long orderId, Long collateralAccountId, Long recvWindow) throws ApiException {
        return userInformationApi.checkVIPLoanCollateralAccount(
                orderId, collateralAccountId, recvWindow);
    }

    /**
     * Get VIP Loan Ongoing Orders(USER_DATA) VIP loan is available for VIP users only. Weight: 400
     *
     * @param orderId (optional)
     * @param collateralAccountId (optional)
     * @param loanCoin (optional)
     * @param collateralCoin (optional)
     * @param current Currently querying page. Start from 1, Default:1, Max: 1000. (optional)
     * @param limit Default: 10, Max: 100 (optional)
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
     *     href="https://developers.binance.com/docs/vip_loan/user-information/Get-VIP-Loan-Ongoing-Orders">Get
     *     VIP Loan Ongoing Orders(USER_DATA) Documentation</a>
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
     * Query Application Status(USER_DATA) Query Application Status Weight: 400
     *
     * @param current Currently querying page. Start from 1, Default:1, Max: 1000. (optional)
     * @param limit Default: 10, Max: 100 (optional)
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
     *     href="https://developers.binance.com/docs/vip_loan/user-information/Query-Application-Status">Query
     *     Application Status(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryApplicationStatusResponse> queryApplicationStatus(
            Long current, Long limit, Long recvWindow) throws ApiException {
        return userInformationApi.queryApplicationStatus(current, limit, recvWindow);
    }
}
