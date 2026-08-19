package com.binance.connector.client.w3w_prediction.rest.otc;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.w3w_prediction.rest.W3WPredictionRestApiUtil;
import com.binance.connector.client.w3w_prediction.rest.api.W3WPredictionRestApi;
import com.binance.connector.client.w3w_prediction.rest.model.FulfilOtcBlocktradeRequest;
import com.binance.connector.client.w3w_prediction.rest.model.FulfilOtcBlocktradeResponse;
import java.io.IOException;

/** API examples for OtcApi */
public class FulfilOtcBlocktradeExample {
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
     * Fulfil OTC Blocktrade (PREDICTION_TRADE)
     *
     * <p>Fulfil an open maker blocktrade as the taker, using the &#x60;secretToken&#x60; the maker
     * shared out-of-band. All-or-nothing fill (no partial fill); the taker order is the
     * server-derived symmetric inverse of the maker order. Weight(IP): 200 Security Type:
     * PREDICTION_TRADE Notes: - Restricted to authorized market makers. Requests from unauthorized
     * accounts are rejected — contact BD to request access.
     *
     * @throws ApiException if the Api call fails
     */
    public void fulfilOtcBlocktradeExample() throws ApiException, IOException {
        FulfilOtcBlocktradeRequest fulfilOtcBlocktradeRequest = new FulfilOtcBlocktradeRequest();
        fulfilOtcBlocktradeRequest.orderId("26080500000001234567");
        fulfilOtcBlocktradeRequest.secretToken("a1b2c3d4-e5f6-7890-abcd-ef1234567890");
        ApiResponse<FulfilOtcBlocktradeResponse> response =
                getApi().fulfilOtcBlocktrade(fulfilOtcBlocktradeRequest);
        System.out.println(response.getData());
    }
}
