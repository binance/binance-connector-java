package examples.websocketapi.userdatastream;

import com.binance.connector.client.enums.DefaultUrls;
import com.binance.connector.client.impl.WebsocketApiClientImpl;
import com.binance.connector.client.utils.HmacSignatureGenerator;

import examples.PrivateConfig;

public final class UserDataStreamStop {
    
    private UserDataStreamStop() {
    }

    private static final int waitTime = 3000;

    public static void main(String[] args) throws InterruptedException {
        HmacSignatureGenerator signatureGenerator = new HmacSignatureGenerator(PrivateConfig.TESTNET_SECRET_KEY);
        WebsocketApiClientImpl client = new WebsocketApiClientImpl(PrivateConfig.TESTNET_API_KEY, signatureGenerator, DefaultUrls.TESTNET_WS_API_URL);

        client.connect(((event) -> {
            System.out.println(event);
        }));
        
        client.userDataStream().userDataStreamStop("listenKey", null);

        Thread.sleep(waitTime);
        client.close();
    }
}