package com.binance.connector.client.mining.rest.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.mining.rest.MiningRestApiUtil;
import com.binance.connector.client.mining.rest.api.MiningRestApi;
import com.binance.connector.client.mining.rest.model.ExtraBonusListResponse;
import java.io.IOException;

/** API examples for DefaultApi */
public class ExtraBonusListExample {
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
     * Extra Bonus List (USER_DATA)
     *
     * <p>Extra Bonus List Weight(IP): 1 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void extraBonusListExample() throws ApiException, IOException {
        String algo = "sha256";
        String userName = "test";
        String coin = "BTC";
        Long startDate = 1770736694138L;
        Long endDate = 1770736694138L;
        Long pageIndex = 1L;
        Long pageSize = 10L;
        Long recvWindow = 5000L;
        ApiResponse<ExtraBonusListResponse> response =
                getApi().extraBonusList(
                                algo,
                                userName,
                                coin,
                                startDate,
                                endDate,
                                pageIndex,
                                pageSize,
                                recvWindow);
        System.out.println(response.getData());
    }
}
