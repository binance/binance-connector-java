package com.binance.connector.client.wallet.rest.asset;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.GetOpenSymbolListResponse;

/** API examples for AssetApi */
public class GetOpenSymbolListExample {
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
     * Get Open Symbol List (MARKET_DATA)
     *
     * <p>Get the list of symbols that are scheduled to be opened for trading in the market. Weight:
     * 100
     *
     * @throws ApiException if the Api call fails
     */
    public void getOpenSymbolListExample() throws ApiException {
        ApiResponse<GetOpenSymbolListResponse> response = getApi().getOpenSymbolList();
        System.out.println(response.getData());
    }
}
