# FutureAlgoApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelAlgoOrderFutureAlgo**](FutureAlgoApi.md#cancelAlgoOrderFutureAlgo) | **DELETE** /sapi/v1/algo/futures/order | Cancel Futures Algo Order (TRADE) |
| [**queryCurrentAlgoOpenOrdersFutureAlgo**](FutureAlgoApi.md#queryCurrentAlgoOpenOrdersFutureAlgo) | **GET** /sapi/v1/algo/futures/openOrders | Query Current Futures Algo Open Orders (USER_DATA) |
| [**queryHistoricalAlgoOrdersFutureAlgo**](FutureAlgoApi.md#queryHistoricalAlgoOrdersFutureAlgo) | **GET** /sapi/v1/algo/futures/historicalOrders | Query Historical Futures Algo Orders (USER_DATA) |
| [**querySubOrdersFutureAlgo**](FutureAlgoApi.md#querySubOrdersFutureAlgo) | **GET** /sapi/v1/algo/futures/subOrders | Query Futures Sub Orders (USER_DATA) |
| [**timeWeightedAveragePriceFutureAlgo**](FutureAlgoApi.md#timeWeightedAveragePriceFutureAlgo) | **POST** /sapi/v1/algo/futures/newOrderTwap | Time-Weighted Futures Average Price (Twap) New Order (TRADE) |
| [**volumeParticipationFutureAlgo**](FutureAlgoApi.md#volumeParticipationFutureAlgo) | **POST** /sapi/v1/algo/futures/newOrderVp | Volume Participation (VP) New Order (TRADE) |


<a id="cancelAlgoOrderFutureAlgo"></a>
# **cancelAlgoOrderFutureAlgo**
> CancelAlgoOrderFutureAlgoResponse cancelAlgoOrderFutureAlgo(algoId, recvWindow)

Cancel Futures Algo Order (TRADE)

Cancel an active order.  Weight(IP): 1  Security Type: TRADE  Notes: - You need to enable &#x60;Futures Trading Permission&#x60; for the API key that requests this endpoint. - Base URL: &#x60;https://api.binance.com&#x60;

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
    Long algoId = 1L; // Long | eg. 14511
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
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
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

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

Query Current Futures Algo Open Orders (USER_DATA)

Query Current Algo Open Orders  Weight(IP): 1  Security Type: USER_DATA  Notes: - You need to enable &#x60;Futures Trading Permission&#x60; for the API key that requests this endpoint. - Base URL: &#x60;https://api.binance.com&#x60;

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
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
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
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

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

Query Historical Futures Algo Orders (USER_DATA)

Query Historical Algo Order  Weight(IP): 1  Security Type: USER_DATA  Notes: - You need to enable &#x60;Futures Trading Permission&#x60; for the API key that requests this endpoint. - Base URL: &#x60;https://api.binance.com&#x60;

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
    String symbol = "BTCUSDT"; // String | Trading symbol eg. BTCUSDT
    Side side = Side.fromValue("BUY"); // Side | BUY or SELL
    Long startTime = 1623319461670L; // Long | in milliseconds  eg.1641522717552
    Long endTime = 1641782889000L; // Long | in milliseconds  eg.1641522526562
    Long page = 1L; // Long | Page number
    Long pageSize = 100L; // Long | Records per page
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
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
| **side** | [**Side**](.md)| BUY or SELL | [optional] [enum: BUY, SELL] |
| **startTime** | **Long**| in milliseconds  eg.1641522717552 | [optional] |
| **endTime** | **Long**| in milliseconds  eg.1641522526562 | [optional] |
| **page** | **Long**| Page number | [optional] |
| **pageSize** | **Long**| Records per page | [optional] |
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

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

Query Futures Sub Orders (USER_DATA)

Get respective sub orders for a specified algoId  Weight(IP): 1  Security Type: USER_DATA  Notes: - You need to enable &#x60;Futures Trading Permission&#x60; for the API key that requests this endpoint. - Base URL: &#x60;https://api.binance.com&#x60;

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
    Long algoId = 1L; // Long | eg. 14511
    Long page = 1L; // Long | Page number
    Long pageSize = 100L; // Long | Records per page
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
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
| **page** | **Long**| Page number | [optional] |
| **pageSize** | **Long**| Records per page | [optional] |
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

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

Time-Weighted Futures Average Price (Twap) New Order (TRADE)

Send in a Twap new order. Only support on USDⓈ-M Contracts.  Weight(UID): 3000  Security Type: TRADE  Notes: - Other info:   - Total Algo open orders max allowed: &#x60;30&#x60; orders.   - Leverage and position mode follow your futures account settings.   - Receiving &#x60;\&quot;success\&quot;: true&#x60; does not guarantee execution; query order endpoints for final status.   - If balance/position constraints fail, response may still return success but order status becomes &#x60;expired&#x60;.   - &#x60;quantity * 60 / duration&#x60; must be greater than &#x60;minQty&#x60;.   - &#x60;duration&#x60; cannot be less than 5 minutes or greater than 24 hours.   - For delivery contracts, TWAP end time should be one hour earlier than symbol delivery time.   - You need to enable the corresponding permission for the API key requesting this endpoint:     - &#x60;Futures Trading Permission&#x60; — for Classic Trading Account mode     - &#x60;Portfolio Margin Trading Permission&#x60; — for Portfolio Margin Account mode   - Base URL: &#x60;https://api.binance.com&#x60;

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

Volume Participation (VP) New Order (TRADE)

Send in a VP new order. Only support on USDⓈ-M Contracts.  Weight(UID): 300  Security Type: TRADE  Notes: - Other info:   - Total Algo open orders max allowed: &#x60;10&#x60; orders.   - Leverage and position mode follow your futures account settings.   - Receiving &#x60;\&quot;success\&quot;: true&#x60; does not guarantee execution; query order endpoints for final status.   - If balance/position constraints fail, response may still return success but order status becomes &#x60;expired&#x60;.   - You need to enable the corresponding permission for the API key requesting this endpoint:     - &#x60;Futures Trading Permission&#x60; — for Classic Trading Account mode     - &#x60;Portfolio Margin Trading Permission&#x60; — for Portfolio Margin Account mode   - Base URL: &#x60;https://api.binance.com&#x60;

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

