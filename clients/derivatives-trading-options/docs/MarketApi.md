# MarketApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPriceStreams**](MarketApi.md#indexPriceStreams) | **POST** /!index@arr | Index Price Streams |
| [**klineCandlestickStreams**](MarketApi.md#klineCandlestickStreams) | **POST** /&lt;symbol&gt;@kline_&lt;interval&gt; | Kline/Candlestick Streams |
| [**markPrice**](MarketApi.md#markPrice) | **POST** /&lt;underlying&gt;@optionMarkPrice | Mark Price |
| [**newSymbolInfo**](MarketApi.md#newSymbolInfo) | **POST** /!optionSymbol | New Symbol Info |
| [**openInterest**](MarketApi.md#openInterest) | **POST** /underlying@optionOpenInterest@&lt;expirationDate&gt; | Open Interest |


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
import com.binance.connector.client.derivatives_trading_options.websocket.stream.api.MarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketApi apiInstance = new MarketApi(defaultClient);
    IndexPriceStreamsRequest indexPriceStreamsRequest = new IndexPriceStreamsRequest(); // IndexPriceStreamsRequest | 
    try {
      IndexPriceStreamsResponse result = apiInstance.indexPriceStreams(indexPriceStreamsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#indexPriceStreams");
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
import com.binance.connector.client.derivatives_trading_options.websocket.stream.api.MarketApi;

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

<a id="markPrice"></a>
# **markPrice**
> MarkPriceResponse markPrice(markPriceRequest)

Mark Price

The mark price for all option symbols on specific underlying asset. E.g.[btcusdt@optionMarkPrice](wss://fstream.binance.com/market/stream?streams&#x3D;btcusdt@optionMarkPrice)  Update Speed: 1000ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.api.MarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketApi apiInstance = new MarketApi(defaultClient);
    MarkPriceRequest markPriceRequest = new MarkPriceRequest(); // MarkPriceRequest | 
    try {
      MarkPriceResponse result = apiInstance.markPrice(markPriceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#markPrice");
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
import com.binance.connector.client.derivatives_trading_options.websocket.stream.api.MarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketApi apiInstance = new MarketApi(defaultClient);
    NewSymbolInfoRequest newSymbolInfoRequest = new NewSymbolInfoRequest(); // NewSymbolInfoRequest | 
    try {
      NewSymbolInfoResponse result = apiInstance.newSymbolInfo(newSymbolInfoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#newSymbolInfo");
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

Option open interest for specific underlying asset on specific expiration date. E.g.[ethusdt@openInterest@221125](wss://fstream.binance.com/market/stream?streams&#x3D;ethusdt@openInterest@221125)  Update Speed: 60s

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.api.MarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketApi apiInstance = new MarketApi(defaultClient);
    OpenInterestRequest openInterestRequest = new OpenInterestRequest(); // OpenInterestRequest | 
    try {
      OpenInterestResponse result = apiInstance.openInterest(openInterestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketApi#openInterest");
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

