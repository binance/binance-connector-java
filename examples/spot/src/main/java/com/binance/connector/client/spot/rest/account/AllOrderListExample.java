package com.binance.connector.client.spot.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.AllOrderListResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class AllOrderListExample {
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
     * Query all Order lists (USER_DATA)
     *
     * <p>Retrieves all order lists based on provided optional parameters. Note that the time
     * between &#x60;startTime&#x60; and &#x60;endTime&#x60; can&#39;t be longer than 24 hours.
     * Weight(IP): 20 Security Type: USER_DATA Notes: **Data Source:** Database
     *
     * @throws ApiException if the Api call fails
     */
    public void allOrderListExample() throws ApiException, IOException {
        Long fromId = 1L;
        Long startTime = 1735693200000L;
        Long endTime = 1735693200000L;
        Integer limit = 1;
        Double recvWindow = 5000d;
        ApiResponse<AllOrderListResponse> response =
                getApi().allOrderList(fromId, startTime, endTime, limit, recvWindow);
        System.out.println(response.getData());
    }
}
