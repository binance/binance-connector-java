package examples.websocket;

import com.binance.connector.client.impl.WebsocketClientImpl;

public final class AllBookTicker {
    private AllBookTicker() {
    }

    public static void main(String[] args) {
        WebsocketClientImpl client = new WebsocketClientImpl();
        client.allBookTickerStream(((event) -> {
            System.out.println(event);
            client.closeAllConnections();
        }));
    }
}
