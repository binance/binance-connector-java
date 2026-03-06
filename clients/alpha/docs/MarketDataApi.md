# MarketDataApi

All URIs are relative to *https://www.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aggregatedTrades**](MarketDataApi.md#aggregatedTrades) | **GET** /bapi/defi/v1/public/alpha-trade/agg-trades | Aggregated Trades |
| [**getExchangeInfo**](MarketDataApi.md#getExchangeInfo) | **GET** /bapi/defi/v1/public/alpha-trade/get-exchange-info | Get Exchange Info |
| [**klines**](MarketDataApi.md#klines) | **GET** /bapi/defi/v1/public/alpha-trade/klines | Klines (Candlestick Data) |
| [**ticker**](MarketDataApi.md#ticker) | **GET** /bapi/defi/v1/public/alpha-trade/ticker | Ticker (24hr Price Statistics) |
| [**tokenList**](MarketDataApi.md#tokenList) | **GET** /bapi/defi/v1/public/wallet-direct/buw/wallet/cex/alpha/all/token/list | Token List |


<a id="aggregatedTrades"></a>
# **aggregatedTrades**
> AggregatedTradesResponse aggregatedTrades(symbol, fromId, startTime, endTime, limit)

Aggregated Trades

Retrieves compressed, aggregated historical trades for a specific symbol. Useful for recent trade history.  Weight: 0

### Example
```java
// Import classes:
import com.binance.connector.client.alpha.ApiClient;
import com.binance.connector.client.alpha.ApiException;
import com.binance.connector.client.alpha.Configuration;
import com.binance.connector.client.alpha.models.*;
import com.binance.connector.client.alpha.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String symbol = "symbol_example"; // String | e.g., \"ALPHA_175USDT\" – use token ID from Token List
    Long fromId = 56L; // Long | starting trade ID to fetch from
    Long startTime = 56L; // Long | start timestamp (milliseconds)
    Long endTime = 56L; // Long | end timestamp (milliseconds)
    Long limit = 56L; // Long | number of results to return (default 500, max 1000)
    try {
      AggregatedTradesResponse result = apiInstance.aggregatedTrades(symbol, fromId, startTime, endTime, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#aggregatedTrades");
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
| **symbol** | **String**| e.g., \&quot;ALPHA_175USDT\&quot; – use token ID from Token List | |
| **fromId** | **Long**| starting trade ID to fetch from | [optional] |
| **startTime** | **Long**| start timestamp (milliseconds) | [optional] |
| **endTime** | **Long**| end timestamp (milliseconds) | [optional] |
| **limit** | **Long**| number of results to return (default 500, max 1000) | [optional] |

### Return type

[**AggregatedTradesResponse**](AggregatedTradesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Aggregated Trades |  -  |

<a id="getExchangeInfo"></a>
# **getExchangeInfo**
> GetExchangeInfoResponse getExchangeInfo()

Get Exchange Info

Fetches general exchange information, such as supported symbols, rate limits, and server time.  Weight: 0

### Example
```java
// Import classes:
import com.binance.connector.client.alpha.ApiClient;
import com.binance.connector.client.alpha.ApiException;
import com.binance.connector.client.alpha.Configuration;
import com.binance.connector.client.alpha.models.*;
import com.binance.connector.client.alpha.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    try {
      GetExchangeInfoResponse result = apiInstance.getExchangeInfo();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#getExchangeInfo");
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

[**GetExchangeInfoResponse**](GetExchangeInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Exchange Info |  -  |

<a id="klines"></a>
# **klines**
> KlinesResponse klines(symbol, interval, limit, startTime, endTime)

Klines (Candlestick Data)

Fetches Kline/candlestick bars for a symbol, which include open/high/low/close prices and volume over intervals. Useful for charting and analysis.  Weight: 0

### Example
```java
// Import classes:
import com.binance.connector.client.alpha.ApiClient;
import com.binance.connector.client.alpha.ApiException;
import com.binance.connector.client.alpha.Configuration;
import com.binance.connector.client.alpha.models.*;
import com.binance.connector.client.alpha.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String symbol = "symbol_example"; // String | e.g., \"ALPHA_175USDT\" – use token ID from Token List
    String interval = "interval_example"; // String | e.g., \"1h\" – supported intervals: 1s, 15s, 1m, 3m, 5m, 15m, 30m, 1h, 2h, 4h, 6h, 8h, 12h, 1d, 3d, 1w, 1M
    Long limit = 56L; // Long | number of results to return (default 500, max 1000)
    Long startTime = 56L; // Long | start timestamp (milliseconds)
    Long endTime = 56L; // Long | end timestamp (milliseconds)
    try {
      KlinesResponse result = apiInstance.klines(symbol, interval, limit, startTime, endTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#klines");
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
| **symbol** | **String**| e.g., \&quot;ALPHA_175USDT\&quot; – use token ID from Token List | |
| **interval** | **String**| e.g., \&quot;1h\&quot; – supported intervals: 1s, 15s, 1m, 3m, 5m, 15m, 30m, 1h, 2h, 4h, 6h, 8h, 12h, 1d, 3d, 1w, 1M | |
| **limit** | **Long**| number of results to return (default 500, max 1000) | [optional] |
| **startTime** | **Long**| start timestamp (milliseconds) | [optional] |
| **endTime** | **Long**| end timestamp (milliseconds) | [optional] |

### Return type

[**KlinesResponse**](KlinesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Klines |  -  |

<a id="ticker"></a>
# **ticker**
> TickerResponse ticker(symbol)

Ticker (24hr Price Statistics)

Gets the 24-hour rolling window price change statistics for a symbol, including volume and price changes.  Weight: 0

### Example
```java
// Import classes:
import com.binance.connector.client.alpha.ApiClient;
import com.binance.connector.client.alpha.ApiException;
import com.binance.connector.client.alpha.Configuration;
import com.binance.connector.client.alpha.models.*;
import com.binance.connector.client.alpha.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String symbol = "symbol_example"; // String | e.g., \"ALPHA_175USDT\" – use token ID from Token List
    try {
      TickerResponse result = apiInstance.ticker(symbol);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#ticker");
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
| **symbol** | **String**| e.g., \&quot;ALPHA_175USDT\&quot; – use token ID from Token List | |

### Return type

[**TickerResponse**](TickerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ticker |  -  |

<a id="tokenList"></a>
# **tokenList**
> TokenListResponse tokenList()

Token List

Retrieves a list of all available ALPHA tokens, including their IDs and symbols. Use this to find the token ID for constructing symbols in other endpoints.  Weight: 0

### Example
```java
// Import classes:
import com.binance.connector.client.alpha.ApiClient;
import com.binance.connector.client.alpha.ApiException;
import com.binance.connector.client.alpha.Configuration;
import com.binance.connector.client.alpha.models.*;
import com.binance.connector.client.alpha.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    try {
      TokenListResponse result = apiInstance.tokenList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#tokenList");
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

[**TokenListResponse**](TokenListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Token List |  -  |

