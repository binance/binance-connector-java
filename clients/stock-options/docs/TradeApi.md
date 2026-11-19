# TradeApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelAllOptionOrders**](TradeApi.md#cancelAllOptionOrders) | **POST** /sapi/v1/equity/option/order/cancel-all | Cancel All Option Orders (TRADE) |
| [**cancelOptionOrder**](TradeApi.md#cancelOptionOrder) | **POST** /sapi/v1/equity/option/order/cancel | Cancel Option Order (TRADE) |
| [**placeOptionOrder**](TradeApi.md#placeOptionOrder) | **POST** /sapi/v1/equity/option/order/place | Place Option Order (TRADE) |
| [**submitOptionExercise**](TradeApi.md#submitOptionExercise) | **POST** /sapi/v1/equity/option/exercise/submit | Submit Option Exercise (TRADE) |


<a id="cancelAllOptionOrders"></a>
# **cancelAllOptionOrders**
> CancelAllOptionOrdersResponse cancelAllOptionOrders(recvWindow)

Cancel All Option Orders (TRADE)

Cancel all of the caller&#39;s open orders.  **This also cancels open stock orders.** Cancel-all is account-level at the broker and does not distinguish asset classes; it is the same operation as &#x60;/sapi/v1/equity/order/cancel-all&#x60;.  To cancel option orders only, fetch them with Current Open Option Orders and cancel each one with Cancel Option Order.  Errors on this endpoint use the Stocks Trading error codes (&#x60;486xxx&#x60;). See Stocks Trading Error Code.  Weight: 1  Security Type: TRADE

### Example
```java
// Import classes:
import com.binance.connector.client.stock_options.ApiClient;
import com.binance.connector.client.stock_options.ApiException;
import com.binance.connector.client.stock_options.Configuration;
import com.binance.connector.client.stock_options.models.*;
import com.binance.connector.client.stock_options.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    Long recvWindow = 5000L; // Long | The value cannot be greater than `60000`.
    try {
      CancelAllOptionOrdersResponse result = apiInstance.cancelAllOptionOrders(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#cancelAllOptionOrders");
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

[**CancelAllOptionOrdersResponse**](CancelAllOptionOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cancel All Option Orders |  -  |

<a id="cancelOptionOrder"></a>
# **cancelOptionOrder**
> CancelOptionOrderResponse cancelOptionOrder(orderId, recvWindow)

Cancel Option Order (TRADE)

Cancel an open order by &#x60;orderId&#x60;.  Cancellation applies to the caller&#39;s own brokerage account and is not restricted by asset class: passing the &#x60;orderId&#x60; of a stock order also cancels it, and &#x60;/sapi/v1/equity/order/cancel&#x60; can likewise cancel option orders. Only the caller&#39;s own orders can be canceled.  Errors on this endpoint use the Stocks Trading error codes (&#x60;486xxx&#x60;). See Stocks Trading Error Code.  Weight: 1  Security Type: TRADE

### Example
```java
// Import classes:
import com.binance.connector.client.stock_options.ApiClient;
import com.binance.connector.client.stock_options.ApiException;
import com.binance.connector.client.stock_options.Configuration;
import com.binance.connector.client.stock_options.models.*;
import com.binance.connector.client.stock_options.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String orderId = "c3c58f49-7b0d-4b9e-a2db-1a2f9a3b8c71"; // String | Option order ID.
    Long recvWindow = 5000L; // Long | The value cannot be greater than `60000`.
    try {
      CancelOptionOrderResponse result = apiInstance.cancelOptionOrder(orderId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#cancelOptionOrder");
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
| **orderId** | **String**| Option order ID. | |
| **recvWindow** | **Long**| The value cannot be greater than &#x60;60000&#x60;. | [optional] |

### Return type

[**CancelOptionOrderResponse**](CancelOptionOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cancel Option Order |  -  |

<a id="placeOptionOrder"></a>
# **placeOptionOrder**
> PlaceOptionOrderResponse placeOptionOrder(symbol, side, quantity, price, quoteAsset, positionIntent, timeInForce, walletType, clientOrderId, recvWindow)

Place Option Order (TRADE)

Place an option limit order.  The server calculates the amount to lock based on &#x60;positionIntent&#x60; and the contract type: buy to open locks the premium plus fees; sell to open locks the underlying shares for a covered call, or the strike-equivalent cash for a cash-secured put. Fees are calculated by the server; callers do not pass payment details.  **&#x60;positionIntent&#x60;**: may be omitted, in which case it is derived from &#x60;side&#x60;: &#x60;BUY&#x60; → &#x60;BUY_TO_OPEN&#x60;, &#x60;SELL&#x60; → &#x60;SELL_TO_CLOSE&#x60;. The derivation is unreliable in two cases, and an order without &#x60;positionIntent&#x60; is rejected (parameter error): a &#x60;BUY&#x60; while you hold a **short** position in the contract (it may be meant as &#x60;BUY_TO_CLOSE&#x60;), and a &#x60;SELL&#x60; while you hold **no long** position in the contract (it can only be &#x60;SELL_TO_OPEN&#x60;). Therefore always pass it for the short side (&#x60;SELL_TO_OPEN&#x60; / &#x60;BUY_TO_CLOSE&#x60;). When passed, it must match &#x60;side&#x60; (&#x60;BUY_*&#x60; with &#x60;BUY&#x60;, &#x60;SELL_*&#x60; with &#x60;SELL&#x60;), otherwise the order is rejected.  Only &#x60;LIMIT&#x60; orders with &#x60;timeInForce &#x3D; DAY&#x60; are supported, and &#x60;quantity&#x60; must be a whole number of contracts.  Resubmitting with the **same** &#x60;clientOrderId&#x60; is idempotent: if the original order was accepted or is still processing, the original order is returned (&#x60;S&#x60; / &#x60;P&#x60;); if the original order failed, &#x60;497401&#x60; is returned.  If the request returns &#x60;497001&#x60;, &#x60;497301&#x60; or a broker-rejection error code after the order has already been submitted to the broker, the order may still be processing. Retry with the **same** &#x60;clientOrderId&#x60; (a replay then returns &#x60;P&#x60;) or query Option Order Detail by &#x60;clientOrderId&#x60; for the final status. Do not retry with a new &#x60;clientOrderId&#x60;.  Rate limit: 200 requests / min (UID).  Weight: 1  Security Type: TRADE

### Example
```java
// Import classes:
import com.binance.connector.client.stock_options.ApiClient;
import com.binance.connector.client.stock_options.ApiException;
import com.binance.connector.client.stock_options.Configuration;
import com.binance.connector.client.stock_options.models.*;
import com.binance.connector.client.stock_options.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "NVDA260930C00100000"; // String | OCC contract symbol.
    Side side = Side.fromValue("BUY"); // Side | `BUY` / `SELL`.
    String quantity = "1"; // String | Number of contracts. Must be a whole number, minimum `1`.
    String price = "1.5"; // String | Limit price (premium) per share, minimum `0.01`, must be a multiple of `tickSize`. For a put `SELL` order it cannot exceed the strike price (`497438`).
    String quoteAsset = "USDC"; // String | Quote asset. Only `USDC` (default) is supported; other values return `497104`.
    PositionIntent positionIntent = PositionIntent.fromValue("BUY_TO_OPEN"); // PositionIntent | May be omitted and derived from `side` (`BUY` → `BUY_TO_OPEN`, `SELL` → `SELL_TO_CLOSE`); always pass it for the short side (`SELL_TO_OPEN` / `BUY_TO_CLOSE`). Must match `side` when passed.
    TimeInForce timeInForce = TimeInForce.fromValue("DAY"); // TimeInForce | Only `DAY` (default) is supported. Other values return a parameter error.
    WalletType walletType = WalletType.fromValue("CARD"); // WalletType | Payment wallet: `CARD` (default) / `MAIN`.
    String clientOrderId = "web_2c9c92b74f1e4a7c8f3b9e1a2d3c4b5a"; // String | Client order ID. Format `^[a-zA-Z0-9-_]{32,36}$`. Generated by the server when omitted.
    Long recvWindow = 5000L; // Long | The value cannot be greater than `60000`.
    try {
      PlaceOptionOrderResponse result = apiInstance.placeOptionOrder(symbol, side, quantity, price, quoteAsset, positionIntent, timeInForce, walletType, clientOrderId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#placeOptionOrder");
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
| **symbol** | **String**| OCC contract symbol. | |
| **side** | [**Side**](.md)| &#x60;BUY&#x60; / &#x60;SELL&#x60;. | [enum: BUY, SELL] |
| **quantity** | **String**| Number of contracts. Must be a whole number, minimum &#x60;1&#x60;. | |
| **price** | **String**| Limit price (premium) per share, minimum &#x60;0.01&#x60;, must be a multiple of &#x60;tickSize&#x60;. For a put &#x60;SELL&#x60; order it cannot exceed the strike price (&#x60;497438&#x60;). | |
| **quoteAsset** | **String**| Quote asset. Only &#x60;USDC&#x60; (default) is supported; other values return &#x60;497104&#x60;. | [optional] |
| **positionIntent** | [**PositionIntent**](.md)| May be omitted and derived from &#x60;side&#x60; (&#x60;BUY&#x60; → &#x60;BUY_TO_OPEN&#x60;, &#x60;SELL&#x60; → &#x60;SELL_TO_CLOSE&#x60;); always pass it for the short side (&#x60;SELL_TO_OPEN&#x60; / &#x60;BUY_TO_CLOSE&#x60;). Must match &#x60;side&#x60; when passed. | [optional] [enum: BUY_TO_OPEN, SELL_TO_CLOSE, SELL_TO_OPEN, BUY_TO_CLOSE] |
| **timeInForce** | [**TimeInForce**](.md)| Only &#x60;DAY&#x60; (default) is supported. Other values return a parameter error. | [optional] [enum: DAY] |
| **walletType** | [**WalletType**](.md)| Payment wallet: &#x60;CARD&#x60; (default) / &#x60;MAIN&#x60;. | [optional] [enum: CARD, MAIN] |
| **clientOrderId** | **String**| Client order ID. Format &#x60;^[a-zA-Z0-9-_]{32,36}$&#x60;. Generated by the server when omitted. | [optional] |
| **recvWindow** | **Long**| The value cannot be greater than &#x60;60000&#x60;. | [optional] |

### Return type

[**PlaceOptionOrderResponse**](PlaceOptionOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Place Option Order |  -  |

<a id="submitOptionExercise"></a>
# **submitOptionExercise**
> SubmitOptionExerciseResponse submitOptionExercise(symbol, quantity, quoteAsset, clientOrderId, recvWindow)

Submit Option Exercise (TRADE)

Submit an exercise request for a long option position.  Requires the &#x60;TRADE&#x60; permission, because exercising changes positions and balances.  **Exercise is asynchronous.** The request returns &#x60;PROCESSING&#x60;; delivery is handled by the broker. Poll Option Exercise Detail for the final status.  &#x60;quantity&#x60; cannot exceed &#x60;availableQty&#x60; from Exercisable Options.  Resubmitting with the **same** &#x60;clientOrderId&#x60; is idempotent: if the original exercise was accepted or is still processing, it is returned with its current status; if it failed, &#x60;497401&#x60; is returned. If the request returns &#x60;497001&#x60;, &#x60;497301&#x60; or a broker-rejection error code, the exercise **may still be processing**: retry with the same &#x60;clientOrderId&#x60; or query Option Exercise Detail by &#x60;clientOrderId&#x60;. Do not resubmit with a new &#x60;clientOrderId&#x60;.  Weight: 1  Security Type: TRADE

### Example
```java
// Import classes:
import com.binance.connector.client.stock_options.ApiClient;
import com.binance.connector.client.stock_options.ApiException;
import com.binance.connector.client.stock_options.Configuration;
import com.binance.connector.client.stock_options.models.*;
import com.binance.connector.client.stock_options.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "NVDA260930C00100000"; // String | OCC contract symbol to exercise.
    String quantity = "1"; // String | Number of contracts to exercise. Whole number, minimum `1`, up to `availableQty`.
    String quoteAsset = "USDC"; // String | Quote asset. Only `USDC` (default) is supported; other values return `497104`.
    String clientOrderId = "web_2c9c92b74f1e4a7c8f3b9e1a2d3c4b5a"; // String | Client ID. Format `^[a-zA-Z0-9-_]{32,36}$`. Generated by the server when omitted.
    Long recvWindow = 5000L; // Long | The value cannot be greater than `60000`.
    try {
      SubmitOptionExerciseResponse result = apiInstance.submitOptionExercise(symbol, quantity, quoteAsset, clientOrderId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#submitOptionExercise");
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
| **symbol** | **String**| OCC contract symbol to exercise. | |
| **quantity** | **String**| Number of contracts to exercise. Whole number, minimum &#x60;1&#x60;, up to &#x60;availableQty&#x60;. | |
| **quoteAsset** | **String**| Quote asset. Only &#x60;USDC&#x60; (default) is supported; other values return &#x60;497104&#x60;. | [optional] |
| **clientOrderId** | **String**| Client ID. Format &#x60;^[a-zA-Z0-9-_]{32,36}$&#x60;. Generated by the server when omitted. | [optional] |
| **recvWindow** | **Long**| The value cannot be greater than &#x60;60000&#x60;. | [optional] |

### Return type

[**SubmitOptionExerciseResponse**](SubmitOptionExerciseResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Submit Option Exercise |  -  |

