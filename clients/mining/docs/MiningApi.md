# MiningApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accountList**](MiningApi.md#accountList) | **GET** /sapi/v1/mining/statistics/user/list | Account List(USER_DATA) |
| [**acquiringAlgorithm**](MiningApi.md#acquiringAlgorithm) | **GET** /sapi/v1/mining/pub/algoList | Acquiring Algorithm(MARKET_DATA) |
| [**acquiringCoinname**](MiningApi.md#acquiringCoinname) | **GET** /sapi/v1/mining/pub/coinList | Acquiring CoinName(MARKET_DATA) |
| [**cancelHashrateResaleConfiguration**](MiningApi.md#cancelHashrateResaleConfiguration) | **POST** /sapi/v1/mining/hash-transfer/config/cancel | Cancel hashrate resale configuration(USER_DATA) |
| [**earningsList**](MiningApi.md#earningsList) | **GET** /sapi/v1/mining/payment/list | Earnings List(USER_DATA) |
| [**extraBonusList**](MiningApi.md#extraBonusList) | **GET** /sapi/v1/mining/payment/other | Extra Bonus List(USER_DATA) |
| [**hashrateResaleDetail**](MiningApi.md#hashrateResaleDetail) | **GET** /sapi/v1/mining/hash-transfer/profit/details | Hashrate Resale Detail(USER_DATA) |
| [**hashrateResaleList**](MiningApi.md#hashrateResaleList) | **GET** /sapi/v1/mining/hash-transfer/config/details/list | Hashrate Resale List |
| [**hashrateResaleRequest**](MiningApi.md#hashrateResaleRequest) | **POST** /sapi/v1/mining/hash-transfer/config | Hashrate Resale Request(USER_DATA) |
| [**miningAccountEarning**](MiningApi.md#miningAccountEarning) | **GET** /sapi/v1/mining/payment/uid | Mining Account Earning(USER_DATA) |
| [**requestForDetailMinerList**](MiningApi.md#requestForDetailMinerList) | **GET** /sapi/v1/mining/worker/detail | Request for Detail Miner List(USER_DATA) |
| [**requestForMinerList**](MiningApi.md#requestForMinerList) | **GET** /sapi/v1/mining/worker/list | Request for Miner List(USER_DATA) |
| [**statisticList**](MiningApi.md#statisticList) | **GET** /sapi/v1/mining/statistics/user/status | Statistic List(USER_DATA) |


<a id="accountList"></a>
# **accountList**
> AccountListResponse accountList(algo, userName, recvWindow)

Account List(USER_DATA)

Query Account List  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.mining.ApiClient;
import com.binance.connector.client.mining.ApiException;
import com.binance.connector.client.mining.Configuration;
import com.binance.connector.client.mining.models.*;
import com.binance.connector.client.mining.rest.api.MiningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MiningApi apiInstance = new MiningApi(defaultClient);
    String algo = "algo_example"; // String | Algorithm(sha256) sha256
    String userName = "userName_example"; // String | Mining account test
    Long recvWindow = 56L; // Long | 
    try {
      AccountListResponse result = apiInstance.accountList(algo, userName, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiningApi#accountList");
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
| **algo** | **String**| Algorithm(sha256) sha256 | |
| **userName** | **String**| Mining account test | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**AccountListResponse**](AccountListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account List |  -  |

<a id="acquiringAlgorithm"></a>
# **acquiringAlgorithm**
> AcquiringAlgorithmResponse acquiringAlgorithm()

Acquiring Algorithm(MARKET_DATA)

Acquiring Algorithm  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.mining.ApiClient;
import com.binance.connector.client.mining.ApiException;
import com.binance.connector.client.mining.Configuration;
import com.binance.connector.client.mining.models.*;
import com.binance.connector.client.mining.rest.api.MiningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MiningApi apiInstance = new MiningApi(defaultClient);
    try {
      AcquiringAlgorithmResponse result = apiInstance.acquiringAlgorithm();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiningApi#acquiringAlgorithm");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AcquiringAlgorithmResponse**](AcquiringAlgorithmResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Acquiring Algorithm |  -  |

<a id="acquiringCoinname"></a>
# **acquiringCoinname**
> AcquiringCoinnameResponse acquiringCoinname()

Acquiring CoinName(MARKET_DATA)

Acquiring CoinName  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.mining.ApiClient;
import com.binance.connector.client.mining.ApiException;
import com.binance.connector.client.mining.Configuration;
import com.binance.connector.client.mining.models.*;
import com.binance.connector.client.mining.rest.api.MiningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MiningApi apiInstance = new MiningApi(defaultClient);
    try {
      AcquiringCoinnameResponse result = apiInstance.acquiringCoinname();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiningApi#acquiringCoinname");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AcquiringCoinnameResponse**](AcquiringCoinnameResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Acquiring CoinName |  -  |

<a id="cancelHashrateResaleConfiguration"></a>
# **cancelHashrateResaleConfiguration**
> CancelHashrateResaleConfigurationResponse cancelHashrateResaleConfiguration(cancelHashrateResaleConfigurationRequest)

Cancel hashrate resale configuration(USER_DATA)

 Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.mining.ApiClient;
import com.binance.connector.client.mining.ApiException;
import com.binance.connector.client.mining.Configuration;
import com.binance.connector.client.mining.models.*;
import com.binance.connector.client.mining.rest.api.MiningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MiningApi apiInstance = new MiningApi(defaultClient);
    CancelHashrateResaleConfigurationRequest cancelHashrateResaleConfigurationRequest = new CancelHashrateResaleConfigurationRequest(); // CancelHashrateResaleConfigurationRequest | 
    try {
      CancelHashrateResaleConfigurationResponse result = apiInstance.cancelHashrateResaleConfiguration(cancelHashrateResaleConfigurationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiningApi#cancelHashrateResaleConfiguration");
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
| **cancelHashrateResaleConfigurationRequest** | [**CancelHashrateResaleConfigurationRequest**](CancelHashrateResaleConfigurationRequest.md)|  | |

### Return type

[**CancelHashrateResaleConfigurationResponse**](CancelHashrateResaleConfigurationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cancel hashrate resale configuration |  -  |

<a id="earningsList"></a>
# **earningsList**
> EarningsListResponse earningsList(algo, userName, coin, startDate, endDate, pageIndex, pageSize, recvWindow)

Earnings List(USER_DATA)

Query Earnings List  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.mining.ApiClient;
import com.binance.connector.client.mining.ApiException;
import com.binance.connector.client.mining.Configuration;
import com.binance.connector.client.mining.models.*;
import com.binance.connector.client.mining.rest.api.MiningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MiningApi apiInstance = new MiningApi(defaultClient);
    String algo = "algo_example"; // String | Algorithm(sha256) sha256
    String userName = "userName_example"; // String | Mining account test
    String coin = "coin_example"; // String | Coin Name 
    Long startDate = 56L; // Long | Millisecond timestamp 
    Long endDate = 56L; // Long | Millisecond timestamp 
    Long pageIndex = 56L; // Long | Page number, empty default first page, starting from 1 
    Long pageSize = 56L; // Long | Min 10,Max 200 
    Long recvWindow = 56L; // Long | 
    try {
      EarningsListResponse result = apiInstance.earningsList(algo, userName, coin, startDate, endDate, pageIndex, pageSize, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiningApi#earningsList");
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
| **algo** | **String**| Algorithm(sha256) sha256 | |
| **userName** | **String**| Mining account test | |
| **coin** | **String**| Coin Name  | [optional] |
| **startDate** | **Long**| Millisecond timestamp  | [optional] |
| **endDate** | **Long**| Millisecond timestamp  | [optional] |
| **pageIndex** | **Long**| Page number, empty default first page, starting from 1  | [optional] |
| **pageSize** | **Long**| Min 10,Max 200  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**EarningsListResponse**](EarningsListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Earnings List |  -  |

<a id="extraBonusList"></a>
# **extraBonusList**
> ExtraBonusListResponse extraBonusList(algo, userName, coin, startDate, endDate, pageIndex, pageSize, recvWindow)

Extra Bonus List(USER_DATA)

Extra Bonus List  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.mining.ApiClient;
import com.binance.connector.client.mining.ApiException;
import com.binance.connector.client.mining.Configuration;
import com.binance.connector.client.mining.models.*;
import com.binance.connector.client.mining.rest.api.MiningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MiningApi apiInstance = new MiningApi(defaultClient);
    String algo = "algo_example"; // String | Algorithm(sha256) sha256
    String userName = "userName_example"; // String | Mining account test
    String coin = "coin_example"; // String | Coin Name 
    Long startDate = 56L; // Long | Millisecond timestamp 
    Long endDate = 56L; // Long | Millisecond timestamp 
    Long pageIndex = 56L; // Long | Page number, empty default first page, starting from 1 
    Long pageSize = 56L; // Long | Min 10,Max 200 
    Long recvWindow = 56L; // Long | 
    try {
      ExtraBonusListResponse result = apiInstance.extraBonusList(algo, userName, coin, startDate, endDate, pageIndex, pageSize, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiningApi#extraBonusList");
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
| **algo** | **String**| Algorithm(sha256) sha256 | |
| **userName** | **String**| Mining account test | |
| **coin** | **String**| Coin Name  | [optional] |
| **startDate** | **Long**| Millisecond timestamp  | [optional] |
| **endDate** | **Long**| Millisecond timestamp  | [optional] |
| **pageIndex** | **Long**| Page number, empty default first page, starting from 1  | [optional] |
| **pageSize** | **Long**| Min 10,Max 200  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**ExtraBonusListResponse**](ExtraBonusListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Extra Bonus List |  -  |

<a id="hashrateResaleDetail"></a>
# **hashrateResaleDetail**
> HashrateResaleDetailResponse hashrateResaleDetail(configId, userName, pageIndex, pageSize, recvWindow)

Hashrate Resale Detail(USER_DATA)

Hashrate Resale Detail(USER_DATA)  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.mining.ApiClient;
import com.binance.connector.client.mining.ApiException;
import com.binance.connector.client.mining.Configuration;
import com.binance.connector.client.mining.models.*;
import com.binance.connector.client.mining.rest.api.MiningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MiningApi apiInstance = new MiningApi(defaultClient);
    Long configId = 56L; // Long | Mining ID 168
    String userName = "userName_example"; // String | Mining account test
    Long pageIndex = 56L; // Long | Page number, empty default first page, starting from 1 
    Long pageSize = 56L; // Long | Min 10,Max 200 
    Long recvWindow = 56L; // Long | 
    try {
      HashrateResaleDetailResponse result = apiInstance.hashrateResaleDetail(configId, userName, pageIndex, pageSize, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiningApi#hashrateResaleDetail");
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
| **configId** | **Long**| Mining ID 168 | |
| **userName** | **String**| Mining account test | |
| **pageIndex** | **Long**| Page number, empty default first page, starting from 1  | [optional] |
| **pageSize** | **Long**| Min 10,Max 200  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**HashrateResaleDetailResponse**](HashrateResaleDetailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Hashrate Resale Detail |  -  |

<a id="hashrateResaleList"></a>
# **hashrateResaleList**
> HashrateResaleListResponse hashrateResaleList(pageIndex, pageSize, recvWindow)

Hashrate Resale List

Hashrate Resale List  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.mining.ApiClient;
import com.binance.connector.client.mining.ApiException;
import com.binance.connector.client.mining.Configuration;
import com.binance.connector.client.mining.models.*;
import com.binance.connector.client.mining.rest.api.MiningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MiningApi apiInstance = new MiningApi(defaultClient);
    Long pageIndex = 56L; // Long | Page number, empty default first page, starting from 1 
    Long pageSize = 56L; // Long | Min 10,Max 200 
    Long recvWindow = 56L; // Long | 
    try {
      HashrateResaleListResponse result = apiInstance.hashrateResaleList(pageIndex, pageSize, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiningApi#hashrateResaleList");
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
| **pageIndex** | **Long**| Page number, empty default first page, starting from 1  | [optional] |
| **pageSize** | **Long**| Min 10,Max 200  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**HashrateResaleListResponse**](HashrateResaleListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Hashrate Resale List |  -  |

<a id="hashrateResaleRequest"></a>
# **hashrateResaleRequest**
> HashrateResaleRequestResponse hashrateResaleRequest(hashrateResaleRequestRequest)

Hashrate Resale Request(USER_DATA)

Hashrate Resale Request  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.mining.ApiClient;
import com.binance.connector.client.mining.ApiException;
import com.binance.connector.client.mining.Configuration;
import com.binance.connector.client.mining.models.*;
import com.binance.connector.client.mining.rest.api.MiningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MiningApi apiInstance = new MiningApi(defaultClient);
    HashrateResaleRequestRequest hashrateResaleRequestRequest = new HashrateResaleRequestRequest(); // HashrateResaleRequestRequest | 
    try {
      HashrateResaleRequestResponse result = apiInstance.hashrateResaleRequest(hashrateResaleRequestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiningApi#hashrateResaleRequest");
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
| **hashrateResaleRequestRequest** | [**HashrateResaleRequestRequest**](HashrateResaleRequestRequest.md)|  | |

### Return type

[**HashrateResaleRequestResponse**](HashrateResaleRequestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Hashrate Resale Request |  -  |

<a id="miningAccountEarning"></a>
# **miningAccountEarning**
> MiningAccountEarningResponse miningAccountEarning(algo, startDate, endDate, pageIndex, pageSize, recvWindow)

Mining Account Earning(USER_DATA)

Mining Account Earning  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.mining.ApiClient;
import com.binance.connector.client.mining.ApiException;
import com.binance.connector.client.mining.Configuration;
import com.binance.connector.client.mining.models.*;
import com.binance.connector.client.mining.rest.api.MiningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MiningApi apiInstance = new MiningApi(defaultClient);
    String algo = "algo_example"; // String | Algorithm(sha256) sha256
    Long startDate = 56L; // Long | Millisecond timestamp 
    Long endDate = 56L; // Long | Millisecond timestamp 
    Long pageIndex = 56L; // Long | Page number, empty default first page, starting from 1 
    Long pageSize = 56L; // Long | Min 10,Max 200 
    Long recvWindow = 56L; // Long | 
    try {
      MiningAccountEarningResponse result = apiInstance.miningAccountEarning(algo, startDate, endDate, pageIndex, pageSize, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiningApi#miningAccountEarning");
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
| **algo** | **String**| Algorithm(sha256) sha256 | |
| **startDate** | **Long**| Millisecond timestamp  | [optional] |
| **endDate** | **Long**| Millisecond timestamp  | [optional] |
| **pageIndex** | **Long**| Page number, empty default first page, starting from 1  | [optional] |
| **pageSize** | **Long**| Min 10,Max 200  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**MiningAccountEarningResponse**](MiningAccountEarningResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Mining Account Earning |  -  |

<a id="requestForDetailMinerList"></a>
# **requestForDetailMinerList**
> RequestForDetailMinerListResponse requestForDetailMinerList(algo, userName, workerName, recvWindow)

Request for Detail Miner List(USER_DATA)

Request for Detail Miner List  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.mining.ApiClient;
import com.binance.connector.client.mining.ApiException;
import com.binance.connector.client.mining.Configuration;
import com.binance.connector.client.mining.models.*;
import com.binance.connector.client.mining.rest.api.MiningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MiningApi apiInstance = new MiningApi(defaultClient);
    String algo = "algo_example"; // String | Algorithm(sha256) sha256
    String userName = "userName_example"; // String | Mining account test
    String workerName = "workerName_example"; // String | Miner’s name(required) bhdc1.16A10404B
    Long recvWindow = 56L; // Long | 
    try {
      RequestForDetailMinerListResponse result = apiInstance.requestForDetailMinerList(algo, userName, workerName, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiningApi#requestForDetailMinerList");
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
| **algo** | **String**| Algorithm(sha256) sha256 | |
| **userName** | **String**| Mining account test | |
| **workerName** | **String**| Miner’s name(required) bhdc1.16A10404B | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**RequestForDetailMinerListResponse**](RequestForDetailMinerListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request for Detail Miner List |  -  |

<a id="requestForMinerList"></a>
# **requestForMinerList**
> RequestForMinerListResponse requestForMinerList(algo, userName, pageIndex, sort, sortColumn, workerStatus, recvWindow)

Request for Miner List(USER_DATA)

Request for Miner List  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.mining.ApiClient;
import com.binance.connector.client.mining.ApiException;
import com.binance.connector.client.mining.Configuration;
import com.binance.connector.client.mining.models.*;
import com.binance.connector.client.mining.rest.api.MiningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MiningApi apiInstance = new MiningApi(defaultClient);
    String algo = "algo_example"; // String | Algorithm(sha256) sha256
    String userName = "userName_example"; // String | Mining account test
    Long pageIndex = 56L; // Long | Page number, empty default first page, starting from 1 
    Long sort = 56L; // Long | sort sequence(default=0)0 positive sequence，1 negative sequence
    Long sortColumn = 56L; // Long | Sort by( default 1): <br></br>1: miner name, <br></br>2: real-time computing power, <br></br>3: daily average computing power, <br></br>4: real-time rejection rate, <br></br>5: last submission time
    Long workerStatus = 56L; // Long | miners status(default=0),0 all，1 valid，2 invalid，3 failure
    Long recvWindow = 56L; // Long | 
    try {
      RequestForMinerListResponse result = apiInstance.requestForMinerList(algo, userName, pageIndex, sort, sortColumn, workerStatus, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiningApi#requestForMinerList");
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
| **algo** | **String**| Algorithm(sha256) sha256 | |
| **userName** | **String**| Mining account test | |
| **pageIndex** | **Long**| Page number, empty default first page, starting from 1  | [optional] |
| **sort** | **Long**| sort sequence(default&#x3D;0)0 positive sequence，1 negative sequence | [optional] |
| **sortColumn** | **Long**| Sort by( default 1): &lt;br&gt;&lt;/br&gt;1: miner name, &lt;br&gt;&lt;/br&gt;2: real-time computing power, &lt;br&gt;&lt;/br&gt;3: daily average computing power, &lt;br&gt;&lt;/br&gt;4: real-time rejection rate, &lt;br&gt;&lt;/br&gt;5: last submission time | [optional] |
| **workerStatus** | **Long**| miners status(default&#x3D;0),0 all，1 valid，2 invalid，3 failure | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**RequestForMinerListResponse**](RequestForMinerListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request for Miner List |  -  |

<a id="statisticList"></a>
# **statisticList**
> StatisticListResponse statisticList(algo, userName, recvWindow)

Statistic List(USER_DATA)

Statistic List  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.mining.ApiClient;
import com.binance.connector.client.mining.ApiException;
import com.binance.connector.client.mining.Configuration;
import com.binance.connector.client.mining.models.*;
import com.binance.connector.client.mining.rest.api.MiningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MiningApi apiInstance = new MiningApi(defaultClient);
    String algo = "algo_example"; // String | Algorithm(sha256) sha256
    String userName = "userName_example"; // String | Mining account test
    Long recvWindow = 56L; // Long | 
    try {
      StatisticListResponse result = apiInstance.statisticList(algo, userName, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiningApi#statisticList");
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
| **algo** | **String**| Algorithm(sha256) sha256 | |
| **userName** | **String**| Mining account test | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**StatisticListResponse**](StatisticListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Statistic List |  -  |

