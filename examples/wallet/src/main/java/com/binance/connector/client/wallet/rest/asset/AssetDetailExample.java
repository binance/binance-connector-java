package com.binance.connector.client.wallet.rest.asset;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.AssetDetailResponse;
import java.io.IOException;

/** API examples for AssetApi */
public class AssetDetailExample {
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
     * Asset Detail (USER_DATA)
     *
     * <p>Fetch details of assets supported on Binance. Weight(IP): 1 Security Type: USER_DATA
     * Notes: - Please get network and other deposit or withdraw details from &#x60;GET
     * /sapi/v1/capital/config/getall&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    public void assetDetailExample() throws ApiException, IOException {
        String asset = "BTC";
        Long recvWindow = 5000L;
        ApiResponse<AssetDetailResponse> response = getApi().assetDetail(asset, recvWindow);
        System.out.println(response.getData());
    }
}
