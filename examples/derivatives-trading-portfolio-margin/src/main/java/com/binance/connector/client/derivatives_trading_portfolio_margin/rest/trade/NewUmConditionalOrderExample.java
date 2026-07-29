package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.NewUmConditionalOrderRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.NewUmConditionalOrderResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.Side;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.StrategyType;
import java.io.IOException;

/** API examples for TradeApi */
public class NewUmConditionalOrderExample {
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
     * New UM Conditional Order (TRADE)
     *
     * <p>Place new UM conditional order Weight(IP): 1 Security Type: TRADE Notes: - Additional
     * mandatory parameters based on type: - Order with type &#x60;STOP/TAKE_PROFIT&#x60;, parameter
     * &#x60;timeInForce&#x60; can be sent ( default &#x60;GTC&#x60;). - Condition orders will be
     * triggered when: - &#x60;STOP&#x60;, &#x60;STOP_MARKET&#x60;: - BUY: \&quot;MARK_PRICE\&quot;
     * &gt;&#x3D; &#x60;stopPrice&#x60; - SELL: \&quot;MARK_PRICE\&quot; &#x3D;
     * &#x60;stopPrice&#x60; - &#x60;TRAILING_STOP_MARKET&#x60;: - BUY: the lowest mark price after
     * order placed &#x60;&#x60;&#x3D; the lowest mark price - (1 + &#x60;callbackRate&#x60;) -
     * SELL: the highest mark price after order placed &gt;&#x3D; &#x60;activationPrice&#x60;, and
     * the latest mark price &#x3D; &#x60;stopPrice&#x60; - SELL: latest price
     * (\&quot;MARK_PRICE\&quot; or \&quot;CONTRACT_PRICE\&quot;) &#x3D; &#x60;stopPrice&#x60; -
     * &#x60;selfTradePreventionMode&#x60; is only effective when &#x60;timeInForce&#x60; set to
     * &#x60;IOC&#x60; or &#x60;GTC&#x60; or &#x60;GTD&#x60;. - In extreme market conditions,
     * timeInForce &#x60;GTD&#x60; order auto cancel time might be delayed comparing to
     * &#x60;goodTillDate&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    public void newUmConditionalOrderExample() throws ApiException, IOException {
        NewUmConditionalOrderRequest newUmConditionalOrderRequest =
                new NewUmConditionalOrderRequest();
        newUmConditionalOrderRequest.symbol("BTCUSDT");
        newUmConditionalOrderRequest.side(Side.BUY);
        newUmConditionalOrderRequest.strategyType(StrategyType.STOP);
        ApiResponse<NewUmConditionalOrderResponse> response =
                getApi().newUmConditionalOrder(newUmConditionalOrderRequest);
        System.out.println(response.getData());
    }
}
