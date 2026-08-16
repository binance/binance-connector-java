package com.binance.connector.client.algo.rest.spotalgo;

import com.binance.connector.client.algo.rest.AlgoRestApiUtil;
import com.binance.connector.client.algo.rest.api.AlgoRestApi;
import com.binance.connector.client.algo.rest.model.QueryCurrentAlgoOpenOrdersSpotAlgoResponse;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import java.io.IOException;

/** API examples for SpotAlgoApi */
public class QueryCurrentAlgoOpenOrdersSpotAlgoExample {
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
     * Query Current Spot Algo Open Orders (USER_DATA)
     *
     * <p>Get all open SPOT TWAP orders Weight(IP): 1 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void queryCurrentAlgoOpenOrdersSpotAlgoExample() throws ApiException, IOException {
        Long recvWindow = 5000L;
        ApiResponse<QueryCurrentAlgoOpenOrdersSpotAlgoResponse> response =
                getApi().queryCurrentAlgoOpenOrdersSpotAlgo(recvWindow);
        System.out.println(response.getData());
    }
}
