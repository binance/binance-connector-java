package com.binance.connector.client.rebate.rest.api;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.rebate.rest.RebateRestApiUtil;
import com.binance.connector.client.rebate.rest.model.GetSpotRebateHistoryRecordsResponse;

public class RebateRestApi {

    private final RebateApi rebateApi;

    public RebateRestApi(ClientConfiguration configuration) {
        this(RebateRestApiUtil.getDefaultClient(configuration));
    }

    public RebateRestApi(ApiClient apiClient) {
        this.rebateApi = new RebateApi(apiClient);
    }

    /**
     * Get Spot Rebate History Records (USER_DATA) Get Spot Rebate History Records * The max
     * interval between startTime and endTime is 30 days. * If startTime and endTime are not sent,
     * the recent 7 days&#39; data will be returned. * The earliest startTime is supported on June
     * 10, 2020 * Return up to 200 records per request. Weight: 12000
     *
     * @param startTime (optional)
     * @param endTime (optional)
     * @param page Default 1 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetSpotRebateHistoryRecordsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Spot Rebate History Records </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/rebate/rest-api/Get-Spot-Rebate-History-Records">Get
     *     Spot Rebate History Records (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetSpotRebateHistoryRecordsResponse> getSpotRebateHistoryRecords(
            Long startTime, Long endTime, Long page, Long recvWindow) throws ApiException {
        return rebateApi.getSpotRebateHistoryRecords(startTime, endTime, page, recvWindow);
    }
}
