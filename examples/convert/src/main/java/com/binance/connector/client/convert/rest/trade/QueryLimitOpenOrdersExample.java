package com.binance.connector.client.convert.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.convert.rest.ConvertRestApiUtil;
import com.binance.connector.client.convert.rest.api.ConvertRestApi;
import com.binance.connector.client.convert.rest.model.QueryLimitOpenOrdersResponse;

/** API examples for TradeApi */
public class QueryLimitOpenOrdersExample {
    private ConvertRestApi api;

    public ConvertRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = ConvertRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new ConvertRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Query limit open orders (USER_DATA)
     *
     * <p>Request a quote for the requested token pairs Weight: 3000(UID)
     *
     * @throws ApiException if the Api call fails
     */
    public void queryLimitOpenOrdersExample() throws ApiException {
        Long recvWindow = 5000L;
        ApiResponse<QueryLimitOpenOrdersResponse> response =
                getApi().queryLimitOpenOrders(recvWindow);
        System.out.println(response.getData());
    }
}
