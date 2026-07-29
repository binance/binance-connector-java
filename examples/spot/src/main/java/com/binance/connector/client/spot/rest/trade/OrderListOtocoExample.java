package com.binance.connector.client.spot.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.OrderListOtocoRequest;
import com.binance.connector.client.spot.rest.model.OrderListOtocoResponse;
import com.binance.connector.client.spot.rest.model.PendingAboveType;
import com.binance.connector.client.spot.rest.model.PendingSide;
import com.binance.connector.client.spot.rest.model.WorkingSide;
import com.binance.connector.client.spot.rest.model.WorkingType;
import java.io.IOException;

/** API examples for TradeApi */
public class OrderListOtocoExample {
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
     * New Order list - OTOCO (TRADE)
     *
     * <p>Place an OTOCO. - An OTOCO (One-Triggers-One-Cancels-the-Other) is an order list comprised
     * of 3 orders. - The first order is called the **working order** and must be &#x60;LIMIT&#x60;
     * or &#x60;LIMIT_MAKER&#x60;. Initially, only the working order goes on the order book. - The
     * behavior of the working order is the same as the [OTO](#order-list-oto). - OTOCO has 2
     * pending orders (pending above and pending below), forming an OCO pair. The pending orders are
     * only placed on the order book when the working order gets **fully filled**. - The rules of
     * the pending above and pending below follow the same rules as the [Order list
     * OCO](#order-list-oco). - OTOCOs add **3 orders** to the &#x60;EXCHANGE_MAX_NUM_ORDERS&#x60;
     * filter and &#x60;MAX_NUM_ORDERS&#x60; filter. Weight(IP): 1 Unfilled Order Count: 3 Security
     * Type: TRADE Notes: **Data Source:** Matching Engine **Mandatory parameters based on
     * &#x60;pendingAboveType&#x60;, &#x60;pendingBelowType&#x60; or &#x60;workingType&#x60;**
     * Depending on the &#x60;pendingAboveType&#x60;/&#x60;pendingBelowType&#x60; or
     * &#x60;workingType&#x60;, some optional parameters will become mandatory. |Type |Additional
     * mandatory parameters|Additional information| |---- |---- |------ |&#x60;workingType&#x60;
     * &#x3D; &#x60;LIMIT&#x60; |&#x60;workingTimeInForce&#x60; |
     * |&#x60;pendingAboveType&#x60;&#x3D; &#x60;LIMIT_MAKER&#x60; |&#x60;pendingAbovePrice&#x60; |
     * |&#x60;pendingAboveType&#x60; &#x3D; &#x60;STOP_LOSS/TAKE_PROFIT&#x60;
     * |&#x60;pendingAboveStopPrice&#x60; and/or &#x60;pendingAboveTrailingDelta&#x60;|
     * |&#x60;pendingAboveType&#x3D;STOP_LOSS_LIMIT/TAKE_PROFIT_LIMIT&#x60;
     * |&#x60;pendingAbovePrice&#x60;, &#x60;pendingAboveStopPrice&#x60; and/or
     * &#x60;pendingAboveTrailingDelta&#x60;, &#x60;pendingAboveTimeInForce&#x60;|
     * |&#x60;pendingBelowType&#x60;&#x3D; &#x60;LIMIT_MAKER&#x60; |&#x60;pendingBelowPrice&#x60; |
     * |&#x60;pendingBelowType&#x3D; STOP_LOSS/TAKE_PROFIT&#x60; |&#x60;pendingBelowStopPrice&#x60;
     * and/or &#x60;pendingBelowTrailingDelta&#x60;|
     * |&#x60;pendingBelowType&#x3D;STOP_LOSS_LIMIT/TAKE_PROFIT_LIMIT&#x60;
     * |&#x60;pendingBelowPrice&#x60;, &#x60;pendingBelowStopPrice&#x60; and/or
     * &#x60;pendingBelowTrailingDelta&#x60;, &#x60;pendingBelowTimeInForce&#x60;|
     *
     * @throws ApiException if the Api call fails
     */
    public void orderListOtocoExample() throws ApiException, IOException {
        OrderListOtocoRequest orderListOtocoRequest = new OrderListOtocoRequest();
        orderListOtocoRequest.symbol("BNBUSDT");
        orderListOtocoRequest.workingType(WorkingType.LIMIT);
        orderListOtocoRequest.workingSide(WorkingSide.BUY);
        orderListOtocoRequest.workingPrice(1d);
        orderListOtocoRequest.workingQuantity(1d);
        orderListOtocoRequest.pendingSide(PendingSide.BUY);
        orderListOtocoRequest.pendingQuantity(1d);
        orderListOtocoRequest.pendingAboveType(PendingAboveType.STOP_LOSS_LIMIT);
        ApiResponse<OrderListOtocoResponse> response =
                getApi().orderListOtoco(orderListOtocoRequest);
        System.out.println(response.getData());
    }
}
