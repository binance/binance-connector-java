package com.binance.connector.client.sub_account.rest.apimanagement;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.ModifySubAccountApiKeyPermissionRequest;
import com.binance.connector.client.sub_account.rest.model.ModifySubAccountApiKeyPermissionResponse;
import java.io.IOException;

/** API examples for ApiManagementApi */
public class ModifySubAccountApiKeyPermissionExample {
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
     * Modify Sub-account API Key Permission (For Master Account) (USER_DATA)
     *
     * <p>Modify the trading permissions of a sub-account API Key. Weight(UID): 3000 Security Type:
     * USER_DATA Notes: - Portfolio Margin Retail User is not supported - Asset Sub Account is not
     * supported - The caller must pass the KYC IP restriction check
     *
     * @throws ApiException if the Api call fails
     */
    public void modifySubAccountApiKeyPermissionExample() throws ApiException, IOException {
        ModifySubAccountApiKeyPermissionRequest modifySubAccountApiKeyPermissionRequest =
                new ModifySubAccountApiKeyPermissionRequest();
        modifySubAccountApiKeyPermissionRequest.email("123@test.com");
        modifySubAccountApiKeyPermissionRequest.subAccountApiKey(
                "k5V49ldtn4tszj6W3hystegdfvmGbqDzjmkCtpTvC0G74WhK7yd4rfCTo4lShf");
        ApiResponse<ModifySubAccountApiKeyPermissionResponse> response =
                getApi().modifySubAccountApiKeyPermission(modifySubAccountApiKeyPermissionRequest);
        System.out.println(response.getData());
    }
}
