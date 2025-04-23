# FutureAlgoApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelAlgoOrderFutureAlgo**](FutureAlgoApi.md#cancelAlgoOrderFutureAlgo) | **DELETE** /sapi/v1/algo/futures/order | Cancel Algo Order(TRADE) |
| [**queryCurrentAlgoOpenOrdersFutureAlgo**](FutureAlgoApi.md#queryCurrentAlgoOpenOrdersFutureAlgo) | **GET** /sapi/v1/algo/futures/openOrders | Query Current Algo Open Orders(USER_DATA) |
| [**queryHistoricalAlgoOrdersFutureAlgo**](FutureAlgoApi.md#queryHistoricalAlgoOrdersFutureAlgo) | **GET** /sapi/v1/algo/futures/historicalOrders | Query Historical Algo Orders(USER_DATA) |
| [**querySubOrdersFutureAlgo**](FutureAlgoApi.md#querySubOrdersFutureAlgo) | **GET** /sapi/v1/algo/futures/subOrders | Query Sub Orders(USER_DATA) |
| [**timeWeightedAveragePriceFutureAlgo**](FutureAlgoApi.md#timeWeightedAveragePriceFutureAlgo) | **POST** /sapi/v1/algo/futures/newOrderTwap | Time-Weighted Average Price(Twap) New Order(TRADE) |
| [**volumeParticipationFutureAlgo**](FutureAlgoApi.md#volumeParticipationFutureAlgo) | **POST** /sapi/v1/algo/futures/newOrderVp | Volume Participation(VP) New Order (TRADE) |


<a id="cancelAlgoOrderFutureAlgo"></a>
# **cancelAlgoOrderFutureAlgo**
> CancelAlgoOrderFutureAlgoResponse cancelAlgoOrderFutureAlgo(algoId, recvWindow)

Cancel Algo Order(TRADE)

Cancel an active order.  * You need to enable &#x60;Futures Trading Permission&#x60; for the api key which requests this endpoint. * Base URL: https://api.binance.com  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.algo.ApiClient;
import com.binance.connector.client.algo.ApiException;
import com.binance.connector.client.algo.Configuration;
import com.binance.connector.client.algo.models.*;
import com.binance.connector.client.algo.rest.api.FutureAlgoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FutureAlgoApi apiInstance = new FutureAlgoApi(defaultClient);
    Long algoId = 56L; // Long | eg. 14511
    Long recvWindow = 56L; // Long | 
    try {
      CancelAlgoOrderFutureAlgoResponse result = apiInstance.cancelAlgoOrderFutureAlgo(algoId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FutureAlgoApi#cancelAlgoOrderFutureAlgo");
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

[**CancelAlgoOrderFutureAlgoResponse**](CancelAlgoOrderFutureAlgoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cancel Algo Order |  -  |

<a id="queryCurrentAlgoOpenOrdersFutureAlgo"></a>
# **queryCurrentAlgoOpenOrdersFutureAlgo**
> QueryCurrentAlgoOpenOrdersFutureAlgoResponse queryCurrentAlgoOpenOrdersFutureAlgo(recvWindow)

Query Current Algo Open Orders(USER_DATA)

Query Current Algo Open Orders  * You need to enable &#x60;Futures Trading Permission&#x60; for the api key which requests this endpoint. * Base URL: https://api.binance.com  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.algo.ApiClient;
import com.binance.connector.client.algo.ApiException;
import com.binance.connector.client.algo.Configuration;
import com.binance.connector.client.algo.models.*;
import com.binance.connector.client.algo.rest.api.FutureAlgoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FutureAlgoApi apiInstance = new FutureAlgoApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      QueryCurrentAlgoOpenOrdersFutureAlgoResponse result = apiInstance.queryCurrentAlgoOpenOrdersFutureAlgo(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FutureAlgoApi#queryCurrentAlgoOpenOrdersFutureAlgo");
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

[**QueryCurrentAlgoOpenOrdersFutureAlgoResponse**](QueryCurrentAlgoOpenOrdersFutureAlgoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current Algo Open Orders |  -  |

<a id="queryHistoricalAlgoOrdersFutureAlgo"></a>
# **queryHistoricalAlgoOrdersFutureAlgo**
> QueryHistoricalAlgoOrdersFutureAlgoResponse queryHistoricalAlgoOrdersFutureAlgo(symbol, side, startTime, endTime, page, pageSize, recvWindow)

Query Historical Algo Orders(USER_DATA)

Query Historical Algo Order  * You need to enable &#x60;Futures Trading Permission&#x60; for the api key which requests this endpoint. * Base URL: https://api.binance.com  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.algo.ApiClient;
import com.binance.connector.client.algo.ApiException;
import com.binance.connector.client.algo.Configuration;
import com.binance.connector.client.algo.models.*;
import com.binance.connector.client.algo.rest.api.FutureAlgoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FutureAlgoApi apiInstance = new FutureAlgoApi(defaultClient);
    String symbol = "symbol_example"; // String | Trading symbol eg. BTCUSDT
    String side = "side_example"; // String | BUY or SELL
    Long startTime = 56L; // Long | in milliseconds  eg.1641522717552
    Long endTime = 56L; // Long | in milliseconds  eg.1641522526562
    Long page = 56L; // Long | Default is 1
    Long pageSize = 56L; // Long | MIN 1, MAX 100; Default 100
    Long recvWindow = 56L; // Long | 
    try {
      QueryHistoricalAlgoOrdersFutureAlgoResponse result = apiInstance.queryHistoricalAlgoOrdersFutureAlgo(symbol, side, startTime, endTime, page, pageSize, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FutureAlgoApi#queryHistoricalAlgoOrdersFutureAlgo");
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

[**QueryHistoricalAlgoOrdersFutureAlgoResponse**](QueryHistoricalAlgoOrdersFutureAlgoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Historical Algo Orders |  -  |

<a id="querySubOrdersFutureAlgo"></a>
# **querySubOrdersFutureAlgo**
> QuerySubOrdersFutureAlgoResponse querySubOrdersFutureAlgo(algoId, page, pageSize, recvWindow)

Query Sub Orders(USER_DATA)

Get respective sub orders for a specified algoId  * You need to enable &#x60;Futures Trading Permission&#x60; for the api key which requests this endpoint. * Base URL: https://api.binance.com  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.algo.ApiClient;
import com.binance.connector.client.algo.ApiException;
import com.binance.connector.client.algo.Configuration;
import com.binance.connector.client.algo.models.*;
import com.binance.connector.client.algo.rest.api.FutureAlgoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FutureAlgoApi apiInstance = new FutureAlgoApi(defaultClient);
    Long algoId = 56L; // Long | eg. 14511
    Long page = 56L; // Long | Default is 1
    Long pageSize = 56L; // Long | MIN 1, MAX 100; Default 100
    Long recvWindow = 56L; // Long | 
    try {
      QuerySubOrdersFutureAlgoResponse result = apiInstance.querySubOrdersFutureAlgo(algoId, page, pageSize, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FutureAlgoApi#querySubOrdersFutureAlgo");
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

[**QuerySubOrdersFutureAlgoResponse**](QuerySubOrdersFutureAlgoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sub Orders |  -  |

<a id="timeWeightedAveragePriceFutureAlgo"></a>
# **timeWeightedAveragePriceFutureAlgo**
> TimeWeightedAveragePriceFutureAlgoResponse timeWeightedAveragePriceFutureAlgo(timeWeightedAveragePriceFutureAlgoRequest)

Time-Weighted Average Price(Twap) New Order(TRADE)

Send in a Twap new order. Only support on USDⓈ-M Contracts.  * Total Algo open orders max allowed: &#x60;30&#x60; orders. * Leverage of symbols and position mode will be the same as your futures account settings. You can set up through the trading page or fapi. * Receiving &#x60;\&quot;success\&quot;: true&#x60; does not mean that your order will be executed. Please use the query order endpoints（&#x60;GET sapi/v1/algo/futures/openOrders&#x60; or &#x60;GET sapi/v1/algo/futures/historicalOrders&#x60;） to check the order status. For example: Your futures balance is insufficient, or open position with reduce only or position side is inconsistent with your own setting. In these cases you will receive &#x60;\&quot;success\&quot;: true&#x60;, but the order status will be &#x60;expired&#x60; after we check it. * &#x60;quantity&#x60; * 60 / &#x60;duration&#x60; should be larger than minQty * &#x60;duration&#x60; cannot be less than 5 mins or more than 24 hours. * For delivery contracts, TWAP end time should be one hour earlier than the delivery time of the symbol. * You need to enable &#x60;Futures Trading Permission&#x60; for the api key which requests this endpoint. * Base URL: https://api.binance.com  Weight: 3000

### Example
```java
// Import classes:
import com.binance.connector.client.algo.ApiClient;
import com.binance.connector.client.algo.ApiException;
import com.binance.connector.client.algo.Configuration;
import com.binance.connector.client.algo.models.*;
import com.binance.connector.client.algo.rest.api.FutureAlgoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FutureAlgoApi apiInstance = new FutureAlgoApi(defaultClient);
    TimeWeightedAveragePriceFutureAlgoRequest timeWeightedAveragePriceFutureAlgoRequest = new TimeWeightedAveragePriceFutureAlgoRequest(); // TimeWeightedAveragePriceFutureAlgoRequest | 
    try {
      TimeWeightedAveragePriceFutureAlgoResponse result = apiInstance.timeWeightedAveragePriceFutureAlgo(timeWeightedAveragePriceFutureAlgoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FutureAlgoApi#timeWeightedAveragePriceFutureAlgo");
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
| **timeWeightedAveragePriceFutureAlgoRequest** | [**TimeWeightedAveragePriceFutureAlgoRequest**](TimeWeightedAveragePriceFutureAlgoRequest.md)|  | |

### Return type

[**TimeWeightedAveragePriceFutureAlgoResponse**](TimeWeightedAveragePriceFutureAlgoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Time-Weighted Average Price |  -  |

<a id="volumeParticipationFutureAlgo"></a>
# **volumeParticipationFutureAlgo**
> VolumeParticipationFutureAlgoResponse volumeParticipationFutureAlgo(volumeParticipationFutureAlgoRequest)

Volume Participation(VP) New Order (TRADE)

Send in a VP new order. Only support on USDⓈ-M Contracts.  * Total Algo open orders max allowed: &#x60;10&#x60; orders. * Leverage of symbols and position mode will be the same as your futures account settings. You can set up through the trading page or fapi. * Receiving &#x60;\&quot;success\&quot;: true&#x60; does not mean that your order will be executed. Please use the query order endpoints（&#x60;GET sapi/v1/algo/futures/openOrders&#x60; or &#x60;GET sapi/v1/algo/futures/historicalOrders&#x60;） to check the order status. For example: Your futures balance is insufficient, or open position with reduce only or position side is inconsistent with your own setting. In these cases you will receive &#x60;\&quot;success\&quot;: true&#x60;, but the order status will be &#x60;expired&#x60; after we check it. * You need to enable &#x60;Futures Trading Permission&#x60; for the api key which requests this endpoint. * Base URL: https://api.binance.com  Weight: 300

### Example
```java
// Import classes:
import com.binance.connector.client.algo.ApiClient;
import com.binance.connector.client.algo.ApiException;
import com.binance.connector.client.algo.Configuration;
import com.binance.connector.client.algo.models.*;
import com.binance.connector.client.algo.rest.api.FutureAlgoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FutureAlgoApi apiInstance = new FutureAlgoApi(defaultClient);
    VolumeParticipationFutureAlgoRequest volumeParticipationFutureAlgoRequest = new VolumeParticipationFutureAlgoRequest(); // VolumeParticipationFutureAlgoRequest | 
    try {
      VolumeParticipationFutureAlgoResponse result = apiInstance.volumeParticipationFutureAlgo(volumeParticipationFutureAlgoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FutureAlgoApi#volumeParticipationFutureAlgo");
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
| **volumeParticipationFutureAlgoRequest** | [**VolumeParticipationFutureAlgoRequest**](VolumeParticipationFutureAlgoRequest.md)|  | |

### Return type

[**VolumeParticipationFutureAlgoResponse**](VolumeParticipationFutureAlgoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Volume Participation |  -  |

