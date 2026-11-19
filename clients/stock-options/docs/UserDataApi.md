# UserDataApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**currentOpenOptionOrders**](UserDataApi.md#currentOpenOptionOrders) | **GET** /sapi/v1/equity/option/order/open-orders | Current Open Option Orders (USER_DATA) |
| [**exercisableOptions**](UserDataApi.md#exercisableOptions) | **GET** /sapi/v1/equity/option/exercise/exercisable | Exercisable Options (USER_DATA) |
| [**optionExerciseDetail**](UserDataApi.md#optionExerciseDetail) | **GET** /sapi/v1/equity/option/exercise/detail | Option Exercise Detail (USER_DATA) |
| [**optionExerciseHistory**](UserDataApi.md#optionExerciseHistory) | **GET** /sapi/v1/equity/option/exercise/history | Option Exercise History (USER_DATA) |
| [**optionOrderDetail**](UserDataApi.md#optionOrderDetail) | **GET** /sapi/v1/equity/option/order/detail | Option Order Detail (USER_DATA) |
| [**optionOrderHistory**](UserDataApi.md#optionOrderHistory) | **GET** /sapi/v1/equity/option/order/history | Option Order History (USER_DATA) |
| [**optionPositions**](UserDataApi.md#optionPositions) | **GET** /sapi/v1/equity/option/position | Option Positions (USER_DATA) |
| [**optionSettlementEventDetail**](UserDataApi.md#optionSettlementEventDetail) | **GET** /sapi/v1/equity/option/event/detail | Option Settlement Event Detail (USER_DATA) |
| [**optionSettlementEventHistory**](UserDataApi.md#optionSettlementEventHistory) | **GET** /sapi/v1/equity/option/event/history | Option Settlement Event History (USER_DATA) |
| [**optionTradeHistory**](UserDataApi.md#optionTradeHistory) | **GET** /sapi/v1/equity/option/trade/history | Option Trade History (USER_DATA) |


<a id="currentOpenOptionOrders"></a>
# **currentOpenOptionOrders**
> CurrentOpenOptionOrdersResponse currentOpenOptionOrders(recvWindow)

Current Open Option Orders (USER_DATA)

Query all of the caller&#39;s open **option** orders, including the remaining quantity of partially filled orders. Stock orders are not included.  Weight: 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.stock_options.ApiClient;
import com.binance.connector.client.stock_options.ApiException;
import com.binance.connector.client.stock_options.Configuration;
import com.binance.connector.client.stock_options.models.*;
import com.binance.connector.client.stock_options.rest.api.UserDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    UserDataApi apiInstance = new UserDataApi(defaultClient);
    Long recvWindow = 5000L; // Long | The value cannot be greater than `60000`.
    try {
      CurrentOpenOptionOrdersResponse result = apiInstance.currentOpenOptionOrders(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataApi#currentOpenOptionOrders");
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
| **recvWindow** | **Long**| The value cannot be greater than &#x60;60000&#x60;. | [optional] |

### Return type

[**CurrentOpenOptionOrdersResponse**](CurrentOpenOptionOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current Open Option Orders |  -  |

<a id="exercisableOptions"></a>
# **exercisableOptions**
> ExercisableOptionsResponse exercisableOptions(recvWindow)

Exercisable Options (USER_DATA)

Returns the contracts that can currently be exercised. Only **long** positions are exercisable; the short side is the assigned party and has no exercise right.  &#x60;availableQty&#x60; is the maximum quantity for Submit Option Exercise.  Weight: 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.stock_options.ApiClient;
import com.binance.connector.client.stock_options.ApiException;
import com.binance.connector.client.stock_options.Configuration;
import com.binance.connector.client.stock_options.models.*;
import com.binance.connector.client.stock_options.rest.api.UserDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    UserDataApi apiInstance = new UserDataApi(defaultClient);
    Long recvWindow = 5000L; // Long | The value cannot be greater than `60000`.
    try {
      ExercisableOptionsResponse result = apiInstance.exercisableOptions(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataApi#exercisableOptions");
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
| **recvWindow** | **Long**| The value cannot be greater than &#x60;60000&#x60;. | [optional] |

### Return type

[**ExercisableOptionsResponse**](ExercisableOptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Exercisable Options |  -  |

<a id="optionExerciseDetail"></a>
# **optionExerciseDetail**
> OptionExerciseDetailResponse optionExerciseDetail(tranId, clientOrderId, recvWindow)

Option Exercise Detail (USER_DATA)

Query the result of a single exercise request. Provide at least one of &#x60;tranId&#x60; and &#x60;clientOrderId&#x60;; omitting both returns &#x60;-1102&#x60;. If both are provided, the lookup uses &#x60;clientOrderId&#x60; and &#x60;tranId&#x60; is ignored (the opposite of Option Order Detail).  Returns &#x60;497402 Order not found.&#x60; if no record is found or the record does not belong to the caller.  &#x60;errorCode&#x60; is returned only when &#x60;status&#x60; is &#x60;FAILED&#x60;.  Weight: 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.stock_options.ApiClient;
import com.binance.connector.client.stock_options.ApiException;
import com.binance.connector.client.stock_options.Configuration;
import com.binance.connector.client.stock_options.models.*;
import com.binance.connector.client.stock_options.rest.api.UserDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    UserDataApi apiInstance = new UserDataApi(defaultClient);
    Long tranId = 1234567890L; // Long | Exercise transaction ID returned by Submit Option Exercise.
    String clientOrderId = "web_2c9c92b74f1e4a7c8f3b9e1a2d3c4b5a"; // String | Client ID used at submission.
    Long recvWindow = 5000L; // Long | The value cannot be greater than `60000`.
    try {
      OptionExerciseDetailResponse result = apiInstance.optionExerciseDetail(tranId, clientOrderId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataApi#optionExerciseDetail");
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
| **tranId** | **Long**| Exercise transaction ID returned by Submit Option Exercise. | [optional] |
| **clientOrderId** | **String**| Client ID used at submission. | [optional] |
| **recvWindow** | **Long**| The value cannot be greater than &#x60;60000&#x60;. | [optional] |

### Return type

[**OptionExerciseDetailResponse**](OptionExerciseDetailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Option Exercise Detail |  -  |

<a id="optionExerciseHistory"></a>
# **optionExerciseHistory**
> OptionExerciseHistoryResponse optionExerciseHistory(status, startTime, endTime, current, size, recvWindow)

Option Exercise History (USER_DATA)

Paged exercise history.  Weight: 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.stock_options.ApiClient;
import com.binance.connector.client.stock_options.ApiException;
import com.binance.connector.client.stock_options.Configuration;
import com.binance.connector.client.stock_options.models.*;
import com.binance.connector.client.stock_options.rest.api.UserDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    UserDataApi apiInstance = new UserDataApi(defaultClient);
    String status = "SUCCESS,FAILED"; // String | Comma-separated status filter: `PROCESSING` / `SUCCESS` / `FAILED`.
    Long startTime = 1790600000000L; // Long | Start time (ms).
    Long endTime = 1790800000000L; // Long | End time (ms).
    Integer current = 1; // Integer | Page number. Default `1`.
    Integer size = 20; // Integer | Page size. Default `20`, max `100`.
    Long recvWindow = 5000L; // Long | The value cannot be greater than `60000`.
    try {
      OptionExerciseHistoryResponse result = apiInstance.optionExerciseHistory(status, startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataApi#optionExerciseHistory");
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
| **status** | **String**| Comma-separated status filter: &#x60;PROCESSING&#x60; / &#x60;SUCCESS&#x60; / &#x60;FAILED&#x60;. | [optional] |
| **startTime** | **Long**| Start time (ms). | [optional] |
| **endTime** | **Long**| End time (ms). | [optional] |
| **current** | **Integer**| Page number. Default &#x60;1&#x60;. | [optional] |
| **size** | **Integer**| Page size. Default &#x60;20&#x60;, max &#x60;100&#x60;. | [optional] |
| **recvWindow** | **Long**| The value cannot be greater than &#x60;60000&#x60;. | [optional] |

### Return type

[**OptionExerciseHistoryResponse**](OptionExerciseHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Option Exercise History |  -  |

<a id="optionOrderDetail"></a>
# **optionOrderDetail**
> OptionOrderDetailResponse optionOrderDetail(orderId, clientOrderId, recvWindow)

Option Order Detail (USER_DATA)

Query a single option order with its fills and an itemized fee breakdown.  Provide at least one of &#x60;orderId&#x60; and &#x60;clientOrderId&#x60;; omitting both returns &#x60;-1102&#x60;. If both are provided, the order is looked up by &#x60;orderId&#x60;, and &#x60;clientOrderId&#x60; must belong to the same order, otherwise &#x60;486218 Order not found&#x60; is returned.  Only option orders are accepted: the &#x60;orderId&#x60; / &#x60;clientOrderId&#x60; of a stock order returns &#x60;-2013 Order does not exist.&#x60;; an unknown order ID returns &#x60;486218 Order not found&#x60;.  Example: a fully filled buy-to-open order — &#x60;filledTotal&#x60; &#x3D; &#x60;total&#x60; &#x3D; 1.48 × 1 × 100 &#x3D; 148 (excluding fees); total fees &#x60;fee&#x60; &#x3D; 0.65 (&#x60;commission&#x60; + &#x60;cat&#x60; + &#x60;orf&#x60; + &#x60;occ&#x60;). &#x60;sec&#x60; / &#x60;taf&#x60; are &#x60;0&#x60; for buy orders. For an order still in progress with no fills, &#x60;fee&#x60; and the itemized fees are not returned (&#x60;platformFee&#x60; is always &#x60;\&quot;0\&quot;&#x60;); for an order canceled or expired without any fill, each fee item is &#x60;\&quot;0\&quot;&#x60;. &#x60;canceledAt&#x60; / &#x60;expiredAt&#x60; are returned only in the corresponding status; &#x60;settlementDate&#x60; is not returned for buy orders.  Weight: 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.stock_options.ApiClient;
import com.binance.connector.client.stock_options.ApiException;
import com.binance.connector.client.stock_options.Configuration;
import com.binance.connector.client.stock_options.models.*;
import com.binance.connector.client.stock_options.rest.api.UserDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    UserDataApi apiInstance = new UserDataApi(defaultClient);
    String orderId = "c3c58f49-7b0d-4b9e-a2db-1a2f9a3b8c71"; // String | Option order ID. Provide at least one of `orderId` and `clientOrderId`.
    String clientOrderId = "web_2c9c92b74f1e4a7c8f3b9e1a2d3c4b5a"; // String | Client order ID. Provide at least one of `orderId` and `clientOrderId`.
    Long recvWindow = 5000L; // Long | The value cannot be greater than `60000`.
    try {
      OptionOrderDetailResponse result = apiInstance.optionOrderDetail(orderId, clientOrderId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataApi#optionOrderDetail");
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
| **orderId** | **String**| Option order ID. Provide at least one of &#x60;orderId&#x60; and &#x60;clientOrderId&#x60;. | [optional] |
| **clientOrderId** | **String**| Client order ID. Provide at least one of &#x60;orderId&#x60; and &#x60;clientOrderId&#x60;. | [optional] |
| **recvWindow** | **Long**| The value cannot be greater than &#x60;60000&#x60;. | [optional] |

### Return type

[**OptionOrderDetailResponse**](OptionOrderDetailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Option Order Detail |  -  |

<a id="optionOrderHistory"></a>
# **optionOrderHistory**
> OptionOrderHistoryResponse optionOrderHistory(startTime, endTime, underlyingSymbol, side, orderStatus, current, size, recvWindow)

Option Order History (USER_DATA)

Paged option order history, sorted by creation time in descending order. Only option orders are returned; stock orders are not included.  Weight: 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.stock_options.ApiClient;
import com.binance.connector.client.stock_options.ApiException;
import com.binance.connector.client.stock_options.Configuration;
import com.binance.connector.client.stock_options.models.*;
import com.binance.connector.client.stock_options.rest.api.UserDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    UserDataApi apiInstance = new UserDataApi(defaultClient);
    Long startTime = 1790100000000L; // Long | Start of the order creation time (`createdAt`) filter (ms). If the span to `endTime` exceeds 180 days, it is truncated to 180 days before `endTime`.
    Long endTime = 1790200000000L; // Long | End of the order creation time (`createdAt`) filter (ms).
    String underlyingSymbol = "NVDA"; // String | Underlying US-equity ticker filter, e.g. `NVDA`, case-insensitive. Matches orders on **all** contracts of that underlying, not a single OCC contract. An unlisted or delisted ticker returns `-26004`.
    Side side = Side.fromValue("BUY"); // Side | `BUY` / `SELL`.
    String orderStatus = "FILLED,CANCELED"; // String | Comma-separated status filter, without spaces: `FILLED` / `PARTIALLY_FILLED` / `CANCELED` / `EXPIRED` / `REJECTED`. If omitted, all statuses are returned except open orders with no fills (`NEW` / `ACCEPTED`, etc.).
    Integer current = 1; // Integer | Page number. Default `1`.
    Integer size = 20; // Integer | Page size. Default `20`, max `100`.
    Long recvWindow = 5000L; // Long | The value cannot be greater than `60000`.
    try {
      OptionOrderHistoryResponse result = apiInstance.optionOrderHistory(startTime, endTime, underlyingSymbol, side, orderStatus, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataApi#optionOrderHistory");
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
| **startTime** | **Long**| Start of the order creation time (&#x60;createdAt&#x60;) filter (ms). If the span to &#x60;endTime&#x60; exceeds 180 days, it is truncated to 180 days before &#x60;endTime&#x60;. | |
| **endTime** | **Long**| End of the order creation time (&#x60;createdAt&#x60;) filter (ms). | |
| **underlyingSymbol** | **String**| Underlying US-equity ticker filter, e.g. &#x60;NVDA&#x60;, case-insensitive. Matches orders on **all** contracts of that underlying, not a single OCC contract. An unlisted or delisted ticker returns &#x60;-26004&#x60;. | [optional] |
| **side** | [**Side**](.md)| &#x60;BUY&#x60; / &#x60;SELL&#x60;. | [optional] [enum: BUY, SELL] |
| **orderStatus** | **String**| Comma-separated status filter, without spaces: &#x60;FILLED&#x60; / &#x60;PARTIALLY_FILLED&#x60; / &#x60;CANCELED&#x60; / &#x60;EXPIRED&#x60; / &#x60;REJECTED&#x60;. If omitted, all statuses are returned except open orders with no fills (&#x60;NEW&#x60; / &#x60;ACCEPTED&#x60;, etc.). | [optional] |
| **current** | **Integer**| Page number. Default &#x60;1&#x60;. | [optional] |
| **size** | **Integer**| Page size. Default &#x60;20&#x60;, max &#x60;100&#x60;. | [optional] |
| **recvWindow** | **Long**| The value cannot be greater than &#x60;60000&#x60;. | [optional] |

### Return type

[**OptionOrderHistoryResponse**](OptionOrderHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Option Order History |  -  |

<a id="optionPositions"></a>
# **optionPositions**
> OptionPositionsResponse optionPositions(recvWindow)

Option Positions (USER_DATA)

Returns all current option positions.  One record per contract; see &#x60;side&#x60; for the direction.  **&#x60;free&#x60; / &#x60;locked&#x60; are signed: negative for short positions.** For example, with 3 short contracts of which 1 is reserved by an open order, &#x60;free&#x60; &#x3D; &#x60;\&quot;-2\&quot;&#x60; and &#x60;locked&#x60; &#x3D; &#x60;\&quot;-1\&quot;&#x60;. When closing (&#x60;SELL_TO_CLOSE&#x60; / &#x60;BUY_TO_CLOSE&#x60;), the quantity you can order is the **absolute value** of &#x60;free&#x60;.  Positions past the last trading time and awaiting settlement are not returned.  Weight: 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.stock_options.ApiClient;
import com.binance.connector.client.stock_options.ApiException;
import com.binance.connector.client.stock_options.Configuration;
import com.binance.connector.client.stock_options.models.*;
import com.binance.connector.client.stock_options.rest.api.UserDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    UserDataApi apiInstance = new UserDataApi(defaultClient);
    Long recvWindow = 5000L; // Long | The value cannot be greater than `60000`.
    try {
      OptionPositionsResponse result = apiInstance.optionPositions(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataApi#optionPositions");
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
| **recvWindow** | **Long**| The value cannot be greater than &#x60;60000&#x60;. | [optional] |

### Return type

[**OptionPositionsResponse**](OptionPositionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Option Positions |  -  |

<a id="optionSettlementEventDetail"></a>
# **optionSettlementEventDetail**
> OptionSettlementEventDetailResponse optionSettlementEventDetail(eventId, recvWindow)

Option Settlement Event Detail (USER_DATA)

Full detail of a single settlement event, including the settlement basis and collateral release. Returns &#x60;-1102&#x60; if &#x60;eventId&#x60; does not exist or does not belong to the caller.  All fields of the history endpoint are included, with two differences: &#x60;contracts&#x60; is an absolute value, and &#x60;eventTime&#x60; is the time the settlement record was created.  For an &#x60;EXPIRY&#x60; event, &#x60;settlementKind&#x60;, &#x60;cashDirection&#x60;, &#x60;amount&#x60; and &#x60;shareDelta&#x60; are not returned. For an &#x60;EXPIRY&#x60; event on a short position (covered call / cash-secured put), &#x60;collateralRelease&#x60; lists the collateral released.  Weight: 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.stock_options.ApiClient;
import com.binance.connector.client.stock_options.ApiException;
import com.binance.connector.client.stock_options.Configuration;
import com.binance.connector.client.stock_options.models.*;
import com.binance.connector.client.stock_options.rest.api.UserDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    UserDataApi apiInstance = new UserDataApi(defaultClient);
    String eventId = "a7f3c2e1-4b5d-4e8f-9c0a-1b2c3d4e5f60"; // String | Event ID from Option Settlement Event History.
    Long recvWindow = 5000L; // Long | The value cannot be greater than `60000`.
    try {
      OptionSettlementEventDetailResponse result = apiInstance.optionSettlementEventDetail(eventId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataApi#optionSettlementEventDetail");
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
| **eventId** | **String**| Event ID from Option Settlement Event History. | |
| **recvWindow** | **Long**| The value cannot be greater than &#x60;60000&#x60;. | [optional] |

### Return type

[**OptionSettlementEventDetailResponse**](OptionSettlementEventDetailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Option Settlement Event Detail |  -  |

<a id="optionSettlementEventHistory"></a>
# **optionSettlementEventHistory**
> OptionSettlementEventHistoryResponse optionSettlementEventHistory(underlyingSymbol, symbol, eventType, startTime, endTime, lastId, size, recvWindow)

Option Settlement Event History (USER_DATA)

Query option settlement events — the settlement outcome of a contract: exercise, assignment or expiry (expired worthless), along with the shares / cash delivered and the collateral released. Sorted by event time in descending order.  These records are on a settlement basis, separate from orders and trades.  **Cursor pagination.** Omit &#x60;lastId&#x60; on the first page, then pass the &#x60;nextLastId&#x60; from the previous page until &#x60;hasMore&#x60; is &#x60;false&#x60;.  Weight: 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.stock_options.ApiClient;
import com.binance.connector.client.stock_options.ApiException;
import com.binance.connector.client.stock_options.Configuration;
import com.binance.connector.client.stock_options.models.*;
import com.binance.connector.client.stock_options.rest.api.UserDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    UserDataApi apiInstance = new UserDataApi(defaultClient);
    String underlyingSymbol = "NVDA"; // String | Underlying US-equity ticker filter.
    String symbol = "NVDA260930C00100000"; // String | OCC contract symbol filter. If both `symbol` and `underlyingSymbol` are sent, `symbol` takes precedence.
    String eventType = "EXERCISE,ASSIGNMENT"; // String | Comma-separated event type filter: `EXERCISE` / `ASSIGNMENT` / `EXPIRY`, case-insensitive.
    Long startTime = 1790700000000L; // Long | Start of the event time (`eventTime`) filter (ms).
    Long endTime = 1790900000000L; // Long | End of the event time (`eventTime`) filter (ms).
    Long lastId = 10086L; // Long | Cursor returned by the previous page. Omit on the first page.
    Integer size = 20; // Integer | Page size. Default `20`, max `100`.
    Long recvWindow = 5000L; // Long | The value cannot be greater than `60000`.
    try {
      OptionSettlementEventHistoryResponse result = apiInstance.optionSettlementEventHistory(underlyingSymbol, symbol, eventType, startTime, endTime, lastId, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataApi#optionSettlementEventHistory");
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
| **underlyingSymbol** | **String**| Underlying US-equity ticker filter. | [optional] |
| **symbol** | **String**| OCC contract symbol filter. If both &#x60;symbol&#x60; and &#x60;underlyingSymbol&#x60; are sent, &#x60;symbol&#x60; takes precedence. | [optional] |
| **eventType** | **String**| Comma-separated event type filter: &#x60;EXERCISE&#x60; / &#x60;ASSIGNMENT&#x60; / &#x60;EXPIRY&#x60;, case-insensitive. | [optional] |
| **startTime** | **Long**| Start of the event time (&#x60;eventTime&#x60;) filter (ms). | [optional] |
| **endTime** | **Long**| End of the event time (&#x60;eventTime&#x60;) filter (ms). | [optional] |
| **lastId** | **Long**| Cursor returned by the previous page. Omit on the first page. | [optional] |
| **size** | **Integer**| Page size. Default &#x60;20&#x60;, max &#x60;100&#x60;. | [optional] |
| **recvWindow** | **Long**| The value cannot be greater than &#x60;60000&#x60;. | [optional] |

### Return type

[**OptionSettlementEventHistoryResponse**](OptionSettlementEventHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Option Settlement Event History |  -  |

<a id="optionTradeHistory"></a>
# **optionTradeHistory**
> OptionTradeHistoryResponse optionTradeHistory(startTime, endTime, underlyingSymbol, side, orderId, current, size, recvWindow)

Option Trade History (USER_DATA)

Paged per-fill option trade history. Only option fills are returned. Option fees are charged per order, so individual fills carry no fee; see &#x60;fee&#x60; in Option Order History / Option Order Detail.  Weight: 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.stock_options.ApiClient;
import com.binance.connector.client.stock_options.ApiException;
import com.binance.connector.client.stock_options.Configuration;
import com.binance.connector.client.stock_options.models.*;
import com.binance.connector.client.stock_options.rest.api.UserDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    UserDataApi apiInstance = new UserDataApi(defaultClient);
    Long startTime = 1790100000000L; // Long | Start of the execution time (`executionAt`) filter (ms).
    Long endTime = 1790200000000L; // Long | End of the execution time (`executionAt`) filter (ms).
    String underlyingSymbol = "NVDA"; // String | Underlying US-equity ticker filter, e.g. `NVDA`, case-insensitive. Matches fills on **all** contracts of that underlying, not a single OCC contract. An unlisted or delisted ticker returns `-26004`.
    Side side = Side.fromValue("BUY"); // Side | `BUY` / `SELL`.
    String orderId = "c3c58f49-7b0d-4b9e-a2db-1a2f9a3b8c71"; // String | Return fills of this order only.
    Integer current = 1; // Integer | Page number. Default `1`.
    Integer size = 20; // Integer | Page size. Default `20`, max `100`.
    Long recvWindow = 5000L; // Long | The value cannot be greater than `60000`.
    try {
      OptionTradeHistoryResponse result = apiInstance.optionTradeHistory(startTime, endTime, underlyingSymbol, side, orderId, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataApi#optionTradeHistory");
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
| **startTime** | **Long**| Start of the execution time (&#x60;executionAt&#x60;) filter (ms). | |
| **endTime** | **Long**| End of the execution time (&#x60;executionAt&#x60;) filter (ms). | |
| **underlyingSymbol** | **String**| Underlying US-equity ticker filter, e.g. &#x60;NVDA&#x60;, case-insensitive. Matches fills on **all** contracts of that underlying, not a single OCC contract. An unlisted or delisted ticker returns &#x60;-26004&#x60;. | [optional] |
| **side** | [**Side**](.md)| &#x60;BUY&#x60; / &#x60;SELL&#x60;. | [optional] [enum: BUY, SELL] |
| **orderId** | **String**| Return fills of this order only. | [optional] |
| **current** | **Integer**| Page number. Default &#x60;1&#x60;. | [optional] |
| **size** | **Integer**| Page size. Default &#x60;20&#x60;, max &#x60;100&#x60;. | [optional] |
| **recvWindow** | **Long**| The value cannot be greater than &#x60;60000&#x60;. | [optional] |

### Return type

[**OptionTradeHistoryResponse**](OptionTradeHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Option Trade History |  -  |

