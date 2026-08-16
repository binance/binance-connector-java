package com.binance.connector.client.spot.rest.market;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.HistoricalBlockTradesResponse;
import java.io.IOException;

/** API examples for MarketApi */
public class HistoricalBlockTradesExample {
    private SpotRestApi api;

    public SpotRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = SpotRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new SpotRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Historical Block Trades (MARKET_DATA)
     *
     * <p>Get block trades. Weight(IP): 25 Security Type: MARKET_DATA Notes: - Data Source: Database
     *
     * @throws ApiException if the Api call fails
     */
    public void historicalBlockTradesExample() throws ApiException, IOException {
        String symbol = "BNBBTC";
        Long fromId = 582L;
        Long limit = 500L;
        ApiResponse<HistoricalBlockTradesResponse> response =
                getApi().historicalBlockTrades(symbol, fromId, limit);
        System.out.println(response.getData());
    }
}
