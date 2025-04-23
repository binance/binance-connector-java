# AccountManagementApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAVirtualSubAccount**](AccountManagementApi.md#createAVirtualSubAccount) | **POST** /sapi/v1/sub-account/virtualSubAccount | Create a Virtual Sub-account(For Master Account) |
| [**enableFuturesForSubAccount**](AccountManagementApi.md#enableFuturesForSubAccount) | **POST** /sapi/v1/sub-account/futures/enable | Enable Futures for Sub-account(For Master Account) |
| [**enableLeverageTokenForSubAccount**](AccountManagementApi.md#enableLeverageTokenForSubAccount) | **POST** /sapi/v1/sub-account/blvt/enable | Enable Leverage Token for Sub-account(For Master Account) |
| [**enableMarginForSubAccount**](AccountManagementApi.md#enableMarginForSubAccount) | **POST** /sapi/v1/sub-account/margin/enable | Enable Margin for Sub-account(For Master Account) |
| [**enableOptionsForSubAccount**](AccountManagementApi.md#enableOptionsForSubAccount) | **POST** /sapi/v1/sub-account/eoptions/enable | Enable Options for Sub-account(For Master Account)(USER_DATA) |
| [**getFuturesPositionRiskOfSubAccount**](AccountManagementApi.md#getFuturesPositionRiskOfSubAccount) | **GET** /sapi/v1/sub-account/futures/positionRisk | Get Futures Position-Risk of Sub-account(For Master Account) |
| [**getFuturesPositionRiskOfSubAccountV2**](AccountManagementApi.md#getFuturesPositionRiskOfSubAccountV2) | **GET** /sapi/v2/sub-account/futures/positionRisk | Get Futures Position-Risk of Sub-account V2(For Master Account) |
| [**getSubAccountsStatusOnMarginOrFutures**](AccountManagementApi.md#getSubAccountsStatusOnMarginOrFutures) | **GET** /sapi/v1/sub-account/status | Get Sub-account&#39;s Status on Margin Or Futures(For Master Account) |
| [**querySubAccountList**](AccountManagementApi.md#querySubAccountList) | **GET** /sapi/v1/sub-account/list | Query Sub-account List(For Master Account) |
| [**querySubAccountTransactionStatistics**](AccountManagementApi.md#querySubAccountTransactionStatistics) | **GET** /sapi/v1/sub-account/transaction-statistics | Query Sub-account Transaction Statistics(For Master Account)(USER_DATA) |


<a id="createAVirtualSubAccount"></a>
# **createAVirtualSubAccount**
> CreateAVirtualSubAccountResponse createAVirtualSubAccount(createAVirtualSubAccountRequest)

Create a Virtual Sub-account(For Master Account)

Create a Virtual Sub-account  * This request will generate a virtual sub account under your master account. * You need to enable \&quot;trade\&quot; option for the API Key which requests this endpoint.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AccountManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountManagementApi apiInstance = new AccountManagementApi(defaultClient);
    CreateAVirtualSubAccountRequest createAVirtualSubAccountRequest = new CreateAVirtualSubAccountRequest(); // CreateAVirtualSubAccountRequest | 
    try {
      CreateAVirtualSubAccountResponse result = apiInstance.createAVirtualSubAccount(createAVirtualSubAccountRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementApi#createAVirtualSubAccount");
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
| **createAVirtualSubAccountRequest** | [**CreateAVirtualSubAccountRequest**](CreateAVirtualSubAccountRequest.md)|  | |

### Return type

[**CreateAVirtualSubAccountResponse**](CreateAVirtualSubAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a Virtual Sub-account |  -  |

<a id="enableFuturesForSubAccount"></a>
# **enableFuturesForSubAccount**
> EnableFuturesForSubAccountResponse enableFuturesForSubAccount(enableFuturesForSubAccountRequest)

Enable Futures for Sub-account(For Master Account)

Enable Futures for Sub-account for Master Account  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AccountManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountManagementApi apiInstance = new AccountManagementApi(defaultClient);
    EnableFuturesForSubAccountRequest enableFuturesForSubAccountRequest = new EnableFuturesForSubAccountRequest(); // EnableFuturesForSubAccountRequest | 
    try {
      EnableFuturesForSubAccountResponse result = apiInstance.enableFuturesForSubAccount(enableFuturesForSubAccountRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementApi#enableFuturesForSubAccount");
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
| **enableFuturesForSubAccountRequest** | [**EnableFuturesForSubAccountRequest**](EnableFuturesForSubAccountRequest.md)|  | |

### Return type

[**EnableFuturesForSubAccountResponse**](EnableFuturesForSubAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Enable Futures for Sub-account |  -  |

<a id="enableLeverageTokenForSubAccount"></a>
# **enableLeverageTokenForSubAccount**
> EnableLeverageTokenForSubAccountResponse enableLeverageTokenForSubAccount(enableLeverageTokenForSubAccountRequest)

Enable Leverage Token for Sub-account(For Master Account)

Enable Leverage Token for Sub-account  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AccountManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountManagementApi apiInstance = new AccountManagementApi(defaultClient);
    EnableLeverageTokenForSubAccountRequest enableLeverageTokenForSubAccountRequest = new EnableLeverageTokenForSubAccountRequest(); // EnableLeverageTokenForSubAccountRequest | 
    try {
      EnableLeverageTokenForSubAccountResponse result = apiInstance.enableLeverageTokenForSubAccount(enableLeverageTokenForSubAccountRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementApi#enableLeverageTokenForSubAccount");
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
| **enableLeverageTokenForSubAccountRequest** | [**EnableLeverageTokenForSubAccountRequest**](EnableLeverageTokenForSubAccountRequest.md)|  | |

### Return type

[**EnableLeverageTokenForSubAccountResponse**](EnableLeverageTokenForSubAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Enable Leverage Token for Sub-account |  -  |

<a id="enableMarginForSubAccount"></a>
# **enableMarginForSubAccount**
> EnableMarginForSubAccountResponse enableMarginForSubAccount(enableMarginForSubAccountRequest)

Enable Margin for Sub-account(For Master Account)

Enable Margin for Sub-account  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AccountManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountManagementApi apiInstance = new AccountManagementApi(defaultClient);
    EnableMarginForSubAccountRequest enableMarginForSubAccountRequest = new EnableMarginForSubAccountRequest(); // EnableMarginForSubAccountRequest | 
    try {
      EnableMarginForSubAccountResponse result = apiInstance.enableMarginForSubAccount(enableMarginForSubAccountRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementApi#enableMarginForSubAccount");
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
| **enableMarginForSubAccountRequest** | [**EnableMarginForSubAccountRequest**](EnableMarginForSubAccountRequest.md)|  | |

### Return type

[**EnableMarginForSubAccountResponse**](EnableMarginForSubAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Enable Margin for Sub-account |  -  |

<a id="enableOptionsForSubAccount"></a>
# **enableOptionsForSubAccount**
> EnableOptionsForSubAccountResponse enableOptionsForSubAccount(enableOptionsForSubAccountRequest)

Enable Options for Sub-account(For Master Account)(USER_DATA)

Enable Options for Sub-account (For Master Account).  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AccountManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountManagementApi apiInstance = new AccountManagementApi(defaultClient);
    EnableOptionsForSubAccountRequest enableOptionsForSubAccountRequest = new EnableOptionsForSubAccountRequest(); // EnableOptionsForSubAccountRequest | 
    try {
      EnableOptionsForSubAccountResponse result = apiInstance.enableOptionsForSubAccount(enableOptionsForSubAccountRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementApi#enableOptionsForSubAccount");
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
| **enableOptionsForSubAccountRequest** | [**EnableOptionsForSubAccountRequest**](EnableOptionsForSubAccountRequest.md)|  | |

### Return type

[**EnableOptionsForSubAccountResponse**](EnableOptionsForSubAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Enable Options for Sub-account |  -  |

<a id="getFuturesPositionRiskOfSubAccount"></a>
# **getFuturesPositionRiskOfSubAccount**
> GetFuturesPositionRiskOfSubAccountResponse getFuturesPositionRiskOfSubAccount(email, recvWindow)

Get Futures Position-Risk of Sub-account(For Master Account)

Get Futures Position-Risk of Sub-account  Weight: 10

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AccountManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountManagementApi apiInstance = new AccountManagementApi(defaultClient);
    String email = "email_example"; // String | [Sub-account email](#email-address)
    Long recvWindow = 56L; // Long | 
    try {
      GetFuturesPositionRiskOfSubAccountResponse result = apiInstance.getFuturesPositionRiskOfSubAccount(email, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementApi#getFuturesPositionRiskOfSubAccount");
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
| **email** | **String**| [Sub-account email](#email-address) | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetFuturesPositionRiskOfSubAccountResponse**](GetFuturesPositionRiskOfSubAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Futures Position-Risk of Sub-account |  -  |

<a id="getFuturesPositionRiskOfSubAccountV2"></a>
# **getFuturesPositionRiskOfSubAccountV2**
> GetFuturesPositionRiskOfSubAccountV2Response getFuturesPositionRiskOfSubAccountV2(email, futuresType, recvWindow)

Get Futures Position-Risk of Sub-account V2(For Master Account)

Get Futures Position-Risk of Sub-account V2  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AccountManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountManagementApi apiInstance = new AccountManagementApi(defaultClient);
    String email = "email_example"; // String | [Sub-account email](#email-address)
    Long futuresType = 56L; // Long | 1:USDT-margined Futures，2: Coin-margined Futures
    Long recvWindow = 56L; // Long | 
    try {
      GetFuturesPositionRiskOfSubAccountV2Response result = apiInstance.getFuturesPositionRiskOfSubAccountV2(email, futuresType, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementApi#getFuturesPositionRiskOfSubAccountV2");
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
| **email** | **String**| [Sub-account email](#email-address) | |
| **futuresType** | **Long**| 1:USDT-margined Futures，2: Coin-margined Futures | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetFuturesPositionRiskOfSubAccountV2Response**](GetFuturesPositionRiskOfSubAccountV2Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Futures Position-Risk of Sub-account V2 |  -  |

<a id="getSubAccountsStatusOnMarginOrFutures"></a>
# **getSubAccountsStatusOnMarginOrFutures**
> GetSubAccountsStatusOnMarginOrFuturesResponse getSubAccountsStatusOnMarginOrFutures(email, recvWindow)

Get Sub-account&#39;s Status on Margin Or Futures(For Master Account)

Get Sub-account&#39;s Status on Margin Or Futures  * If no email sent, all sub-accounts&#39; information will be returned.  Weight: 10

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AccountManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountManagementApi apiInstance = new AccountManagementApi(defaultClient);
    String email = "email_example"; // String | Managed sub-account email
    Long recvWindow = 56L; // Long | 
    try {
      GetSubAccountsStatusOnMarginOrFuturesResponse result = apiInstance.getSubAccountsStatusOnMarginOrFutures(email, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementApi#getSubAccountsStatusOnMarginOrFutures");
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
| **email** | **String**| Managed sub-account email | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetSubAccountsStatusOnMarginOrFuturesResponse**](GetSubAccountsStatusOnMarginOrFuturesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Sub-account&#39;s Status on Margin Or Futures |  -  |

<a id="querySubAccountList"></a>
# **querySubAccountList**
> QuerySubAccountListResponse querySubAccountList(email, isFreeze, page, limit, recvWindow)

Query Sub-account List(For Master Account)

Query Sub-account List  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AccountManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountManagementApi apiInstance = new AccountManagementApi(defaultClient);
    String email = "email_example"; // String | Managed sub-account email
    String isFreeze = "isFreeze_example"; // String | true or false
    Long page = 56L; // Long | Default value: 1
    Long limit = 56L; // Long | Default value: 1, Max value: 200
    Long recvWindow = 56L; // Long | 
    try {
      QuerySubAccountListResponse result = apiInstance.querySubAccountList(email, isFreeze, page, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementApi#querySubAccountList");
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
| **email** | **String**| Managed sub-account email | [optional] |
| **isFreeze** | **String**| true or false | [optional] |
| **page** | **Long**| Default value: 1 | [optional] |
| **limit** | **Long**| Default value: 1, Max value: 200 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QuerySubAccountListResponse**](QuerySubAccountListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sub-account List |  -  |

<a id="querySubAccountTransactionStatistics"></a>
# **querySubAccountTransactionStatistics**
> QuerySubAccountTransactionStatisticsResponse querySubAccountTransactionStatistics(email, recvWindow)

Query Sub-account Transaction Statistics(For Master Account)(USER_DATA)

Query Sub-account Transaction statistics (For Master Account).  Weight: 60

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AccountManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountManagementApi apiInstance = new AccountManagementApi(defaultClient);
    String email = "email_example"; // String | [Sub-account email](#email-address)
    Long recvWindow = 56L; // Long | 
    try {
      QuerySubAccountTransactionStatisticsResponse result = apiInstance.querySubAccountTransactionStatistics(email, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementApi#querySubAccountTransactionStatistics");
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
| **email** | **String**| [Sub-account email](#email-address) | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QuerySubAccountTransactionStatisticsResponse**](QuerySubAccountTransactionStatisticsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sub-account Transaction Statistics |  -  |

