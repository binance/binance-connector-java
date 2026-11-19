package com.binance.connector.client.stock_options.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stock_options.rest.StockOptionsRestApiUtil;
import com.binance.connector.client.stock_options.rest.api.StockOptionsRestApi;
import com.binance.connector.client.stock_options.rest.model.OptionContractsResponse;
import java.io.IOException;

/** API examples for MarketDataApi */
public class OptionContractsExample {
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
     * Option Contracts (MARKET_DATA)
     *
     * <p>Returns every option contract (calls and puts) of an underlying for one expiration date.
     * Reference data only — no market data. Sorted by &#x60;strikePrice&#x60; ascending; for the
     * same strike, &#x60;CALL&#x60; comes before &#x60;PUT&#x60;. Not paginated. If there is no
     * contract for the &#x60;(underlying, root, expiration)&#x60; combination, an empty array is
     * returned. Only the &#x60;X-MBX-APIKEY&#x60; header is required; this endpoint is **not
     * signed** and takes no &#x60;timestamp&#x60; / &#x60;recvWindow&#x60;. Weight: 1 Security
     * Type: MARKET_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void optionContractsExample() throws ApiException, IOException {
        String underlyingSymbol = "NVDA";
        String expirationDate = "2026-09-30";
        String rootSymbol = "NVDA";
        ApiResponse<OptionContractsResponse> response =
                getApi().optionContracts(underlyingSymbol, expirationDate, rootSymbol);
        System.out.println(response.getData());
    }
}
