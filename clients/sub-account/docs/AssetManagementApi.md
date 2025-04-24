# AssetManagementApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**futuresTransferForSubAccount**](AssetManagementApi.md#futuresTransferForSubAccount) | **POST** /sapi/v1/sub-account/futures/transfer | Futures Transfer for Sub-account (For Master Account) (USER_DATA) |
| [**getDetailOnSubAccountsFuturesAccount**](AssetManagementApi.md#getDetailOnSubAccountsFuturesAccount) | **GET** /sapi/v1/sub-account/futures/account | Get Detail on Sub-account&#39;s Futures Account (For Master Account) (USER_DATA) |
| [**getDetailOnSubAccountsFuturesAccountV2**](AssetManagementApi.md#getDetailOnSubAccountsFuturesAccountV2) | **GET** /sapi/v2/sub-account/futures/account | Get Detail on Sub-account&#39;s Futures Account V2 (For Master Account) (USER_DATA) |
| [**getDetailOnSubAccountsMarginAccount**](AssetManagementApi.md#getDetailOnSubAccountsMarginAccount) | **GET** /sapi/v1/sub-account/margin/account | Get Detail on Sub-account&#39;s Margin Account (For Master Account) (USER_DATA) |
| [**getMovePositionHistoryForSubAccount**](AssetManagementApi.md#getMovePositionHistoryForSubAccount) | **GET** /sapi/v1/sub-account/futures/move-position | Get Move Position History for Sub-account (For Master Account) (USER_DATA) |
| [**getSubAccountDepositAddress**](AssetManagementApi.md#getSubAccountDepositAddress) | **GET** /sapi/v1/capital/deposit/subAddress | Get Sub-account Deposit Address (For Master Account) (USER_DATA) |
| [**getSubAccountDepositHistory**](AssetManagementApi.md#getSubAccountDepositHistory) | **GET** /sapi/v1/capital/deposit/subHisrec | Get Sub-account Deposit History (For Master Account) (USER_DATA) |
| [**getSummaryOfSubAccountsFuturesAccount**](AssetManagementApi.md#getSummaryOfSubAccountsFuturesAccount) | **GET** /sapi/v1/sub-account/futures/accountSummary | Get Summary of Sub-account&#39;s Futures Account (For Master Account) (USER_DATA) |
| [**getSummaryOfSubAccountsFuturesAccountV2**](AssetManagementApi.md#getSummaryOfSubAccountsFuturesAccountV2) | **GET** /sapi/v2/sub-account/futures/accountSummary | Get Summary of Sub-account&#39;s Futures Account V2 (For Master Account) (USER_DATA) |
| [**getSummaryOfSubAccountsMarginAccount**](AssetManagementApi.md#getSummaryOfSubAccountsMarginAccount) | **GET** /sapi/v1/sub-account/margin/accountSummary | Get Summary of Sub-account&#39;s Margin Account (For Master Account) (USER_DATA) |
| [**marginTransferForSubAccount**](AssetManagementApi.md#marginTransferForSubAccount) | **POST** /sapi/v1/sub-account/margin/transfer | Margin Transfer for Sub-account (For Master Account) (USER_DATA) |
| [**movePositionForSubAccount**](AssetManagementApi.md#movePositionForSubAccount) | **POST** /sapi/v1/sub-account/futures/move-position | Move Position for Sub-account (For Master Account) (USER_DATA) |
| [**querySubAccountAssets**](AssetManagementApi.md#querySubAccountAssets) | **GET** /sapi/v3/sub-account/assets | Query Sub-account Assets (For Master Account) (USER_DATA) |
| [**querySubAccountAssetsAssetManagement**](AssetManagementApi.md#querySubAccountAssetsAssetManagement) | **GET** /sapi/v4/sub-account/assets | Query Sub-account Assets (For Master Account) (USER_DATA) |
| [**querySubAccountFuturesAssetTransferHistory**](AssetManagementApi.md#querySubAccountFuturesAssetTransferHistory) | **GET** /sapi/v1/sub-account/futures/internalTransfer | Query Sub-account Futures Asset Transfer History (For Master Account) (USER_DATA) |
| [**querySubAccountSpotAssetTransferHistory**](AssetManagementApi.md#querySubAccountSpotAssetTransferHistory) | **GET** /sapi/v1/sub-account/sub/transfer/history | Query Sub-account Spot Asset Transfer History (For Master Account) (USER_DATA) |
| [**querySubAccountSpotAssetsSummary**](AssetManagementApi.md#querySubAccountSpotAssetsSummary) | **GET** /sapi/v1/sub-account/spotSummary | Query Sub-account Spot Assets Summary (For Master Account) (USER_DATA) |
| [**queryUniversalTransferHistory**](AssetManagementApi.md#queryUniversalTransferHistory) | **GET** /sapi/v1/sub-account/universalTransfer | Query Universal Transfer History (For Master Account) (USER_DATA) |
| [**subAccountFuturesAssetTransfer**](AssetManagementApi.md#subAccountFuturesAssetTransfer) | **POST** /sapi/v1/sub-account/futures/internalTransfer | Sub-account Futures Asset Transfer (For Master Account) (USER_DATA) |
| [**subAccountTransferHistory**](AssetManagementApi.md#subAccountTransferHistory) | **GET** /sapi/v1/sub-account/transfer/subUserHistory | Sub-account Transfer History (For Sub-account) (USER_DATA) |
| [**transferToMaster**](AssetManagementApi.md#transferToMaster) | **POST** /sapi/v1/sub-account/transfer/subToMaster | Transfer to Master (For Sub-account) (USER_DATA) |
| [**transferToSubAccountOfSameMaster**](AssetManagementApi.md#transferToSubAccountOfSameMaster) | **POST** /sapi/v1/sub-account/transfer/subToSub | Transfer to Sub-account of Same Master (For Sub-account) (USER_DATA) |
| [**universalTransfer**](AssetManagementApi.md#universalTransfer) | **POST** /sapi/v1/sub-account/universalTransfer | Universal Transfer (For Master Account) (USER_DATA) |


<a id="futuresTransferForSubAccount"></a>
# **futuresTransferForSubAccount**
> FuturesTransferForSubAccountResponse futuresTransferForSubAccount(futuresTransferForSubAccountRequest)

Futures Transfer for Sub-account (For Master Account) (USER_DATA)

Futures Transfer for Sub-account  * You need to open Enable Spot &amp; Margin Trading permission for the API Key which requests this endpoint.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AssetManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetManagementApi apiInstance = new AssetManagementApi(defaultClient);
    FuturesTransferForSubAccountRequest futuresTransferForSubAccountRequest = new FuturesTransferForSubAccountRequest(); // FuturesTransferForSubAccountRequest | 
    try {
      FuturesTransferForSubAccountResponse result = apiInstance.futuresTransferForSubAccount(futuresTransferForSubAccountRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetManagementApi#futuresTransferForSubAccount");
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
| **futuresTransferForSubAccountRequest** | [**FuturesTransferForSubAccountRequest**](FuturesTransferForSubAccountRequest.md)|  | |

### Return type

[**FuturesTransferForSubAccountResponse**](FuturesTransferForSubAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Futures Transfer for Sub-account |  -  |

<a id="getDetailOnSubAccountsFuturesAccount"></a>
# **getDetailOnSubAccountsFuturesAccount**
> GetDetailOnSubAccountsFuturesAccountResponse getDetailOnSubAccountsFuturesAccount(email, recvWindow)

Get Detail on Sub-account&#39;s Futures Account (For Master Account) (USER_DATA)

Get Detail on Sub-account&#39;s Futures Account  Weight: 10

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AssetManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetManagementApi apiInstance = new AssetManagementApi(defaultClient);
    String email = "email_example"; // String | [Sub-account email](#email-address)
    Long recvWindow = 56L; // Long | 
    try {
      GetDetailOnSubAccountsFuturesAccountResponse result = apiInstance.getDetailOnSubAccountsFuturesAccount(email, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetManagementApi#getDetailOnSubAccountsFuturesAccount");
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
| **email** | **String**| [Sub-account email](#email-address) | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetDetailOnSubAccountsFuturesAccountResponse**](GetDetailOnSubAccountsFuturesAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Detail on Sub-account&#39;s Futures Account |  -  |

<a id="getDetailOnSubAccountsFuturesAccountV2"></a>
# **getDetailOnSubAccountsFuturesAccountV2**
> GetDetailOnSubAccountsFuturesAccountV2Response getDetailOnSubAccountsFuturesAccountV2(email, futuresType, recvWindow)

Get Detail on Sub-account&#39;s Futures Account V2 (For Master Account) (USER_DATA)

Get Detail on Sub-account&#39;s Futures Account  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AssetManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetManagementApi apiInstance = new AssetManagementApi(defaultClient);
    String email = "email_example"; // String | [Sub-account email](#email-address)
    Long futuresType = 56L; // Long | 1:USDT-margined Futures，2: Coin-margined Futures
    Long recvWindow = 56L; // Long | 
    try {
      GetDetailOnSubAccountsFuturesAccountV2Response result = apiInstance.getDetailOnSubAccountsFuturesAccountV2(email, futuresType, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetManagementApi#getDetailOnSubAccountsFuturesAccountV2");
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
| **email** | **String**| [Sub-account email](#email-address) | |
| **futuresType** | **Long**| 1:USDT-margined Futures，2: Coin-margined Futures | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetDetailOnSubAccountsFuturesAccountV2Response**](GetDetailOnSubAccountsFuturesAccountV2Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Detail on Sub-account&#39;s Futures Account V2 |  -  |

<a id="getDetailOnSubAccountsMarginAccount"></a>
# **getDetailOnSubAccountsMarginAccount**
> GetDetailOnSubAccountsMarginAccountResponse getDetailOnSubAccountsMarginAccount(email, recvWindow)

Get Detail on Sub-account&#39;s Margin Account (For Master Account) (USER_DATA)

Get Detail on Sub-account&#39;s Margin Account  Weight: 10

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AssetManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetManagementApi apiInstance = new AssetManagementApi(defaultClient);
    String email = "email_example"; // String | [Sub-account email](#email-address)
    Long recvWindow = 56L; // Long | 
    try {
      GetDetailOnSubAccountsMarginAccountResponse result = apiInstance.getDetailOnSubAccountsMarginAccount(email, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetManagementApi#getDetailOnSubAccountsMarginAccount");
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
| **email** | **String**| [Sub-account email](#email-address) | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetDetailOnSubAccountsMarginAccountResponse**](GetDetailOnSubAccountsMarginAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Detail on Sub-account&#39;s Margin Account |  -  |

<a id="getMovePositionHistoryForSubAccount"></a>
# **getMovePositionHistoryForSubAccount**
> GetMovePositionHistoryForSubAccountResponse getMovePositionHistoryForSubAccount(symbol, page, row, startTime, endTime, recvWindow)

Get Move Position History for Sub-account (For Master Account) (USER_DATA)

Query move position history  * If &#x60;startTime&#x60; and &#x60;endTime&#x60; not sent, return records of the last 90 days by default with 1000 maximum limits * If &#x60;startTime&#x60; is sent and &#x60;endTime&#x60; is not sent, return records of [max(startTime, now-90d), now]. * If &#x60;startTime&#x60; is not sent and &#x60;endTime&#x60; is sent, return records of [max(now,endTime-90d), endTime].  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AssetManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetManagementApi apiInstance = new AssetManagementApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long page = 56L; // Long | Page
    Long row = 56L; // Long | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long recvWindow = 56L; // Long | 
    try {
      GetMovePositionHistoryForSubAccountResponse result = apiInstance.getMovePositionHistoryForSubAccount(symbol, page, row, startTime, endTime, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetManagementApi#getMovePositionHistoryForSubAccount");
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
| **symbol** | **String**|  | |
| **page** | **Long**| Page | |
| **row** | **Long**|  | |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetMovePositionHistoryForSubAccountResponse**](GetMovePositionHistoryForSubAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Move Position History for Sub-account |  -  |

<a id="getSubAccountDepositAddress"></a>
# **getSubAccountDepositAddress**
> GetSubAccountDepositAddressResponse getSubAccountDepositAddress(email, coin, network, amount, recvWindow)

Get Sub-account Deposit Address (For Master Account) (USER_DATA)

Fetch sub-account deposit address  * &#x60;amount&#x60; needs to be sent if using LIGHTNING network  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AssetManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetManagementApi apiInstance = new AssetManagementApi(defaultClient);
    String email = "email_example"; // String | [Sub-account email](#email-address)
    String coin = "coin_example"; // String | 
    String network = "network_example"; // String | networks can be found in `GET /sapi/v1/capital/deposit/address`
    Double amount = 3.4D; // Double | 
    Long recvWindow = 56L; // Long | 
    try {
      GetSubAccountDepositAddressResponse result = apiInstance.getSubAccountDepositAddress(email, coin, network, amount, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetManagementApi#getSubAccountDepositAddress");
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
| **email** | **String**| [Sub-account email](#email-address) | |
| **coin** | **String**|  | |
| **network** | **String**| networks can be found in &#x60;GET /sapi/v1/capital/deposit/address&#x60; | [optional] |
| **amount** | **Double**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetSubAccountDepositAddressResponse**](GetSubAccountDepositAddressResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Sub-account Deposit Address |  -  |

<a id="getSubAccountDepositHistory"></a>
# **getSubAccountDepositHistory**
> GetSubAccountDepositHistoryResponse getSubAccountDepositHistory(email, coin, status, startTime, endTime, limit, offset, recvWindow, txId)

Get Sub-account Deposit History (For Master Account) (USER_DATA)

Fetch sub-account deposit history  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AssetManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetManagementApi apiInstance = new AssetManagementApi(defaultClient);
    String email = "email_example"; // String | [Sub-account email](#email-address)
    String coin = "coin_example"; // String | 
    Long status = 56L; // Long | 0(0:pending,6: credited but cannot withdraw,7:Wrong Deposit,8:Waiting User confirm,1:success)
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long limit = 56L; // Long | Default value: 1, Max value: 200
    Long offset = 56L; // Long | default:0
    Long recvWindow = 56L; // Long | 
    String txId = "txId_example"; // String | 
    try {
      GetSubAccountDepositHistoryResponse result = apiInstance.getSubAccountDepositHistory(email, coin, status, startTime, endTime, limit, offset, recvWindow, txId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetManagementApi#getSubAccountDepositHistory");
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
| **email** | **String**| [Sub-account email](#email-address) | |
| **coin** | **String**|  | [optional] |
| **status** | **Long**| 0(0:pending,6: credited but cannot withdraw,7:Wrong Deposit,8:Waiting User confirm,1:success) | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **limit** | **Long**| Default value: 1, Max value: 200 | [optional] |
| **offset** | **Long**| default:0 | [optional] |
| **recvWindow** | **Long**|  | [optional] |
| **txId** | **String**|  | [optional] |

### Return type

[**GetSubAccountDepositHistoryResponse**](GetSubAccountDepositHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Sub-account Deposit History |  -  |

<a id="getSummaryOfSubAccountsFuturesAccount"></a>
# **getSummaryOfSubAccountsFuturesAccount**
> GetSummaryOfSubAccountsFuturesAccountResponse getSummaryOfSubAccountsFuturesAccount(recvWindow)

Get Summary of Sub-account&#39;s Futures Account (For Master Account) (USER_DATA)

Get Summary of Sub-account&#39;s Futures Account  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AssetManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetManagementApi apiInstance = new AssetManagementApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      GetSummaryOfSubAccountsFuturesAccountResponse result = apiInstance.getSummaryOfSubAccountsFuturesAccount(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetManagementApi#getSummaryOfSubAccountsFuturesAccount");
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

[**GetSummaryOfSubAccountsFuturesAccountResponse**](GetSummaryOfSubAccountsFuturesAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Summary of Sub-account&#39;s Futures Account |  -  |

<a id="getSummaryOfSubAccountsFuturesAccountV2"></a>
# **getSummaryOfSubAccountsFuturesAccountV2**
> GetSummaryOfSubAccountsFuturesAccountV2Response getSummaryOfSubAccountsFuturesAccountV2(futuresType, page, limit, recvWindow)

Get Summary of Sub-account&#39;s Futures Account V2 (For Master Account) (USER_DATA)

Get Summary of Sub-account&#39;s Futures Account  Weight: 10

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AssetManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetManagementApi apiInstance = new AssetManagementApi(defaultClient);
    Long futuresType = 56L; // Long | 1:USDT-margined Futures，2: Coin-margined Futures
    Long page = 56L; // Long | Default value: 1
    Long limit = 56L; // Long | Default value: 1, Max value: 200
    Long recvWindow = 56L; // Long | 
    try {
      GetSummaryOfSubAccountsFuturesAccountV2Response result = apiInstance.getSummaryOfSubAccountsFuturesAccountV2(futuresType, page, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetManagementApi#getSummaryOfSubAccountsFuturesAccountV2");
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
| **futuresType** | **Long**| 1:USDT-margined Futures，2: Coin-margined Futures | |
| **page** | **Long**| Default value: 1 | [optional] |
| **limit** | **Long**| Default value: 1, Max value: 200 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetSummaryOfSubAccountsFuturesAccountV2Response**](GetSummaryOfSubAccountsFuturesAccountV2Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Summary of Sub-account&#39;s Futures Account V2 |  -  |

<a id="getSummaryOfSubAccountsMarginAccount"></a>
# **getSummaryOfSubAccountsMarginAccount**
> GetSummaryOfSubAccountsMarginAccountResponse getSummaryOfSubAccountsMarginAccount(recvWindow)

Get Summary of Sub-account&#39;s Margin Account (For Master Account) (USER_DATA)

Get Summary of Sub-account&#39;s Margin Account  Weight: 10

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AssetManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetManagementApi apiInstance = new AssetManagementApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      GetSummaryOfSubAccountsMarginAccountResponse result = apiInstance.getSummaryOfSubAccountsMarginAccount(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetManagementApi#getSummaryOfSubAccountsMarginAccount");
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

[**GetSummaryOfSubAccountsMarginAccountResponse**](GetSummaryOfSubAccountsMarginAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Summary of Sub-account&#39;s Margin Account |  -  |

<a id="marginTransferForSubAccount"></a>
# **marginTransferForSubAccount**
> MarginTransferForSubAccountResponse marginTransferForSubAccount(marginTransferForSubAccountRequest)

Margin Transfer for Sub-account (For Master Account) (USER_DATA)

Margin Transfer for Sub-account  * You need to open Enable Spot &amp; Margin Trading permission for the API Key which requests this endpoint.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AssetManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetManagementApi apiInstance = new AssetManagementApi(defaultClient);
    MarginTransferForSubAccountRequest marginTransferForSubAccountRequest = new MarginTransferForSubAccountRequest(); // MarginTransferForSubAccountRequest | 
    try {
      MarginTransferForSubAccountResponse result = apiInstance.marginTransferForSubAccount(marginTransferForSubAccountRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetManagementApi#marginTransferForSubAccount");
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
| **marginTransferForSubAccountRequest** | [**MarginTransferForSubAccountRequest**](MarginTransferForSubAccountRequest.md)|  | |

### Return type

[**MarginTransferForSubAccountResponse**](MarginTransferForSubAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Transfer for Sub-account |  -  |

<a id="movePositionForSubAccount"></a>
# **movePositionForSubAccount**
> MovePositionForSubAccountResponse movePositionForSubAccount(movePositionForSubAccountRequest)

Move Position for Sub-account (For Master Account) (USER_DATA)

Move position between sub-master, master-sub, or sub-sub accounts when necessary  * You need to Enable Trading permission for the API Key which requests this endpoint. * This function only support VIP level 7-9. * Only master account can use the function * Quantity should be positive number only * The function support normal account, PM PRO and PM PRO SPAN. * Only support for from account has positions * For all orders in the same orderArgs request, if any symbol’s total close position quantity is bigger than the symbol’s current position quantity, all batch orders in the same list will fail simultaneously. * Only support cross margin mode * The price for move position is MarkPrice only. * Not support for MSA. * Not support for the symbol under Reduce-Only.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AssetManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetManagementApi apiInstance = new AssetManagementApi(defaultClient);
    MovePositionForSubAccountRequest movePositionForSubAccountRequest = new MovePositionForSubAccountRequest(); // MovePositionForSubAccountRequest | 
    try {
      MovePositionForSubAccountResponse result = apiInstance.movePositionForSubAccount(movePositionForSubAccountRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetManagementApi#movePositionForSubAccount");
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
| **movePositionForSubAccountRequest** | [**MovePositionForSubAccountRequest**](MovePositionForSubAccountRequest.md)|  | |

### Return type

[**MovePositionForSubAccountResponse**](MovePositionForSubAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Move Position for Sub-account |  -  |

<a id="querySubAccountAssets"></a>
# **querySubAccountAssets**
> QuerySubAccountAssetsResponse querySubAccountAssets(email, recvWindow)

Query Sub-account Assets (For Master Account) (USER_DATA)

Fetch sub-account assets  Weight: 60

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AssetManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetManagementApi apiInstance = new AssetManagementApi(defaultClient);
    String email = "email_example"; // String | [Sub-account email](#email-address)
    Long recvWindow = 56L; // Long | 
    try {
      QuerySubAccountAssetsResponse result = apiInstance.querySubAccountAssets(email, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetManagementApi#querySubAccountAssets");
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
| **email** | **String**| [Sub-account email](#email-address) | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QuerySubAccountAssetsResponse**](QuerySubAccountAssetsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sub-account Assets |  -  |

<a id="querySubAccountAssetsAssetManagement"></a>
# **querySubAccountAssetsAssetManagement**
> QuerySubAccountAssetsAssetManagementResponse querySubAccountAssetsAssetManagement(email, recvWindow)

Query Sub-account Assets (For Master Account) (USER_DATA)

Fetch sub-account assets  Weight: 60

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AssetManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetManagementApi apiInstance = new AssetManagementApi(defaultClient);
    String email = "email_example"; // String | [Sub-account email](#email-address)
    Long recvWindow = 56L; // Long | 
    try {
      QuerySubAccountAssetsAssetManagementResponse result = apiInstance.querySubAccountAssetsAssetManagement(email, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetManagementApi#querySubAccountAssetsAssetManagement");
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
| **email** | **String**| [Sub-account email](#email-address) | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QuerySubAccountAssetsAssetManagementResponse**](QuerySubAccountAssetsAssetManagementResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sub-account Assets |  -  |

<a id="querySubAccountFuturesAssetTransferHistory"></a>
# **querySubAccountFuturesAssetTransferHistory**
> QuerySubAccountFuturesAssetTransferHistoryResponse querySubAccountFuturesAssetTransferHistory(email, futuresType, startTime, endTime, page, limit, recvWindow)

Query Sub-account Futures Asset Transfer History (For Master Account) (USER_DATA)

Query Sub-account Futures Asset Transfer History  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AssetManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetManagementApi apiInstance = new AssetManagementApi(defaultClient);
    String email = "email_example"; // String | [Sub-account email](#email-address)
    Long futuresType = 56L; // Long | 1:USDT-margined Futures，2: Coin-margined Futures
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long page = 56L; // Long | Default value: 1
    Long limit = 56L; // Long | Default value: 1, Max value: 200
    Long recvWindow = 56L; // Long | 
    try {
      QuerySubAccountFuturesAssetTransferHistoryResponse result = apiInstance.querySubAccountFuturesAssetTransferHistory(email, futuresType, startTime, endTime, page, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetManagementApi#querySubAccountFuturesAssetTransferHistory");
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
| **email** | **String**| [Sub-account email](#email-address) | |
| **futuresType** | **Long**| 1:USDT-margined Futures，2: Coin-margined Futures | |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **page** | **Long**| Default value: 1 | [optional] |
| **limit** | **Long**| Default value: 1, Max value: 200 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QuerySubAccountFuturesAssetTransferHistoryResponse**](QuerySubAccountFuturesAssetTransferHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sub-account Futures Asset Transfer History |  -  |

<a id="querySubAccountSpotAssetTransferHistory"></a>
# **querySubAccountSpotAssetTransferHistory**
> QuerySubAccountSpotAssetTransferHistoryResponse querySubAccountSpotAssetTransferHistory(fromEmail, toEmail, startTime, endTime, page, limit, recvWindow)

Query Sub-account Spot Asset Transfer History (For Master Account) (USER_DATA)

Query Sub-account Spot Asset Transfer History  * fromEmail and toEmail cannot be sent at the same time. * Return fromEmail equal master account email by default.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AssetManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetManagementApi apiInstance = new AssetManagementApi(defaultClient);
    String fromEmail = "fromEmail_example"; // String | 
    String toEmail = "toEmail_example"; // String | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long page = 56L; // Long | Default value: 1
    Long limit = 56L; // Long | Default value: 1, Max value: 200
    Long recvWindow = 56L; // Long | 
    try {
      QuerySubAccountSpotAssetTransferHistoryResponse result = apiInstance.querySubAccountSpotAssetTransferHistory(fromEmail, toEmail, startTime, endTime, page, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetManagementApi#querySubAccountSpotAssetTransferHistory");
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
| **fromEmail** | **String**|  | [optional] |
| **toEmail** | **String**|  | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **page** | **Long**| Default value: 1 | [optional] |
| **limit** | **Long**| Default value: 1, Max value: 200 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QuerySubAccountSpotAssetTransferHistoryResponse**](QuerySubAccountSpotAssetTransferHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sub-account Spot Asset Transfer History |  -  |

<a id="querySubAccountSpotAssetsSummary"></a>
# **querySubAccountSpotAssetsSummary**
> QuerySubAccountSpotAssetsSummaryResponse querySubAccountSpotAssetsSummary(email, page, size, recvWindow)

Query Sub-account Spot Assets Summary (For Master Account) (USER_DATA)

Get BTC valued asset summary of subaccounts.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AssetManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetManagementApi apiInstance = new AssetManagementApi(defaultClient);
    String email = "email_example"; // String | Managed sub-account email
    Long page = 56L; // Long | Default value: 1
    Long size = 56L; // Long | default 10, max 20
    Long recvWindow = 56L; // Long | 
    try {
      QuerySubAccountSpotAssetsSummaryResponse result = apiInstance.querySubAccountSpotAssetsSummary(email, page, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetManagementApi#querySubAccountSpotAssetsSummary");
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
| **email** | **String**| Managed sub-account email | [optional] |
| **page** | **Long**| Default value: 1 | [optional] |
| **size** | **Long**| default 10, max 20 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QuerySubAccountSpotAssetsSummaryResponse**](QuerySubAccountSpotAssetsSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sub-account Spot Assets Summary |  -  |

<a id="queryUniversalTransferHistory"></a>
# **queryUniversalTransferHistory**
> QueryUniversalTransferHistoryResponse queryUniversalTransferHistory(fromEmail, toEmail, clientTranId, startTime, endTime, page, limit, recvWindow)

Query Universal Transfer History (For Master Account) (USER_DATA)

Query Universal Transfer History  * fromEmail and toEmail cannot be sent at the same time. * Return fromEmail equal master account email by default. * The query time period must be less than 7 days. * If startTime and endTime not sent, return records of the last 7 days by default.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AssetManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetManagementApi apiInstance = new AssetManagementApi(defaultClient);
    String fromEmail = "fromEmail_example"; // String | 
    String toEmail = "toEmail_example"; // String | 
    String clientTranId = "clientTranId_example"; // String | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long page = 56L; // Long | Default value: 1
    Long limit = 56L; // Long | Default value: 1, Max value: 200
    Long recvWindow = 56L; // Long | 
    try {
      QueryUniversalTransferHistoryResponse result = apiInstance.queryUniversalTransferHistory(fromEmail, toEmail, clientTranId, startTime, endTime, page, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetManagementApi#queryUniversalTransferHistory");
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
| **fromEmail** | **String**|  | [optional] |
| **toEmail** | **String**|  | [optional] |
| **clientTranId** | **String**|  | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **page** | **Long**| Default value: 1 | [optional] |
| **limit** | **Long**| Default value: 1, Max value: 200 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryUniversalTransferHistoryResponse**](QueryUniversalTransferHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Universal Transfer History |  -  |

<a id="subAccountFuturesAssetTransfer"></a>
# **subAccountFuturesAssetTransfer**
> SubAccountFuturesAssetTransferResponse subAccountFuturesAssetTransfer(subAccountFuturesAssetTransferRequest)

Sub-account Futures Asset Transfer (For Master Account) (USER_DATA)

Sub-account Futures Asset Transfer   * Master account can transfer max 2000 times a minute * There must be sufficient margin balance in futures wallet to execute transferring.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AssetManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetManagementApi apiInstance = new AssetManagementApi(defaultClient);
    SubAccountFuturesAssetTransferRequest subAccountFuturesAssetTransferRequest = new SubAccountFuturesAssetTransferRequest(); // SubAccountFuturesAssetTransferRequest | 
    try {
      SubAccountFuturesAssetTransferResponse result = apiInstance.subAccountFuturesAssetTransfer(subAccountFuturesAssetTransferRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetManagementApi#subAccountFuturesAssetTransfer");
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
| **subAccountFuturesAssetTransferRequest** | [**SubAccountFuturesAssetTransferRequest**](SubAccountFuturesAssetTransferRequest.md)|  | |

### Return type

[**SubAccountFuturesAssetTransferResponse**](SubAccountFuturesAssetTransferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sub-account Futures Asset Transfer |  -  |

<a id="subAccountTransferHistory"></a>
# **subAccountTransferHistory**
> SubAccountTransferHistoryResponse subAccountTransferHistory(asset, type, startTime, endTime, limit, returnFailHistory, recvWindow)

Sub-account Transfer History (For Sub-account) (USER_DATA)

Sub-account Transfer History  * If type is not sent, the records of type 2: transfer out will be returned by default. * If startTime and endTime are not sent, the recent 30-day data will be returned.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AssetManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetManagementApi apiInstance = new AssetManagementApi(defaultClient);
    String asset = "asset_example"; // String | If not sent, result of all assets will be returned
    Long type = 56L; // Long | 1: transfer in, 2: transfer out
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long limit = 56L; // Long | Default value: 1, Max value: 200
    Boolean returnFailHistory = true; // Boolean | Default `False`, return PROCESS and SUCCESS status history; If `True`,return PROCESS and SUCCESS and FAILURE status history
    Long recvWindow = 56L; // Long | 
    try {
      SubAccountTransferHistoryResponse result = apiInstance.subAccountTransferHistory(asset, type, startTime, endTime, limit, returnFailHistory, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetManagementApi#subAccountTransferHistory");
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
| **asset** | **String**| If not sent, result of all assets will be returned | [optional] |
| **type** | **Long**| 1: transfer in, 2: transfer out | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **limit** | **Long**| Default value: 1, Max value: 200 | [optional] |
| **returnFailHistory** | **Boolean**| Default &#x60;False&#x60;, return PROCESS and SUCCESS status history; If &#x60;True&#x60;,return PROCESS and SUCCESS and FAILURE status history | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**SubAccountTransferHistoryResponse**](SubAccountTransferHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sub-account Transfer History |  -  |

<a id="transferToMaster"></a>
# **transferToMaster**
> TransferToMasterResponse transferToMaster(transferToMasterRequest)

Transfer to Master (For Sub-account) (USER_DATA)

Transfer to Master  * You need to open Enable Spot &amp; Margin Trading permission for the API Key which requests this endpoint.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AssetManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetManagementApi apiInstance = new AssetManagementApi(defaultClient);
    TransferToMasterRequest transferToMasterRequest = new TransferToMasterRequest(); // TransferToMasterRequest | 
    try {
      TransferToMasterResponse result = apiInstance.transferToMaster(transferToMasterRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetManagementApi#transferToMaster");
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
| **transferToMasterRequest** | [**TransferToMasterRequest**](TransferToMasterRequest.md)|  | |

### Return type

[**TransferToMasterResponse**](TransferToMasterResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transfer to Master |  -  |

<a id="transferToSubAccountOfSameMaster"></a>
# **transferToSubAccountOfSameMaster**
> TransferToSubAccountOfSameMasterResponse transferToSubAccountOfSameMaster(transferToSubAccountOfSameMasterRequest)

Transfer to Sub-account of Same Master (For Sub-account) (USER_DATA)

Transfer to Sub-account of Same Master  * You need to open Enable Spot &amp; Margin Trading permission for the API Key which requests this endpoint.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AssetManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetManagementApi apiInstance = new AssetManagementApi(defaultClient);
    TransferToSubAccountOfSameMasterRequest transferToSubAccountOfSameMasterRequest = new TransferToSubAccountOfSameMasterRequest(); // TransferToSubAccountOfSameMasterRequest | 
    try {
      TransferToSubAccountOfSameMasterResponse result = apiInstance.transferToSubAccountOfSameMaster(transferToSubAccountOfSameMasterRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetManagementApi#transferToSubAccountOfSameMaster");
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
| **transferToSubAccountOfSameMasterRequest** | [**TransferToSubAccountOfSameMasterRequest**](TransferToSubAccountOfSameMasterRequest.md)|  | |

### Return type

[**TransferToSubAccountOfSameMasterResponse**](TransferToSubAccountOfSameMasterResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transfer to Sub-account of Same Master |  -  |

<a id="universalTransfer"></a>
# **universalTransfer**
> UniversalTransferResponse universalTransfer(universalTransferRequest)

Universal Transfer (For Master Account) (USER_DATA)

Universal Transfer  * You need to enable \&quot;internal transfer\&quot; option for the api key which requests this endpoint. * Transfer from master account by default if fromEmail is not sent. * Transfer to master account by default if toEmail is not sent. * At least either fromEmail or toEmail need to be sent when the fromAccountType and the toAccountType are the same. * Supported transfer scenarios: * &#x60;SPOT&#x60; transfer to &#x60;SPOT&#x60;, &#x60;USDT_FUTURE&#x60;, &#x60;COIN_FUTURE&#x60; (regardless of master or sub) * &#x60;SPOT&#x60;, &#x60;USDT_FUTURE&#x60;, &#x60;COIN_FUTURE&#x60; transfer to &#x60;SPOT&#x60;  (regardless of master or sub) * Master account &#x60;SPOT&#x60; transfer to sub-account &#x60;MARGIN(Cross)&#x60;, &#x60;ISOLATED_MARGIN&#x60; * Sub-account &#x60;MARGIN(Cross)&#x60;, &#x60;ISOLATED_MARGIN&#x60; transfer to master account &#x60;SPOT&#x60; * Sub-account &#x60;MARGIN(Cross)&#x60; transfer to Sub-account &#x60;MARGIN(Cross)&#x60;  Weight: 360

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.AssetManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetManagementApi apiInstance = new AssetManagementApi(defaultClient);
    UniversalTransferRequest universalTransferRequest = new UniversalTransferRequest(); // UniversalTransferRequest | 
    try {
      UniversalTransferResponse result = apiInstance.universalTransfer(universalTransferRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetManagementApi#universalTransfer");
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
| **universalTransferRequest** | [**UniversalTransferRequest**](UniversalTransferRequest.md)|  | |

### Return type

[**UniversalTransferResponse**](UniversalTransferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Universal Transfer |  -  |

