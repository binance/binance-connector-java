package com.binance.connector.client.w3w_prediction.rest.otc;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.w3w_prediction.rest.W3WPredictionRestApiUtil;
import com.binance.connector.client.w3w_prediction.rest.api.W3WPredictionRestApi;
import com.binance.connector.client.w3w_prediction.rest.model.GetOtcBlocktradeEventsRequest;
import com.binance.connector.client.w3w_prediction.rest.model.GetOtcBlocktradeEventsResponse;
import java.io.IOException;

/** API examples for OtcApi */
public class GetOtcBlocktradeEventsExample {
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
     * Get OTC Blocktrade Events (PREDICTION_TRADE)
     *
     * <p>Paginated feed of blocktrade lifecycle and settlement events (CREATE, FULFIL,
     * MATCH_SUBMIT, MATCH_SUCCESS, EXPIRE, FAILED, etc.). Weight(IP): 200 Security Type:
     * PREDICTION_TRADE Notes: - Restricted to authorized market makers. Requests from unauthorized
     * accounts are rejected — contact BD to request access.
     *
     * @throws ApiException if the Api call fails
     */
    public void getOtcBlocktradeEventsExample() throws ApiException, IOException {
        GetOtcBlocktradeEventsRequest getOtcBlocktradeEventsRequest =
                new GetOtcBlocktradeEventsRequest();
        ApiResponse<GetOtcBlocktradeEventsResponse> response =
                getApi().getOtcBlocktradeEvents(getOtcBlocktradeEventsRequest);
        System.out.println(response.getData());
    }
}
