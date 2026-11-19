package com.binance.connector.client.stock_options.rest.userdatastreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stock_options.rest.StockOptionsRestApiUtil;
import com.binance.connector.client.stock_options.rest.api.StockOptionsRestApi;
import com.binance.connector.client.stock_options.rest.model.CreateRenewListenKeyResponse;
import java.io.IOException;

/** API examples for UserDataStreamsApi */
public class CreateRenewListenKeyExample {
    private StockOptionsRestApi api;

    public StockOptionsRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    StockOptionsRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new StockOptionsRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Create / Renew Listen Key (USER_STREAM)
     *
     * <p>Create or renew the user data stream &#x60;listenKey&#x60;. - **Valid for 1 hour.**
     * Calling again renews it (resets to 1 hour) and returns the **same** key; renewing every 30
     * minutes is recommended. After expiry, a new key is issued and you must resubscribe with it. -
     * **Options and stocks share one key.** The key is issued per user, not per asset class. This
     * endpoint and &#x60;/sapi/v1/equity/listenKey&#x60; return the same key; calling either is
     * enough. - Use the key to subscribe to the Order Report V2 Stream. Weight: 1 Security Type:
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
