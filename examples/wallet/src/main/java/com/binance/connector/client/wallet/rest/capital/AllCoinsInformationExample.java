package com.binance.connector.client.wallet.rest.capital;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.AllCoinsInformationResponse;

/** API examples for CapitalApi */
public class AllCoinsInformationExample {
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
     * All Coins&#39; Information (USER_DATA)
     *
     * <p>Get information of coins (available for deposit and withdraw) for user. Weight: 10
     *
     * @throws ApiException if the Api call fails
     */
    public void allCoinsInformationExample() throws ApiException {
        Long recvWindow = 5000L;
        ApiResponse<AllCoinsInformationResponse> response =
                getApi().allCoinsInformation(recvWindow);
        System.out.println(response.getData());
    }
}
