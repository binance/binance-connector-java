package com.binance.connector.client.w3w_prediction.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.w3w_prediction.rest.W3WPredictionRestApiUtil;
import com.binance.connector.client.w3w_prediction.rest.api.W3WPredictionRestApi;
import com.binance.connector.client.w3w_prediction.rest.model.GetMarketDetailResponse;

/** API examples for MarketDataApi */
public class GetMarketDetailExample {
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
     * Get Market Detail
     *
     * <p>Get full details for a specific prediction market topic, including variant data and
     * timeline. Weight(IP): 200
     *
     * @throws ApiException if the Api call fails
     */
    public void getMarketDetailExample() throws ApiException {
        Long marketTopicId = 4229564L;
        ApiResponse<GetMarketDetailResponse> response = getApi().getMarketDetail(marketTopicId);
        System.out.println(response.getData());
    }
}
