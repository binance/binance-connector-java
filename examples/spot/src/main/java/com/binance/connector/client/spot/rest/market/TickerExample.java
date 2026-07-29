package com.binance.connector.client.spot.rest.market;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.SymbolStatus;
import com.binance.connector.client.spot.rest.model.Symbols;
import com.binance.connector.client.spot.rest.model.TickerResponse;
import com.binance.connector.client.spot.rest.model.TickerType;
import com.binance.connector.client.spot.rest.model.WindowSize;
import java.io.IOException;

/** API examples for MarketApi */
public class TickerExample {
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
     * Rolling window price change statistics
     *
     * <p>**Note:** This endpoint differs from &#x60;GET /api/v3/ticker/24hr&#x60;. The statistical
     * time range of this endpoint can be up to 59999ms longer than the requested
     * &#x60;windowSize&#x60;. &#x60;openTime&#x60; starts at the beginning of a minute, while the
     * end time is the current time. Therefore, the actual interval can be up to 59999ms longer than
     * the requested window. For example, if &#x60;closeTime&#x60; is 1641287867099 (January 04,
     * 2022 09:17:47:099 UTC) and &#x60;windowSize&#x60; is &#x60;1d&#x60;, then
     * &#x60;openTime&#x60; is 1641201420000 (January 3, 2022, 09:17:00 UTC). Weight: 4 for each
     * requested symbol regardless of windowSize. The weight for this request will cap at 200 once
     * the number of &#x60;symbols&#x60; in the request is more than 50. Security Type: NONE Notes:
     * **Data Source:** Database
     *
     * @throws ApiException if the Api call fails
     */
    public void tickerExample() throws ApiException, IOException {
        String symbol = "BNBUSDT";
        Symbols symbols = Symbols.fromJson("[\"BTCUSDT\",\"BNBUSDT\"]");
        WindowSize windowSize = WindowSize.WINDOW_SIZE_1m;
        TickerType type = TickerType.FULL;
        SymbolStatus symbolStatus = SymbolStatus.TRADING;
        ApiResponse<TickerResponse> response =
                getApi().ticker(symbol, symbols, windowSize, type, symbolStatus);
        System.out.println(response.getData());
    }
}
