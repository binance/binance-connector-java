package com.binance.connector.client.sub_account.rest.managedsubaccount;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.GetManagedSubAccountDepositAddressResponse;
import java.io.IOException;

/** API examples for ManagedSubAccountApi */
public class GetManagedSubAccountDepositAddressExample {
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
     * Get Managed Sub-account Deposit Address (For Investor Master Account) (USER_DATA)
     *
     * <p>Get investor&#39;s managed sub-account deposit address. Weight(UID): 1 Security Type:
     * USER_DATA Notes: - If &#x60;network&#x60; is not sent, the default &#x60;network&#x60; for
     * the &#x60;coin&#x60; is returned. - When using &#x60;LIGHTNING&#x60;, &#x60;amount&#x60; must
     * be provided.
     *
     * @throws ApiException if the Api call fails
     */
    public void getManagedSubAccountDepositAddressExample() throws ApiException, IOException {
        String email = "abc@test.com";
        String coin = "USDT";
        String network = "LIGHTNING";
        Double amount = 1.0d;
        Long recvWindow = 5000L;
        ApiResponse<GetManagedSubAccountDepositAddressResponse> response =
                getApi().getManagedSubAccountDepositAddress(
                                email, coin, network, amount, recvWindow);
        System.out.println(response.getData());
    }
}
