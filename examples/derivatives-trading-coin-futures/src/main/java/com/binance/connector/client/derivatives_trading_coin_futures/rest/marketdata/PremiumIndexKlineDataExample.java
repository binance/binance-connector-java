package com.binance.connector.client.derivatives_trading_coin_futures.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.DerivativesTradingCoinFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.DerivativesTradingCoinFuturesRestApi;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.Interval;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.PremiumIndexKlineDataResponse;
import java.io.IOException;

/** API examples for MarketDataApi */
public class PremiumIndexKlineDataExample {
    private DerivativesTradingCoinFuturesRestApi api;

    public DerivativesTradingCoinFuturesRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingCoinFuturesRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingCoinFuturesRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Premium index Kline Data
     *
     * <p>Premium index kline bars of a symbol. Klines are uniquely identified by their open time.
     * Weight: Based on parameter &#x60;LIMIT&#x60; | LIMIT | weight | | ----------- | ------ | |
     * [1,100) | 1 | | [100, 500) | 2 | | [500, 1000] | 5 | | &gt; 1000 | 10 | Notes: - If startTime
     * and endTime are not sent, the most recent klines are returned.
     *
     * @throws ApiException if the Api call fails
     */
    public void premiumIndexKlineDataExample() throws ApiException, IOException {
        String symbol = "BTCUSD";
        Interval interval = Interval.INTERVAL_1m;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long limit = 30L;
        ApiResponse<PremiumIndexKlineDataResponse> response =
                getApi().premiumIndexKlineData(symbol, interval, startTime, endTime, limit);
        System.out.println(response.getData());
    }
}
