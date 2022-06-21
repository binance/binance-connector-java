package examples.websocket;

import com.binance.connector.client.impl.WebsocketClientImpl;

public final class BookTicker {
    private BookTicker() {
    }

    public static void main(String[] args) {
        WebsocketClientImpl client = new WebsocketClientImpl();
        client.bookTicker("btcusdt", ((event) -> {
            System.out.println(event);
            client.closeAllConnections();
        }));
    }
}
