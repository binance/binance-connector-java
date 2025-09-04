# OnChainYieldsApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getOnChainYieldsLockedPersonalLeftQuota**](OnChainYieldsApi.md#getOnChainYieldsLockedPersonalLeftQuota) | **GET** /sapi/v1/onchain-yields/locked/personalLeftQuota | Get On-chain Yields Locked Personal Left Quota (USER_DATA) |
| [**getOnChainYieldsLockedProductList**](OnChainYieldsApi.md#getOnChainYieldsLockedProductList) | **GET** /sapi/v1/onchain-yields/locked/list | Get On-chain Yields Locked Product List (USER_DATA) |
| [**getOnChainYieldsLockedProductPosition**](OnChainYieldsApi.md#getOnChainYieldsLockedProductPosition) | **GET** /sapi/v1/onchain-yields/locked/position | Get On-chain Yields Locked Product Position (USER_DATA) |
| [**getOnChainYieldsLockedRedemptionRecord**](OnChainYieldsApi.md#getOnChainYieldsLockedRedemptionRecord) | **GET** /sapi/v1/onchain-yields/locked/history/redemptionRecord | Get On-chain Yields Locked Redemption Record (USER_DATA) |
| [**getOnChainYieldsLockedRewardsHistory**](OnChainYieldsApi.md#getOnChainYieldsLockedRewardsHistory) | **GET** /sapi/v1/onchain-yields/locked/history/rewardsRecord | Get On-chain Yields Locked Rewards History (USER_DATA) |
| [**getOnChainYieldsLockedSubscriptionPreview**](OnChainYieldsApi.md#getOnChainYieldsLockedSubscriptionPreview) | **GET** /sapi/v1/onchain-yields/locked/subscriptionPreview | Get On-chain Yields Locked Subscription Preview (USER_DATA) |
| [**getOnChainYieldsLockedSubscriptionRecord**](OnChainYieldsApi.md#getOnChainYieldsLockedSubscriptionRecord) | **GET** /sapi/v1/onchain-yields/locked/history/subscriptionRecord | Get On-chain Yields Locked Subscription Record (USER_DATA) |
| [**onChainYieldsAccount**](OnChainYieldsApi.md#onChainYieldsAccount) | **GET** /sapi/v1/onchain-yields/account | On-chain Yields Account (USER_DATA) |
| [**redeemOnChainYieldsLockedProduct**](OnChainYieldsApi.md#redeemOnChainYieldsLockedProduct) | **POST** /sapi/v1/onchain-yields/locked/redeem | Redeem On-chain Yields Locked Product (TRADE) |
| [**setOnChainYieldsLockedAutoSubscribe**](OnChainYieldsApi.md#setOnChainYieldsLockedAutoSubscribe) | **POST** /sapi/v1/onchain-yields/locked/setAutoSubscribe | Set On-chain Yields Locked Auto Subscribe(USER_DATA) |
| [**setOnChainYieldsLockedProductRedeemOption**](OnChainYieldsApi.md#setOnChainYieldsLockedProductRedeemOption) | **POST** /sapi/v1/onchain-yields/locked/setRedeemOption | Set On-chain Yields Locked Product Redeem Option(USER_DATA) |
| [**subscribeOnChainYieldsLockedProduct**](OnChainYieldsApi.md#subscribeOnChainYieldsLockedProduct) | **POST** /sapi/v1/onchain-yields/locked/subscribe | Subscribe On-chain Yields Locked Product(TRADE) |


<a id="getOnChainYieldsLockedPersonalLeftQuota"></a>
# **getOnChainYieldsLockedPersonalLeftQuota**
> GetOnChainYieldsLockedPersonalLeftQuotaResponse getOnChainYieldsLockedPersonalLeftQuota(projectId, recvWindow)

Get On-chain Yields Locked Personal Left Quota (USER_DATA)

Get On-chain Yields Locked Personal Left Quota  Weight: 50

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.OnChainYieldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    OnChainYieldsApi apiInstance = new OnChainYieldsApi(defaultClient);
    String projectId = "projectId_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      GetOnChainYieldsLockedPersonalLeftQuotaResponse result = apiInstance.getOnChainYieldsLockedPersonalLeftQuota(projectId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnChainYieldsApi#getOnChainYieldsLockedPersonalLeftQuota");
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
| **projectId** | **String**|  | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetOnChainYieldsLockedPersonalLeftQuotaResponse**](GetOnChainYieldsLockedPersonalLeftQuotaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get On-chain Yields Locked Personal Left Quota |  -  |

<a id="getOnChainYieldsLockedProductList"></a>
# **getOnChainYieldsLockedProductList**
> GetOnChainYieldsLockedProductListResponse getOnChainYieldsLockedProductList(asset, current, size, recvWindow)

Get On-chain Yields Locked Product List (USER_DATA)

Get available On-chain Yields Locked product list  * Get available On-chain Yields Locked product list  Weight: 50

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.OnChainYieldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    OnChainYieldsApi apiInstance = new OnChainYieldsApi(defaultClient);
    String asset = "asset_example"; // String | 
    Long current = 56L; // Long | Currently querying page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetOnChainYieldsLockedProductListResponse result = apiInstance.getOnChainYieldsLockedProductList(asset, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnChainYieldsApi#getOnChainYieldsLockedProductList");
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
| **asset** | **String**|  | [optional] |
| **current** | **Long**| Currently querying page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10, Max:100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetOnChainYieldsLockedProductListResponse**](GetOnChainYieldsLockedProductListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get On-chain Yields Locked Product List |  -  |

<a id="getOnChainYieldsLockedProductPosition"></a>
# **getOnChainYieldsLockedProductPosition**
> GetOnChainYieldsLockedProductPositionResponse getOnChainYieldsLockedProductPosition(asset, positionId, projectId, current, size, recvWindow)

Get On-chain Yields Locked Product Position (USER_DATA)

Get On-chain Yields Locked Product Position  Weight: 50

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.OnChainYieldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    OnChainYieldsApi apiInstance = new OnChainYieldsApi(defaultClient);
    String asset = "asset_example"; // String | 
    String positionId = "positionId_example"; // String | 
    String projectId = "projectId_example"; // String | 
    Long current = 56L; // Long | Currently querying page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetOnChainYieldsLockedProductPositionResponse result = apiInstance.getOnChainYieldsLockedProductPosition(asset, positionId, projectId, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnChainYieldsApi#getOnChainYieldsLockedProductPosition");
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
| **asset** | **String**|  | [optional] |
| **positionId** | **String**|  | [optional] |
| **projectId** | **String**|  | [optional] |
| **current** | **Long**| Currently querying page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10, Max:100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetOnChainYieldsLockedProductPositionResponse**](GetOnChainYieldsLockedProductPositionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get On-chain Yields Locked Product Position |  -  |

<a id="getOnChainYieldsLockedRedemptionRecord"></a>
# **getOnChainYieldsLockedRedemptionRecord**
> GetOnChainYieldsLockedRedemptionRecordResponse getOnChainYieldsLockedRedemptionRecord(positionId, redeemId, asset, startTime, endTime, current, size, recvWindow)

Get On-chain Yields Locked Redemption Record (USER_DATA)

Get On-chain Yields Locked Redemption Record  * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be returned.  Weight: 50

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.OnChainYieldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    OnChainYieldsApi apiInstance = new OnChainYieldsApi(defaultClient);
    String positionId = "positionId_example"; // String | 
    String redeemId = "redeemId_example"; // String | 
    String asset = "asset_example"; // String | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetOnChainYieldsLockedRedemptionRecordResponse result = apiInstance.getOnChainYieldsLockedRedemptionRecord(positionId, redeemId, asset, startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnChainYieldsApi#getOnChainYieldsLockedRedemptionRecord");
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
| **positionId** | **String**|  | [optional] |
| **redeemId** | **String**|  | [optional] |
| **asset** | **String**|  | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Currently querying page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10, Max:100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetOnChainYieldsLockedRedemptionRecordResponse**](GetOnChainYieldsLockedRedemptionRecordResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get On-chain Yields Locked Redemption Record |  -  |

<a id="getOnChainYieldsLockedRewardsHistory"></a>
# **getOnChainYieldsLockedRewardsHistory**
> GetOnChainYieldsLockedRewardsHistoryResponse getOnChainYieldsLockedRewardsHistory(positionId, asset, startTime, endTime, current, size, recvWindow)

Get On-chain Yields Locked Rewards History (USER_DATA)

Get On-chain Yields Locked Rewards History  * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be returned.  Weight: 50

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.OnChainYieldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    OnChainYieldsApi apiInstance = new OnChainYieldsApi(defaultClient);
    String positionId = "positionId_example"; // String | 
    String asset = "asset_example"; // String | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetOnChainYieldsLockedRewardsHistoryResponse result = apiInstance.getOnChainYieldsLockedRewardsHistory(positionId, asset, startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnChainYieldsApi#getOnChainYieldsLockedRewardsHistory");
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
| **positionId** | **String**|  | [optional] |
| **asset** | **String**|  | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Currently querying page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10, Max:100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetOnChainYieldsLockedRewardsHistoryResponse**](GetOnChainYieldsLockedRewardsHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get On-chain Yields Locked Rewards History |  -  |

<a id="getOnChainYieldsLockedSubscriptionPreview"></a>
# **getOnChainYieldsLockedSubscriptionPreview**
> GetOnChainYieldsLockedSubscriptionPreviewResponse getOnChainYieldsLockedSubscriptionPreview(projectId, amount, autoSubscribe, recvWindow)

Get On-chain Yields Locked Subscription Preview (USER_DATA)

Get On-chain Yields Locked Subscription Preview  Weight: 50

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.OnChainYieldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    OnChainYieldsApi apiInstance = new OnChainYieldsApi(defaultClient);
    String projectId = "projectId_example"; // String | 
    Double amount = 3.4D; // Double | 
    Boolean autoSubscribe = true; // Boolean | true or false, default true.
    Long recvWindow = 56L; // Long | 
    try {
      GetOnChainYieldsLockedSubscriptionPreviewResponse result = apiInstance.getOnChainYieldsLockedSubscriptionPreview(projectId, amount, autoSubscribe, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnChainYieldsApi#getOnChainYieldsLockedSubscriptionPreview");
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
| **projectId** | **String**|  | |
| **amount** | **Double**|  | |
| **autoSubscribe** | **Boolean**| true or false, default true. | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetOnChainYieldsLockedSubscriptionPreviewResponse**](GetOnChainYieldsLockedSubscriptionPreviewResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get On-chain Yields Locked Subscription Preview |  -  |

<a id="getOnChainYieldsLockedSubscriptionRecord"></a>
# **getOnChainYieldsLockedSubscriptionRecord**
> GetOnChainYieldsLockedSubscriptionRecordResponse getOnChainYieldsLockedSubscriptionRecord(purchaseId, clientId, asset, startTime, endTime, current, size, recvWindow)

Get On-chain Yields Locked Subscription Record (USER_DATA)

Get On-chain Yields Locked Subscription Record  * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be returned.  Weight: 50

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.OnChainYieldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    OnChainYieldsApi apiInstance = new OnChainYieldsApi(defaultClient);
    String purchaseId = "purchaseId_example"; // String | 
    String clientId = "clientId_example"; // String | 
    String asset = "asset_example"; // String | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetOnChainYieldsLockedSubscriptionRecordResponse result = apiInstance.getOnChainYieldsLockedSubscriptionRecord(purchaseId, clientId, asset, startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnChainYieldsApi#getOnChainYieldsLockedSubscriptionRecord");
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
| **purchaseId** | **String**|  | [optional] |
| **clientId** | **String**|  | [optional] |
| **asset** | **String**|  | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Currently querying page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10, Max:100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetOnChainYieldsLockedSubscriptionRecordResponse**](GetOnChainYieldsLockedSubscriptionRecordResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get On-chain Yields Locked Subscription Record |  -  |

<a id="onChainYieldsAccount"></a>
# **onChainYieldsAccount**
> OnChainYieldsAccountResponse onChainYieldsAccount(recvWindow)

On-chain Yields Account (USER_DATA)

On-chain Yields Account query  Weight: 50

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.OnChainYieldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    OnChainYieldsApi apiInstance = new OnChainYieldsApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      OnChainYieldsAccountResponse result = apiInstance.onChainYieldsAccount(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnChainYieldsApi#onChainYieldsAccount");
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

[**OnChainYieldsAccountResponse**](OnChainYieldsAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | On-chain Yields Account |  -  |

<a id="redeemOnChainYieldsLockedProduct"></a>
# **redeemOnChainYieldsLockedProduct**
> RedeemOnChainYieldsLockedProductResponse redeemOnChainYieldsLockedProduct(redeemOnChainYieldsLockedProductRequest)

Redeem On-chain Yields Locked Product (TRADE)

Redeem On-chain Yields Locked Product  * You need to open &#x60;Enable Spot &amp; Margin Trading&#x60; permission for the API Key which requests this endpoint.  Weight: 1/3s per account

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.OnChainYieldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    OnChainYieldsApi apiInstance = new OnChainYieldsApi(defaultClient);
    RedeemOnChainYieldsLockedProductRequest redeemOnChainYieldsLockedProductRequest = new RedeemOnChainYieldsLockedProductRequest(); // RedeemOnChainYieldsLockedProductRequest | 
    try {
      RedeemOnChainYieldsLockedProductResponse result = apiInstance.redeemOnChainYieldsLockedProduct(redeemOnChainYieldsLockedProductRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnChainYieldsApi#redeemOnChainYieldsLockedProduct");
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
| **redeemOnChainYieldsLockedProductRequest** | [**RedeemOnChainYieldsLockedProductRequest**](RedeemOnChainYieldsLockedProductRequest.md)|  | |

### Return type

[**RedeemOnChainYieldsLockedProductResponse**](RedeemOnChainYieldsLockedProductResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Redeem On-chain Yields Locked Product |  -  |

<a id="setOnChainYieldsLockedAutoSubscribe"></a>
# **setOnChainYieldsLockedAutoSubscribe**
> SetOnChainYieldsLockedAutoSubscribeResponse setOnChainYieldsLockedAutoSubscribe(setOnChainYieldsLockedAutoSubscribeRequest)

Set On-chain Yields Locked Auto Subscribe(USER_DATA)

Set On-chain Yield locked auto subscribe  Weight: 50

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.OnChainYieldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    OnChainYieldsApi apiInstance = new OnChainYieldsApi(defaultClient);
    SetOnChainYieldsLockedAutoSubscribeRequest setOnChainYieldsLockedAutoSubscribeRequest = new SetOnChainYieldsLockedAutoSubscribeRequest(); // SetOnChainYieldsLockedAutoSubscribeRequest | 
    try {
      SetOnChainYieldsLockedAutoSubscribeResponse result = apiInstance.setOnChainYieldsLockedAutoSubscribe(setOnChainYieldsLockedAutoSubscribeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnChainYieldsApi#setOnChainYieldsLockedAutoSubscribe");
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
| **setOnChainYieldsLockedAutoSubscribeRequest** | [**SetOnChainYieldsLockedAutoSubscribeRequest**](SetOnChainYieldsLockedAutoSubscribeRequest.md)|  | |

### Return type

[**SetOnChainYieldsLockedAutoSubscribeResponse**](SetOnChainYieldsLockedAutoSubscribeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Set On-chain Yields Locked Auto Subscribe |  -  |

<a id="setOnChainYieldsLockedProductRedeemOption"></a>
# **setOnChainYieldsLockedProductRedeemOption**
> SetOnChainYieldsLockedProductRedeemOptionResponse setOnChainYieldsLockedProductRedeemOption(setOnChainYieldsLockedProductRedeemOptionRequest)

Set On-chain Yields Locked Product Redeem Option(USER_DATA)

Set On-chain Yields redeem option for Locked product  Weight: 50

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.OnChainYieldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    OnChainYieldsApi apiInstance = new OnChainYieldsApi(defaultClient);
    SetOnChainYieldsLockedProductRedeemOptionRequest setOnChainYieldsLockedProductRedeemOptionRequest = new SetOnChainYieldsLockedProductRedeemOptionRequest(); // SetOnChainYieldsLockedProductRedeemOptionRequest | 
    try {
      SetOnChainYieldsLockedProductRedeemOptionResponse result = apiInstance.setOnChainYieldsLockedProductRedeemOption(setOnChainYieldsLockedProductRedeemOptionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnChainYieldsApi#setOnChainYieldsLockedProductRedeemOption");
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
| **setOnChainYieldsLockedProductRedeemOptionRequest** | [**SetOnChainYieldsLockedProductRedeemOptionRequest**](SetOnChainYieldsLockedProductRedeemOptionRequest.md)|  | |

### Return type

[**SetOnChainYieldsLockedProductRedeemOptionResponse**](SetOnChainYieldsLockedProductRedeemOptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Set On-chain Yields Locked Product Redeem Option |  -  |

<a id="subscribeOnChainYieldsLockedProduct"></a>
# **subscribeOnChainYieldsLockedProduct**
> SubscribeOnChainYieldsLockedProductResponse subscribeOnChainYieldsLockedProduct(subscribeOnChainYieldsLockedProductRequest)

Subscribe On-chain Yields Locked Product(TRADE)

Subscribe On-chain Yields Locked Product  * You need to open &#x60;Enable Spot &amp; Margin Trading&#x60; permission for the API Key which requests this endpoint.  Weight: 200

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.OnChainYieldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    OnChainYieldsApi apiInstance = new OnChainYieldsApi(defaultClient);
    SubscribeOnChainYieldsLockedProductRequest subscribeOnChainYieldsLockedProductRequest = new SubscribeOnChainYieldsLockedProductRequest(); // SubscribeOnChainYieldsLockedProductRequest | 
    try {
      SubscribeOnChainYieldsLockedProductResponse result = apiInstance.subscribeOnChainYieldsLockedProduct(subscribeOnChainYieldsLockedProductRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnChainYieldsApi#subscribeOnChainYieldsLockedProduct");
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
| **subscribeOnChainYieldsLockedProductRequest** | [**SubscribeOnChainYieldsLockedProductRequest**](SubscribeOnChainYieldsLockedProductRequest.md)|  | |

### Return type

[**SubscribeOnChainYieldsLockedProductResponse**](SubscribeOnChainYieldsLockedProductResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Subscribe On-chain Yields Locked Product |  -  |

