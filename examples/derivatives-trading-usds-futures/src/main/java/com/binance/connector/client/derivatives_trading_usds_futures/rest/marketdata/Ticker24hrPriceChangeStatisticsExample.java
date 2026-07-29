package com.binance.connector.client.derivatives_trading_usds_futures.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.Ticker24hrPriceChangeStatisticsResponse;
import java.io.IOException;

/** API examples for MarketDataApi */
public class Ticker24hrPriceChangeStatisticsExample {
    private DerivativesTradingUsdsFuturesRestApi api;

    public DerivativesTradingUsdsFuturesRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingUsdsFuturesRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingUsdsFuturesRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * 24hr Ticker Price Change Statistics
     *
     * <p>24 hour rolling window price change statistics. **Careful** when accessing this with no
     * symbol. Weight: **1** for a single symbol; **40** when the symbol parameter is omitted Notes:
     * - If the symbol is not sent, tickers for all symbols will be returned in an array.
     *
     * @throws ApiException if the Api call fails
     */
    public void ticker24hrPriceChangeStatisticsExample() throws ApiException, IOException {
        String symbol = "BTCUSDT";
        ApiResponse<Ticker24hrPriceChangeStatisticsResponse> response =
                getApi().ticker24hrPriceChangeStatistics(symbol);
        System.out.println(response.getData());
    }
}
