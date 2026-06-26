package com.binance.connector.client.w3w_prediction.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.w3w_prediction.rest.W3WPredictionRestApiUtil;
import com.binance.connector.client.w3w_prediction.rest.api.W3WPredictionRestApi;
import com.binance.connector.client.w3w_prediction.rest.model.ListPredictionMarketsResponse;
import com.binance.connector.client.w3w_prediction.rest.model.OrderBy;
import com.binance.connector.client.w3w_prediction.rest.model.SortBy;

/** API examples for MarketDataApi */
public class ListPredictionMarketsExample {
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
     * List Prediction Markets
     *
     * <p>Get a paginated list of prediction market topics, with optional category and sort filters.
     * Weight(IP): 200
     *
     * @throws ApiException if the Api call fails
     */
    public void listPredictionMarketsExample() throws ApiException {
        String l1Category = "crypto";
        String l2Category = "up-down";
        SortBy sortBy = SortBy.RECOMMENDED;
        OrderBy orderBy = OrderBy.ASC;
        Integer offset = 0;
        Integer limit = 20;
        ApiResponse<ListPredictionMarketsResponse> response =
                getApi().listPredictionMarkets(
                                l1Category, l2Category, sortBy, orderBy, offset, limit);
        System.out.println(response.getData());
    }
}
