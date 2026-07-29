package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.NewCmConditionalOrderRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.NewCmConditionalOrderResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.Side;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.StrategyType;
import java.io.IOException;

/** API examples for TradeApi */
public class NewCmConditionalOrderExample {
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
     * New CM Conditional Order (TRADE)
     *
     * <p>New CM Conditional Order Weight(IP): 1 Security Type: TRADE Notes: - Additional mandatory
     * parameters based on type: - Order with type &#x60;STOP/TAKE_PROFIT&#x60;, parameter
     * &#x60;timeInForce&#x60; can be sent ( default &#x60;GTC&#x60;). - Condition orders will be
     * triggered when: - &#x60;STOP&#x60;, &#x60;STOP_MARKET&#x60;: - BUY: \&quot;MARK_PRICE\&quot;
     * &gt;&#x3D; &#x60;stopPrice&#x60; - SELL: \&quot;MARK_PRICE\&quot; &#x3D;
     * &#x60;stopPrice&#x60; - &#x60;TRAILING_STOP_MARKET&#x60;: - BUY: the lowest mark price after
     * order placed &#x60;&#x60;&#x3D; the lowest mark price - (1 + &#x60;callbackRate&#x60;) -
     * SELL: the highest mark price after order placed &gt;&#x3D; &#x60;activationPrice&#x60;, and
     * the latest mark price &#x3D; &#x60;stopPrice&#x60; - SELL: latest price
     * (\&quot;MARK_PRICE\&quot; or \&quot;CONTRACT_PRICE\&quot;) &#x3D; &#x60;stopPrice&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    public void newCmConditionalOrderExample() throws ApiException, IOException {
        NewCmConditionalOrderRequest newCmConditionalOrderRequest =
                new NewCmConditionalOrderRequest();
        newCmConditionalOrderRequest.symbol("BTCUSDT");
        newCmConditionalOrderRequest.side(Side.BUY);
        newCmConditionalOrderRequest.strategyType(StrategyType.STOP);
        ApiResponse<NewCmConditionalOrderResponse> response =
                getApi().newCmConditionalOrder(newCmConditionalOrderRequest);
        System.out.println(response.getData());
    }
}
