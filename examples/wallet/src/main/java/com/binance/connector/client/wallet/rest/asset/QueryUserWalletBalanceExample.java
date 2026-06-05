package com.binance.connector.client.wallet.rest.asset;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.QueryUserWalletBalanceResponse;

/** API examples for AssetApi */
public class QueryUserWalletBalanceExample {
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
     * Query User Wallet Balance (USER_DATA)
     *
     * <p>Query User Wallet Balance Weight: 60
     *
     * @throws ApiException if the Api call fails
     */
    public void queryUserWalletBalanceExample() throws ApiException {
        String quoteAsset = "BTC";
        Long recvWindow = 5000L;
        ApiResponse<QueryUserWalletBalanceResponse> response =
                getApi().queryUserWalletBalance(quoteAsset, recvWindow);
        System.out.println(response.getData());
    }
}
