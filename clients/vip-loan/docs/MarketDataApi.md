# MarketDataApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBorrowInterestRate**](MarketDataApi.md#getBorrowInterestRate) | **GET** /sapi/v1/loan/vip/request/interestRate | Get Borrow Interest Rate(USER_DATA) |
| [**getCollateralAssetData**](MarketDataApi.md#getCollateralAssetData) | **GET** /sapi/v1/loan/vip/collateral/data | Get Collateral Asset Data(USER_DATA) |
| [**getLoanableAssetsData**](MarketDataApi.md#getLoanableAssetsData) | **GET** /sapi/v1/loan/vip/loanable/data | Get Loanable Assets Data(USER_DATA) |


<a id="getBorrowInterestRate"></a>
# **getBorrowInterestRate**
> GetBorrowInterestRateResponse getBorrowInterestRate(loanCoin, recvWindow)

Get Borrow Interest Rate(USER_DATA)

Get Borrow Interest Rate  Weight: 400

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
    String loanCoin = "loanCoin_example"; // String | Max 10 assets, Multiple split by \",\"
    Long recvWindow = 56L; // Long | 
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

Get Collateral Asset Data(USER_DATA)

Get Collateral Asset Data  Weight: 400

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
    String collateralCoin = "collateralCoin_example"; // String | 
    Long recvWindow = 56L; // Long | 
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

Get Loanable Assets Data(USER_DATA)

Get interest rate and borrow limit of loanable assets. The borrow limit is shown in USD value.  Weight: 400

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
    String loanCoin = "loanCoin_example"; // String | 
    Long vipLevel = 56L; // Long | default:user's vip level
    Long recvWindow = 56L; // Long | 
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
| **vipLevel** | **Long**| default:user&#39;s vip level | [optional] |
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

