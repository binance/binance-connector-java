package com.binance.connector.client.sub_account.rest.apimanagement;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.GetIpRestrictionForASubAccountApiKeyResponse;

/** API examples for ApiManagementApi */
public class GetIpRestrictionForASubAccountApiKeyExample {
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
     * Get IP Restriction for a Sub-account API Key (For Master Account) (USER_DATA)
     *
     * <p>Get IP Restriction for a Sub-account API Key Weight: 3000
     *
     * @throws ApiException if the Api call fails
     */
    public void getIpRestrictionForASubAccountApiKeyExample() throws ApiException {
        String email = "sub-account-email@email.com";
        String subAccountApiKey = "";
        Long recvWindow = 5000L;
        ApiResponse<GetIpRestrictionForASubAccountApiKeyResponse> response =
                getApi().getIpRestrictionForASubAccountApiKey(email, subAccountApiKey, recvWindow);
        System.out.println(response.getData());
    }
}
