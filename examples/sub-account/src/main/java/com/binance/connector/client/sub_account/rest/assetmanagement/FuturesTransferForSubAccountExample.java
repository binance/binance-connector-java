package com.binance.connector.client.sub_account.rest.assetmanagement;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.FuturesTransferForSubAccountRequest;
import com.binance.connector.client.sub_account.rest.model.FuturesTransferForSubAccountResponse;
import java.io.IOException;

/** API examples for AssetManagementApi */
public class FuturesTransferForSubAccountExample {
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
     * Futures Transfer for Sub-account (For Master Account) (USER_DATA)
     *
     * <p>Futures Transfer for Sub-account Weight(IP): 1 Security Type: USER_DATA Notes: - You need
     * to open Enable Spot &amp; Margin Trading permission for the API Key which requests this
     * endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    public void futuresTransferForSubAccountExample() throws ApiException, IOException {
        FuturesTransferForSubAccountRequest futuresTransferForSubAccountRequest =
                new FuturesTransferForSubAccountRequest();
        futuresTransferForSubAccountRequest.email("123@test.com");
        futuresTransferForSubAccountRequest.asset("USDT");
        futuresTransferForSubAccountRequest.amount(1.0d);
        futuresTransferForSubAccountRequest.type(1L);
        ApiResponse<FuturesTransferForSubAccountResponse> response =
                getApi().futuresTransferForSubAccount(futuresTransferForSubAccountRequest);
        System.out.println(response.getData());
    }
}
