# MarketDataApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getListOfPlans**](MarketDataApi.md#getListOfPlans) | **GET** /sapi/v1/lending/auto-invest/plan/list | Get list of plans (USER_DATA) |
| [**getTargetAssetList**](MarketDataApi.md#getTargetAssetList) | **GET** /sapi/v1/lending/auto-invest/target-asset/list | Get target asset list(USER_DATA) |
| [**getTargetAssetRoiData**](MarketDataApi.md#getTargetAssetRoiData) | **GET** /sapi/v1/lending/auto-invest/target-asset/roi/list | Get target asset ROI data |
| [**queryAllSourceAssetAndTargetAsset**](MarketDataApi.md#queryAllSourceAssetAndTargetAsset) | **GET** /sapi/v1/lending/auto-invest/all/asset | Query all source asset and target asset(USER_DATA) |
| [**queryIndexDetails**](MarketDataApi.md#queryIndexDetails) | **GET** /sapi/v1/lending/auto-invest/index/info | Query Index Details(USER_DATA) |
| [**querySourceAssetList**](MarketDataApi.md#querySourceAssetList) | **GET** /sapi/v1/lending/auto-invest/source-asset/list | Query source asset list(USER_DATA) |


<a id="getListOfPlans"></a>
# **getListOfPlans**
> GetListOfPlansResponse getListOfPlans(planType, recvWindow)

Get list of plans (USER_DATA)

Query plan lists  * max one request every 3s per account  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.auto_invest.ApiClient;
import com.binance.connector.client.auto_invest.ApiException;
import com.binance.connector.client.auto_invest.Configuration;
import com.binance.connector.client.auto_invest.models.*;
import com.binance.connector.client.auto_invest.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String planType = "planType_example"; // String | Plan identifier
    Long recvWindow = 56L; // Long | no more than ```60000```
    try {
      GetListOfPlansResponse result = apiInstance.getListOfPlans(planType, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#getListOfPlans");
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
| **planType** | **String**| Plan identifier | |
| **recvWindow** | **Long**| no more than &#x60;&#x60;&#x60;60000&#x60;&#x60;&#x60; | [optional] |

### Return type

[**GetListOfPlansResponse**](GetListOfPlansResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get list of plans |  -  |

<a id="getTargetAssetList"></a>
# **getTargetAssetList**
> GetTargetAssetListResponse getTargetAssetList(targetAsset, size, current, recvWindow)

Get target asset list(USER_DATA)

Get target asset list  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.auto_invest.ApiClient;
import com.binance.connector.client.auto_invest.ApiException;
import com.binance.connector.client.auto_invest.Configuration;
import com.binance.connector.client.auto_invest.models.*;
import com.binance.connector.client.auto_invest.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    Long targetAsset = 56L; // Long | Plan identifier
    Long size = 56L; // Long | Default: 8, Max:100
    Long current = 56L; // Long | Current query page. Default: 1, start from 1
    Long recvWindow = 56L; // Long | no more than ```60000```
    try {
      GetTargetAssetListResponse result = apiInstance.getTargetAssetList(targetAsset, size, current, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#getTargetAssetList");
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
| **targetAsset** | **Long**| Plan identifier | [optional] |
| **size** | **Long**| Default: 8, Max:100 | [optional] |
| **current** | **Long**| Current query page. Default: 1, start from 1 | [optional] |
| **recvWindow** | **Long**| no more than &#x60;&#x60;&#x60;60000&#x60;&#x60;&#x60; | [optional] |

### Return type

[**GetTargetAssetListResponse**](GetTargetAssetListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get target asset list |  -  |

<a id="getTargetAssetRoiData"></a>
# **getTargetAssetRoiData**
> GetTargetAssetRoiDataResponse getTargetAssetRoiData(targetAsset, hisRoiType, recvWindow)

Get target asset ROI data

ROI return list for target asset  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.auto_invest.ApiClient;
import com.binance.connector.client.auto_invest.ApiException;
import com.binance.connector.client.auto_invest.Configuration;
import com.binance.connector.client.auto_invest.models.*;
import com.binance.connector.client.auto_invest.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String targetAsset = "targetAsset_example"; // String | e.g \"BTC\"
    String hisRoiType = "hisRoiType_example"; // String | FIVE_YEAR,THREE_YEAR,ONE_YEAR,SIX_MONTH,THREE_MONTH,SEVEN_DAY
    Long recvWindow = 56L; // Long | no more than ```60000```
    try {
      GetTargetAssetRoiDataResponse result = apiInstance.getTargetAssetRoiData(targetAsset, hisRoiType, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#getTargetAssetRoiData");
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
| **targetAsset** | **String**| e.g \&quot;BTC\&quot; | |
| **hisRoiType** | **String**| FIVE_YEAR,THREE_YEAR,ONE_YEAR,SIX_MONTH,THREE_MONTH,SEVEN_DAY | |
| **recvWindow** | **Long**| no more than &#x60;&#x60;&#x60;60000&#x60;&#x60;&#x60; | [optional] |

### Return type

[**GetTargetAssetRoiDataResponse**](GetTargetAssetRoiDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get target asset ROI data |  -  |

<a id="queryAllSourceAssetAndTargetAsset"></a>
# **queryAllSourceAssetAndTargetAsset**
> QueryAllSourceAssetAndTargetAssetResponse queryAllSourceAssetAndTargetAsset(recvWindow)

Query all source asset and target asset(USER_DATA)

Query all source assets and target assets  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.auto_invest.ApiClient;
import com.binance.connector.client.auto_invest.ApiException;
import com.binance.connector.client.auto_invest.Configuration;
import com.binance.connector.client.auto_invest.models.*;
import com.binance.connector.client.auto_invest.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    Long recvWindow = 56L; // Long | no more than ```60000```
    try {
      QueryAllSourceAssetAndTargetAssetResponse result = apiInstance.queryAllSourceAssetAndTargetAsset(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#queryAllSourceAssetAndTargetAsset");
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
| **recvWindow** | **Long**| no more than &#x60;&#x60;&#x60;60000&#x60;&#x60;&#x60; | [optional] |

### Return type

[**QueryAllSourceAssetAndTargetAssetResponse**](QueryAllSourceAssetAndTargetAssetResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | all source asset and target asset |  -  |

<a id="queryIndexDetails"></a>
# **queryIndexDetails**
> QueryIndexDetailsResponse queryIndexDetails(indexId, recvWindow)

Query Index Details(USER_DATA)

Query index details  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.auto_invest.ApiClient;
import com.binance.connector.client.auto_invest.ApiException;
import com.binance.connector.client.auto_invest.Configuration;
import com.binance.connector.client.auto_invest.models.*;
import com.binance.connector.client.auto_invest.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    Long indexId = 56L; // Long | 
    Long recvWindow = 56L; // Long | no more than ```60000```
    try {
      QueryIndexDetailsResponse result = apiInstance.queryIndexDetails(indexId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#queryIndexDetails");
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
| **indexId** | **Long**|  | |
| **recvWindow** | **Long**| no more than &#x60;&#x60;&#x60;60000&#x60;&#x60;&#x60; | [optional] |

### Return type

[**QueryIndexDetailsResponse**](QueryIndexDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Index Details |  -  |

<a id="querySourceAssetList"></a>
# **querySourceAssetList**
> QuerySourceAssetListResponse querySourceAssetList(usageType, targetAsset, indexId, flexibleAllowedToUse, sourceType, recvWindow)

Query source asset list(USER_DATA)

Query Source Asset to be used for investment  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.auto_invest.ApiClient;
import com.binance.connector.client.auto_invest.ApiException;
import com.binance.connector.client.auto_invest.Configuration;
import com.binance.connector.client.auto_invest.models.*;
import com.binance.connector.client.auto_invest.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String usageType = "usageType_example"; // String | \"RECURRING\", \"ONE_TIME\"
    Long targetAsset = 56L; // Long | Plan identifier
    Long indexId = 56L; // Long | 指数identifier,   value = 1
    Boolean flexibleAllowedToUse = true; // Boolean | 
    String sourceType = "sourceType_example"; // String | `MAIN_SITE` for Binance user,`TR` for Binance Turkey user
    Long recvWindow = 56L; // Long | no more than ```60000```
    try {
      QuerySourceAssetListResponse result = apiInstance.querySourceAssetList(usageType, targetAsset, indexId, flexibleAllowedToUse, sourceType, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#querySourceAssetList");
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
| **usageType** | **String**| \&quot;RECURRING\&quot;, \&quot;ONE_TIME\&quot; | |
| **targetAsset** | **Long**| Plan identifier | [optional] |
| **indexId** | **Long**| 指数identifier,   value &#x3D; 1 | [optional] |
| **flexibleAllowedToUse** | **Boolean**|  | [optional] |
| **sourceType** | **String**| &#x60;MAIN_SITE&#x60; for Binance user,&#x60;TR&#x60; for Binance Turkey user | [optional] |
| **recvWindow** | **Long**| no more than &#x60;&#x60;&#x60;60000&#x60;&#x60;&#x60; | [optional] |

### Return type

[**QuerySourceAssetListResponse**](QuerySourceAssetListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | source asset list |  -  |

