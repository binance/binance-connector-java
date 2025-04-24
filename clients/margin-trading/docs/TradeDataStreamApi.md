# TradeDataStreamApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**closeIsolatedMarginUserDataStream**](TradeDataStreamApi.md#closeIsolatedMarginUserDataStream) | **DELETE** /sapi/v1/userDataStream/isolated | Close Isolated Margin User Data Stream (USER_STREAM) |
| [**closeMarginUserDataStream**](TradeDataStreamApi.md#closeMarginUserDataStream) | **DELETE** /sapi/v1/userDataStream | Close Margin User Data Stream (USER_STREAM) |
| [**keepaliveIsolatedMarginUserDataStream**](TradeDataStreamApi.md#keepaliveIsolatedMarginUserDataStream) | **PUT** /sapi/v1/userDataStream/isolated | Keepalive Isolated Margin User Data Stream (USER_STREAM) |
| [**keepaliveMarginUserDataStream**](TradeDataStreamApi.md#keepaliveMarginUserDataStream) | **PUT** /sapi/v1/userDataStream | Keepalive Margin User Data Stream (USER_STREAM) |
| [**startIsolatedMarginUserDataStream**](TradeDataStreamApi.md#startIsolatedMarginUserDataStream) | **POST** /sapi/v1/userDataStream/isolated | Start Isolated Margin User Data Stream (USER_STREAM) |
| [**startMarginUserDataStream**](TradeDataStreamApi.md#startMarginUserDataStream) | **POST** /sapi/v1/userDataStream | Start Margin User Data Stream (USER_STREAM) |


<a id="closeIsolatedMarginUserDataStream"></a>
# **closeIsolatedMarginUserDataStream**
> closeIsolatedMarginUserDataStream(symbol, listenkey)

Close Isolated Margin User Data Stream (USER_STREAM)

Close out a isolated margin user data stream.  Weight: 3000

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeDataStreamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeDataStreamApi apiInstance = new TradeDataStreamApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    String listenkey = "listenkey_example"; // String | 
    try {
      apiInstance.closeIsolatedMarginUserDataStream(symbol, listenkey);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeDataStreamApi#closeIsolatedMarginUserDataStream");
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
| **symbol** | **String**|  | |
| **listenkey** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="closeMarginUserDataStream"></a>
# **closeMarginUserDataStream**
> closeMarginUserDataStream(listenkey)

Close Margin User Data Stream (USER_STREAM)

Close out a Margin user data stream.  Weight: 3000

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeDataStreamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeDataStreamApi apiInstance = new TradeDataStreamApi(defaultClient);
    String listenkey = "listenkey_example"; // String | 
    try {
      apiInstance.closeMarginUserDataStream(listenkey);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeDataStreamApi#closeMarginUserDataStream");
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
| **listenkey** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="keepaliveIsolatedMarginUserDataStream"></a>
# **keepaliveIsolatedMarginUserDataStream**
> keepaliveIsolatedMarginUserDataStream(keepaliveIsolatedMarginUserDataStreamRequest)

Keepalive Isolated Margin User Data Stream (USER_STREAM)

Keepalive an isolated margin user data stream to prevent a time out.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeDataStreamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeDataStreamApi apiInstance = new TradeDataStreamApi(defaultClient);
    KeepaliveIsolatedMarginUserDataStreamRequest keepaliveIsolatedMarginUserDataStreamRequest = new KeepaliveIsolatedMarginUserDataStreamRequest(); // KeepaliveIsolatedMarginUserDataStreamRequest | 
    try {
      apiInstance.keepaliveIsolatedMarginUserDataStream(keepaliveIsolatedMarginUserDataStreamRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeDataStreamApi#keepaliveIsolatedMarginUserDataStream");
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
| **keepaliveIsolatedMarginUserDataStreamRequest** | [**KeepaliveIsolatedMarginUserDataStreamRequest**](KeepaliveIsolatedMarginUserDataStreamRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="keepaliveMarginUserDataStream"></a>
# **keepaliveMarginUserDataStream**
> keepaliveMarginUserDataStream(keepaliveMarginUserDataStreamRequest)

Keepalive Margin User Data Stream (USER_STREAM)

Keepalive a margin user data stream to prevent a time out.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeDataStreamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeDataStreamApi apiInstance = new TradeDataStreamApi(defaultClient);
    KeepaliveMarginUserDataStreamRequest keepaliveMarginUserDataStreamRequest = new KeepaliveMarginUserDataStreamRequest(); // KeepaliveMarginUserDataStreamRequest | 
    try {
      apiInstance.keepaliveMarginUserDataStream(keepaliveMarginUserDataStreamRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeDataStreamApi#keepaliveMarginUserDataStream");
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
| **keepaliveMarginUserDataStreamRequest** | [**KeepaliveMarginUserDataStreamRequest**](KeepaliveMarginUserDataStreamRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="startIsolatedMarginUserDataStream"></a>
# **startIsolatedMarginUserDataStream**
> StartIsolatedMarginUserDataStreamResponse startIsolatedMarginUserDataStream(startIsolatedMarginUserDataStreamRequest)

Start Isolated Margin User Data Stream (USER_STREAM)

Start a new isolated margin user data stream. The stream will close after 60 minutes unless a keepalive is sent. If the account has an active listenKey, that listenKey will be returned and its validity will be extended for 60 minutes.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeDataStreamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeDataStreamApi apiInstance = new TradeDataStreamApi(defaultClient);
    StartIsolatedMarginUserDataStreamRequest startIsolatedMarginUserDataStreamRequest = new StartIsolatedMarginUserDataStreamRequest(); // StartIsolatedMarginUserDataStreamRequest | 
    try {
      StartIsolatedMarginUserDataStreamResponse result = apiInstance.startIsolatedMarginUserDataStream(startIsolatedMarginUserDataStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeDataStreamApi#startIsolatedMarginUserDataStream");
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
| **startIsolatedMarginUserDataStreamRequest** | [**StartIsolatedMarginUserDataStreamRequest**](StartIsolatedMarginUserDataStreamRequest.md)|  | |

### Return type

[**StartIsolatedMarginUserDataStreamResponse**](StartIsolatedMarginUserDataStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Start Isolated Margin User Data Stream |  -  |

<a id="startMarginUserDataStream"></a>
# **startMarginUserDataStream**
> StartMarginUserDataStreamResponse startMarginUserDataStream()

Start Margin User Data Stream (USER_STREAM)

Start a new margin user data stream. The stream will close after 60 minutes unless a keepalive is sent. If the account has an active listenKey, that listenKey will be returned and its validity will be extended for 60 minutes.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeDataStreamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeDataStreamApi apiInstance = new TradeDataStreamApi(defaultClient);
    try {
      StartMarginUserDataStreamResponse result = apiInstance.startMarginUserDataStream();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeDataStreamApi#startMarginUserDataStream");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**StartMarginUserDataStreamResponse**](StartMarginUserDataStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Start Margin User Data Stream |  -  |

