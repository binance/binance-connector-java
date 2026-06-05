package com.binance.connector.client.derivatives_trading_coin_futures.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.DerivativesTradingCoinFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.DerivativesTradingCoinFuturesRestApi;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.GetFundingRateHistoryOfPerpetualFuturesResponse;

/** API examples for MarketDataApi */
public class GetFundingRateHistoryOfPerpetualFuturesExample {
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
     * Get Funding Rate History of Perpetual Futures
     *
     * <p>Get Funding Rate History of Perpetual Futures * empty array will be returned for delivery
     * symbols. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void getFundingRateHistoryOfPerpetualFuturesExample() throws ApiException {
        String symbol = "";
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long limit = 100L;
        ApiResponse<GetFundingRateHistoryOfPerpetualFuturesResponse> response =
                getApi().getFundingRateHistoryOfPerpetualFutures(symbol, startTime, endTime, limit);
        System.out.println(response.getData());
    }
}
