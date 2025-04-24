# AccountApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adjustCrossMarginMaxLeverage**](AccountApi.md#adjustCrossMarginMaxLeverage) | **POST** /sapi/v1/margin/max-leverage | Adjust cross margin max leverage (USER_DATA) |
| [**disableIsolatedMarginAccount**](AccountApi.md#disableIsolatedMarginAccount) | **DELETE** /sapi/v1/margin/isolated/account | Disable Isolated Margin Account (TRADE) |
| [**enableIsolatedMarginAccount**](AccountApi.md#enableIsolatedMarginAccount) | **POST** /sapi/v1/margin/isolated/account | Enable Isolated Margin Account (TRADE) |
| [**getBnbBurnStatus**](AccountApi.md#getBnbBurnStatus) | **GET** /sapi/v1/bnbBurn | Get BNB Burn Status (USER_DATA) |
| [**getSummaryOfMarginAccount**](AccountApi.md#getSummaryOfMarginAccount) | **GET** /sapi/v1/margin/tradeCoeff | Get Summary of Margin account (USER_DATA) |
| [**queryCrossIsolatedMarginCapitalFlow**](AccountApi.md#queryCrossIsolatedMarginCapitalFlow) | **GET** /sapi/v1/margin/capital-flow | Query Cross Isolated Margin Capital Flow (USER_DATA) |
| [**queryCrossMarginAccountDetails**](AccountApi.md#queryCrossMarginAccountDetails) | **GET** /sapi/v1/margin/account | Query Cross Margin Account Details (USER_DATA) |
| [**queryCrossMarginFeeData**](AccountApi.md#queryCrossMarginFeeData) | **GET** /sapi/v1/margin/crossMarginData | Query Cross Margin Fee Data (USER_DATA) |
| [**queryEnabledIsolatedMarginAccountLimit**](AccountApi.md#queryEnabledIsolatedMarginAccountLimit) | **GET** /sapi/v1/margin/isolated/accountLimit | Query Enabled Isolated Margin Account Limit (USER_DATA) |
| [**queryIsolatedMarginAccountInfo**](AccountApi.md#queryIsolatedMarginAccountInfo) | **GET** /sapi/v1/margin/isolated/account | Query Isolated Margin Account Info (USER_DATA) |
| [**queryIsolatedMarginFeeData**](AccountApi.md#queryIsolatedMarginFeeData) | **GET** /sapi/v1/margin/isolatedMarginData | Query Isolated Margin Fee Data (USER_DATA) |


<a id="adjustCrossMarginMaxLeverage"></a>
# **adjustCrossMarginMaxLeverage**
> AdjustCrossMarginMaxLeverageResponse adjustCrossMarginMaxLeverage(adjustCrossMarginMaxLeverageRequest)

Adjust cross margin max leverage (USER_DATA)

Adjust cross margin max leverage  * The margin level need higher than the initial risk ratio of adjusted leverage, the initial risk ratio of 3x is 1.5 , the initial risk ratio of 5x is 1.25;  The detail conditions on how to switch between Cross Margin Classic and Cross Margin Pro can refer to [the FAQ](https://www.binance.com/en/support/faq/how-to-activate-the-cross-margin-pro-mode-on-binance-e27786da05e743a694b8c625b3bc475d).  Weight: 3000

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    AdjustCrossMarginMaxLeverageRequest adjustCrossMarginMaxLeverageRequest = new AdjustCrossMarginMaxLeverageRequest(); // AdjustCrossMarginMaxLeverageRequest | 
    try {
      AdjustCrossMarginMaxLeverageResponse result = apiInstance.adjustCrossMarginMaxLeverage(adjustCrossMarginMaxLeverageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#adjustCrossMarginMaxLeverage");
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
| **adjustCrossMarginMaxLeverageRequest** | [**AdjustCrossMarginMaxLeverageRequest**](AdjustCrossMarginMaxLeverageRequest.md)|  | |

### Return type

[**AdjustCrossMarginMaxLeverageResponse**](AdjustCrossMarginMaxLeverageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Adjust cross margin max leverage |  -  |

<a id="disableIsolatedMarginAccount"></a>
# **disableIsolatedMarginAccount**
> DisableIsolatedMarginAccountResponse disableIsolatedMarginAccount(symbol, recvWindow)

Disable Isolated Margin Account (TRADE)

Disable isolated margin account for a specific symbol. Each trading pair can only be deactivated once every 24 hours.  Weight: 300(UID)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long recvWindow = 56L; // Long | No more than 60000
    try {
      DisableIsolatedMarginAccountResponse result = apiInstance.disableIsolatedMarginAccount(symbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#disableIsolatedMarginAccount");
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
| **recvWindow** | **Long**| No more than 60000 | [optional] |

### Return type

[**DisableIsolatedMarginAccountResponse**](DisableIsolatedMarginAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Disable Isolated Margin Account |  -  |

<a id="enableIsolatedMarginAccount"></a>
# **enableIsolatedMarginAccount**
> EnableIsolatedMarginAccountResponse enableIsolatedMarginAccount(enableIsolatedMarginAccountRequest)

Enable Isolated Margin Account (TRADE)

Enable isolated margin account for a specific symbol(Only supports activation of previously disabled accounts).  Weight: 300(UID)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    EnableIsolatedMarginAccountRequest enableIsolatedMarginAccountRequest = new EnableIsolatedMarginAccountRequest(); // EnableIsolatedMarginAccountRequest | 
    try {
      EnableIsolatedMarginAccountResponse result = apiInstance.enableIsolatedMarginAccount(enableIsolatedMarginAccountRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#enableIsolatedMarginAccount");
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
| **enableIsolatedMarginAccountRequest** | [**EnableIsolatedMarginAccountRequest**](EnableIsolatedMarginAccountRequest.md)|  | |

### Return type

[**EnableIsolatedMarginAccountResponse**](EnableIsolatedMarginAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Enable Isolated Margin Account |  -  |

<a id="getBnbBurnStatus"></a>
# **getBnbBurnStatus**
> GetBnbBurnStatusResponse getBnbBurnStatus(recvWindow)

Get BNB Burn Status (USER_DATA)

Get BNB Burn Status  Weight: 1(IP)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long recvWindow = 56L; // Long | No more than 60000
    try {
      GetBnbBurnStatusResponse result = apiInstance.getBnbBurnStatus(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getBnbBurnStatus");
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
| **recvWindow** | **Long**| No more than 60000 | [optional] |

### Return type

[**GetBnbBurnStatusResponse**](GetBnbBurnStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get BNB Burn Status |  -  |

<a id="getSummaryOfMarginAccount"></a>
# **getSummaryOfMarginAccount**
> GetSummaryOfMarginAccountResponse getSummaryOfMarginAccount(recvWindow)

Get Summary of Margin account (USER_DATA)

Get personal margin level information  Weight: 10(IP)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long recvWindow = 56L; // Long | No more than 60000
    try {
      GetSummaryOfMarginAccountResponse result = apiInstance.getSummaryOfMarginAccount(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getSummaryOfMarginAccount");
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
| **recvWindow** | **Long**| No more than 60000 | [optional] |

### Return type

[**GetSummaryOfMarginAccountResponse**](GetSummaryOfMarginAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Summary of Margin account |  -  |

<a id="queryCrossIsolatedMarginCapitalFlow"></a>
# **queryCrossIsolatedMarginCapitalFlow**
> QueryCrossIsolatedMarginCapitalFlowResponse queryCrossIsolatedMarginCapitalFlow(asset, symbol, type, startTime, endTime, fromId, limit, recvWindow)

Query Cross Isolated Margin Capital Flow (USER_DATA)

Query Cross Isolated Margin Capital Flow  Weight: 100(IP)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String asset = "asset_example"; // String | 
    String symbol = "symbol_example"; // String | isolated margin pair
    String type = "type_example"; // String | Transfer Type: ROLL_IN, ROLL_OUT
    Long startTime = 56L; // Long | 只支持查询最近90天的数据
    Long endTime = 56L; // Long | 
    Long fromId = 56L; // Long | 如设置fromId, 将返回id > fromId的数据。否则将返回最新数据
    Long limit = 56L; // Long | Default Value: 500; Max Value: 1000
    Long recvWindow = 56L; // Long | No more than 60000
    try {
      QueryCrossIsolatedMarginCapitalFlowResponse result = apiInstance.queryCrossIsolatedMarginCapitalFlow(asset, symbol, type, startTime, endTime, fromId, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#queryCrossIsolatedMarginCapitalFlow");
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
| **symbol** | **String**| isolated margin pair | [optional] |
| **type** | **String**| Transfer Type: ROLL_IN, ROLL_OUT | [optional] |
| **startTime** | **Long**| 只支持查询最近90天的数据 | [optional] |
| **endTime** | **Long**|  | [optional] |
| **fromId** | **Long**| 如设置fromId, 将返回id &gt; fromId的数据。否则将返回最新数据 | [optional] |
| **limit** | **Long**| Default Value: 500; Max Value: 1000 | [optional] |
| **recvWindow** | **Long**| No more than 60000 | [optional] |

### Return type

[**QueryCrossIsolatedMarginCapitalFlowResponse**](QueryCrossIsolatedMarginCapitalFlowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cross Isolated Margin Capital Flow |  -  |

<a id="queryCrossMarginAccountDetails"></a>
# **queryCrossMarginAccountDetails**
> QueryCrossMarginAccountDetailsResponse queryCrossMarginAccountDetails(recvWindow)

Query Cross Margin Account Details (USER_DATA)

Query Cross Margin Account Details  Weight: 10(IP)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long recvWindow = 56L; // Long | No more than 60000
    try {
      QueryCrossMarginAccountDetailsResponse result = apiInstance.queryCrossMarginAccountDetails(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#queryCrossMarginAccountDetails");
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
| **recvWindow** | **Long**| No more than 60000 | [optional] |

### Return type

[**QueryCrossMarginAccountDetailsResponse**](QueryCrossMarginAccountDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cross Margin Account Details |  -  |

<a id="queryCrossMarginFeeData"></a>
# **queryCrossMarginFeeData**
> QueryCrossMarginFeeDataResponse queryCrossMarginFeeData(vipLevel, coin, recvWindow)

Query Cross Margin Fee Data (USER_DATA)

Get cross margin fee data collection with any vip level or user&#39;s current specific data as https://www.binance.com/en/margin-fee  Weight: 1 when coin is specified;(IP)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long vipLevel = 56L; // Long | User's current specific margin data will be returned if vipLevel is omitted
    String coin = "coin_example"; // String | 
    Long recvWindow = 56L; // Long | No more than 60000
    try {
      QueryCrossMarginFeeDataResponse result = apiInstance.queryCrossMarginFeeData(vipLevel, coin, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#queryCrossMarginFeeData");
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
| **vipLevel** | **Long**| User&#39;s current specific margin data will be returned if vipLevel is omitted | [optional] |
| **coin** | **String**|  | [optional] |
| **recvWindow** | **Long**| No more than 60000 | [optional] |

### Return type

[**QueryCrossMarginFeeDataResponse**](QueryCrossMarginFeeDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cross Margin Fee Data |  -  |

<a id="queryEnabledIsolatedMarginAccountLimit"></a>
# **queryEnabledIsolatedMarginAccountLimit**
> QueryEnabledIsolatedMarginAccountLimitResponse queryEnabledIsolatedMarginAccountLimit(recvWindow)

Query Enabled Isolated Margin Account Limit (USER_DATA)

Query enabled isolated margin account limit.  Weight: 1(IP)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long recvWindow = 56L; // Long | No more than 60000
    try {
      QueryEnabledIsolatedMarginAccountLimitResponse result = apiInstance.queryEnabledIsolatedMarginAccountLimit(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#queryEnabledIsolatedMarginAccountLimit");
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
| **recvWindow** | **Long**| No more than 60000 | [optional] |

### Return type

[**QueryEnabledIsolatedMarginAccountLimitResponse**](QueryEnabledIsolatedMarginAccountLimitResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Enabled Isolated Margin Account Limit |  -  |

<a id="queryIsolatedMarginAccountInfo"></a>
# **queryIsolatedMarginAccountInfo**
> QueryIsolatedMarginAccountInfoResponse queryIsolatedMarginAccountInfo(symbols, recvWindow)

Query Isolated Margin Account Info (USER_DATA)

Query Isolated Margin Account Info  * If \&quot;symbols\&quot; is not sent, all isolated assets will be returned. * If \&quot;symbols\&quot; is sent, only the isolated assets of the sent symbols will be returned.  Weight: 10(IP)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String symbols = "symbols_example"; // String | Max 5 symbols can be sent; separated by \",\". e.g. \"BTCUSDT,BNBUSDT,ADAUSDT\"
    Long recvWindow = 56L; // Long | No more than 60000
    try {
      QueryIsolatedMarginAccountInfoResponse result = apiInstance.queryIsolatedMarginAccountInfo(symbols, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#queryIsolatedMarginAccountInfo");
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
| **symbols** | **String**| Max 5 symbols can be sent; separated by \&quot;,\&quot;. e.g. \&quot;BTCUSDT,BNBUSDT,ADAUSDT\&quot; | [optional] |
| **recvWindow** | **Long**| No more than 60000 | [optional] |

### Return type

[**QueryIsolatedMarginAccountInfoResponse**](QueryIsolatedMarginAccountInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Isolated Margin Account Info |  -  |

<a id="queryIsolatedMarginFeeData"></a>
# **queryIsolatedMarginFeeData**
> QueryIsolatedMarginFeeDataResponse queryIsolatedMarginFeeData(vipLevel, symbol, recvWindow)

Query Isolated Margin Fee Data (USER_DATA)

Get isolated margin fee data collection with any vip level or user&#39;s current specific data as https://www.binance.com/en/margin-fee  Weight: 1 when a single is specified;(IP)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long vipLevel = 56L; // Long | User's current specific margin data will be returned if vipLevel is omitted
    String symbol = "symbol_example"; // String | isolated margin pair
    Long recvWindow = 56L; // Long | No more than 60000
    try {
      QueryIsolatedMarginFeeDataResponse result = apiInstance.queryIsolatedMarginFeeData(vipLevel, symbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#queryIsolatedMarginFeeData");
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
| **vipLevel** | **Long**| User&#39;s current specific margin data will be returned if vipLevel is omitted | [optional] |
| **symbol** | **String**| isolated margin pair | [optional] |
| **recvWindow** | **Long**| No more than 60000 | [optional] |

### Return type

[**QueryIsolatedMarginFeeDataResponse**](QueryIsolatedMarginFeeDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Isolated Margin Fee Data |  -  |

