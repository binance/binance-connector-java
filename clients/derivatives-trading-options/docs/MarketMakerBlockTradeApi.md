# MarketMakerBlockTradeApi

All URIs are relative to *https://eapi.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acceptBlockTradeOrder**](MarketMakerBlockTradeApi.md#acceptBlockTradeOrder) | **POST** /eapi/v1/block/order/execute | Accept Block Trade Order (TRADE) |
| [**accountBlockTradeList**](MarketMakerBlockTradeApi.md#accountBlockTradeList) | **GET** /eapi/v1/block/user-trades | Account Block Trade List (USER_DATA) |
| [**cancelBlockTradeOrder**](MarketMakerBlockTradeApi.md#cancelBlockTradeOrder) | **DELETE** /eapi/v1/block/order/create | Cancel Block Trade Order (TRADE) |
| [**extendBlockTradeOrder**](MarketMakerBlockTradeApi.md#extendBlockTradeOrder) | **PUT** /eapi/v1/block/order/create | Extend Block Trade Order (TRADE) |
| [**newBlockTradeOrder**](MarketMakerBlockTradeApi.md#newBlockTradeOrder) | **POST** /eapi/v1/block/order/create | New Block Trade Order (TRADE) |
| [**queryBlockTradeDetails**](MarketMakerBlockTradeApi.md#queryBlockTradeDetails) | **GET** /eapi/v1/block/order/execute | Query Block Trade Details (USER_DATA) |
| [**queryBlockTradeOrder**](MarketMakerBlockTradeApi.md#queryBlockTradeOrder) | **GET** /eapi/v1/block/order/orders | Query Block Trade Order (TRADE) |


<a id="acceptBlockTradeOrder"></a>
# **acceptBlockTradeOrder**
> AcceptBlockTradeOrderResponse acceptBlockTradeOrder(acceptBlockTradeOrderRequest)

Accept Block Trade Order (TRADE)

Accept a block trade order  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.MarketMakerBlockTradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    MarketMakerBlockTradeApi apiInstance = new MarketMakerBlockTradeApi(defaultClient);
    AcceptBlockTradeOrderRequest acceptBlockTradeOrderRequest = new AcceptBlockTradeOrderRequest(); // AcceptBlockTradeOrderRequest | 
    try {
      AcceptBlockTradeOrderResponse result = apiInstance.acceptBlockTradeOrder(acceptBlockTradeOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketMakerBlockTradeApi#acceptBlockTradeOrder");
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
| **acceptBlockTradeOrderRequest** | [**AcceptBlockTradeOrderRequest**](AcceptBlockTradeOrderRequest.md)|  | |

### Return type

[**AcceptBlockTradeOrderResponse**](AcceptBlockTradeOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Accept Block Trade Order |  -  |

<a id="accountBlockTradeList"></a>
# **accountBlockTradeList**
> AccountBlockTradeListResponse accountBlockTradeList(endTime, startTime, underlying, recvWindow)

Account Block Trade List (USER_DATA)

Gets block trades for a specific account.  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.MarketMakerBlockTradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    MarketMakerBlockTradeApi apiInstance = new MarketMakerBlockTradeApi(defaultClient);
    Long endTime = 56L; // Long | End Time, e.g 1593512200000
    Long startTime = 56L; // Long | Start Time, e.g 1593511200000
    String underlying = "underlying_example"; // String | underlying, e.g BTCUSDT
    Long recvWindow = 56L; // Long | 
    try {
      AccountBlockTradeListResponse result = apiInstance.accountBlockTradeList(endTime, startTime, underlying, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketMakerBlockTradeApi#accountBlockTradeList");
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
| **endTime** | **Long**| End Time, e.g 1593512200000 | [optional] |
| **startTime** | **Long**| Start Time, e.g 1593511200000 | [optional] |
| **underlying** | **String**| underlying, e.g BTCUSDT | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**AccountBlockTradeListResponse**](AccountBlockTradeListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account Block Trade List |  -  |

<a id="cancelBlockTradeOrder"></a>
# **cancelBlockTradeOrder**
> cancelBlockTradeOrder(blockOrderMatchingKey, recvWindow)

Cancel Block Trade Order (TRADE)

Cancel a block trade order.  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.MarketMakerBlockTradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    MarketMakerBlockTradeApi apiInstance = new MarketMakerBlockTradeApi(defaultClient);
    String blockOrderMatchingKey = "blockOrderMatchingKey_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      apiInstance.cancelBlockTradeOrder(blockOrderMatchingKey, recvWindow);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketMakerBlockTradeApi#cancelBlockTradeOrder");
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
| **blockOrderMatchingKey** | **String**|  | |
| **recvWindow** | **Long**|  | [optional] |

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

<a id="extendBlockTradeOrder"></a>
# **extendBlockTradeOrder**
> ExtendBlockTradeOrderResponse extendBlockTradeOrder(extendBlockTradeOrderRequest)

Extend Block Trade Order (TRADE)

Extends a block trade expire time by 30 mins from the current time.  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.MarketMakerBlockTradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    MarketMakerBlockTradeApi apiInstance = new MarketMakerBlockTradeApi(defaultClient);
    ExtendBlockTradeOrderRequest extendBlockTradeOrderRequest = new ExtendBlockTradeOrderRequest(); // ExtendBlockTradeOrderRequest | 
    try {
      ExtendBlockTradeOrderResponse result = apiInstance.extendBlockTradeOrder(extendBlockTradeOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketMakerBlockTradeApi#extendBlockTradeOrder");
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
| **extendBlockTradeOrderRequest** | [**ExtendBlockTradeOrderRequest**](ExtendBlockTradeOrderRequest.md)|  | |

### Return type

[**ExtendBlockTradeOrderResponse**](ExtendBlockTradeOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Extend Block Trade Order |  -  |

<a id="newBlockTradeOrder"></a>
# **newBlockTradeOrder**
> NewBlockTradeOrderResponse newBlockTradeOrder(newBlockTradeOrderRequest)

New Block Trade Order (TRADE)

Send in a new block trade order.  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.MarketMakerBlockTradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    MarketMakerBlockTradeApi apiInstance = new MarketMakerBlockTradeApi(defaultClient);
    NewBlockTradeOrderRequest newBlockTradeOrderRequest = new NewBlockTradeOrderRequest(); // NewBlockTradeOrderRequest | 
    try {
      NewBlockTradeOrderResponse result = apiInstance.newBlockTradeOrder(newBlockTradeOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketMakerBlockTradeApi#newBlockTradeOrder");
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
| **newBlockTradeOrderRequest** | [**NewBlockTradeOrderRequest**](NewBlockTradeOrderRequest.md)|  | |

### Return type

[**NewBlockTradeOrderResponse**](NewBlockTradeOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | New Block Trade Order |  -  |

<a id="queryBlockTradeDetails"></a>
# **queryBlockTradeDetails**
> QueryBlockTradeDetailsResponse queryBlockTradeDetails(blockOrderMatchingKey, recvWindow)

Query Block Trade Details (USER_DATA)

Query block trade details; returns block trade details from counterparty&#39;s perspective.  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.MarketMakerBlockTradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    MarketMakerBlockTradeApi apiInstance = new MarketMakerBlockTradeApi(defaultClient);
    String blockOrderMatchingKey = "blockOrderMatchingKey_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      QueryBlockTradeDetailsResponse result = apiInstance.queryBlockTradeDetails(blockOrderMatchingKey, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketMakerBlockTradeApi#queryBlockTradeDetails");
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
| **blockOrderMatchingKey** | **String**|  | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryBlockTradeDetailsResponse**](QueryBlockTradeDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Block Trade Details |  -  |

<a id="queryBlockTradeOrder"></a>
# **queryBlockTradeOrder**
> QueryBlockTradeOrderResponse queryBlockTradeOrder(blockOrderMatchingKey, endTime, startTime, underlying, recvWindow)

Query Block Trade Order (TRADE)

Check block trade order status.  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.MarketMakerBlockTradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    MarketMakerBlockTradeApi apiInstance = new MarketMakerBlockTradeApi(defaultClient);
    String blockOrderMatchingKey = "blockOrderMatchingKey_example"; // String | If specified, returns the specific block trade associated with the blockOrderMatchingKey
    Long endTime = 56L; // Long | End Time, e.g 1593512200000
    Long startTime = 56L; // Long | Start Time, e.g 1593511200000
    String underlying = "underlying_example"; // String | underlying, e.g BTCUSDT
    Long recvWindow = 56L; // Long | 
    try {
      QueryBlockTradeOrderResponse result = apiInstance.queryBlockTradeOrder(blockOrderMatchingKey, endTime, startTime, underlying, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketMakerBlockTradeApi#queryBlockTradeOrder");
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
| **blockOrderMatchingKey** | **String**| If specified, returns the specific block trade associated with the blockOrderMatchingKey | [optional] |
| **endTime** | **Long**| End Time, e.g 1593512200000 | [optional] |
| **startTime** | **Long**| Start Time, e.g 1593511200000 | [optional] |
| **underlying** | **String**| underlying, e.g BTCUSDT | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryBlockTradeOrderResponse**](QueryBlockTradeOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Block Trade Order |  -  |

