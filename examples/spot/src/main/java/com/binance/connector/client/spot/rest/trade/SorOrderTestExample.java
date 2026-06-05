package com.binance.connector.client.spot.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.OrderType;
import com.binance.connector.client.spot.rest.model.Side;
import com.binance.connector.client.spot.rest.model.SorOrderTestRequest;
import com.binance.connector.client.spot.rest.model.SorOrderTestResponse;

/** API examples for TradeApi */
public class SorOrderTestExample {
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
     * Test new order using SOR
     *
     * <p>Test new order creation and signature/recvWindow using smart order routing (SOR). Creates
     * and validates a new order but does not send it into the matching engine. Weight: | Condition
     * | Request Weight | | --------- | -------------- | | Without
     * &#x60;computeCommissionRates&#x60; | 1 | | With &#x60;computeCommissionRates&#x60; | 20 |
     *
     * @throws ApiException if the Api call fails
     */
    public void sorOrderTestExample() throws ApiException {
        SorOrderTestRequest sorOrderTestRequest = new SorOrderTestRequest();
        sorOrderTestRequest.symbol("BNBUSDT");
        sorOrderTestRequest.side(Side.BUY);
        sorOrderTestRequest.type(OrderType.MARKET);
        sorOrderTestRequest.quantity(1.0d);
        ApiResponse<SorOrderTestResponse> response = getApi().sorOrderTest(sorOrderTestRequest);
        System.out.println(response.getData());
    }
}
