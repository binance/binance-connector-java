package com.binance.connector.client.derivatives_trading_usds_futures.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.OrderBookResponse;

/** API examples for MarketDataApi */
public class OrderBookExample {
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
     * Order Book
     *
     * <p>Query symbol orderbook Retail Price Improvement(RPI) orders are not visible and excluded
     * in the response message. Weight: Adjusted based on the limit: | Limit | Weight | |
     * ------------- | ------ | | 5, 10, 20, 50 | 2 | | 100 | 5 | | 500 | 10 | | 1000 | 20 |
     *
     * @throws ApiException if the Api call fails
     */
    public void orderBookExample() throws ApiException {
        String symbol = "";
        Long limit = 100L;
        ApiResponse<OrderBookResponse> response = getApi().orderBook(symbol, limit);
        System.out.println(response.getData());
    }
}
