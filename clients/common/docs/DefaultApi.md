# DefaultApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**commonGet**](DefaultApi.md#commonGet) | **GET** /common | common |


<a id="commonGet"></a>
# **commonGet**
> commonGet()

common

### Example
```java
// Import classes:
import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.models.*;
import com.binance.connector.client.common.restapi.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      apiInstance.commonGet();
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#commonGet");
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
| **200** | Common |  -  |

