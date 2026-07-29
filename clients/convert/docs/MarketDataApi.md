# MarketDataApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listAllConvertPairs**](MarketDataApi.md#listAllConvertPairs) | **GET** /sapi/v1/convert/exchangeInfo | List All Convert Pairs |
| [**queryOrderQuantityPrecisionPerAsset**](MarketDataApi.md#queryOrderQuantityPrecisionPerAsset) | **GET** /sapi/v1/convert/assetInfo | Query order quantity precision per asset (USER_DATA) |


<a id="listAllConvertPairs"></a>
# **listAllConvertPairs**
> ListAllConvertPairsResponse listAllConvertPairs(fromAsset, toAsset)

List All Convert Pairs

Query for all convertible token pairs and the tokens’ respective upper/lower limits  Weight(IP): 3000  Notes: - User needs to supply either or both input parameters. - If only one of &#x60;fromAsset&#x60; and &#x60;toAsset&#x60; is provided, only partial token pairs are returned.

### Example
```java
// Import classes:
import com.binance.connector.client.convert.ApiClient;
import com.binance.connector.client.convert.ApiException;
import com.binance.connector.client.convert.Configuration;
import com.binance.connector.client.convert.models.*;
import com.binance.connector.client.convert.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String fromAsset = "BTC"; // String | User spends coin
    String toAsset = "USDT"; // String | User receives coin
    try {
      ListAllConvertPairsResponse result = apiInstance.listAllConvertPairs(fromAsset, toAsset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#listAllConvertPairs");
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
| **fromAsset** | **String**| User spends coin | [optional] |
| **toAsset** | **String**| User receives coin | [optional] |

### Return type

[**ListAllConvertPairsResponse**](ListAllConvertPairsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List All Convert Pairs |  -  |

<a id="queryOrderQuantityPrecisionPerAsset"></a>
# **queryOrderQuantityPrecisionPerAsset**
> QueryOrderQuantityPrecisionPerAssetResponse queryOrderQuantityPrecisionPerAsset(recvWindow)

Query order quantity precision per asset (USER_DATA)

Query for supported asset’s precision information  Weight(IP): 100  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.convert.ApiClient;
import com.binance.connector.client.convert.ApiException;
import com.binance.connector.client.convert.Configuration;
import com.binance.connector.client.convert.models.*;
import com.binance.connector.client.convert.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
    try {
      QueryOrderQuantityPrecisionPerAssetResponse result = apiInstance.queryOrderQuantityPrecisionPerAsset(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#queryOrderQuantityPrecisionPerAsset");
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
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

### Return type

[**QueryOrderQuantityPrecisionPerAssetResponse**](QueryOrderQuantityPrecisionPerAssetResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | order quantity precision per asset |  -  |

