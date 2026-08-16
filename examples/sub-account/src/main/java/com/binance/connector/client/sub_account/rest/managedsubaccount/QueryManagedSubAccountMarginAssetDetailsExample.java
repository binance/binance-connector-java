package com.binance.connector.client.sub_account.rest.managedsubaccount;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.QueryManagedSubAccountMarginAssetDetailsResponse;
import java.io.IOException;

/** API examples for ManagedSubAccountApi */
public class QueryManagedSubAccountMarginAssetDetailsExample {
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
     * Query Managed Sub-account Margin Asset Details (For Investor Master Account) (USER_DATA)
     *
     * <p>Investor can use this api to query managed sub account margin asset details Weight(IP): 1
     * Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void queryManagedSubAccountMarginAssetDetailsExample() throws ApiException, IOException {
        String email = "abc@test.com";
        String accountType = "MARGIN";
        ApiResponse<QueryManagedSubAccountMarginAssetDetailsResponse> response =
                getApi().queryManagedSubAccountMarginAssetDetails(email, accountType);
        System.out.println(response.getData());
    }
}
