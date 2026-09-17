package com.binance.connector.client.stocks.rest.tokenized;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stocks.rest.StocksRestApiUtil;
import com.binance.connector.client.stocks.rest.api.StocksRestApi;
import com.binance.connector.client.stocks.rest.model.TokenizedConvertHistoryResponse;
import java.io.IOException;

/** API examples for TokenizedApi */
public class TokenizedConvertHistoryExample {
    private StocksRestApi api;

    public StocksRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = StocksRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new StocksRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Tokenized Convert History (USER_DATA)
     *
     * <p>Paged history of mint / redeem conversions for the caller. Cursor-style pagination —
     * supply the &#x60;nextLastId&#x60; from the previous page&#39;s response to fetch the next
     * page. Weight: 1 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void tokenizedConvertHistoryExample() throws ApiException, IOException {
        Long startTime = 1735800000000L;
        Long endTime = 1735900000000L;
        Long lastId = 10019L;
        Integer size = 20;
        Long recvWindow = 5000L;
        ApiResponse<TokenizedConvertHistoryResponse> response =
                getApi().tokenizedConvertHistory(startTime, endTime, lastId, size, recvWindow);
        System.out.println(response.getData());
    }
}
