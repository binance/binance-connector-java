package examples.websocketapi.signature;

import com.binance.connector.client.enums.DefaultUrls;
import com.binance.connector.client.impl.WebsocketApiClientImpl;
import com.binance.connector.client.utils.RsaSignatureGenerator;

import examples.PrivateConfig;
import org.json.JSONObject;

public final class Rsa {
    private Rsa() {
    }

    private static final double quantity = 0.01;
    private static final int waitTime = 3000;

    public static void main(String[] args) throws InterruptedException {
        RsaSignatureGenerator signatureGenerator =  new RsaSignatureGenerator(PrivateConfig.TESTNET_PRIVATE_KEY_PATH);
        WebsocketApiClientImpl client = new WebsocketApiClientImpl(PrivateConfig.TESTNET_API_KEY, signatureGenerator, DefaultUrls.TESTNET_WS_API_URL);
        client.connect(((event) -> {
            System.out.println(event);
        }));

        JSONObject params = new JSONObject();
        params.put("requestId", "randomId");
        params.put("quantity", quantity);

        client.trade().testNewOrder("BTCUSDT", "BUY", "MARKET", params);

        Thread.sleep(waitTime);
        client.close();
    }
}

