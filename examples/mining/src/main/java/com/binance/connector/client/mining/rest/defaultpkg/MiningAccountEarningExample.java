package com.binance.connector.client.mining.rest.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.mining.rest.MiningRestApiUtil;
import com.binance.connector.client.mining.rest.api.MiningRestApi;
import com.binance.connector.client.mining.rest.model.MiningAccountEarningResponse;
import java.io.IOException;

/** API examples for DefaultApi */
public class MiningAccountEarningExample {
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
     * Mining Account Earning (USER_DATA)
     *
     * <p>Mining Account Earning Weight(IP): 1 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void miningAccountEarningExample() throws ApiException, IOException {
        String algo = "sha256";
        Long startDate = 1770736694138L;
        Long endDate = 1770736694138L;
        Long pageIndex = 1L;
        Long pageSize = 10L;
        Long recvWindow = 5000L;
        ApiResponse<MiningAccountEarningResponse> response =
                getApi().miningAccountEarning(
                                algo, startDate, endDate, pageIndex, pageSize, recvWindow);
        System.out.println(response.getData());
    }
}
