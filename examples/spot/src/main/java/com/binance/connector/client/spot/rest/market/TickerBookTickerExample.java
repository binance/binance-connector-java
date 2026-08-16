package com.binance.connector.client.spot.rest.market;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.SymbolStatus;
import com.binance.connector.client.spot.rest.model.Symbols;
import com.binance.connector.client.spot.rest.model.TickerBookTickerResponse;
import java.io.IOException;

/** API examples for MarketApi */
public class TickerBookTickerExample {
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
     * Symbol order book ticker
     *
     * <p>Best price/qty on the order book for a symbol or symbols. Weight: |Parameter|Symbols
     * Provided|Weight| |---|---|---| |symbol| 1 |2| | |omitted| 4| |symbols| Any |4| Security Type:
     * NONE Notes: **Data Source:** Memory
     *
     * @throws ApiException if the Api call fails
     */
    public void tickerBookTickerExample() throws ApiException, IOException {
        String symbol = "BNBUSDT";
        Symbols symbols = Symbols.fromJson("[\"BTCUSDT\",\"BNBUSDT\"]");
        SymbolStatus symbolStatus = SymbolStatus.TRADING;
        ApiResponse<TickerBookTickerResponse> response =
                getApi().tickerBookTicker(symbol, symbols, symbolStatus);
        System.out.println(response.getData());
    }
}
