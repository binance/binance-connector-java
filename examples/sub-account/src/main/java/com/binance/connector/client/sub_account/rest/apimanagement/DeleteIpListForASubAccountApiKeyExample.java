package com.binance.connector.client.sub_account.rest.apimanagement;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.DeleteIpListForASubAccountApiKeyResponse;
import java.io.IOException;

/** API examples for ApiManagementApi */
public class DeleteIpListForASubAccountApiKeyExample {
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
     * Delete IP List For a Sub-account API Key (For Master Account) (USER_DATA)
     *
     * <p>Delete IP List For a Sub-account API Key Weight(UID): 3000 Security Type: USER_DATA Notes:
     * - You need to enable Enable Spot &amp; Margin Trading option for the api key which requests
     * this endpoint
     *
     * @throws ApiException if the Api call fails
     */
    public void deleteIpListForASubAccountApiKeyExample() throws ApiException, IOException {
        String email = "123@test.com";
        String subAccountApiKey = "k5V49ldtn4tszj6W3hystegdfvmGbqDzjmkCtpTvC0G74WhK7yd4rfCTo4lShf";
        String ipAddress = "69.210.67.14";
        Long recvWindow = 5000L;
        ApiResponse<DeleteIpListForASubAccountApiKeyResponse> response =
                getApi().deleteIpListForASubAccountApiKey(
                                email, subAccountApiKey, ipAddress, recvWindow);
        System.out.println(response.getData());
    }
}
