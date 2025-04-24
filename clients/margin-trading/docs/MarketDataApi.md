# MarketDataApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**crossMarginCollateralRatio**](MarketDataApi.md#crossMarginCollateralRatio) | **GET** /sapi/v1/margin/crossMarginCollateralRatio | Cross margin collateral ratio (MARKET_DATA) |
| [**getAllCrossMarginPairs**](MarketDataApi.md#getAllCrossMarginPairs) | **GET** /sapi/v1/margin/allPairs | Get All Cross Margin Pairs (MARKET_DATA) |
| [**getAllIsolatedMarginSymbol**](MarketDataApi.md#getAllIsolatedMarginSymbol) | **GET** /sapi/v1/margin/isolated/allPairs | Get All Isolated Margin Symbol(MARKET_DATA) |
| [**getAllMarginAssets**](MarketDataApi.md#getAllMarginAssets) | **GET** /sapi/v1/margin/allAssets | Get All Margin Assets (MARKET_DATA) |
| [**getDelistSchedule**](MarketDataApi.md#getDelistSchedule) | **GET** /sapi/v1/margin/delist-schedule | Get Delist Schedule (MARKET_DATA) |
| [**queryIsolatedMarginTierData**](MarketDataApi.md#queryIsolatedMarginTierData) | **GET** /sapi/v1/margin/isolatedMarginTier | Query Isolated Margin Tier Data (USER_DATA) |
| [**queryLiabilityCoinLeverageBracketInCrossMarginProMode**](MarketDataApi.md#queryLiabilityCoinLeverageBracketInCrossMarginProMode) | **GET** /sapi/v1/margin/leverageBracket | Query Liability Coin Leverage Bracket in Cross Margin Pro Mode(MARKET_DATA) |
| [**queryMarginAvailableInventory**](MarketDataApi.md#queryMarginAvailableInventory) | **GET** /sapi/v1/margin/available-inventory | Query Margin Available Inventory(USER_DATA) |
| [**queryMarginPriceindex**](MarketDataApi.md#queryMarginPriceindex) | **GET** /sapi/v1/margin/priceIndex | Query Margin PriceIndex (MARKET_DATA) |


<a id="crossMarginCollateralRatio"></a>
# **crossMarginCollateralRatio**
> CrossMarginCollateralRatioResponse crossMarginCollateralRatio()

Cross margin collateral ratio (MARKET_DATA)

Cross margin collateral ratio  Weight: 100(IP)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    try {
      CrossMarginCollateralRatioResponse result = apiInstance.crossMarginCollateralRatio();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#crossMarginCollateralRatio");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CrossMarginCollateralRatioResponse**](CrossMarginCollateralRatioResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cross margin collateral ratio |  -  |

<a id="getAllCrossMarginPairs"></a>
# **getAllCrossMarginPairs**
> GetAllCrossMarginPairsResponse getAllCrossMarginPairs(symbol)

Get All Cross Margin Pairs (MARKET_DATA)

Get All Cross Margin Pairs  Weight: 1(IP)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String symbol = "symbol_example"; // String | isolated margin pair
    try {
      GetAllCrossMarginPairsResponse result = apiInstance.getAllCrossMarginPairs(symbol);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#getAllCrossMarginPairs");
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

### Return type

[**GetAllCrossMarginPairsResponse**](GetAllCrossMarginPairsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get All Cross Margin Pairs |  -  |

<a id="getAllIsolatedMarginSymbol"></a>
# **getAllIsolatedMarginSymbol**
> GetAllIsolatedMarginSymbolResponse getAllIsolatedMarginSymbol(symbol, recvWindow)

Get All Isolated Margin Symbol(MARKET_DATA)

Get All Isolated Margin Symbol  Weight: 10(IP)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String symbol = "symbol_example"; // String | isolated margin pair
    Long recvWindow = 56L; // Long | No more than 60000
    try {
      GetAllIsolatedMarginSymbolResponse result = apiInstance.getAllIsolatedMarginSymbol(symbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#getAllIsolatedMarginSymbol");
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
| **recvWindow** | **Long**| No more than 60000 | [optional] |

### Return type

[**GetAllIsolatedMarginSymbolResponse**](GetAllIsolatedMarginSymbolResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get All Isolated Margin Symbol |  -  |

<a id="getAllMarginAssets"></a>
# **getAllMarginAssets**
> GetAllMarginAssetsResponse getAllMarginAssets(asset)

Get All Margin Assets (MARKET_DATA)

Get All Margin Assets.  Weight: 1(IP)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String asset = "asset_example"; // String | 
    try {
      GetAllMarginAssetsResponse result = apiInstance.getAllMarginAssets(asset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#getAllMarginAssets");
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

### Return type

[**GetAllMarginAssetsResponse**](GetAllMarginAssetsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get All Margin Assets |  -  |

<a id="getDelistSchedule"></a>
# **getDelistSchedule**
> GetDelistScheduleResponse getDelistSchedule(recvWindow)

Get Delist Schedule (MARKET_DATA)

Get tokens or symbols delist schedule for cross margin and isolated margin  Weight: 100

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    Long recvWindow = 56L; // Long | No more than 60000
    try {
      GetDelistScheduleResponse result = apiInstance.getDelistSchedule(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#getDelistSchedule");
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

[**GetDelistScheduleResponse**](GetDelistScheduleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Delist Schedule |  -  |

<a id="queryIsolatedMarginTierData"></a>
# **queryIsolatedMarginTierData**
> QueryIsolatedMarginTierDataResponse queryIsolatedMarginTierData(symbol, tier, recvWindow)

Query Isolated Margin Tier Data (USER_DATA)

Get isolated margin tier data collection with any tier as https://www.binance.com/en/margin-data  Weight: 1(IP)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long tier = 56L; // Long | All margin tier data will be returned if tier is omitted
    Long recvWindow = 56L; // Long | No more than 60000
    try {
      QueryIsolatedMarginTierDataResponse result = apiInstance.queryIsolatedMarginTierData(symbol, tier, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#queryIsolatedMarginTierData");
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
| **tier** | **Long**| All margin tier data will be returned if tier is omitted | [optional] |
| **recvWindow** | **Long**| No more than 60000 | [optional] |

### Return type

[**QueryIsolatedMarginTierDataResponse**](QueryIsolatedMarginTierDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Isolated Margin Tier Data |  -  |

<a id="queryLiabilityCoinLeverageBracketInCrossMarginProMode"></a>
# **queryLiabilityCoinLeverageBracketInCrossMarginProMode**
> QueryLiabilityCoinLeverageBracketInCrossMarginProModeResponse queryLiabilityCoinLeverageBracketInCrossMarginProMode()

Query Liability Coin Leverage Bracket in Cross Margin Pro Mode(MARKET_DATA)

Liability Coin Leverage Bracket in Cross Margin Pro Mode  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    try {
      QueryLiabilityCoinLeverageBracketInCrossMarginProModeResponse result = apiInstance.queryLiabilityCoinLeverageBracketInCrossMarginProMode();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#queryLiabilityCoinLeverageBracketInCrossMarginProMode");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**QueryLiabilityCoinLeverageBracketInCrossMarginProModeResponse**](QueryLiabilityCoinLeverageBracketInCrossMarginProModeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Liability Coin Leverage Bracket in Cross Margin Pro Mode |  -  |

<a id="queryMarginAvailableInventory"></a>
# **queryMarginAvailableInventory**
> QueryMarginAvailableInventoryResponse queryMarginAvailableInventory(type)

Query Margin Available Inventory(USER_DATA)

Margin available Inventory query  Weight: 50

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String type = "type_example"; // String | MARGIN,ISOLATED
    try {
      QueryMarginAvailableInventoryResponse result = apiInstance.queryMarginAvailableInventory(type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#queryMarginAvailableInventory");
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
| **type** | **String**| MARGIN,ISOLATED | |

### Return type

[**QueryMarginAvailableInventoryResponse**](QueryMarginAvailableInventoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin Available Inventory |  -  |

<a id="queryMarginPriceindex"></a>
# **queryMarginPriceindex**
> QueryMarginPriceindexResponse queryMarginPriceindex(symbol)

Query Margin PriceIndex (MARKET_DATA)

Query Margin PriceIndex  Weight: 10(IP)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    try {
      QueryMarginPriceindexResponse result = apiInstance.queryMarginPriceindex(symbol);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#queryMarginPriceindex");
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

### Return type

[**QueryMarginPriceindexResponse**](QueryMarginPriceindexResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Margin PriceIndex |  -  |

