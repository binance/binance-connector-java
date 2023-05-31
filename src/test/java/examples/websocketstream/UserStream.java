package examples.websocketstream;

import org.json.JSONObject;

import com.binance.connector.client.WebSocketStreamClient;
import com.binance.connector.client.enums.DefaultUrls;
import com.binance.connector.client.impl.SpotClientImpl;
import com.binance.connector.client.impl.WebSocketStreamClientImpl;

import examples.PrivateConfig;

public final class UserStream {
    private UserStream() {
    }

    public static void main(String[] args) {
        WebSocketStreamClient wsClient = new WebSocketStreamClientImpl(DefaultUrls.TESTNET_WS_URL);
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
