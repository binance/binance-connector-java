# AccountApi

All URIs are relative to *https://eapi.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accountFundingFlow**](AccountApi.md#accountFundingFlow) | **GET** /eapi/v1/bill | Account Funding Flow (USER_DATA) |
| [**optionMarginAccountInformation**](AccountApi.md#optionMarginAccountInformation) | **GET** /eapi/v1/marginAccount | Option Margin Account Information (USER_DATA) |


<a id="accountFundingFlow"></a>
# **accountFundingFlow**
> AccountFundingFlowResponse accountFundingFlow(currency, recordId, startTime, endTime, limit, recvWindow)

Account Funding Flow (USER_DATA)

Query account funding flows.  Weight(IP): 1  Security Type: USER_DATA  Notes: - Only support querying data in the past 3 months

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Currency currency = Currency.fromValue("USDT"); // Currency | Asset type, only support USDT  as of now
    Long recordId = 100000L; // Long | Return the recordId and subsequent data, the latest data is returned by default
    Long startTime = 1623319461670L; // Long | Start Time, e.g 1593511200000
    Long endTime = 1641782889000L; // Long | End Time, e.g 1593512200000
    Long limit = 20L; // Long | Number of result sets returned
    Long recvWindow = 5000L; // Long | Recv Window.
    try {
      AccountFundingFlowResponse result = apiInstance.accountFundingFlow(currency, recordId, startTime, endTime, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#accountFundingFlow");
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
| **currency** | [**Currency**](.md)| Asset type, only support USDT  as of now | [enum: USDT] |
| **recordId** | **Long**| Return the recordId and subsequent data, the latest data is returned by default | [optional] |
| **startTime** | **Long**| Start Time, e.g 1593511200000 | [optional] |
| **endTime** | **Long**| End Time, e.g 1593512200000 | [optional] |
| **limit** | **Long**| Number of result sets returned | [optional] |
| **recvWindow** | **Long**| Recv Window. | [optional] |

### Return type

[**AccountFundingFlowResponse**](AccountFundingFlowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account Funding Flow |  -  |

<a id="optionMarginAccountInformation"></a>
# **optionMarginAccountInformation**
> OptionMarginAccountInformationResponse optionMarginAccountInformation(recvWindow)

Option Margin Account Information (USER_DATA)

Get current account information.  Weight(IP): 3  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long recvWindow = 5000L; // Long | Recv Window.
    try {
      OptionMarginAccountInformationResponse result = apiInstance.optionMarginAccountInformation(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#optionMarginAccountInformation");
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
| **recvWindow** | **Long**| Recv Window. | [optional] |

### Return type

[**OptionMarginAccountInformationResponse**](OptionMarginAccountInformationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Option Margin Account Information |  -  |

