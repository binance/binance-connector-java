package com.binance.connector.client.wallet.rest.asset;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.GetSpotAssetTagsResponse;
import java.io.IOException;

/** API examples for AssetApi */
public class GetSpotAssetTagsExample {
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
     * Get Spot Asset Tags (MARKET_DATA)
     *
     * <p>Get the tags configured for spot-tradable assets. Weight(IP): 100 Security Type:
     * MARKET_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void getSpotAssetTagsExample() throws ApiException, IOException {
        String tag = "Layer1_Layer2,BSC";
        ApiResponse<GetSpotAssetTagsResponse> response = getApi().getSpotAssetTags(tag);
        System.out.println(response.getData());
    }
}
