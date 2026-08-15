# BorrowRepayApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFutureHourlyInterestRate**](BorrowRepayApi.md#getFutureHourlyInterestRate) | **GET** /sapi/v1/margin/next-hourly-interest-rate | Get future hourly interest rate (USER_DATA) |
| [**getInterestHistory**](BorrowRepayApi.md#getInterestHistory) | **GET** /sapi/v1/margin/interestHistory | Get Interest History (USER_DATA) |
| [**marginAccountBorrowRepay**](BorrowRepayApi.md#marginAccountBorrowRepay) | **POST** /sapi/v1/margin/borrow-repay | Margin account borrow/repay (USER_DATA) |
| [**queryBorrowRepayRecordsInMarginAccount**](BorrowRepayApi.md#queryBorrowRepayRecordsInMarginAccount) | **GET** /sapi/v1/margin/borrow-repay | Query borrow/repay records in Margin account (USER_DATA) |
| [**queryMarginInterestRateHistory**](BorrowRepayApi.md#queryMarginInterestRateHistory) | **GET** /sapi/v1/margin/interestRateHistory | Query Margin Interest Rate History (USER_DATA) |
| [**queryMaxBorrow**](BorrowRepayApi.md#queryMaxBorrow) | **GET** /sapi/v1/margin/maxBorrowable | Query Max Borrow (USER_DATA) |


<a id="getFutureHourlyInterestRate"></a>
# **getFutureHourlyInterestRate**
> GetFutureHourlyInterestRateResponse getFutureHourlyInterestRate(assets, isIsolated)

Get future hourly interest rate (USER_DATA)

Get future hourly interest rate  Weight(IP): 100  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.BorrowRepayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    BorrowRepayApi apiInstance = new BorrowRepayApi(defaultClient);
    String assets = "BTC,ETH"; // String | 
    IsIsolated isIsolated = IsIsolated.fromValue("TRUE"); // IsIsolated | 
    try {
      GetFutureHourlyInterestRateResponse result = apiInstance.getFutureHourlyInterestRate(assets, isIsolated);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BorrowRepayApi#getFutureHourlyInterestRate");
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
| **assets** | **String**|  | |
| **isIsolated** | [**IsIsolated**](.md)|  | [default to FALSE] [enum: TRUE, FALSE] |

### Return type

[**GetFutureHourlyInterestRateResponse**](GetFutureHourlyInterestRateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get future hourly interest rate |  -  |

<a id="getInterestHistory"></a>
# **getInterestHistory**
> GetInterestHistoryResponse getInterestHistory(asset, isolatedSymbol, startTime, endTime, current, size, recvWindow)

Get Interest History (USER_DATA)

Get Interest History  Weight(IP): 1  Security Type: USER_DATA  Notes: - Response in descending order  - If isolatedSymbol is not sent, crossed margin data will be returned  - The max interval between &#x60;startTime&#x60; and &#x60;endTime&#x60; is 30 days. It is a MUST to ensure data correctness.  - If &#x60;startTime&#x60;and &#x60;endTime&#x60; not sent, return records of the last 7 days by default.  - If &#x60;startTime&#x60; is sent and &#x60;endTime&#x60; is not sent, return records of [max(&#x60;startTime&#x60;, now-30d), now].  - If &#x60;startTime&#x60; is not sent and &#x60;endTime&#x60; is sent, return records of [&#x60;endTime&#x60;-7, &#x60;endTime&#x60;]  - &#x60;type&#x60; in response has 4 enums:  - &#x60;PERIODIC&#x60; interest charged per hour  - &#x60;ON_BORROW&#x60; first interest charged on borrow  - &#x60;PERIODIC_CONVERTED&#x60; interest charged per hour converted into BNB  - &#x60;ON_BORROW_CONVERTED&#x60; first interest charged on borrow converted into BNB  - &#x60;PORTFOLIO&#x60; interest charged daily on the portfolio margin negative balance

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.BorrowRepayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    BorrowRepayApi apiInstance = new BorrowRepayApi(defaultClient);
    String asset = "USDT"; // String | 
    String isolatedSymbol = "BNBUSDT"; // String | 
    Long startTime = 1623319461670L; // Long | Only supports querying data from the past 90 days.
    Long endTime = 1641782889000L; // Long | 
    Long current = 1L; // Long | 
    Long size = 10L; // Long | 
    Long recvWindow = 5000L; // Long | 
    try {
      GetInterestHistoryResponse result = apiInstance.getInterestHistory(asset, isolatedSymbol, startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BorrowRepayApi#getInterestHistory");
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
| **isolatedSymbol** | **String**|  | [optional] |
| **startTime** | **Long**| Only supports querying data from the past 90 days. | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**|  | [optional] |
| **size** | **Long**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetInterestHistoryResponse**](GetInterestHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Interest History |  -  |

<a id="marginAccountBorrowRepay"></a>
# **marginAccountBorrowRepay**
> MarginAccountBorrowRepayResponse marginAccountBorrowRepay(marginAccountBorrowRepayRequest)

Margin account borrow/repay (USER_DATA)

Margin account borrow/repay  Weight(UID): 1500  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.BorrowRepayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    BorrowRepayApi apiInstance = new BorrowRepayApi(defaultClient);
    MarginAccountBorrowRepayRequest marginAccountBorrowRepayRequest = new MarginAccountBorrowRepayRequest(); // MarginAccountBorrowRepayRequest | 
    try {
      MarginAccountBorrowRepayResponse result = apiInstance.marginAccountBorrowRepay(marginAccountBorrowRepayRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BorrowRepayApi#marginAccountBorrowRepay");
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
| **marginAccountBorrowRepayRequest** | [**MarginAccountBorrowRepayRequest**](MarginAccountBorrowRepayRequest.md)|  | |

### Return type

[**MarginAccountBorrowRepayResponse**](MarginAccountBorrowRepayResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin account borrow/repay |  -  |

<a id="queryBorrowRepayRecordsInMarginAccount"></a>
# **queryBorrowRepayRecordsInMarginAccount**
> QueryBorrowRepayRecordsInMarginAccountResponse queryBorrowRepayRecordsInMarginAccount(type, asset, isolatedSymbol, txId, startTime, endTime, current, size, recvWindow)

Query borrow/repay records in Margin account (USER_DATA)

Query borrow/repay records in Margin account  Weight(IP): 10  Security Type: USER_DATA  Notes: - &#x60;txId&#x60; or &#x60;startTime&#x60; must be sent. &#x60;txId&#x60; takes precedence.  - Response in descending order  - If an asset is sent, data within 30 days before &#x60;endTime&#x60;; If an asset is not sent, data within 7 days before &#x60;endTime&#x60;  - If neither &#x60;startTime&#x60; nor &#x60;endTime&#x60; is sent, the recent 7-day data will be returned.  - &#x60;startTime&#x60; set as &#x60;endTime&#x60; - 7 days by default, &#x60;endTime&#x60; set as current time by default

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.BorrowRepayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    BorrowRepayApi apiInstance = new BorrowRepayApi(defaultClient);
    OrderType type = OrderType.fromValue("ROLL_IN"); // OrderType | 
    String asset = "BNB"; // String | 
    String isolatedSymbol = "BNBUSDT"; // String | 
    Long txId = 1L; // Long | 
    Long startTime = 1623319461670L; // Long | 
    Long endTime = 1641782889000L; // Long | 
    Long current = 1L; // Long | 
    Long size = 10L; // Long | 
    Long recvWindow = 5000L; // Long | 
    try {
      QueryBorrowRepayRecordsInMarginAccountResponse result = apiInstance.queryBorrowRepayRecordsInMarginAccount(type, asset, isolatedSymbol, txId, startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BorrowRepayApi#queryBorrowRepayRecordsInMarginAccount");
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
| **type** | [**OrderType**](.md)|  | [enum: ROLL_IN, ROLL_OUT] |
| **asset** | **String**|  | [optional] |
| **isolatedSymbol** | **String**|  | [optional] |
| **txId** | **Long**|  | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**|  | [optional] |
| **size** | **Long**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryBorrowRepayRecordsInMarginAccountResponse**](QueryBorrowRepayRecordsInMarginAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | borrow/repay records in Margin account |  -  |

<a id="queryMarginInterestRateHistory"></a>
# **queryMarginInterestRateHistory**
> QueryMarginInterestRateHistoryResponse queryMarginInterestRateHistory(asset, vipLevel, startTime, endTime, recvWindow)

Query Margin Interest Rate History (USER_DATA)

Query Margin Interest Rate History  Weight(IP): 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.BorrowRepayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    BorrowRepayApi apiInstance = new BorrowRepayApi(defaultClient);
    String asset = "BTC"; // String | 
    Long vipLevel = 1L; // Long | 
    Long startTime = 1623319461670L; // Long | 
    Long endTime = 1641782889000L; // Long | 
    Long recvWindow = 5000L; // Long | 
    try {
      QueryMarginInterestRateHistoryResponse result = apiInstance.queryMarginInterestRateHistory(asset, vipLevel, startTime, endTime, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BorrowRepayApi#queryMarginInterestRateHistory");
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
| **vipLevel** | **Long**|  | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryMarginInterestRateHistoryResponse**](QueryMarginInterestRateHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Interest Rate History |  -  |

<a id="queryMaxBorrow"></a>
# **queryMaxBorrow**
> QueryMaxBorrowResponse queryMaxBorrow(asset, isolatedSymbol, recvWindow)

Query Max Borrow (USER_DATA)

Query Max Borrow  Weight(IP): 50  Security Type: USER_DATA  Notes: - If isolatedSymbol is not sent, crossed margin data will be sent. - &#x60;borrowLimit&#x60; is also available from [https://www.binance.com/en/margin-fee](https://www.binance.com/en/margin-fee)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.BorrowRepayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    BorrowRepayApi apiInstance = new BorrowRepayApi(defaultClient);
    String asset = "BTC"; // String | 
    String isolatedSymbol = "BTCUSDT"; // String | 
    Long recvWindow = 5000L; // Long | 
    try {
      QueryMaxBorrowResponse result = apiInstance.queryMaxBorrow(asset, isolatedSymbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BorrowRepayApi#queryMaxBorrow");
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

[**QueryMaxBorrowResponse**](QueryMaxBorrowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Max Borrow |  -  |

