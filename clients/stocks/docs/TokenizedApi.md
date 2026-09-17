# TokenizedApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tokenizedConvertHistory**](TokenizedApi.md#tokenizedConvertHistory) | **GET** /sapi/v1/equity/tokenized/history | Tokenized Convert History (USER_DATA) |
| [**tokenizedConvertStatus**](TokenizedApi.md#tokenizedConvertStatus) | **GET** /sapi/v1/equity/tokenized/convert-status | Tokenized Convert Status (USER_DATA) |
| [**tokenizedMint**](TokenizedApi.md#tokenizedMint) | **POST** /sapi/v1/equity/tokenized/mint | Tokenized Mint (TRADE) |
| [**tokenizedRedeem**](TokenizedApi.md#tokenizedRedeem) | **POST** /sapi/v1/equity/tokenized/redeem | Tokenized Redeem (TRADE) |


<a id="tokenizedConvertHistory"></a>
# **tokenizedConvertHistory**
> TokenizedConvertHistoryResponse tokenizedConvertHistory(startTime, endTime, lastId, size, recvWindow)

Tokenized Convert History (USER_DATA)

Paged history of mint / redeem conversions for the caller. Cursor-style pagination — supply the &#x60;nextLastId&#x60; from the previous page&#39;s response to fetch the next page.  Weight: 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.stocks.ApiClient;
import com.binance.connector.client.stocks.ApiException;
import com.binance.connector.client.stocks.Configuration;
import com.binance.connector.client.stocks.models.*;
import com.binance.connector.client.stocks.rest.api.TokenizedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TokenizedApi apiInstance = new TokenizedApi(defaultClient);
    Long startTime = 1735800000000L; // Long | Start time (ms epoch).
    Long endTime = 1735900000000L; // Long | End time (ms epoch).
    Long lastId = 10019L; // Long | Last record id from the previous page. Omit (or leave unset) to fetch the first page.
    Integer size = 20; // Integer | Page size. Default `20`, max `100`.
    Long recvWindow = 5000L; // Long | The value cannot be greater than `60000`.
    try {
      TokenizedConvertHistoryResponse result = apiInstance.tokenizedConvertHistory(startTime, endTime, lastId, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenizedApi#tokenizedConvertHistory");
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
| **startTime** | **Long**| Start time (ms epoch). | [optional] |
| **endTime** | **Long**| End time (ms epoch). | [optional] |
| **lastId** | **Long**| Last record id from the previous page. Omit (or leave unset) to fetch the first page. | [optional] |
| **size** | **Integer**| Page size. Default &#x60;20&#x60;, max &#x60;100&#x60;. | [optional] |
| **recvWindow** | **Long**| The value cannot be greater than &#x60;60000&#x60;. | [optional] |

### Return type

[**TokenizedConvertHistoryResponse**](TokenizedConvertHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tokenized Convert History |  -  |

<a id="tokenizedConvertStatus"></a>
# **tokenizedConvertStatus**
> TokenizedConvertStatusResponse tokenizedConvertStatus(issuerRequestId, convertType, recvWindow)

Tokenized Convert Status (USER_DATA)

Query the current status of a single mint / redeem request by its &#x60;issuerRequestId&#x60;. Returns an empty object when no record matches (caller&#39;s ID scope only).  Weight: 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.stocks.ApiClient;
import com.binance.connector.client.stocks.ApiException;
import com.binance.connector.client.stocks.Configuration;
import com.binance.connector.client.stocks.models.*;
import com.binance.connector.client.stocks.rest.api.TokenizedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TokenizedApi apiInstance = new TokenizedApi(defaultClient);
    String issuerRequestId = "mint-20260505-8f3b9e1a2d3c4b5a"; // String | Convert request id returned by `/tokenized/mint` or `/redeem`.
    ConvertType convertType = ConvertType.fromValue("MINT"); // ConvertType | `MINT` or `REDEEM`.
    Long recvWindow = 5000L; // Long | The value cannot be greater than `60000`.
    try {
      TokenizedConvertStatusResponse result = apiInstance.tokenizedConvertStatus(issuerRequestId, convertType, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenizedApi#tokenizedConvertStatus");
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
| **issuerRequestId** | **String**| Convert request id returned by &#x60;/tokenized/mint&#x60; or &#x60;/redeem&#x60;. | |
| **convertType** | [**ConvertType**](.md)| &#x60;MINT&#x60; or &#x60;REDEEM&#x60;. | [enum: MINT, REDEEM] |
| **recvWindow** | **Long**| The value cannot be greater than &#x60;60000&#x60;. | [optional] |

### Return type

[**TokenizedConvertStatusResponse**](TokenizedConvertStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tokenized Convert Status |  -  |

<a id="tokenizedMint"></a>
# **tokenizedMint**
> TokenizedMintResponse tokenizedMint(underlyingAsset, underlyingAssetAmount, clientOrderId, recvWindow)

Tokenized Mint (TRADE)

Mint a tokenized asset from an underlying equity holding. The caller&#39;s underlying equity (e.g. &#x60;AAPL&#x60;) is burned (or locked), and the corresponding tokenized asset (e.g. &#x60;AAPLB&#x60;) is credited. The tokenized asset is resolved server-side from &#x60;underlyingAsset&#x60;; callers only provide the underlying ticker and quantity. Mint is asynchronous: the endpoint returns an &#x60;issuerRequestId&#x60; immediately with a transient status; poll &#x60;/tokenized/convert-status&#x60; to observe the terminal state, or inspect &#x60;/tokenized/history&#x60; for the full record. Rate limit: 50 requests / min (UID).  Weight: 1  Security Type: TRADE

### Example
```java
// Import classes:
import com.binance.connector.client.stocks.ApiClient;
import com.binance.connector.client.stocks.ApiException;
import com.binance.connector.client.stocks.Configuration;
import com.binance.connector.client.stocks.models.*;
import com.binance.connector.client.stocks.rest.api.TokenizedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TokenizedApi apiInstance = new TokenizedApi(defaultClient);
    String underlyingAsset = "AAPL"; // String | Underlying US-equity ticker, e.g. `AAPL`, `TSLA`. Resolved against the active-symbol list; unknown tickers return `-26004`. The target tokenized asset is looked up from this field via `/market/tokenized-assets`.
    String underlyingAssetAmount = "1"; // String | Quantity of the underlying asset to mint from. Must be > 0.
    String clientOrderId = "mint-client-id-32chars-0000000001"; // String | Client order id for idempotency. Format `^[a-zA-Z0-9-_]{32,36}$`. Auto-generated when omitted.
    Long recvWindow = 5000L; // Long | The value cannot be greater than `60000`.
    try {
      TokenizedMintResponse result = apiInstance.tokenizedMint(underlyingAsset, underlyingAssetAmount, clientOrderId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenizedApi#tokenizedMint");
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
| **underlyingAsset** | **String**| Underlying US-equity ticker, e.g. &#x60;AAPL&#x60;, &#x60;TSLA&#x60;. Resolved against the active-symbol list; unknown tickers return &#x60;-26004&#x60;. The target tokenized asset is looked up from this field via &#x60;/market/tokenized-assets&#x60;. | |
| **underlyingAssetAmount** | **String**| Quantity of the underlying asset to mint from. Must be &gt; 0. | |
| **clientOrderId** | **String**| Client order id for idempotency. Format &#x60;^[a-zA-Z0-9-_]{32,36}$&#x60;. Auto-generated when omitted. | [optional] |
| **recvWindow** | **Long**| The value cannot be greater than &#x60;60000&#x60;. | [optional] |

### Return type

[**TokenizedMintResponse**](TokenizedMintResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tokenized Mint |  -  |

<a id="tokenizedRedeem"></a>
# **tokenizedRedeem**
> TokenizedRedeemResponse tokenizedRedeem(tokenizedAsset, tokenizedAssetAmount, clientOrderId, recvWindow)

Tokenized Redeem (TRADE)

Redeem a tokenized asset back into the underlying equity. The caller&#39;s tokenized asset (e.g. &#x60;AAPLB&#x60;) is burned, and the corresponding underlying equity (e.g. &#x60;AAPL&#x60;) is released. The underlying asset is resolved server-side from &#x60;tokenizedAsset&#x60;; callers only provide the tokenized asset and quantity. Redeem is asynchronous: the endpoint returns an &#x60;issuerRequestId&#x60; immediately with a transient status; poll &#x60;/tokenized/convert-status&#x60; to observe the terminal state, or inspect &#x60;/tokenized/history&#x60; for the full record. Rate limit: 200 requests / min (UID).  Weight: 1  Security Type: TRADE

### Example
```java
// Import classes:
import com.binance.connector.client.stocks.ApiClient;
import com.binance.connector.client.stocks.ApiException;
import com.binance.connector.client.stocks.Configuration;
import com.binance.connector.client.stocks.models.*;
import com.binance.connector.client.stocks.rest.api.TokenizedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TokenizedApi apiInstance = new TokenizedApi(defaultClient);
    String tokenizedAsset = "AAPLB"; // String | Tokenized asset to redeem, e.g. `AAPLB`. Not a US-equity ticker — this is the on-chain tokenized asset identifier. Unknown asset returns `-1102` (the message currently says the parameter was empty/malformed, but it was in fact sent — it is simply unknown). The target underlying ticker is looked up from this field via `/market/tokenized-assets`.
    String tokenizedAssetAmount = "1"; // String | Quantity of the tokenized asset to redeem. Must be > 0.
    String clientOrderId = "redeem-client-id-32chars-000000001"; // String | Client order id for idempotency. Format `^[a-zA-Z0-9-_]{32,36}$`. Auto-generated when omitted.
    Long recvWindow = 5000L; // Long | The value cannot be greater than `60000`.
    try {
      TokenizedRedeemResponse result = apiInstance.tokenizedRedeem(tokenizedAsset, tokenizedAssetAmount, clientOrderId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenizedApi#tokenizedRedeem");
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
| **tokenizedAsset** | **String**| Tokenized asset to redeem, e.g. &#x60;AAPLB&#x60;. Not a US-equity ticker — this is the on-chain tokenized asset identifier. Unknown asset returns &#x60;-1102&#x60; (the message currently says the parameter was empty/malformed, but it was in fact sent — it is simply unknown). The target underlying ticker is looked up from this field via &#x60;/market/tokenized-assets&#x60;. | |
| **tokenizedAssetAmount** | **String**| Quantity of the tokenized asset to redeem. Must be &gt; 0. | |
| **clientOrderId** | **String**| Client order id for idempotency. Format &#x60;^[a-zA-Z0-9-_]{32,36}$&#x60;. Auto-generated when omitted. | [optional] |
| **recvWindow** | **Long**| The value cannot be greater than &#x60;60000&#x60;. | [optional] |

### Return type

[**TokenizedRedeemResponse**](TokenizedRedeemResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tokenized Redeem |  -  |

