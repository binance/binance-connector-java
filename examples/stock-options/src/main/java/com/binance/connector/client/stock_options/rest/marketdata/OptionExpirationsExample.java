package com.binance.connector.client.stock_options.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stock_options.rest.StockOptionsRestApiUtil;
import com.binance.connector.client.stock_options.rest.api.StockOptionsRestApi;
import com.binance.connector.client.stock_options.rest.model.OptionExpirationsResponse;
import java.io.IOException;

/** API examples for MarketDataApi */
public class OptionExpirationsExample {
    private StockOptionsRestApi api;

    public StockOptionsRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    StockOptionsRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new StockOptionsRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Option Expirations (MARKET_DATA)
     *
     * <p>Returns every expiration date currently tradable for an underlying, in ascending
     * &#x60;expirationDate&#x60; order. When standard and corporate-action-adjusted contracts share
     * an expiration date, **multiple** rows are returned with the same &#x60;expirationDate&#x60;
     * and different &#x60;rootSymbol&#x60;. To list the adjusted set, pass that
     * &#x60;rootSymbol&#x60; to Option Contracts. Reference data only — no market data. An unknown
     * underlying, or one without listed options, returns &#x60;-1121 Invalid symbol.&#x60; An empty
     * array is never returned. Only the &#x60;X-MBX-APIKEY&#x60; header is required; this endpoint
     * is **not signed** and takes no &#x60;timestamp&#x60; / &#x60;recvWindow&#x60;. Weight: 1
     * Security Type: MARKET_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void optionExpirationsExample() throws ApiException, IOException {
        String underlyingSymbol = "NVDA";
        ApiResponse<OptionExpirationsResponse> response =
                getApi().optionExpirations(underlyingSymbol);
        System.out.println(response.getData());
    }
}
