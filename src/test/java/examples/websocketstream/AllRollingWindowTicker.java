package examples.websocketstream;

import com.binance.connector.client.impl.WebsocketStreamClientImpl;

public final class AllRollingWindowTicker {
    private AllRollingWindowTicker() {
    }

    public static void main(String[] args) {
        WebsocketStreamClientImpl client = new WebsocketStreamClientImpl();
        client.allRollingWindowTicker("1h", ((event) -> {
            System.out.println(event);
            client.closeAllConnections();
        }));
    }
}
