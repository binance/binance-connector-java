# MarketApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aggregateTradeStreams**](MarketApi.md#aggregateTradeStreams) | **POST** /&lt;symbol&gt;@aggTrade | Aggregate Trade Streams |
| [**allMarketLiquidationOrderStreams**](MarketApi.md#allMarketLiquidationOrderStreams) | **POST** /!forceOrder@arr | All Market Liquidation Order Streams |
| [**allMarketMiniTickersStream**](MarketApi.md#allMarketMiniTickersStream) | **POST** /!miniTicker@arr | All Market Mini Tickers Stream |
| [**allMarketTickersStreams**](MarketApi.md#allMarketTickersStreams) | **POST** /!ticker@arr | All Market Tickers Streams |
| [**compositeIndexSymbolInformationStreams**](MarketApi.md#compositeIndexSymbolInformationStreams) | **POST** /&lt;symbol&gt;@compositeIndex | Composite Index Symbol Information Streams |
| [**continuousContractKlineCandlestickStreams**](MarketApi.md#continuousContractKlineCandlestickStreams) | **POST** /&lt;pair&gt;_&lt;contractType&gt;@continuousKline_&lt;interval&gt; | Continuous Contract Kline/Candlestick Streams |
| [**contractInfoStream**](MarketApi.md#contractInfoStream) | **POST** /!contractInfo | Contract Info Stream |
| [**individualSymbolMiniTickerStream**](MarketApi.md#individualSymbolMiniTickerStream) | **POST** /&lt;symbol&gt;@miniTicker | Individual Symbol Mini Ticker Stream |
| [**individualSymbolTickerStreams**](MarketApi.md#individualSymbolTickerStreams) | **POST** /&lt;symbol&gt;@ticker | Individual Symbol Ticker Streams |
| [**klineCandlestickStreams**](MarketApi.md#klineCandlestickStreams) | **POST** /&lt;symbol&gt;@kline_&lt;interval&gt; | Kline/Candlestick Streams |
| [**liquidationOrderStreams**](MarketApi.md#liquidationOrderStreams) | **POST** /&lt;symbol&gt;@forceOrder | Liquidation Order Streams |
| [**markPriceStream**](MarketApi.md#markPriceStream) | **POST** /&lt;symbol&gt;@markPrice@&lt;updateSpeed&gt; | Mark Price Stream |
| [**markPriceStreamForAllMarket**](MarketApi.md#markPriceStreamForAllMarket) | **POST** /!markPrice@arr@&lt;updateSpeed&gt; | Mark Price Stream for All market |
| [**multiAssetsModeAssetIndex**](MarketApi.md#multiAssetsModeAssetIndex) | **POST** /!assetIndex@arr | Multi-Assets Mode Asset Index |
| [**tradingSessionStream**](MarketApi.md#tradingSessionStream) | **POST** /tradingSession | Trading Session Stream |


<a id="aggregateTradeStreams"></a>
# **aggregateTradeStreams**
> AggregateTradeStreamsResponse aggregateTradeStreams(aggregateTradeStreamsRequest)

Aggregate Trade Streams

The Aggregate Trade Streams push market trade information that is aggregated for fills with same price and taking side every 100 milliseconds. Only market trades will be aggregated, which means the insurance fund trades and ADL trades won&#39;t be aggregated.  Retail Price Improvement(RPI) orders are aggregated into field &#x60;q&#x60; and without special tags to be distinguished.  Update Speed: 100ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.MarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketApi apiInstance = new MarketApi(defaultClient);
    AggregateTradeStreamsRequest aggregateTradeStreamsRequest = new AggregateTradeStreamsRequest(); // AggregateTradeStreamsRequest | 
    try {
      AggregateTradeStreamsResponse result = apiInstance.aggregateTradeStreams(aggregateTradeStreamsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#aggregateTradeStreams");
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

<a id="allMarketLiquidationOrderStreams"></a>
# **allMarketLiquidationOrderStreams**
> AllMarketLiquidationOrderStreamsResponse allMarketLiquidationOrderStreams(allMarketLiquidationOrderStreamsRequest)

All Market Liquidation Order Streams

The All Liquidation Order Snapshot Streams push force liquidation order information for all symbols in the market. For each symbol，only the latest one liquidation order within 1000ms will be pushed as the snapshot. If no liquidation happens in the interval of 1000ms, no stream will be pushed.  Update Speed: 1000ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.MarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketApi apiInstance = new MarketApi(defaultClient);
    AllMarketLiquidationOrderStreamsRequest allMarketLiquidationOrderStreamsRequest = new AllMarketLiquidationOrderStreamsRequest(); // AllMarketLiquidationOrderStreamsRequest | 
    try {
      AllMarketLiquidationOrderStreamsResponse result = apiInstance.allMarketLiquidationOrderStreams(allMarketLiquidationOrderStreamsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#allMarketLiquidationOrderStreams");
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

24hr rolling window mini-ticker statistics for all symbols. These are NOT the statistics of the UTC day, but a 24hr rolling window from requestTime to 24hrs before. Note that only tickers that have changed will be present in the array.  Update Speed: 1000ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.MarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketApi apiInstance = new MarketApi(defaultClient);
    AllMarketMiniTickersStreamRequest allMarketMiniTickersStreamRequest = new AllMarketMiniTickersStreamRequest(); // AllMarketMiniTickersStreamRequest | 
    try {
      AllMarketMiniTickersStreamResponse result = apiInstance.allMarketMiniTickersStream(allMarketMiniTickersStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#allMarketMiniTickersStream");
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

24hr rolling window ticker statistics for all symbols. These are NOT the statistics of the UTC day, but a 24hr rolling window from requestTime to 24hrs before. Note that only tickers that have changed will be present in the array.  Update Speed: 1000ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.MarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketApi apiInstance = new MarketApi(defaultClient);
    AllMarketTickersStreamsRequest allMarketTickersStreamsRequest = new AllMarketTickersStreamsRequest(); // AllMarketTickersStreamsRequest | 
    try {
      AllMarketTickersStreamsResponse result = apiInstance.allMarketTickersStreams(allMarketTickersStreamsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#allMarketTickersStreams");
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

<a id="compositeIndexSymbolInformationStreams"></a>
# **compositeIndexSymbolInformationStreams**
> CompositeIndexSymbolInformationStreamsResponse compositeIndexSymbolInformationStreams(compositeIndexSymbolInformationStreamsRequest)

Composite Index Symbol Information Streams

Composite index information for index symbols pushed every second.  Update Speed: 1000ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.MarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketApi apiInstance = new MarketApi(defaultClient);
    CompositeIndexSymbolInformationStreamsRequest compositeIndexSymbolInformationStreamsRequest = new CompositeIndexSymbolInformationStreamsRequest(); // CompositeIndexSymbolInformationStreamsRequest | 
    try {
      CompositeIndexSymbolInformationStreamsResponse result = apiInstance.compositeIndexSymbolInformationStreams(compositeIndexSymbolInformationStreamsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#compositeIndexSymbolInformationStreams");
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
| **compositeIndexSymbolInformationStreamsRequest** | [**CompositeIndexSymbolInformationStreamsRequest**](CompositeIndexSymbolInformationStreamsRequest.md)|  | |

### Return type

[**CompositeIndexSymbolInformationStreamsResponse**](CompositeIndexSymbolInformationStreamsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Composite Index Symbol Information Streams |  -  |

<a id="continuousContractKlineCandlestickStreams"></a>
# **continuousContractKlineCandlestickStreams**
> ContinuousContractKlineCandlestickStreamsResponse continuousContractKlineCandlestickStreams(continuousContractKlineCandlestickStreamsRequest)

Continuous Contract Kline/Candlestick Streams

 Update Speed: 250ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.MarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketApi apiInstance = new MarketApi(defaultClient);
    ContinuousContractKlineCandlestickStreamsRequest continuousContractKlineCandlestickStreamsRequest = new ContinuousContractKlineCandlestickStreamsRequest(); // ContinuousContractKlineCandlestickStreamsRequest | 
    try {
      ContinuousContractKlineCandlestickStreamsResponse result = apiInstance.continuousContractKlineCandlestickStreams(continuousContractKlineCandlestickStreamsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#continuousContractKlineCandlestickStreams");
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

ContractInfo stream pushes when contract info updates(listing/settlement/contract bracket update). &#x60;bks&#x60; field only shows up when bracket gets updated.  Update Speed: Real-time

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.MarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketApi apiInstance = new MarketApi(defaultClient);
    ContractInfoStreamRequest contractInfoStreamRequest = new ContractInfoStreamRequest(); // ContractInfoStreamRequest | 
    try {
      ContractInfoStreamResponse result = apiInstance.contractInfoStream(contractInfoStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#contractInfoStream");
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

<a id="individualSymbolMiniTickerStream"></a>
# **individualSymbolMiniTickerStream**
> IndividualSymbolMiniTickerStreamResponse individualSymbolMiniTickerStream(individualSymbolMiniTickerStreamRequest)

Individual Symbol Mini Ticker Stream

24hr rolling window mini-ticker statistics for a single symbol. These are NOT the statistics of the UTC day, but a 24hr rolling window from requestTime to 24hrs before.  Update Speed: 2s

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.MarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketApi apiInstance = new MarketApi(defaultClient);
    IndividualSymbolMiniTickerStreamRequest individualSymbolMiniTickerStreamRequest = new IndividualSymbolMiniTickerStreamRequest(); // IndividualSymbolMiniTickerStreamRequest | 
    try {
      IndividualSymbolMiniTickerStreamResponse result = apiInstance.individualSymbolMiniTickerStream(individualSymbolMiniTickerStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#individualSymbolMiniTickerStream");
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

24hr rolling window ticker statistics for a single symbol. These are NOT the statistics of the UTC day, but a 24hr rolling window from requestTime to 24hrs before.  Update Speed: 2000ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.MarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketApi apiInstance = new MarketApi(defaultClient);
    IndividualSymbolTickerStreamsRequest individualSymbolTickerStreamsRequest = new IndividualSymbolTickerStreamsRequest(); // IndividualSymbolTickerStreamsRequest | 
    try {
      IndividualSymbolTickerStreamsResponse result = apiInstance.individualSymbolTickerStreams(individualSymbolTickerStreamsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#individualSymbolTickerStreams");
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

The Kline/Candlestick Stream push updates to the current klines/candlestick every 250 milliseconds (if existing).  Update Speed: 250ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.MarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketApi apiInstance = new MarketApi(defaultClient);
    KlineCandlestickStreamsRequest klineCandlestickStreamsRequest = new KlineCandlestickStreamsRequest(); // KlineCandlestickStreamsRequest | 
    try {
      KlineCandlestickStreamsResponse result = apiInstance.klineCandlestickStreams(klineCandlestickStreamsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#klineCandlestickStreams");
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

<a id="liquidationOrderStreams"></a>
# **liquidationOrderStreams**
> LiquidationOrderStreamsResponse liquidationOrderStreams(liquidationOrderStreamsRequest)

Liquidation Order Streams

The Liquidation Order Snapshot Streams push force liquidation order information for specific symbol. For each symbol，only the latest one liquidation order within 1000ms will be pushed as the snapshot. If no liquidation happens in the interval of 1000ms, no stream will be pushed.  Update Speed: 1000ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.MarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketApi apiInstance = new MarketApi(defaultClient);
    LiquidationOrderStreamsRequest liquidationOrderStreamsRequest = new LiquidationOrderStreamsRequest(); // LiquidationOrderStreamsRequest | 
    try {
      LiquidationOrderStreamsResponse result = apiInstance.liquidationOrderStreams(liquidationOrderStreamsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#liquidationOrderStreams");
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
| **liquidationOrderStreamsRequest** | [**LiquidationOrderStreamsRequest**](LiquidationOrderStreamsRequest.md)|  | |

### Return type

[**LiquidationOrderStreamsResponse**](LiquidationOrderStreamsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Liquidation Order Streams |  -  |

<a id="markPriceStream"></a>
# **markPriceStream**
> MarkPriceStreamResponse markPriceStream(markPriceStreamRequest)

Mark Price Stream

Mark price and funding rate for a single symbol pushed every 3 seconds or every second.  Update Speed: 3000ms or 1000ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.MarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketApi apiInstance = new MarketApi(defaultClient);
    MarkPriceStreamRequest markPriceStreamRequest = new MarkPriceStreamRequest(); // MarkPriceStreamRequest | 
    try {
      MarkPriceStreamResponse result = apiInstance.markPriceStream(markPriceStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#markPriceStream");
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

<a id="markPriceStreamForAllMarket"></a>
# **markPriceStreamForAllMarket**
> MarkPriceStreamForAllMarketResponse markPriceStreamForAllMarket(markPriceStreamForAllMarketRequest)

Mark Price Stream for All market

Mark price and funding rate for all symbols pushed every 3 seconds or every second.  **Note**:  TradFi symbols will be pushed through a seperate message.  Update Speed: 3000ms or 1000ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.MarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketApi apiInstance = new MarketApi(defaultClient);
    MarkPriceStreamForAllMarketRequest markPriceStreamForAllMarketRequest = new MarkPriceStreamForAllMarketRequest(); // MarkPriceStreamForAllMarketRequest | 
    try {
      MarkPriceStreamForAllMarketResponse result = apiInstance.markPriceStreamForAllMarket(markPriceStreamForAllMarketRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#markPriceStreamForAllMarket");
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
| **markPriceStreamForAllMarketRequest** | [**MarkPriceStreamForAllMarketRequest**](MarkPriceStreamForAllMarketRequest.md)|  | |

### Return type

[**MarkPriceStreamForAllMarketResponse**](MarkPriceStreamForAllMarketResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Mark Price Stream for All market |  -  |

<a id="multiAssetsModeAssetIndex"></a>
# **multiAssetsModeAssetIndex**
> MultiAssetsModeAssetIndexResponse multiAssetsModeAssetIndex(multiAssetsModeAssetIndexRequest)

Multi-Assets Mode Asset Index

Asset index for multi-assets mode user  Update Speed: 1s

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.MarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketApi apiInstance = new MarketApi(defaultClient);
    MultiAssetsModeAssetIndexRequest multiAssetsModeAssetIndexRequest = new MultiAssetsModeAssetIndexRequest(); // MultiAssetsModeAssetIndexRequest | 
    try {
      MultiAssetsModeAssetIndexResponse result = apiInstance.multiAssetsModeAssetIndex(multiAssetsModeAssetIndexRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#multiAssetsModeAssetIndex");
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
| **multiAssetsModeAssetIndexRequest** | [**MultiAssetsModeAssetIndexRequest**](MultiAssetsModeAssetIndexRequest.md)|  | |

### Return type

[**MultiAssetsModeAssetIndexResponse**](MultiAssetsModeAssetIndexResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Multi-Assets Mode Asset Index |  -  |

<a id="tradingSessionStream"></a>
# **tradingSessionStream**
> TradingSessionStreamResponse tradingSessionStream(tradingSessionStreamRequest)

Trading Session Stream

Trading session information for the underlying assets of TradFi Perpetual contracts—covering the U.S. equity market and the commodity market—is updated every second. Trading session information for different underlying markets is pushed in separate messages. Session types for the equity market include \&quot;PRE_MARKET\&quot;, \&quot;REGULAR\&quot;, \&quot;AFTER_MARKET\&quot;, \&quot;OVERNIGHT\&quot;, and \&quot;NO_TRADING\&quot;. Session types for the commodity market include \&quot;REGULAR\&quot; and \&quot;NO_TRADING\&quot;.  Update Speed: 1s

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.MarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketApi apiInstance = new MarketApi(defaultClient);
    TradingSessionStreamRequest tradingSessionStreamRequest = new TradingSessionStreamRequest(); // TradingSessionStreamRequest | 
    try {
      TradingSessionStreamResponse result = apiInstance.tradingSessionStream(tradingSessionStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#tradingSessionStream");
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
| **tradingSessionStreamRequest** | [**TradingSessionStreamRequest**](TradingSessionStreamRequest.md)|  | |

### Return type

[**TradingSessionStreamResponse**](TradingSessionStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Trading Session Stream |  -  |

