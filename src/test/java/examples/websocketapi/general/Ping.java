package examples.websocketapi.general;

import com.binance.connector.client.impl.WebsocketApiClientImpl;
import org.json.JSONObject;

public final class Ping {
    private Ping() {
    }

    private static final int waitTime = 3000;

    public static void main(String[] args) throws InterruptedException {
        WebsocketApiClientImpl client = new WebsocketApiClientImpl();
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