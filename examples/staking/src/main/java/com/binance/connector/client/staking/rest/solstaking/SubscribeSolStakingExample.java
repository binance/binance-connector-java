package com.binance.connector.client.staking.rest.solstaking;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.staking.rest.StakingRestApiUtil;
import com.binance.connector.client.staking.rest.api.StakingRestApi;
import com.binance.connector.client.staking.rest.model.SubscribeSolStakingRequest;
import com.binance.connector.client.staking.rest.model.SubscribeSolStakingResponse;
import java.io.IOException;

/** API examples for SolStakingApi */
public class SubscribeSolStakingExample {
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
     * Subscribe SOL Staking (TRADE)
     *
     * <p>Subscribe SOL Staking Weight(IP): 150 Security Type: TRADE Notes: - You need to open
     * Enable Spot &amp; Margin Trading permission for the API Key which requests this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    public void subscribeSolStakingExample() throws ApiException, IOException {
        SubscribeSolStakingRequest subscribeSolStakingRequest = new SubscribeSolStakingRequest();
        subscribeSolStakingRequest.amount(1.0d);
        ApiResponse<SubscribeSolStakingResponse> response =
                getApi().subscribeSolStaking(subscribeSolStakingRequest);
        System.out.println(response.getData());
    }
}
