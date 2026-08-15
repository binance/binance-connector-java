package com.binance.connector.client.simple_earn.rest.flexiblelocked;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.simple_earn.rest.SimpleEarnRestApiUtil;
import com.binance.connector.client.simple_earn.rest.api.SimpleEarnRestApi;
import com.binance.connector.client.simple_earn.rest.model.RedeemFlexibleProductRequest;
import com.binance.connector.client.simple_earn.rest.model.RedeemFlexibleProductResponse;
import java.io.IOException;

/** API examples for FlexibleLockedApi */
public class RedeemFlexibleProductExample {
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
     * Redeem Flexible Product (TRADE)
     *
     * <p>Redeem Flexible Product Weight(IP): 1 Security Type: TRADE Notes: - You need to open
     * &#x60;Enable Spot &amp; Margin Trading&#x60; permission for the API Key which requests this
     * endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    public void redeemFlexibleProductExample() throws ApiException, IOException {
        RedeemFlexibleProductRequest redeemFlexibleProductRequest =
                new RedeemFlexibleProductRequest();
        redeemFlexibleProductRequest.productId("1");
        ApiResponse<RedeemFlexibleProductResponse> response =
                getApi().redeemFlexibleProduct(redeemFlexibleProductRequest);
        System.out.println(response.getData());
    }
}
