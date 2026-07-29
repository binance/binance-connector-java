package com.binance.connector.client.spot.websocket.api.trade;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.CancelReplaceMode;
import com.binance.connector.client.spot.websocket.api.model.OrderCancelReplaceRequest;
import com.binance.connector.client.spot.websocket.api.model.OrderCancelReplaceResponse;
import com.binance.connector.client.spot.websocket.api.model.OrderType;
import com.binance.connector.client.spot.websocket.api.model.Side;
import java.util.concurrent.CompletableFuture;

/** API examples for TradeApi */
public class OrderCancelReplaceExample {
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
     * Cancel and replace order (TRADE)
     *
     * <p>* Cancel an existing order and immediately place a new order instead of the canceled one.
     * * A new order that was not attempted (i.e. when &#x60;newOrderResult: NOT_ATTEMPTED&#x60;),
     * will still increase the unfilled order count by 1. * You can only cancel an individual order
     * from an orderList using this method, but the result is the same as canceling the entire
     * orderList.not attempted (i.e. when &#x60;newOrderResult: NOT_ATTEMPTED&#x60;), will still
     * increase the unfilled order count by 1. Weight(IP): 1 Unfilled Order Count: 1 Security Type:
     * TRADE Notes: **Data Source:** Matching Engine Similar to the
     * [&#x60;order.place&#x60;](#order-place) request, additional mandatory parameters (*) are
     * determined by the new order &#x60;type&#x60;. Available &#x60;cancelReplaceMode&#x60;
     * options: * &#x60;STOP_ON_FAILURE&#x60; – if cancellation request fails, new order placement
     * will not be attempted. * &#x60;ALLOW_FAILURE&#x60; – new order placement will be attempted
     * even if the cancel request fails. &lt;table&gt; &lt;thead&gt; &lt;tr&gt; &lt;th
     * colspan&#x3D;3 align&#x3D;left&gt;Request&lt;/th&gt; &lt;th colspan&#x3D;3
     * align&#x3D;left&gt;Response&lt;/th&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;th&gt;&lt;code&gt;cancelReplaceMode&lt;/code&gt;&lt;/th&gt;
     * &lt;th&gt;&lt;code&gt;orderRateLimitExceededMode&lt;/code&gt;&lt;/th&gt; &lt;th&gt;Unfilled
     * Order Count&lt;/th&gt; &lt;th&gt;&lt;code&gt;cancelResult&lt;/code&gt;&lt;/th&gt;
     * &lt;th&gt;&lt;code&gt;newOrderResult&lt;/code&gt;&lt;/th&gt;
     * &lt;th&gt;&lt;code&gt;status&lt;/code&gt;&lt;/th&gt; &lt;/tr&gt; &lt;/thead&gt; &lt;tbody&gt;
     * &lt;tr&gt; &lt;td
     * rowspan&#x3D;\&quot;11\&quot;&gt;&lt;code&gt;STOP_ON_FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * rowspan&#x3D;\&quot;6\&quot;&gt;&lt;code&gt;DO_NOTHING&lt;/code&gt;&lt;/td&gt; &lt;td
     * rowspan&#x3D;\&quot;3\&quot;&gt;Within Limits&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;200&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;➖
     * &lt;code&gt;NOT_ATTEMPTED&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;400&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;409&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td
     * rowspan&#x3D;\&quot;3\&quot;&gt;Exceeds Limits&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;
     * &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;➖
     * &lt;code&gt;NOT_ATTEMPTED&lt;/code&gt;&lt;/td&gt; &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;
     * &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;
     * &lt;/tr&gt; &lt;tr&gt; &lt;td
     * rowspan&#x3D;\&quot;5\&quot;&gt;&lt;code&gt;CANCEL_ONLY&lt;/code&gt;&lt;/td&gt; &lt;td
     * rowspan&#x3D;\&quot;3\&quot;&gt;Within Limits&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;200&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;➖
     * &lt;code&gt;NOT_ATTEMPTED&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;400&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;409&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td
     * rowspan&#x3D;\&quot;2\&quot;&gt;Exceeds Limits&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;➖
     * &lt;code&gt;NOT_ATTEMPTED&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;429&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;429&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td
     * rowspan&#x3D;\&quot;16\&quot;&gt;&lt;code&gt;ALLOW_FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * rowspan&#x3D;\&quot;8\&quot;&gt;&lt;code&gt;DO_NOTHING&lt;/code&gt;&lt;/td&gt; &lt;td
     * rowspan&#x3D;\&quot;4\&quot;&gt;Within Limits&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;200&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;400&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;409&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;409&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td
     * rowspan&#x3D;\&quot;4\&quot;&gt;Exceeds Limits&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;
     * &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;
     * &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;
     * &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;
     * &lt;/tr&gt; &lt;tr&gt; &lt;td
     * rowspan&#x3D;\&quot;8\&quot;&gt;&lt;CODE&gt;CANCEL_ONLY&lt;/CODE&gt;&lt;/td&gt; &lt;td
     * rowspan&#x3D;\&quot;4\&quot;&gt;Within Limits&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;200&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;400&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;409&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;409&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td
     * rowspan&#x3D;\&quot;4\&quot;&gt;Exceeds Limits&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;200&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;400&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;
     * &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;409&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;/tbody&gt;
     * &lt;/table&gt; Notes: * If both &#x60;cancelOrderId&#x60; and
     * &#x60;cancelOrigClientOrderId&#x60; parameters are provided, the &#x60;cancelOrderId&#x60; is
     * searched first, then the &#x60;cancelOrigClientOrderId&#x60; from that result is checked
     * against that order. If both conditions are not met the request will be rejected. *
     * &#x60;cancelNewClientOrderId&#x60; will replace &#x60;clientOrderId&#x60; of the canceled
     * order, freeing it up for new orders. * &#x60;newClientOrderId&#x60; specifies
     * &#x60;clientOrderId&#x60; value for the placed order. A new order with the same
     * &#x60;clientOrderId&#x60; is accepted only when the previous one is filled or expired. The
     * new order can reuse old &#x60;clientOrderId&#x60; of the canceled order. * This
     * cancel-replace operation is **not transactional**. If one operation succeeds but the other
     * one fails, the successful operation is still executed. For example, in
     * &#x60;STOP_ON_FAILURE&#x60; mode, if the new order placement fails, the old order is still
     * canceled. * Filters and order count limits are evaluated before cancellation and order
     * placement occurs. * If new order placement is not attempted, your order count is still
     * incremented. * Like [&#x60;order.cancel&#x60;](#order-cancel), if you cancel an individual
     * order from an order list, the entire order list is canceled. * The performance for canceling
     * an order (single cancel or as part of a cancel-replace) is always better when only
     * &#x60;orderId&#x60; is sent. Sending &#x60;origClientOrderId&#x60; or both
     * &#x60;orderId&#x60; + &#x60;origClientOrderId&#x60; will be slower.
     */
    public void orderCancelReplaceExampleAsync() {
        OrderCancelReplaceRequest orderCancelReplaceRequest = new OrderCancelReplaceRequest();
        orderCancelReplaceRequest.symbol("BNBUSDT");
        orderCancelReplaceRequest.cancelReplaceMode(CancelReplaceMode.STOP_ON_FAILURE);
        orderCancelReplaceRequest.side(Side.BUY);
        orderCancelReplaceRequest.type(OrderType.MARKET);
        CompletableFuture<OrderCancelReplaceResponse> future =
                getApi().orderCancelReplace(orderCancelReplaceRequest);
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
     * Cancel and replace order (TRADE)
     *
     * <p>* Cancel an existing order and immediately place a new order instead of the canceled one.
     * * A new order that was not attempted (i.e. when &#x60;newOrderResult: NOT_ATTEMPTED&#x60;),
     * will still increase the unfilled order count by 1. * You can only cancel an individual order
     * from an orderList using this method, but the result is the same as canceling the entire
     * orderList.not attempted (i.e. when &#x60;newOrderResult: NOT_ATTEMPTED&#x60;), will still
     * increase the unfilled order count by 1. Weight(IP): 1 Unfilled Order Count: 1 Security Type:
     * TRADE Notes: **Data Source:** Matching Engine Similar to the
     * [&#x60;order.place&#x60;](#order-place) request, additional mandatory parameters (*) are
     * determined by the new order &#x60;type&#x60;. Available &#x60;cancelReplaceMode&#x60;
     * options: * &#x60;STOP_ON_FAILURE&#x60; – if cancellation request fails, new order placement
     * will not be attempted. * &#x60;ALLOW_FAILURE&#x60; – new order placement will be attempted
     * even if the cancel request fails. &lt;table&gt; &lt;thead&gt; &lt;tr&gt; &lt;th
     * colspan&#x3D;3 align&#x3D;left&gt;Request&lt;/th&gt; &lt;th colspan&#x3D;3
     * align&#x3D;left&gt;Response&lt;/th&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;th&gt;&lt;code&gt;cancelReplaceMode&lt;/code&gt;&lt;/th&gt;
     * &lt;th&gt;&lt;code&gt;orderRateLimitExceededMode&lt;/code&gt;&lt;/th&gt; &lt;th&gt;Unfilled
     * Order Count&lt;/th&gt; &lt;th&gt;&lt;code&gt;cancelResult&lt;/code&gt;&lt;/th&gt;
     * &lt;th&gt;&lt;code&gt;newOrderResult&lt;/code&gt;&lt;/th&gt;
     * &lt;th&gt;&lt;code&gt;status&lt;/code&gt;&lt;/th&gt; &lt;/tr&gt; &lt;/thead&gt; &lt;tbody&gt;
     * &lt;tr&gt; &lt;td
     * rowspan&#x3D;\&quot;11\&quot;&gt;&lt;code&gt;STOP_ON_FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * rowspan&#x3D;\&quot;6\&quot;&gt;&lt;code&gt;DO_NOTHING&lt;/code&gt;&lt;/td&gt; &lt;td
     * rowspan&#x3D;\&quot;3\&quot;&gt;Within Limits&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;200&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;➖
     * &lt;code&gt;NOT_ATTEMPTED&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;400&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;409&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td
     * rowspan&#x3D;\&quot;3\&quot;&gt;Exceeds Limits&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;
     * &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;➖
     * &lt;code&gt;NOT_ATTEMPTED&lt;/code&gt;&lt;/td&gt; &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;
     * &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;
     * &lt;/tr&gt; &lt;tr&gt; &lt;td
     * rowspan&#x3D;\&quot;5\&quot;&gt;&lt;code&gt;CANCEL_ONLY&lt;/code&gt;&lt;/td&gt; &lt;td
     * rowspan&#x3D;\&quot;3\&quot;&gt;Within Limits&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;200&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;➖
     * &lt;code&gt;NOT_ATTEMPTED&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;400&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;409&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td
     * rowspan&#x3D;\&quot;2\&quot;&gt;Exceeds Limits&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;➖
     * &lt;code&gt;NOT_ATTEMPTED&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;429&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;429&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td
     * rowspan&#x3D;\&quot;16\&quot;&gt;&lt;code&gt;ALLOW_FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * rowspan&#x3D;\&quot;8\&quot;&gt;&lt;code&gt;DO_NOTHING&lt;/code&gt;&lt;/td&gt; &lt;td
     * rowspan&#x3D;\&quot;4\&quot;&gt;Within Limits&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;200&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;400&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;409&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;409&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td
     * rowspan&#x3D;\&quot;4\&quot;&gt;Exceeds Limits&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;
     * &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;
     * &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;
     * &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;
     * &lt;/tr&gt; &lt;tr&gt; &lt;td
     * rowspan&#x3D;\&quot;8\&quot;&gt;&lt;CODE&gt;CANCEL_ONLY&lt;/CODE&gt;&lt;/td&gt; &lt;td
     * rowspan&#x3D;\&quot;4\&quot;&gt;Within Limits&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;200&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;400&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;409&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;409&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td
     * rowspan&#x3D;\&quot;4\&quot;&gt;Exceeds Limits&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;200&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;400&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;
     * &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;409&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;/tbody&gt;
     * &lt;/table&gt; Notes: * If both &#x60;cancelOrderId&#x60; and
     * &#x60;cancelOrigClientOrderId&#x60; parameters are provided, the &#x60;cancelOrderId&#x60; is
     * searched first, then the &#x60;cancelOrigClientOrderId&#x60; from that result is checked
     * against that order. If both conditions are not met the request will be rejected. *
     * &#x60;cancelNewClientOrderId&#x60; will replace &#x60;clientOrderId&#x60; of the canceled
     * order, freeing it up for new orders. * &#x60;newClientOrderId&#x60; specifies
     * &#x60;clientOrderId&#x60; value for the placed order. A new order with the same
     * &#x60;clientOrderId&#x60; is accepted only when the previous one is filled or expired. The
     * new order can reuse old &#x60;clientOrderId&#x60; of the canceled order. * This
     * cancel-replace operation is **not transactional**. If one operation succeeds but the other
     * one fails, the successful operation is still executed. For example, in
     * &#x60;STOP_ON_FAILURE&#x60; mode, if the new order placement fails, the old order is still
     * canceled. * Filters and order count limits are evaluated before cancellation and order
     * placement occurs. * If new order placement is not attempted, your order count is still
     * incremented. * Like [&#x60;order.cancel&#x60;](#order-cancel), if you cancel an individual
     * order from an order list, the entire order list is canceled. * The performance for canceling
     * an order (single cancel or as part of a cancel-replace) is always better when only
     * &#x60;orderId&#x60; is sent. Sending &#x60;origClientOrderId&#x60; or both
     * &#x60;orderId&#x60; + &#x60;origClientOrderId&#x60; will be slower.
     */
    public void orderCancelReplaceExampleSync() {
        OrderCancelReplaceRequest orderCancelReplaceRequest = new OrderCancelReplaceRequest();
        orderCancelReplaceRequest.symbol("BNBUSDT");
        orderCancelReplaceRequest.cancelReplaceMode(CancelReplaceMode.STOP_ON_FAILURE);
        orderCancelReplaceRequest.side(Side.BUY);
        orderCancelReplaceRequest.type(OrderType.MARKET);
        CompletableFuture<OrderCancelReplaceResponse> future =
                getApi().orderCancelReplace(orderCancelReplaceRequest);
        OrderCancelReplaceResponse response = future.join();
        System.out.println(response);
    }
}
