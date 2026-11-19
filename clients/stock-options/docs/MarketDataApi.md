# MarketDataApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**optionContracts**](MarketDataApi.md#optionContracts) | **GET** /sapi/v1/equity/option/market/contracts | Option Contracts (MARKET_DATA) |
| [**optionExchangeInfo**](MarketDataApi.md#optionExchangeInfo) | **GET** /sapi/v1/equity/option/market/exchangeInfo | Option Exchange Info (MARKET_DATA) |
| [**optionExpirations**](MarketDataApi.md#optionExpirations) | **GET** /sapi/v1/equity/option/market/expirations | Option Expirations (MARKET_DATA) |


<a id="optionContracts"></a>
# **optionContracts**
> OptionContractsResponse optionContracts(underlyingSymbol, expirationDate, rootSymbol)

Option Contracts (MARKET_DATA)

Returns every option contract (calls and puts) of an underlying for one expiration date. Reference data only — no market data.  Sorted by &#x60;strikePrice&#x60; ascending; for the same strike, &#x60;CALL&#x60; comes before &#x60;PUT&#x60;. Not paginated.  If there is no contract for the &#x60;(underlying, root, expiration)&#x60; combination, an empty array is returned.  Only the &#x60;X-MBX-APIKEY&#x60; header is required; this endpoint is **not signed** and takes no &#x60;timestamp&#x60; / &#x60;recvWindow&#x60;.  Weight: 1  Security Type: MARKET_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.stock_options.ApiClient;
import com.binance.connector.client.stock_options.ApiException;
import com.binance.connector.client.stock_options.Configuration;
import com.binance.connector.client.stock_options.models.*;
import com.binance.connector.client.stock_options.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String underlyingSymbol = "NVDA"; // String | Underlying US-equity ticker, e.g. `NVDA`.
    String expirationDate = "2026-09-30"; // String | Expiration date in `YYYY-MM-DD`, taken from Option Expirations. Other formats (e.g. `2026-9-30`, `2026/09/30`) are rejected.
    String rootSymbol = "NVDA"; // String | OCC root. If omitted, only **standard** contracts are returned. To list corporate-action-adjusted contracts (e.g. `GOOG1`), pass the `rootSymbol` from Option Expirations.
    try {
      OptionContractsResponse result = apiInstance.optionContracts(underlyingSymbol, expirationDate, rootSymbol);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#optionContracts");
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
| **underlyingSymbol** | **String**| Underlying US-equity ticker, e.g. &#x60;NVDA&#x60;. | |
| **expirationDate** | **String**| Expiration date in &#x60;YYYY-MM-DD&#x60;, taken from Option Expirations. Other formats (e.g. &#x60;2026-9-30&#x60;, &#x60;2026/09/30&#x60;) are rejected. | |
| **rootSymbol** | **String**| OCC root. If omitted, only **standard** contracts are returned. To list corporate-action-adjusted contracts (e.g. &#x60;GOOG1&#x60;), pass the &#x60;rootSymbol&#x60; from Option Expirations. | [optional] |

### Return type

[**OptionContractsResponse**](OptionContractsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Option Contracts |  -  |

<a id="optionExchangeInfo"></a>
# **optionExchangeInfo**
> OptionExchangeInfoResponse optionExchangeInfo(symbol)

Option Exchange Info (MARKET_DATA)

Returns the trading rules of a single option contract, combining contract-level data (type, strike, expiration, multiplier, deliverables) with underlying-level configuration (price / quantity increments and limits).  &#x60;symbol&#x60; is **required**. Unlike the stock &#x60;exchangeInfo&#x60;, listing all contracts is not supported. To browse contracts, use Option Expirations and Option Contracts.  **Price constraints**: a limit price must be a multiple of &#x60;tickSize&#x60;, and the order notional (&#x60;price&#x60; × &#x60;quantity&#x60; × &#x60;multiplier&#x60;, excluding fees) must fall within the closed interval &#x60;[minNotional, maxNotional]&#x60;. For a put &#x60;SELL&#x60; order, the limit price cannot exceed the strike price. All of these values are returned by this endpoint, so you can validate an order before placing it.  **&#x60;multiplier&#x60; vs &#x60;contractSize&#x60;**: &#x60;multiplier&#x60; is used to calculate cost, &#x60;contractSize&#x60; is the number of shares delivered. Both are 100 for standard contracts and may differ for contracts adjusted by a corporate action (split, merger, special dividend). Always estimate cost with &#x60;multiplier&#x60;.  Only the &#x60;X-MBX-APIKEY&#x60; header is required; this endpoint is **not signed** and takes no &#x60;timestamp&#x60; / &#x60;recvWindow&#x60;.  Weight: 1  Security Type: MARKET_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.stock_options.ApiClient;
import com.binance.connector.client.stock_options.ApiException;
import com.binance.connector.client.stock_options.Configuration;
import com.binance.connector.client.stock_options.models.*;
import com.binance.connector.client.stock_options.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String symbol = "NVDA260930C00100000"; // String | OCC contract symbol, e.g. `NVDA260930C00100000`.
    try {
      OptionExchangeInfoResponse result = apiInstance.optionExchangeInfo(symbol);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#optionExchangeInfo");
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
| **symbol** | **String**| OCC contract symbol, e.g. &#x60;NVDA260930C00100000&#x60;. | |

### Return type

[**OptionExchangeInfoResponse**](OptionExchangeInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Option Exchange Info |  -  |

<a id="optionExpirations"></a>
# **optionExpirations**
> OptionExpirationsResponse optionExpirations(underlyingSymbol)

Option Expirations (MARKET_DATA)

Returns every expiration date currently tradable for an underlying, in ascending &#x60;expirationDate&#x60; order.  When standard and corporate-action-adjusted contracts share an expiration date, **multiple** rows are returned with the same &#x60;expirationDate&#x60; and different &#x60;rootSymbol&#x60;. To list the adjusted set, pass that &#x60;rootSymbol&#x60; to Option Contracts.  Reference data only — no market data.  An unknown underlying, or one without listed options, returns &#x60;-1121 Invalid symbol.&#x60; An empty array is never returned.  Only the &#x60;X-MBX-APIKEY&#x60; header is required; this endpoint is **not signed** and takes no &#x60;timestamp&#x60; / &#x60;recvWindow&#x60;.  Weight: 1  Security Type: MARKET_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.stock_options.ApiClient;
import com.binance.connector.client.stock_options.ApiException;
import com.binance.connector.client.stock_options.Configuration;
import com.binance.connector.client.stock_options.models.*;
import com.binance.connector.client.stock_options.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String underlyingSymbol = "NVDA"; // String | Underlying US-equity ticker, e.g. `NVDA`.
    try {
      OptionExpirationsResponse result = apiInstance.optionExpirations(underlyingSymbol);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#optionExpirations");
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
| **underlyingSymbol** | **String**| Underlying US-equity ticker, e.g. &#x60;NVDA&#x60;. | |

### Return type

[**OptionExpirationsResponse**](OptionExpirationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Option Expirations |  -  |

