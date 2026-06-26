package com.binance.connector.client.w3w_prediction.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.w3w_prediction.rest.W3WPredictionRestApiUtil;
import com.binance.connector.client.w3w_prediction.rest.api.W3WPredictionRestApi;
import com.binance.connector.client.w3w_prediction.rest.model.QueryLastTradePriceResponse;

/** API examples for MarketDataApi */
public class QueryLastTradePriceExample {
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
     * Query Last Trade Price
     *
     * <p>Get the most recent trade price for a prediction market. Weight(IP): 200
     *
     * @throws ApiException if the Api call fails
     */
    public void queryLastTradePriceExample() throws ApiException {
        Long marketId = 5567895L;
        ApiResponse<QueryLastTradePriceResponse> response = getApi().queryLastTradePrice(marketId);
        System.out.println(response.getData());
    }
}
