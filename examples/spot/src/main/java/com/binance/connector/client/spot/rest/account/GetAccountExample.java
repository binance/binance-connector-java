package com.binance.connector.client.spot.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.GetAccountResponse;
import java.io.IOException;

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
     * Account information (USER_DATA)
     *
     * <p>Get current account information. Weight(IP): 20 Security Type: USER_DATA Notes: **Data
     * Source:** Memory &#x3D;&gt; Database
     *
     * @throws ApiException if the Api call fails
     */
    public void getAccountExample() throws ApiException, IOException {
        Boolean omitZeroBalances = false;
        Double recvWindow = 5000d;
        ApiResponse<GetAccountResponse> response =
                getApi().getAccount(omitZeroBalances, recvWindow);
        System.out.println(response.getData());
    }
}
