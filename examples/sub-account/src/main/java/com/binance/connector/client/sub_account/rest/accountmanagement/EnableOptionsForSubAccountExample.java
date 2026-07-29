package com.binance.connector.client.sub_account.rest.accountmanagement;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.EnableOptionsForSubAccountRequest;
import com.binance.connector.client.sub_account.rest.model.EnableOptionsForSubAccountResponse;
import java.io.IOException;

/** API examples for AccountManagementApi */
public class EnableOptionsForSubAccountExample {
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
     * Enable Options for Sub-account (For Master Account) (USER_DATA)
     *
     * <p>Enable Options for Sub-account (For Master Account). Weight(IP): 1 Security Type:
     * USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void enableOptionsForSubAccountExample() throws ApiException, IOException {
        EnableOptionsForSubAccountRequest enableOptionsForSubAccountRequest =
                new EnableOptionsForSubAccountRequest();
        enableOptionsForSubAccountRequest.email("123@test.com");
        ApiResponse<EnableOptionsForSubAccountResponse> response =
                getApi().enableOptionsForSubAccount(enableOptionsForSubAccountRequest);
        System.out.println(response.getData());
    }
}
