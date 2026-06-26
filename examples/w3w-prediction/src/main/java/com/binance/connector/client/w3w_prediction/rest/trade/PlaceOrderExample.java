package com.binance.connector.client.w3w_prediction.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.w3w_prediction.rest.W3WPredictionRestApiUtil;
import com.binance.connector.client.w3w_prediction.rest.api.W3WPredictionRestApi;
import com.binance.connector.client.w3w_prediction.rest.model.AccountType;
import com.binance.connector.client.w3w_prediction.rest.model.OrderType;
import com.binance.connector.client.w3w_prediction.rest.model.PlaceOrderRequest;
import com.binance.connector.client.w3w_prediction.rest.model.PlaceOrderResponse;

/** API examples for TradeApi */
public class PlaceOrderExample {
    private W3WPredictionRestApi api;

    public W3WPredictionRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    W3WPredictionRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new W3WPredictionRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Place Order
     *
     * <p>Place a prediction order using a previously obtained quote. Requires SAS authorization.
     * Weight(IP): 200 Security Type: TRADE Notes: - Validation rules: | orderType | timeInForce |
     * priceLimit | | --------- | ------------- | --------------------- | | &#x60;MARKET&#x60; |
     * Must be &#x60;FOK&#x60; | Not required | | &#x60;LIMIT&#x60; | Must be &#x60;GTC&#x60; |
     * Required, must be &gt; 0 |
     *
     * @throws ApiException if the Api call fails
     */
    public void placeOrderExample() throws ApiException {
        PlaceOrderRequest placeOrderRequest = new PlaceOrderRequest();
        placeOrderRequest.walletAddress("0x12e32db8817e292508c34111cbc4b23340df542c");
        placeOrderRequest.walletId("5b5c1ec3be4e4416a5872b21c1ca5d20");
        placeOrderRequest.quoteId("q_20260525_abc123xyz");
        placeOrderRequest.timeInForce("FOK");
        placeOrderRequest.accountType(AccountType.SPOT);
        placeOrderRequest.orderType(OrderType.MARKET);
        placeOrderRequest.slippageBps(1200);
        ApiResponse<PlaceOrderResponse> response = getApi().placeOrder(placeOrderRequest);
        System.out.println(response.getData());
    }
}
