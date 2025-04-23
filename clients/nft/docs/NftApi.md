# NftApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getNFTAsset**](NftApi.md#getNFTAsset) | **GET** /sapi/v1/nft/user/getAsset | Get NFT Asset(USER_DATA) |
| [**getNFTDepositHistory**](NftApi.md#getNFTDepositHistory) | **GET** /sapi/v1/nft/history/deposit | Get NFT Deposit History(USER_DATA) |
| [**getNFTTransactionHistory**](NftApi.md#getNFTTransactionHistory) | **GET** /sapi/v1/nft/history/transactions | Get NFT Transaction History(USER_DATA) |
| [**getNFTWithdrawHistory**](NftApi.md#getNFTWithdrawHistory) | **GET** /sapi/v1/nft/history/withdraw | Get NFT Withdraw History(USER_DATA) |


<a id="getNFTAsset"></a>
# **getNFTAsset**
> GetNFTAssetResponse getNFTAsset(limit, page, recvWindow)

Get NFT Asset(USER_DATA)

Get NFT Asset  Weight: 3000

### Example
```java
// Import classes:
import com.binance.connector.client.nft.ApiClient;
import com.binance.connector.client.nft.ApiException;
import com.binance.connector.client.nft.Configuration;
import com.binance.connector.client.nft.models.*;
import com.binance.connector.client.nft.rest.api.NftApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    NftApi apiInstance = new NftApi(defaultClient);
    Long limit = 56L; // Long | Default 50, Max 50
    Long page = 56L; // Long | Default 1
    Long recvWindow = 56L; // Long | 
    try {
      GetNFTAssetResponse result = apiInstance.getNFTAsset(limit, page, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NftApi#getNFTAsset");
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
| **limit** | **Long**| Default 50, Max 50 | [optional] |
| **page** | **Long**| Default 1 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetNFTAssetResponse**](GetNFTAssetResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get NFT Asset |  -  |

<a id="getNFTDepositHistory"></a>
# **getNFTDepositHistory**
> GetNFTDepositHistoryResponse getNFTDepositHistory(startTime, endTime, limit, page, recvWindow)

Get NFT Deposit History(USER_DATA)

et NFT Deposit History   * The max interval between startTime and endTime is 90 days. * If startTime and endTime are not sent, the recent 7 days&#39; data will be returned.  Weight: 3000

### Example
```java
// Import classes:
import com.binance.connector.client.nft.ApiClient;
import com.binance.connector.client.nft.ApiException;
import com.binance.connector.client.nft.Configuration;
import com.binance.connector.client.nft.models.*;
import com.binance.connector.client.nft.rest.api.NftApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    NftApi apiInstance = new NftApi(defaultClient);
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long limit = 56L; // Long | Default 50, Max 50
    Long page = 56L; // Long | Default 1
    Long recvWindow = 56L; // Long | 
    try {
      GetNFTDepositHistoryResponse result = apiInstance.getNFTDepositHistory(startTime, endTime, limit, page, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NftApi#getNFTDepositHistory");
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
| **limit** | **Long**| Default 50, Max 50 | [optional] |
| **page** | **Long**| Default 1 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetNFTDepositHistoryResponse**](GetNFTDepositHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get NFT Deposit History |  -  |

<a id="getNFTTransactionHistory"></a>
# **getNFTTransactionHistory**
> GetNFTTransactionHistoryResponse getNFTTransactionHistory(orderType, startTime, endTime, limit, page, recvWindow)

Get NFT Transaction History(USER_DATA)

Get NFT Transaction History  * The max interval between startTime and endTime is 90 days. * If startTime and endTime are not sent, the recent 7 days&#39; data will be returned.  Weight: 3000

### Example
```java
// Import classes:
import com.binance.connector.client.nft.ApiClient;
import com.binance.connector.client.nft.ApiException;
import com.binance.connector.client.nft.Configuration;
import com.binance.connector.client.nft.models.*;
import com.binance.connector.client.nft.rest.api.NftApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    NftApi apiInstance = new NftApi(defaultClient);
    Long orderType = 56L; // Long | 0: purchase order, 1: sell order, 2: royalty income, 3: primary market order, 4: mint fee
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long limit = 56L; // Long | Default 50, Max 50
    Long page = 56L; // Long | Default 1
    Long recvWindow = 56L; // Long | 
    try {
      GetNFTTransactionHistoryResponse result = apiInstance.getNFTTransactionHistory(orderType, startTime, endTime, limit, page, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NftApi#getNFTTransactionHistory");
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
| **orderType** | **Long**| 0: purchase order, 1: sell order, 2: royalty income, 3: primary market order, 4: mint fee | |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **limit** | **Long**| Default 50, Max 50 | [optional] |
| **page** | **Long**| Default 1 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetNFTTransactionHistoryResponse**](GetNFTTransactionHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get NFT Transaction History |  -  |

<a id="getNFTWithdrawHistory"></a>
# **getNFTWithdrawHistory**
> GetNFTWithdrawHistoryResponse getNFTWithdrawHistory(startTime, endTime, limit, page, recvWindow)

Get NFT Withdraw History(USER_DATA)

Get NFT Withdraw History  * The max interval between startTime and endTime is 90 days. * If startTime and endTime are not sent, the recent 7 days&#39; data will be returned.  Weight: 3000

### Example
```java
// Import classes:
import com.binance.connector.client.nft.ApiClient;
import com.binance.connector.client.nft.ApiException;
import com.binance.connector.client.nft.Configuration;
import com.binance.connector.client.nft.models.*;
import com.binance.connector.client.nft.rest.api.NftApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    NftApi apiInstance = new NftApi(defaultClient);
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long limit = 56L; // Long | Default 50, Max 50
    Long page = 56L; // Long | Default 1
    Long recvWindow = 56L; // Long | 
    try {
      GetNFTWithdrawHistoryResponse result = apiInstance.getNFTWithdrawHistory(startTime, endTime, limit, page, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NftApi#getNFTWithdrawHistory");
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
| **limit** | **Long**| Default 50, Max 50 | [optional] |
| **page** | **Long**| Default 1 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetNFTWithdrawHistoryResponse**](GetNFTWithdrawHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get NFT Withdraw History |  -  |

