# TradeApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**openOrderListsStatus**](TradeApi.md#openOrderListsStatus) | **POST** /openOrderLists.status | WebSocket Current open Order lists |
| [**openOrdersCancelAll**](TradeApi.md#openOrdersCancelAll) | **POST** /openOrders.cancelAll | WebSocket Cancel open orders |
| [**openOrdersStatus**](TradeApi.md#openOrdersStatus) | **POST** /openOrders.status | WebSocket Current open orders |
| [**orderAmendKeepPriority**](TradeApi.md#orderAmendKeepPriority) | **POST** /order.amend.keepPriority | WebSocket Order Amend Keep Priority |
| [**orderCancel**](TradeApi.md#orderCancel) | **POST** /order.cancel | WebSocket Cancel order |
| [**orderCancelReplace**](TradeApi.md#orderCancelReplace) | **POST** /order.cancelReplace | WebSocket Cancel and replace order |
| [**orderListCancel**](TradeApi.md#orderListCancel) | **POST** /orderList.cancel | WebSocket Cancel Order list |
| [**orderListPlace**](TradeApi.md#orderListPlace) | **POST** /orderList.place | WebSocket Place new OCO - Deprecated |
| [**orderListPlaceOco**](TradeApi.md#orderListPlaceOco) | **POST** /orderList.place.oco | WebSocket Place new Order list - OCO |
| [**orderListPlaceOto**](TradeApi.md#orderListPlaceOto) | **POST** /orderList.place.oto | WebSocket Place new Order list - OTO |
| [**orderListPlaceOtoco**](TradeApi.md#orderListPlaceOtoco) | **POST** /orderList.place.otoco | WebSocket Place new Order list - OTOCO |
| [**orderListStatus**](TradeApi.md#orderListStatus) | **POST** /orderList.status | WebSocket Query Order list |
| [**orderPlace**](TradeApi.md#orderPlace) | **POST** /order.place | WebSocket Place new order |
| [**orderStatus**](TradeApi.md#orderStatus) | **POST** /order.status | WebSocket Query order |
| [**orderTest**](TradeApi.md#orderTest) | **POST** /order.test | WebSocket Test new order |
| [**sorOrderPlace**](TradeApi.md#sorOrderPlace) | **POST** /sor.order.place | WebSocket Place new order using SOR |
| [**sorOrderTest**](TradeApi.md#sorOrderTest) | **POST** /sor.order.test | WebSocket Test new order using SOR |


<a id="openOrderListsStatus"></a>
# **openOrderListsStatus**
> OpenOrderListsStatusResponse openOrderListsStatus(openOrderListsStatusRequest)

WebSocket Current open Order lists

Query execution status of all open order lists.  If you need to continuously monitor order status updates, please consider using WebSocket Streams:  * &#x60;userDataStream.start&#x60; request * &#x60;executionReport&#x60; user data stream event Weight: 6

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
    OpenOrderListsStatusRequest openOrderListsStatusRequest = new OpenOrderListsStatusRequest(); // OpenOrderListsStatusRequest | 
    try {
      OpenOrderListsStatusResponse result = apiInstance.openOrderListsStatus(openOrderListsStatusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#openOrderListsStatus");
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
| **openOrderListsStatusRequest** | [**OpenOrderListsStatusRequest**](OpenOrderListsStatusRequest.md)|  | |

### Return type

[**OpenOrderListsStatusResponse**](OpenOrderListsStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current open Order lists |  -  |

<a id="openOrdersCancelAll"></a>
# **openOrdersCancelAll**
> OpenOrdersCancelAllResponse openOrdersCancelAll(openOrdersCancelAllRequest)

WebSocket Cancel open orders

Cancel all open orders on a symbol. This includes orders that are part of an order list. Weight: 1

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

<a id="openOrdersStatus"></a>
# **openOrdersStatus**
> OpenOrdersStatusResponse openOrdersStatus(openOrdersStatusRequest)

WebSocket Current open orders

Query execution status of all open orders.  If you need to continuously monitor order status updates, please consider using WebSocket Streams:  * &#x60;userDataStream.start&#x60; request * &#x60;executionReport&#x60; user data stream event Weight: Adjusted based on the number of requested symbols:  | Parameter | Weight | | --------- | ------ | | &#x60;symbol&#x60;  |      6 | | none      |     80 |

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
    OpenOrdersStatusRequest openOrdersStatusRequest = new OpenOrdersStatusRequest(); // OpenOrdersStatusRequest | 
    try {
      OpenOrdersStatusResponse result = apiInstance.openOrdersStatus(openOrdersStatusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#openOrdersStatus");
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
| **openOrdersStatusRequest** | [**OpenOrdersStatusRequest**](OpenOrdersStatusRequest.md)|  | |

### Return type

[**OpenOrdersStatusResponse**](OpenOrdersStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current open orders |  -  |

<a id="orderAmendKeepPriority"></a>
# **orderAmendKeepPriority**
> OrderAmendKeepPriorityResponse orderAmendKeepPriority(orderAmendKeepPriorityRequest)

WebSocket Order Amend Keep Priority

Reduce the quantity of an existing open order.  Read [Order Amend Keep Priority FAQ](faqs/order_amend_keep_priority.md) to learn more. Weight: 1

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

WebSocket Cancel order

Cancel an active order. Weight: 1

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

WebSocket Cancel and replace order

Cancel an existing order and immediately place a new order instead of the canceled one. Weight: 1

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

WebSocket Cancel Order list

Cancel an active order list. Weight: 1

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

WebSocket Place new OCO - Deprecated

Send in a new one-cancels-the-other (OCO) pair: &#x60;LIMIT_MAKER&#x60; + &#x60;STOP_LOSS&#x60;/&#x60;STOP_LOSS_LIMIT&#x60; orders (called *legs*), where activation of one order immediately cancels the other. Weight: 1

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

WebSocket Place new Order list - OCO

Send in an one-cancels the other (OCO) pair, where activation of one order immediately cancels the other.  * An OCO has 2 orders called the **above order** and **below order**. * One of the orders must be a &#x60;LIMIT_MAKER/TAKE_PROFIT/TAKE_PROFIT_LIMIT&#x60; order and the other must be &#x60;STOP_LOSS&#x60; or &#x60;STOP_LOSS_LIMIT&#x60; order. * Price restrictions:   * If the OCO is on the &#x60;SELL&#x60; side:     * &#x60;LIMIT_MAKER/TAKE_PROFIT_LIMIT&#x60; &#x60;price&#x60; &gt; Last Traded Price &gt; &#x60;STOP_LOSS/STOP_LOSS_LIMIT&#x60; &#x60;stopPrice&#x60;     * &#x60;TAKE_PROFIT stopPrice&#x60; &gt; Last Traded Price &gt; &#x60;STOP_LOSS/STOP_LOSS_LIMIT stopPrice&#x60;   * If the OCO is on the &#x60;BUY&#x60; side:     * &#x60;LIMIT_MAKER&#x60; &#x60;price&#x60; &lt; Last Traded Price &lt; &#x60;STOP_LOSS/STOP_LOSS_LIMIT&#x60; &#x60;stopPrice&#x60;     * &#x60;TAKE_PROFIT stopPrice&#x60; &gt; Last Traded Price &gt; &#x60;STOP_LOSS/STOP_LOSS_LIMIT stopPrice&#x60; * OCOs add **2 orders** to the unfilled order count, &#x60;EXCHANGE_MAX_ORDERS&#x60; filter, and &#x60;MAX_NUM_ORDERS&#x60; filter.   Weight: 1

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

<a id="orderListPlaceOto"></a>
# **orderListPlaceOto**
> OrderListPlaceOtoResponse orderListPlaceOto(orderListPlaceOtoRequest)

WebSocket Place new Order list - OTO

Places an OTO.  * An OTO (One-Triggers-the-Other) is an order list comprised of 2 orders. * The first order is called the **working order** and must be &#x60;LIMIT&#x60; or &#x60;LIMIT_MAKER&#x60;. Initially, only the working order goes on the order book. * The second order is called the **pending order**. It can be any order type except for &#x60;MARKET&#x60; orders using parameter &#x60;quoteOrderQty&#x60;. The pending order is only placed on the order book when the working order gets **fully filled**. * If either the working order or the pending order is cancelled individually, the other order in the order list will also be canceled or expired. * OTOs add **2 orders** to the unfilled order count, &#x60;EXCHANGE_MAX_NUM_ORDERS&#x60; filter and &#x60;MAX_NUM_ORDERS&#x60; filter. Weight: 1

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

WebSocket Place new Order list - OTOCO

Place an OTOCO.  * An OTOCO (One-Triggers-One-Cancels-the-Other) is an order list comprised of 3 orders. * The first order is called the **working order** and must be &#x60;LIMIT&#x60; or &#x60;LIMIT_MAKER&#x60;. Initially, only the working order goes on the order book.   * The behavior of the working order is the same as the [OTO](#place-new-order-list---oto-trade). * OTOCO has 2 pending orders (pending above and pending below), forming an OCO pair. The pending orders are only placed on the order book when the working order gets **fully filled**. * OTOCOs add **3 orders** to the unfilled order count, &#x60;EXCHANGE_MAX_NUM_ORDERS&#x60; filter, and &#x60;MAX_NUM_ORDERS&#x60; filter. Weight: 1

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

<a id="orderListStatus"></a>
# **orderListStatus**
> OrderListStatusResponse orderListStatus(orderListStatusRequest)

WebSocket Query Order list

Check execution status of an Order list.  For execution status of individual orders, use &#x60;order.status&#x60;. Weight: 4

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
    OrderListStatusRequest orderListStatusRequest = new OrderListStatusRequest(); // OrderListStatusRequest | 
    try {
      OrderListStatusResponse result = apiInstance.orderListStatus(orderListStatusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#orderListStatus");
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
| **orderListStatusRequest** | [**OrderListStatusRequest**](OrderListStatusRequest.md)|  | |

### Return type

[**OrderListStatusResponse**](OrderListStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Query Order list |  -  |

<a id="orderPlace"></a>
# **orderPlace**
> OrderPlaceResponse orderPlace(orderPlaceRequest)

WebSocket Place new order

Send in a new order. Weight: 1

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

<a id="orderStatus"></a>
# **orderStatus**
> OrderStatusResponse orderStatus(orderStatusRequest)

WebSocket Query order

Check execution status of an order. Weight: 4

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
    OrderStatusRequest orderStatusRequest = new OrderStatusRequest(); // OrderStatusRequest | 
    try {
      OrderStatusResponse result = apiInstance.orderStatus(orderStatusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#orderStatus");
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
| **orderStatusRequest** | [**OrderStatusRequest**](OrderStatusRequest.md)|  | |

### Return type

[**OrderStatusResponse**](OrderStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Query order |  -  |

<a id="orderTest"></a>
# **orderTest**
> OrderTestResponse orderTest(orderTestRequest)

WebSocket Test new order

Test order placement.  Validates new order parameters and verifies your signature but does not send the order into the matching engine. Weight: |Condition| Request Weight| |------------           | ------------ | |Without &#x60;computeCommissionRates&#x60;| 1| |With &#x60;computeCommissionRates&#x60;|20|

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

WebSocket Place new order using SOR

Places an order using smart order routing (SOR). Weight: 1

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

WebSocket Test new order using SOR

Test new order creation and signature/recvWindow using smart order routing (SOR). Creates and validates a new order but does not send it into the matching engine. Weight: |Condition                       | Request Weight| |------------                    | ------------ | |Without &#x60;computeCommissionRates&#x60;| 1            | |With &#x60;computeCommissionRates&#x60;   |20            |

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

