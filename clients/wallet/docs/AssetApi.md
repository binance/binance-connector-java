# AssetApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assetDetail**](AssetApi.md#assetDetail) | **GET** /sapi/v1/asset/assetDetail | Asset Detail (USER_DATA) |
| [**assetDividendRecord**](AssetApi.md#assetDividendRecord) | **GET** /sapi/v1/asset/assetDividend | Asset Dividend Record (USER_DATA) |
| [**dustTransfer**](AssetApi.md#dustTransfer) | **POST** /sapi/v1/asset/dust | Dust Transfer (USER_DATA) |
| [**dustlog**](AssetApi.md#dustlog) | **GET** /sapi/v1/asset/dribblet | DustLog(USER_DATA) |
| [**fundingWallet**](AssetApi.md#fundingWallet) | **POST** /sapi/v1/asset/get-funding-asset | Funding Wallet (USER_DATA) |
| [**getAssetsThatCanBeConvertedIntoBnb**](AssetApi.md#getAssetsThatCanBeConvertedIntoBnb) | **POST** /sapi/v1/asset/dust-btc | Get Assets That Can Be Converted Into BNB (USER_DATA) |
| [**getCloudMiningPaymentAndRefundHistory**](AssetApi.md#getCloudMiningPaymentAndRefundHistory) | **GET** /sapi/v1/asset/ledger-transfer/cloud-mining/queryByPage | Get Cloud-Mining payment and refund history (USER_DATA) |
| [**getOpenSymbolList**](AssetApi.md#getOpenSymbolList) | **GET** /sapi/v1/spot/open-symbol-list | Get Open Symbol List (MARKET_DATA) |
| [**queryUserDelegationHistory**](AssetApi.md#queryUserDelegationHistory) | **GET** /sapi/v1/asset/custody/transfer-history | Query User Delegation History(For Master Account)(USER_DATA) |
| [**queryUserUniversalTransferHistory**](AssetApi.md#queryUserUniversalTransferHistory) | **GET** /sapi/v1/asset/transfer | Query User Universal Transfer History(USER_DATA) |
| [**queryUserWalletBalance**](AssetApi.md#queryUserWalletBalance) | **GET** /sapi/v1/asset/wallet/balance | Query User Wallet Balance (USER_DATA) |
| [**toggleBnbBurnOnSpotTradeAndMarginInterest**](AssetApi.md#toggleBnbBurnOnSpotTradeAndMarginInterest) | **POST** /sapi/v1/bnbBurn | Toggle BNB Burn On Spot Trade And Margin Interest (USER_DATA) |
| [**tradeFee**](AssetApi.md#tradeFee) | **GET** /sapi/v1/asset/tradeFee | Trade Fee (USER_DATA) |
| [**userAsset**](AssetApi.md#userAsset) | **POST** /sapi/v3/asset/getUserAsset | User Asset (USER_DATA) |
| [**userUniversalTransfer**](AssetApi.md#userUniversalTransfer) | **POST** /sapi/v1/asset/transfer | User Universal Transfer (USER_DATA) |


<a id="assetDetail"></a>
# **assetDetail**
> AssetDetailResponse assetDetail(recvWindow)

Asset Detail (USER_DATA)

Fetch details of assets supported on Binance.   * Please get network and other deposit or withdraw details from &#x60;&#x60;GET /sapi/v1/capital/config/getall&#x60;&#x60;.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.AssetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetApi apiInstance = new AssetApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      AssetDetailResponse result = apiInstance.assetDetail(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetApi#assetDetail");
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

[**AssetDetailResponse**](AssetDetailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Asset Detail |  -  |

<a id="assetDividendRecord"></a>
# **assetDividendRecord**
> AssetDividendRecordResponse assetDividendRecord(asset, startTime, endTime, limit, recvWindow)

Asset Dividend Record (USER_DATA)

Query asset dividend record.   * There cannot be more than 180 days between parameter &#x60;startTime&#x60; and &#x60;endTime&#x60;.  Weight: 10

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.AssetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetApi apiInstance = new AssetApi(defaultClient);
    String asset = "asset_example"; // String | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long limit = 56L; // Long | min 7, max 30, default 7
    Long recvWindow = 56L; // Long | 
    try {
      AssetDividendRecordResponse result = apiInstance.assetDividendRecord(asset, startTime, endTime, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetApi#assetDividendRecord");
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
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **limit** | **Long**| min 7, max 30, default 7 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**AssetDividendRecordResponse**](AssetDividendRecordResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Asset Dividend Record |  -  |

<a id="dustTransfer"></a>
# **dustTransfer**
> DustTransferResponse dustTransfer(dustTransferRequest)

Dust Transfer (USER_DATA)

Convert dust assets to BNB.  * You need to open&#x60;Enable Spot &amp; Margin Trading&#x60; permission for the API Key which requests this endpoint.  Weight: 10

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.AssetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetApi apiInstance = new AssetApi(defaultClient);
    DustTransferRequest dustTransferRequest = new DustTransferRequest(); // DustTransferRequest | 
    try {
      DustTransferResponse result = apiInstance.dustTransfer(dustTransferRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetApi#dustTransfer");
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
| **dustTransferRequest** | [**DustTransferRequest**](DustTransferRequest.md)|  | |

### Return type

[**DustTransferResponse**](DustTransferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Dust Transfer |  -  |

<a id="dustlog"></a>
# **dustlog**
> DustlogResponse dustlog(startTime, endTime, recvWindow)

DustLog(USER_DATA)

Dustlog  * Only return last 100 records * Only return records after 2020/12/01  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.AssetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetApi apiInstance = new AssetApi(defaultClient);
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long recvWindow = 56L; // Long | 
    try {
      DustlogResponse result = apiInstance.dustlog(startTime, endTime, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetApi#dustlog");
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
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**DustlogResponse**](DustlogResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | DustLog |  -  |

<a id="fundingWallet"></a>
# **fundingWallet**
> FundingWalletResponse fundingWallet(fundingWalletRequest)

Funding Wallet (USER_DATA)

Query Funding Wallet   * Currently supports querying the following business assets：Binance Pay, Binance Card, Binance Gift Card, Stock Token  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.AssetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetApi apiInstance = new AssetApi(defaultClient);
    FundingWalletRequest fundingWalletRequest = new FundingWalletRequest(); // FundingWalletRequest | 
    try {
      FundingWalletResponse result = apiInstance.fundingWallet(fundingWalletRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetApi#fundingWallet");
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
| **fundingWalletRequest** | [**FundingWalletRequest**](FundingWalletRequest.md)|  | |

### Return type

[**FundingWalletResponse**](FundingWalletResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Funding Wallet |  -  |

<a id="getAssetsThatCanBeConvertedIntoBnb"></a>
# **getAssetsThatCanBeConvertedIntoBnb**
> GetAssetsThatCanBeConvertedIntoBnbResponse getAssetsThatCanBeConvertedIntoBnb(getAssetsThatCanBeConvertedIntoBnbRequest)

Get Assets That Can Be Converted Into BNB (USER_DATA)

Get Assets That Can Be Converted Into BNB  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.AssetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetApi apiInstance = new AssetApi(defaultClient);
    GetAssetsThatCanBeConvertedIntoBnbRequest getAssetsThatCanBeConvertedIntoBnbRequest = new GetAssetsThatCanBeConvertedIntoBnbRequest(); // GetAssetsThatCanBeConvertedIntoBnbRequest | 
    try {
      GetAssetsThatCanBeConvertedIntoBnbResponse result = apiInstance.getAssetsThatCanBeConvertedIntoBnb(getAssetsThatCanBeConvertedIntoBnbRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetApi#getAssetsThatCanBeConvertedIntoBnb");
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
| **getAssetsThatCanBeConvertedIntoBnbRequest** | [**GetAssetsThatCanBeConvertedIntoBnbRequest**](GetAssetsThatCanBeConvertedIntoBnbRequest.md)|  | |

### Return type

[**GetAssetsThatCanBeConvertedIntoBnbResponse**](GetAssetsThatCanBeConvertedIntoBnbResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Assets That Can Be Converted Into BNB |  -  |

<a id="getCloudMiningPaymentAndRefundHistory"></a>
# **getCloudMiningPaymentAndRefundHistory**
> GetCloudMiningPaymentAndRefundHistoryResponse getCloudMiningPaymentAndRefundHistory(startTime, endTime, tranId, clientTranId, asset, current, size)

Get Cloud-Mining payment and refund history (USER_DATA)

The query of Cloud-Mining payment and refund history  * Just return the SUCCESS records of payment and refund. * For response, type &#x3D; 248 means payment, type &#x3D; 249 means refund, status &#x3D;S means SUCCESS.  Weight: 600

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.AssetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetApi apiInstance = new AssetApi(defaultClient);
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long tranId = 56L; // Long | The transaction id
    String clientTranId = "clientTranId_example"; // String | The unique flag
    String asset = "asset_example"; // String | 
    Long current = 56L; // Long | current page, default 1, the min value is 1
    Long size = 56L; // Long | page size, default 10, the max value is 100
    try {
      GetCloudMiningPaymentAndRefundHistoryResponse result = apiInstance.getCloudMiningPaymentAndRefundHistory(startTime, endTime, tranId, clientTranId, asset, current, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetApi#getCloudMiningPaymentAndRefundHistory");
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
| **startTime** | **Long**|  | |
| **endTime** | **Long**|  | |
| **tranId** | **Long**| The transaction id | [optional] |
| **clientTranId** | **String**| The unique flag | [optional] |
| **asset** | **String**|  | [optional] |
| **current** | **Long**| current page, default 1, the min value is 1 | [optional] |
| **size** | **Long**| page size, default 10, the max value is 100 | [optional] |

### Return type

[**GetCloudMiningPaymentAndRefundHistoryResponse**](GetCloudMiningPaymentAndRefundHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Cloud-Mining payment and refund history |  -  |

<a id="getOpenSymbolList"></a>
# **getOpenSymbolList**
> GetOpenSymbolListResponse getOpenSymbolList()

Get Open Symbol List (MARKET_DATA)

Get the list of symbols that are scheduled to be opened for trading in the market.  Weight: 100

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.AssetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetApi apiInstance = new AssetApi(defaultClient);
    try {
      GetOpenSymbolListResponse result = apiInstance.getOpenSymbolList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetApi#getOpenSymbolList");
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

[**GetOpenSymbolListResponse**](GetOpenSymbolListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Open Symbol List |  -  |

<a id="queryUserDelegationHistory"></a>
# **queryUserDelegationHistory**
> QueryUserDelegationHistoryResponse queryUserDelegationHistory(email, startTime, endTime, type, asset, current, size, recvWindow)

Query User Delegation History(For Master Account)(USER_DATA)

Query User Delegation History  * You need to open Enable Spot &amp; Margin Trading permission for the API Key which requests this endpoint  Weight: 60

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.AssetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetApi apiInstance = new AssetApi(defaultClient);
    String email = "email_example"; // String | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    String type = "type_example"; // String | Delegate/Undelegate
    String asset = "asset_example"; // String | 
    Long current = 56L; // Long | current page, default 1, the min value is 1
    Long size = 56L; // Long | page size, default 10, the max value is 100
    Long recvWindow = 56L; // Long | 
    try {
      QueryUserDelegationHistoryResponse result = apiInstance.queryUserDelegationHistory(email, startTime, endTime, type, asset, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetApi#queryUserDelegationHistory");
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
| **startTime** | **Long**|  | |
| **endTime** | **Long**|  | |
| **type** | **String**| Delegate/Undelegate | [optional] |
| **asset** | **String**|  | [optional] |
| **current** | **Long**| current page, default 1, the min value is 1 | [optional] |
| **size** | **Long**| page size, default 10, the max value is 100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryUserDelegationHistoryResponse**](QueryUserDelegationHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User Delegation History |  -  |

<a id="queryUserUniversalTransferHistory"></a>
# **queryUserUniversalTransferHistory**
> QueryUserUniversalTransferHistoryResponse queryUserUniversalTransferHistory(type, startTime, endTime, current, size, fromSymbol, toSymbol, recvWindow)

Query User Universal Transfer History(USER_DATA)

Query User Universal Transfer History   *  &#x60;fromSymbol&#x60; must be sent when type are ISOLATEDMARGIN_MARGIN and ISOLATEDMARGIN_ISOLATEDMARGIN *  &#x60;toSymbol&#x60; must be sent when type are MARGIN_ISOLATEDMARGIN and ISOLATEDMARGIN_ISOLATEDMARGIN * Support query within the last 6 months only * If &#x60;startTime&#x60;and &#x60;endTime&#x60; not sent, return records of the last 7 days by default  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.AssetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetApi apiInstance = new AssetApi(defaultClient);
    String type = "type_example"; // String | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | current page, default 1, the min value is 1
    Long size = 56L; // Long | page size, default 10, the max value is 100
    String fromSymbol = "fromSymbol_example"; // String | 
    String toSymbol = "toSymbol_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      QueryUserUniversalTransferHistoryResponse result = apiInstance.queryUserUniversalTransferHistory(type, startTime, endTime, current, size, fromSymbol, toSymbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetApi#queryUserUniversalTransferHistory");
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
| **type** | **String**|  | |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| current page, default 1, the min value is 1 | [optional] |
| **size** | **Long**| page size, default 10, the max value is 100 | [optional] |
| **fromSymbol** | **String**|  | [optional] |
| **toSymbol** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryUserUniversalTransferHistoryResponse**](QueryUserUniversalTransferHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User Universal Transfer History |  -  |

<a id="queryUserWalletBalance"></a>
# **queryUserWalletBalance**
> QueryUserWalletBalanceResponse queryUserWalletBalance(quoteAsset, recvWindow)

Query User Wallet Balance (USER_DATA)

Query User Wallet Balance   * You need to open Permits Universal Transfer permission for the API Key which requests this endpoint.  Weight: 60

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.AssetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetApi apiInstance = new AssetApi(defaultClient);
    String quoteAsset = "quoteAsset_example"; // String | `USDT`, `ETH`, `USDC`, `BNB`, etc. default `BTC`
    Long recvWindow = 56L; // Long | 
    try {
      QueryUserWalletBalanceResponse result = apiInstance.queryUserWalletBalance(quoteAsset, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetApi#queryUserWalletBalance");
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
| **quoteAsset** | **String**| &#x60;USDT&#x60;, &#x60;ETH&#x60;, &#x60;USDC&#x60;, &#x60;BNB&#x60;, etc. default &#x60;BTC&#x60; | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryUserWalletBalanceResponse**](QueryUserWalletBalanceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User Wallet Balance |  -  |

<a id="toggleBnbBurnOnSpotTradeAndMarginInterest"></a>
# **toggleBnbBurnOnSpotTradeAndMarginInterest**
> ToggleBnbBurnOnSpotTradeAndMarginInterestResponse toggleBnbBurnOnSpotTradeAndMarginInterest(toggleBnbBurnOnSpotTradeAndMarginInterestRequest)

Toggle BNB Burn On Spot Trade And Margin Interest (USER_DATA)

Toggle BNB Burn On Spot Trade And Margin Interest  * \&quot;spotBNBBurn\&quot; and \&quot;interestBNBBurn\&quot; should be sent at least one.  Weight: 1(IP)

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.AssetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetApi apiInstance = new AssetApi(defaultClient);
    ToggleBnbBurnOnSpotTradeAndMarginInterestRequest toggleBnbBurnOnSpotTradeAndMarginInterestRequest = new ToggleBnbBurnOnSpotTradeAndMarginInterestRequest(); // ToggleBnbBurnOnSpotTradeAndMarginInterestRequest | 
    try {
      ToggleBnbBurnOnSpotTradeAndMarginInterestResponse result = apiInstance.toggleBnbBurnOnSpotTradeAndMarginInterest(toggleBnbBurnOnSpotTradeAndMarginInterestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetApi#toggleBnbBurnOnSpotTradeAndMarginInterest");
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
| **toggleBnbBurnOnSpotTradeAndMarginInterestRequest** | [**ToggleBnbBurnOnSpotTradeAndMarginInterestRequest**](ToggleBnbBurnOnSpotTradeAndMarginInterestRequest.md)|  | |

### Return type

[**ToggleBnbBurnOnSpotTradeAndMarginInterestResponse**](ToggleBnbBurnOnSpotTradeAndMarginInterestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Toggle BNB Burn On Spot Trade And Margin Interest |  -  |

<a id="tradeFee"></a>
# **tradeFee**
> TradeFeeResponse tradeFee(symbol, recvWindow)

Trade Fee (USER_DATA)

Fetch trade fee  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.AssetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetApi apiInstance = new AssetApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      TradeFeeResponse result = apiInstance.tradeFee(symbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetApi#tradeFee");
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
| **symbol** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**TradeFeeResponse**](TradeFeeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Trade Fee |  -  |

<a id="userAsset"></a>
# **userAsset**
> UserAssetResponse userAsset(userAssetRequest)

User Asset (USER_DATA)

Get user assets, just for positive data.  * If asset is set, then return this asset, otherwise return all assets positive. * If needBtcValuation is set, then return btcValudation.  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.AssetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetApi apiInstance = new AssetApi(defaultClient);
    UserAssetRequest userAssetRequest = new UserAssetRequest(); // UserAssetRequest | 
    try {
      UserAssetResponse result = apiInstance.userAsset(userAssetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetApi#userAsset");
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
| **userAssetRequest** | [**UserAssetRequest**](UserAssetRequest.md)|  | |

### Return type

[**UserAssetResponse**](UserAssetResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User Asset |  -  |

<a id="userUniversalTransfer"></a>
# **userUniversalTransfer**
> UserUniversalTransferResponse userUniversalTransfer(userUniversalTransferRequest)

User Universal Transfer (USER_DATA)

user universal transfer  *  &#x60;fromSymbol&#x60; must be sent when type are ISOLATEDMARGIN_MARGIN and ISOLATEDMARGIN_ISOLATEDMARGIN *  &#x60;toSymbol&#x60; must be sent when type are MARGIN_ISOLATEDMARGIN and ISOLATEDMARGIN_ISOLATEDMARGIN * ENUM of transfer types: * MAIN_UMFUTURE   Spot account transfer to USDⓈ-M Futures account * MAIN_CMFUTURE   Spot account transfer to COIN-M Futures account * MAIN_MARGIN   Spot account transfer to Margin（cross）account * UMFUTURE_MAIN   USDⓈ-M Futures account transfer to Spot account * UMFUTURE_MARGIN   USDⓈ-M Futures account transfer to Margin（cross）account * CMFUTURE_MAIN   COIN-M Futures account transfer to Spot account * CMFUTURE_MARGIN   COIN-M Futures account transfer to Margin(cross) account * MARGIN_MAIN   Margin（cross）account transfer to Spot account * MARGIN_UMFUTURE   Margin（cross）account transfer to USDⓈ-M Futures * MARGIN_CMFUTURE   Margin（cross）account transfer to COIN-M Futures * ISOLATEDMARGIN_MARGIN   Isolated margin account transfer to Margin(cross) account * MARGIN_ISOLATEDMARGIN   Margin(cross) account transfer to Isolated margin account * ISOLATEDMARGIN_ISOLATEDMARGIN   Isolated margin account transfer to Isolated margin account * MAIN_FUNDING   Spot account transfer to Funding account * FUNDING_MAIN   Funding account transfer to Spot account * FUNDING_UMFUTURE   Funding account transfer to UMFUTURE account * UMFUTURE_FUNDING   UMFUTURE account transfer to Funding account * MARGIN_FUNDING   MARGIN account transfer to Funding account * FUNDING_MARGIN   Funding account transfer to Margin account * FUNDING_CMFUTURE   Funding account transfer to CMFUTURE account * CMFUTURE_FUNDING   CMFUTURE account transfer to Funding account * MAIN_OPTION  Spot account transfer to Options account * OPTION_MAIN  Options account transfer to Spot account * UMFUTURE_OPTION USDⓈ-M Futures account transfer to Options account * OPTION_UMFUTURE Options account transfer to USDⓈ-M Futures account * MARGIN_OPTION  Margin（cross）account transfer to Options account * OPTION_MARGIN  Options account transfer to Margin（cross）account * FUNDING_OPTION   Funding account transfer to Options account * OPTION_FUNDING   Options account transfer to Funding account * MAIN_PORTFOLIO_MARGIN  Spot account transfer to Portfolio Margin account * PORTFOLIO_MARGIN_MAIN  Portfolio Margin account transfer to Spot account  Weight: 900

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.AssetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AssetApi apiInstance = new AssetApi(defaultClient);
    UserUniversalTransferRequest userUniversalTransferRequest = new UserUniversalTransferRequest(); // UserUniversalTransferRequest | 
    try {
      UserUniversalTransferResponse result = apiInstance.userUniversalTransfer(userUniversalTransferRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetApi#userUniversalTransfer");
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
| **userUniversalTransferRequest** | [**UserUniversalTransferRequest**](UserUniversalTransferRequest.md)|  | |

### Return type

[**UserUniversalTransferResponse**](UserUniversalTransferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User Universal Transfer |  -  |

