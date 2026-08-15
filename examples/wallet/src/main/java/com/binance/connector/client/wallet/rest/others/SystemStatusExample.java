package com.binance.connector.client.wallet.rest.others;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.SystemStatusResponse;
import java.io.IOException;

/** API examples for OthersApi */
public class SystemStatusExample {
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
     * System Status
     *
     * <p>Fetch system status. Weight(IP): 1 Security Type: System
     *
     * @throws ApiException if the Api call fails
     */
    public void systemStatusExample() throws ApiException, IOException {
        ApiResponse<SystemStatusResponse> response = getApi().systemStatus();
        System.out.println(response.getData());
    }
}
