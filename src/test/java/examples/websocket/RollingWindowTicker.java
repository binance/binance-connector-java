package examples.websocket;

import com.binance.connector.client.impl.WebsocketClientImpl;

public final class RollingWindowTicker {
    private RollingWindowTicker() {
    }

    public static void main(String[] args) {
        WebsocketClientImpl client = new WebsocketClientImpl();
        client.rollingWindowTicker("btcusdt", "1h", ((event) -> {
            System.out.println(event);
            client.closeAllConnections();
        }));
    }
}
