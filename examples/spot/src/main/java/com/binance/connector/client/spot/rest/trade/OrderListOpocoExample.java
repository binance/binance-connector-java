package com.binance.connector.client.spot.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.OrderListOpocoRequest;
import com.binance.connector.client.spot.rest.model.OrderListOpocoResponse;
import com.binance.connector.client.spot.rest.model.PendingAboveType;
import com.binance.connector.client.spot.rest.model.PendingSide;
import com.binance.connector.client.spot.rest.model.WorkingSide;
import com.binance.connector.client.spot.rest.model.WorkingType;
import java.io.IOException;

/** API examples for TradeApi */
public class OrderListOpocoExample {
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
     * New Order List - OPOCO (TRADE)
     *
     * <p>Place an [OPOCO](/products/spot/faqs/opo). Weight(IP): 1 Unfilled Order Count: 3 Security
     * Type: TRADE Notes: **Data Source:** Matching Engine
     *
     * @throws ApiException if the Api call fails
     */
    public void orderListOpocoExample() throws ApiException, IOException {
        OrderListOpocoRequest orderListOpocoRequest = new OrderListOpocoRequest();
        orderListOpocoRequest.symbol("BNBUSDT");
        orderListOpocoRequest.workingType(WorkingType.LIMIT);
        orderListOpocoRequest.workingSide(WorkingSide.BUY);
        orderListOpocoRequest.workingPrice(1d);
        orderListOpocoRequest.workingQuantity(1d);
        orderListOpocoRequest.pendingSide(PendingSide.BUY);
        orderListOpocoRequest.pendingAboveType(PendingAboveType.STOP_LOSS_LIMIT);
        ApiResponse<OrderListOpocoResponse> response =
                getApi().orderListOpoco(orderListOpocoRequest);
        System.out.println(response.getData());
    }
}
