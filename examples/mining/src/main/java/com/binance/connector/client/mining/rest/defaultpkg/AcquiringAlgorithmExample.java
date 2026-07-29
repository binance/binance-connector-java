package com.binance.connector.client.mining.rest.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.mining.rest.MiningRestApiUtil;
import com.binance.connector.client.mining.rest.api.MiningRestApi;
import com.binance.connector.client.mining.rest.model.AcquiringAlgorithmResponse;
import java.io.IOException;

/** API examples for DefaultApi */
public class AcquiringAlgorithmExample {
    private MiningRestApi api;

    public MiningRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = MiningRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new MiningRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Acquiring Algorithm (MARKET_DATA)
     *
     * <p>Acquiring Algorithm Weight(IP): 1 Security Type: MARKET_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void acquiringAlgorithmExample() throws ApiException, IOException {
        ApiResponse<AcquiringAlgorithmResponse> response = getApi().acquiringAlgorithm();
        System.out.println(response.getData());
    }
}
