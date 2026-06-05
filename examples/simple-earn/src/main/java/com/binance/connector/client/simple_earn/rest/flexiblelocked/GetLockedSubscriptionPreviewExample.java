package com.binance.connector.client.simple_earn.rest.flexiblelocked;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.simple_earn.rest.SimpleEarnRestApiUtil;
import com.binance.connector.client.simple_earn.rest.api.SimpleEarnRestApi;
import com.binance.connector.client.simple_earn.rest.model.GetLockedSubscriptionPreviewResponse;

/** API examples for FlexibleLockedApi */
public class GetLockedSubscriptionPreviewExample {
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
     * Get Locked Subscription Preview(USER_DATA)
     *
     * <p>Get Locked Subscription Preview Weight: 150
     *
     * @throws ApiException if the Api call fails
     */
    public void getLockedSubscriptionPreviewExample() throws ApiException {
        String projectId = "1";
        Double amount = 1.0d;
        Boolean autoSubscribe = false;
        Long recvWindow = 5000L;
        ApiResponse<GetLockedSubscriptionPreviewResponse> response =
                getApi().getLockedSubscriptionPreview(projectId, amount, autoSubscribe, recvWindow);
        System.out.println(response.getData());
    }
}
