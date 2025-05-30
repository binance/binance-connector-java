/*
 * Binance Margin Trading REST API
 * OpenAPI Specification for the Binance Margin Trading REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.margin_trading.rest.api;

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
import com.binance.connector.client.margin_trading.rest.model.AdjustCrossMarginMaxLeverageRequest;
import com.binance.connector.client.margin_trading.rest.model.AdjustCrossMarginMaxLeverageResponse;
import com.binance.connector.client.margin_trading.rest.model.DisableIsolatedMarginAccountResponse;
import com.binance.connector.client.margin_trading.rest.model.EnableIsolatedMarginAccountRequest;
import com.binance.connector.client.margin_trading.rest.model.EnableIsolatedMarginAccountResponse;
import com.binance.connector.client.margin_trading.rest.model.GetBnbBurnStatusResponse;
import com.binance.connector.client.margin_trading.rest.model.GetSummaryOfMarginAccountResponse;
import com.binance.connector.client.margin_trading.rest.model.QueryCrossIsolatedMarginCapitalFlowResponse;
import com.binance.connector.client.margin_trading.rest.model.QueryCrossMarginAccountDetailsResponse;
import com.binance.connector.client.margin_trading.rest.model.QueryCrossMarginFeeDataResponse;
import com.binance.connector.client.margin_trading.rest.model.QueryEnabledIsolatedMarginAccountLimitResponse;
import com.binance.connector.client.margin_trading.rest.model.QueryIsolatedMarginAccountInfoResponse;
import com.binance.connector.client.margin_trading.rest.model.QueryIsolatedMarginFeeDataResponse;
import jakarta.validation.constraints.*;
import okhttp3.Call;
import okhttp3.Request;
import org.bouncycastle.crypto.CryptoException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

/** API tests for AccountApi */
public class AccountApiTest {

    private AccountApi api;
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

