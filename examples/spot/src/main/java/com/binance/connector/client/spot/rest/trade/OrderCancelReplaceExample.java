package com.binance.connector.client.spot.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.CancelReplaceMode;
import com.binance.connector.client.spot.rest.model.OrderCancelReplaceRequest;
import com.binance.connector.client.spot.rest.model.OrderCancelReplaceResponse;
import com.binance.connector.client.spot.rest.model.OrderType;
import com.binance.connector.client.spot.rest.model.Side;
import java.io.IOException;

/** API examples for TradeApi */
public class OrderCancelReplaceExample {
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
     * Cancel an Existing Order and Send a New Order (TRADE)
     *
     * <p>- Cancels an existing order and places a new order on the same symbol. - Filters and Order
     * Count are evaluated before the processing of the cancellation and order placement occurs. - A
     * new order that was not attempted (i.e. when &#x60;newOrderResult: NOT_ATTEMPTED&#x60;), will
     * still increase the unfilled order count by 1. - You can only cancel an individual order from
     * an orderList using this endpoint, but the result is the same as canceling the entire
     * orderList. Weight(IP): 1 Unfilled Order Count: 1 Security Type: TRADE Notes: **Data Source:**
     * Matching Engine Similar to &#x60;POST /api/v3/order&#x60;, additional mandatory parameters
     * are determined by &#x60;type&#x60;. Response format varies depending on whether the
     * processing of the message succeeded, partially succeeded, or failed. &lt;table&gt;
     * &lt;thead&gt; &lt;tr&gt; &lt;th colspan&#x3D;3 align&#x3D;left&gt;Request&lt;/th&gt; &lt;th
     * colspan&#x3D;3 align&#x3D;left&gt;Response&lt;/th&gt; &lt;/tr&gt; &lt;tr&gt;
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
     * align&#x3D;right&gt;&lt;code&gt;N/A&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;400&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td&gt;✅
     * &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;
     * &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt; &lt;td&gt;❌
     * &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt; &lt;td
     * align&#x3D;right&gt;&lt;code&gt;409&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;/tbody&gt;
     * &lt;/table&gt; **Notes:** - The performance for canceling an order (single cancel or as part
     * of a cancel-replace) is always better when only &#x60;orderId&#x60; is sent. Sending
     * &#x60;origClientOrderId&#x60; or both &#x60;orderId&#x60; + &#x60;origClientOrderId&#x60;
     * will be slower.
     *
     * @throws ApiException if the Api call fails
     */
    public void orderCancelReplaceExample() throws ApiException, IOException {
        OrderCancelReplaceRequest orderCancelReplaceRequest = new OrderCancelReplaceRequest();
        orderCancelReplaceRequest.symbol("BNBUSDT");
        orderCancelReplaceRequest.side(Side.BUY);
        orderCancelReplaceRequest.type(OrderType.MARKET);
        orderCancelReplaceRequest.cancelReplaceMode(CancelReplaceMode.STOP_ON_FAILURE);
        ApiResponse<OrderCancelReplaceResponse> response =
                getApi().orderCancelReplace(orderCancelReplaceRequest);
        System.out.println(response.getData());
    }
}
