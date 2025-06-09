# StableRateApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkCollateralRepayRateStableRate**](StableRateApi.md#checkCollateralRepayRateStableRate) | **GET** /sapi/v1/loan/repay/collateral/rate | Check Collateral Repay Rate(USER_DATA) |
| [**getCryptoLoansIncomeHistory**](StableRateApi.md#getCryptoLoansIncomeHistory) | **GET** /sapi/v1/loan/income | Get Crypto Loans Income History(USER_DATA) |
| [**getLoanBorrowHistory**](StableRateApi.md#getLoanBorrowHistory) | **GET** /sapi/v1/loan/borrow/history | Get Loan Borrow History(USER_DATA) |
| [**getLoanLtvAdjustmentHistory**](StableRateApi.md#getLoanLtvAdjustmentHistory) | **GET** /sapi/v1/loan/ltv/adjustment/history | Get Loan LTV Adjustment History(USER_DATA) |
| [**getLoanRepaymentHistory**](StableRateApi.md#getLoanRepaymentHistory) | **GET** /sapi/v1/loan/repay/history | Get Loan Repayment History(USER_DATA) |


<a id="checkCollateralRepayRateStableRate"></a>
# **checkCollateralRepayRateStableRate**
> CheckCollateralRepayRateStableRateResponse checkCollateralRepayRateStableRate(loanCoin, collateralCoin, repayAmount, recvWindow)

Check Collateral Repay Rate(USER_DATA)

Get the the rate of collateral coin / loan coin when using collateral repay, the rate will be valid within 8 second.  Weight: 6000

### Example
```java
// Import classes:
import com.binance.connector.client.crypto_loan.ApiClient;
import com.binance.connector.client.crypto_loan.ApiException;
import com.binance.connector.client.crypto_loan.Configuration;
import com.binance.connector.client.crypto_loan.models.*;
import com.binance.connector.client.crypto_loan.rest.api.StableRateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    StableRateApi apiInstance = new StableRateApi(defaultClient);
    String loanCoin = "loanCoin_example"; // String | 
    String collateralCoin = "collateralCoin_example"; // String | 
    Double repayAmount = 3.4D; // Double | repay amount of loanCoin
    Long recvWindow = 56L; // Long | 
    try {
      CheckCollateralRepayRateStableRateResponse result = apiInstance.checkCollateralRepayRateStableRate(loanCoin, collateralCoin, repayAmount, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StableRateApi#checkCollateralRepayRateStableRate");
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
| **loanCoin** | **String**|  | |
| **collateralCoin** | **String**|  | |
| **repayAmount** | **Double**| repay amount of loanCoin | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**CheckCollateralRepayRateStableRateResponse**](CheckCollateralRepayRateStableRateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Check Collateral Repay Rate |  -  |

<a id="getCryptoLoansIncomeHistory"></a>
# **getCryptoLoansIncomeHistory**
> GetCryptoLoansIncomeHistoryResponse getCryptoLoansIncomeHistory(asset, type, startTime, endTime, limit, recvWindow)

Get Crypto Loans Income History(USER_DATA)

Get Crypto Loans Income History  * If startTime and endTime are not sent, the recent 7-day data will be returned. * The max interval between startTime and endTime is 30 days.  Weight: 6000

### Example
```java
// Import classes:
import com.binance.connector.client.crypto_loan.ApiClient;
import com.binance.connector.client.crypto_loan.ApiException;
import com.binance.connector.client.crypto_loan.Configuration;
import com.binance.connector.client.crypto_loan.models.*;
import com.binance.connector.client.crypto_loan.rest.api.StableRateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    StableRateApi apiInstance = new StableRateApi(defaultClient);
    String asset = "asset_example"; // String | 
    String type = "type_example"; // String | All types will be returned by default. Enum：`borrowIn` ,`collateralSpent`, `repayAmount`, `collateralReturn`(Collateral return after repayment), `addCollateral`, `removeCollateral`, `collateralReturnAfterLiquidation`
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long limit = 56L; // Long | Default: 10; max: 100
    Long recvWindow = 56L; // Long | 
    try {
      GetCryptoLoansIncomeHistoryResponse result = apiInstance.getCryptoLoansIncomeHistory(asset, type, startTime, endTime, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StableRateApi#getCryptoLoansIncomeHistory");
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
| **type** | **String**| All types will be returned by default. Enum：&#x60;borrowIn&#x60; ,&#x60;collateralSpent&#x60;, &#x60;repayAmount&#x60;, &#x60;collateralReturn&#x60;(Collateral return after repayment), &#x60;addCollateral&#x60;, &#x60;removeCollateral&#x60;, &#x60;collateralReturnAfterLiquidation&#x60; | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **limit** | **Long**| Default: 10; max: 100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetCryptoLoansIncomeHistoryResponse**](GetCryptoLoansIncomeHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Crypto Loans Income History |  -  |

<a id="getLoanBorrowHistory"></a>
# **getLoanBorrowHistory**
> GetLoanBorrowHistoryResponse getLoanBorrowHistory(orderId, loanCoin, collateralCoin, startTime, endTime, current, limit, recvWindow)

Get Loan Borrow History(USER_DATA)

Get Loan Borrow History  * If startTime and endTime are not sent, the recent 90-day data will be returned. * The max interval between startTime and endTime is 180 days.  Weight: 400

### Example
```java
// Import classes:
import com.binance.connector.client.crypto_loan.ApiClient;
import com.binance.connector.client.crypto_loan.ApiException;
import com.binance.connector.client.crypto_loan.Configuration;
import com.binance.connector.client.crypto_loan.models.*;
import com.binance.connector.client.crypto_loan.rest.api.StableRateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    StableRateApi apiInstance = new StableRateApi(defaultClient);
    Long orderId = 56L; // Long | orderId in `POST /sapi/v1/loan/borrow`
    String loanCoin = "loanCoin_example"; // String | 
    String collateralCoin = "collateralCoin_example"; // String | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Current querying page. Start from 1; default: 1; max: 1000
    Long limit = 56L; // Long | Default: 10; max: 100
    Long recvWindow = 56L; // Long | 
    try {
      GetLoanBorrowHistoryResponse result = apiInstance.getLoanBorrowHistory(orderId, loanCoin, collateralCoin, startTime, endTime, current, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StableRateApi#getLoanBorrowHistory");
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
| **orderId** | **Long**| orderId in &#x60;POST /sapi/v1/loan/borrow&#x60; | [optional] |
| **loanCoin** | **String**|  | [optional] |
| **collateralCoin** | **String**|  | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Current querying page. Start from 1; default: 1; max: 1000 | [optional] |
| **limit** | **Long**| Default: 10; max: 100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetLoanBorrowHistoryResponse**](GetLoanBorrowHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Loan Borrow History |  -  |

<a id="getLoanLtvAdjustmentHistory"></a>
# **getLoanLtvAdjustmentHistory**
> GetLoanLtvAdjustmentHistoryResponse getLoanLtvAdjustmentHistory(orderId, loanCoin, collateralCoin, startTime, endTime, current, limit, recvWindow)

Get Loan LTV Adjustment History(USER_DATA)

Get Loan LTV Adjustment History  * If startTime and endTime are not sent, the recent 90-day data will be returned. * The max interval between startTime and endTime is 180 days.  Weight: 400

### Example
```java
// Import classes:
import com.binance.connector.client.crypto_loan.ApiClient;
import com.binance.connector.client.crypto_loan.ApiException;
import com.binance.connector.client.crypto_loan.Configuration;
import com.binance.connector.client.crypto_loan.models.*;
import com.binance.connector.client.crypto_loan.rest.api.StableRateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    StableRateApi apiInstance = new StableRateApi(defaultClient);
    Long orderId = 56L; // Long | orderId in `POST /sapi/v1/loan/borrow`
    String loanCoin = "loanCoin_example"; // String | 
    String collateralCoin = "collateralCoin_example"; // String | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Current querying page. Start from 1; default: 1; max: 1000
    Long limit = 56L; // Long | Default: 10; max: 100
    Long recvWindow = 56L; // Long | 
    try {
      GetLoanLtvAdjustmentHistoryResponse result = apiInstance.getLoanLtvAdjustmentHistory(orderId, loanCoin, collateralCoin, startTime, endTime, current, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StableRateApi#getLoanLtvAdjustmentHistory");
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
| **orderId** | **Long**| orderId in &#x60;POST /sapi/v1/loan/borrow&#x60; | [optional] |
| **loanCoin** | **String**|  | [optional] |
| **collateralCoin** | **String**|  | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Current querying page. Start from 1; default: 1; max: 1000 | [optional] |
| **limit** | **Long**| Default: 10; max: 100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetLoanLtvAdjustmentHistoryResponse**](GetLoanLtvAdjustmentHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Loan LTV Adjustment History |  -  |

<a id="getLoanRepaymentHistory"></a>
# **getLoanRepaymentHistory**
> GetLoanRepaymentHistoryResponse getLoanRepaymentHistory(orderId, loanCoin, collateralCoin, startTime, endTime, current, limit, recvWindow)

Get Loan Repayment History(USER_DATA)

Get Loan Repayment History  * If startTime and endTime are not sent, the recent 90-day data will be returned. * The max interval between startTime and endTime is 180 days.  Weight: 400

### Example
```java
// Import classes:
import com.binance.connector.client.crypto_loan.ApiClient;
import com.binance.connector.client.crypto_loan.ApiException;
import com.binance.connector.client.crypto_loan.Configuration;
import com.binance.connector.client.crypto_loan.models.*;
import com.binance.connector.client.crypto_loan.rest.api.StableRateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    StableRateApi apiInstance = new StableRateApi(defaultClient);
    Long orderId = 56L; // Long | orderId in `POST /sapi/v1/loan/borrow`
    String loanCoin = "loanCoin_example"; // String | 
    String collateralCoin = "collateralCoin_example"; // String | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Current querying page. Start from 1; default: 1; max: 1000
    Long limit = 56L; // Long | Default: 10; max: 100
    Long recvWindow = 56L; // Long | 
    try {
      GetLoanRepaymentHistoryResponse result = apiInstance.getLoanRepaymentHistory(orderId, loanCoin, collateralCoin, startTime, endTime, current, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StableRateApi#getLoanRepaymentHistory");
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
| **orderId** | **Long**| orderId in &#x60;POST /sapi/v1/loan/borrow&#x60; | [optional] |
| **loanCoin** | **String**|  | [optional] |
| **collateralCoin** | **String**|  | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Current querying page. Start from 1; default: 1; max: 1000 | [optional] |
| **limit** | **Long**| Default: 10; max: 100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetLoanRepaymentHistoryResponse**](GetLoanRepaymentHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Loan Repayment History |  -  |

