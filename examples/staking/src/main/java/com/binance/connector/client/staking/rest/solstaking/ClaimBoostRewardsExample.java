package com.binance.connector.client.staking.rest.solstaking;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.staking.rest.StakingRestApiUtil;
import com.binance.connector.client.staking.rest.api.StakingRestApi;
import com.binance.connector.client.staking.rest.model.ClaimBoostRewardsRequest;
import com.binance.connector.client.staking.rest.model.ClaimBoostRewardsResponse;

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
     * Claim Boost Rewards(TRADE)
     *
     * <p>Claim Boost APR Airdrop Rewards * You need to open Enable Spot &amp; Margin Trading
     * permission for the API Key which requests this endpoint. Weight: 150
     *
     * @throws ApiException if the Api call fails
     */
    public void claimBoostRewardsExample() throws ApiException {
        ClaimBoostRewardsRequest claimBoostRewardsRequest = new ClaimBoostRewardsRequest();
        ApiResponse<ClaimBoostRewardsResponse> response =
                getApi().claimBoostRewards(claimBoostRewardsRequest);
        System.out.println(response.getData());
    }
}
