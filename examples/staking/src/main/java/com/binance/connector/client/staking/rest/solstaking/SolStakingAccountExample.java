package com.binance.connector.client.staking.rest.solstaking;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.staking.rest.StakingRestApiUtil;
import com.binance.connector.client.staking.rest.api.StakingRestApi;
import com.binance.connector.client.staking.rest.model.SolStakingAccountResponse;

/** API examples for SolStakingApi */
public class SolStakingAccountExample {
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
     * SOL Staking account(USER_DATA)
     *
     * <p>SOL Staking account Weight: 150
     *
     * @throws ApiException if the Api call fails
     */
    public void solStakingAccountExample() throws ApiException {
        Long recvWindow = 5000L;
        ApiResponse<SolStakingAccountResponse> response = getApi().solStakingAccount(recvWindow);
        System.out.println(response.getData());
    }
}
