package com.binance.connector.client.algo.rest.futurealgo;

import com.binance.connector.client.algo.rest.AlgoRestApiUtil;
import com.binance.connector.client.algo.rest.api.AlgoRestApi;
import com.binance.connector.client.algo.rest.model.QueryHistoricalAlgoOrdersFutureAlgoResponse;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;

/** API examples for FutureAlgoApi */
public class QueryHistoricalAlgoOrdersFutureAlgoExample {
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
     * Query Historical Algo Orders(USER_DATA)
     *
     * <p>Query Historical Algo Order * You need to enable &#x60;Futures Trading Permission&#x60;
     * for the api key which requests this endpoint. * Base URL: https://api.binance.com Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void queryHistoricalAlgoOrdersFutureAlgoExample() throws ApiException {
        String symbol = "BTCUSDT";
        String side = "BUY";
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long page = 1L;
        Long pageSize = 100L;
        Long recvWindow = 5000L;
        ApiResponse<QueryHistoricalAlgoOrdersFutureAlgoResponse> response =
                getApi().queryHistoricalAlgoOrdersFutureAlgo(
                                symbol, side, startTime, endTime, page, pageSize, recvWindow);
        System.out.println(response.getData());
    }
}
