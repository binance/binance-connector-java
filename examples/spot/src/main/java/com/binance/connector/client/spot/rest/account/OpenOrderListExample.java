package com.binance.connector.client.spot.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.OpenOrderListResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class OpenOrderListExample {
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
     * Query Open Order lists (USER_DATA)
     *
     * <p>Query Open Order lists Weight(IP): 6 Security Type: USER_DATA Notes: **Data Source:**
     * Memory -&gt; Database
     *
     * @throws ApiException if the Api call fails
     */
    public void openOrderListExample() throws ApiException, IOException {
        Double recvWindow = 5000d;
        ApiResponse<OpenOrderListResponse> response = getApi().openOrderList(recvWindow);
        System.out.println(response.getData());
    }
}
