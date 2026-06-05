package com.binance.connector.client.sub_account.rest.accountmanagement;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.CreateAVirtualSubAccountRequest;
import com.binance.connector.client.sub_account.rest.model.CreateAVirtualSubAccountResponse;

/** API examples for AccountManagementApi */
public class CreateAVirtualSubAccountExample {
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
     * Create a Virtual Sub-account (For Master Account) (USER_DATA)
     *
     * <p>Create a Virtual Sub-account * This request will generate a virtual sub account under your
     * master account. * You need to enable \&quot;trade\&quot; option for the API Key which
     * requests this endpoint. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void createAVirtualSubAccountExample() throws ApiException {
        CreateAVirtualSubAccountRequest createAVirtualSubAccountRequest =
                new CreateAVirtualSubAccountRequest();
        createAVirtualSubAccountRequest.subAccountString("");
        ApiResponse<CreateAVirtualSubAccountResponse> response =
                getApi().createAVirtualSubAccount(createAVirtualSubAccountRequest);
        System.out.println(response.getData());
    }
}
