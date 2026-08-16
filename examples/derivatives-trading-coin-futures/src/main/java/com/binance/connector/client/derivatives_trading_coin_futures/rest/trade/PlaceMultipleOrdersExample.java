package com.binance.connector.client.derivatives_trading_coin_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.DerivativesTradingCoinFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.DerivativesTradingCoinFuturesRestApi;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.BatchOrders;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.PlaceMultipleOrdersRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.PlaceMultipleOrdersResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class PlaceMultipleOrdersExample {
    private DerivativesTradingCoinFuturesRestApi api;

    public DerivativesTradingCoinFuturesRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingCoinFuturesRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingCoinFuturesRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Place Multiple Orders (TRADE)
     *
     * <p>Place multiple orders * Parameter rules are same with &#x60;New Order&#x60; * Batch orders
     * are processed concurrently, and the order of matching is not guaranteed. * The order of
     * returned contents for batch orders is the same as the order of the order list. Weight(IP): 5
     * Security Type: TRADE Notes: - &#x60;batchOrders&#x60; must be a JSON array of order parameter
     * objects. - Example:
     * &#x60;/dapi/v1/batchOrders?batchOrders&#x3D;[{\&quot;type\&quot;:\&quot;LIMIT\&quot;,\&quot;timeInForce\&quot;:\&quot;GTC\&quot;,\&quot;symbol\&quot;:\&quot;BTCUSD_PERP\&quot;,\&quot;side\&quot;:\&quot;BUY\&quot;,\&quot;price\&quot;:\&quot;10001\&quot;,\&quot;quantity\&quot;:\&quot;1\&quot;}]&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    public void placeMultipleOrdersExample() throws ApiException, IOException {
        PlaceMultipleOrdersRequest placeMultipleOrdersRequest = new PlaceMultipleOrdersRequest();
        placeMultipleOrdersRequest.batchOrders(new BatchOrders());
        ApiResponse<PlaceMultipleOrdersResponse> response =
                getApi().placeMultipleOrders(placeMultipleOrdersRequest);
        System.out.println(response.getData());
    }
}
