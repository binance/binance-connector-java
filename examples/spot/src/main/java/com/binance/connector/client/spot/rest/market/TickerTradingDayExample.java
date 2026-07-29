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
import java.io.IOException;

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
     * <p>Price change statistics for a trading day. Weight: 4 for each requested symbol. The weight
     * for this request will cap at 200 once the number of symbols in the request is more than 50.
     * Security Type: NONE Notes: **Data Source:** Database **Notes:**: - Supported values for
     * &#x60;timeZone&#x60;: - Hours and minutes (e.g. &#x60;-1:00&#x60;, &#x60;05:45&#x60;) - Only
     * hours (e.g. &#x60;0&#x60;, &#x60;8&#x60;, &#x60;4&#x60;)
     *
     * @throws ApiException if the Api call fails
     */
    public void tickerTradingDayExample() throws ApiException, IOException {
        String symbol = "BNBUSDT";
        Symbols symbols = Symbols.fromJson("[\"BTCUSDT\",\"BNBUSDT\"]");
        String timeZone = "0";
        TickerType type = TickerType.FULL;
        SymbolStatus symbolStatus = SymbolStatus.TRADING;
        ApiResponse<TickerTradingDayResponse> response =
                getApi().tickerTradingDay(symbol, symbols, timeZone, type, symbolStatus);
        System.out.println(response.getData());
    }
}
