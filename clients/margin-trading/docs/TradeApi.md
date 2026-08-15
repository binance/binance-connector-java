# TradeApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSpecialKey**](TradeApi.md#createSpecialKey) | **POST** /sapi/v1/margin/apiKey | Create Special Key(Low-Latency Trading) (TRADE) |
| [**deleteSpecialKey**](TradeApi.md#deleteSpecialKey) | **DELETE** /sapi/v1/margin/apiKey | Delete Special Key(Low-Latency Trading) (TRADE) |
| [**editIpForSpecialKey**](TradeApi.md#editIpForSpecialKey) | **PUT** /sapi/v1/margin/apiKey/ip | Edit ip for Special Key(Low-Latency Trading) (TRADE) |
| [**exitSpecialKeyMode**](TradeApi.md#exitSpecialKeyMode) | **POST** /sapi/v1/margin/exit-special-key-mode | Exit Special Key Mode (TRADE) |
| [**getForceLiquidationRecord**](TradeApi.md#getForceLiquidationRecord) | **GET** /sapi/v1/margin/forceLiquidationRec | Get Force Liquidation Record (USER_DATA) |
| [**getSmallLiabilityExchangeCoinList**](TradeApi.md#getSmallLiabilityExchangeCoinList) | **GET** /sapi/v1/margin/exchange-small-liability | Get Small Liability Exchange Coin List (USER_DATA) |
| [**getSmallLiabilityExchangeHistory**](TradeApi.md#getSmallLiabilityExchangeHistory) | **GET** /sapi/v1/margin/exchange-small-liability-history | Get Small Liability Exchange History (USER_DATA) |
| [**liquidationLoanRepay**](TradeApi.md#liquidationLoanRepay) | **POST** /sapi/v1/margin/liquidation-loan/repay | Liquidation Loan Repay (MARGIN) |
| [**marginAccountCancelAllOpenOrdersOnASymbol**](TradeApi.md#marginAccountCancelAllOpenOrdersOnASymbol) | **DELETE** /sapi/v1/margin/openOrders | Margin Account Cancel all Open Orders on a Symbol (TRADE) |
| [**marginAccountCancelOco**](TradeApi.md#marginAccountCancelOco) | **DELETE** /sapi/v1/margin/orderList | Margin Account Cancel OCO (TRADE) |
| [**marginAccountCancelOrder**](TradeApi.md#marginAccountCancelOrder) | **DELETE** /sapi/v1/margin/order | Margin Account Cancel Order (TRADE) |
| [**marginAccountNewOco**](TradeApi.md#marginAccountNewOco) | **POST** /sapi/v1/margin/order/oco | Margin Account New OCO (TRADE) |
| [**marginAccountNewOrder**](TradeApi.md#marginAccountNewOrder) | **POST** /sapi/v1/margin/order | Margin Account New Order (TRADE) |
| [**marginAccountNewOto**](TradeApi.md#marginAccountNewOto) | **POST** /sapi/v1/margin/order/oto | Margin Account New OTO (TRADE) |
| [**marginAccountNewOtoco**](TradeApi.md#marginAccountNewOtoco) | **POST** /sapi/v1/margin/order/otoco | Margin Account New OTOCO (TRADE) |
| [**marginManualLiquidation**](TradeApi.md#marginManualLiquidation) | **POST** /sapi/v1/margin/manual-liquidation | Margin Manual Liquidation (TRADE) |
| [**queryCurrentMarginOrderCountUsage**](TradeApi.md#queryCurrentMarginOrderCountUsage) | **GET** /sapi/v1/margin/rateLimit/order | Query Current Margin Order Count Usage (TRADE) |
| [**queryLiquidationLoan**](TradeApi.md#queryLiquidationLoan) | **GET** /sapi/v1/margin/liquidation-loan | Query Liquidation Loan (USER_DATA) |
| [**queryLiquidationLoanRepayHistory**](TradeApi.md#queryLiquidationLoanRepayHistory) | **GET** /sapi/v1/margin/liquidation-loan/repay-history | Query Liquidation Loan Repay History (USER_DATA) |
| [**queryMarginAccountsAllOco**](TradeApi.md#queryMarginAccountsAllOco) | **GET** /sapi/v1/margin/allOrderList | Query Margin Account&#39;s all OCO (USER_DATA) |
| [**queryMarginAccountsAllOrders**](TradeApi.md#queryMarginAccountsAllOrders) | **GET** /sapi/v1/margin/allOrders | Query Margin Account&#39;s All Orders (USER_DATA) |
| [**queryMarginAccountsOco**](TradeApi.md#queryMarginAccountsOco) | **GET** /sapi/v1/margin/orderList | Query Margin Account&#39;s OCO (USER_DATA) |
| [**queryMarginAccountsOpenOco**](TradeApi.md#queryMarginAccountsOpenOco) | **GET** /sapi/v1/margin/openOrderList | Query Margin Account&#39;s Open OCO (USER_DATA) |
| [**queryMarginAccountsOpenOrders**](TradeApi.md#queryMarginAccountsOpenOrders) | **GET** /sapi/v1/margin/openOrders | Query Margin Account&#39;s Open Orders (USER_DATA) |
| [**queryMarginAccountsOrder**](TradeApi.md#queryMarginAccountsOrder) | **GET** /sapi/v1/margin/order | Query Margin Account&#39;s Order (USER_DATA) |
| [**queryMarginAccountsTradeList**](TradeApi.md#queryMarginAccountsTradeList) | **GET** /sapi/v1/margin/myTrades | Query Margin Account&#39;s Trade List (USER_DATA) |
| [**queryPreventedMatches**](TradeApi.md#queryPreventedMatches) | **GET** /sapi/v1/margin/myPreventedMatches | Query Prevented Matches (USER_DATA) |
| [**querySpecialKey**](TradeApi.md#querySpecialKey) | **GET** /sapi/v1/margin/apiKey | Query Special key(Low Latency Trading) (TRADE) |
| [**querySpecialKeyList**](TradeApi.md#querySpecialKeyList) | **GET** /sapi/v1/margin/api-key-list | Query Special key List(Low Latency Trading) (TRADE) |
| [**smallLiabilityExchange**](TradeApi.md#smallLiabilityExchange) | **POST** /sapi/v1/margin/exchange-small-liability | Small Liability Exchange (MARGIN) |


<a id="createSpecialKey"></a>
# **createSpecialKey**
> CreateSpecialKeyResponse createSpecialKey(createSpecialKeyRequest)

Create Special Key(Low-Latency Trading) (TRADE)

**Eligibility**  - Binance Margin offers low-latency trading through a [special key](https://www.binance.com/en/support/faq/frequently-asked-questions-on-margin-special-api-key-3208663e900d4d2e9fec4140e1832f4e), available exclusively to users with VIP level 7 or higher. - If you are VIP level 6 or below, please contact your VIP manager for eligibility criterias. - All new Margin Special Key users are required to read, understand, and agree to the Margin Special Key Supplemental Product Terms at the master account level before creating a Margin Special Key. - Once signed at the master account level, the agreement applies to all sub-accounts. The master account and all sub-accounts (Cross Margin Classic and Portfolio Margin Pro) are authorized to create a Margin Special Key and are subject to the LiquidationLoan policy.  For more information, please refer to [FAQ](https://www.binance.com/en/support/faq/detail/3208663e900d4d2e9fec4140e1832f4e).  **Supported Products:**  - Cross Margin - Isolated Margin - Portfolio Margin Pro  **Unsupported Products:**  - Portfolio Margin  We support several types of API keys:  * Ed25519 (recommended) * HMAC * RSA  We recommend to **use Ed25519 API keys** as it should provide the best performance and security out of all supported key types. We accept PKCS#8 (BEGIN PUBLIC KEY). For how to generate an RSA key pair to send API requests on Binance. Please refer to the document below [FAQ](https://www.binance.com/en/support/faq/how-to-generate-an-rsa-key-pair-to-send-api-requests-on-binance-2b79728f331e43079b27440d9d15c5db) .  **How to use the Margin Special Key** - Use the below &#x60;sapi&#x60; endpoint to create your margin special API Key. - For accessing the Cross Margin account, do not send the &#x60;symbol&#x60; parameter. - For accessing the Isolated Margin account(s), pass the relevant &#x60;symbol&#x60; parameter in the API Key creation request. - Use the generated API Key (and Secret key, if applicable) to perform margin trading and listenKey generation via **Spot** REST API (&#x60;https://api.binance.com/api/v3/_*&#x60;) endpoints.  Read [REST API](/products/spot/rest-api#signed-trade-and-user_data-endpoint-security) or [WebSocket API](/products/spot/web-socket-api#request-security) documentation to learn how to use different API keys  You need to enable Permits “Enable Spot &amp; Margin Trading” option for the API Key which requests this endpoint.  Weight(UID): 1  Security Type: TRADE  Response Notes: - Error Code Description  - **UNSUPPORTED_OPERATION** : Portfolio Margin is an unsupported product, please change the account type to a supported margin product.  - **Forbidden**:  Cross Margin Pro accounts require additional agreements, please contact your relationship manager.

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    CreateSpecialKeyRequest createSpecialKeyRequest = new CreateSpecialKeyRequest(); // CreateSpecialKeyRequest | 
    try {
      CreateSpecialKeyResponse result = apiInstance.createSpecialKey(createSpecialKeyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#createSpecialKey");
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
| **createSpecialKeyRequest** | [**CreateSpecialKeyRequest**](CreateSpecialKeyRequest.md)|  | |

### Return type

[**CreateSpecialKeyResponse**](CreateSpecialKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Special Key |  -  |

<a id="deleteSpecialKey"></a>
# **deleteSpecialKey**
> deleteSpecialKey(apiName, symbol, recvWindow)

Delete Special Key(Low-Latency Trading) (TRADE)

Deleting your Margin Special Key alone does not exit you from the Margin Special Key framework or discharge your obligations under the Margin Special Key Supplemental Product Terms. To fully exit, you must:  1. Delete your Margin Special Key. 2. Ensure there are no outstanding liabilities on the account. 3. Call the Exit Margin Special Key API endpoint. 4. Confirm the exit status via the API response.  Only after step 4 is completed and the exit status is confirmed by Binance will your account revert to standard liquidation logic and no longer be subject to the Margin Special Key Supplemental Product Terms.  If apiKey is given, apiName will be ignored. If apiName is given with no apiKey, all apikeys with given apiName will be deleted.  You need to enable Permits “Enable Spot &amp; Margin” option for the API Key which requests this endpoint.  Weight(UID): 1  Security Type: TRADE

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String apiName = "apiName"; // String | 
    String symbol = "BTCUSDT"; // String | 
    Long recvWindow = 5000L; // Long | 
    try {
      apiInstance.deleteSpecialKey(apiName, symbol, recvWindow);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#deleteSpecialKey");
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
| **apiName** | **String**|  | [optional] |
| **symbol** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="editIpForSpecialKey"></a>
# **editIpForSpecialKey**
> editIpForSpecialKey(editIpForSpecialKeyRequest)

Edit ip for Special Key(Low-Latency Trading) (TRADE)

Edit ip restriction. This only applies to Special Key for Low Latency Trading.  You need to enable Permits “Enable Spot &amp; Margin” option for the API Key which requests this endpoint.  Weight(UID): 1  Security Type: TRADE

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    EditIpForSpecialKeyRequest editIpForSpecialKeyRequest = new EditIpForSpecialKeyRequest(); // EditIpForSpecialKeyRequest | 
    try {
      apiInstance.editIpForSpecialKey(editIpForSpecialKeyRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#editIpForSpecialKey");
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
| **editIpForSpecialKeyRequest** | [**EditIpForSpecialKeyRequest**](EditIpForSpecialKeyRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="exitSpecialKeyMode"></a>
# **exitSpecialKeyMode**
> Object exitSpecialKeyMode(exitSpecialKeyModeRequest)

Exit Special Key Mode (TRADE)

Exit the Margin Special Key mode for Cross Margin Classic accounts.  **All outstanding liabilities under the Cross Margin Classic account must be fully repaid before calling this endpoint.** Deleting the Margin Special Key alone does not constitute a valid exit.  When a user creates a Margin Special API Key, the account enters \&quot;Special Key Mode\&quot;. Upon a successful request, the following actions will be performed atomically:  1. All existing Margin Special API Keys under the Cross Margin Classic mode account will be deleted. 2. All pre-execution margin checks (including Open-order-loss calculation) will revert to standard mode. 3. A cooldown period (default: 24 hours) will be enforced, during which the account will not be permitted to create new Margin Special API Keys.  For more information, please refer to [FAQ](https://www.binance.com/en/support/faq/detail/3208663e900d4d2e9fec4140e1832f4e).  **Preconditions:**  The following conditions must be met; otherwise the request will be rejected:  - Account type must be **Cross Margin Classic**. - Account must currently be in **Special Key Mode**. If not, the request silently succeeds. - Account must **not be in liquidation**. - Account must **have no liability**.  You need to enable \&quot;Permits Enable Spot &amp; Margin Trading\&quot; option for the API Key which requests this endpoint.  Weight(UID): 10  Security Type: TRADE

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    ExitSpecialKeyModeRequest exitSpecialKeyModeRequest = new ExitSpecialKeyModeRequest(); // ExitSpecialKeyModeRequest | 
    try {
      Object result = apiInstance.exitSpecialKeyMode(exitSpecialKeyModeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#exitSpecialKeyMode");
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
| **exitSpecialKeyModeRequest** | [**ExitSpecialKeyModeRequest**](ExitSpecialKeyModeRequest.md)|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Exit Special Key Mode |  -  |

<a id="getForceLiquidationRecord"></a>
# **getForceLiquidationRecord**
> GetForceLiquidationRecordResponse getForceLiquidationRecord(startTime, endTime, isolatedSymbol, current, size, recvWindow)

Get Force Liquidation Record (USER_DATA)

Get Force Liquidation Record  Weight(IP): 1  Security Type: USER_DATA  Notes: - Response in descending order

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    Long startTime = 1623319461670L; // Long | 
    Long endTime = 1641782889000L; // Long | 
    String isolatedSymbol = "BTCUSDT"; // String | 
    Long current = 1L; // Long | 
    Long size = 10L; // Long | 
    Long recvWindow = 5000L; // Long | 
    try {
      GetForceLiquidationRecordResponse result = apiInstance.getForceLiquidationRecord(startTime, endTime, isolatedSymbol, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#getForceLiquidationRecord");
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
| **isolatedSymbol** | **String**|  | [optional] |
| **current** | **Long**|  | [optional] |
| **size** | **Long**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetForceLiquidationRecordResponse**](GetForceLiquidationRecordResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Force Liquidation Record |  -  |

<a id="getSmallLiabilityExchangeCoinList"></a>
# **getSmallLiabilityExchangeCoinList**
> GetSmallLiabilityExchangeCoinListResponse getSmallLiabilityExchangeCoinList(recvWindow)

Get Small Liability Exchange Coin List (USER_DATA)

Query the coins which can be small liability exchange  Weight(IP): 100  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    Long recvWindow = 5000L; // Long | 
    try {
      GetSmallLiabilityExchangeCoinListResponse result = apiInstance.getSmallLiabilityExchangeCoinList(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#getSmallLiabilityExchangeCoinList");
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

[**GetSmallLiabilityExchangeCoinListResponse**](GetSmallLiabilityExchangeCoinListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Small Liability Exchange Coin List |  -  |

<a id="getSmallLiabilityExchangeHistory"></a>
# **getSmallLiabilityExchangeHistory**
> GetSmallLiabilityExchangeHistoryResponse getSmallLiabilityExchangeHistory(current, size, startTime, endTime, recvWindow)

Get Small Liability Exchange History (USER_DATA)

Get Small liability Exchange History  Weight(UID): 100  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    Long current = 1L; // Long | 
    Long size = 10L; // Long | 
    Long startTime = 1623319461670L; // Long | 
    Long endTime = 1641782889000L; // Long | 
    Long recvWindow = 5000L; // Long | 
    try {
      GetSmallLiabilityExchangeHistoryResponse result = apiInstance.getSmallLiabilityExchangeHistory(current, size, startTime, endTime, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#getSmallLiabilityExchangeHistory");
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
| **current** | **Long**|  | |
| **size** | **Long**|  | |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetSmallLiabilityExchangeHistoryResponse**](GetSmallLiabilityExchangeHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Small Liability Exchange History |  -  |

<a id="liquidationLoanRepay"></a>
# **liquidationLoanRepay**
> LiquidationLoanRepayResponse liquidationLoanRepay(liquidationLoanRepayRequest)

Liquidation Loan Repay (MARGIN)

Repays the outstanding cross-margin liquidation loan from the user&#39;s spot wallet. A liquidation loan represents the account deficit incurred when account equity turns negative during liquidation (bankruptcy). The repayment amount must be greater than 0 and cannot exceed the remaining loan balance. If the Spot Account has insufficient USDC balance, the repayment will fail.  Weight(UID): 100  Security Type: MARGIN

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    LiquidationLoanRepayRequest liquidationLoanRepayRequest = new LiquidationLoanRepayRequest(); // LiquidationLoanRepayRequest | 
    try {
      LiquidationLoanRepayResponse result = apiInstance.liquidationLoanRepay(liquidationLoanRepayRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#liquidationLoanRepay");
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
| **liquidationLoanRepayRequest** | [**LiquidationLoanRepayRequest**](LiquidationLoanRepayRequest.md)|  | |

### Return type

[**LiquidationLoanRepayResponse**](LiquidationLoanRepayResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Liquidation Loan Repay |  -  |

<a id="marginAccountCancelAllOpenOrdersOnASymbol"></a>
# **marginAccountCancelAllOpenOrdersOnASymbol**
> MarginAccountCancelAllOpenOrdersOnASymbolResponse marginAccountCancelAllOpenOrdersOnASymbol(symbol, isIsolated, recvWindow)

Margin Account Cancel all Open Orders on a Symbol (TRADE)

Cancels all active orders on a symbol for margin account.&lt;br&gt;&lt;/br&gt; This includes OCO orders.  Weight(IP): 1  Security Type: TRADE

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "BTCUSDT"; // String | 
    IsIsolated isIsolated = IsIsolated.fromValue("TRUE"); // IsIsolated | 
    Long recvWindow = 5000L; // Long | 
    try {
      MarginAccountCancelAllOpenOrdersOnASymbolResponse result = apiInstance.marginAccountCancelAllOpenOrdersOnASymbol(symbol, isIsolated, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#marginAccountCancelAllOpenOrdersOnASymbol");
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
| **isIsolated** | [**IsIsolated**](.md)|  | [optional] [default to FALSE] [enum: TRUE, FALSE] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**MarginAccountCancelAllOpenOrdersOnASymbolResponse**](MarginAccountCancelAllOpenOrdersOnASymbolResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account Cancel all Open Orders on a Symbol |  -  |

<a id="marginAccountCancelOco"></a>
# **marginAccountCancelOco**
> MarginAccountCancelOcoResponse marginAccountCancelOco(symbol, isIsolated, orderListId, listClientOrderId, newClientOrderId, recvWindow)

Margin Account Cancel OCO (TRADE)

Cancel an entire Order List for a margin account.  Weight(UID): 1  Security Type: TRADE  Notes: - Canceling an individual leg will cancel the entire OCO

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "BTCUSDT"; // String | 
    IsIsolated isIsolated = IsIsolated.fromValue("TRUE"); // IsIsolated | 
    Long orderListId = 1L; // Long | 
    String listClientOrderId = "1"; // String | 
    String newClientOrderId = "1"; // String | 
    Long recvWindow = 5000L; // Long | 
    try {
      MarginAccountCancelOcoResponse result = apiInstance.marginAccountCancelOco(symbol, isIsolated, orderListId, listClientOrderId, newClientOrderId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#marginAccountCancelOco");
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
| **isIsolated** | [**IsIsolated**](.md)|  | [optional] [default to FALSE] [enum: TRUE, FALSE] |
| **orderListId** | **Long**|  | [optional] |
| **listClientOrderId** | **String**|  | [optional] |
| **newClientOrderId** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**MarginAccountCancelOcoResponse**](MarginAccountCancelOcoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account Cancel OCO |  -  |

<a id="marginAccountCancelOrder"></a>
# **marginAccountCancelOrder**
> MarginAccountCancelOrderResponse marginAccountCancelOrder(symbol, isIsolated, orderId, origClientOrderId, newClientOrderId, recvWindow)

Margin Account Cancel Order (TRADE)

Cancel an active order for margin account.  Weight(IP): 10  Security Type: TRADE  Notes: - Either orderId or origClientOrderId must be sent.

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "LTCBTC"; // String | 
    IsIsolated isIsolated = IsIsolated.fromValue("TRUE"); // IsIsolated | 
    Long orderId = 1L; // Long | 
    String origClientOrderId = "1"; // String | 
    String newClientOrderId = "1"; // String | 
    Long recvWindow = 5000L; // Long | 
    try {
      MarginAccountCancelOrderResponse result = apiInstance.marginAccountCancelOrder(symbol, isIsolated, orderId, origClientOrderId, newClientOrderId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#marginAccountCancelOrder");
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
| **isIsolated** | [**IsIsolated**](.md)|  | [optional] [default to FALSE] [enum: TRUE, FALSE] |
| **orderId** | **Long**|  | [optional] |
| **origClientOrderId** | **String**|  | [optional] |
| **newClientOrderId** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**MarginAccountCancelOrderResponse**](MarginAccountCancelOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account Cancel Order |  -  |

<a id="marginAccountNewOco"></a>
# **marginAccountNewOco**
> MarginAccountNewOcoResponse marginAccountNewOco(marginAccountNewOcoRequest)

Margin Account New OCO (TRADE)

Send in a new OCO for a margin account  Weight: 6(UID) or 1500(UID) when sideEffectType is MARGIN_BUY or AUTO_BORROW_REPAY  Security Type: TRADE  Notes: - autoRepayAtCancel is suggested to set as “FALSE” to keep liability unrepaid under high frequent new order/cancel order execution

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    MarginAccountNewOcoRequest marginAccountNewOcoRequest = new MarginAccountNewOcoRequest(); // MarginAccountNewOcoRequest | 
    try {
      MarginAccountNewOcoResponse result = apiInstance.marginAccountNewOco(marginAccountNewOcoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#marginAccountNewOco");
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
| **marginAccountNewOcoRequest** | [**MarginAccountNewOcoRequest**](MarginAccountNewOcoRequest.md)|  | |

### Return type

[**MarginAccountNewOcoResponse**](MarginAccountNewOcoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account New OCO |  -  |

<a id="marginAccountNewOrder"></a>
# **marginAccountNewOrder**
> MarginAccountNewOrderResponse marginAccountNewOrder(marginAccountNewOrderRequest)

Margin Account New Order (TRADE)

Post a new order for margin account.  Weight: 6(UID) or 1500(UID) when sideEffectType is MARGIN_BUY or AUTO_BORROW_REPAY  Security Type: TRADE  Notes: - autoRepayAtCancel is suggested to set as “FALSE” to keep liability unrepaid under high frequent new order/cancel order execution

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    MarginAccountNewOrderRequest marginAccountNewOrderRequest = new MarginAccountNewOrderRequest(); // MarginAccountNewOrderRequest | 
    try {
      MarginAccountNewOrderResponse result = apiInstance.marginAccountNewOrder(marginAccountNewOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#marginAccountNewOrder");
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
| **marginAccountNewOrderRequest** | [**MarginAccountNewOrderRequest**](MarginAccountNewOrderRequest.md)|  | |

### Return type

[**MarginAccountNewOrderResponse**](MarginAccountNewOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account New Order |  -  |

<a id="marginAccountNewOto"></a>
# **marginAccountNewOto**
> MarginAccountNewOtoResponse marginAccountNewOto(marginAccountNewOtoRequest)

Margin Account New OTO (TRADE)

Post a new OTO order for margin account:  - An OTO (One-Triggers-the-Other) is an order list comprised of 2 orders.  - The first order is called the **working order** and must be &#x60;LIMIT&#x60; or &#x60;LIMIT_MAKER&#x60;. Initially, only the working order goes on the order book.  - The second order is called the **pending order**. It can be any order type except for &#x60;MARKET&#x60; orders using parameter &#x60;quoteOrderQty&#x60;. The pending order is only placed on the order book when the working order gets **fully filled**.  - If either the working order or the pending order is cancelled individually, the other order in the order list will also be canceled or expired.  - When the order list is placed, if the working order gets **immediately fully filled**, the placement response will show the working order as &#x60;FILLED&#x60; but the pending order will still appear as &#x60;PENDING_NEW&#x60;. You need to query the status of the pending order again to see its updated status.  - OTOs add **2 orders** to the unfilled order count, &#x60;EXCHANGE_MAX_NUM_ORDERS&#x60; filter and &#x60;MAX_NUM_ORDERS&#x60; filter.  Weight: 6(UID) or 1500(UID) when sideEffectType is MARGIN_BUY or AUTO_BORROW_REPAY  Security Type: TRADE  Notes: - autoRepayAtCancel is suggested to set as “FALSE” to keep liability unrepaid under high frequent new order/cancel order execution - Depending on the &#x60;pendingType&#x60; or &#x60;workingType&#x60;, some optional - parameters will become mandatory: | Type                                                     | Additional mandatory parameters                              | Additional information | | -------------------------------------------------------- | ------------------------------------------------------------ | ---------------------- | | &#x60;workingType&#x60; &#x3D; &#x60;LIMIT&#x60;                                  | &#x60;workingTimeInForce&#x60;                                         |                        | | &#x60;pendingType&#x60; &#x3D; &#x60;LIMIT&#x60;                                  | &#x60;pendingPrice&#x60;, &#x60;pendingTimeInForce&#x60;                         |                        | | &#x60;pendingType&#x60; &#x3D; &#x60;STOP_LOSS&#x60; or &#x60;TAKE_PROFIT&#x60;             | &#x60;pendingStopPrice&#x60; and/or &#x60;pendingTrailingDelta&#x60;             |                        | | &#x60;pendingType&#x60; &#x3D; &#x60;STOP_LOSS_LIMIT&#x60; or &#x60;TAKE_PROFIT_LIMIT&#x60; | &#x60;pendingPrice&#x60;, &#x60;pendingStopPrice&#x60; and/or &#x60;pendingTrailingDelta&#x60;, &#x60;pendingTimeInForce&#x60; |                        | | &#x60;pendingTrailingDelta&#x60; is provided | &#x60;pendingPrice&#x60; |                        |

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    MarginAccountNewOtoRequest marginAccountNewOtoRequest = new MarginAccountNewOtoRequest(); // MarginAccountNewOtoRequest | 
    try {
      MarginAccountNewOtoResponse result = apiInstance.marginAccountNewOto(marginAccountNewOtoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#marginAccountNewOto");
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
| **marginAccountNewOtoRequest** | [**MarginAccountNewOtoRequest**](MarginAccountNewOtoRequest.md)|  | |

### Return type

[**MarginAccountNewOtoResponse**](MarginAccountNewOtoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account New OTO |  -  |

<a id="marginAccountNewOtoco"></a>
# **marginAccountNewOtoco**
> MarginAccountNewOtocoResponse marginAccountNewOtoco(marginAccountNewOtocoRequest)

Margin Account New OTOCO (TRADE)

Post a new OTOCO order for margin account：   - An OTOCO (One-Triggers-One-Cancels-the-Other) is an order list comprised of 3 orders.  - The first order is called the **working order** and must be &#x60;LIMIT&#x60; or &#x60;LIMIT_MAKER&#x60;. Initially, only the working order goes on the order book.   - The behavior of the working order is the same as the OTO. - OTOCO has 2 pending orders (pending above and pending below), forming an OCO pair. The pending orders are only placed on the order book when the working order gets **fully filled**.   - The rules of the pending above and pending below follow the same rules as the [Order List OCO](https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#margin-account-new-oco). - OTOCOs add **3 orders** against the unfilled order count, &#x60;EXCHANGE_MAX_NUM_ORDERS&#x60; filter, and &#x60;MAX_NUM_ORDERS&#x60; filter.  Weight: 6(UID) or 1500(UID) when sideEffectType is MARGIN_BUY or AUTO_BORROW_REPAY  Security Type: TRADE  Notes: - autoRepayAtCancel is suggested to set as “FALSE” to keep liability unrepaid under high frequent new order/cancel order execution - Depending on the &#x60;pendingAboveType&#x60;/&#x60;pendingBelowType&#x60; or &#x60;workingType&#x60;, some optional parameters will become mandatory: | Type                                 | Additional mandatory parameters                              | Additional information | | ------------------------------------ | ------------------------------------------------------------ | ---------------------- | | &#x60;workingType&#x60; &#x3D; &#x60;LIMIT&#x60;              | &#x60;workingTimeInForce&#x60;                                         |                        | | &#x60;pendingAboveType&#x60;&#x3D; &#x60;LIMIT_MAKER&#x60;    | &#x60;pendingAbovePrice&#x60;                                          |                        | | &#x60;pendingAboveType&#x60;&#x3D; &#x60;STOP_LOSS&#x60;      | &#x60;pendingAboveStopPrice&#x60; and/or &#x60;pendingAboveTrailingDelta&#x60;   |                        | | &#x60;pendingAboveType&#x60;&#x3D;&#x60;STOP_LOSS_LIMIT&#x60; | &#x60;pendingAbovePrice&#x60;, &#x60;pendingAboveStopPrice&#x60; and/or &#x60;pendingAboveTrailingDelta&#x60;, &#x60;pendingAboveTimeInForce&#x60; |                        | | &#x60;pendingBelowType&#x60;&#x3D; &#x60;LIMIT_MAKER&#x60;    | &#x60;pendingBelowPrice&#x60;                                          |                        | | &#x60;pendingBelowType&#x60;&#x3D; &#x60;STOP_LOSS&#x60;      | &#x60;pendingBelowStopPrice&#x60; and/or &#x60;pendingBelowTrailingDelta&#x60;   |                        | | &#x60;pendingBelowType&#x60;&#x3D;&#x60;STOP_LOSS_LIMIT&#x60; | &#x60;pendingBelowPrice&#x60;, &#x60;pendingBelowStopPrice&#x60; and/or &#x60;pendingBelowTrailingDelta&#x60;, &#x60;pendingBelowTimeInForce&#x60; |                        | | &#x60;pendingAboveTrailingDelta&#x60; is provided | &#x60;pendingAbovePrice&#x60; |                        | | &#x60;pendingBelowTrailingDelta&#x60; is provided | &#x60;pendingBelowPrice&#x60; |                        |

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    MarginAccountNewOtocoRequest marginAccountNewOtocoRequest = new MarginAccountNewOtocoRequest(); // MarginAccountNewOtocoRequest | 
    try {
      MarginAccountNewOtocoResponse result = apiInstance.marginAccountNewOtoco(marginAccountNewOtocoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#marginAccountNewOtoco");
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
| **marginAccountNewOtocoRequest** | [**MarginAccountNewOtocoRequest**](MarginAccountNewOtocoRequest.md)|  | |

### Return type

[**MarginAccountNewOtocoResponse**](MarginAccountNewOtocoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account New OTOCO |  -  |

<a id="marginManualLiquidation"></a>
# **marginManualLiquidation**
> MarginManualLiquidationResponse marginManualLiquidation(marginManualLiquidationRequest)

Margin Manual Liquidation (TRADE)

Margin Manual Liquidation  Weight(UID): 3000  Security Type: TRADE  Notes: - This endpoint supports Cross Margin Classic Mode and Pro Mode. - Isolated Margin is only supported in restricted regions.

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    MarginManualLiquidationRequest marginManualLiquidationRequest = new MarginManualLiquidationRequest(); // MarginManualLiquidationRequest | 
    try {
      MarginManualLiquidationResponse result = apiInstance.marginManualLiquidation(marginManualLiquidationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#marginManualLiquidation");
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
| **marginManualLiquidationRequest** | [**MarginManualLiquidationRequest**](MarginManualLiquidationRequest.md)|  | |

### Return type

[**MarginManualLiquidationResponse**](MarginManualLiquidationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Manual Liquidation |  -  |

<a id="queryCurrentMarginOrderCountUsage"></a>
# **queryCurrentMarginOrderCountUsage**
> QueryCurrentMarginOrderCountUsageResponse queryCurrentMarginOrderCountUsage(isIsolated, symbol, recvWindow)

Query Current Margin Order Count Usage (TRADE)

Displays the user&#39;s current margin order count usage for all intervals.  Weight(IP): 20  Security Type: TRADE

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    IsIsolated isIsolated = IsIsolated.fromValue("TRUE"); // IsIsolated | 
    String symbol = "BTCUSDT"; // String | 
    Long recvWindow = 5000L; // Long | 
    try {
      QueryCurrentMarginOrderCountUsageResponse result = apiInstance.queryCurrentMarginOrderCountUsage(isIsolated, symbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryCurrentMarginOrderCountUsage");
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
| **isIsolated** | [**IsIsolated**](.md)|  | [optional] [default to FALSE] [enum: TRUE, FALSE] |
| **symbol** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryCurrentMarginOrderCountUsageResponse**](QueryCurrentMarginOrderCountUsageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current Margin Order Count Usage |  -  |

<a id="queryLiquidationLoan"></a>
# **queryLiquidationLoan**
> QueryLiquidationLoanResponse queryLiquidationLoan(recvWindow)

Query Liquidation Loan (USER_DATA)

Query the current user&#39;s cross-margin liquidation loan information, including the original loan amount, repaid amount, and remaining amount. When a cross-margin account is liquidated and the account equity turns negative (bankruptcy), the system generates a liquidation loan record representing the deficit. This represents the shortfall amount denominated in USDC.  Weight(UID): 100  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    Long recvWindow = 5000L; // Long | 
    try {
      QueryLiquidationLoanResponse result = apiInstance.queryLiquidationLoan(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryLiquidationLoan");
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

[**QueryLiquidationLoanResponse**](QueryLiquidationLoanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Query Liquidation Loan |  -  |

<a id="queryLiquidationLoanRepayHistory"></a>
# **queryLiquidationLoanRepayHistory**
> QueryLiquidationLoanRepayHistoryResponse queryLiquidationLoanRepayHistory(startTime, endTime, current, size, recvWindow)

Query Liquidation Loan Repay History (USER_DATA)

Query the repayment history of cross-margin liquidation loans (deficit caused by bankruptcy during liquidation). Supports time-range filtering and pagination.  Weight(UID): 100  Security Type: USER_DATA  Notes: - The maximum query range is 90 days. If &#x60;startTime&#x60; is earlier than 90 days ago, it will be clamped to 90 days ago. - Only records with status &#x60;SUCCESS&#x60; or &#x60;PENDING&#x60; are returned. Failed repayment records are excluded.

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    Long startTime = 1714492800000L; // Long | Start time in Unix timestamp (milliseconds). Defaults to 7 days ago if not specified
    Long endTime = 1714579200000L; // Long | End time in Unix timestamp (milliseconds). Defaults to now if not specified
    Long current = 1L; // Long | Current page number, default `1`
    Long size = 50L; // Long | Page size, default `50`
    Long recvWindow = 5000L; // Long | 
    try {
      QueryLiquidationLoanRepayHistoryResponse result = apiInstance.queryLiquidationLoanRepayHistory(startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryLiquidationLoanRepayHistory");
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
| **startTime** | **Long**| Start time in Unix timestamp (milliseconds). Defaults to 7 days ago if not specified | [optional] |
| **endTime** | **Long**| End time in Unix timestamp (milliseconds). Defaults to now if not specified | [optional] |
| **current** | **Long**| Current page number, default &#x60;1&#x60; | [optional] |
| **size** | **Long**| Page size, default &#x60;50&#x60; | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryLiquidationLoanRepayHistoryResponse**](QueryLiquidationLoanRepayHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Query Liquidation Loan Repay History |  -  |

<a id="queryMarginAccountsAllOco"></a>
# **queryMarginAccountsAllOco**
> QueryMarginAccountsAllOcoResponse queryMarginAccountsAllOco(isIsolated, symbol, fromId, startTime, endTime, limit, recvWindow)

Query Margin Account&#39;s all OCO (USER_DATA)

Retrieves all OCO for a specific margin account based on provided optional parameters  Weight(IP): 200  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    IsIsolated isIsolated = IsIsolated.fromValue("TRUE"); // IsIsolated | 
    String symbol = "LTCBTC"; // String | 
    Long fromId = 1L; // Long | 
    Long startTime = 1623319461670L; // Long | 
    Long endTime = 1641782889000L; // Long | 
    Long limit = 100L; // Long | 
    Long recvWindow = 5000L; // Long | 
    try {
      QueryMarginAccountsAllOcoResponse result = apiInstance.queryMarginAccountsAllOco(isIsolated, symbol, fromId, startTime, endTime, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryMarginAccountsAllOco");
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
| **isIsolated** | [**IsIsolated**](.md)|  | [optional] [default to FALSE] [enum: TRUE, FALSE] |
| **symbol** | **String**|  | [optional] |
| **fromId** | **Long**|  | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **limit** | **Long**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryMarginAccountsAllOcoResponse**](QueryMarginAccountsAllOcoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account&#39;s all OCO |  -  |

<a id="queryMarginAccountsAllOrders"></a>
# **queryMarginAccountsAllOrders**
> QueryMarginAccountsAllOrdersResponse queryMarginAccountsAllOrders(symbol, isIsolated, orderId, startTime, endTime, limit, recvWindow)

Query Margin Account&#39;s All Orders (USER_DATA)

Query Margin Account&#39;s All Orders  Weight(IP): 200  Security Type: USER_DATA  Notes: - If orderId is set, it will get orders &gt;&#x3D; that orderId. Otherwise the orders within 24 hours are returned.  - For some historical orders cummulativeQuoteQty will be &lt; 0, meaning the data is not available at this time.  - Less than 24 hours between startTime and endTime.

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "BNBBTC"; // String | 
    IsIsolated isIsolated = IsIsolated.fromValue("TRUE"); // IsIsolated | 
    Long orderId = 1L; // Long | 
    Long startTime = 1623319461670L; // Long | 
    Long endTime = 1641782889000L; // Long | 
    Long limit = 100L; // Long | 
    Long recvWindow = 5000L; // Long | 
    try {
      QueryMarginAccountsAllOrdersResponse result = apiInstance.queryMarginAccountsAllOrders(symbol, isIsolated, orderId, startTime, endTime, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryMarginAccountsAllOrders");
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
| **isIsolated** | [**IsIsolated**](.md)|  | [optional] [default to FALSE] [enum: TRUE, FALSE] |
| **orderId** | **Long**|  | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **limit** | **Long**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryMarginAccountsAllOrdersResponse**](QueryMarginAccountsAllOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account&#39;s All Orders |  -  |

<a id="queryMarginAccountsOco"></a>
# **queryMarginAccountsOco**
> QueryMarginAccountsOcoResponse queryMarginAccountsOco(isIsolated, symbol, orderListId, origClientOrderId, recvWindow)

Query Margin Account&#39;s OCO (USER_DATA)

Retrieves a specific OCO based on provided optional parameters  Weight(IP): 10  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    IsIsolated isIsolated = IsIsolated.fromValue("TRUE"); // IsIsolated | 
    String symbol = "LTCBTC"; // String | 
    Long orderListId = 1L; // Long | 
    String origClientOrderId = "1"; // String | 
    Long recvWindow = 5000L; // Long | 
    try {
      QueryMarginAccountsOcoResponse result = apiInstance.queryMarginAccountsOco(isIsolated, symbol, orderListId, origClientOrderId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryMarginAccountsOco");
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
| **isIsolated** | [**IsIsolated**](.md)|  | [optional] [default to FALSE] [enum: TRUE, FALSE] |
| **symbol** | **String**|  | [optional] |
| **orderListId** | **Long**|  | [optional] |
| **origClientOrderId** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryMarginAccountsOcoResponse**](QueryMarginAccountsOcoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account&#39;s OCO |  -  |

<a id="queryMarginAccountsOpenOco"></a>
# **queryMarginAccountsOpenOco**
> QueryMarginAccountsOpenOcoResponse queryMarginAccountsOpenOco(isIsolated, symbol, recvWindow)

Query Margin Account&#39;s Open OCO (USER_DATA)

Query Margin Account&#39;s Open OCO  Weight(IP): 10  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    IsIsolated isIsolated = IsIsolated.fromValue("TRUE"); // IsIsolated | 
    String symbol = "LTCBTC"; // String | 
    Long recvWindow = 5000L; // Long | 
    try {
      QueryMarginAccountsOpenOcoResponse result = apiInstance.queryMarginAccountsOpenOco(isIsolated, symbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryMarginAccountsOpenOco");
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
| **isIsolated** | [**IsIsolated**](.md)|  | [optional] [default to FALSE] [enum: TRUE, FALSE] |
| **symbol** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryMarginAccountsOpenOcoResponse**](QueryMarginAccountsOpenOcoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account&#39;s Open OCO |  -  |

<a id="queryMarginAccountsOpenOrders"></a>
# **queryMarginAccountsOpenOrders**
> QueryMarginAccountsOpenOrdersResponse queryMarginAccountsOpenOrders(symbol, isIsolated, recvWindow)

Query Margin Account&#39;s Open Orders (USER_DATA)

Query Margin Account&#39;s Open Orders  Weight(IP): 10  Security Type: USER_DATA  Notes: - If the symbol is not sent, orders for all symbols will be returned in an array.  - When all symbols are returned, the number of requests counted against the rate limiter is equal to the number of symbols currently trading on the exchange.  - If isIsolated &#x3D;\&quot;TRUE\&quot;, symbol must be sent.

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "BNBBTC"; // String | isolated margin pair
    IsIsolated isIsolated = IsIsolated.fromValue("TRUE"); // IsIsolated | 
    Long recvWindow = 5000L; // Long | 
    try {
      QueryMarginAccountsOpenOrdersResponse result = apiInstance.queryMarginAccountsOpenOrders(symbol, isIsolated, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryMarginAccountsOpenOrders");
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
| **symbol** | **String**| isolated margin pair | [optional] |
| **isIsolated** | [**IsIsolated**](.md)|  | [optional] [default to FALSE] [enum: TRUE, FALSE] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryMarginAccountsOpenOrdersResponse**](QueryMarginAccountsOpenOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account&#39;s Open Orders |  -  |

<a id="queryMarginAccountsOrder"></a>
# **queryMarginAccountsOrder**
> QueryMarginAccountsOrderResponse queryMarginAccountsOrder(symbol, isIsolated, orderId, origClientOrderId, recvWindow)

Query Margin Account&#39;s Order (USER_DATA)

Query Margin Account&#39;s Order  Weight(IP): 10  Security Type: USER_DATA  Notes: - Either orderId or origClientOrderId must be sent.  - For some historical orders cummulativeQuoteQty will be &lt; 0, meaning the data is not available at this time.

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "BNBBTC"; // String | 
    IsIsolated isIsolated = IsIsolated.fromValue("TRUE"); // IsIsolated | 
    Long orderId = 1L; // Long | 
    String origClientOrderId = "1"; // String | 
    Long recvWindow = 5000L; // Long | 
    try {
      QueryMarginAccountsOrderResponse result = apiInstance.queryMarginAccountsOrder(symbol, isIsolated, orderId, origClientOrderId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryMarginAccountsOrder");
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
| **isIsolated** | [**IsIsolated**](.md)|  | [optional] [default to FALSE] [enum: TRUE, FALSE] |
| **orderId** | **Long**|  | [optional] |
| **origClientOrderId** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryMarginAccountsOrderResponse**](QueryMarginAccountsOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account&#39;s Order |  -  |

<a id="queryMarginAccountsTradeList"></a>
# **queryMarginAccountsTradeList**
> QueryMarginAccountsTradeListResponse queryMarginAccountsTradeList(symbol, isIsolated, orderId, startTime, endTime, fromId, limit, recvWindow)

Query Margin Account&#39;s Trade List (USER_DATA)

Query Margin Account&#39;s Trade List  Weight(IP): 10  Security Type: USER_DATA  Notes: - If fromId is set, it will get trades &gt;&#x3D; that fromId. Otherwise the trades within 24 hours are returned.  - Less than 24 hours between startTime and endTime.

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "BNBBTC"; // String | 
    IsIsolated isIsolated = IsIsolated.fromValue("TRUE"); // IsIsolated | 
    Long orderId = 1L; // Long | 
    Long startTime = 1623319461670L; // Long | 
    Long endTime = 1641782889000L; // Long | 
    Long fromId = 1L; // Long | 
    Long limit = 500L; // Long | 
    Long recvWindow = 5000L; // Long | 
    try {
      QueryMarginAccountsTradeListResponse result = apiInstance.queryMarginAccountsTradeList(symbol, isIsolated, orderId, startTime, endTime, fromId, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryMarginAccountsTradeList");
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
| **isIsolated** | [**IsIsolated**](.md)|  | [optional] [default to FALSE] [enum: TRUE, FALSE] |
| **orderId** | **Long**|  | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **fromId** | **Long**|  | [optional] |
| **limit** | **Long**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryMarginAccountsTradeListResponse**](QueryMarginAccountsTradeListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Account&#39;s Trade List |  -  |

<a id="queryPreventedMatches"></a>
# **queryPreventedMatches**
> QueryPreventedMatchesResponse queryPreventedMatches(symbol, preventedMatchId, orderId, fromPreventedMatchId, isIsolated, recvWindow)

Query Prevented Matches (USER_DATA)

Displays the list of orders that were expired due to STP. (Self-Trade Prevention).  Weight(IP): 10  Security Type: USER_DATA  Notes: - Supported parameter combinations:  - &#x60;symbol&#x60; + &#x60;preventedMatchId&#x60;  - &#x60;symbol&#x60; + &#x60;orderId&#x60;  - &#x60;symbol&#x60; + &#x60;orderId&#x60; + &#x60;fromPreventedMatchId&#x60;  - If &#x60;orderId&#x60; is provided, all prevented matches for that order will be returned.  - If &#x60;preventedMatchId&#x60; is provided, the specific prevented match will be returned.  - A single request returns a maximum of 500 records. If there are more than 500 records, use &#x60;symbol&#x60; + &#x60;orderId&#x60; + &#x60;fromPreventedMatchId&#x60; combination for pagination.

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "BTCUSDT"; // String | 
    Long preventedMatchId = 1L; // Long | 
    Long orderId = 1L; // Long | 
    Long fromPreventedMatchId = 1L; // Long | 
    IsIsolated isIsolated = IsIsolated.fromValue("TRUE"); // IsIsolated | 
    Long recvWindow = 5000L; // Long | 
    try {
      QueryPreventedMatchesResponse result = apiInstance.queryPreventedMatches(symbol, preventedMatchId, orderId, fromPreventedMatchId, isIsolated, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#queryPreventedMatches");
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
| **preventedMatchId** | **Long**|  | [optional] |
| **orderId** | **Long**|  | [optional] |
| **fromPreventedMatchId** | **Long**|  | [optional] |
| **isIsolated** | [**IsIsolated**](.md)|  | [optional] [default to FALSE] [enum: TRUE, FALSE] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryPreventedMatchesResponse**](QueryPreventedMatchesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Prevented Matches |  -  |

<a id="querySpecialKey"></a>
# **querySpecialKey**
> QuerySpecialKeyResponse querySpecialKey(symbol, recvWindow)

Query Special key(Low Latency Trading) (TRADE)

Query Special Key Information.  This only applies to Special Key for Low Latency Trading.  Weight(UID): 1  Security Type: TRADE

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "BTCUSDT"; // String | 
    Long recvWindow = 5000L; // Long | 
    try {
      QuerySpecialKeyResponse result = apiInstance.querySpecialKey(symbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#querySpecialKey");
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

[**QuerySpecialKeyResponse**](QuerySpecialKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Special key |  -  |

<a id="querySpecialKeyList"></a>
# **querySpecialKeyList**
> QuerySpecialKeyListResponse querySpecialKeyList(symbol, recvWindow)

Query Special key List(Low Latency Trading) (TRADE)

This only applies to Special Key for Low Latency Trading.  Weight(UID): 1  Security Type: TRADE

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    String symbol = "BTCUSDT"; // String | 
    Long recvWindow = 5000L; // Long | 
    try {
      QuerySpecialKeyListResponse result = apiInstance.querySpecialKeyList(symbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#querySpecialKeyList");
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

[**QuerySpecialKeyListResponse**](QuerySpecialKeyListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Special key List |  -  |

<a id="smallLiabilityExchange"></a>
# **smallLiabilityExchange**
> smallLiabilityExchange(smallLiabilityExchangeRequest)

Small Liability Exchange (MARGIN)

Small Liability Exchange  Weight(UID): 3000  Security Type: MARGIN  Notes: - Only convert once within 6 hours - Only liability valuation less than 10 USDT are supported - The maximum number of coin is 10

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    SmallLiabilityExchangeRequest smallLiabilityExchangeRequest = new SmallLiabilityExchangeRequest(); // SmallLiabilityExchangeRequest | 
    try {
      apiInstance.smallLiabilityExchange(smallLiabilityExchangeRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#smallLiabilityExchange");
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
| **smallLiabilityExchangeRequest** | [**SmallLiabilityExchangeRequest**](SmallLiabilityExchangeRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

