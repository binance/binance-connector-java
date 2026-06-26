# TradeApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchCancelOrders**](TradeApi.md#batchCancelOrders) | **POST** /sapi/v1/w3w/wallet/prediction/trade/batch-cancel | Batch Cancel Orders |
| [**getQuote**](TradeApi.md#getQuote) | **POST** /sapi/v1/w3w/wallet/prediction/trade/get-quote | Get Quote |
| [**placeOrder**](TradeApi.md#placeOrder) | **POST** /sapi/v1/w3w/wallet/prediction/trade/place-order-bundle | Place Order |
| [**queryActiveOrders**](TradeApi.md#queryActiveOrders) | **GET** /sapi/v1/w3w/wallet/prediction/order/list | Query Active Orders |
| [**queryOrderHistory**](TradeApi.md#queryOrderHistory) | **GET** /sapi/v1/w3w/wallet/prediction/order/history | Query Order History |


<a id="batchCancelOrders"></a>
# **batchCancelOrders**
> BatchCancelOrdersResponse batchCancelOrders(batchCancelOrdersRequest)

Batch Cancel Orders

Cancel one or more active prediction orders in a single request. Requires SAS authorization.  **Known Issue — Bracket Encoding Incompatibility:** This endpoint uses indexed bracket notation (&#x60;cancelInfoList[0].orderId&#x60;). Binance SAPI signature verification runs over the **raw, unencoded** canonical string. However, mainstream HTTP libraries (Python &#x60;requests&#x60;, Java &#x60;HttpURLConnection&#x60;/&#x60;URI&#x60;, Go &#x60;net/url&#x60;, Node.js &#x60;url&#x60;) automatically percent-encode &#x60;[&#x60; → &#x60;%5B&#x60; and &#x60;]&#x60; → &#x60;%5D&#x60;, producing a signature mismatch with error &#x60;-1022 Signature for this request is not valid&#x60;. Postman is unaffected because it does not encode keys.  **Workarounds** (use low-level HTTP APIs that do not normalize URLs): - **Python:** use &#x60;http.client&#x60; (stdlib) and hand-build the body string. - **Java:** use &#x60;HttpURLConnection&#x60; and write the raw body bytes directly. - **Go:** use &#x60;strings.NewReader&#x60; with a hand-built body instead of &#x60;url.Values.Encode()&#x60;.  Weight(IP): 200  Security Type: TRADE  Notes: - Use dot notation for nested list fields: &#x60;cancelInfoList[0].orderId&#x60;, &#x60;cancelInfoList[1].orderId&#x60;, etc. - &#x60;vendor&#x60; does not need to be supplied. The server automatically sets the correct vendor (&#x60;predict_fun&#x60;) for every item in the batch.

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    BatchCancelOrdersRequest batchCancelOrdersRequest = new BatchCancelOrdersRequest(); // BatchCancelOrdersRequest | 
    try {
      BatchCancelOrdersResponse result = apiInstance.batchCancelOrders(batchCancelOrdersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#batchCancelOrders");
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
| **batchCancelOrdersRequest** | [**BatchCancelOrdersRequest**](BatchCancelOrdersRequest.md)|  | |

### Return type

[**BatchCancelOrdersResponse**](BatchCancelOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Batch Cancel Orders |  -  |

<a id="getQuote"></a>
# **getQuote**
> GetQuoteResponse getQuote(getQuoteRequest)

Get Quote

Get a price quote for a prediction order. The returned &#x60;quoteId&#x60; must be used in the subsequent Place Order request.  Weight(IP): 200  Security Type: TRADE  Response Notes: - &#x60;feeAmount&#x60; is a string because it is denominated in wei (18 decimals) and may exceed JavaScript&#39;s safe integer range. &#x60;feeDiscountBps&#x60; is also a string to allow fractional basis-point values in the future. &#x60;feeRateBps&#x60; and &#x60;slippageBps&#x60; are integers and will never exceed safe integer bounds. - **MARKET order minimum amount:** For &#x60;MARKET&#x60; orders, &#x60;amountIn&#x60; must be at least approximately **1.5 USDT** (in wei: &#x60;1500000000000000000&#x60;). The exact minimum varies by market liquidity. If the amount is too small, the server returns &#x60;-9000 Your order amount is too small&#x60;. This limit does **not** apply to &#x60;LIMIT&#x60; orders.

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    GetQuoteRequest getQuoteRequest = new GetQuoteRequest(); // GetQuoteRequest | 
    try {
      GetQuoteResponse result = apiInstance.getQuote(getQuoteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#getQuote");
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
| **getQuoteRequest** | [**GetQuoteRequest**](GetQuoteRequest.md)|  | |

### Return type

[**GetQuoteResponse**](GetQuoteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Quote |  -  |

<a id="placeOrder"></a>
# **placeOrder**
> PlaceOrderResponse placeOrder(placeOrderRequest)

Place Order

Place a prediction order using a previously obtained quote. Requires SAS authorization.  Weight(IP): 200  Security Type: TRADE  Notes: - Validation rules:    | orderType | timeInForce   | priceLimit            |   | --------- | ------------- | --------------------- |   | &#x60;MARKET&#x60;  | Must be &#x60;FOK&#x60; | Not required          |   | &#x60;LIMIT&#x60;   | Must be &#x60;GTC&#x60; | Required, must be &gt; 0 |

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    PlaceOrderRequest placeOrderRequest = new PlaceOrderRequest(); // PlaceOrderRequest | 
    try {
      PlaceOrderResponse result = apiInstance.placeOrder(placeOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#placeOrder");
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
| **placeOrderRequest** | [**PlaceOrderRequest**](PlaceOrderRequest.md)|  | |

### Return type

[**PlaceOrderResponse**](PlaceOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Place Order |  -  |

<a id="queryActiveOrders"></a>
# **queryActiveOrders**
> QueryActiveOrdersResponse queryActiveOrders(walletAddress, tradeSide, l1Category, marketId, offset, limit, recvWindow)

Query Active Orders

Get active (open) prediction orders for the authenticated user.  Weight(IP): 200  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String walletAddress = "0x12e32db8817e292508c34111cbc4b23340df542c"; // String | User's prediction wallet address
    TradeSide tradeSide = TradeSide.fromValue("BUY"); // TradeSide | Filter by trade side. Enum: `BUY`, `SELL`
    String l1Category = "crypto"; // String | Filter by level-1 category
    Long marketId = 5567895L; // Long | Filter by market ID
    Integer offset = 0; // Integer | Pagination offset. Default `0`
    Integer limit = 20; // Integer | Page size. Default `20`, range 1–100
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
    try {
      QueryActiveOrdersResponse result = apiInstance.queryActiveOrders(walletAddress, tradeSide, l1Category, marketId, offset, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryActiveOrders");
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
| **walletAddress** | **String**| User&#39;s prediction wallet address | |
| **tradeSide** | [**TradeSide**](.md)| Filter by trade side. Enum: &#x60;BUY&#x60;, &#x60;SELL&#x60; | [optional] [enum: BUY, SELL] |
| **l1Category** | **String**| Filter by level-1 category | [optional] |
| **marketId** | **Long**| Filter by market ID | [optional] |
| **offset** | **Integer**| Pagination offset. Default &#x60;0&#x60; | [optional] |
| **limit** | **Integer**| Page size. Default &#x60;20&#x60;, range 1–100 | [optional] |
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

### Return type

[**QueryActiveOrdersResponse**](QueryActiveOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Query Active Orders |  -  |

<a id="queryOrderHistory"></a>
# **queryOrderHistory**
> QueryOrderHistoryResponse queryOrderHistory(walletAddress, l1Category, orderType, status, startDate, endDate, offset, limit, recvWindow)

Query Order History

Get historical prediction orders (all statuses) for the authenticated user, with optional filters.  Weight(IP): 200  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String walletAddress = "0x12e32db8817e292508c34111cbc4b23340df542c"; // String | User's prediction wallet address
    String l1Category = "crypto"; // String | Filter by level-1 category
    OrderType orderType = OrderType.fromValue("MARKET"); // OrderType | Filter by order type. Enum: `MARKET`, `LIMIT`
    String status = "CLOSED"; // String | Filter by order status
    String startDate = "2026-05-01"; // String | Start date. Format: `yyyy-MM-dd`. Must be ≤ `endDate`
    String endDate = "2026-05-25"; // String | End date. Format: `yyyy-MM-dd`. Must be ≥ `startDate`
    Integer offset = 0; // Integer | Pagination offset. Default `0`
    Integer limit = 20; // Integer | Page size. Default `20`, range 1–100
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
    try {
      QueryOrderHistoryResponse result = apiInstance.queryOrderHistory(walletAddress, l1Category, orderType, status, startDate, endDate, offset, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryOrderHistory");
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
| **walletAddress** | **String**| User&#39;s prediction wallet address | |
| **l1Category** | **String**| Filter by level-1 category | [optional] |
| **orderType** | [**OrderType**](.md)| Filter by order type. Enum: &#x60;MARKET&#x60;, &#x60;LIMIT&#x60; | [optional] [enum: MARKET, LIMIT] |
| **status** | **String**| Filter by order status | [optional] |
| **startDate** | **String**| Start date. Format: &#x60;yyyy-MM-dd&#x60;. Must be ≤ &#x60;endDate&#x60; | [optional] |
| **endDate** | **String**| End date. Format: &#x60;yyyy-MM-dd&#x60;. Must be ≥ &#x60;startDate&#x60; | [optional] |
| **offset** | **Integer**| Pagination offset. Default &#x60;0&#x60; | [optional] |
| **limit** | **Integer**| Page size. Default &#x60;20&#x60;, range 1–100 | [optional] |
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

### Return type

[**QueryOrderHistoryResponse**](QueryOrderHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Query Order History |  -  |

