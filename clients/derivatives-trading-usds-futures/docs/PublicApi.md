# PublicApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**allBookTickersStream**](PublicApi.md#allBookTickersStream) | **POST** /!bookTicker | All Book Tickers Stream |
| [**diffBookDepthStreams**](PublicApi.md#diffBookDepthStreams) | **POST** /&lt;symbol&gt;@depth@&lt;updateSpeed&gt; | Diff. Book Depth Streams |
| [**individualSymbolBookTickerStreams**](PublicApi.md#individualSymbolBookTickerStreams) | **POST** /&lt;symbol&gt;@bookTicker | Individual Symbol Book Ticker Streams |
| [**partialBookDepthStreams**](PublicApi.md#partialBookDepthStreams) | **POST** /&lt;symbol&gt;@depth&lt;levels&gt;@&lt;updateSpeed&gt; | Partial Book Depth Streams |
| [**rpiDiffBookDepthStreams**](PublicApi.md#rpiDiffBookDepthStreams) | **POST** /&lt;symbol&gt;@rpiDepth@500ms | RPI Diff. Book Depth Streams |


<a id="allBookTickersStream"></a>
# **allBookTickersStream**
> AllBookTickersStreamResponse allBookTickersStream(allBookTickersStreamRequest)

All Book Tickers Stream

Pushes any update to the best bid or ask&#39;s price or quantity in real-time for all symbols.  Retail Price Improvement(RPI) orders are not visible and excluded in the response message.  Update Speed: 5s

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PublicApi apiInstance = new PublicApi(defaultClient);
    AllBookTickersStreamRequest allBookTickersStreamRequest = new AllBookTickersStreamRequest(); // AllBookTickersStreamRequest | 
    try {
      AllBookTickersStreamResponse result = apiInstance.allBookTickersStream(allBookTickersStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#allBookTickersStream");
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

<a id="diffBookDepthStreams"></a>
# **diffBookDepthStreams**
> DiffBookDepthStreamsResponse diffBookDepthStreams(diffBookDepthStreamsRequest)

Diff. Book Depth Streams

Bids and asks, pushed every 250 milliseconds, 500 milliseconds, 100 milliseconds (if existing)  Retail Price Improvement(RPI) orders are not visible and excluded in the response message.  Update Speed: 250ms, 500ms, 100ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.PublicApi;

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
| **200** | Diff. Book Depth Streams |  -  |

<a id="individualSymbolBookTickerStreams"></a>
# **individualSymbolBookTickerStreams**
> IndividualSymbolBookTickerStreamsResponse individualSymbolBookTickerStreams(individualSymbolBookTickerStreamsRequest)

Individual Symbol Book Ticker Streams

Pushes any update to the best bid or ask&#39;s price or quantity in real-time for a specified symbol.  Retail Price Improvement(RPI) orders are not visible and excluded in the response message.  Update Speed: Real-time

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.PublicApi;

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

Top **&lt;levels\\&gt;** bids and asks, Valid **&lt;levels\\&gt;** are 5, 10, or 20.  Retail Price Improvement(RPI) orders are not visible and excluded in the response message.  Update Speed: 250ms, 500ms or 100ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.PublicApi;

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

<a id="rpiDiffBookDepthStreams"></a>
# **rpiDiffBookDepthStreams**
> RpiDiffBookDepthStreamsResponse rpiDiffBookDepthStreams(rpiDiffBookDepthStreamsRequest)

RPI Diff. Book Depth Streams

Bids and asks including RPI orders, pushed every 500 milliseconds  RPI(Retail Price Improvement) orders are included and aggreated in the response message. When the quantity of a price level to be updated is equal to 0, it means either all quotations for this price have been filled/canceled, or the quantity of crossed RPI orders for this price are hidden  Update Speed: 500ms

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PublicApi apiInstance = new PublicApi(defaultClient);
    RpiDiffBookDepthStreamsRequest rpiDiffBookDepthStreamsRequest = new RpiDiffBookDepthStreamsRequest(); // RpiDiffBookDepthStreamsRequest | 
    try {
      RpiDiffBookDepthStreamsResponse result = apiInstance.rpiDiffBookDepthStreams(rpiDiffBookDepthStreamsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#rpiDiffBookDepthStreams");
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
| **rpiDiffBookDepthStreamsRequest** | [**RpiDiffBookDepthStreamsRequest**](RpiDiffBookDepthStreamsRequest.md)|  | |

### Return type

[**RpiDiffBookDepthStreamsResponse**](RpiDiffBookDepthStreamsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | RPI Diff. Book Depth Streams |  -  |

