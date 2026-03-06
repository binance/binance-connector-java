# WebSocketStreamsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aggTrade**](WebSocketStreamsApi.md#aggTrade) | **POST** /&lt;symbol&gt;@aggTrade | WebSocket Aggregate Trade Streams |
| [**allMarketRollingWindowTicker**](WebSocketStreamsApi.md#allMarketRollingWindowTicker) | **POST** /!ticker_&lt;windowSize&gt;@arr | WebSocket All Market Rolling Window Statistics Streams |
| [**allMiniTicker**](WebSocketStreamsApi.md#allMiniTicker) | **POST** /!miniTicker@arr | WebSocket All Market Mini Tickers Stream |
| [**avgPrice**](WebSocketStreamsApi.md#avgPrice) | **POST** /&lt;symbol&gt;@avgPrice | WebSocket Average Price |
| [**bookTicker**](WebSocketStreamsApi.md#bookTicker) | **POST** /&lt;symbol&gt;@bookTicker | WebSocket Individual Symbol Book Ticker Streams |
| [**diffBookDepth**](WebSocketStreamsApi.md#diffBookDepth) | **POST** /&lt;symbol&gt;@depth@&lt;updateSpeed&gt; | WebSocket Diff. Depth Stream |
| [**kline**](WebSocketStreamsApi.md#kline) | **POST** /&lt;symbol&gt;@kline_&lt;interval&gt; | WebSocket Kline/Candlestick Streams for UTC |
| [**klineOffset**](WebSocketStreamsApi.md#klineOffset) | **POST** /&lt;symbol&gt;@kline_&lt;interval&gt;@+08:00 | WebSocket Kline/Candlestick Streams with timezone offset |
| [**miniTicker**](WebSocketStreamsApi.md#miniTicker) | **POST** /&lt;symbol&gt;@miniTicker | WebSocket Individual Symbol Mini Ticker Stream |
| [**partialBookDepth**](WebSocketStreamsApi.md#partialBookDepth) | **POST** /&lt;symbol&gt;@depth&lt;levels&gt;@&lt;updateSpeed&gt; | WebSocket Partial Book Depth Streams |
| [**rollingWindowTicker**](WebSocketStreamsApi.md#rollingWindowTicker) | **POST** /&lt;symbol&gt;@ticker_&lt;windowSize&gt; | WebSocket Individual Symbol Rolling Window Statistics Streams |
| [**ticker**](WebSocketStreamsApi.md#ticker) | **POST** /&lt;symbol&gt;@ticker | WebSocket Individual Symbol Ticker Streams |
| [**trade**](WebSocketStreamsApi.md#trade) | **POST** /&lt;symbol&gt;@trade | WebSocket Trade Streams |


<a id="aggTrade"></a>
# **aggTrade**
> AggTradeResponse aggTrade(aggTradeRequest)

WebSocket Aggregate Trade Streams

The Aggregate Trade Streams push trade information that is aggregated for a single taker order.

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.stream.api.WebSocketStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebSocketStreamsApi apiInstance = new WebSocketStreamsApi(defaultClient);
    AggTradeRequest aggTradeRequest = new AggTradeRequest(); // AggTradeRequest | 
    try {
      AggTradeResponse result = apiInstance.aggTrade(aggTradeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebSocketStreamsApi#aggTrade");
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

WebSocket All Market Rolling Window Statistics Streams

Rolling window ticker statistics for all market symbols, computed over multiple windows. Note that only tickers that have changed will be present in the array.

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.stream.api.WebSocketStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebSocketStreamsApi apiInstance = new WebSocketStreamsApi(defaultClient);
    AllMarketRollingWindowTickerRequest allMarketRollingWindowTickerRequest = new AllMarketRollingWindowTickerRequest(); // AllMarketRollingWindowTickerRequest | 
    try {
      AllMarketRollingWindowTickerResponse result = apiInstance.allMarketRollingWindowTicker(allMarketRollingWindowTickerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebSocketStreamsApi#allMarketRollingWindowTicker");
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
> AllMiniTickerResponse allMiniTicker()

WebSocket All Market Mini Tickers Stream

24hr rolling window mini-ticker statistics for all symbols that changed in an array. These are NOT the statistics of the UTC day, but a 24hr rolling window for the previous 24hrs. Note that only tickers that have changed will be present in the array.

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.stream.api.WebSocketStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebSocketStreamsApi apiInstance = new WebSocketStreamsApi(defaultClient);
    try {
      AllMiniTickerResponse result = apiInstance.allMiniTicker();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebSocketStreamsApi#allMiniTicker");
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

[**AllMiniTickerResponse**](AllMiniTickerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All Market Mini Tickers Stream |  -  |

<a id="avgPrice"></a>
# **avgPrice**
> AvgPriceResponse avgPrice(avgPriceRequest)

WebSocket Average Price

Average price streams push changes in the average price over a fixed time interval.

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.stream.api.WebSocketStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebSocketStreamsApi apiInstance = new WebSocketStreamsApi(defaultClient);
    AvgPriceRequest avgPriceRequest = new AvgPriceRequest(); // AvgPriceRequest | 
    try {
      AvgPriceResponse result = apiInstance.avgPrice(avgPriceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebSocketStreamsApi#avgPrice");
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

<a id="bookTicker"></a>
# **bookTicker**
> BookTickerResponse bookTicker(bookTickerRequest)

WebSocket Individual Symbol Book Ticker Streams

Pushes any update to the best bid or ask&#39;s price or quantity in real-time for a specified symbol. Multiple &#x60;&lt;symbol&gt;@bookTicker&#x60; streams can be subscribed to over one connection.

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.stream.api.WebSocketStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebSocketStreamsApi apiInstance = new WebSocketStreamsApi(defaultClient);
    BookTickerRequest bookTickerRequest = new BookTickerRequest(); // BookTickerRequest | 
    try {
      BookTickerResponse result = apiInstance.bookTicker(bookTickerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebSocketStreamsApi#bookTicker");
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

WebSocket Diff. Depth Stream

Order book price and quantity depth updates used to locally manage an order book.

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.stream.api.WebSocketStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebSocketStreamsApi apiInstance = new WebSocketStreamsApi(defaultClient);
    DiffBookDepthRequest diffBookDepthRequest = new DiffBookDepthRequest(); // DiffBookDepthRequest | 
    try {
      DiffBookDepthResponse result = apiInstance.diffBookDepth(diffBookDepthRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebSocketStreamsApi#diffBookDepth");
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

WebSocket Kline/Candlestick Streams for UTC

The Kline/Candlestick Stream push updates to the current klines/candlestick every second in &#x60;UTC+0&#x60; timezone  &lt;a id&#x3D;\&quot;kline-intervals\&quot;&gt;&lt;/a&gt;

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.stream.api.WebSocketStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebSocketStreamsApi apiInstance = new WebSocketStreamsApi(defaultClient);
    KlineRequest klineRequest = new KlineRequest(); // KlineRequest | 
    try {
      KlineResponse result = apiInstance.kline(klineRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebSocketStreamsApi#kline");
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

WebSocket Kline/Candlestick Streams with timezone offset

The Kline/Candlestick Stream push updates to the current klines/candlestick every second in &#x60;UTC+8&#x60; timezone

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.stream.api.WebSocketStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebSocketStreamsApi apiInstance = new WebSocketStreamsApi(defaultClient);
    KlineOffsetRequest klineOffsetRequest = new KlineOffsetRequest(); // KlineOffsetRequest | 
    try {
      KlineOffsetResponse result = apiInstance.klineOffset(klineOffsetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebSocketStreamsApi#klineOffset");
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

WebSocket Individual Symbol Mini Ticker Stream

24hr rolling window mini-ticker statistics. These are NOT the statistics of the UTC day, but a 24hr rolling window for the previous 24hrs.

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.stream.api.WebSocketStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebSocketStreamsApi apiInstance = new WebSocketStreamsApi(defaultClient);
    MiniTickerRequest miniTickerRequest = new MiniTickerRequest(); // MiniTickerRequest | 
    try {
      MiniTickerResponse result = apiInstance.miniTicker(miniTickerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebSocketStreamsApi#miniTicker");
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

Top **\\&lt;levels\\&gt;** bids and asks, pushed every second. Valid **\\&lt;levels\\&gt;** are 5, 10, or 20.

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.stream.api.WebSocketStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebSocketStreamsApi apiInstance = new WebSocketStreamsApi(defaultClient);
    PartialBookDepthRequest partialBookDepthRequest = new PartialBookDepthRequest(); // PartialBookDepthRequest | 
    try {
      PartialBookDepthResponse result = apiInstance.partialBookDepth(partialBookDepthRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebSocketStreamsApi#partialBookDepth");
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

<a id="rollingWindowTicker"></a>
# **rollingWindowTicker**
> RollingWindowTickerResponse rollingWindowTicker(rollingWindowTickerRequest)

WebSocket Individual Symbol Rolling Window Statistics Streams

Rolling window ticker statistics for a single symbol, computed over multiple windows.

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.stream.api.WebSocketStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebSocketStreamsApi apiInstance = new WebSocketStreamsApi(defaultClient);
    RollingWindowTickerRequest rollingWindowTickerRequest = new RollingWindowTickerRequest(); // RollingWindowTickerRequest | 
    try {
      RollingWindowTickerResponse result = apiInstance.rollingWindowTicker(rollingWindowTickerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebSocketStreamsApi#rollingWindowTicker");
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

WebSocket Individual Symbol Ticker Streams

24hr rolling window ticker statistics for a single symbol. These are NOT the statistics of the UTC day, but a 24hr rolling window for the previous 24hrs.

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.stream.api.WebSocketStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebSocketStreamsApi apiInstance = new WebSocketStreamsApi(defaultClient);
    TickerRequest tickerRequest = new TickerRequest(); // TickerRequest | 
    try {
      TickerResponse result = apiInstance.ticker(tickerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebSocketStreamsApi#ticker");
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

WebSocket Trade Streams

The Trade Streams push raw trade information; each trade has a unique buyer and seller.

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.stream.api.WebSocketStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebSocketStreamsApi apiInstance = new WebSocketStreamsApi(defaultClient);
    TradeRequest tradeRequest = new TradeRequest(); // TradeRequest | 
    try {
      TradeResponse result = apiInstance.trade(tradeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebSocketStreamsApi#trade");
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

