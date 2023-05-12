package unit.signature;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import com.binance.connector.client.utils.signaturegenerator.Ed25519SignatureGenerator;

public class TestEd25519SignatureGenerator {
    
    @Test
    public void testUnprotectedSigning() throws FileNotFoundException, IOException {
        String pemPathString = "src/test/java/unit/signature/Ed25519PrivateKeyExample.pem";

        String payload = "timeInForce=GTC&quantity=0.2&price=30000&symbol=BTCUSDT&side=SELL&type=LIMIT&timestamp=1683189275000";
        String expectedSignature = "kJs8urXFQ/GkR/hQ+ukZMFwH9H8oe7Ec/sap6pFIB/7HHHoh5mKVQT1zLVaRl7QdJLjNB2QB4PGZPflubUCHBA==";

        Ed25519SignatureGenerator ed25519SignatureGenerator = new Ed25519SignatureGenerator(pemPathString);
        String actualSignature = ed25519SignatureGenerator.getSignature(payload);
        assertEquals(expectedSignature, actualSignature);
    }
}