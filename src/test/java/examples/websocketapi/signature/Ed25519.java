package examples.websocketapi.signature;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.binance.connector.client.WebSocketApiClient;
import com.binance.connector.client.enums.DefaultUrls;
import com.binance.connector.client.impl.WebSocketApiClientImpl;
import com.binance.connector.client.utils.signaturegenerator.Ed25519SignatureGenerator;

import examples.PrivateConfig;

public final class Ed25519 {
    private Ed25519() {
    }

    private static final int waitTime = 3000;

    public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {
        Ed25519SignatureGenerator signatureGenerator =  new Ed25519SignatureGenerator(PrivateConfig.TESTNET_PRIVATE_KEY_PATH);
        WebSocketApiClient client = new WebSocketApiClientImpl(PrivateConfig.TESTNET_API_KEY, signatureGenerator, DefaultUrls.TESTNET_WS_API_URL);
        client.connect(((event) -> {
            System.out.println(event);
        }));

        client.account().accountStatus(null);

        Thread.sleep(waitTime);
        client.close();
    }
}
