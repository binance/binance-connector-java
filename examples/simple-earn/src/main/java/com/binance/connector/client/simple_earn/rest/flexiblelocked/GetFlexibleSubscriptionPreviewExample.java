package com.binance.connector.client.simple_earn.rest.flexiblelocked;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.simple_earn.rest.SimpleEarnRestApiUtil;
import com.binance.connector.client.simple_earn.rest.api.SimpleEarnRestApi;
import com.binance.connector.client.simple_earn.rest.model.GetFlexibleSubscriptionPreviewResponse;

/** API examples for FlexibleLockedApi */
public class GetFlexibleSubscriptionPreviewExample {
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
     * Get Flexible Subscription Preview(USER_DATA)
     *
     * <p>Get Flexible Subscription Preview Weight: 150
     *
     * @throws ApiException if the Api call fails
     */
    public void getFlexibleSubscriptionPreviewExample() throws ApiException {
        String productId = "1";
        Double amount = 1.0d;
        Long recvWindow = 5000L;
        ApiResponse<GetFlexibleSubscriptionPreviewResponse> response =
                getApi().getFlexibleSubscriptionPreview(productId, amount, recvWindow);
        System.out.println(response.getData());
    }
}
