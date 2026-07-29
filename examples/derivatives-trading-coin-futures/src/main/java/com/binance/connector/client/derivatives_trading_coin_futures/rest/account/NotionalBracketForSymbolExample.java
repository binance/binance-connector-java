package com.binance.connector.client.derivatives_trading_coin_futures.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.DerivativesTradingCoinFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.DerivativesTradingCoinFuturesRestApi;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.NotionalBracketForSymbolResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class NotionalBracketForSymbolExample {
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
     * Notional Bracket for Symbol (USER_DATA)
     *
     * <p>Get the symbol&#39;s notional bracket list. Weight: 1 (after CM migration: 1 with
     * &#x60;symbol&#x60; / 2 without &#x60;symbol&#x60;) Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void notionalBracketForSymbolExample() throws ApiException, IOException {
        String symbol = "BTCUSD_PERP";
        Long recvWindow = 5000L;
        ApiResponse<NotionalBracketForSymbolResponse> response =
                getApi().notionalBracketForSymbol(symbol, recvWindow);
        System.out.println(response.getData());
    }
}
