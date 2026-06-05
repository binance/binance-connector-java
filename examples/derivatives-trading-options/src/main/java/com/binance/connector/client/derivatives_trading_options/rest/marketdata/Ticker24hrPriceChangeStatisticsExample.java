package com.binance.connector.client.derivatives_trading_options.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_options.rest.DerivativesTradingOptionsRestApiUtil;
import com.binance.connector.client.derivatives_trading_options.rest.api.DerivativesTradingOptionsRestApi;
import com.binance.connector.client.derivatives_trading_options.rest.model.Ticker24hrPriceChangeStatisticsResponse;

/** API examples for MarketDataApi */
public class Ticker24hrPriceChangeStatisticsExample {
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
     * 24hr Ticker Price Change Statistics
     *
     * <p>24 hour rolling window price change statistics. Weight: 5
     *
     * @throws ApiException if the Api call fails
     */
    public void ticker24hrPriceChangeStatisticsExample() throws ApiException {
        String symbol = "";
        ApiResponse<Ticker24hrPriceChangeStatisticsResponse> response =
                getApi().ticker24hrPriceChangeStatistics(symbol);
        System.out.println(response.getData());
    }
}
