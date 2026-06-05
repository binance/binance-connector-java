package com.binance.connector.client.wallet.rest.asset;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.DustTransferRequest;
import com.binance.connector.client.wallet.rest.model.DustTransferResponse;

/** API examples for AssetApi */
public class DustTransferExample {
    private WalletRestApi api;

    public WalletRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = WalletRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new WalletRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Dust Transfer (USER_DATA)
     *
     * <p>Convert dust assets to BNB. * You need to open&#x60;Enable Spot &amp; Margin Trading&#x60;
     * permission for the API Key which requests this endpoint. Weight: 10
     *
     * @throws ApiException if the Api call fails
     */
    public void dustTransferExample() throws ApiException {
        DustTransferRequest dustTransferRequest = new DustTransferRequest();
        dustTransferRequest.asset("");
        ApiResponse<DustTransferResponse> response = getApi().dustTransfer(dustTransferRequest);
        System.out.println(response.getData());
    }
}
