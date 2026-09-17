# MarketDataApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**exchangeInfo**](MarketDataApi.md#exchangeInfo) | **GET** /sapi/v1/equity/market/exchangeInfo | Exchange Info (MARKET_DATA) |
| [**latestQuote**](MarketDataApi.md#latestQuote) | **GET** /sapi/v1/equity/market/quote | Latest Quote (MARKET_DATA) |
| [**tokenizedAssets**](MarketDataApi.md#tokenizedAssets) | **GET** /sapi/v1/equity/market/tokenized-assets | Tokenized Assets (MARKET_DATA) |


<a id="exchangeInfo"></a>
# **exchangeInfo**
> ExchangeInfoResponse exchangeInfo(symbol)

Exchange Info (MARKET_DATA)

Returns current exchange trading rules and the list of tradable US-equity symbols. MARKET_DATA endpoint — requires an API key (&#x60;X-MBX-APIKEY&#x60;) but no signature. Response is served from a server-side cache.  Weight: 1  Security Type: MARKET_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.stocks.ApiClient;
import com.binance.connector.client.stocks.ApiException;
import com.binance.connector.client.stocks.Configuration;
import com.binance.connector.client.stocks.models.*;
import com.binance.connector.client.stocks.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String symbol = "AAPL"; // String | Filter to a single US-equity ticker, e.g. `AAPL`. When omitted, returns all active symbols. An unknown ticker returns an empty `symbols` array (HTTP 200), not an error.
    try {
      ExchangeInfoResponse result = apiInstance.exchangeInfo(symbol);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#exchangeInfo");
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
| **symbol** | **String**| Filter to a single US-equity ticker, e.g. &#x60;AAPL&#x60;. When omitted, returns all active symbols. An unknown ticker returns an empty &#x60;symbols&#x60; array (HTTP 200), not an error. | [optional] |

### Return type

[**ExchangeInfoResponse**](ExchangeInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Exchange Info |  -  |

<a id="latestQuote"></a>
# **latestQuote**
> LatestQuoteResponse latestQuote(symbol)

Latest Quote (MARKET_DATA)

Returns the latest best bid / best ask for a single US-equity ticker. The returned value is at most ~5 seconds stale. Returns an **empty response body** (not the literal &#x60;null&#x60;) when no quote is available for the supplied ticker (e.g. the ticker is unknown, halted, or de-listed).  Weight: 1  Security Type: MARKET_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.stocks.ApiClient;
import com.binance.connector.client.stocks.ApiException;
import com.binance.connector.client.stocks.Configuration;
import com.binance.connector.client.stocks.models.*;
import com.binance.connector.client.stocks.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String symbol = "AAPL"; // String | US-equity ticker, e.g. `AAPL`, `TSLA`. Case-insensitive; uppercased server-side.
    try {
      LatestQuoteResponse result = apiInstance.latestQuote(symbol);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#latestQuote");
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
| **symbol** | **String**| US-equity ticker, e.g. &#x60;AAPL&#x60;, &#x60;TSLA&#x60;. Case-insensitive; uppercased server-side. | |

### Return type

[**LatestQuoteResponse**](LatestQuoteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Latest Quote |  -  |

<a id="tokenizedAssets"></a>
# **tokenizedAssets**
> TokenizedAssetsResponse tokenizedAssets()

Tokenized Assets (MARKET_DATA)

Returns the list of all tokenized assets currently available for mint / redeem, together with each asset&#39;s underlying equity symbol and conversion multiplier. MARKET_DATA endpoint — requires an API key (&#x60;X-MBX-APIKEY&#x60;) but no signature. Response is served from a server-side cache.  Weight: 1  Security Type: MARKET_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.stocks.ApiClient;
import com.binance.connector.client.stocks.ApiException;
import com.binance.connector.client.stocks.Configuration;
import com.binance.connector.client.stocks.models.*;
import com.binance.connector.client.stocks.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    try {
      TokenizedAssetsResponse result = apiInstance.tokenizedAssets();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#tokenizedAssets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TokenizedAssetsResponse**](TokenizedAssetsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tokenized Assets |  -  |

