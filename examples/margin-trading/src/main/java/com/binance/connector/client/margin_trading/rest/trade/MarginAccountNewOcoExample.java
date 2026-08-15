package com.binance.connector.client.margin_trading.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.MarginAccountNewOcoRequest;
import com.binance.connector.client.margin_trading.rest.model.MarginAccountNewOcoResponse;
import com.binance.connector.client.margin_trading.rest.model.Side;
import java.io.IOException;

/** API examples for TradeApi */
public class MarginAccountNewOcoExample {
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
     * Margin Account New OCO (TRADE)
     *
     * <p>Send in a new OCO for a margin account Weight: 6(UID) or 1500(UID) when sideEffectType is
     * MARGIN_BUY or AUTO_BORROW_REPAY Security Type: TRADE Notes: - autoRepayAtCancel is suggested
     * to set as “FALSE” to keep liability unrepaid under high frequent new order/cancel order
     * execution
     *
     * @throws ApiException if the Api call fails
     */
    public void marginAccountNewOcoExample() throws ApiException, IOException {
        MarginAccountNewOcoRequest marginAccountNewOcoRequest = new MarginAccountNewOcoRequest();
        marginAccountNewOcoRequest.symbol("LTCBTC");
        marginAccountNewOcoRequest.side(Side.BUY);
        marginAccountNewOcoRequest.quantity(1.0d);
        marginAccountNewOcoRequest.price(1.0d);
        marginAccountNewOcoRequest.stopPrice(1.0d);
        ApiResponse<MarginAccountNewOcoResponse> response =
                getApi().marginAccountNewOco(marginAccountNewOcoRequest);
        System.out.println(response.getData());
    }
}
