package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.ModifyUmOrderRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.ModifyUmOrderResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.Side;
import java.io.IOException;

/** API examples for TradeApi */
public class ModifyUmOrderExample {
    private DerivativesTradingPortfolioMarginRestApi api;

    public DerivativesTradingPortfolioMarginRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingPortfolioMarginRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingPortfolioMarginRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Modify UM Order (TRADE)
     *
     * <p>Order modify function, currently only LIMIT order modification is supported, modified
     * orders will be reordered in the match queue Weight(IP): 1 Security Type: TRADE Notes: -
     * Either orderId or origClientOrderId must be sent, and the orderId will prevail if both are
     * sent. - Both quantity and price must be sent - When the new quantity or price doesn&#39;t
     * satisfy PRICE_FILTER / PERCENT_FILTER / LOT_SIZE, amendment will be rejected and the order
     * will stay as it is. - However the order will be cancelled by the amendment in the following
     * situations: - when the order is in partially filled status and the new quantity * When the
     * order is GTX and the new price will cause it to be executed immediately
     *
     * @throws ApiException if the Api call fails
     */
    public void modifyUmOrderExample() throws ApiException, IOException {
        ModifyUmOrderRequest modifyUmOrderRequest = new ModifyUmOrderRequest();
        modifyUmOrderRequest.symbol("BTCUSDT");
        modifyUmOrderRequest.side(Side.BUY);
        modifyUmOrderRequest.quantity(1.0d);
        modifyUmOrderRequest.price(1.0d);
        ApiResponse<ModifyUmOrderResponse> response = getApi().modifyUmOrder(modifyUmOrderRequest);
        System.out.println(response.getData());
    }
}
