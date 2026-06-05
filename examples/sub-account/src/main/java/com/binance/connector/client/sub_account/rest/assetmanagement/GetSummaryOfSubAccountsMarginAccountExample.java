package com.binance.connector.client.sub_account.rest.assetmanagement;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.GetSummaryOfSubAccountsMarginAccountResponse;

/** API examples for AssetManagementApi */
public class GetSummaryOfSubAccountsMarginAccountExample {
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
     * Get Summary of Sub-account&#39;s Margin Account (For Master Account) (USER_DATA)
     *
     * <p>Get Summary of Sub-account&#39;s Margin Account Weight: 10
     *
     * @throws ApiException if the Api call fails
     */
    public void getSummaryOfSubAccountsMarginAccountExample() throws ApiException {
        Long recvWindow = 5000L;
        ApiResponse<GetSummaryOfSubAccountsMarginAccountResponse> response =
                getApi().getSummaryOfSubAccountsMarginAccount(recvWindow);
        System.out.println(response.getData());
    }
}
