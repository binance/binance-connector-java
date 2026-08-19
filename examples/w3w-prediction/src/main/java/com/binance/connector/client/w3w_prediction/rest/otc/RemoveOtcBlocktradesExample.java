package com.binance.connector.client.w3w_prediction.rest.otc;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.w3w_prediction.rest.W3WPredictionRestApiUtil;
import com.binance.connector.client.w3w_prediction.rest.api.W3WPredictionRestApi;
import com.binance.connector.client.w3w_prediction.rest.model.OrderIds;
import com.binance.connector.client.w3w_prediction.rest.model.RemoveOtcBlocktradesRequest;
import com.binance.connector.client.w3w_prediction.rest.model.RemoveOtcBlocktradesResponse;
import java.io.IOException;

/** API examples for OtcApi */
public class RemoveOtcBlocktradesExample {
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
     * Remove OTC Blocktrades (PREDICTION_TRADE)
     *
     * <p>Cancel open or fulfilled-but-unsettled blocktrades. Terminal orders (already
     * &#x60;MATCHED&#x60;/&#x60;CANCELLED&#x60;/&#x60;EXPIRED&#x60;/&#x60;FAILED&#x60;) are
     * returned in &#x60;noop&#x60; instead of &#x60;removed&#x60;. Weight(IP): 200 Security Type:
     * PREDICTION_TRADE Notes: - Restricted to authorized market makers. Requests from unauthorized
     * accounts are rejected — contact BD to request access.
     *
     * @throws ApiException if the Api call fails
     */
    public void removeOtcBlocktradesExample() throws ApiException, IOException {
        RemoveOtcBlocktradesRequest removeOtcBlocktradesRequest = new RemoveOtcBlocktradesRequest();
        removeOtcBlocktradesRequest.orderIds(new OrderIds());
        ApiResponse<RemoveOtcBlocktradesResponse> response =
                getApi().removeOtcBlocktrades(removeOtcBlocktradesRequest);
        System.out.println(response.getData());
    }
}
