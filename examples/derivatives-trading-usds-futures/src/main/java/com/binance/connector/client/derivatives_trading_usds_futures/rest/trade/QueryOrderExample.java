package com.binance.connector.client.derivatives_trading_usds_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.QueryOrderResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class QueryOrderExample {
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
     * Query Order (USER_DATA)
     *
     * <p>Check an order&#39;s status. * These orders will not be found: * order status is
     * &#x60;CANCELED&#x60; or &#x60;EXPIRED&#x60; **AND** order has NO filled trade **AND** created
     * time + 3 days &lt; current time * order create time + 90 days &lt; current time Weight(IP): 1
     * Security Type: USER_DATA Notes: - Either &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60;
     * must be sent. - &#x60;orderId&#x60; is self-increment for each specific &#x60;symbol&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    public void queryOrderExample() throws ApiException, IOException {
        String symbol = "BTCUSDT";
        Long orderId = 1917641L;
        String origClientOrderId = "abc";
        Long recvWindow = 5000L;
        ApiResponse<QueryOrderResponse> response =
                getApi().queryOrder(symbol, orderId, origClientOrderId, recvWindow);
        System.out.println(response.getData());
    }
}
