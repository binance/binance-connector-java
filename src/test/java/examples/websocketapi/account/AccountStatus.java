package examples.websocketapi.account;

import org.json.JSONObject;

import com.binance.connector.client.WebSocketApiClient;
import com.binance.connector.client.enums.DefaultUrls;
import com.binance.connector.client.impl.WebSocketApiClientImpl;
import com.binance.connector.client.utils.signaturegenerator.HmacSignatureGenerator;

import examples.PrivateConfig;

public final class AccountStatus {
    
    private AccountStatus() {
    }

    private static final int recvWindow = 6000;
    private static final int requestId = 1234;
    private static final int waitTime = 3000;

    public static void main(String[] args) throws InterruptedException {
        
        HmacSignatureGenerator signatureGenerator = new HmacSignatureGenerator(PrivateConfig.TESTNET_SECRET_KEY);
        WebSocketApiClient client = new WebSocketApiClientImpl(PrivateConfig.TESTNET_API_KEY, signatureGenerator, DefaultUrls.TESTNET_WS_API_URL);

        client.connect(((event) -> {
            System.out.println(event + "\n");
        }));
        
        JSONObject params = new JSONObject();
        params.put("recvWindow", recvWindow);

        // with empty requestId
        params.put("requestId", "");
        client.account().accountStatus(params);
        Thread.sleep(waitTime);

        // without requestId
        params.clear();
        client.account().accountStatus(params);
        Thread.sleep(waitTime);

        // with string requestId
        params.clear();
        params.put("requestId", "requestId");
        client.account().accountStatus(params);
        Thread.sleep(waitTime);
        
        // with int requestId
        params.clear();
        params.put("requestId", requestId);
        client.account().accountStatus(params);
        Thread.sleep(waitTime);

        client.close();
    }
}
