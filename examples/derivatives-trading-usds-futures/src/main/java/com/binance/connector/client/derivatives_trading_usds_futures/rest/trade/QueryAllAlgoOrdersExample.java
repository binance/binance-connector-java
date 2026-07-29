package com.binance.connector.client.derivatives_trading_usds_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.QueryAllAlgoOrdersResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class QueryAllAlgoOrdersExample {
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
     * Query All Algo Orders (USER_DATA)
     *
     * <p>Get all algo (conditional) orders — active, CANCELED, TRIGGERED, or FINISHED — including
     * TP/SL (Take Profit / Stop Loss) and trailing stop orders on USD-M Futures. * These orders
     * will not be found: * order status is &#x60;CANCELED&#x60; or &#x60;EXPIRED&#x60; **AND**
     * order has NO filled trade **AND** created time + 3 days &lt; current time * order create time
     * + 90 days &lt; current time Weight(IP): 5 Security Type: USER_DATA Notes: - If
     * &#x60;algoId&#x60; is set, it will get orders &gt;&#x3D; that &#x60;algoId&#x60;. Otherwise
     * most recent orders are returned. - The query time period must be less then 7 days( default as
     * the recent 7 days).
     *
     * @throws ApiException if the Api call fails
     */
    public void queryAllAlgoOrdersExample() throws ApiException, IOException {
        String symbol = "BTCUSDT";
        Long algoId = 2146760L;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long limit = 50L;
        Long recvWindow = 5000L;
        ApiResponse<QueryAllAlgoOrdersResponse> response =
                getApi().queryAllAlgoOrders(symbol, algoId, startTime, endTime, limit, recvWindow);
        System.out.println(response.getData());
    }
}
