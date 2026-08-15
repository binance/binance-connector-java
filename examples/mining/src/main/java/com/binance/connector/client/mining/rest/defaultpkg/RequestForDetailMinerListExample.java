package com.binance.connector.client.mining.rest.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.mining.rest.MiningRestApiUtil;
import com.binance.connector.client.mining.rest.api.MiningRestApi;
import com.binance.connector.client.mining.rest.model.RequestForDetailMinerListResponse;
import java.io.IOException;

/** API examples for DefaultApi */
public class RequestForDetailMinerListExample {
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
     * Request for Detail Miner List (USER_DATA)
     *
     * <p>Request for Detail Miner List Weight(IP): 1 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void requestForDetailMinerListExample() throws ApiException, IOException {
        String algo = "sha256";
        String userName = "test";
        String workerName = "bhdc1.16A10404B";
        Long recvWindow = 5000L;
        ApiResponse<RequestForDetailMinerListResponse> response =
                getApi().requestForDetailMinerList(algo, userName, workerName, recvWindow);
        System.out.println(response.getData());
    }
}
