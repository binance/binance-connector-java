package com.binance.connector.client.derivatives_trading_coin_futures.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.DerivativesTradingCoinFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.DerivativesTradingCoinFuturesRestApi;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.ContractType;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.OpenInterestStatisticsResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.Period;

/** API examples for MarketDataApi */
public class OpenInterestStatisticsExample {
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
     * Open Interest Statistics
     *
     * <p>Query open interest stats * If startTime and endTime are not sent, the most recent data is
     * returned. * Only the data of the latest 30 days is available. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void openInterestStatisticsExample() throws ApiException {
        String pair = "";
        ContractType contractType = ContractType.PERPETUAL;
        Period period = Period.PERIOD_5m;
        Long limit = 100L;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        ApiResponse<OpenInterestStatisticsResponse> response =
                getApi().openInterestStatistics(
                                pair, contractType, period, limit, startTime, endTime);
        System.out.println(response.getData());
    }
}
