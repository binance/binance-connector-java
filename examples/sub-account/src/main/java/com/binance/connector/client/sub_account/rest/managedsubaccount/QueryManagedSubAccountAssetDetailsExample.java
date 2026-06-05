package com.binance.connector.client.sub_account.rest.managedsubaccount;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.QueryManagedSubAccountAssetDetailsResponse;

/** API examples for ManagedSubAccountApi */
public class QueryManagedSubAccountAssetDetailsExample {
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
     * Query Managed Sub-account Asset Details (For Investor Master Account) (USER_DATA)
     *
     * <p>Query Managed Sub-account Asset Details Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void queryManagedSubAccountAssetDetailsExample() throws ApiException {
        String email = "sub-account-email@email.com";
        Long recvWindow = 5000L;
        ApiResponse<QueryManagedSubAccountAssetDetailsResponse> response =
                getApi().queryManagedSubAccountAssetDetails(email, recvWindow);
        System.out.println(response.getData());
    }
}
