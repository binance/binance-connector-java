# MarketDataApi

All URIs are relative to *https://eapi.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkServerTime**](MarketDataApi.md#checkServerTime) | **GET** /eapi/v1/time | Check Server Time |
| [**exchangeInformation**](MarketDataApi.md#exchangeInformation) | **GET** /eapi/v1/exchangeInfo | Exchange Information |
| [**historicalExerciseRecords**](MarketDataApi.md#historicalExerciseRecords) | **GET** /eapi/v1/exerciseHistory | Historical Exercise Records |
| [**indexPrice**](MarketDataApi.md#indexPrice) | **GET** /eapi/v1/index | Index Price |
| [**klineCandlestickData**](MarketDataApi.md#klineCandlestickData) | **GET** /eapi/v1/klines | Kline/Candlestick Data |
| [**openInterest**](MarketDataApi.md#openInterest) | **GET** /eapi/v1/openInterest | Open Interest |
| [**optionMarkPrice**](MarketDataApi.md#optionMarkPrice) | **GET** /eapi/v1/mark | Option Mark Price |
| [**orderBook**](MarketDataApi.md#orderBook) | **GET** /eapi/v1/depth | Order Book |
| [**recentBlockTradesList**](MarketDataApi.md#recentBlockTradesList) | **GET** /eapi/v1/blockTrades | Recent Block Trades List |
| [**recentTradesList**](MarketDataApi.md#recentTradesList) | **GET** /eapi/v1/trades | Recent Trades List |
| [**testConnectivity**](MarketDataApi.md#testConnectivity) | **GET** /eapi/v1/ping | Test Connectivity |
| [**ticker24hrPriceChangeStatistics**](MarketDataApi.md#ticker24hrPriceChangeStatistics) | **GET** /eapi/v1/ticker | 24hr Ticker Price Change Statistics |


<a id="checkServerTime"></a>
# **checkServerTime**
> CheckServerTimeResponse checkServerTime()

Check Server Time

Test connectivity to the Rest API and get the current server time.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    try {
      CheckServerTimeResponse result = apiInstance.checkServerTime();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#checkServerTime");
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

[**CheckServerTimeResponse**](CheckServerTimeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Check Server Time |  -  |

<a id="exchangeInformation"></a>
# **exchangeInformation**
> ExchangeInformationResponse exchangeInformation()

Exchange Information

Current exchange trading rules and symbol information  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    try {
      ExchangeInformationResponse result = apiInstance.exchangeInformation();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#exchangeInformation");
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

[**ExchangeInformationResponse**](ExchangeInformationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Exchange Information |  -  |

<a id="historicalExerciseRecords"></a>
# **historicalExerciseRecords**
> HistoricalExerciseRecordsResponse historicalExerciseRecords(underlying, startTime, endTime, limit)

Historical Exercise Records

Get historical exercise records. * REALISTIC_VALUE_STRICKEN -&gt; Exercised * EXTRINSIC_VALUE_EXPIRED -&gt; Expired OTM  Weight: 3

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String underlying = "underlying_example"; // String | underlying, e.g BTCUSDT
    Long startTime = 56L; // Long | Start Time, e.g 1593511200000
    Long endTime = 56L; // Long | End Time, e.g 1593512200000
    Long limit = 56L; // Long | Number of result sets returned Default:100 Max:1000
    try {
      HistoricalExerciseRecordsResponse result = apiInstance.historicalExerciseRecords(underlying, startTime, endTime, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#historicalExerciseRecords");
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
| **underlying** | **String**| underlying, e.g BTCUSDT | [optional] |
| **startTime** | **Long**| Start Time, e.g 1593511200000 | [optional] |
| **endTime** | **Long**| End Time, e.g 1593512200000 | [optional] |
| **limit** | **Long**| Number of result sets returned Default:100 Max:1000 | [optional] |

### Return type

[**HistoricalExerciseRecordsResponse**](HistoricalExerciseRecordsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Historical Exercise Records |  -  |

<a id="indexPrice"></a>
# **indexPrice**
> IndexPriceResponse indexPrice(underlying)

Index Price

Get spot index price for option underlying.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String underlying = "underlying_example"; // String | Option underlying, e.g BTCUSDT
    try {
      IndexPriceResponse result = apiInstance.indexPrice(underlying);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#indexPrice");
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
| **underlying** | **String**| Option underlying, e.g BTCUSDT | |

### Return type

[**IndexPriceResponse**](IndexPriceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Index Price |  -  |

<a id="klineCandlestickData"></a>
# **klineCandlestickData**
> KlineCandlestickDataResponse klineCandlestickData(symbol, interval, startTime, endTime, limit)

Kline/Candlestick Data

Kline/candlestick bars for an option symbol. Klines are uniquely identified by their open time.  * If startTime and endTime are not sent, the most recent klines are returned.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String symbol = "symbol_example"; // String | Option trading pair, e.g BTC-200730-9000-C
    String interval = "interval_example"; // String | Time interval
    Long startTime = 56L; // Long | Start Time, e.g 1593511200000
    Long endTime = 56L; // Long | End Time, e.g 1593512200000
    Long limit = 56L; // Long | Number of result sets returned Default:100 Max:1000
    try {
      KlineCandlestickDataResponse result = apiInstance.klineCandlestickData(symbol, interval, startTime, endTime, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#klineCandlestickData");
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
| **symbol** | **String**| Option trading pair, e.g BTC-200730-9000-C | |
| **interval** | **String**| Time interval | |
| **startTime** | **Long**| Start Time, e.g 1593511200000 | [optional] |
| **endTime** | **Long**| End Time, e.g 1593512200000 | [optional] |
| **limit** | **Long**| Number of result sets returned Default:100 Max:1000 | [optional] |

### Return type

[**KlineCandlestickDataResponse**](KlineCandlestickDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Kline/Candlestick Data |  -  |

<a id="openInterest"></a>
# **openInterest**
> OpenInterestResponse openInterest(underlyingAsset, expiration)

Open Interest

Get open interest for specific underlying asset on specific expiration date.  Weight: 0

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String underlyingAsset = "underlyingAsset_example"; // String | underlying asset, e.g ETH/BTC
    String expiration = "expiration_example"; // String | expiration date, e.g 221225
    try {
      OpenInterestResponse result = apiInstance.openInterest(underlyingAsset, expiration);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#openInterest");
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
| **underlyingAsset** | **String**| underlying asset, e.g ETH/BTC | |
| **expiration** | **String**| expiration date, e.g 221225 | |

### Return type

[**OpenInterestResponse**](OpenInterestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Open Interest |  -  |

<a id="optionMarkPrice"></a>
# **optionMarkPrice**
> OptionMarkPriceResponse optionMarkPrice(symbol)

Option Mark Price

Option mark price and greek info.  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String symbol = "symbol_example"; // String | Option trading pair, e.g BTC-200730-9000-C
    try {
      OptionMarkPriceResponse result = apiInstance.optionMarkPrice(symbol);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#optionMarkPrice");
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
| **symbol** | **String**| Option trading pair, e.g BTC-200730-9000-C | [optional] |

### Return type

[**OptionMarkPriceResponse**](OptionMarkPriceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Option Mark Price |  -  |

<a id="orderBook"></a>
# **orderBook**
> OrderBookResponse orderBook(symbol, limit)

Order Book

Check orderbook depth on specific symbol  Weight: limit         | weight ------------  | ------------ 5, 10, 20, 50 | 1 100           | 5 500           | 10 1000          | 20

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String symbol = "symbol_example"; // String | Option trading pair, e.g BTC-200730-9000-C
    Long limit = 56L; // Long | Number of result sets returned Default:100 Max:1000
    try {
      OrderBookResponse result = apiInstance.orderBook(symbol, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#orderBook");
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
| **symbol** | **String**| Option trading pair, e.g BTC-200730-9000-C | |
| **limit** | **Long**| Number of result sets returned Default:100 Max:1000 | [optional] |

### Return type

[**OrderBookResponse**](OrderBookResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order Book |  -  |

<a id="recentBlockTradesList"></a>
# **recentBlockTradesList**
> RecentBlockTradesListResponse recentBlockTradesList(symbol, limit)

Recent Block Trades List

Get recent block trades  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String symbol = "symbol_example"; // String | Option trading pair, e.g BTC-200730-9000-C
    Long limit = 56L; // Long | Number of result sets returned Default:100 Max:1000
    try {
      RecentBlockTradesListResponse result = apiInstance.recentBlockTradesList(symbol, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#recentBlockTradesList");
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
| **symbol** | **String**| Option trading pair, e.g BTC-200730-9000-C | [optional] |
| **limit** | **Long**| Number of result sets returned Default:100 Max:1000 | [optional] |

### Return type

[**RecentBlockTradesListResponse**](RecentBlockTradesListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Recent Block Trades List |  -  |

<a id="recentTradesList"></a>
# **recentTradesList**
> RecentTradesListResponse recentTradesList(symbol, limit)

Recent Trades List

Get recent market trades  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String symbol = "symbol_example"; // String | Option trading pair, e.g BTC-200730-9000-C
    Long limit = 56L; // Long | Number of result sets returned Default:100 Max:1000
    try {
      RecentTradesListResponse result = apiInstance.recentTradesList(symbol, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#recentTradesList");
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
| **symbol** | **String**| Option trading pair, e.g BTC-200730-9000-C | |
| **limit** | **Long**| Number of result sets returned Default:100 Max:1000 | [optional] |

### Return type

[**RecentTradesListResponse**](RecentTradesListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Recent Trades List |  -  |

<a id="testConnectivity"></a>
# **testConnectivity**
> testConnectivity()

Test Connectivity

Test connectivity to the Rest API.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    try {
      apiInstance.testConnectivity();
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#testConnectivity");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="ticker24hrPriceChangeStatistics"></a>
# **ticker24hrPriceChangeStatistics**
> Ticker24hrPriceChangeStatisticsResponse ticker24hrPriceChangeStatistics(symbol)

24hr Ticker Price Change Statistics

24 hour rolling window price change statistics.  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String symbol = "symbol_example"; // String | Option trading pair, e.g BTC-200730-9000-C
    try {
      Ticker24hrPriceChangeStatisticsResponse result = apiInstance.ticker24hrPriceChangeStatistics(symbol);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#ticker24hrPriceChangeStatistics");
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
| **symbol** | **String**| Option trading pair, e.g BTC-200730-9000-C | [optional] |

### Return type

[**Ticker24hrPriceChangeStatisticsResponse**](Ticker24hrPriceChangeStatisticsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 24hr Ticker Price Change Statistics |  -  |

