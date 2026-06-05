package com.binance.connector.client.algo.rest.futurealgo;

import com.binance.connector.client.algo.rest.AlgoRestApiUtil;
import com.binance.connector.client.algo.rest.api.AlgoRestApi;
import com.binance.connector.client.algo.rest.model.CancelAlgoOrderFutureAlgoResponse;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;

/** API examples for FutureAlgoApi */
public class CancelAlgoOrderFutureAlgoExample {
    private AlgoRestApi api;

    public AlgoRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = AlgoRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new AlgoRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Cancel Algo Order(TRADE)
     *
     * <p>Cancel an active order. * You need to enable &#x60;Futures Trading Permission&#x60; for
     * the api key which requests this endpoint. * Base URL: https://api.binance.com Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void cancelAlgoOrderFutureAlgoExample() throws ApiException {
        Long algoId = 1L;
        Long recvWindow = 5000L;
        ApiResponse<CancelAlgoOrderFutureAlgoResponse> response =
                getApi().cancelAlgoOrderFutureAlgo(algoId, recvWindow);
        System.out.println(response.getData());
    }
}
