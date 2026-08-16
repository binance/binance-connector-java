package com.binance.connector.client.staking.rest.ethstaking;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.staking.rest.StakingRestApiUtil;
import com.binance.connector.client.staking.rest.api.StakingRestApi;
import com.binance.connector.client.staking.rest.model.RedeemEthRequest;
import com.binance.connector.client.staking.rest.model.RedeemEthResponse;
import java.io.IOException;

/** API examples for EthStakingApi */
public class RedeemEthExample {
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
     * Redeem ETH (TRADE)
     *
     * <p>Redeem WBETH or BETH and get ETH Weight(IP): 150 Security Type: TRADE Notes: - You need to
     * open Enable Spot &amp; Margin Trading permission for the API Key which requests this
     * endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    public void redeemEthExample() throws ApiException, IOException {
        RedeemEthRequest redeemEthRequest = new RedeemEthRequest();
        redeemEthRequest.amount(1.0d);
        ApiResponse<RedeemEthResponse> response = getApi().redeemEth(redeemEthRequest);
        System.out.println(response.getData());
    }
}
