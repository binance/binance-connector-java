package com.binance.connector.client.staking.rest.onchainyields;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.staking.rest.StakingRestApiUtil;
import com.binance.connector.client.staking.rest.api.StakingRestApi;
import com.binance.connector.client.staking.rest.model.SetOnChainYieldsLockedProductRedeemOptionRequest;
import com.binance.connector.client.staking.rest.model.SetOnChainYieldsLockedProductRedeemOptionResponse;

/** API examples for OnChainYieldsApi */
public class SetOnChainYieldsLockedProductRedeemOptionExample {
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
     * Set On-chain Yields Locked Product Redeem Option(USER_DATA)
     *
     * <p>Set On-chain Yields redeem option for Locked product Weight: 50
     *
     * @throws ApiException if the Api call fails
     */
    public void setOnChainYieldsLockedProductRedeemOptionExample() throws ApiException {
        SetOnChainYieldsLockedProductRedeemOptionRequest
                setOnChainYieldsLockedProductRedeemOptionRequest =
                        new SetOnChainYieldsLockedProductRedeemOptionRequest();
        setOnChainYieldsLockedProductRedeemOptionRequest.positionId("1");
        setOnChainYieldsLockedProductRedeemOptionRequest.redeemTo("");
        ApiResponse<SetOnChainYieldsLockedProductRedeemOptionResponse> response =
                getApi().setOnChainYieldsLockedProductRedeemOption(
                                setOnChainYieldsLockedProductRedeemOptionRequest);
        System.out.println(response.getData());
    }
}
