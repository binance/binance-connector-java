package com.binance.connector.client.staking.rest.softstaking;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.staking.rest.StakingRestApiUtil;
import com.binance.connector.client.staking.rest.api.StakingRestApi;
import com.binance.connector.client.staking.rest.model.GetSoftStakingProductListResponse;
import java.io.IOException;

/** API examples for SoftStakingApi */
public class GetSoftStakingProductListExample {
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
     * Get Soft Staking Product List (USER_DATA)
     *
     * <p>Get the available Soft Staking product list. Weight(IP): 50 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void getSoftStakingProductListExample() throws ApiException, IOException {
        String asset = "BTC";
        Long current = 1L;
        Long size = 10L;
        Long recvWindow = 5000L;
        ApiResponse<GetSoftStakingProductListResponse> response =
                getApi().getSoftStakingProductList(asset, current, size, recvWindow);
        System.out.println(response.getData());
    }
}
