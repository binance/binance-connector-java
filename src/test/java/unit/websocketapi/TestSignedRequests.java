package unit.websocketapi;

import static org.junit.Assert.assertThrows;

import org.junit.Test;

import com.binance.connector.client.exceptions.BinanceConnectorException;
import com.binance.connector.client.impl.WebSocketApiClientImpl;
import com.binance.connector.client.utils.signaturegenerator.HmacSignatureGenerator;
import com.binance.connector.client.utils.signaturegenerator.RsaSignatureGenerator;

import unit.MockData;

public class TestSignedRequests {

    @Test
    public void testHmacSignatureGeneratorWithoutSecretKey() {
        assertThrows(BinanceConnectorException.class, () ->  new HmacSignatureGenerator(""));
        assertThrows(BinanceConnectorException.class, () ->  new HmacSignatureGenerator(null));
    }


    @Test
    public void testRsaSignatureGeneratorWithoutPrivateKey() {
        assertThrows(BinanceConnectorException.class, () ->  new RsaSignatureGenerator(""));
        assertThrows(BinanceConnectorException.class, () ->  new RsaSignatureGenerator(null));
    }

    @Test
    public void testSignedRequestWithoutConnectingFirst() {
        HmacSignatureGenerator signatureGenerator = new HmacSignatureGenerator(MockData.SECRET_KEY);
        WebSocketApiClientImpl client = new WebSocketApiClientImpl(MockData.API_KEY, signatureGenerator, MockData.WS_BASE_URL);
        assertThrows(BinanceConnectorException.class, () -> client.general().ping(null));
    }
    
    @Test
    public void testSignedRequestWithoutSignatureGenerator() {
        WebSocketApiClientImpl client = new WebSocketApiClientImpl();
        client.connect(((event) -> {
            System.out.println(event);
        }));
        assertThrows(BinanceConnectorException.class, () -> client.account().accountStatus(null));
    }

    @Test
    public void testSignedRequestWithoutApiKey() {
        HmacSignatureGenerator signatureGenerator = new HmacSignatureGenerator(MockData.SECRET_KEY);
        WebSocketApiClientImpl client = new WebSocketApiClientImpl("", signatureGenerator, MockData.WS_BASE_URL);
        client.connect(((event) -> {
            System.out.println(event);
        }));
        assertThrows(BinanceConnectorException.class, () -> client.account().accountStatus(null));
    }
}
