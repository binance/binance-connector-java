# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aggregateTradeStream**](DefaultApi.md#aggregateTradeStream) | **POST** /&lt;symbol&gt;@aggTrade | Aggregate Trade Stream |
| [**allBookTickerStream**](DefaultApi.md#allBookTickerStream) | **POST** /!bookTicker | All Book Ticker Stream |
| [**allMiniTickerStream**](DefaultApi.md#allMiniTickerStream) | **POST** /!miniTicker@arr | All Mini Ticker Stream |
| [**allTickerStream**](DefaultApi.md#allTickerStream) | **POST** /!ticker@arr | All Ticker Stream |
| [**allTokens24hTickerStream**](DefaultApi.md#allTokens24hTickerStream) | **POST** /came@allTokens@ticker24 | All Tokens 24h Ticker Stream |
| [**bookTickerStream**](DefaultApi.md#bookTickerStream) | **POST** /&lt;symbol&gt;@bookTicker | Book Ticker Stream |
| [**contractKlineStream**](DefaultApi.md#contractKlineStream) | **POST** /came@&lt;contractAddress&gt;@&lt;chainId&gt;@kline_&lt;interval&gt; | Contract Kline Stream |
| [**fullDepthStream**](DefaultApi.md#fullDepthStream) | **POST** /&lt;symbol&gt;@fulldepth@&lt;interval&gt; | Full Depth Stream |
| [**klineStream**](DefaultApi.md#klineStream) | **POST** /&lt;symbol&gt;@kline_&lt;interval&gt; | Kline Stream |
| [**miniTickerStream**](DefaultApi.md#miniTickerStream) | **POST** /&lt;symbol&gt;@miniTicker | Mini Ticker Stream |
| [**partialDepthStream**](DefaultApi.md#partialDepthStream) | **POST** /&lt;symbol&gt;@depth&lt;levels&gt;@&lt;interval&gt; | Partial Depth Stream |
| [**tickerStream**](DefaultApi.md#tickerStream) | **POST** /&lt;symbol&gt;@ticker | Ticker Stream |
| [**tradeStream**](DefaultApi.md#tradeStream) | **POST** /&lt;symbol&gt;@trade | Trade Stream |


<a id="aggregateTradeStream"></a>
# **aggregateTradeStream**
> AggregateTradeStreamResponse aggregateTradeStream(aggregateTradeStreamRequest)

Aggregate Trade Stream

Pushes aggregate trade updates for a symbol.

### Example
```java
// Import classes:
import com.binance.connector.client.alpha.ApiClient;
import com.binance.connector.client.alpha.ApiException;
import com.binance.connector.client.alpha.Configuration;
import com.binance.connector.client.alpha.models.*;
import com.binance.connector.client.alpha.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    AggregateTradeStreamRequest aggregateTradeStreamRequest = new AggregateTradeStreamRequest(); // AggregateTradeStreamRequest | 
    try {
      AggregateTradeStreamResponse result = apiInstance.aggregateTradeStream(aggregateTradeStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#aggregateTradeStream");
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
| **aggregateTradeStreamRequest** | [**AggregateTradeStreamRequest**](AggregateTradeStreamRequest.md)|  | |

### Return type

[**AggregateTradeStreamResponse**](AggregateTradeStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Aggregate Trade Stream |  -  |

<a id="allBookTickerStream"></a>
# **allBookTickerStream**
> AllBookTickerStreamResponse allBookTickerStream(allBookTickerStreamRequest)

All Book Ticker Stream

Pushes best bid/ask updates for all symbols.

### Example
```java
// Import classes:
import com.binance.connector.client.alpha.ApiClient;
import com.binance.connector.client.alpha.ApiException;
import com.binance.connector.client.alpha.Configuration;
import com.binance.connector.client.alpha.models.*;
import com.binance.connector.client.alpha.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    AllBookTickerStreamRequest allBookTickerStreamRequest = new AllBookTickerStreamRequest(); // AllBookTickerStreamRequest | 
    try {
      AllBookTickerStreamResponse result = apiInstance.allBookTickerStream(allBookTickerStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#allBookTickerStream");
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
| **allBookTickerStreamRequest** | [**AllBookTickerStreamRequest**](AllBookTickerStreamRequest.md)|  | |

### Return type

[**AllBookTickerStreamResponse**](AllBookTickerStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All Book Ticker Stream |  -  |

<a id="allMiniTickerStream"></a>
# **allMiniTickerStream**
> AllMiniTickerStreamResponse allMiniTickerStream(allMiniTickerStreamRequest)

All Mini Ticker Stream

Pushes mini ticker statistics for all symbols.

### Example
```java
// Import classes:
import com.binance.connector.client.alpha.ApiClient;
import com.binance.connector.client.alpha.ApiException;
import com.binance.connector.client.alpha.Configuration;
import com.binance.connector.client.alpha.models.*;
import com.binance.connector.client.alpha.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    AllMiniTickerStreamRequest allMiniTickerStreamRequest = new AllMiniTickerStreamRequest(); // AllMiniTickerStreamRequest | 
    try {
      AllMiniTickerStreamResponse result = apiInstance.allMiniTickerStream(allMiniTickerStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#allMiniTickerStream");
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
| **allMiniTickerStreamRequest** | [**AllMiniTickerStreamRequest**](AllMiniTickerStreamRequest.md)|  | |

### Return type

[**AllMiniTickerStreamResponse**](AllMiniTickerStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All Mini Ticker Stream |  -  |

<a id="allTickerStream"></a>
# **allTickerStream**
> AllTickerStreamResponse allTickerStream(allTickerStreamRequest)

All Ticker Stream

Pushes full ticker statistics for all symbols.

### Example
```java
// Import classes:
import com.binance.connector.client.alpha.ApiClient;
import com.binance.connector.client.alpha.ApiException;
import com.binance.connector.client.alpha.Configuration;
import com.binance.connector.client.alpha.models.*;
import com.binance.connector.client.alpha.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    AllTickerStreamRequest allTickerStreamRequest = new AllTickerStreamRequest(); // AllTickerStreamRequest | 
    try {
      AllTickerStreamResponse result = apiInstance.allTickerStream(allTickerStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#allTickerStream");
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
| **allTickerStreamRequest** | [**AllTickerStreamRequest**](AllTickerStreamRequest.md)|  | |

### Return type

[**AllTickerStreamResponse**](AllTickerStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All Ticker Stream |  -  |

<a id="allTokens24hTickerStream"></a>
# **allTokens24hTickerStream**
> AllTokens24hTickerStreamResponse allTokens24hTickerStream(allTokens24hTickerStreamRequest)

All Tokens 24h Ticker Stream

Pushes 24h ticker-like metrics for all tokens.

### Example
```java
// Import classes:
import com.binance.connector.client.alpha.ApiClient;
import com.binance.connector.client.alpha.ApiException;
import com.binance.connector.client.alpha.Configuration;
import com.binance.connector.client.alpha.models.*;
import com.binance.connector.client.alpha.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    AllTokens24hTickerStreamRequest allTokens24hTickerStreamRequest = new AllTokens24hTickerStreamRequest(); // AllTokens24hTickerStreamRequest | 
    try {
      AllTokens24hTickerStreamResponse result = apiInstance.allTokens24hTickerStream(allTokens24hTickerStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#allTokens24hTickerStream");
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
| **allTokens24hTickerStreamRequest** | [**AllTokens24hTickerStreamRequest**](AllTokens24hTickerStreamRequest.md)|  | |

### Return type

[**AllTokens24hTickerStreamResponse**](AllTokens24hTickerStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All Tokens 24h Ticker Stream |  -  |

<a id="bookTickerStream"></a>
# **bookTickerStream**
> BookTickerStreamResponse bookTickerStream(bookTickerStreamRequest)

Book Ticker Stream

Pushes best bid/ask updates for a symbol.

### Example
```java
// Import classes:
import com.binance.connector.client.alpha.ApiClient;
import com.binance.connector.client.alpha.ApiException;
import com.binance.connector.client.alpha.Configuration;
import com.binance.connector.client.alpha.models.*;
import com.binance.connector.client.alpha.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    BookTickerStreamRequest bookTickerStreamRequest = new BookTickerStreamRequest(); // BookTickerStreamRequest | 
    try {
      BookTickerStreamResponse result = apiInstance.bookTickerStream(bookTickerStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#bookTickerStream");
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
| **bookTickerStreamRequest** | [**BookTickerStreamRequest**](BookTickerStreamRequest.md)|  | |

### Return type

[**BookTickerStreamResponse**](BookTickerStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Book Ticker Stream |  -  |

<a id="contractKlineStream"></a>
# **contractKlineStream**
> ContractKlineStreamResponse contractKlineStream(contractKlineStreamRequest)

Contract Kline Stream

Pushes kline updates by contractAddress@chainId.

### Example
```java
// Import classes:
import com.binance.connector.client.alpha.ApiClient;
import com.binance.connector.client.alpha.ApiException;
import com.binance.connector.client.alpha.Configuration;
import com.binance.connector.client.alpha.models.*;
import com.binance.connector.client.alpha.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    ContractKlineStreamRequest contractKlineStreamRequest = new ContractKlineStreamRequest(); // ContractKlineStreamRequest | 
    try {
      ContractKlineStreamResponse result = apiInstance.contractKlineStream(contractKlineStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#contractKlineStream");
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
| **contractKlineStreamRequest** | [**ContractKlineStreamRequest**](ContractKlineStreamRequest.md)|  | |

### Return type

[**ContractKlineStreamResponse**](ContractKlineStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Contract Kline Stream |  -  |

<a id="fullDepthStream"></a>
# **fullDepthStream**
> FullDepthStreamResponse fullDepthStream(fullDepthStreamRequest)

Full Depth Stream

Returns all available depth, including UI and API orders.

### Example
```java
// Import classes:
import com.binance.connector.client.alpha.ApiClient;
import com.binance.connector.client.alpha.ApiException;
import com.binance.connector.client.alpha.Configuration;
import com.binance.connector.client.alpha.models.*;
import com.binance.connector.client.alpha.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    FullDepthStreamRequest fullDepthStreamRequest = new FullDepthStreamRequest(); // FullDepthStreamRequest | 
    try {
      FullDepthStreamResponse result = apiInstance.fullDepthStream(fullDepthStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fullDepthStream");
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
| **fullDepthStreamRequest** | [**FullDepthStreamRequest**](FullDepthStreamRequest.md)|  | |

### Return type

[**FullDepthStreamResponse**](FullDepthStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Full Depth Stream |  -  |

<a id="klineStream"></a>
# **klineStream**
> KlineStreamResponse klineStream(klineStreamRequest)

Kline Stream

Pushes kline updates for a symbol.

### Example
```java
// Import classes:
import com.binance.connector.client.alpha.ApiClient;
import com.binance.connector.client.alpha.ApiException;
import com.binance.connector.client.alpha.Configuration;
import com.binance.connector.client.alpha.models.*;
import com.binance.connector.client.alpha.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    KlineStreamRequest klineStreamRequest = new KlineStreamRequest(); // KlineStreamRequest | 
    try {
      KlineStreamResponse result = apiInstance.klineStream(klineStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#klineStream");
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
| **klineStreamRequest** | [**KlineStreamRequest**](KlineStreamRequest.md)|  | |

### Return type

[**KlineStreamResponse**](KlineStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Kline Stream |  -  |

<a id="miniTickerStream"></a>
# **miniTickerStream**
> MiniTickerStreamResponse miniTickerStream(miniTickerStreamRequest)

Mini Ticker Stream

Pushes 24h rolling mini ticker statistics.

### Example
```java
// Import classes:
import com.binance.connector.client.alpha.ApiClient;
import com.binance.connector.client.alpha.ApiException;
import com.binance.connector.client.alpha.Configuration;
import com.binance.connector.client.alpha.models.*;
import com.binance.connector.client.alpha.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    MiniTickerStreamRequest miniTickerStreamRequest = new MiniTickerStreamRequest(); // MiniTickerStreamRequest | 
    try {
      MiniTickerStreamResponse result = apiInstance.miniTickerStream(miniTickerStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#miniTickerStream");
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
| **miniTickerStreamRequest** | [**MiniTickerStreamRequest**](MiniTickerStreamRequest.md)|  | |

### Return type

[**MiniTickerStreamResponse**](MiniTickerStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Mini Ticker Stream |  -  |

<a id="partialDepthStream"></a>
# **partialDepthStream**
> PartialDepthStreamResponse partialDepthStream(partialDepthStreamRequest)

Partial Depth Stream

Pushes partial depth updates (UI orders only).

### Example
```java
// Import classes:
import com.binance.connector.client.alpha.ApiClient;
import com.binance.connector.client.alpha.ApiException;
import com.binance.connector.client.alpha.Configuration;
import com.binance.connector.client.alpha.models.*;
import com.binance.connector.client.alpha.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    PartialDepthStreamRequest partialDepthStreamRequest = new PartialDepthStreamRequest(); // PartialDepthStreamRequest | 
    try {
      PartialDepthStreamResponse result = apiInstance.partialDepthStream(partialDepthStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#partialDepthStream");
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
| **partialDepthStreamRequest** | [**PartialDepthStreamRequest**](PartialDepthStreamRequest.md)|  | |

### Return type

[**PartialDepthStreamResponse**](PartialDepthStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Partial Depth Stream |  -  |

<a id="tickerStream"></a>
# **tickerStream**
> TickerStreamResponse tickerStream(tickerStreamRequest)

Ticker Stream

Pushes full 24h rolling ticker statistics.

### Example
```java
// Import classes:
import com.binance.connector.client.alpha.ApiClient;
import com.binance.connector.client.alpha.ApiException;
import com.binance.connector.client.alpha.Configuration;
import com.binance.connector.client.alpha.models.*;
import com.binance.connector.client.alpha.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    TickerStreamRequest tickerStreamRequest = new TickerStreamRequest(); // TickerStreamRequest | 
    try {
      TickerStreamResponse result = apiInstance.tickerStream(tickerStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#tickerStream");
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
| **tickerStreamRequest** | [**TickerStreamRequest**](TickerStreamRequest.md)|  | |

### Return type

[**TickerStreamResponse**](TickerStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ticker Stream |  -  |

<a id="tradeStream"></a>
# **tradeStream**
> TradeStreamResponse tradeStream(tradeStreamRequest)

Trade Stream

Pushes raw trade updates for a symbol.

### Example
```java
// Import classes:
import com.binance.connector.client.alpha.ApiClient;
import com.binance.connector.client.alpha.ApiException;
import com.binance.connector.client.alpha.Configuration;
import com.binance.connector.client.alpha.models.*;
import com.binance.connector.client.alpha.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    TradeStreamRequest tradeStreamRequest = new TradeStreamRequest(); // TradeStreamRequest | 
    try {
      TradeStreamResponse result = apiInstance.tradeStream(tradeStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#tradeStream");
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
| **tradeStreamRequest** | [**TradeStreamRequest**](TradeStreamRequest.md)|  | |

### Return type

[**TradeStreamResponse**](TradeStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Trade Stream |  -  |

