# UserInformationApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkVIPLoanCollateralAccount**](UserInformationApi.md#checkVIPLoanCollateralAccount) | **GET** /sapi/v1/loan/vip/collateral/account | Check VIP Loan Collateral Account (USER_DATA) |
| [**getVIPLoanAccruedInterest**](UserInformationApi.md#getVIPLoanAccruedInterest) | **GET** /sapi/v1/loan/vip/accruedInterest | Get VIP Loan Accrued Interest (USER_DATA) |
| [**getVIPLoanOngoingOrders**](UserInformationApi.md#getVIPLoanOngoingOrders) | **GET** /sapi/v1/loan/vip/ongoing/orders | Get VIP Loan Ongoing Orders (USER_DATA) |
| [**getVIPLoanRepaymentHistory**](UserInformationApi.md#getVIPLoanRepaymentHistory) | **GET** /sapi/v1/loan/vip/repay/history | Get VIP Loan Repayment History (USER_DATA) |
| [**queryApplicationStatus**](UserInformationApi.md#queryApplicationStatus) | **GET** /sapi/v1/loan/vip/request/data | Query Application Status (USER_DATA) |


<a id="checkVIPLoanCollateralAccount"></a>
# **checkVIPLoanCollateralAccount**
> CheckVIPLoanCollateralAccountResponse checkVIPLoanCollateralAccount(orderId, collateralAccountId, recvWindow)

Check VIP Loan Collateral Account (USER_DATA)

VIP loan is available for VIP users only  Weight(IP): 6000  Security Type: USER_DATA  Notes: - If the logged-in account is a borrowing account, all collateral accounts bound to that borrowing account can be queried. - If the logged-in account is a collateral account, only collateral assets under that account can be queried.

### Example
```java
// Import classes:
import com.binance.connector.client.vip_loan.ApiClient;
import com.binance.connector.client.vip_loan.ApiException;
import com.binance.connector.client.vip_loan.Configuration;
import com.binance.connector.client.vip_loan.models.*;
import com.binance.connector.client.vip_loan.rest.api.UserInformationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    UserInformationApi apiInstance = new UserInformationApi(defaultClient);
    Long orderId = 1L; // Long | 
    Long collateralAccountId = 1L; // Long | 
    Long recvWindow = 5000L; // Long | 
    try {
      CheckVIPLoanCollateralAccountResponse result = apiInstance.checkVIPLoanCollateralAccount(orderId, collateralAccountId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserInformationApi#checkVIPLoanCollateralAccount");
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
| **orderId** | **Long**|  | [optional] |
| **collateralAccountId** | **Long**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**CheckVIPLoanCollateralAccountResponse**](CheckVIPLoanCollateralAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Check VIP Loan Collateral Account |  -  |

<a id="getVIPLoanAccruedInterest"></a>
# **getVIPLoanAccruedInterest**
> GetVIPLoanAccruedInterestResponse getVIPLoanAccruedInterest(orderId, loanCoin, startTime, endTime, current, limit, recvWindow)

Get VIP Loan Accrued Interest (USER_DATA)

Check VIP Loan interest record  Weight(IP): 400  Security Type: USER_DATA  Notes: - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, recent 90-day data is returned. - The maximum interval between &#x60;startTime&#x60; and &#x60;endTime&#x60; is 90 days.

### Example
```java
// Import classes:
import com.binance.connector.client.vip_loan.ApiClient;
import com.binance.connector.client.vip_loan.ApiException;
import com.binance.connector.client.vip_loan.Configuration;
import com.binance.connector.client.vip_loan.models.*;
import com.binance.connector.client.vip_loan.rest.api.UserInformationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    UserInformationApi apiInstance = new UserInformationApi(defaultClient);
    Long orderId = 1L; // Long | 
    String loanCoin = "BTC"; // String | 
    Long startTime = 1623319461670L; // Long | If both startTime and endTime are omitted, the most recent 90 days are returned.
    Long endTime = 1641782889000L; // Long | Maximum interval between startTime and endTime is 90 days.
    Long current = 1L; // Long | Current page number, starting from 1.
    Long limit = 10L; // Long | Number of records per page.
    Long recvWindow = 5000L; // Long | 
    try {
      GetVIPLoanAccruedInterestResponse result = apiInstance.getVIPLoanAccruedInterest(orderId, loanCoin, startTime, endTime, current, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserInformationApi#getVIPLoanAccruedInterest");
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
| **orderId** | **Long**|  | [optional] |
| **loanCoin** | **String**|  | [optional] |
| **startTime** | **Long**| If both startTime and endTime are omitted, the most recent 90 days are returned. | [optional] |
| **endTime** | **Long**| Maximum interval between startTime and endTime is 90 days. | [optional] |
| **current** | **Long**| Current page number, starting from 1. | [optional] |
| **limit** | **Long**| Number of records per page. | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetVIPLoanAccruedInterestResponse**](GetVIPLoanAccruedInterestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get VIP Loan Accrued Interest |  -  |

<a id="getVIPLoanOngoingOrders"></a>
# **getVIPLoanOngoingOrders**
> GetVIPLoanOngoingOrdersResponse getVIPLoanOngoingOrders(orderId, collateralAccountId, loanCoin, collateralCoin, current, limit, recvWindow)

Get VIP Loan Ongoing Orders (USER_DATA)

VIP loan is available for VIP users only.  Weight(IP): 400  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.vip_loan.ApiClient;
import com.binance.connector.client.vip_loan.ApiException;
import com.binance.connector.client.vip_loan.Configuration;
import com.binance.connector.client.vip_loan.models.*;
import com.binance.connector.client.vip_loan.rest.api.UserInformationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    UserInformationApi apiInstance = new UserInformationApi(defaultClient);
    Long orderId = 1L; // Long | 
    Long collateralAccountId = 1L; // Long | 
    String loanCoin = "BUSD"; // String | 
    String collateralCoin = "BNB,BTC,ETH"; // String | 
    Long current = 1L; // Long | 
    Long limit = 10L; // Long | 
    Long recvWindow = 5000L; // Long | 
    try {
      GetVIPLoanOngoingOrdersResponse result = apiInstance.getVIPLoanOngoingOrders(orderId, collateralAccountId, loanCoin, collateralCoin, current, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserInformationApi#getVIPLoanOngoingOrders");
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
| **orderId** | **Long**|  | [optional] |
| **collateralAccountId** | **Long**|  | [optional] |
| **loanCoin** | **String**|  | [optional] |
| **collateralCoin** | **String**|  | [optional] |
| **current** | **Long**|  | [optional] |
| **limit** | **Long**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetVIPLoanOngoingOrdersResponse**](GetVIPLoanOngoingOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get VIP Loan Ongoing Orders |  -  |

<a id="getVIPLoanRepaymentHistory"></a>
# **getVIPLoanRepaymentHistory**
> GetVIPLoanRepaymentHistoryResponse getVIPLoanRepaymentHistory(orderId, loanCoin, startTime, endTime, current, limit, recvWindow)

Get VIP Loan Repayment History (USER_DATA)

VIP Loans are available only to VIP users.  Weight(IP): 400  Security Type: USER_DATA  Notes: - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, recent 90-day data is returned. - The maximum interval between &#x60;startTime&#x60; and &#x60;endTime&#x60; is 180 days.

### Example
```java
// Import classes:
import com.binance.connector.client.vip_loan.ApiClient;
import com.binance.connector.client.vip_loan.ApiException;
import com.binance.connector.client.vip_loan.Configuration;
import com.binance.connector.client.vip_loan.models.*;
import com.binance.connector.client.vip_loan.rest.api.UserInformationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    UserInformationApi apiInstance = new UserInformationApi(defaultClient);
    Long orderId = 1L; // Long | 
    String loanCoin = "BUSD"; // String | 
    Long startTime = 1623319461670L; // Long | If both startTime and endTime are omitted, the most recent 90 days are returned.
    Long endTime = 1641782889000L; // Long | Maximum interval between startTime and endTime is 180 days.
    Long current = 1L; // Long | Current page number, starting from 1.
    Long limit = 10L; // Long | Number of records per page.
    Long recvWindow = 5000L; // Long | 
    try {
      GetVIPLoanRepaymentHistoryResponse result = apiInstance.getVIPLoanRepaymentHistory(orderId, loanCoin, startTime, endTime, current, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserInformationApi#getVIPLoanRepaymentHistory");
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
| **orderId** | **Long**|  | [optional] |
| **loanCoin** | **String**|  | [optional] |
| **startTime** | **Long**| If both startTime and endTime are omitted, the most recent 90 days are returned. | [optional] |
| **endTime** | **Long**| Maximum interval between startTime and endTime is 180 days. | [optional] |
| **current** | **Long**| Current page number, starting from 1. | [optional] |
| **limit** | **Long**| Number of records per page. | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetVIPLoanRepaymentHistoryResponse**](GetVIPLoanRepaymentHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get VIP Loan Repayment History |  -  |

<a id="queryApplicationStatus"></a>
# **queryApplicationStatus**
> QueryApplicationStatusResponse queryApplicationStatus(current, limit, recvWindow)

Query Application Status (USER_DATA)

Query Application Status  Weight(UID): 400  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.vip_loan.ApiClient;
import com.binance.connector.client.vip_loan.ApiException;
import com.binance.connector.client.vip_loan.Configuration;
import com.binance.connector.client.vip_loan.models.*;
import com.binance.connector.client.vip_loan.rest.api.UserInformationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    UserInformationApi apiInstance = new UserInformationApi(defaultClient);
    Long current = 1L; // Long | Current page number, starting from 1.
    Long limit = 10L; // Long | 
    Long recvWindow = 5000L; // Long | 
    try {
      QueryApplicationStatusResponse result = apiInstance.queryApplicationStatus(current, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserInformationApi#queryApplicationStatus");
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
| **current** | **Long**| Current page number, starting from 1. | [optional] |
| **limit** | **Long**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryApplicationStatusResponse**](QueryApplicationStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Application Status |  -  |

