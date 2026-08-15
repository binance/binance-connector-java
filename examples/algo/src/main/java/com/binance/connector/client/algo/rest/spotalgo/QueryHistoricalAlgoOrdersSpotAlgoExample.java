package com.binance.connector.client.algo.rest.spotalgo;

import com.binance.connector.client.algo.rest.AlgoRestApiUtil;
import com.binance.connector.client.algo.rest.api.AlgoRestApi;
import com.binance.connector.client.algo.rest.model.QueryHistoricalAlgoOrdersSpotAlgoResponse;
import com.binance.connector.client.algo.rest.model.Side;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import java.io.IOException;

/** API examples for SpotAlgoApi */
public class QueryHistoricalAlgoOrdersSpotAlgoExample {
    private AlgoRestApi api;

    public AlgoRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = AlgoRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new AlgoRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Query Historical Spot Algo Orders (USER_DATA)
     *
     * <p>Get all historical SPOT TWAP orders Weight(IP): 1 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void queryHistoricalAlgoOrdersSpotAlgoExample() throws ApiException, IOException {
        String symbol = "BTCUSDT";
        Side side = Side.BUY;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long page = 1L;
        Long pageSize = 10L;
        Long recvWindow = 5000L;
        ApiResponse<QueryHistoricalAlgoOrdersSpotAlgoResponse> response =
                getApi().queryHistoricalAlgoOrdersSpotAlgo(
                                symbol, side, startTime, endTime, page, pageSize, recvWindow);
        System.out.println(response.getData());
    }
}
