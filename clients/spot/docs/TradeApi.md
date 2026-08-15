# TradeApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**openOrdersCancelAll**](TradeApi.md#openOrdersCancelAll) | **POST** /openOrders.cancelAll | Cancel open orders (TRADE) |
| [**orderAmendKeepPriority**](TradeApi.md#orderAmendKeepPriority) | **POST** /order.amend.keepPriority | Order Amend Keep Priority (TRADE) |
| [**orderCancel**](TradeApi.md#orderCancel) | **POST** /order.cancel | Cancel order (TRADE) |
| [**orderCancelReplace**](TradeApi.md#orderCancelReplace) | **POST** /order.cancelReplace | Cancel and replace order (TRADE) |
| [**orderListCancel**](TradeApi.md#orderListCancel) | **POST** /orderList.cancel | Cancel Order list (TRADE) |
| [**orderListPlace**](TradeApi.md#orderListPlace) | **POST** /orderList.place | Place new OCO - Deprecated (TRADE) |
| [**orderListPlaceOco**](TradeApi.md#orderListPlaceOco) | **POST** /orderList.place.oco | Place new Order list - OCO (TRADE) |
| [**orderListPlaceOpo**](TradeApi.md#orderListPlaceOpo) | **POST** /orderList.place.opo | OPO (TRADE) |
| [**orderListPlaceOpoco**](TradeApi.md#orderListPlaceOpoco) | **POST** /orderList.place.opoco | OPOCO (TRADE) |
| [**orderListPlaceOto**](TradeApi.md#orderListPlaceOto) | **POST** /orderList.place.oto | Place new Order list - OTO (TRADE) |
| [**orderListPlaceOtoco**](TradeApi.md#orderListPlaceOtoco) | **POST** /orderList.place.otoco | Place new Order list - OTOCO (TRADE) |
| [**orderPlace**](TradeApi.md#orderPlace) | **POST** /order.place | Place new order (TRADE) |
| [**orderTest**](TradeApi.md#orderTest) | **POST** /order.test | Test new order (TRADE) |
| [**sorOrderPlace**](TradeApi.md#sorOrderPlace) | **POST** /sor.order.place | Place new order using SOR (TRADE) |
| [**sorOrderTest**](TradeApi.md#sorOrderTest) | **POST** /sor.order.test | Test new order using SOR (TRADE) |


<a id="openOrdersCancelAll"></a>
# **openOrdersCancelAll**
> OpenOrdersCancelAllResponse openOrdersCancelAll(openOrdersCancelAllRequest)

Cancel open orders (TRADE)

Cancel all open orders on a symbol. This includes orders that are part of an order list.  Weight(IP): 1  Security Type: TRADE  Notes: **Data Source:** Matching Engine

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TradeApi apiInstance = new TradeApi(defaultClient);
    OpenOrdersCancelAllRequest openOrdersCancelAllRequest = new OpenOrdersCancelAllRequest(); // OpenOrdersCancelAllRequest | 
    try {
      OpenOrdersCancelAllResponse result = apiInstance.openOrdersCancelAll(openOrdersCancelAllRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#openOrdersCancelAll");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **openOrdersCancelAllRequest** | [**OpenOrdersCancelAllRequest**](OpenOrdersCancelAllRequest.md)|  | |

### Return type

[**OpenOrdersCancelAllResponse**](OpenOrdersCancelAllResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cancel open orders |  -  |

<a id="orderAmendKeepPriority"></a>
# **orderAmendKeepPriority**
> OrderAmendKeepPriorityResponse orderAmendKeepPriority(orderAmendKeepPriorityRequest)

Order Amend Keep Priority (TRADE)

Reduce the quantity of an existing open order.  This adds 0 orders to the &#x60;EXCHANGE_MAX_ORDERS&#x60; filter and the &#x60;MAX_NUM_ORDERS&#x60; filter.  Read [Order Amend Keep Priority FAQ](/products/spot/faqs/order_amend_keep_priority) to learn more.  Weight(IP): 4  Unfilled Order Count: 0  Security Type: TRADE  Notes: **Data Source:** Matching Engine

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TradeApi apiInstance = new TradeApi(defaultClient);
    OrderAmendKeepPriorityRequest orderAmendKeepPriorityRequest = new OrderAmendKeepPriorityRequest(); // OrderAmendKeepPriorityRequest | 
    try {
      OrderAmendKeepPriorityResponse result = apiInstance.orderAmendKeepPriority(orderAmendKeepPriorityRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#orderAmendKeepPriority");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderAmendKeepPriorityRequest** | [**OrderAmendKeepPriorityRequest**](OrderAmendKeepPriorityRequest.md)|  | |

### Return type

[**OrderAmendKeepPriorityResponse**](OrderAmendKeepPriorityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order Amend Keep Priority |  -  |

<a id="orderCancel"></a>
# **orderCancel**
> OrderCancelResponse orderCancel(orderCancelRequest)

Cancel order (TRADE)

Cancel an active order.  Weight(IP): 1  Security Type: TRADE  Notes: **Data Source:** Matching Engine  Notes:  * If both &#x60;orderId&#x60; and &#x60;origClientOrderId&#x60; parameters are provided, the &#x60;orderId&#x60; is searched first, then the &#x60;origClientOrderId&#x60; from that result is checked against that order. If both conditions are not met the request will be rejected.  * &#x60;newClientOrderId&#x60; will replace &#x60;clientOrderId&#x60; of the canceled order, freeing it up for new orders.  * If you cancel an order that is a part of an order list, the entire order list is canceled.  * The performance for canceling an order (single cancel or as part of a cancel-replace) is always better when only &#x60;orderId&#x60; is sent. Sending &#x60;origClientOrderId&#x60; or both &#x60;orderId&#x60; + &#x60;origClientOrderId&#x60; will be slower.

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TradeApi apiInstance = new TradeApi(defaultClient);
    OrderCancelRequest orderCancelRequest = new OrderCancelRequest(); // OrderCancelRequest | 
    try {
      OrderCancelResponse result = apiInstance.orderCancel(orderCancelRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#orderCancel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderCancelRequest** | [**OrderCancelRequest**](OrderCancelRequest.md)|  | |

### Return type

[**OrderCancelResponse**](OrderCancelResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cancel order |  -  |

<a id="orderCancelReplace"></a>
# **orderCancelReplace**
> OrderCancelReplaceResponse orderCancelReplace(orderCancelReplaceRequest)

Cancel and replace order (TRADE)

* Cancel an existing order and immediately place a new order instead of the canceled one. * A new order that was not attempted (i.e. when &#x60;newOrderResult: NOT_ATTEMPTED&#x60;), will still increase the unfilled order count by 1. * You can only cancel an individual order from an orderList using this method, but the result is the same as canceling the entire orderList.not attempted (i.e. when &#x60;newOrderResult: NOT_ATTEMPTED&#x60;), will still increase the unfilled order count by 1.  Weight(IP): 1  Unfilled Order Count: 1  Security Type: TRADE  Notes: **Data Source:** Matching Engine  Similar to the [&#x60;order.place&#x60;](#order-place) request, additional mandatory parameters (*) are determined by the new order &#x60;type&#x60;.  Available &#x60;cancelReplaceMode&#x60; options:  * &#x60;STOP_ON_FAILURE&#x60; – if cancellation request fails, new order placement will not be attempted. * &#x60;ALLOW_FAILURE&#x60; – new order placement will be attempted even if the cancel request fails.  &lt;table&gt; &lt;thead&gt;     &lt;tr&gt;         &lt;th colspan&#x3D;3 align&#x3D;left&gt;Request&lt;/th&gt;         &lt;th colspan&#x3D;3 align&#x3D;left&gt;Response&lt;/th&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;th&gt;&lt;code&gt;cancelReplaceMode&lt;/code&gt;&lt;/th&gt;         &lt;th&gt;&lt;code&gt;orderRateLimitExceededMode&lt;/code&gt;&lt;/th&gt;         &lt;th&gt;Unfilled Order Count&lt;/th&gt;         &lt;th&gt;&lt;code&gt;cancelResult&lt;/code&gt;&lt;/th&gt;         &lt;th&gt;&lt;code&gt;newOrderResult&lt;/code&gt;&lt;/th&gt;         &lt;th&gt;&lt;code&gt;status&lt;/code&gt;&lt;/th&gt;     &lt;/tr&gt; &lt;/thead&gt; &lt;tbody&gt;     &lt;tr&gt;         &lt;td rowspan&#x3D;\&quot;11\&quot;&gt;&lt;code&gt;STOP_ON_FAILURE&lt;/code&gt;&lt;/td&gt;         &lt;td rowspan&#x3D;\&quot;6\&quot;&gt;&lt;code&gt;DO_NOTHING&lt;/code&gt;&lt;/td&gt;         &lt;td rowspan&#x3D;\&quot;3\&quot;&gt;Within Limits&lt;/td&gt;         &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt;         &lt;td align&#x3D;right&gt;&lt;code&gt;200&lt;/code&gt;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;➖ &lt;code&gt;NOT_ATTEMPTED&lt;/code&gt;&lt;/td&gt;         &lt;td align&#x3D;right&gt;&lt;code&gt;400&lt;/code&gt;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt;         &lt;td align&#x3D;right&gt;&lt;code&gt;409&lt;/code&gt;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td rowspan&#x3D;\&quot;3\&quot;&gt;Exceeds Limits&lt;/td&gt;         &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt;         &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;➖ &lt;code&gt;NOT_ATTEMPTED&lt;/code&gt;&lt;/td&gt;         &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt;         &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td rowspan&#x3D;\&quot;5\&quot;&gt;&lt;code&gt;CANCEL_ONLY&lt;/code&gt;&lt;/td&gt;         &lt;td rowspan&#x3D;\&quot;3\&quot;&gt;Within Limits&lt;/td&gt;         &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt;         &lt;td align&#x3D;right&gt;&lt;code&gt;200&lt;/code&gt;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;➖ &lt;code&gt;NOT_ATTEMPTED&lt;/code&gt;&lt;/td&gt;         &lt;td align&#x3D;right&gt;&lt;code&gt;400&lt;/code&gt;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt;         &lt;td align&#x3D;right&gt;&lt;code&gt;409&lt;/code&gt;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td rowspan&#x3D;\&quot;2\&quot;&gt;Exceeds Limits&lt;/td&gt;         &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;➖ &lt;code&gt;NOT_ATTEMPTED&lt;/code&gt;&lt;/td&gt;         &lt;td align&#x3D;right&gt;&lt;code&gt;429&lt;/code&gt;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt;         &lt;td align&#x3D;right&gt;&lt;code&gt;429&lt;/code&gt;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td rowspan&#x3D;\&quot;16\&quot;&gt;&lt;code&gt;ALLOW_FAILURE&lt;/code&gt;&lt;/td&gt;         &lt;td rowspan&#x3D;\&quot;8\&quot;&gt;&lt;code&gt;DO_NOTHING&lt;/code&gt;&lt;/td&gt;         &lt;td rowspan&#x3D;\&quot;4\&quot;&gt;Within Limits&lt;/td&gt;         &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt;         &lt;td align&#x3D;right&gt;&lt;code&gt;200&lt;/code&gt;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt;         &lt;td align&#x3D;right&gt;&lt;code&gt;400&lt;/code&gt;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt;         &lt;td align&#x3D;right&gt;&lt;code&gt;409&lt;/code&gt;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt;         &lt;td align&#x3D;right&gt;&lt;code&gt;409&lt;/code&gt;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;     &lt;td rowspan&#x3D;\&quot;4\&quot;&gt;Exceeds Limits&lt;/td&gt;         &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt;         &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt;         &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt;         &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt;         &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td rowspan&#x3D;\&quot;8\&quot;&gt;&lt;CODE&gt;CANCEL_ONLY&lt;/CODE&gt;&lt;/td&gt;         &lt;td rowspan&#x3D;\&quot;4\&quot;&gt;Within Limits&lt;/td&gt;         &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt;         &lt;td align&#x3D;right&gt;&lt;code&gt;200&lt;/code&gt;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt;         &lt;td align&#x3D;right&gt;&lt;code&gt;400&lt;/code&gt;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt;         &lt;td align&#x3D;right&gt;&lt;code&gt;409&lt;/code&gt;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt;         &lt;td align&#x3D;right&gt;&lt;code&gt;409&lt;/code&gt;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td rowspan&#x3D;\&quot;4\&quot;&gt;Exceeds Limits&lt;/td&gt;         &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt;         &lt;td align&#x3D;right&gt;&lt;code&gt;200&lt;/code&gt;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt;         &lt;td align&#x3D;right&gt;&lt;code&gt;400&lt;/code&gt;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt;         &lt;td align&#x3D;right&gt;N/A&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td&gt;✅ &lt;code&gt;SUCCESS&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;❌ &lt;code&gt;FAILURE&lt;/code&gt;&lt;/td&gt;         &lt;td align&#x3D;right&gt;&lt;code&gt;409&lt;/code&gt;&lt;/td&gt;     &lt;/tr&gt; &lt;/tbody&gt; &lt;/table&gt;  Notes:  * If both &#x60;cancelOrderId&#x60; and &#x60;cancelOrigClientOrderId&#x60; parameters are provided, the &#x60;cancelOrderId&#x60; is searched first, then the &#x60;cancelOrigClientOrderId&#x60; from that result is checked against that order. If both conditions are not met the request will be rejected.  * &#x60;cancelNewClientOrderId&#x60; will replace &#x60;clientOrderId&#x60; of the canceled order, freeing it up for new orders.  * &#x60;newClientOrderId&#x60; specifies &#x60;clientOrderId&#x60; value for the placed order.    A new order with the same &#x60;clientOrderId&#x60; is accepted only when the previous one is filled or expired.    The new order can reuse old &#x60;clientOrderId&#x60; of the canceled order.  * This cancel-replace operation is **not transactional**.    If one operation succeeds but the other one fails, the successful operation is still executed.    For example, in &#x60;STOP_ON_FAILURE&#x60; mode, if the new order placement fails, the old order is still canceled.  * Filters and order count limits are evaluated before cancellation and order placement occurs.  * If new order placement is not attempted, your order count is still incremented.  * Like [&#x60;order.cancel&#x60;](#order-cancel), if you cancel an individual order from an order list, the entire order list is canceled.  * The performance for canceling an order (single cancel or as part of a cancel-replace) is always better when only &#x60;orderId&#x60; is sent. Sending &#x60;origClientOrderId&#x60; or both &#x60;orderId&#x60; + &#x60;origClientOrderId&#x60; will be slower.

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TradeApi apiInstance = new TradeApi(defaultClient);
    OrderCancelReplaceRequest orderCancelReplaceRequest = new OrderCancelReplaceRequest(); // OrderCancelReplaceRequest | 
    try {
      OrderCancelReplaceResponse result = apiInstance.orderCancelReplace(orderCancelReplaceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#orderCancelReplace");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderCancelReplaceRequest** | [**OrderCancelReplaceRequest**](OrderCancelReplaceRequest.md)|  | |

### Return type

[**OrderCancelReplaceResponse**](OrderCancelReplaceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cancel and replace order |  -  |

<a id="orderListCancel"></a>
# **orderListCancel**
> OrderListCancelResponse orderListCancel(orderListCancelRequest)

Cancel Order list (TRADE)

Cancel an active order list.  Weight(IP): 1  Security Type: TRADE  Notes: **Data Source:** Matching Engine  Notes:  * If both &#x60;orderListId&#x60; and &#x60;listClientOrderId&#x60; parameters are provided, the &#x60;orderListId&#x60; is searched first, then the &#x60;listClientOrderId&#x60; from that result is checked against that order. If both conditions are not met the request will be rejected.  * Canceling an individual order with [&#x60;order.cancel&#x60;](#order-cancel) will cancel the entire order list as well.

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TradeApi apiInstance = new TradeApi(defaultClient);
    OrderListCancelRequest orderListCancelRequest = new OrderListCancelRequest(); // OrderListCancelRequest | 
    try {
      OrderListCancelResponse result = apiInstance.orderListCancel(orderListCancelRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#orderListCancel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderListCancelRequest** | [**OrderListCancelRequest**](OrderListCancelRequest.md)|  | |

### Return type

[**OrderListCancelResponse**](OrderListCancelResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cancel Order list |  -  |

<a id="orderListPlace"></a>
# **orderListPlace**
> OrderListPlaceResponse orderListPlace(orderListPlaceRequest)

Place new OCO - Deprecated (TRADE)

Send in a new one-cancels-the-other (OCO) pair: &#x60;LIMIT_MAKER&#x60; + &#x60;STOP_LOSS&#x60;/&#x60;STOP_LOSS_LIMIT&#x60; orders (called *legs*), where activation of one order immediately cancels the other.  This adds 1 order to &#x60;EXCHANGE_MAX_ORDERS&#x60; filter and the &#x60;MAX_NUM_ORDERS&#x60; filter  Weight(IP): 1  Unfilled Order Count: 1  Security Type: TRADE  Notes: **Data Source:** Matching Engine  Notes:  * &#x60;listClientOrderId&#x60; parameter specifies &#x60;listClientOrderId&#x60; for the OCO pair.    A new OCO with the same &#x60;listClientOrderId&#x60; is accepted only when the previous one is filled or completely expired.    &#x60;listClientOrderId&#x60; is distinct from &#x60;clientOrderId&#x60; of individual orders.  * &#x60;limitClientOrderId&#x60; and &#x60;stopClientOrderId&#x60; specify &#x60;clientOrderId&#x60; values for both legs of the OCO.    A new order with the same &#x60;clientOrderId&#x60; is accepted only when the previous one is filled or expired.  * Price restrictions on the legs:    | &#x60;side&#x60; | Price relation |   | ------ | -------------- |   | &#x60;BUY&#x60;  | &#x60;price&#x60; &lt; market price &lt; &#x60;stopPrice&#x60; |   | &#x60;SELL&#x60; | &#x60;price&#x60; &gt; market price &gt; &#x60;stopPrice&#x60; |  * Both legs have the same &#x60;quantity&#x60;.    However, you can set different iceberg quantity for individual legs.    If &#x60;stopIcebergQty&#x60; is used, &#x60;stopLimitTimeInForce&#x60; must be &#x60;GTC&#x60;.  * &#x60;trailingDelta&#x60; applies only to the &#x60;STOP_LOSS&#x60;/&#x60;STOP_LOSS_LIMIT&#x60; leg of the OCO.

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TradeApi apiInstance = new TradeApi(defaultClient);
    OrderListPlaceRequest orderListPlaceRequest = new OrderListPlaceRequest(); // OrderListPlaceRequest | 
    try {
      OrderListPlaceResponse result = apiInstance.orderListPlace(orderListPlaceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#orderListPlace");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderListPlaceRequest** | [**OrderListPlaceRequest**](OrderListPlaceRequest.md)|  | |

### Return type

[**OrderListPlaceResponse**](OrderListPlaceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Place new OCO - Deprecated |  -  |

<a id="orderListPlaceOco"></a>
# **orderListPlaceOco**
> OrderListPlaceOcoResponse orderListPlaceOco(orderListPlaceOcoRequest)

Place new Order list - OCO (TRADE)

Send in an one-cancels-the-other (OCO) pair, where activation of one order immediately cancels the other.  * An OCO has 2 orders called the **above order** and **below order**.  * One of the orders must be a &#x60;LIMIT_MAKER/TAKE_PROFIT/TAKE_PROFIT_LIMIT&#x60; order and the other must be &#x60;STOP_LOSS&#x60; or &#x60;STOP_LOSS_LIMIT&#x60; order.  * Price restrictions:   * If the OCO is on the &#x60;SELL&#x60; side:     * &#x60;LIMIT_MAKER/TAKE_PROFIT_LIMIT&#x60; &#x60;price&#x60; &gt; Last Traded Price &gt; &#x60;STOP_LOSS/STOP_LOSS_LIMIT&#x60; &#x60;stopPrice&#x60;     * &#x60;TAKE_PROFIT stopPrice&#x60; &gt; Last Traded Price &gt; &#x60;STOP_LOSS/STOP_LOSS_LIMIT stopPrice&#x60;   * If the OCO is on the &#x60;BUY&#x60; side:     * &#x60;LIMIT_MAKER&#x60; &#x60;price&#x60; &lt; Last Traded Price &lt; &#x60;STOP_LOSS/STOP_LOSS_LIMIT&#x60; &#x60;stopPrice&#x60;     * &#x60;TAKE_PROFIT stopPrice&#x60; &gt; Last Traded Price &gt; &#x60;STOP_LOSS/STOP_LOSS_LIMIT stopPrice&#x60; *  OCOs add **2 orders** to the &#x60;EXCHANGE_MAX_ORDERS&#x60; filter and &#x60;MAX_NUM_ORDERS&#x60; filter.  Weight(IP): 1  Unfilled Order Count: 2  Security Type: TRADE  Notes: **Data Source:** Matching Engine

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TradeApi apiInstance = new TradeApi(defaultClient);
    OrderListPlaceOcoRequest orderListPlaceOcoRequest = new OrderListPlaceOcoRequest(); // OrderListPlaceOcoRequest | 
    try {
      OrderListPlaceOcoResponse result = apiInstance.orderListPlaceOco(orderListPlaceOcoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#orderListPlaceOco");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderListPlaceOcoRequest** | [**OrderListPlaceOcoRequest**](OrderListPlaceOcoRequest.md)|  | |

### Return type

[**OrderListPlaceOcoResponse**](OrderListPlaceOcoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Place new Order list - OCO |  -  |

<a id="orderListPlaceOpo"></a>
# **orderListPlaceOpo**
> OrderListPlaceOpoResponse orderListPlaceOpo(orderListPlaceOpoRequest)

OPO (TRADE)

Place an [OPO](/products/spot/faqs/opo).  * OPOs add 2 orders to the EXCHANGE_MAX_NUM_ORDERS filter and MAX_NUM_ORDERS filter.  Weight(IP): 1  Unfilled Order Count: 2  Security Type: TRADE  Notes: **Data Source:** Matching Engine

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TradeApi apiInstance = new TradeApi(defaultClient);
    OrderListPlaceOpoRequest orderListPlaceOpoRequest = new OrderListPlaceOpoRequest(); // OrderListPlaceOpoRequest | 
    try {
      OrderListPlaceOpoResponse result = apiInstance.orderListPlaceOpo(orderListPlaceOpoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#orderListPlaceOpo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderListPlaceOpoRequest** | [**OrderListPlaceOpoRequest**](OrderListPlaceOpoRequest.md)|  | |

### Return type

[**OrderListPlaceOpoResponse**](OrderListPlaceOpoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OPO |  -  |

<a id="orderListPlaceOpoco"></a>
# **orderListPlaceOpoco**
> OrderListPlaceOpocoResponse orderListPlaceOpoco(orderListPlaceOpocoRequest)

OPOCO (TRADE)

Place an [OPOCO](/products/spot/faqs/opo).  Weight(IP): 1  Unfilled Order Count: 3  Security Type: TRADE  Notes: **Data Source:** Matching Engine

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TradeApi apiInstance = new TradeApi(defaultClient);
    OrderListPlaceOpocoRequest orderListPlaceOpocoRequest = new OrderListPlaceOpocoRequest(); // OrderListPlaceOpocoRequest | 
    try {
      OrderListPlaceOpocoResponse result = apiInstance.orderListPlaceOpoco(orderListPlaceOpocoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#orderListPlaceOpoco");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderListPlaceOpocoRequest** | [**OrderListPlaceOpocoRequest**](OrderListPlaceOpocoRequest.md)|  | |

### Return type

[**OrderListPlaceOpocoResponse**](OrderListPlaceOpocoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OPOCO |  -  |

<a id="orderListPlaceOto"></a>
# **orderListPlaceOto**
> OrderListPlaceOtoResponse orderListPlaceOto(orderListPlaceOtoRequest)

Place new Order list - OTO (TRADE)

Places an OTO.  * An OTO (One-Triggers-the-Other) is an order list comprised of 2 orders.  * The first order is called the **working order** and must be &#x60;LIMIT&#x60; or &#x60;LIMIT_MAKER&#x60;. Initially, only the working order goes on the order book.  * The second order is called the **pending order**. It can be any order type except for &#x60;MARKET&#x60; orders using parameter &#x60;quoteOrderQty&#x60;. The pending order is only placed on the order book when the working order gets **fully filled**.  * If either the working order or the pending order is cancelled individually, the other order in the order list will also be canceled or expired.  * When the order list is placed, if the working order gets **immediately fully filled**, the placement response will show the working order as &#x60;FILLED&#x60; but the pending order will still appear as &#x60;PENDING_NEW&#x60;. You need to query the status of the pending order again to see its updated status.  * OTOs add **2 orders** to the &#x60;EXCHANGE_MAX_NUM_ORDERS&#x60; filter and &#x60;MAX_NUM_ORDERS&#x60; filter.  Weight(IP): 1  Unfilled Order Count: 2  Security Type: TRADE  Notes: **Data Source:** Matching Engine  **Mandatory parameters based on &#x60;pendingType&#x60; or &#x60;workingType&#x60;**  Depending on the &#x60;pendingType&#x60; or &#x60;workingType&#x60;, some optional parameters will become mandatory.  |Type                                                  |Additional mandatory parameters|Additional information| |----                                                  |----                           |------ |&#x60;workingType&#x60; &#x3D; &#x60;LIMIT&#x60;                               |&#x60;workingTimeInForce&#x60;           | |&#x60;pendingType&#x60; &#x3D; &#x60;LIMIT&#x60;                                |&#x60;pendingPrice&#x60;, &#x60;pendingTimeInForce&#x60;          | |&#x60;pendingType&#x60; &#x3D; &#x60;STOP_LOSS&#x60; or &#x60;TAKE_PROFIT&#x60;           |&#x60;pendingStopPrice&#x60; and/or &#x60;pendingTrailingDelta&#x60;| |&#x60;pendingType&#x60; &#x3D;&#x60;STOP_LOSS_LIMIT&#x60; or &#x60;TAKE_PROFIT_LIMIT&#x60;|&#x60;pendingPrice&#x60;, &#x60;pendingStopPrice&#x60; and/or &#x60;pendingTrailingDelta&#x60;, &#x60;pendingTimeInForce&#x60;|

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TradeApi apiInstance = new TradeApi(defaultClient);
    OrderListPlaceOtoRequest orderListPlaceOtoRequest = new OrderListPlaceOtoRequest(); // OrderListPlaceOtoRequest | 
    try {
      OrderListPlaceOtoResponse result = apiInstance.orderListPlaceOto(orderListPlaceOtoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#orderListPlaceOto");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderListPlaceOtoRequest** | [**OrderListPlaceOtoRequest**](OrderListPlaceOtoRequest.md)|  | |

### Return type

[**OrderListPlaceOtoResponse**](OrderListPlaceOtoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Place new Order list - OTO |  -  |

<a id="orderListPlaceOtoco"></a>
# **orderListPlaceOtoco**
> OrderListPlaceOtocoResponse orderListPlaceOtoco(orderListPlaceOtocoRequest)

Place new Order list - OTOCO (TRADE)

Place an OTOCO.  * An OTOCO (One-Triggers-One-Cancels-the-Other) is an order list comprised of 3 orders. * The first order is called the **working order** and must be &#x60;LIMIT&#x60; or &#x60;LIMIT_MAKER&#x60;. Initially, only the working order goes on the order book.   * The behavior of the working order is the same as the [OTO](#order-list-place-oto). * OTOCO has 2 pending orders (pending above and pending below), forming an OCO pair. The pending orders are only placed on the order book when the working order gets **fully filled**.   * The rules of the pending above and pending below follow the same rules as the [Order list OCO](#order-list-place-oco). * OTOCOs add **3 orders** to the &#x60;EXCHANGE_MAX_NUM_ORDERS&#x60; filter and &#x60;MAX_NUM_ORDERS&#x60; filter.  Weight(IP): 1  Unfilled Order Count: 3  Security Type: TRADE  Notes: **Data Source:** Matching Engine  **Mandatory parameters based on &#x60;pendingAboveType&#x60;, &#x60;pendingBelowType&#x60; or &#x60;workingType&#x60;**  Depending on the &#x60;pendingAboveType&#x60;/&#x60;pendingBelowType&#x60; or &#x60;workingType&#x60;, some optional parameters will become mandatory.  |Type                                                       |Additional mandatory parameters|Additional information| |----                                                       |----                           |------ |&#x60;workingType&#x60; &#x3D; &#x60;LIMIT&#x60;                                    |&#x60;workingTimeInForce&#x60;           | |&#x60;pendingAboveType&#x60;&#x3D; &#x60;LIMIT_MAKER&#x60;                                |&#x60;pendingAbovePrice&#x60;          | |&#x60;pendingAboveType&#x60; &#x3D; &#x60;STOP_LOSS/TAKE_PROFIT&#x60;         |&#x60;pendingAboveStopPrice&#x60; and/or &#x60;pendingAboveTrailingDelta&#x60;| |&#x60;pendingAboveType&#x3D;STOP_LOSS_LIMIT/TAKE_PROFIT_LIMIT&#x60;|&#x60;pendingAbovePrice&#x60;, &#x60;pendingAboveStopPrice&#x60; and/or &#x60;pendingAboveTrailingDelta&#x60;, &#x60;pendingAboveTimeInForce&#x60;| |&#x60;pendingBelowType&#x60;&#x3D; &#x60;LIMIT_MAKER&#x60;                                |&#x60;pendingBelowPrice&#x60;          | &#x60;pendingBelowType&#x3D; STOP_LOSS/TAKE_PROFIT&#x60;         |&#x60;pendingBelowStopPrice&#x60; and/or &#x60;pendingBelowTrailingDelta&#x60;| |&#x60;pendingBelowType&#x3D;STOP_LOSS_LIMIT/TAKE_PROFIT_LIMIT&#x60;|&#x60;pendingBelowPrice&#x60;, &#x60;pendingBelowStopPrice&#x60; and/or &#x60;pendingBelowTrailingDelta&#x60;, &#x60;pendingBelowTimeInForce&#x60;|

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TradeApi apiInstance = new TradeApi(defaultClient);
    OrderListPlaceOtocoRequest orderListPlaceOtocoRequest = new OrderListPlaceOtocoRequest(); // OrderListPlaceOtocoRequest | 
    try {
      OrderListPlaceOtocoResponse result = apiInstance.orderListPlaceOtoco(orderListPlaceOtocoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#orderListPlaceOtoco");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderListPlaceOtocoRequest** | [**OrderListPlaceOtocoRequest**](OrderListPlaceOtocoRequest.md)|  | |

### Return type

[**OrderListPlaceOtocoResponse**](OrderListPlaceOtocoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Place new Order list - OTOCO |  -  |

<a id="orderPlace"></a>
# **orderPlace**
> OrderPlaceResponse orderPlace(orderPlaceRequest)

Place new order (TRADE)

Send in a new order.  This adds 1 order to the &#x60;EXCHANGE_MAX_ORDERS&#x60; filter and the &#x60;MAX_NUM_ORDERS&#x60; filter.  Weight(IP): 1  Unfilled Order Count: 1  Security Type: TRADE  Notes: **Data Source:** Matching Engine  &lt;a id&#x3D;\&quot;order-type\&quot;&gt;Certain parameters (*)&lt;/a&gt; become mandatory based on the order &#x60;type&#x60;:  &lt;table&gt; &lt;thead&gt;     &lt;tr&gt;         &lt;th&gt;Order &lt;code&gt;type&lt;/code&gt;&lt;/th&gt;         &lt;th&gt;Mandatory parameters&lt;/th&gt;     &lt;/tr&gt; &lt;/thead&gt; &lt;tbody&gt;     &lt;tr&gt;         &lt;td&gt;&lt;code&gt;LIMIT&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;         &lt;ul&gt;             &lt;li&gt;&lt;code&gt;timeInForce&lt;/code&gt;&lt;/li&gt;             &lt;li&gt;&lt;code&gt;price&lt;/code&gt;&lt;/li&gt;             &lt;li&gt;&lt;code&gt;quantity&lt;/code&gt;&lt;/li&gt;         &lt;/ul&gt;         &lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td&gt;&lt;code&gt;LIMIT_MAKER&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;         &lt;ul&gt;             &lt;li&gt;&lt;code&gt;price&lt;/code&gt;&lt;/li&gt;             &lt;li&gt;&lt;code&gt;quantity&lt;/code&gt;&lt;/li&gt;         &lt;/ul&gt;         &lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td&gt;&lt;code&gt;MARKET&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;         &lt;ul&gt;             &lt;li&gt;&lt;code&gt;quantity&lt;/code&gt; or &lt;code&gt;quoteOrderQty&lt;/code&gt;&lt;/li&gt;         &lt;/ul&gt;         &lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td&gt;&lt;code&gt;STOP_LOSS&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;         &lt;ul&gt;             &lt;li&gt;&lt;code&gt;quantity&lt;/code&gt;&lt;/li&gt;             &lt;li&gt;&lt;code&gt;stopPrice&lt;/code&gt; or &lt;code&gt;trailingDelta&lt;/code&gt;&lt;/li&gt;         &lt;/ul&gt;         &lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td&gt;&lt;code&gt;STOP_LOSS_LIMIT&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;         &lt;ul&gt;             &lt;li&gt;&lt;code&gt;timeInForce&lt;/code&gt;&lt;/li&gt;             &lt;li&gt;&lt;code&gt;price&lt;/code&gt;&lt;/li&gt;             &lt;li&gt;&lt;code&gt;quantity&lt;/code&gt;&lt;/li&gt;             &lt;li&gt;&lt;code&gt;stopPrice&lt;/code&gt; or &lt;code&gt;trailingDelta&lt;/code&gt;&lt;/li&gt;         &lt;/ul&gt;         &lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td&gt;&lt;code&gt;TAKE_PROFIT&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;         &lt;ul&gt;             &lt;li&gt;&lt;code&gt;quantity&lt;/code&gt;&lt;/li&gt;             &lt;li&gt;&lt;code&gt;stopPrice&lt;/code&gt; or &lt;code&gt;trailingDelta&lt;/code&gt;&lt;/li&gt;         &lt;/ul&gt;         &lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td&gt;&lt;code&gt;TAKE_PROFIT_LIMIT&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;         &lt;ul&gt;             &lt;li&gt;&lt;code&gt;timeInForce&lt;/code&gt;&lt;/li&gt;             &lt;li&gt;&lt;code&gt;price&lt;/code&gt;&lt;/li&gt;             &lt;li&gt;&lt;code&gt;quantity&lt;/code&gt;&lt;/li&gt;             &lt;li&gt;&lt;code&gt;stopPrice&lt;/code&gt; or &lt;code&gt;trailingDelta&lt;/code&gt;&lt;/li&gt;         &lt;/ul&gt;         &lt;/td&gt;     &lt;/tr&gt; &lt;/tbody&gt; &lt;/table&gt;  Supported order types:  &lt;table&gt; &lt;thead&gt;     &lt;tr&gt;         &lt;th&gt;Order &lt;code&gt;type&lt;/code&gt;&lt;/th&gt;         &lt;th&gt;Description&lt;/th&gt;     &lt;/tr&gt; &lt;/thead&gt; &lt;tbody&gt;     &lt;tr&gt;         &lt;td&gt;&lt;code&gt;LIMIT&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;         &lt;p&gt;             Buy or sell &lt;code&gt;quantity&lt;/code&gt; at the specified &lt;code&gt;price&lt;/code&gt; or better.         &lt;/p&gt;         &lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td&gt;&lt;code&gt;LIMIT_MAKER&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;         &lt;p&gt;             &lt;code&gt;LIMIT&lt;/code&gt; order that will be rejected if it immediately matches and trades as a taker.         &lt;/p&gt;         &lt;p&gt;             This order type is also known as a POST-ONLY order.         &lt;/p&gt;         &lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td&gt;&lt;code&gt;MARKET&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;         &lt;p&gt;             Buy or sell at the best available market price.         &lt;/p&gt;         &lt;ul&gt;             &lt;li&gt;                 &lt;p&gt;                     &lt;code&gt;MARKET&lt;/code&gt; order with &lt;code&gt;quantity&lt;/code&gt; parameter                     specifies the amount of the &lt;em&gt;base asset&lt;/em&gt; you want to buy or sell.                     Actually executed quantity of the quote asset will be determined by available market liquidity.                 &lt;/p&gt;                 &lt;p&gt;                     E.g., a MARKET BUY order on BTCUSDT for &lt;code&gt;\&quot;quantity\&quot;: \&quot;0.1000\&quot;&lt;/code&gt;                     specifies that you want to buy 0.1 BTC at the best available price.                     If there is not enough BTC at the best price, keep buying at the next best price,                     until either your order is filled, or you run out of USDT, or market runs out of BTC.                 &lt;/p&gt;             &lt;/li&gt;             &lt;li&gt;                 &lt;p&gt;                     &lt;code&gt;MARKET&lt;/code&gt; order with &lt;code&gt;quoteOrderQty&lt;/code&gt; parameter                     specifies the amount of the &lt;em&gt;quote asset&lt;/em&gt; you want to spend (when buying) or receive (when selling).                     Actually executed quantity of the base asset will be determined by available market liquidity.                 &lt;/p&gt;                 &lt;p&gt;                     E.g., a MARKET BUY on BTCUSDT for &lt;code&gt;\&quot;quoteOrderQty\&quot;: \&quot;100.00\&quot;&lt;/code&gt;                     specifies that you want to buy as much BTC as you can for 100 USDT at the best available price.                     Similarly, a SELL order will sell as much available BTC as needed for you to receive 100 USDT                     (before commission).                 &lt;/p&gt;             &lt;/li&gt;         &lt;/ul&gt;         &lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td&gt;&lt;code&gt;STOP_LOSS&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;         &lt;p&gt;             Execute a &lt;code&gt;MARKET&lt;/code&gt; order for given &lt;code&gt;quantity&lt;/code&gt; when specified conditions are met.         &lt;/p&gt;         &lt;p&gt;             I.e., when &lt;code&gt;stopPrice&lt;/code&gt; is reached, or when &lt;code&gt;trailingDelta&lt;/code&gt; is activated.         &lt;/p&gt;         &lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td&gt;&lt;code&gt;STOP_LOSS_LIMIT&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;         &lt;p&gt;             Place a &lt;code&gt;LIMIT&lt;/code&gt; order with given parameters when specified conditions are met.         &lt;/p&gt;         &lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td&gt;&lt;code&gt;TAKE_PROFIT&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;         &lt;p&gt;             Like &lt;code&gt;STOP_LOSS&lt;/code&gt; but activates when market price moves in the favorable direction.         &lt;/p&gt;         &lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;         &lt;td&gt;&lt;code&gt;TAKE_PROFIT_LIMIT&lt;/code&gt;&lt;/td&gt;         &lt;td&gt;         &lt;p&gt;             Like &lt;code&gt;STOP_LOSS_LIMIT&lt;/code&gt; but activates when market price moves in the favorable direction.         &lt;/p&gt;         &lt;/td&gt;     &lt;/tr&gt; &lt;/tbody&gt; &lt;/table&gt;  &lt;a id&#x3D;\&quot;pegged-orders-info\&quot;&gt;&lt;/a&gt; Notes on using parameters for Pegged Orders:  * These parameters are allowed for &#x60;LIMIT&#x60;, &#x60;LIMIT_MAKER&#x60;, &#x60;STOP_LOSS_LIMIT&#x60;, &#x60;TAKE_PROFIT_LIMIT&#x60; orders. * If &#x60;pegPriceType&#x60; is specified, &#x60;price&#x60; becomes optional. Otherwise, it is still mandatory. * &#x60;pegPriceType&#x3D;PRIMARY_PEG&#x60; means the primary peg, that is the best price on the same side of the order book as your order. * &#x60;pegPriceType&#x3D;MARKET_PEG&#x60; means the market peg, that is the best price on the opposite side of the order book from your order. * Use &#x60;pegOffsetType&#x60; and &#x60;pegOffsetValue&#x60; to request a price level other than the best one. These parameters must be specified together.  &lt;a id&#x3D;\&quot;timeInForce\&quot;&gt;&lt;/a&gt;  Available &#x60;timeInForce&#x60; options, setting how long the order should be active before expiration:  TIF  | Description ----- | -------------- &#x60;GTC&#x60; | **Good &#39;til Canceled** – the order will remain on the book until you cancel it, or the order is completely filled. &#x60;IOC&#x60; | **Immediate or Cancel** – the order will be filled for as much as possible, the unfilled quantity immediately expires. &#x60;FOK&#x60; | **Fill or Kill** – the order will expire unless it cannot be immediately filled for the entire quantity.  Notes:  * &#x60;newClientOrderId&#x60; specifies &#x60;clientOrderId&#x60; value for the order.    A new order with the same &#x60;clientOrderId&#x60; is accepted only when the previous one is filled or expired.  * Any &#x60;LIMIT&#x60; or &#x60;LIMIT_MAKER&#x60; order can be made into an iceberg order by specifying the &#x60;icebergQty&#x60;.    An order with an &#x60;icebergQty&#x60; must have &#x60;timeInForce&#x60; set to &#x60;GTC&#x60;.  * Trigger order price rules for &#x60;STOP_LOSS&#x60;/&#x60;TAKE_PROFIT&#x60; orders:    * &#x60;stopPrice&#x60; must be above market price: &#x60;STOP_LOSS BUY&#x60;, &#x60;TAKE_PROFIT SELL&#x60;   * &#x60;stopPrice&#x60; must be below market price: &#x60;STOP_LOSS SELL&#x60;, &#x60;TAKE_PROFIT BUY&#x60;  * &#x60;MARKET&#x60; orders using &#x60;quoteOrderQty&#x60; follow [&#x60;LOT_SIZE&#x60;](/products/spot/filters#lot_size) filter rules.    The order will execute a quantity that has notional value as close as possible to requested &#x60;quoteOrderQty&#x60;.

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TradeApi apiInstance = new TradeApi(defaultClient);
    OrderPlaceRequest orderPlaceRequest = new OrderPlaceRequest(); // OrderPlaceRequest | 
    try {
      OrderPlaceResponse result = apiInstance.orderPlace(orderPlaceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#orderPlace");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderPlaceRequest** | [**OrderPlaceRequest**](OrderPlaceRequest.md)|  | |

### Return type

[**OrderPlaceResponse**](OrderPlaceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Place new order |  -  |

<a id="orderTest"></a>
# **orderTest**
> OrderTestResponse orderTest(orderTestRequest)

Test new order (TRADE)

Test order placement.  Validates new order parameters and verifies your signature but does not send the order into the matching engine.  Weight: | Condition | Request Weight | | --- | --- | | Without &#x60;computeCommissionRates&#x60; | 1 | | With &#x60;computeCommissionRates&#x60; | 20 |  Security Type: TRADE  Notes: **Data Source:** Memory

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TradeApi apiInstance = new TradeApi(defaultClient);
    OrderTestRequest orderTestRequest = new OrderTestRequest(); // OrderTestRequest | 
    try {
      OrderTestResponse result = apiInstance.orderTest(orderTestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#orderTest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderTestRequest** | [**OrderTestRequest**](OrderTestRequest.md)|  | |

### Return type

[**OrderTestResponse**](OrderTestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Test new order |  -  |

<a id="sorOrderPlace"></a>
# **sorOrderPlace**
> SorOrderPlaceResponse sorOrderPlace(sorOrderPlaceRequest)

Place new order using SOR (TRADE)

Places an order using smart order routing (SOR).  This adds 1 order to the &#x60;EXCHANGE_MAX_ORDERS&#x60; filter and the &#x60;MAX_NUM_ORDERS&#x60; filter.  Read [SOR FAQ](/products/spot/faqs/sor_faq) to learn more.  Weight(IP): 1  Unfilled Order Count: 1  Security Type: TRADE  Notes: **Data Source:** Matching Engine  **Note:** &#x60;sor.order.place&#x60; only supports &#x60;LIMIT&#x60; and &#x60;MARKET&#x60; orders. &#x60;quoteOrderQty&#x60; is not supported.

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TradeApi apiInstance = new TradeApi(defaultClient);
    SorOrderPlaceRequest sorOrderPlaceRequest = new SorOrderPlaceRequest(); // SorOrderPlaceRequest | 
    try {
      SorOrderPlaceResponse result = apiInstance.sorOrderPlace(sorOrderPlaceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#sorOrderPlace");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sorOrderPlaceRequest** | [**SorOrderPlaceRequest**](SorOrderPlaceRequest.md)|  | |

### Return type

[**SorOrderPlaceResponse**](SorOrderPlaceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Place new order using SOR |  -  |

<a id="sorOrderTest"></a>
# **sorOrderTest**
> SorOrderTestResponse sorOrderTest(sorOrderTestRequest)

Test new order using SOR (TRADE)

Test new order creation and signature/recvWindow using smart order routing (SOR). Creates and validates a new order but does not send it into the matching engine.  Weight: | Condition | Request Weight | | --- | --- | | Without &#x60;computeCommissionRates&#x60; | 1 | | With &#x60;computeCommissionRates&#x60; | 20 |  Security Type: TRADE  Notes: **Data Source:** Memory

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TradeApi apiInstance = new TradeApi(defaultClient);
    SorOrderTestRequest sorOrderTestRequest = new SorOrderTestRequest(); // SorOrderTestRequest | 
    try {
      SorOrderTestResponse result = apiInstance.sorOrderTest(sorOrderTestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#sorOrderTest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sorOrderTestRequest** | [**SorOrderTestRequest**](SorOrderTestRequest.md)|  | |

### Return type

[**SorOrderTestResponse**](SorOrderTestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Test new order using SOR |  -  |

