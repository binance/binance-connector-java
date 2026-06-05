package com.binance.connector.client.mining.rest.mining;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.mining.rest.MiningRestApiUtil;
import com.binance.connector.client.mining.rest.api.MiningRestApi;
import com.binance.connector.client.mining.rest.model.AccountListResponse;

/** API examples for MiningApi */
public class AccountListExample {
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
     * Account List(USER_DATA)
     *
     * <p>Query Account List Weight: 5
     *
     * @throws ApiException if the Api call fails
     */
    public void accountListExample() throws ApiException {
        String algo = "";
        String userName = "";
        Long recvWindow = 5000L;
        ApiResponse<AccountListResponse> response =
                getApi().accountList(algo, userName, recvWindow);
        System.out.println(response.getData());
    }
}
