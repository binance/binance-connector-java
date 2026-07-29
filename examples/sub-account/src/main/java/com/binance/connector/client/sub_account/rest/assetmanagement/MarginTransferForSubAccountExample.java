package com.binance.connector.client.sub_account.rest.assetmanagement;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.MarginTransferForSubAccountRequest;
import com.binance.connector.client.sub_account.rest.model.MarginTransferForSubAccountResponse;
import java.io.IOException;

/** API examples for AssetManagementApi */
public class MarginTransferForSubAccountExample {
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
     * Margin Transfer for Sub-account (For Master Account) (USER_DATA)
     *
     * <p>Margin Transfer for Sub-account Weight(IP): 1 Security Type: USER_DATA Notes: - You need
     * to open Enable Spot &amp; Margin Trading permission for the API Key which requests this
     * endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    public void marginTransferForSubAccountExample() throws ApiException, IOException {
        MarginTransferForSubAccountRequest marginTransferForSubAccountRequest =
                new MarginTransferForSubAccountRequest();
        marginTransferForSubAccountRequest.email("123@test.com");
        marginTransferForSubAccountRequest.asset("BTC");
        marginTransferForSubAccountRequest.amount(1.0d);
        marginTransferForSubAccountRequest.type(1L);
        ApiResponse<MarginTransferForSubAccountResponse> response =
                getApi().marginTransferForSubAccount(marginTransferForSubAccountRequest);
        System.out.println(response.getData());
    }
}
