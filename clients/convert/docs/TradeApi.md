# TradeApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acceptQuote**](TradeApi.md#acceptQuote) | **POST** /sapi/v1/convert/acceptQuote | Accept Quote (TRADE) |
| [**cancelLimitOrder**](TradeApi.md#cancelLimitOrder) | **POST** /sapi/v1/convert/limit/cancelOrder | Cancel limit order (USER_DATA) |
| [**getConvertTradeHistory**](TradeApi.md#getConvertTradeHistory) | **GET** /sapi/v1/convert/tradeFlow | Get Convert Trade History(USER_DATA) |
| [**orderStatus**](TradeApi.md#orderStatus) | **GET** /sapi/v1/convert/orderStatus | Order status(USER_DATA) |
| [**placeLimitOrder**](TradeApi.md#placeLimitOrder) | **POST** /sapi/v1/convert/limit/placeOrder | Place limit order (USER_DATA) |
| [**queryLimitOpenOrders**](TradeApi.md#queryLimitOpenOrders) | **POST** /sapi/v1/convert/limit/queryOpenOrders | Query limit open orders (USER_DATA) |
| [**sendQuoteRequest**](TradeApi.md#sendQuoteRequest) | **POST** /sapi/v1/convert/getQuote | Send Quote Request(USER_DATA) |


<a id="acceptQuote"></a>
# **acceptQuote**
> AcceptQuoteResponse acceptQuote(acceptQuoteRequest)

Accept Quote (TRADE)

Accept the offered quote by quote ID.  Weight: 500(UID)

### Example
```java
// Import classes:
import com.binance.connector.client.convert.ApiClient;
import com.binance.connector.client.convert.ApiException;
import com.binance.connector.client.convert.Configuration;
import com.binance.connector.client.convert.models.*;
import com.binance.connector.client.convert.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    AcceptQuoteRequest acceptQuoteRequest = new AcceptQuoteRequest(); // AcceptQuoteRequest | 
    try {
      AcceptQuoteResponse result = apiInstance.acceptQuote(acceptQuoteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#acceptQuote");
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
| **acceptQuoteRequest** | [**AcceptQuoteRequest**](AcceptQuoteRequest.md)|  | |

### Return type

[**AcceptQuoteResponse**](AcceptQuoteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Accept Quote |  -  |

<a id="cancelLimitOrder"></a>
# **cancelLimitOrder**
> CancelLimitOrderResponse cancelLimitOrder(cancelLimitOrderRequest)

Cancel limit order (USER_DATA)

Enable users to cancel a limit order  Weight: 200(UID)

### Example
```java
// Import classes:
import com.binance.connector.client.convert.ApiClient;
import com.binance.connector.client.convert.ApiException;
import com.binance.connector.client.convert.Configuration;
import com.binance.connector.client.convert.models.*;
import com.binance.connector.client.convert.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    CancelLimitOrderRequest cancelLimitOrderRequest = new CancelLimitOrderRequest(); // CancelLimitOrderRequest | 
    try {
      CancelLimitOrderResponse result = apiInstance.cancelLimitOrder(cancelLimitOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#cancelLimitOrder");
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
| **cancelLimitOrderRequest** | [**CancelLimitOrderRequest**](CancelLimitOrderRequest.md)|  | |

### Return type

[**CancelLimitOrderResponse**](CancelLimitOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cancel limit order |  -  |

<a id="getConvertTradeHistory"></a>
# **getConvertTradeHistory**
> GetConvertTradeHistoryResponse getConvertTradeHistory(startTime, endTime, limit, recvWindow)

Get Convert Trade History(USER_DATA)

Get Convert Trade History  * The max interval between startTime and endTime is 30 days.  Weight: 3000

### Example
```java
// Import classes:
import com.binance.connector.client.convert.ApiClient;
import com.binance.connector.client.convert.ApiException;
import com.binance.connector.client.convert.Configuration;
import com.binance.connector.client.convert.models.*;
import com.binance.connector.client.convert.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long limit = 56L; // Long | Default 100, Max 1000
    Long recvWindow = 56L; // Long | The value cannot be greater than 60000
    try {
      GetConvertTradeHistoryResponse result = apiInstance.getConvertTradeHistory(startTime, endTime, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#getConvertTradeHistory");
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
| **startTime** | **Long**|  | |
| **endTime** | **Long**|  | |
| **limit** | **Long**| Default 100, Max 1000 | [optional] |
| **recvWindow** | **Long**| The value cannot be greater than 60000 | [optional] |

### Return type

[**GetConvertTradeHistoryResponse**](GetConvertTradeHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Convert Trade History |  -  |

<a id="orderStatus"></a>
# **orderStatus**
> OrderStatusResponse orderStatus(orderId, quoteId)

Order status(USER_DATA)

Query order status by order ID.  Weight: 100(UID)

### Example
```java
// Import classes:
import com.binance.connector.client.convert.ApiClient;
import com.binance.connector.client.convert.ApiException;
import com.binance.connector.client.convert.Configuration;
import com.binance.connector.client.convert.models.*;
import com.binance.connector.client.convert.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String orderId = "orderId_example"; // String | Either orderId or quoteId is required
    String quoteId = "quoteId_example"; // String | Either orderId or quoteId is required
    try {
      OrderStatusResponse result = apiInstance.orderStatus(orderId, quoteId);
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
| **orderId** | **String**| Either orderId or quoteId is required | [optional] |
| **quoteId** | **String**| Either orderId or quoteId is required | [optional] |

### Return type

[**OrderStatusResponse**](OrderStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order status |  -  |

<a id="placeLimitOrder"></a>
# **placeLimitOrder**
> PlaceLimitOrderResponse placeLimitOrder(placeLimitOrderRequest)

Place limit order (USER_DATA)

Enable users to place a limit order  * &#x60;baseAsset&#x60; or &#x60;quoteAsset&#x60; can be determined via &#x60;exchangeInfo&#x60; endpoint. * Limit price is defined from &#x60;baseAsset&#x60; to &#x60;quoteAsset&#x60;. * Either &#x60;baseAmount&#x60; or &#x60;quoteAmount&#x60; is used.  Weight: 500(UID)

### Example
```java
// Import classes:
import com.binance.connector.client.convert.ApiClient;
import com.binance.connector.client.convert.ApiException;
import com.binance.connector.client.convert.Configuration;
import com.binance.connector.client.convert.models.*;
import com.binance.connector.client.convert.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    PlaceLimitOrderRequest placeLimitOrderRequest = new PlaceLimitOrderRequest(); // PlaceLimitOrderRequest | 
    try {
      PlaceLimitOrderResponse result = apiInstance.placeLimitOrder(placeLimitOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#placeLimitOrder");
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
| **placeLimitOrderRequest** | [**PlaceLimitOrderRequest**](PlaceLimitOrderRequest.md)|  | |

### Return type

[**PlaceLimitOrderResponse**](PlaceLimitOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Place limit order |  -  |

<a id="queryLimitOpenOrders"></a>
# **queryLimitOpenOrders**
> QueryLimitOpenOrdersResponse queryLimitOpenOrders(queryLimitOpenOrdersRequest)

Query limit open orders (USER_DATA)

Request a quote for the requested token pairs  Weight: 3000(UID)

### Example
```java
// Import classes:
import com.binance.connector.client.convert.ApiClient;
import com.binance.connector.client.convert.ApiException;
import com.binance.connector.client.convert.Configuration;
import com.binance.connector.client.convert.models.*;
import com.binance.connector.client.convert.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    QueryLimitOpenOrdersRequest queryLimitOpenOrdersRequest = new QueryLimitOpenOrdersRequest(); // QueryLimitOpenOrdersRequest | 
    try {
      QueryLimitOpenOrdersResponse result = apiInstance.queryLimitOpenOrders(queryLimitOpenOrdersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryLimitOpenOrders");
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
| **queryLimitOpenOrdersRequest** | [**QueryLimitOpenOrdersRequest**](QueryLimitOpenOrdersRequest.md)|  | |

### Return type

[**QueryLimitOpenOrdersResponse**](QueryLimitOpenOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | limit open orders |  -  |

<a id="sendQuoteRequest"></a>
# **sendQuoteRequest**
> SendQuoteRequestResponse sendQuoteRequest(sendQuoteRequestRequest)

Send Quote Request(USER_DATA)

Request a quote for the requested token pairs  * Either fromAmount or toAmount should be sent * &#x60;quoteId&#x60; will be returned only if you have enough funds to convert  Weight: 200(UID)

### Example
```java
// Import classes:
import com.binance.connector.client.convert.ApiClient;
import com.binance.connector.client.convert.ApiException;
import com.binance.connector.client.convert.Configuration;
import com.binance.connector.client.convert.models.*;
import com.binance.connector.client.convert.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    SendQuoteRequestRequest sendQuoteRequestRequest = new SendQuoteRequestRequest(); // SendQuoteRequestRequest | 
    try {
      SendQuoteRequestResponse result = apiInstance.sendQuoteRequest(sendQuoteRequestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#sendQuoteRequest");
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
| **sendQuoteRequestRequest** | [**SendQuoteRequestRequest**](SendQuoteRequestRequest.md)|  | |

### Return type

[**SendQuoteRequestResponse**](SendQuoteRequestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Send Quote Request |  -  |

