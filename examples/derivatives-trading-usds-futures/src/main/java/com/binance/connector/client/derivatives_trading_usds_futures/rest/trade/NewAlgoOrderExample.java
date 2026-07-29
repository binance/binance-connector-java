package com.binance.connector.client.derivatives_trading_usds_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.AlgoType;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.NewAlgoOrderRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.NewAlgoOrderResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.OrderType;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.Side;
import java.io.IOException;

/** API examples for TradeApi */
public class NewAlgoOrderExample {
    private DerivativesTradingUsdsFuturesRestApi api;

    public DerivativesTradingUsdsFuturesRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingUsdsFuturesRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingUsdsFuturesRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * New Algo Order (TRADE)
     *
     * <p>Send in a new algo (conditional) order. Use this endpoint to place **TP/SL (Take Profit /
     * Stop Loss)** and trailing stop orders on USD-M Futures. Supported order types under
     * &#x60;algoType&#x3D;CONDITIONAL&#x60; are &#x60;STOP_MARKET&#x60;,
     * &#x60;TAKE_PROFIT_MARKET&#x60;, &#x60;STOP&#x60;, &#x60;TAKE_PROFIT&#x60;, and
     * &#x60;TRAILING_STOP_MARKET&#x60;. Weight: 1 on 10s order rate limit(X-MBX-ORDER-COUNT-10S); 1
     * on 1min order rate limit(X-MBX-ORDER-COUNT-1M); 0 on IP rate limit(x-mbx-used-weight-1m)
     * Security Type: TRADE Notes: - Algo order with type &#x60;STOP&#x60;, parameter
     * &#x60;timeInForce&#x60; can be sent (default &#x60;GTC&#x60;). - Algo order with type
     * &#x60;TAKE_PROFIT&#x60;, parameter &#x60;timeInForce&#x60; can be sent ( default
     * &#x60;GTC&#x60;). - Condition orders will be triggered when: - If
     * parameter&#x60;priceProtect&#x60;is sent as true: - when price reaches the
     * &#x60;triggerPrice&#x60; ，the difference rate between \&quot;MARK_PRICE\&quot; and
     * \&quot;CONTRACT_PRICE\&quot; cannot be larger than the \&quot;triggerProtect\&quot; of the
     * symbol - \&quot;triggerProtect\&quot; of a symbol can be got from &#x60;GET
     * /fapi/v1/exchangeInfo&#x60; - &#x60;STOP&#x60;, &#x60;STOP_MARKET&#x60;: - BUY: latest price
     * (\&quot;MARK_PRICE\&quot; or \&quot;CONTRACT_PRICE\&quot;) &gt;&#x3D;
     * &#x60;triggerPrice&#x60; - SELL: latest price (\&quot;MARK_PRICE\&quot; or
     * \&quot;CONTRACT_PRICE\&quot;) - &#x60;TAKE_PROFIT&#x60;, &#x60;TAKE_PROFIT_MARKET&#x60;: -
     * BUY: latest price (\&quot;MARK_PRICE\&quot; or \&quot;CONTRACT_PRICE\&quot;) - SELL: latest
     * price (\&quot;MARK_PRICE\&quot; or \&quot;CONTRACT_PRICE\&quot;) &gt;&#x3D;
     * &#x60;triggerPrice&#x60; - &#x60;TRAILING_STOP_MARKET&#x60;: - BUY: the lowest price after
     * order placed &#x3D; the lowest price * (1 + &#x60;callbackRate&#x60;) - SELL: the highest
     * price after order placed &gt;&#x3D; &#x60;activatePrice&#x60;, and the latest price - For
     * &#x60;TRAILING_STOP_MARKET&#x60;, if you got such error code. &gt; &#x60;{\&quot;code\&quot;:
     * -2021, \&quot;msg\&quot;: \&quot;Order would immediately trigger.\&quot;}&#x60; &gt; means
     * that the parameters you send do not meet the following requirements: - BUY:
     * &#x60;activatePrice&#x60; should be smaller than latest price. - SELL:
     * &#x60;activatePrice&#x60; should be larger than latest price. - &#x60;STOP_MARKET&#x60;,
     * &#x60;TAKE_PROFIT_MARKET&#x60; with &#x60;closePosition&#x60;&#x3D;&#x60;true&#x60;: - Follow
     * the same rules for condition orders. - If triggered，**close all** current long position( if
     * &#x60;SELL&#x60;) or current short position( if &#x60;BUY&#x60;). - Cannot be used with
     * &#x60;quantity&#x60; paremeter - Cannot be used with &#x60;reduceOnly&#x60; parameter - In
     * Hedge Mode,cannot be used with &#x60;BUY&#x60; orders in &#x60;LONG&#x60; position side. and
     * cannot be used with &#x60;SELL&#x60; orders in &#x60;SHORT&#x60; position side -
     * &#x60;selfTradePreventionMode&#x60; is only effective when &#x60;timeInForce&#x60; set to
     * &#x60;IOC&#x60; or &#x60;GTC&#x60; or &#x60;GTD&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    public void newAlgoOrderExample() throws ApiException, IOException {
        NewAlgoOrderRequest newAlgoOrderRequest = new NewAlgoOrderRequest();
        newAlgoOrderRequest.algoType(AlgoType.CONDITIONAL);
        newAlgoOrderRequest.symbol("BNBUSDT");
        newAlgoOrderRequest.side(Side.BUY);
        newAlgoOrderRequest.type(OrderType.LIMIT);
        ApiResponse<NewAlgoOrderResponse> response = getApi().newAlgoOrder(newAlgoOrderRequest);
        System.out.println(response.getData());
    }
}
