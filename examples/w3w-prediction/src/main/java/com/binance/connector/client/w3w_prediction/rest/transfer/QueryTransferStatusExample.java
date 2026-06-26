package com.binance.connector.client.w3w_prediction.rest.transfer;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.w3w_prediction.rest.W3WPredictionRestApiUtil;
import com.binance.connector.client.w3w_prediction.rest.api.W3WPredictionRestApi;
import com.binance.connector.client.w3w_prediction.rest.model.QueryTransferStatusResponse;

/** API examples for TransferApi */
public class QueryTransferStatusExample {
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
     * Query Transfer Status
     *
     * <p>Query the current status of a prediction wallet transfer by transfer ID.
     * **&#x60;status&#x60; values:** Terminal states are &#x60;COMPLETED&#x60; and
     * &#x60;FAILED&#x60;. Intermediate states are &#x60;PROCESSING&#x60; and &#x60;PENDING&#x60;.
     * **Do not** poll for &#x60;SUCCESS&#x60; — it is not a valid terminal state. Weight(IP): 200
     * Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void queryTransferStatusExample() throws ApiException {
        String transferId = "tf_20260525_out_001";
        Long recvWindow = 5000L;
        ApiResponse<QueryTransferStatusResponse> response =
                getApi().queryTransferStatus(transferId, recvWindow);
        System.out.println(response.getData());
    }
}
