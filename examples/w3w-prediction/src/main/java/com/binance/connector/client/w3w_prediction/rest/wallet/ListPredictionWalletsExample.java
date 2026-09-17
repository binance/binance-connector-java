package com.binance.connector.client.w3w_prediction.rest.wallet;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.w3w_prediction.rest.W3WPredictionRestApiUtil;
import com.binance.connector.client.w3w_prediction.rest.api.W3WPredictionRestApi;
import com.binance.connector.client.w3w_prediction.rest.model.ListPredictionWalletsResponse;
import java.io.IOException;

/** API examples for WalletApi */
public class ListPredictionWalletsExample {
    private W3WPredictionRestApi api;

    public W3WPredictionRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    W3WPredictionRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new W3WPredictionRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * List Prediction Wallets (PREDICTION_TRADE)
     *
     * <p>Get all prediction wallets registered for the authenticated user. Weight(IP): 200 Security
     * Type: PREDICTION_TRADE
     *
     * @throws ApiException if the Api call fails
     */
    public void listPredictionWalletsExample() throws ApiException, IOException {
        Long recvWindow = 5000L;
        ApiResponse<ListPredictionWalletsResponse> response =
                getApi().listPredictionWallets(recvWindow);
        System.out.println(response.getData());
    }
}
