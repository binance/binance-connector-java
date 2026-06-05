package com.binance.connector.client.mining.rest.mining;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.mining.rest.MiningRestApiUtil;
import com.binance.connector.client.mining.rest.api.MiningRestApi;
import com.binance.connector.client.mining.rest.model.RequestForMinerListResponse;

/** API examples for MiningApi */
public class RequestForMinerListExample {
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
     * Request for Miner List(USER_DATA)
     *
     * <p>Request for Miner List Weight: 5
     *
     * @throws ApiException if the Api call fails
     */
    public void requestForMinerListExample() throws ApiException {
        String algo = "";
        String userName = "";
        Long pageIndex = 1L;
        Long sort = 0L;
        Long sortColumn = 1L;
        Long workerStatus = 0L;
        Long recvWindow = 5000L;
        ApiResponse<RequestForMinerListResponse> response =
                getApi().requestForMinerList(
                                algo,
                                userName,
                                pageIndex,
                                sort,
                                sortColumn,
                                workerStatus,
                                recvWindow);
        System.out.println(response.getData());
    }
}
