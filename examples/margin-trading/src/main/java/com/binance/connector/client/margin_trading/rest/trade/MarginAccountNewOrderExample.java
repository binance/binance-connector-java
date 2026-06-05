package com.binance.connector.client.margin_trading.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.MarginAccountNewOrderRequest;
import com.binance.connector.client.margin_trading.rest.model.MarginAccountNewOrderResponse;
import com.binance.connector.client.margin_trading.rest.model.Side;

/** API examples for TradeApi */
public class MarginAccountNewOrderExample {
    private MarginTradingRestApi api;

    public MarginTradingRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    MarginTradingRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new MarginTradingRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Margin Account New Order (TRADE)
     *
     * <p>Post a new order for margin account. * autoRepayAtCancel is suggested to set as “FALSE” to
     * keep liability unrepaid under high frequent new order/cancel order execution Weight: 6(UID)
     *
     * @throws ApiException if the Api call fails
     */
    public void marginAccountNewOrderExample() throws ApiException {
        MarginAccountNewOrderRequest marginAccountNewOrderRequest =
                new MarginAccountNewOrderRequest();
        marginAccountNewOrderRequest.symbol("");
        marginAccountNewOrderRequest.side(Side.BUY);
        marginAccountNewOrderRequest.type("");
        ApiResponse<MarginAccountNewOrderResponse> response =
                getApi().marginAccountNewOrder(marginAccountNewOrderRequest);
        System.out.println(response.getData());
    }
}
