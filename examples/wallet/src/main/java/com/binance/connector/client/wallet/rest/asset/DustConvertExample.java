package com.binance.connector.client.wallet.rest.asset;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.DustConvertRequest;
import com.binance.connector.client.wallet.rest.model.DustConvertResponse;
import java.io.IOException;

/** API examples for AssetApi */
public class DustConvertExample {
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
     * Dust Convert (USER_DATA)
     *
     * <p>Convert dust assets Weight(UID): 10 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void dustConvertExample() throws ApiException, IOException {
        DustConvertRequest dustConvertRequest = new DustConvertRequest();
        dustConvertRequest.asset("USDT");
        ApiResponse<DustConvertResponse> response = getApi().dustConvert(dustConvertRequest);
        System.out.println(response.getData());
    }
}
