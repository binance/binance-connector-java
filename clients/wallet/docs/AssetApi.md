# AssetApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assetDetail**](AssetApi.md#assetDetail) | **GET** /sapi/v1/asset/assetDetail | Asset Detail (USER_DATA) |
| [**assetDividendRecord**](AssetApi.md#assetDividendRecord) | **GET** /sapi/v1/asset/assetDividend | Asset Dividend Record (USER_DATA) |
| [**dustConvert**](AssetApi.md#dustConvert) | **POST** /sapi/v1/asset/dust-convert/convert | Dust Convert (USER_DATA) |
| [**dustConvertibleAssets**](AssetApi.md#dustConvertibleAssets) | **POST** /sapi/v1/asset/dust-convert/query-convertible-assets | Dust Convertible Assets (USER_DATA) |
| [**dustTransfer**](AssetApi.md#dustTransfer) | **POST** /sapi/v1/asset/dust | Dust Transfer (USER_DATA) |
| [**dustlog**](AssetApi.md#dustlog) | **GET** /sapi/v1/asset/dribblet | DustLog (USER_DATA) |
| [**fundingWallet**](AssetApi.md#fundingWallet) | **POST** /sapi/v1/asset/get-funding-asset | Funding Wallet (USER_DATA) |
| [**getAssetsThatCanBeConvertedIntoBnb**](AssetApi.md#getAssetsThatCanBeConvertedIntoBnb) | **POST** /sapi/v1/asset/dust-btc | Get Assets That Can Be Converted Into BNB (USER_DATA) |
| [**getCloudMiningPaymentAndRefundHistory**](AssetApi.md#getCloudMiningPaymentAndRefundHistory) | **GET** /sapi/v1/asset/ledger-transfer/cloud-mining/queryByPage | Get Cloud-Mining payment and refund history (USER_DATA) |
| [**getOpenSymbolList**](AssetApi.md#getOpenSymbolList) | **GET** /sapi/v1/spot/open-symbol-list | Get Open Symbol List (MARKET_DATA) |
| [**getSpotAssetTags**](AssetApi.md#getSpotAssetTags) | **GET** /sapi/v1/spot/asset/tags | Get Spot Asset Tags (MARKET_DATA) |
| [**queryUserDelegationHistory**](AssetApi.md#queryUserDelegationHistory) | **GET** /sapi/v1/asset/custody/transfer-history | Query User Delegation History(For Master Account) (USER_DATA) |
| [**queryUserUniversalTransferHistory**](AssetApi.md#queryUserUniversalTransferHistory) | **GET** /sapi/v1/asset/transfer | Query User Universal Transfer History (USER_DATA) |
| [**queryUserWalletBalance**](AssetApi.md#queryUserWalletBalance) | **GET** /sapi/v1/asset/wallet/balance | Query User Wallet Balance (USER_DATA) |
| [**toggleBnbBurnOnSpotTradeAndMarginInterest**](AssetApi.md#toggleBnbBurnOnSpotTradeAndMarginInterest) | **POST** /sapi/v1/bnbBurn | Toggle BNB Burn On Spot Trade And Margin Interest (USER_DATA) |
| [**tradeFee**](AssetApi.md#tradeFee) | **GET** /sapi/v1/asset/tradeFee | Trade Fee (USER_DATA) |
| [**userAsset**](AssetApi.md#userAsset) | **POST** /sapi/v3/asset/getUserAsset | User Asset (USER_DATA) |
| [**userUniversalTransfer**](AssetApi.md#userUniversalTransfer) | **POST** /sapi/v1/asset/transfer | User Universal Transfer (USER_DATA) |


<a id="assetDetail"></a>
# **assetDetail**
> AssetDetailResponse assetDetail(asset, recvWindow)

Asset Detail (USER_DATA)

Fetch details of assets supported on Binance.  Weight(IP): 1  Security Type: USER_DATA  Notes: - Please get network and other deposit or withdraw details from &#x60;GET /sapi/v1/capital/config/getall&#x60;.

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
    String asset = "BTC"; // String | 
    Long recvWindow = 5000L; // Long | 
    try {
      AssetDetailResponse result = apiInstance.assetDetail(asset, recvWindow);
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
| **asset** | **String**|  | [optional] |
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

Query asset dividend record.  Weight(IP): 10  Security Type: USER_DATA  Notes: - There cannot be more than 180 days between parameter &#x60;startTime&#x60; and &#x60;endTime&#x60;.

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
    String asset = "BTC"; // String | 
    Long startTime = 1623319461670L; // Long | 
    Long endTime = 1641782889000L; // Long | 
    Long limit = 20L; // Long | 
    Long recvWindow = 5000L; // Long | 
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
| **limit** | **Long**|  | [optional] |
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

<a id="dustConvert"></a>
# **dustConvert**
> DustConvertResponse dustConvert(dustConvertRequest)

Dust Convert (USER_DATA)

Convert dust assets  Weight(UID): 10  Security Type: USER_DATA

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
    DustConvertRequest dustConvertRequest = new DustConvertRequest(); // DustConvertRequest | 
    try {
      DustConvertResponse result = apiInstance.dustConvert(dustConvertRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetApi#dustConvert");
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
| **dustConvertRequest** | [**DustConvertRequest**](DustConvertRequest.md)|  | |

### Return type

[**DustConvertResponse**](DustConvertResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Dust Convert |  -  |

<a id="dustConvertibleAssets"></a>
# **dustConvertibleAssets**
> DustConvertibleAssetsResponse dustConvertibleAssets(dustConvertibleAssetsRequest)

Dust Convertible Assets (USER_DATA)

Query dust convertible assets  Weight(IP): 1  Security Type: USER_DATA

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
    DustConvertibleAssetsRequest dustConvertibleAssetsRequest = new DustConvertibleAssetsRequest(); // DustConvertibleAssetsRequest | 
    try {
      DustConvertibleAssetsResponse result = apiInstance.dustConvertibleAssets(dustConvertibleAssetsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetApi#dustConvertibleAssets");
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
| **dustConvertibleAssetsRequest** | [**DustConvertibleAssetsRequest**](DustConvertibleAssetsRequest.md)|  | |

### Return type

[**DustConvertibleAssetsResponse**](DustConvertibleAssetsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Dust Convertible Assets |  -  |

<a id="dustTransfer"></a>
# **dustTransfer**
> DustTransferResponse dustTransfer(dustTransferRequest)

Dust Transfer (USER_DATA)

Convert dust assets to BNB.  Weight(UID): 10  Security Type: USER_DATA  Notes: - You need to open&#x60;Enable Spot &amp; Margin Trading&#x60; permission for the API Key which requests this endpoint.

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
> DustlogResponse dustlog(accountType, startTime, endTime, recvWindow)

DustLog (USER_DATA)

Dustlog  Weight(IP): 1  Security Type: USER_DATA  Notes: - Only return last 100 records - Only return records after 2020/12/01

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
    AccountType accountType = AccountType.fromValue("SPOT"); // AccountType | 
    Long startTime = 1623319461670L; // Long | 
    Long endTime = 1641782889000L; // Long | 
    Long recvWindow = 5000L; // Long | 
    try {
      DustlogResponse result = apiInstance.dustlog(accountType, startTime, endTime, recvWindow);
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
| **accountType** | [**AccountType**](.md)|  | [optional] [enum: SPOT, MARGIN] |
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

Query Funding Wallet  Weight(IP): 1  Security Type: USER_DATA  Notes: - Currently supports querying the following business assets：Binance Pay, Binance Card, Binance Gift Card, Stock Token

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
| **fundingWalletRequest** | [**FundingWalletRequest**](FundingWalletRequest.md)|  | [optional] |

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

Get Assets That Can Be Converted Into BNB  Weight(IP): 1  Security Type: USER_DATA

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
| **getAssetsThatCanBeConvertedIntoBnbRequest** | [**GetAssetsThatCanBeConvertedIntoBnbRequest**](GetAssetsThatCanBeConvertedIntoBnbRequest.md)|  | [optional] |

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

The query of Cloud-Mining payment and refund history  Weight(UID): 600  Security Type: USER_DATA  Notes: - Just return the SUCCESS records of payment and refund. - For response, type &#x3D; 248 means payment, type &#x3D; 249 means refund, status &#x3D;S means SUCCESS.

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
    Long startTime = 1623319461670L; // Long | inclusive, unit: ms
    Long endTime = 1641782889000L; // Long | exclusive, unit: ms
    Long tranId = 1L; // Long | The transaction id
    String clientTranId = "1"; // String | The unique flag
    String asset = "BTC"; // String | If it is blank, we will query all assets
    Long current = 1L; // Long | 
    Long size = 10L; // Long | 
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
| **startTime** | **Long**| inclusive, unit: ms | |
| **endTime** | **Long**| exclusive, unit: ms | |
| **tranId** | **Long**| The transaction id | [optional] |
| **clientTranId** | **String**| The unique flag | [optional] |
| **asset** | **String**| If it is blank, we will query all assets | [optional] |
| **current** | **Long**|  | [optional] |
| **size** | **Long**|  | [optional] |

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

Get the list of symbols that are scheduled to be opened for trading in the market.  Weight(IP): 100  Security Type: MARKET_DATA

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

<a id="getSpotAssetTags"></a>
# **getSpotAssetTags**
> GetSpotAssetTagsResponse getSpotAssetTags(tag)

Get Spot Asset Tags (MARKET_DATA)

Get the tags configured for spot-tradable assets.  Weight(IP): 100  Security Type: MARKET_DATA

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
    String tag = "Layer1_Layer2,BSC"; // String | Tag filter. Supports multiple comma-separated tags with OR semantics (an asset is returned if it matches any one tag); leading/trailing whitespace around each tag is ignored. Returns all eligible assets when omitted.
    try {
      GetSpotAssetTagsResponse result = apiInstance.getSpotAssetTags(tag);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetApi#getSpotAssetTags");
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
| **tag** | **String**| Tag filter. Supports multiple comma-separated tags with OR semantics (an asset is returned if it matches any one tag); leading/trailing whitespace around each tag is ignored. Returns all eligible assets when omitted. | [optional] |

### Return type

[**GetSpotAssetTagsResponse**](GetSpotAssetTagsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Spot Asset Tags |  -  |

<a id="queryUserDelegationHistory"></a>
# **queryUserDelegationHistory**
> QueryUserDelegationHistoryResponse queryUserDelegationHistory(email, startTime, endTime, type, asset, current, size, recvWindow)

Query User Delegation History(For Master Account) (USER_DATA)

Query User Delegation History  Weight(IP): 60  Security Type: USER_DATA

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
    String email = "abc@test.com"; // String | 
    Long startTime = 1623319461670L; // Long | 
    Long endTime = 1641782889000L; // Long | 
    OrderType type = OrderType.fromValue("DELEGATE"); // OrderType | 
    String asset = "BTC"; // String | 
    Long current = 1L; // Long | 
    Long size = 10L; // Long | 
    Long recvWindow = 5000L; // Long | 
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
| **type** | [**OrderType**](.md)|  | [optional] [enum: DELEGATE, UNDELEGATE, MAIN_UMFUTURE, MAIN_CMFUTURE, MAIN_MARGIN, UMFUTURE_MAIN, UMFUTURE_MARGIN, CMFUTURE_MAIN, CMFUTURE_MARGIN, MARGIN_MAIN, MARGIN_UMFUTURE, MARGIN_CMFUTURE, ISOLATEDMARGIN_MARGIN, MARGIN_ISOLATEDMARGIN, ISOLATEDMARGIN_ISOLATEDMARGIN, MAIN_FUNDING, FUNDING_MAIN, FUNDING_UMFUTURE, UMFUTURE_FUNDING, MARGIN_FUNDING, FUNDING_MARGIN, FUNDING_CMFUTURE, CMFUTURE_FUNDING, MAIN_OPTION, OPTION_MAIN, UMFUTURE_OPTION, OPTION_UMFUTURE, MARGIN_OPTION, OPTION_MARGIN, FUNDING_OPTION, OPTION_FUNDING, MAIN_PORTFOLIO_MARGIN, PORTFOLIO_MARGIN_MAIN] |
| **asset** | **String**|  | [optional] |
| **current** | **Long**|  | [optional] |
| **size** | **Long**|  | [optional] |
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

Query User Universal Transfer History (USER_DATA)

Query User Universal Transfer History  Weight(IP): 1  Security Type: USER_DATA  Notes: - &#x60;fromSymbol&#x60; must be sent when type are ISOLATEDMARGIN_MARGIN and ISOLATEDMARGIN_ISOLATEDMARGIN - &#x60;toSymbol&#x60; must be sent when type are MARGIN_ISOLATEDMARGIN and ISOLATEDMARGIN_ISOLATEDMARGIN - Support query within the last 6 months only - If &#x60;startTime&#x60;and &#x60;endTime&#x60; not sent, return records of the last 7 days by default

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
    Long startTime = 1623319461670L; // Long | 
    Long endTime = 1641782889000L; // Long | 
    Long current = 1L; // Long | 
    Long size = 10L; // Long | 
    FromSymbol fromSymbol = FromSymbol.fromValue("ISOLATEDMARGIN_MARGIN"); // FromSymbol | 
    ToSymbol toSymbol = ToSymbol.fromValue("MARGIN_ISOLATEDMARGIN"); // ToSymbol | 
    Long recvWindow = 5000L; // Long | 
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
| **current** | **Long**|  | [optional] |
| **size** | **Long**|  | [optional] |
| **fromSymbol** | [**FromSymbol**](.md)|  | [optional] [enum: ISOLATEDMARGIN_MARGIN, ISOLATEDMARGIN_ISOLATEDMARGIN] |
| **toSymbol** | [**ToSymbol**](.md)|  | [optional] [enum: MARGIN_ISOLATEDMARGIN, ISOLATEDMARGIN_ISOLATEDMARGIN] |
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

Query User Wallet Balance  Weight(IP): 60  Security Type: USER_DATA

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
    String quoteAsset = "BTC"; // String | 
    Long recvWindow = 5000L; // Long | 
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
| **quoteAsset** | **String**|  | [optional] |
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

Toggle BNB Burn On Spot Trade And Margin Interest  Weight(IP): 1  Security Type: USER_DATA  Notes: - \&quot;spotBNBBurn\&quot; and \&quot;interestBNBBurn\&quot; should be sent at least one.

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
| **toggleBnbBurnOnSpotTradeAndMarginInterestRequest** | [**ToggleBnbBurnOnSpotTradeAndMarginInterestRequest**](ToggleBnbBurnOnSpotTradeAndMarginInterestRequest.md)|  | [optional] |

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

Fetch trade fee  Weight(IP): 1  Security Type: USER_DATA

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
    String symbol = "ADABNB"; // String | 
    Long recvWindow = 5000L; // Long | 
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

Get user assets, just for positive data.  Weight(IP): 5  Security Type: USER_DATA  Notes: - If asset is set, then return this asset, otherwise return all assets positive. - If needBtcValuation is set, then return btcValudation.

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
| **userAssetRequest** | [**UserAssetRequest**](UserAssetRequest.md)|  | [optional] |

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

User universal transfer  Weight(UID): 300  Security Type: USER_DATA  Notes: - You need to enable Permits Universal Transfer option for the API Key that requests this endpoint. - &#x60;fromSymbol&#x60; must be sent when type is &#x60;ISOLATEDMARGIN_MARGIN&#x60; or &#x60;ISOLATEDMARGIN_ISOLATEDMARGIN&#x60;. - &#x60;toSymbol&#x60; must be sent when type is &#x60;MARGIN_ISOLATEDMARGIN&#x60; or &#x60;ISOLATEDMARGIN_ISOLATEDMARGIN&#x60;. - ENUM of transfer types: - &#x60;MAIN_UMFUTURE&#x60;: Spot → USDⓈ-M Futures - &#x60;MAIN_CMFUTURE&#x60;: Spot → COIN-M Futures - &#x60;MAIN_MARGIN&#x60;: Spot → Margin (cross) - &#x60;UMFUTURE_MAIN&#x60;: USDⓈ-M Futures → Spot - &#x60;UMFUTURE_MARGIN&#x60;: USDⓈ-M Futures → Margin (cross) - &#x60;CMFUTURE_MAIN&#x60;: COIN-M Futures → Spot - &#x60;CMFUTURE_MARGIN&#x60;: COIN-M Futures → Margin (cross) - &#x60;MARGIN_MAIN&#x60;: Margin (cross) → Spot - &#x60;MARGIN_UMFUTURE&#x60;: Margin (cross) → USDⓈ-M Futures - &#x60;MARGIN_CMFUTURE&#x60;: Margin (cross) → COIN-M Futures - &#x60;ISOLATEDMARGIN_MARGIN&#x60;: Isolated margin → Margin (cross) - &#x60;MARGIN_ISOLATEDMARGIN&#x60;: Margin (cross) → Isolated margin - &#x60;ISOLATEDMARGIN_ISOLATEDMARGIN&#x60;: Isolated margin → Isolated margin - &#x60;MAIN_FUNDING&#x60;: Spot → Funding - &#x60;FUNDING_MAIN&#x60;: Funding → Spot - &#x60;FUNDING_UMFUTURE&#x60;: Funding → USDⓈ-M Futures - &#x60;UMFUTURE_FUNDING&#x60;: USDⓈ-M Futures → Funding - &#x60;MARGIN_FUNDING&#x60;: Margin (cross) → Funding - &#x60;FUNDING_MARGIN&#x60;: Funding → Margin (cross) - &#x60;FUNDING_CMFUTURE&#x60;: Funding → COIN-M Futures - &#x60;CMFUTURE_FUNDING&#x60;: COIN-M Futures → Funding - &#x60;MAIN_OPTION&#x60;: Spot → Options - &#x60;OPTION_MAIN&#x60;: Options → Spot - &#x60;UMFUTURE_OPTION&#x60;: USDⓈ-M Futures → Options - &#x60;OPTION_UMFUTURE&#x60;: Options → USDⓈ-M Futures - &#x60;MARGIN_OPTION&#x60;: Margin (cross) → Options - &#x60;OPTION_MARGIN&#x60;: Options → Margin (cross) - &#x60;FUNDING_OPTION&#x60;: Funding → Options - &#x60;OPTION_FUNDING&#x60;: Options → Funding - &#x60;MAIN_PORTFOLIO_MARGIN&#x60;: Spot → Portfolio Margin - &#x60;PORTFOLIO_MARGIN_MAIN&#x60;: Portfolio Margin → Spot

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

