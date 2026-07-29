package com.binance.connector.client.rebate.rest.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.rebate.rest.RebateRestApiUtil;
import com.binance.connector.client.rebate.rest.api.RebateRestApi;
import com.binance.connector.client.rebate.rest.model.GetSpotRebateHistoryRecordsResponse;
import java.io.IOException;

/** API examples for DefaultApi */
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
     * <p>Get Spot Rebate History Records Weight(UID): 12000 Security Type: USER_DATA Notes: - The
     * max interval between &#x60;startTime&#x60; and &#x60;endTime&#x60; is 30 days. - If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, the recent 7 days&#39; data will
     * be returned. - The earliest supported &#x60;startTime&#x60; is June 10, 2020. - Return up to
     * 200 records per request.
     *
     * @throws ApiException if the Api call fails
     */
    public void getSpotRebateHistoryRecordsExample() throws ApiException, IOException {
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long page = 1L;
        Long recvWindow = 5000L;
        ApiResponse<GetSpotRebateHistoryRecordsResponse> response =
                getApi().getSpotRebateHistoryRecords(startTime, endTime, page, recvWindow);
        System.out.println(response.getData());
    }
}
