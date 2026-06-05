package com.binance.connector.client.spot.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.NewOrderRequest;
import com.binance.connector.client.spot.rest.model.NewOrderResponse;
import com.binance.connector.client.spot.rest.model.OrderType;
import com.binance.connector.client.spot.rest.model.Side;

/** API examples for TradeApi */
public class NewOrderExample {
    private SpotRestApi api;

    public SpotRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = SpotRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new SpotRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * New order
     *
     * <p>Send in a new order. This adds 1 order to the &#x60;EXCHANGE_MAX_ORDERS&#x60; filter and
     * the &#x60;MAX_NUM_ORDERS&#x60; filter. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void newOrderExample() throws ApiException {
        NewOrderRequest newOrderRequest = new NewOrderRequest();
        newOrderRequest.symbol("BNBUSDT");
        newOrderRequest.side(Side.BUY);
        newOrderRequest.type(OrderType.MARKET);
        ApiResponse<NewOrderResponse> response = getApi().newOrder(newOrderRequest);
        System.out.println(response.getData());
    }
}
