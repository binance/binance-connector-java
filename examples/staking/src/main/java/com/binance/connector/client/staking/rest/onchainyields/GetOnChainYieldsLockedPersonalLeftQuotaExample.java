package com.binance.connector.client.staking.rest.onchainyields;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.staking.rest.StakingRestApiUtil;
import com.binance.connector.client.staking.rest.api.StakingRestApi;
import com.binance.connector.client.staking.rest.model.GetOnChainYieldsLockedPersonalLeftQuotaResponse;

/** API examples for OnChainYieldsApi */
public class GetOnChainYieldsLockedPersonalLeftQuotaExample {
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
     * Get On-chain Yields Locked Personal Left Quota (USER_DATA)
     *
     * <p>Get On-chain Yields Locked Personal Left Quota Weight: 50
     *
     * @throws ApiException if the Api call fails
     */
    public void getOnChainYieldsLockedPersonalLeftQuotaExample() throws ApiException {
        String projectId = "1";
        Long recvWindow = 5000L;
        ApiResponse<GetOnChainYieldsLockedPersonalLeftQuotaResponse> response =
                getApi().getOnChainYieldsLockedPersonalLeftQuota(projectId, recvWindow);
        System.out.println(response.getData());
    }
}
