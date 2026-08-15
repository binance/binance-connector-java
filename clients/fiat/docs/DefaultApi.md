# DefaultApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deposit**](DefaultApi.md#deposit) | **POST** /sapi/v1/fiat/deposit | Deposit (TRADE) |
| [**fiatWithdraw**](DefaultApi.md#fiatWithdraw) | **POST** /sapi/v2/fiat/withdraw | Fiat Withdraw (TRADE) |
| [**getFiatDepositWithdrawHistory**](DefaultApi.md#getFiatDepositWithdrawHistory) | **GET** /sapi/v1/fiat/orders | Get Fiat Deposit/Withdraw History (USER_DATA) |
| [**getFiatPaymentsHistory**](DefaultApi.md#getFiatPaymentsHistory) | **GET** /sapi/v1/fiat/payments | Get Fiat Payments History (USER_DATA) |
| [**getOrderDetail**](DefaultApi.md#getOrderDetail) | **GET** /sapi/v1/fiat/get-order-detail | Get Order Detail (USER_DATA) |


<a id="deposit"></a>
# **deposit**
> DepositResponse deposit(depositRequest, recvWindow)

Deposit (TRADE)

Submit deposit request, in this version, we only support BRL deposit via pix.  For BRL deposit via pix, you need to place an order before making a transfer from your bank.  Before calling this api, please make sure you have already completed your KYC or KYB, and already activated your fiat service on our website.  Weight(UID): 45000  Security Type: TRADE  Notes: - &#x60;timestamp&#x60;, &#x60;signature&#x60; and &#x60;recvWindow&#x60; are sent as query-string parameters, while the business fields (&#x60;currency&#x60;, &#x60;apiPaymentMethod&#x60;, &#x60;amount&#x60;, &#x60;ext&#x60;) are sent in the JSON request body with &#x60;Content-Type: application/json&#x60;.

### Example
```java
// Import classes:
import com.binance.connector.client.fiat.ApiClient;
import com.binance.connector.client.fiat.ApiException;
import com.binance.connector.client.fiat.Configuration;
import com.binance.connector.client.fiat.models.*;
import com.binance.connector.client.fiat.rest.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    DepositRequest depositRequest = new DepositRequest(); // DepositRequest | 
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
    try {
      DepositResponse result = apiInstance.deposit(depositRequest, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deposit");
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
| **depositRequest** | [**DepositRequest**](DepositRequest.md)|  | |
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

### Return type

[**DepositResponse**](DepositResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Deposit |  -  |

<a id="fiatWithdraw"></a>
# **fiatWithdraw**
> FiatWithdrawResponse fiatWithdraw(fiatWithdrawRequest, recvWindow)

Fiat Withdraw (TRADE)

Submit withdraw request, in this version, we support BRL,ARS,MXN withdrawal via bank_transfer.  You need to call this api first, and call query order detail api in a loop to get the status of the order until this order is successful.  Before calling this api, please make sure you have already completed your KYC or KYB, and already activated your fiat service on our website.  Weight(UID): 45000  Security Type: TRADE

### Example
```java
// Import classes:
import com.binance.connector.client.fiat.ApiClient;
import com.binance.connector.client.fiat.ApiException;
import com.binance.connector.client.fiat.Configuration;
import com.binance.connector.client.fiat.models.*;
import com.binance.connector.client.fiat.rest.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    FiatWithdrawRequest fiatWithdrawRequest = new FiatWithdrawRequest(); // FiatWithdrawRequest | 
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
    try {
      FiatWithdrawResponse result = apiInstance.fiatWithdraw(fiatWithdrawRequest, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fiatWithdraw");
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
| **fiatWithdrawRequest** | [**FiatWithdrawRequest**](FiatWithdrawRequest.md)|  | |
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

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

Get Fiat Deposit/Withdraw History  Weight(UID): 45000  Security Type: USER_DATA  Notes: - If &#x60;beginTime&#x60; and &#x60;endTime&#x60; are not sent, recent 30-day data is returned.

### Example
```java
// Import classes:
import com.binance.connector.client.fiat.ApiClient;
import com.binance.connector.client.fiat.ApiException;
import com.binance.connector.client.fiat.Configuration;
import com.binance.connector.client.fiat.models.*;
import com.binance.connector.client.fiat.rest.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String transactionType = "0"; // String | 0: deposit, 1: withdraw
    Long beginTime = 1641782889000L; // Long | 
    Long endTime = 1641782889000L; // Long | 
    Long page = 1L; // Long | 
    Long rows = 100L; // Long | 
    Long recvWindow = 5000L; // Long | 
    try {
      GetFiatDepositWithdrawHistoryResponse result = apiInstance.getFiatDepositWithdrawHistory(transactionType, beginTime, endTime, page, rows, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getFiatDepositWithdrawHistory");
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
| **transactionType** | **String**| 0: deposit, 1: withdraw | |
| **beginTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **page** | **Long**|  | [optional] |
| **rows** | **Long**|  | [optional] |
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

Get Fiat Payments History  Weight(IP): 1  Security Type: USER_DATA  Notes: - If &#x60;beginTime&#x60; and &#x60;endTime&#x60; are not sent, recent 30-day data is returned. - &#x60;paymentMethod&#x60; is returned only when querying buy history (&#x60;transactionType&#x3D;0&#x60;). - Supported payment methods: &#x60;Cash Balance&#x60;, &#x60;Credit Card&#x60;, &#x60;Online Banking&#x60;, &#x60;Bank Transfer&#x60;.

### Example
```java
// Import classes:
import com.binance.connector.client.fiat.ApiClient;
import com.binance.connector.client.fiat.ApiException;
import com.binance.connector.client.fiat.Configuration;
import com.binance.connector.client.fiat.models.*;
import com.binance.connector.client.fiat.rest.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String transactionType = "0"; // String | 0: buy, 1: sell
    Long beginTime = 1641782889000L; // Long | 
    Long endTime = 1641782889000L; // Long | 
    Long page = 1L; // Long | 
    Long rows = 100L; // Long | 
    Long recvWindow = 5000L; // Long | 
    try {
      GetFiatPaymentsHistoryResponse result = apiInstance.getFiatPaymentsHistory(transactionType, beginTime, endTime, page, rows, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getFiatPaymentsHistory");
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
| **transactionType** | **String**| 0: buy, 1: sell | |
| **beginTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **page** | **Long**|  | [optional] |
| **rows** | **Long**|  | [optional] |
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
> GetOrderDetailResponse getOrderDetail(orderNo, recvWindow)

Get Order Detail (USER_DATA)

Get Order Detail  Before calling this api, please make sure you have already completed your KYC or KYB, and already activated your fiat service on our website.  Weight(IP): 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.fiat.ApiClient;
import com.binance.connector.client.fiat.ApiException;
import com.binance.connector.client.fiat.Configuration;
import com.binance.connector.client.fiat.models.*;
import com.binance.connector.client.fiat.rest.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String orderNo = "036752*678"; // String | Order ID retrieved from the withdrawal API
    Long recvWindow = 5000L; // Long | 
    try {
      GetOrderDetailResponse result = apiInstance.getOrderDetail(orderNo, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getOrderDetail");
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
| **orderNo** | **String**| Order ID retrieved from the withdrawal API | |
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

