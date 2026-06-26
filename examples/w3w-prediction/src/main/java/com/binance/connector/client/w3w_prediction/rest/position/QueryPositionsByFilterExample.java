package com.binance.connector.client.w3w_prediction.rest.position;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.w3w_prediction.rest.W3WPredictionRestApiUtil;
import com.binance.connector.client.w3w_prediction.rest.api.W3WPredictionRestApi;
import com.binance.connector.client.w3w_prediction.rest.model.QueryPositionsByFilterResponse;

/** API examples for PositionApi */
public class QueryPositionsByFilterExample {
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
     * Query Positions by Filter
     *
     * <p>Get prediction positions filtered by wallet address and/or market topic ID. Both
     * parameters are optional. Weight(IP): 200 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void queryPositionsByFilterExample() throws ApiException {
        String walletAddress = "0x12e32db8817e292508c34111cbc4b23340df542c";
        Long marketTopicId = 4229564L;
        Long recvWindow = 5000L;
        ApiResponse<QueryPositionsByFilterResponse> response =
                getApi().queryPositionsByFilter(walletAddress, marketTopicId, recvWindow);
        System.out.println(response.getData());
    }
}
