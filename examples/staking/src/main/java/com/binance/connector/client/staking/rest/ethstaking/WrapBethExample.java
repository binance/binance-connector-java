package com.binance.connector.client.staking.rest.ethstaking;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.staking.rest.StakingRestApiUtil;
import com.binance.connector.client.staking.rest.api.StakingRestApi;
import com.binance.connector.client.staking.rest.model.WrapBethRequest;
import com.binance.connector.client.staking.rest.model.WrapBethResponse;

/** API examples for EthStakingApi */
public class WrapBethExample {
    private StakingRestApi api;

    public StakingRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = StakingRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new StakingRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Wrap BETH(TRADE)
     *
     * <p>Wrap BETH * You need to open Enable Spot &amp; Margin Trading permission for the API Key
     * which requests this endpoint. Weight: 150
     *
     * @throws ApiException if the Api call fails
     */
    public void wrapBethExample() throws ApiException {
        WrapBethRequest wrapBethRequest = new WrapBethRequest();
        wrapBethRequest.amount(1.0d);
        ApiResponse<WrapBethResponse> response = getApi().wrapBeth(wrapBethRequest);
        System.out.println(response.getData());
    }
}
