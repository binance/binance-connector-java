/*
 * Binance Spot REST API
 * OpenAPI Specifications for the Binance Spot REST API  API documents:   - [Github rest-api documentation file](https://github.com/binance/binance-spot-api-docs/blob/master/rest-api.md)   - [General API information for rest-api on website](https://developers.binance.com/docs/binance-spot-api-docs/rest-api/general-api-information)
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.spot.rest.api;

import static org.junit.Assert.assertEquals;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.auth.BinanceAuthenticationFactory;
import com.binance.connector.client.common.auth.SignatureAuthentication;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.sign.HmacSignatureGenerator;
import com.binance.connector.client.common.sign.SignatureGenerator;
import com.binance.connector.client.spot.rest.model.AggTradesResponse;
import com.binance.connector.client.spot.rest.model.AvgPriceResponse;
import com.binance.connector.client.spot.rest.model.DepthResponse;
import com.binance.connector.client.spot.rest.model.GetTradesResponse;
import com.binance.connector.client.spot.rest.model.HistoricalTradesResponse;
import com.binance.connector.client.spot.rest.model.Interval;
import com.binance.connector.client.spot.rest.model.KlinesResponse;
import com.binance.connector.client.spot.rest.model.Symbols;
import com.binance.connector.client.spot.rest.model.Ticker24hrResponse;
import com.binance.connector.client.spot.rest.model.TickerBookTickerResponse;
import com.binance.connector.client.spot.rest.model.TickerPriceResponse;
import com.binance.connector.client.spot.rest.model.TickerResponse;
import com.binance.connector.client.spot.rest.model.TickerTradingDayResponse;
import com.binance.connector.client.spot.rest.model.TickerType;
import com.binance.connector.client.spot.rest.model.UiKlinesResponse;
import com.binance.connector.client.spot.rest.model.WindowSize;
import jakarta.validation.constraints.*;
import okhttp3.Call;
import okhttp3.Request;
import org.bouncycastle.crypto.CryptoException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

/** API tests for MarketApi */
public class MarketApiTest {

    private MarketApi api;
    private ApiClient apiClientSpy;
    private SignatureGenerator signatureGeneratorSpy;

    @BeforeEach
    public void initApiClient() throws ApiException {
        ClientConfiguration clientConfiguration = new ClientConfiguration();
        clientConfiguration.setUrl("http://localhost:8080");
        SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
        signatureConfiguration.setApiKey("apiKey");
        signatureConfiguration.setSecretKey("secretKey");
        clientConfiguration.setSignatureConfiguration(signatureConfiguration);

        HmacSignatureGenerator signatureGenerator =
                new HmacSignatureGenerator(signatureConfiguration.getSecretKey());
        signatureGeneratorSpy = Mockito.spy(signatureGenerator);
        SignatureAuthentication signatureAuthentication =
                new SignatureAuthentication(
                        signatureConfiguration.getApiKey(), signatureGeneratorSpy);
        SignatureAuthentication authenticationSpy = Mockito.spy(signatureAuthentication);
        Mockito.doReturn("1736393892000").when(authenticationSpy).buildTimestamp();

        BinanceAuthenticationFactory factoryMock = Mockito.mock(BinanceAuthenticationFactory.class);
        Mockito.doReturn(authenticationSpy)
                .when(factoryMock)
                .getAuthentication(signatureConfiguration);

        ApiClient apiClient = new ApiClient(clientConfiguration, factoryMock);

        apiClientSpy = Mockito.spy(apiClient);
        Mockito.doReturn(new ApiResponse<>(200, null))
                .when(apiClientSpy)
                .execute(Mockito.any(), Mockito.any(java.lang.reflect.Type.class));
        Mockito.doReturn(new ApiResponse<>(200, null)).when(apiClientSpy).execute(Mockito.any());
        Mockito.doReturn("1736393892000").when(apiClientSpy).buildTimestamp();

        api = new MarketApi(apiClientSpy);
    }

