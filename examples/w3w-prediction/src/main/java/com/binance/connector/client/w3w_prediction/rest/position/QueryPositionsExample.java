package com.binance.connector.client.w3w_prediction.rest.position;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.w3w_prediction.rest.W3WPredictionRestApiUtil;
import com.binance.connector.client.w3w_prediction.rest.api.W3WPredictionRestApi;
import com.binance.connector.client.w3w_prediction.rest.model.QueryPositionsResponse;

/** API examples for PositionApi */
public class QueryPositionsExample {
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
     * Query Positions
     *
     * <p>Get the authenticated user&#39;s prediction token positions with portfolio summary and
     * tab-based filtering. Weight(IP): 200 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void queryPositionsExample() throws ApiException {
        String walletAddress = "0x12e32db8817e292508c34111cbc4b23340df542c";
        String tab = "ONGOING";
        Integer offset = 0;
        Integer limit = 20;
        Long recvWindow = 5000L;
        ApiResponse<QueryPositionsResponse> response =
                getApi().queryPositions(walletAddress, tab, offset, limit, recvWindow);
        System.out.println(response.getData());
    }
}
