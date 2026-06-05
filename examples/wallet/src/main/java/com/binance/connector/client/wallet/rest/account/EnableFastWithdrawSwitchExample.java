package com.binance.connector.client.wallet.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.EnableFastWithdrawSwitchRequest;

/** API examples for AccountApi */
public class EnableFastWithdrawSwitchExample {
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
     * Enable Fast Withdraw Switch (USER_DATA)
     *
     * <p>Enable Fast Withdraw Switch (USER_DATA) * This request will enable fastwithdraw switch
     * under your account. &lt;br&gt;&lt;/br&gt; * When Fast Withdraw Switch is on, transferring
     * funds to a Binance account will be done instantly. There is no on-chain transaction, no
     * transaction ID and no withdrawal fee. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void enableFastWithdrawSwitchExample() throws ApiException {
        EnableFastWithdrawSwitchRequest enableFastWithdrawSwitchRequest =
                new EnableFastWithdrawSwitchRequest();
        getApi().enableFastWithdrawSwitch(enableFastWithdrawSwitchRequest);
    }
}
