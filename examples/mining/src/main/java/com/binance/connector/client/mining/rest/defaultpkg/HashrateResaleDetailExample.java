package com.binance.connector.client.mining.rest.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.mining.rest.MiningRestApiUtil;
import com.binance.connector.client.mining.rest.api.MiningRestApi;
import com.binance.connector.client.mining.rest.model.HashrateResaleDetailResponse;
import java.io.IOException;

/** API examples for DefaultApi */
public class HashrateResaleDetailExample {
    private MiningRestApi api;

    public MiningRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = MiningRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new MiningRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Hashrate Resale Detail (USER_DATA)
     *
     * <p>Hashrate Resale Detail(USER_DATA) Weight(IP): 1 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void hashrateResaleDetailExample() throws ApiException, IOException {
        Long configId = 168L;
        Long pageIndex = 1L;
        Long pageSize = 10L;
        Long recvWindow = 5000L;
        ApiResponse<HashrateResaleDetailResponse> response =
                getApi().hashrateResaleDetail(configId, pageIndex, pageSize, recvWindow);
        System.out.println(response.getData());
    }
}
