package examples.websocketapi.general;

import org.json.JSONObject;

import com.binance.connector.client.WebSocketApiClient;
import com.binance.connector.client.impl.WebSocketApiClientImpl;

public final class Ping {
    private Ping() {
    }

    private static final int waitTime = 3000;

    public static void main(String[] args) throws InterruptedException {
        WebSocketApiClient client = new WebSocketApiClientImpl();
        client.connect(((event) -> {
            System.out.println(event);
        }));
        
        JSONObject params = new JSONObject();
        params.put("requestId", "randomId");
        client.general().ping(params);

        Thread.sleep(waitTime);
        client.close();
    }
}