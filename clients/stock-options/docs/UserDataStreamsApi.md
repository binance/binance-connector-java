# UserDataStreamsApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRenewListenKey**](UserDataStreamsApi.md#createRenewListenKey) | **POST** /sapi/v1/equity/option/listenKey | Create / Renew Listen Key (USER_STREAM) |


<a id="createRenewListenKey"></a>
# **createRenewListenKey**
> CreateRenewListenKeyResponse createRenewListenKey(recvWindow)

Create / Renew Listen Key (USER_STREAM)

Create or renew the user data stream &#x60;listenKey&#x60;.  - **Valid for 1 hour.** Calling again renews it (resets to 1 hour) and returns the **same** key; renewing every 30 minutes is recommended. After expiry, a new key is issued and you must resubscribe with it. - **Options and stocks share one key.** The key is issued per user, not per asset class. This endpoint and &#x60;/sapi/v1/equity/listenKey&#x60; return the same key; calling either is enough. - Use the key to subscribe to the Order Report V2 Stream.  Weight: 1  Security Type: USER_STREAM

### Example
```java
// Import classes:
import com.binance.connector.client.stock_options.ApiClient;
import com.binance.connector.client.stock_options.ApiException;
import com.binance.connector.client.stock_options.Configuration;
import com.binance.connector.client.stock_options.models.*;
import com.binance.connector.client.stock_options.rest.api.UserDataStreamsApi;

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

