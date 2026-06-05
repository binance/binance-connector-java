package com.binance.connector.client.spot.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.MyAllocationsResponse;

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
     * Query Allocations
     *
     * <p>Retrieves allocations resulting from SOR order placement. Weight: 20
     *
     * @throws ApiException if the Api call fails
     */
    public void myAllocationsExample() throws ApiException {
        String symbol = "BNBUSDT";
        Long startTime = 1735693200000L;
        Long endTime = 1735693200000L;
        Integer fromAllocationId = 1;
        Integer limit = 500;
        Long orderId = 1L;
        Double recvWindow = 5000.0d;
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
