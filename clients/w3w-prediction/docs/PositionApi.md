# PositionApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPositionByToken**](PositionApi.md#getPositionByToken) | **GET** /sapi/v1/w3w/wallet/prediction/position/token | Get Position by Token |
| [**queryPnL**](PositionApi.md#queryPnL) | **GET** /sapi/v1/w3w/wallet/prediction/pnl/query | Query PnL |
| [**queryPositions**](PositionApi.md#queryPositions) | **GET** /sapi/v1/w3w/wallet/prediction/position/list | Query Positions |
| [**queryPositionsByFilter**](PositionApi.md#queryPositionsByFilter) | **GET** /sapi/v1/w3w/wallet/prediction/position/filter | Query Positions by Filter |
| [**querySettledPositionHistory**](PositionApi.md#querySettledPositionHistory) | **GET** /sapi/v1/w3w/wallet/prediction/position/settled-history | Query Settled Position History |


<a id="getPositionByToken"></a>
# **getPositionByToken**
> GetPositionByTokenResponse getPositionByToken(walletAddress, tokenId, recvWindow)

Get Position by Token

Get the authenticated user&#39;s position detail for a specific prediction token.  Weight(IP): 200  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.PositionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    PositionApi apiInstance = new PositionApi(defaultClient);
    String walletAddress = "0x12e32db8817e292508c34111cbc4b23340df542c"; // String | User's prediction wallet address
    String tokenId = "112233"; // String | Prediction outcome token ID
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
    try {
      GetPositionByTokenResponse result = apiInstance.getPositionByToken(walletAddress, tokenId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionApi#getPositionByToken");
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
| **tokenId** | **String**| Prediction outcome token ID | |
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

### Return type

[**GetPositionByTokenResponse**](GetPositionByTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Position by Token |  -  |

<a id="queryPnL"></a>
# **queryPnL**
> QueryPnLResponse queryPnL(walletAddress, tokenId, marketId, marketTopicId, activeOnly, recvWindow)

Query PnL

Query profit and loss records for the authenticated user&#39;s prediction positions. When &#x60;tokenId&#x60; is provided, returns a single record in &#x60;pnl&#x60;; otherwise returns a list in &#x60;pnlList&#x60;.  Weight(IP): 200  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.PositionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    PositionApi apiInstance = new PositionApi(defaultClient);
    String walletAddress = "0x12e32db8817e292508c34111cbc4b23340df542c"; // String | User's prediction wallet address
    String tokenId = "112233"; // String | Filter by prediction token ID
    Long marketId = 5567895L; // Long | Filter by market ID. Must be > 0
    Long marketTopicId = 4229564L; // Long | Filter by market topic ID. Must be > 0
    Boolean activeOnly = false; // Boolean | If `true`, return only active (unresolved) positions
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
    try {
      QueryPnLResponse result = apiInstance.queryPnL(walletAddress, tokenId, marketId, marketTopicId, activeOnly, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionApi#queryPnL");
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
| **tokenId** | **String**| Filter by prediction token ID | [optional] |
| **marketId** | **Long**| Filter by market ID. Must be &gt; 0 | [optional] |
| **marketTopicId** | **Long**| Filter by market topic ID. Must be &gt; 0 | [optional] |
| **activeOnly** | **Boolean**| If &#x60;true&#x60;, return only active (unresolved) positions | [optional] |
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

### Return type

[**QueryPnLResponse**](QueryPnLResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Query PnL |  -  |

<a id="queryPositions"></a>
# **queryPositions**
> QueryPositionsResponse queryPositions(walletAddress, tab, offset, limit, recvWindow)

Query Positions

Get the authenticated user&#39;s prediction token positions with portfolio summary and tab-based filtering.  Weight(IP): 200  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.PositionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    PositionApi apiInstance = new PositionApi(defaultClient);
    String walletAddress = "0x12e32db8817e292508c34111cbc4b23340df542c"; // String | User's prediction wallet address
    String tab = "ONGOING"; // String | Position status tab. Values from `PositionQueryType`. Default `ONGOING`
    Integer offset = 0; // Integer | Pagination offset. Default `0`
    Integer limit = 20; // Integer | Page size. Default `20`, range 1–100
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
    try {
      QueryPositionsResponse result = apiInstance.queryPositions(walletAddress, tab, offset, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionApi#queryPositions");
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
| **tab** | **String**| Position status tab. Values from &#x60;PositionQueryType&#x60;. Default &#x60;ONGOING&#x60; | [optional] |
| **offset** | **Integer**| Pagination offset. Default &#x60;0&#x60; | [optional] |
| **limit** | **Integer**| Page size. Default &#x60;20&#x60;, range 1–100 | [optional] |
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

### Return type

[**QueryPositionsResponse**](QueryPositionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Query Positions |  -  |

<a id="queryPositionsByFilter"></a>
# **queryPositionsByFilter**
> QueryPositionsByFilterResponse queryPositionsByFilter(walletAddress, marketTopicId, recvWindow)

Query Positions by Filter

Get prediction positions filtered by wallet address and/or market topic ID. Both parameters are optional.  Weight(IP): 200  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.PositionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    PositionApi apiInstance = new PositionApi(defaultClient);
    String walletAddress = "0x12e32db8817e292508c34111cbc4b23340df542c"; // String | User's prediction wallet address
    Long marketTopicId = 4229564L; // Long | Filter by market topic ID
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
    try {
      QueryPositionsByFilterResponse result = apiInstance.queryPositionsByFilter(walletAddress, marketTopicId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionApi#queryPositionsByFilter");
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
| **walletAddress** | **String**| User&#39;s prediction wallet address | [optional] |
| **marketTopicId** | **Long**| Filter by market topic ID | [optional] |
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

### Return type

[**QueryPositionsByFilterResponse**](QueryPositionsByFilterResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Query Positions by Filter |  -  |

<a id="querySettledPositionHistory"></a>
# **querySettledPositionHistory**
> QuerySettledPositionHistoryResponse querySettledPositionHistory(walletAddress, l1Category, result, startDate, endDate, offset, limit, recvWindow)

Query Settled Position History

Get the authenticated user&#39;s settled (resolved) prediction position history with optional filters.  Weight(IP): 200  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.PositionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    PositionApi apiInstance = new PositionApi(defaultClient);
    String walletAddress = "0x12e32db8817e292508c34111cbc4b23340df542c"; // String | User's prediction wallet address
    String l1Category = "crypto"; // String | Filter by level-1 category
    Integer result = 1; // Integer | Settlement result filter
    String startDate = "2026-05-01"; // String | Start date. Format: `yyyy-MM-dd`. Must be ≤ `endDate`
    String endDate = "2026-05-25"; // String | End date. Format: `yyyy-MM-dd`. Must be ≥ `startDate`
    Integer offset = 0; // Integer | Pagination offset. Default `0`
    Integer limit = 20; // Integer | Page size. Default `20`, range 1–100
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
    try {
      QuerySettledPositionHistoryResponse result = apiInstance.querySettledPositionHistory(walletAddress, l1Category, result, startDate, endDate, offset, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionApi#querySettledPositionHistory");
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
| **result** | **Integer**| Settlement result filter | [optional] |
| **startDate** | **String**| Start date. Format: &#x60;yyyy-MM-dd&#x60;. Must be ≤ &#x60;endDate&#x60; | [optional] |
| **endDate** | **String**| End date. Format: &#x60;yyyy-MM-dd&#x60;. Must be ≥ &#x60;startDate&#x60; | [optional] |
| **offset** | **Integer**| Pagination offset. Default &#x60;0&#x60; | [optional] |
| **limit** | **Integer**| Page size. Default &#x60;20&#x60;, range 1–100 | [optional] |
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

### Return type

[**QuerySettledPositionHistoryResponse**](QuerySettledPositionHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Query Settled Position History |  -  |

