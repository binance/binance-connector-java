package com.binance.connector.client.wallet.rest.travelrule;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.GetRegionListResponse;

/** API examples for TravelRuleApi */
public class GetRegionListExample {
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
     * Get Region List (USER_DATA)
     *
     * <p>Query the active region/city list for a given country. Currently, only supports AU entity.
     * Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void getRegionListExample() throws ApiException {
        String countryCode = "";
        ApiResponse<GetRegionListResponse> response = getApi().getRegionList(countryCode);
        System.out.println(response.getData());
    }
}
