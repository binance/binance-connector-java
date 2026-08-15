# TradeApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**vipLoanBorrow**](TradeApi.md#vipLoanBorrow) | **POST** /sapi/v1/loan/vip/borrow | VIP Loan Borrow (TRADE) |
| [**vipLoanFixedRateBorrow**](TradeApi.md#vipLoanFixedRateBorrow) | **POST** /sapi/v1/loan/vip/fixed/borrow | VIP Loan Fixed Rate Borrow (TRADE) |
| [**vipLoanRenew**](TradeApi.md#vipLoanRenew) | **POST** /sapi/v1/loan/vip/renew | VIP Loan Renew (TRADE) |
| [**vipLoanRepay**](TradeApi.md#vipLoanRepay) | **POST** /sapi/v1/loan/vip/repay | VIP Loan Repay (TRADE) |


<a id="vipLoanBorrow"></a>
# **vipLoanBorrow**
> VipLoanBorrowResponse vipLoanBorrow(vipLoanBorrowRequest)

VIP Loan Borrow (TRADE)

VIP loan is available for VIP users only.  Weight(UID): 6000  Security Type: TRADE  Notes: - &#x60;loanAccountId&#x60; refers to the loan receiving account. - Only master account applications are supported. - &#x60;loanAccountId&#x60; and &#x60;collateralAccountId&#x60; must be under the same master account. - &#x60;loanTerm&#x60; is mandatory if the user chooses a fixed rate (&#x60;isFlexibleRate &#x3D; FALSE&#x60;).

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

<a id="vipLoanFixedRateBorrow"></a>
# **vipLoanFixedRateBorrow**
> VipLoanFixedRateBorrowResponse vipLoanFixedRateBorrow(vipLoanFixedRateBorrowRequest)

VIP Loan Fixed Rate Borrow (TRADE)

Submit a fixed rate borrow request by matching market supply orders.  Weight(UID): 6000  Security Type: TRADE  Notes: - **Rate limit:** 2 requests per second per account. - When multiple &#x60;supplyRequest&#x60; entries are provided, all &#x60;requestId&#x60; values must correspond to the same &#x60;borrowCoin&#x60; and &#x60;loanTerm&#x60; (validated by collateral facade).

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
    VipLoanFixedRateBorrowRequest vipLoanFixedRateBorrowRequest = new VipLoanFixedRateBorrowRequest(); // VipLoanFixedRateBorrowRequest | 
    try {
      VipLoanFixedRateBorrowResponse result = apiInstance.vipLoanFixedRateBorrow(vipLoanFixedRateBorrowRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#vipLoanFixedRateBorrow");
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
| **vipLoanFixedRateBorrowRequest** | [**VipLoanFixedRateBorrowRequest**](VipLoanFixedRateBorrowRequest.md)|  | |

### Return type

[**VipLoanFixedRateBorrowResponse**](VipLoanFixedRateBorrowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | VIP Loan Fixed Rate Borrow |  -  |

<a id="vipLoanRenew"></a>
# **vipLoanRenew**
> VipLoanRenewResponse vipLoanRenew(vipLoanRenewRequest)

VIP Loan Renew (TRADE)

VIP loan is available for VIP users only.  Weight(UID): 6000  Security Type: TRADE

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

VIP Loan Repay (TRADE)

VIP loan is available for VIP users only.  Weight(UID): 6000  Security Type: TRADE

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

