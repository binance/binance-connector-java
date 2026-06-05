package com.binance.connector.client.derivatives_trading_usds_futures.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.Period;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.TopTraderLongShortRatioAccountsResponse;

/** API examples for MarketDataApi */
public class TopTraderLongShortRatioAccountsExample {
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
     * Top Trader Long/Short Ratio (Accounts)
     *
     * <p>The proportion of net long and net short accounts to total accounts of the top 20% users
     * with the highest margin balance. Each account is counted once only. Long Account % &#x3D;
     * Accounts of top traders with net long positions / Total accounts of top traders with open
     * positions Short Account % &#x3D; Accounts of top traders with net short positions / Total
     * accounts of top traders with open positions Long/Short Ratio (Accounts) &#x3D; Long Account %
     * / Short Account % * If startTime and endTime are not sent, the most recent data is returned.
     * * Only the data of the latest 30 days is available. * IP rate limit 1000 requests/5min
     * Weight: 0
     *
     * @throws ApiException if the Api call fails
     */
    public void topTraderLongShortRatioAccountsExample() throws ApiException {
        String symbol = "";
        Period period = Period.PERIOD_5m;
        Long limit = 100L;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        ApiResponse<TopTraderLongShortRatioAccountsResponse> response =
                getApi().topTraderLongShortRatioAccounts(symbol, period, limit, startTime, endTime);
        System.out.println(response.getData());
    }
}
