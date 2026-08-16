package com.binance.connector.client.spot.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.MyFiltersResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class MyFiltersExample {
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
     * Query relevant filters (USER_DATA)
     *
     * <p>Retrieves the list of filters relevant to an account on a given symbol. This is the only
     * endpoint that shows if an account has &#x60;MAX_ASSET&#x60; filters applied to it.
     * Weight(IP): 40 Security Type: USER_DATA Notes: **Data Source:** Memory
     *
     * @throws ApiException if the Api call fails
     */
    public void myFiltersExample() throws ApiException, IOException {
        String symbol = "BNBUSDT";
        Double recvWindow = 5000d;
        ApiResponse<MyFiltersResponse> response = getApi().myFilters(symbol, recvWindow);
        System.out.println(response.getData());
    }
}
