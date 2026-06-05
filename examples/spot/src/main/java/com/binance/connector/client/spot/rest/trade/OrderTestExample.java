package com.binance.connector.client.spot.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.OrderTestRequest;
import com.binance.connector.client.spot.rest.model.OrderTestResponse;
import com.binance.connector.client.spot.rest.model.OrderType;
import com.binance.connector.client.spot.rest.model.Side;

/** API examples for TradeApi */
public class OrderTestExample {
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
     * Test new order
     *
     * <p>Test new order creation and signature/recvWindow long. Creates and validates a new order
     * but does not send it into the matching engine. Weight: |Condition| Request Weight|
     * |------------ | ------------ | |Without &#x60;computeCommissionRates&#x60;| 1| |With
     * &#x60;computeCommissionRates&#x60;|20|
     *
     * @throws ApiException if the Api call fails
     */
    public void orderTestExample() throws ApiException {
        OrderTestRequest orderTestRequest = new OrderTestRequest();
        orderTestRequest.symbol("BNBUSDT");
        orderTestRequest.side(Side.BUY);
        orderTestRequest.type(OrderType.MARKET);
        ApiResponse<OrderTestResponse> response = getApi().orderTest(orderTestRequest);
        System.out.println(response.getData());
    }
}
