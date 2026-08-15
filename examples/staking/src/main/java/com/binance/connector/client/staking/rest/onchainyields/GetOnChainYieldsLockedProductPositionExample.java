package com.binance.connector.client.staking.rest.onchainyields;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.staking.rest.StakingRestApiUtil;
import com.binance.connector.client.staking.rest.api.StakingRestApi;
import com.binance.connector.client.staking.rest.model.GetOnChainYieldsLockedProductPositionResponse;
import java.io.IOException;

/** API examples for OnChainYieldsApi */
public class GetOnChainYieldsLockedProductPositionExample {
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
     * Get On-chain Yields Locked Product Position (USER_DATA)
     *
     * <p>Get On-chain Yields Locked Product Position Weight(IP): 50 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void getOnChainYieldsLockedProductPositionExample() throws ApiException, IOException {
        String asset = "BTC";
        String positionId = "1";
        String projectId = "1";
        Long current = 1L;
        Long size = 10L;
        Long recvWindow = 5000L;
        ApiResponse<GetOnChainYieldsLockedProductPositionResponse> response =
                getApi().getOnChainYieldsLockedProductPosition(
                                asset, positionId, projectId, current, size, recvWindow);
        System.out.println(response.getData());
    }
}
