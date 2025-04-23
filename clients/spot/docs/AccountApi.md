# AccountApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accountCommission**](AccountApi.md#accountCommission) | **POST** /account.commission | WebSocket Account Commission Rates |
| [**accountRateLimitsOrders**](AccountApi.md#accountRateLimitsOrders) | **POST** /account.rateLimits.orders | WebSocket Unfilled Order Count |
| [**accountStatus**](AccountApi.md#accountStatus) | **POST** /account.status | WebSocket Account information |
| [**allOrderLists**](AccountApi.md#allOrderLists) | **POST** /allOrderLists | WebSocket Account Order list history |
| [**allOrders**](AccountApi.md#allOrders) | **POST** /allOrders | WebSocket Account order history |
| [**myAllocations**](AccountApi.md#myAllocations) | **POST** /myAllocations | WebSocket Account allocations |
| [**myPreventedMatches**](AccountApi.md#myPreventedMatches) | **POST** /myPreventedMatches | WebSocket Account prevented matches |
| [**myTrades**](AccountApi.md#myTrades) | **POST** /myTrades | WebSocket Account trade history |
| [**orderAmendments**](AccountApi.md#orderAmendments) | **POST** /order.amendments | WebSocket Query Order Amendments |


<a id="accountCommission"></a>
# **accountCommission**
> AccountCommissionResponse accountCommission(accountCommissionRequest)

WebSocket Account Commission Rates

Get current account commission rates. Weight: 20

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApi apiInstance = new AccountApi(defaultClient);
    AccountCommissionRequest accountCommissionRequest = new AccountCommissionRequest(); // AccountCommissionRequest | 
    try {
      AccountCommissionResponse result = apiInstance.accountCommission(accountCommissionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#accountCommission");
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
| **accountCommissionRequest** | [**AccountCommissionRequest**](AccountCommissionRequest.md)|  | |

### Return type

[**AccountCommissionResponse**](AccountCommissionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account Commission Rates |  -  |

<a id="accountRateLimitsOrders"></a>
# **accountRateLimitsOrders**
> AccountRateLimitsOrdersResponse accountRateLimitsOrders(accountRateLimitsOrdersRequest)

WebSocket Unfilled Order Count

Query your current unfilled order count for all intervals. Weight: 40

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApi apiInstance = new AccountApi(defaultClient);
    AccountRateLimitsOrdersRequest accountRateLimitsOrdersRequest = new AccountRateLimitsOrdersRequest(); // AccountRateLimitsOrdersRequest | 
    try {
      AccountRateLimitsOrdersResponse result = apiInstance.accountRateLimitsOrders(accountRateLimitsOrdersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#accountRateLimitsOrders");
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
| **accountRateLimitsOrdersRequest** | [**AccountRateLimitsOrdersRequest**](AccountRateLimitsOrdersRequest.md)|  | |

### Return type

[**AccountRateLimitsOrdersResponse**](AccountRateLimitsOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Unfilled Order Count |  -  |

<a id="accountStatus"></a>
# **accountStatus**
> AccountStatusResponse accountStatus(accountStatusRequest)

WebSocket Account information

Query information about your account. Weight: 20

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApi apiInstance = new AccountApi(defaultClient);
    AccountStatusRequest accountStatusRequest = new AccountStatusRequest(); // AccountStatusRequest | 
    try {
      AccountStatusResponse result = apiInstance.accountStatus(accountStatusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#accountStatus");
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
| **accountStatusRequest** | [**AccountStatusRequest**](AccountStatusRequest.md)|  | |

### Return type

[**AccountStatusResponse**](AccountStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account information |  -  |

<a id="allOrderLists"></a>
# **allOrderLists**
> AllOrderListsResponse allOrderLists(allOrderListsRequest)

WebSocket Account Order list history

Query information about all your order lists, filtered by time range. Weight: 20

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApi apiInstance = new AccountApi(defaultClient);
    AllOrderListsRequest allOrderListsRequest = new AllOrderListsRequest(); // AllOrderListsRequest | 
    try {
      AllOrderListsResponse result = apiInstance.allOrderLists(allOrderListsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#allOrderLists");
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
| **allOrderListsRequest** | [**AllOrderListsRequest**](AllOrderListsRequest.md)|  | |

### Return type

[**AllOrderListsResponse**](AllOrderListsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account Order list history |  -  |

<a id="allOrders"></a>
# **allOrders**
> AllOrdersResponse allOrders(allOrdersRequest)

WebSocket Account order history

Query information about all your orders – active, canceled, filled – filtered by time range. Weight: 20

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApi apiInstance = new AccountApi(defaultClient);
    AllOrdersRequest allOrdersRequest = new AllOrdersRequest(); // AllOrdersRequest | 
    try {
      AllOrdersResponse result = apiInstance.allOrders(allOrdersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#allOrders");
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
| **allOrdersRequest** | [**AllOrdersRequest**](AllOrdersRequest.md)|  | |

### Return type

[**AllOrdersResponse**](AllOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account order history |  -  |

<a id="myAllocations"></a>
# **myAllocations**
> MyAllocationsResponse myAllocations(myAllocationsRequest)

WebSocket Account allocations

Retrieves allocations resulting from SOR order placement. Weight: 20

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApi apiInstance = new AccountApi(defaultClient);
    MyAllocationsRequest myAllocationsRequest = new MyAllocationsRequest(); // MyAllocationsRequest | 
    try {
      MyAllocationsResponse result = apiInstance.myAllocations(myAllocationsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#myAllocations");
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
| **myAllocationsRequest** | [**MyAllocationsRequest**](MyAllocationsRequest.md)|  | |

### Return type

[**MyAllocationsResponse**](MyAllocationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account allocations |  -  |

<a id="myPreventedMatches"></a>
# **myPreventedMatches**
> MyPreventedMatchesResponse myPreventedMatches(myPreventedMatchesRequest)

WebSocket Account prevented matches

Displays the list of orders that were expired due to STP.  These are the combinations supported:  * &#x60;symbol&#x60; + &#x60;preventedMatchId&#x60; * &#x60;symbol&#x60; + &#x60;orderId&#x60; * &#x60;symbol&#x60; + &#x60;orderId&#x60; + &#x60;fromPreventedMatchId&#x60; (&#x60;limit&#x60; will default to 500) * &#x60;symbol&#x60; + &#x60;orderId&#x60; + &#x60;fromPreventedMatchId&#x60; + &#x60;limit&#x60; Weight: Case                            | Weight ----                            | ----- If &#x60;symbol&#x60; is invalid          | 2 Querying by &#x60;preventedMatchId&#x60;  | 2 Querying by &#x60;orderId&#x60;           | 20

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApi apiInstance = new AccountApi(defaultClient);
    MyPreventedMatchesRequest myPreventedMatchesRequest = new MyPreventedMatchesRequest(); // MyPreventedMatchesRequest | 
    try {
      MyPreventedMatchesResponse result = apiInstance.myPreventedMatches(myPreventedMatchesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#myPreventedMatches");
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
| **myPreventedMatchesRequest** | [**MyPreventedMatchesRequest**](MyPreventedMatchesRequest.md)|  | |

### Return type

[**MyPreventedMatchesResponse**](MyPreventedMatchesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account prevented matches |  -  |

<a id="myTrades"></a>
# **myTrades**
> MyTradesResponse myTrades(myTradesRequest)

WebSocket Account trade history

Query information about all your trades, filtered by time range. Weight: Condition| Weight| ---| --- |Without orderId|20| |With orderId|5|

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApi apiInstance = new AccountApi(defaultClient);
    MyTradesRequest myTradesRequest = new MyTradesRequest(); // MyTradesRequest | 
    try {
      MyTradesResponse result = apiInstance.myTrades(myTradesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#myTrades");
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
| **myTradesRequest** | [**MyTradesRequest**](MyTradesRequest.md)|  | |

### Return type

[**MyTradesResponse**](MyTradesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account trade history |  -  |

<a id="orderAmendments"></a>
# **orderAmendments**
> OrderAmendmentsResponse orderAmendments(orderAmendmentsRequest)

WebSocket Query Order Amendments

Queries all amendments of a single order. Weight: 4

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApi apiInstance = new AccountApi(defaultClient);
    OrderAmendmentsRequest orderAmendmentsRequest = new OrderAmendmentsRequest(); // OrderAmendmentsRequest | 
    try {
      OrderAmendmentsResponse result = apiInstance.orderAmendments(orderAmendmentsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#orderAmendments");
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
| **orderAmendmentsRequest** | [**OrderAmendmentsRequest**](OrderAmendmentsRequest.md)|  | |

### Return type

[**OrderAmendmentsResponse**](OrderAmendmentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Query Order Amendments |  -  |

