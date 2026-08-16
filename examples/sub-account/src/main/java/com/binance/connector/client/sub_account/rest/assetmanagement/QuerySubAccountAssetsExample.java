package com.binance.connector.client.sub_account.rest.assetmanagement;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.QuerySubAccountAssetsResponse;
import java.io.IOException;

/** API examples for AssetManagementApi */
public class QuerySubAccountAssetsExample {
    private SubAccountRestApi api;

    public SubAccountRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    SubAccountRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new SubAccountRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Query Sub-account Assets (For Master Account) (USER_DATA)
     *
     * <p>Fetch sub-account assets Weight(UID): 60 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void querySubAccountAssetsExample() throws ApiException, IOException {
        String email = "123@test.com";
        Long recvWindow = 5000L;
        ApiResponse<QuerySubAccountAssetsResponse> response =
                getApi().querySubAccountAssets(email, recvWindow);
        System.out.println(response.getData());
    }
}
