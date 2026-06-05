package com.binance.connector.client.simple_earn.rest.rwusd;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.simple_earn.rest.SimpleEarnRestApiUtil;
import com.binance.connector.client.simple_earn.rest.api.SimpleEarnRestApi;
import com.binance.connector.client.simple_earn.rest.model.GetRwusdAccountResponse;

/** API examples for RwusdApi */
public class GetRwusdAccountExample {
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
     * Get RWUSD Account (USER_DATA)
     *
     * <p>Get RWUSD account information. Weight: 150
     *
     * @throws ApiException if the Api call fails
     */
    public void getRwusdAccountExample() throws ApiException {
        Long recvWindow = 5000L;
        ApiResponse<GetRwusdAccountResponse> response = getApi().getRwusdAccount(recvWindow);
        System.out.println(response.getData());
    }
}
