# TradeApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**changePlanStatus**](TradeApi.md#changePlanStatus) | **POST** /sapi/v1/lending/auto-invest/plan/edit-status | Change Plan Status(TRADE) |
| [**indexLinkedPlanRebalanceDetails**](TradeApi.md#indexLinkedPlanRebalanceDetails) | **GET** /sapi/v1/lending/auto-invest/rebalance/history | Index Linked Plan Rebalance Details(USER_DATA) |
| [**indexLinkedPlanRedemption**](TradeApi.md#indexLinkedPlanRedemption) | **POST** /sapi/v1/lending/auto-invest/redeem | Index Linked Plan Redemption(TRADE) |
| [**indexLinkedPlanRedemptionTrade**](TradeApi.md#indexLinkedPlanRedemptionTrade) | **GET** /sapi/v1/lending/auto-invest/redeem/history | Index Linked Plan Redemption(USER_DATA) |
| [**investmentPlanAdjustment**](TradeApi.md#investmentPlanAdjustment) | **POST** /sapi/v1/lending/auto-invest/plan/edit | Investment plan adjustment(TRADE) |
| [**investmentPlanCreation**](TradeApi.md#investmentPlanCreation) | **POST** /sapi/v1/lending/auto-invest/plan/add | Investment plan creation(USER_DATA) |
| [**oneTimeTransaction**](TradeApi.md#oneTimeTransaction) | **POST** /sapi/v1/lending/auto-invest/one-off | One Time Transaction(TRADE) |
| [**queryHoldingDetailsOfThePlan**](TradeApi.md#queryHoldingDetailsOfThePlan) | **GET** /sapi/v1/lending/auto-invest/plan/id | Query holding details of the plan(USER_DATA) |
| [**queryIndexLinkedPlanPositionDetails**](TradeApi.md#queryIndexLinkedPlanPositionDetails) | **GET** /sapi/v1/lending/auto-invest/index/user-summary | Query Index Linked Plan Position Details(USER_DATA) |
| [**queryOneTimeTransactionStatus**](TradeApi.md#queryOneTimeTransactionStatus) | **GET** /sapi/v1/lending/auto-invest/one-off/status | Query One-Time Transaction Status(USER_DATA) |
| [**querySubscriptionTransactionHistory**](TradeApi.md#querySubscriptionTransactionHistory) | **GET** /sapi/v1/lending/auto-invest/history/list | Query subscription transaction history(USER_DATA) |


<a id="changePlanStatus"></a>
# **changePlanStatus**
> ChangePlanStatusResponse changePlanStatus(changePlanStatusRequest)

Change Plan Status(TRADE)

Change Plan Status  * max one request every 3s per account  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.auto_invest.ApiClient;
import com.binance.connector.client.auto_invest.ApiException;
import com.binance.connector.client.auto_invest.Configuration;
import com.binance.connector.client.auto_invest.models.*;
import com.binance.connector.client.auto_invest.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    ChangePlanStatusRequest changePlanStatusRequest = new ChangePlanStatusRequest(); // ChangePlanStatusRequest | 
    try {
      ChangePlanStatusResponse result = apiInstance.changePlanStatus(changePlanStatusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#changePlanStatus");
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
| **changePlanStatusRequest** | [**ChangePlanStatusRequest**](ChangePlanStatusRequest.md)|  | |

### Return type

[**ChangePlanStatusResponse**](ChangePlanStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Plan Status |  -  |

<a id="indexLinkedPlanRebalanceDetails"></a>
# **indexLinkedPlanRebalanceDetails**
> IndexLinkedPlanRebalanceDetailsResponse indexLinkedPlanRebalanceDetails(startTime, endTime, current, size, recvWindow)

Index Linked Plan Rebalance Details(USER_DATA)

Get the history of Index Linked Plan Redemption transactions  * Max 30 day difference between &#x60;startTime&#x60; and &#x60;endTime&#x60; * If no &#x60;startTime&#x60; and &#x60;endTime&#x60;, default to show past 30 day records  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.auto_invest.ApiClient;
import com.binance.connector.client.auto_invest.ApiException;
import com.binance.connector.client.auto_invest.Configuration;
import com.binance.connector.client.auto_invest.models.*;
import com.binance.connector.client.auto_invest.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Current query page. Default: 1, start from 1
    Long size = 56L; // Long | Default: 8, Max:100
    Long recvWindow = 56L; // Long | no more than ```60000```
    try {
      IndexLinkedPlanRebalanceDetailsResponse result = apiInstance.indexLinkedPlanRebalanceDetails(startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#indexLinkedPlanRebalanceDetails");
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
| **current** | **Long**| Current query page. Default: 1, start from 1 | [optional] |
| **size** | **Long**| Default: 8, Max:100 | [optional] |
| **recvWindow** | **Long**| no more than &#x60;&#x60;&#x60;60000&#x60;&#x60;&#x60; | [optional] |

### Return type

[**IndexLinkedPlanRebalanceDetailsResponse**](IndexLinkedPlanRebalanceDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Index Linked Plan Rebalance Details |  -  |

<a id="indexLinkedPlanRedemption"></a>
# **indexLinkedPlanRedemption**
> IndexLinkedPlanRedemptionResponse indexLinkedPlanRedemption(indexLinkedPlanRedemptionRequest)

Index Linked Plan Redemption(TRADE)

To redeem index-Linked plan holdings  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.auto_invest.ApiClient;
import com.binance.connector.client.auto_invest.ApiException;
import com.binance.connector.client.auto_invest.Configuration;
import com.binance.connector.client.auto_invest.models.*;
import com.binance.connector.client.auto_invest.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    IndexLinkedPlanRedemptionRequest indexLinkedPlanRedemptionRequest = new IndexLinkedPlanRedemptionRequest(); // IndexLinkedPlanRedemptionRequest | 
    try {
      IndexLinkedPlanRedemptionResponse result = apiInstance.indexLinkedPlanRedemption(indexLinkedPlanRedemptionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#indexLinkedPlanRedemption");
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
| **indexLinkedPlanRedemptionRequest** | [**IndexLinkedPlanRedemptionRequest**](IndexLinkedPlanRedemptionRequest.md)|  | |

### Return type

[**IndexLinkedPlanRedemptionResponse**](IndexLinkedPlanRedemptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Index Linked Plan Redemption |  -  |

<a id="indexLinkedPlanRedemptionTrade"></a>
# **indexLinkedPlanRedemptionTrade**
> IndexLinkedPlanRedemptionTradeResponse indexLinkedPlanRedemptionTrade(requestId, startTime, endTime, current, asset, size, recvWindow)

Index Linked Plan Redemption(USER_DATA)

Get the history of Index Linked Plan Redemption transactions  * Max 30 day difference between &#x60;startTime&#x60; and &#x60;endTime&#x60; * If no &#x60;startTime&#x60; and &#x60;endTime&#x60;, default to show past 30 day records  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.auto_invest.ApiClient;
import com.binance.connector.client.auto_invest.ApiException;
import com.binance.connector.client.auto_invest.Configuration;
import com.binance.connector.client.auto_invest.models.*;
import com.binance.connector.client.auto_invest.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    Long requestId = 56L; // Long | request id
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Current query page. Default: 1, start from 1
    String asset = "asset_example"; // String | 
    Long size = 56L; // Long | Default: 8, Max:100
    Long recvWindow = 56L; // Long | no more than ```60000```
    try {
      IndexLinkedPlanRedemptionTradeResponse result = apiInstance.indexLinkedPlanRedemptionTrade(requestId, startTime, endTime, current, asset, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#indexLinkedPlanRedemptionTrade");
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
| **requestId** | **Long**| request id | |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Current query page. Default: 1, start from 1 | [optional] |
| **asset** | **String**|  | [optional] |
| **size** | **Long**| Default: 8, Max:100 | [optional] |
| **recvWindow** | **Long**| no more than &#x60;&#x60;&#x60;60000&#x60;&#x60;&#x60; | [optional] |

### Return type

[**IndexLinkedPlanRedemptionTradeResponse**](IndexLinkedPlanRedemptionTradeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Index Linked Plan Redemption |  -  |

<a id="investmentPlanAdjustment"></a>
# **investmentPlanAdjustment**
> InvestmentPlanAdjustmentResponse investmentPlanAdjustment(investmentPlanAdjustmentRequest)

Investment plan adjustment(TRADE)

Query Source Asset to be used for investment  * max one request every 3s per account  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.auto_invest.ApiClient;
import com.binance.connector.client.auto_invest.ApiException;
import com.binance.connector.client.auto_invest.Configuration;
import com.binance.connector.client.auto_invest.models.*;
import com.binance.connector.client.auto_invest.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    InvestmentPlanAdjustmentRequest investmentPlanAdjustmentRequest = new InvestmentPlanAdjustmentRequest(); // InvestmentPlanAdjustmentRequest | 
    try {
      InvestmentPlanAdjustmentResponse result = apiInstance.investmentPlanAdjustment(investmentPlanAdjustmentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#investmentPlanAdjustment");
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
| **investmentPlanAdjustmentRequest** | [**InvestmentPlanAdjustmentRequest**](InvestmentPlanAdjustmentRequest.md)|  | |

### Return type

[**InvestmentPlanAdjustmentResponse**](InvestmentPlanAdjustmentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Investment plan adjustment |  -  |

<a id="investmentPlanCreation"></a>
# **investmentPlanCreation**
> InvestmentPlanCreationResponse investmentPlanCreation(investmentPlanCreationRequest)

Investment plan creation(USER_DATA)

Post an investment plan creation  * max one request every 3s per account  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.auto_invest.ApiClient;
import com.binance.connector.client.auto_invest.ApiException;
import com.binance.connector.client.auto_invest.Configuration;
import com.binance.connector.client.auto_invest.models.*;
import com.binance.connector.client.auto_invest.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    InvestmentPlanCreationRequest investmentPlanCreationRequest = new InvestmentPlanCreationRequest(); // InvestmentPlanCreationRequest | 
    try {
      InvestmentPlanCreationResponse result = apiInstance.investmentPlanCreation(investmentPlanCreationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#investmentPlanCreation");
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
| **investmentPlanCreationRequest** | [**InvestmentPlanCreationRequest**](InvestmentPlanCreationRequest.md)|  | |

### Return type

[**InvestmentPlanCreationResponse**](InvestmentPlanCreationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Investment plan creation |  -  |

<a id="oneTimeTransaction"></a>
# **oneTimeTransaction**
> OneTimeTransactionResponse oneTimeTransaction(oneTimeTransactionRequest)

One Time Transaction(TRADE)

One time transaction  * &#x60;planId&#x60;/&#x60;planId&#x60;/&#x60;details&#x60; must not all be null  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.auto_invest.ApiClient;
import com.binance.connector.client.auto_invest.ApiException;
import com.binance.connector.client.auto_invest.Configuration;
import com.binance.connector.client.auto_invest.models.*;
import com.binance.connector.client.auto_invest.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    OneTimeTransactionRequest oneTimeTransactionRequest = new OneTimeTransactionRequest(); // OneTimeTransactionRequest | 
    try {
      OneTimeTransactionResponse result = apiInstance.oneTimeTransaction(oneTimeTransactionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#oneTimeTransaction");
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
| **oneTimeTransactionRequest** | [**OneTimeTransactionRequest**](OneTimeTransactionRequest.md)|  | |

### Return type

[**OneTimeTransactionResponse**](OneTimeTransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | One Time Transaction |  -  |

<a id="queryHoldingDetailsOfThePlan"></a>
# **queryHoldingDetailsOfThePlan**
> QueryHoldingDetailsOfThePlanResponse queryHoldingDetailsOfThePlan(planId, requestId, recvWindow)

Query holding details of the plan(USER_DATA)

Query holding details of the plan  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.auto_invest.ApiClient;
import com.binance.connector.client.auto_invest.ApiException;
import com.binance.connector.client.auto_invest.Configuration;
import com.binance.connector.client.auto_invest.models.*;
import com.binance.connector.client.auto_invest.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    Long planId = 56L; // Long | Plan identifier
    String requestId = "requestId_example"; // String | requestId when create
    Long recvWindow = 56L; // Long | no more than ```60000```
    try {
      QueryHoldingDetailsOfThePlanResponse result = apiInstance.queryHoldingDetailsOfThePlan(planId, requestId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryHoldingDetailsOfThePlan");
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
| **planId** | **Long**| Plan identifier | [optional] |
| **requestId** | **String**| requestId when create | [optional] |
| **recvWindow** | **Long**| no more than &#x60;&#x60;&#x60;60000&#x60;&#x60;&#x60; | [optional] |

### Return type

[**QueryHoldingDetailsOfThePlanResponse**](QueryHoldingDetailsOfThePlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | holding details of the plan |  -  |

<a id="queryIndexLinkedPlanPositionDetails"></a>
# **queryIndexLinkedPlanPositionDetails**
> QueryIndexLinkedPlanPositionDetailsResponse queryIndexLinkedPlanPositionDetails(indexId, recvWindow)

Query Index Linked Plan Position Details(USER_DATA)

Details on users Index-Linked plan position details  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.auto_invest.ApiClient;
import com.binance.connector.client.auto_invest.ApiException;
import com.binance.connector.client.auto_invest.Configuration;
import com.binance.connector.client.auto_invest.models.*;
import com.binance.connector.client.auto_invest.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    Long indexId = 56L; // Long | 
    Long recvWindow = 56L; // Long | no more than ```60000```
    try {
      QueryIndexLinkedPlanPositionDetailsResponse result = apiInstance.queryIndexLinkedPlanPositionDetails(indexId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryIndexLinkedPlanPositionDetails");
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

[**QueryIndexLinkedPlanPositionDetailsResponse**](QueryIndexLinkedPlanPositionDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Index Linked Plan Position Details |  -  |

<a id="queryOneTimeTransactionStatus"></a>
# **queryOneTimeTransactionStatus**
> QueryOneTimeTransactionStatusResponse queryOneTimeTransactionStatus(transactionId, requestId, recvWindow)

Query One-Time Transaction Status(USER_DATA)

Transaction status for one-time transaction  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.auto_invest.ApiClient;
import com.binance.connector.client.auto_invest.ApiException;
import com.binance.connector.client.auto_invest.Configuration;
import com.binance.connector.client.auto_invest.models.*;
import com.binance.connector.client.auto_invest.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    Long transactionId = 56L; // Long | PORTFOLIO plan's Id
    String requestId = "requestId_example"; // String | requestId when create
    Long recvWindow = 56L; // Long | no more than ```60000```
    try {
      QueryOneTimeTransactionStatusResponse result = apiInstance.queryOneTimeTransactionStatus(transactionId, requestId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryOneTimeTransactionStatus");
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
| **transactionId** | **Long**| PORTFOLIO plan&#39;s Id | |
| **requestId** | **String**| requestId when create | [optional] |
| **recvWindow** | **Long**| no more than &#x60;&#x60;&#x60;60000&#x60;&#x60;&#x60; | [optional] |

### Return type

[**QueryOneTimeTransactionStatusResponse**](QueryOneTimeTransactionStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | One-Time Transaction Status |  -  |

<a id="querySubscriptionTransactionHistory"></a>
# **querySubscriptionTransactionHistory**
> QuerySubscriptionTransactionHistoryResponse querySubscriptionTransactionHistory(planId, startTime, endTime, targetAsset, planType, size, current, recvWindow)

Query subscription transaction history(USER_DATA)

Query subscription transaction history of a plan   * Max span between startTime and endTime is 30days * If both startTime and endTime are null，then default is 30days  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.auto_invest.ApiClient;
import com.binance.connector.client.auto_invest.ApiException;
import com.binance.connector.client.auto_invest.Configuration;
import com.binance.connector.client.auto_invest.models.*;
import com.binance.connector.client.auto_invest.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    Long planId = 56L; // Long | Plan identifier
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long targetAsset = 56L; // Long | Plan identifier
    Long planType = 56L; // Long | SINGLE, PORTFOLIO, INDEX, ALL
    Long size = 56L; // Long | Default: 8, Max:100
    Long current = 56L; // Long | Current query page. Default: 1, start from 1
    Long recvWindow = 56L; // Long | no more than ```60000```
    try {
      QuerySubscriptionTransactionHistoryResponse result = apiInstance.querySubscriptionTransactionHistory(planId, startTime, endTime, targetAsset, planType, size, current, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#querySubscriptionTransactionHistory");
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
| **planId** | **Long**| Plan identifier | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **targetAsset** | **Long**| Plan identifier | [optional] |
| **planType** | **Long**| SINGLE, PORTFOLIO, INDEX, ALL | [optional] |
| **size** | **Long**| Default: 8, Max:100 | [optional] |
| **current** | **Long**| Current query page. Default: 1, start from 1 | [optional] |
| **recvWindow** | **Long**| no more than &#x60;&#x60;&#x60;60000&#x60;&#x60;&#x60; | [optional] |

### Return type

[**QuerySubscriptionTransactionHistoryResponse**](QuerySubscriptionTransactionHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | subscription transaction history |  -  |

