package com.binance.connector.client.sub_account.rest.managedsubaccount;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.DepositAssetsIntoTheManagedSubAccountRequest;
import com.binance.connector.client.sub_account.rest.model.DepositAssetsIntoTheManagedSubAccountResponse;
import java.io.IOException;

/** API examples for ManagedSubAccountApi */
public class DepositAssetsIntoTheManagedSubAccountExample {
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
     * Deposit Assets Into The Managed Sub-account (For Investor Master Account) (USER_DATA)
     *
     * <p>Deposit Assets Into The Managed Sub-account Weight(IP): 1 Security Type: USER_DATA Notes:
     * - You need to enable &#x60;Enable Spot &amp; Margin Trading&#x60; option for the api key
     * which requests this endpoint
     *
     * @throws ApiException if the Api call fails
     */
    public void depositAssetsIntoTheManagedSubAccountExample() throws ApiException, IOException {
        DepositAssetsIntoTheManagedSubAccountRequest depositAssetsIntoTheManagedSubAccountRequest =
                new DepositAssetsIntoTheManagedSubAccountRequest();
        depositAssetsIntoTheManagedSubAccountRequest.toEmail("abc@test.com");
        depositAssetsIntoTheManagedSubAccountRequest.asset("BTC");
        depositAssetsIntoTheManagedSubAccountRequest.amount(1.0d);
        ApiResponse<DepositAssetsIntoTheManagedSubAccountResponse> response =
                getApi().depositAssetsIntoTheManagedSubAccount(
                                depositAssetsIntoTheManagedSubAccountRequest);
        System.out.println(response.getData());
    }
}
