package com.binance.connector.client.w3w_prediction.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.w3w_prediction.rest.W3WPredictionRestApiUtil;
import com.binance.connector.client.w3w_prediction.rest.api.W3WPredictionRestApi;
import com.binance.connector.client.w3w_prediction.rest.model.QueryOrderBookResponse;

/** API examples for MarketDataApi */
public class QueryOrderBookExample {
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
     * Query Order Book
     *
     * <p>Get the current order book (bids and asks) for a specific prediction market outcome token.
     * Weight(IP): 200
     *
     * @throws ApiException if the Api call fails
     */
    public void queryOrderBookExample() throws ApiException {
        String vendor = "predict_fun";
        Long marketId = 5567895L;
        String tokenId = "112233";
        ApiResponse<QueryOrderBookResponse> response =
                getApi().queryOrderBook(vendor, marketId, tokenId);
        System.out.println(response.getData());
    }
}
