package com.binance.connector.client.alpha.rest.marketdata;

import com.binance.connector.client.alpha.rest.AlphaRestApiUtil;
import com.binance.connector.client.alpha.rest.api.AlphaRestApi;
import com.binance.connector.client.alpha.rest.model.AggregatedTradesResponse;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import java.io.IOException;

/** API examples for MarketDataApi */
public class AggregatedTradesExample {
    private AlphaRestApi api;

    public AlphaRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = AlphaRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new AlphaRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Aggregated Trades
     *
     * <p>Retrieves compressed, aggregated historical trades for a specific symbol. Useful for
     * recent trade history.
     *
     * @throws ApiException if the Api call fails
     */
    public void aggregatedTradesExample() throws ApiException, IOException {
        String symbol = "ALPHA_118USDC";
        Long fromId = 58470L;
        Long startTime = 1752568680000L;
        Long endTime = 1752572280000L;
        Long limit = 500L;
        ApiResponse<AggregatedTradesResponse> response =
                getApi().aggregatedTrades(symbol, fromId, startTime, endTime, limit);
        System.out.println(response.getData());
    }
}
