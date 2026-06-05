package com.binance.connector.client.simple_earn.rest.flexiblelocked;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.simple_earn.rest.SimpleEarnRestApiUtil;
import com.binance.connector.client.simple_earn.rest.api.SimpleEarnRestApi;
import com.binance.connector.client.simple_earn.rest.model.GetLockedPersonalLeftQuotaResponse;

/** API examples for FlexibleLockedApi */
public class GetLockedPersonalLeftQuotaExample {
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
     * Get Locked Personal Left Quota(USER_DATA)
     *
     * <p>Get Locked Personal Left Quota Weight: 150
     *
     * @throws ApiException if the Api call fails
     */
    public void getLockedPersonalLeftQuotaExample() throws ApiException {
        String projectId = "1";
        Long recvWindow = 5000L;
        ApiResponse<GetLockedPersonalLeftQuotaResponse> response =
                getApi().getLockedPersonalLeftQuota(projectId, recvWindow);
        System.out.println(response.getData());
    }
}
