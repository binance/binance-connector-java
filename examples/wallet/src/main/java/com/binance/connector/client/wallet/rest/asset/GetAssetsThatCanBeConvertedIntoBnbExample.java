package com.binance.connector.client.wallet.rest.asset;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.GetAssetsThatCanBeConvertedIntoBnbRequest;
import com.binance.connector.client.wallet.rest.model.GetAssetsThatCanBeConvertedIntoBnbResponse;

/** API examples for AssetApi */
public class GetAssetsThatCanBeConvertedIntoBnbExample {
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
     * Get Assets That Can Be Converted Into BNB (USER_DATA)
     *
     * <p>Get Assets That Can Be Converted Into BNB Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void getAssetsThatCanBeConvertedIntoBnbExample() throws ApiException {
        GetAssetsThatCanBeConvertedIntoBnbRequest getAssetsThatCanBeConvertedIntoBnbRequest =
                new GetAssetsThatCanBeConvertedIntoBnbRequest();
        ApiResponse<GetAssetsThatCanBeConvertedIntoBnbResponse> response =
                getApi().getAssetsThatCanBeConvertedIntoBnb(
                                getAssetsThatCanBeConvertedIntoBnbRequest);
        System.out.println(response.getData());
    }
}
