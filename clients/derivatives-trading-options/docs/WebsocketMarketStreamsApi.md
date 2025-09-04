# WebsocketMarketStreamsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPriceStreams**](WebsocketMarketStreamsApi.md#indexPriceStreams) | **POST** /&lt;symbol&gt;@index | Index Price Streams |
| [**klineCandlestickStreams**](WebsocketMarketStreamsApi.md#klineCandlestickStreams) | **POST** /&lt;symbol&gt;@kline_&lt;interval&gt; | Kline/Candlestick Streams |
| [**markPrice**](WebsocketMarketStreamsApi.md#markPrice) | **POST** /&lt;underlyingAsset&gt;@markPrice | Mark Price |
| [**newSymbolInfo**](WebsocketMarketStreamsApi.md#newSymbolInfo) | **POST** /option_pair | New Symbol Info |
| [**openInterest**](WebsocketMarketStreamsApi.md#openInterest) | **POST** /&lt;underlyingAsset&gt;@openInterest@&lt;expirationDate&gt; | Open Interest |
| [**partialBookDepthStreams**](WebsocketMarketStreamsApi.md#partialBookDepthStreams) | **POST** /&lt;symbol&gt;@depth&lt;levels&gt;@&lt;updateSpeed&gt; | Partial Book Depth Streams |
| [**ticker24Hour**](WebsocketMarketStreamsApi.md#ticker24Hour) | **POST** /&lt;symbol&gt;@ticker | 24-hour TICKER |
| [**ticker24HourByUnderlyingAssetAndExpirationData**](WebsocketMarketStreamsApi.md#ticker24HourByUnderlyingAssetAndExpirationData) | **POST** /&lt;underlyingAsset&gt;@ticker@&lt;expirationDate&gt; | 24-hour TICKER by underlying asset and expiration data |
| [**tradeStreams**](WebsocketMarketStreamsApi.md#tradeStreams) | **POST** /&lt;symbol&gt;@trade | Trade Streams |


<a id="indexPriceStreams"></a>
# **indexPriceStreams**
> IndexPriceStreamsResponse indexPriceStreams(indexPriceStreamsRequest)

Index Price Streams

Underlying(e.g ETHUSDT) index stream.  Update Speed: 1000ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.api.WebsocketMarketStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebsocketMarketStreamsApi apiInstance = new WebsocketMarketStreamsApi(defaultClient);
    IndexPriceStreamsRequest indexPriceStreamsRequest = new IndexPriceStreamsRequest(); // IndexPriceStreamsRequest | 
    try {
      IndexPriceStreamsResponse result = apiInstance.indexPriceStreams(indexPriceStreamsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebsocketMarketStreamsApi#indexPriceStreams");
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
| **indexPriceStreamsRequest** | [**IndexPriceStreamsRequest**](IndexPriceStreamsRequest.md)|  | |

### Return type

[**IndexPriceStreamsResponse**](IndexPriceStreamsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Index Price Streams |  -  |

<a id="klineCandlestickStreams"></a>
# **klineCandlestickStreams**
> KlineCandlestickStreamsResponse klineCandlestickStreams(klineCandlestickStreamsRequest)

Kline/Candlestick Streams

The Kline/Candlestick Stream push updates to the current klines/candlestick every 1000 milliseconds (if existing).  Update Speed: 1000ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.api.WebsocketMarketStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebsocketMarketStreamsApi apiInstance = new WebsocketMarketStreamsApi(defaultClient);
    KlineCandlestickStreamsRequest klineCandlestickStreamsRequest = new KlineCandlestickStreamsRequest(); // KlineCandlestickStreamsRequest | 
    try {
      KlineCandlestickStreamsResponse result = apiInstance.klineCandlestickStreams(klineCandlestickStreamsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebsocketMarketStreamsApi#klineCandlestickStreams");
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

<a id="markPrice"></a>
# **markPrice**
> MarkPriceResponse markPrice(markPriceRequest)

Mark Price

The mark price for all option symbols on specific underlying asset. E.g.[ETH@markPrice](wss://nbstream.binance.com/eoptions/stream?streams&#x3D;ETH@markPrice)  Update Speed: 1000ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.api.WebsocketMarketStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebsocketMarketStreamsApi apiInstance = new WebsocketMarketStreamsApi(defaultClient);
    MarkPriceRequest markPriceRequest = new MarkPriceRequest(); // MarkPriceRequest | 
    try {
      MarkPriceResponse result = apiInstance.markPrice(markPriceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebsocketMarketStreamsApi#markPrice");
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
| **markPriceRequest** | [**MarkPriceRequest**](MarkPriceRequest.md)|  | |

### Return type

[**MarkPriceResponse**](MarkPriceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Mark Price |  -  |

<a id="newSymbolInfo"></a>
# **newSymbolInfo**
> NewSymbolInfoResponse newSymbolInfo(newSymbolInfoRequest)

New Symbol Info

New symbol listing stream.  Update Speed: 50ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.api.WebsocketMarketStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebsocketMarketStreamsApi apiInstance = new WebsocketMarketStreamsApi(defaultClient);
    NewSymbolInfoRequest newSymbolInfoRequest = new NewSymbolInfoRequest(); // NewSymbolInfoRequest | 
    try {
      NewSymbolInfoResponse result = apiInstance.newSymbolInfo(newSymbolInfoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebsocketMarketStreamsApi#newSymbolInfo");
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
| **newSymbolInfoRequest** | [**NewSymbolInfoRequest**](NewSymbolInfoRequest.md)|  | |

### Return type

[**NewSymbolInfoResponse**](NewSymbolInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | New Symbol Info |  -  |

<a id="openInterest"></a>
# **openInterest**
> OpenInterestResponse openInterest(openInterestRequest)

Open Interest

Option open interest for specific underlying asset on specific expiration date. E.g.[ETH@openInterest@221125](wss://nbstream.binance.com/eoptions/stream?streams&#x3D;ETH@openInterest@221125)  Update Speed: 60s

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.api.WebsocketMarketStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebsocketMarketStreamsApi apiInstance = new WebsocketMarketStreamsApi(defaultClient);
    OpenInterestRequest openInterestRequest = new OpenInterestRequest(); // OpenInterestRequest | 
    try {
      OpenInterestResponse result = apiInstance.openInterest(openInterestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebsocketMarketStreamsApi#openInterest");
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
| **openInterestRequest** | [**OpenInterestRequest**](OpenInterestRequest.md)|  | |

### Return type

[**OpenInterestResponse**](OpenInterestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Open Interest |  -  |

<a id="partialBookDepthStreams"></a>
# **partialBookDepthStreams**
> PartialBookDepthStreamsResponse partialBookDepthStreams(partialBookDepthStreamsRequest)

Partial Book Depth Streams

Top **&lt;levels\\&gt;** bids and asks, Valid levels are **&lt;levels\\&gt;** are 10, 20, 50, 100.  Update Speed: 100ms or 1000ms, 500ms(default when update speed isn&#39;t used)

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.api.WebsocketMarketStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebsocketMarketStreamsApi apiInstance = new WebsocketMarketStreamsApi(defaultClient);
    PartialBookDepthStreamsRequest partialBookDepthStreamsRequest = new PartialBookDepthStreamsRequest(); // PartialBookDepthStreamsRequest | 
    try {
      PartialBookDepthStreamsResponse result = apiInstance.partialBookDepthStreams(partialBookDepthStreamsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebsocketMarketStreamsApi#partialBookDepthStreams");
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

<a id="ticker24Hour"></a>
# **ticker24Hour**
> Ticker24HourResponse ticker24Hour(ticker24HourRequest)

24-hour TICKER

24hr ticker info for all symbols. Only symbols whose ticker info changed will be sent.  Update Speed: 1000ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.api.WebsocketMarketStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebsocketMarketStreamsApi apiInstance = new WebsocketMarketStreamsApi(defaultClient);
    Ticker24HourRequest ticker24HourRequest = new Ticker24HourRequest(); // Ticker24HourRequest | 
    try {
      Ticker24HourResponse result = apiInstance.ticker24Hour(ticker24HourRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebsocketMarketStreamsApi#ticker24Hour");
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
| **ticker24HourRequest** | [**Ticker24HourRequest**](Ticker24HourRequest.md)|  | |

### Return type

[**Ticker24HourResponse**](Ticker24HourResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 24-hour TICKER |  -  |

<a id="ticker24HourByUnderlyingAssetAndExpirationData"></a>
# **ticker24HourByUnderlyingAssetAndExpirationData**
> Ticker24HourByUnderlyingAssetAndExpirationDataResponse ticker24HourByUnderlyingAssetAndExpirationData(ticker24HourByUnderlyingAssetAndExpirationDataRequest)

24-hour TICKER by underlying asset and expiration data

24hr ticker info by underlying asset and expiration date. E.g.[ETH@ticker@220930](wss://nbstream.binance.com/eoptions/stream?streams&#x3D;ETH@ticker@220930)  Update Speed: 1000ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.api.WebsocketMarketStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebsocketMarketStreamsApi apiInstance = new WebsocketMarketStreamsApi(defaultClient);
    Ticker24HourByUnderlyingAssetAndExpirationDataRequest ticker24HourByUnderlyingAssetAndExpirationDataRequest = new Ticker24HourByUnderlyingAssetAndExpirationDataRequest(); // Ticker24HourByUnderlyingAssetAndExpirationDataRequest | 
    try {
      Ticker24HourByUnderlyingAssetAndExpirationDataResponse result = apiInstance.ticker24HourByUnderlyingAssetAndExpirationData(ticker24HourByUnderlyingAssetAndExpirationDataRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebsocketMarketStreamsApi#ticker24HourByUnderlyingAssetAndExpirationData");
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
| **ticker24HourByUnderlyingAssetAndExpirationDataRequest** | [**Ticker24HourByUnderlyingAssetAndExpirationDataRequest**](Ticker24HourByUnderlyingAssetAndExpirationDataRequest.md)|  | |

### Return type

[**Ticker24HourByUnderlyingAssetAndExpirationDataResponse**](Ticker24HourByUnderlyingAssetAndExpirationDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 24-hour TICKER by underlying asset and expiration data |  -  |

<a id="tradeStreams"></a>
# **tradeStreams**
> TradeStreamsResponse tradeStreams(tradeStreamsRequest)

Trade Streams

The Trade Streams push raw trade information for specific symbol or underlying asset. E.g.[ETH@trade](wss://nbstream.binance.com/eoptions/stream?streams&#x3D;ETH@trade)  Update Speed: 50ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.api.WebsocketMarketStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WebsocketMarketStreamsApi apiInstance = new WebsocketMarketStreamsApi(defaultClient);
    TradeStreamsRequest tradeStreamsRequest = new TradeStreamsRequest(); // TradeStreamsRequest | 
    try {
      TradeStreamsResponse result = apiInstance.tradeStreams(tradeStreamsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebsocketMarketStreamsApi#tradeStreams");
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
| **tradeStreamsRequest** | [**TradeStreamsRequest**](TradeStreamsRequest.md)|  | |

### Return type

[**TradeStreamsResponse**](TradeStreamsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Trade Streams |  -  |

