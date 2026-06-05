package com.binance.connector.client.simple_earn.rest.bfusd;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.simple_earn.rest.SimpleEarnRestApiUtil;
import com.binance.connector.client.simple_earn.rest.api.SimpleEarnRestApi;
import com.binance.connector.client.simple_earn.rest.model.SubscribeBfusdRequest;
import com.binance.connector.client.simple_earn.rest.model.SubscribeBfusdResponse;

/** API examples for BfusdApi */
public class SubscribeBfusdExample {
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
     * Subscribe BFUSD(TRADE)
     *
     * <p>Subscribe BFUSD * You need to open Enable Spot &amp; Margin Trading permission for the API
     * Key which requests this endpoint. Weight: 150
     *
     * @throws ApiException if the Api call fails
     */
    public void subscribeBfusdExample() throws ApiException {
        SubscribeBfusdRequest subscribeBfusdRequest = new SubscribeBfusdRequest();
        subscribeBfusdRequest.asset("");
        subscribeBfusdRequest.amount(1.0d);
        ApiResponse<SubscribeBfusdResponse> response =
                getApi().subscribeBfusd(subscribeBfusdRequest);
        System.out.println(response.getData());
    }
}
