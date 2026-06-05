package com.binance.connector.client.derivatives_trading_usds_futures.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.OpenInterestStatisticsResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.Period;

/** API examples for MarketDataApi */
public class OpenInterestStatisticsExample {
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
     * Open Interest Statistics
     *
     * <p>Open Interest Statistics * If startTime and endTime are not sent, the most recent data is
     * returned. * Only the data of the latest 1 month is available. * IP rate limit 1000
     * requests/5min Weight: 0
     *
     * @throws ApiException if the Api call fails
     */
    public void openInterestStatisticsExample() throws ApiException {
        String symbol = "";
        Period period = Period.PERIOD_5m;
        Long limit = 100L;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        ApiResponse<OpenInterestStatisticsResponse> response =
                getApi().openInterestStatistics(symbol, period, limit, startTime, endTime);
        System.out.println(response.getData());
    }
}
