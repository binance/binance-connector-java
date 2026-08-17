package com.binance.connector.client.stocks.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stocks.rest.StocksRestApiUtil;
import com.binance.connector.client.stocks.rest.api.StocksRestApi;
import com.binance.connector.client.stocks.rest.model.ExchangeInfoResponse;
import java.io.IOException;

/** API examples for MarketDataApi */
public class ExchangeInfoExample {
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
     * Exchange Info (MARKET_DATA)
     *
     * <p>Returns current exchange trading rules and the list of tradable US-equity symbols.
     * MARKET_DATA endpoint — requires an API key (&#x60;X-MBX-APIKEY&#x60;) but no signature.
     * Response is served from a server-side cache. Weight: 1 Security Type: MARKET_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void exchangeInfoExample() throws ApiException, IOException {
        String symbol = "AAPL";
        ApiResponse<ExchangeInfoResponse> response = getApi().exchangeInfo(symbol);
        System.out.println(response.getData());
    }
}
