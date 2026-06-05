package com.binance.connector.client.simple_earn.rest.flexiblelocked;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.simple_earn.rest.SimpleEarnRestApiUtil;
import com.binance.connector.client.simple_earn.rest.api.SimpleEarnRestApi;
import com.binance.connector.client.simple_earn.rest.model.SetLockedProductRedeemOptionRequest;
import com.binance.connector.client.simple_earn.rest.model.SetLockedProductRedeemOptionResponse;

/** API examples for FlexibleLockedApi */
public class SetLockedProductRedeemOptionExample {
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
     * Set Locked Product Redeem Option(USER_DATA)
     *
     * <p>Set redeem option for Locked product Weight: 50
     *
     * @throws ApiException if the Api call fails
     */
    public void setLockedProductRedeemOptionExample() throws ApiException {
        SetLockedProductRedeemOptionRequest setLockedProductRedeemOptionRequest =
                new SetLockedProductRedeemOptionRequest();
        setLockedProductRedeemOptionRequest.positionId("1");
        setLockedProductRedeemOptionRequest.redeemTo("SPOT");
        ApiResponse<SetLockedProductRedeemOptionResponse> response =
                getApi().setLockedProductRedeemOption(setLockedProductRedeemOptionRequest);
        System.out.println(response.getData());
    }
}
