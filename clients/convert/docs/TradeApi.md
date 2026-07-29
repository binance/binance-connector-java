# TradeApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acceptQuote**](TradeApi.md#acceptQuote) | **POST** /sapi/v1/convert/acceptQuote | Accept Quote (TRADE) |
| [**cancelLimitOrder**](TradeApi.md#cancelLimitOrder) | **POST** /sapi/v1/convert/limit/cancelOrder | Cancel limit order (TRADE) |
| [**getConvertTradeHistory**](TradeApi.md#getConvertTradeHistory) | **GET** /sapi/v1/convert/tradeFlow | Get Convert Trade History (USER_DATA) |
| [**orderStatus**](TradeApi.md#orderStatus) | **GET** /sapi/v1/convert/orderStatus | Order status (USER_DATA) |
| [**placeLimitOrder**](TradeApi.md#placeLimitOrder) | **POST** /sapi/v1/convert/limit/placeOrder | Place limit order (TRADE) |
| [**queryLimitOpenOrders**](TradeApi.md#queryLimitOpenOrders) | **GET** /sapi/v1/convert/limit/queryOpenOrders | Query limit open orders (USER_DATA) |
| [**sendQuoteRequest**](TradeApi.md#sendQuoteRequest) | **POST** /sapi/v1/convert/getQuote | Send Quote Request (TRADE) |


<a id="acceptQuote"></a>
# **acceptQuote**
> AcceptQuoteResponse acceptQuote(acceptQuoteRequest)

Accept Quote (TRADE)

Accept the offered quote by quote ID.  Weight(UID): 500  Security Type: TRADE

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

Cancel limit order (TRADE)

Enable users to cancel a limit order  Weight(UID): 200  Security Type: TRADE

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

Get Convert Trade History (USER_DATA)

Get Convert Trade History  Weight(UID): 3000  Security Type: USER_DATA  Notes: - The max interval between &#x60;startTime&#x60; and &#x60;endTime&#x60; is 30 days.

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
    Long startTime = 1623319461670L; // Long | 
    Long endTime = 1641782889000L; // Long | 
    Long limit = 100L; // Long | Number of records to return
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
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
| **limit** | **Long**| Number of records to return | [optional] |
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

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

Order status (USER_DATA)

Query order status by order ID.  Weight(UID): 100  Security Type: USER_DATA

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
    String orderId = "1"; // String | Either orderId or quoteId is required
    String quoteId = "1"; // String | Either orderId or quoteId is required
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

Place limit order (TRADE)

Enable users to place a limit order  Weight(UID): 500  Security Type: TRADE  Notes: - &#x60;baseAsset&#x60; and &#x60;quoteAsset&#x60; can be determined via the &#x60;exchangeInfo&#x60; endpoint. - Limit price is defined from &#x60;baseAsset&#x60; to &#x60;quoteAsset&#x60;. - Exactly one of &#x60;baseAmount&#x60; or &#x60;quoteAmount&#x60; should be sent.

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
> QueryLimitOpenOrdersResponse queryLimitOpenOrders(recvWindow)

Query limit open orders (USER_DATA)

Query current open limit orders  Weight(UID): 3000  Security Type: USER_DATA

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
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
    try {
      QueryLimitOpenOrdersResponse result = apiInstance.queryLimitOpenOrders(recvWindow);
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
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

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

Send Quote Request (TRADE)

Request a quote for the requested token pairs  Weight(UID): 200  Security Type: TRADE  Notes: - Either &#x60;fromAmount&#x60; or &#x60;toAmount&#x60; should be sent. - &#x60;quoteId&#x60; is returned only if you have enough funds to convert.

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

