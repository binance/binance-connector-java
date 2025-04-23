# MarketDataApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDualInvestmentProductList**](MarketDataApi.md#getDualInvestmentProductList) | **GET** /sapi/v1/dci/product/list | Get Dual Investment product list |


<a id="getDualInvestmentProductList"></a>
# **getDualInvestmentProductList**
> GetDualInvestmentProductListResponse getDualInvestmentProductList(optionType, exercisedCoin, investCoin, pageSize, pageIndex, recvWindow)

Get Dual Investment product list

Get Dual Investment product list  Weight: 1(IP)

### Example
```java
// Import classes:
import com.binance.connector.client.dual_investment.ApiClient;
import com.binance.connector.client.dual_investment.ApiException;
import com.binance.connector.client.dual_investment.Configuration;
import com.binance.connector.client.dual_investment.models.*;
import com.binance.connector.client.dual_investment.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String optionType = "optionType_example"; // String | Input CALL or PUT
    String exercisedCoin = "exercisedCoin_example"; // String | Target exercised asset, e.g.: if you subscribe to a high sell product (call option), you should input: `optionType`:CALL,`exercisedCoin`:USDT,`investCoin`:BNB; if you subscribe to a low buy product (put option), you should input: `optionType`:PUT,`exercisedCoin`:BNB,`investCoin`:USDT
    String investCoin = "investCoin_example"; // String | Asset used for subscribing, e.g.: if you subscribe to a high sell product (call option), you should input: `optionType`:CALL,`exercisedCoin`:USDT,`investCoin`:BNB; if you subscribe to a low buy product (put option), you should input: `optionType`:PUT,`exercisedCoin`:BNB,`investCoin`:USDT
    Long pageSize = 56L; // Long | Default: 10, Maximum: 100
    Long pageIndex = 56L; // Long | Default: 1
    Long recvWindow = 56L; // Long | The value cannot be greater than 60000
    try {
      GetDualInvestmentProductListResponse result = apiInstance.getDualInvestmentProductList(optionType, exercisedCoin, investCoin, pageSize, pageIndex, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#getDualInvestmentProductList");
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
| **optionType** | **String**| Input CALL or PUT | |
| **exercisedCoin** | **String**| Target exercised asset, e.g.: if you subscribe to a high sell product (call option), you should input: &#x60;optionType&#x60;:CALL,&#x60;exercisedCoin&#x60;:USDT,&#x60;investCoin&#x60;:BNB; if you subscribe to a low buy product (put option), you should input: &#x60;optionType&#x60;:PUT,&#x60;exercisedCoin&#x60;:BNB,&#x60;investCoin&#x60;:USDT | |
| **investCoin** | **String**| Asset used for subscribing, e.g.: if you subscribe to a high sell product (call option), you should input: &#x60;optionType&#x60;:CALL,&#x60;exercisedCoin&#x60;:USDT,&#x60;investCoin&#x60;:BNB; if you subscribe to a low buy product (put option), you should input: &#x60;optionType&#x60;:PUT,&#x60;exercisedCoin&#x60;:BNB,&#x60;investCoin&#x60;:USDT | |
| **pageSize** | **Long**| Default: 10, Maximum: 100 | [optional] |
| **pageIndex** | **Long**| Default: 1 | [optional] |
| **recvWindow** | **Long**| The value cannot be greater than 60000 | [optional] |

### Return type

[**GetDualInvestmentProductListResponse**](GetDualInvestmentProductListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Dual Investment product list |  -  |

