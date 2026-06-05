package com.binance.connector.client.algo.rest.spotalgo;

import com.binance.connector.client.algo.rest.AlgoRestApiUtil;
import com.binance.connector.client.algo.rest.api.AlgoRestApi;
import com.binance.connector.client.algo.rest.model.QuerySubOrdersSpotAlgoResponse;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;

/** API examples for SpotAlgoApi */
public class QuerySubOrdersSpotAlgoExample {
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
     * Query Sub Orders(USER_DATA)
     *
     * <p>Get respective sub orders for a specified algoId Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void querySubOrdersSpotAlgoExample() throws ApiException {
        Long algoId = 1L;
        Long page = 1L;
        Long pageSize = 100L;
        Long recvWindow = 5000L;
        ApiResponse<QuerySubOrdersSpotAlgoResponse> response =
                getApi().querySubOrdersSpotAlgo(algoId, page, pageSize, recvWindow);
        System.out.println(response.getData());
    }
}
