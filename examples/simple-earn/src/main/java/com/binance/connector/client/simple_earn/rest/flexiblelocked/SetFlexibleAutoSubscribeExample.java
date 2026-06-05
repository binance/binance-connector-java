package com.binance.connector.client.simple_earn.rest.flexiblelocked;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.simple_earn.rest.SimpleEarnRestApiUtil;
import com.binance.connector.client.simple_earn.rest.api.SimpleEarnRestApi;
import com.binance.connector.client.simple_earn.rest.model.SetFlexibleAutoSubscribeRequest;
import com.binance.connector.client.simple_earn.rest.model.SetFlexibleAutoSubscribeResponse;

/** API examples for FlexibleLockedApi */
public class SetFlexibleAutoSubscribeExample {
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
     * Set Flexible Auto Subscribe(USER_DATA)
     *
     * <p>Set Flexible Auto Subscribe Weight: 150
     *
     * @throws ApiException if the Api call fails
     */
    public void setFlexibleAutoSubscribeExample() throws ApiException {
        SetFlexibleAutoSubscribeRequest setFlexibleAutoSubscribeRequest =
                new SetFlexibleAutoSubscribeRequest();
        setFlexibleAutoSubscribeRequest.productId("1");
        setFlexibleAutoSubscribeRequest.autoSubscribe(false);
        ApiResponse<SetFlexibleAutoSubscribeResponse> response =
                getApi().setFlexibleAutoSubscribe(setFlexibleAutoSubscribeRequest);
        System.out.println(response.getData());
    }
}
