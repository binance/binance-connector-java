package com.binance.connector.client.w3w_prediction.rest.otc;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.w3w_prediction.rest.W3WPredictionRestApiUtil;
import com.binance.connector.client.w3w_prediction.rest.api.W3WPredictionRestApi;
import com.binance.connector.client.w3w_prediction.rest.model.PreviewOtcBlocktradeRequest;
import com.binance.connector.client.w3w_prediction.rest.model.PreviewOtcBlocktradeResponse;
import java.io.IOException;

/** API examples for OtcApi */
public class PreviewOtcBlocktradeExample {
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
     * Preview OTC Blocktrade (PREDICTION_TRADE)
     *
     * <p>Inspect an open blocktrade by &#x60;secretToken&#x60; (no &#x60;orderId&#x60; needed).
     * Taker uses this to preview the maker order before fulfilling. Returns the same shape as
     * &#x60;Get Blocktrade Detail&#x60;, but &#x60;orderId&#x60; is &#x60;null&#x60; and
     * &#x60;secretToken&#x60; is never returned from this endpoint. Weight(IP): 200 Security Type:
     * PREDICTION_TRADE Notes: - Restricted to authorized market makers. Requests from unauthorized
     * accounts are rejected — contact BD to request access.
     *
     * @throws ApiException if the Api call fails
     */
    public void previewOtcBlocktradeExample() throws ApiException, IOException {
        PreviewOtcBlocktradeRequest previewOtcBlocktradeRequest = new PreviewOtcBlocktradeRequest();
        previewOtcBlocktradeRequest.secretToken("a1b2c3d4-e5f6-7890-abcd-ef1234567890");
        ApiResponse<PreviewOtcBlocktradeResponse> response =
                getApi().previewOtcBlocktrade(previewOtcBlocktradeRequest);
        System.out.println(response.getData());
    }
}
