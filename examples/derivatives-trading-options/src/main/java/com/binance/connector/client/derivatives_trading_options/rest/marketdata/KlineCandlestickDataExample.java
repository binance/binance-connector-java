package com.binance.connector.client.derivatives_trading_options.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_options.rest.DerivativesTradingOptionsRestApiUtil;
import com.binance.connector.client.derivatives_trading_options.rest.api.DerivativesTradingOptionsRestApi;
import com.binance.connector.client.derivatives_trading_options.rest.model.Interval;
import com.binance.connector.client.derivatives_trading_options.rest.model.KlineCandlestickDataResponse;
import java.io.IOException;

/** API examples for MarketDataApi */
public class KlineCandlestickDataExample {
    private DerivativesTradingOptionsRestApi api;

    public DerivativesTradingOptionsRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingOptionsRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingOptionsRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Kline/Candlestick Data
     *
     * <p>Kline/candlestick bars for an option symbol. Klines are uniquely identified by their open
     * time. Weight(IP): 1 Notes: - If startTime and endTime are not sent, the most recent klines
     * are returned.
     *
     * @throws ApiException if the Api call fails
     */
    public void klineCandlestickDataExample() throws ApiException, IOException {
        String symbol = "BTC-200730-9000-C";
        Interval interval = Interval.INTERVAL_1m;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long limit = 20L;
        ApiResponse<KlineCandlestickDataResponse> response =
                getApi().klineCandlestickData(symbol, interval, startTime, endTime, limit);
        System.out.println(response.getData());
    }
}
