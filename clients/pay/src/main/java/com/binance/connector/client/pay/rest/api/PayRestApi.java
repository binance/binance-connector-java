package com.binance.connector.client.pay.rest.api;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.pay.rest.PayRestApiUtil;
import com.binance.connector.client.pay.rest.model.GetPayTradeHistoryResponse;

public class PayRestApi {

    private final DefaultApi defaultApi;

    public PayRestApi(ClientConfiguration configuration) {
        this(PayRestApiUtil.getDefaultClient(configuration));
    }

    public PayRestApi(ApiClient apiClient) {
        this.defaultApi = new DefaultApi(apiClient);
    }

    /**
     * Get Pay Trade History Get Pay Trade History Weight(UID): 3000 Notes: - If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, the recent 90 days&#39; data will
     * be returned. - The max interval between &#x60;startTime&#x60; and &#x60;endTime&#x60; is 90
     * days. - Support for querying orders within the last 18 months. - &#x60;payerInfo&#x60; and
     * &#x60;receiverInfo&#x60; return different fields in different &#x60;orderType&#x60; values: -
     * C2C sender: &#x60;payerInfo&#x3D;binanceId&#x60;; &#x60;receiverInfo&#x3D;name,
     * binanceId/accountId/email/countryCode/phoneNumber/mobileCode&#x60; (based on user input). -
     * C2C receiver: &#x60;payerInfo&#x3D;name&#x60;; &#x60;receiverInfo&#x3D;binanceId&#x60;. -
     * CRYPTO_BOX sender: &#x60;payerInfo&#x3D;binanceId&#x60;; &#x60;receiverInfo&#x3D;name&#x60;
     * (always &#x60;\&quot;Crypto Box\&quot;&#x60;). - CRYPTO_BOX receiver:
     * &#x60;payerInfo&#x3D;name&#x60;; &#x60;receiverInfo&#x3D;binanceId&#x60;. - PAY sender:
     * &#x60;payerInfo&#x3D;binanceId&#x60;; &#x60;receiverInfo&#x3D;name&#x60;. - PAY receiver:
     * &#x60;payerInfo&#x3D;name&#x60;; &#x60;receiverInfo&#x3D;binanceId, name&#x60;. - PAY_REFUND
     * sender: &#x60;payerInfo&#x3D;binanceId, name&#x60;; &#x60;receiverInfo&#x3D;name,
     * accountId&#x60;. - PAY_REFUND receiver: &#x60;payerInfo&#x3D;name&#x60;;
     * &#x60;receiverInfo&#x3D;binanceId&#x60;. - PAYOUT sender: &#x60;payerInfo&#x3D;binanceId,
     * name&#x60;; &#x60;receiverInfo&#x3D;name, accountId&#x60;. - PAYOUT receiver:
     * &#x60;payerInfo&#x3D;name&#x60;; &#x60;receiverInfo&#x3D;binanceId&#x60;. - CRYPTO_BOX_RF
     * receiver: &#x60;payerInfo&#x3D;name&#x60; (always &#x60;\&quot;Crypto Box\&quot;&#x60;);
     * &#x60;receiverInfo&#x3D;binanceId&#x60;. - REMITTANCE sender:
     * &#x60;payerInfo&#x3D;binanceId&#x60;; &#x60;receiverInfo&#x3D;name, institutionName,
     * cardNumber, digitalWalletId&#x60;.
     *
     * @param startTime Start time in milliseconds. (optional)
     * @param endTime End time in milliseconds. (optional)
     * @param limit Number of records to return. (optional)
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-pay/api/rest-api/~#get-pay-trade-history">Get
     *     Pay Trade History Documentation</a>
     */
    public ApiResponse<GetPayTradeHistoryResponse> getPayTradeHistory(
            Long startTime, Long endTime, Long limit, Long recvWindow) throws ApiException {
        return defaultApi.getPayTradeHistory(startTime, endTime, limit, recvWindow);
    }
}
