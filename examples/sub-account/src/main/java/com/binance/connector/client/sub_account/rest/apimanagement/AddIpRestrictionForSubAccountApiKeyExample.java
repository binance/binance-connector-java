package com.binance.connector.client.sub_account.rest.apimanagement;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.AddIpRestrictionForSubAccountApiKeyRequest;
import com.binance.connector.client.sub_account.rest.model.AddIpRestrictionForSubAccountApiKeyResponse;
import java.io.IOException;

/** API examples for ApiManagementApi */
public class AddIpRestrictionForSubAccountApiKeyExample {
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
     * Add IP Restriction for Sub-Account API key (For Master Account) (USER_DATA)
     *
     * <p>Add IP Restriction for Sub-Account API key Weight(UID): 3000 Security Type: USER_DATA
     * Notes: - You need to enable Enable Spot &amp; Margin Trading option for the api key which
     * requests this endpoint
     *
     * @throws ApiException if the Api call fails
     */
    public void addIpRestrictionForSubAccountApiKeyExample() throws ApiException, IOException {
        AddIpRestrictionForSubAccountApiKeyRequest addIpRestrictionForSubAccountApiKeyRequest =
                new AddIpRestrictionForSubAccountApiKeyRequest();
        addIpRestrictionForSubAccountApiKeyRequest.email("123@test.com");
        addIpRestrictionForSubAccountApiKeyRequest.subAccountApiKey(
                "k5V49ldtn4tszj6W3hystegdfvmGbqDzjmkCtpTvC0G74WhK7yd4rfCTo4lShf");
        addIpRestrictionForSubAccountApiKeyRequest.status(1L);
        ApiResponse<AddIpRestrictionForSubAccountApiKeyResponse> response =
                getApi().addIpRestrictionForSubAccountApiKey(
                                addIpRestrictionForSubAccountApiKeyRequest);
        System.out.println(response.getData());
    }
}
