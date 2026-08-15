# UserDataStreamApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sessionSubscriptions**](UserDataStreamApi.md#sessionSubscriptions) | **POST** /session.subscriptions | Listing all subscriptions |
| [**userDataStreamSubscribe**](UserDataStreamApi.md#userDataStreamSubscribe) | **POST** /userDataStream.subscribe | Subscribe to User Data Stream |
| [**userDataStreamSubscribeSignature**](UserDataStreamApi.md#userDataStreamSubscribeSignature) | **POST** /userDataStream.subscribe.signature | Subscribe to User Data Stream through signature subscription (USER_STREAM) |
| [**userDataStreamUnsubscribe**](UserDataStreamApi.md#userDataStreamUnsubscribe) | **POST** /userDataStream.unsubscribe | WebSocket Unsubscribe from User Data Stream |


<a id="sessionSubscriptions"></a>
# **sessionSubscriptions**
> SessionSubscriptionsResponse sessionSubscriptions()

Listing all subscriptions

**Note:**  * Users should track the corresponding subscription status of related accounts as needed.  Weight(IP): 2  Security Type: NONE  Notes: **Data Source:** Memory

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
      SessionSubscriptionsResponse result = apiInstance.sessionSubscriptions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataStreamApi#sessionSubscriptions");
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

[**SessionSubscriptionsResponse**](SessionSubscriptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Listing all subscriptions |  -  |

<a id="userDataStreamSubscribe"></a>
# **userDataStreamSubscribe**
> UserDataStreamSubscribeResponse userDataStreamSubscribe()

Subscribe to User Data Stream

Subscribe to the User Data Stream in the current WebSocket connection.  **Notes:**   - This method requires an authenticated WebSocket connection using Ed25519 keys. Please refer to [&#x60;session.logon&#x60;](/catalog/core-trading-spot-trading/api/ws-api/auth#session-logon).   - To check the subscription status, use [&#x60;session.status&#x60;](/catalog/core-trading-spot-trading/api/ws-api/auth#session-status), see the &#x60;userDataStream&#x60; flag indicating you have have an active subscription.   - User Data Stream events are available in both JSON and [SBE](/products/spot/faqs/sbe_faq) sessions.     - Please refer to [User Data Streams](/products/spot/user-data-stream) for the event format details.     - For SBE, only SBE schema 2:1 or later is supported.  Weight(IP): 2  Security Type: NONE

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

<a id="userDataStreamSubscribeSignature"></a>
# **userDataStreamSubscribeSignature**
> UserDataStreamSubscribeSignatureResponse userDataStreamSubscribeSignature()

Subscribe to User Data Stream through signature subscription (USER_STREAM)

Weight(IP): 2  Security Type: USER_STREAM  Notes: **Data Source:** Memory

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
      UserDataStreamSubscribeSignatureResponse result = apiInstance.userDataStreamSubscribeSignature();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataStreamApi#userDataStreamSubscribeSignature");
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

[**UserDataStreamSubscribeSignatureResponse**](UserDataStreamSubscribeSignatureResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Subscribe to User Data Stream through signature subscription |  -  |

<a id="userDataStreamUnsubscribe"></a>
# **userDataStreamUnsubscribe**
> UserDataStreamUnsubscribeResponse userDataStreamUnsubscribe(userDataStreamUnsubscribeRequest)

WebSocket Unsubscribe from User Data Stream

Stop listening to the User Data Stream in the current WebSocket connection.  Note that &#x60;session.logout&#x60; will only close the subscription created with &#x60;userDataStream.subscribe&#x60; but not subscriptions opened with &#x60;userDataStream.subscribe.signature&#x60;.  Weight(IP): 2

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
    UserDataStreamUnsubscribeRequest userDataStreamUnsubscribeRequest = new UserDataStreamUnsubscribeRequest(); // UserDataStreamUnsubscribeRequest | 
    try {
      UserDataStreamUnsubscribeResponse result = apiInstance.userDataStreamUnsubscribe(userDataStreamUnsubscribeRequest);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userDataStreamUnsubscribeRequest** | [**UserDataStreamUnsubscribeRequest**](UserDataStreamUnsubscribeRequest.md)|  | [optional] |

### Return type

[**UserDataStreamUnsubscribeResponse**](UserDataStreamUnsubscribeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Unsubscribe from User Data Stream |  -  |

