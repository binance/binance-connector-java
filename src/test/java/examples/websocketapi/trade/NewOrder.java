package examples.websocketapi.trade;

import com.binance.connector.client.enums.DefaultUrls;
import com.binance.connector.client.impl.WebsocketApiClientImpl;
import com.binance.connector.client.utils.HmacSignatureGenerator;
import examples.PrivateConfig;
import org.json.JSONObject;

public final class NewOrder {

    private NewOrder() {
    }

    private static final double quantity = 0.01;
    private static final int waitTime = 3000;

    public static void main(String[] args) throws InterruptedException {

        HmacSignatureGenerator signatureGenerator = new HmacSignatureGenerator(PrivateConfig.TESTNET_SECRET_KEY);
        WebsocketApiClientImpl wsApiClient = new WebsocketApiClientImpl(PrivateConfig.TESTNET_API_KEY, signatureGenerator, DefaultUrls.TESTNET_WS_API_URL);

        wsApiClient.connect(((message) -> {
            System.out.println(message);
        }));
      
        JSONObject params = new JSONObject();
        params.put("requestId", "randomId");
        params.put("quantity", quantity);
      
        wsApiClient.trade().newOrder("BTCUSDT", "BUY", "MARKET", params);
      
        Thread.sleep(waitTime);
      
        wsApiClient.close();
    }
}

