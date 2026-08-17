package com.binance.connector.client.stocks.rest.tokenized;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stocks.rest.StocksRestApiUtil;
import com.binance.connector.client.stocks.rest.api.StocksRestApi;
import com.binance.connector.client.stocks.rest.model.ConvertType;
import com.binance.connector.client.stocks.rest.model.TokenizedConvertStatusResponse;
import java.io.IOException;

/** API examples for TokenizedApi */
public class TokenizedConvertStatusExample {
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
     * Tokenized Convert Status (USER_DATA)
     *
     * <p>Query the current status of a single mint / redeem request by its
     * &#x60;issuerRequestId&#x60;. Returns an empty object when no record matches (caller&#39;s ID
     * scope only). Weight: 1 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void tokenizedConvertStatusExample() throws ApiException, IOException {
        String issuerRequestId = "mint-20260505-8f3b9e1a2d3c4b5a";
        ConvertType convertType = ConvertType.MINT;
        Long recvWindow = 5000L;
        ApiResponse<TokenizedConvertStatusResponse> response =
                getApi().tokenizedConvertStatus(issuerRequestId, convertType, recvWindow);
        System.out.println(response.getData());
    }
}
