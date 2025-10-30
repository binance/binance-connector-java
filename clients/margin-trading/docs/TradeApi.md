# TradeApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSpecialKey**](TradeApi.md#createSpecialKey) | **POST** /sapi/v1/margin/apiKey | Create Special Key(Low-Latency Trading)(TRADE) |
| [**deleteSpecialKey**](TradeApi.md#deleteSpecialKey) | **DELETE** /sapi/v1/margin/apiKey | Delete Special Key(Low-Latency Trading)(TRADE) |
| [**editIpForSpecialKey**](TradeApi.md#editIpForSpecialKey) | **PUT** /sapi/v1/margin/apiKey/ip | Edit ip for Special Key(Low-Latency Trading)(TRADE) |
| [**getForceLiquidationRecord**](TradeApi.md#getForceLiquidationRecord) | **GET** /sapi/v1/margin/forceLiquidationRec | Get Force Liquidation Record (USER_DATA) |
| [**getSmallLiabilityExchangeCoinList**](TradeApi.md#getSmallLiabilityExchangeCoinList) | **GET** /sapi/v1/margin/exchange-small-liability | Get Small Liability Exchange Coin List (USER_DATA) |
| [**getSmallLiabilityExchangeHistory**](TradeApi.md#getSmallLiabilityExchangeHistory) | **GET** /sapi/v1/margin/exchange-small-liability-history | Get Small Liability Exchange History (USER_DATA) |
| [**marginAccountCancelAllOpenOrdersOnASymbol**](TradeApi.md#marginAccountCancelAllOpenOrdersOnASymbol) | **DELETE** /sapi/v1/margin/openOrders | Margin Account Cancel all Open Orders on a Symbol (TRADE) |
| [**marginAccountCancelOco**](TradeApi.md#marginAccountCancelOco) | **DELETE** /sapi/v1/margin/orderList | Margin Account Cancel OCO (TRADE) |
| [**marginAccountCancelOrder**](TradeApi.md#marginAccountCancelOrder) | **DELETE** /sapi/v1/margin/order | Margin Account Cancel Order (TRADE) |
| [**marginAccountNewOco**](TradeApi.md#marginAccountNewOco) | **POST** /sapi/v1/margin/order/oco | Margin Account New OCO (TRADE) |
| [**marginAccountNewOrder**](TradeApi.md#marginAccountNewOrder) | **POST** /sapi/v1/margin/order | Margin Account New Order (TRADE) |
| [**marginAccountNewOto**](TradeApi.md#marginAccountNewOto) | **POST** /sapi/v1/margin/order/oto | Margin Account New OTO (TRADE) |
| [**marginAccountNewOtoco**](TradeApi.md#marginAccountNewOtoco) | **POST** /sapi/v1/margin/order/otoco | Margin Account New OTOCO (TRADE) |
| [**marginManualLiquidation**](TradeApi.md#marginManualLiquidation) | **POST** /sapi/v1/margin/manual-liquidation | Margin Manual Liquidation(MARGIN) |
| [**queryCurrentMarginOrderCountUsage**](TradeApi.md#queryCurrentMarginOrderCountUsage) | **GET** /sapi/v1/margin/rateLimit/order | Query Current Margin Order Count Usage (TRADE) |
| [**queryMarginAccountsAllOco**](TradeApi.md#queryMarginAccountsAllOco) | **GET** /sapi/v1/margin/allOrderList | Query Margin Account&#39;s all OCO (USER_DATA) |
| [**queryMarginAccountsAllOrders**](TradeApi.md#queryMarginAccountsAllOrders) | **GET** /sapi/v1/margin/allOrders | Query Margin Account&#39;s All Orders (USER_DATA) |
| [**queryMarginAccountsOco**](TradeApi.md#queryMarginAccountsOco) | **GET** /sapi/v1/margin/orderList | Query Margin Account&#39;s OCO (USER_DATA) |
| [**queryMarginAccountsOpenOco**](TradeApi.md#queryMarginAccountsOpenOco) | **GET** /sapi/v1/margin/openOrderList | Query Margin Account&#39;s Open OCO (USER_DATA) |
| [**queryMarginAccountsOpenOrders**](TradeApi.md#queryMarginAccountsOpenOrders) | **GET** /sapi/v1/margin/openOrders | Query Margin Account&#39;s Open Orders (USER_DATA) |
| [**queryMarginAccountsOrder**](TradeApi.md#queryMarginAccountsOrder) | **GET** /sapi/v1/margin/order | Query Margin Account&#39;s Order (USER_DATA) |
| [**queryMarginAccountsTradeList**](TradeApi.md#queryMarginAccountsTradeList) | **GET** /sapi/v1/margin/myTrades | Query Margin Account&#39;s Trade List (USER_DATA) |
| [**querySpecialKey**](TradeApi.md#querySpecialKey) | **GET** /sapi/v1/margin/apiKey | Query Special key(Low Latency Trading)(TRADE) |
| [**querySpecialKeyList**](TradeApi.md#querySpecialKeyList) | **GET** /sapi/v1/margin/api-key-list | Query Special key List(Low Latency Trading)(TRADE) |
| [**smallLiabilityExchange**](TradeApi.md#smallLiabilityExchange) | **POST** /sapi/v1/margin/exchange-small-liability | Small Liability Exchange (MARGIN) |


<a id="createSpecialKey"></a>
# **createSpecialKey**
> CreateSpecialKeyResponse createSpecialKey(createSpecialKeyRequest)

Create Special Key(Low-Latency Trading)(TRADE)

- Binance Margin offers low-latency trading through a [special key](https://www.binance.com/en/support/faq/frequently-asked-questions-on-margin-special-api-key-3208663e900d4d2e9fec4140e1832f4e), available exclusively to users with VIP level 4 or higher. - If you are VIP level 3 or below, please contact your VIP manager for eligibility criterias.**  **Supported Products:**  - Cross Margin - Isolated Margin - Portfolio Margin Pro - Cross Margin Pro (Additional agreement required and subject to meeting eligibility criteria)  **Unsupported Products:**  - Portfolio Margin  We support several types of API keys:  * Ed25519 (recommended) * HMAC * RSA  We recommend to **use Ed25519 API keys** as it should provide the best performance and security out of all supported key types. We accept PKCS#8 (BEGIN PUBLIC KEY). For how to generate an RSA key pair to send API requests on Binance. Please refer to the document below [FAQ](https://www.binance.com/en/support/faq/how-to-generate-an-rsa-key-pair-to-send-api-requests-on-binance-2b79728f331e43079b27440d9d15c5db) .  Weight: 1(UID)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    CreateSpecialKeyRequest createSpecialKeyRequest = new CreateSpecialKeyRequest(); // CreateSpecialKeyRequest | 
    try {
      CreateSpecialKeyResponse result = apiInstance.createSpecialKey(createSpecialKeyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#createSpecialKey");
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
| **createSpecialKeyRequest** | [**CreateSpecialKeyRequest**](CreateSpecialKeyRequest.md)|  | |

### Return type

[**CreateSpecialKeyResponse**](CreateSpecialKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Special Key |  -  |

<a id="deleteSpecialKey"></a>
# **deleteSpecialKey**
> deleteSpecialKey(apiName, symbol, recvWindow)

Delete Special Key(Low-Latency Trading)(TRADE)

This only applies to Special Key for Low Latency Trading.  If apiKey is given, apiName will be ignored. If apiName is given with no apiKey, all apikeys with given apiName will be deleted.  You need to enable Permits “Enable Spot &amp; Margin Trading” option for the API Key which requests this endpoint.  Weight: 1(UID)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String apiName = "apiName_example"; // String | 
    String symbol = "symbol_example"; // String | isolated margin pair
    Long recvWindow = 56L; // Long | No more than 60000
    try {
      apiInstance.deleteSpecialKey(apiName, symbol, recvWindow);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#deleteSpecialKey");
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
| **apiName** | **String**|  | [optional] |
| **symbol** | **String**| isolated margin pair | [optional] |
| **recvWindow** | **Long**| No more than 60000 | [optional] |

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

<a id="editIpForSpecialKey"></a>
# **editIpForSpecialKey**
> editIpForSpecialKey(editIpForSpecialKeyRequest)

Edit ip for Special Key(Low-Latency Trading)(TRADE)

Edit ip restriction. This only applies to Special Key for Low Latency Trading.  You need to enable Permits “Enable Spot &amp; Margin Trading” option for the API Key which requests this endpoint.  Weight: 1(UID)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    EditIpForSpecialKeyRequest editIpForSpecialKeyRequest = new EditIpForSpecialKeyRequest(); // EditIpForSpecialKeyRequest | 
    try {
      apiInstance.editIpForSpecialKey(editIpForSpecialKeyRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#editIpForSpecialKey");
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
| **editIpForSpecialKeyRequest** | [**EditIpForSpecialKeyRequest**](EditIpForSpecialKeyRequest.md)|  | |

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

<a id="getForceLiquidationRecord"></a>
# **getForceLiquidationRecord**
> GetForceLiquidationRecordResponse getForceLiquidationRecord(startTime, endTime, isolatedSymbol, current, size, recvWindow)

Get Force Liquidation Record (USER_DATA)

Get Force Liquidation Record  * Response in descending order  Weight: 1(IP)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    Long startTime = 56L; // Long | 只支持查询最近90天的数据
    Long endTime = 56L; // Long | 
    String isolatedSymbol = "isolatedSymbol_example"; // String | isolated symbol
    Long current = 56L; // Long | Currently querying page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10 Max:100
    Long recvWindow = 56L; // Long | No more than 60000
    try {
      GetForceLiquidationRecordResponse result = apiInstance.getForceLiquidationRecord(startTime, endTime, isolatedSymbol, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#getForceLiquidationRecord");
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
| **startTime** | **Long**| 只支持查询最近90天的数据 | [optional] |
| **endTime** | **Long**|  | [optional] |
| **isolatedSymbol** | **String**| isolated symbol | [optional] |
| **current** | **Long**| Currently querying page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10 Max:100 | [optional] |
| **recvWindow** | **Long**| No more than 60000 | [optional] |

### Return type

[**GetForceLiquidationRecordResponse**](GetForceLiquidationRecordResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Force Liquidation Record |  -  |

<a id="getSmallLiabilityExchangeCoinList"></a>
# **getSmallLiabilityExchangeCoinList**
> GetSmallLiabilityExchangeCoinListResponse getSmallLiabilityExchangeCoinList(recvWindow)

Get Small Liability Exchange Coin List (USER_DATA)

Query the coins which can be small liability exchange  Weight: 100

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    Long recvWindow = 56L; // Long | No more than 60000
    try {
      GetSmallLiabilityExchangeCoinListResponse result = apiInstance.getSmallLiabilityExchangeCoinList(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#getSmallLiabilityExchangeCoinList");
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
| **recvWindow** | **Long**| No more than 60000 | [optional] |

### Return type

[**GetSmallLiabilityExchangeCoinListResponse**](GetSmallLiabilityExchangeCoinListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Small Liability Exchange Coin List |  -  |

<a id="getSmallLiabilityExchangeHistory"></a>
# **getSmallLiabilityExchangeHistory**
> GetSmallLiabilityExchangeHistoryResponse getSmallLiabilityExchangeHistory(current, size, startTime, endTime, recvWindow)

Get Small Liability Exchange History (USER_DATA)

Get Small liability Exchange History  Weight: 100(UID)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    Long current = 56L; // Long | Currently querying page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long startTime = 56L; // Long | 只支持查询最近90天的数据
    Long endTime = 56L; // Long | 
    Long recvWindow = 56L; // Long | No more than 60000
    try {
      GetSmallLiabilityExchangeHistoryResponse result = apiInstance.getSmallLiabilityExchangeHistory(current, size, startTime, endTime, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#getSmallLiabilityExchangeHistory");
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
| **current** | **Long**| Currently querying page. Start from 1. Default:1 | |
| **size** | **Long**| Default:10, Max:100 | |
| **startTime** | **Long**| 只支持查询最近90天的数据 | [optional] |
| **endTime** | **Long**|  | [optional] |
| **recvWindow** | **Long**| No more than 60000 | [optional] |

### Return type

[**GetSmallLiabilityExchangeHistoryResponse**](GetSmallLiabilityExchangeHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Small Liability Exchange History |  -  |

<a id="marginAccountCancelAllOpenOrdersOnASymbol"></a>
# **marginAccountCancelAllOpenOrdersOnASymbol**
> MarginAccountCancelAllOpenOrdersOnASymbolResponse marginAccountCancelAllOpenOrdersOnASymbol(symbol, isIsolated, recvWindow)

Margin Account Cancel all Open Orders on a Symbol (TRADE)

Cancels all active orders on a symbol for margin account.&lt;br&gt;&lt;/br&gt; This includes OCO orders.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    String isIsolated = "isIsolated_example"; // String | for isolated margin or not, \"TRUE\", \"FALSE\"，default \"FALSE\"
    Long recvWindow = 56L; // Long | No more than 60000
    try {
      MarginAccountCancelAllOpenOrdersOnASymbolResponse result = apiInstance.marginAccountCancelAllOpenOrdersOnASymbol(symbol, isIsolated, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#marginAccountCancelAllOpenOrdersOnASymbol");
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
| **isIsolated** | **String**| for isolated margin or not, \&quot;TRUE\&quot;, \&quot;FALSE\&quot;，default \&quot;FALSE\&quot; | [optional] |
| **recvWindow** | **Long**| No more than 60000 | [optional] |

### Return type

[**MarginAccountCancelAllOpenOrdersOnASymbolResponse**](MarginAccountCancelAllOpenOrdersOnASymbolResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account Cancel all Open Orders on a Symbol |  -  |

<a id="marginAccountCancelOco"></a>
# **marginAccountCancelOco**
> MarginAccountCancelOcoResponse marginAccountCancelOco(symbol, isIsolated, orderListId, listClientOrderId, newClientOrderId, recvWindow)

Margin Account Cancel OCO (TRADE)

Cancel an entire Order List for a margin account.  * Canceling an individual leg will cancel the entire OCO  Weight: 1(UID)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    String isIsolated = "isIsolated_example"; // String | for isolated margin or not, \"TRUE\", \"FALSE\"，default \"FALSE\"
    Long orderListId = 56L; // Long | Either `orderListId` or `listClientOrderId` must be provided
    String listClientOrderId = "listClientOrderId_example"; // String | Either `orderListId` or `listClientOrderId` must be provided
    String newClientOrderId = "newClientOrderId_example"; // String | Used to uniquely identify this cancel. Automatically generated by default
    Long recvWindow = 56L; // Long | No more than 60000
    try {
      MarginAccountCancelOcoResponse result = apiInstance.marginAccountCancelOco(symbol, isIsolated, orderListId, listClientOrderId, newClientOrderId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#marginAccountCancelOco");
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
| **isIsolated** | **String**| for isolated margin or not, \&quot;TRUE\&quot;, \&quot;FALSE\&quot;，default \&quot;FALSE\&quot; | [optional] |
| **orderListId** | **Long**| Either &#x60;orderListId&#x60; or &#x60;listClientOrderId&#x60; must be provided | [optional] |
| **listClientOrderId** | **String**| Either &#x60;orderListId&#x60; or &#x60;listClientOrderId&#x60; must be provided | [optional] |
| **newClientOrderId** | **String**| Used to uniquely identify this cancel. Automatically generated by default | [optional] |
| **recvWindow** | **Long**| No more than 60000 | [optional] |

### Return type

[**MarginAccountCancelOcoResponse**](MarginAccountCancelOcoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account Cancel OCO |  -  |

<a id="marginAccountCancelOrder"></a>
# **marginAccountCancelOrder**
> MarginAccountCancelOrderResponse marginAccountCancelOrder(symbol, isIsolated, orderId, origClientOrderId, newClientOrderId, recvWindow)

Margin Account Cancel Order (TRADE)

Cancel an active order for margin account.  * Either orderId or origClientOrderId must be sent.  Weight: 10(IP)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    String isIsolated = "isIsolated_example"; // String | for isolated margin or not, \"TRUE\", \"FALSE\"，default \"FALSE\"
    Long orderId = 56L; // Long | 
    String origClientOrderId = "origClientOrderId_example"; // String | 
    String newClientOrderId = "newClientOrderId_example"; // String | Used to uniquely identify this cancel. Automatically generated by default
    Long recvWindow = 56L; // Long | No more than 60000
    try {
      MarginAccountCancelOrderResponse result = apiInstance.marginAccountCancelOrder(symbol, isIsolated, orderId, origClientOrderId, newClientOrderId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#marginAccountCancelOrder");
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
| **isIsolated** | **String**| for isolated margin or not, \&quot;TRUE\&quot;, \&quot;FALSE\&quot;，default \&quot;FALSE\&quot; | [optional] |
| **orderId** | **Long**|  | [optional] |
| **origClientOrderId** | **String**|  | [optional] |
| **newClientOrderId** | **String**| Used to uniquely identify this cancel. Automatically generated by default | [optional] |
| **recvWindow** | **Long**| No more than 60000 | [optional] |

### Return type

[**MarginAccountCancelOrderResponse**](MarginAccountCancelOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account Cancel Order |  -  |

<a id="marginAccountNewOco"></a>
# **marginAccountNewOco**
> MarginAccountNewOcoResponse marginAccountNewOco(marginAccountNewOcoRequest)

Margin Account New OCO (TRADE)

Send in a new OCO for a margin account  * autoRepayAtCancel is suggested to set as “FALSE” to keep liability unrepaid under high frequent new order/cancel order execution  Weight: 6(UID)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

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

<a id="marginAccountNewOrder"></a>
# **marginAccountNewOrder**
> MarginAccountNewOrderResponse marginAccountNewOrder(marginAccountNewOrderRequest)

Margin Account New Order (TRADE)

Post a new order for margin account.  * autoRepayAtCancel is suggested to set as “FALSE” to keep liability unrepaid under high frequent new order/cancel order execution  Weight: 6(UID)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    MarginAccountNewOrderRequest marginAccountNewOrderRequest = new MarginAccountNewOrderRequest(); // MarginAccountNewOrderRequest | 
    try {
      MarginAccountNewOrderResponse result = apiInstance.marginAccountNewOrder(marginAccountNewOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#marginAccountNewOrder");
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
| **marginAccountNewOrderRequest** | [**MarginAccountNewOrderRequest**](MarginAccountNewOrderRequest.md)|  | |

### Return type

[**MarginAccountNewOrderResponse**](MarginAccountNewOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account New Order |  -  |

<a id="marginAccountNewOto"></a>
# **marginAccountNewOto**
> MarginAccountNewOtoResponse marginAccountNewOto(marginAccountNewOtoRequest)

Margin Account New OTO (TRADE)

Post a new OTO order for margin account:  - An OTO (One-Triggers-the-Other) is an order list comprised of 2 orders. - The first order is called the **working order** and must be &#x60;LIMIT&#x60; or &#x60;LIMIT_MAKER&#x60;. Initially, only the working order goes on the order book. - The second order is called the **pending order**. It can be any order type except for &#x60;MARKET&#x60; orders using parameter &#x60;quoteOrderQty&#x60;. The pending order is only placed on the order book when the working order gets **fully filled**. - If either the working order or the pending order is cancelled individually, the other order in the order list will also be canceled or expired. - When the order list is placed, if the working order gets **immediately fully filled**, the placement response will show the working order as &#x60;FILLED&#x60; but the pending order will still appear as &#x60;PENDING_NEW&#x60;. You need to query the status of the pending order again to see its updated status. - OTOs add **2 orders** to the unfilled order count, &#x60;EXCHANGE_MAX_NUM_ORDERS&#x60; filter and &#x60;MAX_NUM_ORDERS&#x60; filter.  * autoRepayAtCancel is suggested to set as “FALSE” to keep liability unrepaid under high frequent new order/cancel order execution * Depending on the &#x60;pendingType&#x60; or &#x60;workingType&#x60;, some optional parameters will become mandatory:  Weight: 6(UID)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    MarginAccountNewOtoRequest marginAccountNewOtoRequest = new MarginAccountNewOtoRequest(); // MarginAccountNewOtoRequest | 
    try {
      MarginAccountNewOtoResponse result = apiInstance.marginAccountNewOto(marginAccountNewOtoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#marginAccountNewOto");
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
| **marginAccountNewOtoRequest** | [**MarginAccountNewOtoRequest**](MarginAccountNewOtoRequest.md)|  | |

### Return type

[**MarginAccountNewOtoResponse**](MarginAccountNewOtoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account New OTO |  -  |

<a id="marginAccountNewOtoco"></a>
# **marginAccountNewOtoco**
> MarginAccountNewOtocoResponse marginAccountNewOtoco(marginAccountNewOtocoRequest)

Margin Account New OTOCO (TRADE)

Post a new OTOCO order for margin account：  - An OTOCO (One-Triggers-One-Cancels-the-Other) is an order list comprised of 3 orders. - The first order is called the **working order** and must be &#x60;LIMIT&#x60; or &#x60;LIMIT_MAKER&#x60;. Initially, only the working order goes on the order book. - The behavior of the working order is the same as the OTO. - OTOCO has 2 pending orders (pending above and pending below), forming an OCO pair. The pending orders are only placed on the order book when the working order gets **fully filled**. - The rules of the pending above and pending below follow the same rules as the [Order List OCO](https://developers.binance.com/docs/margin_trading/trade/Margin-Account-New-OCO). - OTOCOs add **3 orders** against the unfilled order count, &#x60;EXCHANGE_MAX_NUM_ORDERS&#x60; filter, and &#x60;MAX_NUM_ORDERS&#x60; filter.  * autoRepayAtCancel is suggested to set as “FALSE” to keep liability unrepaid under high frequent new order/cancel order execution * Depending on the &#x60;pendingAboveType&#x60;/&#x60;pendingBelowType&#x60; or &#x60;workingType&#x60;, some optional parameters will become mandatory:  Weight: 6(UID)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    MarginAccountNewOtocoRequest marginAccountNewOtocoRequest = new MarginAccountNewOtocoRequest(); // MarginAccountNewOtocoRequest | 
    try {
      MarginAccountNewOtocoResponse result = apiInstance.marginAccountNewOtoco(marginAccountNewOtocoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#marginAccountNewOtoco");
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
| **marginAccountNewOtocoRequest** | [**MarginAccountNewOtocoRequest**](MarginAccountNewOtocoRequest.md)|  | |

### Return type

[**MarginAccountNewOtocoResponse**](MarginAccountNewOtocoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account New OTOCO |  -  |

<a id="marginManualLiquidation"></a>
# **marginManualLiquidation**
> MarginManualLiquidationResponse marginManualLiquidation(marginManualLiquidationRequest)

Margin Manual Liquidation(MARGIN)

Margin Manual Liquidation  * This endpoint can support Cross Margin Classic Mode and Pro Mode. * And only support Isolated Margin for restricted region.  Weight: 3000

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    MarginManualLiquidationRequest marginManualLiquidationRequest = new MarginManualLiquidationRequest(); // MarginManualLiquidationRequest | 
    try {
      MarginManualLiquidationResponse result = apiInstance.marginManualLiquidation(marginManualLiquidationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#marginManualLiquidation");
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
| **marginManualLiquidationRequest** | [**MarginManualLiquidationRequest**](MarginManualLiquidationRequest.md)|  | |

### Return type

[**MarginManualLiquidationResponse**](MarginManualLiquidationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Manual Liquidation |  -  |

<a id="queryCurrentMarginOrderCountUsage"></a>
# **queryCurrentMarginOrderCountUsage**
> QueryCurrentMarginOrderCountUsageResponse queryCurrentMarginOrderCountUsage(isIsolated, symbol, recvWindow)

Query Current Margin Order Count Usage (TRADE)

Displays the user&#39;s current margin order count usage for all intervals.  Weight: 20(IP)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String isIsolated = "isIsolated_example"; // String | for isolated margin or not, \"TRUE\", \"FALSE\"，default \"FALSE\"
    String symbol = "symbol_example"; // String | isolated margin pair
    Long recvWindow = 56L; // Long | No more than 60000
    try {
      QueryCurrentMarginOrderCountUsageResponse result = apiInstance.queryCurrentMarginOrderCountUsage(isIsolated, symbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryCurrentMarginOrderCountUsage");
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
| **isIsolated** | **String**| for isolated margin or not, \&quot;TRUE\&quot;, \&quot;FALSE\&quot;，default \&quot;FALSE\&quot; | [optional] |
| **symbol** | **String**| isolated margin pair | [optional] |
| **recvWindow** | **Long**| No more than 60000 | [optional] |

### Return type

[**QueryCurrentMarginOrderCountUsageResponse**](QueryCurrentMarginOrderCountUsageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current Margin Order Count Usage |  -  |

<a id="queryMarginAccountsAllOco"></a>
# **queryMarginAccountsAllOco**
> QueryMarginAccountsAllOcoResponse queryMarginAccountsAllOco(isIsolated, symbol, fromId, startTime, endTime, limit, recvWindow)

Query Margin Account&#39;s all OCO (USER_DATA)

Retrieves all OCO for a specific margin account based on provided optional parameters  Weight: 200(IP)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String isIsolated = "isIsolated_example"; // String | for isolated margin or not, \"TRUE\", \"FALSE\"，default \"FALSE\"
    String symbol = "symbol_example"; // String | isolated margin pair
    Long fromId = 56L; // Long | 如设置fromId, 将返回id > fromId的数据。否则将返回最新数据
    Long startTime = 56L; // Long | 只支持查询最近90天的数据
    Long endTime = 56L; // Long | 
    Long limit = 56L; // Long | Default Value: 500; Max Value: 1000
    Long recvWindow = 56L; // Long | No more than 60000
    try {
      QueryMarginAccountsAllOcoResponse result = apiInstance.queryMarginAccountsAllOco(isIsolated, symbol, fromId, startTime, endTime, limit, recvWindow);
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
| **isIsolated** | **String**| for isolated margin or not, \&quot;TRUE\&quot;, \&quot;FALSE\&quot;，default \&quot;FALSE\&quot; | [optional] |
| **symbol** | **String**| isolated margin pair | [optional] |
| **fromId** | **Long**| 如设置fromId, 将返回id &gt; fromId的数据。否则将返回最新数据 | [optional] |
| **startTime** | **Long**| 只支持查询最近90天的数据 | [optional] |
| **endTime** | **Long**|  | [optional] |
| **limit** | **Long**| Default Value: 500; Max Value: 1000 | [optional] |
| **recvWindow** | **Long**| No more than 60000 | [optional] |

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

<a id="queryMarginAccountsAllOrders"></a>
# **queryMarginAccountsAllOrders**
> QueryMarginAccountsAllOrdersResponse queryMarginAccountsAllOrders(symbol, isIsolated, orderId, startTime, endTime, limit, recvWindow)

Query Margin Account&#39;s All Orders (USER_DATA)

Query Margin Account&#39;s All Orders  * If orderId is set, it will get orders &gt;&#x3D; that orderId. Otherwise the orders within 24 hours are returned. * For some historical orders cummulativeQuoteQty will be &lt; 0, meaning the data is not available at this time. * Less than 24 hours between startTime and endTime.  Weight: 200(IP)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    String isIsolated = "isIsolated_example"; // String | for isolated margin or not, \"TRUE\", \"FALSE\"，default \"FALSE\"
    Long orderId = 56L; // Long | 
    Long startTime = 56L; // Long | 只支持查询最近90天的数据
    Long endTime = 56L; // Long | 
    Long limit = 56L; // Long | Default Value: 500; Max Value: 1000
    Long recvWindow = 56L; // Long | No more than 60000
    try {
      QueryMarginAccountsAllOrdersResponse result = apiInstance.queryMarginAccountsAllOrders(symbol, isIsolated, orderId, startTime, endTime, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryMarginAccountsAllOrders");
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
| **isIsolated** | **String**| for isolated margin or not, \&quot;TRUE\&quot;, \&quot;FALSE\&quot;，default \&quot;FALSE\&quot; | [optional] |
| **orderId** | **Long**|  | [optional] |
| **startTime** | **Long**| 只支持查询最近90天的数据 | [optional] |
| **endTime** | **Long**|  | [optional] |
| **limit** | **Long**| Default Value: 500; Max Value: 1000 | [optional] |
| **recvWindow** | **Long**| No more than 60000 | [optional] |

### Return type

[**QueryMarginAccountsAllOrdersResponse**](QueryMarginAccountsAllOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account&#39;s All Orders |  -  |

<a id="queryMarginAccountsOco"></a>
# **queryMarginAccountsOco**
> QueryMarginAccountsOcoResponse queryMarginAccountsOco(isIsolated, symbol, orderListId, origClientOrderId, recvWindow)

Query Margin Account&#39;s OCO (USER_DATA)

Retrieves a specific OCO based on provided optional parameters  Weight: 10(IP)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String isIsolated = "isIsolated_example"; // String | for isolated margin or not, \"TRUE\", \"FALSE\"，default \"FALSE\"
    String symbol = "symbol_example"; // String | isolated margin pair
    Long orderListId = 56L; // Long | Either `orderListId` or `listClientOrderId` must be provided
    String origClientOrderId = "origClientOrderId_example"; // String | 
    Long recvWindow = 56L; // Long | No more than 60000
    try {
      QueryMarginAccountsOcoResponse result = apiInstance.queryMarginAccountsOco(isIsolated, symbol, orderListId, origClientOrderId, recvWindow);
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
| **isIsolated** | **String**| for isolated margin or not, \&quot;TRUE\&quot;, \&quot;FALSE\&quot;，default \&quot;FALSE\&quot; | [optional] |
| **symbol** | **String**| isolated margin pair | [optional] |
| **orderListId** | **Long**| Either &#x60;orderListId&#x60; or &#x60;listClientOrderId&#x60; must be provided | [optional] |
| **origClientOrderId** | **String**|  | [optional] |
| **recvWindow** | **Long**| No more than 60000 | [optional] |

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
> QueryMarginAccountsOpenOcoResponse queryMarginAccountsOpenOco(isIsolated, symbol, recvWindow)

Query Margin Account&#39;s Open OCO (USER_DATA)

Query Margin Account&#39;s Open OCO  Weight: 10(IP)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String isIsolated = "isIsolated_example"; // String | for isolated margin or not, \"TRUE\", \"FALSE\"，default \"FALSE\"
    String symbol = "symbol_example"; // String | isolated margin pair
    Long recvWindow = 56L; // Long | No more than 60000
    try {
      QueryMarginAccountsOpenOcoResponse result = apiInstance.queryMarginAccountsOpenOco(isIsolated, symbol, recvWindow);
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
| **isIsolated** | **String**| for isolated margin or not, \&quot;TRUE\&quot;, \&quot;FALSE\&quot;，default \&quot;FALSE\&quot; | [optional] |
| **symbol** | **String**| isolated margin pair | [optional] |
| **recvWindow** | **Long**| No more than 60000 | [optional] |

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

<a id="queryMarginAccountsOpenOrders"></a>
# **queryMarginAccountsOpenOrders**
> QueryMarginAccountsOpenOrdersResponse queryMarginAccountsOpenOrders(symbol, isIsolated, recvWindow)

Query Margin Account&#39;s Open Orders (USER_DATA)

Query Margin Account&#39;s Open Orders  * If the symbol is not sent, orders for all symbols will be returned in an array. * When all symbols are returned, the number of requests counted against the rate limiter is equal to the number of symbols currently trading on the exchange. * If isIsolated &#x3D;\&quot;TRUE\&quot;, symbol must be sent.  Weight: 10(IP)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | isolated margin pair
    String isIsolated = "isIsolated_example"; // String | for isolated margin or not, \"TRUE\", \"FALSE\"，default \"FALSE\"
    Long recvWindow = 56L; // Long | No more than 60000
    try {
      QueryMarginAccountsOpenOrdersResponse result = apiInstance.queryMarginAccountsOpenOrders(symbol, isIsolated, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryMarginAccountsOpenOrders");
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
| **symbol** | **String**| isolated margin pair | [optional] |
| **isIsolated** | **String**| for isolated margin or not, \&quot;TRUE\&quot;, \&quot;FALSE\&quot;，default \&quot;FALSE\&quot; | [optional] |
| **recvWindow** | **Long**| No more than 60000 | [optional] |

### Return type

[**QueryMarginAccountsOpenOrdersResponse**](QueryMarginAccountsOpenOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account&#39;s Open Orders |  -  |

<a id="queryMarginAccountsOrder"></a>
# **queryMarginAccountsOrder**
> QueryMarginAccountsOrderResponse queryMarginAccountsOrder(symbol, isIsolated, orderId, origClientOrderId, recvWindow)

Query Margin Account&#39;s Order (USER_DATA)

Query Margin Account&#39;s Order  * Either orderId or origClientOrderId must be sent. * For some historical orders cummulativeQuoteQty will be &lt; 0, meaning the data is not available at this time.  Weight: 10(IP)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    String isIsolated = "isIsolated_example"; // String | for isolated margin or not, \"TRUE\", \"FALSE\"，default \"FALSE\"
    Long orderId = 56L; // Long | 
    String origClientOrderId = "origClientOrderId_example"; // String | 
    Long recvWindow = 56L; // Long | No more than 60000
    try {
      QueryMarginAccountsOrderResponse result = apiInstance.queryMarginAccountsOrder(symbol, isIsolated, orderId, origClientOrderId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryMarginAccountsOrder");
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
| **isIsolated** | **String**| for isolated margin or not, \&quot;TRUE\&quot;, \&quot;FALSE\&quot;，default \&quot;FALSE\&quot; | [optional] |
| **orderId** | **Long**|  | [optional] |
| **origClientOrderId** | **String**|  | [optional] |
| **recvWindow** | **Long**| No more than 60000 | [optional] |

### Return type

[**QueryMarginAccountsOrderResponse**](QueryMarginAccountsOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account&#39;s Order |  -  |

<a id="queryMarginAccountsTradeList"></a>
# **queryMarginAccountsTradeList**
> QueryMarginAccountsTradeListResponse queryMarginAccountsTradeList(symbol, isIsolated, orderId, startTime, endTime, fromId, limit, recvWindow)

Query Margin Account&#39;s Trade List (USER_DATA)

Query Margin Account&#39;s Trade List  * If fromId is set, it will get trades &gt;&#x3D; that fromId. Otherwise the trades within 24 hours are returned. * Less than 24 hours between startTime and endTime.  Weight: 10(IP)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    String isIsolated = "isIsolated_example"; // String | for isolated margin or not, \"TRUE\", \"FALSE\"，default \"FALSE\"
    Long orderId = 56L; // Long | 
    Long startTime = 56L; // Long | 只支持查询最近90天的数据
    Long endTime = 56L; // Long | 
    Long fromId = 56L; // Long | 如设置fromId, 将返回id > fromId的数据。否则将返回最新数据
    Long limit = 56L; // Long | Default Value: 500; Max Value: 1000
    Long recvWindow = 56L; // Long | No more than 60000
    try {
      QueryMarginAccountsTradeListResponse result = apiInstance.queryMarginAccountsTradeList(symbol, isIsolated, orderId, startTime, endTime, fromId, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryMarginAccountsTradeList");
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
| **isIsolated** | **String**| for isolated margin or not, \&quot;TRUE\&quot;, \&quot;FALSE\&quot;，default \&quot;FALSE\&quot; | [optional] |
| **orderId** | **Long**|  | [optional] |
| **startTime** | **Long**| 只支持查询最近90天的数据 | [optional] |
| **endTime** | **Long**|  | [optional] |
| **fromId** | **Long**| 如设置fromId, 将返回id &gt; fromId的数据。否则将返回最新数据 | [optional] |
| **limit** | **Long**| Default Value: 500; Max Value: 1000 | [optional] |
| **recvWindow** | **Long**| No more than 60000 | [optional] |

### Return type

[**QueryMarginAccountsTradeListResponse**](QueryMarginAccountsTradeListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account&#39;s Trade List |  -  |

<a id="querySpecialKey"></a>
# **querySpecialKey**
> QuerySpecialKeyResponse querySpecialKey(symbol, recvWindow)

Query Special key(Low Latency Trading)(TRADE)

Query Special Key Information.  This only applies to Special Key for Low Latency Trading.  Weight: 1(UID)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | isolated margin pair
    Long recvWindow = 56L; // Long | No more than 60000
    try {
      QuerySpecialKeyResponse result = apiInstance.querySpecialKey(symbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#querySpecialKey");
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
| **symbol** | **String**| isolated margin pair | [optional] |
| **recvWindow** | **Long**| No more than 60000 | [optional] |

### Return type

[**QuerySpecialKeyResponse**](QuerySpecialKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Special key |  -  |

<a id="querySpecialKeyList"></a>
# **querySpecialKeyList**
> QuerySpecialKeyListResponse querySpecialKeyList(symbol, recvWindow)

Query Special key List(Low Latency Trading)(TRADE)

This only applies to Special Key for Low Latency Trading.  Weight: 1(UID)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "symbol_example"; // String | isolated margin pair
    Long recvWindow = 56L; // Long | No more than 60000
    try {
      QuerySpecialKeyListResponse result = apiInstance.querySpecialKeyList(symbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#querySpecialKeyList");
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
| **symbol** | **String**| isolated margin pair | [optional] |
| **recvWindow** | **Long**| No more than 60000 | [optional] |

### Return type

[**QuerySpecialKeyListResponse**](QuerySpecialKeyListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Special key List |  -  |

<a id="smallLiabilityExchange"></a>
# **smallLiabilityExchange**
> smallLiabilityExchange(smallLiabilityExchangeRequest)

Small Liability Exchange (MARGIN)

Small Liability Exchange  * Only convert once within 6 hours * Only liability valuation less than 10 USDT are supported * The maximum number of coin is 10  Weight: 3000(UID)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    SmallLiabilityExchangeRequest smallLiabilityExchangeRequest = new SmallLiabilityExchangeRequest(); // SmallLiabilityExchangeRequest | 
    try {
      apiInstance.smallLiabilityExchange(smallLiabilityExchangeRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#smallLiabilityExchange");
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
| **smallLiabilityExchangeRequest** | [**SmallLiabilityExchangeRequest**](SmallLiabilityExchangeRequest.md)|  | |

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

