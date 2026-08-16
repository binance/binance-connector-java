package com.binance.connector.client.spot.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.NewOrderRequest;
import com.binance.connector.client.spot.rest.model.NewOrderResponse;
import com.binance.connector.client.spot.rest.model.OrderType;
import com.binance.connector.client.spot.rest.model.Side;
import java.io.IOException;

/** API examples for TradeApi */
public class NewOrderExample {
    private SpotRestApi api;

    public SpotRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = SpotRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new SpotRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * New order (TRADE)
     *
     * <p>Send in a new order. This adds 1 order to the &#x60;EXCHANGE_MAX_ORDERS&#x60; filter and
     * the &#x60;MAX_NUM_ORDERS&#x60; filter. Weight(IP): 1 Unfilled Order Count: 1 Security Type:
     * TRADE Notes: **Data Source:** Matching Engine Some additional mandatory parameters based on
     * order &#x60;type&#x60;: Type | Additional mandatory parameters | Additional Information
     * ------------ | ------------| ------ &#x60;LIMIT&#x60; | &#x60;timeInForce&#x60;,
     * &#x60;quantity&#x60;, &#x60;price&#x60;| &#x60;MARKET&#x60; | &#x60;quantity&#x60; or
     * &#x60;quoteOrderQty&#x60;| &#x60;MARKET&#x60; orders using the &#x60;quantity&#x60; field
     * specifies the amount of the &#x60;base asset&#x60; the user wants to buy or sell at the
     * market price. &lt;br/&gt; E.g. MARKET order on BTCUSDT will specify how much BTC the user is
     * buying or selling. &lt;br/&gt;&lt;br/&gt; &#x60;MARKET&#x60; orders using
     * &#x60;quoteOrderQty&#x60; specifies the amount the user wants to spend (when buying) or
     * receive (when selling) the &#x60;quote&#x60; asset; the correct &#x60;quantity&#x60; will be
     * determined based on the market liquidity and &#x60;quoteOrderQty&#x60;. &lt;br/&gt; E.g.
     * Using the symbol BTCUSDT: &lt;br/&gt; &#x60;BUY&#x60; side, the order will buy as many BTC as
     * &#x60;quoteOrderQty&#x60; USDT can. &lt;br/&gt; &#x60;SELL&#x60; side, the order will sell as
     * much BTC needed to receive &#x60;quoteOrderQty&#x60; USDT. &#x60;STOP_LOSS&#x60; |
     * &#x60;quantity&#x60;, &#x60;stopPrice&#x60; or &#x60;trailingDelta&#x60;| This will execute a
     * &#x60;MARKET&#x60; order when the conditions are met. (e.g. &#x60;stopPrice&#x60; is met or
     * &#x60;trailingDelta&#x60; is activated) &#x60;STOP_LOSS_LIMIT&#x60; |
     * &#x60;timeInForce&#x60;, &#x60;quantity&#x60;, &#x60;price&#x60;, &#x60;stopPrice&#x60; or
     * &#x60;trailingDelta&#x60; &#x60;TAKE_PROFIT&#x60; | &#x60;quantity&#x60;,
     * &#x60;stopPrice&#x60; or &#x60;trailingDelta&#x60; | This will execute a &#x60;MARKET&#x60;
     * order when the conditions are met. (e.g. &#x60;stopPrice&#x60; is met or
     * &#x60;trailingDelta&#x60; is activated) &#x60;TAKE_PROFIT_LIMIT&#x60; |
     * &#x60;timeInForce&#x60;, &#x60;quantity&#x60;, &#x60;price&#x60;, &#x60;stopPrice&#x60; or
     * &#x60;trailingDelta&#x60; | &#x60;LIMIT_MAKER&#x60; | &#x60;quantity&#x60;,
     * &#x60;price&#x60;| This is a &#x60;LIMIT&#x60; order that will be rejected if the order
     * immediately matches and trades as a taker. &lt;br/&gt; This is also known as a POST-ONLY
     * order. Notes on using parameters for Pegged Orders: * These parameters are allowed for
     * &#x60;LIMIT&#x60;, &#x60;LIMIT_MAKER&#x60;, &#x60;STOP_LOSS_LIMIT&#x60;,
     * &#x60;TAKE_PROFIT_LIMIT&#x60; orders. * If &#x60;pegPriceType&#x60; is specified,
     * &#x60;price&#x60; becomes optional. Otherwise, it is still mandatory. *
     * &#x60;pegPriceType&#x3D;PRIMARY_PEG&#x60; means the primary peg, that is the best price on
     * the same side of the order book as your order. * &#x60;pegPriceType&#x3D;MARKET_PEG&#x60;
     * means the market peg, that is the best price on the opposite side of the order book from your
     * order. * Use &#x60;pegOffsetType&#x60; and &#x60;pegOffsetValue&#x60; to request a price
     * level other than the best one. These parameters must be specified together. Other info: * Any
     * &#x60;LIMIT&#x60; or &#x60;LIMIT_MAKER&#x60; type order can be made an iceberg order by
     * sending an &#x60;icebergQty&#x60;. * Any order with an &#x60;icebergQty&#x60; MUST have
     * &#x60;timeInForce&#x60; set to &#x60;GTC&#x60;. * For &#x60;STOP_LOSS&#x60;,
     * &#x60;STOP_LOSS_LIMIT&#x60;, &#x60;TAKE_PROFIT_LIMIT&#x60; and &#x60;TAKE_PROFIT&#x60;
     * orders, &#x60;trailingDelta&#x60; can be combined with &#x60;stopPrice&#x60;. *
     * &#x60;MARKET&#x60; orders using &#x60;quoteOrderQty&#x60; will not break &#x60;LOT_SIZE&#x60;
     * filter rules; the order will execute a &#x60;quantity&#x60; that will have the notional value
     * as close as possible to &#x60;quoteOrderQty&#x60;. Trigger order price rules against market
     * price for both MARKET and LIMIT versions: * Price above market price: &#x60;STOP_LOSS&#x60;
     * &#x60;BUY&#x60;, &#x60;TAKE_PROFIT&#x60; &#x60;SELL&#x60; * Price below market price:
     * &#x60;STOP_LOSS&#x60; &#x60;SELL&#x60;, &#x60;TAKE_PROFIT&#x60; &#x60;BUY&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    public void newOrderExample() throws ApiException, IOException {
        NewOrderRequest newOrderRequest = new NewOrderRequest();
        newOrderRequest.symbol("BNBUSDT");
        newOrderRequest.side(Side.BUY);
        newOrderRequest.type(OrderType.MARKET);
        ApiResponse<NewOrderResponse> response = getApi().newOrder(newOrderRequest);
        System.out.println(response.getData());
    }
}
