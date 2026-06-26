# WalletApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPortfolio**](WalletApi.md#getPortfolio) | **GET** /sapi/v1/w3w/wallet/prediction/pnl/portfolio | Get Portfolio |
| [**getQuotaStatus**](WalletApi.md#getQuotaStatus) | **GET** /sapi/v1/w3w/wallet/prediction/quota/limit/status | Get Quota Status |
| [**listPredictionWallets**](WalletApi.md#listPredictionWallets) | **GET** /sapi/v1/w3w/wallet/prediction/wallet/list | List Prediction Wallets |
| [**queryPaymentOptionBalances**](WalletApi.md#queryPaymentOptionBalances) | **GET** /sapi/v1/w3w/wallet/prediction/balance/payment-options | Query Payment Option Balances |


<a id="getPortfolio"></a>
# **getPortfolio**
> GetPortfolioResponse getPortfolio(walletAddress, tokenId, marketId, marketTopicId, activeOnly, recvWindow)

Get Portfolio

Get the authenticated user&#39;s prediction portfolio overview including active positions count, aggregated PnL, and full position list.  Weight(IP): 200  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.WalletApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    WalletApi apiInstance = new WalletApi(defaultClient);
    String walletAddress = "0x12e32db8817e292508c34111cbc4b23340df542c"; // String | User's prediction wallet address
    String tokenId = "112233"; // String | Filter by prediction token ID
    Long marketId = 5567895L; // Long | Filter by market ID. Must be > 0
    Long marketTopicId = 4229564L; // Long | Filter by market topic ID. Must be > 0
    Boolean activeOnly = false; // Boolean | If `true`, return only active (unresolved) positions
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
    try {
      GetPortfolioResponse result = apiInstance.getPortfolio(walletAddress, tokenId, marketId, marketTopicId, activeOnly, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletApi#getPortfolio");
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
| **walletAddress** | **String**| User&#39;s prediction wallet address | |
| **tokenId** | **String**| Filter by prediction token ID | [optional] |
| **marketId** | **Long**| Filter by market ID. Must be &gt; 0 | [optional] |
| **marketTopicId** | **Long**| Filter by market topic ID. Must be &gt; 0 | [optional] |
| **activeOnly** | **Boolean**| If &#x60;true&#x60;, return only active (unresolved) positions | [optional] |
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

### Return type

[**GetPortfolioResponse**](GetPortfolioResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Portfolio |  -  |

<a id="getQuotaStatus"></a>
# **getQuotaStatus**
> GetQuotaStatusResponse getQuotaStatus(recvWindow)

Get Quota Status

Query the current user&#39;s daily trading quota limit and remaining allowance for prediction markets.  Weight(IP): 200  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.WalletApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    WalletApi apiInstance = new WalletApi(defaultClient);
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
    try {
      GetQuotaStatusResponse result = apiInstance.getQuotaStatus(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletApi#getQuotaStatus");
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
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

### Return type

[**GetQuotaStatusResponse**](GetQuotaStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Quota Status |  -  |

<a id="listPredictionWallets"></a>
# **listPredictionWallets**
> ListPredictionWalletsResponse listPredictionWallets(recvWindow)

List Prediction Wallets

Get all prediction wallets registered for the authenticated user.  Weight(IP): 200  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.WalletApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    WalletApi apiInstance = new WalletApi(defaultClient);
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
    try {
      ListPredictionWalletsResponse result = apiInstance.listPredictionWallets(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletApi#listPredictionWallets");
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
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

### Return type

[**ListPredictionWalletsResponse**](ListPredictionWalletsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Prediction Wallets |  -  |

<a id="queryPaymentOptionBalances"></a>
# **queryPaymentOptionBalances**
> QueryPaymentOptionBalancesResponse queryPaymentOptionBalances(recvWindow)

Query Payment Option Balances

Get available balances for each payment option that can be used for prediction trading.  Weight(IP): 200  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.WalletApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    WalletApi apiInstance = new WalletApi(defaultClient);
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
    try {
      QueryPaymentOptionBalancesResponse result = apiInstance.queryPaymentOptionBalances(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletApi#queryPaymentOptionBalances");
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
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

### Return type

[**QueryPaymentOptionBalancesResponse**](QueryPaymentOptionBalancesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Query Payment Option Balances |  -  |

