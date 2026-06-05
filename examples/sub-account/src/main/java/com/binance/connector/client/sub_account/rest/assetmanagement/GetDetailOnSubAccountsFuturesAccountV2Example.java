package com.binance.connector.client.sub_account.rest.assetmanagement;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.GetDetailOnSubAccountsFuturesAccountV2Response;

/** API examples for AssetManagementApi */
public class GetDetailOnSubAccountsFuturesAccountV2Example {
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
     * Get Detail on Sub-account&#39;s Futures Account V2 (For Master Account) (USER_DATA)
     *
     * <p>Get Detail on Sub-account&#39;s Futures Account Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void getDetailOnSubAccountsFuturesAccountV2Example() throws ApiException {
        String email = "sub-account-email@email.com";
        Long futuresType = 0L;
        Long recvWindow = 5000L;
        ApiResponse<GetDetailOnSubAccountsFuturesAccountV2Response> response =
                getApi().getDetailOnSubAccountsFuturesAccountV2(email, futuresType, recvWindow);
        System.out.println(response.getData());
    }
}
