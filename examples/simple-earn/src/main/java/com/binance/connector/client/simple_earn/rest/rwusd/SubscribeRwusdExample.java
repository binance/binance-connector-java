package com.binance.connector.client.simple_earn.rest.rwusd;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.simple_earn.rest.SimpleEarnRestApiUtil;
import com.binance.connector.client.simple_earn.rest.api.SimpleEarnRestApi;
import com.binance.connector.client.simple_earn.rest.model.SubscribeRwusdRequest;
import com.binance.connector.client.simple_earn.rest.model.SubscribeRwusdResponse;

/** API examples for RwusdApi */
public class SubscribeRwusdExample {
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
     * Subscribe RWUSD(TRADE)
     *
     * <p>Subscribe RWUSD * You need to open Enable Spot &amp; Margin Trading permission for the API
     * Key which requests this endpoint. Weight: 150
     *
     * @throws ApiException if the Api call fails
     */
    public void subscribeRwusdExample() throws ApiException {
        SubscribeRwusdRequest subscribeRwusdRequest = new SubscribeRwusdRequest();
        subscribeRwusdRequest.asset("");
        subscribeRwusdRequest.amount(1.0d);
        ApiResponse<SubscribeRwusdResponse> response =
                getApi().subscribeRwusd(subscribeRwusdRequest);
        System.out.println(response.getData());
    }
}
