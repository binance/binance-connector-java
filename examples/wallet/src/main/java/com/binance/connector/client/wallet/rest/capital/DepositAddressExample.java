package com.binance.connector.client.wallet.rest.capital;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.DepositAddressResponse;

/** API examples for CapitalApi */
public class DepositAddressExample {
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
     * Deposit Address(supporting network) (USER_DATA)
     *
     * <p>Fetch deposit address with network. * If &#x60;network&#x60; is not send, return with
     * default network of the coin. * You can get &#x60;network&#x60; and &#x60;isDefault&#x60; in
     * &#x60;networkList&#x60; in the response of &#x60;Get /sapi/v1/capital/config/getall (HMAC
     * SHA256)&#x60;. * &#x60;amount&#x60; needs to be sent if using LIGHTNING network Weight: 10
     *
     * @throws ApiException if the Api call fails
     */
    public void depositAddressExample() throws ApiException {
        String coin = "";
        String network = "";
        Double amount = 1.0d;
        Long recvWindow = 5000L;
        ApiResponse<DepositAddressResponse> response =
                getApi().depositAddress(coin, network, amount, recvWindow);
        System.out.println(response.getData());
    }
}
