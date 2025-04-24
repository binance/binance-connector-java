# MarketDataApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**orderBook**](MarketDataApi.md#orderBook) | **POST** /depth | Order Book |
| [**symbolOrderBookTicker**](MarketDataApi.md#symbolOrderBookTicker) | **POST** /ticker.book | Symbol Order Book Ticker |
| [**symbolPriceTicker**](MarketDataApi.md#symbolPriceTicker) | **POST** /ticker.price | Symbol Price Ticker |


<a id="orderBook"></a>
# **orderBook**
> OrderBookResponse orderBook(orderBookRequest)

Order Book

Get current order book. Note that this request returns limited market depth. If you need to continuously monitor order book updates, please consider using Websocket Market Streams: * &#x60;&lt;symbol&gt;@depth&lt;levels&gt;&#x60; * &#x60;&lt;symbol&gt;@depth&#x60;  You can use &#x60;depth&#x60; request together with &#x60;&lt;symbol&gt;@depth&#x60; streams to maintain a local order book.  Weight: Adjusted based on the limit: | Limit         | Weight | | ------------- | ------ | | 5, 10, 20, 50 | 2      | | 100           | 5      | | 500           | 10     | | 1000          | 20     |

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    OrderBookRequest orderBookRequest = new OrderBookRequest(); // OrderBookRequest | 
    try {
      OrderBookResponse result = apiInstance.orderBook(orderBookRequest);
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
| **orderBookRequest** | [**OrderBookRequest**](OrderBookRequest.md)|  | |

### Return type

[**OrderBookResponse**](OrderBookResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order Book |  -  |

<a id="symbolOrderBookTicker"></a>
# **symbolOrderBookTicker**
> SymbolOrderBookTickerResponse symbolOrderBookTicker(symbolOrderBookTickerRequest)

Symbol Order Book Ticker

Best price/qty on the order book for a symbol or symbols.  * If the symbol is not sent, bookTickers for all symbols will be returned in an array. * The field &#x60;X-MBX-USED-WEIGHT-1M&#x60; in response header is not accurate from this endpoint, please ignore.  Weight: 2 for a single symbol; 5 when the symbol parameter is omitted

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    SymbolOrderBookTickerRequest symbolOrderBookTickerRequest = new SymbolOrderBookTickerRequest(); // SymbolOrderBookTickerRequest | 
    try {
      SymbolOrderBookTickerResponse result = apiInstance.symbolOrderBookTicker(symbolOrderBookTickerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#symbolOrderBookTicker");
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
| **symbolOrderBookTickerRequest** | [**SymbolOrderBookTickerRequest**](SymbolOrderBookTickerRequest.md)|  | |

### Return type

[**SymbolOrderBookTickerResponse**](SymbolOrderBookTickerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Symbol Order Book Ticker |  -  |

<a id="symbolPriceTicker"></a>
# **symbolPriceTicker**
> SymbolPriceTickerResponse symbolPriceTicker(symbolPriceTickerRequest)

Symbol Price Ticker

Latest price for a symbol or symbols.  * If the symbol is not sent, prices for all symbols will be returned in an array.  Weight: 1 for a single symbol; 2 when the symbol parameter is omitted

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    SymbolPriceTickerRequest symbolPriceTickerRequest = new SymbolPriceTickerRequest(); // SymbolPriceTickerRequest | 
    try {
      SymbolPriceTickerResponse result = apiInstance.symbolPriceTicker(symbolPriceTickerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#symbolPriceTicker");
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
| **symbolPriceTickerRequest** | [**SymbolPriceTickerRequest**](SymbolPriceTickerRequest.md)|  | |

### Return type

[**SymbolPriceTickerResponse**](SymbolPriceTickerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Symbol Price Ticker |  -  |

