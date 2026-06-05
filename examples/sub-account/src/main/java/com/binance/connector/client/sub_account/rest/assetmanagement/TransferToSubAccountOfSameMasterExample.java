package com.binance.connector.client.sub_account.rest.assetmanagement;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.TransferToSubAccountOfSameMasterRequest;
import com.binance.connector.client.sub_account.rest.model.TransferToSubAccountOfSameMasterResponse;

/** API examples for AssetManagementApi */
public class TransferToSubAccountOfSameMasterExample {
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
     * Transfer to Sub-account of Same Master (For Sub-account) (USER_DATA)
     *
     * <p>Transfer to Sub-account of Same Master * You need to open Enable Spot &amp; Margin Trading
     * permission for the API Key which requests this endpoint. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void transferToSubAccountOfSameMasterExample() throws ApiException {
        TransferToSubAccountOfSameMasterRequest transferToSubAccountOfSameMasterRequest =
                new TransferToSubAccountOfSameMasterRequest();
        transferToSubAccountOfSameMasterRequest.toEmail("");
        transferToSubAccountOfSameMasterRequest.asset("");
        transferToSubAccountOfSameMasterRequest.amount(1.0d);
        ApiResponse<TransferToSubAccountOfSameMasterResponse> response =
                getApi().transferToSubAccountOfSameMaster(transferToSubAccountOfSameMasterRequest);
        System.out.println(response.getData());
    }
}
