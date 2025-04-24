# GeneralApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**exchangeInfo**](GeneralApi.md#exchangeInfo) | **POST** /exchangeInfo | WebSocket Exchange information |
| [**ping**](GeneralApi.md#ping) | **POST** /ping | WebSocket Test connectivity |
| [**time**](GeneralApi.md#time) | **POST** /time | WebSocket Check server time |


<a id="exchangeInfo"></a>
# **exchangeInfo**
> ExchangeInfoResponse exchangeInfo(exchangeInfoRequest)

WebSocket Exchange information

Query current exchange trading rules, rate limits, and symbol information. Weight: 20

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.GeneralApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    GeneralApi apiInstance = new GeneralApi(defaultClient);
    ExchangeInfoRequest exchangeInfoRequest = new ExchangeInfoRequest(); // ExchangeInfoRequest | 
    try {
      ExchangeInfoResponse result = apiInstance.exchangeInfo(exchangeInfoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralApi#exchangeInfo");
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
| **exchangeInfoRequest** | [**ExchangeInfoRequest**](ExchangeInfoRequest.md)|  | [optional] |

### Return type

[**ExchangeInfoResponse**](ExchangeInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Exchange information |  -  |

<a id="ping"></a>
# **ping**
> ping()

WebSocket Test connectivity

Test connectivity to the WebSocket API. Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.GeneralApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    GeneralApi apiInstance = new GeneralApi(defaultClient);
    try {
      apiInstance.ping();
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralApi#ping");
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

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="time"></a>
# **time**
> TimeResponse time()

WebSocket Check server time

Test connectivity to the WebSocket API and get the current server time. Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.GeneralApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    GeneralApi apiInstance = new GeneralApi(defaultClient);
    try {
      TimeResponse result = apiInstance.time();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralApi#time");
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

[**TimeResponse**](TimeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Check server time |  -  |

