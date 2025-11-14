# FiatApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fiatWithdraw**](FiatApi.md#fiatWithdraw) | **GET** /sapi/v2/fiat/withdraw | Fiat Withdraw(WITHDRAW) |
| [**getFiatDepositWithdrawHistory**](FiatApi.md#getFiatDepositWithdrawHistory) | **GET** /sapi/v1/fiat/orders | Get Fiat Deposit/Withdraw History (USER_DATA) |
| [**getFiatPaymentsHistory**](FiatApi.md#getFiatPaymentsHistory) | **GET** /sapi/v1/fiat/payments | Get Fiat Payments History (USER_DATA) |
| [**getOrderDetail**](FiatApi.md#getOrderDetail) | **GET** /sapi/v1/fiat/get-order-detail | Get Order Detail(USER_DATA) |


<a id="fiatWithdraw"></a>
# **fiatWithdraw**
> FiatWithdrawResponse fiatWithdraw(recvWindow)

Fiat Withdraw(WITHDRAW)

Submit withdraw request, in this version, we only support BRL withdrawal via bank_transfer.  You need to call this api first, and call query order detail api in a loop to get the status of the order until this order is successful.  Before calling this api, please make sure you have already completed your KYC or KYB, and already activated your fiat service on our website.  you need to bind your bank account on web/app before using the corresponding account number  Weight: 45000

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
    Long recvWindow = 56L; // Long | 
    try {
      FiatWithdrawResponse result = apiInstance.fiatWithdraw(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiatApi#fiatWithdraw");
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

[**FiatWithdrawResponse**](FiatWithdrawResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fiat Withdraw |  -  |

<a id="getFiatDepositWithdrawHistory"></a>
# **getFiatDepositWithdrawHistory**
> GetFiatDepositWithdrawHistoryResponse getFiatDepositWithdrawHistory(transactionType, beginTime, endTime, page, rows, recvWindow)

Get Fiat Deposit/Withdraw History (USER_DATA)

Get Fiat Deposit/Withdraw History  * If beginTime and endTime are not sent, the recent 30-day data will be returned.  Weight: 45000

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

<a id="getOrderDetail"></a>
# **getOrderDetail**
> GetOrderDetailResponse getOrderDetail(orderId, recvWindow)

Get Order Detail(USER_DATA)

Get Order Detail  Before calling this api, please make sure you have already completed your KYC or KYB, and already activated your fiat service on our website.  Weight: 45000

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
    String orderId = "orderId_example"; // String | order id retrieved from the api call of withdrawal
    Long recvWindow = 56L; // Long | 
    try {
      GetOrderDetailResponse result = apiInstance.getOrderDetail(orderId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiatApi#getOrderDetail");
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
| **orderId** | **String**| order id retrieved from the api call of withdrawal | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetOrderDetailResponse**](GetOrderDetailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Order Detail |  -  |

