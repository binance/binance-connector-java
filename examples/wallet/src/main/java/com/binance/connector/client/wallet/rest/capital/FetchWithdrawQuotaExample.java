package com.binance.connector.client.wallet.rest.capital;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.FetchWithdrawQuotaResponse;

/** API examples for CapitalApi */
public class FetchWithdrawQuotaExample {
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
     * Fetch withdraw quota (USER_DATA)
     *
     * <p>Fetch withdraw quota Weight: 10
     *
     * @throws ApiException if the Api call fails
     */
    public void fetchWithdrawQuotaExample() throws ApiException {
        ApiResponse<FetchWithdrawQuotaResponse> response = getApi().fetchWithdrawQuota();
        System.out.println(response.getData());
    }
}
