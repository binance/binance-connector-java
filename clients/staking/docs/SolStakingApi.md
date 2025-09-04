# SolStakingApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**claimBoostRewards**](SolStakingApi.md#claimBoostRewards) | **POST** /sapi/v1/sol-staking/sol/claim | Claim Boost Rewards(TRADE) |
| [**getBnsolRateHistory**](SolStakingApi.md#getBnsolRateHistory) | **GET** /sapi/v1/sol-staking/sol/history/rateHistory | Get BNSOL Rate History(USER_DATA) |
| [**getBnsolRewardsHistory**](SolStakingApi.md#getBnsolRewardsHistory) | **GET** /sapi/v1/sol-staking/sol/history/bnsolRewardsHistory | Get BNSOL rewards history(USER_DATA) |
| [**getBoostRewardsHistory**](SolStakingApi.md#getBoostRewardsHistory) | **GET** /sapi/v1/sol-staking/sol/history/boostRewardsHistory | Get Boost Rewards History(USER_DATA) |
| [**getSolRedemptionHistory**](SolStakingApi.md#getSolRedemptionHistory) | **GET** /sapi/v1/sol-staking/sol/history/redemptionHistory | Get SOL redemption history(USER_DATA) |
| [**getSolStakingHistory**](SolStakingApi.md#getSolStakingHistory) | **GET** /sapi/v1/sol-staking/sol/history/stakingHistory | Get SOL staking history(USER_DATA) |
| [**getSolStakingQuotaDetails**](SolStakingApi.md#getSolStakingQuotaDetails) | **GET** /sapi/v1/sol-staking/sol/quota | Get SOL staking quota details(USER_DATA) |
| [**getUnclaimedRewards**](SolStakingApi.md#getUnclaimedRewards) | **GET** /sapi/v1/sol-staking/sol/history/unclaimedRewards | Get Unclaimed Rewards(USER_DATA) |
| [**redeemSol**](SolStakingApi.md#redeemSol) | **POST** /sapi/v1/sol-staking/sol/redeem | Redeem SOL(TRADE) |
| [**solStakingAccount**](SolStakingApi.md#solStakingAccount) | **GET** /sapi/v1/sol-staking/account | SOL Staking account(USER_DATA) |
| [**subscribeSolStaking**](SolStakingApi.md#subscribeSolStaking) | **POST** /sapi/v1/sol-staking/sol/stake | Subscribe SOL Staking(TRADE) |


<a id="claimBoostRewards"></a>
# **claimBoostRewards**
> ClaimBoostRewardsResponse claimBoostRewards(claimBoostRewardsRequest)

Claim Boost Rewards(TRADE)

Claim Boost APR Airdrop Rewards  * You need to open Enable Spot &amp; Margin Trading permission for the API Key which requests this endpoint.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.SolStakingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    SolStakingApi apiInstance = new SolStakingApi(defaultClient);
    ClaimBoostRewardsRequest claimBoostRewardsRequest = new ClaimBoostRewardsRequest(); // ClaimBoostRewardsRequest | 
    try {
      ClaimBoostRewardsResponse result = apiInstance.claimBoostRewards(claimBoostRewardsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolStakingApi#claimBoostRewards");
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
| **claimBoostRewardsRequest** | [**ClaimBoostRewardsRequest**](ClaimBoostRewardsRequest.md)|  | |

### Return type

[**ClaimBoostRewardsResponse**](ClaimBoostRewardsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Claim Boost Rewards |  -  |

<a id="getBnsolRateHistory"></a>
# **getBnsolRateHistory**
> GetBnsolRateHistoryResponse getBnsolRateHistory(startTime, endTime, current, size, recvWindow)

Get BNSOL Rate History(USER_DATA)

Get BNSOL Rate History  * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be returned.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.SolStakingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    SolStakingApi apiInstance = new SolStakingApi(defaultClient);
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetBnsolRateHistoryResponse result = apiInstance.getBnsolRateHistory(startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolStakingApi#getBnsolRateHistory");
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
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Currently querying page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10, Max:100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetBnsolRateHistoryResponse**](GetBnsolRateHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get BNSOL Rate History |  -  |

<a id="getBnsolRewardsHistory"></a>
# **getBnsolRewardsHistory**
> GetBnsolRewardsHistoryResponse getBnsolRewardsHistory(startTime, endTime, current, size, recvWindow)

Get BNSOL rewards history(USER_DATA)

Get BNSOL rewards history  * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be returned.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.SolStakingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    SolStakingApi apiInstance = new SolStakingApi(defaultClient);
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetBnsolRewardsHistoryResponse result = apiInstance.getBnsolRewardsHistory(startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolStakingApi#getBnsolRewardsHistory");
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
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Currently querying page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10, Max:100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetBnsolRewardsHistoryResponse**](GetBnsolRewardsHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get BNSOL rewards history |  -  |

<a id="getBoostRewardsHistory"></a>
# **getBoostRewardsHistory**
> GetBoostRewardsHistoryResponse getBoostRewardsHistory(type, startTime, endTime, current, size, recvWindow)

Get Boost Rewards History(USER_DATA)

Get Boost rewards history  * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be returned.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.SolStakingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    SolStakingApi apiInstance = new SolStakingApi(defaultClient);
    String type = "type_example"; // String | \"CLAIM\", \"DISTRIBUTE\", default \"CLAIM\"
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetBoostRewardsHistoryResponse result = apiInstance.getBoostRewardsHistory(type, startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolStakingApi#getBoostRewardsHistory");
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
| **type** | **String**| \&quot;CLAIM\&quot;, \&quot;DISTRIBUTE\&quot;, default \&quot;CLAIM\&quot; | |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Currently querying page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10, Max:100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetBoostRewardsHistoryResponse**](GetBoostRewardsHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Boost Rewards History |  -  |

<a id="getSolRedemptionHistory"></a>
# **getSolRedemptionHistory**
> GetSolRedemptionHistoryResponse getSolRedemptionHistory(startTime, endTime, current, size, recvWindow)

Get SOL redemption history(USER_DATA)

Get SOL redemption history  * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be returned.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.SolStakingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    SolStakingApi apiInstance = new SolStakingApi(defaultClient);
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetSolRedemptionHistoryResponse result = apiInstance.getSolRedemptionHistory(startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolStakingApi#getSolRedemptionHistory");
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
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Currently querying page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10, Max:100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetSolRedemptionHistoryResponse**](GetSolRedemptionHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get SOL redemption history |  -  |

<a id="getSolStakingHistory"></a>
# **getSolStakingHistory**
> GetSolStakingHistoryResponse getSolStakingHistory(startTime, endTime, current, size, recvWindow)

Get SOL staking history(USER_DATA)

Get SOL staking history  * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be returned.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.SolStakingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    SolStakingApi apiInstance = new SolStakingApi(defaultClient);
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetSolStakingHistoryResponse result = apiInstance.getSolStakingHistory(startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolStakingApi#getSolStakingHistory");
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
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Currently querying page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10, Max:100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetSolStakingHistoryResponse**](GetSolStakingHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get SOL staking history |  -  |

<a id="getSolStakingQuotaDetails"></a>
# **getSolStakingQuotaDetails**
> GetSolStakingQuotaDetailsResponse getSolStakingQuotaDetails(recvWindow)

Get SOL staking quota details(USER_DATA)

Get SOL staking quota  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.SolStakingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    SolStakingApi apiInstance = new SolStakingApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      GetSolStakingQuotaDetailsResponse result = apiInstance.getSolStakingQuotaDetails(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolStakingApi#getSolStakingQuotaDetails");
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

[**GetSolStakingQuotaDetailsResponse**](GetSolStakingQuotaDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get SOL staking quota details |  -  |

<a id="getUnclaimedRewards"></a>
# **getUnclaimedRewards**
> GetUnclaimedRewardsResponse getUnclaimedRewards(recvWindow)

Get Unclaimed Rewards(USER_DATA)

Get Unclaimed rewards  * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be returned.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.SolStakingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    SolStakingApi apiInstance = new SolStakingApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      GetUnclaimedRewardsResponse result = apiInstance.getUnclaimedRewards(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolStakingApi#getUnclaimedRewards");
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

[**GetUnclaimedRewardsResponse**](GetUnclaimedRewardsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Unclaimed Rewards |  -  |

<a id="redeemSol"></a>
# **redeemSol**
> RedeemSolResponse redeemSol(redeemSolRequest)

Redeem SOL(TRADE)

Redeem BNSOL get SOL  * You need to open Enable Spot &amp; Margin Trading permission for the API Key which requests this endpoint.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.SolStakingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    SolStakingApi apiInstance = new SolStakingApi(defaultClient);
    RedeemSolRequest redeemSolRequest = new RedeemSolRequest(); // RedeemSolRequest | 
    try {
      RedeemSolResponse result = apiInstance.redeemSol(redeemSolRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolStakingApi#redeemSol");
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
| **redeemSolRequest** | [**RedeemSolRequest**](RedeemSolRequest.md)|  | |

### Return type

[**RedeemSolResponse**](RedeemSolResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Redeem SOL |  -  |

<a id="solStakingAccount"></a>
# **solStakingAccount**
> SolStakingAccountResponse solStakingAccount(recvWindow)

SOL Staking account(USER_DATA)

SOL Staking account  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.SolStakingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    SolStakingApi apiInstance = new SolStakingApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      SolStakingAccountResponse result = apiInstance.solStakingAccount(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolStakingApi#solStakingAccount");
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

[**SolStakingAccountResponse**](SolStakingAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | SOL Staking account |  -  |

<a id="subscribeSolStaking"></a>
# **subscribeSolStaking**
> SubscribeSolStakingResponse subscribeSolStaking(subscribeSolStakingRequest)

Subscribe SOL Staking(TRADE)

Subscribe SOL Staking  * You need to open Enable Spot &amp; Margin Trading permission for the API Key which requests this endpoint.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.SolStakingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    SolStakingApi apiInstance = new SolStakingApi(defaultClient);
    SubscribeSolStakingRequest subscribeSolStakingRequest = new SubscribeSolStakingRequest(); // SubscribeSolStakingRequest | 
    try {
      SubscribeSolStakingResponse result = apiInstance.subscribeSolStaking(subscribeSolStakingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolStakingApi#subscribeSolStaking");
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
| **subscribeSolStakingRequest** | [**SubscribeSolStakingRequest**](SubscribeSolStakingRequest.md)|  | |

### Return type

[**SubscribeSolStakingResponse**](SubscribeSolStakingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Subscribe SOL Staking |  -  |