        api = new AccountApi(apiClientSpy);
    }

    /**
     * Adjust cross margin max leverage (USER_DATA)
     *
     * <p>Adjust cross margin max leverage * The margin level need higher than the initial risk
     * ratio of adjusted leverage, the initial risk ratio of 3x is 1.5 , the initial risk ratio of
     * 5x is 1.25; The detail conditions on how to switch between Cross Margin Classic and Cross
     * Margin Pro can refer to [the
     * FAQ](https://www.binance.com/en/support/faq/how-to-activate-the-cross-margin-pro-mode-on-binance-e27786da05e743a694b8c625b3bc475d).
     * Weight: 3000
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adjustCrossMarginMaxLeverageTest() throws ApiException, CryptoException {
        AdjustCrossMarginMaxLeverageRequest adjustCrossMarginMaxLeverageRequest =
                new AdjustCrossMarginMaxLeverageRequest();

        adjustCrossMarginMaxLeverageRequest.maxLeverage(0L);

        ApiResponse<AdjustCrossMarginMaxLeverageResponse> response =
                api.adjustCrossMarginMaxLeverage(adjustCrossMarginMaxLeverageRequest);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        ArgumentCaptor<String> signInputCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(signatureGeneratorSpy).signAsString(signInputCaptor.capture());

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals("timestamp=1736393892000maxLeverage=0", signInputCaptor.getValue());
        assertEquals(
                "a39b1baf07c2a88b549c3f24c42e32acc0d249317c2d393b8a05e79f41a62687",
                actualRequest.url().queryParameter("signature"));
        assertEquals("/sapi/v1/margin/max-leverage", actualRequest.url().encodedPath());
    }

    /**
     * Disable Isolated Margin Account (TRADE)
     *
     * <p>Disable isolated margin account for a specific symbol. Each trading pair can only be
     * deactivated once every 24 hours. Weight: 300(UID)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void disableIsolatedMarginAccountTest() throws ApiException, CryptoException {
        String symbol = "";
        Long recvWindow = 5000L;
        ApiResponse<DisableIsolatedMarginAccountResponse> response =
                api.disableIsolatedMarginAccount(symbol, recvWindow);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        ArgumentCaptor<String> signInputCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(signatureGeneratorSpy).signAsString(signInputCaptor.capture());

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals("symbol=&recvWindow=5000&timestamp=1736393892000", signInputCaptor.getValue());
        assertEquals(
                "db1a455af0a2e82b4ec79595d994eb2e7f6b8a93c91a67a2aa59e2b2eae4bc68",
                actualRequest.url().queryParameter("signature"));
        assertEquals("/sapi/v1/margin/isolated/account", actualRequest.url().encodedPath());
    }

    /**
     * Enable Isolated Margin Account (TRADE)
     *
     * <p>Enable isolated margin account for a specific symbol(Only supports activation of
     * previously disabled accounts). Weight: 300(UID)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void enableIsolatedMarginAccountTest() throws ApiException, CryptoException {
        EnableIsolatedMarginAccountRequest enableIsolatedMarginAccountRequest =
                new EnableIsolatedMarginAccountRequest();

        enableIsolatedMarginAccountRequest.symbol("");

        ApiResponse<EnableIsolatedMarginAccountResponse> response =
                api.enableIsolatedMarginAccount(enableIsolatedMarginAccountRequest);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        ArgumentCaptor<String> signInputCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(signatureGeneratorSpy).signAsString(signInputCaptor.capture());

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals("timestamp=1736393892000symbol=", signInputCaptor.getValue());
        assertEquals(
                "121e5417aa8a98df3f9c75d42ff90e316237814641c1f7a48f989064fd07a549",
                actualRequest.url().queryParameter("signature"));
        assertEquals("/sapi/v1/margin/isolated/account", actualRequest.url().encodedPath());
    }

    /**
     * Get BNB Burn Status (USER_DATA)
     *
     * <p>Get BNB Burn Status Weight: 1(IP)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBnbBurnStatusTest() throws ApiException, CryptoException {
        Long recvWindow = 5000L;
        ApiResponse<GetBnbBurnStatusResponse> response = api.getBnbBurnStatus(recvWindow);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        ArgumentCaptor<String> signInputCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(signatureGeneratorSpy).signAsString(signInputCaptor.capture());

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals("recvWindow=5000&timestamp=1736393892000", signInputCaptor.getValue());
        assertEquals(
                "2cdd1e484bce80021437bee6b762e6a276b1954c3a0c011a16f6f2f6a47aba75",
                actualRequest.url().queryParameter("signature"));
        assertEquals("/sapi/v1/bnbBurn", actualRequest.url().encodedPath());
    }

    /**
     * Get Summary of Margin account (USER_DATA)
     *
     * <p>Get personal margin level information Weight: 10(IP)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSummaryOfMarginAccountTest() throws ApiException, CryptoException {
        Long recvWindow = 5000L;
        ApiResponse<GetSummaryOfMarginAccountResponse> response =
                api.getSummaryOfMarginAccount(recvWindow);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        ArgumentCaptor<String> signInputCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(signatureGeneratorSpy).signAsString(signInputCaptor.capture());

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals("recvWindow=5000&timestamp=1736393892000", signInputCaptor.getValue());
        assertEquals(
                "2cdd1e484bce80021437bee6b762e6a276b1954c3a0c011a16f6f2f6a47aba75",
                actualRequest.url().queryParameter("signature"));
        assertEquals("/sapi/v1/margin/tradeCoeff", actualRequest.url().encodedPath());
    }

    /**
     * Query Cross Isolated Margin Capital Flow (USER_DATA)
     *
     * <p>Query Cross Isolated Margin Capital Flow Weight: 100(IP)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void queryCrossIsolatedMarginCapitalFlowTest() throws ApiException, CryptoException {
        String asset = "";
        String symbol = "";
        String type = "";
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long fromId = 1L;
        Long limit = 500L;
        Long recvWindow = 5000L;
        ApiResponse<QueryCrossIsolatedMarginCapitalFlowResponse> response =
                api.queryCrossIsolatedMarginCapitalFlow(
                        asset, symbol, type, startTime, endTime, fromId, limit, recvWindow);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        ArgumentCaptor<String> signInputCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(signatureGeneratorSpy).signAsString(signInputCaptor.capture());

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals(
                "asset=&symbol=&type=&startTime=1623319461670&endTime=1641782889000&fromId=1&limit=500&recvWindow=5000&timestamp=1736393892000",
                signInputCaptor.getValue());
        assertEquals(
                "9011115f6529558999b5851d10ea31bc0b653ee04f639978eb42a32572f9108c",
                actualRequest.url().queryParameter("signature"));
        assertEquals("/sapi/v1/margin/capital-flow", actualRequest.url().encodedPath());
    }

    /**
     * Query Cross Margin Account Details (USER_DATA)
     *
     * <p>Query Cross Margin Account Details Weight: 10(IP)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void queryCrossMarginAccountDetailsTest() throws ApiException, CryptoException {
        Long recvWindow = 5000L;
        ApiResponse<QueryCrossMarginAccountDetailsResponse> response =
                api.queryCrossMarginAccountDetails(recvWindow);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        ArgumentCaptor<String> signInputCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(signatureGeneratorSpy).signAsString(signInputCaptor.capture());

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals("recvWindow=5000&timestamp=1736393892000", signInputCaptor.getValue());
        assertEquals(
                "2cdd1e484bce80021437bee6b762e6a276b1954c3a0c011a16f6f2f6a47aba75",
                actualRequest.url().queryParameter("signature"));
        assertEquals("/sapi/v1/margin/account", actualRequest.url().encodedPath());
    }

    /**
     * Query Cross Margin Fee Data (USER_DATA)
     *
     * <p>Get cross margin fee data collection with any vip level or user&#39;s current specific
     * data as https://www.binance.com/en/margin-fee Weight: 1 when coin is specified;(IP)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void queryCrossMarginFeeDataTest() throws ApiException, CryptoException {
        Long vipLevel = 1L;
        String coin = "";
        Long recvWindow = 5000L;
        ApiResponse<QueryCrossMarginFeeDataResponse> response =
                api.queryCrossMarginFeeData(vipLevel, coin, recvWindow);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        ArgumentCaptor<String> signInputCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(signatureGeneratorSpy).signAsString(signInputCaptor.capture());

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals(
                "vipLevel=1&coin=&recvWindow=5000&timestamp=1736393892000",
                signInputCaptor.getValue());
        assertEquals(
                "ddb11dcaf68f149982ca2e477c168aa17faba9ba32646be05b1af39be5822acb",
                actualRequest.url().queryParameter("signature"));
        assertEquals("/sapi/v1/margin/crossMarginData", actualRequest.url().encodedPath());
    }

    /**
     * Query Enabled Isolated Margin Account Limit (USER_DATA)
     *
     * <p>Query enabled isolated margin account limit. Weight: 1(IP)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void queryEnabledIsolatedMarginAccountLimitTest() throws ApiException, CryptoException {
        Long recvWindow = 5000L;
        ApiResponse<QueryEnabledIsolatedMarginAccountLimitResponse> response =
                api.queryEnabledIsolatedMarginAccountLimit(recvWindow);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        ArgumentCaptor<String> signInputCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(signatureGeneratorSpy).signAsString(signInputCaptor.capture());

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals("recvWindow=5000&timestamp=1736393892000", signInputCaptor.getValue());
        assertEquals(
                "2cdd1e484bce80021437bee6b762e6a276b1954c3a0c011a16f6f2f6a47aba75",
                actualRequest.url().queryParameter("signature"));
        assertEquals("/sapi/v1/margin/isolated/accountLimit", actualRequest.url().encodedPath());
    }

    /**
     * Query Isolated Margin Account Info (USER_DATA)
     *
     * <p>Query Isolated Margin Account Info * If \&quot;symbols\&quot; is not sent, all isolated
     * assets will be returned. * If \&quot;symbols\&quot; is sent, only the isolated assets of the
     * sent symbols will be returned. Weight: 10(IP)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void queryIsolatedMarginAccountInfoTest() throws ApiException, CryptoException {
        String symbols = "";
        Long recvWindow = 5000L;
        ApiResponse<QueryIsolatedMarginAccountInfoResponse> response =
                api.queryIsolatedMarginAccountInfo(symbols, recvWindow);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        ArgumentCaptor<String> signInputCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(signatureGeneratorSpy).signAsString(signInputCaptor.capture());

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals(
                "symbols=&recvWindow=5000&timestamp=1736393892000", signInputCaptor.getValue());
        assertEquals(
                "75a5f82d3ffe60fadeb6d26bd9fa78c81c3f38810e0b7fb2fb801bc1b62a760f",
                actualRequest.url().queryParameter("signature"));
        assertEquals("/sapi/v1/margin/isolated/account", actualRequest.url().encodedPath());
    }

    /**
     * Query Isolated Margin Fee Data (USER_DATA)
     *
     * <p>Get isolated margin fee data collection with any vip level or user&#39;s current specific
     * data as https://www.binance.com/en/margin-fee Weight: 1 when a single is specified;(IP)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void queryIsolatedMarginFeeDataTest() throws ApiException, CryptoException {
        Long vipLevel = 1L;
        String symbol = "";
        Long recvWindow = 5000L;
        ApiResponse<QueryIsolatedMarginFeeDataResponse> response =
                api.queryIsolatedMarginFeeData(vipLevel, symbol, recvWindow);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        ArgumentCaptor<String> signInputCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(signatureGeneratorSpy).signAsString(signInputCaptor.capture());

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals(
                "vipLevel=1&symbol=&recvWindow=5000&timestamp=1736393892000",
                signInputCaptor.getValue());
        assertEquals(
                "a74c3d13b438d83d79b36502abddfc99e544e261b191d5610ccacc18158c152d",
                actualRequest.url().queryParameter("signature"));
        assertEquals("/sapi/v1/margin/isolatedMarginData", actualRequest.url().encodedPath());
    }
}
