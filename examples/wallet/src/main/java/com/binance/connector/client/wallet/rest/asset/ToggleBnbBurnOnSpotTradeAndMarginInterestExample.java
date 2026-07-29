package com.binance.connector.client.wallet.rest.asset;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.ToggleBnbBurnOnSpotTradeAndMarginInterestRequest;
import com.binance.connector.client.wallet.rest.model.ToggleBnbBurnOnSpotTradeAndMarginInterestResponse;
import java.io.IOException;

/** API examples for AssetApi */
public class ToggleBnbBurnOnSpotTradeAndMarginInterestExample {
    private WalletRestApi api;

    public WalletRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = WalletRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new WalletRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Toggle BNB Burn On Spot Trade And Margin Interest (USER_DATA)
     *
     * <p>Toggle BNB Burn On Spot Trade And Margin Interest Weight(IP): 1 Security Type: USER_DATA
     * Notes: - \&quot;spotBNBBurn\&quot; and \&quot;interestBNBBurn\&quot; should be sent at least
     * one.
     *
     * @throws ApiException if the Api call fails
     */
    public void toggleBnbBurnOnSpotTradeAndMarginInterestExample()
            throws ApiException, IOException {
        ToggleBnbBurnOnSpotTradeAndMarginInterestRequest
                toggleBnbBurnOnSpotTradeAndMarginInterestRequest =
                        new ToggleBnbBurnOnSpotTradeAndMarginInterestRequest();
        ApiResponse<ToggleBnbBurnOnSpotTradeAndMarginInterestResponse> response =
                getApi().toggleBnbBurnOnSpotTradeAndMarginInterest(
                                toggleBnbBurnOnSpotTradeAndMarginInterestRequest);
        System.out.println(response.getData());
    }
}
