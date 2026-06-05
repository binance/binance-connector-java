package com.binance.connector.client.mining.rest.mining;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.mining.rest.MiningRestApiUtil;
import com.binance.connector.client.mining.rest.api.MiningRestApi;
import com.binance.connector.client.mining.rest.model.HashrateResaleRequestRequest;
import com.binance.connector.client.mining.rest.model.HashrateResaleRequestResponse;

/** API examples for MiningApi */
public class HashrateResaleRequestExample {
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
     * Hashrate Resale Request(USER_DATA)
     *
     * <p>Hashrate Resale Request Weight: 5
     *
     * @throws ApiException if the Api call fails
     */
    public void hashrateResaleRequestExample() throws ApiException {
        HashrateResaleRequestRequest hashrateResaleRequestRequest =
                new HashrateResaleRequestRequest();
        hashrateResaleRequestRequest.userName("");
        hashrateResaleRequestRequest.algo("");
        hashrateResaleRequestRequest.endDate(0L);
        hashrateResaleRequestRequest.startDate(0L);
        hashrateResaleRequestRequest.toPoolUser("");
        hashrateResaleRequestRequest.hashRate(0L);
        ApiResponse<HashrateResaleRequestResponse> response =
                getApi().hashrateResaleRequest(hashrateResaleRequestRequest);
        System.out.println(response.getData());
    }
}
