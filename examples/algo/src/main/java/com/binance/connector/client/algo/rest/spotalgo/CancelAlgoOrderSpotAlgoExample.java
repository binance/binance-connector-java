package com.binance.connector.client.algo.rest.spotalgo;

import com.binance.connector.client.algo.rest.AlgoRestApiUtil;
import com.binance.connector.client.algo.rest.api.AlgoRestApi;
import com.binance.connector.client.algo.rest.model.CancelAlgoOrderSpotAlgoResponse;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import java.io.IOException;

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
     * Cancel Spot Algo Order (TRADE)
     *
     * <p>Cancel an open TWAP order Weight(IP): 1 Security Type: TRADE Notes: - Either
     * &#x60;algoId&#x60; or &#x60;clientAlgoId&#x60; must be sent.
     *
     * @throws ApiException if the Api call fails
     */
    public void cancelAlgoOrderSpotAlgoExample() throws ApiException, IOException {
        Long algoId = 14511L;
        String clientAlgoId = "65ce1630101a480b85915d7e11fd5078";
        Long recvWindow = 5000L;
        ApiResponse<CancelAlgoOrderSpotAlgoResponse> response =
                getApi().cancelAlgoOrderSpotAlgo(algoId, clientAlgoId, recvWindow);
        System.out.println(response.getData());
    }
}
