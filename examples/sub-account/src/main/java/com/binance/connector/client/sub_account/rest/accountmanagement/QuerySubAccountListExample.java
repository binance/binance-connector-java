package com.binance.connector.client.sub_account.rest.accountmanagement;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.QuerySubAccountListResponse;

/** API examples for AccountManagementApi */
public class QuerySubAccountListExample {
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
     * Query Sub-account List (For Master Account) (USER_DATA)
     *
     * <p>Query Sub-account List Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void querySubAccountListExample() throws ApiException {
        String email = "";
        String isFreeze = "";
        Long page = 1L;
        Long limit = 1L;
        Long recvWindow = 5000L;
        ApiResponse<QuerySubAccountListResponse> response =
                getApi().querySubAccountList(email, isFreeze, page, limit, recvWindow);
        System.out.println(response.getData());
    }
}
