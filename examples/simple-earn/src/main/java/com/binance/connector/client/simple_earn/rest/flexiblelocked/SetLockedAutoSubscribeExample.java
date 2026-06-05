package com.binance.connector.client.simple_earn.rest.flexiblelocked;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.simple_earn.rest.SimpleEarnRestApiUtil;
import com.binance.connector.client.simple_earn.rest.api.SimpleEarnRestApi;
import com.binance.connector.client.simple_earn.rest.model.SetLockedAutoSubscribeRequest;
import com.binance.connector.client.simple_earn.rest.model.SetLockedAutoSubscribeResponse;

/** API examples for FlexibleLockedApi */
public class SetLockedAutoSubscribeExample {
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
     * Set Locked Auto Subscribe(USER_DATA)
     *
     * <p>Set locked auto subscribe Weight: 150
     *
     * @throws ApiException if the Api call fails
     */
    public void setLockedAutoSubscribeExample() throws ApiException {
        SetLockedAutoSubscribeRequest setLockedAutoSubscribeRequest =
                new SetLockedAutoSubscribeRequest();
        setLockedAutoSubscribeRequest.positionId("1");
        setLockedAutoSubscribeRequest.autoSubscribe(false);
        ApiResponse<SetLockedAutoSubscribeResponse> response =
                getApi().setLockedAutoSubscribe(setLockedAutoSubscribeRequest);
        System.out.println(response.getData());
    }
}
