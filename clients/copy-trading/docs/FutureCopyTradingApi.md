# FutureCopyTradingApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFuturesLeadTraderStatus**](FutureCopyTradingApi.md#getFuturesLeadTraderStatus) | **GET** /sapi/v1/copyTrading/futures/userStatus | Get Futures Lead Trader Status(TRADE) |
| [**getFuturesLeadTradingSymbolWhitelist**](FutureCopyTradingApi.md#getFuturesLeadTradingSymbolWhitelist) | **GET** /sapi/v1/copyTrading/futures/leadSymbol | Get Futures Lead Trading Symbol Whitelist(USER_DATA) |


<a id="getFuturesLeadTraderStatus"></a>
# **getFuturesLeadTraderStatus**
> GetFuturesLeadTraderStatusResponse getFuturesLeadTraderStatus(recvWindow)

Get Futures Lead Trader Status(TRADE)

Get Futures Lead Trader Status  Weight: 20

### Example
```java
// Import classes:
import com.binance.connector.client.copy_trading.ApiClient;
import com.binance.connector.client.copy_trading.ApiException;
import com.binance.connector.client.copy_trading.Configuration;
import com.binance.connector.client.copy_trading.models.*;
import com.binance.connector.client.copy_trading.rest.api.FutureCopyTradingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FutureCopyTradingApi apiInstance = new FutureCopyTradingApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      GetFuturesLeadTraderStatusResponse result = apiInstance.getFuturesLeadTraderStatus(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FutureCopyTradingApi#getFuturesLeadTraderStatus");
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

[**GetFuturesLeadTraderStatusResponse**](GetFuturesLeadTraderStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Futures Lead Trader Status |  -  |

<a id="getFuturesLeadTradingSymbolWhitelist"></a>
# **getFuturesLeadTradingSymbolWhitelist**
> GetFuturesLeadTradingSymbolWhitelistResponse getFuturesLeadTradingSymbolWhitelist(recvWindow)

Get Futures Lead Trading Symbol Whitelist(USER_DATA)

Get Futures Lead Trading Symbol Whitelist  Weight: 20

### Example
```java
// Import classes:
import com.binance.connector.client.copy_trading.ApiClient;
import com.binance.connector.client.copy_trading.ApiException;
import com.binance.connector.client.copy_trading.Configuration;
import com.binance.connector.client.copy_trading.models.*;
import com.binance.connector.client.copy_trading.rest.api.FutureCopyTradingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FutureCopyTradingApi apiInstance = new FutureCopyTradingApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      GetFuturesLeadTradingSymbolWhitelistResponse result = apiInstance.getFuturesLeadTradingSymbolWhitelist(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FutureCopyTradingApi#getFuturesLeadTradingSymbolWhitelist");
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

[**GetFuturesLeadTradingSymbolWhitelistResponse**](GetFuturesLeadTradingSymbolWhitelistResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Futures Lead Trading Symbol Whitelist |  -  |

