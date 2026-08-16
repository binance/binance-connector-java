package com.binance.connector.client.alpha.rest.marketdata;

import com.binance.connector.client.alpha.rest.AlphaRestApiUtil;
import com.binance.connector.client.alpha.rest.api.AlphaRestApi;
import com.binance.connector.client.alpha.rest.model.Interval;
import com.binance.connector.client.alpha.rest.model.KlinesResponse;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import java.io.IOException;

/** API examples for MarketDataApi */
public class KlinesExample {
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
     * Klines
     *
     * <p>Fetches Kline/candlestick bars for a symbol, which include open/high/low/close prices and
     * volume over intervals. Useful for charting and analysis.
     *
     * @throws ApiException if the Api call fails
     */
    public void klinesExample() throws ApiException, IOException {
        String symbol = "ALPHA_175USDT";
        Interval interval = Interval.INTERVAL_1s;
        Long limit = 500L;
        Long startTime = 1752642000000L;
        Long endTime = 1752645599999L;
        ApiResponse<KlinesResponse> response =
                getApi().klines(symbol, interval, limit, startTime, endTime);
        System.out.println(response.getData());
    }
}
