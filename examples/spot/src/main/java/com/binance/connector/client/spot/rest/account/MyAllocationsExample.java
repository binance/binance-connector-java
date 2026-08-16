package com.binance.connector.client.spot.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.MyAllocationsResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class MyAllocationsExample {
    private SpotRestApi api;

    public SpotRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = SpotRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new SpotRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Query Allocations (USER_DATA)
     *
     * <p>Retrieves allocations resulting from SOR order placement. Weight(IP): 20 Security Type:
     * USER_DATA Notes: **Data Source:** Database\&quot; Supported parameter combinations:
     * Parameters | Response | ------------------------------------------- | -------- |
     * &#x60;symbol&#x60; | allocations from oldest to newest | &#x60;symbol&#x60; +
     * &#x60;startTime&#x60; | oldest allocations since &#x60;startTime&#x60; | &#x60;symbol&#x60; +
     * &#x60;endTime&#x60; | newest allocations until &#x60;endTime&#x60; | &#x60;symbol&#x60; +
     * &#x60;startTime&#x60; + &#x60;endTime&#x60; | allocations within the time range |
     * &#x60;symbol&#x60; + &#x60;fromAllocationId&#x60; | allocations by allocation ID |
     * &#x60;symbol&#x60; + &#x60;orderId&#x60; | allocations related to an order starting with
     * oldest | &#x60;symbol&#x60; + &#x60;orderId&#x60; + &#x60;fromAllocationId&#x60; |
     * allocations related to an order by allocation ID | **Note:** The time between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; can&#39;t be longer than 24 hours.
     *
     * @throws ApiException if the Api call fails
     */
    public void myAllocationsExample() throws ApiException, IOException {
        String symbol = "BTCUSDT";
        Long startTime = 1735693200000L;
        Long endTime = 1735693200000L;
        Integer fromAllocationId = 0;
        Integer limit = 1;
        Long orderId = 1L;
        Double recvWindow = 5000d;
        ApiResponse<MyAllocationsResponse> response =
                getApi().myAllocations(
                                symbol,
                                startTime,
                                endTime,
                                fromAllocationId,
                                limit,
                                orderId,
                                recvWindow);
        System.out.println(response.getData());
    }
}
