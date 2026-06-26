# TransferApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createInboundTransfer**](TransferApi.md#createInboundTransfer) | **POST** /sapi/v1/w3w/wallet/prediction/transfer/inbound | Create Inbound Transfer |
| [**createOutboundTransfer**](TransferApi.md#createOutboundTransfer) | **POST** /sapi/v1/w3w/wallet/prediction/transfer/outbound | Create Outbound Transfer |
| [**queryTransferList**](TransferApi.md#queryTransferList) | **GET** /sapi/v1/w3w/wallet/prediction/transfer/list | Query Transfer List |
| [**queryTransferStatus**](TransferApi.md#queryTransferStatus) | **GET** /sapi/v1/w3w/wallet/prediction/transfer/status | Query Transfer Status |


<a id="createInboundTransfer"></a>
# **createInboundTransfer**
> CreateInboundTransferResponse createInboundTransfer(createInboundTransferRequest)

Create Inbound Transfer

Transfer funds from the prediction wallet back to the user&#39;s CEX account (SPOT or FUNDING). Requires SAS authorization.  ⚠️ **SAS Authorization Required:** This endpoint enforces SAS (Self-Authorization Service) authorization. If SAS is not enabled for the wallet, the request will be rejected with &#x60;-31003 SAS authorization required&#x60;. Enable SAS for your wallet before calling this endpoint.  Weight(IP): 200  Security Type: TRADE

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.TransferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TransferApi apiInstance = new TransferApi(defaultClient);
    CreateInboundTransferRequest createInboundTransferRequest = new CreateInboundTransferRequest(); // CreateInboundTransferRequest | 
    try {
      CreateInboundTransferResponse result = apiInstance.createInboundTransfer(createInboundTransferRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransferApi#createInboundTransfer");
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
| **createInboundTransferRequest** | [**CreateInboundTransferRequest**](CreateInboundTransferRequest.md)|  | |

### Return type

[**CreateInboundTransferResponse**](CreateInboundTransferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Inbound Transfer |  -  |

<a id="createOutboundTransfer"></a>
# **createOutboundTransfer**
> CreateOutboundTransferResponse createOutboundTransfer(createOutboundTransferRequest)

Create Outbound Transfer

Transfer funds from the user&#39;s CEX account (SPOT or FUNDING) into the prediction wallet. Requires SAS authorization.  Weight(IP): 200  Security Type: TRADE

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.TransferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TransferApi apiInstance = new TransferApi(defaultClient);
    CreateOutboundTransferRequest createOutboundTransferRequest = new CreateOutboundTransferRequest(); // CreateOutboundTransferRequest | 
    try {
      CreateOutboundTransferResponse result = apiInstance.createOutboundTransfer(createOutboundTransferRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransferApi#createOutboundTransfer");
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
| **createOutboundTransferRequest** | [**CreateOutboundTransferRequest**](CreateOutboundTransferRequest.md)|  | |

### Return type

[**CreateOutboundTransferResponse**](CreateOutboundTransferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Outbound Transfer |  -  |

<a id="queryTransferList"></a>
# **queryTransferList**
> QueryTransferListResponse queryTransferList(walletAddress, startDate, endDate, tokenSymbol, direction, offset, limit, recvWindow)

Query Transfer List

Get the authenticated user&#39;s prediction wallet transfer history within a date range.  Weight(IP): 200  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.TransferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TransferApi apiInstance = new TransferApi(defaultClient);
    String walletAddress = "0x12e32db8817e292508c34111cbc4b23340df542c"; // String | User's prediction wallet address
    String startDate = "2026-05-01"; // String | Start date. Format: `yyyy-MM-dd`. Must be ≤ `endDate`
    String endDate = "2026-05-25"; // String | End date. Format: `yyyy-MM-dd`. Must be ≥ `startDate`
    String tokenSymbol = "USDT"; // String | Filter by token symbol (e.g. `USDT`)
    Direction direction = Direction.fromValue("INBOUND"); // Direction | Filter by direction. Enum: `INBOUND`, `OUTBOUND`
    Integer offset = 0; // Integer | Pagination offset. Default `0`
    Integer limit = 20; // Integer | Page size. Default `20`, range 1–100
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
    try {
      QueryTransferListResponse result = apiInstance.queryTransferList(walletAddress, startDate, endDate, tokenSymbol, direction, offset, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransferApi#queryTransferList");
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
| **walletAddress** | **String**| User&#39;s prediction wallet address | |
| **startDate** | **String**| Start date. Format: &#x60;yyyy-MM-dd&#x60;. Must be ≤ &#x60;endDate&#x60; | |
| **endDate** | **String**| End date. Format: &#x60;yyyy-MM-dd&#x60;. Must be ≥ &#x60;startDate&#x60; | |
| **tokenSymbol** | **String**| Filter by token symbol (e.g. &#x60;USDT&#x60;) | [optional] |
| **direction** | [**Direction**](.md)| Filter by direction. Enum: &#x60;INBOUND&#x60;, &#x60;OUTBOUND&#x60; | [optional] [enum: INBOUND, OUTBOUND] |
| **offset** | **Integer**| Pagination offset. Default &#x60;0&#x60; | [optional] |
| **limit** | **Integer**| Page size. Default &#x60;20&#x60;, range 1–100 | [optional] |
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

### Return type

[**QueryTransferListResponse**](QueryTransferListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Query Transfer List |  -  |

<a id="queryTransferStatus"></a>
# **queryTransferStatus**
> QueryTransferStatusResponse queryTransferStatus(transferId, recvWindow)

Query Transfer Status

Query the current status of a prediction wallet transfer by transfer ID.  **&#x60;status&#x60; values:** Terminal states are &#x60;COMPLETED&#x60; and &#x60;FAILED&#x60;. Intermediate states are &#x60;PROCESSING&#x60; and &#x60;PENDING&#x60;. **Do not** poll for &#x60;SUCCESS&#x60; — it is not a valid terminal state.  Weight(IP): 200  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.TransferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TransferApi apiInstance = new TransferApi(defaultClient);
    String transferId = "tf_20260525_out_001"; // String | Transfer ID returned from outbound/inbound transfer
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
    try {
      QueryTransferStatusResponse result = apiInstance.queryTransferStatus(transferId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransferApi#queryTransferStatus");
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
| **transferId** | **String**| Transfer ID returned from outbound/inbound transfer | |
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

### Return type

[**QueryTransferStatusResponse**](QueryTransferStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Query Transfer Status |  -  |

