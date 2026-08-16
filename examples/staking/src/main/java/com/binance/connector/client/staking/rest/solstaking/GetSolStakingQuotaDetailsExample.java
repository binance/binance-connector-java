package com.binance.connector.client.staking.rest.solstaking;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.staking.rest.StakingRestApiUtil;
import com.binance.connector.client.staking.rest.api.StakingRestApi;
import com.binance.connector.client.staking.rest.model.GetSolStakingQuotaDetailsResponse;
import java.io.IOException;

/** API examples for SolStakingApi */
public class GetSolStakingQuotaDetailsExample {
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
     * Get SOL staking quota details (USER_DATA)
     *
     * <p>Get SOL staking quota Weight(IP): 150 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void getSolStakingQuotaDetailsExample() throws ApiException, IOException {
        Long recvWindow = 5000L;
        ApiResponse<GetSolStakingQuotaDetailsResponse> response =
                getApi().getSolStakingQuotaDetails(recvWindow);
        System.out.println(response.getData());
    }
}
