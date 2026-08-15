package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.AlgoType;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.NewUmAlgoOrderRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.NewUmAlgoOrderResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.OrderType;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.Side;
import java.io.IOException;

/** API examples for TradeApi */
public class NewUmAlgoOrderExample {
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
     * New UM Algo Order (TRADE)
     *
     * <p>Place new UM conditional order Weight(IP): 1 Security Type: TRADE Notes: - Algo order with
     * type &#x60;STOP&#x60;, parameter &#x60;timeInForce&#x60; can be sent (default
     * &#x60;GTC&#x60;). - Algo order with type &#x60;TAKE_PROFIT&#x60;, parameter
     * &#x60;timeInForce&#x60; can be sent (default &#x60;GTC&#x60;). - Condition orders will be
     * triggered when price reaches the &#x60;triggerPrice&#x60;. - &#x60;STOP&#x60;,
     * &#x60;STOP_MARKET&#x60;: BUY: latest price &gt;&#x3D; &#x60;triggerPrice&#x60;; SELL: latest
     * price &lt;&#x3D; &#x60;triggerPrice&#x60;. - &#x60;TAKE_PROFIT&#x60;,
     * &#x60;TAKE_PROFIT_MARKET&#x60;: BUY: latest price &lt;&#x3D; &#x60;triggerPrice&#x60;; SELL:
     * latest price &gt;&#x3D; &#x60;triggerPrice&#x60;. - &#x60;TRAILING_STOP_MARKET&#x60;: BUY:
     * lowest price after order placed &lt;&#x3D; &#x60;activatePrice&#x60;, and latest price
     * &gt;&#x3D; lowest price * (1 + &#x60;callbackRate&#x60;); SELL: highest price after order
     * placed &gt;&#x3D; &#x60;activatePrice&#x60;, and latest price &lt;&#x3D; highest price * (1 -
     * &#x60;callbackRate&#x60;). - &#x60;selfTradePreventionMode&#x60; is only effective when
     * &#x60;timeInForce&#x60; set to &#x60;IOC&#x60; or &#x60;GTC&#x60; or &#x60;GTD&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    public void newUmAlgoOrderExample() throws ApiException, IOException {
        NewUmAlgoOrderRequest newUmAlgoOrderRequest = new NewUmAlgoOrderRequest();
        newUmAlgoOrderRequest.algoType(AlgoType.CONDITIONAL);
        newUmAlgoOrderRequest.symbol("BNBUSDT");
        newUmAlgoOrderRequest.side(Side.BUY);
        newUmAlgoOrderRequest.type(OrderType.LIMIT);
        newUmAlgoOrderRequest.quantity(0.01d);
        ApiResponse<NewUmAlgoOrderResponse> response =
                getApi().newUmAlgoOrder(newUmAlgoOrderRequest);
        System.out.println(response.getData());
    }
}
