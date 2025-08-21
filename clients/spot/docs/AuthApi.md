# AuthApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sessionLogon**](AuthApi.md#sessionLogon) | **POST** /session.logon | WebSocket Log in with API key |
| [**sessionLogout**](AuthApi.md#sessionLogout) | **POST** /session.logout | WebSocket Log out of the session |
| [**sessionStatus**](AuthApi.md#sessionStatus) | **POST** /session.status | WebSocket Query session status |


<a id="sessionLogon"></a>
# **sessionLogon**
> SessionLogonResponse sessionLogon(sessionLogonRequest)

WebSocket Log in with API key

Authenticate WebSocket connection using the provided API key.  After calling &#x60;session.logon&#x60;, you can omit &#x60;apiKey&#x60; and &#x60;signature&#x60; parameters for future requests that require them.  Note that only one API key can be authenticated. Calling &#x60;session.logon&#x60; multiple times changes the current authenticated API key. Weight: 2

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AuthApi apiInstance = new AuthApi(defaultClient);
    SessionLogonRequest sessionLogonRequest = new SessionLogonRequest(); // SessionLogonRequest | 
    try {
      SessionLogonResponse result = apiInstance.sessionLogon(sessionLogonRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#sessionLogon");
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
| **sessionLogonRequest** | [**SessionLogonRequest**](SessionLogonRequest.md)|  | [optional] |

### Return type

[**SessionLogonResponse**](SessionLogonResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Log in with API key |  -  |

<a id="sessionLogout"></a>
# **sessionLogout**
> SessionLogoutResponse sessionLogout()

WebSocket Log out of the session

Forget the API key previously authenticated. If the connection is not authenticated, this request does nothing.  Note that the WebSocket connection stays open after &#x60;session.logout&#x60; request. You can continue using the connection, but now you will have to explicitly provide the &#x60;apiKey&#x60; and &#x60;signature&#x60; parameters where needed. Weight: 2

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AuthApi apiInstance = new AuthApi(defaultClient);
    try {
      SessionLogoutResponse result = apiInstance.sessionLogout();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#sessionLogout");
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

[**SessionLogoutResponse**](SessionLogoutResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Log out of the session |  -  |

<a id="sessionStatus"></a>
# **sessionStatus**
> SessionStatusResponse sessionStatus()

WebSocket Query session status

Query the status of the WebSocket connection, inspecting which API key (if any) is used to authorize requests. Weight: 2

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AuthApi apiInstance = new AuthApi(defaultClient);
    try {
      SessionStatusResponse result = apiInstance.sessionStatus();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#sessionStatus");
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

[**SessionStatusResponse**](SessionStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Query session status |  -  |

