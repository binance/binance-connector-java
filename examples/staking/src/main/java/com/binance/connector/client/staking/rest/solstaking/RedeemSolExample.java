package com.binance.connector.client.staking.rest.solstaking;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.staking.rest.StakingRestApiUtil;
import com.binance.connector.client.staking.rest.api.StakingRestApi;
import com.binance.connector.client.staking.rest.model.RedeemSolRequest;
import com.binance.connector.client.staking.rest.model.RedeemSolResponse;
import java.io.IOException;

/** API examples for SolStakingApi */
public class RedeemSolExample {
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
     * Redeem SOL (TRADE)
     *
     * <p>Redeem BNSOL get SOL Weight(IP): 150 Security Type: TRADE Notes: - You need to open Enable
     * Spot &amp; Margin Trading permission for the API Key which requests this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    public void redeemSolExample() throws ApiException, IOException {
        RedeemSolRequest redeemSolRequest = new RedeemSolRequest();
        redeemSolRequest.amount(1.0d);
        ApiResponse<RedeemSolResponse> response = getApi().redeemSol(redeemSolRequest);
        System.out.println(response.getData());
    }
}
