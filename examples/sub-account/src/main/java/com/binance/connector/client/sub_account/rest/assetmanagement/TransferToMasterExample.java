package com.binance.connector.client.sub_account.rest.assetmanagement;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.TransferToMasterRequest;
import com.binance.connector.client.sub_account.rest.model.TransferToMasterResponse;
import java.io.IOException;

/** API examples for AssetManagementApi */
public class TransferToMasterExample {
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
     * Transfer to Master (For Sub-account) (USER_DATA)
     *
     * <p>Transfer to Master Weight(IP): 1 Security Type: USER_DATA Notes: - You need to open Enable
     * Spot &amp; Margin Trading permission for the API Key which requests this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    public void transferToMasterExample() throws ApiException, IOException {
        TransferToMasterRequest transferToMasterRequest = new TransferToMasterRequest();
        transferToMasterRequest.asset("BTC");
        transferToMasterRequest.amount(1.0d);
        ApiResponse<TransferToMasterResponse> response =
                getApi().transferToMaster(transferToMasterRequest);
        System.out.println(response.getData());
    }
}
