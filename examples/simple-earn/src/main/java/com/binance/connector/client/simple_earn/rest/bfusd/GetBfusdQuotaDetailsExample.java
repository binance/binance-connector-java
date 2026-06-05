package com.binance.connector.client.simple_earn.rest.bfusd;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.simple_earn.rest.SimpleEarnRestApiUtil;
import com.binance.connector.client.simple_earn.rest.api.SimpleEarnRestApi;
import com.binance.connector.client.simple_earn.rest.model.GetBfusdQuotaDetailsResponse;

/** API examples for BfusdApi */
public class GetBfusdQuotaDetailsExample {
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
     * Get BFUSD Quota Details (USER_DATA)
     *
     * <p>Get BFUSD quota details including subscription quota, fast redemption quota and standard
     * redemption quota. Weight: 150
     *
     * @throws ApiException if the Api call fails
     */
    public void getBfusdQuotaDetailsExample() throws ApiException {
        Long recvWindow = 5000L;
        ApiResponse<GetBfusdQuotaDetailsResponse> response =
                getApi().getBfusdQuotaDetails(recvWindow);
        System.out.println(response.getData());
    }
}
