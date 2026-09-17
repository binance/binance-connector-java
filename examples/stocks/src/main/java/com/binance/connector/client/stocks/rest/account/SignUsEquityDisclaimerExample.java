package com.binance.connector.client.stocks.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stocks.rest.StocksRestApiUtil;
import com.binance.connector.client.stocks.rest.api.StocksRestApi;
import com.binance.connector.client.stocks.rest.model.SignUsEquityDisclaimerResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class SignUsEquityDisclaimerExample {
    private StocksRestApi api;

    public StocksRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = StocksRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new StocksRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Sign US Equity Disclaimer (TRADE)
     *
     * <p>Records the user&#39;s acknowledgement and acceptance of the US equity disclaimer. This
     * must be completed before the account can access certain US equity trading features. The
     * acceptance is tied to the account associated with the API key. Weight: 1 Security Type: TRADE
     *
     * @throws ApiException if the Api call fails
     */
    public void signUsEquityDisclaimerExample() throws ApiException, IOException {
        Long recvWindow = 5000L;
        ApiResponse<SignUsEquityDisclaimerResponse> response =
                getApi().signUsEquityDisclaimer(recvWindow);
        System.out.println(response.getData());
    }
}
