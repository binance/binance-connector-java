package com.binance.connector.client.staking.rest.solstaking;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.staking.rest.StakingRestApiUtil;
import com.binance.connector.client.staking.rest.api.StakingRestApi;
import com.binance.connector.client.staking.rest.model.GetUnclaimedRewardsResponse;

/** API examples for SolStakingApi */
public class GetUnclaimedRewardsExample {
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
     * Get Unclaimed Rewards(USER_DATA)
     *
     * <p>Get Unclaimed rewards * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60;
     * cannot be longer than 3 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both
     * not sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is
     * sent but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from
     * &#x60;startTime&#x60; will be returned. * If &#x60;endTime&#x60; is sent but
     * &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be
     * returned. Weight: 150
     *
     * @throws ApiException if the Api call fails
     */
    public void getUnclaimedRewardsExample() throws ApiException {
        Long recvWindow = 5000L;
        ApiResponse<GetUnclaimedRewardsResponse> response =
                getApi().getUnclaimedRewards(recvWindow);
        System.out.println(response.getData());
    }
}
