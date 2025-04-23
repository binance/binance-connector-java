# MarketDataApi

All URIs are relative to *https://dapi.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**basis**](MarketDataApi.md#basis) | **GET** /futures/data/basis | Basis |
| [**checkServerTime**](MarketDataApi.md#checkServerTime) | **GET** /dapi/v1/time | Check Server time |
| [**compressedAggregateTradesList**](MarketDataApi.md#compressedAggregateTradesList) | **GET** /dapi/v1/aggTrades | Compressed/Aggregate Trades List |
| [**continuousContractKlineCandlestickData**](MarketDataApi.md#continuousContractKlineCandlestickData) | **GET** /dapi/v1/continuousKlines | Continuous Contract Kline/Candlestick Data |
| [**exchangeInformation**](MarketDataApi.md#exchangeInformation) | **GET** /dapi/v1/exchangeInfo | Exchange Information |
| [**getFundingRateHistoryOfPerpetualFutures**](MarketDataApi.md#getFundingRateHistoryOfPerpetualFutures) | **GET** /dapi/v1/fundingRate | Get Funding Rate History of Perpetual Futures |
| [**getFundingRateInfo**](MarketDataApi.md#getFundingRateInfo) | **GET** /dapi/v1/fundingInfo | Get Funding Rate Info |
| [**indexPriceAndMarkPrice**](MarketDataApi.md#indexPriceAndMarkPrice) | **GET** /dapi/v1/premiumIndex | Index Price and Mark Price |
| [**indexPriceKlineCandlestickData**](MarketDataApi.md#indexPriceKlineCandlestickData) | **GET** /dapi/v1/indexPriceKlines | Index Price Kline/Candlestick Data |
| [**klineCandlestickData**](MarketDataApi.md#klineCandlestickData) | **GET** /dapi/v1/klines | Kline/Candlestick Data |
| [**longShortRatio**](MarketDataApi.md#longShortRatio) | **GET** /futures/data/globalLongShortAccountRatio | Long/Short Ratio |
| [**markPriceKlineCandlestickData**](MarketDataApi.md#markPriceKlineCandlestickData) | **GET** /dapi/v1/markPriceKlines | Mark Price Kline/Candlestick Data |
| [**oldTradesLookup**](MarketDataApi.md#oldTradesLookup) | **GET** /dapi/v1/historicalTrades | Old Trades Lookup(MARKET_DATA) |
| [**openInterest**](MarketDataApi.md#openInterest) | **GET** /dapi/v1/openInterest | Open Interest |
| [**openInterestStatistics**](MarketDataApi.md#openInterestStatistics) | **GET** /futures/data/openInterestHist | Open Interest Statistics |
| [**orderBook**](MarketDataApi.md#orderBook) | **GET** /dapi/v1/depth | Order Book |
| [**premiumIndexKlineData**](MarketDataApi.md#premiumIndexKlineData) | **GET** /dapi/v1/premiumIndexKlines | Premium index Kline Data |
| [**queryIndexPriceConstituents**](MarketDataApi.md#queryIndexPriceConstituents) | **GET** /dapi/v1/constituents | Query Index Price Constituents |
| [**recentTradesList**](MarketDataApi.md#recentTradesList) | **GET** /dapi/v1/trades | Recent Trades List |
| [**symbolOrderBookTicker**](MarketDataApi.md#symbolOrderBookTicker) | **GET** /dapi/v1/ticker/bookTicker | Symbol Order Book Ticker |
| [**symbolPriceTicker**](MarketDataApi.md#symbolPriceTicker) | **GET** /dapi/v1/ticker/price | Symbol Price Ticker |
| [**takerBuySellVolume**](MarketDataApi.md#takerBuySellVolume) | **GET** /futures/data/takerBuySellVol | Taker Buy/Sell Volume |
| [**testConnectivity**](MarketDataApi.md#testConnectivity) | **GET** /dapi/v1/ping | Test Connectivity |
| [**ticker24hrPriceChangeStatistics**](MarketDataApi.md#ticker24hrPriceChangeStatistics) | **GET** /dapi/v1/ticker/24hr | 24hr Ticker Price Change Statistics |
| [**topTraderLongShortRatioAccounts**](MarketDataApi.md#topTraderLongShortRatioAccounts) | **GET** /futures/data/topLongShortAccountRatio | Top Trader Long/Short Ratio (Accounts) |
| [**topTraderLongShortRatioPositions**](MarketDataApi.md#topTraderLongShortRatioPositions) | **GET** /futures/data/topLongShortPositionRatio | Top Trader Long/Short Ratio (Positions) |


<a id="basis"></a>
# **basis**
> BasisResponse basis(pair, contractType, period, limit, startTime, endTime)

Basis

Query basis  * If startTime and endTime are not sent, the most recent data is returned. * Only the data of the latest 30 days is available.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String pair = "pair_example"; // String | BTCUSD
    ContractType contractType = ContractType.fromValue("PERPETUAL"); // ContractType | ALL, CURRENT_QUARTER, NEXT_QUARTER, PERPETUAL
    Period period = Period.fromValue("5m"); // Period | \"5m\",\"15m\",\"30m\",\"1h\",\"2h\",\"4h\",\"6h\",\"12h\",\"1d\"
    Long limit = 56L; // Long | Default 100; max 1000
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    try {
      BasisResponse result = apiInstance.basis(pair, contractType, period, limit, startTime, endTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#basis");
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
| **pair** | **String**| BTCUSD | |
| **contractType** | [**ContractType**](.md)| ALL, CURRENT_QUARTER, NEXT_QUARTER, PERPETUAL | [enum: PERPETUAL, CURRENT_QUARTER, NEXT_QUARTER, CURRENT_QUARTER_DELIVERING, NEXT_QUARTER_DELIVERING, PERPETUAL_DELIVERING] |
| **period** | [**Period**](.md)| \&quot;5m\&quot;,\&quot;15m\&quot;,\&quot;30m\&quot;,\&quot;1h\&quot;,\&quot;2h\&quot;,\&quot;4h\&quot;,\&quot;6h\&quot;,\&quot;12h\&quot;,\&quot;1d\&quot; | [enum: 5m, 15m, 30m, 1h, 2h, 4h, 6h, 12h, 1d] |
| **limit** | **Long**| Default 100; max 1000 | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |

### Return type

[**BasisResponse**](BasisResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Basis |  -  |

<a id="checkServerTime"></a>
# **checkServerTime**
> CheckServerTimeResponse checkServerTime()

Check Server time

Test connectivity to the Rest API and get the current server time.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    try {
      CheckServerTimeResponse result = apiInstance.checkServerTime();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#checkServerTime");
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

[**CheckServerTimeResponse**](CheckServerTimeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Check Server time |  -  |

<a id="compressedAggregateTradesList"></a>
# **compressedAggregateTradesList**
> CompressedAggregateTradesListResponse compressedAggregateTradesList(symbol, fromId, startTime, endTime, limit)

Compressed/Aggregate Trades List

Get compressed, aggregate trades. Market trades that fill in 100ms with the same price and the same taking side will have the quantity aggregated.  * support querying futures trade histories that are not older than one year * If both &#x60;startTime&#x60; and &#x60;endTime&#x60; are sent, time between &#x60;startTime&#x60; and &#x60;endTime&#x60; must be less than 1 hour. * If &#x60;fromId&#x60;, &#x60;startTime&#x60;, and &#x60;endTime&#x60; are not sent, the most recent aggregate trades will be returned. * Only market trades will be aggregated and returned, which means the insurance fund trades and ADL trades won&#39;t be aggregated. * Sending both &#x60;startTime&#x60;/&#x60;endTime&#x60; and &#x60;fromId&#x60; might cause response timeout, please send either &#x60;fromId&#x60; or &#x60;startTime&#x60;/&#x60;endTime&#x60;  Weight: 20

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long fromId = 56L; // Long | ID to get aggregate trades from INCLUSIVE.
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long limit = 56L; // Long | Default 100; max 1000
    try {
      CompressedAggregateTradesListResponse result = apiInstance.compressedAggregateTradesList(symbol, fromId, startTime, endTime, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#compressedAggregateTradesList");
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
| **fromId** | **Long**| ID to get aggregate trades from INCLUSIVE. | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **limit** | **Long**| Default 100; max 1000 | [optional] |

### Return type

[**CompressedAggregateTradesListResponse**](CompressedAggregateTradesListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Compressed/Aggregate Trades List |  -  |

<a id="continuousContractKlineCandlestickData"></a>
# **continuousContractKlineCandlestickData**
> ContinuousContractKlineCandlestickDataResponse continuousContractKlineCandlestickData(pair, contractType, interval, startTime, endTime, limit)

Continuous Contract Kline/Candlestick Data

Kline/candlestick bars for a specific contract type. Klines are uniquely identified by their open time.  * Contract type: * PERPETUAL * CURRENT_QUARTER * NEXT_QUARTER   1000 | 10 * The difference between &#x60;startTime&#x60; and &#x60;endTime&#x60; can only be up to 200 days * Between &#x60;startTime&#x60; and &#x60;endTime&#x60;, the most recent &#x60;limit&#x60; data from &#x60;endTime&#x60; will be returned: * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, current timestamp will be set as &#x60;endTime&#x60;, and the most recent data will be returned. * If &#x60;startTime&#x60; is sent only, the timestamp of 200 days after &#x60;startTime&#x60; will be set as &#x60;endTime&#x60;(up to the current time) * If &#x60;endTime&#x60; is sent only, the timestamp of 200 days before &#x60;endTime&#x60; will be set as &#x60;startTime&#x60;  Weight: based on parameter LIMIT LIMIT | weight ---|--- [1,100) | 1 [100, 500) | 2 [500, 1000] | 5 &gt; 1000 | 10

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String pair = "pair_example"; // String | BTCUSD
    ContractType contractType = ContractType.fromValue("PERPETUAL"); // ContractType | ALL, CURRENT_QUARTER, NEXT_QUARTER, PERPETUAL
    Interval interval = Interval.fromValue("1m"); // Interval | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long limit = 56L; // Long | Default 100; max 1000
    try {
      ContinuousContractKlineCandlestickDataResponse result = apiInstance.continuousContractKlineCandlestickData(pair, contractType, interval, startTime, endTime, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#continuousContractKlineCandlestickData");
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
| **pair** | **String**| BTCUSD | |
| **contractType** | [**ContractType**](.md)| ALL, CURRENT_QUARTER, NEXT_QUARTER, PERPETUAL | [enum: PERPETUAL, CURRENT_QUARTER, NEXT_QUARTER, CURRENT_QUARTER_DELIVERING, NEXT_QUARTER_DELIVERING, PERPETUAL_DELIVERING] |
| **interval** | [**Interval**](.md)|  | [enum: 1m, 3m, 5m, 15m, 30m, 1h, 2h, 4h, 6h, 8h, 12h, 1d, 3d, 1w, 1M] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **limit** | **Long**| Default 100; max 1000 | [optional] |

### Return type

[**ContinuousContractKlineCandlestickDataResponse**](ContinuousContractKlineCandlestickDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Continuous Contract Kline/Candlestick Data |  -  |

<a id="exchangeInformation"></a>
# **exchangeInformation**
> ExchangeInformationResponse exchangeInformation()

Exchange Information

Current exchange trading rules and symbol information  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    try {
      ExchangeInformationResponse result = apiInstance.exchangeInformation();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#exchangeInformation");
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

[**ExchangeInformationResponse**](ExchangeInformationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Exchange Information |  -  |

<a id="getFundingRateHistoryOfPerpetualFutures"></a>
# **getFundingRateHistoryOfPerpetualFutures**
> GetFundingRateHistoryOfPerpetualFuturesResponse getFundingRateHistoryOfPerpetualFutures(symbol, startTime, endTime, limit)

Get Funding Rate History of Perpetual Futures

Get Funding Rate History of Perpetual Futures  * empty array will be returned for delivery symbols.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long limit = 56L; // Long | Default 100; max 1000
    try {
      GetFundingRateHistoryOfPerpetualFuturesResponse result = apiInstance.getFundingRateHistoryOfPerpetualFutures(symbol, startTime, endTime, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#getFundingRateHistoryOfPerpetualFutures");
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
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **limit** | **Long**| Default 100; max 1000 | [optional] |

### Return type

[**GetFundingRateHistoryOfPerpetualFuturesResponse**](GetFundingRateHistoryOfPerpetualFuturesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Funding Rate History of Perpetual Futures |  -  |

<a id="getFundingRateInfo"></a>
# **getFundingRateInfo**
> GetFundingRateInfoResponse getFundingRateInfo()

Get Funding Rate Info

Query funding rate info for symbols that had FundingRateCap/ FundingRateFloor / fundingIntervalHours adjustment  Weight: 0

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    try {
      GetFundingRateInfoResponse result = apiInstance.getFundingRateInfo();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#getFundingRateInfo");
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

[**GetFundingRateInfoResponse**](GetFundingRateInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Funding Rate Info |  -  |

<a id="indexPriceAndMarkPrice"></a>
# **indexPriceAndMarkPrice**
> IndexPriceAndMarkPriceResponse indexPriceAndMarkPrice(symbol, pair)

Index Price and Mark Price

Query index price and mark price  Weight: 10

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    String pair = "pair_example"; // String | 
    try {
      IndexPriceAndMarkPriceResponse result = apiInstance.indexPriceAndMarkPrice(symbol, pair);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#indexPriceAndMarkPrice");
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
| **pair** | **String**|  | [optional] |

### Return type

[**IndexPriceAndMarkPriceResponse**](IndexPriceAndMarkPriceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Index Price and Mark Price |  -  |

<a id="indexPriceKlineCandlestickData"></a>
# **indexPriceKlineCandlestickData**
> IndexPriceKlineCandlestickDataResponse indexPriceKlineCandlestickData(pair, interval, startTime, endTime, limit)

Index Price Kline/Candlestick Data

Kline/candlestick bars for the index price of a pair. Klines are uniquely identified by their open time.   1000 | 10 * The difference between &#x60;startTime&#x60; and &#x60;endTime&#x60; can only be up to 200 days * Between &#x60;startTime&#x60; and &#x60;endTime&#x60;, the most recent &#x60;limit&#x60; data from &#x60;endTime&#x60; will be returned: * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, current timestamp will be set as &#x60;endTime&#x60;, and the most recent data will be returned. * If &#x60;startTime&#x60; is sent only, the timestamp of 200 days after &#x60;startTime&#x60; will be set as &#x60;endTime&#x60;(up to the current time) * If &#x60;endTime&#x60; is sent only, the timestamp of 200 days before &#x60;endTime&#x60; will be set as &#x60;startTime&#x60;  Weight: based on parameter LIMIT LIMIT | weight ---|--- [1,100) | 1 [100, 500) | 2 [500, 1000] | 5 &gt; 1000 | 10

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String pair = "pair_example"; // String | BTCUSD
    Interval interval = Interval.fromValue("1m"); // Interval | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long limit = 56L; // Long | Default 100; max 1000
    try {
      IndexPriceKlineCandlestickDataResponse result = apiInstance.indexPriceKlineCandlestickData(pair, interval, startTime, endTime, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#indexPriceKlineCandlestickData");
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
| **pair** | **String**| BTCUSD | |
| **interval** | [**Interval**](.md)|  | [enum: 1m, 3m, 5m, 15m, 30m, 1h, 2h, 4h, 6h, 8h, 12h, 1d, 3d, 1w, 1M] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **limit** | **Long**| Default 100; max 1000 | [optional] |

### Return type

[**IndexPriceKlineCandlestickDataResponse**](IndexPriceKlineCandlestickDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Index Price Kline/Candlestick Data |  -  |

<a id="klineCandlestickData"></a>
# **klineCandlestickData**
> KlineCandlestickDataResponse klineCandlestickData(symbol, interval, startTime, endTime, limit)

Kline/Candlestick Data

Kline/candlestick bars for a symbol. Klines are uniquely identified by their open time.  1000 | 10 * The difference between &#x60;startTime&#x60; and &#x60;endTime&#x60; can only be up to 200 days * Between &#x60;startTime&#x60; and &#x60;endTime&#x60;, the most recent &#x60;limit&#x60; data from &#x60;endTime&#x60; will be returned: * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, current timestamp will be set as &#x60;endTime&#x60;, and the most recent data will be returned. * If &#x60;startTime&#x60; is sent only, the timestamp of 200 days after &#x60;startTime&#x60; will be set as &#x60;endTime&#x60;(up to the current time) * If &#x60;endTime&#x60; is sent only, the timestamp of 200 days before &#x60;endTime&#x60; will be set as &#x60;startTime&#x60;  Weight: based on parameter LIMIT LIMIT | weight ---|--- [1,100) | 1 [100, 500) | 2 [500, 1000] | 5 &gt; 1000 | 10

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Interval interval = Interval.fromValue("1m"); // Interval | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long limit = 56L; // Long | Default 100; max 1000
    try {
      KlineCandlestickDataResponse result = apiInstance.klineCandlestickData(symbol, interval, startTime, endTime, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#klineCandlestickData");
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
| **interval** | [**Interval**](.md)|  | [enum: 1m, 3m, 5m, 15m, 30m, 1h, 2h, 4h, 6h, 8h, 12h, 1d, 3d, 1w, 1M] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **limit** | **Long**| Default 100; max 1000 | [optional] |

### Return type

[**KlineCandlestickDataResponse**](KlineCandlestickDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Kline/Candlestick Data |  -  |

<a id="longShortRatio"></a>
# **longShortRatio**
> LongShortRatioResponse longShortRatio(pair, period, limit, startTime, endTime)

Long/Short Ratio

Query symbol Long/Short Ratio  * If startTime and endTime are not sent, the most recent data is returned. * Only the data of the latest 30 days is available.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String pair = "pair_example"; // String | BTCUSD
    Period period = Period.fromValue("5m"); // Period | \"5m\",\"15m\",\"30m\",\"1h\",\"2h\",\"4h\",\"6h\",\"12h\",\"1d\"
    Long limit = 56L; // Long | Default 100; max 1000
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    try {
      LongShortRatioResponse result = apiInstance.longShortRatio(pair, period, limit, startTime, endTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#longShortRatio");
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
| **pair** | **String**| BTCUSD | |
| **period** | [**Period**](.md)| \&quot;5m\&quot;,\&quot;15m\&quot;,\&quot;30m\&quot;,\&quot;1h\&quot;,\&quot;2h\&quot;,\&quot;4h\&quot;,\&quot;6h\&quot;,\&quot;12h\&quot;,\&quot;1d\&quot; | [enum: 5m, 15m, 30m, 1h, 2h, 4h, 6h, 12h, 1d] |
| **limit** | **Long**| Default 100; max 1000 | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |

### Return type

[**LongShortRatioResponse**](LongShortRatioResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Long/Short Ratio |  -  |

<a id="markPriceKlineCandlestickData"></a>
# **markPriceKlineCandlestickData**
> MarkPriceKlineCandlestickDataResponse markPriceKlineCandlestickData(symbol, interval, startTime, endTime, limit)

Mark Price Kline/Candlestick Data

Kline/candlestick bars for the mark price of a symbol. Klines are uniquely identified by their open time.   1000 | 10 * The difference between &#x60;startTime&#x60; and &#x60;endTime&#x60; can only be up to 200 days * Between &#x60;startTime&#x60; and &#x60;endTime&#x60;, the most recent &#x60;limit&#x60; data from &#x60;endTime&#x60; will be returned: * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, current timestamp will be set as &#x60;endTime&#x60;, and the most recent data will be returned. * If &#x60;startTime&#x60; is sent only, the timestamp of 200 days after &#x60;startTime&#x60; will be set as &#x60;endTime&#x60;(up to the current time) * If &#x60;endTime&#x60; is sent only, the timestamp of 200 days before &#x60;endTime&#x60; will be set as &#x60;startTime&#x60;  Weight: based on parameter LIMIT LIMIT | weight ---|--- [1,100) | 1 [100, 500) | 2 [500, 1000] | 5 &gt; 1000 | 10

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Interval interval = Interval.fromValue("1m"); // Interval | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long limit = 56L; // Long | Default 100; max 1000
    try {
      MarkPriceKlineCandlestickDataResponse result = apiInstance.markPriceKlineCandlestickData(symbol, interval, startTime, endTime, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#markPriceKlineCandlestickData");
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
| **interval** | [**Interval**](.md)|  | [enum: 1m, 3m, 5m, 15m, 30m, 1h, 2h, 4h, 6h, 8h, 12h, 1d, 3d, 1w, 1M] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **limit** | **Long**| Default 100; max 1000 | [optional] |

### Return type

[**MarkPriceKlineCandlestickDataResponse**](MarkPriceKlineCandlestickDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Mark Price Kline/Candlestick Data |  -  |

<a id="oldTradesLookup"></a>
# **oldTradesLookup**
> OldTradesLookupResponse oldTradesLookup(symbol, limit, fromId)

Old Trades Lookup(MARKET_DATA)

Get older market historical trades.  * Market trades means trades filled in the order book. Only market trades will be returned, which means the insurance fund trades and ADL trades won&#39;t be returned.  Weight: 20

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long limit = 56L; // Long | Default 100; max 1000
    Long fromId = 56L; // Long | ID to get aggregate trades from INCLUSIVE.
    try {
      OldTradesLookupResponse result = apiInstance.oldTradesLookup(symbol, limit, fromId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#oldTradesLookup");
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
| **limit** | **Long**| Default 100; max 1000 | [optional] |
| **fromId** | **Long**| ID to get aggregate trades from INCLUSIVE. | [optional] |

### Return type

[**OldTradesLookupResponse**](OldTradesLookupResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Old Trades Lookup |  -  |

<a id="openInterest"></a>
# **openInterest**
> OpenInterestResponse openInterest(symbol)

Open Interest

Get present open interest of a specific symbol.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    try {
      OpenInterestResponse result = apiInstance.openInterest(symbol);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#openInterest");
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

[**OpenInterestResponse**](OpenInterestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Open Interest |  -  |

<a id="openInterestStatistics"></a>
# **openInterestStatistics**
> OpenInterestStatisticsResponse openInterestStatistics(pair, contractType, period, limit, startTime, endTime)

Open Interest Statistics

Query open interest stats   * If startTime and endTime are not sent, the most recent data is returned. * Only the data of the latest 30 days is available.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String pair = "pair_example"; // String | BTCUSD
    ContractType contractType = ContractType.fromValue("PERPETUAL"); // ContractType | ALL, CURRENT_QUARTER, NEXT_QUARTER, PERPETUAL
    Period period = Period.fromValue("5m"); // Period | \"5m\",\"15m\",\"30m\",\"1h\",\"2h\",\"4h\",\"6h\",\"12h\",\"1d\"
    Long limit = 56L; // Long | Default 100; max 1000
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    try {
      OpenInterestStatisticsResponse result = apiInstance.openInterestStatistics(pair, contractType, period, limit, startTime, endTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#openInterestStatistics");
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
| **pair** | **String**| BTCUSD | |
| **contractType** | [**ContractType**](.md)| ALL, CURRENT_QUARTER, NEXT_QUARTER, PERPETUAL | [enum: PERPETUAL, CURRENT_QUARTER, NEXT_QUARTER, CURRENT_QUARTER_DELIVERING, NEXT_QUARTER_DELIVERING, PERPETUAL_DELIVERING] |
| **period** | [**Period**](.md)| \&quot;5m\&quot;,\&quot;15m\&quot;,\&quot;30m\&quot;,\&quot;1h\&quot;,\&quot;2h\&quot;,\&quot;4h\&quot;,\&quot;6h\&quot;,\&quot;12h\&quot;,\&quot;1d\&quot; | [enum: 5m, 15m, 30m, 1h, 2h, 4h, 6h, 12h, 1d] |
| **limit** | **Long**| Default 100; max 1000 | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |

### Return type

[**OpenInterestStatisticsResponse**](OpenInterestStatisticsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Open Interest Statistics |  -  |

<a id="orderBook"></a>
# **orderBook**
> OrderBookResponse orderBook(symbol, limit)

Order Book

Query orderbook on specific symbol  Weight: Adjusted based on the limit: Limit | Weight ------------ | ------------ 5, 10, 20, 50 | 2 100 | 5 500 | 10 1000 | 20

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long limit = 56L; // Long | Default 100; max 1000
    try {
      OrderBookResponse result = apiInstance.orderBook(symbol, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#orderBook");
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
| **limit** | **Long**| Default 100; max 1000 | [optional] |

### Return type

[**OrderBookResponse**](OrderBookResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order Book |  -  |

<a id="premiumIndexKlineData"></a>
# **premiumIndexKlineData**
> PremiumIndexKlineDataResponse premiumIndexKlineData(symbol, interval, startTime, endTime, limit)

Premium index Kline Data

Premium index kline bars of a symbol. Klines are uniquely identified by their open time.   * If startTime and endTime are not sent, the most recent klines are returned.  Weight: based on parameter LIMIT | LIMIT       | weight | | ----------- | ------ | | [1,100)     | 1      | | [100, 500)  | 2      | | [500, 1000] | 5      | | &gt; 1000      | 10     |

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Interval interval = Interval.fromValue("1m"); // Interval | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long limit = 56L; // Long | Default 100; max 1000
    try {
      PremiumIndexKlineDataResponse result = apiInstance.premiumIndexKlineData(symbol, interval, startTime, endTime, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#premiumIndexKlineData");
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
| **interval** | [**Interval**](.md)|  | [enum: 1m, 3m, 5m, 15m, 30m, 1h, 2h, 4h, 6h, 8h, 12h, 1d, 3d, 1w, 1M] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **limit** | **Long**| Default 100; max 1000 | [optional] |

### Return type

[**PremiumIndexKlineDataResponse**](PremiumIndexKlineDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Premium index Kline Data |  -  |

<a id="queryIndexPriceConstituents"></a>
# **queryIndexPriceConstituents**
> QueryIndexPriceConstituentsResponse queryIndexPriceConstituents(symbol)

Query Index Price Constituents

Query index price constituents  Weight: 2

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    try {
      QueryIndexPriceConstituentsResponse result = apiInstance.queryIndexPriceConstituents(symbol);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#queryIndexPriceConstituents");
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

[**QueryIndexPriceConstituentsResponse**](QueryIndexPriceConstituentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Index Price Constituents |  -  |

<a id="recentTradesList"></a>
# **recentTradesList**
> RecentTradesListResponse recentTradesList(symbol, limit)

Recent Trades List

Get recent market trades  * Market trades means trades filled in the order book. Only market trades will be returned, which means the insurance fund trades and ADL trades won&#39;t be returned.  Weight: 5

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Long limit = 56L; // Long | Default 100; max 1000
    try {
      RecentTradesListResponse result = apiInstance.recentTradesList(symbol, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#recentTradesList");
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
| **limit** | **Long**| Default 100; max 1000 | [optional] |

### Return type

[**RecentTradesListResponse**](RecentTradesListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Recent Trades List |  -  |

<a id="symbolOrderBookTicker"></a>
# **symbolOrderBookTicker**
> SymbolOrderBookTickerResponse symbolOrderBookTicker(symbol, pair)

Symbol Order Book Ticker

Best price/qty on the order book for a symbol or symbols.  * Symbol and pair cannot be sent together * If a pair is sent,tickers for all symbols of the pair will be returned * If either a pair or symbol is sent, tickers for all symbols of all pairs will be returned  Weight: 2 for a single symbol, 5 when the symbol parameter is omitted

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    String pair = "pair_example"; // String | 
    try {
      SymbolOrderBookTickerResponse result = apiInstance.symbolOrderBookTicker(symbol, pair);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#symbolOrderBookTicker");
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
| **pair** | **String**|  | [optional] |

### Return type

[**SymbolOrderBookTickerResponse**](SymbolOrderBookTickerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Symbol Order Book Ticker |  -  |

<a id="symbolPriceTicker"></a>
# **symbolPriceTicker**
> SymbolPriceTickerResponse symbolPriceTicker(symbol, pair)

Symbol Price Ticker

Latest price for a symbol or symbols.  * Symbol and pair cannot be sent together * If a pair is sent,tickers for all symbols of the pair will be returned * If either a pair or symbol is sent, tickers for all symbols of all pairs will be returned  Weight: 1 for a single symbol, 2 when the symbol parameter is omitted

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    String pair = "pair_example"; // String | 
    try {
      SymbolPriceTickerResponse result = apiInstance.symbolPriceTicker(symbol, pair);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#symbolPriceTicker");
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
| **pair** | **String**|  | [optional] |

### Return type

[**SymbolPriceTickerResponse**](SymbolPriceTickerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Symbol Price Ticker |  -  |

<a id="takerBuySellVolume"></a>
# **takerBuySellVolume**
> TakerBuySellVolumeResponse takerBuySellVolume(pair, contractType, period, limit, startTime, endTime)

Taker Buy/Sell Volume

Taker Buy Volume: the total volume of buy orders filled by takers within the period. Taker Sell Volume: the total volume of sell orders filled by takers within the period.  * If startTime and endTime are not sent, the most recent data is returned. * Only the data of the latest 30 days is available.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String pair = "pair_example"; // String | BTCUSD
    ContractType contractType = ContractType.fromValue("PERPETUAL"); // ContractType | ALL, CURRENT_QUARTER, NEXT_QUARTER, PERPETUAL
    Period period = Period.fromValue("5m"); // Period | \"5m\",\"15m\",\"30m\",\"1h\",\"2h\",\"4h\",\"6h\",\"12h\",\"1d\"
    Long limit = 56L; // Long | Default 100; max 1000
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    try {
      TakerBuySellVolumeResponse result = apiInstance.takerBuySellVolume(pair, contractType, period, limit, startTime, endTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#takerBuySellVolume");
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
| **pair** | **String**| BTCUSD | |
| **contractType** | [**ContractType**](.md)| ALL, CURRENT_QUARTER, NEXT_QUARTER, PERPETUAL | [enum: PERPETUAL, CURRENT_QUARTER, NEXT_QUARTER, CURRENT_QUARTER_DELIVERING, NEXT_QUARTER_DELIVERING, PERPETUAL_DELIVERING] |
| **period** | [**Period**](.md)| \&quot;5m\&quot;,\&quot;15m\&quot;,\&quot;30m\&quot;,\&quot;1h\&quot;,\&quot;2h\&quot;,\&quot;4h\&quot;,\&quot;6h\&quot;,\&quot;12h\&quot;,\&quot;1d\&quot; | [enum: 5m, 15m, 30m, 1h, 2h, 4h, 6h, 12h, 1d] |
| **limit** | **Long**| Default 100; max 1000 | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |

### Return type

[**TakerBuySellVolumeResponse**](TakerBuySellVolumeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Taker Buy/Sell Volume |  -  |

<a id="testConnectivity"></a>
# **testConnectivity**
> testConnectivity()

Test Connectivity

Test connectivity to the Rest API.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    try {
      apiInstance.testConnectivity();
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#testConnectivity");
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

<a id="ticker24hrPriceChangeStatistics"></a>
# **ticker24hrPriceChangeStatistics**
> Ticker24hrPriceChangeStatisticsResponse ticker24hrPriceChangeStatistics(symbol, pair)

24hr Ticker Price Change Statistics

24 hour rolling window price change statistics.  * Symbol and pair cannot be sent together * If a pair is sent,tickers for all symbols of the pair will be returned * If either a pair or symbol is sent, tickers for all symbols of all pairs will be returned  Weight: 1 for a single symbol, 40 when the symbol parameter is omitted Careful when accessing this with no symbol.

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    String pair = "pair_example"; // String | 
    try {
      Ticker24hrPriceChangeStatisticsResponse result = apiInstance.ticker24hrPriceChangeStatistics(symbol, pair);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#ticker24hrPriceChangeStatistics");
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
| **pair** | **String**|  | [optional] |

### Return type

[**Ticker24hrPriceChangeStatisticsResponse**](Ticker24hrPriceChangeStatisticsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 24hr Ticker Price Change Statistics |  -  |

<a id="topTraderLongShortRatioAccounts"></a>
# **topTraderLongShortRatioAccounts**
> TopTraderLongShortRatioAccountsResponse topTraderLongShortRatioAccounts(symbol, period, limit, startTime, endTime)

Top Trader Long/Short Ratio (Accounts)

The proportion of net long and net short accounts to total accounts of the top 20% users with the highest margin balance. Each account is counted once only. Long Account % &#x3D; Accounts of top traders with net long positions / Total accounts of top traders with open positions Short Account % &#x3D; Accounts of top traders with net short positions / Total accounts of top traders with open positions Long/Short Ratio (Accounts) &#x3D; Long Account % / Short Account %  * If startTime and endTime are not sent, the most recent data is returned. * Only the data of the latest 30 days is available.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Period period = Period.fromValue("5m"); // Period | \"5m\",\"15m\",\"30m\",\"1h\",\"2h\",\"4h\",\"6h\",\"12h\",\"1d\"
    Long limit = 56L; // Long | Default 100; max 1000
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    try {
      TopTraderLongShortRatioAccountsResponse result = apiInstance.topTraderLongShortRatioAccounts(symbol, period, limit, startTime, endTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#topTraderLongShortRatioAccounts");
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
| **period** | [**Period**](.md)| \&quot;5m\&quot;,\&quot;15m\&quot;,\&quot;30m\&quot;,\&quot;1h\&quot;,\&quot;2h\&quot;,\&quot;4h\&quot;,\&quot;6h\&quot;,\&quot;12h\&quot;,\&quot;1d\&quot; | [enum: 5m, 15m, 30m, 1h, 2h, 4h, 6h, 12h, 1d] |
| **limit** | **Long**| Default 100; max 1000 | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |

### Return type

[**TopTraderLongShortRatioAccountsResponse**](TopTraderLongShortRatioAccountsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Top Trader Long/Short Ratio |  -  |

<a id="topTraderLongShortRatioPositions"></a>
# **topTraderLongShortRatioPositions**
> TopTraderLongShortRatioPositionsResponse topTraderLongShortRatioPositions(pair, period, limit, startTime, endTime)

Top Trader Long/Short Ratio (Positions)

The proportion of net long and net short positions to total open positions of the top 20% users with the highest margin balance. Long Position % &#x3D; Long positions of top traders / Total open positions of top traders Short Position % &#x3D; Short positions of top traders / Total open positions of top traders Long/Short Ratio (Positions) &#x3D; Long Position % / Short Position %  * If startTime and endTime are not sent, the most recent data is returned. * Only the data of the latest 30 days is available.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_coin_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_coin_futures.ApiException;
import com.binance.connector.client.derivatives_trading_coin_futures.Configuration;
import com.binance.connector.client.derivatives_trading_coin_futures.models.*;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dapi.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String pair = "pair_example"; // String | BTCUSD
    Period period = Period.fromValue("5m"); // Period | \"5m\",\"15m\",\"30m\",\"1h\",\"2h\",\"4h\",\"6h\",\"12h\",\"1d\"
    Long limit = 56L; // Long | Default 100; max 1000
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    try {
      TopTraderLongShortRatioPositionsResponse result = apiInstance.topTraderLongShortRatioPositions(pair, period, limit, startTime, endTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#topTraderLongShortRatioPositions");
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
| **pair** | **String**| BTCUSD | |
| **period** | [**Period**](.md)| \&quot;5m\&quot;,\&quot;15m\&quot;,\&quot;30m\&quot;,\&quot;1h\&quot;,\&quot;2h\&quot;,\&quot;4h\&quot;,\&quot;6h\&quot;,\&quot;12h\&quot;,\&quot;1d\&quot; | [enum: 5m, 15m, 30m, 1h, 2h, 4h, 6h, 12h, 1d] |
| **limit** | **Long**| Default 100; max 1000 | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |

### Return type

[**TopTraderLongShortRatioPositionsResponse**](TopTraderLongShortRatioPositionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Top Trader Long/Short Ratio |  -  |

