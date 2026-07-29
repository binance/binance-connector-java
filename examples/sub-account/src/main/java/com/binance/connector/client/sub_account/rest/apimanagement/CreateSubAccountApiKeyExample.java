package com.binance.connector.client.sub_account.rest.apimanagement;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.CreateSubAccountApiKeyRequest;
import com.binance.connector.client.sub_account.rest.model.CreateSubAccountApiKeyResponse;
import java.io.IOException;

/** API examples for ApiManagementApi */
public class CreateSubAccountApiKeyExample {
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
     * Create Sub-account API Key (For Master Account) (USER_DATA)
     *
     * <p>Create a new API Key for a sub-account. Weight(UID): 3000 Security Type: USER_DATA Notes:
     * - &#x60;status&#x3D;2&#x60; requires &#x60;ipAddress&#x60; - &#x60;status&#x3D;3&#x60;
     * requires &#x60;thirdPartyName&#x60; - Asset Sub Account is not supported - The caller must
     * pass the KYC IP restriction check
     *
     * @throws ApiException if the Api call fails
     */
    public void createSubAccountApiKeyExample() throws ApiException, IOException {
        CreateSubAccountApiKeyRequest createSubAccountApiKeyRequest =
                new CreateSubAccountApiKeyRequest();
        createSubAccountApiKeyRequest.email("123@test.com");
        createSubAccountApiKeyRequest.apiName("myKey");
        createSubAccountApiKeyRequest.status(2L);
        ApiResponse<CreateSubAccountApiKeyResponse> response =
                getApi().createSubAccountApiKey(createSubAccountApiKeyRequest);
        System.out.println(response.getData());
    }
}
