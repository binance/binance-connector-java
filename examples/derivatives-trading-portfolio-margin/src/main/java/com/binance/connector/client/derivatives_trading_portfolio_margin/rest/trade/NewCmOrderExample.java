package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.NewCmOrderRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.NewCmOrderResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.OrderType;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.Side;
import java.io.IOException;

/** API examples for TradeApi */
public class NewCmOrderExample {
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
     * New CM Order (TRADE)
     *
     * <p>Place new CM order Weight(IP): 1 Security Type: TRADE Notes: - Additional mandatory
     * parameters based on &#x60;type&#x60;: - If &#x60;newOrderRespType&#x60; is sent as
     * &#x60;RESULT&#x60; : - &#x60;MARKET&#x60; order: the final FILLED result of the order will be
     * return directly. - &#x60;LIMIT&#x60; order with special &#x60;timeInForce&#x60;: the final
     * status result of the order(FILLED or EXPIRED) will be returned directly.
     *
     * @throws ApiException if the Api call fails
     */
    public void newCmOrderExample() throws ApiException, IOException {
        NewCmOrderRequest newCmOrderRequest = new NewCmOrderRequest();
        newCmOrderRequest.symbol("BTCUSDT");
        newCmOrderRequest.side(Side.BUY);
        newCmOrderRequest.type(OrderType.LIMIT);
        ApiResponse<NewCmOrderResponse> response = getApi().newCmOrder(newCmOrderRequest);
        System.out.println(response.getData());
    }
}
