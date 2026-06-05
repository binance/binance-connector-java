package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.NewUmAlgoOrderRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.NewUmAlgoOrderResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.Side;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.Type;

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
     * <p>Place new UM conditional order * Algo order with type &#x60;STOP&#x60;, parameter
     * &#x60;timeInForce&#x60; can be sent ( default &#x60;GTC&#x60;). * Algo order with type
     * &#x60;TAKE_PROFIT&#x60;, parameter &#x60;timeInForce&#x60; can be sent ( default
     * &#x60;GTC&#x60;). * Condition orders will be triggered when: * If
     * parameter&#x60;priceProtect&#x60;is sent as true: * when price reaches the
     * &#x60;triggerPrice&#x60; , the difference rate between \&quot;MARK_PRICE\&quot; and
     * \&quot;CONTRACT_PRICE\&quot; cannot be larger than the \&quot;triggerProtect\&quot; of the
     * symbol * \&quot;triggerProtect\&quot; of a symbol can be got from &#x60;GET
     * /fapi/v1/exchangeInfo&#x60; * &#x60;STOP&#x60;, &#x60;STOP_MARKET&#x60;: * BUY: latest price
     * (\&quot;MARK_PRICE\&quot; or \&quot;CONTRACT_PRICE\&quot;) &gt;&#x3D;
     * &#x60;triggerPrice&#x60; * SELL: latest price (\&quot;MARK_PRICE\&quot; or
     * \&quot;CONTRACT_PRICE\&quot;) &lt;&#x3D; &#x60;triggerPrice&#x60; * &#x60;TAKE_PROFIT&#x60;,
     * &#x60;TAKE_PROFIT_MARKET&#x60;: * BUY: latest price (\&quot;MARK_PRICE\&quot; or
     * \&quot;CONTRACT_PRICE\&quot;) &lt;&#x3D; &#x60;triggerPrice&#x60; * SELL: latest price
     * (\&quot;MARK_PRICE\&quot; or \&quot;CONTRACT_PRICE\&quot;) &gt;&#x3D;
     * &#x60;triggerPrice&#x60; * &#x60;TRAILING_STOP_MARKET&#x60;: * BUY: the lowest price after
     * order placed &lt;&#x3D; &#x60;activatePrice&#x60;, and the latest price &gt;&#x3D; the lowest
     * price * (1 + &#x60;callbackRate&#x60;) * SELL: the highest price after order placed
     * &gt;&#x3D; &#x60;activatePrice&#x60;, and the latest price &lt;&#x3D; the highest price * (1
     * - &#x60;callbackRate&#x60;) * For &#x60;TRAILING_STOP_MARKET&#x60;, if you got such error
     * code. &#x60;&#x60;{\&quot;code\&quot;: -2021, \&quot;msg\&quot;: \&quot;Order would
     * immediately trigger.\&quot;}&#x60;&#x60; means that the parameters you send do not meet the
     * following requirements: * BUY: &#x60;activatePrice&#x60; should be smaller than latest price.
     * * SELL: &#x60;activatePrice&#x60; should be larger than latest price. *
     * &#x60;STOP_MARKET&#x60;, &#x60;TAKE_PROFIT_MARKET&#x60; with
     * &#x60;closePosition&#x60;&#x3D;&#x60;true&#x60;: * Follow the same rules for condition
     * orders. * If triggered, **close all** current long position( if &#x60;SELL&#x60;) or current
     * short position( if &#x60;BUY&#x60;). * Cannot be used with &#x60;quantity&#x60; paremeter *
     * Cannot be used with &#x60;reduceOnly&#x60; parameter * In Hedge Mode,cannot be used with
     * &#x60;BUY&#x60; orders in &#x60;LONG&#x60; position side. and cannot be used with
     * &#x60;SELL&#x60; orders in &#x60;SHORT&#x60; position side *
     * &#x60;selfTradePreventionMode&#x60; is only effective when &#x60;timeInForce&#x60; set to
     * &#x60;IOC&#x60; or &#x60;GTC&#x60; or &#x60;GTD&#x60;. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void newUmAlgoOrderExample() throws ApiException {
        NewUmAlgoOrderRequest newUmAlgoOrderRequest = new NewUmAlgoOrderRequest();
        newUmAlgoOrderRequest.algoType("");
        newUmAlgoOrderRequest.symbol("");
        newUmAlgoOrderRequest.side(Side.BUY);
        newUmAlgoOrderRequest.type(Type.LIMIT);
        ApiResponse<NewUmAlgoOrderResponse> response =
                getApi().newUmAlgoOrder(newUmAlgoOrderRequest);
        System.out.println(response.getData());
    }
}
