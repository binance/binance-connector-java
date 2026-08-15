package com.binance.connector.client.simple_earn.rest.flexiblelocked;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.simple_earn.rest.SimpleEarnRestApiUtil;
import com.binance.connector.client.simple_earn.rest.api.SimpleEarnRestApi;
import com.binance.connector.client.simple_earn.rest.model.SubscribeLockedProductRequest;
import com.binance.connector.client.simple_earn.rest.model.SubscribeLockedProductResponse;
import java.io.IOException;

/** API examples for FlexibleLockedApi */
public class SubscribeLockedProductExample {
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
     * Subscribe Locked Product (TRADE)
     *
     * <p>Subscribe Locked Product Weight(IP): 1 Security Type: TRADE Notes: - You need to open
     * &#x60;Enable Spot &amp; Margin Trading&#x60; permission for the API Key which requests this
     * endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    public void subscribeLockedProductExample() throws ApiException, IOException {
        SubscribeLockedProductRequest subscribeLockedProductRequest =
                new SubscribeLockedProductRequest();
        subscribeLockedProductRequest.projectId("1");
        subscribeLockedProductRequest.amount(1.0d);
        ApiResponse<SubscribeLockedProductResponse> response =
                getApi().subscribeLockedProduct(subscribeLockedProductRequest);
        System.out.println(response.getData());
    }
}
