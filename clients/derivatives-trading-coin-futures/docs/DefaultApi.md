# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aggregateTradeStreams**](DefaultApi.md#aggregateTradeStreams) | **POST** /&lt;symbol&gt;@aggTrade | Aggregate Trade Streams |
| [**allBookTickersStream**](DefaultApi.md#allBookTickersStream) | **POST** /!bookTicker | All Book Tickers Stream |
| [**allMarketLiquidationOrderStreams**](DefaultApi.md#allMarketLiquidationOrderStreams) | **POST** /!forceOrder@arr | All Market Liquidation Order Streams |
| [**allMarketMiniTickersStream**](DefaultApi.md#allMarketMiniTickersStream) | **POST** /!miniTicker@arr | All Market Mini Tickers Stream |
| [**allMarketTickersStreams**](DefaultApi.md#allMarketTickersStreams) | **POST** /!ticker@arr | All Market Tickers Streams |
| [**continuousContractKlineCandlestickStreams**](DefaultApi.md#continuousContractKlineCandlestickStreams) | **POST** /&lt;pair&gt;_&lt;contractType&gt;@continuousKline_&lt;interval&gt; | Continuous Contract Kline/Candlestick Streams |
| [**contractInfoStream**](DefaultApi.md#contractInfoStream) | **POST** /!contractInfo | Contract Info Stream |
| [**diffBookDepthStreams**](DefaultApi.md#diffBookDepthStreams) | **POST** /&lt;symbol&gt;@depth@&lt;updateSpeed&gt; | Diff. Book Depth Streams |
| [**indexKlineCandlestickStreams**](DefaultApi.md#indexKlineCandlestickStreams) | **POST** /&lt;pair&gt;@indexPriceKline_&lt;interval&gt; | Index Kline/Candlestick Streams |
| [**indexPriceStream**](DefaultApi.md#indexPriceStream) | **POST** /&lt;pair&gt;@indexPrice@&lt;updateSpeed&gt; | Index Price Stream |
| [**individualSymbolBookTickerStreams**](DefaultApi.md#individualSymbolBookTickerStreams) | **POST** /&lt;symbol&gt;@bookTicker | Individual Symbol Book Ticker Streams |
| [**individualSymbolMiniTickerStream**](DefaultApi.md#individualSymbolMiniTickerStream) | **POST** /&lt;symbol&gt;@miniTicker | Individual Symbol Mini Ticker Stream |
| [**individualSymbolTickerStreams**](DefaultApi.md#individualSymbolTickerStreams) | **POST** /&lt;symbol&gt;@ticker | Individual Symbol Ticker Streams |
| [**klineCandlestickStreams**](DefaultApi.md#klineCandlestickStreams) | **POST** /&lt;symbol&gt;@kline_&lt;interval&gt; | Kline/Candlestick Streams |
| [**markPriceKlineCandlestickStreams**](DefaultApi.md#markPriceKlineCandlestickStreams) | **POST** /&lt;symbol&gt;@markPriceKline_&lt;interval&gt; | Mark Price Kline/Candlestick Streams |
| [**markPriceOfAllSymbolsOfAPair**](DefaultApi.md#markPriceOfAllSymbolsOfAPair) | **POST** /&lt;pair&gt;@markPrice@&lt;updateSpeed&gt; | Mark Price of All Symbols of a Pair |
| [**markPriceStream**](DefaultApi.md#markPriceStream) | **POST** /&lt;symbol&gt;@markPrice@&lt;updateSpeed&gt; | Mark Price Stream |
| [**marketLiquidationOrderStreams**](DefaultApi.md#marketLiquidationOrderStreams) | **POST** /&lt;symbol&gt;@forceOrder | Market Liquidation Order Streams |
| [**partialBookDepthStreams**](DefaultApi.md#partialBookDepthStreams) | **POST** /&lt;symbol&gt;@depth&lt;levels&gt;@&lt;updateSpeed&gt; | Partial Book Depth Streams |


<a id="aggregateTradeStreams"></a>
# **aggregateTradeStreams**
> AggregateTradeStreamsResponse aggregateTradeStreams(aggregateTradeStreamsRequest)

Aggregate Trade Streams

The Aggregate Trade Streams push market trade information that is aggregated for fills with same price and taking side every 100 milliseconds.  &gt; **After CM migration**, the payload is appended with a new &#x60;st&#x60; field (&#x60;1&#x60; &#x3D; UM, &#x60;2&#x60; &#x3D; CM).  Update Speed: 100ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    AggregateTradeStreamsRequest aggregateTradeStreamsRequest = new AggregateTradeStreamsRequest(); // AggregateTradeStreamsRequest | 
    try {
      AggregateTradeStreamsResponse result = apiInstance.aggregateTradeStreams(aggregateTradeStreamsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#aggregateTradeStreams");
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
| **aggregateTradeStreamsRequest** | [**AggregateTradeStreamsRequest**](AggregateTradeStreamsRequest.md)|  | |

### Return type

[**AggregateTradeStreamsResponse**](AggregateTradeStreamsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Aggregate Trade Streams |  -  |

<a id="allBookTickersStream"></a>
# **allBookTickersStream**
> AllBookTickersStreamResponse allBookTickersStream(allBookTickersStreamRequest)

All Book Tickers Stream

Pushes any update to the best bid or ask&#39;s price or quantity in real-time for all symbols.  &gt; **After CM migration**, this stream pushes the merged UM + CM universe (subscribable on both &#x60;fstream&#x60; and &#x60;dstream&#x60;); each payload is appended with a new &#x60;st&#x60; field (&#x60;1&#x60; &#x3D; UM, &#x60;2&#x60; &#x3D; CM).  Update Speed: Real-time

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    AllBookTickersStreamRequest allBookTickersStreamRequest = new AllBookTickersStreamRequest(); // AllBookTickersStreamRequest | 
    try {
      AllBookTickersStreamResponse result = apiInstance.allBookTickersStream(allBookTickersStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#allBookTickersStream");
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
| **allBookTickersStreamRequest** | [**AllBookTickersStreamRequest**](AllBookTickersStreamRequest.md)|  | |

### Return type

[**AllBookTickersStreamResponse**](AllBookTickersStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All Book Tickers Stream |  -  |

<a id="allMarketLiquidationOrderStreams"></a>
# **allMarketLiquidationOrderStreams**
> AllMarketLiquidationOrderStreamsResponse allMarketLiquidationOrderStreams(allMarketLiquidationOrderStreamsRequest)

All Market Liquidation Order Streams

The All Liquidation Order Snapshot Streams push force liquidation order information for all symbols in the market. For each symbol，only the latest one liquidation order within 1000ms will be pushed as the snapshot. If no liquidation happens in the interval of 1000ms, no stream will be pushed.  &gt; **After CM migration**, this stream pushes the merged UM + CM universe (subscribable on both &#x60;fstream&#x60; and &#x60;dstream&#x60;); each payload is appended with a new &#x60;st&#x60; field (&#x60;1&#x60; &#x3D; UM, &#x60;2&#x60; &#x3D; CM).  Update Speed: 1000ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    AllMarketLiquidationOrderStreamsRequest allMarketLiquidationOrderStreamsRequest = new AllMarketLiquidationOrderStreamsRequest(); // AllMarketLiquidationOrderStreamsRequest | 
    try {
      AllMarketLiquidationOrderStreamsResponse result = apiInstance.allMarketLiquidationOrderStreams(allMarketLiquidationOrderStreamsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#allMarketLiquidationOrderStreams");
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
| **allMarketLiquidationOrderStreamsRequest** | [**AllMarketLiquidationOrderStreamsRequest**](AllMarketLiquidationOrderStreamsRequest.md)|  | |

### Return type

[**AllMarketLiquidationOrderStreamsResponse**](AllMarketLiquidationOrderStreamsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All Market Liquidation Order Streams |  -  |

<a id="allMarketMiniTickersStream"></a>
# **allMarketMiniTickersStream**
> AllMarketMiniTickersStreamResponse allMarketMiniTickersStream(allMarketMiniTickersStreamRequest)

All Market Mini Tickers Stream

24hr rolling window mini-ticker statistics for all symbols. These are NOT the statistics of the UTC day, but a 24hr rolling window from requestTime to 24hrs before. Note that only tickers that have changed will be present in the array.  &gt; **After CM migration**, this stream pushes the merged UM + CM universe (subscribable on both &#x60;fstream&#x60; and &#x60;dstream&#x60;); each payload is appended with a new &#x60;st&#x60; field (&#x60;1&#x60; &#x3D; UM, &#x60;2&#x60; &#x3D; CM).  Update Speed: 1000ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    AllMarketMiniTickersStreamRequest allMarketMiniTickersStreamRequest = new AllMarketMiniTickersStreamRequest(); // AllMarketMiniTickersStreamRequest | 
    try {
      AllMarketMiniTickersStreamResponse result = apiInstance.allMarketMiniTickersStream(allMarketMiniTickersStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#allMarketMiniTickersStream");
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
| **allMarketMiniTickersStreamRequest** | [**AllMarketMiniTickersStreamRequest**](AllMarketMiniTickersStreamRequest.md)|  | |

### Return type

[**AllMarketMiniTickersStreamResponse**](AllMarketMiniTickersStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All Market Mini Tickers Stream |  -  |

<a id="allMarketTickersStreams"></a>
# **allMarketTickersStreams**
> AllMarketTickersStreamsResponse allMarketTickersStreams(allMarketTickersStreamsRequest)

All Market Tickers Streams

24hr rolling window ticker statistics for all symbols. These are NOT the statistics of the UTC day, but a 24hr rolling window from requestTime to 24hrs before. Note that only tickers that have changed will be present in the array.  &gt; **After CM migration**, this stream pushes the merged UM + CM universe (subscribable on both &#x60;fstream&#x60; and &#x60;dstream&#x60;); each payload is appended with a new &#x60;st&#x60; field (&#x60;1&#x60; &#x3D; UM, &#x60;2&#x60; &#x3D; CM).  Update Speed: 1000ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    AllMarketTickersStreamsRequest allMarketTickersStreamsRequest = new AllMarketTickersStreamsRequest(); // AllMarketTickersStreamsRequest | 
    try {
      AllMarketTickersStreamsResponse result = apiInstance.allMarketTickersStreams(allMarketTickersStreamsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#allMarketTickersStreams");
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
| **allMarketTickersStreamsRequest** | [**AllMarketTickersStreamsRequest**](AllMarketTickersStreamsRequest.md)|  | |

### Return type

[**AllMarketTickersStreamsResponse**](AllMarketTickersStreamsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All Market Tickers Streams |  -  |

<a id="continuousContractKlineCandlestickStreams"></a>
# **continuousContractKlineCandlestickStreams**
> ContinuousContractKlineCandlestickStreamsResponse continuousContractKlineCandlestickStreams(continuousContractKlineCandlestickStreamsRequest)

Continuous Contract Kline/Candlestick Streams

Kline update every second  &gt; **After CM migration**, both &#x60;fstream&#x60; and &#x60;dstream&#x60; may subscribe to either UM or CM symbols on this stream.  Update Speed: 250ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    ContinuousContractKlineCandlestickStreamsRequest continuousContractKlineCandlestickStreamsRequest = new ContinuousContractKlineCandlestickStreamsRequest(); // ContinuousContractKlineCandlestickStreamsRequest | 
    try {
      ContinuousContractKlineCandlestickStreamsResponse result = apiInstance.continuousContractKlineCandlestickStreams(continuousContractKlineCandlestickStreamsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#continuousContractKlineCandlestickStreams");
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
| **continuousContractKlineCandlestickStreamsRequest** | [**ContinuousContractKlineCandlestickStreamsRequest**](ContinuousContractKlineCandlestickStreamsRequest.md)|  | |

### Return type

[**ContinuousContractKlineCandlestickStreamsResponse**](ContinuousContractKlineCandlestickStreamsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Continuous Contract Kline/Candlestick Streams |  -  |

<a id="contractInfoStream"></a>
# **contractInfoStream**
> ContractInfoStreamResponse contractInfoStream(contractInfoStreamRequest)

Contract Info Stream

ContractInfo stream pushes when contract info updates(listing/settlement/contract bracket update). bks field only shows up when bracket gets updated.  &gt; **After CM migration**, this stream pushes the merged UM + CM universe (subscribable on both &#x60;fstream&#x60; and &#x60;dstream&#x60;); each payload is appended with a new &#x60;st&#x60; field (&#x60;1&#x60; &#x3D; UM, &#x60;2&#x60; &#x3D; CM).  Update Speed: Real-time

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    ContractInfoStreamRequest contractInfoStreamRequest = new ContractInfoStreamRequest(); // ContractInfoStreamRequest | 
    try {
      ContractInfoStreamResponse result = apiInstance.contractInfoStream(contractInfoStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#contractInfoStream");
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
| **contractInfoStreamRequest** | [**ContractInfoStreamRequest**](ContractInfoStreamRequest.md)|  | |

### Return type

[**ContractInfoStreamResponse**](ContractInfoStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Contract Info Stream |  -  |

<a id="diffBookDepthStreams"></a>
# **diffBookDepthStreams**
> DiffBookDepthStreamsResponse diffBookDepthStreams(diffBookDepthStreamsRequest)

Diff. Book Depth Streams

Bids and asks, pushed every 250 milliseconds, 500 milliseconds, or 100 milliseconds  &gt; **After CM migration**, the payload is appended with a new &#x60;st&#x60; field (&#x60;1&#x60; &#x3D; UM, &#x60;2&#x60; &#x3D; CM).  Update Speed: 250ms or 500ms or 100ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    DiffBookDepthStreamsRequest diffBookDepthStreamsRequest = new DiffBookDepthStreamsRequest(); // DiffBookDepthStreamsRequest | 
    try {
      DiffBookDepthStreamsResponse result = apiInstance.diffBookDepthStreams(diffBookDepthStreamsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#diffBookDepthStreams");
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
| **diffBookDepthStreamsRequest** | [**DiffBookDepthStreamsRequest**](DiffBookDepthStreamsRequest.md)|  | |

### Return type

[**DiffBookDepthStreamsResponse**](DiffBookDepthStreamsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Diff. Book Depth Streams |  -  |

<a id="indexKlineCandlestickStreams"></a>
# **indexKlineCandlestickStreams**
> IndexKlineCandlestickStreamsResponse indexKlineCandlestickStreams(indexKlineCandlestickStreamsRequest)

Index Kline/Candlestick Streams

Index Kline/Candlestick Streams  &gt; **After CM migration**, both &#x60;fstream&#x60; and &#x60;dstream&#x60; may subscribe to CM symbols on this stream.  Update Speed: 250ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    IndexKlineCandlestickStreamsRequest indexKlineCandlestickStreamsRequest = new IndexKlineCandlestickStreamsRequest(); // IndexKlineCandlestickStreamsRequest | 
    try {
      IndexKlineCandlestickStreamsResponse result = apiInstance.indexKlineCandlestickStreams(indexKlineCandlestickStreamsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#indexKlineCandlestickStreams");
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
| **indexKlineCandlestickStreamsRequest** | [**IndexKlineCandlestickStreamsRequest**](IndexKlineCandlestickStreamsRequest.md)|  | |

### Return type

[**IndexKlineCandlestickStreamsResponse**](IndexKlineCandlestickStreamsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Index Kline/Candlestick Streams |  -  |

<a id="indexPriceStream"></a>
# **indexPriceStream**
> IndexPriceStreamResponse indexPriceStream(indexPriceStreamRequest)

Index Price Stream

Index Price Stream  Update Speed: 3000ms OR 1000ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    IndexPriceStreamRequest indexPriceStreamRequest = new IndexPriceStreamRequest(); // IndexPriceStreamRequest | 
    try {
      IndexPriceStreamResponse result = apiInstance.indexPriceStream(indexPriceStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#indexPriceStream");
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
| **indexPriceStreamRequest** | [**IndexPriceStreamRequest**](IndexPriceStreamRequest.md)|  | |

### Return type

[**IndexPriceStreamResponse**](IndexPriceStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Index Price Stream |  -  |

<a id="individualSymbolBookTickerStreams"></a>
# **individualSymbolBookTickerStreams**
> IndividualSymbolBookTickerStreamsResponse individualSymbolBookTickerStreams(individualSymbolBookTickerStreamsRequest)

Individual Symbol Book Ticker Streams

Pushes any update to the best bid or ask&#39;s price or quantity in real-time for a specified symbol.  &gt; **After CM migration**, the payload is appended with a new &#x60;st&#x60; field (&#x60;1&#x60; &#x3D; UM, &#x60;2&#x60; &#x3D; CM).  Update Speed: Real-time

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    IndividualSymbolBookTickerStreamsRequest individualSymbolBookTickerStreamsRequest = new IndividualSymbolBookTickerStreamsRequest(); // IndividualSymbolBookTickerStreamsRequest | 
    try {
      IndividualSymbolBookTickerStreamsResponse result = apiInstance.individualSymbolBookTickerStreams(individualSymbolBookTickerStreamsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#individualSymbolBookTickerStreams");
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
| **individualSymbolBookTickerStreamsRequest** | [**IndividualSymbolBookTickerStreamsRequest**](IndividualSymbolBookTickerStreamsRequest.md)|  | |

### Return type

[**IndividualSymbolBookTickerStreamsResponse**](IndividualSymbolBookTickerStreamsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Individual Symbol Book Ticker Streams |  -  |

<a id="individualSymbolMiniTickerStream"></a>
# **individualSymbolMiniTickerStream**
> IndividualSymbolMiniTickerStreamResponse individualSymbolMiniTickerStream(individualSymbolMiniTickerStreamRequest)

Individual Symbol Mini Ticker Stream

24hr rolling window mini-ticker statistics for a single symbol. These are NOT the statistics of the UTC day, but a 24hr rolling window from requestTime to 24hrs before.  &gt; **After CM migration**, the payload is appended with a new &#x60;st&#x60; field (&#x60;1&#x60; &#x3D; UM, &#x60;2&#x60; &#x3D; CM).  Update Speed: 500ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    IndividualSymbolMiniTickerStreamRequest individualSymbolMiniTickerStreamRequest = new IndividualSymbolMiniTickerStreamRequest(); // IndividualSymbolMiniTickerStreamRequest | 
    try {
      IndividualSymbolMiniTickerStreamResponse result = apiInstance.individualSymbolMiniTickerStream(individualSymbolMiniTickerStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#individualSymbolMiniTickerStream");
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
| **individualSymbolMiniTickerStreamRequest** | [**IndividualSymbolMiniTickerStreamRequest**](IndividualSymbolMiniTickerStreamRequest.md)|  | |

### Return type

[**IndividualSymbolMiniTickerStreamResponse**](IndividualSymbolMiniTickerStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Individual Symbol Mini Ticker Stream |  -  |

<a id="individualSymbolTickerStreams"></a>
# **individualSymbolTickerStreams**
> IndividualSymbolTickerStreamsResponse individualSymbolTickerStreams(individualSymbolTickerStreamsRequest)

Individual Symbol Ticker Streams

24hr rolling window ticker statistics for a single symbol. These are NOT the statistics of the UTC day, but a 24hr rolling window from requestTime to 24hrs before.  &gt; **After CM migration**, the payload is appended with a new &#x60;st&#x60; field (&#x60;1&#x60; &#x3D; UM, &#x60;2&#x60; &#x3D; CM).  Update Speed: 500ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    IndividualSymbolTickerStreamsRequest individualSymbolTickerStreamsRequest = new IndividualSymbolTickerStreamsRequest(); // IndividualSymbolTickerStreamsRequest | 
    try {
      IndividualSymbolTickerStreamsResponse result = apiInstance.individualSymbolTickerStreams(individualSymbolTickerStreamsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#individualSymbolTickerStreams");
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
| **individualSymbolTickerStreamsRequest** | [**IndividualSymbolTickerStreamsRequest**](IndividualSymbolTickerStreamsRequest.md)|  | |

### Return type

[**IndividualSymbolTickerStreamsResponse**](IndividualSymbolTickerStreamsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Individual Symbol Ticker Streams |  -  |

<a id="klineCandlestickStreams"></a>
# **klineCandlestickStreams**
> KlineCandlestickStreamsResponse klineCandlestickStreams(klineCandlestickStreamsRequest)

Kline/Candlestick Streams

The Kline/Candlestick Stream push updates to the current klines/candlestick every 250 milliseconds (if existing).  &gt; **After CM migration**, both &#x60;fstream&#x60; and &#x60;dstream&#x60; may subscribe to either UM or CM symbols on this stream.  Update Speed: 250ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    KlineCandlestickStreamsRequest klineCandlestickStreamsRequest = new KlineCandlestickStreamsRequest(); // KlineCandlestickStreamsRequest | 
    try {
      KlineCandlestickStreamsResponse result = apiInstance.klineCandlestickStreams(klineCandlestickStreamsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#klineCandlestickStreams");
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
| **klineCandlestickStreamsRequest** | [**KlineCandlestickStreamsRequest**](KlineCandlestickStreamsRequest.md)|  | |

### Return type

[**KlineCandlestickStreamsResponse**](KlineCandlestickStreamsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Kline/Candlestick Streams |  -  |

<a id="markPriceKlineCandlestickStreams"></a>
# **markPriceKlineCandlestickStreams**
> MarkPriceKlineCandlestickStreamsResponse markPriceKlineCandlestickStreams(markPriceKlineCandlestickStreamsRequest)

Mark Price Kline/Candlestick Streams

Mark Price Kline/Candlestick Streams  &gt; **After CM migration**, both &#x60;fstream&#x60; and &#x60;dstream&#x60; may subscribe to CM symbols on this stream.  Update Speed: 250ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    MarkPriceKlineCandlestickStreamsRequest markPriceKlineCandlestickStreamsRequest = new MarkPriceKlineCandlestickStreamsRequest(); // MarkPriceKlineCandlestickStreamsRequest | 
    try {
      MarkPriceKlineCandlestickStreamsResponse result = apiInstance.markPriceKlineCandlestickStreams(markPriceKlineCandlestickStreamsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#markPriceKlineCandlestickStreams");
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
| **markPriceKlineCandlestickStreamsRequest** | [**MarkPriceKlineCandlestickStreamsRequest**](MarkPriceKlineCandlestickStreamsRequest.md)|  | |

### Return type

[**MarkPriceKlineCandlestickStreamsResponse**](MarkPriceKlineCandlestickStreamsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Mark Price Kline/Candlestick Streams |  -  |

<a id="markPriceOfAllSymbolsOfAPair"></a>
# **markPriceOfAllSymbolsOfAPair**
> MarkPriceOfAllSymbolsOfAPairResponse markPriceOfAllSymbolsOfAPair(markPriceOfAllSymbolsOfAPairRequest)

Mark Price of All Symbols of a Pair

Mark Price of All Symbols of a Pair  &gt; **After CM migration**, the payload is appended with a new &#x60;st&#x60; field (&#x60;1&#x60; &#x3D; UM, &#x60;2&#x60; &#x3D; CM); both &#x60;fstream&#x60; and &#x60;dstream&#x60; may subscribe to either UM or CM symbols on this stream.  Update Speed: 3000ms OR 1000ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    MarkPriceOfAllSymbolsOfAPairRequest markPriceOfAllSymbolsOfAPairRequest = new MarkPriceOfAllSymbolsOfAPairRequest(); // MarkPriceOfAllSymbolsOfAPairRequest | 
    try {
      MarkPriceOfAllSymbolsOfAPairResponse result = apiInstance.markPriceOfAllSymbolsOfAPair(markPriceOfAllSymbolsOfAPairRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#markPriceOfAllSymbolsOfAPair");
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
| **markPriceOfAllSymbolsOfAPairRequest** | [**MarkPriceOfAllSymbolsOfAPairRequest**](MarkPriceOfAllSymbolsOfAPairRequest.md)|  | |

### Return type

[**MarkPriceOfAllSymbolsOfAPairResponse**](MarkPriceOfAllSymbolsOfAPairResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Mark Price of All Symbols of a Pair |  -  |

<a id="markPriceStream"></a>
# **markPriceStream**
> MarkPriceStreamResponse markPriceStream(markPriceStreamRequest)

Mark Price Stream

Mark price update stream  &gt; **After CM migration**, the payload is appended with a new &#x60;st&#x60; field (&#x60;1&#x60; &#x3D; UM, &#x60;2&#x60; &#x3D; CM); both &#x60;fstream&#x60; and &#x60;dstream&#x60; may subscribe to either UM or CM symbols on this stream.  Update Speed: 3000ms OR 1000ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    MarkPriceStreamRequest markPriceStreamRequest = new MarkPriceStreamRequest(); // MarkPriceStreamRequest | 
    try {
      MarkPriceStreamResponse result = apiInstance.markPriceStream(markPriceStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#markPriceStream");
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
| **markPriceStreamRequest** | [**MarkPriceStreamRequest**](MarkPriceStreamRequest.md)|  | |

### Return type

[**MarkPriceStreamResponse**](MarkPriceStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Mark Price Stream |  -  |

<a id="marketLiquidationOrderStreams"></a>
# **marketLiquidationOrderStreams**
> MarketLiquidationOrderStreamsResponse marketLiquidationOrderStreams(marketLiquidationOrderStreamsRequest)

Market Liquidation Order Streams

The Liquidation Order Snapshot Streams push force liquidation order information for specific symbol. For each symbol，only the latest one liquidation order within 1000ms will be pushed as the snapshot. If no liquidation happens in the interval of 1000ms, no stream will be pushed.  Update Speed: 1000ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    MarketLiquidationOrderStreamsRequest marketLiquidationOrderStreamsRequest = new MarketLiquidationOrderStreamsRequest(); // MarketLiquidationOrderStreamsRequest | 
    try {
      MarketLiquidationOrderStreamsResponse result = apiInstance.marketLiquidationOrderStreams(marketLiquidationOrderStreamsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#marketLiquidationOrderStreams");
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
| **marketLiquidationOrderStreamsRequest** | [**MarketLiquidationOrderStreamsRequest**](MarketLiquidationOrderStreamsRequest.md)|  | |

### Return type

[**MarketLiquidationOrderStreamsResponse**](MarketLiquidationOrderStreamsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Liquidation Order Streams |  -  |

<a id="partialBookDepthStreams"></a>
# **partialBookDepthStreams**
> PartialBookDepthStreamsResponse partialBookDepthStreams(partialBookDepthStreamsRequest)

Partial Book Depth Streams

Top levels bids and asks.  &gt; **After CM migration**, the payload is appended with a new &#x60;st&#x60; field (&#x60;1&#x60; &#x3D; UM, &#x60;2&#x60; &#x3D; CM).  Update Speed: 250ms, 500ms or 100ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    PartialBookDepthStreamsRequest partialBookDepthStreamsRequest = new PartialBookDepthStreamsRequest(); // PartialBookDepthStreamsRequest | 
    try {
      PartialBookDepthStreamsResponse result = apiInstance.partialBookDepthStreams(partialBookDepthStreamsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#partialBookDepthStreams");
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
| **partialBookDepthStreamsRequest** | [**PartialBookDepthStreamsRequest**](PartialBookDepthStreamsRequest.md)|  | |

### Return type

[**PartialBookDepthStreamsResponse**](PartialBookDepthStreamsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Partial Book Depth Streams |  -  |

