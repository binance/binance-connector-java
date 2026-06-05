package com.binance.connector.client.algo.rest.spotalgo;

import com.binance.connector.client.algo.rest.AlgoRestApiUtil;
import com.binance.connector.client.algo.rest.api.AlgoRestApi;
import com.binance.connector.client.algo.rest.model.CancelAlgoOrderSpotAlgoResponse;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;

/** API examples for SpotAlgoApi */
public class CancelAlgoOrderSpotAlgoExample {
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
     * <p>Cancel an open TWAP order Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void cancelAlgoOrderSpotAlgoExample() throws ApiException {
        Long algoId = 1L;
        Long recvWindow = 5000L;
        ApiResponse<CancelAlgoOrderSpotAlgoResponse> response =
                getApi().cancelAlgoOrderSpotAlgo(algoId, recvWindow);
        System.out.println(response.getData());
    }
}
