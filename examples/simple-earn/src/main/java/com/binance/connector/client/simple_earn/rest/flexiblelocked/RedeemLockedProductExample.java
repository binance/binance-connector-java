package com.binance.connector.client.simple_earn.rest.flexiblelocked;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.simple_earn.rest.SimpleEarnRestApiUtil;
import com.binance.connector.client.simple_earn.rest.api.SimpleEarnRestApi;
import com.binance.connector.client.simple_earn.rest.model.RedeemLockedProductRequest;
import com.binance.connector.client.simple_earn.rest.model.RedeemLockedProductResponse;
import java.io.IOException;

/** API examples for FlexibleLockedApi */
public class RedeemLockedProductExample {
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
     * Redeem Locked Product (TRADE)
     *
     * <p>Redeem Locked Product Weight(IP): 1 Security Type: TRADE Notes: - You need to open
     * &#x60;Enable Spot &amp; Margin Trading&#x60; permission for the API Key which requests this
     * endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    public void redeemLockedProductExample() throws ApiException, IOException {
        RedeemLockedProductRequest redeemLockedProductRequest = new RedeemLockedProductRequest();
        redeemLockedProductRequest.positionId("1");
        ApiResponse<RedeemLockedProductResponse> response =
                getApi().redeemLockedProduct(redeemLockedProductRequest);
        System.out.println(response.getData());
    }
}
