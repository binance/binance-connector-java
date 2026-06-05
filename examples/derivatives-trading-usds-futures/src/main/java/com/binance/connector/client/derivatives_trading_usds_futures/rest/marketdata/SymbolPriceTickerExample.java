package com.binance.connector.client.derivatives_trading_usds_futures.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.SymbolPriceTickerResponse;

/** API examples for MarketDataApi */
public class SymbolPriceTickerExample {
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
     * Symbol Price Ticker
     *
     * <p>Latest price for a symbol or symbols. * If the symbol is not sent, prices for all symbols
     * will be returned in an array. Weight: 1 for a single symbol; 2 when the symbol parameter is
     * omitted
     *
     * @throws ApiException if the Api call fails
     */
    public void symbolPriceTickerExample() throws ApiException {
        String symbol = "";
        ApiResponse<SymbolPriceTickerResponse> response = getApi().symbolPriceTicker(symbol);
        System.out.println(response.getData());
    }
}
