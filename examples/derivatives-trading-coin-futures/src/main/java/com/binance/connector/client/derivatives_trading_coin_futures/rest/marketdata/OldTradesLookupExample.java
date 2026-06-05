package com.binance.connector.client.derivatives_trading_coin_futures.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.DerivativesTradingCoinFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.DerivativesTradingCoinFuturesRestApi;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.OldTradesLookupResponse;

/** API examples for MarketDataApi */
public class OldTradesLookupExample {
    private DerivativesTradingCoinFuturesRestApi api;

    public DerivativesTradingCoinFuturesRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingCoinFuturesRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingCoinFuturesRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Old Trades Lookup(MARKET_DATA)
     *
     * <p>Get older market historical trades. * Market trades means trades filled in the order book.
     * Only market trades will be returned, which means the insurance fund trades and ADL trades
     * won&#39;t be returned. Weight: 20
     *
     * @throws ApiException if the Api call fails
     */
    public void oldTradesLookupExample() throws ApiException {
        String symbol = "";
        Long limit = 100L;
        Long fromId = 1L;
        ApiResponse<OldTradesLookupResponse> response =
                getApi().oldTradesLookup(symbol, limit, fromId);
        System.out.println(response.getData());
    }
}
