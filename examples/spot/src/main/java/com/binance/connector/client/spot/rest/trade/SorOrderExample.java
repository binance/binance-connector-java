package com.binance.connector.client.spot.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.OrderType;
import com.binance.connector.client.spot.rest.model.Side;
import com.binance.connector.client.spot.rest.model.SorOrderRequest;
import com.binance.connector.client.spot.rest.model.SorOrderResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class SorOrderExample {
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
     * New order using SOR (TRADE)
     *
     * <p>Places an order using smart order routing (SOR). This adds 1 order to the
     * &#x60;EXCHANGE_MAX_ORDERS&#x60; filter and the &#x60;MAX_NUM_ORDERS&#x60; filter. Read [SOR
     * FAQ](/products/spot/faqs/sor_faq) to learn more. Weight(IP): 1 Unfilled Order Count: 1
     * Security Type: TRADE Notes: **Data Source:** Matching Engine **Note:** &#x60;POST
     * /api/v3/sor/order&#x60; only supports &#x60;LIMIT&#x60; and &#x60;MARKET&#x60; orders.
     * &#x60;quoteOrderQty&#x60; is not supported.
     *
     * @throws ApiException if the Api call fails
     */
    public void sorOrderExample() throws ApiException, IOException {
        SorOrderRequest sorOrderRequest = new SorOrderRequest();
        sorOrderRequest.symbol("BNBUSDT");
        sorOrderRequest.side(Side.BUY);
        sorOrderRequest.type(OrderType.MARKET);
        sorOrderRequest.quantity(1d);
        ApiResponse<SorOrderResponse> response = getApi().sorOrder(sorOrderRequest);
        System.out.println(response.getData());
    }
}
