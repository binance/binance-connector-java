# MarketDataApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBorrowInterestRate**](MarketDataApi.md#getBorrowInterestRate) | **GET** /sapi/v1/loan/vip/request/interestRate | Get Borrow Interest Rate (USER_DATA) |
| [**getCollateralAssetData**](MarketDataApi.md#getCollateralAssetData) | **GET** /sapi/v1/loan/vip/collateral/data | Get Collateral Asset Data (USER_DATA) |
| [**getLoanableAssetsData**](MarketDataApi.md#getLoanableAssetsData) | **GET** /sapi/v1/loan/vip/loanable/data | Get Loanable Assets Data (USER_DATA) |
| [**getVIPLoanInterestRateHistory**](MarketDataApi.md#getVIPLoanInterestRateHistory) | **GET** /sapi/v1/loan/vip/interestRateHistory | Get VIP Loan Interest Rate History (USER_DATA) |
| [**queryVIPLoanFixedRateMarket**](MarketDataApi.md#queryVIPLoanFixedRateMarket) | **GET** /sapi/v1/loan/vip/fixed/market | Query VIP Loan Fixed Rate Market (USER_DATA) |


<a id="getBorrowInterestRate"></a>
# **getBorrowInterestRate**
> GetBorrowInterestRateResponse getBorrowInterestRate(loanCoin, recvWindow)

Get Borrow Interest Rate (USER_DATA)

Get Borrow Interest Rate  Weight(IP): 400  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.vip_loan.ApiClient;
import com.binance.connector.client.vip_loan.ApiException;
import com.binance.connector.client.vip_loan.Configuration;
import com.binance.connector.client.vip_loan.models.*;
import com.binance.connector.client.vip_loan.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String loanCoin = "BTC"; // String | Max 10 assets, Multiple split by \",\"
    Long recvWindow = 5000L; // Long | 
    try {
      GetBorrowInterestRateResponse result = apiInstance.getBorrowInterestRate(loanCoin, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#getBorrowInterestRate");
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
| **loanCoin** | **String**| Max 10 assets, Multiple split by \&quot;,\&quot; | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetBorrowInterestRateResponse**](GetBorrowInterestRateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Borrow Interest Rate |  -  |

<a id="getCollateralAssetData"></a>
# **getCollateralAssetData**
> GetCollateralAssetDataResponse getCollateralAssetData(collateralCoin, recvWindow)

Get Collateral Asset Data (USER_DATA)

Get Collateral Asset Data  Weight(IP): 400  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.vip_loan.ApiClient;
import com.binance.connector.client.vip_loan.ApiException;
import com.binance.connector.client.vip_loan.Configuration;
import com.binance.connector.client.vip_loan.models.*;
import com.binance.connector.client.vip_loan.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String collateralCoin = "BUSD"; // String | 
    Long recvWindow = 5000L; // Long | 
    try {
      GetCollateralAssetDataResponse result = apiInstance.getCollateralAssetData(collateralCoin, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#getCollateralAssetData");
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
| **collateralCoin** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetCollateralAssetDataResponse**](GetCollateralAssetDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Collateral Asset Data |  -  |

<a id="getLoanableAssetsData"></a>
# **getLoanableAssetsData**
> GetLoanableAssetsDataResponse getLoanableAssetsData(loanCoin, vipLevel, recvWindow)

Get Loanable Assets Data (USER_DATA)

Get interest rate and borrow limit of loanable assets. The borrow limit is shown in USD value.  Weight(IP): 400  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.vip_loan.ApiClient;
import com.binance.connector.client.vip_loan.ApiException;
import com.binance.connector.client.vip_loan.Configuration;
import com.binance.connector.client.vip_loan.models.*;
import com.binance.connector.client.vip_loan.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String loanCoin = "BUSD"; // String | 
    Long vipLevel = 1L; // Long | Defaults to the user's VIP level.
    Long recvWindow = 5000L; // Long | 
    try {
      GetLoanableAssetsDataResponse result = apiInstance.getLoanableAssetsData(loanCoin, vipLevel, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#getLoanableAssetsData");
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
| **loanCoin** | **String**|  | [optional] |
| **vipLevel** | **Long**| Defaults to the user&#39;s VIP level. | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetLoanableAssetsDataResponse**](GetLoanableAssetsDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Loanable Assets Data |  -  |

<a id="getVIPLoanInterestRateHistory"></a>
# **getVIPLoanInterestRateHistory**
> GetVIPLoanInterestRateHistoryResponse getVIPLoanInterestRateHistory(coin, recvWindow, startTime, endTime, current, limit)

Get VIP Loan Interest Rate History (USER_DATA)

Check VIP Loan flexible interest rate history  Weight(IP): 400  Security Type: USER_DATA  Notes: - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, recent 90-day data is returned. - The maximum interval between &#x60;startTime&#x60; and &#x60;endTime&#x60; is 180 days. - Time is based on UTC+0.

### Example
```java
// Import classes:
import com.binance.connector.client.vip_loan.ApiClient;
import com.binance.connector.client.vip_loan.ApiException;
import com.binance.connector.client.vip_loan.Configuration;
import com.binance.connector.client.vip_loan.models.*;
import com.binance.connector.client.vip_loan.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String coin = "USDT"; // String | 
    Long recvWindow = 5000L; // Long | 
    Long startTime = 1623319461670L; // Long | If both startTime and endTime are omitted, the most recent 90 days are returned.
    Long endTime = 1641782889000L; // Long | Maximum interval between startTime and endTime is 180 days. Time is based on UTC+0.
    Long current = 1L; // Long | Current page number, starting from 1.
    Long limit = 10L; // Long | Number of records per page.
    try {
      GetVIPLoanInterestRateHistoryResponse result = apiInstance.getVIPLoanInterestRateHistory(coin, recvWindow, startTime, endTime, current, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#getVIPLoanInterestRateHistory");
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
| **coin** | **String**|  | |
| **recvWindow** | **Long**|  | |
| **startTime** | **Long**| If both startTime and endTime are omitted, the most recent 90 days are returned. | [optional] |
| **endTime** | **Long**| Maximum interval between startTime and endTime is 180 days. Time is based on UTC+0. | [optional] |
| **current** | **Long**| Current page number, starting from 1. | [optional] |
| **limit** | **Long**| Number of records per page. | [optional] |

### Return type

[**GetVIPLoanInterestRateHistoryResponse**](GetVIPLoanInterestRateHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get VIP Loan Interest Rate History |  -  |

<a id="queryVIPLoanFixedRateMarket"></a>
# **queryVIPLoanFixedRateMarket**
> QueryVIPLoanFixedRateMarketResponse queryVIPLoanFixedRateMarket(loanCoin, duration, current, size, recvWindow)

Query VIP Loan Fixed Rate Market (USER_DATA)

Query the VIP Loan fixed rate market. Returns a paginated list of fixed-rate supply orders.  Weight(IP): 6000  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.vip_loan.ApiClient;
import com.binance.connector.client.vip_loan.ApiException;
import com.binance.connector.client.vip_loan.Configuration;
import com.binance.connector.client.vip_loan.models.*;
import com.binance.connector.client.vip_loan.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String loanCoin = "USDT"; // String | Loan coin
    Long duration = 30L; // Long | Duration in days, minimum 1
    Long current = 1L; // Long | Page number, default 1, minimum 1
    Long size = 10L; // Long | Page size, default 10, range [1, 100]
    Long recvWindow = 5000L; // Long | The value cannot be greater than `60000`
    try {
      QueryVIPLoanFixedRateMarketResponse result = apiInstance.queryVIPLoanFixedRateMarket(loanCoin, duration, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#queryVIPLoanFixedRateMarket");
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
| **loanCoin** | **String**| Loan coin | |
| **duration** | **Long**| Duration in days, minimum 1 | [optional] |
| **current** | **Long**| Page number, default 1, minimum 1 | [optional] |
| **size** | **Long**| Page size, default 10, range [1, 100] | [optional] |
| **recvWindow** | **Long**| The value cannot be greater than &#x60;60000&#x60; | [optional] |

### Return type

[**QueryVIPLoanFixedRateMarketResponse**](QueryVIPLoanFixedRateMarketResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Query VIP Loan Fixed Rate Market |  -  |

