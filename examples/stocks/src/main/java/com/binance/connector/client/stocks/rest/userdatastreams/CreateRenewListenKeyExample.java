package com.binance.connector.client.stocks.rest.userdatastreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stocks.rest.StocksRestApiUtil;
import com.binance.connector.client.stocks.rest.api.StocksRestApi;
import com.binance.connector.client.stocks.rest.model.CreateRenewListenKeyResponse;
import java.io.IOException;

/** API examples for UserDataStreamsApi */
public class CreateRenewListenKeyExample {
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
     * Create / Renew Listen Key (USER_STREAM)
     *
     * <p>Create a new stock user-data-stream &#x60;listenKey&#x60;, or renew an existing one.
     * Calling this endpoint for the same user with an active &#x60;listenKey&#x60; extends its
     * validity; if there is no active key, a new one is issued. Use the returned
     * &#x60;listenKey&#x60; to subscribe to the stock user data stream. Weight: 1 Security Type:
     * USER_STREAM
     *
     * @throws ApiException if the Api call fails
     */
    public void createRenewListenKeyExample() throws ApiException, IOException {
        Long recvWindow = 5000L;
        ApiResponse<CreateRenewListenKeyResponse> response =
                getApi().createRenewListenKey(recvWindow);
        System.out.println(response.getData());
    }
}
