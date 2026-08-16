package com.binance.connector.client.staking.rest.onchainyields;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.staking.rest.StakingRestApiUtil;
import com.binance.connector.client.staking.rest.api.StakingRestApi;
import com.binance.connector.client.staking.rest.model.SubscribeOnChainYieldsLockedProductRequest;
import com.binance.connector.client.staking.rest.model.SubscribeOnChainYieldsLockedProductResponse;
import java.io.IOException;

/** API examples for OnChainYieldsApi */
public class SubscribeOnChainYieldsLockedProductExample {
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
     * Subscribe On-chain Yields Locked Product (TRADE)
     *
     * <p>Subscribe On-chain Yields Locked Product Weight(IP): 200 Security Type: TRADE Notes: - You
     * need to open &#x60;Enable Spot &amp; Margin Trading&#x60; permission for the API Key which
     * requests this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    public void subscribeOnChainYieldsLockedProductExample() throws ApiException, IOException {
        SubscribeOnChainYieldsLockedProductRequest subscribeOnChainYieldsLockedProductRequest =
                new SubscribeOnChainYieldsLockedProductRequest();
        subscribeOnChainYieldsLockedProductRequest.projectId("1");
        subscribeOnChainYieldsLockedProductRequest.amount(1.0d);
        ApiResponse<SubscribeOnChainYieldsLockedProductResponse> response =
                getApi().subscribeOnChainYieldsLockedProduct(
                                subscribeOnChainYieldsLockedProductRequest);
        System.out.println(response.getData());
    }
}
