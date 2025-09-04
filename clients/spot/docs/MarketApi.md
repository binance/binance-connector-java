# MarketApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**avgPrice**](MarketApi.md#avgPrice) | **POST** /avgPrice | WebSocket Current average price |
| [**depth**](MarketApi.md#depth) | **POST** /depth | WebSocket Order book |
| [**klines**](MarketApi.md#klines) | **POST** /klines | WebSocket Klines |
| [**ticker**](MarketApi.md#ticker) | **POST** /ticker | WebSocket Rolling window price change statistics |
| [**ticker24hr**](MarketApi.md#ticker24hr) | **POST** /ticker.24hr | WebSocket 24hr ticker price change statistics |
| [**tickerBook**](MarketApi.md#tickerBook) | **POST** /ticker.book | WebSocket Symbol order book ticker |
| [**tickerPrice**](MarketApi.md#tickerPrice) | **POST** /ticker.price | WebSocket Symbol price ticker |
| [**tickerTradingDay**](MarketApi.md#tickerTradingDay) | **POST** /ticker.tradingDay | WebSocket Trading Day Ticker |
| [**tradesAggregate**](MarketApi.md#tradesAggregate) | **POST** /trades.aggregate | WebSocket Aggregate trades |
| [**tradesHistorical**](MarketApi.md#tradesHistorical) | **POST** /trades.historical | WebSocket Historical trades |
| [**tradesRecent**](MarketApi.md#tradesRecent) | **POST** /trades.recent | WebSocket Recent trades |
| [**uiKlines**](MarketApi.md#uiKlines) | **POST** /uiKlines | WebSocket UI Klines |


<a id="avgPrice"></a>
# **avgPrice**
> AvgPriceResponse avgPrice(avgPriceRequest)

WebSocket Current average price

Get current average price for a symbol. Weight: 2

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.MarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketApi apiInstance = new MarketApi(defaultClient);
    AvgPriceRequest avgPriceRequest = new AvgPriceRequest(); // AvgPriceRequest | 
    try {
      AvgPriceResponse result = apiInstance.avgPrice(avgPriceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#avgPrice");
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
| **avgPriceRequest** | [**AvgPriceRequest**](AvgPriceRequest.md)|  | |

### Return type

[**AvgPriceResponse**](AvgPriceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current average price |  -  |

<a id="depth"></a>
# **depth**
> DepthResponse depth(depthRequest)

WebSocket Order book

Get current order book.  Note that this request returns limited market depth.  If you need to continuously monitor order book updates, please consider using WebSocket Streams:  * &#x60;&lt;symbol&gt;@depth&lt;levels&gt;&#x60; * &#x60;&lt;symbol&gt;@depth&#x60;  You can use &#x60;depth&#x60; request together with &#x60;&lt;symbol&gt;@depth&#x60; streams to [maintain a local order book](web-socket-streams.md#how-to-manage-a-local-order-book-correctly). Weight: Adjusted based on the limit:  |  Limit    | Weight | |:---------:|:------:| |     1–100 |      5 | |   101–500 |      25| |  501–1000 |     50 | | 1001–5000 |     250 |

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.MarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketApi apiInstance = new MarketApi(defaultClient);
    DepthRequest depthRequest = new DepthRequest(); // DepthRequest | 
    try {
      DepthResponse result = apiInstance.depth(depthRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#depth");
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
| **depthRequest** | [**DepthRequest**](DepthRequest.md)|  | |

### Return type

[**DepthResponse**](DepthResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order book |  -  |

<a id="klines"></a>
# **klines**
> KlinesResponse klines(klinesRequest)

WebSocket Klines

Get klines (candlestick bars).  Klines are uniquely identified by their open &amp; close time.  If you need access to real-time kline updates, please consider using WebSocket Streams:  * &#x60;&lt;symbol&gt;@kline_&lt;interval&gt;&#x60;  If you need historical kline data, please consider using [data.binance.vision](https://github.com/binance/binance-public-data/#klines). Weight: 2

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.MarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketApi apiInstance = new MarketApi(defaultClient);
    KlinesRequest klinesRequest = new KlinesRequest(); // KlinesRequest | 
    try {
      KlinesResponse result = apiInstance.klines(klinesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#klines");
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
| **klinesRequest** | [**KlinesRequest**](KlinesRequest.md)|  | |

### Return type

[**KlinesResponse**](KlinesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Klines |  -  |

<a id="ticker"></a>
# **ticker**
> TickerResponse ticker(tickerRequest)

WebSocket Rolling window price change statistics

Get rolling window price change statistics with a custom window.  This request is similar to &#x60;ticker.24hr&#x60;, but statistics are computed on demand using the arbitrary window you specify. Weight: Adjusted based on the number of requested symbols:  | Symbols | Weight | |:-------:|:------:| |    1–50 | 4 per symbol | |  51–100 |    200 |

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.MarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketApi apiInstance = new MarketApi(defaultClient);
    TickerRequest tickerRequest = new TickerRequest(); // TickerRequest | 
    try {
      TickerResponse result = apiInstance.ticker(tickerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#ticker");
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
| **tickerRequest** | [**TickerRequest**](TickerRequest.md)|  | [optional] |

### Return type

[**TickerResponse**](TickerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Rolling window price change statistics |  -  |

<a id="ticker24hr"></a>
# **ticker24hr**
> Ticker24hrResponse ticker24hr(ticker24hrRequest)

WebSocket 24hr ticker price change statistics

Get 24-hour rolling window price change statistics.  If you need to continuously monitor trading statistics, please consider using WebSocket Streams:  * &#x60;&lt;symbol&gt;@ticker&#x60; or &#x60;!ticker@arr&#x60; * &#x60;&lt;symbol&gt;@miniTicker&#x60; or &#x60;!miniTicker@arr&#x60;  If you need different window sizes, use the &#x60;ticker&#x60; request. Weight: Adjusted based on the number of requested symbols:  | Symbols     | Weight | |:-----------:|:------:| |        1–20 |      2 | |      21–100 |     40 | | 101 or more |     80 | | all symbols |     80 |

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.MarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketApi apiInstance = new MarketApi(defaultClient);
    Ticker24hrRequest ticker24hrRequest = new Ticker24hrRequest(); // Ticker24hrRequest | 
    try {
      Ticker24hrResponse result = apiInstance.ticker24hr(ticker24hrRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#ticker24hr");
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
| **ticker24hrRequest** | [**Ticker24hrRequest**](Ticker24hrRequest.md)|  | [optional] |

### Return type

[**Ticker24hrResponse**](Ticker24hrResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 24hr ticker price change statistics |  -  |

<a id="tickerBook"></a>
# **tickerBook**
> TickerBookResponse tickerBook(tickerBookRequest)

WebSocket Symbol order book ticker

Get the current best price and quantity on the order book.  If you need access to real-time order book ticker updates, please consider using WebSocket Streams:  * &#x60;&lt;symbol&gt;@bookTicker&#x60; Weight: Adjusted based on the number of requested symbols:  | Parameter | Weight | | --------- |:------:| | &#x60;symbol&#x60;  |      2 | | &#x60;symbols&#x60; |      4 | | none      |      4 |

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.MarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketApi apiInstance = new MarketApi(defaultClient);
    TickerBookRequest tickerBookRequest = new TickerBookRequest(); // TickerBookRequest | 
    try {
      TickerBookResponse result = apiInstance.tickerBook(tickerBookRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#tickerBook");
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
| **tickerBookRequest** | [**TickerBookRequest**](TickerBookRequest.md)|  | [optional] |

### Return type

[**TickerBookResponse**](TickerBookResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Symbol order book ticker |  -  |

<a id="tickerPrice"></a>
# **tickerPrice**
> TickerPriceResponse tickerPrice(tickerPriceRequest)

WebSocket Symbol price ticker

Get the latest market price for a symbol.  If you need access to real-time price updates, please consider using WebSocket Streams:  * &#x60;&lt;symbol&gt;@aggTrade&#x60; * &#x60;&lt;symbol&gt;@trade&#x60; Weight: Adjusted based on the number of requested symbols:  | Parameter | Weight | | --------- |:------:| | &#x60;symbol&#x60;  |      2 | | &#x60;symbols&#x60; |      4 | | none      |      4 |

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.MarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketApi apiInstance = new MarketApi(defaultClient);
    TickerPriceRequest tickerPriceRequest = new TickerPriceRequest(); // TickerPriceRequest | 
    try {
      TickerPriceResponse result = apiInstance.tickerPrice(tickerPriceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#tickerPrice");
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
| **tickerPriceRequest** | [**TickerPriceRequest**](TickerPriceRequest.md)|  | [optional] |

### Return type

[**TickerPriceResponse**](TickerPriceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Symbol price ticker |  -  |

<a id="tickerTradingDay"></a>
# **tickerTradingDay**
> TickerTradingDayResponse tickerTradingDay(tickerTradingDayRequest)

WebSocket Trading Day Ticker

Price change statistics for a trading day. Weight: 4 for each requested &lt;tt&gt;symbol&lt;/tt&gt;. &lt;br/&gt;&lt;br/&gt; The weight for this request will cap at 200 once the number of &#x60;symbols&#x60; in the request is more than 50.

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.MarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketApi apiInstance = new MarketApi(defaultClient);
    TickerTradingDayRequest tickerTradingDayRequest = new TickerTradingDayRequest(); // TickerTradingDayRequest | 
    try {
      TickerTradingDayResponse result = apiInstance.tickerTradingDay(tickerTradingDayRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#tickerTradingDay");
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
| **tickerTradingDayRequest** | [**TickerTradingDayRequest**](TickerTradingDayRequest.md)|  | [optional] |

### Return type

[**TickerTradingDayResponse**](TickerTradingDayResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Trading Day Ticker |  -  |

<a id="tradesAggregate"></a>
# **tradesAggregate**
> TradesAggregateResponse tradesAggregate(tradesAggregateRequest)

WebSocket Aggregate trades

Get aggregate trades.  An *aggregate trade* (aggtrade) represents one or more individual trades. Trades that fill at the same time, from the same taker order, with the same price – those trades are collected into an aggregate trade with total quantity of the individual trades.  If you need access to real-time trading activity, please consider using WebSocket Streams:  * &#x60;&lt;symbol&gt;@aggTrade&#x60;  If you need historical aggregate trade data, please consider using [data.binance.vision](https://github.com/binance/binance-public-data/#aggtrades). Weight: 4

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.MarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketApi apiInstance = new MarketApi(defaultClient);
    TradesAggregateRequest tradesAggregateRequest = new TradesAggregateRequest(); // TradesAggregateRequest | 
    try {
      TradesAggregateResponse result = apiInstance.tradesAggregate(tradesAggregateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#tradesAggregate");
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
| **tradesAggregateRequest** | [**TradesAggregateRequest**](TradesAggregateRequest.md)|  | |

### Return type

[**TradesAggregateResponse**](TradesAggregateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Aggregate trades |  -  |

<a id="tradesHistorical"></a>
# **tradesHistorical**
> TradesHistoricalResponse tradesHistorical(tradesHistoricalRequest)

WebSocket Historical trades

Get historical trades. Weight: 25

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.MarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketApi apiInstance = new MarketApi(defaultClient);
    TradesHistoricalRequest tradesHistoricalRequest = new TradesHistoricalRequest(); // TradesHistoricalRequest | 
    try {
      TradesHistoricalResponse result = apiInstance.tradesHistorical(tradesHistoricalRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#tradesHistorical");
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
| **tradesHistoricalRequest** | [**TradesHistoricalRequest**](TradesHistoricalRequest.md)|  | |

### Return type

[**TradesHistoricalResponse**](TradesHistoricalResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Historical trades |  -  |

<a id="tradesRecent"></a>
# **tradesRecent**
> TradesRecentResponse tradesRecent(tradesRecentRequest)

WebSocket Recent trades

Get recent trades.  If you need access to real-time trading activity, please consider using WebSocket Streams:  * &#x60;&lt;symbol&gt;@trade&#x60; Weight: 25

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.MarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketApi apiInstance = new MarketApi(defaultClient);
    TradesRecentRequest tradesRecentRequest = new TradesRecentRequest(); // TradesRecentRequest | 
    try {
      TradesRecentResponse result = apiInstance.tradesRecent(tradesRecentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#tradesRecent");
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
| **tradesRecentRequest** | [**TradesRecentRequest**](TradesRecentRequest.md)|  | |

### Return type

[**TradesRecentResponse**](TradesRecentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Recent trades |  -  |

<a id="uiKlines"></a>
# **uiKlines**
> UiKlinesResponse uiKlines(uiKlinesRequest)

WebSocket UI Klines

Get klines (candlestick bars) optimized for presentation.  This request is similar to &#x60;klines&#x60;, having the same parameters and response. &#x60;uiKlines&#x60; return modified kline data, optimized for presentation of candlestick charts. Weight: 2

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.MarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketApi apiInstance = new MarketApi(defaultClient);
    UiKlinesRequest uiKlinesRequest = new UiKlinesRequest(); // UiKlinesRequest | 
    try {
      UiKlinesResponse result = apiInstance.uiKlines(uiKlinesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#uiKlines");
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
| **uiKlinesRequest** | [**UiKlinesRequest**](UiKlinesRequest.md)|  | |

### Return type

[**UiKlinesResponse**](UiKlinesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | UI Klines |  -  |

