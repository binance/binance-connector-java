package com.binance.connector.client.spot.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.GetAccountResponse;

/** API examples for AccountApi */
public class GetAccountExample {
    private SpotRestApi api;

    public SpotRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = SpotRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new SpotRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Account information
     *
     * <p>Get current account information. Weight: 20
     *
     * @throws ApiException if the Api call fails
     */
    public void getAccountExample() throws ApiException {
        Boolean omitZeroBalances = false;
        Double recvWindow = 5000.0d;
        ApiResponse<GetAccountResponse> response =
                getApi().getAccount(omitZeroBalances, recvWindow);
        System.out.println(response.getData());
    }
}
