# StableRateApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCryptoLoansIncomeHistory**](StableRateApi.md#getCryptoLoansIncomeHistory) | **GET** /sapi/v1/loan/income | Get Crypto Loans Income History (USER_DATA) |
| [**getLoanBorrowHistory**](StableRateApi.md#getLoanBorrowHistory) | **GET** /sapi/v1/loan/borrow/history | Get Loan Borrow History (USER_DATA) |
| [**getLoanLtvAdjustmentHistory**](StableRateApi.md#getLoanLtvAdjustmentHistory) | **GET** /sapi/v1/loan/ltv/adjustment/history | Get Loan LTV Adjustment History (USER_DATA) |
| [**getLoanRepaymentHistory**](StableRateApi.md#getLoanRepaymentHistory) | **GET** /sapi/v1/loan/repay/history | Get Loan Repayment History (USER_DATA) |


<a id="getCryptoLoansIncomeHistory"></a>
# **getCryptoLoansIncomeHistory**
> GetCryptoLoansIncomeHistoryResponse getCryptoLoansIncomeHistory(asset, type, startTime, endTime, limit, recvWindow)

Get Crypto Loans Income History (USER_DATA)

Get Crypto Loans Income History  Weight(UID): 6000  Security Type: USER_DATA  Notes: - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both omitted, the most recent 7 days of data are returned. - The maximum interval between &#x60;startTime&#x60; and &#x60;endTime&#x60; is 30 days.

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
    String asset = "BUSD"; // String | 
    OrderType type = OrderType.fromValue("borrowIn"); // OrderType | All types will be returned by default.
    Long startTime = 1623319461670L; // Long | 
    Long endTime = 1641782889000L; // Long | 
    Long limit = 10L; // Long | Number of records to return
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
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
| **type** | [**OrderType**](.md)| All types will be returned by default. | [optional] [enum: borrowIn, collateralSpent, repayAmount, collateralReturn, addCollateral, removeCollateral, collateralReturnAfterLiquidation] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **limit** | **Long**| Number of records to return | [optional] |
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

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

Get Loan Borrow History (USER_DATA)

Get Loan Borrow History  Weight(IP): 400  Security Type: USER_DATA  Notes: - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, the recent 90-day data is returned. - The max interval between &#x60;startTime&#x60; and &#x60;endTime&#x60; is 180 days.

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
    Long orderId = 1L; // Long | orderId in `POST /sapi/v1/loan/borrow`
    String loanCoin = "BUSD"; // String | 
    String collateralCoin = "BNB"; // String | 
    Long startTime = 1623319461670L; // Long | 
    Long endTime = 1641782889000L; // Long | 
    Long current = 1L; // Long | Current querying page
    Long limit = 10L; // Long | Number of records to return
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
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
| **current** | **Long**| Current querying page | [optional] |
| **limit** | **Long**| Number of records to return | [optional] |
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

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

Get Loan LTV Adjustment History (USER_DATA)

Get Loan LTV Adjustment History  Weight(IP): 400  Security Type: USER_DATA  Notes: - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, the recent 90-day data is returned. - The max interval between &#x60;startTime&#x60; and &#x60;endTime&#x60; is 180 days.

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
    Long orderId = 1L; // Long | orderId in `POST /sapi/v1/loan/borrow`
    String loanCoin = "BUSD"; // String | 
    String collateralCoin = "BNB"; // String | 
    Long startTime = 1623319461670L; // Long | 
    Long endTime = 1641782889000L; // Long | 
    Long current = 1L; // Long | Current querying page
    Long limit = 10L; // Long | Number of records to return
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
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
| **current** | **Long**| Current querying page | [optional] |
| **limit** | **Long**| Number of records to return | [optional] |
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

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

Get Loan Repayment History (USER_DATA)

Get Loan Repayment History  Weight(IP): 400  Security Type: USER_DATA  Notes: - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, the recent 90-day data is returned. - The max interval between &#x60;startTime&#x60; and &#x60;endTime&#x60; is 180 days.

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
    Long orderId = 1L; // Long | orderId in `POST /sapi/v1/loan/borrow`
    String loanCoin = "BUSD"; // String | 
    String collateralCoin = "BNB"; // String | 
    Long startTime = 1623319461670L; // Long | 
    Long endTime = 1641782889000L; // Long | 
    Long current = 1L; // Long | Current querying page
    Long limit = 10L; // Long | Number of records to return
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
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
| **current** | **Long**| Current querying page | [optional] |
| **limit** | **Long**| Number of records to return | [optional] |
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

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

