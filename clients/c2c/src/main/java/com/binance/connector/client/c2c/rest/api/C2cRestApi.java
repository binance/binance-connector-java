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
     * Get C2C Trade History (USER_DATA) Get C2C Trade History * The max interval between startTime
     * and endTime is 30 days. * If startTime and endTime are not sent, the recent 7 days&#39; data
     * will be returned. * The earliest startTime is supported on June 10, 2020 * Return up to 200
     * records per request. Weight: 1
     *
     * @param startTime (optional)
     * @param endTime (optional)
     * @param page Default 1 (optional)
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
            Long startTime, Long endTime, Long page, Long recvWindow) throws ApiException {
        return c2CApi.getC2CTradeHistory(startTime, endTime, page, recvWindow);
    }
}
