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
| [**placeMultipleOrders**](TradeApi.md#placeMultipleOrders) | **POST** /eapi/v1/batchOrders | Place Multiple Orders (TRADE) |
| [**queryCurrentOpenOptionOrders**](TradeApi.md#queryCurrentOpenOptionOrders) | **GET** /eapi/v1/openOrders | Query Current Open Option Orders (USER_DATA) |
| [**queryOptionOrderHistory**](TradeApi.md#queryOptionOrderHistory) | **GET** /eapi/v1/historyOrders | Query Option Order History (TRADE) |
| [**querySingleOrder**](TradeApi.md#querySingleOrder) | **GET** /eapi/v1/order | Query Single Order (TRADE) |
| [**tradfiOptionsContract**](TradeApi.md#tradfiOptionsContract) | **POST** /eapi/v1/stock/contract | TradFi Options Contract (USER_DATA) |
| [**userCommission**](TradeApi.md#userCommission) | **GET** /eapi/v1/commission | User Commission (USER_DATA) |
| [**userExerciseRecord**](TradeApi.md#userExerciseRecord) | **GET** /eapi/v1/exerciseRecord | User Exercise Record (USER_DATA) |


<a id="accountTradeList"></a>
# **accountTradeList**
> AccountTradeListResponse accountTradeList(symbol, fromId, startTime, endTime, limit, recvWindow)

Account Trade List (USER_DATA)

Get trades for a specific account and symbol.  Weight(IP): 5  Security Type: USER_DATA

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
    String symbol = "BTC-200730-9000-C"; // String | Option trading pair.
    Long fromId = 1L; // Long | Trade id to fetch from. Default gets most recent trades, e.g 4611875134427365376
    Long startTime = 1623319461670L; // Long | Start Time, e.g 1593511200000
    Long endTime = 1641782889000L; // Long | End Time, e.g 1593512200000
    Long limit = 20L; // Long | Number of result sets returned.
    Long recvWindow = 5000L; // Long | Recv Window.
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
| **symbol** | **String**| Option trading pair. | |
| **fromId** | **Long**| Trade id to fetch from. Default gets most recent trades, e.g 4611875134427365376 | [optional] |
| **startTime** | **Long**| Start Time, e.g 1593511200000 | [optional] |
| **endTime** | **Long**| End Time, e.g 1593512200000 | [optional] |
| **limit** | **Long**| Number of result sets returned. | [optional] |
| **recvWindow** | **Long**| Recv Window. | [optional] |

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

Cancel all active orders on specified underlying.  Weight(IP): 5  Security Type: TRADE

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
    String underlying = "BTCUSDT"; // String | Underlying asset.
    Long recvWindow = 5000L; // Long | Recv Window.
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
| **underlying** | **String**| Underlying asset. | |
| **recvWindow** | **Long**| Recv Window. | [optional] |

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

Cancel all active order on a symbol.  Weight(IP): 1  Security Type: TRADE

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
    String symbol = "BTC-200730-9000-C"; // String | Option trading pair.
    Long recvWindow = 5000L; // Long | Recv Window.
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
| **symbol** | **String**| Option trading pair. | |
| **recvWindow** | **Long**| Recv Window. | [optional] |

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

Cancel multiple orders.  Weight(IP): 5  Security Type: TRADE  Notes: - At least one instance of &#x60;orderId&#x60; and &#x60;clientOrderId&#x60; must be sent.

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
    String symbol = "BTC-200730-9000-C"; // String | Option trading pair.
    OrderIds orderIds = Arrays.asList(); // OrderIds | Order ID list.
    ClientOrderIds clientOrderIds = Arrays.asList(); // ClientOrderIds | Client order ID list.
    Long recvWindow = 5000L; // Long | Recv Window.
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
| **symbol** | **String**| Option trading pair. | |
| **orderIds** | [**OrderIds**](Long.md)| Order ID list. | [optional] |
| **clientOrderIds** | [**ClientOrderIds**](String.md)| Client order ID list. | [optional] |
| **recvWindow** | **Long**| Recv Window. | [optional] |

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

Cancel an active order.  Weight(IP): 1  Security Type: TRADE  Notes: - At least one instance of &#x60;orderId&#x60; and &#x60;clientOrderId&#x60; must be sent.

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
    String symbol = "BTC-200730-9000-C"; // String | Option trading pair.
    Long orderId = 4611875134427365000L; // Long | Order ID.
    String clientOrderId = "10000"; // String | clientOrderId
    Long recvWindow = 5000L; // Long | Recv Window.
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
| **symbol** | **String**| Option trading pair. | |
| **orderId** | **Long**| Order ID. | [optional] |
| **clientOrderId** | **String**| clientOrderId | [optional] |
| **recvWindow** | **Long**| Recv Window. | [optional] |

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

Send a new order.  Weight(IP): 0  Security Type: TRADE  Notes: Some parameters are mandatory depending on the order type as follows:  Type | Mandatory parameters ------------ | ------------  LIMIT | timeInForce, quantity, price

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

Get current position information.  Weight(IP): 5  Security Type: USER_DATA

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
    String symbol = "BTC-200730-9000-C"; // String | Option trading pair.
    Long recvWindow = 5000L; // Long | Recv Window.
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
| **symbol** | **String**| Option trading pair. | [optional] |
| **recvWindow** | **Long**| Recv Window. | [optional] |

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

Place Multiple Orders (TRADE)

Send multiple option orders.  Weight(IP): 5  Security Type: TRADE  Notes: Some parameters are mandatory depending on the order type as follows:  Type | Mandatory parameters ------------ | ------------  LIMIT | timeInForce, quantity, price  - Parameter rules are same with New Order - Batch orders are processed concurrently, and the order of matching is not guaranteed.

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

Query current all open orders, status: ACCEPTED PARTIALLY_FILLED  Weight: 1 for a single symbol; 40 when the symbol parameter is omitted  Security Type: USER_DATA

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
    String symbol = "BTC-200730-9000-C"; // String | Option trading pair.
    Long orderId = 4611875134427365000L; // Long | Order ID.
    Long startTime = 1623319461670L; // Long | Start Time, e.g 1593511200000
    Long endTime = 1641782889000L; // Long | End Time, e.g 1593512200000
    Long recvWindow = 5000L; // Long | Recv Window.
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
| **symbol** | **String**| Option trading pair. | [optional] |
| **orderId** | **Long**| Order ID. | [optional] |
| **startTime** | **Long**| Start Time, e.g 1593511200000 | [optional] |
| **endTime** | **Long**| End Time, e.g 1593512200000 | [optional] |
| **recvWindow** | **Long**| Recv Window. | [optional] |

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

Query all finished orders within 5 days, finished status: CANCELLED FILLED REJECTED.  Weight(IP): 3  Security Type: TRADE

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
    String symbol = "BTC-200730-9000-C"; // String | Option trading pair.
    Long orderId = 4611875134427365000L; // Long | Order ID.
    Long startTime = 1623319461670L; // Long | Start Time, e.g 1593511200000
    Long endTime = 1641782889000L; // Long | End Time, e.g 1593512200000
    Long limit = 20L; // Long | Number of result sets returned
    Long recvWindow = 5000L; // Long | Recv Window.
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
| **symbol** | **String**| Option trading pair. | |
| **orderId** | **Long**| Order ID. | [optional] |
| **startTime** | **Long**| Start Time, e.g 1593511200000 | [optional] |
| **endTime** | **Long**| End Time, e.g 1593512200000 | [optional] |
| **limit** | **Long**| Number of result sets returned | [optional] |
| **recvWindow** | **Long**| Recv Window. | [optional] |

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

Check an order status.  * These orders will not be found:   * order status is &#x60;CANCELED&#x60; or &#x60;REJECTED&#x60;, **AND**   * order has NO filled trade, **AND**   * created time + 3 days &lt; current time  Weight(IP): 1  Security Type: TRADE  Notes: - Either &#x60;orderId&#x60; or &#x60;clientOrderId &#x60; must be sent.

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
    String symbol = "BTC-200730-9000-C"; // String | Option trading pair.
    Long orderId = 4611875134427365000L; // Long | Order ID.
    String clientOrderId = "abc123"; // String | User-defined order ID; cannot be duplicated among open orders.
    Long recvWindow = 5000L; // Long | Recv Window.
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
| **symbol** | **String**| Option trading pair. | |
| **orderId** | **Long**| Order ID. | [optional] |
| **clientOrderId** | **String**| User-defined order ID; cannot be duplicated among open orders. | [optional] |
| **recvWindow** | **Long**| Recv Window. | [optional] |

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

<a id="tradfiOptionsContract"></a>
# **tradfiOptionsContract**
> TradfiOptionsContractResponse tradfiOptionsContract(tradfiOptionsContractRequest)

TradFi Options Contract (USER_DATA)

Sign TradFi Options agreement contract  Weight(IP): 50  Security Type: USER_DATA

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
    TradfiOptionsContractRequest tradfiOptionsContractRequest = new TradfiOptionsContractRequest(); // TradfiOptionsContractRequest | 
    try {
      TradfiOptionsContractResponse result = apiInstance.tradfiOptionsContract(tradfiOptionsContractRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#tradfiOptionsContract");
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
| **tradfiOptionsContractRequest** | [**TradfiOptionsContractRequest**](TradfiOptionsContractRequest.md)|  | [optional] |

### Return type

[**TradfiOptionsContractResponse**](TradfiOptionsContractResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | TradFi Options Contract |  -  |

<a id="userCommission"></a>
# **userCommission**
> UserCommissionResponse userCommission(recvWindow)

User Commission (USER_DATA)

Get account commission.  Weight(IP): 5  Security Type: USER_DATA

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
    Long recvWindow = 5000L; // Long | Recv Window.
    try {
      UserCommissionResponse result = apiInstance.userCommission(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#userCommission");
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
| **recvWindow** | **Long**| Recv Window. | [optional] |

### Return type

[**UserCommissionResponse**](UserCommissionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User Commission |  -  |

<a id="userExerciseRecord"></a>
# **userExerciseRecord**
> UserExerciseRecordResponse userExerciseRecord(symbol, startTime, endTime, limit, recvWindow)

User Exercise Record (USER_DATA)

Get account exercise records.  Weight(IP): 5  Security Type: USER_DATA

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
    String symbol = "BTC-200730-9000-C"; // String | Option trading pair.
    Long startTime = 1623319461670L; // Long | Start Time, e.g 1593511200000
    Long endTime = 1641782889000L; // Long | End Time, e.g 1593512200000
    Long limit = 20L; // Long | Number of result sets returned.
    Long recvWindow = 5000L; // Long | Recv Window.
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
| **symbol** | **String**| Option trading pair. | [optional] |
| **startTime** | **Long**| Start Time, e.g 1593511200000 | [optional] |
| **endTime** | **Long**| End Time, e.g 1593512200000 | [optional] |
| **limit** | **Long**| Number of result sets returned. | [optional] |
| **recvWindow** | **Long**| Recv Window. | [optional] |

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

