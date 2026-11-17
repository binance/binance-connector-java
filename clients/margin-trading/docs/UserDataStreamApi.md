# UserDataStreamApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**closeUserDataStream**](UserDataStreamApi.md#closeUserDataStream) | **DELETE** /sapi/v1/margin/listen-key | Close User Data Stream (USER_STREAM) |
| [**closeUserDataStreamV2**](UserDataStreamApi.md#closeUserDataStreamV2) | **DELETE** /sapi/v2/margin/listen-key | Close User Data Stream V2 (USER_STREAM) |
| [**keepaliveUserDataStream**](UserDataStreamApi.md#keepaliveUserDataStream) | **PUT** /sapi/v1/margin/listen-key | Keepalive User Data Stream (USER_STREAM) |
| [**keepaliveUserDataStreamV2**](UserDataStreamApi.md#keepaliveUserDataStreamV2) | **PUT** /sapi/v2/margin/listen-key | Keepalive User Data Stream V2 (USER_STREAM) |
| [**startUserDataStream**](UserDataStreamApi.md#startUserDataStream) | **POST** /sapi/v1/margin/listen-key | Start User Data Stream (USER_STREAM) |
| [**startUserDataStreamV2**](UserDataStreamApi.md#startUserDataStreamV2) | **POST** /sapi/v2/margin/listen-key | Start User Data Stream V2 (USER_STREAM) |


<a id="closeUserDataStream"></a>
# **closeUserDataStream**
> closeUserDataStream()

Close User Data Stream (USER_STREAM)

Close out a user data stream.  Weight(UID): 3000  Security Type: USER_STREAM

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.UserDataStreamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    UserDataStreamApi apiInstance = new UserDataStreamApi(defaultClient);
    try {
      apiInstance.closeUserDataStream();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataStreamApi#closeUserDataStream");
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

<a id="closeUserDataStreamV2"></a>
# **closeUserDataStreamV2**
> closeUserDataStreamV2()

Close User Data Stream V2 (USER_STREAM)

Close out a user data stream.  Weight(IP): 1  Security Type: USER_STREAM

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.UserDataStreamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    UserDataStreamApi apiInstance = new UserDataStreamApi(defaultClient);
    try {
      apiInstance.closeUserDataStreamV2();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataStreamApi#closeUserDataStreamV2");
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

Keepalive a user data stream to prevent a time out.  Weight(UID): 1  Security Type: USER_STREAM

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.UserDataStreamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    UserDataStreamApi apiInstance = new UserDataStreamApi(defaultClient);
    KeepaliveUserDataStreamRequest keepaliveUserDataStreamRequest = new KeepaliveUserDataStreamRequest(); // KeepaliveUserDataStreamRequest | 
    try {
      apiInstance.keepaliveUserDataStream(keepaliveUserDataStreamRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataStreamApi#keepaliveUserDataStream");
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

<a id="keepaliveUserDataStreamV2"></a>
# **keepaliveUserDataStreamV2**
> keepaliveUserDataStreamV2(keepaliveUserDataStreamV2Request)

Keepalive User Data Stream V2 (USER_STREAM)

Keepalive a user data stream to prevent a time out.  Weight(IP): 1  Security Type: USER_STREAM

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.UserDataStreamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    UserDataStreamApi apiInstance = new UserDataStreamApi(defaultClient);
    KeepaliveUserDataStreamV2Request keepaliveUserDataStreamV2Request = new KeepaliveUserDataStreamV2Request(); // KeepaliveUserDataStreamV2Request | 
    try {
      apiInstance.keepaliveUserDataStreamV2(keepaliveUserDataStreamV2Request);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataStreamApi#keepaliveUserDataStreamV2");
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
| **keepaliveUserDataStreamV2Request** | [**KeepaliveUserDataStreamV2Request**](KeepaliveUserDataStreamV2Request.md)|  | |

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

Start a new user data stream.  Weight(UID): 1  Security Type: USER_STREAM

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.UserDataStreamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    UserDataStreamApi apiInstance = new UserDataStreamApi(defaultClient);
    try {
      StartUserDataStreamResponse result = apiInstance.startUserDataStream();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataStreamApi#startUserDataStream");
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

<a id="startUserDataStreamV2"></a>
# **startUserDataStreamV2**
> StartUserDataStreamV2Response startUserDataStreamV2()

Start User Data Stream V2 (USER_STREAM)

Start a new user data stream.  Weight(IP): 1  Security Type: USER_STREAM

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.UserDataStreamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    UserDataStreamApi apiInstance = new UserDataStreamApi(defaultClient);
    try {
      StartUserDataStreamV2Response result = apiInstance.startUserDataStreamV2();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataStreamApi#startUserDataStreamV2");
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

[**StartUserDataStreamV2Response**](StartUserDataStreamV2Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Start User Data Stream |  -  |

