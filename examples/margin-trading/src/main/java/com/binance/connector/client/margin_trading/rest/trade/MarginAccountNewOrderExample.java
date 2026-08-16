package com.binance.connector.client.margin_trading.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.MarginAccountNewOrderRequest;
import com.binance.connector.client.margin_trading.rest.model.MarginAccountNewOrderResponse;
import com.binance.connector.client.margin_trading.rest.model.OrderType;
import com.binance.connector.client.margin_trading.rest.model.Side;
import java.io.IOException;

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
     * <p>Post a new order for margin account. Weight: 6(UID) or 1500(UID) when sideEffectType is
     * MARGIN_BUY or AUTO_BORROW_REPAY Security Type: TRADE Notes: - autoRepayAtCancel is suggested
     * to set as “FALSE” to keep liability unrepaid under high frequent new order/cancel order
     * execution
     *
     * @throws ApiException if the Api call fails
     */
    public void marginAccountNewOrderExample() throws ApiException, IOException {
        MarginAccountNewOrderRequest marginAccountNewOrderRequest =
                new MarginAccountNewOrderRequest();
        marginAccountNewOrderRequest.symbol("BTCUSDT");
        marginAccountNewOrderRequest.side(Side.BUY);
        marginAccountNewOrderRequest.type(OrderType.ROLL_IN);
        ApiResponse<MarginAccountNewOrderResponse> response =
                getApi().marginAccountNewOrder(marginAccountNewOrderRequest);
        System.out.println(response.getData());
    }
}
