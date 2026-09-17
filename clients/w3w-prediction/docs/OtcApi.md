# OtcApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOtcBlocktrade**](OtcApi.md#createOtcBlocktrade) | **POST** /sapi/v1/w3w/wallet/prediction/otc/blocktrade/create | Create OTC Blocktrade (PREDICTION_TRADE) |
| [**fulfilOtcBlocktrade**](OtcApi.md#fulfilOtcBlocktrade) | **POST** /sapi/v1/w3w/wallet/prediction/otc/blocktrade/fulfil | Fulfil OTC Blocktrade (PREDICTION_TRADE) |
| [**getOtcBlocktradeDetail**](OtcApi.md#getOtcBlocktradeDetail) | **POST** /sapi/v1/w3w/wallet/prediction/otc/blocktrade/detail | Get OTC Blocktrade Detail (PREDICTION_TRADE) |
| [**getOtcBlocktradeEvents**](OtcApi.md#getOtcBlocktradeEvents) | **POST** /sapi/v1/w3w/wallet/prediction/otc/blocktrade/events | Get OTC Blocktrade Events (PREDICTION_TRADE) |
| [**getOtcReservedBalances**](OtcApi.md#getOtcReservedBalances) | **POST** /sapi/v1/w3w/wallet/prediction/otc/blocktrade/reserved-balances | Get OTC Reserved Balances (PREDICTION_TRADE) |
| [**listOtcBlocktrades**](OtcApi.md#listOtcBlocktrades) | **POST** /sapi/v1/w3w/wallet/prediction/otc/blocktrade/list | List OTC Blocktrades (PREDICTION_TRADE) |
| [**previewOtcBlocktrade**](OtcApi.md#previewOtcBlocktrade) | **POST** /sapi/v1/w3w/wallet/prediction/otc/blocktrade/preview | Preview OTC Blocktrade (PREDICTION_TRADE) |
| [**removeOtcBlocktrades**](OtcApi.md#removeOtcBlocktrades) | **POST** /sapi/v1/w3w/wallet/prediction/otc/blocktrade/remove | Remove OTC Blocktrades (PREDICTION_TRADE) |


<a id="createOtcBlocktrade"></a>
# **createOtcBlocktrade**
> CreateOtcBlocktradeResponse createOtcBlocktrade(createOtcBlocktradeRequest)

Create OTC Blocktrade (PREDICTION_TRADE)

Create an OTC blocktrade as the maker (BID to buy outcome shares with USDT, or ASK to sell outcome shares for USDT). The maker wallet is resolved server-side by &#x60;userId&#x60;; signing is done server-side via SAS &#x60;typedDataSign&#x60;. Returns &#x60;orderId&#x60; and a one-time &#x60;secretToken&#x60; to share out-of-band with the intended taker.  Weight(IP): 200  Security Type: PREDICTION_TRADE  Notes: - Restricted to authorized market makers. Requests from unauthorized accounts are rejected — contact BD to request access. - Side &amp; Amount Rules:    | side   | makerAmount   | takerAmount   |   | ------ | ------------- | ------------- |   | &#x60;BUY&#x60;  | USDT (wei)    | shares (wei)  |   | &#x60;SELL&#x60; | shares (wei)  | USDT (wei)    | - \&quot;Note on &#x60;side&#x60; encoding: this request uses a string enum (&#x60;BUY&#x60;/&#x60;SELL&#x60;). Responses from Get Blocktrade Detail / Preview / List return &#x60;side&#x60; as an integer and also include a &#x60;quoteType&#x60; string — both encode the same concept.\&quot;    | Request &#x60;side&#x60; | Response &#x60;side&#x60; (Integer) | Response &#x60;quoteType&#x60; |   | --------------- | -------------------------- | ---------------------- |   | &#x60;BUY&#x60;           | &#x60;0&#x60;                         | &#x60;\&quot;Bid\&quot;&#x60;                |   | &#x60;SELL&#x60;          | &#x60;1&#x60;                         | &#x60;\&quot;Ask\&quot;&#x60;                |

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.OtcApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    OtcApi apiInstance = new OtcApi(defaultClient);
    CreateOtcBlocktradeRequest createOtcBlocktradeRequest = new CreateOtcBlocktradeRequest(); // CreateOtcBlocktradeRequest | 
    try {
      CreateOtcBlocktradeResponse result = apiInstance.createOtcBlocktrade(createOtcBlocktradeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OtcApi#createOtcBlocktrade");
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
| **createOtcBlocktradeRequest** | [**CreateOtcBlocktradeRequest**](CreateOtcBlocktradeRequest.md)|  | |

### Return type

[**CreateOtcBlocktradeResponse**](CreateOtcBlocktradeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create OTC Blocktrade |  -  |

<a id="fulfilOtcBlocktrade"></a>
# **fulfilOtcBlocktrade**
> FulfilOtcBlocktradeResponse fulfilOtcBlocktrade(fulfilOtcBlocktradeRequest)

Fulfil OTC Blocktrade (PREDICTION_TRADE)

Fulfil an open maker blocktrade as the taker, using the &#x60;secretToken&#x60; the maker shared out-of-band. All-or-nothing fill (no partial fill); the taker order is the server-derived symmetric inverse of the maker order.  Weight(IP): 200  Security Type: PREDICTION_TRADE  Notes: - Restricted to authorized market makers. Requests from unauthorized accounts are rejected — contact BD to request access.

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.OtcApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    OtcApi apiInstance = new OtcApi(defaultClient);
    FulfilOtcBlocktradeRequest fulfilOtcBlocktradeRequest = new FulfilOtcBlocktradeRequest(); // FulfilOtcBlocktradeRequest | 
    try {
      FulfilOtcBlocktradeResponse result = apiInstance.fulfilOtcBlocktrade(fulfilOtcBlocktradeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OtcApi#fulfilOtcBlocktrade");
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
| **fulfilOtcBlocktradeRequest** | [**FulfilOtcBlocktradeRequest**](FulfilOtcBlocktradeRequest.md)|  | |

### Return type

[**FulfilOtcBlocktradeResponse**](FulfilOtcBlocktradeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fulfil OTC Blocktrade |  -  |

<a id="getOtcBlocktradeDetail"></a>
# **getOtcBlocktradeDetail**
> GetOtcBlocktradeDetailResponse getOtcBlocktradeDetail(getOtcBlocktradeDetailRequest)

Get OTC Blocktrade Detail (PREDICTION_TRADE)

Query the maker&#39;s own blocktrade by &#x60;orderId&#x60;. Returns full order data including status and &#x60;secretToken&#x60;.  Weight(IP): 200  Security Type: PREDICTION_TRADE  Notes: - Restricted to authorized market makers. Requests from unauthorized accounts are rejected — contact BD to request access.

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.OtcApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    OtcApi apiInstance = new OtcApi(defaultClient);
    GetOtcBlocktradeDetailRequest getOtcBlocktradeDetailRequest = new GetOtcBlocktradeDetailRequest(); // GetOtcBlocktradeDetailRequest | 
    try {
      GetOtcBlocktradeDetailResponse result = apiInstance.getOtcBlocktradeDetail(getOtcBlocktradeDetailRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OtcApi#getOtcBlocktradeDetail");
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
| **getOtcBlocktradeDetailRequest** | [**GetOtcBlocktradeDetailRequest**](GetOtcBlocktradeDetailRequest.md)|  | |

### Return type

[**GetOtcBlocktradeDetailResponse**](GetOtcBlocktradeDetailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get OTC Blocktrade Detail |  -  |

<a id="getOtcBlocktradeEvents"></a>
# **getOtcBlocktradeEvents**
> GetOtcBlocktradeEventsResponse getOtcBlocktradeEvents(getOtcBlocktradeEventsRequest)

Get OTC Blocktrade Events (PREDICTION_TRADE)

Paginated feed of blocktrade lifecycle and settlement events (CREATE, FULFIL, MATCH_SUBMIT, MATCH_SUCCESS, EXPIRE, FAILED, etc.).  Weight(IP): 200  Security Type: PREDICTION_TRADE  Notes: - Restricted to authorized market makers. Requests from unauthorized accounts are rejected — contact BD to request access.

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.OtcApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    OtcApi apiInstance = new OtcApi(defaultClient);
    GetOtcBlocktradeEventsRequest getOtcBlocktradeEventsRequest = new GetOtcBlocktradeEventsRequest(); // GetOtcBlocktradeEventsRequest | 
    try {
      GetOtcBlocktradeEventsResponse result = apiInstance.getOtcBlocktradeEvents(getOtcBlocktradeEventsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OtcApi#getOtcBlocktradeEvents");
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
| **getOtcBlocktradeEventsRequest** | [**GetOtcBlocktradeEventsRequest**](GetOtcBlocktradeEventsRequest.md)|  | [optional] |

### Return type

[**GetOtcBlocktradeEventsResponse**](GetOtcBlocktradeEventsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get OTC Blocktrade Events |  -  |

<a id="getOtcReservedBalances"></a>
# **getOtcReservedBalances**
> GetOtcReservedBalancesResponse getOtcReservedBalances(getOtcReservedBalancesRequest)

Get OTC Reserved Balances (PREDICTION_TRADE)

Query PredictFun reserved balances for the caller&#39;s bound wallet — these are funds locked by the caller&#39;s open OTC blocktrade orders (maker BID locks USDT, maker ASK locks shares). Not tied to a specific blocktrade id; the path nesting under &#x60;otc/blocktrade&#x60; reflects the cause of the lock, not a per-order query. Returns one entry per requested asset, aligned with the request order. Pass &#x60;{type:\&quot;USDT\&quot;}&#x60; for reserved USDT, or &#x60;{type:\&quot;SHARE\&quot;, tokenId:\&quot;...\&quot;}&#x60; for a specific outcome token&#39;s reserved shares.  Weight(IP): 200  Security Type: PREDICTION_TRADE  Notes: - Restricted to authorized market makers. Requests from unauthorized accounts are rejected — contact BD to request access. - AssetQuery:    | Name    | Type   | Mandatory | Description |   | ------- | ------ | --------- | ----------- |   | type    | STRING | YES       | Asset type. Enum: &#x60;USDT&#x60;, &#x60;SHARE&#x60; |   | tokenId | STRING | NO        | Outcome token id (present for &#x60;SHARE&#x60; entries only) |

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.OtcApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    OtcApi apiInstance = new OtcApi(defaultClient);
    GetOtcReservedBalancesRequest getOtcReservedBalancesRequest = new GetOtcReservedBalancesRequest(); // GetOtcReservedBalancesRequest | 
    try {
      GetOtcReservedBalancesResponse result = apiInstance.getOtcReservedBalances(getOtcReservedBalancesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OtcApi#getOtcReservedBalances");
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
| **getOtcReservedBalancesRequest** | [**GetOtcReservedBalancesRequest**](GetOtcReservedBalancesRequest.md)|  | |

### Return type

[**GetOtcReservedBalancesResponse**](GetOtcReservedBalancesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get OTC Reserved Balances |  -  |

<a id="listOtcBlocktrades"></a>
# **listOtcBlocktrades**
> ListOtcBlocktradesResponse listOtcBlocktrades(listOtcBlocktradesRequest)

List OTC Blocktrades (PREDICTION_TRADE)

List the maker&#39;s own blocktrades with optional status filter and cursor pagination.  Weight(IP): 200  Security Type: PREDICTION_TRADE  Notes: - Restricted to authorized market makers. Requests from unauthorized accounts are rejected — contact BD to request access.

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.OtcApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    OtcApi apiInstance = new OtcApi(defaultClient);
    ListOtcBlocktradesRequest listOtcBlocktradesRequest = new ListOtcBlocktradesRequest(); // ListOtcBlocktradesRequest | 
    try {
      ListOtcBlocktradesResponse result = apiInstance.listOtcBlocktrades(listOtcBlocktradesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OtcApi#listOtcBlocktrades");
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
| **listOtcBlocktradesRequest** | [**ListOtcBlocktradesRequest**](ListOtcBlocktradesRequest.md)|  | [optional] |

### Return type

[**ListOtcBlocktradesResponse**](ListOtcBlocktradesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List OTC Blocktrades |  -  |

<a id="previewOtcBlocktrade"></a>
# **previewOtcBlocktrade**
> PreviewOtcBlocktradeResponse previewOtcBlocktrade(previewOtcBlocktradeRequest)

Preview OTC Blocktrade (PREDICTION_TRADE)

Inspect an open blocktrade by &#x60;secretToken&#x60; (no &#x60;orderId&#x60; needed). Taker uses this to preview the maker order before fulfilling. Returns the same shape as &#x60;Get Blocktrade Detail&#x60;, but &#x60;orderId&#x60; is &#x60;null&#x60; and &#x60;secretToken&#x60; is never returned from this endpoint.  Weight(IP): 200  Security Type: PREDICTION_TRADE  Notes: - Restricted to authorized market makers. Requests from unauthorized accounts are rejected — contact BD to request access.

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.OtcApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    OtcApi apiInstance = new OtcApi(defaultClient);
    PreviewOtcBlocktradeRequest previewOtcBlocktradeRequest = new PreviewOtcBlocktradeRequest(); // PreviewOtcBlocktradeRequest | 
    try {
      PreviewOtcBlocktradeResponse result = apiInstance.previewOtcBlocktrade(previewOtcBlocktradeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OtcApi#previewOtcBlocktrade");
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
| **previewOtcBlocktradeRequest** | [**PreviewOtcBlocktradeRequest**](PreviewOtcBlocktradeRequest.md)|  | |

### Return type

[**PreviewOtcBlocktradeResponse**](PreviewOtcBlocktradeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Preview OTC Blocktrade |  -  |

<a id="removeOtcBlocktrades"></a>
# **removeOtcBlocktrades**
> RemoveOtcBlocktradesResponse removeOtcBlocktrades(removeOtcBlocktradesRequest)

Remove OTC Blocktrades (PREDICTION_TRADE)

Cancel open or fulfilled-but-unsettled blocktrades. Terminal orders (already &#x60;MATCHED&#x60;/&#x60;CANCELLED&#x60;/&#x60;EXPIRED&#x60;/&#x60;FAILED&#x60;) are returned in &#x60;noop&#x60; instead of &#x60;removed&#x60;.  Weight(IP): 200  Security Type: PREDICTION_TRADE  Notes: - Restricted to authorized market makers. Requests from unauthorized accounts are rejected — contact BD to request access.

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.OtcApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    OtcApi apiInstance = new OtcApi(defaultClient);
    RemoveOtcBlocktradesRequest removeOtcBlocktradesRequest = new RemoveOtcBlocktradesRequest(); // RemoveOtcBlocktradesRequest | 
    try {
      RemoveOtcBlocktradesResponse result = apiInstance.removeOtcBlocktrades(removeOtcBlocktradesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OtcApi#removeOtcBlocktrades");
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
| **removeOtcBlocktradesRequest** | [**RemoveOtcBlocktradesRequest**](RemoveOtcBlocktradesRequest.md)|  | |

### Return type

[**RemoveOtcBlocktradesResponse**](RemoveOtcBlocktradesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Remove OTC Blocktrades |  -  |

