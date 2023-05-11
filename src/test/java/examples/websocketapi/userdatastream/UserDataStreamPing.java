package examples.websocketapi.userdatastream;

import com.binance.connector.client.WebSocketApiClient;
import com.binance.connector.client.enums.DefaultUrls;
import com.binance.connector.client.impl.WebSocketApiClientImpl;
import com.binance.connector.client.utils.signaturegenerator.HmacSignatureGenerator;

import examples.PrivateConfig;

public final class UserDataStreamPing {
    
    private UserDataStreamPing() {
    }

    private static final int waitTime = 3000;

    public static void main(String[] args) throws InterruptedException {
        HmacSignatureGenerator signatureGenerator = new HmacSignatureGenerator(PrivateConfig.TESTNET_SECRET_KEY);
        WebSocketApiClient client = new WebSocketApiClientImpl(PrivateConfig.TESTNET_API_KEY, signatureGenerator, DefaultUrls.TESTNET_WS_API_URL);

        client.connect(((event) -> {
            System.out.println(event);
        }));
        
        client.userDataStream().userDataStreamPing("listenKey", null);

        Thread.sleep(waitTime);
        client.close();
    }
}