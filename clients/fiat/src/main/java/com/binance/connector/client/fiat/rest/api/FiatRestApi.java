package com.binance.connector.client.fiat.rest.api;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.fiat.rest.FiatRestApiUtil;
import com.binance.connector.client.fiat.rest.model.GetFiatDepositWithdrawHistoryResponse;
import com.binance.connector.client.fiat.rest.model.GetFiatPaymentsHistoryResponse;

public class FiatRestApi {

    private final FiatApi fiatApi;

    public FiatRestApi(ClientConfiguration configuration) {
        this(FiatRestApiUtil.getDefaultClient(configuration));
    }

    public FiatRestApi(ApiClient apiClient) {
        this.fiatApi = new FiatApi(apiClient);
    }

    /**
     * Get Fiat Deposit/Withdraw History (USER_DATA) Get Fiat Deposit/Withdraw History * If
     * beginTime and endTime are not sent, the recent 30-day data will be returned. Weight: 90000
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
}
