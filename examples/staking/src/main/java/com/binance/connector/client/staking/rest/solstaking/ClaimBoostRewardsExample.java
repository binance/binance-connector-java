package com.binance.connector.client.staking.rest.solstaking;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.staking.rest.StakingRestApiUtil;
import com.binance.connector.client.staking.rest.api.StakingRestApi;
import com.binance.connector.client.staking.rest.model.ClaimBoostRewardsRequest;
import com.binance.connector.client.staking.rest.model.ClaimBoostRewardsResponse;
import java.io.IOException;

/** API examples for SolStakingApi */
public class ClaimBoostRewardsExample {
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
     * Claim Boost Rewards (TRADE)
     *
     * <p>Claim Boost APR Airdrop Rewards Weight(IP): 150 Security Type: TRADE Notes: - You need to
     * open Enable Spot &amp; Margin Trading permission for the API Key which requests this
     * endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    public void claimBoostRewardsExample() throws ApiException, IOException {
        ClaimBoostRewardsRequest claimBoostRewardsRequest = new ClaimBoostRewardsRequest();
        ApiResponse<ClaimBoostRewardsResponse> response =
                getApi().claimBoostRewards(claimBoostRewardsRequest);
        System.out.println(response.getData());
    }
}
