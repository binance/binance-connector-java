package com.binance.connector.client.mining.rest.mining;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.mining.rest.MiningRestApiUtil;
import com.binance.connector.client.mining.rest.api.MiningRestApi;
import com.binance.connector.client.mining.rest.model.CancelHashrateResaleConfigurationRequest;
import com.binance.connector.client.mining.rest.model.CancelHashrateResaleConfigurationResponse;

/** API examples for MiningApi */
public class CancelHashrateResaleConfigurationExample {
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
     * Cancel hashrate resale configuration(USER_DATA)
     *
     * <p>Weight: 5
     *
     * @throws ApiException if the Api call fails
     */
    public void cancelHashrateResaleConfigurationExample() throws ApiException {
        CancelHashrateResaleConfigurationRequest cancelHashrateResaleConfigurationRequest =
                new CancelHashrateResaleConfigurationRequest();
        cancelHashrateResaleConfigurationRequest.configId(1L);
        cancelHashrateResaleConfigurationRequest.userName("");
        ApiResponse<CancelHashrateResaleConfigurationResponse> response =
                getApi().cancelHashrateResaleConfiguration(
                                cancelHashrateResaleConfigurationRequest);
        System.out.println(response.getData());
    }
}
