package com.binance.connector.client.staking.rest.softstaking;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.staking.rest.StakingRestApiUtil;
import com.binance.connector.client.staking.rest.api.StakingRestApi;
import com.binance.connector.client.staking.rest.model.SetSoftStakingResponse;

/** API examples for SoftStakingApi */
public class SetSoftStakingExample {
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
     * Set Soft Staking (USER_DATA)
     *
     * <p>Enable or disable Soft Staking. Weight: 50
     *
     * @throws ApiException if the Api call fails
     */
    public void setSoftStakingExample() throws ApiException {
        Boolean softStaking = true;
        Long recvWindow = 5000L;
        ApiResponse<SetSoftStakingResponse> response =
                getApi().setSoftStaking(softStaking, recvWindow);
        System.out.println(response.getData());
    }
}
