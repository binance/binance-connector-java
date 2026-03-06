# PublicApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**diffBookDepthStreams**](PublicApi.md#diffBookDepthStreams) | **POST** /&lt;symbol&gt;@depth@&lt;updateSpeed&gt; | Diff Book Depth Streams |
| [**individualSymbolBookTickerStreams**](PublicApi.md#individualSymbolBookTickerStreams) | **POST** /&lt;symbol&gt;@bookTicker | Individual Symbol Book Ticker Streams |
| [**partialBookDepthStreams**](PublicApi.md#partialBookDepthStreams) | **POST** /&lt;symbol&gt;@depth&lt;level&gt;@&lt;updateSpeed&gt; | Partial Book Depth Streams |
| [**ticker24Hour**](PublicApi.md#ticker24Hour) | **POST** /&lt;symbol&gt;@optionTicker | 24-hour TICKER |
| [**tradeStreams**](PublicApi.md#tradeStreams) | **POST** /&lt;symbol&gt;@optionTrade | Trade Streams |


<a id="diffBookDepthStreams"></a>
# **diffBookDepthStreams**
> DiffBookDepthStreamsResponse diffBookDepthStreams(diffBookDepthStreamsRequest)

Diff Book Depth Streams

Bids and asks, pushed every 500 milliseconds, 100 milliseconds (if existing)  Update Speed: 100ms or 500ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PublicApi apiInstance = new PublicApi(defaultClient);
    DiffBookDepthStreamsRequest diffBookDepthStreamsRequest = new DiffBookDepthStreamsRequest(); // DiffBookDepthStreamsRequest | 
    try {
      DiffBookDepthStreamsResponse result = apiInstance.diffBookDepthStreams(diffBookDepthStreamsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#diffBookDepthStreams");
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
| **200** | Diff Book Depth Streams |  -  |

<a id="individualSymbolBookTickerStreams"></a>
# **individualSymbolBookTickerStreams**
> IndividualSymbolBookTickerStreamsResponse individualSymbolBookTickerStreams(individualSymbolBookTickerStreamsRequest)

Individual Symbol Book Ticker Streams

Pushes any update to the best bid or ask&#39;s price or quantity in real-time for a specified symbol.  Update Speed: Real-Time

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PublicApi apiInstance = new PublicApi(defaultClient);
    IndividualSymbolBookTickerStreamsRequest individualSymbolBookTickerStreamsRequest = new IndividualSymbolBookTickerStreamsRequest(); // IndividualSymbolBookTickerStreamsRequest | 
    try {
      IndividualSymbolBookTickerStreamsResponse result = apiInstance.individualSymbolBookTickerStreams(individualSymbolBookTickerStreamsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#individualSymbolBookTickerStreams");
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

<a id="partialBookDepthStreams"></a>
# **partialBookDepthStreams**
> PartialBookDepthStreamsResponse partialBookDepthStreams(partialBookDepthStreamsRequest)

Partial Book Depth Streams

Top **&lt;levels\\&gt;** bids and asks, Valid levels are **&lt;levels\\&gt;** are 5, 10, 20.  Update Speed: 100ms or 500ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PublicApi apiInstance = new PublicApi(defaultClient);
    PartialBookDepthStreamsRequest partialBookDepthStreamsRequest = new PartialBookDepthStreamsRequest(); // PartialBookDepthStreamsRequest | 
    try {
      PartialBookDepthStreamsResponse result = apiInstance.partialBookDepthStreams(partialBookDepthStreamsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#partialBookDepthStreams");
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
import com.binance.connector.client.derivatives_trading_options.websocket.stream.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PublicApi apiInstance = new PublicApi(defaultClient);
    Ticker24HourRequest ticker24HourRequest = new Ticker24HourRequest(); // Ticker24HourRequest | 
    try {
      Ticker24HourResponse result = apiInstance.ticker24Hour(ticker24HourRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#ticker24Hour");
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

<a id="tradeStreams"></a>
# **tradeStreams**
> TradeStreamsResponse tradeStreams(tradeStreamsRequest)

Trade Streams

The Trade Streams push raw trade information for specific symbol or underlying asset. E.g.[btcusdt@optionTrade](wss://fstream.binance.com/public/stream?streams&#x3D;btcusdt@optionTrade)  Update Speed: 50ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PublicApi apiInstance = new PublicApi(defaultClient);
    TradeStreamsRequest tradeStreamsRequest = new TradeStreamsRequest(); // TradeStreamsRequest | 
    try {
      TradeStreamsResponse result = apiInstance.tradeStreams(tradeStreamsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#tradeStreams");
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

