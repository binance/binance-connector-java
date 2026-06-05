package com.binance.connector.client.simple_earn.rest.flexiblelocked;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.simple_earn.rest.SimpleEarnRestApiUtil;
import com.binance.connector.client.simple_earn.rest.api.SimpleEarnRestApi;
import com.binance.connector.client.simple_earn.rest.model.GetSimpleEarnLockedProductListResponse;

/** API examples for FlexibleLockedApi */
public class GetSimpleEarnLockedProductListExample {
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
     * Get Simple Earn Locked Product List(USER_DATA)
     *
     * <p>Get Simple Earn Locked Product List * Get available Simple Earn locked product list
     * Weight: 150
     *
     * @throws ApiException if the Api call fails
     */
    public void getSimpleEarnLockedProductListExample() throws ApiException {
        String asset = "";
        Long current = 1L;
        Long size = 10L;
        Long recvWindow = 5000L;
        ApiResponse<GetSimpleEarnLockedProductListResponse> response =
                getApi().getSimpleEarnLockedProductList(asset, current, size, recvWindow);
        System.out.println(response.getData());
    }
}
