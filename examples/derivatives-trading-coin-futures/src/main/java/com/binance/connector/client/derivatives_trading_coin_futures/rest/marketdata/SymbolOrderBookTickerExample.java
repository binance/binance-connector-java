package com.binance.connector.client.derivatives_trading_coin_futures.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.DerivativesTradingCoinFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.DerivativesTradingCoinFuturesRestApi;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.SymbolOrderBookTickerResponse;
import java.io.IOException;

/** API examples for MarketDataApi */
public class SymbolOrderBookTickerExample {
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
     * Symbol Order Book Ticker
     *
     * <p>Best price/qty on the order book for a symbol or symbols. Weight: **2** for a single
     * symbol, **5** when the symbol parameter is omitted Notes: - Symbol and pair cannot be sent
     * together - If a pair is sent,tickers for all symbols of the pair will be returned - If either
     * a pair or symbol is sent, tickers for all symbols of all pairs will be returned
     *
     * @throws ApiException if the Api call fails
     */
    public void symbolOrderBookTickerExample() throws ApiException, IOException {
        String symbol = "BTCUSD_200626";
        String pair = "BTCUSD";
        ApiResponse<SymbolOrderBookTickerResponse> response =
                getApi().symbolOrderBookTicker(symbol, pair);
        System.out.println(response.getData());
    }
}
