# TradeApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelOrder**](TradeApi.md#cancelOrder) | **POST** /order.cancel | Cancel Order (TRADE) |
| [**modifyOrder**](TradeApi.md#modifyOrder) | **POST** /order.modify | Modify Order (TRADE) |
| [**newOrder**](TradeApi.md#newOrder) | **POST** /order.place | New Order(TRADE) |
| [**positionInformation**](TradeApi.md#positionInformation) | **POST** /account.position | Position Information (USER_DATA) |
| [**positionInformationV2**](TradeApi.md#positionInformationV2) | **POST** /v2/account.position | Position Information V2 (USER_DATA) |
| [**queryOrder**](TradeApi.md#queryOrder) | **POST** /order.status | Query Order (USER_DATA) |


<a id="cancelOrder"></a>
# **cancelOrder**
> CancelOrderResponse cancelOrder(cancelOrderRequest)

Cancel Order (TRADE)

Cancel an active order.  * Either &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TradeApi apiInstance = new TradeApi(defaultClient);
    CancelOrderRequest cancelOrderRequest = new CancelOrderRequest(); // CancelOrderRequest | 
    try {
      CancelOrderResponse result = apiInstance.cancelOrder(cancelOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#cancelOrder");
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
| **cancelOrderRequest** | [**CancelOrderRequest**](CancelOrderRequest.md)|  | |

### Return type

[**CancelOrderResponse**](CancelOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cancel Order |  -  |

<a id="modifyOrder"></a>
# **modifyOrder**
> ModifyOrderResponse modifyOrder(modifyOrderRequest)

Modify Order (TRADE)

Order modify function, currently only LIMIT order modification is supported, modified orders will be reordered in the match queue  * Either &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent, and the &#x60;orderId&#x60; will prevail if both are sent. * Both &#x60;quantity&#x60; and &#x60;price&#x60; must be sent, which is different from dapi modify order endpoint. * When the new &#x60;quantity&#x60; or &#x60;price&#x60; doesn&#39;t satisfy PRICE_FILTER / PERCENT_FILTER / LOT_SIZE, amendment will be rejected and the order will stay as it is. * However the order will be cancelled by the amendment in the following situations: * when the order is in partially filled status and the new &#x60;quantity&#x60; &lt;&#x3D; &#x60;executedQty&#x60; * When the order is &#x60;GTX&#x60; and the new price will cause it to be executed immediately * One order can only be modfied for less than 10000 times  Weight: 1 on 10s order rate limit(X-MBX-ORDER-COUNT-10S); 1 on 1min order rate limit(X-MBX-ORDER-COUNT-1M); 1 on IP rate limit(x-mbx-used-weight-1m)

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TradeApi apiInstance = new TradeApi(defaultClient);
    ModifyOrderRequest modifyOrderRequest = new ModifyOrderRequest(); // ModifyOrderRequest | 
    try {
      ModifyOrderResponse result = apiInstance.modifyOrder(modifyOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#modifyOrder");
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
| **modifyOrderRequest** | [**ModifyOrderRequest**](ModifyOrderRequest.md)|  | |

### Return type

[**ModifyOrderResponse**](ModifyOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Modify Order |  -  |

<a id="newOrder"></a>
# **newOrder**
> NewOrderResponse newOrder(newOrderRequest)

New Order(TRADE)

Send in a new order.  * Order with type &#x60;STOP&#x60;,  parameter &#x60;timeInForce&#x60; can be sent ( default &#x60;GTC&#x60;). * Order with type &#x60;TAKE_PROFIT&#x60;,  parameter &#x60;timeInForce&#x60; can be sent ( default &#x60;GTC&#x60;). * Condition orders will be triggered when:  * If parameter&#x60;priceProtect&#x60;is sent as true: * when price reaches the &#x60;stopPrice&#x60; ，the difference rate between \&quot;MARK_PRICE\&quot; and \&quot;CONTRACT_PRICE\&quot; cannot be larger than the \&quot;triggerProtect\&quot; of the symbol * \&quot;triggerProtect\&quot; of a symbol can be got from &#x60;GET /fapi/v1/exchangeInfo&#x60;  * &#x60;STOP&#x60;, &#x60;STOP_MARKET&#x60;: * BUY: latest price (\&quot;MARK_PRICE\&quot; or \&quot;CONTRACT_PRICE\&quot;) &gt;&#x3D; &#x60;stopPrice&#x60; * SELL: latest price (\&quot;MARK_PRICE\&quot; or \&quot;CONTRACT_PRICE\&quot;) &lt;&#x3D; &#x60;stopPrice&#x60; * &#x60;TAKE_PROFIT&#x60;, &#x60;TAKE_PROFIT_MARKET&#x60;: * BUY: latest price (\&quot;MARK_PRICE\&quot; or \&quot;CONTRACT_PRICE\&quot;) &lt;&#x3D; &#x60;stopPrice&#x60; * SELL: latest price (\&quot;MARK_PRICE\&quot; or \&quot;CONTRACT_PRICE\&quot;) &gt;&#x3D; &#x60;stopPrice&#x60; * &#x60;TRAILING_STOP_MARKET&#x60;: * BUY: the lowest price after order placed &#x60;&lt;&#x3D; &#x60;activationPrice&#x60;, and the latest price &gt;&#x60;&#x3D; the lowest price * (1 + &#x60;callbackRate&#x60;) * SELL: the highest price after order placed &gt;&#x3D; &#x60;activationPrice&#x60;, and the latest price &lt;&#x3D; the highest price * (1 - &#x60;callbackRate&#x60;)  * For &#x60;TRAILING_STOP_MARKET&#x60;, if you got such error code. &#x60;&#x60;{\&quot;code\&quot;: -2021, \&quot;msg\&quot;: \&quot;Order would immediately trigger.\&quot;}&#x60;&#x60; means that the parameters you send do not meet the following requirements: * BUY: &#x60;activationPrice&#x60; should be smaller than latest price. * SELL: &#x60;activationPrice&#x60; should be larger than latest price.  * If &#x60;newOrderRespType &#x60; is sent as &#x60;RESULT&#x60; : * &#x60;MARKET&#x60; order: the final FILLED result of the order will be return directly. * &#x60;LIMIT&#x60; order with special &#x60;timeInForce&#x60;: the final status result of the order(FILLED or EXPIRED) will be returned directly.  * &#x60;STOP_MARKET&#x60;, &#x60;TAKE_PROFIT_MARKET&#x60; with &#x60;closePosition&#x60;&#x3D;&#x60;true&#x60;: * Follow the same rules for condition orders. * If triggered，**close all** current long position( if &#x60;SELL&#x60;) or current short position( if &#x60;BUY&#x60;). * Cannot be used with &#x60;quantity&#x60; paremeter * Cannot be used with &#x60;reduceOnly&#x60; parameter * In Hedge Mode,cannot be used with &#x60;BUY&#x60; orders in &#x60;LONG&#x60; position side. and cannot be used with &#x60;SELL&#x60; orders in &#x60;SHORT&#x60; position side  Weight: 0

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TradeApi apiInstance = new TradeApi(defaultClient);
    NewOrderRequest newOrderRequest = new NewOrderRequest(); // NewOrderRequest | 
    try {
      NewOrderResponse result = apiInstance.newOrder(newOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#newOrder");
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
| **newOrderRequest** | [**NewOrderRequest**](NewOrderRequest.md)|  | |

### Return type

[**NewOrderResponse**](NewOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | New Order |  -  |

<a id="positionInformation"></a>
# **positionInformation**
> PositionInformationResponse positionInformation(positionInformationRequest)

Position Information (USER_DATA)

Get current position information.  * Please use with user data stream &#x60;ACCOUNT_UPDATE&#x60; to meet your timeliness and accuracy needs.  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TradeApi apiInstance = new TradeApi(defaultClient);
    PositionInformationRequest positionInformationRequest = new PositionInformationRequest(); // PositionInformationRequest | 
    try {
      PositionInformationResponse result = apiInstance.positionInformation(positionInformationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#positionInformation");
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
| **positionInformationRequest** | [**PositionInformationRequest**](PositionInformationRequest.md)|  | |

### Return type

[**PositionInformationResponse**](PositionInformationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Position Information |  -  |

<a id="positionInformationV2"></a>
# **positionInformationV2**
> PositionInformationV2Response positionInformationV2(positionInformationV2Request)

Position Information V2 (USER_DATA)

Get current position information(only symbol that has position or open orders will be returned).  * Please use with user data stream &#x60;ACCOUNT_UPDATE&#x60; to meet your timeliness and accuracy needs.  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TradeApi apiInstance = new TradeApi(defaultClient);
    PositionInformationV2Request positionInformationV2Request = new PositionInformationV2Request(); // PositionInformationV2Request | 
    try {
      PositionInformationV2Response result = apiInstance.positionInformationV2(positionInformationV2Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#positionInformationV2");
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
| **positionInformationV2Request** | [**PositionInformationV2Request**](PositionInformationV2Request.md)|  | |

### Return type

[**PositionInformationV2Response**](PositionInformationV2Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Position Information V2 |  -  |

<a id="queryOrder"></a>
# **queryOrder**
> QueryOrderResponse queryOrder(queryOrderRequest)

Query Order (USER_DATA)

Check an order&#39;s status.  * These orders will not be found: * order status is &#x60;CANCELED&#x60; or &#x60;EXPIRED&#x60; **AND** order has NO filled trade **AND** created time + 3 days &lt; current time * order create time + 90 days &lt; current time  * Either &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent. * &#x60;orderId&#x60; is self-increment for each specific &#x60;symbol&#x60;  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TradeApi apiInstance = new TradeApi(defaultClient);
    QueryOrderRequest queryOrderRequest = new QueryOrderRequest(); // QueryOrderRequest | 
    try {
      QueryOrderResponse result = apiInstance.queryOrder(queryOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryOrder");
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
| **queryOrderRequest** | [**QueryOrderRequest**](QueryOrderRequest.md)|  | |

### Return type

[**QueryOrderResponse**](QueryOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order |  -  |

