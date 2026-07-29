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
| [**oldTradesLookup**](MarketDataApi.md#oldTradesLookup) | **GET** /dapi/v1/historicalTrades | Old Trades Lookup (MARKET_DATA) |
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
| [**topTraderLongShortRatioAccounts**](MarketDataApi.md#topTraderLongShortRatioAccounts) | **GET** /futures/data/topLongShortAccountRatio | Top Trader Long/Short Account Ratio |
| [**topTraderLongShortRatioPositions**](MarketDataApi.md#topTraderLongShortRatioPositions) | **GET** /futures/data/topLongShortPositionRatio | Top Trader Long/Short Position Ratio |


<a id="basis"></a>
# **basis**
> BasisResponse basis(pair, contractType, period, limit, startTime, endTime)

Basis

Query basis  Weight(IP): 1  Notes: - If startTime and endTime are not sent, the most recent data is returned. - Only the data of the latest 30 days is available.

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
    String pair = "pair_example"; // String | Pair.
    ContractType contractType = ContractType.fromValue("ALL"); // ContractType | Contract type.
    Period period = Period.fromValue("5m"); // Period | Period interval.
    Long limit = 30L; // Long | Maximum number of records to return.
    Long startTime = 1623319461670L; // Long | 
    Long endTime = 1641782889000L; // Long | 
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
| **pair** | **String**| Pair. | |
| **contractType** | [**ContractType**](.md)| Contract type. | [enum: ALL, PERPETUAL, CURRENT_QUARTER, NEXT_QUARTER] |
| **period** | [**Period**](.md)| Period interval. | [enum: 5m, 15m, 30m, 1h, 2h, 4h, 6h, 12h, 1d] |
| **limit** | **Long**| Maximum number of records to return. | [optional] |
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

Test connectivity to the Rest API and get the current server time.  Weight(IP): 1

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

Get compressed, aggregate trades. Market trades that fill in 100ms with the same price and the same taking side will have the quantity aggregated.  Weight(IP): 20  Notes: - support querying futures trade histories that are not older than 24 hours - If both &#x60;startTime&#x60; and &#x60;endTime&#x60; are sent, time between &#x60;startTime&#x60; and &#x60;endTime&#x60; must be less than 1 hour. - If &#x60;fromId&#x60;, &#x60;startTime&#x60;, and &#x60;endTime&#x60; are not sent, the most recent aggregate trades will be returned. - Only market trades will be aggregated and returned, which means the insurance fund trades and ADL trades won&#39;t be aggregated. - Sending both &#x60;startTime&#x60;/&#x60;endTime&#x60; and &#x60;fromId&#x60; might cause response timeout, please send either &#x60;fromId&#x60; or &#x60;startTime&#x60;/&#x60;endTime&#x60;

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
    String symbol = "symbol_example"; // String | Symbol
    Long fromId = 1L; // Long | ID to get aggregate trades from INCLUSIVE.
    Long startTime = 1623319461670L; // Long | Timestamp in ms to get aggregate trades from INCLUSIVE.
    Long endTime = 1641782889000L; // Long | Timestamp in ms to get aggregate trades until INCLUSIVE.
    Long limit = 30L; // Long | Maximum number of records to return.
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
| **symbol** | **String**| Symbol | |
| **fromId** | **Long**| ID to get aggregate trades from INCLUSIVE. | [optional] |
| **startTime** | **Long**| Timestamp in ms to get aggregate trades from INCLUSIVE. | [optional] |
| **endTime** | **Long**| Timestamp in ms to get aggregate trades until INCLUSIVE. | [optional] |
| **limit** | **Long**| Maximum number of records to return. | [optional] |

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

Kline/candlestick bars for a specific contract type. Klines are uniquely identified by their open time.  Weight: based on parameter &#x60;LIMIT&#x60;  | LIMIT | weight | | --- | --- | | [1,100) | 1 | | [100, 500) | 2 | | [500, 1000] | 5 | | &gt; 1000 | 10 |  Notes: - The difference between &#x60;startTime&#x60; and &#x60;endTime&#x60; can only be up to 200 days - Between &#x60;startTime&#x60; and &#x60;endTime&#x60;, the most recent &#x60;limit&#x60; data from &#x60;endTime&#x60; will be returned:   - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, current timestamp will be set as &#x60;endTime&#x60;, and the most recent data will be returned.   - If &#x60;startTime&#x60; is sent only, the timestamp of 200 days after &#x60;startTime&#x60; will be set as &#x60;endTime&#x60;(up to the current time)   - If &#x60;endTime&#x60; is sent only, the timestamp of 200 days before &#x60;endTime&#x60; will be set as &#x60;startTime&#x60;

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
    String pair = "BTCUSD"; // String | After CM migration, accepts both CM and UM pair values.
    ContractType contractType = ContractType.fromValue("ALL"); // ContractType | 
    Interval interval = Interval.fromValue("1m"); // Interval | Interval
    Long startTime = 1623319461670L; // Long | Start time
    Long endTime = 1641782889000L; // Long | End time
    Long limit = 30L; // Long | Maximum number of records to return.
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
| **pair** | **String**| After CM migration, accepts both CM and UM pair values. | |
| **contractType** | [**ContractType**](.md)|  | [enum: ALL, PERPETUAL, CURRENT_QUARTER, NEXT_QUARTER] |
| **interval** | [**Interval**](.md)| Interval | [enum: 1m, 3m, 5m, 15m, 30m, 1h, 2h, 4h, 6h, 8h, 12h, 1d, 3d, 1w, 1M] |
| **startTime** | **Long**| Start time | [optional] |
| **endTime** | **Long**| End time | [optional] |
| **limit** | **Long**| Maximum number of records to return. | [optional] |

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

Current exchange trading rules and symbol information  Weight(IP): 1

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

Get Funding Rate History of Perpetual Futures  Weight(IP): 1  Notes: - empty array will be returned for delivery symbols.

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
    String symbol = "symbol_example"; // String | Symbol
    Long startTime = 1623319461670L; // Long | Timestamp in ms to get funding rate from INCLUSIVE.
    Long endTime = 1641782889000L; // Long | Timestamp in ms to get funding rate until INCLUSIVE.
    Long limit = 30L; // Long | Maximum number of records to return.
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
| **symbol** | **String**| Symbol | |
| **startTime** | **Long**| Timestamp in ms to get funding rate from INCLUSIVE. | [optional] |
| **endTime** | **Long**| Timestamp in ms to get funding rate until INCLUSIVE. | [optional] |
| **limit** | **Long**| Maximum number of records to return. | [optional] |

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

Query funding rate info for symbols that had FundingRateCap/FundingRateFloor/fundingIntervalHours adjustment

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

Query index price and mark price  Weight(IP): 10

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
    String symbol = "BTCUSD_PERP"; // String | 
    String pair = "BTCUSD"; // String | 
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

Kline/candlestick bars for the index price of a pair. Klines are uniquely identified by their open time.  Weight: Based on parameter &#x60;LIMIT&#x60;  | LIMIT | weight | | --- | --- | | [1,100) | 1 | | [100, 500) | 2 | | [500, 1000] | 5 | | &gt; 1000 | 10 |  Notes: - The difference between &#x60;startTime&#x60; and &#x60;endTime&#x60; can only be up to 200 days - Between &#x60;startTime&#x60; and &#x60;endTime&#x60;, the most recent &#x60;limit&#x60; data from &#x60;endTime&#x60; will be returned:   - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, current timestamp will be set as &#x60;endTime&#x60;, and the most recent data will be returned.   - If &#x60;startTime&#x60; is sent only, the timestamp of 200 days after &#x60;startTime&#x60; will be set as &#x60;endTime&#x60;(up to the current time)   - If &#x60;endTime&#x60; is sent only, the timestamp of 200 days before &#x60;endTime&#x60; will be set as &#x60;startTime&#x60;

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
    String pair = "BTCUSD"; // String | After CM migration, accepts both CM and UM pair values.
    Interval interval = Interval.fromValue("1m"); // Interval | Interval
    Long startTime = 1623319461670L; // Long | Start time
    Long endTime = 1641782889000L; // Long | End time
    Long limit = 30L; // Long | Maximum number of records to return.
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
| **pair** | **String**| After CM migration, accepts both CM and UM pair values. | |
| **interval** | [**Interval**](.md)| Interval | [enum: 1m, 3m, 5m, 15m, 30m, 1h, 2h, 4h, 6h, 8h, 12h, 1d, 3d, 1w, 1M] |
| **startTime** | **Long**| Start time | [optional] |
| **endTime** | **Long**| End time | [optional] |
| **limit** | **Long**| Maximum number of records to return. | [optional] |

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

Kline/candlestick bars for a symbol. Klines are uniquely identified by their open time.  Weight: Based on parameter &#x60;LIMIT&#x60;  | LIMIT | weight | | --- | --- | | [1,100) | 1 | | [100, 500) | 2 | | [500, 1000] | 5 | | &gt; 1000 | 10 |  Notes: - The difference between &#x60;startTime&#x60; and &#x60;endTime&#x60; can only be up to 200 days - Between &#x60;startTime&#x60; and &#x60;endTime&#x60;, the most recent &#x60;limit&#x60; data from &#x60;endTime&#x60; will be returned:   - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, current timestamp will be set as &#x60;endTime&#x60;, and the most recent data will be returned.   - If &#x60;startTime&#x60; is sent only, the timestamp of 200 days after &#x60;startTime&#x60; will be set as &#x60;endTime&#x60;(up to the current time)   - If &#x60;endTime&#x60; is sent only, the timestamp of 200 days before &#x60;endTime&#x60; will be set as &#x60;startTime&#x60;

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
    String symbol = "BTCUSD"; // String | After CM migration, accepts both CM and UM symbols.
    Interval interval = Interval.fromValue("1m"); // Interval | Interval
    Long startTime = 1623319461670L; // Long | Start time
    Long endTime = 1641782889000L; // Long | End time
    Long limit = 30L; // Long | Maximum number of records to return.
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
| **symbol** | **String**| After CM migration, accepts both CM and UM symbols. | |
| **interval** | [**Interval**](.md)| Interval | [enum: 1m, 3m, 5m, 15m, 30m, 1h, 2h, 4h, 6h, 8h, 12h, 1d, 3d, 1w, 1M] |
| **startTime** | **Long**| Start time | [optional] |
| **endTime** | **Long**| End time | [optional] |
| **limit** | **Long**| Maximum number of records to return. | [optional] |

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

Query symbol Long/Short Ratio  Weight(IP): 1  Notes: - If startTime and endTime are not sent, the most recent data is returned. - Only the data of the latest 30 days is available.

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
    Period period = Period.fromValue("5m"); // Period | 
    Long limit = 30L; // Long | Maximum number of records to return.
    Long startTime = 1623319461670L; // Long | 
    Long endTime = 1641782889000L; // Long | 
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
| **period** | [**Period**](.md)|  | [enum: 5m, 15m, 30m, 1h, 2h, 4h, 6h, 12h, 1d] |
| **limit** | **Long**| Maximum number of records to return. | [optional] |
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

Kline/candlestick bars for the mark price of a symbol. Klines are uniquely identified by their open time.  Weight: Based on parameter &#x60;LIMIT&#x60;  | LIMIT | weight | | --- | --- | | [1,100) | 1 | | [100, 500) | 2 | | [500, 1000] | 5 | | &gt; 1000 | 10 |  Notes: - The difference between &#x60;startTime&#x60; and &#x60;endTime&#x60; can only be up to 200 days - Between &#x60;startTime&#x60; and &#x60;endTime&#x60;, the most recent &#x60;limit&#x60; data from &#x60;endTime&#x60; will be returned:   - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, current timestamp will be set as &#x60;endTime&#x60;, and the most recent data will be returned.   - If &#x60;startTime&#x60; is sent only, the timestamp of 200 days after &#x60;startTime&#x60; will be set as &#x60;endTime&#x60;(up to the current time)   - If &#x60;endTime&#x60; is sent only, the timestamp of 200 days before &#x60;endTime&#x60; will be set as &#x60;startTime&#x60;

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
    String symbol = "BTCUSD"; // String | After CM migration, accepts both CM and UM symbols.
    Interval interval = Interval.fromValue("1m"); // Interval | Interval
    Long startTime = 1623319461670L; // Long | Start time
    Long endTime = 1641782889000L; // Long | End time
    Long limit = 30L; // Long | Maximum number of records to return.
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
| **symbol** | **String**| After CM migration, accepts both CM and UM symbols. | |
| **interval** | [**Interval**](.md)| Interval | [enum: 1m, 3m, 5m, 15m, 30m, 1h, 2h, 4h, 6h, 8h, 12h, 1d, 3d, 1w, 1M] |
| **startTime** | **Long**| Start time | [optional] |
| **endTime** | **Long**| End time | [optional] |
| **limit** | **Long**| Maximum number of records to return. | [optional] |

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

Old Trades Lookup (MARKET_DATA)

Get older market historical trades.  Weight(IP): 20  Security Type: MARKET_DATA  Notes: - Market trades means trades filled in the order book. Only market trades will be returned, which means the insurance fund trades and ADL trades won&#39;t be returned. - Only supports data from within the last one month

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
    String symbol = "symbol_example"; // String | Symbol
    Long limit = 30L; // Long | Maximum number of records to return.
    Long fromId = 595103L; // Long | TradeId to fetch from. Default gets most recent trades.
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
| **symbol** | **String**| Symbol | |
| **limit** | **Long**| Maximum number of records to return. | [optional] |
| **fromId** | **Long**| TradeId to fetch from. Default gets most recent trades. | [optional] |

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

Get present open interest of a specific symbol.  Weight(IP): 1

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
    String symbol = "BTCUSD_200626"; // String | Symbol
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
| **symbol** | **String**| Symbol | |

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

Query open interest stats  Weight(IP): 1  Notes: - If startTime and endTime are not sent, the most recent data is returned. - Only the data of the latest 30 days is available.

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
    String pair = "BTCUSD"; // String | 
    ContractType contractType = ContractType.fromValue("ALL"); // ContractType | 
    Period period = Period.fromValue("5m"); // Period | 
    Long limit = 30L; // Long | Maximum number of records to return.
    Long startTime = 1623319461670L; // Long | 
    Long endTime = 1641782889000L; // Long | 
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
| **pair** | **String**|  | |
| **contractType** | [**ContractType**](.md)|  | [enum: ALL, PERPETUAL, CURRENT_QUARTER, NEXT_QUARTER] |
| **period** | [**Period**](.md)|  | [enum: 5m, 15m, 30m, 1h, 2h, 4h, 6h, 12h, 1d] |
| **limit** | **Long**| Maximum number of records to return. | [optional] |
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

Query orderbook on specific symbol  Weight: Adjusted based on the limit:  | Limit | Weight | | ------------ | ------------ | | 5, 10, 20, 50 | 2 | | 100 | 5 | | 500 | 10 | | 1000 | 20 |

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
    String symbol = "BTCUSD_PERP"; // String | Symbol
    Long limit = 500L; // Long | Valid limits:[5, 10, 20, 50, 100, 500, 1000].
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
| **symbol** | **String**| Symbol | |
| **limit** | **Long**| Valid limits:[5, 10, 20, 50, 100, 500, 1000]. | [optional] |

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

Premium index kline bars of a symbol. Klines are uniquely identified by their open time.  Weight: Based on parameter &#x60;LIMIT&#x60;  | LIMIT       | weight | | ----------- | ------ | | [1,100)     | 1      | | [100, 500)  | 2      | | [500, 1000] | 5      | | &gt; 1000      | 10     |  Notes: - If startTime and endTime are not sent, the most recent klines are returned.

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
    String symbol = "BTCUSD"; // String | After CM migration, accepts both CM and UM symbols.
    Interval interval = Interval.fromValue("1m"); // Interval | Interval
    Long startTime = 1623319461670L; // Long | Start time
    Long endTime = 1641782889000L; // Long | End time
    Long limit = 30L; // Long | Maximum number of records to return.
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
| **symbol** | **String**| After CM migration, accepts both CM and UM symbols. | |
| **interval** | [**Interval**](.md)| Interval | [enum: 1m, 3m, 5m, 15m, 30m, 1h, 2h, 4h, 6h, 8h, 12h, 1d, 3d, 1w, 1M] |
| **startTime** | **Long**| Start time | [optional] |
| **endTime** | **Long**| End time | [optional] |
| **limit** | **Long**| Maximum number of records to return. | [optional] |

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

Query index price constituents  Weight(IP): 1

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
    String symbol = "BTCUSD"; // String | Symbol
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
| **symbol** | **String**| Symbol | |

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

Get recent market trades  Weight(IP): 5  Notes: - Market trades means trades filled in the order book. Only market trades will be returned, which means the insurance fund trades and ADL trades won&#39;t be returned.

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
    String symbol = "BTCUSD"; // String | Symbol
    Long limit = 30L; // Long | Maximum number of records to return.
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
| **symbol** | **String**| Symbol | |
| **limit** | **Long**| Maximum number of records to return. | [optional] |

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

Best price/qty on the order book for a symbol or symbols.  Weight: **2** for a single symbol, **5** when the symbol parameter is omitted  Notes: - Symbol and pair cannot be sent together - If a pair is sent,tickers for all symbols of the pair will be returned - If either a pair or symbol is sent, tickers for all symbols of all pairs will be returned

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
    String symbol = "BTCUSD_200626"; // String | Symbol
    String pair = "BTCUSD"; // String | Symbol
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
| **symbol** | **String**| Symbol | [optional] |
| **pair** | **String**| Symbol | [optional] |

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

Latest price for a symbol or symbols.  Weight: **1** for a single symbol, **2** when the symbol parameter is omitted  Notes: - Symbol and pair cannot be sent together - If a pair is sent,tickers for all symbols of the pair will be returned - If either a pair or symbol is sent, tickers for all symbols of all pairs will be returned

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
    String symbol = "BTCUSD_200626"; // String | Symbol
    String pair = "BTCUSD"; // String | Pair
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
| **symbol** | **String**| Symbol | [optional] |
| **pair** | **String**| Pair | [optional] |

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

Taker Buy Volume: the total volume of buy orders filled by takers within the period.  Taker Sell Volume: the total volume of sell orders filled by takers within the period.  Weight(IP): 1  Notes: - If startTime and endTime are not sent, the most recent data is returned. - Only the data of the latest 30 days is available.

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
    String pair = "BTCUSD"; // String | 
    ContractType contractType = ContractType.fromValue("ALL"); // ContractType | 
    Period period = Period.fromValue("5m"); // Period | 
    Long limit = 30L; // Long | Maximum number of records to return.
    Long startTime = 1623319461670L; // Long | 
    Long endTime = 1641782889000L; // Long | 
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
| **pair** | **String**|  | |
| **contractType** | [**ContractType**](.md)|  | [enum: ALL, PERPETUAL, CURRENT_QUARTER, NEXT_QUARTER] |
| **period** | [**Period**](.md)|  | [enum: 5m, 15m, 30m, 1h, 2h, 4h, 6h, 12h, 1d] |
| **limit** | **Long**| Maximum number of records to return. | [optional] |
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

Test connectivity to the Rest API.  Weight(IP): 1

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

24 hour rolling window price change statistics.  Weight: **1** for a single symbol, **40** when the symbol parameter is omitted **Careful** when accessing this with no symbol.  Notes: - Symbol and pair cannot be sent together - If a pair is sent,tickers for all symbols of the pair will be returned - If either a pair or symbol is sent, tickers for all symbols of all pairs will be returned

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
    String symbol = "BTCUSD_200925"; // String | Symbol
    String pair = "BTCUSD"; // String | Pair
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
| **symbol** | **String**| Symbol | [optional] |
| **pair** | **String**| Pair | [optional] |

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

Top Trader Long/Short Account Ratio

The proportion of net long and net short accounts to total accounts of the top 20% users with the highest margin balance. Each account is counted once only.  Long Account % &#x3D; Accounts of top traders with net long positions / Total accounts of top traders with open positions  Short Account % &#x3D; Accounts of top traders with net short positions / Total accounts of top traders with open positions  Long/Short Ratio (Accounts) &#x3D; Long Account % / Short Account %  Weight(IP): 1  Security Type: Accounts  Notes: - If startTime and endTime are not sent, the most recent data is returned. - Only the data of the latest 30 days is available.

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
    String symbol = "symbol_example"; // String | Symbol
    Period period = Period.fromValue("5m"); // Period | 
    Long limit = 30L; // Long | Maximum number of records to return.
    Long startTime = 1623319461670L; // Long | 
    Long endTime = 1641782889000L; // Long | 
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
| **symbol** | **String**| Symbol | |
| **period** | [**Period**](.md)|  | [enum: 5m, 15m, 30m, 1h, 2h, 4h, 6h, 12h, 1d] |
| **limit** | **Long**| Maximum number of records to return. | [optional] |
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

Top Trader Long/Short Position Ratio

The proportion of net long and net short positions to total open positions of the top 20% users with the highest margin balance.  Long Position % &#x3D; Long positions of top traders / Total open positions of top traders  Short Position % &#x3D; Short positions of top traders / Total open positions of top traders  Long/Short Ratio (Positions) &#x3D; Long Position % / Short Position %  Weight(IP): 1  Security Type: Positions  Notes: - If startTime and endTime are not sent, the most recent data is returned. - Only the data of the latest 30 days is available.

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
    String pair = "BTCUSD"; // String | 
    Period period = Period.fromValue("5m"); // Period | 
    Long limit = 30L; // Long | Maximum number of records to return.
    Long startTime = 1623319461670L; // Long | 
    Long endTime = 1641782889000L; // Long | 
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
| **pair** | **String**|  | |
| **period** | [**Period**](.md)|  | [enum: 5m, 15m, 30m, 1h, 2h, 4h, 6h, 12h, 1d] |
| **limit** | **Long**| Maximum number of records to return. | [optional] |
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

