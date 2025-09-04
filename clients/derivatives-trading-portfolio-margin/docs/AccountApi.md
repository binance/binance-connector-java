# AccountApi

All URIs are relative to *https://papi.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accountBalance**](AccountApi.md#accountBalance) | **GET** /papi/v1/balance | Account Balance(USER_DATA) |
| [**accountInformation**](AccountApi.md#accountInformation) | **GET** /papi/v1/account | Account Information(USER_DATA) |
| [**bnbTransfer**](AccountApi.md#bnbTransfer) | **POST** /papi/v1/bnb-transfer | BNB transfer (TRADE) |
| [**changeAutoRepayFuturesStatus**](AccountApi.md#changeAutoRepayFuturesStatus) | **POST** /papi/v1/repay-futures-switch | Change Auto-repay-futures Status(TRADE) |
| [**changeCmInitialLeverage**](AccountApi.md#changeCmInitialLeverage) | **POST** /papi/v1/cm/leverage | Change CM Initial Leverage (TRADE) |
| [**changeCmPositionMode**](AccountApi.md#changeCmPositionMode) | **POST** /papi/v1/cm/positionSide/dual | Change CM Position Mode(TRADE) |
| [**changeUmInitialLeverage**](AccountApi.md#changeUmInitialLeverage) | **POST** /papi/v1/um/leverage | Change UM Initial Leverage(TRADE) |
| [**changeUmPositionMode**](AccountApi.md#changeUmPositionMode) | **POST** /papi/v1/um/positionSide/dual | Change UM Position Mode(TRADE) |
| [**cmNotionalAndLeverageBrackets**](AccountApi.md#cmNotionalAndLeverageBrackets) | **GET** /papi/v1/cm/leverageBracket | CM Notional and Leverage Brackets(USER_DATA) |
| [**fundAutoCollection**](AccountApi.md#fundAutoCollection) | **POST** /papi/v1/auto-collection | Fund Auto-collection(TRADE) |
| [**fundCollectionByAsset**](AccountApi.md#fundCollectionByAsset) | **POST** /papi/v1/asset-collection | Fund Collection by Asset(TRADE) |
| [**getAutoRepayFuturesStatus**](AccountApi.md#getAutoRepayFuturesStatus) | **GET** /papi/v1/repay-futures-switch | Get Auto-repay-futures Status(USER_DATA) |
| [**getCmAccountDetail**](AccountApi.md#getCmAccountDetail) | **GET** /papi/v1/cm/account | Get CM Account Detail(USER_DATA) |
| [**getCmCurrentPositionMode**](AccountApi.md#getCmCurrentPositionMode) | **GET** /papi/v1/cm/positionSide/dual | Get CM Current Position Mode(USER_DATA) |
| [**getCmIncomeHistory**](AccountApi.md#getCmIncomeHistory) | **GET** /papi/v1/cm/income | Get CM Income History(USER_DATA) |
| [**getDownloadIdForUmFuturesOrderHistory**](AccountApi.md#getDownloadIdForUmFuturesOrderHistory) | **GET** /papi/v1/um/order/asyn | Get Download Id For UM Futures Order History (USER_DATA) |
| [**getDownloadIdForUmFuturesTradeHistory**](AccountApi.md#getDownloadIdForUmFuturesTradeHistory) | **GET** /papi/v1/um/trade/asyn | Get Download Id For UM Futures Trade History (USER_DATA) |
| [**getDownloadIdForUmFuturesTransactionHistory**](AccountApi.md#getDownloadIdForUmFuturesTransactionHistory) | **GET** /papi/v1/um/income/asyn | Get Download Id For UM Futures Transaction History (USER_DATA) |
| [**getMarginBorrowLoanInterestHistory**](AccountApi.md#getMarginBorrowLoanInterestHistory) | **GET** /papi/v1/margin/marginInterestHistory | Get Margin Borrow/Loan Interest History(USER_DATA) |
| [**getUmAccountDetail**](AccountApi.md#getUmAccountDetail) | **GET** /papi/v1/um/account | Get UM Account Detail(USER_DATA) |
| [**getUmAccountDetailV2**](AccountApi.md#getUmAccountDetailV2) | **GET** /papi/v2/um/account | Get UM Account Detail V2(USER_DATA) |
| [**getUmCurrentPositionMode**](AccountApi.md#getUmCurrentPositionMode) | **GET** /papi/v1/um/positionSide/dual | Get UM Current Position Mode(USER_DATA) |
| [**getUmFuturesOrderDownloadLinkById**](AccountApi.md#getUmFuturesOrderDownloadLinkById) | **GET** /papi/v1/um/order/asyn/id | Get UM Futures Order Download Link by Id(USER_DATA) |
| [**getUmFuturesTradeDownloadLinkById**](AccountApi.md#getUmFuturesTradeDownloadLinkById) | **GET** /papi/v1/um/trade/asyn/id | Get UM Futures Trade Download Link by Id(USER_DATA) |
| [**getUmFuturesTransactionDownloadLinkById**](AccountApi.md#getUmFuturesTransactionDownloadLinkById) | **GET** /papi/v1/um/income/asyn/id | Get UM Futures Transaction Download Link by Id(USER_DATA) |
| [**getUmIncomeHistory**](AccountApi.md#getUmIncomeHistory) | **GET** /papi/v1/um/income | Get UM Income History(USER_DATA) |
| [**getUserCommissionRateForCm**](AccountApi.md#getUserCommissionRateForCm) | **GET** /papi/v1/cm/commissionRate | Get User Commission Rate for CM(USER_DATA) |
| [**getUserCommissionRateForUm**](AccountApi.md#getUserCommissionRateForUm) | **GET** /papi/v1/um/commissionRate | Get User Commission Rate for UM(USER_DATA) |
| [**marginMaxBorrow**](AccountApi.md#marginMaxBorrow) | **GET** /papi/v1/margin/maxBorrowable | Margin Max Borrow(USER_DATA) |
| [**portfolioMarginUmTradingQuantitativeRulesIndicators**](AccountApi.md#portfolioMarginUmTradingQuantitativeRulesIndicators) | **GET** /papi/v1/um/apiTradingStatus | Portfolio Margin UM Trading Quantitative Rules Indicators(USER_DATA) |
| [**queryCmPositionInformation**](AccountApi.md#queryCmPositionInformation) | **GET** /papi/v1/cm/positionRisk | Query CM Position Information(USER_DATA) |
| [**queryMarginLoanRecord**](AccountApi.md#queryMarginLoanRecord) | **GET** /papi/v1/margin/marginLoan | Query Margin Loan Record(USER_DATA) |
| [**queryMarginMaxWithdraw**](AccountApi.md#queryMarginMaxWithdraw) | **GET** /papi/v1/margin/maxWithdraw | Query Margin Max Withdraw(USER_DATA) |
| [**queryMarginRepayRecord**](AccountApi.md#queryMarginRepayRecord) | **GET** /papi/v1/margin/repayLoan | Query Margin repay Record(USER_DATA) |
| [**queryPortfolioMarginNegativeBalanceInterestHistory**](AccountApi.md#queryPortfolioMarginNegativeBalanceInterestHistory) | **GET** /papi/v1/portfolio/interest-history | Query Portfolio Margin Negative Balance Interest History(USER_DATA) |
| [**queryUmPositionInformation**](AccountApi.md#queryUmPositionInformation) | **GET** /papi/v1/um/positionRisk | Query UM Position Information(USER_DATA) |
| [**queryUserNegativeBalanceAutoExchangeRecord**](AccountApi.md#queryUserNegativeBalanceAutoExchangeRecord) | **GET** /papi/v1/portfolio/negative-balance-exchange-record | Query User Negative Balance Auto Exchange Record (USER_DATA) |
| [**queryUserRateLimit**](AccountApi.md#queryUserRateLimit) | **GET** /papi/v1/rateLimit/order | Query User Rate Limit (USER_DATA) |
| [**repayFuturesNegativeBalance**](AccountApi.md#repayFuturesNegativeBalance) | **POST** /papi/v1/repay-futures-negative-balance | Repay futures Negative Balance(USER_DATA) |
| [**umFuturesAccountConfiguration**](AccountApi.md#umFuturesAccountConfiguration) | **GET** /papi/v1/um/accountConfig | UM Futures Account Configuration(USER_DATA) |
| [**umFuturesSymbolConfiguration**](AccountApi.md#umFuturesSymbolConfiguration) | **GET** /papi/v1/um/symbolConfig | UM Futures Symbol Configuration(USER_DATA) |
| [**umNotionalAndLeverageBrackets**](AccountApi.md#umNotionalAndLeverageBrackets) | **GET** /papi/v1/um/leverageBracket | UM Notional and Leverage Brackets (USER_DATA) |


<a id="accountBalance"></a>
# **accountBalance**
> AccountBalanceResponse accountBalance(asset, recvWindow)

Account Balance(USER_DATA)

Query account balance  Weight: 20

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String asset = "asset_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      AccountBalanceResponse result = apiInstance.accountBalance(asset, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#accountBalance");
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
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**AccountBalanceResponse**](AccountBalanceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account Balance |  -  |

<a id="accountInformation"></a>
# **accountInformation**
> AccountInformationResponse accountInformation(recvWindow)

Account Information(USER_DATA)

Query account information  Weight: 20

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      AccountInformationResponse result = apiInstance.accountInformation(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#accountInformation");
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
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**AccountInformationResponse**](AccountInformationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account Information |  -  |

<a id="bnbTransfer"></a>
# **bnbTransfer**
> BnbTransferResponse bnbTransfer(bnbTransferRequest)

BNB transfer (TRADE)

Transfer BNB in and out of UM  * The endpoint can only be called 10 times per 10 minutes in a rolling manner  Weight: 750

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    BnbTransferRequest bnbTransferRequest = new BnbTransferRequest(); // BnbTransferRequest | 
    try {
      BnbTransferResponse result = apiInstance.bnbTransfer(bnbTransferRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#bnbTransfer");
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
| **bnbTransferRequest** | [**BnbTransferRequest**](BnbTransferRequest.md)|  | |

### Return type

[**BnbTransferResponse**](BnbTransferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | BNB transfer |  -  |

<a id="changeAutoRepayFuturesStatus"></a>
# **changeAutoRepayFuturesStatus**
> ChangeAutoRepayFuturesStatusResponse changeAutoRepayFuturesStatus(changeAutoRepayFuturesStatusRequest)

Change Auto-repay-futures Status(TRADE)

Change Auto-repay-futures Status  Weight: 750

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    ChangeAutoRepayFuturesStatusRequest changeAutoRepayFuturesStatusRequest = new ChangeAutoRepayFuturesStatusRequest(); // ChangeAutoRepayFuturesStatusRequest | 
    try {
      ChangeAutoRepayFuturesStatusResponse result = apiInstance.changeAutoRepayFuturesStatus(changeAutoRepayFuturesStatusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#changeAutoRepayFuturesStatus");
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
| **changeAutoRepayFuturesStatusRequest** | [**ChangeAutoRepayFuturesStatusRequest**](ChangeAutoRepayFuturesStatusRequest.md)|  | |

### Return type

[**ChangeAutoRepayFuturesStatusResponse**](ChangeAutoRepayFuturesStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Auto-repay-futures Status |  -  |

<a id="changeCmInitialLeverage"></a>
# **changeCmInitialLeverage**
> ChangeCmInitialLeverageResponse changeCmInitialLeverage(changeCmInitialLeverageRequest)

Change CM Initial Leverage (TRADE)

Change user&#39;s initial leverage of specific symbol in CM.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    ChangeCmInitialLeverageRequest changeCmInitialLeverageRequest = new ChangeCmInitialLeverageRequest(); // ChangeCmInitialLeverageRequest | 
    try {
      ChangeCmInitialLeverageResponse result = apiInstance.changeCmInitialLeverage(changeCmInitialLeverageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#changeCmInitialLeverage");
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
| **changeCmInitialLeverageRequest** | [**ChangeCmInitialLeverageRequest**](ChangeCmInitialLeverageRequest.md)|  | |

### Return type

[**ChangeCmInitialLeverageResponse**](ChangeCmInitialLeverageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change CM Initial Leverage |  -  |

<a id="changeCmPositionMode"></a>
# **changeCmPositionMode**
> ChangeCmPositionModeResponse changeCmPositionMode(changeCmPositionModeRequest)

Change CM Position Mode(TRADE)

Change user&#39;s position mode (Hedge Mode or One-way Mode ) on EVERY symbol in CM  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    ChangeCmPositionModeRequest changeCmPositionModeRequest = new ChangeCmPositionModeRequest(); // ChangeCmPositionModeRequest | 
    try {
      ChangeCmPositionModeResponse result = apiInstance.changeCmPositionMode(changeCmPositionModeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#changeCmPositionMode");
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
| **changeCmPositionModeRequest** | [**ChangeCmPositionModeRequest**](ChangeCmPositionModeRequest.md)|  | |

### Return type

[**ChangeCmPositionModeResponse**](ChangeCmPositionModeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change CM Position Mode |  -  |

<a id="changeUmInitialLeverage"></a>
# **changeUmInitialLeverage**
> ChangeUmInitialLeverageResponse changeUmInitialLeverage(changeUmInitialLeverageRequest)

Change UM Initial Leverage(TRADE)

Change user&#39;s initial leverage of specific symbol in UM.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    ChangeUmInitialLeverageRequest changeUmInitialLeverageRequest = new ChangeUmInitialLeverageRequest(); // ChangeUmInitialLeverageRequest | 
    try {
      ChangeUmInitialLeverageResponse result = apiInstance.changeUmInitialLeverage(changeUmInitialLeverageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#changeUmInitialLeverage");
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
| **changeUmInitialLeverageRequest** | [**ChangeUmInitialLeverageRequest**](ChangeUmInitialLeverageRequest.md)|  | |

### Return type

[**ChangeUmInitialLeverageResponse**](ChangeUmInitialLeverageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change UM Initial Leverage |  -  |

<a id="changeUmPositionMode"></a>
# **changeUmPositionMode**
> ChangeUmPositionModeResponse changeUmPositionMode(changeUmPositionModeRequest)

Change UM Position Mode(TRADE)

Change user&#39;s position mode (Hedge Mode or One-way Mode ) on EVERY symbol in UM  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    ChangeUmPositionModeRequest changeUmPositionModeRequest = new ChangeUmPositionModeRequest(); // ChangeUmPositionModeRequest | 
    try {
      ChangeUmPositionModeResponse result = apiInstance.changeUmPositionMode(changeUmPositionModeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#changeUmPositionMode");
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
| **changeUmPositionModeRequest** | [**ChangeUmPositionModeRequest**](ChangeUmPositionModeRequest.md)|  | |

### Return type

[**ChangeUmPositionModeResponse**](ChangeUmPositionModeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change UM Position Mode |  -  |

<a id="cmNotionalAndLeverageBrackets"></a>
# **cmNotionalAndLeverageBrackets**
> CmNotionalAndLeverageBracketsResponse cmNotionalAndLeverageBrackets(symbol, recvWindow)

CM Notional and Leverage Brackets(USER_DATA)

Query CM notional and leverage brackets  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      CmNotionalAndLeverageBracketsResponse result = apiInstance.cmNotionalAndLeverageBrackets(symbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#cmNotionalAndLeverageBrackets");
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
| **symbol** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**CmNotionalAndLeverageBracketsResponse**](CmNotionalAndLeverageBracketsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | CM Notional and Leverage Brackets |  -  |

<a id="fundAutoCollection"></a>
# **fundAutoCollection**
> FundAutoCollectionResponse fundAutoCollection(fundAutoCollectionRequest)

Fund Auto-collection(TRADE)

Fund collection for Portfolio Margin  * The BNB would not be collected from UM-PM account to the Portfolio Margin account. * You can only use this function 500 times per hour in a rolling manner.  Weight: 750

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    FundAutoCollectionRequest fundAutoCollectionRequest = new FundAutoCollectionRequest(); // FundAutoCollectionRequest | 
    try {
      FundAutoCollectionResponse result = apiInstance.fundAutoCollection(fundAutoCollectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#fundAutoCollection");
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
| **fundAutoCollectionRequest** | [**FundAutoCollectionRequest**](FundAutoCollectionRequest.md)|  | |

### Return type

[**FundAutoCollectionResponse**](FundAutoCollectionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fund Auto-collection |  -  |

<a id="fundCollectionByAsset"></a>
# **fundCollectionByAsset**
> FundCollectionByAssetResponse fundCollectionByAsset(fundCollectionByAssetRequest)

Fund Collection by Asset(TRADE)

Transfers specific asset from Futures Account to Margin account  * The BNB transfer is not be supported  Weight: 30

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    FundCollectionByAssetRequest fundCollectionByAssetRequest = new FundCollectionByAssetRequest(); // FundCollectionByAssetRequest | 
    try {
      FundCollectionByAssetResponse result = apiInstance.fundCollectionByAsset(fundCollectionByAssetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#fundCollectionByAsset");
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
| **fundCollectionByAssetRequest** | [**FundCollectionByAssetRequest**](FundCollectionByAssetRequest.md)|  | |

### Return type

[**FundCollectionByAssetResponse**](FundCollectionByAssetResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fund Collection by Asset |  -  |

<a id="getAutoRepayFuturesStatus"></a>
# **getAutoRepayFuturesStatus**
> GetAutoRepayFuturesStatusResponse getAutoRepayFuturesStatus(recvWindow)

Get Auto-repay-futures Status(USER_DATA)

Query Auto-repay-futures Status  Weight: 30

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      GetAutoRepayFuturesStatusResponse result = apiInstance.getAutoRepayFuturesStatus(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getAutoRepayFuturesStatus");
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
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetAutoRepayFuturesStatusResponse**](GetAutoRepayFuturesStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Auto-repay-futures Status |  -  |

<a id="getCmAccountDetail"></a>
# **getCmAccountDetail**
> GetCmAccountDetailResponse getCmAccountDetail(recvWindow)

Get CM Account Detail(USER_DATA)

Get current CM account asset and position information.  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      GetCmAccountDetailResponse result = apiInstance.getCmAccountDetail(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getCmAccountDetail");
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
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetCmAccountDetailResponse**](GetCmAccountDetailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get CM Account Detail |  -  |

<a id="getCmCurrentPositionMode"></a>
# **getCmCurrentPositionMode**
> GetCmCurrentPositionModeResponse getCmCurrentPositionMode(recvWindow)

Get CM Current Position Mode(USER_DATA)

Get user&#39;s position mode (Hedge Mode or One-way Mode ) on EVERY symbol in CM  Weight: 30

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      GetCmCurrentPositionModeResponse result = apiInstance.getCmCurrentPositionMode(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getCmCurrentPositionMode");
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
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetCmCurrentPositionModeResponse**](GetCmCurrentPositionModeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get CM Current Position Mode |  -  |

<a id="getCmIncomeHistory"></a>
# **getCmIncomeHistory**
> GetCmIncomeHistoryResponse getCmIncomeHistory(symbol, incomeType, startTime, endTime, page, limit, recvWindow)

Get CM Income History(USER_DATA)

Get CM Income History   * If &#x60;incomeType&#x60; is not sent, all kinds of flow will be returned * \&quot;trandId\&quot; is unique in the same \&quot;incomeType\&quot; for a user * The interval between &#x60;startTime&#x60; and &#x60;endTime&#x60; can not exceed 200 days: * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, the last 200 days will be returned  Weight: 30

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    String incomeType = "incomeType_example"; // String | TRANSFER, WELCOME_BONUS, REALIZED_PNL, FUNDING_FEE, COMMISSION, INSURANCE_CLEAR, REFERRAL_KICKBACK, COMMISSION_REBATE, API_REBATE, CONTEST_REWARD, CROSS_COLLATERAL_TRANSFER, OPTIONS_PREMIUM_FEE, OPTIONS_SETTLE_PROFIT, INTERNAL_TRANSFER, AUTO_EXCHANGE, DELIVERED_SETTELMENT, COIN_SWAP_DEPOSIT, COIN_SWAP_WITHDRAW, POSITION_LIMIT_INCREASE_FEE
    Long startTime = 56L; // Long | Timestamp in ms to get funding from INCLUSIVE.
    Long endTime = 56L; // Long | Timestamp in ms to get funding until INCLUSIVE.
    Long page = 56L; // Long | 
    Long limit = 56L; // Long | Default 100; max 1000
    Long recvWindow = 56L; // Long | 
    try {
      GetCmIncomeHistoryResponse result = apiInstance.getCmIncomeHistory(symbol, incomeType, startTime, endTime, page, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getCmIncomeHistory");
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
| **symbol** | **String**|  | [optional] |
| **incomeType** | **String**| TRANSFER, WELCOME_BONUS, REALIZED_PNL, FUNDING_FEE, COMMISSION, INSURANCE_CLEAR, REFERRAL_KICKBACK, COMMISSION_REBATE, API_REBATE, CONTEST_REWARD, CROSS_COLLATERAL_TRANSFER, OPTIONS_PREMIUM_FEE, OPTIONS_SETTLE_PROFIT, INTERNAL_TRANSFER, AUTO_EXCHANGE, DELIVERED_SETTELMENT, COIN_SWAP_DEPOSIT, COIN_SWAP_WITHDRAW, POSITION_LIMIT_INCREASE_FEE | [optional] |
| **startTime** | **Long**| Timestamp in ms to get funding from INCLUSIVE. | [optional] |
| **endTime** | **Long**| Timestamp in ms to get funding until INCLUSIVE. | [optional] |
| **page** | **Long**|  | [optional] |
| **limit** | **Long**| Default 100; max 1000 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetCmIncomeHistoryResponse**](GetCmIncomeHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get CM Income History |  -  |

<a id="getDownloadIdForUmFuturesOrderHistory"></a>
# **getDownloadIdForUmFuturesOrderHistory**
> GetDownloadIdForUmFuturesOrderHistoryResponse getDownloadIdForUmFuturesOrderHistory(startTime, endTime, recvWindow)

Get Download Id For UM Futures Order History (USER_DATA)

Get download id for UM futures order history  * Request Limitation is 10 times per month, shared by front end download page and rest api * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; can not be longer than 1 year  Weight: 1500

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long recvWindow = 56L; // Long | 
    try {
      GetDownloadIdForUmFuturesOrderHistoryResponse result = apiInstance.getDownloadIdForUmFuturesOrderHistory(startTime, endTime, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getDownloadIdForUmFuturesOrderHistory");
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
| **startTime** | **Long**|  | |
| **endTime** | **Long**|  | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetDownloadIdForUmFuturesOrderHistoryResponse**](GetDownloadIdForUmFuturesOrderHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Download Id For UM Futures Order History |  -  |

<a id="getDownloadIdForUmFuturesTradeHistory"></a>
# **getDownloadIdForUmFuturesTradeHistory**
> GetDownloadIdForUmFuturesTradeHistoryResponse getDownloadIdForUmFuturesTradeHistory(startTime, endTime, recvWindow)

Get Download Id For UM Futures Trade History (USER_DATA)

Get download id for UM futures trade history  * Request Limitation is 5 times per month, shared by front end download page and rest api * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; can not be longer than 1 year  Weight: 1500

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long recvWindow = 56L; // Long | 
    try {
      GetDownloadIdForUmFuturesTradeHistoryResponse result = apiInstance.getDownloadIdForUmFuturesTradeHistory(startTime, endTime, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getDownloadIdForUmFuturesTradeHistory");
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
| **startTime** | **Long**|  | |
| **endTime** | **Long**|  | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetDownloadIdForUmFuturesTradeHistoryResponse**](GetDownloadIdForUmFuturesTradeHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Download Id For UM Futures Trade History |  -  |

<a id="getDownloadIdForUmFuturesTransactionHistory"></a>
# **getDownloadIdForUmFuturesTransactionHistory**
> GetDownloadIdForUmFuturesTransactionHistoryResponse getDownloadIdForUmFuturesTransactionHistory(startTime, endTime, recvWindow)

Get Download Id For UM Futures Transaction History (USER_DATA)

Get download id for UM futures transaction history  * Request Limitation is 5 times per month, shared by front end download page and rest api * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; can not be longer than 1 year  Weight: 1500

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long recvWindow = 56L; // Long | 
    try {
      GetDownloadIdForUmFuturesTransactionHistoryResponse result = apiInstance.getDownloadIdForUmFuturesTransactionHistory(startTime, endTime, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getDownloadIdForUmFuturesTransactionHistory");
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
| **startTime** | **Long**|  | |
| **endTime** | **Long**|  | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetDownloadIdForUmFuturesTransactionHistoryResponse**](GetDownloadIdForUmFuturesTransactionHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Download Id For UM Futures Transaction History |  -  |

<a id="getMarginBorrowLoanInterestHistory"></a>
# **getMarginBorrowLoanInterestHistory**
> GetMarginBorrowLoanInterestHistoryResponse getMarginBorrowLoanInterestHistory(asset, startTime, endTime, current, size, archived, recvWindow)

Get Margin Borrow/Loan Interest History(USER_DATA)

Get Margin Borrow/Loan Interest History   * Response in descending order * The max interval between startTime and endTime is 30 days. It is a MUST to ensure data correctness. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; not sent, return records of the last 7 days by default * If &#x60;startTime&#x60; is sent and &#x60;endTime&#x60; is not sent, the records from &#x60;startTime&#x60; to the present will be returned; if &#x60;startTime&#x60; is more than 30 days ago, the records of the past 30 days will be returned. * If &#x60;startTime&#x60; is not sent and &#x60;endTime&#x60; is sent, the records of the 7 days before &#x60;endTime&#x60; is returned. * Type in response has 5 enums: * &#x60;PERIODIC&#x60; interest charged per hour * &#x60;ON_BORROW&#x60; first interest charged on borrow * &#x60;PERIODIC_CONVERTED&#x60; interest charged per hour converted into BNB * &#x60;ON_BORROW_CONVERTED&#x60; first interest charged on borrow converted into BNB * &#x60;PORTFOLIO&#x60; Portfolio Margin negative balance daily interest  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String asset = "asset_example"; // String | 
    Long startTime = 56L; // Long | Timestamp in ms to get funding from INCLUSIVE.
    Long endTime = 56L; // Long | Timestamp in ms to get funding until INCLUSIVE.
    Long current = 56L; // Long | Currently querying page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10 Max:100
    String archived = "archived_example"; // String | Default: `false`. Set to `true` for archived data from 6 months ago
    Long recvWindow = 56L; // Long | 
    try {
      GetMarginBorrowLoanInterestHistoryResponse result = apiInstance.getMarginBorrowLoanInterestHistory(asset, startTime, endTime, current, size, archived, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getMarginBorrowLoanInterestHistory");
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
| **startTime** | **Long**| Timestamp in ms to get funding from INCLUSIVE. | [optional] |
| **endTime** | **Long**| Timestamp in ms to get funding until INCLUSIVE. | [optional] |
| **current** | **Long**| Currently querying page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10 Max:100 | [optional] |
| **archived** | **String**| Default: &#x60;false&#x60;. Set to &#x60;true&#x60; for archived data from 6 months ago | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetMarginBorrowLoanInterestHistoryResponse**](GetMarginBorrowLoanInterestHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Margin Borrow/Loan Interest History |  -  |

<a id="getUmAccountDetail"></a>
# **getUmAccountDetail**
> GetUmAccountDetailResponse getUmAccountDetail(recvWindow)

Get UM Account Detail(USER_DATA)

Get current UM account asset and position information.  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      GetUmAccountDetailResponse result = apiInstance.getUmAccountDetail(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getUmAccountDetail");
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
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetUmAccountDetailResponse**](GetUmAccountDetailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get UM Account Detail |  -  |

<a id="getUmAccountDetailV2"></a>
# **getUmAccountDetailV2**
> GetUmAccountDetailV2Response getUmAccountDetailV2(recvWindow)

Get UM Account Detail V2(USER_DATA)

Get current UM account asset and position information.  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      GetUmAccountDetailV2Response result = apiInstance.getUmAccountDetailV2(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getUmAccountDetailV2");
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
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetUmAccountDetailV2Response**](GetUmAccountDetailV2Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get UM Account Detail V2 |  -  |

<a id="getUmCurrentPositionMode"></a>
# **getUmCurrentPositionMode**
> GetUmCurrentPositionModeResponse getUmCurrentPositionMode(recvWindow)

Get UM Current Position Mode(USER_DATA)

Get user&#39;s position mode (Hedge Mode or One-way Mode ) on EVERY symbol in UM  Weight: 30

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      GetUmCurrentPositionModeResponse result = apiInstance.getUmCurrentPositionMode(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getUmCurrentPositionMode");
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
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetUmCurrentPositionModeResponse**](GetUmCurrentPositionModeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get UM Current Position Mode |  -  |

<a id="getUmFuturesOrderDownloadLinkById"></a>
# **getUmFuturesOrderDownloadLinkById**
> GetUmFuturesOrderDownloadLinkByIdResponse getUmFuturesOrderDownloadLinkById(downloadId, recvWindow)

Get UM Futures Order Download Link by Id(USER_DATA)

Get UM futures order download link by Id  * Download link expiration: 24h  Weight: 10

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String downloadId = "downloadId_example"; // String | get by download id api
    Long recvWindow = 56L; // Long | 
    try {
      GetUmFuturesOrderDownloadLinkByIdResponse result = apiInstance.getUmFuturesOrderDownloadLinkById(downloadId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getUmFuturesOrderDownloadLinkById");
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
| **downloadId** | **String**| get by download id api | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetUmFuturesOrderDownloadLinkByIdResponse**](GetUmFuturesOrderDownloadLinkByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get UM Futures Order Download Link by Id |  -  |

<a id="getUmFuturesTradeDownloadLinkById"></a>
# **getUmFuturesTradeDownloadLinkById**
> GetUmFuturesTradeDownloadLinkByIdResponse getUmFuturesTradeDownloadLinkById(downloadId, recvWindow)

Get UM Futures Trade Download Link by Id(USER_DATA)

Get UM futures trade download link by Id  * Download link expiration: 24h  Weight: 10

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String downloadId = "downloadId_example"; // String | get by download id api
    Long recvWindow = 56L; // Long | 
    try {
      GetUmFuturesTradeDownloadLinkByIdResponse result = apiInstance.getUmFuturesTradeDownloadLinkById(downloadId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getUmFuturesTradeDownloadLinkById");
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
| **downloadId** | **String**| get by download id api | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetUmFuturesTradeDownloadLinkByIdResponse**](GetUmFuturesTradeDownloadLinkByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get UM Futures Trade Download Link by Id |  -  |

<a id="getUmFuturesTransactionDownloadLinkById"></a>
# **getUmFuturesTransactionDownloadLinkById**
> GetUmFuturesTransactionDownloadLinkByIdResponse getUmFuturesTransactionDownloadLinkById(downloadId, recvWindow)

Get UM Futures Transaction Download Link by Id(USER_DATA)

Get UM futures Transaction download link by Id  * Download link expiration: 24h  Weight: 10

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String downloadId = "downloadId_example"; // String | get by download id api
    Long recvWindow = 56L; // Long | 
    try {
      GetUmFuturesTransactionDownloadLinkByIdResponse result = apiInstance.getUmFuturesTransactionDownloadLinkById(downloadId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getUmFuturesTransactionDownloadLinkById");
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
| **downloadId** | **String**| get by download id api | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetUmFuturesTransactionDownloadLinkByIdResponse**](GetUmFuturesTransactionDownloadLinkByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get UM Futures Transaction Download Link by Id |  -  |

<a id="getUmIncomeHistory"></a>
# **getUmIncomeHistory**
> GetUmIncomeHistoryResponse getUmIncomeHistory(symbol, incomeType, startTime, endTime, page, limit, recvWindow)

Get UM Income History(USER_DATA)

Get UM Income History  * If neither &#x60;startTime&#x60; nor &#x60;endTime&#x60; is sent, the recent 7-day data will be returned. * If &#x60;incomeType&#x60; is not sent, all kinds of flow will be returned * \&quot;trandId\&quot; is unique in the same incomeType for a user * Income history only contains data for the last three months  Weight: 30

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    String incomeType = "incomeType_example"; // String | TRANSFER, WELCOME_BONUS, REALIZED_PNL, FUNDING_FEE, COMMISSION, INSURANCE_CLEAR, REFERRAL_KICKBACK, COMMISSION_REBATE, API_REBATE, CONTEST_REWARD, CROSS_COLLATERAL_TRANSFER, OPTIONS_PREMIUM_FEE, OPTIONS_SETTLE_PROFIT, INTERNAL_TRANSFER, AUTO_EXCHANGE, DELIVERED_SETTELMENT, COIN_SWAP_DEPOSIT, COIN_SWAP_WITHDRAW, POSITION_LIMIT_INCREASE_FEE
    Long startTime = 56L; // Long | Timestamp in ms to get funding from INCLUSIVE.
    Long endTime = 56L; // Long | Timestamp in ms to get funding until INCLUSIVE.
    Long page = 56L; // Long | 
    Long limit = 56L; // Long | Default 100; max 1000
    Long recvWindow = 56L; // Long | 
    try {
      GetUmIncomeHistoryResponse result = apiInstance.getUmIncomeHistory(symbol, incomeType, startTime, endTime, page, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getUmIncomeHistory");
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
| **symbol** | **String**|  | [optional] |
| **incomeType** | **String**| TRANSFER, WELCOME_BONUS, REALIZED_PNL, FUNDING_FEE, COMMISSION, INSURANCE_CLEAR, REFERRAL_KICKBACK, COMMISSION_REBATE, API_REBATE, CONTEST_REWARD, CROSS_COLLATERAL_TRANSFER, OPTIONS_PREMIUM_FEE, OPTIONS_SETTLE_PROFIT, INTERNAL_TRANSFER, AUTO_EXCHANGE, DELIVERED_SETTELMENT, COIN_SWAP_DEPOSIT, COIN_SWAP_WITHDRAW, POSITION_LIMIT_INCREASE_FEE | [optional] |
| **startTime** | **Long**| Timestamp in ms to get funding from INCLUSIVE. | [optional] |
| **endTime** | **Long**| Timestamp in ms to get funding until INCLUSIVE. | [optional] |
| **page** | **Long**|  | [optional] |
| **limit** | **Long**| Default 100; max 1000 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetUmIncomeHistoryResponse**](GetUmIncomeHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get UM Income History |  -  |

<a id="getUserCommissionRateForCm"></a>
# **getUserCommissionRateForCm**
> GetUserCommissionRateForCmResponse getUserCommissionRateForCm(symbol, recvWindow)

Get User Commission Rate for CM(USER_DATA)

Get User Commission Rate for CM  Weight: 20

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      GetUserCommissionRateForCmResponse result = apiInstance.getUserCommissionRateForCm(symbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getUserCommissionRateForCm");
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
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetUserCommissionRateForCmResponse**](GetUserCommissionRateForCmResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get User Commission Rate for CM |  -  |

<a id="getUserCommissionRateForUm"></a>
# **getUserCommissionRateForUm**
> GetUserCommissionRateForUmResponse getUserCommissionRateForUm(symbol, recvWindow)

Get User Commission Rate for UM(USER_DATA)

Get User Commission Rate for UM  Weight: 20

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      GetUserCommissionRateForUmResponse result = apiInstance.getUserCommissionRateForUm(symbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getUserCommissionRateForUm");
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
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetUserCommissionRateForUmResponse**](GetUserCommissionRateForUmResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get User Commission Rate for UM |  -  |

<a id="marginMaxBorrow"></a>
# **marginMaxBorrow**
> MarginMaxBorrowResponse marginMaxBorrow(asset, recvWindow)

Margin Max Borrow(USER_DATA)

Query margin max borrow  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String asset = "asset_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      MarginMaxBorrowResponse result = apiInstance.marginMaxBorrow(asset, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#marginMaxBorrow");
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
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**MarginMaxBorrowResponse**](MarginMaxBorrowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Max Borrow |  -  |

<a id="portfolioMarginUmTradingQuantitativeRulesIndicators"></a>
# **portfolioMarginUmTradingQuantitativeRulesIndicators**
> PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponse portfolioMarginUmTradingQuantitativeRulesIndicators(symbol, recvWindow)

Portfolio Margin UM Trading Quantitative Rules Indicators(USER_DATA)

Portfolio Margin UM Trading Quantitative Rules Indicators  Weight: 1 for a single symbol 10 when the symbol parameter is omitted

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponse result = apiInstance.portfolioMarginUmTradingQuantitativeRulesIndicators(symbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#portfolioMarginUmTradingQuantitativeRulesIndicators");
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
| **symbol** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponse**](PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Portfolio Margin UM Trading Quantitative Rules Indicators |  -  |

<a id="queryCmPositionInformation"></a>
# **queryCmPositionInformation**
> QueryCmPositionInformationResponse queryCmPositionInformation(marginAsset, pair, recvWindow)

Query CM Position Information(USER_DATA)

Get current CM position information.  * If neither &#x60;marginAsset&#x60; nor &#x60;pair&#x60; is sent, positions of all symbols with &#x60;TRADING&#x60; status will be returned. * for One-way Mode user, the response will only show the \&quot;BOTH\&quot; positions * for Hedge Mode user, the response will show \&quot;LONG\&quot;, and \&quot;SHORT\&quot; positions. * Please use with user data stream &#x60;ACCOUNT_UPDATE&#x60; to meet your timeliness and accuracy needs.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String marginAsset = "marginAsset_example"; // String | 
    String pair = "pair_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      QueryCmPositionInformationResponse result = apiInstance.queryCmPositionInformation(marginAsset, pair, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#queryCmPositionInformation");
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
| **marginAsset** | **String**|  | [optional] |
| **pair** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryCmPositionInformationResponse**](QueryCmPositionInformationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | CM Position Information |  -  |

<a id="queryMarginLoanRecord"></a>
# **queryMarginLoanRecord**
> QueryMarginLoanRecordResponse queryMarginLoanRecord(asset, txId, startTime, endTime, current, size, archived, recvWindow)

Query Margin Loan Record(USER_DATA)

Query margin loan record  * txId or startTime must be sent. txId takes precedence. * Response in descending order * The max interval between &#x60;startTime&#x60; and &#x60;endTime&#x60; is 30 days. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; not sent, return records of the last 7 days by default * Set &#x60;archived&#x60; to &#x60;true&#x60; to query data from 6 months ago  Weight: 10

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String asset = "asset_example"; // String | 
    Long txId = 56L; // Long | the `tranId` in `POST/papi/v1/marginLoan`
    Long startTime = 56L; // Long | Timestamp in ms to get funding from INCLUSIVE.
    Long endTime = 56L; // Long | Timestamp in ms to get funding until INCLUSIVE.
    Long current = 56L; // Long | Currently querying page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10 Max:100
    String archived = "archived_example"; // String | Default: `false`. Set to `true` for archived data from 6 months ago
    Long recvWindow = 56L; // Long | 
    try {
      QueryMarginLoanRecordResponse result = apiInstance.queryMarginLoanRecord(asset, txId, startTime, endTime, current, size, archived, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#queryMarginLoanRecord");
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
| **txId** | **Long**| the &#x60;tranId&#x60; in &#x60;POST/papi/v1/marginLoan&#x60; | [optional] |
| **startTime** | **Long**| Timestamp in ms to get funding from INCLUSIVE. | [optional] |
| **endTime** | **Long**| Timestamp in ms to get funding until INCLUSIVE. | [optional] |
| **current** | **Long**| Currently querying page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10 Max:100 | [optional] |
| **archived** | **String**| Default: &#x60;false&#x60;. Set to &#x60;true&#x60; for archived data from 6 months ago | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryMarginLoanRecordResponse**](QueryMarginLoanRecordResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Loan Record |  -  |

<a id="queryMarginMaxWithdraw"></a>
# **queryMarginMaxWithdraw**
> QueryMarginMaxWithdrawResponse queryMarginMaxWithdraw(asset, recvWindow)

Query Margin Max Withdraw(USER_DATA)

Query Margin Max Withdraw  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String asset = "asset_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      QueryMarginMaxWithdrawResponse result = apiInstance.queryMarginMaxWithdraw(asset, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#queryMarginMaxWithdraw");
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
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryMarginMaxWithdrawResponse**](QueryMarginMaxWithdrawResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Max Withdraw |  -  |

<a id="queryMarginRepayRecord"></a>
# **queryMarginRepayRecord**
> QueryMarginRepayRecordResponse queryMarginRepayRecord(asset, txId, startTime, endTime, current, size, archived, recvWindow)

Query Margin repay Record(USER_DATA)

Query margin repay record.  * txId or startTime must be sent. txId takes precedence. * Response in descending order * The max interval between &#x60;startTime&#x60; and &#x60;endTime&#x60; is 30 days. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; not sent, return records of the last 7 days by default * Set &#x60;archived&#x60; to &#x60;true&#x60; to query data from 6 months ago  Weight: 10

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String asset = "asset_example"; // String | 
    Long txId = 56L; // Long | the `tranId` in `POST/papi/v1/marginLoan`
    Long startTime = 56L; // Long | Timestamp in ms to get funding from INCLUSIVE.
    Long endTime = 56L; // Long | Timestamp in ms to get funding until INCLUSIVE.
    Long current = 56L; // Long | Currently querying page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10 Max:100
    String archived = "archived_example"; // String | Default: `false`. Set to `true` for archived data from 6 months ago
    Long recvWindow = 56L; // Long | 
    try {
      QueryMarginRepayRecordResponse result = apiInstance.queryMarginRepayRecord(asset, txId, startTime, endTime, current, size, archived, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#queryMarginRepayRecord");
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
| **txId** | **Long**| the &#x60;tranId&#x60; in &#x60;POST/papi/v1/marginLoan&#x60; | [optional] |
| **startTime** | **Long**| Timestamp in ms to get funding from INCLUSIVE. | [optional] |
| **endTime** | **Long**| Timestamp in ms to get funding until INCLUSIVE. | [optional] |
| **current** | **Long**| Currently querying page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10 Max:100 | [optional] |
| **archived** | **String**| Default: &#x60;false&#x60;. Set to &#x60;true&#x60; for archived data from 6 months ago | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryMarginRepayRecordResponse**](QueryMarginRepayRecordResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin repay Record |  -  |

<a id="queryPortfolioMarginNegativeBalanceInterestHistory"></a>
# **queryPortfolioMarginNegativeBalanceInterestHistory**
> QueryPortfolioMarginNegativeBalanceInterestHistoryResponse queryPortfolioMarginNegativeBalanceInterestHistory(asset, startTime, endTime, size, recvWindow)

Query Portfolio Margin Negative Balance Interest History(USER_DATA)

Query interest history of negative balance for portfolio margin.  * Response in descending order * The max interval between startTime and endTime is 30 days. It is a MUST to ensure data correctness. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; not sent, return records of the last 7 days by default * If &#x60;startTime&#x60; is sent and &#x60;endTime&#x60; is not sent, the records from &#x60;startTime&#x60; to the present will be returned; if &#x60;startTime&#x60; is more than 30 days ago, the records of the past 30 days will be returned. * If &#x60;startTime&#x60; is not sent and &#x60;endTime&#x60; is sent, the records of the 7 days before &#x60;endTime&#x60; is returned.  Weight: 50

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String asset = "asset_example"; // String | 
    Long startTime = 56L; // Long | Timestamp in ms to get funding from INCLUSIVE.
    Long endTime = 56L; // Long | Timestamp in ms to get funding until INCLUSIVE.
    Long size = 56L; // Long | Default:10 Max:100
    Long recvWindow = 56L; // Long | 
    try {
      QueryPortfolioMarginNegativeBalanceInterestHistoryResponse result = apiInstance.queryPortfolioMarginNegativeBalanceInterestHistory(asset, startTime, endTime, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#queryPortfolioMarginNegativeBalanceInterestHistory");
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
| **startTime** | **Long**| Timestamp in ms to get funding from INCLUSIVE. | [optional] |
| **endTime** | **Long**| Timestamp in ms to get funding until INCLUSIVE. | [optional] |
| **size** | **Long**| Default:10 Max:100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryPortfolioMarginNegativeBalanceInterestHistoryResponse**](QueryPortfolioMarginNegativeBalanceInterestHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Portfolio Margin Negative Balance Interest History |  -  |

<a id="queryUmPositionInformation"></a>
# **queryUmPositionInformation**
> QueryUmPositionInformationResponse queryUmPositionInformation(symbol, recvWindow)

Query UM Position Information(USER_DATA)

Get current UM position information.  * Please use with user data stream &#x60;ACCOUNT_UPDATE&#x60; to meet your timeliness and accuracy needs. * for One-way Mode user, the response will only show the \&quot;BOTH\&quot; positions * for Hedge Mode user, the response will show \&quot;LONG\&quot;, and \&quot;SHORT\&quot; positions.  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      QueryUmPositionInformationResponse result = apiInstance.queryUmPositionInformation(symbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#queryUmPositionInformation");
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
| **symbol** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryUmPositionInformationResponse**](QueryUmPositionInformationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | UM Position Information |  -  |

<a id="queryUserNegativeBalanceAutoExchangeRecord"></a>
# **queryUserNegativeBalanceAutoExchangeRecord**
> QueryUserNegativeBalanceAutoExchangeRecordResponse queryUserNegativeBalanceAutoExchangeRecord(startTime, endTime, recvWindow)

Query User Negative Balance Auto Exchange Record (USER_DATA)

Query user negative balance auto exchange record  * Response in descending order * The max interval between &#x60;startTime&#x60; and &#x60;endTime&#x60; is 3 months.  Weight: 100

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long recvWindow = 56L; // Long | 
    try {
      QueryUserNegativeBalanceAutoExchangeRecordResponse result = apiInstance.queryUserNegativeBalanceAutoExchangeRecord(startTime, endTime, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#queryUserNegativeBalanceAutoExchangeRecord");
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
| **startTime** | **Long**|  | |
| **endTime** | **Long**|  | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryUserNegativeBalanceAutoExchangeRecordResponse**](QueryUserNegativeBalanceAutoExchangeRecordResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User Negative Balance Auto Exchange Record |  -  |

<a id="queryUserRateLimit"></a>
# **queryUserRateLimit**
> QueryUserRateLimitResponse queryUserRateLimit(recvWindow)

Query User Rate Limit (USER_DATA)

Query User Rate Limit  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      QueryUserRateLimitResponse result = apiInstance.queryUserRateLimit(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#queryUserRateLimit");
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
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryUserRateLimitResponse**](QueryUserRateLimitResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User Rate Limit |  -  |

<a id="repayFuturesNegativeBalance"></a>
# **repayFuturesNegativeBalance**
> RepayFuturesNegativeBalanceResponse repayFuturesNegativeBalance(repayFuturesNegativeBalanceRequest)

Repay futures Negative Balance(USER_DATA)

Repay futures Negative Balance  Weight: 750

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    RepayFuturesNegativeBalanceRequest repayFuturesNegativeBalanceRequest = new RepayFuturesNegativeBalanceRequest(); // RepayFuturesNegativeBalanceRequest | 
    try {
      RepayFuturesNegativeBalanceResponse result = apiInstance.repayFuturesNegativeBalance(repayFuturesNegativeBalanceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#repayFuturesNegativeBalance");
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
| **repayFuturesNegativeBalanceRequest** | [**RepayFuturesNegativeBalanceRequest**](RepayFuturesNegativeBalanceRequest.md)|  | |

### Return type

[**RepayFuturesNegativeBalanceResponse**](RepayFuturesNegativeBalanceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Repay futures Negative Balance |  -  |

<a id="umFuturesAccountConfiguration"></a>
# **umFuturesAccountConfiguration**
> UmFuturesAccountConfigurationResponse umFuturesAccountConfiguration(recvWindow)

UM Futures Account Configuration(USER_DATA)

Query UM Futures account configuration  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      UmFuturesAccountConfigurationResponse result = apiInstance.umFuturesAccountConfiguration(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#umFuturesAccountConfiguration");
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
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**UmFuturesAccountConfigurationResponse**](UmFuturesAccountConfigurationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | UM Futures Account Configuration |  -  |

<a id="umFuturesSymbolConfiguration"></a>
# **umFuturesSymbolConfiguration**
> UmFuturesSymbolConfigurationResponse umFuturesSymbolConfiguration(symbol, recvWindow)

UM Futures Symbol Configuration(USER_DATA)

Get current UM account symbol configuration.  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      UmFuturesSymbolConfigurationResponse result = apiInstance.umFuturesSymbolConfiguration(symbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#umFuturesSymbolConfiguration");
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
| **symbol** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**UmFuturesSymbolConfigurationResponse**](UmFuturesSymbolConfigurationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | UM Futures Symbol Configuration |  -  |

<a id="umNotionalAndLeverageBrackets"></a>
# **umNotionalAndLeverageBrackets**
> UmNotionalAndLeverageBracketsResponse umNotionalAndLeverageBrackets(symbol, recvWindow)

UM Notional and Leverage Brackets (USER_DATA)

Query UM notional and leverage brackets  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://papi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      UmNotionalAndLeverageBracketsResponse result = apiInstance.umNotionalAndLeverageBrackets(symbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#umNotionalAndLeverageBrackets");
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
| **symbol** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**UmNotionalAndLeverageBracketsResponse**](UmNotionalAndLeverageBracketsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | UM Notional and Leverage Brackets |  -  |

