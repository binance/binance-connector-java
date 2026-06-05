package com.binance.connector.client.wallet.rest.asset;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.DustConvertibleAssetsRequest;
import com.binance.connector.client.wallet.rest.model.DustConvertibleAssetsResponse;

/** API examples for AssetApi */
public class DustConvertibleAssetsExample {
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
     * Dust Convertible Assets (USER_DATA)
     *
     * <p>Query dust convertible assets Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void dustConvertibleAssetsExample() throws ApiException {
        DustConvertibleAssetsRequest dustConvertibleAssetsRequest =
                new DustConvertibleAssetsRequest();
        dustConvertibleAssetsRequest.targetAsset("");
        ApiResponse<DustConvertibleAssetsResponse> response =
                getApi().dustConvertibleAssets(dustConvertibleAssetsRequest);
        System.out.println(response.getData());
    }
}
