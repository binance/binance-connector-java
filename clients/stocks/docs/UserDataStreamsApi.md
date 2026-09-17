# UserDataStreamsApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRenewListenKey**](UserDataStreamsApi.md#createRenewListenKey) | **POST** /sapi/v1/equity/listenKey | Create / Renew Listen Key (USER_STREAM) |


<a id="createRenewListenKey"></a>
# **createRenewListenKey**
> CreateRenewListenKeyResponse createRenewListenKey(recvWindow)

Create / Renew Listen Key (USER_STREAM)

Create a new stock user-data-stream &#x60;listenKey&#x60;, or renew an existing one. Calling this endpoint for the same user with an active &#x60;listenKey&#x60; extends its validity; if there is no active key, a new one is issued. Use the returned &#x60;listenKey&#x60; to subscribe to the stock user data stream.  Weight: 1  Security Type: USER_STREAM

### Example
```java
// Import classes:
import com.binance.connector.client.stocks.ApiClient;
import com.binance.connector.client.stocks.ApiException;
import com.binance.connector.client.stocks.Configuration;
import com.binance.connector.client.stocks.models.*;
import com.binance.connector.client.stocks.rest.api.UserDataStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    UserDataStreamsApi apiInstance = new UserDataStreamsApi(defaultClient);
    Long recvWindow = 5000L; // Long | The value cannot be greater than `60000`.
    try {
      CreateRenewListenKeyResponse result = apiInstance.createRenewListenKey(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataStreamsApi#createRenewListenKey");
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
| **recvWindow** | **Long**| The value cannot be greater than &#x60;60000&#x60;. | [optional] |

### Return type

[**CreateRenewListenKeyResponse**](CreateRenewListenKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create / Renew Listen Key |  -  |

