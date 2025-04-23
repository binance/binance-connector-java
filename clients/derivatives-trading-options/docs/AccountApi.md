# AccountApi

All URIs are relative to *https://eapi.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accountFundingFlow**](AccountApi.md#accountFundingFlow) | **GET** /eapi/v1/bill | Account Funding Flow (USER_DATA) |
| [**getDownloadIdForOptionTransactionHistory**](AccountApi.md#getDownloadIdForOptionTransactionHistory) | **GET** /eapi/v1/income/asyn | Get Download Id For Option Transaction History (USER_DATA) |
| [**getOptionTransactionHistoryDownloadLinkById**](AccountApi.md#getOptionTransactionHistoryDownloadLinkById) | **GET** /eapi/v1/income/asyn/id | Get Option Transaction History Download Link by Id (USER_DATA) |
| [**optionAccountInformation**](AccountApi.md#optionAccountInformation) | **GET** /eapi/v1/account | Option Account Information(TRADE) |


<a id="accountFundingFlow"></a>
# **accountFundingFlow**
> AccountFundingFlowResponse accountFundingFlow(currency, recordId, startTime, endTime, limit, recvWindow)

Account Funding Flow (USER_DATA)

Query account funding flows.  Weight: 1

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
    String currency = "currency_example"; // String | Asset type, only support USDT  as of now
    Long recordId = 56L; // Long | Return the recordId and subsequent data, the latest data is returned by default, e.g 100000
    Long startTime = 56L; // Long | Start Time, e.g 1593511200000
    Long endTime = 56L; // Long | End Time, e.g 1593512200000
    Long limit = 56L; // Long | Number of result sets returned Default:100 Max:1000
    Long recvWindow = 56L; // Long | 
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
| **currency** | **String**| Asset type, only support USDT  as of now | |
| **recordId** | **Long**| Return the recordId and subsequent data, the latest data is returned by default, e.g 100000 | [optional] |
| **startTime** | **Long**| Start Time, e.g 1593511200000 | [optional] |
| **endTime** | **Long**| End Time, e.g 1593512200000 | [optional] |
| **limit** | **Long**| Number of result sets returned Default:100 Max:1000 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

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

<a id="getDownloadIdForOptionTransactionHistory"></a>
# **getDownloadIdForOptionTransactionHistory**
> GetDownloadIdForOptionTransactionHistoryResponse getDownloadIdForOptionTransactionHistory(startTime, endTime, recvWindow)

Get Download Id For Option Transaction History (USER_DATA)

Get download id for option transaction history  * Request Limitation is 5 times per month, shared by &gt; front end download page and rest api * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; can not be longer than 1 year  Weight: 5

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
    Long startTime = 56L; // Long | Timestamp in ms
    Long endTime = 56L; // Long | Timestamp in ms
    Long recvWindow = 56L; // Long | 
    try {
      GetDownloadIdForOptionTransactionHistoryResponse result = apiInstance.getDownloadIdForOptionTransactionHistory(startTime, endTime, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getDownloadIdForOptionTransactionHistory");
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
| **startTime** | **Long**| Timestamp in ms | |
| **endTime** | **Long**| Timestamp in ms | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetDownloadIdForOptionTransactionHistoryResponse**](GetDownloadIdForOptionTransactionHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Download Id For Option Transaction History |  -  |

<a id="getOptionTransactionHistoryDownloadLinkById"></a>
# **getOptionTransactionHistoryDownloadLinkById**
> GetOptionTransactionHistoryDownloadLinkByIdResponse getOptionTransactionHistoryDownloadLinkById(downloadId, recvWindow)

Get Option Transaction History Download Link by Id (USER_DATA)

Get option transaction history download Link by Id  * Download link expiration: 24h  Weight: 5

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
    String downloadId = "downloadId_example"; // String | get by download id api
    Long recvWindow = 56L; // Long | 
    try {
      GetOptionTransactionHistoryDownloadLinkByIdResponse result = apiInstance.getOptionTransactionHistoryDownloadLinkById(downloadId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getOptionTransactionHistoryDownloadLinkById");
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
| **downloadId** | **String**| get by download id api | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetOptionTransactionHistoryDownloadLinkByIdResponse**](GetOptionTransactionHistoryDownloadLinkByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Option Transaction History Download Link by Id |  -  |

<a id="optionAccountInformation"></a>
# **optionAccountInformation**
> OptionAccountInformationResponse optionAccountInformation(recvWindow)

Option Account Information(TRADE)

Get current account information.  Weight: 3

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
    Long recvWindow = 56L; // Long | 
    try {
      OptionAccountInformationResponse result = apiInstance.optionAccountInformation(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#optionAccountInformation");
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
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**OptionAccountInformationResponse**](OptionAccountInformationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Option Account Information |  -  |

