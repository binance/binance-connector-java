# MarketDataApi

All URIs are relative to *https://www.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aggregatedTrades**](MarketDataApi.md#aggregatedTrades) | **GET** /bapi/defi/v1/public/alpha-trade/agg-trades | Aggregated Trades |
| [**fullDepth**](MarketDataApi.md#fullDepth) | **GET** /bapi/defi/v1/public/alpha-trade/fullDepth | Full Depth |
| [**getExchangeInfo**](MarketDataApi.md#getExchangeInfo) | **GET** /bapi/defi/v1/public/alpha-trade/get-exchange-info | Get Exchange Info |
| [**klines**](MarketDataApi.md#klines) | **GET** /bapi/defi/v1/public/alpha-trade/klines | Klines |
| [**ticker**](MarketDataApi.md#ticker) | **GET** /bapi/defi/v1/public/alpha-trade/ticker | Ticker |
| [**tokenList**](MarketDataApi.md#tokenList) | **GET** /bapi/defi/v1/public/wallet-direct/buw/wallet/cex/alpha/all/token/list | Token List |


<a id="aggregatedTrades"></a>
# **aggregatedTrades**
> AggregatedTradesResponse aggregatedTrades(symbol, fromId, startTime, endTime, limit)

Aggregated Trades

Retrieves compressed, aggregated historical trades for a specific symbol. Useful for recent trade history.

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
    String symbol = "ALPHA_118USDC"; // String | Trading pair symbol, e.g. ALPHA_118USDC (use token ID from Token List).
    Long fromId = 58470L; // Long | Starting aggregate trade ID to fetch from.
    Long startTime = 1752568680000L; // Long | Start timestamp in milliseconds.
    Long endTime = 1752572280000L; // Long | End timestamp in milliseconds.
    Long limit = 500L; // Long | Number of results to return.
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
| **symbol** | **String**| Trading pair symbol, e.g. ALPHA_118USDC (use token ID from Token List). | |
| **fromId** | **Long**| Starting aggregate trade ID to fetch from. | [optional] |
| **startTime** | **Long**| Start timestamp in milliseconds. | [optional] |
| **endTime** | **Long**| End timestamp in milliseconds. | [optional] |
| **limit** | **Long**| Number of results to return. | [optional] |

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

<a id="fullDepth"></a>
# **fullDepth**
> FullDepthResponse fullDepth(symbol, limit)

Full Depth

Fetches the full order book depth (UI &amp; API orders) for a symbol, including bid and ask orders with their prices and quantities.

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
    String symbol = "ALPHA_175USDT"; // String | Trading pair symbol, e.g. ALPHA_175USDT (use token ID from Token List).
    Limit limit = Limit.fromValue("5"); // Limit | Number of price levels to return. Valid values: 5, 10, 20, 50, 100, 500, 1000.
    try {
      FullDepthResponse result = apiInstance.fullDepth(symbol, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#fullDepth");
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
| **symbol** | **String**| Trading pair symbol, e.g. ALPHA_175USDT (use token ID from Token List). | |
| **limit** | [**Limit**](.md)| Number of price levels to return. Valid values: 5, 10, 20, 50, 100, 500, 1000. | [optional] [default to 500] [enum: 5, 10, 20, 50, 100, 500, 1000] |

### Return type

[**FullDepthResponse**](FullDepthResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Full Depth |  -  |

<a id="getExchangeInfo"></a>
# **getExchangeInfo**
> GetExchangeInfoResponse getExchangeInfo()

Get Exchange Info

Fetches general exchange information, such as supported symbols, rate limits, and server time.

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

Klines

Fetches Kline/candlestick bars for a symbol, which include open/high/low/close prices and volume over intervals. Useful for charting and analysis.

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
    String symbol = "ALPHA_175USDT"; // String | Trading pair symbol, e.g. ALPHA_175USDT (use token ID from Token List).
    Interval interval = Interval.fromValue("1s"); // Interval | Kline interval.
    Long limit = 500L; // Long | Number of klines to return.
    Long startTime = 1752642000000L; // Long | Start timestamp in milliseconds.
    Long endTime = 1752645599999L; // Long | End timestamp in milliseconds.
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
| **symbol** | **String**| Trading pair symbol, e.g. ALPHA_175USDT (use token ID from Token List). | |
| **interval** | [**Interval**](.md)| Kline interval. | [enum: 1s, 15s, 1m, 3m, 5m, 15m, 30m, 1h, 2h, 4h, 6h, 8h, 12h, 1d, 3d, 1w, 1M] |
| **limit** | **Long**| Number of klines to return. | [optional] |
| **startTime** | **Long**| Start timestamp in milliseconds. | [optional] |
| **endTime** | **Long**| End timestamp in milliseconds. | [optional] |

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

Ticker

Gets the 24-hour rolling window price change statistics for a symbol, including volume and price changes.

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
    String symbol = "ALPHA_175USDT"; // String | Trading pair symbol, e.g. ALPHA_175USDT (use token ID from Token List).
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
| **symbol** | **String**| Trading pair symbol, e.g. ALPHA_175USDT (use token ID from Token List). | |

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

Retrieves a list of all available ALPHA tokens, including their IDs and symbols. Use this to find the token ID for constructing symbols in other endpoints.

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

