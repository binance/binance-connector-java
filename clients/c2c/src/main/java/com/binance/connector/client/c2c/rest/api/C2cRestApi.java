package com.binance.connector.client.c2c.rest.api;

import com.binance.connector.client.c2c.rest.C2cRestApiUtil;
import com.binance.connector.client.c2c.rest.model.GetC2CTradeHistoryResponse;
import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;

public class C2cRestApi {

    private final C2CApi c2CApi;

    public C2cRestApi(ClientConfiguration configuration) {
        this(C2cRestApiUtil.getDefaultClient(configuration));
    }

    public C2cRestApi(ApiClient apiClient) {
        this.c2CApi = new C2CApi(apiClient);
    }

    /**
     * Get C2C Trade History (USER_DATA) Get C2C Trade History * The max interval between
     * startTimestamp and endTimestamp is 30 days. * If startTimestamp and endTimestamp are not
     * sent, the recent 30 days&#39; data will be returned. * You can only view data from the past 6
     * months. To see all C2C orders, please check https://c2c.binance.com/en/fiatOrder Weight: 1
     *
     * @param tradeType BUY, SELL (optional)
     * @param startTimestamp (optional)
     * @param endTimestamp (optional)
     * @param page Default 1 (optional)
     * @param rows default 100, max 100 (optional)
     * @param recvWindow (optional)
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
     * @see <a href="https://developers.binance.com/docs/c2c/rest-api/Get-C2C-Trade-History">Get C2C
     *     Trade History (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetC2CTradeHistoryResponse> getC2CTradeHistory(
            String tradeType,
            Long startTimestamp,
            Long endTimestamp,
            Long page,
            Long rows,
            Long recvWindow)
            throws ApiException {
        return c2CApi.getC2CTradeHistory(
                tradeType, startTimestamp, endTimestamp, page, rows, recvWindow);
    }
}
