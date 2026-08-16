# MarketDataApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDualInvestmentProductList**](MarketDataApi.md#getDualInvestmentProductList) | **GET** /sapi/v1/dci/product/list | Get Dual Investment product list |


<a id="getDualInvestmentProductList"></a>
# **getDualInvestmentProductList**
> GetDualInvestmentProductListResponse getDualInvestmentProductList(optionType, exercisedCoin, investCoin, pageSize, pageIndex, recvWindow)

Get Dual Investment product list

Get Dual Investment product list  Weight(IP): 1

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
    OptionType optionType = OptionType.fromValue("CALL"); // OptionType | Input CALL or PUT
    String exercisedCoin = "USDT"; // String | Target exercised asset, e.g.: if you subscribe to a high sell product (call option), you should input: `optionType: CALL`, `exercisedCoin: USDT`, `investCoin: BNB`; if you subscribe to a low buy product (put option), you should input: `optionType: PUT`, `exercisedCoin: BNB`, `investCoin: USDT`
    String investCoin = "BNB"; // String | Asset used for subscribing, e.g.: if you subscribe to a high sell product (call option), you should input: `optionType: CALL`, `exercisedCoin: USDT`, `investCoin: BNB`; if you subscribe to a low buy product (put option), you should input: `optionType: PUT`, `exercisedCoin: BNB`, `investCoin: USDT`
    Long pageSize = 10L; // Long | Number of records per page
    Long pageIndex = 1L; // Long | Page index
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
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
| **optionType** | [**OptionType**](.md)| Input CALL or PUT | [enum: CALL, PUT] |
| **exercisedCoin** | **String**| Target exercised asset, e.g.: if you subscribe to a high sell product (call option), you should input: &#x60;optionType: CALL&#x60;, &#x60;exercisedCoin: USDT&#x60;, &#x60;investCoin: BNB&#x60;; if you subscribe to a low buy product (put option), you should input: &#x60;optionType: PUT&#x60;, &#x60;exercisedCoin: BNB&#x60;, &#x60;investCoin: USDT&#x60; | |
| **investCoin** | **String**| Asset used for subscribing, e.g.: if you subscribe to a high sell product (call option), you should input: &#x60;optionType: CALL&#x60;, &#x60;exercisedCoin: USDT&#x60;, &#x60;investCoin: BNB&#x60;; if you subscribe to a low buy product (put option), you should input: &#x60;optionType: PUT&#x60;, &#x60;exercisedCoin: BNB&#x60;, &#x60;investCoin: USDT&#x60; | |
| **pageSize** | **Long**| Number of records per page | [optional] |
| **pageIndex** | **Long**| Page index | [optional] |
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

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

