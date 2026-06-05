package com.binance.connector.client.sub_account.rest.assetmanagement;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.GetSubAccountDepositAddressResponse;

/** API examples for AssetManagementApi */
public class GetSubAccountDepositAddressExample {
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
     * Get Sub-account Deposit Address (For Master Account) (USER_DATA)
     *
     * <p>Fetch sub-account deposit address * &#x60;amount&#x60; needs to be sent if using LIGHTNING
     * network Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void getSubAccountDepositAddressExample() throws ApiException {
        String email = "sub-account-email@email.com";
        String coin = "";
        String network = "";
        Double amount = 1.0d;
        Long recvWindow = 5000L;
        ApiResponse<GetSubAccountDepositAddressResponse> response =
                getApi().getSubAccountDepositAddress(email, coin, network, amount, recvWindow);
        System.out.println(response.getData());
    }
}
