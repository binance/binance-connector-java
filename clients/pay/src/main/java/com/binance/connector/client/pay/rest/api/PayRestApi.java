package com.binance.connector.client.pay.rest.api;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.pay.rest.PayRestApiUtil;
import com.binance.connector.client.pay.rest.model.GetPayTradeHistoryResponse;

public class PayRestApi {

    private final PayApi payApi;

    public PayRestApi(ClientConfiguration configuration) {
        this(PayRestApiUtil.getDefaultClient(configuration));
    }

    public PayRestApi(ApiClient apiClient) {
        this.payApi = new PayApi(apiClient);
    }

    /**
     * Get Pay Trade History Get Pay Trade History * If startTime and endTime are not sent, the
     * recent 90 days&#39; data will be returned. * The max interval between startTime and endTime
     * is 90 days. * Support for querying orders within the last 18 months. * For payerInfo and
     * receiverInfo，there are different return values in different orderTypes. * Sender&#39;s
     * perspective when orderType is C2C * payerInfo : binanceId * receiverInfo : name,
     * binanceId/accountId/email/countryCode/phoneNumber/mobileCode (based on user input) *
     * Receiver&#39;s perspective when orderType is C2C * payerInfo : name, accountId * receiverInfo
     * : binanceId * Sender&#39;s perspective when orderType is CRYPTO_BOX * payerInfo : binanceId *
     * receiverInfo : name(the value is always \&quot;Crypto Box\&quot;) * Receiver&#39;s
     * perspective when orderType is CRYPTO_BOX * payerInfo : name, accountId * receiverInfo :
     * binanceId * Sender&#39;s perspective when orderType is PAY * payerInfo : binanceId *
     * receiverInfo : name * Receiver&#39;s perspective when orderType is PAY * payerInfo : name,
     * accountId * receiverInfo : binanceId, name * Sender&#39;s perspective when orderType is
     * PAY_REFUND * payerInfo : binanceId, name * receiverInfo : name, accountId * Receiver&#39;s
     * perspective when orderType is PAY_REFUND * payerInfo : name * receiverInfo : binanceId *
     * Sender&#39;s perspective when orderType is PAYOUT * payerInfo : binanceId, name *
     * receiverInfo : name, accountId * Receiver&#39;s perspective when orderType is PAYOUT *
     * payerInfo : name * receiverInfo : binanceId * Receiver&#39;s perspective when orderType is
     * CRYPTO_BOX_RF * payerInfo : name(the value is always \&quot;Crypto Box\&quot;) * receiverInfo
     * : binanceId * Sender&#39;s perspective when orderType is REMITTANCE * payerInfo : binanceId *
     * receiverInfo : name, institutionName, cardNumber, digitalWalletId Weight: 3000
     *
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit default 100, max 100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetPayTradeHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Pay Trade History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a href="https://developers.binance.com/docs/pay/rest-api/Get-Pay-Trade-History">Get Pay
     *     Trade History Documentation</a>
     */
    public ApiResponse<GetPayTradeHistoryResponse> getPayTradeHistory(
            Long startTime, Long endTime, Long limit, Long recvWindow) throws ApiException {
        return payApi.getPayTradeHistory(startTime, endTime, limit, recvWindow);
    }
}
