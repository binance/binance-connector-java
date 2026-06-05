package com.binance.connector.client.staking.rest.ethstaking;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.staking.rest.StakingRestApiUtil;
import com.binance.connector.client.staking.rest.api.StakingRestApi;
import com.binance.connector.client.staking.rest.model.GetCurrentEthStakingQuotaResponse;

/** API examples for EthStakingApi */
public class GetCurrentEthStakingQuotaExample {
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
     * Get current ETH staking quota(USER_DATA)
     *
     * <p>Get current ETH staking quota Weight: 150
     *
     * @throws ApiException if the Api call fails
     */
    public void getCurrentEthStakingQuotaExample() throws ApiException {
        Long recvWindow = 5000L;
        ApiResponse<GetCurrentEthStakingQuotaResponse> response =
                getApi().getCurrentEthStakingQuota(recvWindow);
        System.out.println(response.getData());
    }
}