    /**
     * Compressed/Aggregate trades list
     *
     * <p>Get compressed, aggregate trades. Trades that fill at the time, from the same taker order,
     * with the same price will have the quantity aggregated. Weight: 4
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void aggTradesTest() throws ApiException, CryptoException {
        String symbol = "BNBUSDT";
        Long fromId = 1L;
        Long startTime = 1735693200000L;
        Long endTime = 1735693200000L;
        Integer limit = 500;
        ApiResponse<AggTradesResponse> response =
                api.aggTrades(symbol, fromId, startTime, endTime, limit);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals(null, actualRequest.url().queryParameter("signature"));
        assertEquals("/api/v3/aggTrades", actualRequest.url().encodedPath());
    }

    /**
     * Current average price
     *
     * <p>Current average price for a symbol. Weight: 2
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void avgPriceTest() throws ApiException, CryptoException {
        String symbol = "BNBUSDT";
        ApiResponse<AvgPriceResponse> response = api.avgPrice(symbol);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals(null, actualRequest.url().queryParameter("signature"));
        assertEquals("/api/v3/avgPrice", actualRequest.url().encodedPath());
    }

    /**
     * Order book
     *
     * <p>Weight: Adjusted based on the limit: |Limit|Request Weight ------|------- 1-100| 5
     * 101-500| 25 501-1000| 50 1001-5000| 250
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void depthTest() throws ApiException, CryptoException {
        String symbol = "BNBUSDT";
        Integer limit = 500;
        ApiResponse<DepthResponse> response = api.depth(symbol, limit);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals(null, actualRequest.url().queryParameter("signature"));
        assertEquals("/api/v3/depth", actualRequest.url().encodedPath());
    }

    /**
     * Recent trades list
     *
     * <p>Get recent trades. Weight: 25
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTradesTest() throws ApiException, CryptoException {
        String symbol = "BNBUSDT";
        Integer limit = 500;
        ApiResponse<GetTradesResponse> response = api.getTrades(symbol, limit);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals(null, actualRequest.url().queryParameter("signature"));
        assertEquals("/api/v3/trades", actualRequest.url().encodedPath());
    }

    /**
     * Old trade lookup
     *
     * <p>Get older trades. Weight: 25
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void historicalTradesTest() throws ApiException, CryptoException {
        String symbol = "BNBUSDT";
        Integer limit = 500;
        Long fromId = 1L;
        ApiResponse<HistoricalTradesResponse> response =
                api.historicalTrades(symbol, limit, fromId);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals(null, actualRequest.url().queryParameter("signature"));
        assertEquals("/api/v3/historicalTrades", actualRequest.url().encodedPath());
    }

    /**
     * Kline/Candlestick data
     *
     * <p>Kline/candlestick bars for a symbol. Klines are uniquely identified by their open time.
     * Weight: 2
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void klinesTest() throws ApiException, CryptoException {
        String symbol = "BNBUSDT";
        Interval interval = Interval.INTERVAL_1s;
        Long startTime = 1735693200000L;
        Long endTime = 1735693200000L;
        String timeZone = "";
        Integer limit = 500;
        ApiResponse<KlinesResponse> response =
                api.klines(symbol, interval, startTime, endTime, timeZone, limit);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals(null, actualRequest.url().queryParameter("signature"));
        assertEquals("/api/v3/klines", actualRequest.url().encodedPath());
    }

    /**
     * Rolling window price change statistics
     *
     * <p>Weight: 4 for each requested &lt;tt&gt;symbol&lt;/tt&gt; regardless of
     * &lt;tt&gt;windowSize&lt;/tt&gt;. &lt;br/&gt;&lt;br/&gt; The weight for this request will cap
     * at 200 once the number of &#x60;symbols&#x60; in the request is more than 50.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tickerTest() throws ApiException, CryptoException {
        String symbol = "BNBUSDT";
        Symbols symbols = null;
        WindowSize windowSize = WindowSize.WINDOW_SIZE_1m;
        TickerType type = TickerType.FULL;
        ApiResponse<TickerResponse> response = api.ticker(symbol, symbols, windowSize, type);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals(null, actualRequest.url().queryParameter("signature"));
        assertEquals("/api/v3/ticker", actualRequest.url().encodedPath());
    }

    /**
     * 24hr ticker price change statistics
     *
     * <p>24 hour rolling window price change statistics. **Careful** when accessing this with no
     * symbol. Weight: &lt;table&gt; &lt;thead&gt; &lt;tr&gt; &lt;th&gt;Parameter&lt;/th&gt;
     * &lt;th&gt;Symbols Provided&lt;/th&gt; &lt;th&gt;Weight&lt;/th&gt; &lt;/tr&gt; &lt;/thead&gt;
     * &lt;tbody&gt; &lt;tr&gt; &lt;td rowspan&#x3D;\&quot;2\&quot;&gt;symbol&lt;/td&gt;
     * &lt;td&gt;1&lt;/td&gt; &lt;td&gt;2&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;symbol
     * parameter is omitted&lt;/td&gt; &lt;td&gt;80&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td
     * rowspan&#x3D;\&quot;4\&quot;&gt;symbols&lt;/td&gt; &lt;td&gt;1-20&lt;/td&gt;
     * &lt;td&gt;2&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;21-100&lt;/td&gt;
     * &lt;td&gt;40&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;101 or more&lt;/td&gt;
     * &lt;td&gt;80&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;symbols parameter is
     * omitted&lt;/td&gt; &lt;td&gt;80&lt;/td&gt; &lt;/tr&gt; &lt;/tbody&gt; &lt;/table&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ticker24hrTest() throws ApiException, CryptoException {
        String symbol = "BNBUSDT";
        Symbols symbols = null;
        TickerType type = TickerType.FULL;
        ApiResponse<Ticker24hrResponse> response = api.ticker24hr(symbol, symbols, type);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals(null, actualRequest.url().queryParameter("signature"));
        assertEquals("/api/v3/ticker/24hr", actualRequest.url().encodedPath());
    }

    /**
     * Symbol order book ticker
     *
     * <p>Best price/qty on the order book for a symbol or symbols. Weight: &lt;table&gt;
     * &lt;thead&gt; &lt;tr&gt; &lt;th&gt;Parameter&lt;/th&gt; &lt;th&gt;Symbols Provided&lt;/th&gt;
     * &lt;th&gt;Weight&lt;/th&gt; &lt;/tr&gt; &lt;/thead&gt; &lt;tbody&gt; &lt;tr&gt; &lt;td
     * rowspan&#x3D;\&quot;2\&quot;&gt;symbol&lt;/td&gt; &lt;td&gt;1&lt;/td&gt;
     * &lt;td&gt;2&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;symbol parameter is
     * omitted&lt;/td&gt; &lt;td&gt;4&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;symbols&lt;/td&gt;
     * &lt;td&gt;Any&lt;/td&gt; &lt;td&gt;4&lt;/td&gt; &lt;/tr&gt; &lt;/tbody&gt; &lt;/table&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tickerBookTickerTest() throws ApiException, CryptoException {
        String symbol = "BNBUSDT";
        Symbols symbols = null;
        ApiResponse<TickerBookTickerResponse> response = api.tickerBookTicker(symbol, symbols);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals(null, actualRequest.url().queryParameter("signature"));
        assertEquals("/api/v3/ticker/bookTicker", actualRequest.url().encodedPath());
    }

    /**
     * Symbol price ticker
     *
     * <p>Latest price for a symbol or symbols. Weight: &lt;table&gt; &lt;thead&gt; &lt;tr&gt;
     * &lt;th&gt;Parameter&lt;/th&gt; &lt;th&gt;Symbols Provided&lt;/th&gt;
     * &lt;th&gt;Weight&lt;/th&gt; &lt;/tr&gt; &lt;/thead&gt; &lt;tbody&gt; &lt;tr&gt; &lt;td
     * rowspan&#x3D;\&quot;2\&quot;&gt;symbol&lt;/td&gt; &lt;td&gt;1&lt;/td&gt;
     * &lt;td&gt;2&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;symbol parameter is
     * omitted&lt;/td&gt; &lt;td&gt;4&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;symbols&lt;/td&gt;
     * &lt;td&gt;Any&lt;/td&gt; &lt;td&gt;4&lt;/td&gt; &lt;/tr&gt; &lt;/tbody&gt; &lt;/table&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tickerPriceTest() throws ApiException, CryptoException {
        String symbol = "BNBUSDT";
        Symbols symbols = null;
        ApiResponse<TickerPriceResponse> response = api.tickerPrice(symbol, symbols);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals(null, actualRequest.url().queryParameter("signature"));
        assertEquals("/api/v3/ticker/price", actualRequest.url().encodedPath());
    }

    /**
     * Trading Day Ticker
     *
     * <p>Price change statistics for a trading day. Weight: 4 for each requested
     * &lt;tt&gt;symbol&lt;/tt&gt;. &lt;br/&gt;&lt;br/&gt; The weight for this request will cap at
     * 200 once the number of &#x60;symbols&#x60; in the request is more than 50.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tickerTradingDayTest() throws ApiException, CryptoException {
        String symbol = "BNBUSDT";
        Symbols symbols = null;
        String timeZone = "";
        TickerType type = TickerType.FULL;
        ApiResponse<TickerTradingDayResponse> response =
                api.tickerTradingDay(symbol, symbols, timeZone, type);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals(null, actualRequest.url().queryParameter("signature"));
        assertEquals("/api/v3/ticker/tradingDay", actualRequest.url().encodedPath());
    }

    /**
     * UIKlines
     *
     * <p>The request is similar to klines having the same parameters and response.
     * &#x60;uiKlines&#x60; return modified kline data, optimized for presentation of candlestick
     * charts. Weight: 2
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uiKlinesTest() throws ApiException, CryptoException {
        String symbol = "BNBUSDT";
        Interval interval = Interval.INTERVAL_1s;
        Long startTime = 1735693200000L;
        Long endTime = 1735693200000L;
        String timeZone = "";
        Integer limit = 500;
        ApiResponse<UiKlinesResponse> response =
                api.uiKlines(symbol, interval, startTime, endTime, timeZone, limit);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals(null, actualRequest.url().queryParameter("signature"));
        assertEquals("/api/v3/uiKlines", actualRequest.url().encodedPath());
    }
}
