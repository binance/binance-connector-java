# MarketDataApi

All URIs are relative to *https://papi.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**testConnectivity**](MarketDataApi.md#testConnectivity) | **GET** /papi/v1/ping | Test Connectivity |


<a id="testConnectivity"></a>
# **testConnectivity**
> testConnectivity()

Test Connectivity

Test connectivity to the Rest API.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    try {
      apiInstance.testConnectivity();
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#testConnectivity");
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

