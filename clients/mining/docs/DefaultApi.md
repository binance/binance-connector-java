# DefaultApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accountList**](DefaultApi.md#accountList) | **GET** /sapi/v1/mining/statistics/user/list | Account List (USER_DATA) |
| [**acquiringAlgorithm**](DefaultApi.md#acquiringAlgorithm) | **GET** /sapi/v1/mining/pub/algoList | Acquiring Algorithm (MARKET_DATA) |
| [**acquiringCoinname**](DefaultApi.md#acquiringCoinname) | **GET** /sapi/v1/mining/pub/coinList | Acquiring CoinName (MARKET_DATA) |
| [**cancelHashrateResaleConfiguration**](DefaultApi.md#cancelHashrateResaleConfiguration) | **POST** /sapi/v1/mining/hash-transfer/config/cancel | Cancel hashrate resale configuration (USER_DATA) |
| [**earningsList**](DefaultApi.md#earningsList) | **GET** /sapi/v1/mining/payment/list | Earnings List (USER_DATA) |
| [**extraBonusList**](DefaultApi.md#extraBonusList) | **GET** /sapi/v1/mining/payment/other | Extra Bonus List (USER_DATA) |
| [**hashrateResaleDetail**](DefaultApi.md#hashrateResaleDetail) | **GET** /sapi/v1/mining/hash-transfer/profit/details | Hashrate Resale Detail (USER_DATA) |
| [**hashrateResaleList**](DefaultApi.md#hashrateResaleList) | **GET** /sapi/v1/mining/hash-transfer/config/details/list | Hashrate Resale List (USER_DATA) |
| [**hashrateResaleRequest**](DefaultApi.md#hashrateResaleRequest) | **POST** /sapi/v1/mining/hash-transfer/config | Hashrate Resale Request (USER_DATA) |
| [**miningAccountEarning**](DefaultApi.md#miningAccountEarning) | **GET** /sapi/v1/mining/payment/uid | Mining Account Earning (USER_DATA) |
| [**requestForDetailMinerList**](DefaultApi.md#requestForDetailMinerList) | **GET** /sapi/v1/mining/worker/detail | Request for Detail Miner List (USER_DATA) |
| [**requestForMinerList**](DefaultApi.md#requestForMinerList) | **GET** /sapi/v1/mining/worker/list | Request for Miner List (USER_DATA) |
| [**statisticList**](DefaultApi.md#statisticList) | **GET** /sapi/v1/mining/statistics/user/status | Statistic List (USER_DATA) |


<a id="accountList"></a>
# **accountList**
> AccountListResponse accountList(algo, userName, recvWindow)

Account List (USER_DATA)

Query Account List  Weight(IP): 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.mining.ApiClient;
import com.binance.connector.client.mining.ApiException;
import com.binance.connector.client.mining.Configuration;
import com.binance.connector.client.mining.models.*;
import com.binance.connector.client.mining.rest.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String algo = "sha256"; // String | Algorithm name.
    String userName = "test"; // String | Mining account
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds.
    try {
      AccountListResponse result = apiInstance.accountList(algo, userName, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#accountList");
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
| **algo** | **String**| Algorithm name. | |
| **userName** | **String**| Mining account | |
| **recvWindow** | **Long**| Request validity window in milliseconds. | [optional] |

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

Acquiring Algorithm (MARKET_DATA)

Acquiring Algorithm  Weight(IP): 1  Security Type: MARKET_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.mining.ApiClient;
import com.binance.connector.client.mining.ApiException;
import com.binance.connector.client.mining.Configuration;
import com.binance.connector.client.mining.models.*;
import com.binance.connector.client.mining.rest.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      AcquiringAlgorithmResponse result = apiInstance.acquiringAlgorithm();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#acquiringAlgorithm");
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

Acquiring CoinName (MARKET_DATA)

Acquiring CoinName  Weight(IP): 1  Security Type: MARKET_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.mining.ApiClient;
import com.binance.connector.client.mining.ApiException;
import com.binance.connector.client.mining.Configuration;
import com.binance.connector.client.mining.models.*;
import com.binance.connector.client.mining.rest.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      AcquiringCoinnameResponse result = apiInstance.acquiringCoinname();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#acquiringCoinname");
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

Cancel hashrate resale configuration (USER_DATA)

Cancel hashrate resale configuration  Weight(IP): 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.mining.ApiClient;
import com.binance.connector.client.mining.ApiException;
import com.binance.connector.client.mining.Configuration;
import com.binance.connector.client.mining.models.*;
import com.binance.connector.client.mining.rest.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    CancelHashrateResaleConfigurationRequest cancelHashrateResaleConfigurationRequest = new CancelHashrateResaleConfigurationRequest(); // CancelHashrateResaleConfigurationRequest | 
    try {
      CancelHashrateResaleConfigurationResponse result = apiInstance.cancelHashrateResaleConfiguration(cancelHashrateResaleConfigurationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#cancelHashrateResaleConfiguration");
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

Earnings List (USER_DATA)

Query Earnings List  Weight(IP): 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.mining.ApiClient;
import com.binance.connector.client.mining.ApiException;
import com.binance.connector.client.mining.Configuration;
import com.binance.connector.client.mining.models.*;
import com.binance.connector.client.mining.rest.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String algo = "sha256"; // String | Algorithm name.
    String userName = "test"; // String | Mining account.
    String coin = "BTC"; // String | Coin name
    Long startDate = 1770736694138L; // Long | Search start time in milliseconds.
    Long endDate = 1770736694138L; // Long | Search end time in milliseconds.
    Long pageIndex = 1L; // Long | Page number, starting from 1.
    Long pageSize = 10L; // Long | Number of rows per page.
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds.
    try {
      EarningsListResponse result = apiInstance.earningsList(algo, userName, coin, startDate, endDate, pageIndex, pageSize, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#earningsList");
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
| **algo** | **String**| Algorithm name. | |
| **userName** | **String**| Mining account. | |
| **coin** | **String**| Coin name | [optional] |
| **startDate** | **Long**| Search start time in milliseconds. | [optional] |
| **endDate** | **Long**| Search end time in milliseconds. | [optional] |
| **pageIndex** | **Long**| Page number, starting from 1. | [optional] |
| **pageSize** | **Long**| Number of rows per page. | [optional] |
| **recvWindow** | **Long**| Request validity window in milliseconds. | [optional] |

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

Extra Bonus List (USER_DATA)

Extra Bonus List  Weight(IP): 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.mining.ApiClient;
import com.binance.connector.client.mining.ApiException;
import com.binance.connector.client.mining.Configuration;
import com.binance.connector.client.mining.models.*;
import com.binance.connector.client.mining.rest.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String algo = "sha256"; // String | Transfer algorithm
    String userName = "test"; // String | Mining account
    String coin = "BTC"; // String | Coin name
    Long startDate = 1770736694138L; // Long | Search start time in milliseconds.
    Long endDate = 1770736694138L; // Long | Search end time in milliseconds.
    Long pageIndex = 1L; // Long | Page number, starting from 1.
    Long pageSize = 10L; // Long | Number of rows per page.
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds.
    try {
      ExtraBonusListResponse result = apiInstance.extraBonusList(algo, userName, coin, startDate, endDate, pageIndex, pageSize, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#extraBonusList");
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
| **algo** | **String**| Transfer algorithm | |
| **userName** | **String**| Mining account | |
| **coin** | **String**| Coin name | [optional] |
| **startDate** | **Long**| Search start time in milliseconds. | [optional] |
| **endDate** | **Long**| Search end time in milliseconds. | [optional] |
| **pageIndex** | **Long**| Page number, starting from 1. | [optional] |
| **pageSize** | **Long**| Number of rows per page. | [optional] |
| **recvWindow** | **Long**| Request validity window in milliseconds. | [optional] |

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
> HashrateResaleDetailResponse hashrateResaleDetail(configId, pageIndex, pageSize, recvWindow)

Hashrate Resale Detail (USER_DATA)

Hashrate Resale Detail(USER_DATA)  Weight(IP): 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.mining.ApiClient;
import com.binance.connector.client.mining.ApiException;
import com.binance.connector.client.mining.Configuration;
import com.binance.connector.client.mining.models.*;
import com.binance.connector.client.mining.rest.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long configId = 168L; // Long | Configuration ID.
    Long pageIndex = 1L; // Long | Page number, starting from 1.
    Long pageSize = 10L; // Long | Number of rows per page.
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds.
    try {
      HashrateResaleDetailResponse result = apiInstance.hashrateResaleDetail(configId, pageIndex, pageSize, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#hashrateResaleDetail");
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
| **configId** | **Long**| Configuration ID. | |
| **pageIndex** | **Long**| Page number, starting from 1. | [optional] |
| **pageSize** | **Long**| Number of rows per page. | [optional] |
| **recvWindow** | **Long**| Request validity window in milliseconds. | [optional] |

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

Hashrate Resale List (USER_DATA)

Hashrate Resale List  Weight(IP): 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.mining.ApiClient;
import com.binance.connector.client.mining.ApiException;
import com.binance.connector.client.mining.Configuration;
import com.binance.connector.client.mining.models.*;
import com.binance.connector.client.mining.rest.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long pageIndex = 1L; // Long | Page number, starting from 1.
    Long pageSize = 10L; // Long | Number of rows per page.
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds.
    try {
      HashrateResaleListResponse result = apiInstance.hashrateResaleList(pageIndex, pageSize, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#hashrateResaleList");
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
| **pageIndex** | **Long**| Page number, starting from 1. | [optional] |
| **pageSize** | **Long**| Number of rows per page. | [optional] |
| **recvWindow** | **Long**| Request validity window in milliseconds. | [optional] |

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

Hashrate Resale Request (USER_DATA)

Hashrate Resale Request  Weight(IP): 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.mining.ApiClient;
import com.binance.connector.client.mining.ApiException;
import com.binance.connector.client.mining.Configuration;
import com.binance.connector.client.mining.models.*;
import com.binance.connector.client.mining.rest.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    HashrateResaleRequestRequest hashrateResaleRequestRequest = new HashrateResaleRequestRequest(); // HashrateResaleRequestRequest | 
    try {
      HashrateResaleRequestResponse result = apiInstance.hashrateResaleRequest(hashrateResaleRequestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#hashrateResaleRequest");
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

Mining Account Earning (USER_DATA)

Mining Account Earning  Weight(IP): 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.mining.ApiClient;
import com.binance.connector.client.mining.ApiException;
import com.binance.connector.client.mining.Configuration;
import com.binance.connector.client.mining.models.*;
import com.binance.connector.client.mining.rest.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String algo = "sha256"; // String | Algorithm
    Long startDate = 1770736694138L; // Long | Millisecond timestamp
    Long endDate = 1770736694138L; // Long | Millisecond timestamp
    Long pageIndex = 1L; // Long | Page number, starting from 1.
    Long pageSize = 10L; // Long | Number of rows per page.
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds.
    try {
      MiningAccountEarningResponse result = apiInstance.miningAccountEarning(algo, startDate, endDate, pageIndex, pageSize, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#miningAccountEarning");
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
| **algo** | **String**| Algorithm | |
| **startDate** | **Long**| Millisecond timestamp | [optional] |
| **endDate** | **Long**| Millisecond timestamp | [optional] |
| **pageIndex** | **Long**| Page number, starting from 1. | [optional] |
| **pageSize** | **Long**| Number of rows per page. | [optional] |
| **recvWindow** | **Long**| Request validity window in milliseconds. | [optional] |

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

Request for Detail Miner List (USER_DATA)

Request for Detail Miner List  Weight(IP): 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.mining.ApiClient;
import com.binance.connector.client.mining.ApiException;
import com.binance.connector.client.mining.Configuration;
import com.binance.connector.client.mining.models.*;
import com.binance.connector.client.mining.rest.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String algo = "sha256"; // String | Algorithm
    String userName = "test"; // String | Mining account
    String workerName = "bhdc1.16A10404B"; // String | Miner name.
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds.
    try {
      RequestForDetailMinerListResponse result = apiInstance.requestForDetailMinerList(algo, userName, workerName, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#requestForDetailMinerList");
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
| **algo** | **String**| Algorithm | |
| **userName** | **String**| Mining account | |
| **workerName** | **String**| Miner name. | |
| **recvWindow** | **Long**| Request validity window in milliseconds. | [optional] |

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

Request for Miner List (USER_DATA)

Request for Miner List  Weight(IP): 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.mining.ApiClient;
import com.binance.connector.client.mining.ApiException;
import com.binance.connector.client.mining.Configuration;
import com.binance.connector.client.mining.models.*;
import com.binance.connector.client.mining.rest.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String algo = "sha256"; // String | Algorithm
    String userName = "test"; // String | Mining account
    Long pageIndex = 1L; // Long | Page number, starting from 1.
    Long sort = 0L; // Long | Sort order. 0 for ascending, 1 for descending.
    Long sortColumn = 1L; // Long | Sort by: 1 miner name, 2 real-time hashrate, 3 daily average hashrate, 4 real-time rejection rate, 5 last submission time
    Long workerStatus = 0L; // Long | Miner status. 0 all, 1 valid, 2 invalid, 3 failure.
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds.
    try {
      RequestForMinerListResponse result = apiInstance.requestForMinerList(algo, userName, pageIndex, sort, sortColumn, workerStatus, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#requestForMinerList");
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
| **algo** | **String**| Algorithm | |
| **userName** | **String**| Mining account | |
| **pageIndex** | **Long**| Page number, starting from 1. | [optional] |
| **sort** | **Long**| Sort order. 0 for ascending, 1 for descending. | [optional] |
| **sortColumn** | **Long**| Sort by: 1 miner name, 2 real-time hashrate, 3 daily average hashrate, 4 real-time rejection rate, 5 last submission time | [optional] |
| **workerStatus** | **Long**| Miner status. 0 all, 1 valid, 2 invalid, 3 failure. | [optional] |
| **recvWindow** | **Long**| Request validity window in milliseconds. | [optional] |

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

Statistic List (USER_DATA)

Statistic List  Weight(IP): 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.mining.ApiClient;
import com.binance.connector.client.mining.ApiException;
import com.binance.connector.client.mining.Configuration;
import com.binance.connector.client.mining.models.*;
import com.binance.connector.client.mining.rest.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String algo = "sha256"; // String | Algorithm
    String userName = "test"; // String | Mining account
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds.
    try {
      StatisticListResponse result = apiInstance.statisticList(algo, userName, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#statisticList");
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
| **algo** | **String**| Algorithm | |
| **userName** | **String**| Mining account | |
| **recvWindow** | **Long**| Request validity window in milliseconds. | [optional] |

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

