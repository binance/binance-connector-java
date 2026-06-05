package com.binance.connector.client.mining.rest.mining;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.mining.rest.MiningRestApiUtil;
import com.binance.connector.client.mining.rest.api.MiningRestApi;
import com.binance.connector.client.mining.rest.model.MiningAccountEarningResponse;

/** API examples for MiningApi */
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
     * Mining Account Earning(USER_DATA)
     *
     * <p>Mining Account Earning Weight: 5
     *
     * @throws ApiException if the Api call fails
     */
    public void miningAccountEarningExample() throws ApiException {
        String algo = "";
        Long startDate = 0L;
        Long endDate = 0L;
        Long pageIndex = 1L;
        Long pageSize = 0L;
        Long recvWindow = 5000L;
        ApiResponse<MiningAccountEarningResponse> response =
                getApi().miningAccountEarning(
                                algo, startDate, endDate, pageIndex, pageSize, recvWindow);
        System.out.println(response.getData());
    }
}
