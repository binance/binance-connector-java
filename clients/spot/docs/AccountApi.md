# AccountApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accountCommission**](AccountApi.md#accountCommission) | **POST** /account.commission | Account Commission Rates (USER_DATA) |
| [**accountRateLimitsOrders**](AccountApi.md#accountRateLimitsOrders) | **POST** /account.rateLimits.orders | Unfilled Order Count (USER_DATA) |
| [**accountStatus**](AccountApi.md#accountStatus) | **POST** /account.status | Account information (USER_DATA) |
| [**allOrderLists**](AccountApi.md#allOrderLists) | **POST** /allOrderLists | Account order list history (USER_DATA) |
| [**allOrders**](AccountApi.md#allOrders) | **POST** /allOrders | Account order history (USER_DATA) |
| [**myAllocations**](AccountApi.md#myAllocations) | **POST** /myAllocations | Account allocations (USER_DATA) |
| [**myFilters**](AccountApi.md#myFilters) | **POST** /myFilters | Query Relevant Filters (USER_DATA) |
| [**myPreventedMatches**](AccountApi.md#myPreventedMatches) | **POST** /myPreventedMatches | Account prevented matches (USER_DATA) |
| [**myTrades**](AccountApi.md#myTrades) | **POST** /myTrades | Account trade history (USER_DATA) |
| [**openOrderListsStatus**](AccountApi.md#openOrderListsStatus) | **POST** /openOrderLists.status | Current open Order lists (USER_DATA) |
| [**openOrdersStatus**](AccountApi.md#openOrdersStatus) | **POST** /openOrders.status | Current open orders (USER_DATA) |
| [**orderAmendments**](AccountApi.md#orderAmendments) | **POST** /order.amendments | Query Order Amendments (USER_DATA) |
| [**orderListStatus**](AccountApi.md#orderListStatus) | **POST** /orderList.status | Query Order list (USER_DATA) |
| [**orderStatus**](AccountApi.md#orderStatus) | **POST** /order.status | Query order (USER_DATA) |


<a id="accountCommission"></a>
# **accountCommission**
> AccountCommissionResponse accountCommission(accountCommissionRequest)

Account Commission Rates (USER_DATA)

Get current account commission rates.  Weight(IP): 20  Security Type: USER_DATA  Notes: **Data Source:** Database

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

Unfilled Order Count (USER_DATA)

Query your current unfilled order count for all intervals.  Weight(IP): 40  Security Type: USER_DATA  Notes: **Data Source:** Memory

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
| **accountRateLimitsOrdersRequest** | [**AccountRateLimitsOrdersRequest**](AccountRateLimitsOrdersRequest.md)|  | [optional] |

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

Account information (USER_DATA)

Query information about your account.  Weight(IP): 20  Security Type: USER_DATA  Notes: **Data Source:** Memory &#x3D;&gt; Database

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
| **accountStatusRequest** | [**AccountStatusRequest**](AccountStatusRequest.md)|  | [optional] |

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

Account order list history (USER_DATA)

Query information about all your order lists, filtered by time range.  Weight(IP): 20  Security Type: USER_DATA  Notes: **Data Source:** Database  Notes: * If &#x60;startTime&#x60; and/or &#x60;endTime&#x60; are specified, &#x60;fromId&#x60; is ignored.   Order lists are filtered by &#x60;transactionTime&#x60; of the last order list execution status update. * If &#x60;fromId&#x60; is specified, return order lists with order list ID &gt;&#x3D; &#x60;fromId&#x60;. * If no condition is specified, the most recent order lists are returned. * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; can&#39;t be longer than 24 hours.

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
| **allOrderListsRequest** | [**AllOrderListsRequest**](AllOrderListsRequest.md)|  | [optional] |

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
| **200** | Account order list history |  -  |

<a id="allOrders"></a>
# **allOrders**
> AllOrdersResponse allOrders(allOrdersRequest)

Account order history (USER_DATA)

Query information about all your orders – active, canceled, filled – filtered by time range.  Weight(IP): 20  Security Type: USER_DATA  Notes: **Data Source:** Database  Notes:  * If &#x60;startTime&#x60; and/or &#x60;endTime&#x60; are specified, &#x60;orderId&#x60; is ignored.    Orders are filtered by &#x60;time&#x60; of the last execution status update.  * If &#x60;orderId&#x60; is specified, return orders with order ID &gt;&#x3D; &#x60;orderId&#x60;.  * If no condition is specified, the most recent orders are returned.  * For some historical orders the &#x60;cummulativeQuoteQty&#x60; response field may be negative,   meaning the data is not available at this time.  * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; can&#39;t be longer than 24 hours.

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

Account allocations (USER_DATA)

Retrieves allocations resulting from SOR order placement.  Weight(IP): 20  Security Type: USER_DATA  Notes: **Data Source:** Database  Supported parameter combinations:  Parameters                                  | Response | ------------------------------------------- | -------- | &#x60;symbol&#x60;                                    | allocations from oldest to newest | &#x60;symbol&#x60; + &#x60;startTime&#x60;                      | oldest allocations since &#x60;startTime&#x60; | &#x60;symbol&#x60; + &#x60;endTime&#x60;                        | newest allocations until &#x60;endTime&#x60; | &#x60;symbol&#x60; + &#x60;startTime&#x60; + &#x60;endTime&#x60;          | allocations within the time range | &#x60;symbol&#x60; + &#x60;fromAllocationId&#x60;               | allocations by allocation ID | &#x60;symbol&#x60; + &#x60;orderId&#x60;                        | allocations related to an order starting with oldest | &#x60;symbol&#x60; + &#x60;orderId&#x60; + &#x60;fromAllocationId&#x60;   | allocations related to an order by allocation ID |  **Note:** The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; can&#39;t be longer than 24 hours.

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

<a id="myFilters"></a>
# **myFilters**
> MyFiltersResponse myFilters(myFiltersRequest)

Query Relevant Filters (USER_DATA)

Retrieves the list of [filters](/products/spot/filters) relevant to an account on a given symbol. This is the only method that shows if an account has [&#x60;MAX_ASSET&#x60;](/products/spot/filters#max_asset) filters applied to it.  Weight(IP): 40  Security Type: USER_DATA  Notes: **Data Source:** Memory

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
    MyFiltersRequest myFiltersRequest = new MyFiltersRequest(); // MyFiltersRequest | 
    try {
      MyFiltersResponse result = apiInstance.myFilters(myFiltersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#myFilters");
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
| **myFiltersRequest** | [**MyFiltersRequest**](MyFiltersRequest.md)|  | |

### Return type

[**MyFiltersResponse**](MyFiltersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Query Relevant Filters |  -  |

<a id="myPreventedMatches"></a>
# **myPreventedMatches**
> MyPreventedMatchesResponse myPreventedMatches(myPreventedMatchesRequest)

Account prevented matches (USER_DATA)

Displays the list of orders that were expired due to STP.  These are the combinations supported:  * &#x60;symbol&#x60; + &#x60;preventedMatchId&#x60; * &#x60;symbol&#x60; + &#x60;orderId&#x60; * &#x60;symbol&#x60; + &#x60;orderId&#x60; + &#x60;fromPreventedMatchId&#x60; (&#x60;limit&#x60; will default to 500) * &#x60;symbol&#x60; + &#x60;orderId&#x60; + &#x60;fromPreventedMatchId&#x60; + &#x60;limit&#x60;  Weight: Case                            | Weight ----                            | ----- If &#x60;symbol&#x60; is invalid          | 2 Querying by &#x60;preventedMatchId&#x60;  | 2 Querying by &#x60;orderId&#x60;           | 20  Security Type: USER_DATA  Notes: **Data Source:** Database

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

Account trade history (USER_DATA)

Query information about all your trades, filtered by time range.  Weight: Condition| Weight| ---| --- |Without orderId|20| |With orderId|5|  Security Type: USER_DATA  Notes: Data Source: Memory &#x3D;&gt; Database  Notes: - If &#x60;fromId&#x60; is specified, return trades with trade ID &gt;&#x3D; &#x60;fromId&#x60;. - If &#x60;startTime&#x60; and/or &#x60;endTime&#x60; are specified, trades are filtered by execution time (&#x60;time&#x60;). - &#x60;fromId&#x60; cannot be used together with &#x60;startTime&#x60; and &#x60;endTime&#x60;. - If &#x60;orderId&#x60; is specified, only trades related to that order are returned. - &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be used together with &#x60;orderId&#x60;. - If no condition is specified, the most recent trades are returned. - The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; can&#39;t be longer than 24 hours.

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

<a id="openOrderListsStatus"></a>
# **openOrderListsStatus**
> OpenOrderListsStatusResponse openOrderListsStatus(openOrderListsStatusRequest)

Current open Order lists (USER_DATA)

Query execution status of all open order lists.  If you need to continuously monitor order status updates, please consider using WebSocket Streams:  * &#x60;userDataStream.subscribe&#x60; if on an authenticated session * &#x60;userDataStream.subscribe.signature&#x60; if subscribing through signature subscription  Weight(IP): 6  Security Type: USER_DATA  Notes: **Data Source:** Memory -&gt; Database

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
    OpenOrderListsStatusRequest openOrderListsStatusRequest = new OpenOrderListsStatusRequest(); // OpenOrderListsStatusRequest | 
    try {
      OpenOrderListsStatusResponse result = apiInstance.openOrderListsStatus(openOrderListsStatusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#openOrderListsStatus");
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
| **openOrderListsStatusRequest** | [**OpenOrderListsStatusRequest**](OpenOrderListsStatusRequest.md)|  | [optional] |

### Return type

[**OpenOrderListsStatusResponse**](OpenOrderListsStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current open Order lists |  -  |

<a id="openOrdersStatus"></a>
# **openOrdersStatus**
> OpenOrdersStatusResponse openOrdersStatus(openOrdersStatusRequest)

Current open orders (USER_DATA)

Query execution status of all open orders.  If you need to continuously monitor order status updates, please consider using WebSocket Streams:  * &#x60;userDataStream.subscribe&#x60; if on an authenticated session * &#x60;userDataStream.subscribe.signature&#x60; if subscribing through signature subscription  Weight: | Parameter | Weight | | --------- | ------ | | &#x60;symbol&#x60;  |      6 | | none      |     80 |  Security Type: USER_DATA  Notes: Data Source: Memory &#x3D;&gt; Database

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
    OpenOrdersStatusRequest openOrdersStatusRequest = new OpenOrdersStatusRequest(); // OpenOrdersStatusRequest | 
    try {
      OpenOrdersStatusResponse result = apiInstance.openOrdersStatus(openOrdersStatusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#openOrdersStatus");
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
| **openOrdersStatusRequest** | [**OpenOrdersStatusRequest**](OpenOrdersStatusRequest.md)|  | [optional] |

### Return type

[**OpenOrdersStatusResponse**](OpenOrdersStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current open orders |  -  |

<a id="orderAmendments"></a>
# **orderAmendments**
> OrderAmendmentsResponse orderAmendments(orderAmendmentsRequest)

Query Order Amendments (USER_DATA)

Queries all amendments of a single order.  Weight(IP): 4  Security Type: USER_DATA  Notes: **Data Source:** Database

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

<a id="orderListStatus"></a>
# **orderListStatus**
> OrderListStatusResponse orderListStatus(orderListStatusRequest)

Query Order list (USER_DATA)

Check execution status of an Order list.  For execution status of individual orders, use &#x60;order.status&#x60;.  Weight(IP): 4  Security Type: USER_DATA  Notes: **Data Source:** Database  Notes:  * &#x60;origClientOrderId&#x60; refers to &#x60;listClientOrderId&#x60; of the order list itself.  * If both &#x60;origClientOrderId&#x60; and &#x60;orderListId&#x60; parameters are specified,   only &#x60;origClientOrderId&#x60; is used and &#x60;orderListId&#x60; is ignored.

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
    OrderListStatusRequest orderListStatusRequest = new OrderListStatusRequest(); // OrderListStatusRequest | 
    try {
      OrderListStatusResponse result = apiInstance.orderListStatus(orderListStatusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#orderListStatus");
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
| **orderListStatusRequest** | [**OrderListStatusRequest**](OrderListStatusRequest.md)|  | [optional] |

### Return type

[**OrderListStatusResponse**](OrderListStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Query Order list |  -  |

<a id="orderStatus"></a>
# **orderStatus**
> OrderStatusResponse orderStatus(orderStatusRequest)

Query order (USER_DATA)

Check execution status of an order.  Weight(IP): 4  Security Type: USER_DATA  Notes: **Data Source:** Memory &#x3D;&gt; Database  Notes:  * If both &#x60;orderId&#x60; and &#x60;origClientOrderId&#x60; are provided, the &#x60;orderId&#x60; is searched first, then the &#x60;origClientOrderId&#x60; from that result is checked against that order. If both conditions are not met the request will be rejected.  * For some historical orders the &#x60;cummulativeQuoteQty&#x60; response field may be negative,   meaning the data is not available at this time.

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
    OrderStatusRequest orderStatusRequest = new OrderStatusRequest(); // OrderStatusRequest | 
    try {
      OrderStatusResponse result = apiInstance.orderStatus(orderStatusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#orderStatus");
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
| **orderStatusRequest** | [**OrderStatusRequest**](OrderStatusRequest.md)|  | |

### Return type

[**OrderStatusResponse**](OrderStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Query order |  -  |

