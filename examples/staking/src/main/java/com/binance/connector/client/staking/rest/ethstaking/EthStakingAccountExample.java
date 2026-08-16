package com.binance.connector.client.staking.rest.ethstaking;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.staking.rest.StakingRestApiUtil;
import com.binance.connector.client.staking.rest.api.StakingRestApi;
import com.binance.connector.client.staking.rest.model.EthStakingAccountResponse;
import java.io.IOException;

/** API examples for EthStakingApi */
public class EthStakingAccountExample {
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
     * ETH Staking account (USER_DATA)
     *
     * <p>ETH Staking account Weight(IP): 150 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void ethStakingAccountExample() throws ApiException, IOException {
        Long recvWindow = 5000L;
        ApiResponse<EthStakingAccountResponse> response = getApi().ethStakingAccount(recvWindow);
        System.out.println(response.getData());
    }
}
