package com.binance.connector.client.rebate.rest.rebate;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.rebate.rest.RebateRestApiUtil;
import com.binance.connector.client.rebate.rest.api.RebateRestApi;
import com.binance.connector.client.rebate.rest.model.GetSpotRebateHistoryRecordsResponse;

/** API examples for RebateApi */
public class GetSpotRebateHistoryRecordsExample {
    private RebateRestApi api;

    public RebateRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = RebateRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new RebateRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Get Spot Rebate History Records (USER_DATA)
     *
     * <p>Get Spot Rebate History Records * The max interval between startTime and endTime is 30
     * days. * If startTime and endTime are not sent, the recent 7 days&#39; data will be returned.
     * * The earliest startTime is supported on June 10, 2020 * Return up to 200 records per
     * request. Weight: 12000
     *
     * @throws ApiException if the Api call fails
     */
    public void getSpotRebateHistoryRecordsExample() throws ApiException {
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long page = 1L;
        Long recvWindow = 5000L;
        ApiResponse<GetSpotRebateHistoryRecordsResponse> response =
                getApi().getSpotRebateHistoryRecords(startTime, endTime, page, recvWindow);
        System.out.println(response.getData());
    }
}
