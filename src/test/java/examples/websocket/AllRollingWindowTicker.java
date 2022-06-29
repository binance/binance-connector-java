package examples.websocket;

import com.binance.connector.client.impl.WebsocketClientImpl;

public final class AllRollingWindowTicker {
    private AllRollingWindowTicker() {
    }

    public static void main(String[] args) {
        WebsocketClientImpl client = new WebsocketClientImpl();
        client.allRollingWindowTicker("1h", ((event) -> {
            System.out.println(event);
            client.closeAllConnections();
        }));
    }
}
