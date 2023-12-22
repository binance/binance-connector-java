package examples.websocketapi.authentication;

import org.json.JSONObject;

import com.binance.connector.client.WebSocketApiClient;
import com.binance.connector.client.enums.DefaultUrls;
import com.binance.connector.client.impl.WebSocketApiClientImpl;
import com.binance.connector.client.impl.websocketapi.WebSocketApiAuth;
import com.binance.connector.client.utils.signaturegenerator.HmacSignatureGenerator;

import examples.PrivateConfig;

public final class Logon {

    private Logon() {
    }

    private static final int waitTime = 60000;

    public static void main(String[] args) throws InterruptedException {

        HmacSignatureGenerator signatureGenerator = new HmacSignatureGenerator(PrivateConfig.TESTNET_SECRET_KEY);
        WebSocketApiClient wsApiClient = new WebSocketApiClientImpl(PrivateConfig.TESTNET_API_KEY, signatureGenerator, DefaultUrls.TESTNET_WS_API_URL);

        wsApiClient.connect(((message) -> {
            System.out.println(message);
        }));
        
        WebSocketApiAuth auth = wsApiClient.auth();

        JSONObject params = new JSONObject();
        auth.logon(params);

        params.clear(); 
        wsApiClient.account().accountAllOrders("BTCUSDT", params);

        Thread.sleep(waitTime);

        wsApiClient.close();

    }
}
