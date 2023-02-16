package examples.websocketapi.trade;

import com.binance.connector.client.enums.DefaultUrls;
import com.binance.connector.client.impl.WebsocketApiClientImpl;
import com.binance.connector.client.utils.HmacSignatureGenerator;
import examples.PrivateConfig;
import org.json.JSONObject;

public final class GetOcoOrder {

    private GetOcoOrder() {
    }

    private static final int orderListId = 3475;
    private static final int waitTime = 3000;

    public static void main(String[] args) throws InterruptedException {

        HmacSignatureGenerator signatureGenerator = new HmacSignatureGenerator(PrivateConfig.TESTNET_SECRET_KEY);
        WebsocketApiClientImpl wsApiClient = new WebsocketApiClientImpl(PrivateConfig.TESTNET_API_KEY, signatureGenerator, DefaultUrls.TESTNET_WS_API_URL);

        wsApiClient.connect(((message) -> {
            System.out.println(message);
        }));
      
        JSONObject params = new JSONObject();
        params.put("orderListId", orderListId);
      
        wsApiClient.trade().getOcoOrder(params);
      
        Thread.sleep(waitTime);
      
        wsApiClient.close();
    }
}

