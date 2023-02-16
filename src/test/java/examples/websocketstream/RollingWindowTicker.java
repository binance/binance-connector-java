package examples.websocketstream;

import com.binance.connector.client.impl.WebsocketStreamClientImpl;

public final class RollingWindowTicker {
    private RollingWindowTicker() {
    }

    public static void main(String[] args) {
        WebsocketStreamClientImpl client = new WebsocketStreamClientImpl();
        client.rollingWindowTicker("btcusdt", "1h", ((event) -> {
            System.out.println(event);
            client.closeAllConnections();
        }));
    }
}
