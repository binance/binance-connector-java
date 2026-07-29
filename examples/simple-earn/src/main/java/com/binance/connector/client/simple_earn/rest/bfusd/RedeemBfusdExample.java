package com.binance.connector.client.simple_earn.rest.bfusd;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.simple_earn.rest.SimpleEarnRestApiUtil;
import com.binance.connector.client.simple_earn.rest.api.SimpleEarnRestApi;
import com.binance.connector.client.simple_earn.rest.model.OrderType;
import com.binance.connector.client.simple_earn.rest.model.RedeemBfusdRequest;
import com.binance.connector.client.simple_earn.rest.model.RedeemBfusdResponse;
import java.io.IOException;

/** API examples for BfusdApi */
public class RedeemBfusdExample {
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
     * Redeem BFUSD (TRADE)
     *
     * <p>Redeem BFUSD to USDT Weight(IP): 150 Security Type: TRADE Notes: - You need to open Enable
     * Spot &amp; Margin Trading permission for the API Key which requests this endpoint. - This API
     * only supports BFUSD redemption to the Spot Account. Redemptions to the Funding Account or any
     * other account type are not supported.
     *
     * @throws ApiException if the Api call fails
     */
    public void redeemBfusdExample() throws ApiException, IOException {
        RedeemBfusdRequest redeemBfusdRequest = new RedeemBfusdRequest();
        redeemBfusdRequest.amount(1.0d);
        redeemBfusdRequest.type(OrderType.FAST);
        ApiResponse<RedeemBfusdResponse> response = getApi().redeemBfusd(redeemBfusdRequest);
        System.out.println(response.getData());
    }
}
