# RiskDataStreamApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**closeUserDataStream**](RiskDataStreamApi.md#closeUserDataStream) | **DELETE** /sapi/v1/margin/listen-key | Close User Data Stream (USER_STREAM) |
| [**keepaliveUserDataStream**](RiskDataStreamApi.md#keepaliveUserDataStream) | **PUT** /sapi/v1/margin/listen-key | Keepalive User Data Stream (USER_STREAM) |
| [**startUserDataStream**](RiskDataStreamApi.md#startUserDataStream) | **POST** /sapi/v1/margin/listen-key | Start User Data Stream (USER_STREAM) |


<a id="closeUserDataStream"></a>
# **closeUserDataStream**
> closeUserDataStream()

Close User Data Stream (USER_STREAM)

Close out a user data stream.  Weight: 3000

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.RiskDataStreamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    RiskDataStreamApi apiInstance = new RiskDataStreamApi(defaultClient);
    try {
      apiInstance.closeUserDataStream();
    } catch (ApiException e) {
      System.err.println("Exception when calling RiskDataStreamApi#closeUserDataStream");
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

<a id="keepaliveUserDataStream"></a>
# **keepaliveUserDataStream**
> keepaliveUserDataStream(keepaliveUserDataStreamRequest)

Keepalive User Data Stream (USER_STREAM)

Keepalive a user data stream to prevent a time out.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.RiskDataStreamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    RiskDataStreamApi apiInstance = new RiskDataStreamApi(defaultClient);
    KeepaliveUserDataStreamRequest keepaliveUserDataStreamRequest = new KeepaliveUserDataStreamRequest(); // KeepaliveUserDataStreamRequest | 
    try {
      apiInstance.keepaliveUserDataStream(keepaliveUserDataStreamRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling RiskDataStreamApi#keepaliveUserDataStream");
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
| **keepaliveUserDataStreamRequest** | [**KeepaliveUserDataStreamRequest**](KeepaliveUserDataStreamRequest.md)|  | |

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

<a id="startUserDataStream"></a>
# **startUserDataStream**
> StartUserDataStreamResponse startUserDataStream()

Start User Data Stream (USER_STREAM)

Start a new user data stream.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.RiskDataStreamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    RiskDataStreamApi apiInstance = new RiskDataStreamApi(defaultClient);
    try {
      StartUserDataStreamResponse result = apiInstance.startUserDataStream();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RiskDataStreamApi#startUserDataStream");
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

[**StartUserDataStreamResponse**](StartUserDataStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Start User Data Stream |  -  |

