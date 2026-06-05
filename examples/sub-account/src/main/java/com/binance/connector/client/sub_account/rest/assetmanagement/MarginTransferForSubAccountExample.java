package com.binance.connector.client.sub_account.rest.assetmanagement;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.MarginTransferForSubAccountRequest;
import com.binance.connector.client.sub_account.rest.model.MarginTransferForSubAccountResponse;

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
     * <p>Margin Transfer for Sub-account * You need to open Enable Spot &amp; Margin Trading
     * permission for the API Key which requests this endpoint. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void marginTransferForSubAccountExample() throws ApiException {
        MarginTransferForSubAccountRequest marginTransferForSubAccountRequest =
                new MarginTransferForSubAccountRequest();
        marginTransferForSubAccountRequest.email("sub-account-email@email.com");
        marginTransferForSubAccountRequest.asset("");
        marginTransferForSubAccountRequest.amount(1.0d);
        marginTransferForSubAccountRequest.type(0L);
        ApiResponse<MarginTransferForSubAccountResponse> response =
                getApi().marginTransferForSubAccount(marginTransferForSubAccountRequest);
        System.out.println(response.getData());
    }
}
