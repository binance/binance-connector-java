package com.binance.connector.client.simple_earn.rest.rwusd;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.simple_earn.rest.SimpleEarnRestApiUtil;
import com.binance.connector.client.simple_earn.rest.api.SimpleEarnRestApi;
import com.binance.connector.client.simple_earn.rest.model.RedeemRwusdRequest;
import com.binance.connector.client.simple_earn.rest.model.RedeemRwusdResponse;

/** API examples for RwusdApi */
public class RedeemRwusdExample {
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
     * Redeem RWUSD(TRADE)
     *
     * <p>Redeem RWUSD to USDC * You need to open Enable Spot &amp; Margin Trading permission for
     * the API Key which requests this endpoint. Weight: 150
     *
     * @throws ApiException if the Api call fails
     */
    public void redeemRwusdExample() throws ApiException {
        RedeemRwusdRequest redeemRwusdRequest = new RedeemRwusdRequest();
        redeemRwusdRequest.amount(1.0d);
        redeemRwusdRequest.type("s");
        ApiResponse<RedeemRwusdResponse> response = getApi().redeemRwusd(redeemRwusdRequest);
        System.out.println(response.getData());
    }
}
