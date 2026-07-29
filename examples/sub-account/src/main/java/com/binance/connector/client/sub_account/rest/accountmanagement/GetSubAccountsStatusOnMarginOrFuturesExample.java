package com.binance.connector.client.sub_account.rest.accountmanagement;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.GetSubAccountsStatusOnMarginOrFuturesResponse;
import java.io.IOException;

/** API examples for AccountManagementApi */
public class GetSubAccountsStatusOnMarginOrFuturesExample {
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
     * Get Sub-account&#39;s Status on Margin Or Futures (For Master Account) (USER_DATA)
     *
     * <p>Get Sub-account&#39;s Status on Margin Or Futures Weight(IP): 10 Security Type: USER_DATA
     * Notes: - If no email sent, all sub-accounts&#39; information will be returned.
     *
     * @throws ApiException if the Api call fails
     */
    public void getSubAccountsStatusOnMarginOrFuturesExample() throws ApiException, IOException {
        String email = "123@test.com";
        Long recvWindow = 5000L;
        ApiResponse<GetSubAccountsStatusOnMarginOrFuturesResponse> response =
                getApi().getSubAccountsStatusOnMarginOrFutures(email, recvWindow);
        System.out.println(response.getData());
    }
}
