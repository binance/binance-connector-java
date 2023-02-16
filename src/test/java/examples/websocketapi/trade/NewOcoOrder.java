package examples.websocketapi.trade;

import com.binance.connector.client.enums.DefaultUrls;
import com.binance.connector.client.impl.WebsocketApiClientImpl;
import com.binance.connector.client.utils.HmacSignatureGenerator;
import examples.PrivateConfig;
import org.json.JSONObject;

public final class NewOcoOrder {

    private NewOcoOrder() {
    }

    private static final double limitPrice = 0.07160;
    private static final double stopPrice = 0.07050;
    private static final double stopLimitPrice = 0.07040;
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
        params.put("stopPrice", stopPrice);
        params.put("stopLimitPrice", stopLimitPrice);
        params.put("stopLimitTimeInForce", "GTC");
      
        wsApiClient.trade().newOcoOrder("ETHBTC", "SELL", limitPrice, quantity, params);
      
        Thread.sleep(waitTime);
      
        wsApiClient.close();
    }
}

