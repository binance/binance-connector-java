# TradeApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelAllEquityOrders**](TradeApi.md#cancelAllEquityOrders) | **POST** /sapi/v1/equity/order/cancel-all | Cancel All Equity Orders (TRADE) |
| [**cancelEquityOrder**](TradeApi.md#cancelEquityOrder) | **POST** /sapi/v1/equity/order/cancel | Cancel Equity Order (TRADE) |
| [**currentOpenOrders**](TradeApi.md#currentOpenOrders) | **GET** /sapi/v1/equity/order/open-orders | Current Open Orders (USER_DATA) |
| [**equityOrderDetail**](TradeApi.md#equityOrderDetail) | **GET** /sapi/v1/equity/order/detail | Equity Order Detail (USER_DATA) |
| [**equityOrderHistory**](TradeApi.md#equityOrderHistory) | **GET** /sapi/v1/equity/order/history | Equity Order History (USER_DATA) |
| [**equityTradeHistory**](TradeApi.md#equityTradeHistory) | **GET** /sapi/v1/equity/trade/history | Equity Trade History (USER_DATA) |
| [**placeEquityOrder**](TradeApi.md#placeEquityOrder) | **POST** /sapi/v1/equity/order/place | Place Equity Order (TRADE) |


<a id="cancelAllEquityOrders"></a>
# **cancelAllEquityOrders**
> CancelAllEquityOrdersResponse cancelAllEquityOrders(recvWindow)

Cancel All Equity Orders (TRADE)

Cancel all open orders for the caller. No request body is required — the scope is all of the caller&#39;s open orders. The downstream service handles idempotency; to inspect per-order outcomes, query &#x60;/order/history&#x60; after the call.  Weight: 1  Security Type: TRADE

### Example
```java
// Import classes:
import com.binance.connector.client.stocks.ApiClient;
import com.binance.connector.client.stocks.ApiException;
import com.binance.connector.client.stocks.Configuration;
import com.binance.connector.client.stocks.models.*;
import com.binance.connector.client.stocks.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    Long recvWindow = 5000L; // Long | The value cannot be greater than `60000`.
    try {
      CancelAllEquityOrdersResponse result = apiInstance.cancelAllEquityOrders(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#cancelAllEquityOrders");
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

[**CancelAllEquityOrdersResponse**](CancelAllEquityOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cancel All Equity Orders |  -  |

<a id="cancelEquityOrder"></a>
# **cancelEquityOrder**
> CancelEquityOrderResponse cancelEquityOrder(orderId, recvWindow)

Cancel Equity Order (TRADE)

Cancel a single open order by its &#x60;orderId&#x60;.  Weight: 1  Security Type: TRADE

### Example
```java
// Import classes:
import com.binance.connector.client.stocks.ApiClient;
import com.binance.connector.client.stocks.ApiException;
import com.binance.connector.client.stocks.Configuration;
import com.binance.connector.client.stocks.models.*;
import com.binance.connector.client.stocks.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String orderId = "c3c58f49-7b0d-4b9e-a2db-1a2f9a3b8c71"; // String | Equity order id returned by `/order/place` or a query endpoint.
    Long recvWindow = 5000L; // Long | The value cannot be greater than `60000`.
    try {
      CancelEquityOrderResponse result = apiInstance.cancelEquityOrder(orderId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#cancelEquityOrder");
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
| **orderId** | **String**| Equity order id returned by &#x60;/order/place&#x60; or a query endpoint. | |
| **recvWindow** | **Long**| The value cannot be greater than &#x60;60000&#x60;. | [optional] |

### Return type

[**CancelEquityOrderResponse**](CancelEquityOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cancel Equity Order |  -  |

<a id="currentOpenOrders"></a>
# **currentOpenOrders**
> CurrentOpenOrdersResponse currentOpenOrders(recvWindow)

Current Open Orders (USER_DATA)

Query all unfinished (open) orders for the caller. No business parameters are needed — user identity is derived from the signature.  Weight: 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.stocks.ApiClient;
import com.binance.connector.client.stocks.ApiException;
import com.binance.connector.client.stocks.Configuration;
import com.binance.connector.client.stocks.models.*;
import com.binance.connector.client.stocks.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    Long recvWindow = 5000L; // Long | The value cannot be greater than `60000`.
    try {
      CurrentOpenOrdersResponse result = apiInstance.currentOpenOrders(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#currentOpenOrders");
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

[**CurrentOpenOrdersResponse**](CurrentOpenOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current Open Orders |  -  |

<a id="equityOrderDetail"></a>
# **equityOrderDetail**
> EquityOrderDetailResponse equityOrderDetail(orderId, clientOrderId, recvWindow)

Equity Order Detail (USER_DATA)

Returns a single order along with its trade execution list. Callers can only read their own orders — the user identity is derived from the signed request.  Weight: 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.stocks.ApiClient;
import com.binance.connector.client.stocks.ApiException;
import com.binance.connector.client.stocks.Configuration;
import com.binance.connector.client.stocks.models.*;
import com.binance.connector.client.stocks.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String orderId = "c3c58f49-7b0d-4b9e-a2db-1a2f9a3b8c71"; // String | Equity order id. Either `orderId` or `clientOrderId` must be provided.
    String clientOrderId = "web_2c9c92b74f1e4a7c8f3b9e1a2d3c4b5a"; // String | Client-supplied order id. Either `orderId` or `clientOrderId` must be provided.
    Long recvWindow = 5000L; // Long | The value cannot be greater than `60000`.
    try {
      EquityOrderDetailResponse result = apiInstance.equityOrderDetail(orderId, clientOrderId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#equityOrderDetail");
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
| **orderId** | **String**| Equity order id. Either &#x60;orderId&#x60; or &#x60;clientOrderId&#x60; must be provided. | [optional] |
| **clientOrderId** | **String**| Client-supplied order id. Either &#x60;orderId&#x60; or &#x60;clientOrderId&#x60; must be provided. | [optional] |
| **recvWindow** | **Long**| The value cannot be greater than &#x60;60000&#x60;. | [optional] |

### Return type

[**EquityOrderDetailResponse**](EquityOrderDetailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Equity Order Detail |  -  |

<a id="equityOrderHistory"></a>
# **equityOrderHistory**
> EquityOrderHistoryResponse equityOrderHistory(startTime, endTime, symbol, orderType, side, orderStatus, current, size, recvWindow)

Equity Order History (USER_DATA)

Paged order history for the caller. Filters by symbol, order type, side, status, and time range.  Weight: 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.stocks.ApiClient;
import com.binance.connector.client.stocks.ApiException;
import com.binance.connector.client.stocks.Configuration;
import com.binance.connector.client.stocks.models.*;
import com.binance.connector.client.stocks.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    Long startTime = 1735800000000L; // Long | Start time (ms epoch).
    Long endTime = 1735900000000L; // Long | End time (ms epoch).
    String symbol = "NVDA"; // String | US-equity ticker filter, e.g. `NVDA`.
    OrderType orderType = OrderType.fromValue("MARKET"); // OrderType | Order type filter: `MARKET` / `LIMIT`.
    Side side = Side.fromValue("BUY"); // Side | Side filter: `BUY` / `SELL`.
    String orderStatus = "FILLED,CANCELED"; // String | Comma-separated status filter. Allowed values: `FILLED`, `PARTIALLY_FILLED`, `CANCELED`, `EXPIRED`, `REJECTED`.
    Integer current = 1; // Integer | Page number, 1-based. Default `1`.
    Integer size = 20; // Integer | Page size. Default `20`, max `100`.
    Long recvWindow = 5000L; // Long | The value cannot be greater than `60000`.
    try {
      EquityOrderHistoryResponse result = apiInstance.equityOrderHistory(startTime, endTime, symbol, orderType, side, orderStatus, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#equityOrderHistory");
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
| **startTime** | **Long**| Start time (ms epoch). | |
| **endTime** | **Long**| End time (ms epoch). | |
| **symbol** | **String**| US-equity ticker filter, e.g. &#x60;NVDA&#x60;. | [optional] |
| **orderType** | [**OrderType**](.md)| Order type filter: &#x60;MARKET&#x60; / &#x60;LIMIT&#x60;. | [optional] [enum: MARKET, LIMIT] |
| **side** | [**Side**](.md)| Side filter: &#x60;BUY&#x60; / &#x60;SELL&#x60;. | [optional] [enum: BUY, SELL] |
| **orderStatus** | **String**| Comma-separated status filter. Allowed values: &#x60;FILLED&#x60;, &#x60;PARTIALLY_FILLED&#x60;, &#x60;CANCELED&#x60;, &#x60;EXPIRED&#x60;, &#x60;REJECTED&#x60;. | [optional] |
| **current** | **Integer**| Page number, 1-based. Default &#x60;1&#x60;. | [optional] |
| **size** | **Integer**| Page size. Default &#x60;20&#x60;, max &#x60;100&#x60;. | [optional] |
| **recvWindow** | **Long**| The value cannot be greater than &#x60;60000&#x60;. | [optional] |

### Return type

[**EquityOrderHistoryResponse**](EquityOrderHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Equity Order History |  -  |

<a id="equityTradeHistory"></a>
# **equityTradeHistory**
> EquityTradeHistoryResponse equityTradeHistory(startTime, endTime, symbol, side, orderId, current, size, recvWindow)

Equity Trade History (USER_DATA)

Paged equity trade (per-fill) history for the caller. Each row is one execution, not one order — a partially filled order produces multiple rows. Filters by symbol, side, specific &#x60;orderId&#x60;, and time range.  Weight: 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.stocks.ApiClient;
import com.binance.connector.client.stocks.ApiException;
import com.binance.connector.client.stocks.Configuration;
import com.binance.connector.client.stocks.models.*;
import com.binance.connector.client.stocks.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    Long startTime = 1735800000000L; // Long | Start time (ms epoch).
    Long endTime = 1735900000000L; // Long | End time (ms epoch).
    String symbol = "NVDA"; // String | US-equity ticker filter, e.g. `NVDA`.
    Side side = Side.fromValue("BUY"); // Side | Side filter: `BUY` / `SELL`.
    String orderId = "c3c58f49-7b0d-4b9e-a2db-1a2f9a3b8c71"; // String | Narrow the result to executions of a single order.
    Integer current = 1; // Integer | Page number, 1-based. Default `1`.
    Integer size = 20; // Integer | Page size. Default `20`, max `100`.
    Long recvWindow = 5000L; // Long | The value cannot be greater than `60000`.
    try {
      EquityTradeHistoryResponse result = apiInstance.equityTradeHistory(startTime, endTime, symbol, side, orderId, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#equityTradeHistory");
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
| **startTime** | **Long**| Start time (ms epoch). | |
| **endTime** | **Long**| End time (ms epoch). | |
| **symbol** | **String**| US-equity ticker filter, e.g. &#x60;NVDA&#x60;. | [optional] |
| **side** | [**Side**](.md)| Side filter: &#x60;BUY&#x60; / &#x60;SELL&#x60;. | [optional] [enum: BUY, SELL] |
| **orderId** | **String**| Narrow the result to executions of a single order. | [optional] |
| **current** | **Integer**| Page number, 1-based. Default &#x60;1&#x60;. | [optional] |
| **size** | **Integer**| Page size. Default &#x60;20&#x60;, max &#x60;100&#x60;. | [optional] |
| **recvWindow** | **Long**| The value cannot be greater than &#x60;60000&#x60;. | [optional] |

### Return type

[**EquityTradeHistoryResponse**](EquityTradeHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Equity Trade History |  -  |

<a id="placeEquityOrder"></a>
# **placeEquityOrder**
> PlaceEquityOrderResponse placeEquityOrder(symbol, side, orderType, quoteAsset, price, quantity, notional, timeInForce, tradingSession, walletType, clientOrderId, tokenize, recvWindow)

Place Equity Order (TRADE)

Place a new equity order. Supports all combinations of &#x60;LIMIT&#x60; / &#x60;MARKET&#x60; × &#x60;BUY&#x60; / &#x60;SELL&#x60;. For &#x60;LIMIT BUY&#x60; orders the commission fee is automatically computed and reserved by the server at placement time — callers submit &#x60;price&#x60; and &#x60;quantity&#x60; only, no &#x60;fee&#x60; field is required.  **Field combination matrix**  | Side | OrderType | Required | Forbidden | | ---- | --------- | -------- | --------- | | BUY | LIMIT | &#x60;price&#x60;, &#x60;quantity&#x60;, &#x60;tradingSession&#x60; | &#x60;notional&#x60; | | BUY | MARKET | &#x60;notional&#x60; | &#x60;price&#x60;, &#x60;quantity&#x60;, &#x60;tradingSession&#x60; | | SELL | LIMIT | &#x60;price&#x60;, &#x60;quantity&#x60;, &#x60;tradingSession&#x60; | &#x60;notional&#x60; | | SELL | MARKET | &#x60;quantity&#x60; | &#x60;price&#x60;, &#x60;notional&#x60;, &#x60;tradingSession&#x60; |  **Fractional shares**: when &#x60;quantity&#x60; has a decimal component, or an order is placed by &#x60;notional&#x60;, it is treated as a fractional-share order. A fractional-share &#x60;GTC&#x60; order must be paired with &#x60;tradingSession &#x3D; EXTENDED&#x60; or &#x60;24H&#x60;.  Rate limit: 200 requests / min (UID).  Weight: 1  Security Type: TRADE

### Example
```java
// Import classes:
import com.binance.connector.client.stocks.ApiClient;
import com.binance.connector.client.stocks.ApiException;
import com.binance.connector.client.stocks.Configuration;
import com.binance.connector.client.stocks.models.*;
import com.binance.connector.client.stocks.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "AAPL"; // String | US stock ticker, e.g. `AAPL`, `TSLA`. Must be a symbol with tokenization enabled — check via `/market/tokenized-assets`.
    Side side = Side.fromValue("BUY"); // Side | `BUY` / `SELL`.
    OrderType orderType = OrderType.fromValue("MARKET"); // OrderType | `MARKET` / `LIMIT`.
    String quoteAsset = "USDC"; // String | Quote asset. Defaults to `USDC`; must be within the server's allowed set.
    String price = "180.50"; // String | **Required** for `LIMIT`; **forbidden** for `MARKET`. Maximum 2 decimal places.
    String quantity = "1"; // String | **Required** for `LIMIT` (both sides) and `SELL MARKET`; **forbidden** for `BUY MARKET`.
    String notional = "1000.00"; // String | **Required** for `BUY MARKET`; **forbidden** for `LIMIT` and `SELL MARKET`.
    TimeInForce timeInForce = TimeInForce.fromValue("DAY"); // TimeInForce | `DAY` (default) / `GTC`. `GTC` is only supported for `LIMIT` orders; a fractional-share `GTC` order must be paired with `tradingSession = EXTENDED` or `24H`.
    TradingSession tradingSession = TradingSession.fromValue("RTH"); // TradingSession | `RTH` / `EXTENDED` / `24H`. **Required** for `LIMIT`; **forbidden** for `MARKET`.
    WalletType walletType = WalletType.fromValue("CARD"); // WalletType | Payment wallet for `BUY` orders: `CARD` (default) / `MAIN`. `SELL` orders always settle to `CARD`.
    String clientOrderId = "web_2c9c92b74f1e4a7c8f3b9e1a2d3c4b5a"; // String | Client-supplied order id. Format `^[a-zA-Z0-9-_]{32,36}$`. Auto-generated when omitted.
    Boolean tokenize = true; // Boolean | Whether to tokenize the purchased stock asset upon settlement. Default `true`. Set to `false` to receive the underlying equity directly instead of a tokenized asset.
    Long recvWindow = 5000L; // Long | The value cannot be greater than `60000`.
    try {
      PlaceEquityOrderResponse result = apiInstance.placeEquityOrder(symbol, side, orderType, quoteAsset, price, quantity, notional, timeInForce, tradingSession, walletType, clientOrderId, tokenize, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#placeEquityOrder");
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
| **symbol** | **String**| US stock ticker, e.g. &#x60;AAPL&#x60;, &#x60;TSLA&#x60;. Must be a symbol with tokenization enabled — check via &#x60;/market/tokenized-assets&#x60;. | |
| **side** | [**Side**](.md)| &#x60;BUY&#x60; / &#x60;SELL&#x60;. | [enum: BUY, SELL] |
| **orderType** | [**OrderType**](.md)| &#x60;MARKET&#x60; / &#x60;LIMIT&#x60;. | [enum: MARKET, LIMIT] |
| **quoteAsset** | **String**| Quote asset. Defaults to &#x60;USDC&#x60;; must be within the server&#39;s allowed set. | [optional] |
| **price** | **String**| **Required** for &#x60;LIMIT&#x60;; **forbidden** for &#x60;MARKET&#x60;. Maximum 2 decimal places. | [optional] |
| **quantity** | **String**| **Required** for &#x60;LIMIT&#x60; (both sides) and &#x60;SELL MARKET&#x60;; **forbidden** for &#x60;BUY MARKET&#x60;. | [optional] |
| **notional** | **String**| **Required** for &#x60;BUY MARKET&#x60;; **forbidden** for &#x60;LIMIT&#x60; and &#x60;SELL MARKET&#x60;. | [optional] |
| **timeInForce** | [**TimeInForce**](.md)| &#x60;DAY&#x60; (default) / &#x60;GTC&#x60;. &#x60;GTC&#x60; is only supported for &#x60;LIMIT&#x60; orders; a fractional-share &#x60;GTC&#x60; order must be paired with &#x60;tradingSession &#x3D; EXTENDED&#x60; or &#x60;24H&#x60;. | [optional] [enum: DAY, GTC] |
| **tradingSession** | [**TradingSession**](.md)| &#x60;RTH&#x60; / &#x60;EXTENDED&#x60; / &#x60;24H&#x60;. **Required** for &#x60;LIMIT&#x60;; **forbidden** for &#x60;MARKET&#x60;. | [optional] [enum: RTH, EXTENDED, 24H] |
| **walletType** | [**WalletType**](.md)| Payment wallet for &#x60;BUY&#x60; orders: &#x60;CARD&#x60; (default) / &#x60;MAIN&#x60;. &#x60;SELL&#x60; orders always settle to &#x60;CARD&#x60;. | [optional] [enum: CARD, MAIN] |
| **clientOrderId** | **String**| Client-supplied order id. Format &#x60;^[a-zA-Z0-9-_]{32,36}$&#x60;. Auto-generated when omitted. | [optional] |
| **tokenize** | **Boolean**| Whether to tokenize the purchased stock asset upon settlement. Default &#x60;true&#x60;. Set to &#x60;false&#x60; to receive the underlying equity directly instead of a tokenized asset. | [optional] |
| **recvWindow** | **Long**| The value cannot be greater than &#x60;60000&#x60;. | [optional] |

### Return type

[**PlaceEquityOrderResponse**](PlaceEquityOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Place Equity Order |  -  |

