package com.binance.connector.client.c2c.rest.api;

import com.binance.connector.client.c2c.rest.C2cRestApiUtil;
import com.binance.connector.client.c2c.rest.model.GetC2CTradeHistoryResponse;
import com.binance.connector.client.c2c.rest.model.TradeType;
import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;

public class C2cRestApi {

    private final DefaultApi defaultApi;

    public C2cRestApi(ClientConfiguration configuration) {
        this(C2cRestApiUtil.getDefaultClient(configuration));
    }

    public C2cRestApi(ApiClient apiClient) {
        this.defaultApi = new DefaultApi(apiClient);
    }

    /**
     * Get C2C Trade History (USER_DATA) Get C2C Trade History Weight(IP): 1 Security Type:
     * USER_DATA Notes: - The max interval between &#x60;startTimestamp&#x60; and
     * &#x60;endTimestamp&#x60; is 30 days. - If &#x60;startTimestamp&#x60; and
     * &#x60;endTimestamp&#x60; are not sent, the recent 30 days&#39; data is returned. - You can
     * only view data from the past 6 months. For all C2C orders, check
     * &#x60;https://c2c.binance.com/en/fiatOrder&#x60;.
     *
     * @param tradeType Trade side filter (optional)
     * @param startTimestamp (optional)
     * @param endTimestamp (optional)
     * @param page Page number (optional)
     * @param rows Number of records per page (optional)
     * @return ApiResponse&lt;GetC2CTradeHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get C2C Trade History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-c2-c/api/rest-api/~#get-c2-ctrade-history">Get
     *     C2C Trade History (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetC2CTradeHistoryResponse> getC2CTradeHistory(
            TradeType tradeType, Long startTimestamp, Long endTimestamp, Long page, Long rows)
            throws ApiException {
        return defaultApi.getC2CTradeHistory(tradeType, startTimestamp, endTimestamp, page, rows);
    }
}
