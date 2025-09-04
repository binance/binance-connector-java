# EthStakingApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ethStakingAccount**](EthStakingApi.md#ethStakingAccount) | **GET** /sapi/v2/eth-staking/account | ETH Staking account(USER_DATA) |
| [**getCurrentEthStakingQuota**](EthStakingApi.md#getCurrentEthStakingQuota) | **GET** /sapi/v1/eth-staking/eth/quota | Get current ETH staking quota(USER_DATA) |
| [**getEthRedemptionHistory**](EthStakingApi.md#getEthRedemptionHistory) | **GET** /sapi/v1/eth-staking/eth/history/redemptionHistory | Get ETH redemption history(USER_DATA) |
| [**getEthStakingHistory**](EthStakingApi.md#getEthStakingHistory) | **GET** /sapi/v1/eth-staking/eth/history/stakingHistory | Get ETH staking history(USER_DATA) |
| [**getWbethRateHistory**](EthStakingApi.md#getWbethRateHistory) | **GET** /sapi/v1/eth-staking/eth/history/rateHistory | Get WBETH Rate History(USER_DATA) |
| [**getWbethRewardsHistory**](EthStakingApi.md#getWbethRewardsHistory) | **GET** /sapi/v1/eth-staking/eth/history/wbethRewardsHistory | Get WBETH rewards history(USER_DATA) |
| [**getWbethUnwrapHistory**](EthStakingApi.md#getWbethUnwrapHistory) | **GET** /sapi/v1/eth-staking/wbeth/history/unwrapHistory | Get WBETH unwrap history(USER_DATA) |
| [**getWbethWrapHistory**](EthStakingApi.md#getWbethWrapHistory) | **GET** /sapi/v1/eth-staking/wbeth/history/wrapHistory | Get WBETH wrap history(USER_DATA) |
| [**redeemEth**](EthStakingApi.md#redeemEth) | **POST** /sapi/v1/eth-staking/eth/redeem | Redeem ETH(TRADE) |
| [**subscribeEthStaking**](EthStakingApi.md#subscribeEthStaking) | **POST** /sapi/v2/eth-staking/eth/stake | Subscribe ETH Staking(TRADE) |
| [**wrapBeth**](EthStakingApi.md#wrapBeth) | **POST** /sapi/v1/eth-staking/wbeth/wrap | Wrap BETH(TRADE) |


<a id="ethStakingAccount"></a>
# **ethStakingAccount**
> EthStakingAccountResponse ethStakingAccount(recvWindow)

ETH Staking account(USER_DATA)

ETH Staking account  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.EthStakingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    EthStakingApi apiInstance = new EthStakingApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      EthStakingAccountResponse result = apiInstance.ethStakingAccount(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EthStakingApi#ethStakingAccount");
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

[**EthStakingAccountResponse**](EthStakingAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ETH Staking account |  -  |

<a id="getCurrentEthStakingQuota"></a>
# **getCurrentEthStakingQuota**
> GetCurrentEthStakingQuotaResponse getCurrentEthStakingQuota(recvWindow)

Get current ETH staking quota(USER_DATA)

Get current ETH staking quota  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.EthStakingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    EthStakingApi apiInstance = new EthStakingApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      GetCurrentEthStakingQuotaResponse result = apiInstance.getCurrentEthStakingQuota(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EthStakingApi#getCurrentEthStakingQuota");
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

[**GetCurrentEthStakingQuotaResponse**](GetCurrentEthStakingQuotaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get current ETH staking quota |  -  |

<a id="getEthRedemptionHistory"></a>
# **getEthRedemptionHistory**
> GetEthRedemptionHistoryResponse getEthRedemptionHistory(startTime, endTime, current, size, recvWindow)

Get ETH redemption history(USER_DATA)

Get ETH redemption history  * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be returned.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.EthStakingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    EthStakingApi apiInstance = new EthStakingApi(defaultClient);
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetEthRedemptionHistoryResponse result = apiInstance.getEthRedemptionHistory(startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EthStakingApi#getEthRedemptionHistory");
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

[**GetEthRedemptionHistoryResponse**](GetEthRedemptionHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get ETH redemption history |  -  |

<a id="getEthStakingHistory"></a>
# **getEthStakingHistory**
> GetEthStakingHistoryResponse getEthStakingHistory(startTime, endTime, current, size, recvWindow)

Get ETH staking history(USER_DATA)

Get ETH staking history  * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be returned.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.EthStakingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    EthStakingApi apiInstance = new EthStakingApi(defaultClient);
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetEthStakingHistoryResponse result = apiInstance.getEthStakingHistory(startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EthStakingApi#getEthStakingHistory");
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

[**GetEthStakingHistoryResponse**](GetEthStakingHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get ETH staking history |  -  |

<a id="getWbethRateHistory"></a>
# **getWbethRateHistory**
> GetWbethRateHistoryResponse getWbethRateHistory(startTime, endTime, current, size, recvWindow)

Get WBETH Rate History(USER_DATA)

Get WBETH Rate History  * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be returned.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.EthStakingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    EthStakingApi apiInstance = new EthStakingApi(defaultClient);
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetWbethRateHistoryResponse result = apiInstance.getWbethRateHistory(startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EthStakingApi#getWbethRateHistory");
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

[**GetWbethRateHistoryResponse**](GetWbethRateHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get WBETH Rate History |  -  |

<a id="getWbethRewardsHistory"></a>
# **getWbethRewardsHistory**
> GetWbethRewardsHistoryResponse getWbethRewardsHistory(startTime, endTime, current, size, recvWindow)

Get WBETH rewards history(USER_DATA)

Get WBETH rewards history  * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be returned.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.EthStakingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    EthStakingApi apiInstance = new EthStakingApi(defaultClient);
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetWbethRewardsHistoryResponse result = apiInstance.getWbethRewardsHistory(startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EthStakingApi#getWbethRewardsHistory");
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

[**GetWbethRewardsHistoryResponse**](GetWbethRewardsHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get WBETH rewards history |  -  |

<a id="getWbethUnwrapHistory"></a>
# **getWbethUnwrapHistory**
> GetWbethUnwrapHistoryResponse getWbethUnwrapHistory(startTime, endTime, current, size, recvWindow)

Get WBETH unwrap history(USER_DATA)

Get WBETH unwrap history  * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be returned.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.EthStakingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    EthStakingApi apiInstance = new EthStakingApi(defaultClient);
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetWbethUnwrapHistoryResponse result = apiInstance.getWbethUnwrapHistory(startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EthStakingApi#getWbethUnwrapHistory");
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

[**GetWbethUnwrapHistoryResponse**](GetWbethUnwrapHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get WBETH unwrap history |  -  |

<a id="getWbethWrapHistory"></a>
# **getWbethWrapHistory**
> GetWbethWrapHistoryResponse getWbethWrapHistory(startTime, endTime, current, size, recvWindow)

Get WBETH wrap history(USER_DATA)

Get WBETH wrap history  * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be returned.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.EthStakingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    EthStakingApi apiInstance = new EthStakingApi(defaultClient);
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetWbethWrapHistoryResponse result = apiInstance.getWbethWrapHistory(startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EthStakingApi#getWbethWrapHistory");
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

[**GetWbethWrapHistoryResponse**](GetWbethWrapHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get WBETH wrap history |  -  |

<a id="redeemEth"></a>
# **redeemEth**
> RedeemEthResponse redeemEth(redeemEthRequest)

Redeem ETH(TRADE)

Redeem WBETH or BETH and get ETH  * You need to open Enable Spot &amp; Margin Trading permission for the API Key which requests this endpoint.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.EthStakingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    EthStakingApi apiInstance = new EthStakingApi(defaultClient);
    RedeemEthRequest redeemEthRequest = new RedeemEthRequest(); // RedeemEthRequest | 
    try {
      RedeemEthResponse result = apiInstance.redeemEth(redeemEthRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EthStakingApi#redeemEth");
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
| **redeemEthRequest** | [**RedeemEthRequest**](RedeemEthRequest.md)|  | |

### Return type

[**RedeemEthResponse**](RedeemEthResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Redeem ETH |  -  |

<a id="subscribeEthStaking"></a>
# **subscribeEthStaking**
> SubscribeEthStakingResponse subscribeEthStaking(subscribeEthStakingRequest)

Subscribe ETH Staking(TRADE)

Subscribe ETH Staking  * You need to open Enable Spot &amp; Margin Trading permission for the API Key which requests this endpoint.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.EthStakingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    EthStakingApi apiInstance = new EthStakingApi(defaultClient);
    SubscribeEthStakingRequest subscribeEthStakingRequest = new SubscribeEthStakingRequest(); // SubscribeEthStakingRequest | 
    try {
      SubscribeEthStakingResponse result = apiInstance.subscribeEthStaking(subscribeEthStakingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EthStakingApi#subscribeEthStaking");
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
| **subscribeEthStakingRequest** | [**SubscribeEthStakingRequest**](SubscribeEthStakingRequest.md)|  | |

### Return type

[**SubscribeEthStakingResponse**](SubscribeEthStakingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Subscribe ETH Staking |  -  |

<a id="wrapBeth"></a>
# **wrapBeth**
> WrapBethResponse wrapBeth(wrapBethRequest)

Wrap BETH(TRADE)

Wrap BETH  * You need to open Enable Spot &amp; Margin Trading permission for the API Key which requests this endpoint.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.EthStakingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    EthStakingApi apiInstance = new EthStakingApi(defaultClient);
    WrapBethRequest wrapBethRequest = new WrapBethRequest(); // WrapBethRequest | 
    try {
      WrapBethResponse result = apiInstance.wrapBeth(wrapBethRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EthStakingApi#wrapBeth");
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
| **wrapBethRequest** | [**WrapBethRequest**](WrapBethRequest.md)|  | |

### Return type

[**WrapBethResponse**](WrapBethResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Wrap BETH |  -  |

