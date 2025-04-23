# UserDataStreamApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**userDataStreamPing**](UserDataStreamApi.md#userDataStreamPing) | **POST** /userDataStream.ping | WebSocket Ping user data stream |
| [**userDataStreamStart**](UserDataStreamApi.md#userDataStreamStart) | **POST** /userDataStream.start | WebSocket Start user data stream |
| [**userDataStreamStop**](UserDataStreamApi.md#userDataStreamStop) | **POST** /userDataStream.stop | WebSocket Stop user data stream |
| [**userDataStreamSubscribe**](UserDataStreamApi.md#userDataStreamSubscribe) | **POST** /userDataStream.subscribe | WebSocket Subscribe to User Data Stream |
| [**userDataStreamUnsubscribe**](UserDataStreamApi.md#userDataStreamUnsubscribe) | **POST** /userDataStream.unsubscribe | WebSocket Unsubscribe from User Data Stream |


<a id="userDataStreamPing"></a>
# **userDataStreamPing**
> UserDataStreamPingResponse userDataStreamPing(userDataStreamPingRequest)

WebSocket Ping user data stream

Ping a user data stream to keep it alive.  User data streams close automatically after 60 minutes, even if you&#39;re listening to them on WebSocket Streams. In order to keep the stream open, you have to regularly send pings using the &#x60;userDataStream.ping&#x60; request.  It is recommended to send a ping once every 30 minutes. Weight: 2

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.UserDataStreamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    UserDataStreamApi apiInstance = new UserDataStreamApi(defaultClient);
    UserDataStreamPingRequest userDataStreamPingRequest = new UserDataStreamPingRequest(); // UserDataStreamPingRequest | 
    try {
      UserDataStreamPingResponse result = apiInstance.userDataStreamPing(userDataStreamPingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataStreamApi#userDataStreamPing");
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
| **userDataStreamPingRequest** | [**UserDataStreamPingRequest**](UserDataStreamPingRequest.md)|  | |

### Return type

[**UserDataStreamPingResponse**](UserDataStreamPingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ping user data stream |  -  |

<a id="userDataStreamStart"></a>
# **userDataStreamStart**
> UserDataStreamStartResponse userDataStreamStart()

WebSocket Start user data stream

Start a new user data stream. Weight: 2

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.UserDataStreamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    UserDataStreamApi apiInstance = new UserDataStreamApi(defaultClient);
    try {
      UserDataStreamStartResponse result = apiInstance.userDataStreamStart();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataStreamApi#userDataStreamStart");
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

[**UserDataStreamStartResponse**](UserDataStreamStartResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Start user data stream |  -  |

<a id="userDataStreamStop"></a>
# **userDataStreamStop**
> UserDataStreamStopResponse userDataStreamStop(userDataStreamStopRequest)

WebSocket Stop user data stream

Explicitly stop and close the user data stream. Weight: 2

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.UserDataStreamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    UserDataStreamApi apiInstance = new UserDataStreamApi(defaultClient);
    UserDataStreamStopRequest userDataStreamStopRequest = new UserDataStreamStopRequest(); // UserDataStreamStopRequest | 
    try {
      UserDataStreamStopResponse result = apiInstance.userDataStreamStop(userDataStreamStopRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataStreamApi#userDataStreamStop");
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
| **userDataStreamStopRequest** | [**UserDataStreamStopRequest**](UserDataStreamStopRequest.md)|  | |

### Return type

[**UserDataStreamStopResponse**](UserDataStreamStopResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Stop user data stream |  -  |

<a id="userDataStreamSubscribe"></a>
# **userDataStreamSubscribe**
> UserDataStreamSubscribeResponse userDataStreamSubscribe()

WebSocket Subscribe to User Data Stream

Subscribe to the User Data Stream in the current WebSocket connection. Weight: 2

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.UserDataStreamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    UserDataStreamApi apiInstance = new UserDataStreamApi(defaultClient);
    try {
      UserDataStreamSubscribeResponse result = apiInstance.userDataStreamSubscribe();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataStreamApi#userDataStreamSubscribe");
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

[**UserDataStreamSubscribeResponse**](UserDataStreamSubscribeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Subscribe to User Data Stream |  -  |

<a id="userDataStreamUnsubscribe"></a>
# **userDataStreamUnsubscribe**
> UserDataStreamUnsubscribeResponse userDataStreamUnsubscribe()

WebSocket Unsubscribe from User Data Stream

Stop listening to the User Data Stream in the current WebSocket connection. Weight: 2

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.UserDataStreamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    UserDataStreamApi apiInstance = new UserDataStreamApi(defaultClient);
    try {
      UserDataStreamUnsubscribeResponse result = apiInstance.userDataStreamUnsubscribe();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataStreamApi#userDataStreamUnsubscribe");
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

[**UserDataStreamUnsubscribeResponse**](UserDataStreamUnsubscribeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Unsubscribe from User Data Stream |  -  |

