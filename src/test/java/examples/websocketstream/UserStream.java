package examples.websocketstream;

import com.binance.connector.client.enums.DefaultUrls;
import com.binance.connector.client.impl.SpotClientImpl;
import com.binance.connector.client.impl.WebsocketStreamClientImpl;
import examples.PrivateConfig;
import org.json.JSONObject;

public final class UserStream {
    private UserStream() {
    }

    public static void main(String[] args) {
        WebsocketStreamClientImpl wsClient = new WebsocketStreamClientImpl(DefaultUrls.TESTNET_WSS_URL);
        SpotClientImpl spotClient = new SpotClientImpl(PrivateConfig.TESTNET_API_KEY, PrivateConfig.TESTNET_SECRET_KEY, DefaultUrls.TESTNET_URL);
        JSONObject obj = new JSONObject(spotClient.createUserData().createListenKey());
        String listenKey = obj.getString("listenKey");
        System.out.println("listenKey:" + listenKey);
        wsClient.listenUserStream(listenKey, ((event) -> {
            System.out.println(event);
            wsClient.closeAllConnections();
        }));
    }
}
