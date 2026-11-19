package com.binance.connector.client.stock_options.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stock_options.rest.StockOptionsRestApiUtil;
import com.binance.connector.client.stock_options.rest.api.StockOptionsRestApi;
import com.binance.connector.client.stock_options.rest.model.OptionExchangeInfoResponse;
import java.io.IOException;

/** API examples for MarketDataApi */
public class OptionExchangeInfoExample {
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
     * Option Exchange Info (MARKET_DATA)
     *
     * <p>Returns the trading rules of a single option contract, combining contract-level data
     * (type, strike, expiration, multiplier, deliverables) with underlying-level configuration
     * (price / quantity increments and limits). &#x60;symbol&#x60; is **required**. Unlike the
     * stock &#x60;exchangeInfo&#x60;, listing all contracts is not supported. To browse contracts,
     * use Option Expirations and Option Contracts. **Price constraints**: a limit price must be a
     * multiple of &#x60;tickSize&#x60;, and the order notional (&#x60;price&#x60; ×
     * &#x60;quantity&#x60; × &#x60;multiplier&#x60;, excluding fees) must fall within the closed
     * interval &#x60;[minNotional, maxNotional]&#x60;. For a put &#x60;SELL&#x60; order, the limit
     * price cannot exceed the strike price. All of these values are returned by this endpoint, so
     * you can validate an order before placing it. **&#x60;multiplier&#x60; vs
     * &#x60;contractSize&#x60;**: &#x60;multiplier&#x60; is used to calculate cost,
     * &#x60;contractSize&#x60; is the number of shares delivered. Both are 100 for standard
     * contracts and may differ for contracts adjusted by a corporate action (split, merger, special
     * dividend). Always estimate cost with &#x60;multiplier&#x60;. Only the
     * &#x60;X-MBX-APIKEY&#x60; header is required; this endpoint is **not signed** and takes no
     * &#x60;timestamp&#x60; / &#x60;recvWindow&#x60;. Weight: 1 Security Type: MARKET_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void optionExchangeInfoExample() throws ApiException, IOException {
        String symbol = "NVDA260930C00100000";
        ApiResponse<OptionExchangeInfoResponse> response = getApi().optionExchangeInfo(symbol);
        System.out.println(response.getData());
    }
}
