package com.binance.connector.client.wallet.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.DisableFastWithdrawSwitchRequest;

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
     * <p>Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void disableFastWithdrawSwitchExample() throws ApiException {
        DisableFastWithdrawSwitchRequest disableFastWithdrawSwitchRequest =
                new DisableFastWithdrawSwitchRequest();
        getApi().disableFastWithdrawSwitch(disableFastWithdrawSwitchRequest);
    }
}
