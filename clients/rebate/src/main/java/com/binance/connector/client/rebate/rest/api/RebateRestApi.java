package com.binance.connector.client.rebate.rest.api;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.rebate.rest.RebateRestApiUtil;
import com.binance.connector.client.rebate.rest.model.GetSpotRebateHistoryRecordsResponse;

public class RebateRestApi {

    private final DefaultApi defaultApi;

    public RebateRestApi(ClientConfiguration configuration) {
        this(RebateRestApiUtil.getDefaultClient(configuration));
    }

    public RebateRestApi(ApiClient apiClient) {
        this.defaultApi = new DefaultApi(apiClient);
    }

    /**
     * Get Spot Rebate History Records (USER_DATA) Get Spot Rebate History Records Weight(UID):
     * 12000 Security Type: USER_DATA Notes: - The max interval between &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; is 30 days. - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not
     * sent, the recent 7 days&#39; data will be returned. - The earliest supported
     * &#x60;startTime&#x60; is June 10, 2020. - Return up to 200 records per request.
     *
     * @param startTime Start time in milliseconds. (optional)
     * @param endTime End time in milliseconds. (optional)
     * @param page Page number. (optional)
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-rebate/api/rest-api/~#get-spot-rebate-history-records">Get
     *     Spot Rebate History Records (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetSpotRebateHistoryRecordsResponse> getSpotRebateHistoryRecords(
            Long startTime, Long endTime, Long page, Long recvWindow) throws ApiException {
        return defaultApi.getSpotRebateHistoryRecords(startTime, endTime, page, recvWindow);
    }
}
