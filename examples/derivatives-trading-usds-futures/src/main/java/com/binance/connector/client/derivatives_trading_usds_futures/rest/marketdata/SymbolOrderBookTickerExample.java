package com.binance.connector.client.derivatives_trading_usds_futures.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.SymbolOrderBookTickerResponse;

/** API examples for MarketDataApi */
public class SymbolOrderBookTickerExample {
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
     * Symbol Order Book Ticker
     *
     * <p>Best price/qty on the order book for a symbol or symbols. Retail Price Improvement(RPI)
     * orders are not visible and excluded in the response message. * If the symbol is not sent,
     * bookTickers for all symbols will be returned in an array. * The field
     * &#x60;X-MBX-USED-WEIGHT-1M&#x60; in response header is not accurate from this endpoint,
     * please ignore. Weight: 2 for a single symbol; 5 when the symbol parameter is omitted
     *
     * @throws ApiException if the Api call fails
     */
    public void symbolOrderBookTickerExample() throws ApiException {
        String symbol = "";
        ApiResponse<SymbolOrderBookTickerResponse> response =
                getApi().symbolOrderBookTicker(symbol);
        System.out.println(response.getData());
    }
}
