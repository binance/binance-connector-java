# MarketDataApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMarketDetail**](MarketDataApi.md#getMarketDetail) | **GET** /sapi/v1/w3w/wallet/prediction/market/detail | Get Market Detail |
| [**listPredictionCategories**](MarketDataApi.md#listPredictionCategories) | **GET** /sapi/v1/w3w/wallet/prediction/category/list | List Prediction Categories |
| [**listPredictionMarkets**](MarketDataApi.md#listPredictionMarkets) | **GET** /sapi/v1/w3w/wallet/prediction/market/list | List Prediction Markets |
| [**marketSearch**](MarketDataApi.md#marketSearch) | **GET** /sapi/v1/w3w/wallet/prediction/market/search | Market Search |
| [**queryLastTradePrice**](MarketDataApi.md#queryLastTradePrice) | **GET** /sapi/v1/w3w/wallet/prediction/order-book/last-trade-price | Query Last Trade Price |
| [**queryOrderBook**](MarketDataApi.md#queryOrderBook) | **GET** /sapi/v1/w3w/wallet/prediction/order-book | Query Order Book |


<a id="getMarketDetail"></a>
# **getMarketDetail**
> GetMarketDetailResponse getMarketDetail(marketTopicId)

Get Market Detail

Get full details for a specific prediction market topic, including variant data and timeline.  Weight(IP): 200

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    Long marketTopicId = 4229564L; // Long | Market topic ID. Must be > 0
    try {
      GetMarketDetailResponse result = apiInstance.getMarketDetail(marketTopicId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#getMarketDetail");
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
| **marketTopicId** | **Long**| Market topic ID. Must be &gt; 0 | |

### Return type

[**GetMarketDetailResponse**](GetMarketDetailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Market Detail |  -  |

<a id="listPredictionCategories"></a>
# **listPredictionCategories**
> ListPredictionCategoriesResponse listPredictionCategories()

List Prediction Categories

Get all available prediction market categories (L1 and L2).  Weight(IP): 200

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    try {
      ListPredictionCategoriesResponse result = apiInstance.listPredictionCategories();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#listPredictionCategories");
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

[**ListPredictionCategoriesResponse**](ListPredictionCategoriesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Prediction Categories |  -  |

<a id="listPredictionMarkets"></a>
# **listPredictionMarkets**
> ListPredictionMarketsResponse listPredictionMarkets(l1Category, l2Category, sortBy, orderBy, offset, limit)

List Prediction Markets

Get a paginated list of prediction market topics, with optional category and sort filters.  Weight(IP): 200

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String l1Category = "crypto"; // String | Level-1 category filter
    String l2Category = "up-down"; // String | Level-2 category filter
    SortBy sortBy = SortBy.fromValue("RECOMMENDED"); // SortBy | Sort field. Enum: `RECOMMENDED`, `VOLUME`, `PARTICIPANTS`, `CREATED_TIME`, `END_DATE`
    OrderBy orderBy = OrderBy.fromValue("ASC"); // OrderBy | Sort direction. Enum: `ASC`, `DESC`
    Integer offset = 0; // Integer | Pagination offset. Default `0`
    Integer limit = 20; // Integer | Page size. Default `20`, range 1–100
    try {
      ListPredictionMarketsResponse result = apiInstance.listPredictionMarkets(l1Category, l2Category, sortBy, orderBy, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#listPredictionMarkets");
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
| **l1Category** | **String**| Level-1 category filter | [optional] |
| **l2Category** | **String**| Level-2 category filter | [optional] |
| **sortBy** | [**SortBy**](.md)| Sort field. Enum: &#x60;RECOMMENDED&#x60;, &#x60;VOLUME&#x60;, &#x60;PARTICIPANTS&#x60;, &#x60;CREATED_TIME&#x60;, &#x60;END_DATE&#x60; | [optional] [enum: RECOMMENDED, VOLUME, PARTICIPANTS, CREATED_TIME, END_DATE] |
| **orderBy** | [**OrderBy**](.md)| Sort direction. Enum: &#x60;ASC&#x60;, &#x60;DESC&#x60; | [optional] [enum: ASC, DESC] |
| **offset** | **Integer**| Pagination offset. Default &#x60;0&#x60; | [optional] |
| **limit** | **Integer**| Page size. Default &#x60;20&#x60;, range 1–100 | [optional] |

### Return type

[**ListPredictionMarketsResponse**](ListPredictionMarketsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Prediction Markets |  -  |

<a id="marketSearch"></a>
# **marketSearch**
> MarketSearchResponse marketSearch(query, topK)

Market Search

Semantic search for prediction market topics by keyword.  Weight(IP): 200

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String query = "BTC price"; // String | Search keyword. Not blank
    Integer topK = 20; // Integer | Max number of results to return. Default `20`, range 1–50
    try {
      MarketSearchResponse result = apiInstance.marketSearch(query, topK);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#marketSearch");
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
| **query** | **String**| Search keyword. Not blank | |
| **topK** | **Integer**| Max number of results to return. Default &#x60;20&#x60;, range 1–50 | [optional] |

### Return type

[**MarketSearchResponse**](MarketSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Market Search |  -  |

<a id="queryLastTradePrice"></a>
# **queryLastTradePrice**
> QueryLastTradePriceResponse queryLastTradePrice(marketId)

Query Last Trade Price

Get the most recent trade price for a prediction market.  Weight(IP): 200

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    Long marketId = 5567895L; // Long | Market ID. Must be > 0
    try {
      QueryLastTradePriceResponse result = apiInstance.queryLastTradePrice(marketId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#queryLastTradePrice");
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
| **marketId** | **Long**| Market ID. Must be &gt; 0 | |

### Return type

[**QueryLastTradePriceResponse**](QueryLastTradePriceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Query Last Trade Price |  -  |

<a id="queryOrderBook"></a>
# **queryOrderBook**
> QueryOrderBookResponse queryOrderBook(vendor, marketId, tokenId)

Query Order Book

Get the current order book (bids and asks) for a specific prediction market outcome token.  Weight(IP): 200

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String vendor = "predict_fun"; // String | Vendor identifier (e.g. `predict_fun`)
    Long marketId = 5567895L; // Long | Market ID. Must be > 0
    String tokenId = "112233"; // String | Prediction outcome token ID
    try {
      QueryOrderBookResponse result = apiInstance.queryOrderBook(vendor, marketId, tokenId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#queryOrderBook");
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
| **vendor** | **String**| Vendor identifier (e.g. &#x60;predict_fun&#x60;) | |
| **marketId** | **Long**| Market ID. Must be &gt; 0 | |
| **tokenId** | **String**| Prediction outcome token ID | |

### Return type

[**QueryOrderBookResponse**](QueryOrderBookResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Query Order Book |  -  |

