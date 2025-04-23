# PortfolioMarginEndpointsApi

All URIs are relative to *https://dapi.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**classicPortfolioMarginAccountInformation**](PortfolioMarginEndpointsApi.md#classicPortfolioMarginAccountInformation) | **GET** /dapi/v1/pmAccountInfo | Classic Portfolio Margin Account Information (USER_DATA) |


<a id="classicPortfolioMarginAccountInformation"></a>
# **classicPortfolioMarginAccountInformation**
> ClassicPortfolioMarginAccountInformationResponse classicPortfolioMarginAccountInformation(asset, recvWindow)

Classic Portfolio Margin Account Information (USER_DATA)

Get Classic Portfolio Margin current account information.  * maxWithdrawAmount is for asset transfer out to the spot wallet.  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.PortfolioMarginEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dapi.binance.com");

    PortfolioMarginEndpointsApi apiInstance = new PortfolioMarginEndpointsApi(defaultClient);
    String asset = "asset_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      ClassicPortfolioMarginAccountInformationResponse result = apiInstance.classicPortfolioMarginAccountInformation(asset, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfolioMarginEndpointsApi#classicPortfolioMarginAccountInformation");
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
| **asset** | **String**|  | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**ClassicPortfolioMarginAccountInformationResponse**](ClassicPortfolioMarginAccountInformationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Classic Portfolio Margin Account Information |  -  |

