package com.binance.connector.client.sub_account.rest.accountmanagement;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.CreateAVirtualSubAccountRequest;
import com.binance.connector.client.sub_account.rest.model.CreateAVirtualSubAccountResponse;
import java.io.IOException;

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
     * <p>Create a Virtual Sub-account Weight(IP): 1 Security Type: USER_DATA Notes: - This request
     * generates a virtual sub-account under your master account. - The API key used to call this
     * endpoint must have the &#x60;trade&#x60; option enabled.
     *
     * @throws ApiException if the Api call fails
     */
    public void createAVirtualSubAccountExample() throws ApiException, IOException {
        CreateAVirtualSubAccountRequest createAVirtualSubAccountRequest =
                new CreateAVirtualSubAccountRequest();
        createAVirtualSubAccountRequest.subAccountString("testSubAccount");
        ApiResponse<CreateAVirtualSubAccountResponse> response =
                getApi().createAVirtualSubAccount(createAVirtualSubAccountRequest);
        System.out.println(response.getData());
    }
}
