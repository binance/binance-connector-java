# UserDataStreamsApi

All URIs are relative to *https://eapi.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**closeUserDataStream**](UserDataStreamsApi.md#closeUserDataStream) | **DELETE** /eapi/v1/listenKey | Close User Data Stream (USER_STREAM) |
| [**keepaliveUserDataStream**](UserDataStreamsApi.md#keepaliveUserDataStream) | **PUT** /eapi/v1/listenKey | Keepalive User Data Stream (USER_STREAM) |
| [**startUserDataStream**](UserDataStreamsApi.md#startUserDataStream) | **POST** /eapi/v1/listenKey | Start User Data Stream (USER_STREAM) |


<a id="closeUserDataStream"></a>
# **closeUserDataStream**
> closeUserDataStream()

Close User Data Stream (USER_STREAM)

Close out a user data stream.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.UserDataStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    UserDataStreamsApi apiInstance = new UserDataStreamsApi(defaultClient);
    try {
      apiInstance.closeUserDataStream();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataStreamsApi#closeUserDataStream");
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
> keepaliveUserDataStream()

Keepalive User Data Stream (USER_STREAM)

Keepalive a user data stream to prevent a time out. User data streams will close after 60 minutes. It&#39;s recommended to send a ping about every 60 minutes.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.UserDataStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    UserDataStreamsApi apiInstance = new UserDataStreamsApi(defaultClient);
    try {
      apiInstance.keepaliveUserDataStream();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataStreamsApi#keepaliveUserDataStream");
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

<a id="startUserDataStream"></a>
# **startUserDataStream**
> StartUserDataStreamResponse startUserDataStream()

Start User Data Stream (USER_STREAM)

Start a new user data stream. The stream will close after 60 minutes unless a keepalive is sent. If the account has an active &#x60;listenKey&#x60;, that &#x60;listenKey&#x60; will be returned and its validity will be extended for 60 minutes.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.UserDataStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    UserDataStreamsApi apiInstance = new UserDataStreamsApi(defaultClient);
    try {
      StartUserDataStreamResponse result = apiInstance.startUserDataStream();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataStreamsApi#startUserDataStream");
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

