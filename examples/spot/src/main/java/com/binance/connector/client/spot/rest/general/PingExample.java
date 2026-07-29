package com.binance.connector.client.spot.rest.general;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import java.io.IOException;

/** API examples for GeneralApi */
public class PingExample {
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
     * Test connectivity
     *
     * <p>Test connectivity to the Rest API. Weight(IP): 1 Security Type: NONE
     *
     * @throws ApiException if the Api call fails
     */
    public void pingExample() throws ApiException, IOException {
        getApi().ping();
    }
}
