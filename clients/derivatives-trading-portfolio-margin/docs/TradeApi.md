# TradeApi

All URIs are relative to *https://papi.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelAllCmOpenConditionalOrders**](TradeApi.md#cancelAllCmOpenConditionalOrders) | **DELETE** /papi/v1/cm/conditional/allOpenOrders | Cancel All CM Open Conditional Orders(TRADE) |
| [**cancelAllCmOpenOrders**](TradeApi.md#cancelAllCmOpenOrders) | **DELETE** /papi/v1/cm/allOpenOrders | Cancel All CM Open Orders(TRADE) |
| [**cancelAllUmOpenConditionalOrders**](TradeApi.md#cancelAllUmOpenConditionalOrders) | **DELETE** /papi/v1/um/conditional/allOpenOrders | Cancel All UM Open Conditional Orders (TRADE) |
| [**cancelAllUmOpenOrders**](TradeApi.md#cancelAllUmOpenOrders) | **DELETE** /papi/v1/um/allOpenOrders | Cancel All UM Open Orders(TRADE) |
| [**cancelCmConditionalOrder**](TradeApi.md#cancelCmConditionalOrder) | **DELETE** /papi/v1/cm/conditional/order | Cancel CM Conditional Order(TRADE) |
| [**cancelCmOrder**](TradeApi.md#cancelCmOrder) | **DELETE** /papi/v1/cm/order | Cancel CM Order(TRADE) |
| [**cancelMarginAccountAllOpenOrdersOnASymbol**](TradeApi.md#cancelMarginAccountAllOpenOrdersOnASymbol) | **DELETE** /papi/v1/margin/allOpenOrders | Cancel Margin Account All Open Orders on a Symbol(TRADE) |
| [**cancelMarginAccountOcoOrders**](TradeApi.md#cancelMarginAccountOcoOrders) | **DELETE** /papi/v1/margin/orderList | Cancel Margin Account OCO Orders(TRADE) |
| [**cancelMarginAccountOrder**](TradeApi.md#cancelMarginAccountOrder) | **DELETE** /papi/v1/margin/order | Cancel Margin Account Order(TRADE) |
| [**cancelUmConditionalOrder**](TradeApi.md#cancelUmConditionalOrder) | **DELETE** /papi/v1/um/conditional/order | Cancel UM Conditional Order(TRADE) |
| [**cancelUmOrder**](TradeApi.md#cancelUmOrder) | **DELETE** /papi/v1/um/order | Cancel UM Order(TRADE) |
| [**cmAccountTradeList**](TradeApi.md#cmAccountTradeList) | **GET** /papi/v1/cm/userTrades | CM Account Trade List(USER_DATA) |
| [**cmPositionAdlQuantileEstimation**](TradeApi.md#cmPositionAdlQuantileEstimation) | **GET** /papi/v1/cm/adlQuantile | CM Position ADL Quantile Estimation(USER_DATA) |
| [**getUmFuturesBnbBurnStatus**](TradeApi.md#getUmFuturesBnbBurnStatus) | **GET** /papi/v1/um/feeBurn | Get UM Futures BNB Burn Status (USER_DATA) |
| [**marginAccountBorrow**](TradeApi.md#marginAccountBorrow) | **POST** /papi/v1/marginLoan | Margin Account Borrow(MARGIN) |
| [**marginAccountNewOco**](TradeApi.md#marginAccountNewOco) | **POST** /papi/v1/margin/order/oco | Margin Account New OCO(TRADE) |
| [**marginAccountRepay**](TradeApi.md#marginAccountRepay) | **POST** /papi/v1/repayLoan | Margin Account Repay(MARGIN) |
| [**marginAccountRepayDebt**](TradeApi.md#marginAccountRepayDebt) | **POST** /papi/v1/margin/repay-debt | Margin Account Repay Debt(TRADE) |
| [**marginAccountTradeList**](TradeApi.md#marginAccountTradeList) | **GET** /papi/v1/margin/myTrades | Margin Account Trade List (USER_DATA) |
| [**modifyCmOrder**](TradeApi.md#modifyCmOrder) | **PUT** /papi/v1/cm/order | Modify CM Order(TRADE) |
| [**modifyUmOrder**](TradeApi.md#modifyUmOrder) | **PUT** /papi/v1/um/order | Modify UM Order(TRADE) |
| [**newCmConditionalOrder**](TradeApi.md#newCmConditionalOrder) | **POST** /papi/v1/cm/conditional/order | New CM Conditional Order(TRADE) |
| [**newCmOrder**](TradeApi.md#newCmOrder) | **POST** /papi/v1/cm/order | New CM Order(TRADE) |
| [**newMarginOrder**](TradeApi.md#newMarginOrder) | **POST** /papi/v1/margin/order | New Margin Order(TRADE) |
| [**newUmConditionalOrder**](TradeApi.md#newUmConditionalOrder) | **POST** /papi/v1/um/conditional/order | New UM Conditional Order (TRADE) |
| [**newUmOrder**](TradeApi.md#newUmOrder) | **POST** /papi/v1/um/order | New UM Order (TRADE) |
| [**queryAllCmConditionalOrders**](TradeApi.md#queryAllCmConditionalOrders) | **GET** /papi/v1/cm/conditional/allOrders | Query All CM Conditional Orders(USER_DATA) |
| [**queryAllCmOrders**](TradeApi.md#queryAllCmOrders) | **GET** /papi/v1/cm/allOrders | Query All CM Orders (USER_DATA) |
| [**queryAllCurrentCmOpenConditionalOrders**](TradeApi.md#queryAllCurrentCmOpenConditionalOrders) | **GET** /papi/v1/cm/conditional/openOrders | Query All Current CM Open Conditional Orders (USER_DATA) |
| [**queryAllCurrentCmOpenOrders**](TradeApi.md#queryAllCurrentCmOpenOrders) | **GET** /papi/v1/cm/openOrders | Query All Current CM Open Orders(USER_DATA) |
| [**queryAllCurrentUmOpenConditionalOrders**](TradeApi.md#queryAllCurrentUmOpenConditionalOrders) | **GET** /papi/v1/um/conditional/openOrders | Query All Current UM Open Conditional Orders(USER_DATA) |
| [**queryAllCurrentUmOpenOrders**](TradeApi.md#queryAllCurrentUmOpenOrders) | **GET** /papi/v1/um/openOrders | Query All Current UM Open Orders(USER_DATA) |
| [**queryAllMarginAccountOrders**](TradeApi.md#queryAllMarginAccountOrders) | **GET** /papi/v1/margin/allOrders | Query All Margin Account Orders (USER_DATA) |
| [**queryAllUmConditionalOrders**](TradeApi.md#queryAllUmConditionalOrders) | **GET** /papi/v1/um/conditional/allOrders | Query All UM Conditional Orders(USER_DATA) |
| [**queryAllUmOrders**](TradeApi.md#queryAllUmOrders) | **GET** /papi/v1/um/allOrders | Query All UM Orders(USER_DATA) |
| [**queryCmConditionalOrderHistory**](TradeApi.md#queryCmConditionalOrderHistory) | **GET** /papi/v1/cm/conditional/orderHistory | Query CM Conditional Order History(USER_DATA) |
| [**queryCmModifyOrderHistory**](TradeApi.md#queryCmModifyOrderHistory) | **GET** /papi/v1/cm/orderAmendment | Query CM Modify Order History(TRADE) |
| [**queryCmOrder**](TradeApi.md#queryCmOrder) | **GET** /papi/v1/cm/order | Query CM Order(USER_DATA) |
| [**queryCurrentCmOpenConditionalOrder**](TradeApi.md#queryCurrentCmOpenConditionalOrder) | **GET** /papi/v1/cm/conditional/openOrder | Query Current CM Open Conditional Order(USER_DATA) |
| [**queryCurrentCmOpenOrder**](TradeApi.md#queryCurrentCmOpenOrder) | **GET** /papi/v1/cm/openOrder | Query Current CM Open Order (USER_DATA) |
| [**queryCurrentMarginOpenOrder**](TradeApi.md#queryCurrentMarginOpenOrder) | **GET** /papi/v1/margin/openOrders | Query Current Margin Open Order (USER_DATA) |
| [**queryCurrentUmOpenConditionalOrder**](TradeApi.md#queryCurrentUmOpenConditionalOrder) | **GET** /papi/v1/um/conditional/openOrder | Query Current UM Open Conditional Order(USER_DATA) |
| [**queryCurrentUmOpenOrder**](TradeApi.md#queryCurrentUmOpenOrder) | **GET** /papi/v1/um/openOrder | Query Current UM Open Order(USER_DATA) |
| [**queryMarginAccountOrder**](TradeApi.md#queryMarginAccountOrder) | **GET** /papi/v1/margin/order | Query Margin Account Order (USER_DATA) |
| [**queryMarginAccountsAllOco**](TradeApi.md#queryMarginAccountsAllOco) | **GET** /papi/v1/margin/allOrderList | Query Margin Account&#39;s all OCO (USER_DATA) |
| [**queryMarginAccountsOco**](TradeApi.md#queryMarginAccountsOco) | **GET** /papi/v1/margin/orderList | Query Margin Account&#39;s OCO (USER_DATA) |
| [**queryMarginAccountsOpenOco**](TradeApi.md#queryMarginAccountsOpenOco) | **GET** /papi/v1/margin/openOrderList | Query Margin Account&#39;s Open OCO (USER_DATA) |
| [**queryUmConditionalOrderHistory**](TradeApi.md#queryUmConditionalOrderHistory) | **GET** /papi/v1/um/conditional/orderHistory | Query UM Conditional Order History(USER_DATA) |
| [**queryUmModifyOrderHistory**](TradeApi.md#queryUmModifyOrderHistory) | **GET** /papi/v1/um/orderAmendment | Query UM Modify Order History(TRADE) |
| [**queryUmOrder**](TradeApi.md#queryUmOrder) | **GET** /papi/v1/um/order | Query UM Order (USER_DATA) |
| [**queryUsersCmForceOrders**](TradeApi.md#queryUsersCmForceOrders) | **GET** /papi/v1/cm/forceOrders | Query User&#39;s CM Force Orders(USER_DATA) |
| [**queryUsersMarginForceOrders**](TradeApi.md#queryUsersMarginForceOrders) | **GET** /papi/v1/margin/forceOrders | Query User&#39;s Margin Force Orders(USER_DATA) |
| [**queryUsersUmForceOrders**](TradeApi.md#queryUsersUmForceOrders) | **GET** /papi/v1/um/forceOrders | Query User&#39;s UM Force Orders (USER_DATA) |
| [**toggleBnbBurnOnUmFuturesTrade**](TradeApi.md#toggleBnbBurnOnUmFuturesTrade) | **POST** /papi/v1/um/feeBurn | Toggle BNB Burn On UM Futures Trade (TRADE) |
| [**umAccountTradeList**](TradeApi.md#umAccountTradeList) | **GET** /papi/v1/um/userTrades | UM Account Trade List(USER_DATA) |
| [**umPositionAdlQuantileEstimation**](TradeApi.md#umPositionAdlQuantileEstimation) | **GET** /papi/v1/um/adlQuantile | UM Position ADL Quantile Estimation(USER_DATA) |


<a id="cancelAllCmOpenConditionalOrders"></a>
# **cancelAllCmOpenConditionalOrders**
> CancelAllCmOpenConditionalOrdersResponse cancelAllCmOpenConditionalOrders(symbol, recvWindow)

Cancel All CM Open Conditional Orders(TRADE)

Cancel All CM Open Conditional Orders  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      CancelAllCmOpenConditionalOrdersResponse result = apiInstance.cancelAllCmOpenConditionalOrders(symbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#cancelAllCmOpenConditionalOrders");
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
| **symbol** | **String**|  | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**CancelAllCmOpenConditionalOrdersResponse**](CancelAllCmOpenConditionalOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cancel All CM Open Conditional Orders |  -  |

<a id="cancelAllCmOpenOrders"></a>
# **cancelAllCmOpenOrders**
> CancelAllCmOpenOrdersResponse cancelAllCmOpenOrders(symbol, recvWindow)

Cancel All CM Open Orders(TRADE)

Cancel all active LIMIT orders on specific symbol  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      CancelAllCmOpenOrdersResponse result = apiInstance.cancelAllCmOpenOrders(symbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#cancelAllCmOpenOrders");
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
| **symbol** | **String**|  | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**CancelAllCmOpenOrdersResponse**](CancelAllCmOpenOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cancel All CM Open Orders |  -  |

<a id="cancelAllUmOpenConditionalOrders"></a>
# **cancelAllUmOpenConditionalOrders**
> CancelAllUmOpenConditionalOrdersResponse cancelAllUmOpenConditionalOrders(symbol, recvWindow)

Cancel All UM Open Conditional Orders (TRADE)

Cancel All UM Open Conditional Orders  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      CancelAllUmOpenConditionalOrdersResponse result = apiInstance.cancelAllUmOpenConditionalOrders(symbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#cancelAllUmOpenConditionalOrders");
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
| **symbol** | **String**|  | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**CancelAllUmOpenConditionalOrdersResponse**](CancelAllUmOpenConditionalOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cancel All UM Open Conditional Orders |  -  |

<a id="cancelAllUmOpenOrders"></a>
# **cancelAllUmOpenOrders**
> CancelAllUmOpenOrdersResponse cancelAllUmOpenOrders(symbol, recvWindow)

Cancel All UM Open Orders(TRADE)

Cancel all active LIMIT orders on specific symbol  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      CancelAllUmOpenOrdersResponse result = apiInstance.cancelAllUmOpenOrders(symbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#cancelAllUmOpenOrders");
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
| **symbol** | **String**|  | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**CancelAllUmOpenOrdersResponse**](CancelAllUmOpenOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cancel All UM Open Orders |  -  |

<a id="cancelCmConditionalOrder"></a>
# **cancelCmConditionalOrder**
> CancelCmConditionalOrderResponse cancelCmConditionalOrder(symbol, strategyId, newClientStrategyId, recvWindow)

Cancel CM Conditional Order(TRADE)

Cancel CM Conditional Order  * Either &#x60;strategyId&#x60; or &#x60;newClientStrategyId&#x60; must be sent.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long strategyId = 56L; // Long | 
    String newClientStrategyId = "newClientStrategyId_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      CancelCmConditionalOrderResponse result = apiInstance.cancelCmConditionalOrder(symbol, strategyId, newClientStrategyId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#cancelCmConditionalOrder");
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
| **symbol** | **String**|  | |
| **strategyId** | **Long**|  | [optional] |
| **newClientStrategyId** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**CancelCmConditionalOrderResponse**](CancelCmConditionalOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cancel CM Conditional Order |  -  |

<a id="cancelCmOrder"></a>
# **cancelCmOrder**
> CancelCmOrderResponse cancelCmOrder(symbol, orderId, origClientOrderId, recvWindow)

Cancel CM Order(TRADE)

Cancel an active LIMIT order  * Either &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long orderId = 56L; // Long | 
    String origClientOrderId = "origClientOrderId_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      CancelCmOrderResponse result = apiInstance.cancelCmOrder(symbol, orderId, origClientOrderId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#cancelCmOrder");
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
| **symbol** | **String**|  | |
| **orderId** | **Long**|  | [optional] |
| **origClientOrderId** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**CancelCmOrderResponse**](CancelCmOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cancel CM Order |  -  |

<a id="cancelMarginAccountAllOpenOrdersOnASymbol"></a>
# **cancelMarginAccountAllOpenOrdersOnASymbol**
> CancelMarginAccountAllOpenOrdersOnASymbolResponse cancelMarginAccountAllOpenOrdersOnASymbol(symbol, recvWindow)

Cancel Margin Account All Open Orders on a Symbol(TRADE)

Cancel Margin Account All Open Orders on a Symbol  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      CancelMarginAccountAllOpenOrdersOnASymbolResponse result = apiInstance.cancelMarginAccountAllOpenOrdersOnASymbol(symbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#cancelMarginAccountAllOpenOrdersOnASymbol");
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
| **symbol** | **String**|  | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**CancelMarginAccountAllOpenOrdersOnASymbolResponse**](CancelMarginAccountAllOpenOrdersOnASymbolResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cancel Margin Account All Open Orders on a Symbol |  -  |

<a id="cancelMarginAccountOcoOrders"></a>
# **cancelMarginAccountOcoOrders**
> CancelMarginAccountOcoOrdersResponse cancelMarginAccountOcoOrders(symbol, orderListId, listClientOrderId, newClientOrderId, recvWindow)

Cancel Margin Account OCO Orders(TRADE)

Cancel Margin Account OCO Orders  * Additional notes: Canceling an individual leg will cancel the entire OCO  Weight: 2

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long orderListId = 56L; // Long | Either `orderListId` or `listClientOrderId` must be provided
    String listClientOrderId = "listClientOrderId_example"; // String | Either `orderListId` or `listClientOrderId` must be provided
    String newClientOrderId = "newClientOrderId_example"; // String | Used to uniquely identify this cancel. Automatically generated by default
    Long recvWindow = 56L; // Long | 
    try {
      CancelMarginAccountOcoOrdersResponse result = apiInstance.cancelMarginAccountOcoOrders(symbol, orderListId, listClientOrderId, newClientOrderId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#cancelMarginAccountOcoOrders");
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
| **symbol** | **String**|  | |
| **orderListId** | **Long**| Either &#x60;orderListId&#x60; or &#x60;listClientOrderId&#x60; must be provided | [optional] |
| **listClientOrderId** | **String**| Either &#x60;orderListId&#x60; or &#x60;listClientOrderId&#x60; must be provided | [optional] |
| **newClientOrderId** | **String**| Used to uniquely identify this cancel. Automatically generated by default | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**CancelMarginAccountOcoOrdersResponse**](CancelMarginAccountOcoOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cancel Margin Account OCO Orders |  -  |

<a id="cancelMarginAccountOrder"></a>
# **cancelMarginAccountOrder**
> CancelMarginAccountOrderResponse cancelMarginAccountOrder(symbol, orderId, origClientOrderId, newClientOrderId, recvWindow)

Cancel Margin Account Order(TRADE)

Cancel Margin Account Order  * Either &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent.  Weight: 2

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long orderId = 56L; // Long | 
    String origClientOrderId = "origClientOrderId_example"; // String | 
    String newClientOrderId = "newClientOrderId_example"; // String | Used to uniquely identify this cancel. Automatically generated by default
    Long recvWindow = 56L; // Long | 
    try {
      CancelMarginAccountOrderResponse result = apiInstance.cancelMarginAccountOrder(symbol, orderId, origClientOrderId, newClientOrderId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#cancelMarginAccountOrder");
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
| **symbol** | **String**|  | |
| **orderId** | **Long**|  | [optional] |
| **origClientOrderId** | **String**|  | [optional] |
| **newClientOrderId** | **String**| Used to uniquely identify this cancel. Automatically generated by default | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**CancelMarginAccountOrderResponse**](CancelMarginAccountOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cancel Margin Account Order |  -  |

<a id="cancelUmConditionalOrder"></a>
# **cancelUmConditionalOrder**
> CancelUmConditionalOrderResponse cancelUmConditionalOrder(symbol, strategyId, newClientStrategyId, recvWindow)

Cancel UM Conditional Order(TRADE)

Cancel UM Conditional Order  * Either &#x60;strategyId&#x60; or &#x60;newClientStrategyId&#x60; must be sent.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long strategyId = 56L; // Long | 
    String newClientStrategyId = "newClientStrategyId_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      CancelUmConditionalOrderResponse result = apiInstance.cancelUmConditionalOrder(symbol, strategyId, newClientStrategyId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#cancelUmConditionalOrder");
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
| **symbol** | **String**|  | |
| **strategyId** | **Long**|  | [optional] |
| **newClientStrategyId** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**CancelUmConditionalOrderResponse**](CancelUmConditionalOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cancel UM Conditional Order |  -  |

<a id="cancelUmOrder"></a>
# **cancelUmOrder**
> CancelUmOrderResponse cancelUmOrder(symbol, orderId, origClientOrderId, recvWindow)

Cancel UM Order(TRADE)

Cancel an active UM LIMIT order  * Either &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long orderId = 56L; // Long | 
    String origClientOrderId = "origClientOrderId_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      CancelUmOrderResponse result = apiInstance.cancelUmOrder(symbol, orderId, origClientOrderId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#cancelUmOrder");
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
| **symbol** | **String**|  | |
| **orderId** | **Long**|  | [optional] |
| **origClientOrderId** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**CancelUmOrderResponse**](CancelUmOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cancel UM Order |  -  |

<a id="cmAccountTradeList"></a>
# **cmAccountTradeList**
> CmAccountTradeListResponse cmAccountTradeList(symbol, pair, startTime, endTime, fromId, limit, recvWindow)

CM Account Trade List(USER_DATA)

Get trades for a specific account and CM symbol.  * Either &#x60;symbol&#x60; or &#x60;pair&#x60; must be sent * &#x60;symbol&#x60; and &#x60;pair&#x60; cannot be sent together * &#x60;pair&#x60; and &#x60;fromId&#x60; cannot be sent together * &#x60;OrderId&#x60; can only be sent together with symbol * If a &#x60;pair&#x60; is sent, tickers for all symbols of the &#x60;pair&#x60; will be returned * The parameter &#x60;fromId&#x60; cannot be sent with &#x60;startTime&#x60; or &#x60;endTime&#x60;  Weight: 20 with symbol, 40 with pair

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    String pair = "pair_example"; // String | 
    Long startTime = 56L; // Long | Timestamp in ms to get funding from INCLUSIVE.
    Long endTime = 56L; // Long | Timestamp in ms to get funding until INCLUSIVE.
    Long fromId = 56L; // Long | Trade id to fetch from. Default gets most recent trades.
    Long limit = 56L; // Long | Default 100; max 1000
    Long recvWindow = 56L; // Long | 
    try {
      CmAccountTradeListResponse result = apiInstance.cmAccountTradeList(symbol, pair, startTime, endTime, fromId, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#cmAccountTradeList");
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
| **symbol** | **String**|  | [optional] |
| **pair** | **String**|  | [optional] |
| **startTime** | **Long**| Timestamp in ms to get funding from INCLUSIVE. | [optional] |
| **endTime** | **Long**| Timestamp in ms to get funding until INCLUSIVE. | [optional] |
| **fromId** | **Long**| Trade id to fetch from. Default gets most recent trades. | [optional] |
| **limit** | **Long**| Default 100; max 1000 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**CmAccountTradeListResponse**](CmAccountTradeListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | CM Account Trade List |  -  |

<a id="cmPositionAdlQuantileEstimation"></a>
# **cmPositionAdlQuantileEstimation**
> CmPositionAdlQuantileEstimationResponse cmPositionAdlQuantileEstimation(symbol, recvWindow)

CM Position ADL Quantile Estimation(USER_DATA)

Query CM Position ADL Quantile Estimation * Values update every 30s. * Values 0, 1, 2, 3, 4 shows the queue position and possibility of ADL from low to high. * For positions of the symbol are in One-way Mode or isolated margined in Hedge Mode, \&quot;LONG\&quot;, \&quot;SHORT\&quot;, and \&quot;BOTH\&quot; will be returned to show the positions&#39; adl quantiles of different position sides. * If the positions of the symbol are crossed margined in Hedge Mode: * \&quot;HEDGE\&quot; as a sign will be returned instead of \&quot;BOTH\&quot;; * A same value caculated on unrealized pnls on long and short sides&#39; positions will be shown for \&quot;LONG\&quot; and \&quot;SHORT\&quot; when there are positions in both of long and short sides.  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      CmPositionAdlQuantileEstimationResponse result = apiInstance.cmPositionAdlQuantileEstimation(symbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#cmPositionAdlQuantileEstimation");
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
| **symbol** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**CmPositionAdlQuantileEstimationResponse**](CmPositionAdlQuantileEstimationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | CM Position ADL Quantile Estimation |  -  |

<a id="getUmFuturesBnbBurnStatus"></a>
# **getUmFuturesBnbBurnStatus**
> GetUmFuturesBnbBurnStatusResponse getUmFuturesBnbBurnStatus(recvWindow)

Get UM Futures BNB Burn Status (USER_DATA)

Get user&#39;s BNB Fee Discount for UM Futures (Fee Discount On or Fee Discount Off )  Weight: 30

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      GetUmFuturesBnbBurnStatusResponse result = apiInstance.getUmFuturesBnbBurnStatus(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#getUmFuturesBnbBurnStatus");
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

[**GetUmFuturesBnbBurnStatusResponse**](GetUmFuturesBnbBurnStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get UM Futures BNB Burn Status |  -  |

<a id="marginAccountBorrow"></a>
# **marginAccountBorrow**
> MarginAccountBorrowResponse marginAccountBorrow(marginAccountBorrowRequest)

Margin Account Borrow(MARGIN)

Apply for a margin loan.  Weight: 100

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    MarginAccountBorrowRequest marginAccountBorrowRequest = new MarginAccountBorrowRequest(); // MarginAccountBorrowRequest | 
    try {
      MarginAccountBorrowResponse result = apiInstance.marginAccountBorrow(marginAccountBorrowRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#marginAccountBorrow");
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
| **marginAccountBorrowRequest** | [**MarginAccountBorrowRequest**](MarginAccountBorrowRequest.md)|  | |

### Return type

[**MarginAccountBorrowResponse**](MarginAccountBorrowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account Borrow |  -  |

<a id="marginAccountNewOco"></a>
# **marginAccountNewOco**
> MarginAccountNewOcoResponse marginAccountNewOco(marginAccountNewOcoRequest)

Margin Account New OCO(TRADE)

Send in a new OCO for a margin account  * Price Restrictions: * &#x60;SELL&#x60;: Limit Price &gt; Last Price &gt; Stop Price * &#x60;BUY&#x60;: Limit Price &lt; Last Price &lt; Stop Price * Quantity Restrictions: * Both legs must have the same quantity * &#x60;ICEBERG&#x60; quantities however do not have to be the same. * Order Rate Limit * &#x60;OCO&#x60; counts as 2 orders against the order rate limit.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    MarginAccountNewOcoRequest marginAccountNewOcoRequest = new MarginAccountNewOcoRequest(); // MarginAccountNewOcoRequest | 
    try {
      MarginAccountNewOcoResponse result = apiInstance.marginAccountNewOco(marginAccountNewOcoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#marginAccountNewOco");
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
| **marginAccountNewOcoRequest** | [**MarginAccountNewOcoRequest**](MarginAccountNewOcoRequest.md)|  | |

### Return type

[**MarginAccountNewOcoResponse**](MarginAccountNewOcoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account New OCO |  -  |

<a id="marginAccountRepay"></a>
# **marginAccountRepay**
> MarginAccountRepayResponse marginAccountRepay(marginAccountRepayRequest)

Margin Account Repay(MARGIN)

Repay for a margin loan.  Weight: 100

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    MarginAccountRepayRequest marginAccountRepayRequest = new MarginAccountRepayRequest(); // MarginAccountRepayRequest | 
    try {
      MarginAccountRepayResponse result = apiInstance.marginAccountRepay(marginAccountRepayRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#marginAccountRepay");
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
| **marginAccountRepayRequest** | [**MarginAccountRepayRequest**](MarginAccountRepayRequest.md)|  | |

### Return type

[**MarginAccountRepayResponse**](MarginAccountRepayResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account Repay |  -  |

<a id="marginAccountRepayDebt"></a>
# **marginAccountRepayDebt**
> MarginAccountRepayDebtResponse marginAccountRepayDebt(marginAccountRepayDebtRequest)

Margin Account Repay Debt(TRADE)

Repay debt for a margin loan.  * The repay asset amount cannot exceed 50000 USD equivalent value for a single request. * If &#x60;amount&#x60; is not sent, all the asset loan will be repaid if having enough specific repay assets. * If &#x60;amount&#x60; is sent, only the certain amount of the asset loan will be repaid if having enough specific repay assets. * The system will use the same asset to repay the loan first (if have) no matter whether put the asset in &#x60;specifyRepayAssets&#x60;  Weight: 3000

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    MarginAccountRepayDebtRequest marginAccountRepayDebtRequest = new MarginAccountRepayDebtRequest(); // MarginAccountRepayDebtRequest | 
    try {
      MarginAccountRepayDebtResponse result = apiInstance.marginAccountRepayDebt(marginAccountRepayDebtRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#marginAccountRepayDebt");
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
| **marginAccountRepayDebtRequest** | [**MarginAccountRepayDebtRequest**](MarginAccountRepayDebtRequest.md)|  | |

### Return type

[**MarginAccountRepayDebtResponse**](MarginAccountRepayDebtResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account Repay Debt |  -  |

<a id="marginAccountTradeList"></a>
# **marginAccountTradeList**
> MarginAccountTradeListResponse marginAccountTradeList(symbol, orderId, startTime, endTime, fromId, limit, recvWindow)

Margin Account Trade List (USER_DATA)

Margin Account Trade List  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long orderId = 56L; // Long | 
    Long startTime = 56L; // Long | Timestamp in ms to get funding from INCLUSIVE.
    Long endTime = 56L; // Long | Timestamp in ms to get funding until INCLUSIVE.
    Long fromId = 56L; // Long | Trade id to fetch from. Default gets most recent trades.
    Long limit = 56L; // Long | Default 100; max 1000
    Long recvWindow = 56L; // Long | 
    try {
      MarginAccountTradeListResponse result = apiInstance.marginAccountTradeList(symbol, orderId, startTime, endTime, fromId, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#marginAccountTradeList");
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
| **symbol** | **String**|  | |
| **orderId** | **Long**|  | [optional] |
| **startTime** | **Long**| Timestamp in ms to get funding from INCLUSIVE. | [optional] |
| **endTime** | **Long**| Timestamp in ms to get funding until INCLUSIVE. | [optional] |
| **fromId** | **Long**| Trade id to fetch from. Default gets most recent trades. | [optional] |
| **limit** | **Long**| Default 100; max 1000 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**MarginAccountTradeListResponse**](MarginAccountTradeListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account Trade List |  -  |

<a id="modifyCmOrder"></a>
# **modifyCmOrder**
> ModifyCmOrderResponse modifyCmOrder(modifyCmOrderRequest)

Modify CM Order(TRADE)

Order modify function, currently only LIMIT order modification is supported, modified orders will be reordered in the match queue  * Either &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent, and the &#x60;orderId&#x60; will prevail if both are sent. * Both &#x60;quantity&#x60; and &#x60;price&#x60; must be sent * When the new &#x60;quantity&#x60; or &#x60;price&#x60; doesn&#39;t satisfy PRICE_FILTER / PERCENT_FILTER / LOT_SIZE, amendment will be rejected and the order will stay as it is. * However the order will be cancelled by the amendment in the following situations: * when the order is in partially filled status and the new &#x60;quantity&#x60; &lt;&#x3D; &#x60;executedQty&#x60; * When the order is &#x60;GTX&#x60; and the new price will cause it to be executed immediately  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    ModifyCmOrderRequest modifyCmOrderRequest = new ModifyCmOrderRequest(); // ModifyCmOrderRequest | 
    try {
      ModifyCmOrderResponse result = apiInstance.modifyCmOrder(modifyCmOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#modifyCmOrder");
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
| **modifyCmOrderRequest** | [**ModifyCmOrderRequest**](ModifyCmOrderRequest.md)|  | |

### Return type

[**ModifyCmOrderResponse**](ModifyCmOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Modify CM Order |  -  |

<a id="modifyUmOrder"></a>
# **modifyUmOrder**
> ModifyUmOrderResponse modifyUmOrder(modifyUmOrderRequest)

Modify UM Order(TRADE)

Order modify function, currently only LIMIT order modification is supported, modified orders will be reordered in the match queue  * Either orderId or origClientOrderId must be sent, and the orderId will prevail if both are sent. * Both quantity and price must be sent * When the new quantity or price doesn&#39;t satisfy PRICE_FILTER / PERCENT_FILTER / LOT_SIZE, amendment will be rejected and the order will stay as it is. * However the order will be cancelled by the amendment in the following situations: * when the order is in partially filled status and the new quantity &lt;&#x3D; executedQty * When the order is GTX and the new price will cause it to be executed immediately  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    ModifyUmOrderRequest modifyUmOrderRequest = new ModifyUmOrderRequest(); // ModifyUmOrderRequest | 
    try {
      ModifyUmOrderResponse result = apiInstance.modifyUmOrder(modifyUmOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#modifyUmOrder");
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
| **modifyUmOrderRequest** | [**ModifyUmOrderRequest**](ModifyUmOrderRequest.md)|  | |

### Return type

[**ModifyUmOrderResponse**](ModifyUmOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Modify UM Order |  -  |

<a id="newCmConditionalOrder"></a>
# **newCmConditionalOrder**
> NewCmConditionalOrderResponse newCmConditionalOrder(newCmConditionalOrderRequest)

New CM Conditional Order(TRADE)

New CM Conditional Order  * Order with type &#x60;STOP/TAKE_PROFIT&#x60;, parameter &#x60;timeInForce&#x60; can be sent ( default &#x60;GTC&#x60;). * Condition orders will be triggered when: * &#x60;STOP&#x60;, &#x60;STOP_MARKET&#x60;: * BUY: \&quot;MARK_PRICE\&quot;  &gt;&#x3D; &#x60;stopPrice&#x60; * SELL: \&quot;MARK_PRICE\&quot; &lt;&#x3D; &#x60;stopPrice&#x60; * &#x60;TAKE_PROFIT&#x60;, &#x60;TAKE_PROFIT_MARKET&#x60;: * BUY: \&quot;MARK_PRICE\&quot; &lt;&#x3D; &#x60;stopPrice&#x60; * SELL: \&quot;MARK_PRICE\&quot; &gt;&#x3D; &#x60;stopPrice&#x60; * &#x60;TRAILING_STOP_MARKET&#x60;: * BUY: the lowest mark price after order placed &#x60;&lt;&#x3D; &#x60;activationPrice&#x60;, and the latest mark price &gt;&#x60;&#x3D; the lowest mark price * (1 + &#x60;callbackRate&#x60;) * SELL: the highest mark price after order placed &gt;&#x3D; &#x60;activationPrice&#x60;, and the latest mark price &lt;&#x3D; the highest mark price * (1 - &#x60;callbackRate&#x60;) * For &#x60;TRAILING_STOP_MARKET&#x60;, if you got such error code. &#x60;{\&quot;code\&quot;: -2021, \&quot;msg\&quot;: \&quot;Order would immediately trigger.\&quot;}&#x60; means that the parameters you send do not meet the following requirements: * BUY: &#x60;activationPrice&#x60; should be smaller than latest mark price. * SELL: &#x60;activationPrice&#x60; should be larger than latest mark price. * Condition orders will be triggered when: * If parameter&#x60;priceProtect&#x60;is sent as true: * when price reaches the &#x60;stopPrice&#x60; ，the difference rate between \&quot;MARK_PRICE\&quot; and \&quot;CONTRACT_PRICE\&quot; cannot be larger than the \&quot;triggerProtect\&quot; of the symbol * \&quot;triggerProtect\&quot; of a symbol can be got from &#x60;GET /fapi/v1/exchangeInfo&#x60; * &#x60;STOP&#x60;, &#x60;STOP_MARKET&#x60;: * BUY: latest price (\&quot;MARK_PRICE\&quot; or \&quot;CONTRACT_PRICE\&quot;) &gt;&#x3D; &#x60;stopPrice&#x60; * SELL: latest price (\&quot;MARK_PRICE\&quot; or \&quot;CONTRACT_PRICE\&quot;) &lt;&#x3D; &#x60;stopPrice&#x60; * &#x60;TAKE_PROFIT&#x60;, &#x60;TAKE_PROFIT_MARKET&#x60;: * BUY: latest price (\&quot;MARK_PRICE\&quot; or \&quot;CONTRACT_PRICE\&quot;) &lt;&#x3D; &#x60;stopPrice&#x60; * SELL: latest price (\&quot;MARK_PRICE\&quot; or \&quot;CONTRACT_PRICE\&quot;) &gt;&#x3D; &#x60;stopPrice&#x60;  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    NewCmConditionalOrderRequest newCmConditionalOrderRequest = new NewCmConditionalOrderRequest(); // NewCmConditionalOrderRequest | 
    try {
      NewCmConditionalOrderResponse result = apiInstance.newCmConditionalOrder(newCmConditionalOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#newCmConditionalOrder");
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
| **newCmConditionalOrderRequest** | [**NewCmConditionalOrderRequest**](NewCmConditionalOrderRequest.md)|  | |

### Return type

[**NewCmConditionalOrderResponse**](NewCmConditionalOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | New CM Conditional Order |  -  |

<a id="newCmOrder"></a>
# **newCmOrder**
> NewCmOrderResponse newCmOrder(newCmOrderRequest)

New CM Order(TRADE)

Place new CM order  * If &#x60;newOrderRespType&#x60; is sent as &#x60;RESULT&#x60; : * &#x60;MARKET&#x60; order: the final FILLED result of the order will be return directly. * &#x60;LIMIT&#x60; order with special &#x60;timeInForce&#x60;: the final status result of the order(FILLED or EXPIRED) will be returned directly.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    NewCmOrderRequest newCmOrderRequest = new NewCmOrderRequest(); // NewCmOrderRequest | 
    try {
      NewCmOrderResponse result = apiInstance.newCmOrder(newCmOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#newCmOrder");
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
| **newCmOrderRequest** | [**NewCmOrderRequest**](NewCmOrderRequest.md)|  | |

### Return type

[**NewCmOrderResponse**](NewCmOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | New CM Order |  -  |

<a id="newMarginOrder"></a>
# **newMarginOrder**
> NewMarginOrderResponse newMarginOrder(newMarginOrderRequest)

New Margin Order(TRADE)

New Margin Order  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    NewMarginOrderRequest newMarginOrderRequest = new NewMarginOrderRequest(); // NewMarginOrderRequest | 
    try {
      NewMarginOrderResponse result = apiInstance.newMarginOrder(newMarginOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#newMarginOrder");
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
| **newMarginOrderRequest** | [**NewMarginOrderRequest**](NewMarginOrderRequest.md)|  | |

### Return type

[**NewMarginOrderResponse**](NewMarginOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | New Margin Order |  -  |

<a id="newUmConditionalOrder"></a>
# **newUmConditionalOrder**
> NewUmConditionalOrderResponse newUmConditionalOrder(newUmConditionalOrderRequest)

New UM Conditional Order (TRADE)

Place new UM conditional order  * Order with type &#x60;STOP/TAKE_PROFIT&#x60;, parameter &#x60;timeInForce&#x60; can be sent ( default &#x60;GTC&#x60;). * Condition orders will be triggered when: * &#x60;STOP&#x60;, &#x60;STOP_MARKET&#x60;: * BUY: \&quot;MARK_PRICE\&quot;  &gt;&#x3D; &#x60;stopPrice&#x60; * SELL: \&quot;MARK_PRICE\&quot; &lt;&#x3D; &#x60;stopPrice&#x60; * &#x60;TAKE_PROFIT&#x60;, &#x60;TAKE_PROFIT_MARKET&#x60;: * BUY: \&quot;MARK_PRICE\&quot; &lt;&#x3D; &#x60;stopPrice&#x60; * SELL: \&quot;MARK_PRICE\&quot; &gt;&#x3D; &#x60;stopPrice&#x60; * &#x60;TRAILING_STOP_MARKET&#x60;: * BUY: the lowest mark price after order placed &#x60;&lt;&#x3D; &#x60;activationPrice&#x60;, and the latest mark price &gt;&#x60;&#x3D; the lowest mark price * (1 + &#x60;callbackRate&#x60;) * SELL: the highest mark price after order placed &gt;&#x3D; &#x60;activationPrice&#x60;, and the latest mark price &lt;&#x3D; the highest mark price * (1 - &#x60;callbackRate&#x60;) * For &#x60;TRAILING_STOP_MARKET&#x60;, if you got such error code. &#x60;{\&quot;code\&quot;: -2021, \&quot;msg\&quot;: \&quot;Order would immediately trigger.\&quot;}&#x60; means that the parameters you send do not meet the following requirements: * BUY: &#x60;activationPrice&#x60; should be smaller than latest mark price. * SELL: &#x60;activationPrice&#x60; should be larger than latest mark price. * Condition orders will be triggered when: * If parameter&#x60;priceProtect&#x60;is sent as true: * when price reaches the &#x60;stopPrice&#x60; ，the difference rate between \&quot;MARK_PRICE\&quot; and \&quot;CONTRACT_PRICE\&quot; cannot be larger than the \&quot;triggerProtect\&quot; of the symbol * \&quot;triggerProtect\&quot; of a symbol can be got from &#x60;GET /fapi/v1/exchangeInfo&#x60; * &#x60;STOP&#x60;, &#x60;STOP_MARKET&#x60;: * BUY: latest price (\&quot;MARK_PRICE\&quot; or \&quot;CONTRACT_PRICE\&quot;) &gt;&#x3D; &#x60;stopPrice&#x60; * SELL: latest price (\&quot;MARK_PRICE\&quot; or \&quot;CONTRACT_PRICE\&quot;) &lt;&#x3D; &#x60;stopPrice&#x60; * &#x60;TAKE_PROFIT&#x60;, &#x60;TAKE_PROFIT_MARKET&#x60;: * BUY: latest price (\&quot;MARK_PRICE\&quot; or \&quot;CONTRACT_PRICE\&quot;) &lt;&#x3D; &#x60;stopPrice&#x60; * SELL: latest price (\&quot;MARK_PRICE\&quot; or \&quot;CONTRACT_PRICE\&quot;) &gt;&#x3D; &#x60;stopPrice&#x60; * &#x60;selfTradePreventionMode&#x60; is only effective when &#x60;timeInForce&#x60; set to &#x60;IOC&#x60; or &#x60;GTC&#x60; or &#x60;GTD&#x60;. * In extreme market conditions, timeInForce &#x60;GTD&#x60; order auto cancel time might be delayed comparing to &#x60;goodTillDate&#x60;  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    NewUmConditionalOrderRequest newUmConditionalOrderRequest = new NewUmConditionalOrderRequest(); // NewUmConditionalOrderRequest | 
    try {
      NewUmConditionalOrderResponse result = apiInstance.newUmConditionalOrder(newUmConditionalOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#newUmConditionalOrder");
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
| **newUmConditionalOrderRequest** | [**NewUmConditionalOrderRequest**](NewUmConditionalOrderRequest.md)|  | |

### Return type

[**NewUmConditionalOrderResponse**](NewUmConditionalOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | New UM Conditional Order |  -  |

<a id="newUmOrder"></a>
# **newUmOrder**
> NewUmOrderResponse newUmOrder(newUmOrderRequest)

New UM Order (TRADE)

Place new UM order  * If &#x60;newOrderRespType&#x60; is sent as &#x60;RESULT&#x60; : * &#x60;MARKET&#x60; order: the final FILLED result of the order will be return directly. * &#x60;LIMIT&#x60; order with special &#x60;timeInForce&#x60;: the final status result of the order(FILLED or EXPIRED) will be returned directly. * &#x60;selfTradePreventionMode&#x60; is only effective when &#x60;timeInForce&#x60; set to &#x60;IOC&#x60; or &#x60;GTC&#x60; or &#x60;GTD&#x60;. * In extreme market conditions, timeInForce &#x60;GTD&#x60; order auto cancel time might be delayed comparing to &#x60;goodTillDate&#x60;  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    NewUmOrderRequest newUmOrderRequest = new NewUmOrderRequest(); // NewUmOrderRequest | 
    try {
      NewUmOrderResponse result = apiInstance.newUmOrder(newUmOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#newUmOrder");
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
| **newUmOrderRequest** | [**NewUmOrderRequest**](NewUmOrderRequest.md)|  | |

### Return type

[**NewUmOrderResponse**](NewUmOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | New UM Order |  -  |

<a id="queryAllCmConditionalOrders"></a>
# **queryAllCmConditionalOrders**
> QueryAllCmConditionalOrdersResponse queryAllCmConditionalOrders(symbol, strategyId, startTime, endTime, limit, recvWindow)

Query All CM Conditional Orders(USER_DATA)

Query All CM Conditional Orders  * These orders will not be found: * order strategyStatus is &#x60;CANCELED&#x60; or &#x60;EXPIRED&#x60;, **AND** * order has NO filled trade, **AND** * created time + 7 days &lt; current time * The query time period must be less than 7 days( default as the recent 7 days).  Weight: 1 for a single symbol; 40 when the symbol parameter is omitted

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long strategyId = 56L; // Long | 
    Long startTime = 56L; // Long | Timestamp in ms to get funding from INCLUSIVE.
    Long endTime = 56L; // Long | Timestamp in ms to get funding until INCLUSIVE.
    Long limit = 56L; // Long | Default 100; max 1000
    Long recvWindow = 56L; // Long | 
    try {
      QueryAllCmConditionalOrdersResponse result = apiInstance.queryAllCmConditionalOrders(symbol, strategyId, startTime, endTime, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryAllCmConditionalOrders");
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
| **symbol** | **String**|  | [optional] |
| **strategyId** | **Long**|  | [optional] |
| **startTime** | **Long**| Timestamp in ms to get funding from INCLUSIVE. | [optional] |
| **endTime** | **Long**| Timestamp in ms to get funding until INCLUSIVE. | [optional] |
| **limit** | **Long**| Default 100; max 1000 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryAllCmConditionalOrdersResponse**](QueryAllCmConditionalOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All CM Conditional Orders |  -  |

<a id="queryAllCmOrders"></a>
# **queryAllCmOrders**
> QueryAllCmOrdersResponse queryAllCmOrders(symbol, pair, orderId, startTime, endTime, limit, recvWindow)

Query All CM Orders (USER_DATA)

Get all account CM orders; active, canceled, or filled.  * Either &#x60;symbol&#x60; or &#x60;pair&#x60; must be sent. * If &#x60;orderId&#x60; is set, it will get orders &gt;&#x3D; that orderId. Otherwise most recent orders are returned. * These orders will not be found: * order status is &#x60;CANCELED&#x60; or &#x60;EXPIRED&#x60;, **AND** * order has NO filled trade, **AND** * created time + 3 days &lt; current time  Weight: 20 with symbol, 40 with pair

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    String pair = "pair_example"; // String | 
    Long orderId = 56L; // Long | 
    Long startTime = 56L; // Long | Timestamp in ms to get funding from INCLUSIVE.
    Long endTime = 56L; // Long | Timestamp in ms to get funding until INCLUSIVE.
    Long limit = 56L; // Long | Default 100; max 1000
    Long recvWindow = 56L; // Long | 
    try {
      QueryAllCmOrdersResponse result = apiInstance.queryAllCmOrders(symbol, pair, orderId, startTime, endTime, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryAllCmOrders");
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
| **symbol** | **String**|  | |
| **pair** | **String**|  | [optional] |
| **orderId** | **Long**|  | [optional] |
| **startTime** | **Long**| Timestamp in ms to get funding from INCLUSIVE. | [optional] |
| **endTime** | **Long**| Timestamp in ms to get funding until INCLUSIVE. | [optional] |
| **limit** | **Long**| Default 100; max 1000 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryAllCmOrdersResponse**](QueryAllCmOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All CM Orders |  -  |

<a id="queryAllCurrentCmOpenConditionalOrders"></a>
# **queryAllCurrentCmOpenConditionalOrders**
> QueryAllCurrentCmOpenConditionalOrdersResponse queryAllCurrentCmOpenConditionalOrders(symbol, recvWindow)

Query All Current CM Open Conditional Orders (USER_DATA)

Get all open conditional orders on a symbol. **Careful** when accessing this with no symbol.  * If the symbol is not sent, orders for all symbols will be returned in an array.  Weight: 1 for a single symbol; 40 when the symbol parameter is omitted

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      QueryAllCurrentCmOpenConditionalOrdersResponse result = apiInstance.queryAllCurrentCmOpenConditionalOrders(symbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryAllCurrentCmOpenConditionalOrders");
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
| **symbol** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryAllCurrentCmOpenConditionalOrdersResponse**](QueryAllCurrentCmOpenConditionalOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All Current CM Open Conditional Orders |  -  |

<a id="queryAllCurrentCmOpenOrders"></a>
# **queryAllCurrentCmOpenOrders**
> QueryAllCurrentCmOpenOrdersResponse queryAllCurrentCmOpenOrders(symbol, pair, recvWindow)

Query All Current CM Open Orders(USER_DATA)

Get all open orders on a symbol.  * If the symbol is not sent, orders for all symbols will be returned in an array.  Weight: 1 for a single symbol; 40 when the symbol parameter is omitted Careful when accessing this with no symbol.

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    String pair = "pair_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      QueryAllCurrentCmOpenOrdersResponse result = apiInstance.queryAllCurrentCmOpenOrders(symbol, pair, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryAllCurrentCmOpenOrders");
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
| **symbol** | **String**|  | [optional] |
| **pair** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryAllCurrentCmOpenOrdersResponse**](QueryAllCurrentCmOpenOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All Current CM Open Orders |  -  |

<a id="queryAllCurrentUmOpenConditionalOrders"></a>
# **queryAllCurrentUmOpenConditionalOrders**
> QueryAllCurrentUmOpenConditionalOrdersResponse queryAllCurrentUmOpenConditionalOrders(symbol, recvWindow)

Query All Current UM Open Conditional Orders(USER_DATA)

Get all open conditional orders on a symbol.  * If the symbol is not sent, orders for all symbols will be returned in an array.  Weight: 1 for a single symbol; 40 when the symbol parameter is omitted Careful when accessing this with no symbol.

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      QueryAllCurrentUmOpenConditionalOrdersResponse result = apiInstance.queryAllCurrentUmOpenConditionalOrders(symbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryAllCurrentUmOpenConditionalOrders");
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
| **symbol** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryAllCurrentUmOpenConditionalOrdersResponse**](QueryAllCurrentUmOpenConditionalOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All Current UM Open Conditional Orders |  -  |

<a id="queryAllCurrentUmOpenOrders"></a>
# **queryAllCurrentUmOpenOrders**
> QueryAllCurrentUmOpenOrdersResponse queryAllCurrentUmOpenOrders(symbol, recvWindow)

Query All Current UM Open Orders(USER_DATA)

Get all open orders on a symbol.   * If the symbol is not sent, orders for all symbols will be returned in an array.  Weight: 1 for a single symbol; 40 when the symbol parameter is omitted

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      QueryAllCurrentUmOpenOrdersResponse result = apiInstance.queryAllCurrentUmOpenOrders(symbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryAllCurrentUmOpenOrders");
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
| **symbol** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryAllCurrentUmOpenOrdersResponse**](QueryAllCurrentUmOpenOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All Current UM Open Orders |  -  |

<a id="queryAllMarginAccountOrders"></a>
# **queryAllMarginAccountOrders**
> QueryAllMarginAccountOrdersResponse queryAllMarginAccountOrders(symbol, orderId, startTime, endTime, limit, recvWindow)

Query All Margin Account Orders (USER_DATA)

Query All Margin Account Orders  Weight: 100

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long orderId = 56L; // Long | 
    Long startTime = 56L; // Long | Timestamp in ms to get funding from INCLUSIVE.
    Long endTime = 56L; // Long | Timestamp in ms to get funding until INCLUSIVE.
    Long limit = 56L; // Long | Default 100; max 1000
    Long recvWindow = 56L; // Long | 
    try {
      QueryAllMarginAccountOrdersResponse result = apiInstance.queryAllMarginAccountOrders(symbol, orderId, startTime, endTime, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryAllMarginAccountOrders");
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
| **symbol** | **String**|  | |
| **orderId** | **Long**|  | [optional] |
| **startTime** | **Long**| Timestamp in ms to get funding from INCLUSIVE. | [optional] |
| **endTime** | **Long**| Timestamp in ms to get funding until INCLUSIVE. | [optional] |
| **limit** | **Long**| Default 100; max 1000 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryAllMarginAccountOrdersResponse**](QueryAllMarginAccountOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All Margin Account Orders |  -  |

<a id="queryAllUmConditionalOrders"></a>
# **queryAllUmConditionalOrders**
> QueryAllUmConditionalOrdersResponse queryAllUmConditionalOrders(symbol, strategyId, startTime, endTime, limit, recvWindow)

Query All UM Conditional Orders(USER_DATA)

Query All UM Conditional Orders  * These orders will not be found: * order strategyStatus is &#x60;CANCELED&#x60; or &#x60;EXPIRED&#x60;, **AND** * order has NO filled trade, **AND** * created time + 7 days &lt; current time * The query time period must be less than 7 days( default as the recent 7 days).  Weight: 1 for a single symbol; 40 when the symbol parameter is omitted

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long strategyId = 56L; // Long | 
    Long startTime = 56L; // Long | Timestamp in ms to get funding from INCLUSIVE.
    Long endTime = 56L; // Long | Timestamp in ms to get funding until INCLUSIVE.
    Long limit = 56L; // Long | Default 100; max 1000
    Long recvWindow = 56L; // Long | 
    try {
      QueryAllUmConditionalOrdersResponse result = apiInstance.queryAllUmConditionalOrders(symbol, strategyId, startTime, endTime, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryAllUmConditionalOrders");
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
| **symbol** | **String**|  | [optional] |
| **strategyId** | **Long**|  | [optional] |
| **startTime** | **Long**| Timestamp in ms to get funding from INCLUSIVE. | [optional] |
| **endTime** | **Long**| Timestamp in ms to get funding until INCLUSIVE. | [optional] |
| **limit** | **Long**| Default 100; max 1000 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryAllUmConditionalOrdersResponse**](QueryAllUmConditionalOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All UM Conditional Orders |  -  |

<a id="queryAllUmOrders"></a>
# **queryAllUmOrders**
> QueryAllUmOrdersResponse queryAllUmOrders(symbol, orderId, startTime, endTime, limit, recvWindow)

Query All UM Orders(USER_DATA)

Get all account UM orders; active, canceled, or filled. * These orders will not be found: * order status is &#x60;CANCELED&#x60; or &#x60;EXPIRED&#x60;, **AND** * order has NO filled trade, **AND** * created time + 3 days &lt; current time  * If &#x60;orderId&#x60; is set, it will get orders &gt;&#x3D; that orderId. Otherwise most recent orders are returned. * The query time period must be less then 7 days( default as the recent 7 days).  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long orderId = 56L; // Long | 
    Long startTime = 56L; // Long | Timestamp in ms to get funding from INCLUSIVE.
    Long endTime = 56L; // Long | Timestamp in ms to get funding until INCLUSIVE.
    Long limit = 56L; // Long | Default 100; max 1000
    Long recvWindow = 56L; // Long | 
    try {
      QueryAllUmOrdersResponse result = apiInstance.queryAllUmOrders(symbol, orderId, startTime, endTime, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryAllUmOrders");
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
| **symbol** | **String**|  | |
| **orderId** | **Long**|  | [optional] |
| **startTime** | **Long**| Timestamp in ms to get funding from INCLUSIVE. | [optional] |
| **endTime** | **Long**| Timestamp in ms to get funding until INCLUSIVE. | [optional] |
| **limit** | **Long**| Default 100; max 1000 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryAllUmOrdersResponse**](QueryAllUmOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All UM Orders |  -  |

<a id="queryCmConditionalOrderHistory"></a>
# **queryCmConditionalOrderHistory**
> QueryCmConditionalOrderHistoryResponse queryCmConditionalOrderHistory(symbol, strategyId, newClientStrategyId, recvWindow)

Query CM Conditional Order History(USER_DATA)

Query CM Conditional Order History   * Either &#x60;strategyId&#x60; or &#x60;newClientStrategyId&#x60; must be sent. * &#x60;NEW&#x60; orders will not be found. * These orders will not be found: * order status is &#x60;CANCELED&#x60; or &#x60;EXPIRED&#x60;, **AND** * order has NO filled trade, **AND** * created time + 7 days &lt; current time  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long strategyId = 56L; // Long | 
    String newClientStrategyId = "newClientStrategyId_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      QueryCmConditionalOrderHistoryResponse result = apiInstance.queryCmConditionalOrderHistory(symbol, strategyId, newClientStrategyId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryCmConditionalOrderHistory");
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
| **symbol** | **String**|  | |
| **strategyId** | **Long**|  | [optional] |
| **newClientStrategyId** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryCmConditionalOrderHistoryResponse**](QueryCmConditionalOrderHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | CM Conditional Order History |  -  |

<a id="queryCmModifyOrderHistory"></a>
# **queryCmModifyOrderHistory**
> QueryCmModifyOrderHistoryResponse queryCmModifyOrderHistory(symbol, orderId, origClientOrderId, startTime, endTime, limit, recvWindow)

Query CM Modify Order History(TRADE)

Get order modification history  * Either &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent, and the &#x60;orderId&#x60; will prevail if both are sent.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long orderId = 56L; // Long | 
    String origClientOrderId = "origClientOrderId_example"; // String | 
    Long startTime = 56L; // Long | Timestamp in ms to get funding from INCLUSIVE.
    Long endTime = 56L; // Long | Timestamp in ms to get funding until INCLUSIVE.
    Long limit = 56L; // Long | Default 100; max 1000
    Long recvWindow = 56L; // Long | 
    try {
      QueryCmModifyOrderHistoryResponse result = apiInstance.queryCmModifyOrderHistory(symbol, orderId, origClientOrderId, startTime, endTime, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryCmModifyOrderHistory");
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
| **symbol** | **String**|  | |
| **orderId** | **Long**|  | [optional] |
| **origClientOrderId** | **String**|  | [optional] |
| **startTime** | **Long**| Timestamp in ms to get funding from INCLUSIVE. | [optional] |
| **endTime** | **Long**| Timestamp in ms to get funding until INCLUSIVE. | [optional] |
| **limit** | **Long**| Default 100; max 1000 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryCmModifyOrderHistoryResponse**](QueryCmModifyOrderHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | CM Modify Order History |  -  |

<a id="queryCmOrder"></a>
# **queryCmOrder**
> QueryCmOrderResponse queryCmOrder(symbol, orderId, origClientOrderId, recvWindow)

Query CM Order(USER_DATA)

Check an CM order&#39;s status.  * Either &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent. * These orders will not be found: * order status is &#x60;CANCELED&#x60; or &#x60;EXPIRED&#x60;, **AND** * order has NO filled trade, **AND** * created time + 3 days &lt; current time  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long orderId = 56L; // Long | 
    String origClientOrderId = "origClientOrderId_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      QueryCmOrderResponse result = apiInstance.queryCmOrder(symbol, orderId, origClientOrderId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryCmOrder");
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
| **symbol** | **String**|  | |
| **orderId** | **Long**|  | [optional] |
| **origClientOrderId** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryCmOrderResponse**](QueryCmOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | CM Order |  -  |

<a id="queryCurrentCmOpenConditionalOrder"></a>
# **queryCurrentCmOpenConditionalOrder**
> QueryCurrentCmOpenConditionalOrderResponse queryCurrentCmOpenConditionalOrder(symbol, strategyId, newClientStrategyId, recvWindow)

Query Current CM Open Conditional Order(USER_DATA)

Query Current CM Open Conditional Order  * Either &#x60;strategyId&#x60; or &#x60;newClientStrategyId&#x60; must be sent. * If the queried order has been triggered, cancelled or expired, the error message \&quot;Order does not exist\&quot; will be returned.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long strategyId = 56L; // Long | 
    String newClientStrategyId = "newClientStrategyId_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      QueryCurrentCmOpenConditionalOrderResponse result = apiInstance.queryCurrentCmOpenConditionalOrder(symbol, strategyId, newClientStrategyId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryCurrentCmOpenConditionalOrder");
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
| **symbol** | **String**|  | |
| **strategyId** | **Long**|  | [optional] |
| **newClientStrategyId** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryCurrentCmOpenConditionalOrderResponse**](QueryCurrentCmOpenConditionalOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current CM Open Conditional Order |  -  |

<a id="queryCurrentCmOpenOrder"></a>
# **queryCurrentCmOpenOrder**
> QueryCurrentCmOpenOrderResponse queryCurrentCmOpenOrder(symbol, orderId, origClientOrderId, recvWindow)

Query Current CM Open Order (USER_DATA)

Query current CM open order  * Either &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent. * If the queried order has been filled or cancelled, the error message \&quot;Order does not exist\&quot; will be returned.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long orderId = 56L; // Long | 
    String origClientOrderId = "origClientOrderId_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      QueryCurrentCmOpenOrderResponse result = apiInstance.queryCurrentCmOpenOrder(symbol, orderId, origClientOrderId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryCurrentCmOpenOrder");
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
| **symbol** | **String**|  | |
| **orderId** | **Long**|  | [optional] |
| **origClientOrderId** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryCurrentCmOpenOrderResponse**](QueryCurrentCmOpenOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current CM Open Order |  -  |

<a id="queryCurrentMarginOpenOrder"></a>
# **queryCurrentMarginOpenOrder**
> QueryCurrentMarginOpenOrderResponse queryCurrentMarginOpenOrder(symbol, recvWindow)

Query Current Margin Open Order (USER_DATA)

Query Current Margin Open Order  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      QueryCurrentMarginOpenOrderResponse result = apiInstance.queryCurrentMarginOpenOrder(symbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryCurrentMarginOpenOrder");
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
| **symbol** | **String**|  | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryCurrentMarginOpenOrderResponse**](QueryCurrentMarginOpenOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current Margin Open Order |  -  |

<a id="queryCurrentUmOpenConditionalOrder"></a>
# **queryCurrentUmOpenConditionalOrder**
> QueryCurrentUmOpenConditionalOrderResponse queryCurrentUmOpenConditionalOrder(symbol, strategyId, newClientStrategyId, recvWindow)

Query Current UM Open Conditional Order(USER_DATA)

Query Current UM Open Conditional Order  * Either &#x60;strategyId&#x60; or &#x60;newClientStrategyId&#x60; must be sent. * If the queried order has been &#x60;CANCELED&#x60;, &#x60;TRIGGERED&#x60;或&#x60;EXPIRED&#x60;, the error message \&quot;Order does not exist\&quot; will be returned.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long strategyId = 56L; // Long | 
    String newClientStrategyId = "newClientStrategyId_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      QueryCurrentUmOpenConditionalOrderResponse result = apiInstance.queryCurrentUmOpenConditionalOrder(symbol, strategyId, newClientStrategyId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryCurrentUmOpenConditionalOrder");
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
| **symbol** | **String**|  | |
| **strategyId** | **Long**|  | [optional] |
| **newClientStrategyId** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryCurrentUmOpenConditionalOrderResponse**](QueryCurrentUmOpenConditionalOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current UM Open Conditional Order |  -  |

<a id="queryCurrentUmOpenOrder"></a>
# **queryCurrentUmOpenOrder**
> QueryCurrentUmOpenOrderResponse queryCurrentUmOpenOrder(symbol, orderId, origClientOrderId, recvWindow)

Query Current UM Open Order(USER_DATA)

Query current UM open order   * Either &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent. * If the queried order has been filled or cancelled, the error message \&quot;Order does not exist\&quot; will be returned.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long orderId = 56L; // Long | 
    String origClientOrderId = "origClientOrderId_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      QueryCurrentUmOpenOrderResponse result = apiInstance.queryCurrentUmOpenOrder(symbol, orderId, origClientOrderId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryCurrentUmOpenOrder");
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
| **symbol** | **String**|  | |
| **orderId** | **Long**|  | [optional] |
| **origClientOrderId** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryCurrentUmOpenOrderResponse**](QueryCurrentUmOpenOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current UM Open Order |  -  |

<a id="queryMarginAccountOrder"></a>
# **queryMarginAccountOrder**
> QueryMarginAccountOrderResponse queryMarginAccountOrder(symbol, orderId, origClientOrderId, recvWindow)

Query Margin Account Order (USER_DATA)

Query Margin Account Order  Weight: 10

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long orderId = 56L; // Long | 
    String origClientOrderId = "origClientOrderId_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      QueryMarginAccountOrderResponse result = apiInstance.queryMarginAccountOrder(symbol, orderId, origClientOrderId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryMarginAccountOrder");
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
| **symbol** | **String**|  | |
| **orderId** | **Long**|  | [optional] |
| **origClientOrderId** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryMarginAccountOrderResponse**](QueryMarginAccountOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account Order |  -  |

<a id="queryMarginAccountsAllOco"></a>
# **queryMarginAccountsAllOco**
> QueryMarginAccountsAllOcoResponse queryMarginAccountsAllOco(fromId, startTime, endTime, limit, recvWindow)

Query Margin Account&#39;s all OCO (USER_DATA)

Query all OCO for a specific margin account based on provided optional parameters  Weight: 100

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    Long fromId = 56L; // Long | Trade id to fetch from. Default gets most recent trades.
    Long startTime = 56L; // Long | Timestamp in ms to get funding from INCLUSIVE.
    Long endTime = 56L; // Long | Timestamp in ms to get funding until INCLUSIVE.
    Long limit = 56L; // Long | Default 100; max 1000
    Long recvWindow = 56L; // Long | 
    try {
      QueryMarginAccountsAllOcoResponse result = apiInstance.queryMarginAccountsAllOco(fromId, startTime, endTime, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryMarginAccountsAllOco");
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
| **fromId** | **Long**| Trade id to fetch from. Default gets most recent trades. | [optional] |
| **startTime** | **Long**| Timestamp in ms to get funding from INCLUSIVE. | [optional] |
| **endTime** | **Long**| Timestamp in ms to get funding until INCLUSIVE. | [optional] |
| **limit** | **Long**| Default 100; max 1000 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryMarginAccountsAllOcoResponse**](QueryMarginAccountsAllOcoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account&#39;s all OCO |  -  |

<a id="queryMarginAccountsOco"></a>
# **queryMarginAccountsOco**
> QueryMarginAccountsOcoResponse queryMarginAccountsOco(orderListId, origClientOrderId, recvWindow)

Query Margin Account&#39;s OCO (USER_DATA)

Retrieves a specific OCO based on provided optional parameters  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    Long orderListId = 56L; // Long | Either `orderListId` or `listClientOrderId` must be provided
    String origClientOrderId = "origClientOrderId_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      QueryMarginAccountsOcoResponse result = apiInstance.queryMarginAccountsOco(orderListId, origClientOrderId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryMarginAccountsOco");
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
| **orderListId** | **Long**| Either &#x60;orderListId&#x60; or &#x60;listClientOrderId&#x60; must be provided | [optional] |
| **origClientOrderId** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryMarginAccountsOcoResponse**](QueryMarginAccountsOcoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account&#39;s OCO |  -  |

<a id="queryMarginAccountsOpenOco"></a>
# **queryMarginAccountsOpenOco**
> QueryMarginAccountsOpenOcoResponse queryMarginAccountsOpenOco(recvWindow)

Query Margin Account&#39;s Open OCO (USER_DATA)

Query Margin Account&#39;s Open OCO  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      QueryMarginAccountsOpenOcoResponse result = apiInstance.queryMarginAccountsOpenOco(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryMarginAccountsOpenOco");
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

[**QueryMarginAccountsOpenOcoResponse**](QueryMarginAccountsOpenOcoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account&#39;s Open OCO |  -  |

<a id="queryUmConditionalOrderHistory"></a>
# **queryUmConditionalOrderHistory**
> QueryUmConditionalOrderHistoryResponse queryUmConditionalOrderHistory(symbol, strategyId, newClientStrategyId, recvWindow)

Query UM Conditional Order History(USER_DATA)

Query UM Conditional Order History  * Either &#x60;strategyId&#x60; or &#x60;newClientStrategyId&#x60; must be sent. * &#x60;NEW&#x60; orders will not be found. * These orders will not be found: * order status is &#x60;CANCELED&#x60; or &#x60;EXPIRED&#x60;, **AND** * order has NO filled trade, **AND** * created time + 7 days &lt; current time  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long strategyId = 56L; // Long | 
    String newClientStrategyId = "newClientStrategyId_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      QueryUmConditionalOrderHistoryResponse result = apiInstance.queryUmConditionalOrderHistory(symbol, strategyId, newClientStrategyId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryUmConditionalOrderHistory");
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
| **symbol** | **String**|  | |
| **strategyId** | **Long**|  | [optional] |
| **newClientStrategyId** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryUmConditionalOrderHistoryResponse**](QueryUmConditionalOrderHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | UM Conditional Order History |  -  |

<a id="queryUmModifyOrderHistory"></a>
# **queryUmModifyOrderHistory**
> QueryUmModifyOrderHistoryResponse queryUmModifyOrderHistory(symbol, orderId, origClientOrderId, startTime, endTime, limit, recvWindow)

Query UM Modify Order History(TRADE)

Get order modification history  * Either &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent, and the &#x60;orderId&#x60; will prevail if both are sent.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long orderId = 56L; // Long | 
    String origClientOrderId = "origClientOrderId_example"; // String | 
    Long startTime = 56L; // Long | Timestamp in ms to get funding from INCLUSIVE.
    Long endTime = 56L; // Long | Timestamp in ms to get funding until INCLUSIVE.
    Long limit = 56L; // Long | Default 100; max 1000
    Long recvWindow = 56L; // Long | 
    try {
      QueryUmModifyOrderHistoryResponse result = apiInstance.queryUmModifyOrderHistory(symbol, orderId, origClientOrderId, startTime, endTime, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryUmModifyOrderHistory");
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
| **symbol** | **String**|  | |
| **orderId** | **Long**|  | [optional] |
| **origClientOrderId** | **String**|  | [optional] |
| **startTime** | **Long**| Timestamp in ms to get funding from INCLUSIVE. | [optional] |
| **endTime** | **Long**| Timestamp in ms to get funding until INCLUSIVE. | [optional] |
| **limit** | **Long**| Default 100; max 1000 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryUmModifyOrderHistoryResponse**](QueryUmModifyOrderHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | UM Modify Order History |  -  |

<a id="queryUmOrder"></a>
# **queryUmOrder**
> QueryUmOrderResponse queryUmOrder(symbol, orderId, origClientOrderId, recvWindow)

Query UM Order (USER_DATA)

Check an UM order&#39;s status.  * These orders will not be found: * Either &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent. * order status is &#x60;CANCELED&#x60; or &#x60;EXPIRED&#x60;, **AND** * order has NO filled trade, **AND** * created time + 3 days &lt; current time  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long orderId = 56L; // Long | 
    String origClientOrderId = "origClientOrderId_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      QueryUmOrderResponse result = apiInstance.queryUmOrder(symbol, orderId, origClientOrderId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryUmOrder");
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
| **symbol** | **String**|  | |
| **orderId** | **Long**|  | [optional] |
| **origClientOrderId** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryUmOrderResponse**](QueryUmOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | UM Order |  -  |

<a id="queryUsersCmForceOrders"></a>
# **queryUsersCmForceOrders**
> QueryUsersCmForceOrdersResponse queryUsersCmForceOrders(symbol, autoCloseType, startTime, endTime, limit, recvWindow)

Query User&#39;s CM Force Orders(USER_DATA)

Query User&#39;s CM Force Orders  * If \&quot;autoCloseType\&quot; is not sent, orders with both of the types will be returned * If \&quot;startTime\&quot; is not sent, data within 7 days before \&quot;endTime\&quot; can be queried  Weight: 20 with symbol, 50 without symbol

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    AutoCloseType autoCloseType = AutoCloseType.fromValue("LIQUIDATION"); // AutoCloseType | `LIQUIDATION` for liquidation orders, `ADL` for ADL orders.
    Long startTime = 56L; // Long | Timestamp in ms to get funding from INCLUSIVE.
    Long endTime = 56L; // Long | Timestamp in ms to get funding until INCLUSIVE.
    Long limit = 56L; // Long | Default 100; max 1000
    Long recvWindow = 56L; // Long | 
    try {
      QueryUsersCmForceOrdersResponse result = apiInstance.queryUsersCmForceOrders(symbol, autoCloseType, startTime, endTime, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryUsersCmForceOrders");
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
| **symbol** | **String**|  | [optional] |
| **autoCloseType** | [**AutoCloseType**](.md)| &#x60;LIQUIDATION&#x60; for liquidation orders, &#x60;ADL&#x60; for ADL orders. | [optional] [enum: LIQUIDATION, ADL] |
| **startTime** | **Long**| Timestamp in ms to get funding from INCLUSIVE. | [optional] |
| **endTime** | **Long**| Timestamp in ms to get funding until INCLUSIVE. | [optional] |
| **limit** | **Long**| Default 100; max 1000 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryUsersCmForceOrdersResponse**](QueryUsersCmForceOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User&#39;s CM Force Orders |  -  |

<a id="queryUsersMarginForceOrders"></a>
# **queryUsersMarginForceOrders**
> QueryUsersMarginForceOrdersResponse queryUsersMarginForceOrders(startTime, endTime, current, size, recvWindow)

Query User&#39;s Margin Force Orders(USER_DATA)

Query user&#39;s margin force orders  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    Long startTime = 56L; // Long | Timestamp in ms to get funding from INCLUSIVE.
    Long endTime = 56L; // Long | Timestamp in ms to get funding until INCLUSIVE.
    Long current = 56L; // Long | Currently querying page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10 Max:100
    Long recvWindow = 56L; // Long | 
    try {
      QueryUsersMarginForceOrdersResponse result = apiInstance.queryUsersMarginForceOrders(startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryUsersMarginForceOrders");
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
| **startTime** | **Long**| Timestamp in ms to get funding from INCLUSIVE. | [optional] |
| **endTime** | **Long**| Timestamp in ms to get funding until INCLUSIVE. | [optional] |
| **current** | **Long**| Currently querying page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10 Max:100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryUsersMarginForceOrdersResponse**](QueryUsersMarginForceOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User&#39;s Margin Force Orders |  -  |

<a id="queryUsersUmForceOrders"></a>
# **queryUsersUmForceOrders**
> QueryUsersUmForceOrdersResponse queryUsersUmForceOrders(symbol, autoCloseType, startTime, endTime, limit, recvWindow)

Query User&#39;s UM Force Orders (USER_DATA)

Query User&#39;s UM Force Orders  * If &#x60;autoCloseType&#x60; is not sent, orders with both of the types will be returned * If &#x60;startTime&#x60; is not sent, data within 7 days before &#x60;endTime&#x60; can be queried  Weight: 20 with symbol, 50 without symbol

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    AutoCloseType autoCloseType = AutoCloseType.fromValue("LIQUIDATION"); // AutoCloseType | `LIQUIDATION` for liquidation orders, `ADL` for ADL orders.
    Long startTime = 56L; // Long | Timestamp in ms to get funding from INCLUSIVE.
    Long endTime = 56L; // Long | Timestamp in ms to get funding until INCLUSIVE.
    Long limit = 56L; // Long | Default 100; max 1000
    Long recvWindow = 56L; // Long | 
    try {
      QueryUsersUmForceOrdersResponse result = apiInstance.queryUsersUmForceOrders(symbol, autoCloseType, startTime, endTime, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryUsersUmForceOrders");
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
| **symbol** | **String**|  | [optional] |
| **autoCloseType** | [**AutoCloseType**](.md)| &#x60;LIQUIDATION&#x60; for liquidation orders, &#x60;ADL&#x60; for ADL orders. | [optional] [enum: LIQUIDATION, ADL] |
| **startTime** | **Long**| Timestamp in ms to get funding from INCLUSIVE. | [optional] |
| **endTime** | **Long**| Timestamp in ms to get funding until INCLUSIVE. | [optional] |
| **limit** | **Long**| Default 100; max 1000 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryUsersUmForceOrdersResponse**](QueryUsersUmForceOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User&#39;s UM Force Orders |  -  |

<a id="toggleBnbBurnOnUmFuturesTrade"></a>
# **toggleBnbBurnOnUmFuturesTrade**
> ToggleBnbBurnOnUmFuturesTradeResponse toggleBnbBurnOnUmFuturesTrade(toggleBnbBurnOnUmFuturesTradeRequest)

Toggle BNB Burn On UM Futures Trade (TRADE)

Change user&#39;s BNB Fee Discount for UM Futures (Fee Discount On or Fee Discount Off ) on ***EVERY symbol***   * The BNB would not be collected from UM-PM account to the Portfolio Margin account.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    ToggleBnbBurnOnUmFuturesTradeRequest toggleBnbBurnOnUmFuturesTradeRequest = new ToggleBnbBurnOnUmFuturesTradeRequest(); // ToggleBnbBurnOnUmFuturesTradeRequest | 
    try {
      ToggleBnbBurnOnUmFuturesTradeResponse result = apiInstance.toggleBnbBurnOnUmFuturesTrade(toggleBnbBurnOnUmFuturesTradeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#toggleBnbBurnOnUmFuturesTrade");
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
| **toggleBnbBurnOnUmFuturesTradeRequest** | [**ToggleBnbBurnOnUmFuturesTradeRequest**](ToggleBnbBurnOnUmFuturesTradeRequest.md)|  | |

### Return type

[**ToggleBnbBurnOnUmFuturesTradeResponse**](ToggleBnbBurnOnUmFuturesTradeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Toggle BNB Burn On UM Futures Trade |  -  |

<a id="umAccountTradeList"></a>
# **umAccountTradeList**
> UmAccountTradeListResponse umAccountTradeList(symbol, startTime, endTime, fromId, limit, recvWindow)

UM Account Trade List(USER_DATA)

Get trades for a specific account and UM symbol.   * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last &#39;24 hours&#39; data will be returned. * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 24 hours. * The parameter &#x60;fromId&#x60; cannot be sent with &#x60;startTime&#x60; or &#x60;endTime&#x60;.  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long startTime = 56L; // Long | Timestamp in ms to get funding from INCLUSIVE.
    Long endTime = 56L; // Long | Timestamp in ms to get funding until INCLUSIVE.
    Long fromId = 56L; // Long | Trade id to fetch from. Default gets most recent trades.
    Long limit = 56L; // Long | Default 100; max 1000
    Long recvWindow = 56L; // Long | 
    try {
      UmAccountTradeListResponse result = apiInstance.umAccountTradeList(symbol, startTime, endTime, fromId, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#umAccountTradeList");
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
| **symbol** | **String**|  | |
| **startTime** | **Long**| Timestamp in ms to get funding from INCLUSIVE. | [optional] |
| **endTime** | **Long**| Timestamp in ms to get funding until INCLUSIVE. | [optional] |
| **fromId** | **Long**| Trade id to fetch from. Default gets most recent trades. | [optional] |
| **limit** | **Long**| Default 100; max 1000 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**UmAccountTradeListResponse**](UmAccountTradeListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | UM Account Trade List |  -  |

<a id="umPositionAdlQuantileEstimation"></a>
# **umPositionAdlQuantileEstimation**
> UmPositionAdlQuantileEstimationResponse umPositionAdlQuantileEstimation(symbol, recvWindow)

UM Position ADL Quantile Estimation(USER_DATA)

Query UM Position ADL Quantile Estimation  * Values update every 30s. * Values 0, 1, 2, 3, 4 shows the queue position and possibility of ADL from low to high. * For positions of the symbol are in One-way Mode or isolated margined in Hedge Mode, \&quot;LONG\&quot;, \&quot;SHORT\&quot;, and \&quot;BOTH\&quot; will be returned to show the positions&#39; adl quantiles of different position sides. * If the positions of the symbol are crossed margined in Hedge Mode: * \&quot;HEDGE\&quot; as a sign will be returned instead of \&quot;BOTH\&quot;; * A same value caculated on unrealized pnls on long and short sides&#39; positions will be shown for \&quot;LONG\&quot; and \&quot;SHORT\&quot; when there are positions in both of long and short sides.  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      UmPositionAdlQuantileEstimationResponse result = apiInstance.umPositionAdlQuantileEstimation(symbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#umPositionAdlQuantileEstimation");
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
| **symbol** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**UmPositionAdlQuantileEstimationResponse**](UmPositionAdlQuantileEstimationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | UM Position ADL Quantile Estimation |  -  |

