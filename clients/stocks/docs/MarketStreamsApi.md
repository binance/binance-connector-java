# MarketStreamsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**calendarStream**](MarketStreamsApi.md#calendarStream) | **POST** /calendar | Calendar Stream |
| [**klineStream**](MarketStreamsApi.md#klineStream) | **POST** /&lt;symbol&gt;@kline_&lt;interval&gt; | Kline Stream |
| [**priceStream**](MarketStreamsApi.md#priceStream) | **POST** /price | Price Stream |
| [**quoteStream**](MarketStreamsApi.md#quoteStream) | **POST** /&lt;symbol&gt;@quote | Quote Stream |
| [**tradabilityStream**](MarketStreamsApi.md#tradabilityStream) | **POST** /&lt;symbol&gt;@tradability | Tradability Stream |
| [**tradingStatusStream**](MarketStreamsApi.md#tradingStatusStream) | **POST** /&lt;symbol&gt;@tradingStatus | Trading Status Stream |


<a id="calendarStream"></a>
# **calendarStream**
> CalendarStreamResponse calendarStream()

Calendar Stream

Single-stream broadcast of market-phase transitions. One message per transition; no periodic heartbeat payload. Server polls every 5 seconds.

### Example
```java
// Import classes:
import com.binance.connector.client.stocks.ApiClient;
import com.binance.connector.client.stocks.ApiException;
import com.binance.connector.client.stocks.Configuration;
import com.binance.connector.client.stocks.models.*;
import com.binance.connector.client.stocks.websocket.stream.api.MarketStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketStreamsApi apiInstance = new MarketStreamsApi(defaultClient);
    try {
      CalendarStreamResponse result = apiInstance.calendarStream();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketStreamsApi#calendarStream");
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

[**CalendarStreamResponse**](CalendarStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Calendar Stream |  -  |

<a id="klineStream"></a>
# **klineStream**
> KlineStreamResponse klineStream(klineStreamRequest)

Kline Stream

Per-symbol candlestick updates. One stream per (symbol, interval) combination. Supported intervals: 5m, 1h, 1d, 1w, 1M.

### Example
```java
// Import classes:
import com.binance.connector.client.stocks.ApiClient;
import com.binance.connector.client.stocks.ApiException;
import com.binance.connector.client.stocks.Configuration;
import com.binance.connector.client.stocks.models.*;
import com.binance.connector.client.stocks.websocket.stream.api.MarketStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketStreamsApi apiInstance = new MarketStreamsApi(defaultClient);
    KlineStreamRequest klineStreamRequest = new KlineStreamRequest(); // KlineStreamRequest | 
    try {
      KlineStreamResponse result = apiInstance.klineStream(klineStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketStreamsApi#klineStream");
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
| **klineStreamRequest** | [**KlineStreamRequest**](KlineStreamRequest.md)|  | |

### Return type

[**KlineStreamResponse**](KlineStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Kline Stream |  -  |

<a id="priceStream"></a>
# **priceStream**
> PriceStreamResponse priceStream()

Price Stream

Push-all price snapshot, polled every 3 seconds. One message carries the latest price for every active US-equity symbol.

### Example
```java
// Import classes:
import com.binance.connector.client.stocks.ApiClient;
import com.binance.connector.client.stocks.ApiException;
import com.binance.connector.client.stocks.Configuration;
import com.binance.connector.client.stocks.models.*;
import com.binance.connector.client.stocks.websocket.stream.api.MarketStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketStreamsApi apiInstance = new MarketStreamsApi(defaultClient);
    try {
      PriceStreamResponse result = apiInstance.priceStream();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketStreamsApi#priceStream");
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

[**PriceStreamResponse**](PriceStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Price Stream |  -  |

<a id="quoteStream"></a>
# **quoteStream**
> QuoteStreamResponse quoteStream(quoteStreamRequest)

Quote Stream

Per-symbol real-time best-bid / best-ask. Each symbol has its own stream. Per-symbol throttle: at most one push per symbol every 200 ms.

### Example
```java
// Import classes:
import com.binance.connector.client.stocks.ApiClient;
import com.binance.connector.client.stocks.ApiException;
import com.binance.connector.client.stocks.Configuration;
import com.binance.connector.client.stocks.models.*;
import com.binance.connector.client.stocks.websocket.stream.api.MarketStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketStreamsApi apiInstance = new MarketStreamsApi(defaultClient);
    QuoteStreamRequest quoteStreamRequest = new QuoteStreamRequest(); // QuoteStreamRequest | 
    try {
      QuoteStreamResponse result = apiInstance.quoteStream(quoteStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketStreamsApi#quoteStream");
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
| **quoteStreamRequest** | [**QuoteStreamRequest**](QuoteStreamRequest.md)|  | |

### Return type

[**QuoteStreamResponse**](QuoteStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Quote Stream |  -  |

<a id="tradabilityStream"></a>
# **tradabilityStream**
> TradabilityStreamResponse tradabilityStream(tradabilityStreamRequest)

Tradability Stream

Per-symbol push whenever the tradable direction of a symbol changes. Pushed only when the value actually changes (new value ≠ old value).

### Example
```java
// Import classes:
import com.binance.connector.client.stocks.ApiClient;
import com.binance.connector.client.stocks.ApiException;
import com.binance.connector.client.stocks.Configuration;
import com.binance.connector.client.stocks.models.*;
import com.binance.connector.client.stocks.websocket.stream.api.MarketStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketStreamsApi apiInstance = new MarketStreamsApi(defaultClient);
    TradabilityStreamRequest tradabilityStreamRequest = new TradabilityStreamRequest(); // TradabilityStreamRequest | 
    try {
      TradabilityStreamResponse result = apiInstance.tradabilityStream(tradabilityStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketStreamsApi#tradabilityStream");
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
| **tradabilityStreamRequest** | [**TradabilityStreamRequest**](TradabilityStreamRequest.md)|  | |

### Return type

[**TradabilityStreamResponse**](TradabilityStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tradability Stream |  -  |

<a id="tradingStatusStream"></a>
# **tradingStatusStream**
> TradingStatusStreamResponse tradingStatusStream(tradingStatusStreamRequest)

Trading Status Stream

Per-symbol trading-status transitions (halts, resumes, SSR, LULD pauses, etc.). Events that do not match a known status/reason rule are not pushed.

### Example
```java
// Import classes:
import com.binance.connector.client.stocks.ApiClient;
import com.binance.connector.client.stocks.ApiException;
import com.binance.connector.client.stocks.Configuration;
import com.binance.connector.client.stocks.models.*;
import com.binance.connector.client.stocks.websocket.stream.api.MarketStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketStreamsApi apiInstance = new MarketStreamsApi(defaultClient);
    TradingStatusStreamRequest tradingStatusStreamRequest = new TradingStatusStreamRequest(); // TradingStatusStreamRequest | 
    try {
      TradingStatusStreamResponse result = apiInstance.tradingStatusStream(tradingStatusStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketStreamsApi#tradingStatusStream");
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
| **tradingStatusStreamRequest** | [**TradingStatusStreamRequest**](TradingStatusStreamRequest.md)|  | |

### Return type

[**TradingStatusStreamResponse**](TradingStatusStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Trading Status Stream |  -  |

