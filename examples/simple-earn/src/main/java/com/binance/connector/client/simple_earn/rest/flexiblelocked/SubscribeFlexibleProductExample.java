package com.binance.connector.client.simple_earn.rest.flexiblelocked;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.simple_earn.rest.SimpleEarnRestApiUtil;
import com.binance.connector.client.simple_earn.rest.api.SimpleEarnRestApi;
import com.binance.connector.client.simple_earn.rest.model.SubscribeFlexibleProductRequest;
import com.binance.connector.client.simple_earn.rest.model.SubscribeFlexibleProductResponse;

/** API examples for FlexibleLockedApi */
public class SubscribeFlexibleProductExample {
    private SimpleEarnRestApi api;

    public SimpleEarnRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    SimpleEarnRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new SimpleEarnRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Subscribe Flexible Product(TRADE)
     *
     * <p>Subscribe Flexible Product * You need to open &#x60;Enable Spot &amp; Margin Trading&#x60;
     * permission for the API Key which requests this endpoint. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void subscribeFlexibleProductExample() throws ApiException {
        SubscribeFlexibleProductRequest subscribeFlexibleProductRequest =
                new SubscribeFlexibleProductRequest();
        subscribeFlexibleProductRequest.productId("1");
        subscribeFlexibleProductRequest.amount(1.0d);
        ApiResponse<SubscribeFlexibleProductResponse> response =
                getApi().subscribeFlexibleProduct(subscribeFlexibleProductRequest);
        System.out.println(response.getData());
    }
}
