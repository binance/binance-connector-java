package com.binance.connector.client.derivatives_trading_options.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_options.rest.DerivativesTradingOptionsRestApiUtil;
import com.binance.connector.client.derivatives_trading_options.rest.api.DerivativesTradingOptionsRestApi;
import com.binance.connector.client.derivatives_trading_options.rest.model.CancelOptionOrderResponse;

/** API examples for TradeApi */
public class CancelOptionOrderExample {
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
     * Cancel Option Order (TRADE)
     *
     * <p>Cancel an active order. * At least one instance of &#x60;orderId&#x60; and
     * &#x60;clientOrderId&#x60; must be sent. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void cancelOptionOrderExample() throws ApiException {
        String symbol = "";
        Long orderId = 1L;
        String clientOrderId = "1";
        Long recvWindow = 5000L;
        ApiResponse<CancelOptionOrderResponse> response =
                getApi().cancelOptionOrder(symbol, orderId, clientOrderId, recvWindow);
        System.out.println(response.getData());
    }
}
