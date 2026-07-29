package com.binance.connector.client.derivatives_trading_options.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_options.rest.DerivativesTradingOptionsRestApiUtil;
import com.binance.connector.client.derivatives_trading_options.rest.api.DerivativesTradingOptionsRestApi;
import com.binance.connector.client.derivatives_trading_options.rest.model.Orders;
import com.binance.connector.client.derivatives_trading_options.rest.model.PlaceMultipleOrdersRequest;
import com.binance.connector.client.derivatives_trading_options.rest.model.PlaceMultipleOrdersResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class PlaceMultipleOrdersExample {
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
     * Place Multiple Orders (TRADE)
     *
     * <p>Send multiple option orders. Weight(IP): 5 Security Type: TRADE Notes: Some parameters are
     * mandatory depending on the order type as follows: Type | Mandatory parameters ------------ |
     * ------------ LIMIT | timeInForce, quantity, price - Parameter rules are same with New Order -
     * Batch orders are processed concurrently, and the order of matching is not guaranteed.
     *
     * @throws ApiException if the Api call fails
     */
    public void placeMultipleOrdersExample() throws ApiException, IOException {
        PlaceMultipleOrdersRequest placeMultipleOrdersRequest = new PlaceMultipleOrdersRequest();
        placeMultipleOrdersRequest.orders(new Orders());
        ApiResponse<PlaceMultipleOrdersResponse> response =
                getApi().placeMultipleOrders(placeMultipleOrdersRequest);
        System.out.println(response.getData());
    }
}
