package com.binance.connector.client.margin_trading.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.QuerySpecialKeyResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class QuerySpecialKeyExample {
    private MarginTradingRestApi api;

    public MarginTradingRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    MarginTradingRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new MarginTradingRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Query Special key(Low Latency Trading) (TRADE)
     *
     * <p>Query Special Key Information. This only applies to Special Key for Low Latency Trading.
     * Weight(UID): 1 Security Type: TRADE
     *
     * @throws ApiException if the Api call fails
     */
    public void querySpecialKeyExample() throws ApiException, IOException {
        String symbol = "BTCUSDT";
        Long recvWindow = 5000L;
        ApiResponse<QuerySpecialKeyResponse> response =
                getApi().querySpecialKey(symbol, recvWindow);
        System.out.println(response.getData());
    }
}
