package examples.websocketapi.general;

import com.binance.connector.client.impl.WebsocketApiClientImpl;
import com.binance.connector.client.utils.WebSocketCallback;

public final class ServerTime {
    private ServerTime() {
    }

    private static final int waitTime = 3000;

    public static void main(String[] args) throws InterruptedException {
        WebsocketApiClientImpl client = new WebsocketApiClientImpl();

        WebSocketCallback onMessageCallback = (event) -> {
            System.out.println(event);
        };

        client.connect(onMessageCallback);
        
        client.general().serverTime(null);

        Thread.sleep(waitTime);
        client.close();
    }
}