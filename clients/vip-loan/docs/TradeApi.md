# TradeApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**vipLoanBorrow**](TradeApi.md#vipLoanBorrow) | **POST** /sapi/v1/loan/vip/borrow | VIP Loan Borrow(TRADE) |
| [**vipLoanRenew**](TradeApi.md#vipLoanRenew) | **POST** /sapi/v1/loan/vip/renew | VIP Loan Renew(TRADE) |
| [**vipLoanRepay**](TradeApi.md#vipLoanRepay) | **POST** /sapi/v1/loan/vip/repay | VIP Loan Repay(TRADE) |


<a id="vipLoanBorrow"></a>
# **vipLoanBorrow**
> VipLoanBorrowResponse vipLoanBorrow(vipLoanBorrowRequest)

VIP Loan Borrow(TRADE)

VIP loan is available for VIP users only.  * loanAccountId refer to loan receiving account * Only master account applications are supported * loanAccountId and collateralAccountId under same master account * loanTerm is mandatory if user choose stable rate  Weight: 0

### Example
```java
// Import classes:
import com.binance.connector.client.vip_loan.ApiClient;
import com.binance.connector.client.vip_loan.ApiException;
import com.binance.connector.client.vip_loan.Configuration;
import com.binance.connector.client.vip_loan.models.*;
import com.binance.connector.client.vip_loan.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    VipLoanBorrowRequest vipLoanBorrowRequest = new VipLoanBorrowRequest(); // VipLoanBorrowRequest | 
    try {
      VipLoanBorrowResponse result = apiInstance.vipLoanBorrow(vipLoanBorrowRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#vipLoanBorrow");
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
| **vipLoanBorrowRequest** | [**VipLoanBorrowRequest**](VipLoanBorrowRequest.md)|  | |

### Return type

[**VipLoanBorrowResponse**](VipLoanBorrowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | VIP Loan Borrow |  -  |

<a id="vipLoanRenew"></a>
# **vipLoanRenew**
> VipLoanRenewResponse vipLoanRenew(vipLoanRenewRequest)

VIP Loan Renew(TRADE)

VIP loan is available for VIP users only.  Weight: 6000

### Example
```java
// Import classes:
import com.binance.connector.client.vip_loan.ApiClient;
import com.binance.connector.client.vip_loan.ApiException;
import com.binance.connector.client.vip_loan.Configuration;
import com.binance.connector.client.vip_loan.models.*;
import com.binance.connector.client.vip_loan.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    VipLoanRenewRequest vipLoanRenewRequest = new VipLoanRenewRequest(); // VipLoanRenewRequest | 
    try {
      VipLoanRenewResponse result = apiInstance.vipLoanRenew(vipLoanRenewRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#vipLoanRenew");
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
| **vipLoanRenewRequest** | [**VipLoanRenewRequest**](VipLoanRenewRequest.md)|  | |

### Return type

[**VipLoanRenewResponse**](VipLoanRenewResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | VIP Loan Renew |  -  |

<a id="vipLoanRepay"></a>
# **vipLoanRepay**
> VipLoanRepayResponse vipLoanRepay(vipLoanRepayRequest)

VIP Loan Repay(TRADE)

VIP loan is available for VIP users only.  Weight: 6000

### Example
```java
// Import classes:
import com.binance.connector.client.vip_loan.ApiClient;
import com.binance.connector.client.vip_loan.ApiException;
import com.binance.connector.client.vip_loan.Configuration;
import com.binance.connector.client.vip_loan.models.*;
import com.binance.connector.client.vip_loan.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    VipLoanRepayRequest vipLoanRepayRequest = new VipLoanRepayRequest(); // VipLoanRepayRequest | 
    try {
      VipLoanRepayResponse result = apiInstance.vipLoanRepay(vipLoanRepayRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#vipLoanRepay");
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
| **vipLoanRepayRequest** | [**VipLoanRepayRequest**](VipLoanRepayRequest.md)|  | |

### Return type

[**VipLoanRepayResponse**](VipLoanRepayResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | VIP Loan Repay |  -  |

