package com.binance.connector.client.spot.rest.market;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.SymbolStatus;
import com.binance.connector.client.spot.rest.model.Symbols;
import com.binance.connector.client.spot.rest.model.TickerTradingDayResponse;
import com.binance.connector.client.spot.rest.model.TickerType;

/** API examples for MarketApi */
public class TickerTradingDayExample {
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
     * Trading Day Ticker
     *
     * <p>Price change statistics for a trading day. Weight: 4 for each requested
     * &lt;tt&gt;symbol&lt;/tt&gt;. &lt;br/&gt;&lt;br/&gt; The weight for this request will cap at
     * 200 once the number of &#x60;symbols&#x60; in the request is more than 50.
     *
     * @throws ApiException if the Api call fails
     */
    public void tickerTradingDayExample() throws ApiException {
        String symbol = "BNBUSDT";
        Symbols symbols = null;
        String timeZone = "";
        TickerType type = TickerType.FULL;
        SymbolStatus symbolStatus = SymbolStatus.TRADING;
        ApiResponse<TickerTradingDayResponse> response =
                getApi().tickerTradingDay(symbol, symbols, timeZone, type, symbolStatus);
        System.out.println(response.getData());
    }
}
