package com.binance.connector.client.w3w_prediction.rest.wallet;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.w3w_prediction.rest.W3WPredictionRestApiUtil;
import com.binance.connector.client.w3w_prediction.rest.api.W3WPredictionRestApi;
import com.binance.connector.client.w3w_prediction.rest.model.QueryPaymentOptionBalancesResponse;

/** API examples for WalletApi */
public class QueryPaymentOptionBalancesExample {
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
     * Query Payment Option Balances
     *
     * <p>Get available balances for each payment option that can be used for prediction trading.
     * Weight(IP): 200 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void queryPaymentOptionBalancesExample() throws ApiException {
        Long recvWindow = 5000L;
        ApiResponse<QueryPaymentOptionBalancesResponse> response =
                getApi().queryPaymentOptionBalances(recvWindow);
        System.out.println(response.getData());
    }
}
