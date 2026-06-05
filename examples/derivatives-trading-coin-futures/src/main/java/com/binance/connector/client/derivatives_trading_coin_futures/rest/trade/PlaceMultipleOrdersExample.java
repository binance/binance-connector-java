package com.binance.connector.client.derivatives_trading_coin_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.DerivativesTradingCoinFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.DerivativesTradingCoinFuturesRestApi;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.BatchOrdersPlaceMultipleOrders;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.PlaceMultipleOrdersRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.PlaceMultipleOrdersResponse;

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
     * Place Multiple Orders(TRADE)
     *
     * <p>Place multiple orders * Parameter rules are same with &#x60;New Order&#x60; * Batch orders
     * are processed concurrently, and the order of matching is not guaranteed. * The order of
     * returned contents for batch orders is the same as the order of the order list. Weight: 5
     *
     * @throws ApiException if the Api call fails
     */
    public void placeMultipleOrdersExample() throws ApiException {
        PlaceMultipleOrdersRequest placeMultipleOrdersRequest = new PlaceMultipleOrdersRequest();
        placeMultipleOrdersRequest.batchOrders(new BatchOrdersPlaceMultipleOrders());
        ApiResponse<PlaceMultipleOrdersResponse> response =
                getApi().placeMultipleOrders(placeMultipleOrdersRequest);
        System.out.println(response.getData());
    }
}
