package com.binance.connector.client.simple_earn.rest.rwusd;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.simple_earn.rest.SimpleEarnRestApiUtil;
import com.binance.connector.client.simple_earn.rest.api.SimpleEarnRestApi;
import com.binance.connector.client.simple_earn.rest.model.Asset;
import com.binance.connector.client.simple_earn.rest.model.SubscribeRwusdRequest;
import com.binance.connector.client.simple_earn.rest.model.SubscribeRwusdResponse;
import java.io.IOException;

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
     * Subscribe RWUSD (TRADE)
     *
     * <p>Subscribe RWUSD Weight(IP): 150 Security Type: TRADE Notes: - You need to open Enable Spot
     * &amp; Margin Trading permission for the API Key which requests this endpoint. - This API only
     * supports RWUSD subscription using assets held in the Spot Account. Subscriptions initiated
     * from the Funding Account or any other account type are not supported.
     *
     * @throws ApiException if the Api call fails
     */
    public void subscribeRwusdExample() throws ApiException, IOException {
        SubscribeRwusdRequest subscribeRwusdRequest = new SubscribeRwusdRequest();
        subscribeRwusdRequest.asset(Asset.USDT);
        subscribeRwusdRequest.amount(1.0d);
        ApiResponse<SubscribeRwusdResponse> response =
                getApi().subscribeRwusd(subscribeRwusdRequest);
        System.out.println(response.getData());
    }
}
