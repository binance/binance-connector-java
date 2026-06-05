package com.binance.connector.client.simple_earn.rest.bfusd;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.simple_earn.rest.SimpleEarnRestApiUtil;
import com.binance.connector.client.simple_earn.rest.api.SimpleEarnRestApi;
import com.binance.connector.client.simple_earn.rest.model.GetBfusdAccountResponse;

/** API examples for BfusdApi */
public class GetBfusdAccountExample {
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
     * Get BFUSD Account (USER_DATA)
     *
     * <p>Get BFUSD account information. Weight: 150
     *
     * @throws ApiException if the Api call fails
     */
    public void getBfusdAccountExample() throws ApiException {
        Long recvWindow = 5000L;
        ApiResponse<GetBfusdAccountResponse> response = getApi().getBfusdAccount(recvWindow);
        System.out.println(response.getData());
    }
}
