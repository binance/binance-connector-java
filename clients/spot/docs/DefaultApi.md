# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aggTrade**](DefaultApi.md#aggTrade) | **POST** /&lt;symbol&gt;@aggTrade | Aggregate Trade Streams |
| [**allMarketRollingWindowTicker**](DefaultApi.md#allMarketRollingWindowTicker) | **POST** /!ticker_&lt;windowSize&gt;@arr | All Market Rolling Window Statistics Streams |
| [**allMiniTicker**](DefaultApi.md#allMiniTicker) | **POST** /!miniTicker@arr | All Market Mini Tickers Stream |
| [**avgPrice**](DefaultApi.md#avgPrice) | **POST** /&lt;symbol&gt;@avgPrice | Average Price |
| [**blockTrade**](DefaultApi.md#blockTrade) | **POST** /&lt;symbol&gt;@blockTrade | Block Trade Streams |
| [**bookTicker**](DefaultApi.md#bookTicker) | **POST** /&lt;symbol&gt;@bookTicker | Individual Symbol Book Ticker Streams |
| [**diffBookDepth**](DefaultApi.md#diffBookDepth) | **POST** /&lt;symbol&gt;@depth@&lt;updateSpeed&gt; | Diff. Depth Stream |
| [**kline**](DefaultApi.md#kline) | **POST** /&lt;symbol&gt;@kline_&lt;interval&gt; | Kline/Candlestick Streams for UTC |
| [**klineOffset**](DefaultApi.md#klineOffset) | **POST** /&lt;symbol&gt;@kline_&lt;interval&gt;@+08:00 | Kline/Candlestick Streams with timezone offset |
| [**miniTicker**](DefaultApi.md#miniTicker) | **POST** /&lt;symbol&gt;@miniTicker | Individual Symbol Mini Ticker Stream |
| [**partialBookDepth**](DefaultApi.md#partialBookDepth) | **POST** /&lt;symbol&gt;@depth&lt;levels&gt;@&lt;updateSpeed&gt; | WebSocket Partial Book Depth Streams |
| [**referencePrice**](DefaultApi.md#referencePrice) | **POST** /&lt;symbol&gt;@referencePrice | Reference Price Streams |
| [**rollingWindowTicker**](DefaultApi.md#rollingWindowTicker) | **POST** /&lt;symbol&gt;@ticker_&lt;windowSize&gt; | Individual Symbol Rolling Window Statistics Streams |
| [**ticker**](DefaultApi.md#ticker) | **POST** /&lt;symbol&gt;@ticker | Individual Symbol Ticker Streams |
| [**trade**](DefaultApi.md#trade) | **POST** /&lt;symbol&gt;@trade | Trade Streams |


<a id="aggTrade"></a>
# **aggTrade**
> AggTradeResponse aggTrade(aggTradeRequest)

Aggregate Trade Streams

The Aggregate Trade Streams push trade information that is aggregated for a single taker order.  Update Speed: Real-time

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    AggTradeRequest aggTradeRequest = new AggTradeRequest(); // AggTradeRequest | 
    try {
      AggTradeResponse result = apiInstance.aggTrade(aggTradeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#aggTrade");
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
| **aggTradeRequest** | [**AggTradeRequest**](AggTradeRequest.md)|  | |

### Return type

[**AggTradeResponse**](AggTradeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Aggregate Trade Streams |  -  |

<a id="allMarketRollingWindowTicker"></a>
# **allMarketRollingWindowTicker**
> AllMarketRollingWindowTickerResponse allMarketRollingWindowTicker(allMarketRollingWindowTickerRequest)

All Market Rolling Window Statistics Streams

Rolling window ticker statistics for all market symbols, computed over multiple windows.  Note that only tickers that have changed will be present in the array.  Update Speed: 1000ms

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    AllMarketRollingWindowTickerRequest allMarketRollingWindowTickerRequest = new AllMarketRollingWindowTickerRequest(); // AllMarketRollingWindowTickerRequest | 
    try {
      AllMarketRollingWindowTickerResponse result = apiInstance.allMarketRollingWindowTicker(allMarketRollingWindowTickerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#allMarketRollingWindowTicker");
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
| **allMarketRollingWindowTickerRequest** | [**AllMarketRollingWindowTickerRequest**](AllMarketRollingWindowTickerRequest.md)|  | |

### Return type

[**AllMarketRollingWindowTickerResponse**](AllMarketRollingWindowTickerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All Market Rolling Window Statistics Streams |  -  |

<a id="allMiniTicker"></a>
# **allMiniTicker**
> AllMiniTickerResponse allMiniTicker(allMiniTickerRequest)

All Market Mini Tickers Stream

24hr rolling window mini-ticker statistics for all symbols that changed in an array. These are NOT the statistics of the UTC day, but a 24hr rolling window for the previous 24hrs. Note that only tickers that have changed will be present in the array.  Update Speed: 1000ms

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    AllMiniTickerRequest allMiniTickerRequest = new AllMiniTickerRequest(); // AllMiniTickerRequest | 
    try {
      AllMiniTickerResponse result = apiInstance.allMiniTicker(allMiniTickerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#allMiniTicker");
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
| **allMiniTickerRequest** | [**AllMiniTickerRequest**](AllMiniTickerRequest.md)|  | |

### Return type

[**AllMiniTickerResponse**](AllMiniTickerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All Market Mini Tickers Stream |  -  |

<a id="avgPrice"></a>
# **avgPrice**
> AvgPriceResponse avgPrice(avgPriceRequest)

Average Price

Average price streams push changes in the average price over a fixed time interval.  Update Speed: 1000ms

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    AvgPriceRequest avgPriceRequest = new AvgPriceRequest(); // AvgPriceRequest | 
    try {
      AvgPriceResponse result = apiInstance.avgPrice(avgPriceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#avgPrice");
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
| **200** | Average Price |  -  |

<a id="blockTrade"></a>
# **blockTrade**
> BlockTradeResponse blockTrade(blockTradeRequest)

Block Trade Streams

Block Trade Streams push block trade information in real-time.  Update Speed: Real-time

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    BlockTradeRequest blockTradeRequest = new BlockTradeRequest(); // BlockTradeRequest | 
    try {
      BlockTradeResponse result = apiInstance.blockTrade(blockTradeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#blockTrade");
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
| **blockTradeRequest** | [**BlockTradeRequest**](BlockTradeRequest.md)|  | |

### Return type

[**BlockTradeResponse**](BlockTradeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Block Trade Streams |  -  |

<a id="bookTicker"></a>
# **bookTicker**
> BookTickerResponse bookTicker(bookTickerRequest)

Individual Symbol Book Ticker Streams

Pushes any update to the best bid or ask&#39;s price or quantity in real-time for a specified symbol.  Multiple &#x60;&lt;symbol&gt;@bookTicker&#x60; streams can be subscribed to over one connection.  Update Speed: Real-time

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    BookTickerRequest bookTickerRequest = new BookTickerRequest(); // BookTickerRequest | 
    try {
      BookTickerResponse result = apiInstance.bookTicker(bookTickerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#bookTicker");
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
| **bookTickerRequest** | [**BookTickerRequest**](BookTickerRequest.md)|  | |

### Return type

[**BookTickerResponse**](BookTickerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Individual Symbol Book Ticker Streams |  -  |

<a id="diffBookDepth"></a>
# **diffBookDepth**
> DiffBookDepthResponse diffBookDepth(diffBookDepthRequest)

Diff. Depth Stream

Order book price and quantity depth updates used to locally manage an order book.  Update Speed: 1000ms or 100ms

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    DiffBookDepthRequest diffBookDepthRequest = new DiffBookDepthRequest(); // DiffBookDepthRequest | 
    try {
      DiffBookDepthResponse result = apiInstance.diffBookDepth(diffBookDepthRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#diffBookDepth");
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
| **diffBookDepthRequest** | [**DiffBookDepthRequest**](DiffBookDepthRequest.md)|  | |

### Return type

[**DiffBookDepthResponse**](DiffBookDepthResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Diff. Depth Stream |  -  |

<a id="kline"></a>
# **kline**
> KlineResponse kline(klineRequest)

Kline/Candlestick Streams for UTC

The Kline/Candlestick Stream push updates to the current klines/candlestick every second in &#x60;UTC+0&#x60; timezone  Update Speed: 1000ms for &#x60;1s&#x60;, 2000ms for the other intervals

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    KlineRequest klineRequest = new KlineRequest(); // KlineRequest | 
    try {
      KlineResponse result = apiInstance.kline(klineRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#kline");
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
| **klineRequest** | [**KlineRequest**](KlineRequest.md)|  | |

### Return type

[**KlineResponse**](KlineResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Kline/Candlestick Streams for UTC |  -  |

<a id="klineOffset"></a>
# **klineOffset**
> KlineOffsetResponse klineOffset(klineOffsetRequest)

Kline/Candlestick Streams with timezone offset

The Kline/Candlestick Stream push updates to the current klines/candlestick every second in &#x60;UTC+8&#x60; timezone  **Kline/Candlestick chart intervals:**  Supported intervals: See Kline/Candlestick chart intervals  **UTC+8 timezone offset:**   - Kline intervals open and close in the UTC+8 timezone. For example the 1d klines will open at the beginning of the UTC+8 day, and close at the end of the UTC+8 day.   - Note that E (event time), t (start time) and T (close time) in the payload are Unix timestamps, which are always interpreted in UTC.  Update Speed: 1000ms for &#x60;1s&#x60;, 2000ms for the other intervals

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    KlineOffsetRequest klineOffsetRequest = new KlineOffsetRequest(); // KlineOffsetRequest | 
    try {
      KlineOffsetResponse result = apiInstance.klineOffset(klineOffsetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#klineOffset");
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
| **klineOffsetRequest** | [**KlineOffsetRequest**](KlineOffsetRequest.md)|  | |

### Return type

[**KlineOffsetResponse**](KlineOffsetResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Kline/Candlestick Streams with timezone offset |  -  |

<a id="miniTicker"></a>
# **miniTicker**
> MiniTickerResponse miniTicker(miniTickerRequest)

Individual Symbol Mini Ticker Stream

24hr rolling window mini-ticker statistics. These are NOT the statistics of the UTC day, but a 24hr rolling window for the previous 24hrs.  Update Speed: 1000ms

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    MiniTickerRequest miniTickerRequest = new MiniTickerRequest(); // MiniTickerRequest | 
    try {
      MiniTickerResponse result = apiInstance.miniTicker(miniTickerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#miniTicker");
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
| **miniTickerRequest** | [**MiniTickerRequest**](MiniTickerRequest.md)|  | |

### Return type

[**MiniTickerResponse**](MiniTickerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Individual Symbol Mini Ticker Stream |  -  |

<a id="partialBookDepth"></a>
# **partialBookDepth**
> PartialBookDepthResponse partialBookDepth(partialBookDepthRequest)

WebSocket Partial Book Depth Streams

Top **\\&lt;levels\\&gt;** bids and asks, pushed every second.  Update Speed: 1000ms or 100ms

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    PartialBookDepthRequest partialBookDepthRequest = new PartialBookDepthRequest(); // PartialBookDepthRequest | 
    try {
      PartialBookDepthResponse result = apiInstance.partialBookDepth(partialBookDepthRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#partialBookDepth");
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
| **partialBookDepthRequest** | [**PartialBookDepthRequest**](PartialBookDepthRequest.md)|  | |

### Return type

[**PartialBookDepthResponse**](PartialBookDepthResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Partial Book Depth Streams |  -  |

<a id="referencePrice"></a>
# **referencePrice**
> ReferencePriceResponse referencePrice(referencePriceRequest)

Reference Price Streams

Reference price stream for a symbol.  Update Speed: 1000ms

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    ReferencePriceRequest referencePriceRequest = new ReferencePriceRequest(); // ReferencePriceRequest | 
    try {
      ReferencePriceResponse result = apiInstance.referencePrice(referencePriceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#referencePrice");
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
| **200** | Reference Price Streams |  -  |

<a id="rollingWindowTicker"></a>
# **rollingWindowTicker**
> RollingWindowTickerResponse rollingWindowTicker(rollingWindowTickerRequest)

Individual Symbol Rolling Window Statistics Streams

Rolling window ticker statistics for a single symbol, computed over multiple windows.  **Note:** This stream is different from the &#x60;&lt;symbol&gt;@ticker&#x60; stream. The open time &#x60;\&quot;O\&quot;&#x60; always starts on a minute, while the closing time &#x60;\&quot;C\&quot;&#x60; is the current time  of the update. As such, the effective window might be up to 59999ms wider than &#x60;&lt;window_size&gt;&#x60;.  Update Speed: 1000ms

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    RollingWindowTickerRequest rollingWindowTickerRequest = new RollingWindowTickerRequest(); // RollingWindowTickerRequest | 
    try {
      RollingWindowTickerResponse result = apiInstance.rollingWindowTicker(rollingWindowTickerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#rollingWindowTicker");
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
| **rollingWindowTickerRequest** | [**RollingWindowTickerRequest**](RollingWindowTickerRequest.md)|  | |

### Return type

[**RollingWindowTickerResponse**](RollingWindowTickerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Individual Symbol Rolling Window Statistics Streams |  -  |

<a id="ticker"></a>
# **ticker**
> TickerResponse ticker(tickerRequest)

Individual Symbol Ticker Streams

24hr rolling window ticker statistics for a single symbol. These are NOT the statistics of the UTC day, but a 24hr rolling window for the previous 24hrs.  Update Speed: 1000ms

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    TickerRequest tickerRequest = new TickerRequest(); // TickerRequest | 
    try {
      TickerResponse result = apiInstance.ticker(tickerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#ticker");
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
| **tickerRequest** | [**TickerRequest**](TickerRequest.md)|  | |

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
| **200** | Individual Symbol Ticker Streams |  -  |

<a id="trade"></a>
# **trade**
> TradeResponse trade(tradeRequest)

Trade Streams

The Trade Streams push raw trade information; each trade has a unique buyer and seller.  Update Speed: Real-time

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    TradeRequest tradeRequest = new TradeRequest(); // TradeRequest | 
    try {
      TradeResponse result = apiInstance.trade(tradeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#trade");
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
| **tradeRequest** | [**TradeRequest**](TradeRequest.md)|  | |

### Return type

[**TradeResponse**](TradeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Trade Streams |  -  |

