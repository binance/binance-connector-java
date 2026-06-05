package com.binance.connector.client.derivatives_trading_usds_futures.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.RecentTradesListResponse;

/** API examples for MarketDataApi */
public class RecentTradesListExample {
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
     * Recent Trades List
     *
     * <p>Get recent market trades * Market trades means trades filled in the order book. Only
     * market trades will be returned, which means the insurance fund trades and ADL trades
     * won&#39;t be returned. Weight: 5
     *
     * @throws ApiException if the Api call fails
     */
    public void recentTradesListExample() throws ApiException {
        String symbol = "";
        Long limit = 100L;
        ApiResponse<RecentTradesListResponse> response = getApi().recentTradesList(symbol, limit);
        System.out.println(response.getData());
    }
}
