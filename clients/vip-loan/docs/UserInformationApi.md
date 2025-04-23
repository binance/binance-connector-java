# UserInformationApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkVIPLoanCollateralAccount**](UserInformationApi.md#checkVIPLoanCollateralAccount) | **GET** /sapi/v1/loan/vip/collateral/account | Check VIP Loan Collateral Account (USER_DATA) |
| [**getVIPLoanOngoingOrders**](UserInformationApi.md#getVIPLoanOngoingOrders) | **GET** /sapi/v1/loan/vip/ongoing/orders | Get VIP Loan Ongoing Orders(USER_DATA) |
| [**queryApplicationStatus**](UserInformationApi.md#queryApplicationStatus) | **GET** /sapi/v1/loan/vip/request/data | Query Application Status(USER_DATA) |


<a id="checkVIPLoanCollateralAccount"></a>
# **checkVIPLoanCollateralAccount**
> CheckVIPLoanCollateralAccountResponse checkVIPLoanCollateralAccount(orderId, collateralAccountId, recvWindow)

Check VIP Loan Collateral Account (USER_DATA)

VIP loan is available for VIP users only  * If the login account is loan account, all collateral accounts under the loan account can be queried. * If the login account is collateral account, only the current collateral account can be queried.  Weight: 6000

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
    Long orderId = 56L; // Long | 
    Long collateralAccountId = 56L; // Long | 
    Long recvWindow = 56L; // Long | 
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

<a id="getVIPLoanOngoingOrders"></a>
# **getVIPLoanOngoingOrders**
> GetVIPLoanOngoingOrdersResponse getVIPLoanOngoingOrders(orderId, collateralAccountId, loanCoin, collateralCoin, current, limit, recvWindow)

Get VIP Loan Ongoing Orders(USER_DATA)

VIP loan is available for VIP users only.  Weight: 400

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
    Long orderId = 56L; // Long | 
    Long collateralAccountId = 56L; // Long | 
    String loanCoin = "loanCoin_example"; // String | 
    String collateralCoin = "collateralCoin_example"; // String | 
    Long current = 56L; // Long | Currently querying page. Start from 1, Default:1, Max: 1000.
    Long limit = 56L; // Long | Default: 10, Max: 100
    Long recvWindow = 56L; // Long | 
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
| **current** | **Long**| Currently querying page. Start from 1, Default:1, Max: 1000. | [optional] |
| **limit** | **Long**| Default: 10, Max: 100 | [optional] |
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

<a id="queryApplicationStatus"></a>
# **queryApplicationStatus**
> QueryApplicationStatusResponse queryApplicationStatus(current, limit, recvWindow)

Query Application Status(USER_DATA)

Query Application Status  Weight: 400

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
    Long current = 56L; // Long | Currently querying page. Start from 1, Default:1, Max: 1000.
    Long limit = 56L; // Long | Default: 10, Max: 100
    Long recvWindow = 56L; // Long | 
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
| **current** | **Long**| Currently querying page. Start from 1, Default:1, Max: 1000. | [optional] |
| **limit** | **Long**| Default: 10, Max: 100 | [optional] |
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

