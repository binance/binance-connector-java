package com.binance.connector.client.margin_trading.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.IsIsolated;
import com.binance.connector.client.margin_trading.rest.model.MarginAccountCancelAllOpenOrdersOnASymbolResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class MarginAccountCancelAllOpenOrdersOnASymbolExample {
    private MarginTradingRestApi api;

    public MarginTradingRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    MarginTradingRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new MarginTradingRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Margin Account Cancel all Open Orders on a Symbol (TRADE)
     *
     * <p>Cancels all active orders on a symbol for margin account.&lt;br&gt;&lt;/br&gt; This
     * includes OCO orders. Weight(IP): 1 Security Type: TRADE
     *
     * @throws ApiException if the Api call fails
     */
    public void marginAccountCancelAllOpenOrdersOnASymbolExample()
            throws ApiException, IOException {
        String symbol = "BTCUSDT";
        IsIsolated isIsolated = IsIsolated.TRUE;
        Long recvWindow = 5000L;
        ApiResponse<MarginAccountCancelAllOpenOrdersOnASymbolResponse> response =
                getApi().marginAccountCancelAllOpenOrdersOnASymbol(symbol, isIsolated, recvWindow);
        System.out.println(response.getData());
    }
}
