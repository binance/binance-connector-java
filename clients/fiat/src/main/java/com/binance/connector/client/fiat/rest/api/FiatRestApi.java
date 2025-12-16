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

    private final FiatApi fiatApi;

    public FiatRestApi(ClientConfiguration configuration) {
        this(FiatRestApiUtil.getDefaultClient(configuration));
    }

    public FiatRestApi(ApiClient apiClient) {
        this.fiatApi = new FiatApi(apiClient);
    }

    /**
     * Deposit(TRADE) Submit deposit request, in this version, we only support BRL deposit via pix.
     * For BRL deposit via pix, you need to place an order before making a transfer from your bank.
     * Before calling this api, please make sure you have already completed your KYC or KYB, and
     * already activated your fiat service on our website. Weight: 45000
     *
     * @param depositRequest (required)
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
     * @see <a href="https://developers.binance.com/docs/fiat/rest-api/Fiat-Deposit">Deposit(TRADE)
     *     Documentation</a>
     */
    public ApiResponse<DepositResponse> deposit(DepositRequest depositRequest) throws ApiException {
        return fiatApi.deposit(depositRequest);
    }

    /**
     * Fiat Withdraw(WITHDRAW) Submit withdraw request, in this version, we only support BRL
     * withdrawal via bank_transfer. You need to call this api first, and call query order detail
     * api in a loop to get the status of the order until this order is successful. Before calling
     * this api, please make sure you have already completed your KYC or KYB, and already activated
     * your fiat service on our website. you need to bind your bank account on web/app before using
     * the corresponding account number Weight: 45000
     *
     * @param fiatWithdrawRequest (required)
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
     * @see <a href="https://developers.binance.com/docs/fiat/rest-api/Fiat-Withdraw">Fiat
     *     Withdraw(WITHDRAW) Documentation</a>
     */
    public ApiResponse<FiatWithdrawResponse> fiatWithdraw(FiatWithdrawRequest fiatWithdrawRequest)
            throws ApiException {
        return fiatApi.fiatWithdraw(fiatWithdrawRequest);
    }

    /**
     * Get Fiat Deposit/Withdraw History (USER_DATA) Get Fiat Deposit/Withdraw History * If
     * beginTime and endTime are not sent, the recent 30-day data will be returned. Weight: 45000
     *
     * @param transactionType 0-buy,1-sell (required)
     * @param beginTime (optional)
     * @param endTime (optional)
     * @param page default 1 (optional)
     * @param rows default 100, max 500 (optional)
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
     *     href="https://developers.binance.com/docs/fiat/rest-api/Get-Fiat-Deposit-Withdraw-History">Get
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
        return fiatApi.getFiatDepositWithdrawHistory(
                transactionType, beginTime, endTime, page, rows, recvWindow);
    }

    /**
     * Get Fiat Payments History (USER_DATA) Get Fiat Deposit/Withdraw History * If beginTime and
     * endTime are not sent, the recent 30-day data will be returned. * paymentMethod: Only when
     * requesting payments history for buy (transactionType&#x3D;0), response contains paymentMethod
     * representing the way of purchase. Now we have: * Cash Balance * Credit Card * Online Banking
     * * Bank Transfer Weight: 1
     *
     * @param transactionType 0-buy,1-sell (required)
     * @param beginTime (optional)
     * @param endTime (optional)
     * @param page default 1 (optional)
     * @param rows default 100, max 500 (optional)
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
     *     href="https://developers.binance.com/docs/fiat/rest-api/Get-Fiat-Payments-History">Get
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
        return fiatApi.getFiatPaymentsHistory(
                transactionType, beginTime, endTime, page, rows, recvWindow);
    }

    /**
     * Get Order Detail(USER_DATA) Get Order Detail Before calling this api, please make sure you
     * have already completed your KYC or KYB, and already activated your fiat service on our
     * website. Weight: 1
     *
     * @param orderNo order id retrieved from the api call of withdrawal (required)
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
     * @see <a href="https://developers.binance.com/docs/fiat/rest-api/Get-Order-Detail">Get Order
     *     Detail(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetOrderDetailResponse> getOrderDetail(String orderNo, Long recvWindow)
            throws ApiException {
        return fiatApi.getOrderDetail(orderNo, recvWindow);
    }
}
