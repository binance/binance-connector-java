package com.binance.connector.client.simple_earn.rest.flexiblelocked;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.simple_earn.rest.SimpleEarnRestApiUtil;
import com.binance.connector.client.simple_earn.rest.api.SimpleEarnRestApi;
import com.binance.connector.client.simple_earn.rest.model.GetFlexibleProductPositionResponse;

/** API examples for FlexibleLockedApi */
public class GetFlexibleProductPositionExample {
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
     * Get Flexible Product Position(USER_DATA)
     *
     * <p>Get Flexible Product Position Weight: 150
     *
     * @throws ApiException if the Api call fails
     */
    public void getFlexibleProductPositionExample() throws ApiException {
        String asset = "";
        String productId = "1";
        Long current = 1L;
        Long size = 10L;
        Long recvWindow = 5000L;
        ApiResponse<GetFlexibleProductPositionResponse> response =
                getApi().getFlexibleProductPosition(asset, productId, current, size, recvWindow);
        System.out.println(response.getData());
    }
}
