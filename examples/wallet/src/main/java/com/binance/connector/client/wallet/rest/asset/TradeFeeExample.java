package com.binance.connector.client.wallet.rest.asset;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.TradeFeeResponse;

/** API examples for AssetApi */
public class TradeFeeExample {
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
     * Trade Fee (USER_DATA)
     *
     * <p>Fetch trade fee Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void tradeFeeExample() throws ApiException {
        String symbol = "";
        Long recvWindow = 5000L;
        ApiResponse<TradeFeeResponse> response = getApi().tradeFee(symbol, recvWindow);
        System.out.println(response.getData());
    }
}
