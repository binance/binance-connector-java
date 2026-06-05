package com.binance.connector.client.derivatives_trading_options.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_options.rest.DerivativesTradingOptionsRestApiUtil;
import com.binance.connector.client.derivatives_trading_options.rest.api.DerivativesTradingOptionsRestApi;
import com.binance.connector.client.derivatives_trading_options.rest.model.NewOrderRequest;
import com.binance.connector.client.derivatives_trading_options.rest.model.NewOrderResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.Side;
import com.binance.connector.client.derivatives_trading_options.rest.model.Type;

/** API examples for TradeApi */
public class NewOrderExample {
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
     * New Order (TRADE)
     *
     * <p>Send a new order. Weight: 0
     *
     * @throws ApiException if the Api call fails
     */
    public void newOrderExample() throws ApiException {
        NewOrderRequest newOrderRequest = new NewOrderRequest();
        newOrderRequest.symbol("");
        newOrderRequest.side(Side.BUY);
        newOrderRequest.type(Type.LIMIT);
        newOrderRequest.quantity(1.0d);
        ApiResponse<NewOrderResponse> response = getApi().newOrder(newOrderRequest);
        System.out.println(response.getData());
    }
}
