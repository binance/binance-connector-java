# SpotAlgoApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelAlgoOrderSpotAlgo**](SpotAlgoApi.md#cancelAlgoOrderSpotAlgo) | **DELETE** /sapi/v1/algo/spot/order | Cancel Algo Order(TRADE) |
| [**queryCurrentAlgoOpenOrdersSpotAlgo**](SpotAlgoApi.md#queryCurrentAlgoOpenOrdersSpotAlgo) | **GET** /sapi/v1/algo/spot/openOrders | Query Current Algo Open Orders(USER_DATA) |
| [**queryHistoricalAlgoOrdersSpotAlgo**](SpotAlgoApi.md#queryHistoricalAlgoOrdersSpotAlgo) | **GET** /sapi/v1/algo/spot/historicalOrders | Query Historical Algo Orders(USER_DATA) |
| [**querySubOrdersSpotAlgo**](SpotAlgoApi.md#querySubOrdersSpotAlgo) | **GET** /sapi/v1/algo/spot/subOrders | Query Sub Orders(USER_DATA) |
| [**timeWeightedAveragePriceSpotAlgo**](SpotAlgoApi.md#timeWeightedAveragePriceSpotAlgo) | **POST** /sapi/v1/algo/spot/newOrderTwap | Time-Weighted Average Price(Twap) New Order(TRADE) |


<a id="cancelAlgoOrderSpotAlgo"></a>
# **cancelAlgoOrderSpotAlgo**
> CancelAlgoOrderSpotAlgoResponse cancelAlgoOrderSpotAlgo(algoId, recvWindow)

Cancel Algo Order(TRADE)

Cancel an open TWAP order  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.algo.ApiClient;
import com.binance.connector.client.algo.ApiException;
import com.binance.connector.client.algo.Configuration;
import com.binance.connector.client.algo.models.*;
import com.binance.connector.client.algo.rest.api.SpotAlgoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    SpotAlgoApi apiInstance = new SpotAlgoApi(defaultClient);
    Long algoId = 56L; // Long | eg. 14511
    Long recvWindow = 56L; // Long | 
    try {
      CancelAlgoOrderSpotAlgoResponse result = apiInstance.cancelAlgoOrderSpotAlgo(algoId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpotAlgoApi#cancelAlgoOrderSpotAlgo");
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
| **algoId** | **Long**| eg. 14511 | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**CancelAlgoOrderSpotAlgoResponse**](CancelAlgoOrderSpotAlgoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cancel Algo Order |  -  |

<a id="queryCurrentAlgoOpenOrdersSpotAlgo"></a>
# **queryCurrentAlgoOpenOrdersSpotAlgo**
> QueryCurrentAlgoOpenOrdersSpotAlgoResponse queryCurrentAlgoOpenOrdersSpotAlgo(recvWindow)

Query Current Algo Open Orders(USER_DATA)

Get all open SPOT TWAP orders  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.algo.ApiClient;
import com.binance.connector.client.algo.ApiException;
import com.binance.connector.client.algo.Configuration;
import com.binance.connector.client.algo.models.*;
import com.binance.connector.client.algo.rest.api.SpotAlgoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    SpotAlgoApi apiInstance = new SpotAlgoApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      QueryCurrentAlgoOpenOrdersSpotAlgoResponse result = apiInstance.queryCurrentAlgoOpenOrdersSpotAlgo(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpotAlgoApi#queryCurrentAlgoOpenOrdersSpotAlgo");
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
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryCurrentAlgoOpenOrdersSpotAlgoResponse**](QueryCurrentAlgoOpenOrdersSpotAlgoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current Algo Open Orders |  -  |

<a id="queryHistoricalAlgoOrdersSpotAlgo"></a>
# **queryHistoricalAlgoOrdersSpotAlgo**
> QueryHistoricalAlgoOrdersSpotAlgoResponse queryHistoricalAlgoOrdersSpotAlgo(symbol, side, startTime, endTime, page, pageSize, recvWindow)

Query Historical Algo Orders(USER_DATA)

Get all historical SPOT TWAP orders  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.algo.ApiClient;
import com.binance.connector.client.algo.ApiException;
import com.binance.connector.client.algo.Configuration;
import com.binance.connector.client.algo.models.*;
import com.binance.connector.client.algo.rest.api.SpotAlgoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    SpotAlgoApi apiInstance = new SpotAlgoApi(defaultClient);
    String symbol = "symbol_example"; // String | Trading symbol eg. BTCUSDT
    String side = "side_example"; // String | BUY or SELL
    Long startTime = 56L; // Long | in milliseconds  eg.1641522717552
    Long endTime = 56L; // Long | in milliseconds  eg.1641522526562
    Long page = 56L; // Long | Default is 1
    Long pageSize = 56L; // Long | MIN 1, MAX 100; Default 100
    Long recvWindow = 56L; // Long | 
    try {
      QueryHistoricalAlgoOrdersSpotAlgoResponse result = apiInstance.queryHistoricalAlgoOrdersSpotAlgo(symbol, side, startTime, endTime, page, pageSize, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpotAlgoApi#queryHistoricalAlgoOrdersSpotAlgo");
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
| **symbol** | **String**| Trading symbol eg. BTCUSDT | [optional] |
| **side** | **String**| BUY or SELL | [optional] |
| **startTime** | **Long**| in milliseconds  eg.1641522717552 | [optional] |
| **endTime** | **Long**| in milliseconds  eg.1641522526562 | [optional] |
| **page** | **Long**| Default is 1 | [optional] |
| **pageSize** | **Long**| MIN 1, MAX 100; Default 100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryHistoricalAlgoOrdersSpotAlgoResponse**](QueryHistoricalAlgoOrdersSpotAlgoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Historical Algo Orders |  -  |

<a id="querySubOrdersSpotAlgo"></a>
# **querySubOrdersSpotAlgo**
> QuerySubOrdersSpotAlgoResponse querySubOrdersSpotAlgo(algoId, page, pageSize, recvWindow)

Query Sub Orders(USER_DATA)

Get respective sub orders for a specified algoId  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.algo.ApiClient;
import com.binance.connector.client.algo.ApiException;
import com.binance.connector.client.algo.Configuration;
import com.binance.connector.client.algo.models.*;
import com.binance.connector.client.algo.rest.api.SpotAlgoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    SpotAlgoApi apiInstance = new SpotAlgoApi(defaultClient);
    Long algoId = 56L; // Long | eg. 14511
    Long page = 56L; // Long | Default is 1
    Long pageSize = 56L; // Long | MIN 1, MAX 100; Default 100
    Long recvWindow = 56L; // Long | 
    try {
      QuerySubOrdersSpotAlgoResponse result = apiInstance.querySubOrdersSpotAlgo(algoId, page, pageSize, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpotAlgoApi#querySubOrdersSpotAlgo");
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
| **algoId** | **Long**| eg. 14511 | |
| **page** | **Long**| Default is 1 | [optional] |
| **pageSize** | **Long**| MIN 1, MAX 100; Default 100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QuerySubOrdersSpotAlgoResponse**](QuerySubOrdersSpotAlgoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sub Orders |  -  |

<a id="timeWeightedAveragePriceSpotAlgo"></a>
# **timeWeightedAveragePriceSpotAlgo**
> TimeWeightedAveragePriceSpotAlgoResponse timeWeightedAveragePriceSpotAlgo(timeWeightedAveragePriceSpotAlgoRequest)

Time-Weighted Average Price(Twap) New Order(TRADE)

Place a new spot TWAP order with Algo service.  * Total Algo open orders max allowed: &#x60;20&#x60; orders.  Weight: 3000

### Example
```java
// Import classes:
import com.binance.connector.client.algo.ApiClient;
import com.binance.connector.client.algo.ApiException;
import com.binance.connector.client.algo.Configuration;
import com.binance.connector.client.algo.models.*;
import com.binance.connector.client.algo.rest.api.SpotAlgoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    SpotAlgoApi apiInstance = new SpotAlgoApi(defaultClient);
    TimeWeightedAveragePriceSpotAlgoRequest timeWeightedAveragePriceSpotAlgoRequest = new TimeWeightedAveragePriceSpotAlgoRequest(); // TimeWeightedAveragePriceSpotAlgoRequest | 
    try {
      TimeWeightedAveragePriceSpotAlgoResponse result = apiInstance.timeWeightedAveragePriceSpotAlgo(timeWeightedAveragePriceSpotAlgoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpotAlgoApi#timeWeightedAveragePriceSpotAlgo");
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
| **timeWeightedAveragePriceSpotAlgoRequest** | [**TimeWeightedAveragePriceSpotAlgoRequest**](TimeWeightedAveragePriceSpotAlgoRequest.md)|  | |

### Return type

[**TimeWeightedAveragePriceSpotAlgoResponse**](TimeWeightedAveragePriceSpotAlgoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Time-Weighted Average Price |  -  |

