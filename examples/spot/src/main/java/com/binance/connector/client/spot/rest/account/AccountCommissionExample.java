package com.binance.connector.client.spot.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.AccountCommissionResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class AccountCommissionExample {
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
     * Query Commission Rates (USER_DATA)
     *
     * <p>Get current account commission rates. Weight(IP): 20 Security Type: USER_DATA Notes:
     * **Data Source:** Database
     *
     * @throws ApiException if the Api call fails
     */
    public void accountCommissionExample() throws ApiException, IOException {
        String symbol = "BTCUSDT";
        ApiResponse<AccountCommissionResponse> response = getApi().accountCommission(symbol);
        System.out.println(response.getData());
    }
}
