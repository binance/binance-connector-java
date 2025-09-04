# AccountApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accountInformation**](AccountApi.md#accountInformation) | **POST** /account.status | Account Information(USER_DATA) |
| [**futuresAccountBalance**](AccountApi.md#futuresAccountBalance) | **POST** /account.balance | Futures Account Balance(USER_DATA) |


<a id="accountInformation"></a>
# **accountInformation**
> AccountInformationResponse accountInformation(accountInformationRequest)

Account Information(USER_DATA)

Get current account information. User in single-asset/ multi-assets mode will see different value, see comments in response section for detail.  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.api.api.AccountApi;

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

<a id="futuresAccountBalance"></a>
# **futuresAccountBalance**
> FuturesAccountBalanceResponse futuresAccountBalance(futuresAccountBalanceRequest)

Futures Account Balance(USER_DATA)

Query account balance info  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.api.api.AccountApi;

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

