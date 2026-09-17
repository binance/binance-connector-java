# AccountApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**signUsEquityDisclaimer**](AccountApi.md#signUsEquityDisclaimer) | **POST** /sapi/v1/equity/account/disclaimer | Sign US Equity Disclaimer (TRADE) |


<a id="signUsEquityDisclaimer"></a>
# **signUsEquityDisclaimer**
> SignUsEquityDisclaimerResponse signUsEquityDisclaimer(recvWindow)

Sign US Equity Disclaimer (TRADE)

Records the user&#39;s acknowledgement and acceptance of the US equity disclaimer. This must be completed before the account can access certain US equity trading features. The acceptance is tied to the account associated with the API key.  Weight: 1  Security Type: TRADE

### Example
```java
// Import classes:
import com.binance.connector.client.stocks.ApiClient;
import com.binance.connector.client.stocks.ApiException;
import com.binance.connector.client.stocks.Configuration;
import com.binance.connector.client.stocks.models.*;
import com.binance.connector.client.stocks.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long recvWindow = 5000L; // Long | The value cannot be greater than `60000`.
    try {
      SignUsEquityDisclaimerResponse result = apiInstance.signUsEquityDisclaimer(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#signUsEquityDisclaimer");
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

[**SignUsEquityDisclaimerResponse**](SignUsEquityDisclaimerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sign US Equity Disclaimer |  -  |

