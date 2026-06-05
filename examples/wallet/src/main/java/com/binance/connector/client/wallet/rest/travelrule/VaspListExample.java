package com.binance.connector.client.wallet.rest.travelrule;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.VaspListResponse;

/** API examples for TravelRuleApi */
public class VaspListExample {
    private WalletRestApi api;

    public WalletRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = WalletRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new WalletRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * VASP list (for local entities that require travel rule) (supporting network) (USER_DATA)
     *
     * <p>Fetch the VASP list for local entities. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void vaspListExample() throws ApiException {
        Long recvWindow = 5000L;
        ApiResponse<VaspListResponse> response = getApi().vaspList(recvWindow);
        System.out.println(response.getData());
    }
}
