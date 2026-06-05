package com.binance.connector.client.spot.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.OrderListOpoRequest;
import com.binance.connector.client.spot.rest.model.OrderListOpoResponse;
import com.binance.connector.client.spot.rest.model.PendingSide;
import com.binance.connector.client.spot.rest.model.PendingType;
import com.binance.connector.client.spot.rest.model.WorkingSide;
import com.binance.connector.client.spot.rest.model.WorkingType;

/** API examples for TradeApi */
public class OrderListOpoExample {
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
     * New Order List - OPO
     *
     * <p>Place an [OPO](./faqs/opo.md). * OPOs add 2 orders to the EXCHANGE_MAX_NUM_ORDERS filter
     * and MAX_NUM_ORDERS filter. Weight: 1 Unfilled Order Count: 2
     *
     * @throws ApiException if the Api call fails
     */
    public void orderListOpoExample() throws ApiException {
        OrderListOpoRequest orderListOpoRequest = new OrderListOpoRequest();
        orderListOpoRequest.symbol("BNBUSDT");
        orderListOpoRequest.workingType(WorkingType.LIMIT);
        orderListOpoRequest.workingSide(WorkingSide.BUY);
        orderListOpoRequest.workingPrice(1.0d);
        orderListOpoRequest.workingQuantity(1.0d);
        orderListOpoRequest.pendingType(PendingType.LIMIT);
        orderListOpoRequest.pendingSide(PendingSide.BUY);
        ApiResponse<OrderListOpoResponse> response = getApi().orderListOpo(orderListOpoRequest);
        System.out.println(response.getData());
    }
}
