package com.binance.connector.client.fiat.rest.api;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.fiat.rest.FiatRestApiUtil;
import com.binance.connector.client.fiat.rest.model.DepositRequest;
import com.binance.connector.client.fiat.rest.model.DepositResponse;
import com.binance.connector.client.fiat.rest.model.FiatWithdrawRequest;
import com.binance.connector.client.fiat.rest.model.FiatWithdrawResponse;
import com.binance.connector.client.fiat.rest.model.GetFiatDepositWithdrawHistoryResponse;
import com.binance.connector.client.fiat.rest.model.GetFiatPaymentsHistoryResponse;
import com.binance.connector.client.fiat.rest.model.GetOrderDetailResponse;

public class FiatRestApi {

    private final DefaultApi defaultApi;

    public FiatRestApi(ClientConfiguration configuration) {
        this(FiatRestApiUtil.getDefaultClient(configuration));
    }

    public FiatRestApi(ApiClient apiClient) {
        this.defaultApi = new DefaultApi(apiClient);
    }

    /**
     * Deposit (TRADE) Submit deposit request, in this version, we only support BRL deposit via pix.
     * For BRL deposit via pix, you need to place an order before making a transfer from your bank.
     * Before calling this api, please make sure you have already completed your KYC or KYB, and
     * already activated your fiat service on our website. Weight(UID): 45000 Security Type: TRADE
     * Notes: - &#x60;timestamp&#x60;, &#x60;signature&#x60; and &#x60;recvWindow&#x60; are sent as
     * query-string parameters, while the business fields (&#x60;currency&#x60;,
     * &#x60;apiPaymentMethod&#x60;, &#x60;amount&#x60;, &#x60;ext&#x60;) are sent in the JSON
     * request body with &#x60;Content-Type: application/json&#x60;.
     *
     * @param depositRequest (required)
     * @param recvWindow Request validity window in milliseconds (optional)
     * @return ApiResponse&lt;DepositResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Deposit </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-fiat/api/rest-api/~#deposit">Deposit
     *     (TRADE) Documentation</a>
     */
    public ApiResponse<DepositResponse> deposit(DepositRequest depositRequest, Long recvWindow)
            throws ApiException {
        return defaultApi.deposit(depositRequest, recvWindow);
    }

    /**
     * Fiat Withdraw (TRADE) Submit withdraw request, in this version, we support BRL,ARS,MXN
     * withdrawal via bank_transfer. You need to call this api first, and call query order detail
     * api in a loop to get the status of the order until this order is successful. Before calling
     * this api, please make sure you have already completed your KYC or KYB, and already activated
     * your fiat service on our website. Weight(UID): 45000 Security Type: TRADE
     *
     * @param fiatWithdrawRequest (required)
     * @param recvWindow Request validity window in milliseconds (optional)
     * @return ApiResponse&lt;FiatWithdrawResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fiat Withdraw </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-fiat/api/rest-api/~#fiat-withdraw">Fiat
     *     Withdraw (TRADE) Documentation</a>
     */
    public ApiResponse<FiatWithdrawResponse> fiatWithdraw(
            FiatWithdrawRequest fiatWithdrawRequest, Long recvWindow) throws ApiException {
        return defaultApi.fiatWithdraw(fiatWithdrawRequest, recvWindow);
    }

    /**
     * Get Fiat Deposit/Withdraw History (USER_DATA) Get Fiat Deposit/Withdraw History Weight(UID):
     * 45000 Security Type: USER_DATA Notes: - If &#x60;beginTime&#x60; and &#x60;endTime&#x60; are
     * not sent, recent 30-day data is returned.
     *
     * @param transactionType 0: deposit, 1: withdraw (required)
     * @param beginTime (optional)
     * @param endTime (optional)
     * @param page (optional)
     * @param rows (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetFiatDepositWithdrawHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Fiat Deposit/Withdraw History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-fiat/api/rest-api/~#get-fiat-deposit-withdraw-history">Get
     *     Fiat Deposit/Withdraw History (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetFiatDepositWithdrawHistoryResponse> getFiatDepositWithdrawHistory(
            String transactionType,
            Long beginTime,
            Long endTime,
            Long page,
            Long rows,
            Long recvWindow)
            throws ApiException {
        return defaultApi.getFiatDepositWithdrawHistory(
                transactionType, beginTime, endTime, page, rows, recvWindow);
    }

    /**
     * Get Fiat Payments History (USER_DATA) Get Fiat Payments History Weight(IP): 1 Security Type:
     * USER_DATA Notes: - If &#x60;beginTime&#x60; and &#x60;endTime&#x60; are not sent, recent
     * 30-day data is returned. - &#x60;paymentMethod&#x60; is returned only when querying buy
     * history (&#x60;transactionType&#x3D;0&#x60;). - Supported payment methods: &#x60;Cash
     * Balance&#x60;, &#x60;Credit Card&#x60;, &#x60;Online Banking&#x60;, &#x60;Bank
     * Transfer&#x60;.
     *
     * @param transactionType 0: buy, 1: sell (required)
     * @param beginTime (optional)
     * @param endTime (optional)
     * @param page (optional)
     * @param rows (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetFiatPaymentsHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Fiat Payments History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-fiat/api/rest-api/~#get-fiat-payments-history">Get
     *     Fiat Payments History (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetFiatPaymentsHistoryResponse> getFiatPaymentsHistory(
            String transactionType,
            Long beginTime,
            Long endTime,
            Long page,
            Long rows,
            Long recvWindow)
            throws ApiException {
        return defaultApi.getFiatPaymentsHistory(
                transactionType, beginTime, endTime, page, rows, recvWindow);
    }

    /**
     * Get Order Detail (USER_DATA) Get Order Detail Before calling this api, please make sure you
     * have already completed your KYC or KYB, and already activated your fiat service on our
     * website. Weight(IP): 1 Security Type: USER_DATA
     *
     * @param orderNo Order ID retrieved from the withdrawal API (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetOrderDetailResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Order Detail </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-fiat/api/rest-api/~#get-order-detail">Get
     *     Order Detail (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetOrderDetailResponse> getOrderDetail(String orderNo, Long recvWindow)
            throws ApiException {
        return defaultApi.getOrderDetail(orderNo, recvWindow);
    }
}
