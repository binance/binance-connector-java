package com.binance.connector.client.derivatives_trading_options.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_options.rest.DerivativesTradingOptionsRestApiUtil;
import com.binance.connector.client.derivatives_trading_options.rest.api.DerivativesTradingOptionsRestApi;
import com.binance.connector.client.derivatives_trading_options.rest.model.QuerySingleOrderResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class QuerySingleOrderExample {
    private DerivativesTradingOptionsRestApi api;

    public DerivativesTradingOptionsRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingOptionsRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingOptionsRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Query Single Order (TRADE)
     *
     * <p>Check an order status. * These orders will not be found: * order status is
     * &#x60;CANCELED&#x60; or &#x60;REJECTED&#x60;, **AND** * order has NO filled trade, **AND** *
     * created time + 3 days &lt; current time Weight(IP): 1 Security Type: TRADE Notes: - Either
     * &#x60;orderId&#x60; or &#x60;clientOrderId &#x60; must be sent.
     *
     * @throws ApiException if the Api call fails
     */
    public void querySingleOrderExample() throws ApiException, IOException {
        String symbol = "BTC-200730-9000-C";
        Long orderId = 4611875134427365000L;
        String clientOrderId = "abc123";
        Long recvWindow = 5000L;
        ApiResponse<QuerySingleOrderResponse> response =
                getApi().querySingleOrder(symbol, orderId, clientOrderId, recvWindow);
        System.out.println(response.getData());
    }
}
