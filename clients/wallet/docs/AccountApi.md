# AccountApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accountApiTradingStatus**](AccountApi.md#accountApiTradingStatus) | **GET** /sapi/v1/account/apiTradingStatus | Account API Trading Status (USER_DATA) |
| [**accountInfo**](AccountApi.md#accountInfo) | **GET** /sapi/v1/account/info | Account info (USER_DATA) |
| [**accountStatus**](AccountApi.md#accountStatus) | **GET** /sapi/v1/account/status | Account Status (USER_DATA) |
| [**dailyAccountSnapshot**](AccountApi.md#dailyAccountSnapshot) | **GET** /sapi/v1/accountSnapshot | Daily Account Snapshot (USER_DATA) |
| [**disableFastWithdrawSwitch**](AccountApi.md#disableFastWithdrawSwitch) | **POST** /sapi/v1/account/disableFastWithdrawSwitch | Disable Fast Withdraw Switch (USER_DATA) |
| [**enableFastWithdrawSwitch**](AccountApi.md#enableFastWithdrawSwitch) | **POST** /sapi/v1/account/enableFastWithdrawSwitch | Enable Fast Withdraw Switch (USER_DATA) |
| [**getApiKeyPermission**](AccountApi.md#getApiKeyPermission) | **GET** /sapi/v1/account/apiRestrictions | Get API Key Permission (USER_DATA) |


<a id="accountApiTradingStatus"></a>
# **accountApiTradingStatus**
> AccountApiTradingStatusResponse accountApiTradingStatus(recvWindow)

Account API Trading Status (USER_DATA)

Fetch account api trading status detail.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      AccountApiTradingStatusResponse result = apiInstance.accountApiTradingStatus(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#accountApiTradingStatus");
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

[**AccountApiTradingStatusResponse**](AccountApiTradingStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account API Trading Status |  -  |

<a id="accountInfo"></a>
# **accountInfo**
> AccountInfoResponse accountInfo(recvWindow)

Account info (USER_DATA)

Fetch account info detail.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      AccountInfoResponse result = apiInstance.accountInfo(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#accountInfo");
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

[**AccountInfoResponse**](AccountInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account info |  -  |

<a id="accountStatus"></a>
# **accountStatus**
> AccountStatusResponse accountStatus(recvWindow)

Account Status (USER_DATA)

Fetch account status detail.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      AccountStatusResponse result = apiInstance.accountStatus(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#accountStatus");
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

[**AccountStatusResponse**](AccountStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account Status |  -  |

<a id="dailyAccountSnapshot"></a>
# **dailyAccountSnapshot**
> DailyAccountSnapshotResponse dailyAccountSnapshot(type, startTime, endTime, limit, recvWindow)

Daily Account Snapshot (USER_DATA)

Daily account snapshot  * The query time period must be less then 30 days * Support query within the last one month only * If startTimeand endTime not sent, return records of the last 7 days by default  Weight: 2400

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String type = "type_example"; // String | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long limit = 56L; // Long | min 7, max 30, default 7
    Long recvWindow = 56L; // Long | 
    try {
      DailyAccountSnapshotResponse result = apiInstance.dailyAccountSnapshot(type, startTime, endTime, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#dailyAccountSnapshot");
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
| **type** | **String**|  | |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **limit** | **Long**| min 7, max 30, default 7 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**DailyAccountSnapshotResponse**](DailyAccountSnapshotResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Daily Account Snapshot |  -  |

<a id="disableFastWithdrawSwitch"></a>
# **disableFastWithdrawSwitch**
> disableFastWithdrawSwitch(disableFastWithdrawSwitchRequest)

Disable Fast Withdraw Switch (USER_DATA)

 Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    DisableFastWithdrawSwitchRequest disableFastWithdrawSwitchRequest = new DisableFastWithdrawSwitchRequest(); // DisableFastWithdrawSwitchRequest | 
    try {
      apiInstance.disableFastWithdrawSwitch(disableFastWithdrawSwitchRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#disableFastWithdrawSwitch");
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
| **disableFastWithdrawSwitchRequest** | [**DisableFastWithdrawSwitchRequest**](DisableFastWithdrawSwitchRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="enableFastWithdrawSwitch"></a>
# **enableFastWithdrawSwitch**
> enableFastWithdrawSwitch(enableFastWithdrawSwitchRequest)

Enable Fast Withdraw Switch (USER_DATA)

Enable Fast Withdraw Switch (USER_DATA)  * This request will enable fastwithdraw switch under your  account. &lt;br&gt;&lt;/br&gt; * When Fast Withdraw Switch is on, transferring funds to a Binance account will be done instantly. There is no on-chain transaction, no transaction ID and no withdrawal fee.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    EnableFastWithdrawSwitchRequest enableFastWithdrawSwitchRequest = new EnableFastWithdrawSwitchRequest(); // EnableFastWithdrawSwitchRequest | 
    try {
      apiInstance.enableFastWithdrawSwitch(enableFastWithdrawSwitchRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#enableFastWithdrawSwitch");
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
| **enableFastWithdrawSwitchRequest** | [**EnableFastWithdrawSwitchRequest**](EnableFastWithdrawSwitchRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getApiKeyPermission"></a>
# **getApiKeyPermission**
> GetApiKeyPermissionResponse getApiKeyPermission(recvWindow)

Get API Key Permission (USER_DATA)

Get API Key Permission  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      GetApiKeyPermissionResponse result = apiInstance.getApiKeyPermission(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getApiKeyPermission");
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

[**GetApiKeyPermissionResponse**](GetApiKeyPermissionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get API Key Permission |  -  |

