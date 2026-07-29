package com.binance.connector.client.mining.rest.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.mining.rest.MiningRestApiUtil;
import com.binance.connector.client.mining.rest.api.MiningRestApi;
import com.binance.connector.client.mining.rest.model.HashrateResaleRequestRequest;
import com.binance.connector.client.mining.rest.model.HashrateResaleRequestResponse;
import java.io.IOException;

/** API examples for DefaultApi */
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
     * Hashrate Resale Request (USER_DATA)
     *
     * <p>Hashrate Resale Request Weight(IP): 1 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void hashrateResaleRequestExample() throws ApiException, IOException {
        HashrateResaleRequestRequest hashrateResaleRequestRequest =
                new HashrateResaleRequestRequest();
        hashrateResaleRequestRequest.userName("test");
        hashrateResaleRequestRequest.algo("sha256");
        hashrateResaleRequestRequest.endDate(1770736694138L);
        hashrateResaleRequestRequest.startDate(1770736694138L);
        hashrateResaleRequestRequest.toPoolUser("S19pro");
        hashrateResaleRequestRequest.hashRate(100000000L);
        ApiResponse<HashrateResaleRequestResponse> response =
                getApi().hashrateResaleRequest(hashrateResaleRequestRequest);
        System.out.println(response.getData());
    }
}
