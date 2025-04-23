# AccountApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accountInformation**](AccountApi.md#accountInformation) | **POST** /account.status | Account Information(USER_DATA) |
| [**accountInformationV2**](AccountApi.md#accountInformationV2) | **POST** /v2/account.status | Account Information V2(USER_DATA) |
| [**futuresAccountBalance**](AccountApi.md#futuresAccountBalance) | **POST** /account.balance | Futures Account Balance(USER_DATA) |
| [**futuresAccountBalanceV2**](AccountApi.md#futuresAccountBalanceV2) | **POST** /v2/account.balance | Futures Account Balance V2(USER_DATA) |


<a id="accountInformation"></a>
# **accountInformation**
> AccountInformationResponse accountInformation(accountInformationRequest)

Account Information(USER_DATA)

Get current account information. User in single-asset/ multi-assets mode will see different value, see comments in response section for detail.  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApi apiInstance = new AccountApi(defaultClient);
    AccountInformationRequest accountInformationRequest = new AccountInformationRequest(); // AccountInformationRequest | 
    try {
      AccountInformationResponse result = apiInstance.accountInformation(accountInformationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#accountInformation");
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
| **accountInformationRequest** | [**AccountInformationRequest**](AccountInformationRequest.md)|  | |

### Return type

[**AccountInformationResponse**](AccountInformationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account Information |  -  |

<a id="accountInformationV2"></a>
# **accountInformationV2**
> AccountInformationV2Response accountInformationV2(accountInformationV2Request)

Account Information V2(USER_DATA)

Get current account information. User in single-asset/ multi-assets mode will see different value, see comments in response section for detail.  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApi apiInstance = new AccountApi(defaultClient);
    AccountInformationV2Request accountInformationV2Request = new AccountInformationV2Request(); // AccountInformationV2Request | 
    try {
      AccountInformationV2Response result = apiInstance.accountInformationV2(accountInformationV2Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#accountInformationV2");
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
| **accountInformationV2Request** | [**AccountInformationV2Request**](AccountInformationV2Request.md)|  | |

### Return type

[**AccountInformationV2Response**](AccountInformationV2Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account Information V2 |  -  |

<a id="futuresAccountBalance"></a>
# **futuresAccountBalance**
> FuturesAccountBalanceResponse futuresAccountBalance(futuresAccountBalanceRequest)

Futures Account Balance(USER_DATA)

Query account balance info  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApi apiInstance = new AccountApi(defaultClient);
    FuturesAccountBalanceRequest futuresAccountBalanceRequest = new FuturesAccountBalanceRequest(); // FuturesAccountBalanceRequest | 
    try {
      FuturesAccountBalanceResponse result = apiInstance.futuresAccountBalance(futuresAccountBalanceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#futuresAccountBalance");
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
| **futuresAccountBalanceRequest** | [**FuturesAccountBalanceRequest**](FuturesAccountBalanceRequest.md)|  | |

### Return type

[**FuturesAccountBalanceResponse**](FuturesAccountBalanceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Futures Account Balance |  -  |

<a id="futuresAccountBalanceV2"></a>
# **futuresAccountBalanceV2**
> FuturesAccountBalanceV2Response futuresAccountBalanceV2(futuresAccountBalanceV2Request)

Futures Account Balance V2(USER_DATA)

Query account balance info  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApi apiInstance = new AccountApi(defaultClient);
    FuturesAccountBalanceV2Request futuresAccountBalanceV2Request = new FuturesAccountBalanceV2Request(); // FuturesAccountBalanceV2Request | 
    try {
      FuturesAccountBalanceV2Response result = apiInstance.futuresAccountBalanceV2(futuresAccountBalanceV2Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#futuresAccountBalanceV2");
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
| **futuresAccountBalanceV2Request** | [**FuturesAccountBalanceV2Request**](FuturesAccountBalanceV2Request.md)|  | |

### Return type

[**FuturesAccountBalanceV2Response**](FuturesAccountBalanceV2Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Futures Account Balance V2 |  -  |

