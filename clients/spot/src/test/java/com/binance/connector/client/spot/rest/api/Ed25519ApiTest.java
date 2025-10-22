package com.binance.connector.client.spot.rest.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.auth.BinanceAuthenticationFactory;
import com.binance.connector.client.common.auth.SignatureAuthentication;
import com.binance.connector.client.common.auth.SignatureGeneratorFactory;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.sign.PrivateKey;
import com.binance.connector.client.common.sign.SignatureGenerator;
import com.binance.connector.client.spot.rest.model.GetAccountResponse;
import java.io.File;
import java.lang.reflect.Type;
import java.net.URISyntaxException;
import java.net.URL;
import okhttp3.Call;
import okhttp3.Request;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

public class Ed25519ApiTest {
    @Test
    public void ed25519WithoutPass() throws ApiException, URISyntaxException {
        URL resource = Ed25519ApiTest.class.getResource("/test-ed25519-prv-key.pem");
        File file = new File(resource.toURI());
        ClientConfiguration clientConfiguration = new ClientConfiguration();
        clientConfiguration.setUrl("http://localhost:8080");
        SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
        signatureConfiguration.setApiKey("apiKey");
        signatureConfiguration.setPrivateKey(file.getAbsolutePath());
        clientConfiguration.setSignatureConfiguration(signatureConfiguration);

        SignatureGeneratorFactory signatureGeneratorFactory = new SignatureGeneratorFactory();
        SignatureGenerator signatureGenerator =
                signatureGeneratorFactory.getSignatureGenerator(signatureConfiguration);

        assertTrue(signatureGenerator instanceof PrivateKey);

        SignatureAuthentication signatureAuthentication =
                new SignatureAuthentication(signatureConfiguration.getApiKey(), signatureGenerator);
        SignatureAuthentication authenticationSpy = Mockito.spy(signatureAuthentication);
        Mockito.doReturn("1736393892000").when(authenticationSpy).buildTimestamp();

        BinanceAuthenticationFactory factoryMock = Mockito.mock(BinanceAuthenticationFactory.class);
        Mockito.doReturn(authenticationSpy)
                .when(factoryMock)
                .getAuthentication(signatureConfiguration);

        ApiClient apiClient = new ApiClient(clientConfiguration, factoryMock);

        ApiClient apiClientSpy = Mockito.spy(apiClient);
        Mockito.doReturn(new ApiResponse<>(200, null))
                .when(apiClientSpy)
                .execute(Mockito.any(), Mockito.any(Type.class));

        AccountApi api = new AccountApi(apiClientSpy);

        Boolean omitZeroBalances = null;
        Double recvWindow = null;
        ApiResponse<GetAccountResponse> response = api.getAccount(omitZeroBalances, recvWindow);
        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy).execute(callArgumentCaptor.capture(), Mockito.any(Type.class));
        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();
        assertEquals(
                "1KohSdsEYUHEO2qTbkkjbmFdufaUTF9dKat6oUwE2RHT+zThFX4i1MMeNC5nqH0Eya07jbRN9/Lq1HaTgjD2Aw==",
                actualRequest.url().queryParameter("signature"));
        assertEquals("/api/v3/account", actualRequest.url().encodedPath());
    }

    @Test
    public void ed25519WithPass() throws ApiException, URISyntaxException {
        URL resource = Ed25519ApiTest.class.getResource("/test-ed25519-pass-prv-key.pem");
        File file = new File(resource.toURI());
        ClientConfiguration clientConfiguration = new ClientConfiguration();
        clientConfiguration.setUrl("http://localhost:8080");
        SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
        signatureConfiguration.setApiKey("apiKey");
        signatureConfiguration.setPrivateKeyPass("test123");
        signatureConfiguration.setPrivateKey(file.getAbsolutePath());
        clientConfiguration.setSignatureConfiguration(signatureConfiguration);

        SignatureGeneratorFactory signatureGeneratorFactory = new SignatureGeneratorFactory();
        SignatureGenerator signatureGenerator =
                signatureGeneratorFactory.getSignatureGenerator(signatureConfiguration);

        assertTrue(signatureGenerator instanceof PrivateKey);

        SignatureAuthentication signatureAuthentication =
                new SignatureAuthentication(signatureConfiguration.getApiKey(), signatureGenerator);
        SignatureAuthentication authenticationSpy = Mockito.spy(signatureAuthentication);
        Mockito.doReturn("1736393892000").when(authenticationSpy).buildTimestamp();

        BinanceAuthenticationFactory factoryMock = Mockito.mock(BinanceAuthenticationFactory.class);
        Mockito.doReturn(authenticationSpy)
                .when(factoryMock)
                .getAuthentication(signatureConfiguration);

        ApiClient apiClient = new ApiClient(clientConfiguration, factoryMock);

        ApiClient apiClientSpy = Mockito.spy(apiClient);
        Mockito.doReturn(new ApiResponse<>(200, null))
                .when(apiClientSpy)
                .execute(Mockito.any(), Mockito.any(Type.class));

        AccountApi api = new AccountApi(apiClientSpy);

        Boolean omitZeroBalances = null;
        Double recvWindow = null;
        ApiResponse<GetAccountResponse> response = api.getAccount(omitZeroBalances, recvWindow);
        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy).execute(callArgumentCaptor.capture(), Mockito.any(Type.class));
        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();
        assertEquals(
                "1bVUk5CQDr3yqpmiIUmV6lXeIoC6PLDNnc8bca4RFR7SChr2RJi5AtgppEfEPyBxO25lm9iapCiINN9+rhJ1AQ==",
                actualRequest.url().queryParameter("signature"));
        assertEquals("/api/v3/account", actualRequest.url().encodedPath());
    }
}
