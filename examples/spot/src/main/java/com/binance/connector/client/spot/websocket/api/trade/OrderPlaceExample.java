package com.binance.connector.client.spot.websocket.api.trade;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.OrderPlaceRequest;
import com.binance.connector.client.spot.websocket.api.model.OrderPlaceResponse;
import com.binance.connector.client.spot.websocket.api.model.OrderType;
import com.binance.connector.client.spot.websocket.api.model.Side;
import java.util.concurrent.CompletableFuture;

/** API examples for TradeApi */
public class OrderPlaceExample {
    private SpotWebSocketApi api;

    public SpotWebSocketApi getApi() {
        if (api == null) {
            WebSocketClientConfiguration clientConfiguration =
                    SpotWebSocketApiUtil.getClientConfiguration();
            // if you want the connection to be auto logged on:
            // https://developers.binance.com/docs/binance-spot-api-docs/websocket-api/authentication-requests
            clientConfiguration.setAutoLogon(true);
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("/path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new SpotWebSocketApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Place new order (TRADE)
     *
     * <p>Send in a new order. This adds 1 order to the &#x60;EXCHANGE_MAX_ORDERS&#x60; filter and
     * the &#x60;MAX_NUM_ORDERS&#x60; filter. Weight(IP): 1 Unfilled Order Count: 1 Security Type:
     * TRADE Notes: **Data Source:** Matching Engine &lt;a
     * id&#x3D;\&quot;order-type\&quot;&gt;Certain parameters (*)&lt;/a&gt; become mandatory based
     * on the order &#x60;type&#x60;: &lt;table&gt; &lt;thead&gt; &lt;tr&gt; &lt;th&gt;Order
     * &lt;code&gt;type&lt;/code&gt;&lt;/th&gt; &lt;th&gt;Mandatory parameters&lt;/th&gt;
     * &lt;/tr&gt; &lt;/thead&gt; &lt;tbody&gt; &lt;tr&gt;
     * &lt;td&gt;&lt;code&gt;LIMIT&lt;/code&gt;&lt;/td&gt; &lt;td&gt; &lt;ul&gt;
     * &lt;li&gt;&lt;code&gt;timeInForce&lt;/code&gt;&lt;/li&gt;
     * &lt;li&gt;&lt;code&gt;price&lt;/code&gt;&lt;/li&gt;
     * &lt;li&gt;&lt;code&gt;quantity&lt;/code&gt;&lt;/li&gt; &lt;/ul&gt; &lt;/td&gt; &lt;/tr&gt;
     * &lt;tr&gt; &lt;td&gt;&lt;code&gt;LIMIT_MAKER&lt;/code&gt;&lt;/td&gt; &lt;td&gt; &lt;ul&gt;
     * &lt;li&gt;&lt;code&gt;price&lt;/code&gt;&lt;/li&gt;
     * &lt;li&gt;&lt;code&gt;quantity&lt;/code&gt;&lt;/li&gt; &lt;/ul&gt; &lt;/td&gt; &lt;/tr&gt;
     * &lt;tr&gt; &lt;td&gt;&lt;code&gt;MARKET&lt;/code&gt;&lt;/td&gt; &lt;td&gt; &lt;ul&gt;
     * &lt;li&gt;&lt;code&gt;quantity&lt;/code&gt; or
     * &lt;code&gt;quoteOrderQty&lt;/code&gt;&lt;/li&gt; &lt;/ul&gt; &lt;/td&gt; &lt;/tr&gt;
     * &lt;tr&gt; &lt;td&gt;&lt;code&gt;STOP_LOSS&lt;/code&gt;&lt;/td&gt; &lt;td&gt; &lt;ul&gt;
     * &lt;li&gt;&lt;code&gt;quantity&lt;/code&gt;&lt;/li&gt;
     * &lt;li&gt;&lt;code&gt;stopPrice&lt;/code&gt; or
     * &lt;code&gt;trailingDelta&lt;/code&gt;&lt;/li&gt; &lt;/ul&gt; &lt;/td&gt; &lt;/tr&gt;
     * &lt;tr&gt; &lt;td&gt;&lt;code&gt;STOP_LOSS_LIMIT&lt;/code&gt;&lt;/td&gt; &lt;td&gt;
     * &lt;ul&gt; &lt;li&gt;&lt;code&gt;timeInForce&lt;/code&gt;&lt;/li&gt;
     * &lt;li&gt;&lt;code&gt;price&lt;/code&gt;&lt;/li&gt;
     * &lt;li&gt;&lt;code&gt;quantity&lt;/code&gt;&lt;/li&gt;
     * &lt;li&gt;&lt;code&gt;stopPrice&lt;/code&gt; or
     * &lt;code&gt;trailingDelta&lt;/code&gt;&lt;/li&gt; &lt;/ul&gt; &lt;/td&gt; &lt;/tr&gt;
     * &lt;tr&gt; &lt;td&gt;&lt;code&gt;TAKE_PROFIT&lt;/code&gt;&lt;/td&gt; &lt;td&gt; &lt;ul&gt;
     * &lt;li&gt;&lt;code&gt;quantity&lt;/code&gt;&lt;/li&gt;
     * &lt;li&gt;&lt;code&gt;stopPrice&lt;/code&gt; or
     * &lt;code&gt;trailingDelta&lt;/code&gt;&lt;/li&gt; &lt;/ul&gt; &lt;/td&gt; &lt;/tr&gt;
     * &lt;tr&gt; &lt;td&gt;&lt;code&gt;TAKE_PROFIT_LIMIT&lt;/code&gt;&lt;/td&gt; &lt;td&gt;
     * &lt;ul&gt; &lt;li&gt;&lt;code&gt;timeInForce&lt;/code&gt;&lt;/li&gt;
     * &lt;li&gt;&lt;code&gt;price&lt;/code&gt;&lt;/li&gt;
     * &lt;li&gt;&lt;code&gt;quantity&lt;/code&gt;&lt;/li&gt;
     * &lt;li&gt;&lt;code&gt;stopPrice&lt;/code&gt; or
     * &lt;code&gt;trailingDelta&lt;/code&gt;&lt;/li&gt; &lt;/ul&gt; &lt;/td&gt; &lt;/tr&gt;
     * &lt;/tbody&gt; &lt;/table&gt; Supported order types: &lt;table&gt; &lt;thead&gt; &lt;tr&gt;
     * &lt;th&gt;Order &lt;code&gt;type&lt;/code&gt;&lt;/th&gt; &lt;th&gt;Description&lt;/th&gt;
     * &lt;/tr&gt; &lt;/thead&gt; &lt;tbody&gt; &lt;tr&gt;
     * &lt;td&gt;&lt;code&gt;LIMIT&lt;/code&gt;&lt;/td&gt; &lt;td&gt; &lt;p&gt; Buy or sell
     * &lt;code&gt;quantity&lt;/code&gt; at the specified &lt;code&gt;price&lt;/code&gt; or better.
     * &lt;/p&gt; &lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;&lt;code&gt;LIMIT_MAKER&lt;/code&gt;&lt;/td&gt; &lt;td&gt; &lt;p&gt;
     * &lt;code&gt;LIMIT&lt;/code&gt; order that will be rejected if it immediately matches and
     * trades as a taker. &lt;/p&gt; &lt;p&gt; This order type is also known as a POST-ONLY order.
     * &lt;/p&gt; &lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;&lt;code&gt;MARKET&lt;/code&gt;&lt;/td&gt; &lt;td&gt; &lt;p&gt; Buy or sell at the
     * best available market price. &lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;
     * &lt;code&gt;MARKET&lt;/code&gt; order with &lt;code&gt;quantity&lt;/code&gt; parameter
     * specifies the amount of the &lt;em&gt;base asset&lt;/em&gt; you want to buy or sell. Actually
     * executed quantity of the quote asset will be determined by available market liquidity.
     * &lt;/p&gt; &lt;p&gt; E.g., a MARKET BUY order on BTCUSDT for
     * &lt;code&gt;\&quot;quantity\&quot;: \&quot;0.1000\&quot;&lt;/code&gt; specifies that you want
     * to buy 0.1 BTC at the best available price. If there is not enough BTC at the best price,
     * keep buying at the next best price, until either your order is filled, or you run out of
     * USDT, or market runs out of BTC. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;
     * &lt;code&gt;MARKET&lt;/code&gt; order with &lt;code&gt;quoteOrderQty&lt;/code&gt; parameter
     * specifies the amount of the &lt;em&gt;quote asset&lt;/em&gt; you want to spend (when buying)
     * or receive (when selling). Actually executed quantity of the base asset will be determined by
     * available market liquidity. &lt;/p&gt; &lt;p&gt; E.g., a MARKET BUY on BTCUSDT for
     * &lt;code&gt;\&quot;quoteOrderQty\&quot;: \&quot;100.00\&quot;&lt;/code&gt; specifies that you
     * want to buy as much BTC as you can for 100 USDT at the best available price. Similarly, a
     * SELL order will sell as much available BTC as needed for you to receive 100 USDT (before
     * commission). &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;&lt;code&gt;STOP_LOSS&lt;/code&gt;&lt;/td&gt; &lt;td&gt; &lt;p&gt; Execute a
     * &lt;code&gt;MARKET&lt;/code&gt; order for given &lt;code&gt;quantity&lt;/code&gt; when
     * specified conditions are met. &lt;/p&gt; &lt;p&gt; I.e., when
     * &lt;code&gt;stopPrice&lt;/code&gt; is reached, or when &lt;code&gt;trailingDelta&lt;/code&gt;
     * is activated. &lt;/p&gt; &lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;&lt;code&gt;STOP_LOSS_LIMIT&lt;/code&gt;&lt;/td&gt; &lt;td&gt; &lt;p&gt; Place a
     * &lt;code&gt;LIMIT&lt;/code&gt; order with given parameters when specified conditions are met.
     * &lt;/p&gt; &lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;&lt;code&gt;TAKE_PROFIT&lt;/code&gt;&lt;/td&gt; &lt;td&gt; &lt;p&gt; Like
     * &lt;code&gt;STOP_LOSS&lt;/code&gt; but activates when market price moves in the favorable
     * direction. &lt;/p&gt; &lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;&lt;code&gt;TAKE_PROFIT_LIMIT&lt;/code&gt;&lt;/td&gt; &lt;td&gt; &lt;p&gt; Like
     * &lt;code&gt;STOP_LOSS_LIMIT&lt;/code&gt; but activates when market price moves in the
     * favorable direction. &lt;/p&gt; &lt;/td&gt; &lt;/tr&gt; &lt;/tbody&gt; &lt;/table&gt; &lt;a
     * id&#x3D;\&quot;pegged-orders-info\&quot;&gt;&lt;/a&gt; Notes on using parameters for Pegged
     * Orders: * These parameters are allowed for &#x60;LIMIT&#x60;, &#x60;LIMIT_MAKER&#x60;,
     * &#x60;STOP_LOSS_LIMIT&#x60;, &#x60;TAKE_PROFIT_LIMIT&#x60; orders. * If
     * &#x60;pegPriceType&#x60; is specified, &#x60;price&#x60; becomes optional. Otherwise, it is
     * still mandatory. * &#x60;pegPriceType&#x3D;PRIMARY_PEG&#x60; means the primary peg, that is
     * the best price on the same side of the order book as your order. *
     * &#x60;pegPriceType&#x3D;MARKET_PEG&#x60; means the market peg, that is the best price on the
     * opposite side of the order book from your order. * Use &#x60;pegOffsetType&#x60; and
     * &#x60;pegOffsetValue&#x60; to request a price level other than the best one. These parameters
     * must be specified together. &lt;a id&#x3D;\&quot;timeInForce\&quot;&gt;&lt;/a&gt; Available
     * &#x60;timeInForce&#x60; options, setting how long the order should be active before
     * expiration: TIF | Description ----- | -------------- &#x60;GTC&#x60; | **Good &#39;til
     * Canceled** – the order will remain on the book until you cancel it, or the order is
     * completely filled. &#x60;IOC&#x60; | **Immediate or Cancel** – the order will be filled for
     * as much as possible, the unfilled quantity immediately expires. &#x60;FOK&#x60; | **Fill or
     * Kill** – the order will expire unless it cannot be immediately filled for the entire
     * quantity. Notes: * &#x60;newClientOrderId&#x60; specifies &#x60;clientOrderId&#x60; value for
     * the order. A new order with the same &#x60;clientOrderId&#x60; is accepted only when the
     * previous one is filled or expired. * Any &#x60;LIMIT&#x60; or &#x60;LIMIT_MAKER&#x60; order
     * can be made into an iceberg order by specifying the &#x60;icebergQty&#x60;. An order with an
     * &#x60;icebergQty&#x60; must have &#x60;timeInForce&#x60; set to &#x60;GTC&#x60;. * Trigger
     * order price rules for &#x60;STOP_LOSS&#x60;/&#x60;TAKE_PROFIT&#x60; orders: *
     * &#x60;stopPrice&#x60; must be above market price: &#x60;STOP_LOSS BUY&#x60;,
     * &#x60;TAKE_PROFIT SELL&#x60; * &#x60;stopPrice&#x60; must be below market price:
     * &#x60;STOP_LOSS SELL&#x60;, &#x60;TAKE_PROFIT BUY&#x60; * &#x60;MARKET&#x60; orders using
     * &#x60;quoteOrderQty&#x60; follow [&#x60;LOT_SIZE&#x60;](/products/spot/filters#lot_size)
     * filter rules. The order will execute a quantity that has notional value as close as possible
     * to requested &#x60;quoteOrderQty&#x60;.
     */
    public void orderPlaceExampleAsync() {
        OrderPlaceRequest orderPlaceRequest = new OrderPlaceRequest();
        orderPlaceRequest.symbol("BNBUSDT");
        orderPlaceRequest.side(Side.BUY);
        orderPlaceRequest.type(OrderType.MARKET);
        CompletableFuture<OrderPlaceResponse> future = getApi().orderPlace(orderPlaceRequest);
        future.handle(
                (response, error) -> {
                    if (error != null) {
                        System.err.println(error);
                    }
                    System.out.println(response);
                    return response;
                });
    }

    /**
     * Place new order (TRADE)
     *
     * <p>Send in a new order. This adds 1 order to the &#x60;EXCHANGE_MAX_ORDERS&#x60; filter and
     * the &#x60;MAX_NUM_ORDERS&#x60; filter. Weight(IP): 1 Unfilled Order Count: 1 Security Type:
     * TRADE Notes: **Data Source:** Matching Engine &lt;a
     * id&#x3D;\&quot;order-type\&quot;&gt;Certain parameters (*)&lt;/a&gt; become mandatory based
     * on the order &#x60;type&#x60;: &lt;table&gt; &lt;thead&gt; &lt;tr&gt; &lt;th&gt;Order
     * &lt;code&gt;type&lt;/code&gt;&lt;/th&gt; &lt;th&gt;Mandatory parameters&lt;/th&gt;
     * &lt;/tr&gt; &lt;/thead&gt; &lt;tbody&gt; &lt;tr&gt;
     * &lt;td&gt;&lt;code&gt;LIMIT&lt;/code&gt;&lt;/td&gt; &lt;td&gt; &lt;ul&gt;
     * &lt;li&gt;&lt;code&gt;timeInForce&lt;/code&gt;&lt;/li&gt;
     * &lt;li&gt;&lt;code&gt;price&lt;/code&gt;&lt;/li&gt;
     * &lt;li&gt;&lt;code&gt;quantity&lt;/code&gt;&lt;/li&gt; &lt;/ul&gt; &lt;/td&gt; &lt;/tr&gt;
     * &lt;tr&gt; &lt;td&gt;&lt;code&gt;LIMIT_MAKER&lt;/code&gt;&lt;/td&gt; &lt;td&gt; &lt;ul&gt;
     * &lt;li&gt;&lt;code&gt;price&lt;/code&gt;&lt;/li&gt;
     * &lt;li&gt;&lt;code&gt;quantity&lt;/code&gt;&lt;/li&gt; &lt;/ul&gt; &lt;/td&gt; &lt;/tr&gt;
     * &lt;tr&gt; &lt;td&gt;&lt;code&gt;MARKET&lt;/code&gt;&lt;/td&gt; &lt;td&gt; &lt;ul&gt;
     * &lt;li&gt;&lt;code&gt;quantity&lt;/code&gt; or
     * &lt;code&gt;quoteOrderQty&lt;/code&gt;&lt;/li&gt; &lt;/ul&gt; &lt;/td&gt; &lt;/tr&gt;
     * &lt;tr&gt; &lt;td&gt;&lt;code&gt;STOP_LOSS&lt;/code&gt;&lt;/td&gt; &lt;td&gt; &lt;ul&gt;
     * &lt;li&gt;&lt;code&gt;quantity&lt;/code&gt;&lt;/li&gt;
     * &lt;li&gt;&lt;code&gt;stopPrice&lt;/code&gt; or
     * &lt;code&gt;trailingDelta&lt;/code&gt;&lt;/li&gt; &lt;/ul&gt; &lt;/td&gt; &lt;/tr&gt;
     * &lt;tr&gt; &lt;td&gt;&lt;code&gt;STOP_LOSS_LIMIT&lt;/code&gt;&lt;/td&gt; &lt;td&gt;
     * &lt;ul&gt; &lt;li&gt;&lt;code&gt;timeInForce&lt;/code&gt;&lt;/li&gt;
     * &lt;li&gt;&lt;code&gt;price&lt;/code&gt;&lt;/li&gt;
     * &lt;li&gt;&lt;code&gt;quantity&lt;/code&gt;&lt;/li&gt;
     * &lt;li&gt;&lt;code&gt;stopPrice&lt;/code&gt; or
     * &lt;code&gt;trailingDelta&lt;/code&gt;&lt;/li&gt; &lt;/ul&gt; &lt;/td&gt; &lt;/tr&gt;
     * &lt;tr&gt; &lt;td&gt;&lt;code&gt;TAKE_PROFIT&lt;/code&gt;&lt;/td&gt; &lt;td&gt; &lt;ul&gt;
     * &lt;li&gt;&lt;code&gt;quantity&lt;/code&gt;&lt;/li&gt;
     * &lt;li&gt;&lt;code&gt;stopPrice&lt;/code&gt; or
     * &lt;code&gt;trailingDelta&lt;/code&gt;&lt;/li&gt; &lt;/ul&gt; &lt;/td&gt; &lt;/tr&gt;
     * &lt;tr&gt; &lt;td&gt;&lt;code&gt;TAKE_PROFIT_LIMIT&lt;/code&gt;&lt;/td&gt; &lt;td&gt;
     * &lt;ul&gt; &lt;li&gt;&lt;code&gt;timeInForce&lt;/code&gt;&lt;/li&gt;
     * &lt;li&gt;&lt;code&gt;price&lt;/code&gt;&lt;/li&gt;
     * &lt;li&gt;&lt;code&gt;quantity&lt;/code&gt;&lt;/li&gt;
     * &lt;li&gt;&lt;code&gt;stopPrice&lt;/code&gt; or
     * &lt;code&gt;trailingDelta&lt;/code&gt;&lt;/li&gt; &lt;/ul&gt; &lt;/td&gt; &lt;/tr&gt;
     * &lt;/tbody&gt; &lt;/table&gt; Supported order types: &lt;table&gt; &lt;thead&gt; &lt;tr&gt;
     * &lt;th&gt;Order &lt;code&gt;type&lt;/code&gt;&lt;/th&gt; &lt;th&gt;Description&lt;/th&gt;
     * &lt;/tr&gt; &lt;/thead&gt; &lt;tbody&gt; &lt;tr&gt;
     * &lt;td&gt;&lt;code&gt;LIMIT&lt;/code&gt;&lt;/td&gt; &lt;td&gt; &lt;p&gt; Buy or sell
     * &lt;code&gt;quantity&lt;/code&gt; at the specified &lt;code&gt;price&lt;/code&gt; or better.
     * &lt;/p&gt; &lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;&lt;code&gt;LIMIT_MAKER&lt;/code&gt;&lt;/td&gt; &lt;td&gt; &lt;p&gt;
     * &lt;code&gt;LIMIT&lt;/code&gt; order that will be rejected if it immediately matches and
     * trades as a taker. &lt;/p&gt; &lt;p&gt; This order type is also known as a POST-ONLY order.
     * &lt;/p&gt; &lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;&lt;code&gt;MARKET&lt;/code&gt;&lt;/td&gt; &lt;td&gt; &lt;p&gt; Buy or sell at the
     * best available market price. &lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;
     * &lt;code&gt;MARKET&lt;/code&gt; order with &lt;code&gt;quantity&lt;/code&gt; parameter
     * specifies the amount of the &lt;em&gt;base asset&lt;/em&gt; you want to buy or sell. Actually
     * executed quantity of the quote asset will be determined by available market liquidity.
     * &lt;/p&gt; &lt;p&gt; E.g., a MARKET BUY order on BTCUSDT for
     * &lt;code&gt;\&quot;quantity\&quot;: \&quot;0.1000\&quot;&lt;/code&gt; specifies that you want
     * to buy 0.1 BTC at the best available price. If there is not enough BTC at the best price,
     * keep buying at the next best price, until either your order is filled, or you run out of
     * USDT, or market runs out of BTC. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;
     * &lt;code&gt;MARKET&lt;/code&gt; order with &lt;code&gt;quoteOrderQty&lt;/code&gt; parameter
     * specifies the amount of the &lt;em&gt;quote asset&lt;/em&gt; you want to spend (when buying)
     * or receive (when selling). Actually executed quantity of the base asset will be determined by
     * available market liquidity. &lt;/p&gt; &lt;p&gt; E.g., a MARKET BUY on BTCUSDT for
     * &lt;code&gt;\&quot;quoteOrderQty\&quot;: \&quot;100.00\&quot;&lt;/code&gt; specifies that you
     * want to buy as much BTC as you can for 100 USDT at the best available price. Similarly, a
     * SELL order will sell as much available BTC as needed for you to receive 100 USDT (before
     * commission). &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;&lt;code&gt;STOP_LOSS&lt;/code&gt;&lt;/td&gt; &lt;td&gt; &lt;p&gt; Execute a
     * &lt;code&gt;MARKET&lt;/code&gt; order for given &lt;code&gt;quantity&lt;/code&gt; when
     * specified conditions are met. &lt;/p&gt; &lt;p&gt; I.e., when
     * &lt;code&gt;stopPrice&lt;/code&gt; is reached, or when &lt;code&gt;trailingDelta&lt;/code&gt;
     * is activated. &lt;/p&gt; &lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;&lt;code&gt;STOP_LOSS_LIMIT&lt;/code&gt;&lt;/td&gt; &lt;td&gt; &lt;p&gt; Place a
     * &lt;code&gt;LIMIT&lt;/code&gt; order with given parameters when specified conditions are met.
     * &lt;/p&gt; &lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;&lt;code&gt;TAKE_PROFIT&lt;/code&gt;&lt;/td&gt; &lt;td&gt; &lt;p&gt; Like
     * &lt;code&gt;STOP_LOSS&lt;/code&gt; but activates when market price moves in the favorable
     * direction. &lt;/p&gt; &lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;&lt;code&gt;TAKE_PROFIT_LIMIT&lt;/code&gt;&lt;/td&gt; &lt;td&gt; &lt;p&gt; Like
     * &lt;code&gt;STOP_LOSS_LIMIT&lt;/code&gt; but activates when market price moves in the
     * favorable direction. &lt;/p&gt; &lt;/td&gt; &lt;/tr&gt; &lt;/tbody&gt; &lt;/table&gt; &lt;a
     * id&#x3D;\&quot;pegged-orders-info\&quot;&gt;&lt;/a&gt; Notes on using parameters for Pegged
     * Orders: * These parameters are allowed for &#x60;LIMIT&#x60;, &#x60;LIMIT_MAKER&#x60;,
     * &#x60;STOP_LOSS_LIMIT&#x60;, &#x60;TAKE_PROFIT_LIMIT&#x60; orders. * If
     * &#x60;pegPriceType&#x60; is specified, &#x60;price&#x60; becomes optional. Otherwise, it is
     * still mandatory. * &#x60;pegPriceType&#x3D;PRIMARY_PEG&#x60; means the primary peg, that is
     * the best price on the same side of the order book as your order. *
     * &#x60;pegPriceType&#x3D;MARKET_PEG&#x60; means the market peg, that is the best price on the
     * opposite side of the order book from your order. * Use &#x60;pegOffsetType&#x60; and
     * &#x60;pegOffsetValue&#x60; to request a price level other than the best one. These parameters
     * must be specified together. &lt;a id&#x3D;\&quot;timeInForce\&quot;&gt;&lt;/a&gt; Available
     * &#x60;timeInForce&#x60; options, setting how long the order should be active before
     * expiration: TIF | Description ----- | -------------- &#x60;GTC&#x60; | **Good &#39;til
     * Canceled** – the order will remain on the book until you cancel it, or the order is
     * completely filled. &#x60;IOC&#x60; | **Immediate or Cancel** – the order will be filled for
     * as much as possible, the unfilled quantity immediately expires. &#x60;FOK&#x60; | **Fill or
     * Kill** – the order will expire unless it cannot be immediately filled for the entire
     * quantity. Notes: * &#x60;newClientOrderId&#x60; specifies &#x60;clientOrderId&#x60; value for
     * the order. A new order with the same &#x60;clientOrderId&#x60; is accepted only when the
     * previous one is filled or expired. * Any &#x60;LIMIT&#x60; or &#x60;LIMIT_MAKER&#x60; order
     * can be made into an iceberg order by specifying the &#x60;icebergQty&#x60;. An order with an
     * &#x60;icebergQty&#x60; must have &#x60;timeInForce&#x60; set to &#x60;GTC&#x60;. * Trigger
     * order price rules for &#x60;STOP_LOSS&#x60;/&#x60;TAKE_PROFIT&#x60; orders: *
     * &#x60;stopPrice&#x60; must be above market price: &#x60;STOP_LOSS BUY&#x60;,
     * &#x60;TAKE_PROFIT SELL&#x60; * &#x60;stopPrice&#x60; must be below market price:
     * &#x60;STOP_LOSS SELL&#x60;, &#x60;TAKE_PROFIT BUY&#x60; * &#x60;MARKET&#x60; orders using
     * &#x60;quoteOrderQty&#x60; follow [&#x60;LOT_SIZE&#x60;](/products/spot/filters#lot_size)
     * filter rules. The order will execute a quantity that has notional value as close as possible
     * to requested &#x60;quoteOrderQty&#x60;.
     */
    public void orderPlaceExampleSync() {
        OrderPlaceRequest orderPlaceRequest = new OrderPlaceRequest();
        orderPlaceRequest.symbol("BNBUSDT");
        orderPlaceRequest.side(Side.BUY);
        orderPlaceRequest.type(OrderType.MARKET);
        CompletableFuture<OrderPlaceResponse> future = getApi().orderPlace(orderPlaceRequest);
        OrderPlaceResponse response = future.join();
        System.out.println(response);
    }
}
