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

public class RSAApiTest {
    @Test
    public void rsaWithoutPass() throws ApiException, URISyntaxException {
        URL resource = RSAApiTest.class.getResource("/test-rsa-prv-key.pem");
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
        Long recvWindow = null;
        ApiResponse<GetAccountResponse> response = api.getAccount(omitZeroBalances, recvWindow);
        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy).execute(callArgumentCaptor.capture(), Mockito.any(Type.class));
        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();
        assertEquals(
                "dmfJCWBD/6umdoUkRniOlyxvHo4eZaFRarnva+ElB7kAfLdWa8AcwSyiDS13WZZmKIbCKHanbkfzjoZCTUzd10PpA2hX+uvAPaRYQh460eLZfaKF3fg30gSa9PRwsGR/DcUDI415rafzoDbxOgwRTehSTg7eT7+RWx9iv2V8GWW+fVULu406XoWv7jfffXdP28GiuKBS40XZScb4vgINlaSkMyAlMhwrLnXp5+Oga84uOlb6UFvClXa8CaL5Sn3xExc5YT6fKYcGZby5Hntdb1EmXglK3RwZqJiP4PsCcigciw7NIHB12gXMrkpcqi9STokCzdXXzfN5BQSeC26UcQ==",
                actualRequest.url().queryParameter("signature"));
        assertEquals("/api/v3/account", actualRequest.url().encodedPath());
    }

    @Test
    public void rsaWithPass() throws ApiException, URISyntaxException {
        URL resource = RSAApiTest.class.getResource("/test-rsa-pass-prv-key.pem");
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
        Long recvWindow = null;
        ApiResponse<GetAccountResponse> response = api.getAccount(omitZeroBalances, recvWindow);
        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy).execute(callArgumentCaptor.capture(), Mockito.any(Type.class));
        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();
        assertEquals(
                "FMz6U/hArExIu5HgzULPhg1/BUSzJpUTrX4JizSOizIB5HwRCcsBURFQg69PKX71Q8Rs/uskJzksHq/F4oe7hiRnWPkt5/gd2TOiB3BCiFrFsuLZCerLgPGV5qTS4VoRaRDoXq9aoLoKs28AI/jmKF52nI7XTG1R38T3WdWEOXe4fDvc+6qviMnKeMUiLeOtSd97WPihdODm+zBDmeWvorMaJOn9U6iCgvlp/+5aneocqHHlTtcOC+MFd175dgd80RNRw7DEVjUpGT5VOw1vA/yxSuODkIx4gmxqQ5dSWpb1aycutwkW0lDjy0S8nTyg04pW7ye1O+vUvg3rNFBHNQ==",
                actualRequest.url().queryParameter("signature"));
        assertEquals("/api/v3/account", actualRequest.url().encodedPath());
    }
}
