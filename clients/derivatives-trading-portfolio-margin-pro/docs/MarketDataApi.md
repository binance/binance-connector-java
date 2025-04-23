# MarketDataApi

All URIs are relative to *https://fapi.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPortfolioMarginAssetLeverage**](MarketDataApi.md#getPortfolioMarginAssetLeverage) | **GET** /sapi/v1/portfolio/margin-asset-leverage | Get Portfolio Margin Asset Leverage(USER_DATA) |
| [**portfolioMarginCollateralRate**](MarketDataApi.md#portfolioMarginCollateralRate) | **GET** /sapi/v1/portfolio/collateralRate | Portfolio Margin Collateral Rate(MARKET_DATA) |
| [**portfolioMarginProTieredCollateralRate**](MarketDataApi.md#portfolioMarginProTieredCollateralRate) | **GET** /sapi/v2/portfolio/collateralRate | Portfolio Margin Pro Tiered Collateral Rate(USER_DATA) |
| [**queryPortfolioMarginAssetIndexPrice**](MarketDataApi.md#queryPortfolioMarginAssetIndexPrice) | **GET** /sapi/v1/portfolio/asset-index-price | Query Portfolio Margin Asset Index Price (MARKET_DATA) |


<a id="getPortfolioMarginAssetLeverage"></a>
# **getPortfolioMarginAssetLeverage**
> GetPortfolioMarginAssetLeverageResponse getPortfolioMarginAssetLeverage()

Get Portfolio Margin Asset Leverage(USER_DATA)

Get Portfolio Margin Asset Leverage  Weight: 50

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    try {
      GetPortfolioMarginAssetLeverageResponse result = apiInstance.getPortfolioMarginAssetLeverage();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#getPortfolioMarginAssetLeverage");
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

[**GetPortfolioMarginAssetLeverageResponse**](GetPortfolioMarginAssetLeverageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Portfolio Margin Asset Leverage |  -  |

<a id="portfolioMarginCollateralRate"></a>
# **portfolioMarginCollateralRate**
> PortfolioMarginCollateralRateResponse portfolioMarginCollateralRate()

Portfolio Margin Collateral Rate(MARKET_DATA)

Portfolio Margin Collateral Rate  Weight: 50

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    try {
      PortfolioMarginCollateralRateResponse result = apiInstance.portfolioMarginCollateralRate();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#portfolioMarginCollateralRate");
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

[**PortfolioMarginCollateralRateResponse**](PortfolioMarginCollateralRateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Portfolio Margin Collateral Rate |  -  |

<a id="portfolioMarginProTieredCollateralRate"></a>
# **portfolioMarginProTieredCollateralRate**
> PortfolioMarginProTieredCollateralRateResponse portfolioMarginProTieredCollateralRate(recvWindow)

Portfolio Margin Pro Tiered Collateral Rate(USER_DATA)

Portfolio Margin PRO Tiered Collateral Rate  Weight: 50

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      PortfolioMarginProTieredCollateralRateResponse result = apiInstance.portfolioMarginProTieredCollateralRate(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#portfolioMarginProTieredCollateralRate");
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

[**PortfolioMarginProTieredCollateralRateResponse**](PortfolioMarginProTieredCollateralRateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Portfolio Margin Pro Tiered Collateral Rate |  -  |

<a id="queryPortfolioMarginAssetIndexPrice"></a>
# **queryPortfolioMarginAssetIndexPrice**
> QueryPortfolioMarginAssetIndexPriceResponse queryPortfolioMarginAssetIndexPrice(asset)

Query Portfolio Margin Asset Index Price (MARKET_DATA)

Query Portfolio Margin Asset Index Price  Weight: 1 if send asset or 50 if not send asset

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String asset = "asset_example"; // String | 
    try {
      QueryPortfolioMarginAssetIndexPriceResponse result = apiInstance.queryPortfolioMarginAssetIndexPrice(asset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#queryPortfolioMarginAssetIndexPrice");
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

[**QueryPortfolioMarginAssetIndexPriceResponse**](QueryPortfolioMarginAssetIndexPriceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Portfolio Margin Asset Index Price |  -  |

