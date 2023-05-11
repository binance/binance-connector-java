package examples.websocketstream;

import com.binance.connector.client.WebSocketStreamClient;
import com.binance.connector.client.impl.WebSocketStreamClientImpl;

public final class AllRollingWindowTicker {
    private AllRollingWindowTicker() {
    }

    public static void main(String[] args) {
        WebSocketStreamClient client = new WebSocketStreamClientImpl();
        client.allRollingWindowTicker("1h", ((event) -> {
            System.out.println(event);
            client.closeAllConnections();
        }));
    }
}
