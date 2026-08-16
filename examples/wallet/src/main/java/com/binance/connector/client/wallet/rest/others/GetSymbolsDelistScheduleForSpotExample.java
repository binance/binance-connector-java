package com.binance.connector.client.wallet.rest.others;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.GetSymbolsDelistScheduleForSpotResponse;
import java.io.IOException;

/** API examples for OthersApi */
public class GetSymbolsDelistScheduleForSpotExample {
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
     * Get Spot Delist Schedule (MARKET_DATA)
     *
     * <p>Get symbols delist schedule for spot Weight(IP): 100 Security Type: MARKET_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void getSymbolsDelistScheduleForSpotExample() throws ApiException, IOException {
        Long recvWindow = 5000L;
        ApiResponse<GetSymbolsDelistScheduleForSpotResponse> response =
                getApi().getSymbolsDelistScheduleForSpot(recvWindow);
        System.out.println(response.getData());
    }
}
