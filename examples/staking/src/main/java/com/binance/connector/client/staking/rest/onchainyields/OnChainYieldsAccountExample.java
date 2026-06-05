package com.binance.connector.client.staking.rest.onchainyields;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.staking.rest.StakingRestApiUtil;
import com.binance.connector.client.staking.rest.api.StakingRestApi;
import com.binance.connector.client.staking.rest.model.OnChainYieldsAccountResponse;

/** API examples for OnChainYieldsApi */
public class OnChainYieldsAccountExample {
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
     * On-chain Yields Account (USER_DATA)
     *
     * <p>On-chain Yields Account query Weight: 50
     *
     * @throws ApiException if the Api call fails
     */
    public void onChainYieldsAccountExample() throws ApiException {
        Long recvWindow = 5000L;
        ApiResponse<OnChainYieldsAccountResponse> response =
                getApi().onChainYieldsAccount(recvWindow);
        System.out.println(response.getData());
    }
}
