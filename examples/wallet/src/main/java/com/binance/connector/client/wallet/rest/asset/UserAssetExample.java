package com.binance.connector.client.wallet.rest.asset;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.UserAssetRequest;
import com.binance.connector.client.wallet.rest.model.UserAssetResponse;

/** API examples for AssetApi */
public class UserAssetExample {
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
     * User Asset (USER_DATA)
     *
     * <p>Get user assets, just for positive data. * If asset is set, then return this asset,
     * otherwise return all assets positive. * If needBtcValuation is set, then return
     * btcValudation. Weight: 5
     *
     * @throws ApiException if the Api call fails
     */
    public void userAssetExample() throws ApiException {
        UserAssetRequest userAssetRequest = new UserAssetRequest();
        ApiResponse<UserAssetResponse> response = getApi().userAsset(userAssetRequest);
        System.out.println(response.getData());
    }
}
