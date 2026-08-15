package com.binance.connector.client.sub_account.rest.assetmanagement;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.SubAccountFuturesAssetTransferRequest;
import com.binance.connector.client.sub_account.rest.model.SubAccountFuturesAssetTransferResponse;
import java.io.IOException;

/** API examples for AssetManagementApi */
public class SubAccountFuturesAssetTransferExample {
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
     * Sub-account Futures Asset Transfer (For Master Account) (USER_DATA)
     *
     * <p>Sub-account Futures Asset Transfer Weight(IP): 1 Security Type: USER_DATA Notes: - A
     * master account can transfer at most 2000 times per minute. - The futures wallet must have
     * sufficient margin balance to execute the transfer.
     *
     * @throws ApiException if the Api call fails
     */
    public void subAccountFuturesAssetTransferExample() throws ApiException, IOException {
        SubAccountFuturesAssetTransferRequest subAccountFuturesAssetTransferRequest =
                new SubAccountFuturesAssetTransferRequest();
        subAccountFuturesAssetTransferRequest.fromEmail("abc@test.com");
        subAccountFuturesAssetTransferRequest.toEmail("def@test.com");
        subAccountFuturesAssetTransferRequest.futuresType(1L);
        subAccountFuturesAssetTransferRequest.asset("BTC");
        subAccountFuturesAssetTransferRequest.amount(1.0d);
        ApiResponse<SubAccountFuturesAssetTransferResponse> response =
                getApi().subAccountFuturesAssetTransfer(subAccountFuturesAssetTransferRequest);
        System.out.println(response.getData());
    }
}
