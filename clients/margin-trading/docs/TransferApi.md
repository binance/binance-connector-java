# TransferApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCrossMarginTransferHistory**](TransferApi.md#getCrossMarginTransferHistory) | **GET** /sapi/v1/margin/transfer | Get Cross Margin Transfer History (USER_DATA) |
| [**queryMaxTransferOutAmount**](TransferApi.md#queryMaxTransferOutAmount) | **GET** /sapi/v1/margin/maxTransferable | Query Max Transfer-Out Amount (USER_DATA) |


<a id="getCrossMarginTransferHistory"></a>
# **getCrossMarginTransferHistory**
> GetCrossMarginTransferHistoryResponse getCrossMarginTransferHistory(asset, type, startTime, endTime, current, size, isolatedSymbol, recvWindow)

Get Cross Margin Transfer History (USER_DATA)

Get Cross Margin Transfer History  Weight(IP): 1  Security Type: USER_DATA  Notes: - Response in descending order - The max interval between &#x60;startTime&#x60; and &#x60;endTime&#x60; is 30 days. - Returns data for last 7 days by default

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TransferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TransferApi apiInstance = new TransferApi(defaultClient);
    String asset = "BNB"; // String | 
    OrderType type = OrderType.fromValue("ROLL_IN"); // OrderType | 
    Long startTime = 1623319461670L; // Long | 
    Long endTime = 1641782889000L; // Long | 
    Long current = 1L; // Long | 
    Long size = 10L; // Long | 
    String isolatedSymbol = "BNBUSDT"; // String | 
    Long recvWindow = 5000L; // Long | 
    try {
      GetCrossMarginTransferHistoryResponse result = apiInstance.getCrossMarginTransferHistory(asset, type, startTime, endTime, current, size, isolatedSymbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransferApi#getCrossMarginTransferHistory");
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
| **type** | [**OrderType**](.md)|  | [optional] [enum: ROLL_IN, ROLL_OUT] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**|  | [optional] |
| **size** | **Long**|  | [optional] |
| **isolatedSymbol** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetCrossMarginTransferHistoryResponse**](GetCrossMarginTransferHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Cross Margin Transfer History |  -  |

<a id="queryMaxTransferOutAmount"></a>
# **queryMaxTransferOutAmount**
> QueryMaxTransferOutAmountResponse queryMaxTransferOutAmount(asset, isolatedSymbol, recvWindow)

Query Max Transfer-Out Amount (USER_DATA)

Query Max Transfer-Out Amount  Weight(IP): 50  Security Type: USER_DATA  Notes: - If isolatedSymbol is not sent, crossed margin data will be sent.

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TransferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TransferApi apiInstance = new TransferApi(defaultClient);
    String asset = "BTC"; // String | 
    String isolatedSymbol = "BTCUSDT"; // String | 
    Long recvWindow = 5000L; // Long | 
    try {
      QueryMaxTransferOutAmountResponse result = apiInstance.queryMaxTransferOutAmount(asset, isolatedSymbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransferApi#queryMaxTransferOutAmount");
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
| **asset** | **String**|  | |
| **isolatedSymbol** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryMaxTransferOutAmountResponse**](QueryMaxTransferOutAmountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Max Transfer-Out Amount |  -  |

