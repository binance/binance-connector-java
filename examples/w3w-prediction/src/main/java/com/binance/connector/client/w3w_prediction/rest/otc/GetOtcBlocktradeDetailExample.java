package com.binance.connector.client.w3w_prediction.rest.otc;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.w3w_prediction.rest.W3WPredictionRestApiUtil;
import com.binance.connector.client.w3w_prediction.rest.api.W3WPredictionRestApi;
import com.binance.connector.client.w3w_prediction.rest.model.GetOtcBlocktradeDetailRequest;
import com.binance.connector.client.w3w_prediction.rest.model.GetOtcBlocktradeDetailResponse;
import java.io.IOException;

/** API examples for OtcApi */
public class GetOtcBlocktradeDetailExample {
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
     * Get OTC Blocktrade Detail (PREDICTION_TRADE)
     *
     * <p>Query the maker&#39;s own blocktrade by &#x60;orderId&#x60;. Returns full order data
     * including status and &#x60;secretToken&#x60;. Weight(IP): 200 Security Type: PREDICTION_TRADE
     * Notes: - Restricted to authorized market makers. Requests from unauthorized accounts are
     * rejected — contact BD to request access.
     *
     * @throws ApiException if the Api call fails
     */
    public void getOtcBlocktradeDetailExample() throws ApiException, IOException {
        GetOtcBlocktradeDetailRequest getOtcBlocktradeDetailRequest =
                new GetOtcBlocktradeDetailRequest();
        getOtcBlocktradeDetailRequest.orderId("26080500000001234567");
        ApiResponse<GetOtcBlocktradeDetailResponse> response =
                getApi().getOtcBlocktradeDetail(getOtcBlocktradeDetailRequest);
        System.out.println(response.getData());
    }
}
