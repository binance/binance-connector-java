# UserDataStreamsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**closeUserDataStream**](UserDataStreamsApi.md#closeUserDataStream) | **POST** /userDataStream.stop | Close User Data Stream (USER_STREAM) |
| [**keepaliveUserDataStream**](UserDataStreamsApi.md#keepaliveUserDataStream) | **POST** /userDataStream.ping | Keepalive User Data Stream (USER_STREAM) |
| [**startUserDataStream**](UserDataStreamsApi.md#startUserDataStream) | **POST** /userDataStream.start | Start User Data Stream (USER_STREAM) |


<a id="closeUserDataStream"></a>
# **closeUserDataStream**
> CloseUserDataStreamResponse closeUserDataStream(closeUserDataStreamRequest)

Close User Data Stream (USER_STREAM)

Close out a user data stream.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.api.UserDataStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    UserDataStreamsApi apiInstance = new UserDataStreamsApi(defaultClient);
    CloseUserDataStreamRequest closeUserDataStreamRequest = new CloseUserDataStreamRequest(); // CloseUserDataStreamRequest | 
    try {
      CloseUserDataStreamResponse result = apiInstance.closeUserDataStream(closeUserDataStreamRequest);
      System.out.println(result);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **closeUserDataStreamRequest** | [**CloseUserDataStreamRequest**](CloseUserDataStreamRequest.md)|  | |

### Return type

[**CloseUserDataStreamResponse**](CloseUserDataStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Close User Data Stream |  -  |

<a id="keepaliveUserDataStream"></a>
# **keepaliveUserDataStream**
> KeepaliveUserDataStreamResponse keepaliveUserDataStream(keepaliveUserDataStreamRequest)

Keepalive User Data Stream (USER_STREAM)

Keepalive a user data stream to prevent a time out. User data streams will close after 60 minutes. It&#39;s recommended to send a ping about every 60 minutes.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.api.UserDataStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    UserDataStreamsApi apiInstance = new UserDataStreamsApi(defaultClient);
    KeepaliveUserDataStreamRequest keepaliveUserDataStreamRequest = new KeepaliveUserDataStreamRequest(); // KeepaliveUserDataStreamRequest | 
    try {
      KeepaliveUserDataStreamResponse result = apiInstance.keepaliveUserDataStream(keepaliveUserDataStreamRequest);
      System.out.println(result);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **keepaliveUserDataStreamRequest** | [**KeepaliveUserDataStreamRequest**](KeepaliveUserDataStreamRequest.md)|  | |

### Return type

[**KeepaliveUserDataStreamResponse**](KeepaliveUserDataStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Keepalive User Data Stream |  -  |

<a id="startUserDataStream"></a>
# **startUserDataStream**
> StartUserDataStreamResponse startUserDataStream(startUserDataStreamRequest)

Start User Data Stream (USER_STREAM)

Start a new user data stream. The stream will close after 60 minutes unless a keepalive is sent. If the account has an active &#x60;listenKey&#x60;, that &#x60;listenKey&#x60; will be returned and its validity will be extended for 60 minutes.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.api.UserDataStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    UserDataStreamsApi apiInstance = new UserDataStreamsApi(defaultClient);
    StartUserDataStreamRequest startUserDataStreamRequest = new StartUserDataStreamRequest(); // StartUserDataStreamRequest | 
    try {
      StartUserDataStreamResponse result = apiInstance.startUserDataStream(startUserDataStreamRequest);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startUserDataStreamRequest** | [**StartUserDataStreamRequest**](StartUserDataStreamRequest.md)|  | |

### Return type

[**StartUserDataStreamResponse**](StartUserDataStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Start User Data Stream |  -  |

