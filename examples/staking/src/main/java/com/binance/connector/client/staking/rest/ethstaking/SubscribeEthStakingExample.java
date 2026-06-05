package com.binance.connector.client.staking.rest.ethstaking;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.staking.rest.StakingRestApiUtil;
import com.binance.connector.client.staking.rest.api.StakingRestApi;
import com.binance.connector.client.staking.rest.model.SubscribeEthStakingRequest;
import com.binance.connector.client.staking.rest.model.SubscribeEthStakingResponse;

/** API examples for EthStakingApi */
public class SubscribeEthStakingExample {
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
     * Subscribe ETH Staking(TRADE)
     *
     * <p>Subscribe ETH Staking * You need to open Enable Spot &amp; Margin Trading permission for
     * the API Key which requests this endpoint. Weight: 150
     *
     * @throws ApiException if the Api call fails
     */
    public void subscribeEthStakingExample() throws ApiException {
        SubscribeEthStakingRequest subscribeEthStakingRequest = new SubscribeEthStakingRequest();
        subscribeEthStakingRequest.amount(1.0d);
        ApiResponse<SubscribeEthStakingResponse> response =
                getApi().subscribeEthStaking(subscribeEthStakingRequest);
        System.out.println(response.getData());
    }
}
