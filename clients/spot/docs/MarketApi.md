# MarketApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**avgPrice**](MarketApi.md#avgPrice) | **POST** /avgPrice | Current average price |
| [**blockTradesHistorical**](MarketApi.md#blockTradesHistorical) | **POST** /blockTrades.historical | Historical Block Trades |
| [**depth**](MarketApi.md#depth) | **POST** /depth | Order book |
| [**klines**](MarketApi.md#klines) | **POST** /klines | Klines |
| [**referencePrice**](MarketApi.md#referencePrice) | **POST** /referencePrice | Query Reference Price |
| [**referencePriceCalculation**](MarketApi.md#referencePriceCalculation) | **POST** /referencePrice.calculation | Query Reference Price Calculation |
| [**ticker**](MarketApi.md#ticker) | **POST** /ticker | Rolling window price change statistics |
| [**ticker24hr**](MarketApi.md#ticker24hr) | **POST** /ticker.24hr | 24hr ticker price change statistics |
| [**tickerBook**](MarketApi.md#tickerBook) | **POST** /ticker.book | Symbol order book ticker |
| [**tickerPrice**](MarketApi.md#tickerPrice) | **POST** /ticker.price | Symbol price ticker |
| [**tickerTradingDay**](MarketApi.md#tickerTradingDay) | **POST** /ticker.tradingDay | Trading Day Ticker |
| [**tradesAggregate**](MarketApi.md#tradesAggregate) | **POST** /trades.aggregate | Aggregate trades |
| [**tradesHistorical**](MarketApi.md#tradesHistorical) | **POST** /trades.historical | Historical trades |
| [**tradesRecent**](MarketApi.md#tradesRecent) | **POST** /trades.recent | Recent trades |
| [**uiKlines**](MarketApi.md#uiKlines) | **POST** /uiKlines | UI Klines |


<a id="avgPrice"></a>
# **avgPrice**
> AvgPriceResponse avgPrice(avgPriceRequest)

Current average price

Get current average price for a symbol.  Weight(IP): 2  Security Type: NONE  Notes: **Data Source:** Memory

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

<a id="blockTradesHistorical"></a>
# **blockTradesHistorical**
> BlockTradesHistoricalResponse blockTradesHistorical(blockTradesHistoricalRequest)

Historical Block Trades

Get block trades.  Weight(IP): 25  Security Type: NONE  Notes: - Data Source: Database

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
    BlockTradesHistoricalRequest blockTradesHistoricalRequest = new BlockTradesHistoricalRequest(); // BlockTradesHistoricalRequest | 
    try {
      BlockTradesHistoricalResponse result = apiInstance.blockTradesHistorical(blockTradesHistoricalRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#blockTradesHistorical");
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
| **blockTradesHistoricalRequest** | [**BlockTradesHistoricalRequest**](BlockTradesHistoricalRequest.md)|  | |

### Return type

[**BlockTradesHistoricalResponse**](BlockTradesHistoricalResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Historical Block Trades |  -  |

<a id="depth"></a>
# **depth**
> DepthResponse depth(depthRequest)

Order book

Get current order book.  Note that this request returns limited market depth.  If you need to continuously monitor order book updates, please consider using WebSocket Streams:   * &#x60;&lt;symbol&gt;@depth&lt;levels&gt;&#x60;   * &#x60;&lt;symbol&gt;@depth&#x60;  You can use &#x60;depth&#x60; request together with &#x60;&lt;symbol&gt;@depth&#x60; streams to [maintain a local order book](/products/spot/web-socket-streams#how-to-manage-a-local-order-book-correctly).  Weight: Adjusted based on the limit:  |Limit|Request Weight ------|------- 1-100|  5 101-500| 25 501-1000| 50 1001-5000| 250  Security Type: NONE  Notes: **Data Source:** Memory

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

Klines

Get klines (candlestick bars).  Klines are uniquely identified by their open &amp; close time.  If you need access to real-time kline updates, please consider using WebSocket Streams:   * &#x60;&lt;symbol&gt;@kline_&lt;interval&gt;&#x60;  If you need historical kline data, please consider using [data.binance.vision](https://github.com/binance/binance-public-data/#klines).  Weight(IP): 2  Security Type: NONE  Notes: **Data Source:** Database  Supported kline intervals (case-sensitive):  Interval  | &#x60;interval&#x60; value --------- | ---------------- seconds   | &#x60;1s&#x60; minutes   | &#x60;1m&#x60;, &#x60;3m&#x60;, &#x60;5m&#x60;, &#x60;15m&#x60;, &#x60;30m&#x60; hours     | &#x60;1h&#x60;, &#x60;2h&#x60;, &#x60;4h&#x60;, &#x60;6h&#x60;, &#x60;8h&#x60;, &#x60;12h&#x60; days      | &#x60;1d&#x60;, &#x60;3d&#x60; weeks     | &#x60;1w&#x60; months    | &#x60;1M&#x60;  **Notes:**  * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, the most recent klines are returned. * Supported values for &#x60;timeZone&#x60;:   * Hours and minutes (e.g. &#x60;-1:00&#x60;, &#x60;05:45&#x60;)   * Only hours (e.g. &#x60;0&#x60;, &#x60;8&#x60;, &#x60;4&#x60;)   * Accepted range is strictly [-12:00 to +14:00] inclusive * If &#x60;timeZone&#x60; provided, kline intervals are interpreted in that timezone instead of UTC. * Note that &#x60;startTime&#x60; and &#x60;endTime&#x60; are always interpreted in UTC, regardless of &#x60;timeZone&#x60;.

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

<a id="referencePrice"></a>
# **referencePrice**
> ReferencePriceResponse referencePrice(referencePriceRequest)

Query Reference Price

Query Reference Price  Weight(IP): 2  Security Type: NONE  Notes: **Data Source:** Memory

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
    ReferencePriceRequest referencePriceRequest = new ReferencePriceRequest(); // ReferencePriceRequest | 
    try {
      ReferencePriceResponse result = apiInstance.referencePrice(referencePriceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#referencePrice");
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
| **referencePriceRequest** | [**ReferencePriceRequest**](ReferencePriceRequest.md)|  | |

### Return type

[**ReferencePriceResponse**](ReferencePriceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Query Reference Price |  -  |

<a id="referencePriceCalculation"></a>
# **referencePriceCalculation**
> ReferencePriceCalculationResponse referencePriceCalculation(referencePriceCalculationRequest)

Query Reference Price Calculation

Query Reference Price Calculation  Weight(IP): 2  Security Type: NONE  Notes: **Data Source:** Memory

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
    ReferencePriceCalculationRequest referencePriceCalculationRequest = new ReferencePriceCalculationRequest(); // ReferencePriceCalculationRequest | 
    try {
      ReferencePriceCalculationResponse result = apiInstance.referencePriceCalculation(referencePriceCalculationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#referencePriceCalculation");
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
| **referencePriceCalculationRequest** | [**ReferencePriceCalculationRequest**](ReferencePriceCalculationRequest.md)|  | |

### Return type

[**ReferencePriceCalculationResponse**](ReferencePriceCalculationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Query Reference Price Calculation |  -  |

<a id="ticker"></a>
# **ticker**
> TickerResponse ticker(tickerRequest)

Rolling window price change statistics

Get rolling window price change statistics with a custom window.  This request is similar to &#x60;ticker.24hr&#x60; but statistics are computed on demand using the arbitrary window you specify.  **Note:** Window size precision is limited to 1 minute. While the &#x60;closeTime&#x60; is the current time of the request, &#x60;openTime&#x60; always start on a minute boundary. As such, the effective window might be up to 59999 ms wider than the requested &#x60;windowSize&#x60;.  &lt;details&gt; &lt;summary&gt;Window computation example&lt;/summary&gt;  For example, a request for &#x60;\&quot;windowSize\&quot;: \&quot;7d\&quot;&#x60; might result in the following window:  &#x60;&#x60;&#x60;javascript {     \&quot;openTime\&quot;: 1659580020000,     \&quot;closeTime\&quot;: 1660184865291 } &#x60;&#x60;&#x60;  Time of the request – &#x60;closeTime&#x60; – is 1660184865291 (August 11, 2022 02:27:45.291). Requested window size should put the &#x60;openTime&#x60; 7 days before that – August 4, 02:27:45.291 – but due to limited precision it ends up a bit earlier: 1659580020000 (August 4, 2022 02:27:00), exactly at the start of a minute. &lt;/details&gt;  If you need to continuously monitor trading statistics, please consider using WebSocket Streams:   * &#x60;&lt;symbol&gt;@ticker_&lt;window_size&gt;&#x60; or &#x60;!ticker_&lt;window-size&gt;@arr&#x60;  Weight: Adjusted based on the number of requested symbols:  | Symbols | Weight | |:-------:|:------:| |    1–50 | 4 per symbol | |  51–100 |    200 |  Security Type: NONE  Notes: **Data Source:** Database  Supported window sizes:  Unit    | &#x60;windowSize&#x60; value ------- | ------------------ minutes | &#x60;1m&#x60;, &#x60;2m&#x60; ... &#x60;59m&#x60; hours   | &#x60;1h&#x60;, &#x60;2h&#x60; ... &#x60;23h&#x60; days    | &#x60;1d&#x60;, &#x60;2d&#x60; ... &#x60;7d&#x60;  Notes:  * Either &#x60;symbol&#x60; or &#x60;symbols&#x60; must be specified.  * Maximum number of symbols in one request: 200.  * Window size units cannot be combined.   E.g., &lt;code&gt;1d 2h&lt;/code&gt; is not supported.

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

24hr ticker price change statistics

Get 24-hour rolling window price change statistics.  If you need to continuously monitor trading statistics, please consider using WebSocket Streams:  * &#x60;&lt;symbol&gt;@ticker&#x60; or &#x60;!ticker@arr&#x60;  * &#x60;&lt;symbol&gt;@miniTicker&#x60; or &#x60;!miniTicker@arr&#x60;  If you need different window sizes,  use the &#x60;ticker&#x60; request.  Weight: Adjusted based on the number of requested symbols:  |Parameter|Symbols Provided|Weight| |---|---|---| |symbol| 1 |2| | |omitted| 80| |symbols| 1-20 |2| | | 21-100 |40| | | 101+ |80| | |omitted| 80|  Security Type: NONE  Notes: **Data Source:** Memory  Notes:  * &#x60;symbol&#x60; and &#x60;symbols&#x60; cannot be used together.  * If no symbol is specified, returns information about all symbols currently trading on the exchange.

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

Symbol order book ticker

Get the current best price and quantity on the order book.  If you need access to real-time order book ticker updates, please consider using WebSocket Streams:  * &#x60;&lt;symbol&gt;@bookTicker&#x60;  Weight: Adjusted based on the number of requested symbols:  |Parameter|Symbols Provided|Weight| |---|---|---| |symbol| 1 |2| | |omitted| 4| |symbols| Any |4|  Security Type: NONE  Notes: **Data Source:** Memory  Notes:  * &#x60;symbol&#x60; and &#x60;symbols&#x60; cannot be used together.  * If no symbol is specified, returns information about all symbols currently trading on the exchange.

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

Symbol price ticker

Get the latest market price for a symbol.  If you need access to real-time price updates, please consider using WebSocket Streams:  * &#x60;&lt;symbol&gt;@aggTrade&#x60;  * &#x60;&lt;symbol&gt;@trade&#x60;  Weight: Adjusted based on the number of requested symbols:  |Parameter|Symbols Provided|Weight| |---|---|---| |symbol| 1 |2| | |omitted| 4| |symbols| Any |4|  Security Type: NONE  Notes: **Data Source:** Memory  Notes:  * &#x60;symbol&#x60; and &#x60;symbols&#x60; cannot be used together.  * If no symbol is specified, returns information about all symbols currently trading on the exchange.

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

Trading Day Ticker

Price change statistics for a trading day.  Weight: 4 for each requested symbol regardless of windowSize. The weight for this request will cap at 200 once the number of symbols in the request is more than 50.  Security Type: NONE  Notes: **Data Source:** Database  **Notes:**  * Supported values for &#x60;timeZone&#x60;:   * Hours and minutes (e.g. &#x60;-1:00&#x60;, &#x60;05:45&#x60;)   * Only hours (e.g. &#x60;0&#x60;, &#x60;8&#x60;, &#x60;4&#x60;) 

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

Aggregate trades

Get aggregate trades.  An *aggregate trade* (aggtrade) represents one or more individual trades.  Trades that fill at the same time, from the same taker order, with the same price –  those trades are collected into an aggregate trade with total quantity of the individual trades.  If you need access to real-time trading activity, please consider using WebSocket Streams:  * &#x60;&lt;symbol&gt;@aggTrade&#x60;  If you need historical aggregate trade data, please consider using [data.binance.vision](https://github.com/binance/binance-public-data/#aggtrades).  Weight(IP): 4  Security Type: NONE  Notes: **Data Source:** Database  - If &#x60;fromId&#x60; is specified, return aggtrades with aggregate trade ID &gt;&#x3D; &#x60;fromId&#x60;. Use &#x60;fromId&#x60; and &#x60;limit&#x60; to page through all aggtrades. - If &#x60;startTime&#x60; and/or &#x60;endTime&#x60; are specified, aggtrades are filtered by execution time (&#x60;T&#x60;). &#x60;fromId&#x60; cannot be used together with &#x60;startTime&#x60; and &#x60;endTime&#x60;. - If no condition is specified, the most recent aggregate trades are returned.

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

Historical trades

Get historical trades.  Weight(IP): 25  Security Type: NONE  Notes: **Data Source:** Database  Notes:  * If &#x60;fromId&#x60; is not specified, the most recent trades are returned.

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

Recent trades

Get recent trades.  If you need access to real-time trading activity, please consider using WebSocket Streams:  * &#x60;&lt;symbol&gt;@trade&#x60;  Weight(IP): 25  Security Type: NONE  Notes: **Data Source:** Memory

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

UI Klines

Get klines (candlestick bars) optimized for presentation.  This request is similar to &#x60;klines&#x60;, having the same parameters and response. &#x60;uiKlines&#x60; return modified kline data, optimized for presentation of candlestick charts.  Weight(IP): 2  Security Type: NONE  Notes: **Data Source:** Database  - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, the most recent klines are returned. - Supported values for &#x60;timeZone&#x60;:   - Hours and minutes (e.g. &#x60;-1:00&#x60;, &#x60;05:45&#x60;)   - Only hours (e.g. &#x60;0&#x60;, &#x60;8&#x60;, &#x60;4&#x60;)   - Accepted range is strictly [-12:00 to +14:00] inclusive - If &#x60;timeZone&#x60; provided, kline intervals are interpreted in that timezone instead of UTC. - Note that &#x60;startTime&#x60; and &#x60;endTime&#x60; are always interpreted in UTC, regardless of &#x60;timeZone&#x60;.

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

