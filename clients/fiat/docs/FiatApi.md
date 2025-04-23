# FiatApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFiatDepositWithdrawHistory**](FiatApi.md#getFiatDepositWithdrawHistory) | **GET** /sapi/v1/fiat/orders | Get Fiat Deposit/Withdraw History (USER_DATA) |
| [**getFiatPaymentsHistory**](FiatApi.md#getFiatPaymentsHistory) | **GET** /sapi/v1/fiat/payments | Get Fiat Payments History (USER_DATA) |


<a id="getFiatDepositWithdrawHistory"></a>
# **getFiatDepositWithdrawHistory**
> GetFiatDepositWithdrawHistoryResponse getFiatDepositWithdrawHistory(transactionType, beginTime, endTime, page, rows, recvWindow)

Get Fiat Deposit/Withdraw History (USER_DATA)

Get Fiat Deposit/Withdraw History  * If beginTime and endTime are not sent, the recent 30-day data will be returned.  Weight: 90000

### Example
```java
// Import classes:
import com.binance.connector.client.fiat.ApiClient;
import com.binance.connector.client.fiat.ApiException;
import com.binance.connector.client.fiat.Configuration;
import com.binance.connector.client.fiat.models.*;
import com.binance.connector.client.fiat.rest.api.FiatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FiatApi apiInstance = new FiatApi(defaultClient);
    String transactionType = "transactionType_example"; // String | 0-buy,1-sell
    Long beginTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long page = 56L; // Long | default 1
    Long rows = 56L; // Long | default 100, max 500
    Long recvWindow = 56L; // Long | 
    try {
      GetFiatDepositWithdrawHistoryResponse result = apiInstance.getFiatDepositWithdrawHistory(transactionType, beginTime, endTime, page, rows, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiatApi#getFiatDepositWithdrawHistory");
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
| **transactionType** | **String**| 0-buy,1-sell | |
| **beginTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **page** | **Long**| default 1 | [optional] |
| **rows** | **Long**| default 100, max 500 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetFiatDepositWithdrawHistoryResponse**](GetFiatDepositWithdrawHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Fiat Deposit/Withdraw History |  -  |

<a id="getFiatPaymentsHistory"></a>
# **getFiatPaymentsHistory**
> GetFiatPaymentsHistoryResponse getFiatPaymentsHistory(transactionType, beginTime, endTime, page, rows, recvWindow)

Get Fiat Payments History (USER_DATA)

Get Fiat Deposit/Withdraw History  * If beginTime and endTime are not sent, the recent 30-day data will be returned. * paymentMethod: Only when requesting payments history for buy (transactionType&#x3D;0), response contains paymentMethod representing the way of purchase. Now we have: * Cash Balance * Credit Card * Online Banking * Bank Transfer  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.fiat.ApiClient;
import com.binance.connector.client.fiat.ApiException;
import com.binance.connector.client.fiat.Configuration;
import com.binance.connector.client.fiat.models.*;
import com.binance.connector.client.fiat.rest.api.FiatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FiatApi apiInstance = new FiatApi(defaultClient);
    String transactionType = "transactionType_example"; // String | 0-buy,1-sell
    Long beginTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long page = 56L; // Long | default 1
    Long rows = 56L; // Long | default 100, max 500
    Long recvWindow = 56L; // Long | 
    try {
      GetFiatPaymentsHistoryResponse result = apiInstance.getFiatPaymentsHistory(transactionType, beginTime, endTime, page, rows, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiatApi#getFiatPaymentsHistory");
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
| **transactionType** | **String**| 0-buy,1-sell | |
| **beginTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **page** | **Long**| default 1 | [optional] |
| **rows** | **Long**| default 100, max 500 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetFiatPaymentsHistoryResponse**](GetFiatPaymentsHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Fiat Payments History |  -  |

