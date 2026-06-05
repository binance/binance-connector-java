package com.binance.connector.client.derivatives_trading_usds_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.CurrentAllOpenOrdersResponse;

/** API examples for TradeApi */
public class CurrentAllOpenOrdersExample {
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
     * Current All Open Orders (USER_DATA)
     *
     * <p>Get all open orders on a symbol. * If the symbol is not sent, orders for all symbols will
     * be returned in an array. Weight: 1 for a single symbol; 40 when the symbol parameter is
     * omitted Careful when accessing this with no symbol.
     *
     * @throws ApiException if the Api call fails
     */
    public void currentAllOpenOrdersExample() throws ApiException {
        String symbol = "";
        Long recvWindow = 5000L;
        ApiResponse<CurrentAllOpenOrdersResponse> response =
                getApi().currentAllOpenOrders(symbol, recvWindow);
        System.out.println(response.getData());
    }
}
