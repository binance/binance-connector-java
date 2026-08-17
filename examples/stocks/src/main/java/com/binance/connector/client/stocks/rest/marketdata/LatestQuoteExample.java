package com.binance.connector.client.stocks.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stocks.rest.StocksRestApiUtil;
import com.binance.connector.client.stocks.rest.api.StocksRestApi;
import com.binance.connector.client.stocks.rest.model.LatestQuoteResponse;
import java.io.IOException;

/** API examples for MarketDataApi */
public class LatestQuoteExample {
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
     * Latest Quote (MARKET_DATA)
     *
     * <p>Returns the latest best bid / best ask for a single US-equity ticker. The returned value
     * is at most ~5 seconds stale. Returns an **empty response body** (not the literal
     * &#x60;null&#x60;) when no quote is available for the supplied ticker (e.g. the ticker is
     * unknown, halted, or de-listed). Weight: 1 Security Type: MARKET_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void latestQuoteExample() throws ApiException, IOException {
        String symbol = "AAPL";
        ApiResponse<LatestQuoteResponse> response = getApi().latestQuote(symbol);
        System.out.println(response.getData());
    }
}
