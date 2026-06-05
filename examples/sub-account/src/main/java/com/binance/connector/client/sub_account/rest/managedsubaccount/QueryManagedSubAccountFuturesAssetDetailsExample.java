package com.binance.connector.client.sub_account.rest.managedsubaccount;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.QueryManagedSubAccountFuturesAssetDetailsResponse;

/** API examples for ManagedSubAccountApi */
public class QueryManagedSubAccountFuturesAssetDetailsExample {
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
     * Query Managed Sub-account Futures Asset Details (For Investor Master Account) (USER_DATA)
     *
     * <p>Investor can use this api to query managed sub account futures asset details Weight: 60
     *
     * @throws ApiException if the Api call fails
     */
    public void queryManagedSubAccountFuturesAssetDetailsExample() throws ApiException {
        String email = "sub-account-email@email.com";
        String accountType = "";
        ApiResponse<QueryManagedSubAccountFuturesAssetDetailsResponse> response =
                getApi().queryManagedSubAccountFuturesAssetDetails(email, accountType);
        System.out.println(response.getData());
    }
}
