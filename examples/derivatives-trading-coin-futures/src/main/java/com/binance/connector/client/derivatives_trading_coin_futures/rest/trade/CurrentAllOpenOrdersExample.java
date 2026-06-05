package com.binance.connector.client.derivatives_trading_coin_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.DerivativesTradingCoinFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.DerivativesTradingCoinFuturesRestApi;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.CurrentAllOpenOrdersResponse;

/** API examples for TradeApi */
public class CurrentAllOpenOrdersExample {
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
     * Current All Open Orders (USER_DATA)
     *
     * <p>Get all open orders on a symbol. **Careful** when accessing this with no symbol. Weight: 1
     * for a single symbol, 40 for mutltiple symbols
     *
     * @throws ApiException if the Api call fails
     */
    public void currentAllOpenOrdersExample() throws ApiException {
        String symbol = "";
        String pair = "";
        Long recvWindow = 5000L;
        ApiResponse<CurrentAllOpenOrdersResponse> response =
                getApi().currentAllOpenOrders(symbol, pair, recvWindow);
        System.out.println(response.getData());
    }
}
