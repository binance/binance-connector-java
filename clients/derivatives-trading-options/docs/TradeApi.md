# TradeApi

All URIs are relative to *https://eapi.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accountTradeList**](TradeApi.md#accountTradeList) | **GET** /eapi/v1/userTrades | Account Trade List (USER_DATA) |
| [**cancelAllOptionOrdersByUnderlying**](TradeApi.md#cancelAllOptionOrdersByUnderlying) | **DELETE** /eapi/v1/allOpenOrdersByUnderlying | Cancel All Option Orders By Underlying (TRADE) |
| [**cancelAllOptionOrdersOnSpecificSymbol**](TradeApi.md#cancelAllOptionOrdersOnSpecificSymbol) | **DELETE** /eapi/v1/allOpenOrders | Cancel all Option orders on specific symbol (TRADE) |
| [**cancelMultipleOptionOrders**](TradeApi.md#cancelMultipleOptionOrders) | **DELETE** /eapi/v1/batchOrders | Cancel Multiple Option Orders (TRADE) |
| [**cancelOptionOrder**](TradeApi.md#cancelOptionOrder) | **DELETE** /eapi/v1/order | Cancel Option Order (TRADE) |
| [**newOrder**](TradeApi.md#newOrder) | **POST** /eapi/v1/order | New Order (TRADE) |
| [**optionPositionInformation**](TradeApi.md#optionPositionInformation) | **GET** /eapi/v1/position | Option Position Information (USER_DATA) |
| [**placeMultipleOrders**](TradeApi.md#placeMultipleOrders) | **POST** /eapi/v1/batchOrders | Place Multiple Orders(TRADE) |
| [**queryCurrentOpenOptionOrders**](TradeApi.md#queryCurrentOpenOptionOrders) | **GET** /eapi/v1/openOrders | Query Current Open Option Orders (USER_DATA) |
| [**queryOptionOrderHistory**](TradeApi.md#queryOptionOrderHistory) | **GET** /eapi/v1/historyOrders | Query Option Order History (TRADE) |
| [**querySingleOrder**](TradeApi.md#querySingleOrder) | **GET** /eapi/v1/order | Query Single Order (TRADE) |
| [**userExerciseRecord**](TradeApi.md#userExerciseRecord) | **GET** /eapi/v1/exerciseRecord | User Exercise Record (USER_DATA) |


<a id="accountTradeList"></a>
# **accountTradeList**
> AccountTradeListResponse accountTradeList(symbol, fromId, startTime, endTime, limit, recvWindow)

Account Trade List (USER_DATA)

Get trades for a specific account and symbol.  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | Option trading pair, e.g BTC-200730-9000-C
    Long fromId = 56L; // Long | The UniqueId ID from which to return. The latest deal record is returned by default
    Long startTime = 56L; // Long | Start Time, e.g 1593511200000
    Long endTime = 56L; // Long | End Time, e.g 1593512200000
    Long limit = 56L; // Long | Number of result sets returned Default:100 Max:1000
    Long recvWindow = 56L; // Long | 
    try {
      AccountTradeListResponse result = apiInstance.accountTradeList(symbol, fromId, startTime, endTime, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#accountTradeList");
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
| **symbol** | **String**| Option trading pair, e.g BTC-200730-9000-C | [optional] |
| **fromId** | **Long**| The UniqueId ID from which to return. The latest deal record is returned by default | [optional] |
| **startTime** | **Long**| Start Time, e.g 1593511200000 | [optional] |
| **endTime** | **Long**| End Time, e.g 1593512200000 | [optional] |
| **limit** | **Long**| Number of result sets returned Default:100 Max:1000 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**AccountTradeListResponse**](AccountTradeListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account Trade List |  -  |

<a id="cancelAllOptionOrdersByUnderlying"></a>
# **cancelAllOptionOrdersByUnderlying**
> CancelAllOptionOrdersByUnderlyingResponse cancelAllOptionOrdersByUnderlying(underlying, recvWindow)

Cancel All Option Orders By Underlying (TRADE)

Cancel all active orders on specified underlying.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String underlying = "underlying_example"; // String | Option underlying, e.g BTCUSDT
    Long recvWindow = 56L; // Long | 
    try {
      CancelAllOptionOrdersByUnderlyingResponse result = apiInstance.cancelAllOptionOrdersByUnderlying(underlying, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#cancelAllOptionOrdersByUnderlying");
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
| **underlying** | **String**| Option underlying, e.g BTCUSDT | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**CancelAllOptionOrdersByUnderlyingResponse**](CancelAllOptionOrdersByUnderlyingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cancel All Option Orders By Underlying |  -  |

<a id="cancelAllOptionOrdersOnSpecificSymbol"></a>
# **cancelAllOptionOrdersOnSpecificSymbol**
> CancelAllOptionOrdersOnSpecificSymbolResponse cancelAllOptionOrdersOnSpecificSymbol(symbol, recvWindow)

Cancel all Option orders on specific symbol (TRADE)

Cancel all active order on a symbol.  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | Option trading pair, e.g BTC-200730-9000-C
    Long recvWindow = 56L; // Long | 
    try {
      CancelAllOptionOrdersOnSpecificSymbolResponse result = apiInstance.cancelAllOptionOrdersOnSpecificSymbol(symbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#cancelAllOptionOrdersOnSpecificSymbol");
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
| **symbol** | **String**| Option trading pair, e.g BTC-200730-9000-C | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**CancelAllOptionOrdersOnSpecificSymbolResponse**](CancelAllOptionOrdersOnSpecificSymbolResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cancel all Option orders on specific symbol |  -  |

<a id="cancelMultipleOptionOrders"></a>
# **cancelMultipleOptionOrders**
> CancelMultipleOptionOrdersResponse cancelMultipleOptionOrders(symbol, orderIds, clientOrderIds, recvWindow)

Cancel Multiple Option Orders (TRADE)

Cancel multiple orders.  * At least one instance of &#x60;orderId&#x60; and &#x60;clientOrderId&#x60; must be sent. * Max 10 orders can be deleted in one request  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | Option trading pair, e.g BTC-200730-9000-C
    OrderIds orderIds = Arrays.asList(); // OrderIds | Order ID, e.g [4611875134427365377,4611875134427365378]
    ClientOrderIds clientOrderIds = Arrays.asList(); // ClientOrderIds | User-defined order ID, e.g [\"my_id_1\",\"my_id_2\"]
    Long recvWindow = 56L; // Long | 
    try {
      CancelMultipleOptionOrdersResponse result = apiInstance.cancelMultipleOptionOrders(symbol, orderIds, clientOrderIds, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#cancelMultipleOptionOrders");
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
| **symbol** | **String**| Option trading pair, e.g BTC-200730-9000-C | |
| **orderIds** | [**OrderIds**](Long.md)| Order ID, e.g [4611875134427365377,4611875134427365378] | [optional] |
| **clientOrderIds** | [**ClientOrderIds**](String.md)| User-defined order ID, e.g [\&quot;my_id_1\&quot;,\&quot;my_id_2\&quot;] | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**CancelMultipleOptionOrdersResponse**](CancelMultipleOptionOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cancel Multiple Option Orders |  -  |

<a id="cancelOptionOrder"></a>
# **cancelOptionOrder**
> CancelOptionOrderResponse cancelOptionOrder(symbol, orderId, clientOrderId, recvWindow)

Cancel Option Order (TRADE)

Cancel an active order.  * At least one instance of &#x60;orderId&#x60; and &#x60;clientOrderId&#x60; must be sent.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | Option trading pair, e.g BTC-200730-9000-C
    Long orderId = 56L; // Long | Order ID, e.g 4611875134427365377
    String clientOrderId = "clientOrderId_example"; // String | User-defined order ID, e.g 10000
    Long recvWindow = 56L; // Long | 
    try {
      CancelOptionOrderResponse result = apiInstance.cancelOptionOrder(symbol, orderId, clientOrderId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#cancelOptionOrder");
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
| **symbol** | **String**| Option trading pair, e.g BTC-200730-9000-C | |
| **orderId** | **Long**| Order ID, e.g 4611875134427365377 | [optional] |
| **clientOrderId** | **String**| User-defined order ID, e.g 10000 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**CancelOptionOrderResponse**](CancelOptionOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cancel Option Order |  -  |

<a id="newOrder"></a>
# **newOrder**
> NewOrderResponse newOrder(newOrderRequest)

New Order (TRADE)

Send a new order.  Weight: 0

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    NewOrderRequest newOrderRequest = new NewOrderRequest(); // NewOrderRequest | 
    try {
      NewOrderResponse result = apiInstance.newOrder(newOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#newOrder");
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
| **newOrderRequest** | [**NewOrderRequest**](NewOrderRequest.md)|  | |

### Return type

[**NewOrderResponse**](NewOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | New Order |  -  |

<a id="optionPositionInformation"></a>
# **optionPositionInformation**
> OptionPositionInformationResponse optionPositionInformation(symbol, recvWindow)

Option Position Information (USER_DATA)

Get current position information.  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | Option trading pair, e.g BTC-200730-9000-C
    Long recvWindow = 56L; // Long | 
    try {
      OptionPositionInformationResponse result = apiInstance.optionPositionInformation(symbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#optionPositionInformation");
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
| **symbol** | **String**| Option trading pair, e.g BTC-200730-9000-C | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**OptionPositionInformationResponse**](OptionPositionInformationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Option Position Information |  -  |

<a id="placeMultipleOrders"></a>
# **placeMultipleOrders**
> PlaceMultipleOrdersResponse placeMultipleOrders(placeMultipleOrdersRequest)

Place Multiple Orders(TRADE)

Send multiple option orders.  * Parameter rules are same with New Order * Batch orders are processed concurrently, and the order of matching is not guaranteed.  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    PlaceMultipleOrdersRequest placeMultipleOrdersRequest = new PlaceMultipleOrdersRequest(); // PlaceMultipleOrdersRequest | 
    try {
      PlaceMultipleOrdersResponse result = apiInstance.placeMultipleOrders(placeMultipleOrdersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#placeMultipleOrders");
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
| **placeMultipleOrdersRequest** | [**PlaceMultipleOrdersRequest**](PlaceMultipleOrdersRequest.md)|  | |

### Return type

[**PlaceMultipleOrdersResponse**](PlaceMultipleOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Place Multiple Orders |  -  |

<a id="queryCurrentOpenOptionOrders"></a>
# **queryCurrentOpenOptionOrders**
> QueryCurrentOpenOptionOrdersResponse queryCurrentOpenOptionOrders(symbol, orderId, startTime, endTime, recvWindow)

Query Current Open Option Orders (USER_DATA)

Query current all open orders, status: ACCEPTED PARTIALLY_FILLED  Weight: 1 for a single symbol; 40 when the symbol parameter is omitted

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | Option trading pair, e.g BTC-200730-9000-C
    Long orderId = 56L; // Long | Order ID, e.g 4611875134427365377
    Long startTime = 56L; // Long | Start Time, e.g 1593511200000
    Long endTime = 56L; // Long | End Time, e.g 1593512200000
    Long recvWindow = 56L; // Long | 
    try {
      QueryCurrentOpenOptionOrdersResponse result = apiInstance.queryCurrentOpenOptionOrders(symbol, orderId, startTime, endTime, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryCurrentOpenOptionOrders");
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
| **symbol** | **String**| Option trading pair, e.g BTC-200730-9000-C | [optional] |
| **orderId** | **Long**| Order ID, e.g 4611875134427365377 | [optional] |
| **startTime** | **Long**| Start Time, e.g 1593511200000 | [optional] |
| **endTime** | **Long**| End Time, e.g 1593512200000 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryCurrentOpenOptionOrdersResponse**](QueryCurrentOpenOptionOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current Open Option Orders |  -  |

<a id="queryOptionOrderHistory"></a>
# **queryOptionOrderHistory**
> QueryOptionOrderHistoryResponse queryOptionOrderHistory(symbol, orderId, startTime, endTime, limit, recvWindow)

Query Option Order History (TRADE)

Query all finished orders within 5 days, finished status: CANCELLED FILLED REJECTED.  Weight: 3

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | Option trading pair, e.g BTC-200730-9000-C
    Long orderId = 56L; // Long | Order ID, e.g 4611875134427365377
    Long startTime = 56L; // Long | Start Time, e.g 1593511200000
    Long endTime = 56L; // Long | End Time, e.g 1593512200000
    Long limit = 56L; // Long | Number of result sets returned Default:100 Max:1000
    Long recvWindow = 56L; // Long | 
    try {
      QueryOptionOrderHistoryResponse result = apiInstance.queryOptionOrderHistory(symbol, orderId, startTime, endTime, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryOptionOrderHistory");
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
| **symbol** | **String**| Option trading pair, e.g BTC-200730-9000-C | |
| **orderId** | **Long**| Order ID, e.g 4611875134427365377 | [optional] |
| **startTime** | **Long**| Start Time, e.g 1593511200000 | [optional] |
| **endTime** | **Long**| End Time, e.g 1593512200000 | [optional] |
| **limit** | **Long**| Number of result sets returned Default:100 Max:1000 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryOptionOrderHistoryResponse**](QueryOptionOrderHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Option Order History |  -  |

<a id="querySingleOrder"></a>
# **querySingleOrder**
> QuerySingleOrderResponse querySingleOrder(symbol, orderId, clientOrderId, recvWindow)

Query Single Order (TRADE)

Check an order status.  * These orders will not be found: * order status is &#x60;CANCELED&#x60; or &#x60;REJECTED&#x60;, **AND** * order has NO filled trade, **AND** * created time + 3 days &lt; current time   * Either &#x60;orderId&#x60; or &#x60;clientOrderId &#x60; must be sent.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | Option trading pair, e.g BTC-200730-9000-C
    Long orderId = 56L; // Long | Order ID, e.g 4611875134427365377
    String clientOrderId = "clientOrderId_example"; // String | User-defined order ID, e.g 10000
    Long recvWindow = 56L; // Long | 
    try {
      QuerySingleOrderResponse result = apiInstance.querySingleOrder(symbol, orderId, clientOrderId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#querySingleOrder");
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
| **symbol** | **String**| Option trading pair, e.g BTC-200730-9000-C | |
| **orderId** | **Long**| Order ID, e.g 4611875134427365377 | [optional] |
| **clientOrderId** | **String**| User-defined order ID, e.g 10000 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QuerySingleOrderResponse**](QuerySingleOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Single Order |  -  |

<a id="userExerciseRecord"></a>
# **userExerciseRecord**
> UserExerciseRecordResponse userExerciseRecord(symbol, startTime, endTime, limit, recvWindow)

User Exercise Record (USER_DATA)

Get account exercise records.  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | Option trading pair, e.g BTC-200730-9000-C
    Long startTime = 56L; // Long | Start Time, e.g 1593511200000
    Long endTime = 56L; // Long | End Time, e.g 1593512200000
    Long limit = 56L; // Long | Number of result sets returned Default:100 Max:1000
    Long recvWindow = 56L; // Long | 
    try {
      UserExerciseRecordResponse result = apiInstance.userExerciseRecord(symbol, startTime, endTime, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#userExerciseRecord");
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
| **symbol** | **String**| Option trading pair, e.g BTC-200730-9000-C | [optional] |
| **startTime** | **Long**| Start Time, e.g 1593511200000 | [optional] |
| **endTime** | **Long**| End Time, e.g 1593512200000 | [optional] |
| **limit** | **Long**| Number of result sets returned Default:100 Max:1000 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**UserExerciseRecordResponse**](UserExerciseRecordResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User Exercise Record |  -  |

