package com.binance.connector.client.derivatives_trading_usds_futures.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ContinuousContractKlineCandlestickDataResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ContractType;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.Interval;
import java.io.IOException;

/** API examples for MarketDataApi */
public class ContinuousContractKlineCandlestickDataExample {
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
     * Continuous Contract Kline/Candlestick Data
     *
     * <p>Kline/candlestick bars for a specific contract type. Klines are uniquely identified by
     * their open time. Weight: based on parameter &#x60;LIMIT&#x60; | LIMIT | weight | |
     * ----------- | ------ | | [1,100) | 1 | | [100, 500) | 2 | | [500, 1000] | 5 | | &gt; 1000 |
     * 10 | Notes: - If startTime and endTime are not sent, the most recent klines are returned.
     *
     * @throws ApiException if the Api call fails
     */
    public void continuousContractKlineCandlestickDataExample() throws ApiException, IOException {
        String pair = "BTCUSDT";
        ContractType contractType = ContractType.PERPETUAL;
        Interval interval = Interval.INTERVAL_1m;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long limit = 50L;
        ApiResponse<ContinuousContractKlineCandlestickDataResponse> response =
                getApi().continuousContractKlineCandlestickData(
                                pair, contractType, interval, startTime, endTime, limit);
        System.out.println(response.getData());
    }
}
