package com.binance.connector.client.derivatives_trading_options.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_options.rest.DerivativesTradingOptionsRestApiUtil;
import com.binance.connector.client.derivatives_trading_options.rest.api.DerivativesTradingOptionsRestApi;
import com.binance.connector.client.derivatives_trading_options.rest.model.OrderBookResponse;

/** API examples for MarketDataApi */
public class OrderBookExample {
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
     * Order Book
     *
     * <p>Check orderbook depth on specific symbol Weight: limit | weight ------------ |
     * ------------ 5, 10, 20, 50 | 1 100 | 5 500 | 10 1000 | 20
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
