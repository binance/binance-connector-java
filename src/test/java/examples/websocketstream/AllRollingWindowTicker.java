package examples.websocketstream;

import com.binance.connector.client.impl.WebSocketStreamClientImpl;

public final class AllRollingWindowTicker {
    private AllRollingWindowTicker() {
    }

    public static void main(String[] args) {
        WebSocketStreamClientImpl client = new WebSocketStreamClientImpl();
        client.allRollingWindowTicker("1h", ((event) -> {
            System.out.println(event);
            client.closeAllConnections();
        }));
    }
}
