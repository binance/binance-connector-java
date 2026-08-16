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
| [**querySubAccountAssetsAssetManagement**](AssetManagementApi.md#querySubAccountAssetsAssetManagement) | **GET** /sapi/v4/sub-account/assets | Query Sub-account Assets V4 (For Master Account) (USER_DATA) |
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

Futures Transfer for Sub-account  Weight(IP): 1  Security Type: USER_DATA  Notes: - You need to open Enable Spot &amp; Margin Trading permission for the API Key which requests this endpoint.

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

Get Detail on Sub-account&#39;s Futures Account  Weight(IP): 10  Security Type: USER_DATA

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
    String email = "123@test.com"; // String | 
    Long recvWindow = 5000L; // Long | 
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
| **email** | **String**|  | |
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

Get Detail on Sub-account&#39;s Futures Account  Weight(IP): 1  Security Type: USER_DATA

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
    String email = "123@test.com"; // String | 
    Long futuresType = 1L; // Long | 1:USDT-margined Futures，2: Coin-margined Futures
    Long recvWindow = 5000L; // Long | 
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
| **email** | **String**|  | |
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

Get Detail on Sub-account&#39;s Margin Account  Weight(IP): 10  Security Type: USER_DATA

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
    String email = "123@test.com"; // String | 
    Long recvWindow = 5000L; // Long | 
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
| **email** | **String**|  | |
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
> GetMovePositionHistoryForSubAccountResponse getMovePositionHistoryForSubAccount(symbol, page, rows, startTime, endTime, recvWindow)

Get Move Position History for Sub-account (For Master Account) (USER_DATA)

Query move position history  Weight(IP): 1  Security Type: USER_DATA  Notes: - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both omitted, records from the last 90 days are returned by default (up to 1000 records). - If &#x60;startTime&#x60; is sent and &#x60;endTime&#x60; is omitted, records in &#x60;[max(startTime, now-90d), now]&#x60; are returned. - If &#x60;startTime&#x60; is omitted and &#x60;endTime&#x60; is sent, records in &#x60;[max(now, endTime-90d), endTime]&#x60; are returned.

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
    String symbol = "BTCUSDT"; // String | 
    Long page = 1L; // Long | 
    Long rows = 1L; // Long | 
    Long startTime = 1623319461670L; // Long | 
    Long endTime = 1641782889000L; // Long | 
    Long recvWindow = 5000L; // Long | 
    try {
      GetMovePositionHistoryForSubAccountResponse result = apiInstance.getMovePositionHistoryForSubAccount(symbol, page, rows, startTime, endTime, recvWindow);
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
| **page** | **Long**|  | |
| **rows** | **Long**|  | |
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

Fetch sub-account deposit address  Weight(IP): 1  Security Type: USER_DATA  Notes: - &#x60;amount&#x60; needs to be sent if using LIGHTNING network

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
    String email = "123@test.com"; // String | 
    String coin = "BTC"; // String | 
    String network = "network_example"; // String | networks can be found in `GET /sapi/v1/capital/deposit/address`
    Double amount = 1.0D; // Double | 
    Long recvWindow = 5000L; // Long | 
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
| **email** | **String**|  | |
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
> GetSubAccountDepositHistoryResponse getSubAccountDepositHistory(email, includeSource, coin, status, startTime, endTime, limit, offset, recvWindow, txId)

Get Sub-account Deposit History (For Master Account) (USER_DATA)

Fetch sub-account deposit history  Weight(IP): 1  Security Type: USER_DATA

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
    String email = "123@test.com"; // String | 
    Boolean includeSource = false; // Boolean | Default `false`, return `sourceAddress` field when set to `true`
    String coin = "BTC"; // String | 
    Long status = 0L; // Long | Deposit status: 0=pending, 6=credited but cannot withdraw, 7=wrong deposit, 8=waiting user confirmation, 1=success.
    Long startTime = 1623319461670L; // Long | 
    Long endTime = 1641782889000L; // Long | 
    Long limit = 1L; // Long | 
    Long offset = 0L; // Long | 
    Long recvWindow = 5000L; // Long | 
    String txId = "1"; // String | 
    try {
      GetSubAccountDepositHistoryResponse result = apiInstance.getSubAccountDepositHistory(email, includeSource, coin, status, startTime, endTime, limit, offset, recvWindow, txId);
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
| **email** | **String**|  | |
| **includeSource** | **Boolean**| Default &#x60;false&#x60;, return &#x60;sourceAddress&#x60; field when set to &#x60;true&#x60; | [optional] |
| **coin** | **String**|  | [optional] |
| **status** | **Long**| Deposit status: 0&#x3D;pending, 6&#x3D;credited but cannot withdraw, 7&#x3D;wrong deposit, 8&#x3D;waiting user confirmation, 1&#x3D;success. | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **limit** | **Long**|  | [optional] |
| **offset** | **Long**|  | [optional] |
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
> GetSummaryOfSubAccountsFuturesAccountResponse getSummaryOfSubAccountsFuturesAccount(page, limit, recvWindow)

Get Summary of Sub-account&#39;s Futures Account (For Master Account) (USER_DATA)

Get Summary of Sub-account&#39;s Futures Account  Weight(IP): 1  Security Type: USER_DATA

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
    Long page = 1L; // Long | 
    Long limit = 1L; // Long | 
    Long recvWindow = 5000L; // Long | 
    try {
      GetSummaryOfSubAccountsFuturesAccountResponse result = apiInstance.getSummaryOfSubAccountsFuturesAccount(page, limit, recvWindow);
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
| **page** | **Long**|  | |
| **limit** | **Long**|  | |
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

Get Summary of Sub-account&#39;s Futures Account  Weight(IP): 10  Security Type: USER_DATA

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
    Long futuresType = 1L; // Long | 1:USDT-margined Futures，2: Coin-margined Futures
    Long page = 1L; // Long | 
    Long limit = 10L; // Long | 
    Long recvWindow = 5000L; // Long | 
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
| **page** | **Long**|  | [optional] |
| **limit** | **Long**|  | [optional] |
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

Get Summary of Sub-account&#39;s Margin Account  Weight(IP): 10  Security Type: USER_DATA

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
    Long recvWindow = 5000L; // Long | 
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

Margin Transfer for Sub-account  Weight(IP): 1  Security Type: USER_DATA  Notes: - You need to open Enable Spot &amp; Margin Trading permission for the API Key which requests this endpoint.

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

Move position between sub-master, master-sub, or sub-sub accounts when necessary  Weight(IP): 1  Security Type: USER_DATA  Notes: - You need to enable the &#x60;Trading&#x60; permission for the API key used to call this endpoint. - This function is only available for VIP levels 7-9. - Only master accounts can call this endpoint. - &#x60;quantity&#x60; must be a positive number. - Supported account types: normal account, PM PRO, PM PRO SPAN, and PM Retail. - The source account must have positions. - For orders in the same &#x60;orderArgs&#x60; request, if any symbol&#39;s total close position quantity exceeds current position quantity, all orders in that batch fail. - Only cross margin mode is supported. - The move position price supports &#x60;MARK_PRICE&#x60; only. - MSA is not supported. - Symbols configured with &#x60;Reduce-Only&#x60; are not supported.

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

Fetch sub-account assets  Weight(UID): 60  Security Type: USER_DATA

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
    String email = "123@test.com"; // String | 
    Long recvWindow = 5000L; // Long | 
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
| **email** | **String**|  | |
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

Query Sub-account Assets V4 (For Master Account) (USER_DATA)

Fetch sub-account assets  Weight(UID): 60  Security Type: USER_DATA

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
    String email = "123@test.com"; // String | 
    Long recvWindow = 5000L; // Long | 
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
| **email** | **String**|  | |
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

Query Sub-account Futures Asset Transfer History  Weight(IP): 1  Security Type: USER_DATA

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
    String email = "123@test.com"; // String | 
    Long futuresType = 1L; // Long | 1:USDT-margined Futures，2: Coin-margined Futures
    Long startTime = 1623319461670L; // Long | Cannot be earlier than 1 month ago
    Long endTime = 1641782889000L; // Long | 
    Long page = 1L; // Long | 
    Long limit = 10L; // Long | 
    Long recvWindow = 5000L; // Long | 
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
| **email** | **String**|  | |
| **futuresType** | **Long**| 1:USDT-margined Futures，2: Coin-margined Futures | |
| **startTime** | **Long**| Cannot be earlier than 1 month ago | [optional] |
| **endTime** | **Long**|  | [optional] |
| **page** | **Long**|  | [optional] |
| **limit** | **Long**|  | [optional] |
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

Query Sub-account Spot Asset Transfer History  Weight(IP): 1  Security Type: USER_DATA  Notes: - &#x60;fromEmail&#x60; and &#x60;toEmail&#x60; cannot be sent at the same time. - If both &#x60;fromEmail&#x60; and &#x60;toEmail&#x60; are omitted, records with &#x60;fromEmail&#x60; equal to the master account are returned by default.

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
    String fromEmail = "aaa@test.com"; // String | 
    String toEmail = "bbb@test.com"; // String | 
    Long startTime = 1623319461670L; // Long | 
    Long endTime = 1641782889000L; // Long | 
    Long page = 1L; // Long | 
    Long limit = 10L; // Long | 
    Long recvWindow = 5000L; // Long | 
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
| **page** | **Long**|  | [optional] |
| **limit** | **Long**|  | [optional] |
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

Get BTC valued asset summary of subaccounts.  Weight(IP): 1  Security Type: USER_DATA

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
    String email = "123@test.com"; // String | Managed sub-account email
    Long page = 1L; // Long | 
    Long size = 10L; // Long | 
    Long recvWindow = 5000L; // Long | 
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
| **page** | **Long**|  | [optional] |
| **size** | **Long**|  | [optional] |
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

Query Universal Transfer History  Weight(IP): 1  Security Type: USER_DATA  Notes: - &#x60;fromEmail&#x60; and &#x60;toEmail&#x60; cannot be sent at the same time. - If both &#x60;fromEmail&#x60; and &#x60;toEmail&#x60; are omitted, records with &#x60;fromEmail&#x60; equal to the master account are returned by default. - The query time range must be less than 7 days. - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are omitted, records from the last 7 days are returned by default.

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
    String fromEmail = "abctest@gmail.com"; // String | 
    String toEmail = "deftest@gmail.com"; // String | 
    String clientTranId = "1"; // String | 
    Long startTime = 1623319461670L; // Long | 
    Long endTime = 1641782889000L; // Long | 
    Long page = 1L; // Long | 
    Long limit = 10L; // Long | 
    Long recvWindow = 5000L; // Long | 
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
| **page** | **Long**|  | [optional] |
| **limit** | **Long**|  | [optional] |
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

Sub-account Futures Asset Transfer  Weight(IP): 1  Security Type: USER_DATA  Notes: - A master account can transfer at most 2000 times per minute. - The futures wallet must have sufficient margin balance to execute the transfer.

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

Sub-account Transfer History  Weight(IP): 1  Security Type: USER_DATA  Notes: - If &#x60;type&#x60; is not sent, records of type &#x60;2&#x60; (transfer out) are returned by default. - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, data from the most recent 30 days is returned.

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
    String asset = "BTC"; // String | If not sent, result of all assets will be returned
    Long type = 1L; // Long | 1: transfer in, 2: transfer out
    Long startTime = 1623319461670L; // Long | 
    Long endTime = 1641782889000L; // Long | 
    Long limit = 10L; // Long | 
    Boolean returnFailHistory = false; // Boolean | Default `False`, return PROCESS and SUCCESS status history; If `True`,return PROCESS and SUCCESS and FAILURE status history
    Long recvWindow = 5000L; // Long | 
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
| **limit** | **Long**|  | [optional] |
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

Transfer to Master  Weight(IP): 1  Security Type: USER_DATA  Notes: - You need to open Enable Spot &amp; Margin Trading permission for the API Key which requests this endpoint.

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

Transfer to Sub-account of Same Master  Weight(IP): 1  Security Type: USER_DATA  Notes: - You need to open Enable Spot &amp; Margin Trading permission for the API Key which requests this endpoint.

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

Universal Transfer  Weight(IP): 1  Weight(UID): 360  Security Type: USER_DATA  Notes: - You need to enable the &#x60;internal transfer&#x60; option for the API key used to call this endpoint. - If &#x60;fromEmail&#x60; is not sent, transfer out from the master account by default. - If &#x60;toEmail&#x60; is not sent, transfer into the master account by default. - When &#x60;fromAccountType&#x60; and &#x60;toAccountType&#x60; are the same, at least one of &#x60;fromEmail&#x60; or &#x60;toEmail&#x60; must be sent. - Supported transfer scenarios:   - &#x60;SPOT&#x60; -&gt; &#x60;SPOT&#x60; / &#x60;USDT_FUTURE&#x60; / &#x60;COIN_FUTURE&#x60; (master or sub-account).   - &#x60;SPOT&#x60; / &#x60;USDT_FUTURE&#x60; / &#x60;COIN_FUTURE&#x60; -&gt; &#x60;SPOT&#x60; (master or sub-account).   - Master account &#x60;SPOT&#x60; -&gt; sub-account &#x60;MARGIN(Cross)&#x60; / &#x60;ISOLATED_MARGIN&#x60;.   - Sub-account &#x60;MARGIN(Cross)&#x60; / &#x60;ISOLATED_MARGIN&#x60; -&gt; master account &#x60;SPOT&#x60;.   - Sub-account &#x60;MARGIN(Cross)&#x60; -&gt; sub-account &#x60;MARGIN(Cross)&#x60;.   - &#x60;ALPHA&#x60; -&gt; &#x60;ALPHA&#x60; (master or sub-account).

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

