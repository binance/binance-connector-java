package com.binance.connector.client.wallet.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.DisableFastWithdrawSwitchRequest;
import java.io.IOException;

/** API examples for AccountApi */
public class DisableFastWithdrawSwitchExample {
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
     * Disable Fast Withdraw Switch (USER_DATA)
     *
     * <p>Disable Fast Withdraw Switch Weight(IP): 1 Security Type: USER_DATA Notes: - This request
     * will disable fastwithdraw switch under your account. You need to enable \&quot;trade\&quot;
     * option for the api key which requests this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    public void disableFastWithdrawSwitchExample() throws ApiException, IOException {
        DisableFastWithdrawSwitchRequest disableFastWithdrawSwitchRequest =
                new DisableFastWithdrawSwitchRequest();
        getApi().disableFastWithdrawSwitch(disableFastWithdrawSwitchRequest);
    }
}
