# SpotAlgoApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelAlgoOrderSpotAlgo**](SpotAlgoApi.md#cancelAlgoOrderSpotAlgo) | **DELETE** /sapi/v1/algo/spot/order | Cancel Spot Algo Order (TRADE) |
| [**queryCurrentAlgoOpenOrdersSpotAlgo**](SpotAlgoApi.md#queryCurrentAlgoOpenOrdersSpotAlgo) | **GET** /sapi/v1/algo/spot/openOrders | Query Current Spot Algo Open Orders (USER_DATA) |
| [**queryHistoricalAlgoOrdersSpotAlgo**](SpotAlgoApi.md#queryHistoricalAlgoOrdersSpotAlgo) | **GET** /sapi/v1/algo/spot/historicalOrders | Query Historical Spot Algo Orders (USER_DATA) |
| [**querySubOrdersSpotAlgo**](SpotAlgoApi.md#querySubOrdersSpotAlgo) | **GET** /sapi/v1/algo/spot/subOrders | Query Spot Sub Orders (USER_DATA) |
| [**timeWeightedAveragePriceSpotAlgo**](SpotAlgoApi.md#timeWeightedAveragePriceSpotAlgo) | **POST** /sapi/v1/algo/spot/newOrderTwap | Time-Weighted Spot Average Price(Twap) New Order (TRADE) |


<a id="cancelAlgoOrderSpotAlgo"></a>
# **cancelAlgoOrderSpotAlgo**
> CancelAlgoOrderSpotAlgoResponse cancelAlgoOrderSpotAlgo(algoId, recvWindow)

Cancel Spot Algo Order (TRADE)

Cancel an open TWAP order  Weight(IP): 1  Security Type: TRADE

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
    Long algoId = 14511L; // Long | 
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
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
| **algoId** | **Long**|  | |
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

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

Query Current Spot Algo Open Orders (USER_DATA)

Get all open SPOT TWAP orders  Weight(IP): 1  Security Type: USER_DATA

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
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
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
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

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

Query Historical Spot Algo Orders (USER_DATA)

Get all historical SPOT TWAP orders  Weight(IP): 1  Security Type: USER_DATA

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
    String symbol = "BTCUSDT"; // String | Trading symbol
    Side side = Side.fromValue("BUY"); // Side | 
    Long startTime = 1623319461670L; // Long | in milliseconds  eg.1641522717552
    Long endTime = 1641782889000L; // Long | in milliseconds  eg.1641522526562
    Long page = 1L; // Long | Page number
    Long pageSize = 10L; // Long | Records per page
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
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
| **symbol** | **String**| Trading symbol | [optional] |
| **side** | [**Side**](.md)|  | [optional] [enum: BUY, SELL] |
| **startTime** | **Long**| in milliseconds  eg.1641522717552 | [optional] |
| **endTime** | **Long**| in milliseconds  eg.1641522526562 | [optional] |
| **page** | **Long**| Page number | [optional] |
| **pageSize** | **Long**| Records per page | [optional] |
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

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

Query Spot Sub Orders (USER_DATA)

Get respective sub orders for a specified algoId  Weight(IP): 1  Security Type: USER_DATA

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
    Long algoId = 1L; // Long | eg. 14511
    Long page = 1L; // Long | Page number
    Long pageSize = 10L; // Long | Records per page
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
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
| **page** | **Long**| Page number | [optional] |
| **pageSize** | **Long**| Records per page | [optional] |
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

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

Time-Weighted Spot Average Price(Twap) New Order (TRADE)

Place a new spot TWAP order with Algo service.  Weight(UID): 3000  Security Type: TRADE  Notes: - Total Algo open orders max allowed: &#x60;20&#x60; orders.

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

