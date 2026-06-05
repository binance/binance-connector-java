package com.binance.connector.client.sub_account.rest.managedsubaccount;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.QueryManagedSubAccountListResponse;

/** API examples for ManagedSubAccountApi */
public class QueryManagedSubAccountListExample {
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
     * Query Managed Sub-account List (For Investor) (USER_DATA)
     *
     * <p>Get investor&#39;s managed sub-account list. Weight: 60
     *
     * @throws ApiException if the Api call fails
     */
    public void queryManagedSubAccountListExample() throws ApiException {
        String email = "";
        Long page = 1L;
        Long limit = 1L;
        Long recvWindow = 5000L;
        ApiResponse<QueryManagedSubAccountListResponse> response =
                getApi().queryManagedSubAccountList(email, page, limit, recvWindow);
        System.out.println(response.getData());
    }
}
